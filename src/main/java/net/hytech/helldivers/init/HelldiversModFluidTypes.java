
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.hytech.helldivers.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fluids.FluidType;

import net.hytech.helldivers.fluid.types.NapalmFluidType;
import net.hytech.helldivers.HelldiversMod;

public class HelldiversModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, HelldiversMod.MODID);
	public static final RegistryObject<FluidType> NAPALM_TYPE = REGISTRY.register("napalm", () -> new NapalmFluidType());
}
