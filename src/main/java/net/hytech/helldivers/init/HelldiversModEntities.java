
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.hytech.helldivers.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.hytech.helldivers.entity.TrooperEntity;
import net.hytech.helldivers.entity.ThrownSupportOrbEntity;
import net.hytech.helldivers.entity.ThrownAttackOrbEntity;
import net.hytech.helldivers.entity.TerminidbiletitanEntity;
import net.hytech.helldivers.entity.TerminidStalkerEntity;
import net.hytech.helldivers.entity.TerminidShriekerEntity;
import net.hytech.helldivers.entity.TerminidScavengerEntity;
import net.hytech.helldivers.entity.StrafingRunProjectileEntity;
import net.hytech.helldivers.entity.StaticFragGrenadeEntity;
import net.hytech.helldivers.entity.RocketPodProjectileEntity;
import net.hytech.helldivers.entity.RailcannonstrikeprojectileEntity;
import net.hytech.helldivers.entity.RailbeamEntity;
import net.hytech.helldivers.entity.Projectile500KGEntity;
import net.hytech.helldivers.entity.PrecisionStrikeEntity;
import net.hytech.helldivers.entity.OrbitalsmokeprojectileEntity;
import net.hytech.helldivers.entity.OrbitallaserEntity;
import net.hytech.helldivers.entity.Orbital380mmprojectileEntity;
import net.hytech.helldivers.entity.NapalmStrikeEntity;
import net.hytech.helldivers.entity.HulkEntity;
import net.hytech.helldivers.entity.HellpodProjectileEntity;
import net.hytech.helldivers.entity.HellpodEntity;
import net.hytech.helldivers.entity.GattlingProjectileEntity;
import net.hytech.helldivers.entity.GasStrikeProjectileEntity;
import net.hytech.helldivers.entity.FragGrenadeProjectileEntity;
import net.hytech.helldivers.entity.EaglesmokestrikeprojectileEntity;
import net.hytech.helldivers.entity.EagleStrikeBombEntityEntity;
import net.hytech.helldivers.entity.CommisarEntity;
import net.hytech.helldivers.entity.BileSpewProjectileEntity;
import net.hytech.helldivers.entity.BasicBulletEntity;
import net.hytech.helldivers.entity.AutomatonbulletprojectileEntity;
import net.hytech.helldivers.entity.AirburstProjectileEntity;
import net.hytech.helldivers.entity.AirStrikeBombEntity;
import net.hytech.helldivers.HelldiversMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class HelldiversModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, HelldiversMod.MODID);
	public static final RegistryObject<EntityType<BasicBulletEntity>> BASIC_BULLET = register("basic_bullet",
			EntityType.Builder.<BasicBulletEntity>of(BasicBulletEntity::new, MobCategory.MISC).setCustomClientFactory(BasicBulletEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<TerminidScavengerEntity>> TERMINID_SCAVENGER = register("terminid_scavenger",
			EntityType.Builder.<TerminidScavengerEntity>of(TerminidScavengerEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TerminidScavengerEntity::new)

					.sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<FragGrenadeProjectileEntity>> FRAG_GRENADE_PROJECTILE = register("frag_grenade_projectile", EntityType.Builder.<FragGrenadeProjectileEntity>of(FragGrenadeProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(FragGrenadeProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<StaticFragGrenadeEntity>> STATIC_FRAG_GRENADE = register("static_frag_grenade",
			EntityType.Builder.<StaticFragGrenadeEntity>of(StaticFragGrenadeEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(0).setUpdateInterval(3).setCustomClientFactory(StaticFragGrenadeEntity::new)

					.sized(0.3f, 0.4f));
	public static final RegistryObject<EntityType<TerminidbiletitanEntity>> TERMINIDBILETITAN = register("terminidbiletitan",
			EntityType.Builder.<TerminidbiletitanEntity>of(TerminidbiletitanEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TerminidbiletitanEntity::new)

					.sized(10f, 10f));
	public static final RegistryObject<EntityType<ThrownAttackOrbEntity>> THROWN_ATTACK_ORB = register("thrown_attack_orb", EntityType.Builder.<ThrownAttackOrbEntity>of(ThrownAttackOrbEntity::new, MobCategory.MISC)
			.setCustomClientFactory(ThrownAttackOrbEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<AirStrikeBombEntity>> AIR_STRIKE_BOMB = register("air_strike_bomb",
			EntityType.Builder.<AirStrikeBombEntity>of(AirStrikeBombEntity::new, MobCategory.MISC).setCustomClientFactory(AirStrikeBombEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<Projectile500KGEntity>> PROJECTILE_500_KG = register("projectile_500_kg", EntityType.Builder.<Projectile500KGEntity>of(Projectile500KGEntity::new, MobCategory.MISC)
			.setCustomClientFactory(Projectile500KGEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<EagleStrikeBombEntityEntity>> EAGLE_STRIKE_BOMB_ENTITY = register("eagle_strike_bomb_entity", EntityType.Builder.<EagleStrikeBombEntityEntity>of(EagleStrikeBombEntityEntity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EagleStrikeBombEntityEntity::new).fireImmune().sized(1f, 0.5f));
	public static final RegistryObject<EntityType<HellpodEntity>> HELLPOD = register("hellpod",
			EntityType.Builder.<HellpodEntity>of(HellpodEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(HellpodEntity::new).fireImmune().sized(1f, 0.2f));
	public static final RegistryObject<EntityType<HellpodProjectileEntity>> HELLPOD_PROJECTILE = register("hellpod_projectile", EntityType.Builder.<HellpodProjectileEntity>of(HellpodProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(HellpodProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<ThrownSupportOrbEntity>> THROWN_SUPPORT_ORB = register("thrown_support_orb", EntityType.Builder.<ThrownSupportOrbEntity>of(ThrownSupportOrbEntity::new, MobCategory.MISC)
			.setCustomClientFactory(ThrownSupportOrbEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<TerminidShriekerEntity>> TERMINID_SHRIEKER = register("terminid_shrieker",
			EntityType.Builder.<TerminidShriekerEntity>of(TerminidShriekerEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TerminidShriekerEntity::new)

					.sized(2f, 1.7f));
	public static final RegistryObject<EntityType<BileSpewProjectileEntity>> BILE_SPEW_PROJECTILE = register("bile_spew_projectile", EntityType.Builder.<BileSpewProjectileEntity>of(BileSpewProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(BileSpewProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<AutomatonbulletprojectileEntity>> AUTOMATONBULLETPROJECTILE = register("automatonbulletprojectile",
			EntityType.Builder.<AutomatonbulletprojectileEntity>of(AutomatonbulletprojectileEntity::new, MobCategory.MISC).setCustomClientFactory(AutomatonbulletprojectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<CommisarEntity>> COMMISAR = register("commisar",
			EntityType.Builder.<CommisarEntity>of(CommisarEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CommisarEntity::new)

					.sized(0.6f, 1.5f));
	public static final RegistryObject<EntityType<HulkEntity>> HULK = register("hulk",
			EntityType.Builder.<HulkEntity>of(HulkEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(HulkEntity::new)

					.sized(2.5f, 3f));
	public static final RegistryObject<EntityType<RailbeamEntity>> RAILBEAM = register("railbeam",
			EntityType.Builder.<RailbeamEntity>of(RailbeamEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(RailbeamEntity::new).fireImmune().sized(0.3f, 0.1f));
	public static final RegistryObject<EntityType<RailcannonstrikeprojectileEntity>> RAILCANNONSTRIKEPROJECTILE = register("railcannonstrikeprojectile",
			EntityType.Builder.<RailcannonstrikeprojectileEntity>of(RailcannonstrikeprojectileEntity::new, MobCategory.MISC).setCustomClientFactory(RailcannonstrikeprojectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<PrecisionStrikeEntity>> PRECISION_STRIKE = register("precision_strike", EntityType.Builder.<PrecisionStrikeEntity>of(PrecisionStrikeEntity::new, MobCategory.MISC)
			.setCustomClientFactory(PrecisionStrikeEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<StrafingRunProjectileEntity>> STRAFING_RUN_PROJECTILE = register("strafing_run_projectile", EntityType.Builder.<StrafingRunProjectileEntity>of(StrafingRunProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(StrafingRunProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<OrbitallaserEntity>> ORBITALLASER = register("orbitallaser", EntityType.Builder.<OrbitallaserEntity>of(OrbitallaserEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(OrbitallaserEntity::new).fireImmune().sized(0.6f, 0.2f));
	public static final RegistryObject<EntityType<AirburstProjectileEntity>> AIRBURST_PROJECTILE = register("airburst_projectile", EntityType.Builder.<AirburstProjectileEntity>of(AirburstProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(AirburstProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<OrbitalsmokeprojectileEntity>> ORBITALSMOKEPROJECTILE = register("orbitalsmokeprojectile", EntityType.Builder.<OrbitalsmokeprojectileEntity>of(OrbitalsmokeprojectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(OrbitalsmokeprojectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<RocketPodProjectileEntity>> ROCKET_POD_PROJECTILE = register("rocket_pod_projectile", EntityType.Builder.<RocketPodProjectileEntity>of(RocketPodProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(RocketPodProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<Orbital380mmprojectileEntity>> ORBITAL_380MMPROJECTILE = register("orbital_380mmprojectile", EntityType.Builder.<Orbital380mmprojectileEntity>of(Orbital380mmprojectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(Orbital380mmprojectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<GasStrikeProjectileEntity>> GAS_STRIKE_PROJECTILE = register("gas_strike_projectile", EntityType.Builder.<GasStrikeProjectileEntity>of(GasStrikeProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(GasStrikeProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<NapalmStrikeEntity>> NAPALM_STRIKE = register("napalm_strike",
			EntityType.Builder.<NapalmStrikeEntity>of(NapalmStrikeEntity::new, MobCategory.MISC).setCustomClientFactory(NapalmStrikeEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<GattlingProjectileEntity>> GATTLING_PROJECTILE = register("gattling_projectile", EntityType.Builder.<GattlingProjectileEntity>of(GattlingProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(GattlingProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<TrooperEntity>> TROOPER = register("trooper",
			EntityType.Builder.<TrooperEntity>of(TrooperEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TrooperEntity::new)

					.sized(0.6f, 1.5f));
	public static final RegistryObject<EntityType<TerminidStalkerEntity>> TERMINID_STALKER = register("terminid_stalker",
			EntityType.Builder.<TerminidStalkerEntity>of(TerminidStalkerEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TerminidStalkerEntity::new)

					.sized(3f, 3f));
	public static final RegistryObject<EntityType<EaglesmokestrikeprojectileEntity>> EAGLESMOKESTRIKEPROJECTILE = register("eaglesmokestrikeprojectile",
			EntityType.Builder.<EaglesmokestrikeprojectileEntity>of(EaglesmokestrikeprojectileEntity::new, MobCategory.MISC).setCustomClientFactory(EaglesmokestrikeprojectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			TerminidScavengerEntity.init();
			StaticFragGrenadeEntity.init();
			TerminidbiletitanEntity.init();
			EagleStrikeBombEntityEntity.init();
			HellpodEntity.init();
			TerminidShriekerEntity.init();
			CommisarEntity.init();
			HulkEntity.init();
			RailbeamEntity.init();
			OrbitallaserEntity.init();
			TrooperEntity.init();
			TerminidStalkerEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(TERMINID_SCAVENGER.get(), TerminidScavengerEntity.createAttributes().build());
		event.put(STATIC_FRAG_GRENADE.get(), StaticFragGrenadeEntity.createAttributes().build());
		event.put(TERMINIDBILETITAN.get(), TerminidbiletitanEntity.createAttributes().build());
		event.put(EAGLE_STRIKE_BOMB_ENTITY.get(), EagleStrikeBombEntityEntity.createAttributes().build());
		event.put(HELLPOD.get(), HellpodEntity.createAttributes().build());
		event.put(TERMINID_SHRIEKER.get(), TerminidShriekerEntity.createAttributes().build());
		event.put(COMMISAR.get(), CommisarEntity.createAttributes().build());
		event.put(HULK.get(), HulkEntity.createAttributes().build());
		event.put(RAILBEAM.get(), RailbeamEntity.createAttributes().build());
		event.put(ORBITALLASER.get(), OrbitallaserEntity.createAttributes().build());
		event.put(TROOPER.get(), TrooperEntity.createAttributes().build());
		event.put(TERMINID_STALKER.get(), TerminidStalkerEntity.createAttributes().build());
	}
}
