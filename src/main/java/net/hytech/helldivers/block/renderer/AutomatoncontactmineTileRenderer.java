package net.hytech.helldivers.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.hytech.helldivers.block.model.AutomatoncontactmineBlockModel;
import net.hytech.helldivers.block.entity.AutomatoncontactmineTileEntity;

public class AutomatoncontactmineTileRenderer extends GeoBlockRenderer<AutomatoncontactmineTileEntity> {
	public AutomatoncontactmineTileRenderer() {
		super(new AutomatoncontactmineBlockModel());
	}

	@Override
	public RenderType getRenderType(AutomatoncontactmineTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
