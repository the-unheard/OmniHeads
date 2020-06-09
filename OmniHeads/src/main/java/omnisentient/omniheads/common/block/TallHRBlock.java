package omnisentient.omniheads.common.block;

import java.util.Map;

import javax.annotation.Nullable;

import com.google.common.collect.Maps;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.material.PushReaction;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.item.ItemStack;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.state.properties.DoubleBlockHalf;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;

public class TallHRBlock extends TranslucentHRBlock
{
	
	public final Map<Direction, VoxelShape> shapes = Maps.newEnumMap(Direction.class);
	
	public TallHRBlock(Properties props, VoxelShape northShape, VoxelShape upperShape)
	{
		super(props, northShape);
		this.setDefaultState(this.stateContainer.getBaseState().with(BlockStateProperties.DOUBLE_BLOCK_HALF, DoubleBlockHalf.LOWER));
		shapes.put(Direction.NORTH, upperShape);
		shapes.put(Direction.EAST, rotateShape(Direction.NORTH, Direction.EAST, upperShape));
		shapes.put(Direction.SOUTH, rotateShape(Direction.NORTH, Direction.SOUTH, upperShape));
		shapes.put(Direction.WEST, rotateShape(Direction.NORTH, Direction.WEST, upperShape));
	}

	public TallHRBlock(Properties props)
	{
		super(props);
		this.setDefaultState(this.stateContainer.getBaseState().with(BlockStateProperties.DOUBLE_BLOCK_HALF, DoubleBlockHalf.LOWER));
		shapes.put(Direction.NORTH, VoxelShapes.fullCube());
		shapes.put(Direction.EAST, VoxelShapes.fullCube());
		shapes.put(Direction.SOUTH, VoxelShapes.fullCube());
		shapes.put(Direction.WEST, VoxelShapes.fullCube());
	}
	
	@Override
	public VoxelShape getShape(BlockState state, IBlockReader world, BlockPos pos, ISelectionContext ctx)
	{
		if(state.get(BlockStateProperties.DOUBLE_BLOCK_HALF) == DoubleBlockHalf.UPPER)
		{
			return this.shapes.getOrDefault(state.get(BlockStateProperties.HORIZONTAL_FACING), VoxelShapes.fullCube());
		}
		return super.getShape(state, world, pos, ctx);
	}

	@Override
	protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder)
	{
		super.fillStateContainer(builder);
		builder.add(BlockStateProperties.DOUBLE_BLOCK_HALF);
	}

	@Override
	public BlockState updatePostPlacement(BlockState state, Direction side, BlockState adjState, IWorld world, BlockPos pos, BlockPos adjPos)
	{
		DoubleBlockHalf half = state.get(BlockStateProperties.DOUBLE_BLOCK_HALF);
		if (side.getAxis() != Direction.Axis.Y || half == DoubleBlockHalf.LOWER != (side == Direction.UP) || adjState.getBlock() == this && adjState.get(BlockStateProperties.DOUBLE_BLOCK_HALF) != half)
			return half == DoubleBlockHalf.LOWER && side == Direction.DOWN && !state.isValidPosition(world, pos) ? Blocks.AIR.getDefaultState() : super.updatePostPlacement(state, side, adjState, world, pos, adjPos);
		return Blocks.AIR.getDefaultState();
	}

	@Nullable
	@Override
	public BlockState getStateForPlacement(BlockItemUseContext ctx)
	{
		World world = ctx.getWorld();
		BlockPos up = ctx.getPos().up();
		return ctx.getPos().getY() < world.getDimension().getHeight() - 1 && world.getBlockState(up).isReplaceable(ctx) ? super.getStateForPlacement(ctx) : null;
	}

	@Override
	public void onBlockPlacedBy(World world, BlockPos pos, BlockState state, @Nullable LivingEntity placer, ItemStack stack)
	{
		world.setBlockState(pos.up(), this.getDefaultState().with(BlockStateProperties.DOUBLE_BLOCK_HALF, DoubleBlockHalf.UPPER).with(BlockStateProperties.HORIZONTAL_FACING, state.get(BlockStateProperties.HORIZONTAL_FACING)), 3);
	}

	@Override
	public void harvestBlock(World world, PlayerEntity player, BlockPos pos, BlockState state, @Nullable TileEntity te, ItemStack stack)
	{
		super.harvestBlock(world, player, pos, Blocks.AIR.getDefaultState(), te, stack);
	}

	@Override
	public boolean isValidPosition(BlockState state, IWorldReader world, BlockPos pos)
	{
		if (state.get(BlockStateProperties.DOUBLE_BLOCK_HALF) == DoubleBlockHalf.LOWER)
			return super.isValidPosition(state, world, pos);
		else
		{
			BlockState adjState = world.getBlockState(pos.down());
			if (state.getBlock() != this)
				return super.isValidPosition(state, world, pos); 
			return adjState.getBlock() == this && adjState.get(BlockStateProperties.DOUBLE_BLOCK_HALF) == DoubleBlockHalf.LOWER;
		}
	}

	@Override
	public void onBlockHarvested(World world, BlockPos pos, BlockState state, PlayerEntity player)
	{
		DoubleBlockHalf half = state.get(BlockStateProperties.DOUBLE_BLOCK_HALF);
		BlockPos adjPos = half == DoubleBlockHalf.LOWER ? pos.up() : pos.down();
		BlockState adjState = world.getBlockState(adjPos);
		if (adjState.getBlock() == this && adjState.get(BlockStateProperties.DOUBLE_BLOCK_HALF) != half)
		{
			world.setBlockState(adjPos, Blocks.AIR.getDefaultState(), 35);
			world.playEvent(player, 2001, adjPos, Block.getStateId(adjState));
			if (!world.isRemote && !player.isCreative())
			{
				spawnDrops(state, world, pos, (TileEntity) null, player, player.getHeldItemMainhand());
				spawnDrops(adjState, world, adjPos, (TileEntity) null, player, player.getHeldItemMainhand());
			}
		}
		super.onBlockHarvested(world, pos, state, player);
	}

	@Override
	public PushReaction getPushReaction(BlockState state)
	{
		return PushReaction.DESTROY;
	}
}