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
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.ModelBakeEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import omnisentient.omniheads.OmniHeads;
import omnisentient.omniheads.client.event.render.EmptyRenderer;
import omnisentient.omniheads.client.model.MultilayerBakedModel;
import omnisentient.omniheads.common.entity.SeatEntity;
import omnisentient.omniheads.common.init.OmniBlocks;

@Mod.EventBusSubscriber(modid = OmniHeads.ID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
public class OmniClientModEvents
{
	public static final List<Pair<ModelResourceLocation, Function<IBakedModel, IBakedModel>>> MODEL_OVERRIDES = Lists.newArrayList();

	@SubscribeEvent
	public static void onClientSetup(FMLClientSetupEvent event)
	{
		RenderingRegistry.registerEntityRenderingHandler(SeatEntity.class, EmptyRenderer::new);
		Function<ResourceLocation, BlockRenderLayer> selector = tex -> tex.getPath().contains("glass") ? BlockRenderLayer.TRANSLUCENT : BlockRenderLayer.SOLID;
		addBlockOverride(OmniBlocks.BARCART_BLACK, model -> new MultilayerBakedModel(model, selector));
		addBlockOverride(OmniBlocks.BARCART_WHITE, model -> new MultilayerBakedModel(model, selector));
		addBlockOverride(OmniBlocks.BATHTUB_BLACK, model -> new MultilayerBakedModel(model, selector));
		addBlockOverride(OmniBlocks.BATHTUB_WHITE, model -> new MultilayerBakedModel(model, selector));
		addBlockOverride(OmniBlocks.BLENDER_BLACK, model -> new MultilayerBakedModel(model, selector));
		addBlockOverride(OmniBlocks.BLENDER_WHITE, model -> new MultilayerBakedModel(model, selector));
		addBlockOverride(OmniBlocks.DOGBOWL_WHITE, model -> new MultilayerBakedModel(model, selector));
		addBlockOverride(OmniBlocks.DOGBOWL_BLACK, model -> new MultilayerBakedModel(model, selector));
		addBlockOverride(OmniBlocks.DOGBOWL_CYAN, model -> new MultilayerBakedModel(model, selector));
		addBlockOverride(OmniBlocks.GLASSFENCE_BLACK, model -> new MultilayerBakedModel(model, selector));
		addBlockOverride(OmniBlocks.GLASSFENCE_WHITE, model -> new MultilayerBakedModel(model, selector));
		addBlockOverride(OmniBlocks.GLASS_SHELF_BLACK, model -> new MultilayerBakedModel(model, selector));
		addBlockOverride(OmniBlocks.GLASS_SHELF_BLUE, model -> new MultilayerBakedModel(model, selector));
		addBlockOverride(OmniBlocks.GUMBALL_CYAN, model -> new MultilayerBakedModel(model, selector));
		addBlockOverride(OmniBlocks.GUMBALL_RED, model -> new MultilayerBakedModel(model, selector));
		addBlockOverride(OmniBlocks.LAMP_BLACK, model -> new MultilayerBakedModel(model, selector));
		addBlockOverride(OmniBlocks.LAMP_WHITE, model -> new MultilayerBakedModel(model, selector));
		addBlockOverride(OmniBlocks.MICROWAVE, model -> new MultilayerBakedModel(model, selector));
		addBlockOverride(OmniBlocks.MICROWAVE_BLACK, model -> new MultilayerBakedModel(model, selector));
		addBlockOverride(OmniBlocks.MIRROR_BLACK, model -> new MultilayerBakedModel(model, selector));
		addBlockOverride(OmniBlocks.MIRROR_WHITE, model -> new MultilayerBakedModel(model, selector));
		addBlockOverride(OmniBlocks.STAIRGLASSFENCE_BLACK, model -> new MultilayerBakedModel(model, selector));
		addBlockOverride(OmniBlocks.STAIRGLASSFENCE_WHITE, model -> new MultilayerBakedModel(model, selector));
		addBlockOverride(OmniBlocks.STAIRGLASSFENCEB_BLACK, model -> new MultilayerBakedModel(model, selector));
		addBlockOverride(OmniBlocks.STAIRGLASSFENCEB_WHITE, model -> new MultilayerBakedModel(model, selector));
		addBlockOverride(OmniBlocks.SYSTEMUNIT_BLACK, model -> new MultilayerBakedModel(model, selector));
		addBlockOverride(OmniBlocks.SYSTEMUNIT_WHITE, model -> new MultilayerBakedModel(model, selector));
		addBlockOverride(OmniBlocks.TABLE_COFFEE, model -> new MultilayerBakedModel(model, selector));
		addBlockOverride(OmniBlocks.TABLE_DININGC_BLACK, model -> new MultilayerBakedModel(model, selector));
		addBlockOverride(OmniBlocks.TABLE_DININGC_WHITE, model -> new MultilayerBakedModel(model, selector));
		addBlockOverride(OmniBlocks.TOILET_BLACK, model -> new MultilayerBakedModel(model, selector));
		addBlockOverride(OmniBlocks.TOILET_WHITE, model -> new MultilayerBakedModel(model, selector));
		addBlockOverride(OmniBlocks.TV_BOTTOM, model -> new MultilayerBakedModel(model, selector));
		addBlockOverride(OmniBlocks.TV_PART, model -> new MultilayerBakedModel(model, selector));
		addBlockOverride(OmniBlocks.TV_STAND, model -> new MultilayerBakedModel(model, selector));
		addBlockOverride(OmniBlocks.TV_WALL, model -> new MultilayerBakedModel(model, selector));
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