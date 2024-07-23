package net.hytech.helldivers.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;

import net.hytech.helldivers.init.HelldiversModParticleTypes;
import net.hytech.helldivers.init.HelldiversModEntities;
import net.hytech.helldivers.entity.StrafingRunProjectileEntity;
import net.hytech.helldivers.HelldiversMod;

public class CallStrafingRunProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (HelldiversModParticleTypes.RED_BEAM.get()), x, y, z, 6000, 0.1, 200, 0.1, 0);
		HelldiversMod.queueServerWork(70, () -> {
			if (world instanceof ServerLevel projectileLevel) {
				Projectile _entityToSpawn = new Object() {
					public Projectile getArrow(Level level, float damage, int knockback) {
						AbstractArrow entityToSpawn = new StrafingRunProjectileEntity(HelldiversModEntities.STRAFING_RUN_PROJECTILE.get(), level);
						entityToSpawn.setBaseDamage(damage);
						entityToSpawn.setKnockback(knockback);
						entityToSpawn.setSilent(true);
						entityToSpawn.setCritArrow(true);
						return entityToSpawn;
					}
				}.getArrow(projectileLevel, 5, 1);
				_entityToSpawn.setPos((x + 73), (y + 100), (z + -67));
				_entityToSpawn.shoot((-1), (-1), 1, 4, 0);
				projectileLevel.addFreshEntity(_entityToSpawn);
			}
			HelldiversMod.queueServerWork(15, () -> {
				if (world instanceof ServerLevel projectileLevel) {
					Projectile _entityToSpawn = new Object() {
						public Projectile getArrow(Level level, float damage, int knockback) {
							AbstractArrow entityToSpawn = new StrafingRunProjectileEntity(HelldiversModEntities.STRAFING_RUN_PROJECTILE.get(), level);
							entityToSpawn.setBaseDamage(damage);
							entityToSpawn.setKnockback(knockback);
							entityToSpawn.setSilent(true);
							entityToSpawn.setCritArrow(true);
							return entityToSpawn;
						}
					}.getArrow(projectileLevel, 5, 1);
					_entityToSpawn.setPos((x + 71), (y + 100), (z + -64));
					_entityToSpawn.shoot((-1), (-1), 1, 4, 0);
					projectileLevel.addFreshEntity(_entityToSpawn);
				}
			});
			HelldiversMod.queueServerWork(12, () -> {
				if (world instanceof ServerLevel projectileLevel) {
					Projectile _entityToSpawn = new Object() {
						public Projectile getArrow(Level level, float damage, int knockback) {
							AbstractArrow entityToSpawn = new StrafingRunProjectileEntity(HelldiversModEntities.STRAFING_RUN_PROJECTILE.get(), level);
							entityToSpawn.setBaseDamage(damage);
							entityToSpawn.setKnockback(knockback);
							entityToSpawn.setSilent(true);
							entityToSpawn.setCritArrow(true);
							return entityToSpawn;
						}
					}.getArrow(projectileLevel, 5, 1);
					_entityToSpawn.setPos((x + 71), (y + 100), (z + -63));
					_entityToSpawn.shoot((-1), (-1), 1, 4, 0);
					projectileLevel.addFreshEntity(_entityToSpawn);
				}
			});
			HelldiversMod.queueServerWork(10, () -> {
				if (world instanceof ServerLevel projectileLevel) {
					Projectile _entityToSpawn = new Object() {
						public Projectile getArrow(Level level, float damage, int knockback) {
							AbstractArrow entityToSpawn = new StrafingRunProjectileEntity(HelldiversModEntities.STRAFING_RUN_PROJECTILE.get(), level);
							entityToSpawn.setBaseDamage(damage);
							entityToSpawn.setKnockback(knockback);
							entityToSpawn.setSilent(true);
							entityToSpawn.setCritArrow(true);
							return entityToSpawn;
						}
					}.getArrow(projectileLevel, 5, 1);
					_entityToSpawn.setPos((x + 69), (y + 100), (z + -67));
					_entityToSpawn.shoot((-1), (-1), 1, 4, 0);
					projectileLevel.addFreshEntity(_entityToSpawn);
				}
			});
			HelldiversMod.queueServerWork(8, () -> {
				if (world instanceof ServerLevel projectileLevel) {
					Projectile _entityToSpawn = new Object() {
						public Projectile getArrow(Level level, float damage, int knockback) {
							AbstractArrow entityToSpawn = new StrafingRunProjectileEntity(HelldiversModEntities.STRAFING_RUN_PROJECTILE.get(), level);
							entityToSpawn.setBaseDamage(damage);
							entityToSpawn.setKnockback(knockback);
							entityToSpawn.setSilent(true);
							entityToSpawn.setCritArrow(true);
							return entityToSpawn;
						}
					}.getArrow(projectileLevel, 5, 1);
					_entityToSpawn.setPos((x + 68), (y + 100), (z + -58));
					_entityToSpawn.shoot((-1), (-1), 1, 4, 0);
					projectileLevel.addFreshEntity(_entityToSpawn);
				}
			});
			HelldiversMod.queueServerWork(7, () -> {
				if (world instanceof ServerLevel projectileLevel) {
					Projectile _entityToSpawn = new Object() {
						public Projectile getArrow(Level level, float damage, int knockback) {
							AbstractArrow entityToSpawn = new StrafingRunProjectileEntity(HelldiversModEntities.STRAFING_RUN_PROJECTILE.get(), level);
							entityToSpawn.setBaseDamage(damage);
							entityToSpawn.setKnockback(knockback);
							entityToSpawn.setSilent(true);
							entityToSpawn.setCritArrow(true);
							return entityToSpawn;
						}
					}.getArrow(projectileLevel, 5, 1);
					_entityToSpawn.setPos((x + 66), (y + 100), (z + -62));
					_entityToSpawn.shoot((-1), (-1), 1, 4, 0);
					projectileLevel.addFreshEntity(_entityToSpawn);
				}
			});
			HelldiversMod.queueServerWork(6, () -> {
				if (world instanceof ServerLevel projectileLevel) {
					Projectile _entityToSpawn = new Object() {
						public Projectile getArrow(Level level, float damage, int knockback) {
							AbstractArrow entityToSpawn = new StrafingRunProjectileEntity(HelldiversModEntities.STRAFING_RUN_PROJECTILE.get(), level);
							entityToSpawn.setBaseDamage(damage);
							entityToSpawn.setKnockback(knockback);
							entityToSpawn.setSilent(true);
							entityToSpawn.setCritArrow(true);
							return entityToSpawn;
						}
					}.getArrow(projectileLevel, 5, 1);
					_entityToSpawn.setPos((x + 65), (y + 100), (z + -66));
					_entityToSpawn.shoot((-1), (-1), 1, 4, 0);
					projectileLevel.addFreshEntity(_entityToSpawn);
				}
			});
			HelldiversMod.queueServerWork(5, () -> {
				if (world instanceof ServerLevel projectileLevel) {
					Projectile _entityToSpawn = new Object() {
						public Projectile getArrow(Level level, float damage, int knockback) {
							AbstractArrow entityToSpawn = new StrafingRunProjectileEntity(HelldiversModEntities.STRAFING_RUN_PROJECTILE.get(), level);
							entityToSpawn.setBaseDamage(damage);
							entityToSpawn.setKnockback(knockback);
							entityToSpawn.setSilent(true);
							entityToSpawn.setCritArrow(true);
							return entityToSpawn;
						}
					}.getArrow(projectileLevel, 5, 1);
					_entityToSpawn.setPos((x + 66), (y + 100), (z + -66));
					_entityToSpawn.shoot((-1), (-1), 1, 4, 0);
					projectileLevel.addFreshEntity(_entityToSpawn);
				}
			});
			HelldiversMod.queueServerWork(4, () -> {
				if (world instanceof ServerLevel projectileLevel) {
					Projectile _entityToSpawn = new Object() {
						public Projectile getArrow(Level level, float damage, int knockback) {
							AbstractArrow entityToSpawn = new StrafingRunProjectileEntity(HelldiversModEntities.STRAFING_RUN_PROJECTILE.get(), level);
							entityToSpawn.setBaseDamage(damage);
							entityToSpawn.setKnockback(knockback);
							entityToSpawn.setSilent(true);
							entityToSpawn.setCritArrow(true);
							return entityToSpawn;
						}
					}.getArrow(projectileLevel, 5, 1);
					_entityToSpawn.setPos((x + 72), (y + 100), (z + -61));
					_entityToSpawn.shoot((-1), (-1), 1, 4, 0);
					projectileLevel.addFreshEntity(_entityToSpawn);
				}
			});
			HelldiversMod.queueServerWork(3, () -> {
				if (world instanceof ServerLevel projectileLevel) {
					Projectile _entityToSpawn = new Object() {
						public Projectile getArrow(Level level, float damage, int knockback) {
							AbstractArrow entityToSpawn = new StrafingRunProjectileEntity(HelldiversModEntities.STRAFING_RUN_PROJECTILE.get(), level);
							entityToSpawn.setBaseDamage(damage);
							entityToSpawn.setKnockback(knockback);
							entityToSpawn.setSilent(true);
							entityToSpawn.setCritArrow(true);
							return entityToSpawn;
						}
					}.getArrow(projectileLevel, 5, 1);
					_entityToSpawn.setPos((x + 73), (y + 100), (z + -60));
					_entityToSpawn.shoot((-1), (-1), 1, 4, 0);
					projectileLevel.addFreshEntity(_entityToSpawn);
				}
			});
			HelldiversMod.queueServerWork(2, () -> {
				if (world instanceof ServerLevel projectileLevel) {
					Projectile _entityToSpawn = new Object() {
						public Projectile getArrow(Level level, float damage, int knockback) {
							AbstractArrow entityToSpawn = new StrafingRunProjectileEntity(HelldiversModEntities.STRAFING_RUN_PROJECTILE.get(), level);
							entityToSpawn.setBaseDamage(damage);
							entityToSpawn.setKnockback(knockback);
							entityToSpawn.setSilent(true);
							entityToSpawn.setCritArrow(true);
							return entityToSpawn;
						}
					}.getArrow(projectileLevel, 5, 1);
					_entityToSpawn.setPos((x + 71), (y + 100), (z + -59));
					_entityToSpawn.shoot((-1), (-1), 1, 4, 0);
					projectileLevel.addFreshEntity(_entityToSpawn);
				}
			});
		});
	}
}
