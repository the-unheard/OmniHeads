package omnisentient.omniheads.common.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;

public class BabyBlock extends HorizontalRotationBlock
{
	public static final VoxelShape SHAPE = Block.makeCuboidShape(0d, 0d, 0d, 16d, 9d, 16d);

	public BabyBlock(Properties properties)
	{
		super(properties);
	}

	@Override
	public VoxelShape getShape(BlockState state, IBlockReader world, BlockPos pos, ISelectionContext ctx)
	{
		return SHAPE;
	}
}