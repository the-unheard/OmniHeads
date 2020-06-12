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

public class GlassTableBlock extends TranslucentHRBlock
{
	public GlassTableBlock(Properties props, VoxelShape northShape)
	{
		super(props, northShape);
	}
	
	public GlassTableBlock(Properties props)
	{
		super(props);
	}
	
	@Deprecated
	@OnlyIn(Dist.CLIENT)
	public boolean isSideInvisible(BlockState state, BlockState adjacentBlockState, Direction side) {
		
		Block adjacentBlock = adjacentBlockState.getBlock();
		
		if ((adjacentBlock == OmniBlocks.TABLE_TOP_GLASS) || (adjacentBlock == OmniBlocks.TABLE_DINING_GLASS )  || (adjacentBlock == OmniBlocks.TABLE_DININGB_GLASS )  || (adjacentBlock == OmniBlocks.TABLE_DININGC_GLASS )) {
			return true;
		}

		return super.isSideInvisible(state, adjacentBlockState, side);
		
	}

}