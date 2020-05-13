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
import omnisentient.omniheads.common.block.CartWheelBlock;
import omnisentient.omniheads.common.block.CctvBlock;
import omnisentient.omniheads.common.block.HeadRotationBlock;
import omnisentient.omniheads.common.block.HorizontalRotationBlock;
import omnisentient.omniheads.common.block.ImacBlock;
import omnisentient.omniheads.common.block.LaptopBlock;
import omnisentient.omniheads.common.block.MailboxBlock;
import omnisentient.omniheads.common.block.RodBlock;
import omnisentient.omniheads.common.block.ShroomBlock;

public final class OmniBlocks
{
	private OmniBlocks() {}

	public static final List<Block> BLOCKS = Lists.newArrayList();

	public static final Block
		BOOK_1_HEAD = add("book_1_head", OmniItems.MAIN_TAB, new HeadRotationBlock(Properties.create(Material.IRON).sound(SoundType.STONE))),
		BOOK_2_HEAD = add("book_2_head", OmniItems.MAIN_TAB, new HeadRotationBlock(Properties.create(Material.IRON).sound(SoundType.STONE))),
		CHEST_HEAD = add("chest_head", OmniItems.MAIN_TAB, new HeadRotationBlock(Properties.create(Material.IRON).sound(SoundType.STONE))),
		COMPUTER_HEAD = add("computer_head", OmniItems.MAIN_TAB, new HeadRotationBlock(Properties.create(Material.IRON).sound(SoundType.STONE))),
		NEWSPAPERS_HEAD = add("newspapers_head", OmniItems.MAIN_TAB, new HeadRotationBlock(Properties.create(Material.IRON).sound(SoundType.STONE))),
		SUNDAE_1_HEAD = add("sundae_1_head", OmniItems.MAIN_TAB, new HeadRotationBlock(Properties.create(Material.IRON).sound(SoundType.STONE))),
		SUNDAE_2_HEAD = add("sundae_2_head", OmniItems.MAIN_TAB, new HeadRotationBlock(Properties.create(Material.IRON).sound(SoundType.STONE))),
		SUNDAE_3_HEAD = add("sundae_3_head", OmniItems.MAIN_TAB, new HeadRotationBlock(Properties.create(Material.IRON).sound(SoundType.STONE))),
		SUNDAE_4_HEAD = add("sundae_4_head", OmniItems.MAIN_TAB, new HeadRotationBlock(Properties.create(Material.IRON).sound(SoundType.STONE))),
		SUNDAE_5_HEAD = add("sundae_5_head", OmniItems.MAIN_TAB, new HeadRotationBlock(Properties.create(Material.IRON).sound(SoundType.STONE))),
		SUNDAE_6_HEAD = add("sundae_6_head", OmniItems.MAIN_TAB, new HeadRotationBlock(Properties.create(Material.IRON).sound(SoundType.STONE))),
		SUNDAE_7_HEAD = add("sundae_7_head", OmniItems.MAIN_TAB, new HeadRotationBlock(Properties.create(Material.IRON).sound(SoundType.STONE))),
		TISSUE_HEAD = add("tissue_head", OmniItems.MAIN_TAB, new HeadRotationBlock(Properties.create(Material.IRON).sound(SoundType.STONE))),	
		BABY_BOY = add("baby_boy", OmniItems.OTHERS_TAB, new BabyBlock(Properties.create(Material.IRON).sound(SoundType.SLIME))),
		BABY_GIRL = add("baby_girl", OmniItems.OTHERS_TAB, new BabyBlock(Properties.create(Material.IRON).sound(SoundType.SLIME))),
		BABY_BOY_2 = add("baby_boy_2", OmniItems.OTHERS_TAB, new BabyBlock(Properties.create(Material.IRON).sound(SoundType.SLIME))),
		BABY_GIRL_2 = add("baby_girl_2", OmniItems.OTHERS_TAB, new BabyBlock(Properties.create(Material.IRON).sound(SoundType.SLIME))),
		BABY_BOY_3 = add("baby_boy_3", OmniItems.OTHERS_TAB, new BabyBlock(Properties.create(Material.IRON).sound(SoundType.SLIME))),
		BABY_GIRL_3 = add("baby_girl_3", OmniItems.OTHERS_TAB, new BabyBlock(Properties.create(Material.IRON).sound(SoundType.SLIME))),
		SMALL_RED_SHROOM = add("small_red_shroom", OmniItems.OTHERS_TAB, new ShroomBlock(Properties.create(Material.IRON).sound(SoundType.CROP))),
		SMALL_BROWN_SHROOM = add("small_brown_shroom", OmniItems.OTHERS_TAB, new ShroomBlock(Properties.create(Material.IRON).sound(SoundType.CROP))),
		ALARM_GRAY = add("alarm_gray", OmniItems.OTHERS_TAB, new AlarmBlock(Properties.create(Material.IRON).sound(SoundType.STONE))),
		ALARM_WHITE = add("alarm_white", OmniItems.OTHERS_TAB, new AlarmBlock(Properties.create(Material.IRON).sound(SoundType.STONE))),
		BASKET_APPLE = add("basket_apple", OmniItems.OTHERS_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.WOOD))),
		CART_WHEEL = add("cart_wheel", OmniItems.OTHERS_TAB, new CartWheelBlock(Properties.create(Material.IRON).sound(SoundType.WOOD))),
		CCTV = add("cctv", OmniItems.OTHERS_TAB, new CctvBlock(Properties.create(Material.IRON).sound(SoundType.STONE))),
		DRAWER_A_GRAY = add("drawer_a_gray", OmniItems.OTHERS_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.STONE))),
		DRAWER_A_WHITE = add("drawer_a_white", OmniItems.OTHERS_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.STONE))),
		DRAWER_B_GRAY = add("drawer_b_gray", OmniItems.OTHERS_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.STONE))),
		DRAWER_B_WHITE = add("drawer_b_white", OmniItems.OTHERS_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.STONE))),
		IMAC = add("imac", OmniItems.OTHERS_TAB, new ImacBlock(Properties.create(Material.IRON).sound(SoundType.STONE))),
		LAPTOP = add("laptop", OmniItems.OTHERS_TAB, new LaptopBlock(Properties.create(Material.IRON).sound(SoundType.STONE))),
		MAILBOX = add("mailbox", OmniItems.OTHERS_TAB, new MailboxBlock(Properties.create(Material.IRON).sound(SoundType.WOOD))),
		ROD_BLACK = add("rod_black", OmniItems.OTHERS_TAB, new RodBlock(Properties.create(Material.IRON).sound(SoundType.STONE))),
		ROD_WHITE = add("rod_white", OmniItems.OTHERS_TAB, new RodBlock(Properties.create(Material.IRON).sound(SoundType.STONE))),
		ROD_GRAY = add("rod_gray", OmniItems.OTHERS_TAB, new RodBlock(Properties.create(Material.IRON).sound(SoundType.STONE))),
		ROD_LIGHT_GRAY = add("rod_light_gray", OmniItems.OTHERS_TAB, new RodBlock(Properties.create(Material.IRON).sound(SoundType.STONE))),
		ROD_OAK = add("rod_oak", OmniItems.OTHERS_TAB, new RodBlock(Properties.create(Material.IRON).sound(SoundType.WOOD))),
		ROD_BIRCH = add("rod_birch", OmniItems.OTHERS_TAB, new RodBlock(Properties.create(Material.IRON).sound(SoundType.WOOD))),
		ROD_SPRUCE = add("rod_spruce", OmniItems.OTHERS_TAB, new RodBlock(Properties.create(Material.IRON).sound(SoundType.WOOD))),
		ROD_DARK_OAK = add("rod_dark_oak", OmniItems.OTHERS_TAB, new RodBlock(Properties.create(Material.IRON).sound(SoundType.WOOD))),
		ROD_ACACIA = add("rod_acacia", OmniItems.OTHERS_TAB, new RodBlock(Properties.create(Material.IRON).sound(SoundType.WOOD))),	
		ROD_JUNGLE = add("rod_jungle", OmniItems.OTHERS_TAB, new RodBlock(Properties.create(Material.IRON).sound(SoundType.WOOD)));
			

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