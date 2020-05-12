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
import omnisentient.omniheads.common.block.BabyBlock;
import omnisentient.omniheads.common.block.CartWheelBlock;
import omnisentient.omniheads.common.block.CctvBlock;
import omnisentient.omniheads.common.block.HeadRotationBlock;
import omnisentient.omniheads.common.block.HorizontalRotationBlock;
import omnisentient.omniheads.common.block.LaptopBlock;
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
		TOILET_PAPER_HEAD = add("toilet_paper_head", OmniItems.MAIN_TAB, new HeadRotationBlock(Properties.create(Material.IRON).sound(SoundType.STONE))),
		BABY_BOY = add("baby_boy", OmniItems.MAIN_TAB, new BabyBlock(Properties.create(Material.IRON).sound(SoundType.SLIME))),
		BABY_GIRL = add("baby_girl", OmniItems.MAIN_TAB, new BabyBlock(Properties.create(Material.IRON).sound(SoundType.SLIME))),
		BABY_BOY_2 = add("baby_boy_2", OmniItems.MAIN_TAB, new BabyBlock(Properties.create(Material.IRON).sound(SoundType.SLIME))),
		BABY_GIRL_2 = add("baby_girl_2", OmniItems.MAIN_TAB, new BabyBlock(Properties.create(Material.IRON).sound(SoundType.SLIME))),
		BABY_BOY_3 = add("baby_boy_3", OmniItems.MAIN_TAB, new BabyBlock(Properties.create(Material.IRON).sound(SoundType.SLIME))),
		BABY_GIRL_3 = add("baby_girl_3", OmniItems.MAIN_TAB, new BabyBlock(Properties.create(Material.IRON).sound(SoundType.SLIME))),
		SMALL_RED_SHROOM = add("small_red_shroom", OmniItems.MAIN_TAB, new ShroomBlock(Properties.create(Material.IRON).sound(SoundType.STONE))),
		SMALL_BROWN_SHROOM = add("small_brown_shroom", OmniItems.MAIN_TAB, new ShroomBlock(Properties.create(Material.IRON).sound(SoundType.STONE))),
		CART_WHEEL = add("cart_wheel", OmniItems.MAIN_TAB, new CartWheelBlock(Properties.create(Material.IRON).sound(SoundType.STONE))),
		BASKET_APPLE = add("basket_apple", OmniItems.MAIN_TAB, new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.WOOD))),
		CCTV = add("cctv", OmniItems.MAIN_TAB, new CctvBlock(Properties.create(Material.IRON).sound(SoundType.WOOD))),
		LAPTOP = add("laptop", OmniItems.MAIN_TAB, new LaptopBlock(Properties.create(Material.IRON).sound(SoundType.WOOD)));

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