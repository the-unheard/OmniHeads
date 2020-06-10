package omnisentient.omniheads.common.block;

import java.util.Map;

import com.google.common.collect.Maps;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.state.properties.DoubleBlockHalf;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import omnisentient.omniheads.common.entity.SeatEntity;

public class TallSeatBlock extends TallHRBlock
{
	public final Vec3d shift;
	public final Map<Direction, VoxelShape> shapes = Maps.newEnumMap(Direction.class);
	 
	public TallSeatBlock(Properties props, VoxelShape northShape, VoxelShape upperShape, Vec3d shift)
	{
		super(props, northShape, upperShape);
		this.shift = shift;
	}

	public TallSeatBlock(Properties props)
	{
		super(props);
		this.shift = new Vec3d(0.5d, 0.5d, 0.5d);
	}

	@Override
	public boolean onBlockActivated(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockRayTraceResult hit)
	{
		DoubleBlockHalf half = state.get(BlockStateProperties.DOUBLE_BLOCK_HALF);
		if((player.getRidingEntity() == null)&&(half == DoubleBlockHalf.LOWER))
		{
			if(world.isRemote)
				return true;
			SeatEntity seat = new SeatEntity(world, pos.getX() + this.shift.x, pos.getY() + this.shift.y, pos.getZ() + this.shift.z);
			world.addEntity(seat);
			player.startRiding(seat, true);
			return true;
		}
		return false;
	}
}