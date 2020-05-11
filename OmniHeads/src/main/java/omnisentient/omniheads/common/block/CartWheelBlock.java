package omnisentient.omniheads.common.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.Direction;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;

public class CartWheelBlock extends FullRotationBlock
{
	public static final VoxelShape NORTH_SHAPE = Block.makeCuboidShape(0d, 0d, 0d, 16d, 16d, 3d);
	public static final VoxelShape EAST_SHAPE = Block.makeCuboidShape(16d, 0d, 0d, 13d, 16d, 16d);
	public static final VoxelShape SOUTH_SHAPE = Block.makeCuboidShape(0d, 0d, 16d, 16d, 16d, 13d);
	public static final VoxelShape WEST_SHAPE = Block.makeCuboidShape(0d, 0d, 0d, 3d, 16d, 16d);
	public static final VoxelShape UP_SHAPE = Block.makeCuboidShape(0d, 16d, 0d, 16d, 13d, 16d);
	public static final VoxelShape DOWN_SHAPE = Block.makeCuboidShape(0d, 0d, 0d, 16d, 3d, 16d);

	public CartWheelBlock(Properties props)
	{
		super(props);
	}

	private VoxelShape getShape(BlockState state)
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