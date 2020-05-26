package omnisentient.omniheads.common.block;

import net.minecraft.block.BlockState;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.math.shapes.VoxelShape;

public class TranslucentHRBlock extends HorizontalRotationBlock
{
	public TranslucentHRBlock(Properties props, VoxelShape northShape)
	{
		super(props, northShape);
	}
	
	public TranslucentHRBlock(Properties props)
	{
		super(props);
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
}