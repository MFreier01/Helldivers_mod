
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.hytech.helldivers.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.DoubleHighBlockItem;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ArmorItem;

import net.hytech.helldivers.item.StratagemRemoteItem;
import net.hytech.helldivers.item.StimItem;
import net.hytech.helldivers.item.SG225BreakerItem;
import net.hytech.helldivers.item.Purifiede710Item;
import net.hytech.helldivers.item.OrbitalSmokeStrikeItem;
import net.hytech.helldivers.item.OrbitalRailCannonStrikeItem;
import net.hytech.helldivers.item.OrbitalPrecisionStrikeItem;
import net.hytech.helldivers.item.OrbitalLaserItemItem;
import net.hytech.helldivers.item.OrbitalEMSStrikeItem;
import net.hytech.helldivers.item.OrbitalAirburstItem;
import net.hytech.helldivers.item.M105StalwartItem;
import net.hytech.helldivers.item.HellpodItemItem;
import net.hytech.helldivers.item.HeavyFS23RemoteItem;
import net.hytech.helldivers.item.HeavyFS23Item;
import net.hytech.helldivers.item.FragGrenadeItem;
import net.hytech.helldivers.item.EmptyStratagemOrbItem;
import net.hytech.helldivers.item.EagleStrafingRunItem;
import net.hytech.helldivers.item.EagleSmokeStrikeItem;
import net.hytech.helldivers.item.EagleClusterBombItem;
import net.hytech.helldivers.item.EagleAirStrikeItem;
import net.hytech.helldivers.item.Eagle500KGItem;
import net.hytech.helldivers.item.E710Item;
import net.hytech.helldivers.item.BulletItemItem;
import net.hytech.helldivers.item.BileSpewItemItem;
import net.hytech.helldivers.item.BasicarmorItem;
import net.hytech.helldivers.item.BasicArmorRemoteItem;
import net.hytech.helldivers.item.AutomatonbulletItem;
import net.hytech.helldivers.item.ArmedSupportStratagemOrbItem;
import net.hytech.helldivers.item.ArmedAttackStratagemOrbItem;
import net.hytech.helldivers.item.AirStrikeBombItemItem;
import net.hytech.helldivers.item.AR23LiberatorItem;
import net.hytech.helldivers.item.AR23Item;
import net.hytech.helldivers.item.APW1AntiMaterialRifleItem;
import net.hytech.helldivers.block.display.TerminiddustsporeDisplayItem;
import net.hytech.helldivers.block.display.StratagemMakerDisplayItem;
import net.hytech.helldivers.block.display.AutomatoncontactmineDisplayItem;
import net.hytech.helldivers.block.display.AmmoBoxDisplayItem;
import net.hytech.helldivers.HelldiversMod;

public class HelldiversModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, HelldiversMod.MODID);
	public static final RegistryObject<BasicarmorItem> BASICARMOR_HELMET = REGISTRY.register("basicarmor_helmet", () -> new BasicarmorItem(ArmorItem.Type.HELMET, new Item.Properties().fireResistant()));
	public static final RegistryObject<BasicarmorItem> BASICARMOR_CHESTPLATE = REGISTRY.register("basicarmor_chestplate", () -> new BasicarmorItem(ArmorItem.Type.CHESTPLATE, new Item.Properties().fireResistant()));
	public static final RegistryObject<BasicarmorItem> BASICARMOR_LEGGINGS = REGISTRY.register("basicarmor_leggings", () -> new BasicarmorItem(ArmorItem.Type.LEGGINGS, new Item.Properties().fireResistant()));
	public static final RegistryObject<BasicarmorItem> BASICARMOR_BOOTS = REGISTRY.register("basicarmor_boots", () -> new BasicarmorItem(ArmorItem.Type.BOOTS, new Item.Properties().fireResistant()));
	public static final RegistryObject<Item> AR_23_LIBERATOR = REGISTRY.register("ar_23_liberator", () -> new AR23LiberatorItem());
	public static final RegistryObject<Item> SG_225_BREAKER = REGISTRY.register("sg_225_breaker", () -> new SG225BreakerItem());
	public static final RegistryObject<Item> M_105_STALWART = REGISTRY.register("m_105_stalwart", () -> new M105StalwartItem());
	public static final RegistryObject<Item> BULLET_ITEM = REGISTRY.register("bullet_item", () -> new BulletItemItem());
	public static final RegistryObject<Item> APW_1_ANTI_MATERIAL_RIFLE = REGISTRY.register("apw_1_anti_material_rifle", () -> new APW1AntiMaterialRifleItem());
	public static final RegistryObject<Item> TERMINID_SCAVENGER_SPAWN_EGG = REGISTRY.register("terminid_scavenger_spawn_egg", () -> new ForgeSpawnEggItem(HelldiversModEntities.TERMINID_SCAVENGER, -26368, -16777216, new Item.Properties()));
	public static final RegistryObject<Item> FRAG_GRENADE = REGISTRY.register("frag_grenade", () -> new FragGrenadeItem());
	public static final RegistryObject<Item> TERMINIDHIVE = block(HelldiversModBlocks.TERMINIDHIVE);
	public static final RegistryObject<Item> TERMINIDWALL = block(HelldiversModBlocks.TERMINIDWALL);
	public static final RegistryObject<Item> TERMINIDSTONE = block(HelldiversModBlocks.TERMINIDSTONE);
	public static final RegistryObject<Item> TERMINIDREINFORCEDWALL = block(HelldiversModBlocks.TERMINIDREINFORCEDWALL);
	public static final RegistryObject<Item> TERMINIDDUSTSPORE = REGISTRY.register(HelldiversModBlocks.TERMINIDDUSTSPORE.getId().getPath(), () -> new TerminiddustsporeDisplayItem(HelldiversModBlocks.TERMINIDDUSTSPORE.get(), new Item.Properties()));
	public static final RegistryObject<Item> AUTOMATONCONTACTMINE = REGISTRY.register(HelldiversModBlocks.AUTOMATONCONTACTMINE.getId().getPath(),
			() -> new AutomatoncontactmineDisplayItem(HelldiversModBlocks.AUTOMATONCONTACTMINE.get(), new Item.Properties()));
	public static final RegistryObject<HeavyFS23Item> HEAVY_FS_23_HELMET = REGISTRY.register("heavy_fs_23_helmet", () -> new HeavyFS23Item(ArmorItem.Type.HELMET, new Item.Properties()));
	public static final RegistryObject<HeavyFS23Item> HEAVY_FS_23_CHESTPLATE = REGISTRY.register("heavy_fs_23_chestplate", () -> new HeavyFS23Item(ArmorItem.Type.CHESTPLATE, new Item.Properties()));
	public static final RegistryObject<HeavyFS23Item> HEAVY_FS_23_LEGGINGS = REGISTRY.register("heavy_fs_23_leggings", () -> new HeavyFS23Item(ArmorItem.Type.LEGGINGS, new Item.Properties()));
	public static final RegistryObject<HeavyFS23Item> HEAVY_FS_23_BOOTS = REGISTRY.register("heavy_fs_23_boots", () -> new HeavyFS23Item(ArmorItem.Type.BOOTS, new Item.Properties()));
	public static final RegistryObject<Item> TERMINIDBILETITAN_SPAWN_EGG = REGISTRY.register("terminidbiletitan_spawn_egg", () -> new ForgeSpawnEggItem(HelldiversModEntities.TERMINIDBILETITAN, -13421824, -26368, new Item.Properties()));
	public static final RegistryObject<Item> STRATAGEM_REMOTE = REGISTRY.register("stratagem_remote", () -> new StratagemRemoteItem());
	public static final RegistryObject<Item> E_710 = REGISTRY.register("e_710", () -> new E710Item());
	public static final RegistryObject<Item> EMPTY_STRATAGEM_ORB = REGISTRY.register("empty_stratagem_orb", () -> new EmptyStratagemOrbItem());
	public static final RegistryObject<Item> ARMED_ATTACK_STRATAGEM_ORB = REGISTRY.register("armed_attack_stratagem_orb", () -> new ArmedAttackStratagemOrbItem());
	public static final RegistryObject<Item> ARMED_SUPPORT_STRATAGEM_ORB = REGISTRY.register("armed_support_stratagem_orb", () -> new ArmedSupportStratagemOrbItem());
	public static final RegistryObject<Item> AIR_STRIKE_BOMB_ITEM = REGISTRY.register("air_strike_bomb_item", () -> new AirStrikeBombItemItem());
	public static final RegistryObject<Item> HELLPOD_ITEM = REGISTRY.register("hellpod_item", () -> new HellpodItemItem());
	public static final RegistryObject<Item> STIM = REGISTRY.register("stim", () -> new StimItem());
	public static final RegistryObject<Item> AUTOMATON_FACTORYBASE = block(HelldiversModBlocks.AUTOMATON_FACTORYBASE);
	public static final RegistryObject<Item> TERMINID_SHRIEKER_SPAWN_EGG = REGISTRY.register("terminid_shrieker_spawn_egg", () -> new ForgeSpawnEggItem(HelldiversModEntities.TERMINID_SHRIEKER, -3368704, -1, new Item.Properties()));
	public static final RegistryObject<Item> AUTOMATON_FACTORY_DOOR = doubleBlock(HelldiversModBlocks.AUTOMATON_FACTORY_DOOR);
	public static final RegistryObject<Item> PURIFIEDE_710 = REGISTRY.register("purifiede_710", () -> new Purifiede710Item());
	public static final RegistryObject<Item> BILE_SPEW_ITEM = REGISTRY.register("bile_spew_item", () -> new BileSpewItemItem());
	public static final RegistryObject<Item> AUTOMATON_FACTORY_TRAPDOOR = block(HelldiversModBlocks.AUTOMATON_FACTORY_TRAPDOOR);
	public static final RegistryObject<Item> AMMO_BOX = REGISTRY.register(HelldiversModBlocks.AMMO_BOX.getId().getPath(), () -> new AmmoBoxDisplayItem(HelldiversModBlocks.AMMO_BOX.get(), new Item.Properties()));
	public static final RegistryObject<Item> AR_23 = REGISTRY.register("ar_23", () -> new AR23Item());
	public static final RegistryObject<Item> EAGLE_AIR_STRIKE = REGISTRY.register("eagle_air_strike", () -> new EagleAirStrikeItem());
	public static final RegistryObject<Item> EAGLE_500_KG = REGISTRY.register("eagle_500_kg", () -> new Eagle500KGItem());
	public static final RegistryObject<Item> AUTOMATONBULLET = REGISTRY.register("automatonbullet", () -> new AutomatonbulletItem());
	public static final RegistryObject<Item> COMMISAR_SPAWN_EGG = REGISTRY.register("commisar_spawn_egg", () -> new ForgeSpawnEggItem(HelldiversModEntities.COMMISAR, -16777216, -65536, new Item.Properties()));
	public static final RegistryObject<Item> HULK_SPAWN_EGG = REGISTRY.register("hulk_spawn_egg", () -> new ForgeSpawnEggItem(HelldiversModEntities.HULK, -3407872, -16777216, new Item.Properties()));
	public static final RegistryObject<Item> ORBITAL_RAIL_CANNON_STRIKE = REGISTRY.register("orbital_rail_cannon_strike", () -> new OrbitalRailCannonStrikeItem());
	public static final RegistryObject<Item> ORBITAL_PRECISION_STRIKE = REGISTRY.register("orbital_precision_strike", () -> new OrbitalPrecisionStrikeItem());
	public static final RegistryObject<Item> EAGLE_STRAFING_RUN = REGISTRY.register("eagle_strafing_run", () -> new EagleStrafingRunItem());
	public static final RegistryObject<Item> STRATAGEM_MAKER = REGISTRY.register(HelldiversModBlocks.STRATAGEM_MAKER.getId().getPath(), () -> new StratagemMakerDisplayItem(HelldiversModBlocks.STRATAGEM_MAKER.get(), new Item.Properties()));
	public static final RegistryObject<Item> ORBITAL_LASER_ITEM = REGISTRY.register("orbital_laser_item", () -> new OrbitalLaserItemItem());
	public static final RegistryObject<Item> ORBITAL_AIRBURST = REGISTRY.register("orbital_airburst", () -> new OrbitalAirburstItem());
	public static final RegistryObject<Item> ORBITAL_EMS_STRIKE = REGISTRY.register("orbital_ems_strike", () -> new OrbitalEMSStrikeItem());
	public static final RegistryObject<Item> EAGLE_CLUSTER_BOMB = REGISTRY.register("eagle_cluster_bomb", () -> new EagleClusterBombItem());
	public static final RegistryObject<Item> ORBITAL_SMOKE_STRIKE = REGISTRY.register("orbital_smoke_strike", () -> new OrbitalSmokeStrikeItem());
	public static final RegistryObject<Item> EAGLE_SMOKE_STRIKE = REGISTRY.register("eagle_smoke_strike", () -> new EagleSmokeStrikeItem());
	public static final RegistryObject<BasicArmorRemoteItem> BASIC_ARMOR_REMOTE_CHESTPLATE = REGISTRY.register("basic_armor_remote_chestplate", () -> new BasicArmorRemoteItem(ArmorItem.Type.CHESTPLATE, new Item.Properties().fireResistant()));
	public static final RegistryObject<HeavyFS23RemoteItem> HEAVY_FS_23_REMOTE_CHESTPLATE = REGISTRY.register("heavy_fs_23_remote_chestplate", () -> new HeavyFS23RemoteItem(ArmorItem.Type.CHESTPLATE, new Item.Properties()));

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}

	private static RegistryObject<Item> doubleBlock(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new DoubleHighBlockItem(block.get(), new Item.Properties()));
	}
}
