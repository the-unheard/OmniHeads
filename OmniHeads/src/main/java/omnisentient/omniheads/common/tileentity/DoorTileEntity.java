package omnisentient.omniheads.common.tileentity;

import net.minecraft.network.NetworkManager;
import net.minecraft.network.play.server.SUpdateTileEntityPacket;
import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.TileEntity;
import omnisentient.omniheads.common.init.OmniTileEntityTypes;
import omnisentient.omniheads.common.util.IAnimatedDoor;
import omnisentient.omniheads.common.util.OmniUtil;

public class DoorTileEntity extends TileEntity implements IAnimatedDoor, ITickableTileEntity
{
	public final int maxAnimTicks = 4;
	public int animTick = 0, oldAnimTick = 0;

	public DoorTileEntity()
	{
		super(OmniTileEntityTypes.DOOR);
	}

	public void toggle()
	{
		if(this.animTick == 0)
			this.animTick = this.maxAnimTicks;
		else
			this.animTick = this.maxAnimTicks - this.animTick;
		this.oldAnimTick = this.animTick;
	}

	@Override
	public void tick()
	{
		this.oldAnimTick = animTick;
		if(this.animTick > 0)
			--this.animTick;
	}

	@Override
	public boolean hasFastRenderer()
	{
		return true;
	}

	@Override
	public float getDoorProgress(float partialTick)
	{
		return OmniUtil.bezierCubic1d(0f, 1f, OmniUtil.lerp(this.oldAnimTick, this.animTick, partialTick) / this.maxAnimTicks);
	}
}