package net.hytech.helldivers.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.hytech.helldivers.block.model.StratagemMakerBlockModel;
import net.hytech.helldivers.block.entity.StratagemMakerTileEntity;

public class StratagemMakerTileRenderer extends GeoBlockRenderer<StratagemMakerTileEntity> {
	public StratagemMakerTileRenderer() {
		super(new StratagemMakerBlockModel());
	}

	@Override
	public RenderType getRenderType(StratagemMakerTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
