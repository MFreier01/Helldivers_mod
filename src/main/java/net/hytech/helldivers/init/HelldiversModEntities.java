
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

import net.hytech.helldivers.entity.ThrownAttackOrbEntity;
import net.hytech.helldivers.entity.TerminidbiletitanEntity;
import net.hytech.helldivers.entity.TerminidScavengerEntity;
import net.hytech.helldivers.entity.StaticFragGrenadeEntity;
import net.hytech.helldivers.entity.FragGrenadeProjectileEntity;
import net.hytech.helldivers.entity.BasicBulletEntity;
import net.hytech.helldivers.entity.AirStrikeBombEntity;
import net.hytech.helldivers.HelldiversMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class HelldiversModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, HelldiversMod.MODID);
	public static final RegistryObject<EntityType<BasicBulletEntity>> BASIC_BULLET = register("basic_bullet",
			EntityType.Builder.<BasicBulletEntity>of(BasicBulletEntity::new, MobCategory.MISC).setCustomClientFactory(BasicBulletEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<TerminidScavengerEntity>> TERMINID_SCAVENGER = register("terminid_scavenger",
			EntityType.Builder.<TerminidScavengerEntity>of(TerminidScavengerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TerminidScavengerEntity::new)

					.sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<FragGrenadeProjectileEntity>> FRAG_GRENADE_PROJECTILE = register("frag_grenade_projectile", EntityType.Builder.<FragGrenadeProjectileEntity>of(FragGrenadeProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(FragGrenadeProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<StaticFragGrenadeEntity>> STATIC_FRAG_GRENADE = register("static_frag_grenade",
			EntityType.Builder.<StaticFragGrenadeEntity>of(StaticFragGrenadeEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(0).setUpdateInterval(3).setCustomClientFactory(StaticFragGrenadeEntity::new)

					.sized(0.3f, 0.4f));
	public static final RegistryObject<EntityType<TerminidbiletitanEntity>> TERMINIDBILETITAN = register("terminidbiletitan",
			EntityType.Builder.<TerminidbiletitanEntity>of(TerminidbiletitanEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TerminidbiletitanEntity::new)

					.sized(10f, 10f));
	public static final RegistryObject<EntityType<ThrownAttackOrbEntity>> THROWN_ATTACK_ORB = register("thrown_attack_orb", EntityType.Builder.<ThrownAttackOrbEntity>of(ThrownAttackOrbEntity::new, MobCategory.MISC)
			.setCustomClientFactory(ThrownAttackOrbEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<AirStrikeBombEntity>> AIR_STRIKE_BOMB = register("air_strike_bomb",
			EntityType.Builder.<AirStrikeBombEntity>of(AirStrikeBombEntity::new, MobCategory.MISC).setCustomClientFactory(AirStrikeBombEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			TerminidScavengerEntity.init();
			StaticFragGrenadeEntity.init();
			TerminidbiletitanEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(TERMINID_SCAVENGER.get(), TerminidScavengerEntity.createAttributes().build());
		event.put(STATIC_FRAG_GRENADE.get(), StaticFragGrenadeEntity.createAttributes().build());
		event.put(TERMINIDBILETITAN.get(), TerminidbiletitanEntity.createAttributes().build());
	}
}
