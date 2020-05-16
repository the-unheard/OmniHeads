package omnisentient.omniheads.client.model;

import java.util.List;
import java.util.Random;
import java.util.function.BiPredicate;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.google.common.collect.Lists;

import net.minecraft.block.BlockState;
import net.minecraft.client.renderer.model.BakedQuad;
import net.minecraft.client.renderer.model.IBakedModel;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.Direction;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.MinecraftForgeClient;
import net.minecraftforge.client.model.BakedModelWrapper;
import net.minecraftforge.client.model.data.IModelData;

@OnlyIn(Dist.CLIENT)
public class MultilayerBakedModel extends BakedModelWrapper
{
	public final BiPredicate<ResourceLocation, BlockRenderLayer> filter;

	public MultilayerBakedModel(IBakedModel model, BiPredicate<ResourceLocation, BlockRenderLayer> filter)
	{
		super(model);
		this.filter = filter;
	}

	@Override
	public List<BakedQuad> getQuads(@Nullable BlockState state, @Nullable Direction side, Random rand)
	{
		return this.filterQuads(super.getQuads(state, side, rand));
	}

	@Nonnull
	@Override
	public List<BakedQuad> getQuads(@Nullable BlockState state, @Nullable Direction side, @Nonnull Random rand, @Nonnull IModelData data)
	{
		return this.filterQuads(super.getQuads(state, side, rand, data));
	}

	public List<BakedQuad> filterQuads(List<BakedQuad> quads)
	{
		List<BakedQuad> newQuads = Lists.newArrayList();
		BlockRenderLayer layer = MinecraftForgeClient.getRenderLayer();
		for(BakedQuad quad : quads)
			if(this.filter.test(quad.getSprite().getName(), layer))
				newQuads.add(quad);
		return newQuads;
	}
}