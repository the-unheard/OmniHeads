package omnisentient.omniheads.common.init;

import java.util.List;

import com.google.common.collect.Lists;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.event.RegistryEvent;
import omnisentient.omniheads.OmniHeads;
import omnisentient.omniheads.common.item.OmniItemGroup;

public final class OmniItems
{
	private OmniItems() {}

	public static final ItemGroup

		MAIN_TAB = new OmniItemGroup("main")
		{
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon()
			{
				return new ItemStack(Items.PLAYER_HEAD);
			}
		},
		BEDROOM_TAB = new OmniItemGroup("bedroom")
		{
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon()
			{
				return new ItemStack(OmniBlocks.CLOCK_GRAY);
			}
		},
		KITCHEN_TAB = new OmniItemGroup("kitchen")
		{
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon()
			{
				return new ItemStack(OmniBlocks.BLENDER_WHITE);
			}
		},
		BATHROOM_TAB = new OmniItemGroup("bathroom")
		{
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon()
			{
				return new ItemStack(OmniBlocks.TOILET_WHITE);
			}
		},
		OFFICE_TAB = new OmniItemGroup("office")
		{
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon()
			{
				return new ItemStack(OmniBlocks.IMAC);
			}
		},
		FURNITURE_TAB = new OmniItemGroup("furniture")
		{
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon()
			{
				return new ItemStack(OmniBlocks.WALLSHELVES_A_WHITE);
			}
		},
		TABLECHAIR_TAB = new OmniItemGroup("tablechair")
		{
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon()
			{
				return new ItemStack(OmniBlocks.CHAIR_DINING_WHITE);
			}
		},
		OUTDOOR_TAB = new OmniItemGroup("outdoor")
		{
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon()
			{
				return new ItemStack(OmniBlocks.CCTV);
			}
		},
		DECORATION_TAB = new OmniItemGroup("decoration")
		{
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon()
			{
				return new ItemStack(OmniBlocks.BOOKSET_A);
			}
		},
		CONSTRUCTION_TAB = new OmniItemGroup("construction")
		{
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon()
			{
				return new ItemStack(OmniBlocks.STAIRS_WHITE);
			}
		},
		ROAD_TAB = new OmniItemGroup("road")
		{
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon()
			{
				return new ItemStack(OmniBlocks.ASPHALT_BLOCK_LINED);
			}
		},
		OTHERS_TAB = new OmniItemGroup("others")
		{
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon()
			{
				return new ItemStack(OmniBlocks.SANDCASTLE_WHITE);
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
		ITEMS.add(item.setRegistryName(OmniHeads.ID, name));
		return item;
	}
}