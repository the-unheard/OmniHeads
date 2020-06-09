package omnisentient.omniheads.common.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.DoorBlock;
import net.minecraft.util.BlockRenderLayer;

public class NormalDoorBlock extends DoorBlock {
	public NormalDoorBlock(Block.Properties builder) {
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
}