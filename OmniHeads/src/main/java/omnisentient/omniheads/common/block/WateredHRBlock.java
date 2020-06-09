package omnisentient.omniheads.common.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.IWaterLoggable;
import net.minecraft.fluid.Fluids;
import net.minecraft.fluid.IFluidState;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;

public class WateredHRBlock extends HorizontalRotationBlock implements IWaterLoggable
{
	public WateredHRBlock(Properties props, VoxelShape northShape)
	{
		super(props, northShape);
		this.setDefaultState(this.stateContainer.getBaseState().with(BlockStateProperties.WATERLOGGED, false));
	}

	public WateredHRBlock(Properties props)
	{
		super(props);
		this.setDefaultState(this.stateContainer.getBaseState().with(BlockStateProperties.WATERLOGGED, false));
	}

	@Override
	protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder)
	{
		super.fillStateContainer(builder);
		builder.add(BlockStateProperties.WATERLOGGED);
	}

	@Override
	public IFluidState getFluidState(BlockState state)
	{
		return state.get(BlockStateProperties.WATERLOGGED) ? Fluids.WATER.getStillFluidState(false) : super.getFluidState(state);
	}

	@Override
	public BlockState updatePostPlacement(BlockState state, Direction side, BlockState adjState, IWorld world, BlockPos pos, BlockPos adjPos)
	{
		if (state.get(BlockStateProperties.WATERLOGGED))
			world.getPendingFluidTicks().scheduleTick(pos, Fluids.WATER, Fluids.WATER.getTickRate(world));
		return state;
	}

	@Override
	public BlockState getStateForPlacement(BlockItemUseContext ctx)
	{
		return super.getStateForPlacement(ctx).with(BlockStateProperties.WATERLOGGED, ctx.getWorld().getFluidState(ctx.getPos()).getFluid() == Fluids.WATER);
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, IBlockReader world, BlockPos pos)
	{
		return !state.get(BlockStateProperties.WATERLOGGED);
	}
}