package omnisentient.omniheads.common.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;

public class AlarmBlock extends HorizontalRotationBlock
{
	
	public static final VoxelShape NORTH_SHAPE = Block.makeCuboidShape(5d, 0d, 7d, 11d, 2d, 10d);
	public static final VoxelShape EAST_SHAPE = Block.makeCuboidShape(6d, 0d, 5d, 9d, 2d, 11d);
	public static final VoxelShape SOUTH_SHAPE = Block.makeCuboidShape(5d, 0d, 6d, 11d, 2d, 9d);
	public static final VoxelShape WEST_SHAPE = Block.makeCuboidShape(7d, 0d, 5d, 10d, 2d, 11d);
	
	public AlarmBlock(Properties props)
	{
		super(props);
	}

	public VoxelShape getShape(BlockState state, IBlockReader world, BlockPos pos, ISelectionContext ctx)
	{
		Direction dir = state.get(BlockStateProperties.HORIZONTAL_FACING);
		switch(dir)
		{
		case NORTH:
			return NORTH_SHAPE;
		case EAST:
			return EAST_SHAPE;
		case SOUTH:
			return SOUTH_SHAPE;
		case WEST:
			return WEST_SHAPE;
		default:
			return VoxelShapes.fullCube();
		}
	}
}