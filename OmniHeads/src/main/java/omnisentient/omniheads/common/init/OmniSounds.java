package omnisentient.omniheads.common.init;

import java.util.List;

import com.google.common.collect.Lists;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.registries.ForgeRegistries;
import omnisentient.omniheads.OmniHeads;

public final class OmniSounds
{
	
	public static final List<SoundEvent> SOUNDEVENTS = Lists.newArrayList(); 

	public static SoundEvent 
	
		SLIDING_DOOR_OPEN = add("block.sliding_door.open"),
		SLIDING_DOOR_CLOSE = add("block.sliding_door.close") ;
	
	public static void register(RegistryEvent.Register<SoundEvent> event)
	{
		for(SoundEvent soundevent : SOUNDEVENTS)
			event.getRegistry().register(soundevent);
	}

	public static SoundEvent add(String name)
	{
		ResourceLocation location = new ResourceLocation(OmniHeads.ID, name);
		SoundEvent event = new SoundEvent(location);
		event.setRegistryName(location);
		ForgeRegistries.SOUND_EVENTS.register(event);
		return event;
		
//		ResourceLocation location = new ResourceLocation(OmniHeads.ID, name);
//		SoundEvent soundevent = new SoundEvent(location);
//		SOUNDEVENTS.add(soundevent.setRegistryName(location));
//		return soundevent;
	}

}