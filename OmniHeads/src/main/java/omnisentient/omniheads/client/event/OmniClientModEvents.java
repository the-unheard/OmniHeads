package omnisentient.omniheads.client.event;

import java.util.List;
import java.util.Map;
import java.util.function.Function;

import org.apache.commons.lang3.tuple.Pair;

import com.google.common.collect.Lists;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.client.renderer.BlockModelShapes;
import net.minecraft.client.renderer.model.IBakedModel;
import net.minecraft.client.renderer.model.ModelResourceLocation;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.ModelBakeEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import omnisentient.omniheads.OmniHeads;

@Mod.EventBusSubscriber(modid = OmniHeads.ID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
public class OmniClientModEvents
{
	public static final List<Pair<ModelResourceLocation, Function<IBakedModel, IBakedModel>>> MODEL_OVERRIDES = Lists.newArrayList();

	@SubscribeEvent
	public static void onClientSetup(FMLClientSetupEvent event)
	{
		
	}

	@SubscribeEvent
	public static void onModelBake(ModelBakeEvent event)
	{
		Map<ResourceLocation, IBakedModel> registry = event.getModelRegistry();
		for(Pair<ModelResourceLocation, Function<IBakedModel, IBakedModel>> override : MODEL_OVERRIDES)
		{
			IBakedModel model = registry.get(override.getLeft());
			if(model != null)
				registry.put(override.getLeft(), override.getRight().apply(model));
		}
	}

	public static void addBlockOverride(Block block, Function<IBakedModel, IBakedModel> wrap)
	{
		for(BlockState state : block.getStateContainer().getValidStates())
			MODEL_OVERRIDES.add(Pair.of(BlockModelShapes.getModelLocation(state), wrap));
	}
}