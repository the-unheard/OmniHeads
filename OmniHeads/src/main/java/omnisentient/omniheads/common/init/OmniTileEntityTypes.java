package omnisentient.omniheads.common.init;

import java.util.List;

import com.google.common.base.Supplier;
import com.google.common.collect.Lists;

import net.minecraft.block.Block;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import omnisentient.omniheads.OmniHeads;
import omnisentient.omniheads.common.tileentity.DoorTileEntity;

public class OmniTileEntityTypes
{
	private OmniTileEntityTypes() {}

	public static final List<TileEntityType> TYPES = Lists.newArrayList();

	public static final TileEntityType
		DOOR = add("door", DoorTileEntity::new, OmniBlocks.SLIDING_DOOR);

	public static void register(RegistryEvent.Register<TileEntityType<?>> event)
	{
		for(TileEntityType type : TYPES)
			event.getRegistry().register(type);
	}

	public static TileEntityType add(String name, Supplier<? extends TileEntity> factory, Block... blocks)
	{
		TileEntityType type = TileEntityType.Builder.create(factory, blocks).build(null).setRegistryName(new ResourceLocation(OmniHeads.ID, name));
		TYPES.add(type);
		return type;
	}
}