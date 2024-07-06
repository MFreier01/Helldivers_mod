
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
import net.hytech.helldivers.client.renderer.TerminidShriekerRenderer;
import net.hytech.helldivers.client.renderer.TerminidScavengerRenderer;
import net.hytech.helldivers.client.renderer.StaticFragGrenadeRenderer;
import net.hytech.helldivers.client.renderer.RailbeamRenderer;
import net.hytech.helldivers.client.renderer.OrbitallaserRenderer;
import net.hytech.helldivers.client.renderer.HulkRenderer;
import net.hytech.helldivers.client.renderer.HellpodRenderer;
import net.hytech.helldivers.client.renderer.EagleStrikeBombEntityRenderer;
import net.hytech.helldivers.client.renderer.CommisarRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class HelldiversModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(HelldiversModEntities.BASIC_BULLET.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(HelldiversModEntities.TERMINID_SCAVENGER.get(), TerminidScavengerRenderer::new);
		event.registerEntityRenderer(HelldiversModEntities.FRAG_GRENADE_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(HelldiversModEntities.STATIC_FRAG_GRENADE.get(), StaticFragGrenadeRenderer::new);
		event.registerEntityRenderer(HelldiversModEntities.TERMINIDBILETITAN.get(), TerminidbiletitanRenderer::new);
		event.registerEntityRenderer(HelldiversModEntities.THROWN_ATTACK_ORB.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(HelldiversModEntities.AIR_STRIKE_BOMB.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(HelldiversModEntities.PROJECTILE_500_KG.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(HelldiversModEntities.EAGLE_STRIKE_BOMB_ENTITY.get(), EagleStrikeBombEntityRenderer::new);
		event.registerEntityRenderer(HelldiversModEntities.HELLPOD.get(), HellpodRenderer::new);
		event.registerEntityRenderer(HelldiversModEntities.HELLPOD_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(HelldiversModEntities.THROWN_SUPPORT_ORB.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(HelldiversModEntities.TERMINID_SHRIEKER.get(), TerminidShriekerRenderer::new);
		event.registerEntityRenderer(HelldiversModEntities.BILE_SPEW_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(HelldiversModEntities.AUTOMATONBULLETPROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(HelldiversModEntities.COMMISAR.get(), CommisarRenderer::new);
		event.registerEntityRenderer(HelldiversModEntities.HULK.get(), HulkRenderer::new);
		event.registerEntityRenderer(HelldiversModEntities.RAILBEAM.get(), RailbeamRenderer::new);
		event.registerEntityRenderer(HelldiversModEntities.RAILCANNONSTRIKEPROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(HelldiversModEntities.PRECISION_STRIKE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(HelldiversModEntities.STRAFING_RUN_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(HelldiversModEntities.ORBITALLASER.get(), OrbitallaserRenderer::new);
		event.registerEntityRenderer(HelldiversModEntities.AIRBURST_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(HelldiversModEntities.ORBITALSMOKEPROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(HelldiversModEntities.ROCKET_POD_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(HelldiversModEntities.ORBITAL_380MMPROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(HelldiversModEntities.GAS_STRIKE_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(HelldiversModEntities.NAPALM_STRIKE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(HelldiversModEntities.GATTLING_PROJECTILE.get(), ThrownItemRenderer::new);
	}
}
