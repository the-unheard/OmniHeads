package omnisentient.omniheads.common.init;

import java.util.List;

import com.google.common.collect.Lists;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import omnisentient.omniheads.OmniHeads;

public final class OmniItems
{
	private OmniItems() {}

	public static final ItemGroup TAB = new ItemGroup(OmniHeads.ID)
	{
		@Override
		public ItemStack createIcon()
		{
			return new ItemStack(Items.PLAYER_HEAD);
		}
	};
	
	public static final ItemGroup TAB2 = new ItemGroup("others")
	{
		@Override
		public ItemStack createIcon()
		{
			return new ItemStack(OmniBlocks.CCTV);
		}
	};

	public static List<Item> ITEMS = Lists.newArrayList();

	public static void register(RegistryEvent.Register<Item> event)
	{
		for(Item item : ITEMS)
			event.getRegistry().register(item);
	}

	public static Item add(String name, Item item)
	{
		ITEMS.add(item.setRegistryName(new ResourceLocation(OmniHeads.ID, name)));
		return item;
	}

	public static Item add(BlockItem item)
	{
		ITEMS.add(item.setRegistryName(item.getBlock().getRegistryName()));
		return item;
	}
}