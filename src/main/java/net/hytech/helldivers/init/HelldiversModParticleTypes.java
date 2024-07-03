
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.hytech.helldivers.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

import net.hytech.helldivers.HelldiversMod;

public class HelldiversModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, HelldiversMod.MODID);
	public static final RegistryObject<SimpleParticleType> RED_BEAM = REGISTRY.register("red_beam", () -> new SimpleParticleType(true));
	public static final RegistryObject<SimpleParticleType> BLUE_BEAM = REGISTRY.register("blue_beam", () -> new SimpleParticleType(false));
	public static final RegistryObject<SimpleParticleType> BILE_SPEW = REGISTRY.register("bile_spew", () -> new SimpleParticleType(true));
	public static final RegistryObject<SimpleParticleType> EMS = REGISTRY.register("ems", () -> new SimpleParticleType(true));
}
