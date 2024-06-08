
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
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ArmorItem;

import net.hytech.helldivers.item.StratagemRemoteItem;
import net.hytech.helldivers.item.SG225BreakerItem;
import net.hytech.helldivers.item.M105StalwartItem;
import net.hytech.helldivers.item.HeavyFS23Item;
import net.hytech.helldivers.item.FragGrenadeItem;
import net.hytech.helldivers.item.EmptyStratagemOrbItem;
import net.hytech.helldivers.item.E710Item;
import net.hytech.helldivers.item.BulletItemItem;
import net.hytech.helldivers.item.BasicarmorItem;
import net.hytech.helldivers.item.ArmedSupportStratagemOrbItem;
import net.hytech.helldivers.item.ArmedAttackStratagemOrbItem;
import net.hytech.helldivers.item.AirStrikeBombItemItem;
import net.hytech.helldivers.item.AR23LiberatorItem;
import net.hytech.helldivers.item.APW1AntiMaterialRifleItem;
import net.hytech.helldivers.block.display.TerminiddustsporeDisplayItem;
import net.hytech.helldivers.block.display.AutomatoncontactmineDisplayItem;
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
	public static final RegistryObject<Item> TERMINIDBILETITAN_SPAWN_EGG = REGISTRY.register("terminidbiletitan_spawn_egg", () -> new ForgeSpawnEggItem(HelldiversModEntities.TERMINIDBILETITAN, -1, -1, new Item.Properties()));
	public static final RegistryObject<Item> STRATAGEM_REMOTE = REGISTRY.register("stratagem_remote", () -> new StratagemRemoteItem());
	public static final RegistryObject<Item> E_710 = REGISTRY.register("e_710", () -> new E710Item());
	public static final RegistryObject<Item> EMPTY_STRATAGEM_ORB = REGISTRY.register("empty_stratagem_orb", () -> new EmptyStratagemOrbItem());
	public static final RegistryObject<Item> ARMED_ATTACK_STRATAGEM_ORB = REGISTRY.register("armed_attack_stratagem_orb", () -> new ArmedAttackStratagemOrbItem());
	public static final RegistryObject<Item> ARMED_SUPPORT_STRATAGEM_ORB = REGISTRY.register("armed_support_stratagem_orb", () -> new ArmedSupportStratagemOrbItem());
	public static final RegistryObject<Item> AIR_STRIKE_BOMB_ITEM = REGISTRY.register("air_strike_bomb_item", () -> new AirStrikeBombItemItem());

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
