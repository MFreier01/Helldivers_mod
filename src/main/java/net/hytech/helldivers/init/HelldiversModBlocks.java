
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.hytech.helldivers.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.hytech.helldivers.block.TerminidwallBlock;
import net.hytech.helldivers.block.TerminidstoneBlock;
import net.hytech.helldivers.block.TerminidreinforcedwallBlock;
import net.hytech.helldivers.block.TerminidhiveBlock;
import net.hytech.helldivers.block.TerminiddustsporeBlock;
import net.hytech.helldivers.block.AutomatoncontactmineBlock;
import net.hytech.helldivers.block.AutomatonFactorybaseBlock;
import net.hytech.helldivers.HelldiversMod;

public class HelldiversModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, HelldiversMod.MODID);
	public static final RegistryObject<Block> TERMINIDHIVE = REGISTRY.register("terminidhive", () -> new TerminidhiveBlock());
	public static final RegistryObject<Block> TERMINIDWALL = REGISTRY.register("terminidwall", () -> new TerminidwallBlock());
	public static final RegistryObject<Block> TERMINIDSTONE = REGISTRY.register("terminidstone", () -> new TerminidstoneBlock());
	public static final RegistryObject<Block> TERMINIDREINFORCEDWALL = REGISTRY.register("terminidreinforcedwall", () -> new TerminidreinforcedwallBlock());
	public static final RegistryObject<Block> TERMINIDDUSTSPORE = REGISTRY.register("terminiddustspore", () -> new TerminiddustsporeBlock());
	public static final RegistryObject<Block> AUTOMATONCONTACTMINE = REGISTRY.register("automatoncontactmine", () -> new AutomatoncontactmineBlock());
	public static final RegistryObject<Block> AUTOMATON_FACTORYBASE = REGISTRY.register("automaton_factorybase", () -> new AutomatonFactorybaseBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
