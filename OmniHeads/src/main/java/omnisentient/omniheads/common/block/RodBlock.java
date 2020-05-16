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

public class RodBlock extends HorizontalRotationBlock
{
	
	public static final VoxelShape SHAPE = Block.makeCuboidShape(7d, 0d, 7d, 9d, 16d, 9d);
	
	public RodBlock(Properties props)
	{
		super(props);
	}

	public VoxelShape getShape(BlockState state, IBlockReader world, BlockPos pos, ISelectionContext ctx)
	{
		Direction dir = state.get(BlockStateProperties.HORIZONTAL_FACING);
		switch(dir)
		{
		case NORTH:
			return SHAPE;
		case EAST:
			return SHAPE;
		case SOUTH:
			return SHAPE;
		case WEST:
			return SHAPE;
		default:
			return VoxelShapes.fullCube();
		}
	}
}