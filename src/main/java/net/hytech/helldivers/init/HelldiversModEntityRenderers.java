
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.hytech.helldivers.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.hytech.helldivers.client.renderer.TerminidbiletitanRenderer;
import net.hytech.helldivers.client.renderer.TerminidScavengerRenderer;
import net.hytech.helldivers.client.renderer.StaticFragGrenadeRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class HelldiversModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(HelldiversModEntities.BASIC_BULLET.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(HelldiversModEntities.TERMINID_SCAVENGER.get(), TerminidScavengerRenderer::new);
		event.registerEntityRenderer(HelldiversModEntities.FRAG_GRENADE_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(HelldiversModEntities.STATIC_FRAG_GRENADE.get(), StaticFragGrenadeRenderer::new);
		event.registerEntityRenderer(HelldiversModEntities.TERMINIDBILETITAN.get(), TerminidbiletitanRenderer::new);
	}
}
