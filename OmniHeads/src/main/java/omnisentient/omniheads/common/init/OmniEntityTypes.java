package omnisentient.omniheads.common.init;

import java.util.List;

import com.google.common.collect.Lists;

import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraftforge.event.RegistryEvent;
import omnisentient.omniheads.OmniHeads;
import omnisentient.omniheads.common.entity.SeatEntity;

public final class OmniEntityTypes
{
	private OmniEntityTypes() {}

	public static final List<EntityType> ENTITY_TYPES = Lists.newArrayList();

	public static final EntityType
		SEAT = add("seat", EntityType.Builder.create(SeatEntity::new, EntityClassification.MISC).size(0.1f, 0.1f).disableSerialization().disableSummoning().setShouldReceiveVelocityUpdates(false).setUpdateInterval(20).setTrackingRange(32));

	public static void register(RegistryEvent.Register<EntityType<?>> event)
	{
		for(EntityType type : ENTITY_TYPES)
			event.getRegistry().register(type);
	}

	public static EntityType add(String name, EntityType.Builder builder)
	{
		EntityType type = (EntityType) builder.build(name).setRegistryName(OmniHeads.ID, name);
		ENTITY_TYPES.add(type);
		return type;
	}
}