package omnisentient.omniheads.common.block;

import javax.annotation.Nullable;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.material.PushReaction;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.item.ItemStack;
import net.minecraft.state.EnumProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.state.properties.DoubleBlockHalf;
import net.minecraft.stats.Stats;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;

public class TallHRBlock extends TranslucentHRBlock
{
	
	public static final EnumProperty<DoubleBlockHalf> HALF = BlockStateProperties.DOUBLE_BLOCK_HALF;
	
	
	public TallHRBlock(Properties props, VoxelShape northShape)
	{
		super(props, northShape);
		this.setDefaultState(this.stateContainer.getBaseState().with(HALF, DoubleBlockHalf.LOWER));
	}

	public TallHRBlock(Properties props)
	{
		super(props);
		this.setDefaultState(this.stateContainer.getBaseState().with(HALF, DoubleBlockHalf.LOWER));
	}

	@Override
	protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder)
	{
		super.fillStateContainer(builder);
		builder.add(HALF);
	}

	@Override
	public VoxelShape getShape(BlockState state, IBlockReader world, BlockPos pos, ISelectionContext ctx)
	{
		return this.shapes.getOrDefault(this.getDirToOther(state), VoxelShapes.fullCube());
	}

	public Direction getDirToOther(BlockState state)
	{
		Direction dir = state.get(BlockStateProperties.HORIZONTAL_FACING);
		return state.get(HALF) == DoubleBlockHalf.LOWER ? dir : dir.getOpposite();
	}

	@Override
	public BlockState updatePostPlacement(BlockState state, Direction dir, BlockState adjState, IWorld world, BlockPos pos, BlockPos adjPos) {
		DoubleBlockHalf doubleblockhalf = state.get(HALF);
			if (dir.getAxis() == Direction.Axis.Y && doubleblockhalf == DoubleBlockHalf.LOWER == (dir == Direction.UP)) {
				return adjState.getBlock() == this && adjState.get(HALF) != doubleblockhalf ? state : Blocks.AIR.getDefaultState();
			}
			else {
				return doubleblockhalf == DoubleBlockHalf.LOWER && dir == Direction.DOWN && !state.isValidPosition(world, pos) ? Blocks.AIR.getDefaultState() : super.updatePostPlacement(state, dir, adjState, world, pos, adjPos);
			}
   }

	@Nullable
	@Override
	public BlockState getStateForPlacement(BlockItemUseContext ctx) {
		BlockPos blockpos = ctx.getPos();
		Direction dir = ctx.getPlacementHorizontalFacing();
		if (blockpos.getY() < 255 && ctx.getWorld().getBlockState(blockpos.up()).isReplaceable(ctx)) {
			return ctx.getWorld().getBlockState(ctx.getPos().up()).isReplaceable(ctx) ?  this.getDefaultState().with(BlockStateProperties.HORIZONTAL_FACING, dir) : null;
		}
		else
		{
			return null;
		}
	}

	@Override
	public void onBlockPlacedBy(World world, BlockPos pos, BlockState state, @Nullable LivingEntity placer, ItemStack stack)
	{
		super.onBlockPlacedBy(world, pos, state, placer, stack);
		if(world.isRemote)
			return;
		world.setBlockState(pos.up(), state.with(HALF, DoubleBlockHalf.UPPER), 3);
		world.notifyNeighbors(pos, Blocks.AIR);
		state.updateNeighbors(world, pos, 3);
		
	}
	
	@Override
	public void harvestBlock(World world, PlayerEntity player, BlockPos pos, BlockState state, @Nullable TileEntity te, ItemStack stack)
	{
		super.harvestBlock(world, player, pos, Blocks.AIR.getDefaultState(), te, stack);
	}

	@Override
	public void onBlockHarvested(World world, BlockPos pos, BlockState state, PlayerEntity player)
	{
		DoubleBlockHalf half = state.get(HALF);
		BlockPos adjPos = half == DoubleBlockHalf.LOWER ? pos.up() : pos.down();
		BlockState adjState = world.getBlockState(adjPos);
		if (adjState.getBlock() == this && adjState.get(HALF) != half)
		{
			world.setBlockState(adjPos, Blocks.AIR.getDefaultState(), 35);
			world.playEvent(player, 2001, adjPos, Block.getStateId(adjState));
			if (!world.isRemote && !player.isCreative())
			{
				ItemStack heldStack = player.getHeldItemMainhand();
				spawnDrops(state, world, pos, null, player, heldStack);
				spawnDrops(adjState, world, adjPos, null, player, heldStack);
			}
			player.addStat(Stats.BLOCK_MINED.get(this));
		}
		super.onBlockHarvested(world, pos, state, player);
	}

	@Override
	public PushReaction getPushReaction(BlockState state)
	{
		return PushReaction.DESTROY;
	}
}