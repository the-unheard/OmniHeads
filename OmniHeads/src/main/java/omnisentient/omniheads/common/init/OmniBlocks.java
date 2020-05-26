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
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraftforge.event.RegistryEvent;
import omnisentient.omniheads.OmniHeads;
import omnisentient.omniheads.common.block.CartWheelBlock;
import omnisentient.omniheads.common.block.CctvBlock;
import omnisentient.omniheads.common.block.DoubleHRBlock;
import omnisentient.omniheads.common.block.DoubleSeatBlock;
import omnisentient.omniheads.common.block.HeadRotationBlock;
import omnisentient.omniheads.common.block.HorizontalRotationBlock;
import omnisentient.omniheads.common.block.SeatBlock;
import omnisentient.omniheads.common.block.ShroomBlock;
import omnisentient.omniheads.common.block.ToggleableHRBlock;
import omnisentient.omniheads.common.block.TranslucentHRBlock;
import omnisentient.omniheads.common.block.TranslucentSeatBlock;

public final class OmniBlocks
{
	private OmniBlocks() {}
	
	// VoxelShapes
	private static VoxelShape alarmShape = Block.makeCuboidShape(5d, 0d, 7d, 11d, 2d, 10d);
	private static VoxelShape babyShape = Block.makeCuboidShape(4d, 0d, 0d, 12d, 8d, 16d);
	private static VoxelShape barcartShape = VoxelShapes.or(Block.makeCuboidShape(0.75d, 2.75d, 0d, 15.25d, 5d, 13d), Block.makeCuboidShape(0.75d, 14.75d, 0d, 15.25d, 17d, 13d));
	private static VoxelShape bathtubShape = VoxelShapes.or(Block.makeCuboidShape(0d, 0d, 14d, 16d, 11.75d, 16d), Block.makeCuboidShape(0d, 0d, 0d, 2d, 11.75d, 16d), Block.makeCuboidShape(14d, 0d, 0d, 16d, 11.75d, 16d));
	private static VoxelShape bedrailsideShape = Block.makeCuboidShape(0d, 0d, 8d, 16d, 8d, 16d);
	private static VoxelShape bedrailcornerShape = Block.makeCuboidShape(0d, 0d, 8d, 8d, 8d, 16d);
	private static VoxelShape billiardShape = Block.makeCuboidShape(6d, 0d, 6d, 10d, 4d, 10d);
	private static VoxelShape binbathroomShape = Block.makeCuboidShape(4.25d, 0d, 4d, 11.75d, 12d, 11.75d);
	private static VoxelShape binkitchenShape = Block.makeCuboidShape(2.5d, 0d, 5d, 13.5d, 14.5d, 13d);
	private static VoxelShape binofficeShape = Block.makeCuboidShape(4d, 0d, 5d, 12d, 11d, 11d);
	private static VoxelShape blanketShape = Block.makeCuboidShape(0d, 0d, 0d, 16d, 2d, 16d);
	private static VoxelShape blanketfootShape = Block.makeCuboidShape(0d, 0d, 14d, 16d, 2d, 16d);
	private static VoxelShape blenderShape = VoxelShapes.or(Block.makeCuboidShape(5.25d, 0d, 5d, 10.75d, 3d, 7d), Block.makeCuboidShape(5.25d, 0d, 7d, 10.75d, 11d, 12d));
	private static VoxelShape chairdiningShape = Block.makeCuboidShape(2d, 0d, 4d, 14d, 9d, 16d);
	private static VoxelShape chairdressingShape = Block.makeCuboidShape(2.25d, 0d, 6.5d, 13.75d, 9d, 14d);
	private static VoxelShape clockShape = Block.makeCuboidShape(0d, 0d, 14d, 16d, 16d, 16d);
	private static VoxelShape diningtableShape = VoxelShapes.or(Block.makeCuboidShape(0d, 15d, 0d, 16d, 16d, 16d), Block.makeCuboidShape(0d, 0d, 10d, 16d, 15d, 16d));
	private static VoxelShape diningtablebShape = VoxelShapes.or(Block.makeCuboidShape(0d, 15d, 0d, 16d, 16d, 16d), Block.makeCuboidShape(6d, 0d, 8d, 10d, 15d, 16d));
	private static VoxelShape dogbowlShape = Block.makeCuboidShape(1d, 0d, 4d, 15d, 3d, 12d);
	private static VoxelShape drawerhalfShape = Block.makeCuboidShape(0d, 11d, 0.5d, 16d, 16d, 16d);
	private static VoxelShape frameShape = Block.makeCuboidShape(3d, 0d, 5d, 13d, 7.75d, 9d);
	private static VoxelShape gumballShape = Block.makeCuboidShape(2d, 0d, 2d, 14d, 13d, 14d);
	private static VoxelShape imacShape = VoxelShapes.or(Block.makeCuboidShape(5d, 0d, 4d, 14d, 0.2d, 8d), Block.makeCuboidShape(0d, 0d, 9d, 16d, 14d, 14d));
	private static VoxelShape monitorsShape = VoxelShapes.or(Block.makeCuboidShape(4d, 0d, 4d, 15d, 0.3d, 8d), Block.makeCuboidShape(0.4d, 4d, 13d, 16.09d, 13.6d, 13.5d));
	private static VoxelShape microwaveShape = Block.makeCuboidShape(1d, 0d, 4d, 15d, 8d, 15d);
	private static VoxelShape officetableShape = VoxelShapes.or(Block.makeCuboidShape(0d, 15d, 0d, 16d, 16d, 16d), Block.makeCuboidShape(0d, 0d, 0d, 16d, 14d, 16d));
	private static VoxelShape officetrayShape = VoxelShapes.or(Block.makeCuboidShape(4d, 0d, 3d, 12d, 4d, 13d), Block.makeCuboidShape(4d, 4d, 8d, 12d, 7d, 13d));
	private static VoxelShape pillowShape = Block.makeCuboidShape(2d, 0d, 3d, 14d, 2d, 13d);
	private static VoxelShape rodShape = Block.makeCuboidShape(7d, 0d, 7d, 9d, 16d, 9d);
	private static VoxelShape slabShape = Block.makeCuboidShape(0d, 0d, 0d, 16d, 6d, 16d);
	private static VoxelShape stairShape = VoxelShapes.or(Block.makeCuboidShape(0d, 0d, 0d, 16d, 8d, 8d), Block.makeCuboidShape(0d, 0d, 8d, 16d, 16d, 16d));
	private static VoxelShape modernstairShape = VoxelShapes.or(Block.makeCuboidShape(0d, 6.5d, 0d, 16d, 8d, 8d), Block.makeCuboidShape(0d, 14.5d, 8d, 16d, 16d, 16d));
	private static VoxelShape systemunitShape = Block.makeCuboidShape(4d, 0d, 0d, 12d, 16d, 16d);
	private static VoxelShape tabletopShape = Block.makeCuboidShape(0d, 15d, 0d, 16d, 16d, 16d);
	private static VoxelShape thinwallShape = Block.makeCuboidShape(0d, 0d, 14d, 16d, 16d, 16d);
	private static VoxelShape toiletShape = VoxelShapes.or(Block.makeCuboidShape(5d, 2d, 6d, 11d, 5d, 16d), Block.makeCuboidShape(3d, 5d, 3d, 13d, 8.5d, 16d));
	private static VoxelShape toiletbrushShape = VoxelShapes.or(Block.makeCuboidShape(6d, 0d, 10d, 10d, 6d, 14d), Block.makeCuboidShape(7.5d, 6d, 11.5d, 8.5d, 13.25d, 12.5d));
	private static VoxelShape verticalslabShape = Block.makeCuboidShape(0d, 0d, 8d, 16d, 16d, 16d);
	private static VoxelShape wallshelvesShape = VoxelShapes.or(Block.makeCuboidShape(0d, 0d, 0d, 16d, 1d, 16d), Block.makeCuboidShape(3d, 0d, 5d, 13d, 8d, 10d));
	private static VoxelShape toolsShape = Block.makeCuboidShape(0d, 0d, 15d, 16d, 16d, 16d);
	
	public static final List<Block> BLOCKS = Lists.newArrayList(); 

	public static final Block 
	
		// HEADS
	
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
		
		// BEDROOM
		
		ALARM_CYAN = add("alarm_cyan", OmniItems.BEDROOM_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.STONE), alarmShape)),
		ALARM_GRAY = add("alarm_gray", OmniItems.BEDROOM_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.STONE), alarmShape)),
		ALARM_WHITE = add("alarm_white", OmniItems.BEDROOM_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.STONE), alarmShape)),
		CLOCK_CYAN = add("clock_cyan", OmniItems.BEDROOM_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.GLASS), clockShape)),
		CLOCK_GRAY = add("clock_gray", OmniItems.BEDROOM_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.GLASS), clockShape)),
		CLOCK_WHITE = add("clock_white", OmniItems.BEDROOM_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.GLASS), clockShape)),
		PILLOW_CYAN = add("pillow_cyan", OmniItems.BEDROOM_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.CLOTH), pillowShape)),
		PILLOW_GRAY = add("pillow_gray", OmniItems.BEDROOM_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.CLOTH), pillowShape)),
		PILLOW_WHITE = add("pillow_white", OmniItems.BEDROOM_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.CLOTH), pillowShape)),
		REMOTE = add("remote", OmniItems.BEDROOM_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.STONE), Block.makeCuboidShape(7d, 0d, 4.5d, 9d, 0.25d, 11.5d))),
		BEDRAILSIDE_ACACIA = add("bedrailside_acacia", OmniItems.BEDROOM_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.WOOD), bedrailsideShape)),
		BEDRAILSIDE_BIRCH = add("bedrailside_birch", OmniItems.BEDROOM_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.WOOD), bedrailsideShape)),
		BEDRAILSIDE_BLACK = add("bedrailside_black", OmniItems.BEDROOM_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.STONE), bedrailsideShape)),
		BEDRAILSIDE_DARKOAK = add("bedrailside_darkoak", OmniItems.BEDROOM_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.WOOD), bedrailsideShape)),
		BEDRAILSIDE_JUNGLE = add("bedrailside_jungle", OmniItems.BEDROOM_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.WOOD), bedrailsideShape)),
		BEDRAILSIDE_OAK = add("bedrailside_oak", OmniItems.BEDROOM_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.WOOD), bedrailsideShape)),
		BEDRAILSIDE_SPRUCE = add("bedrailside_spruce", OmniItems.BEDROOM_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.WOOD), bedrailsideShape)),
		BEDRAILSIDE_WHITE = add("bedrailside_white", OmniItems.BEDROOM_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.STONE), bedrailsideShape)),
		BEDRAILCORNER_ACACIA = add("bedrailcorner_acacia", OmniItems.BEDROOM_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.WOOD), bedrailcornerShape)),
		BEDRAILCORNER_BIRCH = add("bedrailcorner_birch", OmniItems.BEDROOM_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.WOOD), bedrailcornerShape)),
		BEDRAILCORNER_BLACK = add("bedrailcorner_black", OmniItems.BEDROOM_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.WOOD), bedrailcornerShape)),
		BEDRAILCORNER_DARKOAK = add("bedrailcorner_darkoak", OmniItems.BEDROOM_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.WOOD), bedrailcornerShape)),
		BEDRAILCORNER_JUNGLE = add("bedrailcorner_jungle", OmniItems.BEDROOM_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.WOOD), bedrailcornerShape)),
		BEDRAILCORNER_OAK = add("bedrailcorner_oak", OmniItems.BEDROOM_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.WOOD), bedrailcornerShape)),
		BEDRAILCORNER_SPRUCE = add("bedrailcorner_spruce", OmniItems.BEDROOM_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.WOOD), bedrailcornerShape)),
		BEDRAILCORNER_WHITE = add("bedrailcorner_white", OmniItems.BEDROOM_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.WOOD), bedrailcornerShape)),
		BLANKET_BLACK = add("blanket_black", OmniItems.BEDROOM_TAB, new SeatBlock(Properties.create(Material.IRON).sound(SoundType.CLOTH), blanketShape, new Vec3d(0.5d, -0.2d, 0.5d))),
		BLANKET_BLUE = add("blanket_blue", OmniItems.BEDROOM_TAB, new SeatBlock(Properties.create(Material.IRON).sound(SoundType.CLOTH), blanketShape, new Vec3d(0.5d, -0.2d, 0.5d))),
		BLANKET_BROWN = add("blanket_brown", OmniItems.BEDROOM_TAB, new SeatBlock(Properties.create(Material.IRON).sound(SoundType.CLOTH), blanketShape, new Vec3d(0.5d, -0.2d, 0.5d))),
		BLANKET_CYAN = add("blanket_cyan", OmniItems.BEDROOM_TAB, new SeatBlock(Properties.create(Material.IRON).sound(SoundType.CLOTH), blanketShape, new Vec3d(0.5d, -0.2d, 0.5d))),
		BLANKET_GRAY = add("blanket_gray", OmniItems.BEDROOM_TAB, new SeatBlock(Properties.create(Material.IRON).sound(SoundType.CLOTH), blanketShape, new Vec3d(0.5d, -0.2d, 0.5d))),
		BLANKET_GREEN = add("blanket_green", OmniItems.BEDROOM_TAB, new SeatBlock(Properties.create(Material.IRON).sound(SoundType.CLOTH), blanketShape, new Vec3d(0.5d, -0.2d, 0.5d))),
		BLANKET_LIGHTBLUE = add("blanket_lightblue", OmniItems.BEDROOM_TAB, new SeatBlock(Properties.create(Material.IRON).sound(SoundType.CLOTH), blanketShape, new Vec3d(0.5d, -0.2d, 0.5d))),
		BLANKET_LIGHTGRAY = add("blanket_lightgray", OmniItems.BEDROOM_TAB, new SeatBlock(Properties.create(Material.IRON).sound(SoundType.CLOTH), blanketShape, new Vec3d(0.5d, -0.2d, 0.5d))),
		BLANKET_LIME = add("blanket_lime", OmniItems.BEDROOM_TAB, new SeatBlock(Properties.create(Material.IRON).sound(SoundType.CLOTH), blanketShape, new Vec3d(0.5d, -0.2d, 0.5d))),
		BLANKET_MAGENTA = add("blanket_magenta", OmniItems.BEDROOM_TAB, new SeatBlock(Properties.create(Material.IRON).sound(SoundType.CLOTH), blanketShape, new Vec3d(0.5d, -0.2d, 0.5d))),
		BLANKET_ORANGE = add("blanket_orange", OmniItems.BEDROOM_TAB, new SeatBlock(Properties.create(Material.IRON).sound(SoundType.CLOTH), blanketShape, new Vec3d(0.5d, -0.2d, 0.5d))),
		BLANKET_PINK = add("blanket_pink", OmniItems.BEDROOM_TAB, new SeatBlock(Properties.create(Material.IRON).sound(SoundType.CLOTH), blanketShape, new Vec3d(0.5d, -0.2d, 0.5d))),
		BLANKET_PURPLE = add("blanket_purple", OmniItems.BEDROOM_TAB, new SeatBlock(Properties.create(Material.IRON).sound(SoundType.CLOTH), blanketShape, new Vec3d(0.5d, -0.2d, 0.5d))),
		BLANKET_RED = add("blanket_red", OmniItems.BEDROOM_TAB, new SeatBlock(Properties.create(Material.IRON).sound(SoundType.CLOTH), blanketShape, new Vec3d(0.5d, -0.2d, 0.5d))),
		BLANKET_WHITE = add("blanket_white", OmniItems.BEDROOM_TAB, new SeatBlock(Properties.create(Material.IRON).sound(SoundType.CLOTH), blanketShape, new Vec3d(0.5d, -0.2d, 0.5d))),
		BLANKET_YELLOW = add("blanket_yellow", OmniItems.BEDROOM_TAB, new SeatBlock(Properties.create(Material.IRON).sound(SoundType.CLOTH), blanketShape, new Vec3d(0.5d, -0.2d, 0.5d))),
		BLANKET_EDGE_BLACK = add("blanket_edge_black", OmniItems.BEDROOM_TAB, new SeatBlock(Properties.create(Material.IRON).sound(SoundType.CLOTH), blanketShape, new Vec3d(0.5d, -0.2d, 0.5d))),
		BLANKET_EDGE_BLUE = add("blanket_edge_blue", OmniItems.BEDROOM_TAB, new SeatBlock(Properties.create(Material.IRON).sound(SoundType.CLOTH), blanketShape, new Vec3d(0.5d, -0.2d, 0.5d))),
		BLANKET_EDGE_BROWN = add("blanket_edge_brown", OmniItems.BEDROOM_TAB, new SeatBlock(Properties.create(Material.IRON).sound(SoundType.CLOTH), blanketShape, new Vec3d(0.5d, -0.2d, 0.5d))),
		BLANKET_EDGE_CYAN = add("blanket_edge_cyan", OmniItems.BEDROOM_TAB, new SeatBlock(Properties.create(Material.IRON).sound(SoundType.CLOTH), blanketShape, new Vec3d(0.5d, -0.2d, 0.5d))),
		BLANKET_EDGE_GRAY = add("blanket_edge_gray", OmniItems.BEDROOM_TAB, new SeatBlock(Properties.create(Material.IRON).sound(SoundType.CLOTH), blanketShape, new Vec3d(0.5d, -0.2d, 0.5d))),
		BLANKET_EDGE_GREEN = add("blanket_edge_green", OmniItems.BEDROOM_TAB, new SeatBlock(Properties.create(Material.IRON).sound(SoundType.CLOTH), blanketShape, new Vec3d(0.5d, -0.2d, 0.5d))),
		BLANKET_EDGE_LIGHTBLUE = add("blanket_edge_lightblue", OmniItems.BEDROOM_TAB, new SeatBlock(Properties.create(Material.IRON).sound(SoundType.CLOTH), blanketShape, new Vec3d(0.5d, -0.2d, 0.5d))),
		BLANKET_EDGE_LIGHTGRAY = add("blanket_edge_lightgray", OmniItems.BEDROOM_TAB, new SeatBlock(Properties.create(Material.IRON).sound(SoundType.CLOTH), blanketShape, new Vec3d(0.5d, -0.2d, 0.5d))),
		BLANKET_EDGE_LIME = add("blanket_edge_lime", OmniItems.BEDROOM_TAB, new SeatBlock(Properties.create(Material.IRON).sound(SoundType.CLOTH), blanketShape, new Vec3d(0.5d, -0.2d, 0.5d))),
		BLANKET_EDGE_MAGENTA = add("blanket_edge_magenta", OmniItems.BEDROOM_TAB, new SeatBlock(Properties.create(Material.IRON).sound(SoundType.CLOTH), blanketShape, new Vec3d(0.5d, -0.2d, 0.5d))),
		BLANKET_EDGE_ORANGE = add("blanket_edge_orange", OmniItems.BEDROOM_TAB, new SeatBlock(Properties.create(Material.IRON).sound(SoundType.CLOTH), blanketShape, new Vec3d(0.5d, -0.2d, 0.5d))),
		BLANKET_EDGE_PINK = add("blanket_edge_pink", OmniItems.BEDROOM_TAB, new SeatBlock(Properties.create(Material.IRON).sound(SoundType.CLOTH), blanketShape, new Vec3d(0.5d, -0.2d, 0.5d))),
		BLANKET_EDGE_PURPLE = add("blanket_edge_purple", OmniItems.BEDROOM_TAB, new SeatBlock(Properties.create(Material.IRON).sound(SoundType.CLOTH), blanketShape, new Vec3d(0.5d, -0.2d, 0.5d))),
		BLANKET_EDGE_RED = add("blanket_edge_red", OmniItems.BEDROOM_TAB, new SeatBlock(Properties.create(Material.IRON).sound(SoundType.CLOTH), blanketShape, new Vec3d(0.5d, -0.2d, 0.5d))),
		BLANKET_EDGE_WHITE = add("blanket_edge_white", OmniItems.BEDROOM_TAB, new SeatBlock(Properties.create(Material.IRON).sound(SoundType.CLOTH), blanketShape, new Vec3d(0.5d, -0.2d, 0.5d))),
		BLANKET_EDGE_YELLOW = add("blanket_edge_yellow", OmniItems.BEDROOM_TAB, new SeatBlock(Properties.create(Material.IRON).sound(SoundType.CLOTH), blanketShape, new Vec3d(0.5d, -0.2d, 0.5d))),
		BLANKET_FOOT_BLACK = add("blanket_foot_black", OmniItems.BEDROOM_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.CLOTH), blanketfootShape)),
		BLANKET_FOOT_BLUE = add("blanket_foot_blue", OmniItems.BEDROOM_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.CLOTH), blanketfootShape)),
		BLANKET_FOOT_BROWN = add("blanket_foot_brown", OmniItems.BEDROOM_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.CLOTH), blanketfootShape)),
		BLANKET_FOOT_CYAN = add("blanket_foot_cyan", OmniItems.BEDROOM_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.CLOTH), blanketfootShape)),
		BLANKET_FOOT_GRAY = add("blanket_foot_gray", OmniItems.BEDROOM_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.CLOTH), blanketfootShape)),
		BLANKET_FOOT_GREEN = add("blanket_foot_green", OmniItems.BEDROOM_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.CLOTH), blanketfootShape)),
		BLANKET_FOOT_LIGHTBLUE = add("blanket_foot_lightblue", OmniItems.BEDROOM_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.CLOTH), blanketfootShape)),
		BLANKET_FOOT_LIGHTGRAY = add("blanket_foot_lightgray", OmniItems.BEDROOM_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.CLOTH), blanketfootShape)),
		BLANKET_FOOT_LIME = add("blanket_foot_lime", OmniItems.BEDROOM_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.CLOTH), blanketfootShape)),
		BLANKET_FOOT_MAGENTA = add("blanket_foot_magenta", OmniItems.BEDROOM_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.CLOTH), blanketfootShape)),
		BLANKET_FOOT_ORANGE = add("blanket_foot_orange", OmniItems.BEDROOM_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.CLOTH), blanketfootShape)),
		BLANKET_FOOT_PINK = add("blanket_foot_pink", OmniItems.BEDROOM_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.CLOTH), blanketfootShape)),
		BLANKET_FOOT_PURPLE = add("blanket_foot_purple", OmniItems.BEDROOM_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.CLOTH), blanketfootShape)),
		BLANKET_FOOT_RED = add("blanket_foot_red", OmniItems.BEDROOM_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.CLOTH), blanketfootShape)),
		BLANKET_FOOT_WHITE = add("blanket_foot_white", OmniItems.BEDROOM_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.CLOTH), blanketfootShape)),
		BLANKET_FOOT_YELLOW = add("blanket_foot_yellow", OmniItems.BEDROOM_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.CLOTH), blanketfootShape)),

		// KITCHEN
		
		BARCART_BLACK = add("barcart_black", OmniItems.KITCHEN_TAB, new DoubleHRBlock(Properties.create(Material.IRON).sound(SoundType.STONE), barcartShape)),
		BARCART_WHITE = add("barcart_white", OmniItems.KITCHEN_TAB, new DoubleHRBlock(Properties.create(Material.IRON).sound(SoundType.STONE), barcartShape)),
		BINKITCHEN_BLACK = add("binkitchen_black", OmniItems.KITCHEN_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.STONE), binkitchenShape)),
		BINKITCHEN_WHITE = add("binkitchen_white", OmniItems.KITCHEN_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.STONE), binkitchenShape)),
		COFFEE_MAKER = add("coffeemaker", OmniItems.KITCHEN_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.STONE), Block.makeCuboidShape(4.5d, 0d, 3d, 11.5d, 10.75d, 13d))),
		GUMBALL_CYAN = add("gumball_cyan", OmniItems.KITCHEN_TAB, new TranslucentHRBlock(Properties.create(Material.IRON).sound(SoundType.GLASS), gumballShape)),
		GUMBALL_RED = add("gumball_red", OmniItems.KITCHEN_TAB, new TranslucentHRBlock(Properties.create(Material.IRON).sound(SoundType.GLASS), gumballShape)),
		BLENDER_BLACK = add("blender_black", OmniItems.KITCHEN_TAB, new TranslucentHRBlock(Properties.create(Material.IRON).sound(SoundType.GLASS), blenderShape)),
		BLENDER_WHITE = add("blender_white", OmniItems.KITCHEN_TAB, new TranslucentHRBlock(Properties.create(Material.IRON).sound(SoundType.GLASS), blenderShape)),
		MICROWAVE = add("microwave", OmniItems.KITCHEN_TAB, new TranslucentHRBlock(Properties.create(Material.IRON).sound(SoundType.GLASS), microwaveShape)),
		MICROWAVE_BLACK = add("microwave_black", OmniItems.KITCHEN_TAB, new TranslucentHRBlock(Properties.create(Material.IRON).sound(SoundType.GLASS), microwaveShape)),
		TOASTER = add("toaster", OmniItems.KITCHEN_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.STONE), Block.makeCuboidShape(5.25d, 0d, 6.5d, 10.75d, 4d, 9.5d))),
	
		// BATHROOM
		
		BATHTUB_BLACK = add("bathtub_black", OmniItems.BATHROOM_TAB, new DoubleSeatBlock(Properties.create(Material.IRON).sound(SoundType.GLASS), bathtubShape, new Vec3d(0.5d, -0.1d, 0.5d))),
		BATHTUB_WHITE = add("bathtub_white", OmniItems.BATHROOM_TAB, new DoubleSeatBlock(Properties.create(Material.IRON).sound(SoundType.GLASS), bathtubShape, new Vec3d(0.5d, -0.1d, 0.5d))),
		BINBATHROOM_BLACK = add("binbathroom_black", OmniItems.BATHROOM_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.STONE), binbathroomShape)),
		BINBATHROOM_WHITE = add("binbathroom_white", OmniItems.BATHROOM_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.STONE), binbathroomShape)),
		MIRROR_BLACK = add("mirror_black", OmniItems.BATHROOM_TAB, new TranslucentHRBlock(Properties.create(Material.IRON).sound(SoundType.GLASS), thinwallShape)),
		MIRROR_WHITE = add("mirror_white", OmniItems.BATHROOM_TAB, new TranslucentHRBlock(Properties.create(Material.IRON).sound(SoundType.GLASS), thinwallShape)),
		TOILETBRUSH_BLACK = add("toiletbrush_black", OmniItems.BATHROOM_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.STONE), toiletbrushShape)),
		TOILETBRUSH_WHITE = add("toiletbrush_white", OmniItems.BATHROOM_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.STONE), toiletbrushShape)),
		TOILET_PAPER = add("toilet_paper", OmniItems.BATHROOM_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.STONE), Block.makeCuboidShape(6d, 5d, 11d, 10d, 15d, 16d))),
		TOILET_BLACK = add("toilet_black", OmniItems.BATHROOM_TAB, new TranslucentSeatBlock(Properties.create(Material.IRON).sound(SoundType.GLASS), toiletShape, new Vec3d(0.5d, 0.2d, 0.5d))),
		TOILET_WHITE = add("toilet_white", OmniItems.BATHROOM_TAB, new TranslucentSeatBlock(Properties.create(Material.IRON).sound(SoundType.GLASS), toiletShape, new Vec3d(0.5d, 0.2d, 0.5d))),
				
		// OFFICE
		
		BINOFFICE_BLACK = add("binoffice_black", OmniItems.OFFICE_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.STONE), binofficeShape)),
		BINOFFICE_WHITE = add("binoffice_white", OmniItems.OFFICE_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.STONE), binofficeShape)),	
		IMAC = add("imac", OmniItems.OFFICE_TAB, new ToggleableHRBlock(Properties.create(Material.IRON).sound(SoundType.STONE), imacShape)),
		LAPTOP = add("laptop", OmniItems.OFFICE_TAB, new ToggleableHRBlock(Properties.create(Material.IRON).sound(SoundType.STONE), Block.makeCuboidShape(3d, 0d, 4d, 13d, 0.2d, 12.2d))),
		OFFICETRAY_BLACK = add("officetray_black", OmniItems.OFFICE_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.STONE), officetrayShape)),
		OFFICETRAY_WHITE = add("officetray_white", OmniItems.OFFICE_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.STONE), officetrayShape)),
		PHONE = add("phone", OmniItems.OFFICE_TAB, new ToggleableHRBlock(Properties.create(Material.IRON).sound(SoundType.WOOD), Block.makeCuboidShape(6d, 0d, 5d, 10d, 1d, 11d))),
		MONITORS_WHITE = add("monitors_white", OmniItems.OFFICE_TAB, new ToggleableHRBlock(Properties.create(Material.IRON).sound(SoundType.STONE), monitorsShape)),
		MONITORS_BLACK = add("monitors_black", OmniItems.OFFICE_TAB, new ToggleableHRBlock(Properties.create(Material.IRON).sound(SoundType.STONE), monitorsShape)),
		SYSTEMUNIT_BLACK = add("systemunit_black", OmniItems.OFFICE_TAB, new TranslucentHRBlock(Properties.create(Material.IRON).sound(SoundType.STONE), systemunitShape)),
		SYSTEMUNIT_WHITE = add("systemunit_white", OmniItems.OFFICE_TAB, new TranslucentHRBlock(Properties.create(Material.IRON).sound(SoundType.STONE), systemunitShape)),
		
		// FURNITURE
		
		BOOKSHELF = add("bookshelf", OmniItems.FURNITURE_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.WOOD))),
		BOOKSHELF_HALF = add("bookshelf_half", OmniItems.FURNITURE_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.WOOD), verticalslabShape)),
		DRAWER_A_CYAN = add("drawer_a_cyan", OmniItems.FURNITURE_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.WOOD))),
		DRAWER_A_GRAY = add("drawer_a_gray", OmniItems.FURNITURE_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.WOOD))),
		DRAWER_A_WHITE = add("drawer_a_white", OmniItems.FURNITURE_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.WOOD))),	
		DRAWER_B_CYAN = add("drawer_b_cyan", OmniItems.FURNITURE_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.WOOD))),
		DRAWER_B_GRAY = add("drawer_b_gray", OmniItems.FURNITURE_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.WOOD))),
		DRAWER_B_WHITE = add("drawer_b_white", OmniItems.FURNITURE_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.WOOD))),
		DRAWERHALF_BLACK = add("drawerhalf_black", OmniItems.FURNITURE_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.STONE), drawerhalfShape)),
		DRAWERHALF_CYAN = add("drawerhalf_cyan", OmniItems.FURNITURE_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.STONE), drawerhalfShape)),
		DRAWERHALF_WHITE = add("drawerhalf_white", OmniItems.FURNITURE_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.STONE), drawerhalfShape)),
		GLASS_SHELF_BLACK = add("glass_shelf_black", OmniItems.FURNITURE_TAB, new TranslucentHRBlock(Properties.create(Material.IRON).sound(SoundType.GLASS), tabletopShape)),
		GLASS_SHELF_BLUE = add("glass_shelf_blue", OmniItems.FURNITURE_TAB, new TranslucentHRBlock(Properties.create(Material.IRON).sound(SoundType.GLASS), tabletopShape)),
		UMBRELLASTAND = add("umbrellastand", OmniItems.FURNITURE_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.STONE), Block.makeCuboidShape(1d, 0d, 5d, 15d, 16d, 11d))),
		WALLSHELVES_A_ACACIA = add("wallshelves_a_acacia", OmniItems.FURNITURE_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.WOOD), wallshelvesShape)),
		WALLSHELVES_A_BIRCH = add("wallshelves_a_birch", OmniItems.FURNITURE_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.WOOD), wallshelvesShape)),
		WALLSHELVES_A_BLACK = add("wallshelves_a_black", OmniItems.FURNITURE_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.STONE), wallshelvesShape)),
		WALLSHELVES_A_DARKOAK = add("wallshelves_a_darkoak", OmniItems.FURNITURE_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.WOOD), wallshelvesShape)),
		WALLSHELVES_A_JUNGLE = add("wallshelves_a_jungle", OmniItems.FURNITURE_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.WOOD), wallshelvesShape)),
		WALLSHELVES_A_OAK = add("wallshelves_a_oak", OmniItems.FURNITURE_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.WOOD), wallshelvesShape)),
		WALLSHELVES_A_SPRUCE = add("wallshelves_a_spruce", OmniItems.FURNITURE_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.WOOD), wallshelvesShape)),
		WALLSHELVES_A_WHITE = add("wallshelves_a_white", OmniItems.FURNITURE_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.STONE), wallshelvesShape)),
		WALLSHELVES_B_ACACIA = add("wallshelves_b_acacia", OmniItems.FURNITURE_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.WOOD), wallshelvesShape)),
		WALLSHELVES_B_BIRCH = add("wallshelves_b_birch", OmniItems.FURNITURE_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.WOOD), wallshelvesShape)),
		WALLSHELVES_B_BLACK = add("wallshelves_b_black", OmniItems.FURNITURE_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.WOOD), wallshelvesShape)),
		WALLSHELVES_B_DARKOAK = add("wallshelves_b_darkoak", OmniItems.FURNITURE_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.WOOD), wallshelvesShape)),
		WALLSHELVES_B_JUNGLE = add("wallshelves_b_jungle", OmniItems.FURNITURE_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.WOOD), wallshelvesShape)),
		WALLSHELVES_B_OAK = add("wallshelves_b_oak", OmniItems.FURNITURE_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.WOOD), wallshelvesShape)),
		WALLSHELVES_B_SPRUCE = add("wallshelves_b_spruce", OmniItems.FURNITURE_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.WOOD), wallshelvesShape)),
		WALLSHELVES_B_WHITE = add("wallshelves_b_white", OmniItems.FURNITURE_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.WOOD), wallshelvesShape)),
		
		// CONSTRUCTION
		
		GLASSFENCE_BLACK = add("glassfence_black", OmniItems.CONSTRUCTION_TAB, new TranslucentHRBlock(Properties.create(Material.IRON).sound(SoundType.GLASS), thinwallShape)),
		GLASSFENCE_WHITE = add("glassfence_white", OmniItems.CONSTRUCTION_TAB, new TranslucentHRBlock(Properties.create(Material.IRON).sound(SoundType.GLASS), thinwallShape)),
		STAIRGLASSFENCE_BLACK = add("stairglassfence_black", OmniItems.CONSTRUCTION_TAB, new TranslucentHRBlock(Properties.create(Material.IRON).sound(SoundType.GLASS), thinwallShape)),
		STAIRGLASSFENCE_WHITE = add("stairglassfence_white", OmniItems.CONSTRUCTION_TAB, new TranslucentHRBlock(Properties.create(Material.IRON).sound(SoundType.GLASS), thinwallShape)),
		STAIRGLASSFENCEB_BLACK = add("stairglassfenceb_black", OmniItems.CONSTRUCTION_TAB, new TranslucentHRBlock(Properties.create(Material.IRON).sound(SoundType.GLASS), thinwallShape)),
		STAIRGLASSFENCEB_WHITE = add("stairglassfenceb_white", OmniItems.CONSTRUCTION_TAB, new TranslucentHRBlock(Properties.create(Material.IRON).sound(SoundType.GLASS), thinwallShape)),
		STAIRS_ACACIA = add("stairs_acacia", OmniItems.CONSTRUCTION_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.WOOD), modernstairShape)),
		STAIRS_BIRCH = add("stairs_birch", OmniItems.CONSTRUCTION_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.WOOD), modernstairShape)),
		STAIRS_BLACK = add("stairs_black", OmniItems.CONSTRUCTION_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.WOOD), modernstairShape)),
		STAIRS_DARKOAK = add("stairs_darkoak", OmniItems.CONSTRUCTION_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.WOOD), modernstairShape)),
		STAIRS_JUNGLE = add("stairs_jungle", OmniItems.CONSTRUCTION_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.WOOD), modernstairShape)),
		STAIRS_OAK = add("stairs_oak", OmniItems.CONSTRUCTION_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.WOOD), modernstairShape)),
		STAIRS_SPRUCE = add("stairs_spruce", OmniItems.CONSTRUCTION_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.WOOD), modernstairShape)),
		STAIRS_WHITE = add("stairs_white", OmniItems.CONSTRUCTION_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.WOOD), modernstairShape)),
		

		// TABLES CHAIRS
		
		CHAIR_DINING_GRAY = add("chair_dining_gray", OmniItems.TABLECHAIR_TAB, new SeatBlock(Properties.create(Material.IRON).sound(SoundType.STONE), chairdiningShape, new Vec3d(0.5d, 0.3d, 0.5d))),
		CHAIR_DINING_WHITE = add("chair_dining_white", OmniItems.TABLECHAIR_TAB, new SeatBlock(Properties.create(Material.IRON).sound(SoundType.STONE), chairdiningShape, new Vec3d(0.5d, 0.3d, 0.5d))),
		CHAIR_DRESSING_BLACK = add("chair_dressing_black", OmniItems.TABLECHAIR_TAB, new SeatBlock(Properties.create(Material.IRON).sound(SoundType.STONE), chairdressingShape, new Vec3d(0.5d, 0.3d, 0.5d))),
		CHAIR_DRESSING_WHITE = add("chair_dressing_white", OmniItems.TABLECHAIR_TAB, new SeatBlock(Properties.create(Material.IRON).sound(SoundType.STONE), chairdressingShape, new Vec3d(0.5d, 0.3d, 0.5d))),
		CHAIR_OFFICE_BLACK = add("chair_office_black", OmniItems.TABLECHAIR_TAB, new SeatBlock(Properties.create(Material.IRON).sound(SoundType.STONE), chairdiningShape, new Vec3d(0.5d, 0.3d, 0.5d))),
		CHAIR_OFFICE_WHITE = add("chair_office_white", OmniItems.TABLECHAIR_TAB, new SeatBlock(Properties.create(Material.IRON).sound(SoundType.STONE), chairdiningShape, new Vec3d(0.5d, 0.3d, 0.5d))),
		CHAIR_OUTDOOR_ACACIA = add("chair_outdoor_acacia", OmniItems.TABLECHAIR_TAB, new SeatBlock(Properties.create(Material.IRON).sound(SoundType.WOOD), chairdressingShape, new Vec3d(0.5d, 0.3d, 0.5d))),
		CHAIR_OUTDOOR_BIRCH = add("chair_outdoor_birch", OmniItems.TABLECHAIR_TAB, new SeatBlock(Properties.create(Material.IRON).sound(SoundType.WOOD), chairdressingShape, new Vec3d(0.5d, 0.3d, 0.5d))),
		CHAIR_OUTDOOR_BLACK = add("chair_outdoor_black", OmniItems.TABLECHAIR_TAB, new SeatBlock(Properties.create(Material.IRON).sound(SoundType.WOOD), chairdressingShape, new Vec3d(0.5d, 0.3d, 0.5d))),
		CHAIR_OUTDOOR_DARKOAK = add("chair_outdoor_darkoak", OmniItems.TABLECHAIR_TAB, new SeatBlock(Properties.create(Material.IRON).sound(SoundType.WOOD), chairdressingShape, new Vec3d(0.5d, 0.3d, 0.5d))),
		CHAIR_OUTDOOR_JUNGLE = add("chair_outdoor_jungle", OmniItems.TABLECHAIR_TAB, new SeatBlock(Properties.create(Material.IRON).sound(SoundType.WOOD), chairdressingShape, new Vec3d(0.5d, 0.3d, 0.5d))),
		CHAIR_OUTDOOR_OAK = add("chair_outdoor_oak", OmniItems.TABLECHAIR_TAB, new SeatBlock(Properties.create(Material.IRON).sound(SoundType.WOOD), chairdressingShape, new Vec3d(0.5d, 0.3d, 0.5d))),
		CHAIR_OUTDOOR_SPRUCE = add("chair_outdoor_spruce", OmniItems.TABLECHAIR_TAB, new SeatBlock(Properties.create(Material.IRON).sound(SoundType.WOOD), chairdressingShape, new Vec3d(0.5d, 0.3d, 0.5d))),
		CHAIR_OUTDOOR_WHITE = add("chair_outdoor_white", OmniItems.TABLECHAIR_TAB, new SeatBlock(Properties.create(Material.IRON).sound(SoundType.WOOD), chairdressingShape, new Vec3d(0.5d, 0.3d, 0.5d))),
		TABLE_COFFEE = add("table_coffee", OmniItems.TABLECHAIR_TAB, new TranslucentHRBlock(Properties.create(Material.IRON).sound(SoundType.GLASS), slabShape)),
		TABLE_TOP_BLACK = add("table_top_black", OmniItems.TABLECHAIR_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.STONE), tabletopShape)),
		TABLE_TOP_WHITE = add("table_top_white", OmniItems.TABLECHAIR_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.STONE), tabletopShape)),
		TABLE_DINING_WHITE = add("table_dining_white", OmniItems.TABLECHAIR_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.STONE), diningtableShape)),
		TABLE_DINING_BLACK = add("table_dining_black", OmniItems.TABLECHAIR_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.STONE), diningtableShape)),
		TABLE_DININGB_WHITE = add("table_diningb_white", OmniItems.TABLECHAIR_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.STONE), diningtablebShape)),
		TABLE_DININGB_BLACK = add("table_diningb_black", OmniItems.TABLECHAIR_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.STONE), diningtablebShape)),
		TABLE_DININGC_WHITE = add("table_diningc_white", OmniItems.TABLECHAIR_TAB, new TranslucentHRBlock(Properties.create(Material.IRON).sound(SoundType.STONE), diningtableShape)),
		TABLE_DININGC_BLACK = add("table_diningc_black", OmniItems.TABLECHAIR_TAB, new TranslucentHRBlock(Properties.create(Material.IRON).sound(SoundType.STONE), diningtableShape)),
		TABLE_OFFICE_WHITE = add("table_office_white", OmniItems.TABLECHAIR_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.STONE), officetableShape)),
		TABLE_OFFICE_BLACK = add("table_office_black", OmniItems.TABLECHAIR_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.STONE), officetableShape)),
		TABLE_OFFICEB_WHITE = add("table_officeb_white", OmniItems.TABLECHAIR_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.STONE), officetableShape)),
		TABLE_OFFICEB_BLACK = add("table_officeb_black", OmniItems.TABLECHAIR_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.STONE), officetableShape)),
		TABLE_OFFICEC_WHITE = add("table_officec_white", OmniItems.TABLECHAIR_TAB, new TranslucentHRBlock(Properties.create(Material.IRON).sound(SoundType.STONE), officetableShape)),
		TABLE_OFFICEC_BLACK = add("table_officec_black", OmniItems.TABLECHAIR_TAB, new TranslucentHRBlock(Properties.create(Material.IRON).sound(SoundType.STONE), officetableShape)),
		TABLE_OUTDOOR_ACACIA = add("table_outdoor_acacia", OmniItems.TABLECHAIR_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.WOOD), diningtablebShape)),
		TABLE_OUTDOOR_BIRCH = add("table_outdoor_birch", OmniItems.TABLECHAIR_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.WOOD), diningtablebShape)),
		TABLE_OUTDOOR_BLACK = add("table_outdoor_black", OmniItems.TABLECHAIR_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.WOOD), diningtablebShape)),
		TABLE_OUTDOOR_DARKOAK = add("table_outdoor_darkoak", OmniItems.TABLECHAIR_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.WOOD), diningtablebShape)),
		TABLE_OUTDOOR_JUNGLE = add("table_outdoor_jungle", OmniItems.TABLECHAIR_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.WOOD), diningtablebShape)),
		TABLE_OUTDOOR_OAK = add("table_outdoor_oak", OmniItems.TABLECHAIR_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.WOOD), diningtablebShape)),
		TABLE_OUTDOOR_SPRUCE = add("table_outdoor_spruce", OmniItems.TABLECHAIR_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.WOOD), diningtablebShape)),
		TABLE_OUTDOOR_WHITE = add("table_outdoor_white", OmniItems.TABLECHAIR_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.WOOD), diningtablebShape)),
		TABLE_OUTDOORTOP_ACACIA = add("table_outdoortop_acacia", OmniItems.TABLECHAIR_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.WOOD), tabletopShape)),
		TABLE_OUTDOORTOP_BIRCH = add("table_outdoortop_birch", OmniItems.TABLECHAIR_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.WOOD), tabletopShape)),
		TABLE_OUTDOORTOP_BLACK = add("table_outdoortop_black", OmniItems.TABLECHAIR_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.WOOD), tabletopShape)),
		TABLE_OUTDOORTOP_DARKOAK = add("table_outdoortop_darkoak", OmniItems.TABLECHAIR_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.WOOD), tabletopShape)),
		TABLE_OUTDOORTOP_JUNGLE = add("table_outdoortop_jungle", OmniItems.TABLECHAIR_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.WOOD), tabletopShape)),
		TABLE_OUTDOORTOP_OAK = add("table_outdoortop_oak", OmniItems.TABLECHAIR_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.WOOD), tabletopShape)),
		TABLE_OUTDOORTOP_SPRUCE = add("table_outdoortop_spruce", OmniItems.TABLECHAIR_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.WOOD), tabletopShape)),
		TABLE_OUTDOORTOP_WHITE = add("table_outdoortop_white", OmniItems.TABLECHAIR_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.WOOD), tabletopShape)),


		// OUTDOOR
		
		CCTV = add("cctv", OmniItems.OUTDOOR_TAB, new CctvBlock(Properties.create(Material.IRON).sound(SoundType.STONE))),
		DOGBOWL_WHITE = add("dogbowl_white", OmniItems.OUTDOOR_TAB, new TranslucentHRBlock(Properties.create(Material.IRON).sound(SoundType.STONE), dogbowlShape)),
		DOGBOWL_BLACK = add("dogbowl_black", OmniItems.OUTDOOR_TAB, new TranslucentHRBlock(Properties.create(Material.IRON).sound(SoundType.STONE), dogbowlShape)),
		DOGBOWL_CYAN = add("dogbowl_cyan", OmniItems.OUTDOOR_TAB, new TranslucentHRBlock(Properties.create(Material.IRON).sound(SoundType.STONE), dogbowlShape)),
		MAILBOX = add("mailbox", OmniItems.OUTDOOR_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.WOOD), Block.makeCuboidShape(5d, 0d, 1d, 11d, 8d, 15d))),
		RADIATOR_BLACK = add("radiator_black", OmniItems.OUTDOOR_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.STONE), thinwallShape)),
		RADIATOR_WHITE = add("radiator_white", OmniItems.OUTDOOR_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.STONE), thinwallShape)),
		TV_BOTTOM = add("tv_bottom", OmniItems.OUTDOOR_TAB, new TranslucentHRBlock(Properties.create(Material.IRON).sound(SoundType.STONE), thinwallShape)),
		TV_PART = add("tv_part", OmniItems.OUTDOOR_TAB, new TranslucentHRBlock(Properties.create(Material.IRON).sound(SoundType.STONE), thinwallShape)),
		TV_STAND = add("tv_stand", OmniItems.OUTDOOR_TAB, new TranslucentHRBlock(Properties.create(Material.IRON).sound(SoundType.STONE), thinwallShape)),
		TV_WALL = add("tv_wall", OmniItems.OUTDOOR_TAB, new TranslucentHRBlock(Properties.create(Material.IRON).sound(SoundType.STONE), thinwallShape)),
		
		// DECORATIONS
		
		BOOKSET_A = add("bookset_a", OmniItems.DECORATION_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.WOOD), Block.makeCuboidShape(1d, 0d, 5d, 15d, 8d, 11d))),
		BOOKSET_B = add("bookset_b", OmniItems.DECORATION_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.WOOD), Block.makeCuboidShape(1d, 0d, 5d, 15d, 8d, 11d))),
		FRAMEA_BLACK= add("framea_black", OmniItems.DECORATION_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.STONE), frameShape)),
		FRAMEA_WHITE= add("framea_white", OmniItems.DECORATION_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.STONE), frameShape)),
		FRAMEB_BLACK= add("frameb_black", OmniItems.DECORATION_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.STONE), frameShape)),
		FRAMEB_WHITE= add("frameb_white", OmniItems.DECORATION_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.STONE), frameShape)),
		FRAMEC_BLACK= add("framec_black", OmniItems.DECORATION_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.STONE), frameShape)),
		LAMP_BLACK = add("lamp_black", OmniItems.DECORATION_TAB, new TranslucentHRBlock(Properties.create(Material.IRON).sound(SoundType.GLASS).lightValue(15), Block.makeCuboidShape(6d, 0d, 6d, 10d, 12.5d, 10d))),
		LAMP_WHITE = add("lamp_white", OmniItems.DECORATION_TAB, new TranslucentHRBlock(Properties.create(Material.IRON).sound(SoundType.GLASS).lightValue(15), Block.makeCuboidShape(6d, 0d, 6d, 10d, 12.5d, 10d))),
		FRAMEC_WHITE= add("framec_white", OmniItems.DECORATION_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.STONE), frameShape)),			
		MAGAZINES = add("magazines", OmniItems.DECORATION_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.WOOD), Block.makeCuboidShape(4d, 0d, 4d, 11d, 5d, 12d))),
		NEWSTONSCRADLE_BLACK = add("newtonscradle_black", OmniItems.DECORATION_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.WOOD), Block.makeCuboidShape(3d, 0d, 6d, 13d, 7d, 10d))),
		NEWSTONSCRADLE_WHITE = add("newtonscradle_white", OmniItems.DECORATION_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.WOOD), Block.makeCuboidShape(3d, 0d, 6d, 13d, 7d, 10d))),
		
		// ROAD
		
		ASPHALT_BLOCK = add("asphalt_block", OmniItems.ROAD_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.STONE))),
		ASPHALT_BLOCK_LINED = add("asphalt_block_lined", OmniItems.ROAD_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.STONE))),
		ASPHALT_SLOPEBOT = add("asphalt_slopebot", OmniItems.ROAD_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.STONE), slabShape)),
		ASPHALT_SLOPEBOT_LINED = add("asphalt_slopebot_lined", OmniItems.ROAD_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.STONE), slabShape)),
		ASPHALT_SLOPETOP	= add("asphalt_slopetop", OmniItems.ROAD_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.STONE), stairShape)),
		ASPHALT_SLOPETOP_LINED = add("asphalt_slopetop_lined", OmniItems.ROAD_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.STONE), stairShape)),
		TOOLS_ALLEN = add("tools_allen", OmniItems.ROAD_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.METAL), toolsShape)),
		TOOLS_PHILLIPS = add("tools_phillips", OmniItems.ROAD_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.METAL), toolsShape)),
		TOOLS_ROBERTSON = add("tools_robertson", OmniItems.ROAD_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.METAL), toolsShape)),
		TOOLS_SCREWDRIVER = add("tools_screwdriver", OmniItems.ROAD_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.METAL), toolsShape)),
		TOOLS_WRENCH = add("tools_wrench", OmniItems.ROAD_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.METAL), toolsShape)),

		
		// MISC		
		
		BABY_BOY = add("baby_boy", OmniItems.OTHERS_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.CORAL), babyShape)),
		BABY_GIRL = add("baby_girl", OmniItems.OTHERS_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.CORAL), babyShape)),
		BABY_BOY_2 = add("baby_boy_2", OmniItems.OTHERS_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.CORAL), babyShape)),
		BABY_GIRL_2 = add("baby_girl_2", OmniItems.OTHERS_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.CORAL), babyShape)),
		BABY_BOY_3 = add("baby_boy_3", OmniItems.OTHERS_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.CORAL), babyShape)),
		BABY_GIRL_3 = add("baby_girl_3", OmniItems.OTHERS_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.CORAL), babyShape)),
		
		BASKET_GOLDAPPLE = add("basket_goldapple", OmniItems.OTHERS_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.WOOD))),
		BASKET_GREENAPPLE = add("basket_greenapple", OmniItems.OTHERS_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.WOOD))),
		BASKET_ORANGE = add("basket_orange", OmniItems.OTHERS_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.WOOD))),
		BASKET_PLUM = add("basket_plum", OmniItems.OTHERS_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.WOOD))),
		BASKET_REDAPPLE = add("basket_apple", OmniItems.OTHERS_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.WOOD))),
		
		BILLIARD_BLACK = add("billiard_black", OmniItems.OTHERS_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.STONE), billiardShape)),
		BILLIARD_LIGHT_BLUE = add("billiard_light_blue", OmniItems.OTHERS_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.STONE), billiardShape)),
		BILLIARD_LIME = add("billiard_lime", OmniItems.OTHERS_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.STONE), billiardShape)),
		BILLIARD_MAGENTA = add("billiard_magenta", OmniItems.OTHERS_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.STONE), billiardShape)),
		BILLIARD_RED = add("billiard_red", OmniItems.OTHERS_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.STONE), billiardShape)),
		BILLIARD_WHITE = add("billiard_white", OmniItems.OTHERS_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.STONE), billiardShape)),
		BILLIARD_YELLOW = add("billiard_yellow", OmniItems.OTHERS_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.STONE), billiardShape)),
		BILLIARD_ORANGE = add("billiard_orange", OmniItems.OTHERS_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.STONE), billiardShape)),
		
		CART_WHEEL = add("cart_wheel", OmniItems.OTHERS_TAB, new CartWheelBlock(Properties.create(Material.IRON).sound(SoundType.WOOD))),
		
		FRUIT_GOLDAPPLE = add("fruit_goldapple", OmniItems.OTHERS_TAB, new HeadRotationBlock(Properties.create(Material.IRON).sound(SoundType.WOOD))),
		FRUIT_GREENAPPLE = add("fruit_greenapple", OmniItems.OTHERS_TAB, new HeadRotationBlock(Properties.create(Material.IRON).sound(SoundType.WOOD))),
		FRUIT_ORANGE = add("fruit_orange", OmniItems.OTHERS_TAB, new HeadRotationBlock(Properties.create(Material.IRON).sound(SoundType.WOOD))),
		FRUIT_PLUM = add("fruit_plum", OmniItems.OTHERS_TAB, new HeadRotationBlock(Properties.create(Material.IRON).sound(SoundType.WOOD))),
		FRUIT_REDAPPLE = add("fruit_redapple", OmniItems.OTHERS_TAB, new HeadRotationBlock(Properties.create(Material.IRON).sound(SoundType.WOOD))),
		
		ROD_BLACK = add("rod_black", OmniItems.OTHERS_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.STONE), rodShape)),
		ROD_WHITE = add("rod_white", OmniItems.OTHERS_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.STONE), rodShape)),
		ROD_GRAY = add("rod_gray", OmniItems.OTHERS_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.STONE), rodShape)),
		ROD_LIGHT_GRAY = add("rod_light_gray", OmniItems.OTHERS_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.STONE), rodShape)),
		ROD_OAK = add("rod_oak", OmniItems.OTHERS_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.WOOD), rodShape)),
		ROD_BIRCH = add("rod_birch", OmniItems.OTHERS_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.WOOD), rodShape)),
		ROD_SPRUCE = add("rod_spruce", OmniItems.OTHERS_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.WOOD), rodShape)),
		ROD_DARK_OAK = add("rod_dark_oak", OmniItems.OTHERS_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.WOOD), rodShape)),
		ROD_ACACIA = add("rod_acacia", OmniItems.OTHERS_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.WOOD), rodShape)),	
		ROD_JUNGLE = add("rod_jungle", OmniItems.OTHERS_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.WOOD), rodShape)),
		
		SANDCASTLE = add("sandcastle", OmniItems.OTHERS_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.SAND), Block.makeCuboidShape(0d, 0d, 0d, 16d, 13d, 16d))),
		SANDCASTLE_WHITE = add("sandcastle_white", OmniItems.OTHERS_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.SAND), Block.makeCuboidShape(0d, 0d, 0d, 16d, 13d, 16d))),
		SMALL_RED_SHROOM = add("small_red_shroom", OmniItems.OTHERS_TAB, new ShroomBlock(Properties.create(Material.IRON).sound(SoundType.BAMBOO_SAPLING))),
		SMALL_BROWN_SHROOM = add("small_brown_shroom", OmniItems.OTHERS_TAB, new ShroomBlock(Properties.create(Material.IRON).sound(SoundType.BAMBOO_SAPLING)));
					

	public static void register(RegistryEvent.Register<Block> event)
	{
		for(Block block : BLOCKS)
			event.getRegistry().register(block);
	}

	public static Block add(String name, ItemGroup group, Block block)
	{
		BLOCKS.add(block.setRegistryName(OmniHeads.ID, name));
		OmniItems.add(name, new BlockItem(block, new Item.Properties().group(group)));
		return block;
	}
}