package omnisentient.omniheads.common.init;

import java.util.List;

import com.google.common.collect.Lists;

import net.minecraft.block.Block;
import net.minecraft.block.Block.Properties;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import omnisentient.omniheads.OmniHeads;
import omnisentient.omniheads.common.block.BabyBlock;
import omnisentient.omniheads.common.block.CartWheelBlock;
import omnisentient.omniheads.common.block.FullRotationBlock;
import omnisentient.omniheads.common.block.HeadBlock;
import omnisentient.omniheads.common.block.HorizontalRotationBlock;

public final class OmniBlocks
{
	private OmniBlocks() {}

	public static final List<Block> BLOCKS = Lists.newArrayList();

	public static final Block
		COMPUTER_HEAD = add("computer_head", new HeadBlock(Properties.create(Material.IRON).sound(SoundType.STONE))),
		SUNDAE_1_HEAD = add("sundae_1_head", new HeadBlock(Properties.create(Material.IRON).sound(SoundType.STONE))),
		SUNDAE_2_HEAD = add("sundae_2_head", new HeadBlock(Properties.create(Material.IRON).sound(SoundType.STONE))),
		SUNDAE_3_HEAD = add("sundae_3_head", new HeadBlock(Properties.create(Material.IRON).sound(SoundType.STONE))),
		SUNDAE_4_HEAD = add("sundae_4_head", new HeadBlock(Properties.create(Material.IRON).sound(SoundType.STONE))),
		SUNDAE_5_HEAD = add("sundae_5_head", new HeadBlock(Properties.create(Material.IRON).sound(SoundType.STONE))),
		SUNDAE_6_HEAD = add("sundae_6_head", new HeadBlock(Properties.create(Material.IRON).sound(SoundType.STONE))),
		SUNDAE_7_HEAD = add("sundae_7_head", new HeadBlock(Properties.create(Material.IRON).sound(SoundType.STONE))),
		BABY_BOY = add("baby_boy", new BabyBlock(Properties.create(Material.IRON).sound(SoundType.SLIME))),
		BABY_GIRL = add("baby_girl", new BabyBlock(Properties.create(Material.IRON).sound(SoundType.SLIME))),
		SMALL_RED_SHROOM = add("small_red_shroom", new HeadBlock(Properties.create(Material.IRON).sound(SoundType.STONE))),
		SMALL_BROWN_SHROOM = add("small_brown_shroom", new HeadBlock(Properties.create(Material.IRON).sound(SoundType.STONE))),
		CART_WHEEL = add("cart_wheel", new CartWheelBlock(Properties.create(Material.IRON).sound(SoundType.STONE))),
		BASKET_APPLE = add("basket_apple", new HorizontalRotationBlock(Properties.create(Material.IRON).sound(SoundType.WOOD))),
		CCTV = add("cctv", new FullRotationBlock(Properties.create(Material.IRON).sound(SoundType.WOOD)));

	public static void register(RegistryEvent.Register<Block> event)
	{
		for(Block block : BLOCKS)
			event.getRegistry().register(block);
	}

	public static Block add(String name, Block block)
	{
		BLOCKS.add(block.setRegistryName(new ResourceLocation(OmniHeads.ID, name)));
		OmniItems.add(new BlockItem(block, new Item.Properties().group(OmniItems.TAB)));
		return block;
	}
}