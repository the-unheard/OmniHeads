package omnisentient.omniheads.client.render.tileentity;

import java.util.Random;

import net.minecraft.block.BlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.BlockRendererDispatcher;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.model.IBakedModel;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.state.properties.DoorHingeSide;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3i;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.model.ModelDataManager;
import net.minecraftforge.client.model.animation.TileEntityRendererFast;
import omnisentient.omniheads.common.util.IAnimatedDoor;

@OnlyIn(Dist.CLIENT)
public class SlidingDoorRenderer<T extends TileEntity & IAnimatedDoor> extends TileEntityRendererFast<T>
{
	@Override
	public void renderTileEntityFast(T te, double x, double y, double z, float partialTick, int destroyStage, BufferBuilder buffer)
	{
	    BlockRendererDispatcher dispatch = Minecraft.getInstance().getBlockRendererDispatcher();
	    World world = te.getWorld();
	    BlockPos pos = te.getPos();
	    BlockState state = world.getBlockState(pos);

	    //
	    if(!state.has(BlockStateProperties.HORIZONTAL_FACING) || !state.has(BlockStateProperties.DOOR_HINGE) || !state.has(BlockStateProperties.OPEN))
	        return;

	    IBakedModel model = dispatch.getModelForState(state);
	    Direction facing = state.get(BlockStateProperties.HORIZONTAL_FACING);
	    Vec3i tr = (state.get(BlockStateProperties.DOOR_HINGE) == DoorHingeSide.LEFT != state.get(BlockStateProperties.OPEN) ? facing.rotateYCCW() : facing.rotateY()).getDirectionVec();
	    float pr = te.getDoorProgress(partialTick);

	    //
	    if(pr > 0f)
	        System.out.println(pr);

	    buffer.setTranslation(x - pos.getX() + tr.getX() * pr, y - pos.getY(), z - pos.getZ() + tr.getZ() * pr);
	        dispatch.getBlockModelRenderer().renderModel(world, model, state, pos, buffer, false, new Random(), 42, model.getModelData(world, pos, state, ModelDataManager.getModelData(world, pos)));
	}
}