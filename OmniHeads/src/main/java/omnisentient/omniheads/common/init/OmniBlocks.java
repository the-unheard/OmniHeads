package omnisentient.omniheads.common.init;

import java.util.List;

import com.google.common.collect.Lists;

import net.minecraft.block.Block;
import net.minecraft.block.Block.Properties;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import omnisentient.omniheads.OmniHeads;
import omnisentient.omniheads.common.block.AlarmBlock;
import omnisentient.omniheads.common.block.BabyBlock;
import omnisentient.omniheads.common.block.BilliardBlock;
import omnisentient.omniheads.common.block.CartWheelBlock;
import omnisentient.omniheads.common.block.CctvBlock;
import omnisentient.omniheads.common.block.ClockBlock;
import omnisentient.omniheads.common.block.GumballBlock;
import omnisentient.omniheads.common.block.HalfBlock;
import omnisentient.omniheads.common.block.HeadRotationBlock;
import omnisentient.omniheads.common.block.HorizontalRotationBlock;
import omnisentient.omniheads.common.block.ImacBlock;
import omnisentient.omniheads.common.block.LaptopBlock;
import omnisentient.omniheads.common.block.MailboxBlock;
import omnisentient.omniheads.common.block.MicrowaveBlock;
import omnisentient.omniheads.common.block.PhoneBlock;
import omnisentient.omniheads.common.block.PillowBlock;
import omnisentient.omniheads.common.block.RodBlock;
import omnisentient.omniheads.common.block.SandcastleBlock;
import omnisentient.omniheads.common.block.ShroomBlock;
import omnisentient.omniheads.common.block.TableCoffeeBlock;
import omnisentient.omniheads.common.block.ToiletPaperBlock;

public final class OmniBlocks
{
	private OmniBlocks() {}

	public static final List<Block> BLOCKS = Lists.newArrayList();

	public static final Block
		BANDAGES_HEAD = add("bandages_head", OmniItems.MAIN_TAB, new HeadRotationBlock(Properties.create(Material.IRON).sound(SoundType.CLOTH))),
		BASKETBALL_HEAD = add("basketball_head", OmniItems.MAIN_TAB, new HeadRotationBlock(Properties.create(Material.IRON).sound(SoundType.LADDER))),
		BEACHBALL_HEAD = add("beachball_head", OmniItems.MAIN_TAB, new HeadRotationBlock(Properties.create(Material.IRON).sound(SoundType.LADDER))),
		BEEF_HEAD = add("beef_head", OmniItems.MAIN_TAB, new HeadRotationBlock(Properties.create(Material.IRON).sound(SoundType.CORAL))),
		BEENEST_HEAD = add("beenest_head", OmniItems.MAIN_TAB, new HeadRotationBlock(Properties.create(Material.IRON).sound(SoundType.CORAL))),
		BOOK_1_HEAD = add("book_1_head", OmniItems.MAIN_TAB, new HeadRotationBlock(Properties.create(Material.IRON).sound(SoundType.WOOD))),
		BOOK_2_HEAD = add("book_2_head", OmniItems.MAIN_TAB, new HeadRotationBlock(Properties.create(Material.IRON).sound(SoundType.WOOD))),
		BURGER_HEAD = add("burger_head", OmniItems.MAIN_TAB, new HeadRotationBlock(Properties.create(Material.IRON).sound(SoundType.CORAL))),
		CAKE1_HEAD = add("cake1_head", OmniItems.MAIN_TAB, new HeadRotationBlock(Properties.create(Material.IRON).sound(SoundType.SNOW))),
		CAKE2_HEAD = add("cake2_head", OmniItems.MAIN_TAB, new HeadRotationBlock(Properties.create(Material.IRON).sound(SoundType.SNOW))),
		CAKE3_HEAD = add("cake3_head", OmniItems.MAIN_TAB, new HeadRotationBlock(Properties.create(Material.IRON).sound(SoundType.SNOW))),
		CAKE4_HEAD = add("cake4_head", OmniItems.MAIN_TAB, new HeadRotationBlock(Properties.create(Material.IRON).sound(SoundType.SNOW))),
		CAKE5_HEAD = add("cake5_head", OmniItems.MAIN_TAB, new HeadRotationBlock(Properties.create(Material.IRON).sound(SoundType.SNOW))),
		CAKE6_HEAD = add("cake6_head", OmniItems.MAIN_TAB, new HeadRotationBlock(Properties.create(Material.IRON).sound(SoundType.SNOW))),
		CAKE7_HEAD = add("cake7_head", OmniItems.MAIN_TAB, new HeadRotationBlock(Properties.create(Material.IRON).sound(SoundType.SNOW))),
		CAKE8_HEAD = add("cake8_head", OmniItems.MAIN_TAB, new HeadRotationBlock(Properties.create(Material.IRON).sound(SoundType.SNOW))),
		CAKE9_HEAD = add("cake9_head", OmniItems.MAIN_TAB, new HeadRotationBlock(Properties.create(Material.IRON).sound(SoundType.SNOW))),
		CAKE10_HEAD = add("cake10_head", OmniItems.MAIN_TAB, new HeadRotationBlock(Properties.create(Material.IRON).sound(SoundType.SNOW))),
		CANDLE_CYAN_HEAD = add("candle_cyan_head", OmniItems.MAIN_TAB, new HeadRotationBlock(Properties.create(Material.IRON).sound(SoundType.NETHER_WART).lightValue(15))),
		CANDLE_PINK_HEAD = add("candle_pink_head", OmniItems.MAIN_TAB, new HeadRotationBlock(Properties.create(Material.IRON).sound(SoundType.NETHER_WART).lightValue(15))),
		CANDLE_WHITE_HEAD = add("candle_white_head", OmniItems.MAIN_TAB, new HeadRotationBlock(Properties.create(Material.IRON).sound(SoundType.NETHER_WART).lightValue(15))),
		CAR_AMBULANCE_HEAD = add("car_ambulance_head", OmniItems.MAIN_TAB, new HeadRotationBlock(Properties.create(Material.IRON).sound(SoundType.METAL))),
		CAR_FIRETRUCK_HEAD = add("car_firetruck_head", OmniItems.MAIN_TAB, new HeadRotationBlock(Properties.create(Material.IRON).sound(SoundType.METAL))),
		CAR_POLICE_HEAD = add("car_police_head", OmniItems.MAIN_TAB, new HeadRotationBlock(Properties.create(Material.IRON).sound(SoundType.METAL))),
		CAR_RANGER_HEAD = add("car_ranger_head", OmniItems.MAIN_TAB, new HeadRotationBlock(Properties.create(Material.IRON).sound(SoundType.METAL))),
		CAR_TRUCK_HEAD = add("car_truck_head", OmniItems.MAIN_TAB, new HeadRotationBlock(Properties.create(Material.IRON).sound(SoundType.METAL))),
		CHEST_HEAD = add("chest_head", OmniItems.MAIN_TAB, new HeadRotationBlock(Properties.create(Material.IRON).sound(SoundType.WOOD))),
		COMPUTER_HEAD = add("computer_head", OmniItems.MAIN_TAB, new HeadRotationBlock(Properties.create(Material.IRON).sound(SoundType.GLASS))),
		COCONUT_HEAD = add("coconut_head", OmniItems.MAIN_TAB, new HeadRotationBlock(Properties.create(Material.IRON).sound(SoundType.STEM))),
		CRAYONS_HEAD = add("crayons_head", OmniItems.MAIN_TAB, new HeadRotationBlock(Properties.create(Material.IRON).sound(SoundType.NETHER_WART))),
		FIRSTAID_HEAD = add("firstaid_head", OmniItems.MAIN_TAB, new HeadRotationBlock(Properties.create(Material.IRON).sound(SoundType.WOOD))),
		FISH_HEAD_HEAD = add("fish_head_head", OmniItems.MAIN_TAB, new HeadRotationBlock(Properties.create(Material.IRON).sound(SoundType.SLIME))),
		FISH_BODY_HEAD = add("fish_body_head", OmniItems.MAIN_TAB, new HeadRotationBlock(Properties.create(Material.IRON).sound(SoundType.SLIME))),
		FISH_TAIL_HEAD = add("fish_tail_head", OmniItems.MAIN_TAB, new HeadRotationBlock(Properties.create(Material.IRON).sound(SoundType.SLIME))),
		FLOUR_HEAD = add("flour_head", OmniItems.MAIN_TAB, new HeadRotationBlock(Properties.create(Material.IRON).sound(SoundType.SAND))),
		FOODBASKET_HEAD = add("foodbasket_head", OmniItems.MAIN_TAB, new HeadRotationBlock(Properties.create(Material.IRON).sound(SoundType.WOOD))),
		FRIES_HEAD = add("fries_head", OmniItems.MAIN_TAB, new HeadRotationBlock(Properties.create(Material.IRON).sound(SoundType.BAMBOO_SAPLING))),
		GAUZE_HEAD = add("gauze_head", OmniItems.MAIN_TAB, new HeadRotationBlock(Properties.create(Material.IRON).sound(SoundType.CLOTH))),
		HAM_HEAD = add("ham_head", OmniItems.MAIN_TAB, new HeadRotationBlock(Properties.create(Material.IRON).sound(SoundType.CORAL))),
		HAPPYMEAL_HEAD = add("happymeal_head", OmniItems.MAIN_TAB, new HeadRotationBlock(Properties.create(Material.IRON).sound(SoundType.WOOD))),
		HEARTRATE_HEAD = add("heartrate_head", OmniItems.MAIN_TAB, new HeadRotationBlock(Properties.create(Material.IRON).sound(SoundType.GLASS))),
		HONEYPOT_HEAD = add("honeypot_head", OmniItems.MAIN_TAB, new HeadRotationBlock(Properties.create(Material.IRON).sound(SoundType.GLASS))),
		LANTERN1_HEAD = add("lantern1_head", OmniItems.MAIN_TAB, new HeadRotationBlock(Properties.create(Material.IRON).sound(SoundType.LANTERN).lightValue(15))),
		LANTERN2_HEAD = add("lantern2_head", OmniItems.MAIN_TAB, new HeadRotationBlock(Properties.create(Material.IRON).sound(SoundType.LANTERN).lightValue(15))),
		NAPKIN_HEAD = add("napkin_head", OmniItems.MAIN_TAB, new HeadRotationBlock(Properties.create(Material.IRON).sound(SoundType.CLOTH))),
		NEWSPAPERS_HEAD = add("newspapers_head", OmniItems.MAIN_TAB, new HeadRotationBlock(Properties.create(Material.IRON).sound(SoundType.WOOD))),
		PANCAKE_HEAD = add("pancake_head", OmniItems.MAIN_TAB, new HeadRotationBlock(Properties.create(Material.IRON).sound(SoundType.CORAL))),
		PLATES_HEAD = add("plates_head", OmniItems.MAIN_TAB, new HeadRotationBlock(Properties.create(Material.IRON).sound(SoundType.GLASS))),
		POTTED_FLOWER_HEAD = add("potted_flower_head", OmniItems.MAIN_TAB, new HeadRotationBlock(Properties.create(Material.IRON).sound(SoundType.GLASS))),
		SHIRTS1_HEAD = add("shirts1_head", OmniItems.MAIN_TAB, new HeadRotationBlock(Properties.create(Material.IRON).sound(SoundType.CLOTH))),
		SHIRTS2_HEAD = add("shirts2_head", OmniItems.MAIN_TAB, new HeadRotationBlock(Properties.create(Material.IRON).sound(SoundType.CLOTH))),
		SHIRTS3_HEAD = add("shirts3_head", OmniItems.MAIN_TAB, new HeadRotationBlock(Properties.create(Material.IRON).sound(SoundType.CLOTH))),
		SLICEDBREAD_HEAD = add("slicedbread_head", OmniItems.MAIN_TAB, new HeadRotationBlock(Properties.create(Material.IRON).sound(SoundType.CLOTH))),
		SUNDAE_1_HEAD = add("sundae_1_head", OmniItems.MAIN_TAB, new HeadRotationBlock(Properties.create(Material.IRON).sound(SoundType.SNOW))),
		SUNDAE_2_HEAD = add("sundae_2_head", OmniItems.MAIN_TAB, new HeadRotationBlock(Properties.create(Material.IRON).sound(SoundType.SNOW))),
		SUNDAE_3_HEAD = add("sundae_3_head", OmniItems.MAIN_TAB, new HeadRotationBlock(Properties.create(Material.IRON).sound(SoundType.SNOW))),
		SUNDAE_4_HEAD = add("sundae_4_head", OmniItems.MAIN_TAB, new HeadRotationBlock(Properties.create(Material.IRON).sound(SoundType.SNOW))),
		SUNDAE_5_HEAD = add("sundae_5_head", OmniItems.MAIN_TAB, new HeadRotationBlock(Properties.create(Material.IRON).sound(SoundType.SNOW))),
		SUNDAE_6_HEAD = add("sundae_6_head", OmniItems.MAIN_TAB, new HeadRotationBlock(Properties.create(Material.IRON).sound(SoundType.SNOW))),
		SUNDAE_7_HEAD = add("sundae_7_head", OmniItems.MAIN_TAB, new HeadRotationBlock(Properties.create(Material.IRON).sound(SoundType.SNOW))),
		SUPPLIES1_HEAD = add("supplies1_head", OmniItems.MAIN_TAB, new HeadRotationBlock(Properties.create(Material.IRON).sound(SoundType.WOOD))),
		SUPPLIES2_HEAD = add("supplies2_head", OmniItems.MAIN_TAB, new HeadRotationBlock(Properties.create(Material.IRON).sound(SoundType.WOOD))),
		TISSUE_HEAD = add("tissue_head", OmniItems.MAIN_TAB, new HeadRotationBlock(Properties.create(Material.IRON).sound(SoundType.WOOD))),	
		TOASTER_HEAD = add("toaster_head", OmniItems.MAIN_TAB, new HeadRotationBlock(Properties.create(Material.IRON).sound(SoundType.METAL))),
		TOWEL_HEAD = add("towel_head", OmniItems.MAIN_TAB, new HeadRotationBlock(Properties.create(Material.IRON).sound(SoundType.CLOTH))),
		TURKEY_HEAD = add("turkey_head", OmniItems.MAIN_TAB, new HeadRotationBlock(Properties.create(Material.IRON).sound(SoundType.CORAL))),
		
		BABY_BOY = add("baby_boy", OmniItems.OTHERS_TAB, new BabyBlock(Properties.create(Material.IRON).sound(SoundType.CORAL))),
		BABY_GIRL = add("baby_girl", OmniItems.OTHERS_TAB, new BabyBlock(Properties.create(Material.IRON).sound(SoundType.CORAL))),
		BABY_BOY_2 = add("baby_boy_2", OmniItems.OTHERS_TAB, new BabyBlock(Properties.create(Material.IRON).sound(SoundType.CORAL))),
		BABY_GIRL_2 = add("baby_girl_2", OmniItems.OTHERS_TAB, new BabyBlock(Properties.create(Material.IRON).sound(SoundType.CORAL))),
		BABY_BOY_3 = add("baby_boy_3", OmniItems.OTHERS_TAB, new BabyBlock(Properties.create(Material.IRON).sound(SoundType.CORAL))),
		BABY_GIRL_3 = add("baby_girl_3", OmniItems.OTHERS_TAB, new BabyBlock(Properties.create(Material.IRON).sound(SoundType.CORAL))),
		
		BILLIARD_BLACK = add("billiard_black", OmniItems.OTHERS_TAB, new BilliardBlock(Properties.create(Material.IRON).sound(SoundType.STONE))),
		BILLIARD_LIGHT_BLUE = add("billiard_light_blue", OmniItems.OTHERS_TAB, new BilliardBlock(Properties.create(Material.IRON).sound(SoundType.STONE))),
		BILLIARD_LIME = add("billiard_lime", OmniItems.OTHERS_TAB, new BilliardBlock(Properties.create(Material.IRON).sound(SoundType.STONE))),
		BILLIARD_MAGENTA = add("billiard_magenta", OmniItems.OTHERS_TAB, new BilliardBlock(Properties.create(Material.IRON).sound(SoundType.STONE))),
		BILLIARD_RED = add("billiard_red", OmniItems.OTHERS_TAB, new BilliardBlock(Properties.create(Material.IRON).sound(SoundType.STONE))),
		BILLIARD_WHITE = add("billiard_white", OmniItems.OTHERS_TAB, new BilliardBlock(Properties.create(Material.IRON).sound(SoundType.STONE))),
		BILLIARD_YELLOW = add("billiard_yellow", OmniItems.OTHERS_TAB, new BilliardBlock(Properties.create(Material.IRON).sound(SoundType.STONE))),
		BILLIARD_ORANGE = add("billiard_orange", OmniItems.OTHERS_TAB, new BilliardBlock(Properties.create(Material.IRON).sound(SoundType.STONE))),
				
		SMALL_RED_SHROOM = add("small_red_shroom", OmniItems.OTHERS_TAB, new ShroomBlock(Properties.create(Material.IRON).sound(SoundType.BAMBOO_SAPLING))),
		SMALL_BROWN_SHROOM = add("small_brown_shroom", OmniItems.OTHERS_TAB, new ShroomBlock(Properties.create(Material.IRON).sound(SoundType.BAMBOO_SAPLING))),
		
		ALARM_CYAN = add("alarm_cyan", OmniItems.OTHERS_TAB, new AlarmBlock(Properties.create(Material.IRON).sound(SoundType.STONE))),
		ALARM_GRAY = add("alarm_gray", OmniItems.OTHERS_TAB, new AlarmBlock(Properties.create(Material.IRON).sound(SoundType.STONE))),
		ALARM_WHITE = add("alarm_white", OmniItems.OTHERS_TAB, new AlarmBlock(Properties.create(Material.IRON).sound(SoundType.STONE))),
		
		BASKET_GOLDAPPLE = add("basket_goldapple", OmniItems.OTHERS_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.WOOD))),
		BASKET_GREENAPPLE = add("basket_greenapple", OmniItems.OTHERS_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.WOOD))),
		BASKET_ORANGE = add("basket_orange", OmniItems.OTHERS_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.WOOD))),
		BASKET_PLUM = add("basket_plum", OmniItems.OTHERS_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.WOOD))),
		BASKET_REDAPPLE = add("basket_apple", OmniItems.OTHERS_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.WOOD))),
		
		BOOKSHELF = add("bookshelf", OmniItems.OTHERS_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.WOOD))),
		BOOKSHELF_HALF = add("bookshelf_half", OmniItems.OTHERS_TAB, new HalfBlock(Properties.create(Material.IRON).sound(SoundType.WOOD))),
		CART_WHEEL = add("cart_wheel", OmniItems.OTHERS_TAB, new CartWheelBlock(Properties.create(Material.IRON).sound(SoundType.WOOD))),
		CCTV = add("cctv", OmniItems.OTHERS_TAB, new CctvBlock(Properties.create(Material.IRON).sound(SoundType.STONE))),
		
		CLOCK_CYAN = add("clock_cyan", OmniItems.OTHERS_TAB, new ClockBlock(Properties.create(Material.IRON).sound(SoundType.GLASS))),
		CLOCK_GRAY = add("clock_gray", OmniItems.OTHERS_TAB, new ClockBlock(Properties.create(Material.IRON).sound(SoundType.GLASS))),
		CLOCK_WHITE = add("clock_white", OmniItems.OTHERS_TAB, new ClockBlock(Properties.create(Material.IRON).sound(SoundType.GLASS))),
		
		DRAWER_A_CYAN = add("drawer_a_cyan", OmniItems.OTHERS_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.WOOD))),
		DRAWER_A_GRAY = add("drawer_a_gray", OmniItems.OTHERS_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.WOOD))),
		DRAWER_A_WHITE = add("drawer_a_white", OmniItems.OTHERS_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.WOOD))),
		
		DRAWER_B_CYAN = add("drawer_b_cyan", OmniItems.OTHERS_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.WOOD))),
		DRAWER_B_GRAY = add("drawer_b_gray", OmniItems.OTHERS_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.WOOD))),
		DRAWER_B_WHITE = add("drawer_b_white", OmniItems.OTHERS_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.WOOD))),
		
		GUMBALL_CYAN = add("gumball_cyan", OmniItems.OTHERS_TAB, new GumballBlock(Properties.create(Material.IRON).sound(SoundType.GLASS))),
		GUMBALL_RED = add("gumball_red", OmniItems.OTHERS_TAB, new GumballBlock(Properties.create(Material.IRON).sound(SoundType.GLASS))),
		
		IMAC = add("imac", OmniItems.OTHERS_TAB, new ImacBlock(Properties.create(Material.IRON).sound(SoundType.STONE))),
		LAPTOP = add("laptop", OmniItems.OTHERS_TAB, new LaptopBlock(Properties.create(Material.IRON).sound(SoundType.STONE))),
		MAILBOX = add("mailbox", OmniItems.OTHERS_TAB, new MailboxBlock(Properties.create(Material.IRON).sound(SoundType.WOOD))),
		MICROWAVE = add("microwave", OmniItems.OTHERS_TAB, new MicrowaveBlock(Properties.create(Material.IRON).sound(SoundType.GLASS))),
		MICROWAVE_BLACK = add("microwave_black", OmniItems.OTHERS_TAB, new MicrowaveBlock(Properties.create(Material.IRON).sound(SoundType.GLASS))),
		
		FRUIT_GOLDAPPLE = add("fruit_goldapple", OmniItems.OTHERS_TAB, new HeadRotationBlock(Properties.create(Material.IRON).sound(SoundType.WOOD))),
		FRUIT_GREENAPPLE = add("fruit_greenapple", OmniItems.OTHERS_TAB, new HeadRotationBlock(Properties.create(Material.IRON).sound(SoundType.WOOD))),
		FRUIT_ORANGE = add("fruit_orange", OmniItems.OTHERS_TAB, new HeadRotationBlock(Properties.create(Material.IRON).sound(SoundType.WOOD))),
		FRUIT_PLUM = add("fruit_plum", OmniItems.OTHERS_TAB, new HeadRotationBlock(Properties.create(Material.IRON).sound(SoundType.WOOD))),
		FRUIT_REDAPPLE = add("fruit_redapple", OmniItems.OTHERS_TAB, new HeadRotationBlock(Properties.create(Material.IRON).sound(SoundType.WOOD))),
		
		PHONE = add("phone", OmniItems.OTHERS_TAB, new PhoneBlock(Properties.create(Material.IRON).sound(SoundType.WOOD))),
		
		PILLOW_CYAN = add("pillow_cyan", OmniItems.OTHERS_TAB, new PillowBlock(Properties.create(Material.IRON).sound(SoundType.CLOTH))),
		PILLOW_GRAY = add("pillow_gray", OmniItems.OTHERS_TAB, new PillowBlock(Properties.create(Material.IRON).sound(SoundType.CLOTH))),
		PILLOW_WHITE = add("pillow_white", OmniItems.OTHERS_TAB, new PillowBlock(Properties.create(Material.IRON).sound(SoundType.CLOTH))),
		
		ROD_BLACK = add("rod_black", OmniItems.OTHERS_TAB, new RodBlock(Properties.create(Material.IRON).sound(SoundType.STONE))),
		ROD_WHITE = add("rod_white", OmniItems.OTHERS_TAB, new RodBlock(Properties.create(Material.IRON).sound(SoundType.STONE))),
		ROD_GRAY = add("rod_gray", OmniItems.OTHERS_TAB, new RodBlock(Properties.create(Material.IRON).sound(SoundType.STONE))),
		ROD_LIGHT_GRAY = add("rod_light_gray", OmniItems.OTHERS_TAB, new RodBlock(Properties.create(Material.IRON).sound(SoundType.STONE))),
		ROD_OAK = add("rod_oak", OmniItems.OTHERS_TAB, new RodBlock(Properties.create(Material.IRON).sound(SoundType.WOOD))),
		ROD_BIRCH = add("rod_birch", OmniItems.OTHERS_TAB, new RodBlock(Properties.create(Material.IRON).sound(SoundType.WOOD))),
		ROD_SPRUCE = add("rod_spruce", OmniItems.OTHERS_TAB, new RodBlock(Properties.create(Material.IRON).sound(SoundType.WOOD))),
		ROD_DARK_OAK = add("rod_dark_oak", OmniItems.OTHERS_TAB, new RodBlock(Properties.create(Material.IRON).sound(SoundType.WOOD))),
		ROD_ACACIA = add("rod_acacia", OmniItems.OTHERS_TAB, new RodBlock(Properties.create(Material.IRON).sound(SoundType.WOOD))),	
		ROD_JUNGLE = add("rod_jungle", OmniItems.OTHERS_TAB, new RodBlock(Properties.create(Material.IRON).sound(SoundType.WOOD))),
		
		SANDCASTLE = add("sandcastle", OmniItems.OTHERS_TAB, new SandcastleBlock(Properties.create(Material.IRON).sound(SoundType.SAND))),
		
		TABLE_COFFEE = add("table_coffee", OmniItems.OTHERS_TAB, new TableCoffeeBlock(Properties.create(Material.IRON).sound(SoundType.GLASS))),
		TOILET_PAPER = add("toilet_paper", OmniItems.OTHERS_TAB, new ToiletPaperBlock(Properties.create(Material.IRON).sound(SoundType.STONE)));
			

	public static void register(RegistryEvent.Register<Block> event)
	{
		for(Block block : BLOCKS)
			event.getRegistry().register(block);
	}

	public static Block add(String name, ItemGroup group, Block block)
	{
		BLOCKS.add(block.setRegistryName(new ResourceLocation(OmniHeads.ID, name)));
		OmniItems.add(new BlockItem(block, new Item.Properties().group(group)));
		return block;
	}
}