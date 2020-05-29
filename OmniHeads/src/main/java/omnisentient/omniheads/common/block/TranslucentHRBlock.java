package omnisentient.omniheads.common.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import omnisentient.omniheads.common.init.OmniBlocks;

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