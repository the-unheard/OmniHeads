package omnisentient.omniheads.common.init;

import net.minecraft.state.IntegerProperty;

public final class OmniProperties
{
	private OmniProperties() {}

	public static final IntegerProperty ROTATION = IntegerProperty.create("rotation", 0, 7);
}