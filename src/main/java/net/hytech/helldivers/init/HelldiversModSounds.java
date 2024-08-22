
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.hytech.helldivers.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.hytech.helldivers.HelldiversMod;

public class HelldiversModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, HelldiversMod.MODID);
	public static final RegistryObject<SoundEvent> AR23_RELOAD = REGISTRY.register("ar23_reload", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("helldivers", "ar23_reload")));
	public static final RegistryObject<SoundEvent> APW1_RELOAD = REGISTRY.register("apw1_reload", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("helldivers", "apw1_reload")));
	public static final RegistryObject<SoundEvent> SG225_RELOAD = REGISTRY.register("sg225_reload", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("helldivers", "sg225_reload")));
	public static final RegistryObject<SoundEvent> M105_RELOAD = REGISTRY.register("m105_reload", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("helldivers", "m105_reload")));
	public static final RegistryObject<SoundEvent> AR23_SHOOT = REGISTRY.register("ar23_shoot", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("helldivers", "ar23_shoot")));
	public static final RegistryObject<SoundEvent> AR23_DRY_FIRE = REGISTRY.register("ar23_dry_fire", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("helldivers", "ar23_dry_fire")));
	public static final RegistryObject<SoundEvent> SG225_SHOOT = REGISTRY.register("sg225_shoot", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("helldivers", "sg225_shoot")));
	public static final RegistryObject<SoundEvent> SG225_DRY_FIRE = REGISTRY.register("sg225_dry_fire", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("helldivers", "sg225_dry_fire")));
	public static final RegistryObject<SoundEvent> APW1_SHOOT = REGISTRY.register("apw1_shoot", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("helldivers", "apw1_shoot")));
	public static final RegistryObject<SoundEvent> AWP1_DRY_FIRE = REGISTRY.register("awp1_dry_fire", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("helldivers", "awp1_dry_fire")));
	public static final RegistryObject<SoundEvent> ORBITAL_LASER_SOUND = REGISTRY.register("orbital_laser_sound", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("helldivers", "orbital_laser_sound")));
	public static final RegistryObject<SoundEvent> RAILCANNON_SFX = REGISTRY.register("railcannon_sfx", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("helldivers", "railcannon_sfx")));
}
