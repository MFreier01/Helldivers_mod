package net.hytech.helldivers.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.hytech.helldivers.block.model.AmmoBoxDisplayModel;
import net.hytech.helldivers.block.display.AmmoBoxDisplayItem;

public class AmmoBoxDisplayItemRenderer extends GeoItemRenderer<AmmoBoxDisplayItem> {
	public AmmoBoxDisplayItemRenderer() {
		super(new AmmoBoxDisplayModel());
	}

	@Override
	public RenderType getRenderType(AmmoBoxDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
