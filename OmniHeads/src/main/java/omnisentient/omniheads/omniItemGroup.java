package omnisentient.omniheads;

import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class omniItemGroup extends ItemGroup {
	
	public omniItemGroup() {
		super("OmniHeads");
	}

	@Override
	public ItemStack createIcon() {
		return new ItemStack(Item.BLOCK_TO_ITEM.get(Blocks.PLAYER_HEAD));
	}
	
}
