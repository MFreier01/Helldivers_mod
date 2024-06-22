package net.hytech.helldivers.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.hytech.helldivers.block.model.AmmoBoxBlockModel;
import net.hytech.helldivers.block.entity.AmmoBoxTileEntity;

public class AmmoBoxTileRenderer extends GeoBlockRenderer<AmmoBoxTileEntity> {
	public AmmoBoxTileRenderer() {
		super(new AmmoBoxBlockModel());
	}

	@Override
	public RenderType getRenderType(AmmoBoxTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
