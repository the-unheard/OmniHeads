package omnisentient.omniheads.client.render;

import net.minecraft.client.renderer.culling.ICamera;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class EmptyRenderer extends EntityRenderer
{
	public EmptyRenderer(EntityRendererManager manager)
	{
		super(manager);
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity entity)
	{
		return null;
	}

	@Override
	public void doRender(Entity entity, double x, double y, double z, float yaw, float partialTick) {}

	@Override
	public boolean shouldRender(Entity entity, ICamera camera, double camX, double camY, double camZ)
	{
		return false;
	}
}