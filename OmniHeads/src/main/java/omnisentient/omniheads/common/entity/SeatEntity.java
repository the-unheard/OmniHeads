package omnisentient.omniheads.common.entity;

import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.IPacket;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.network.NetworkHooks;
import omnisentient.omniheads.common.init.OmniEntityTypes;

public class SeatEntity extends Entity
{
	public BlockPos.MutableBlockPos pos = new BlockPos.MutableBlockPos();
	public BlockState state;

	public SeatEntity(EntityType<?> type, World world)
	{
		super(type, world);
		this.noClip = true;
	}

	public SeatEntity(World world, double x, double y, double z)
	{
		this(OmniEntityTypes.SEAT, world);
		this.setPosition(x, y, z);
		this.noClip = true;
	}

	@Override
	public void onAddedToWorld()
	{
		super.onAddedToWorld();
		this.pos.setPos(this);
		this.state = this.world.getBlockState(this.pos);
	}

	@Override
	public void tick()
	{
		super.tick();
		this.pos.setPos(this);
		if(this.getPassengers().isEmpty() || this.world.getBlockState(this.pos).getBlock() != this.state.getBlock())
			this.remove();
	}

	@Override
	protected void registerData() {}

	@Override
	protected void readAdditional(CompoundNBT nbt) {}

	@Override
	protected void writeAdditional(CompoundNBT nbt) {}

	@Override
	public IPacket<?> createSpawnPacket()
	{
		return NetworkHooks.getEntitySpawningPacket(this);
	}
}