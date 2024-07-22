
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
import net.hytech.helldivers.block.StratagemMakerBlock;
import net.hytech.helldivers.block.DemocraciteoreBlock;
import net.hytech.helldivers.block.DemocraciteblockBlock;
import net.hytech.helldivers.block.BugBreachSpawnerBlock;
import net.hytech.helldivers.block.AutomatoncontactmineBlock;
import net.hytech.helldivers.block.AutomatonFactorybaseBlock;
import net.hytech.helldivers.block.AutomatonFactoryTrapdoorBlock;
import net.hytech.helldivers.block.AutomatonFactoryDoorBlock;
import net.hytech.helldivers.block.AmmoBoxBlock;
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
	public static final RegistryObject<Block> AUTOMATON_FACTORY_DOOR = REGISTRY.register("automaton_factory_door", () -> new AutomatonFactoryDoorBlock());
	public static final RegistryObject<Block> AUTOMATON_FACTORY_TRAPDOOR = REGISTRY.register("automaton_factory_trapdoor", () -> new AutomatonFactoryTrapdoorBlock());
	public static final RegistryObject<Block> AMMO_BOX = REGISTRY.register("ammo_box", () -> new AmmoBoxBlock());
	public static final RegistryObject<Block> STRATAGEM_MAKER = REGISTRY.register("stratagem_maker", () -> new StratagemMakerBlock());
	public static final RegistryObject<Block> DEMOCRACITEORE = REGISTRY.register("democraciteore", () -> new DemocraciteoreBlock());
	public static final RegistryObject<Block> DEMOCRACITEBLOCK = REGISTRY.register("democraciteblock", () -> new DemocraciteblockBlock());
	public static final RegistryObject<Block> BUG_BREACH_SPAWNER = REGISTRY.register("bug_breach_spawner", () -> new BugBreachSpawnerBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
