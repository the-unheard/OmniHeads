package omnisentient.omniheads.common.block;

import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.World;
import omnisentient.omniheads.common.entity.SeatEntity;

public class TranslucentSeatBlock extends TranslucentHRBlock
{
	public final Vec3d shift;
	 
	public TranslucentSeatBlock(Properties props, VoxelShape northShape, Vec3d shift)
	{
		super(props, northShape);
		this.shift = shift;
	}

	public TranslucentSeatBlock(Properties props)
	{
		super(props);
		this.shift = new Vec3d(0.5d, 0.5d, 0.5d);
	}

	@Override
	public boolean onBlockActivated(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockRayTraceResult hit)
	{
		if(player.getRidingEntity() == null)
		{
			if(world.isRemote)
				return true;
			SeatEntity seat = new SeatEntity(world, pos.getX() + this.shift.x, pos.getY() + this.shift.y, pos.getZ() + this.shift.z); //???
			world.addEntity(seat);
			player.startRiding(seat, true);
			return true;
		}
		return false;
	}
}