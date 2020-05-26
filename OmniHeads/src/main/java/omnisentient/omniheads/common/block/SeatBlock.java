package omnisentient.omniheads.common.block;

import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.World;
import omnisentient.omniheads.common.entity.SeatEntity;

public class SeatBlock extends HorizontalRotationBlock
{
	public SeatBlock(Properties props, VoxelShape northShape)
	{
		super(props, northShape);
	}

	public SeatBlock(Properties props)
	{
		super(props);
	}

	@Override
	public boolean onBlockActivated(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockRayTraceResult hit)
	{
		if(player.getRidingEntity() == null)
		{
			if(world.isRemote)
				return true;
			SeatEntity seat = new SeatEntity(world, pos.getX() + 0.5d, pos.getY() + 0.5d, pos.getZ() + 0.5d);
			world.addEntity(seat);
			player.startRiding(seat, true);
			return true;
		}
		return false;
	}
}