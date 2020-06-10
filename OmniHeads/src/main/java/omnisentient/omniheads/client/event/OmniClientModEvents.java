package omnisentient.omniheads.client.event;

import java.util.List;
import java.util.Map;
import java.util.function.Function;

import org.apache.commons.lang3.tuple.Pair;

import com.google.common.collect.Lists;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.Block.Properties;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.BlockModelShapes;
import net.minecraft.client.renderer.color.BlockColors;
import net.minecraft.client.renderer.color.IItemColor;
import net.minecraft.client.renderer.color.ItemColors;
import net.minecraft.client.renderer.model.BakedQuad;
import net.minecraft.client.renderer.model.IBakedModel;
import net.minecraft.client.renderer.model.ModelResourceLocation;
import net.minecraft.item.BlockItem;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.IItemProvider;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.GrassColors;
import net.minecraft.world.biome.BiomeColors;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.ColorHandlerEvent;
import net.minecraftforge.client.event.ModelBakeEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import omnisentient.omniheads.OmniHeads;
import omnisentient.omniheads.client.model.BrightnessBakedModel;
import omnisentient.omniheads.client.model.MultilayerBakedModel;
import omnisentient.omniheads.client.render.EmptyRenderer;
import omnisentient.omniheads.common.block.TranslucentHRBlock;
import omnisentient.omniheads.common.entity.SeatEntity;
import omnisentient.omniheads.common.init.OmniBlocks;
import omnisentient.omniheads.common.init.OmniItems;

@Mod.EventBusSubscriber(modid = OmniHeads.ID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
public class OmniClientModEvents
{
	public static final List<Pair<ModelResourceLocation, Function<IBakedModel, IBakedModel>>> MODEL_OVERRIDES = Lists.newArrayList();

	@SubscribeEvent
	public static void onClientSetup(FMLClientSetupEvent event)
	{
		RenderingRegistry.registerEntityRenderingHandler(SeatEntity.class, EmptyRenderer::new);
		Function<BakedQuad, BlockRenderLayer> selector = quad -> quad.getSprite().getName().getPath().contains("glass") ? BlockRenderLayer.TRANSLUCENT : BlockRenderLayer.SOLID;
		addBlockOverride(OmniBlocks.BARCART_BLACK, model -> new MultilayerBakedModel(model, selector));
		addBlockOverride(OmniBlocks.BARCART_WHITE, model -> new MultilayerBakedModel(model, selector));
		addBlockOverride(OmniBlocks.BATHTUB_BLACK, model -> new MultilayerBakedModel(model, selector));
		addBlockOverride(OmniBlocks.BATHTUB_WHITE, model -> new MultilayerBakedModel(model, selector));
		addBlockOverride(OmniBlocks.BLENDER_BLACK, model -> new MultilayerBakedModel(model, selector));
		addBlockOverride(OmniBlocks.BLENDER_WHITE, model -> new MultilayerBakedModel(model, selector));
		addBlockOverride(OmniBlocks.DOGBOWL_WHITE, model -> new MultilayerBakedModel(model, selector));
		addBlockOverride(OmniBlocks.DOGBOWL_BLACK, model -> new MultilayerBakedModel(model, selector));
		addBlockOverride(OmniBlocks.DOGBOWL_CYAN, model -> new MultilayerBakedModel(model, selector));
		addBlockOverride(OmniBlocks.DONUT_SERVING1, model -> new MultilayerBakedModel(model, selector));
		addBlockOverride(OmniBlocks.DONUT_SERVING2, model -> new MultilayerBakedModel(model, selector));
		addBlockOverride(OmniBlocks.DONUT_SERVING3, model -> new MultilayerBakedModel(model, selector));
		addBlockOverride(OmniBlocks.FASTFOOD_SERVING1, model -> new MultilayerBakedModel(model, selector));
		addBlockOverride(OmniBlocks.FASTFOOD_SERVING2, model -> new MultilayerBakedModel(model, selector));
		addBlockOverride(OmniBlocks.FASTFOOD_SERVING3, model -> new MultilayerBakedModel(model, selector));
		addBlockOverride(OmniBlocks.GLASSFENCE_BLACK, model -> new MultilayerBakedModel(model, selector));
		addBlockOverride(OmniBlocks.GLASSFENCE_WHITE, model -> new MultilayerBakedModel(model, selector));
		addBlockOverride(OmniBlocks.GLASS_SHELF_BLACK, model -> new MultilayerBakedModel(model, selector));
		addBlockOverride(OmniBlocks.GLASS_SHELF_BLUE, model -> new MultilayerBakedModel(model, selector));
		addBlockOverride(OmniBlocks.GUMBALL_CYAN, model -> new MultilayerBakedModel(model, selector));
		addBlockOverride(OmniBlocks.GUMBALL_RED, model -> new MultilayerBakedModel(model, selector));
		addBlockOverride(OmniBlocks.MODERNDOOR1, model -> new MultilayerBakedModel(model, selector));
		addBlockOverride(OmniBlocks.MODERNDOOR4, model -> new MultilayerBakedModel(model, selector));
		addBlockOverride(OmniBlocks.MODERNDOOR5, model -> new MultilayerBakedModel(model, selector));
		addBlockOverride(OmniBlocks.MODERNDOOR5B, model -> new MultilayerBakedModel(model, selector));
		addBlockOverride(OmniBlocks.ICEBUCKET, model -> new MultilayerBakedModel(model, selector));
		addBlockOverride(OmniBlocks.LAMP_BLACK, model -> new MultilayerBakedModel(model, selector));
		addBlockOverride(OmniBlocks.LAMP_WHITE, model -> new MultilayerBakedModel(model, selector));
		addBlockOverride(OmniBlocks.MICROWAVE, model -> new MultilayerBakedModel(model, selector));
		addBlockOverride(OmniBlocks.MICROWAVE_BLACK, model -> new MultilayerBakedModel(model, selector));
		addBlockOverride(OmniBlocks.MIRROR_BLACK, model -> new MultilayerBakedModel(model, selector));
		addBlockOverride(OmniBlocks.MIRROR_WHITE, model -> new MultilayerBakedModel(model, selector));
		addBlockOverride(OmniBlocks.SHOES_BOOTS_BLACK, model -> new MultilayerBakedModel(model, selector));
		addBlockOverride(OmniBlocks.SHOES_BOOTS_WHITE, model -> new MultilayerBakedModel(model, selector));
		addBlockOverride(OmniBlocks.SHOES_HEELS_BLACK, model -> new MultilayerBakedModel(model, selector));
		addBlockOverride(OmniBlocks.SHOES_HEELS_WHITE, model -> new MultilayerBakedModel(model, selector));
		addBlockOverride(OmniBlocks.SHOES_HIGHTOPS_BLACK, model -> new MultilayerBakedModel(model, selector));
		addBlockOverride(OmniBlocks.SHOES_HIGHTOPS_WHITE, model -> new MultilayerBakedModel(model, selector));
		addBlockOverride(OmniBlocks.SHOES_LEATHER_BLACK, model -> new MultilayerBakedModel(model, selector));
		addBlockOverride(OmniBlocks.SHOES_LEATHER_WHITE, model -> new MultilayerBakedModel(model, selector));
		addBlockOverride(OmniBlocks.SHOES_SNEAKERS_BLACK, model -> new MultilayerBakedModel(model, selector));
		addBlockOverride(OmniBlocks.SHOES_SNEAKERS_WHITE, model -> new MultilayerBakedModel(model, selector));
		addBlockOverride(OmniBlocks.CLOTHES_BLOUSE_BLACK, model -> new MultilayerBakedModel(model, selector));
		addBlockOverride(OmniBlocks.CLOTHES_BLOUSE_WHITE, model -> new MultilayerBakedModel(model, selector));
		addBlockOverride(OmniBlocks.CLOTHES_SHIRT_BLACK, model -> new MultilayerBakedModel(model, selector));
		addBlockOverride(OmniBlocks.CLOTHES_SHIRT_WHITE, model -> new MultilayerBakedModel(model, selector));
		addBlockOverride(OmniBlocks.CLOTHES_SHORTS_BLACK, model -> new MultilayerBakedModel(model, selector));
		addBlockOverride(OmniBlocks.CLOTHES_SHORTS_WHITE, model -> new MultilayerBakedModel(model, selector));
		addBlockOverride(OmniBlocks.CLOTHES_PANTS_BLACK, model -> new MultilayerBakedModel(model, selector));  
		addBlockOverride(OmniBlocks.CLOTHES_PANTS_WHITE, model -> new MultilayerBakedModel(model, selector));  
		addBlockOverride(OmniBlocks.CLOTHES_SUITS_BLACK, model -> new MultilayerBakedModel(model, selector));
		addBlockOverride(OmniBlocks.CLOTHES_SUITS_WHITE, model -> new MultilayerBakedModel(model, selector));
		addBlockOverride(OmniBlocks.CLOSET_BOX_BLACK, model -> new MultilayerBakedModel(model, selector)); 
		addBlockOverride(OmniBlocks.CLOSET_BOX_WHITE, model -> new MultilayerBakedModel(model, selector)); 
		addBlockOverride(OmniBlocks.CLOSET_TOWELS_BLACK, model -> new MultilayerBakedModel(model, selector)); 
		addBlockOverride(OmniBlocks.CLOSET_TOWELS_WHITE, model -> new MultilayerBakedModel(model, selector)); 
		addBlockOverride(OmniBlocks.SLIDING_DOOR, model -> new MultilayerBakedModel(model, selector));
		addBlockOverride(OmniBlocks.STAIRGLASSFENCE_BLACK, model -> new MultilayerBakedModel(model, selector));
		addBlockOverride(OmniBlocks.STAIRGLASSFENCE_WHITE, model -> new MultilayerBakedModel(model, selector));
		addBlockOverride(OmniBlocks.STAIRGLASSFENCEB_BLACK, model -> new MultilayerBakedModel(model, selector));
		addBlockOverride(OmniBlocks.STAIRGLASSFENCEB_WHITE, model -> new MultilayerBakedModel(model, selector));
		addBlockOverride(OmniBlocks.SYSTEMUNIT_BLACK, model -> new MultilayerBakedModel(model, selector));
		addBlockOverride(OmniBlocks.SYSTEMUNIT_WHITE, model -> new MultilayerBakedModel(model, selector));
		addBlockOverride(OmniBlocks.TABLE_COFFEE, model -> new MultilayerBakedModel(model, selector));
		addBlockOverride(OmniBlocks.TABLE_DINING_GLASS, model -> new MultilayerBakedModel(model, selector));
		addBlockOverride(OmniBlocks.TABLE_DININGB_GLASS, model -> new MultilayerBakedModel(model, selector));
		addBlockOverride(OmniBlocks.TABLE_DININGC_BLACK, model -> new MultilayerBakedModel(model, selector));
		addBlockOverride(OmniBlocks.TABLE_DININGC_GLASS, model -> new MultilayerBakedModel(model, selector));
		addBlockOverride(OmniBlocks.TABLE_DININGC_WHITE, model -> new MultilayerBakedModel(model, selector));
		addBlockOverride(OmniBlocks.TABLE_TOP_GLASS, model -> new MultilayerBakedModel(model, selector));
		addBlockOverride(OmniBlocks.TOILET_BLACK, model -> new MultilayerBakedModel(model, selector));
		addBlockOverride(OmniBlocks.TOILET_WHITE, model -> new MultilayerBakedModel(model, selector));
		addBlockOverride(OmniBlocks.TV_BOTTOM, model -> new MultilayerBakedModel(model, selector));
		addBlockOverride(OmniBlocks.TV_PART, model -> new MultilayerBakedModel(model, selector));
		addBlockOverride(OmniBlocks.TV_STAND, model -> new MultilayerBakedModel(model, selector));
		addBlockOverride(OmniBlocks.TV_WALL, model -> new MultilayerBakedModel(model, selector));
		addBlockOverride(OmniBlocks.WF_BOTTOMFRAMESCORNER, model -> new MultilayerBakedModel(model, selector));
		addBlockOverride(OmniBlocks.WF_DOWNCORNER, model -> new MultilayerBakedModel(model, selector));
		addBlockOverride(OmniBlocks.WF_DOWN, model -> new MultilayerBakedModel(model, selector));
		addBlockOverride(OmniBlocks.WF_EASTCORNER, model -> new MultilayerBakedModel(model, selector));
		addBlockOverride(OmniBlocks.WF_EASTDOWN, model -> new MultilayerBakedModel(model, selector));
		addBlockOverride(OmniBlocks.WF_EASTTRIANGLE, model -> new MultilayerBakedModel(model, selector));
		addBlockOverride(OmniBlocks.WF_EASTUP, model -> new MultilayerBakedModel(model, selector));
		addBlockOverride(OmniBlocks.WF_EASTWEST, model -> new MultilayerBakedModel(model, selector));
		addBlockOverride(OmniBlocks.WF_EAST, model -> new MultilayerBakedModel(model, selector));	
		addBlockOverride(OmniBlocks.WF_FRAMELESSCORNER, model -> new MultilayerBakedModel(model, selector));
		addBlockOverride(OmniBlocks.WF_FRAMELESS, model -> new MultilayerBakedModel(model, selector));
		addBlockOverride(OmniBlocks.WF_LOWERCORNER, model -> new MultilayerBakedModel(model, selector));
		addBlockOverride(OmniBlocks.WF_SIDEFRAMESCORNER, model -> new MultilayerBakedModel(model, selector));
		addBlockOverride(OmniBlocks.WF_SQUARECORNER, model -> new MultilayerBakedModel(model, selector));
		addBlockOverride(OmniBlocks.WF_SQUARE, model -> new MultilayerBakedModel(model, selector));
		addBlockOverride(OmniBlocks.WF_TOPFRAMESCORNER, model -> new MultilayerBakedModel(model, selector));
		addBlockOverride(OmniBlocks.WF_UPCORNER, model -> new MultilayerBakedModel(model, selector));
		addBlockOverride(OmniBlocks.WF_UPDOWN, model -> new MultilayerBakedModel(model, selector));		
		addBlockOverride(OmniBlocks.WF_UP, model -> new MultilayerBakedModel(model, selector));
		addBlockOverride(OmniBlocks.WF_UPPERCORNER, model -> new MultilayerBakedModel(model, selector));
		addBlockOverride(OmniBlocks.WF_WESTCORNER, model -> new MultilayerBakedModel(model, selector));
		addBlockOverride(OmniBlocks.WF_WESTDOWN, model -> new MultilayerBakedModel(model, selector));
		addBlockOverride(OmniBlocks.WF_WESTTRIANGLE, model -> new MultilayerBakedModel(model, selector));
		addBlockOverride(OmniBlocks.WF_WESTUP, model -> new MultilayerBakedModel(model, selector));
		addBlockOverride(OmniBlocks.WF_WEST, model -> new MultilayerBakedModel(model, selector));
		
		addFullOverride(OmniBlocks.ALARM_CYAN, model -> new BrightnessBakedModel(model, quad -> quad.getTintIndex() == -2));
		addFullOverride(OmniBlocks.ALARM_GRAY, model -> new BrightnessBakedModel(model, quad -> quad.getTintIndex() == -2));
		addFullOverride(OmniBlocks.ALARM_WHITE, model -> new BrightnessBakedModel(model, quad -> quad.getTintIndex() == -2));
		addFullOverride(OmniBlocks.CEILING_FLAT_LIGHT, model -> new BrightnessBakedModel(model, quad -> quad.getTintIndex() == -2));
		addFullOverride(OmniBlocks.FLOOR_FLAT_LIGHT, model -> new BrightnessBakedModel(model, quad -> quad.getTintIndex() == -2));
		addFullOverride(OmniBlocks.IMAC, model -> new BrightnessBakedModel(model, quad -> quad.getTintIndex() == -2));
		addFullOverride(OmniBlocks.LAMP_BLACK, model -> new BrightnessBakedModel(model, quad -> quad.getTintIndex() == -2));
		addFullOverride(OmniBlocks.LAMP_WHITE, model -> new BrightnessBakedModel(model, quad -> quad.getTintIndex() == -2));
		addFullOverride(OmniBlocks.LAPTOP, model -> new BrightnessBakedModel(model, quad -> quad.getTintIndex() == -2));
		addFullOverride(OmniBlocks.MONITORS_BLACK, model -> new BrightnessBakedModel(model, quad -> quad.getTintIndex() == -2));
		addFullOverride(OmniBlocks.MONITORS_WHITE, model -> new BrightnessBakedModel(model, quad -> quad.getTintIndex() == -2));	
		addFullOverride(OmniBlocks.PHONE, model -> new BrightnessBakedModel(model, quad -> quad.getTintIndex() == -2));
		addFullOverride(OmniBlocks.SYSTEMUNIT_BLACK, model -> new BrightnessBakedModel(model, quad -> quad.getTintIndex() == -2));
		addFullOverride(OmniBlocks.SYSTEMUNIT_WHITE, model -> new BrightnessBakedModel(model, quad -> quad.getTintIndex() == -2));
		addFullOverride(OmniBlocks.TABLE_DININGC_BLACK, model -> new BrightnessBakedModel(model, quad -> quad.getTintIndex() == -2));
		addFullOverride(OmniBlocks.TABLE_DININGC_GLASS, model -> new BrightnessBakedModel(model, quad -> quad.getTintIndex() == -2));
		addFullOverride(OmniBlocks.TABLE_DININGC_WHITE, model -> new BrightnessBakedModel(model, quad -> quad.getTintIndex() == -2));
		addFullOverride(OmniBlocks.WATERDISPENSER_WHITE, model -> new BrightnessBakedModel(model, quad -> quad.getTintIndex() == -2));
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

	public static void addItemOverride(IItemProvider item, Function<IBakedModel, IBakedModel> wrap)
	{
		MODEL_OVERRIDES.add(Pair.of(new ModelResourceLocation(item.asItem().getRegistryName(), "inventory"), wrap));
	}

	public static void addFullOverride(Block block, Function<IBakedModel, IBakedModel> wrap)
	{
		addBlockOverride(block, wrap);
		addItemOverride(block, wrap);
	}
	
}