
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.hytech.helldivers.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.RegisterParticleProvidersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.hytech.helldivers.client.particle.RedBeamParticle;
import net.hytech.helldivers.client.particle.EMSParticle;
import net.hytech.helldivers.client.particle.BlueBeamParticle;
import net.hytech.helldivers.client.particle.BileSpewParticle;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class HelldiversModParticles {
	@SubscribeEvent
	public static void registerParticles(RegisterParticleProvidersEvent event) {
		event.registerSpriteSet(HelldiversModParticleTypes.RED_BEAM.get(), RedBeamParticle::provider);
		event.registerSpriteSet(HelldiversModParticleTypes.BLUE_BEAM.get(), BlueBeamParticle::provider);
		event.registerSpriteSet(HelldiversModParticleTypes.BILE_SPEW.get(), BileSpewParticle::provider);
		event.registerSpriteSet(HelldiversModParticleTypes.EMS.get(), EMSParticle::provider);
	}
}
