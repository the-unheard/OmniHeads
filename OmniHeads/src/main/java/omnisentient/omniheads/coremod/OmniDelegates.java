package omnisentient.omniheads.coremod;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import omnisentient.omniheads.common.block.SlidingDoorBlock;
import omnisentient.omniheads.common.tileentity.DoorTileEntity;

public final class OmniDelegates
{
	private OmniDelegates() {}

	public static void onBlockUpdate(World world, BlockPos pos, BlockState oldState, BlockState newState)
	{
		Block oldBlock = oldState.getBlock();
		Block newBlock = newState.getBlock();
		
		System.out.println(oldBlock + ", " + newBlock);
		
		if(oldBlock instanceof SlidingDoorBlock && oldBlock == newBlock && oldState.get(BlockStateProperties.OPEN) != newState.get(BlockStateProperties.OPEN))
			((DoorTileEntity) world.getTileEntity(pos)).toggle();
	}
}