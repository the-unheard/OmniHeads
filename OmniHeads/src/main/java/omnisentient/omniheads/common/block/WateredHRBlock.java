package omnisentient.omniheads.common.block;

import javax.annotation.Nullable;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.IWaterLoggable;
import net.minecraft.fluid.Fluids;
import net.minecraft.fluid.IFluidState;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.state.properties.SlabType;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;

public class WateredHRBlock extends HorizontalRotationBlock implements IWaterLoggable
{
	
	public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;
	
	public WateredHRBlock(Properties props, VoxelShape northShape)
	{
		super(props, northShape);
		//this.setDefaultState(this.stateContainer.getBaseState().with(WATERLOGGED, Boolean.valueOf(false)));
	}
	
	public WateredHRBlock(Properties props)
	{
		super(props);
		//this.setDefaultState(this.stateContainer.getBaseState().with(WATERLOGGED, Boolean.valueOf(false)));
	}
	
	protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
	      builder.add(WATERLOGGED);
	   }
	
	public IFluidState getFluidState(BlockState state) {
		return state.get(WATERLOGGED) ? Fluids.WATER.getStillFluidState(false) : super.getFluidState(state);
	}
	
//	@Override
//	public BlockState getStateForPlacement(BlockItemUseContext context) {
//	      IFluidState ifluidstate = context.getWorld().getFluidState(context.getPos());
//	      return super.getStateForPlacement(context).with(WATERLOGGED, Boolean.valueOf(ifluidstate.getFluid() == Fluids.WATER));
//	   }
	
}

