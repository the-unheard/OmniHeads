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

	public static final ItemGroup MAIN_TAB = new ItemGroup(OmniHeads.ID + ".main")
	{
		@Override
		public ItemStack createIcon()
		{
			return new ItemStack(Items.PLAYER_HEAD);
		}
	};
	
	public static final ItemGroup BEDROOM_TAB = new ItemGroup(OmniHeads.ID + ".bedroom")
	{
		@Override
		public ItemStack createIcon()
		{
			return new ItemStack(OmniBlocks.PILLOW_GRAY);
		}
		
	};
	
	public static final ItemGroup KITCHEN_TAB = new ItemGroup(OmniHeads.ID + ".kitchen")
	{
		@Override
		public ItemStack createIcon()
		{
			return new ItemStack(OmniBlocks.MICROWAVE_BLACK);
		}
		
	};
	
	public static final ItemGroup BATHROOM_TAB = new ItemGroup(OmniHeads.ID + ".bathroom")
	{
		@Override
		public ItemStack createIcon()
		{
			return new ItemStack(OmniBlocks.TOILET_WHITE);
		}
		
	};
	
	public static final ItemGroup OFFICE_TAB = new ItemGroup(OmniHeads.ID + ".office")
	{
		@Override
		public ItemStack createIcon()
		{
			return new ItemStack(OmniBlocks.IMAC);
		}
		
	};
	
	public static final ItemGroup FURNITURE_TAB = new ItemGroup(OmniHeads.ID + ".furniture")
	{
		@Override
		public ItemStack createIcon()
		{
			return new ItemStack(OmniBlocks.WALLSHELVES_A_WHITE);
		}
		
	};
	
	public static final ItemGroup TABLECHAIR_TAB = new ItemGroup(OmniHeads.ID + ".tablechair")
	{
		@Override
		public ItemStack createIcon()
		{
			return new ItemStack(OmniBlocks.IMAC);
		}
		
	};
	
	public static final ItemGroup OUTDOOR_TAB = new ItemGroup(OmniHeads.ID + ".outdoor")
	{
		@Override
		public ItemStack createIcon()
		{
			return new ItemStack(OmniBlocks.CCTV);
		}
		
	};
	
	public static final ItemGroup DECORATION_TAB = new ItemGroup(OmniHeads.ID + ".decoration")
	{
		@Override
		public ItemStack createIcon()
		{
			return new ItemStack(OmniBlocks.BOOKSET_A);
		}
		
	};
	
	public static final ItemGroup CONSTRUCTION_TAB = new ItemGroup(OmniHeads.ID + ".construction")
	{
		@Override
		public ItemStack createIcon()
		{
			return new ItemStack(OmniBlocks.STAIRS_WHITE);
		}
		
	};
	
	public static final ItemGroup ROAD_TAB = new ItemGroup(OmniHeads.ID + ".road")
	{
		@Override
		public ItemStack createIcon()
		{
			return new ItemStack(OmniBlocks.ASPHALT_BLOCK_LINED);
		}
		
	};
	
	public static final ItemGroup OTHERS_TAB = new ItemGroup(OmniHeads.ID + ".others")
	{
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
		ITEMS.add(item.setRegistryName(new ResourceLocation(OmniHeads.ID, name)));
		return item;
	}

	public static Item add(BlockItem item)
	{
		ITEMS.add(item.setRegistryName(item.getBlock().getRegistryName()));
		return item;
	}


}