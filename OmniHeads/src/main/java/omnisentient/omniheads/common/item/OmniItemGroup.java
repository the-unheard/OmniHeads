package omnisentient.omniheads.common.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import omnisentient.omniheads.OmniHeads;
import omnisentient.omniheads.common.init.OmniItems;

public abstract class OmniItemGroup extends ItemGroup
{
	public OmniItemGroup(String name)
	{
		super(OmniHeads.ID + "." + name);
	}

	@OnlyIn(Dist.CLIENT)
	@Override
	public void fill(NonNullList<ItemStack> items)
	{
		for(Item item : OmniItems.ITEMS)
			item.fillItemGroup(this, items);
	}
}