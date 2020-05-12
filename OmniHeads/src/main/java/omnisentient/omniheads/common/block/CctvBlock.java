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

public class CctvBlock extends FullRotationBlock
{
	public static final VoxelShape NORTH_SHAPE = Block.makeCuboidShape(5d, 2d, 16d, 11d, 12d, 2d);
	public static final VoxelShape EAST_SHAPE = Block.makeCuboidShape(0d, 2d, 5d, 14d, 12d, 11d);
	public static final VoxelShape SOUTH_SHAPE = Block.makeCuboidShape(5d, 2d, 0d, 11d, 12d, 14d);
	public static final VoxelShape WEST_SHAPE = Block.makeCuboidShape(16d, 2d, 5d, 2d, 12d, 11d);
	public static final VoxelShape UP_SHAPE = Block.makeCuboidShape(5d, 0d, 12d, 11d, 14d, 2d);
	public static final VoxelShape DOWN_SHAPE = Block.makeCuboidShape(5d, 3d, 14d, 11d, 16d, 4d);

	public CctvBlock(Properties props)
	{
		super(props);
	}

	public VoxelShape getShape(BlockState state, IBlockReader world, BlockPos pos, ISelectionContext ctx)
	{
		Direction dir = state.get(BlockStateProperties.FACING);
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
		case UP:
			return UP_SHAPE;
		case DOWN:
			return DOWN_SHAPE;
		default:
			return VoxelShapes.fullCube();
		}
	}
}