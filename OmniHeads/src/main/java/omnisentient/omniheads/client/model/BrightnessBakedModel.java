package omnisentient.omniheads.client.model;

import java.util.List;
import java.util.Random;
import java.util.function.Predicate;

import javax.annotation.Nullable;

import com.google.common.collect.Lists;

import net.minecraft.block.BlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.model.BakedQuad;
import net.minecraft.client.renderer.model.IBakedModel;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.client.renderer.vertex.VertexFormat;
import net.minecraft.util.Direction;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.model.BakedModelWrapper;
import net.minecraftforge.client.model.data.IModelData;
import net.minecraftforge.client.model.pipeline.UnpackedBakedQuad;
import net.minecraftforge.client.model.pipeline.VertexLighterFlat;
import net.minecraftforge.common.ForgeConfig;

@OnlyIn(Dist.CLIENT)
public class BrightnessBakedModel extends BakedModelWrapper
{
	public final Predicate<BakedQuad> filter;

	public BrightnessBakedModel(IBakedModel model, Predicate<BakedQuad> filter)
	{
		super(model);
		this.filter = filter;
	}

	@Override
	public List<BakedQuad> getQuads(@Nullable BlockState state, @Nullable Direction side, Random rand, IModelData data)
	{
		List<BakedQuad> newQuads = Lists.newArrayList();
		for(BakedQuad quad : this.originalModel.getQuads(state, side, rand, data))
		{
			if(this.filter.test(quad))
				newQuads.add(transformQuad(quad, 0.007f));
			else
				newQuads.add(quad);
		}
		return newQuads;
	}

	public static boolean isLightMapDisabled()
	{
		return !ForgeConfig.CLIENT.forgeLightPipelineEnabled.get();
	}

	public static BakedQuad transformQuad(BakedQuad quad, float light)
	{
		if (isLightMapDisabled())
			return quad;
		VertexFormat newFormat = getFormatWithLightMap(quad.getFormat());
		UnpackedBakedQuad.Builder builder = new UnpackedBakedQuad.Builder(newFormat);
		VertexLighterFlat trans = new VertexLighterFlat(Minecraft.getInstance().getBlockColors())
		{
			@Override
			protected void updateLightmap(float[] normal, float[] lightmap, float x, float y, float z)
			{
				lightmap[0] = light;
				lightmap[1] = light;
			}

			@Override
			public void setQuadTint(int tint) {}
		};

		trans.setParent(builder);
		quad.pipe(trans);
		builder.setQuadTint(quad.getTintIndex());
		builder.setQuadOrientation(quad.getFace());
		builder.setTexture(quad.getSprite());
		builder.setApplyDiffuseLighting(false);
		return builder.build();
	}

	private static final VertexFormat ITEM_FORMAT_WITH_LIGHTMAP = new VertexFormat(DefaultVertexFormats.ITEM).addElement(DefaultVertexFormats.TEX_2S);

	public static VertexFormat getFormatWithLightMap(VertexFormat format)
	{
		if (isLightMapDisabled())
			return format;
		if (format == DefaultVertexFormats.BLOCK)
			return DefaultVertexFormats.BLOCK;
		else if (format == DefaultVertexFormats.ITEM)
			return ITEM_FORMAT_WITH_LIGHTMAP;
		else if (!format.hasUv(1))
		{
			VertexFormat result = new VertexFormat(format);
			result.addElement(DefaultVertexFormats.TEX_2S);
			return result;
		}
		return format;
	}
}