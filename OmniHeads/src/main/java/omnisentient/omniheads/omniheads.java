package omnisentient.omniheads;

//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import omnisentient.omniheads.blocks.ModBlocks;
import omnisentient.omniheads.blocks.baby_boy;
import omnisentient.omniheads.blocks.baby_girl;
import omnisentient.omniheads.blocks.basket_apple;
import omnisentient.omniheads.blocks.cart_wheel;
import omnisentient.omniheads.blocks.cctv;
import omnisentient.omniheads.blocks.ComputerHead;
import omnisentient.omniheads.blocks.small_brown_shroom;
import omnisentient.omniheads.blocks.small_red_shroom;
import omnisentient.omniheads.blocks.Sundae1Head;
import omnisentient.omniheads.blocks.Sundae2Head;
import omnisentient.omniheads.blocks.Sundae3Head;
import omnisentient.omniheads.blocks.Sundae4Head;
import omnisentient.omniheads.blocks.Sundae5Head;
import omnisentient.omniheads.blocks.Sundae6Head;
import omnisentient.omniheads.blocks.Sundae7Head;

@Mod("omniheads")

public class omniheads {

		public static final String modid = "omniheads";
		//private static final Logger logger = LogManager.getLogger(modid);
		public static final ItemGroup omniig = new omniItemGroup();
		
		public omniheads() {
			FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
		}
		
	private void setup(final FMLCommonSetupEvent event) {
		
	}
	
	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
	public static class RegistryEvents {
		@SubscribeEvent
		public static void onBlocksRegistry(final RegistryEvent.Register<Block> event) {
			event.getRegistry().registerAll(
				new ComputerHead(),
				new Sundae1Head(),
				new Sundae2Head(),
				new Sundae3Head(),
				new Sundae4Head(),
				new Sundae5Head(),
				new Sundae6Head(),
				new Sundae7Head(),
				new baby_boy(),
				new baby_girl(),
				new small_red_shroom(),
				new small_brown_shroom(),
				new cart_wheel(),
				new basket_apple(),
				new cctv()
			);
		}
		
		@SubscribeEvent
		public static void onItemsRegistry(final RegistryEvent.Register<Item> event) {

			event.getRegistry().registerAll(
				new BlockItem(ModBlocks.COMPUTERHEAD, new Item.Properties().group(omniig)).setRegistryName("computer_head"),
				new BlockItem(ModBlocks.SUNDAE1HEAD, new Item.Properties().group(omniig)).setRegistryName("sundae_1_head"),
				new BlockItem(ModBlocks.SUNDAE2HEAD, new Item.Properties().group(omniig)).setRegistryName("sundae_2_head"),
				new BlockItem(ModBlocks.SUNDAE3HEAD, new Item.Properties().group(omniig)).setRegistryName("sundae_3_head"),
				new BlockItem(ModBlocks.SUNDAE4HEAD, new Item.Properties().group(omniig)).setRegistryName("sundae_4_head"),
				new BlockItem(ModBlocks.SUNDAE5HEAD, new Item.Properties().group(omniig)).setRegistryName("sundae_5_head"),
				new BlockItem(ModBlocks.SUNDAE6HEAD, new Item.Properties().group(omniig)).setRegistryName("sundae_6_head"),
				new BlockItem(ModBlocks.SUNDAE7HEAD, new Item.Properties().group(omniig)).setRegistryName("sundae_7_head"),
				new BlockItem(ModBlocks.BABYBOY, new Item.Properties().group(omniig)).setRegistryName("baby_boy"),
				new BlockItem(ModBlocks.BABYGIRL, new Item.Properties().group(omniig)).setRegistryName("baby_girl"),
				new BlockItem(ModBlocks.SMALLREDSHROOM, new Item.Properties().group(omniig)).setRegistryName("small_red_shroom"),
				new BlockItem(ModBlocks.SMALLBROWNSHROOM, new Item.Properties().group(omniig)).setRegistryName("small_brown_shroom"),
				new BlockItem(ModBlocks.CARTWHEEL, new Item.Properties().group(omniig)).setRegistryName("cart_wheel"),
				new BlockItem(ModBlocks.BASKETAPPLE, new Item.Properties().group(omniig)).setRegistryName("basket_apple"),
				new BlockItem(ModBlocks.CCTV, new Item.Properties().group(omniig)).setRegistryName("cctv")
			);
		}
	}
}
