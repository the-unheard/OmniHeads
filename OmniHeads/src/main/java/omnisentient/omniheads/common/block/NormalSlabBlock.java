package omnisentient.omniheads.common.block;

import net.minecraft.block.Block;
import net.minecraft.block.SlabBlock;
import net.minecraft.util.BlockRenderLayer;

public class NormalSlabBlock extends SlabBlock {
	public NormalSlabBlock(Block.Properties builder) {
		super(builder);
	}	
	
	@Override
	public BlockRenderLayer getRenderLayer()
	{
		return BlockRenderLayer.CUTOUT;
	}
}