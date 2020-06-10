package omnisentient.omniheads.common.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.DoorBlock;
import net.minecraft.state.properties.DoorHingeSide;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;

public class SlidingDoorBlock extends DoorBlock {
	
	protected static final VoxelShape NORTH_SHAPE = Block.makeCuboidShape(0d, 0d, 11.5d, 16d, 16d, 12.5d);
	protected static final VoxelShape EAST_SHAPE = Block.makeCuboidShape(3.5d, 0d, 0d, 4.5d, 16d, 16d);
	protected static final VoxelShape SOUTH_SHAPE = Block.makeCuboidShape(0d, 0d, 3.5d, 16d, 16d, 4.5d);
	protected static final VoxelShape WEST_SHAPE = Block.makeCuboidShape(11.5d, 0d, 0d, 12.5d, 16d, 16d);
	   
	public SlidingDoorBlock(Block.Properties builder) {
		super(builder);
	}
	
	@Override
	public boolean canRenderInLayer(BlockState state, BlockRenderLayer layer)
	{
		switch(layer)
		{
		case SOLID:
			return true;
		case TRANSLUCENT:
			return true;
		default:
			return false;
		}
	}
	
	@Override
	public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
		Direction direction = state.get(FACING);
		boolean flag = !state.get(OPEN);
		boolean flag1 = state.get(HINGE) == DoorHingeSide.RIGHT;
		switch(direction) {
			case EAST:
				default:
				return flag ? EAST_SHAPE : (flag1 ? NORTH_SHAPE : SOUTH_SHAPE);
			case SOUTH:
				return flag ? SOUTH_SHAPE : (flag1 ? EAST_SHAPE : WEST_SHAPE);
			case WEST:
				return flag ? WEST_SHAPE : (flag1 ? SOUTH_SHAPE : NORTH_SHAPE);
			case NORTH:
				return flag ? NORTH_SHAPE : (flag1 ? WEST_SHAPE : EAST_SHAPE);
		}
	}
}