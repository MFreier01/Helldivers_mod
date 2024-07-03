package net.hytech.helldivers.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;

import net.hytech.helldivers.init.HelldiversModParticleTypes;
import net.hytech.helldivers.HelldiversMod;

import java.util.List;
import java.util.Comparator;

public class CallOrbitalEMSStrikeProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (HelldiversModParticleTypes.RED_BEAM.get()), x, y, z, 6000, 0.1, 200, 0.1, 0);
		if ((entity.getPersistentData().getString("ActiveStratagem")).equals("OrbitalEMS")) {
			HelldiversMod.queueServerWork(40, () -> {
				if (world instanceof ServerLevel _level)
					_level.sendParticles((SimpleParticleType) (HelldiversModParticleTypes.EMS.get()), x, y, z, 1000, 16, 16, 16, 0.5);
				{
					final Vec3 _center = new Vec3(x, y, z);
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(32 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
					for (Entity entityiterator : _entfound) {
						if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 100, 5, true, true));
						HelldiversMod.queueServerWork(10, () -> {
							if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
								_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 60, 5, true, true));
						});
						HelldiversMod.queueServerWork(20, () -> {
							if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
								_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 60, 5, true, true));
						});
						HelldiversMod.queueServerWork(30, () -> {
							if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
								_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 60, 5, true, true));
						});
						HelldiversMod.queueServerWork(40, () -> {
							if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
								_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 60, 5, true, true));
						});
						HelldiversMod.queueServerWork(40, () -> {
							if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
								_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 60, 5, true, true));
						});
						HelldiversMod.queueServerWork(60, () -> {
							if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
								_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 60, 5, true, true));
						});
						HelldiversMod.queueServerWork(60, () -> {
							if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
								_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 60, 5, true, true));
						});
						HelldiversMod.queueServerWork(80, () -> {
							if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
								_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 60, 5, true, true));
						});
						HelldiversMod.queueServerWork(100, () -> {
							if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
								_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 60, 2, true, true));
						});
						HelldiversMod.queueServerWork(120, () -> {
							if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
								_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 60, 2, true, true));
						});
					}
				}
			});
		}
		entity.getPersistentData().putString("ActiveStratagem", "None");
	}
}
