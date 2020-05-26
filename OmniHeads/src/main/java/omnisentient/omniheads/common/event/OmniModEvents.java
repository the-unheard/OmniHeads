package omnisentient.omniheads.common.event;

import net.minecraft.block.Block;
import net.minecraft.entity.EntityType;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import omnisentient.omniheads.OmniHeads;
import omnisentient.omniheads.common.init.OmniBlocks;
import omnisentient.omniheads.common.init.OmniEntityTypes;
import omnisentient.omniheads.common.init.OmniItems;

@Mod.EventBusSubscriber(modid = OmniHeads.ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public final class OmniModEvents
{
	private OmniModEvents() {}

	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event)
	{
		OmniBlocks.register(event);
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event)
	{
		OmniItems.register(event);
	}

	@SubscribeEvent
	public static void registerEntityTypes(RegistryEvent.Register<EntityType<?>> event)
	{
		OmniEntityTypes.register(event);
	}
}