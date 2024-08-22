package net.hytech.helldivers.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;

import net.hytech.helldivers.init.HelldiversModParticleTypes;
import net.hytech.helldivers.init.HelldiversModEntities;
import net.hytech.helldivers.entity.RocketPodProjectileEntity;
import net.hytech.helldivers.HelldiversMod;

public class Call120MMBarrageProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (HelldiversModParticleTypes.RED_BEAM.get()), x, y, z, 6000, 0.1, 200, 0.1, 0);
		HelldiversMod.queueServerWork(70, () -> {
			if (world instanceof ServerLevel projectileLevel) {
				Projectile _entityToSpawn = new Object() {
					public Projectile getArrow(Level level, float damage, int knockback) {
						AbstractArrow entityToSpawn = new RocketPodProjectileEntity(HelldiversModEntities.ROCKET_POD_PROJECTILE.get(), level);
						entityToSpawn.setBaseDamage(damage);
						entityToSpawn.setKnockback(knockback);
						entityToSpawn.setSilent(true);
						entityToSpawn.setCritArrow(true);
						return entityToSpawn;
					}
				}.getArrow(projectileLevel, 5, 1);
				_entityToSpawn.setPos((x + Mth.nextInt(RandomSource.create(), -10, 10)), (y + 100), (z + Mth.nextInt(RandomSource.create(), -10, 10)));
				_entityToSpawn.shoot(0, (-1), 0, 4, 5);
				projectileLevel.addFreshEntity(_entityToSpawn);
			}
		});
		HelldiversMod.queueServerWork(110, () -> {
			if (world instanceof ServerLevel projectileLevel) {
				Projectile _entityToSpawn = new Object() {
					public Projectile getArrow(Level level, float damage, int knockback) {
						AbstractArrow entityToSpawn = new RocketPodProjectileEntity(HelldiversModEntities.ROCKET_POD_PROJECTILE.get(), level);
						entityToSpawn.setBaseDamage(damage);
						entityToSpawn.setKnockback(knockback);
						entityToSpawn.setSilent(true);
						entityToSpawn.setCritArrow(true);
						return entityToSpawn;
					}
				}.getArrow(projectileLevel, 5, 1);
				_entityToSpawn.setPos((x + Mth.nextInt(RandomSource.create(), -10, 10)), (y + 100), (z + Mth.nextInt(RandomSource.create(), -10, 10)));
				_entityToSpawn.shoot(0, (-1), 0, 4, 5);
				projectileLevel.addFreshEntity(_entityToSpawn);
			}
			if (world instanceof ServerLevel projectileLevel) {
				Projectile _entityToSpawn = new Object() {
					public Projectile getArrow(Level level, float damage, int knockback) {
						AbstractArrow entityToSpawn = new RocketPodProjectileEntity(HelldiversModEntities.ROCKET_POD_PROJECTILE.get(), level);
						entityToSpawn.setBaseDamage(damage);
						entityToSpawn.setKnockback(knockback);
						entityToSpawn.setSilent(true);
						entityToSpawn.setCritArrow(true);
						return entityToSpawn;
					}
				}.getArrow(projectileLevel, 5, 1);
				_entityToSpawn.setPos((x + Mth.nextInt(RandomSource.create(), -10, 10)), (y + 100), (z + Mth.nextInt(RandomSource.create(), -10, 10)));
				_entityToSpawn.shoot(0, (-1), 0, 4, 5);
				projectileLevel.addFreshEntity(_entityToSpawn);
			}
		});
		HelldiversMod.queueServerWork(150, () -> {
			if (world instanceof ServerLevel projectileLevel) {
				Projectile _entityToSpawn = new Object() {
					public Projectile getArrow(Level level, float damage, int knockback) {
						AbstractArrow entityToSpawn = new RocketPodProjectileEntity(HelldiversModEntities.ROCKET_POD_PROJECTILE.get(), level);
						entityToSpawn.setBaseDamage(damage);
						entityToSpawn.setKnockback(knockback);
						entityToSpawn.setSilent(true);
						entityToSpawn.setCritArrow(true);
						return entityToSpawn;
					}
				}.getArrow(projectileLevel, 5, 1);
				_entityToSpawn.setPos((x + Mth.nextInt(RandomSource.create(), -10, 10)), (y + 100), (z + Mth.nextInt(RandomSource.create(), -10, 10)));
				_entityToSpawn.shoot(0, (-1), 0, 4, 5);
				projectileLevel.addFreshEntity(_entityToSpawn);
			}
			if (world instanceof ServerLevel projectileLevel) {
				Projectile _entityToSpawn = new Object() {
					public Projectile getArrow(Level level, float damage, int knockback) {
						AbstractArrow entityToSpawn = new RocketPodProjectileEntity(HelldiversModEntities.ROCKET_POD_PROJECTILE.get(), level);
						entityToSpawn.setBaseDamage(damage);
						entityToSpawn.setKnockback(knockback);
						entityToSpawn.setSilent(true);
						entityToSpawn.setCritArrow(true);
						return entityToSpawn;
					}
				}.getArrow(projectileLevel, 5, 1);
				_entityToSpawn.setPos((x + Mth.nextInt(RandomSource.create(), -10, 10)), (y + 100), (z + Mth.nextInt(RandomSource.create(), -10, 10)));
				_entityToSpawn.shoot(0, (-1), 0, 4, 5);
				projectileLevel.addFreshEntity(_entityToSpawn);
			}
			if (world instanceof ServerLevel projectileLevel) {
				Projectile _entityToSpawn = new Object() {
					public Projectile getArrow(Level level, float damage, int knockback) {
						AbstractArrow entityToSpawn = new RocketPodProjectileEntity(HelldiversModEntities.ROCKET_POD_PROJECTILE.get(), level);
						entityToSpawn.setBaseDamage(damage);
						entityToSpawn.setKnockback(knockback);
						entityToSpawn.setSilent(true);
						entityToSpawn.setCritArrow(true);
						return entityToSpawn;
					}
				}.getArrow(projectileLevel, 5, 1);
				_entityToSpawn.setPos((x + Mth.nextInt(RandomSource.create(), -10, 10)), (y + 100), (z + Mth.nextInt(RandomSource.create(), -10, 10)));
				_entityToSpawn.shoot(0, (-1), 0, 4, 5);
				projectileLevel.addFreshEntity(_entityToSpawn);
			}
		});
		HelldiversMod.queueServerWork(190, () -> {
			if (world instanceof ServerLevel projectileLevel) {
				Projectile _entityToSpawn = new Object() {
					public Projectile getArrow(Level level, float damage, int knockback) {
						AbstractArrow entityToSpawn = new RocketPodProjectileEntity(HelldiversModEntities.ROCKET_POD_PROJECTILE.get(), level);
						entityToSpawn.setBaseDamage(damage);
						entityToSpawn.setKnockback(knockback);
						entityToSpawn.setSilent(true);
						entityToSpawn.setCritArrow(true);
						return entityToSpawn;
					}
				}.getArrow(projectileLevel, 5, 1);
				_entityToSpawn.setPos((x + Mth.nextInt(RandomSource.create(), -10, 10)), (y + 100), (z + Mth.nextInt(RandomSource.create(), -10, 10)));
				_entityToSpawn.shoot(0, (-1), 0, 4, 5);
				projectileLevel.addFreshEntity(_entityToSpawn);
			}
		});
		HelldiversMod.queueServerWork(230, () -> {
			if (world instanceof ServerLevel projectileLevel) {
				Projectile _entityToSpawn = new Object() {
					public Projectile getArrow(Level level, float damage, int knockback) {
						AbstractArrow entityToSpawn = new RocketPodProjectileEntity(HelldiversModEntities.ROCKET_POD_PROJECTILE.get(), level);
						entityToSpawn.setBaseDamage(damage);
						entityToSpawn.setKnockback(knockback);
						entityToSpawn.setSilent(true);
						entityToSpawn.setCritArrow(true);
						return entityToSpawn;
					}
				}.getArrow(projectileLevel, 5, 1);
				_entityToSpawn.setPos((x + Mth.nextInt(RandomSource.create(), -10, 10)), (y + 100), (z + Mth.nextInt(RandomSource.create(), -10, 10)));
				_entityToSpawn.shoot(0, (-1), 0, 4, 5);
				projectileLevel.addFreshEntity(_entityToSpawn);
			}
			if (world instanceof ServerLevel projectileLevel) {
				Projectile _entityToSpawn = new Object() {
					public Projectile getArrow(Level level, float damage, int knockback) {
						AbstractArrow entityToSpawn = new RocketPodProjectileEntity(HelldiversModEntities.ROCKET_POD_PROJECTILE.get(), level);
						entityToSpawn.setBaseDamage(damage);
						entityToSpawn.setKnockback(knockback);
						entityToSpawn.setSilent(true);
						entityToSpawn.setCritArrow(true);
						return entityToSpawn;
					}
				}.getArrow(projectileLevel, 5, 1);
				_entityToSpawn.setPos((x + Mth.nextInt(RandomSource.create(), -10, 10)), (y + 100), (z + Mth.nextInt(RandomSource.create(), -10, 10)));
				_entityToSpawn.shoot(0, (-1), 0, 4, 5);
				projectileLevel.addFreshEntity(_entityToSpawn);
			}
		});
		HelldiversMod.queueServerWork(270, () -> {
			if (world instanceof ServerLevel projectileLevel) {
				Projectile _entityToSpawn = new Object() {
					public Projectile getArrow(Level level, float damage, int knockback) {
						AbstractArrow entityToSpawn = new RocketPodProjectileEntity(HelldiversModEntities.ROCKET_POD_PROJECTILE.get(), level);
						entityToSpawn.setBaseDamage(damage);
						entityToSpawn.setKnockback(knockback);
						entityToSpawn.setSilent(true);
						entityToSpawn.setCritArrow(true);
						return entityToSpawn;
					}
				}.getArrow(projectileLevel, 5, 1);
				_entityToSpawn.setPos((x + Mth.nextInt(RandomSource.create(), -10, 10)), (y + 100), (z + Mth.nextInt(RandomSource.create(), -10, 10)));
				_entityToSpawn.shoot(0, (-1), 0, 4, 5);
				projectileLevel.addFreshEntity(_entityToSpawn);
			}
			if (world instanceof ServerLevel projectileLevel) {
				Projectile _entityToSpawn = new Object() {
					public Projectile getArrow(Level level, float damage, int knockback) {
						AbstractArrow entityToSpawn = new RocketPodProjectileEntity(HelldiversModEntities.ROCKET_POD_PROJECTILE.get(), level);
						entityToSpawn.setBaseDamage(damage);
						entityToSpawn.setKnockback(knockback);
						entityToSpawn.setSilent(true);
						entityToSpawn.setCritArrow(true);
						return entityToSpawn;
					}
				}.getArrow(projectileLevel, 5, 1);
				_entityToSpawn.setPos((x + Mth.nextInt(RandomSource.create(), -10, 10)), (y + 100), (z + Mth.nextInt(RandomSource.create(), -10, 10)));
				_entityToSpawn.shoot(0, (-1), 0, 4, 5);
				projectileLevel.addFreshEntity(_entityToSpawn);
			}
		});
		HelldiversMod.queueServerWork(310, () -> {
			if (world instanceof ServerLevel projectileLevel) {
				Projectile _entityToSpawn = new Object() {
					public Projectile getArrow(Level level, float damage, int knockback) {
						AbstractArrow entityToSpawn = new RocketPodProjectileEntity(HelldiversModEntities.ROCKET_POD_PROJECTILE.get(), level);
						entityToSpawn.setBaseDamage(damage);
						entityToSpawn.setKnockback(knockback);
						entityToSpawn.setSilent(true);
						entityToSpawn.setCritArrow(true);
						return entityToSpawn;
					}
				}.getArrow(projectileLevel, 5, 1);
				_entityToSpawn.setPos((x + Mth.nextInt(RandomSource.create(), -10, 10)), (y + 100), (z + Mth.nextInt(RandomSource.create(), -10, 10)));
				_entityToSpawn.shoot(0, (-1), 0, 4, 5);
				projectileLevel.addFreshEntity(_entityToSpawn);
			}
		});
		HelldiversMod.queueServerWork(350, () -> {
			if (world instanceof ServerLevel projectileLevel) {
				Projectile _entityToSpawn = new Object() {
					public Projectile getArrow(Level level, float damage, int knockback) {
						AbstractArrow entityToSpawn = new RocketPodProjectileEntity(HelldiversModEntities.ROCKET_POD_PROJECTILE.get(), level);
						entityToSpawn.setBaseDamage(damage);
						entityToSpawn.setKnockback(knockback);
						entityToSpawn.setSilent(true);
						entityToSpawn.setCritArrow(true);
						return entityToSpawn;
					}
				}.getArrow(projectileLevel, 5, 1);
				_entityToSpawn.setPos((x + Mth.nextInt(RandomSource.create(), -10, 10)), (y + 100), (z + Mth.nextInt(RandomSource.create(), -10, 10)));
				_entityToSpawn.shoot(0, (-1), 0, 4, 5);
				projectileLevel.addFreshEntity(_entityToSpawn);
			}
		});
		HelldiversMod.queueServerWork(390, () -> {
			if (world instanceof ServerLevel projectileLevel) {
				Projectile _entityToSpawn = new Object() {
					public Projectile getArrow(Level level, float damage, int knockback) {
						AbstractArrow entityToSpawn = new RocketPodProjectileEntity(HelldiversModEntities.ROCKET_POD_PROJECTILE.get(), level);
						entityToSpawn.setBaseDamage(damage);
						entityToSpawn.setKnockback(knockback);
						entityToSpawn.setSilent(true);
						entityToSpawn.setCritArrow(true);
						return entityToSpawn;
					}
				}.getArrow(projectileLevel, 5, 1);
				_entityToSpawn.setPos((x + Mth.nextInt(RandomSource.create(), -10, 10)), (y + 100), (z + Mth.nextInt(RandomSource.create(), -10, 10)));
				_entityToSpawn.shoot(0, (-1), 0, 4, 5);
				projectileLevel.addFreshEntity(_entityToSpawn);
			}
		});
		HelldiversMod.queueServerWork(430, () -> {
			if (world instanceof ServerLevel projectileLevel) {
				Projectile _entityToSpawn = new Object() {
					public Projectile getArrow(Level level, float damage, int knockback) {
						AbstractArrow entityToSpawn = new RocketPodProjectileEntity(HelldiversModEntities.ROCKET_POD_PROJECTILE.get(), level);
						entityToSpawn.setBaseDamage(damage);
						entityToSpawn.setKnockback(knockback);
						entityToSpawn.setSilent(true);
						entityToSpawn.setCritArrow(true);
						return entityToSpawn;
					}
				}.getArrow(projectileLevel, 5, 1);
				_entityToSpawn.setPos((x + Mth.nextInt(RandomSource.create(), -10, 10)), (y + 100), (z + Mth.nextInt(RandomSource.create(), -10, 10)));
				_entityToSpawn.shoot(0, (-1), 0, 4, 5);
				projectileLevel.addFreshEntity(_entityToSpawn);
			}
			if (world instanceof ServerLevel projectileLevel) {
				Projectile _entityToSpawn = new Object() {
					public Projectile getArrow(Level level, float damage, int knockback) {
						AbstractArrow entityToSpawn = new RocketPodProjectileEntity(HelldiversModEntities.ROCKET_POD_PROJECTILE.get(), level);
						entityToSpawn.setBaseDamage(damage);
						entityToSpawn.setKnockback(knockback);
						entityToSpawn.setSilent(true);
						entityToSpawn.setCritArrow(true);
						return entityToSpawn;
					}
				}.getArrow(projectileLevel, 5, 1);
				_entityToSpawn.setPos((x + Mth.nextInt(RandomSource.create(), -10, 10)), (y + 100), (z + Mth.nextInt(RandomSource.create(), -10, 10)));
				_entityToSpawn.shoot(0, (-1), 0, 4, 5);
				projectileLevel.addFreshEntity(_entityToSpawn);
			}
		});
		HelldiversMod.queueServerWork(470, () -> {
			if (world instanceof ServerLevel projectileLevel) {
				Projectile _entityToSpawn = new Object() {
					public Projectile getArrow(Level level, float damage, int knockback) {
						AbstractArrow entityToSpawn = new RocketPodProjectileEntity(HelldiversModEntities.ROCKET_POD_PROJECTILE.get(), level);
						entityToSpawn.setBaseDamage(damage);
						entityToSpawn.setKnockback(knockback);
						entityToSpawn.setSilent(true);
						entityToSpawn.setCritArrow(true);
						return entityToSpawn;
					}
				}.getArrow(projectileLevel, 5, 1);
				_entityToSpawn.setPos((x + Mth.nextInt(RandomSource.create(), -10, 10)), (y + 100), (z + Mth.nextInt(RandomSource.create(), -10, 10)));
				_entityToSpawn.shoot(0, (-1), 0, 4, 5);
				projectileLevel.addFreshEntity(_entityToSpawn);
			}
		});
		HelldiversMod.queueServerWork(510, () -> {
			if (world instanceof ServerLevel projectileLevel) {
				Projectile _entityToSpawn = new Object() {
					public Projectile getArrow(Level level, float damage, int knockback) {
						AbstractArrow entityToSpawn = new RocketPodProjectileEntity(HelldiversModEntities.ROCKET_POD_PROJECTILE.get(), level);
						entityToSpawn.setBaseDamage(damage);
						entityToSpawn.setKnockback(knockback);
						entityToSpawn.setSilent(true);
						entityToSpawn.setCritArrow(true);
						return entityToSpawn;
					}
				}.getArrow(projectileLevel, 5, 1);
				_entityToSpawn.setPos((x + Mth.nextInt(RandomSource.create(), -10, 10)), (y + 100), (z + Mth.nextInt(RandomSource.create(), -10, 10)));
				_entityToSpawn.shoot(0, (-1), 0, 4, 5);
				projectileLevel.addFreshEntity(_entityToSpawn);
			}
			if (world instanceof ServerLevel projectileLevel) {
				Projectile _entityToSpawn = new Object() {
					public Projectile getArrow(Level level, float damage, int knockback) {
						AbstractArrow entityToSpawn = new RocketPodProjectileEntity(HelldiversModEntities.ROCKET_POD_PROJECTILE.get(), level);
						entityToSpawn.setBaseDamage(damage);
						entityToSpawn.setKnockback(knockback);
						entityToSpawn.setSilent(true);
						entityToSpawn.setCritArrow(true);
						return entityToSpawn;
					}
				}.getArrow(projectileLevel, 5, 1);
				_entityToSpawn.setPos((x + Mth.nextInt(RandomSource.create(), -10, 10)), (y + 100), (z + Mth.nextInt(RandomSource.create(), -10, 10)));
				_entityToSpawn.shoot(0, (-1), 0, 4, 5);
				projectileLevel.addFreshEntity(_entityToSpawn);
			}
			if (world instanceof ServerLevel projectileLevel) {
				Projectile _entityToSpawn = new Object() {
					public Projectile getArrow(Level level, float damage, int knockback) {
						AbstractArrow entityToSpawn = new RocketPodProjectileEntity(HelldiversModEntities.ROCKET_POD_PROJECTILE.get(), level);
						entityToSpawn.setBaseDamage(damage);
						entityToSpawn.setKnockback(knockback);
						entityToSpawn.setSilent(true);
						entityToSpawn.setCritArrow(true);
						return entityToSpawn;
					}
				}.getArrow(projectileLevel, 5, 1);
				_entityToSpawn.setPos((x + Mth.nextInt(RandomSource.create(), -10, 10)), (y + 100), (z + Mth.nextInt(RandomSource.create(), -10, 10)));
				_entityToSpawn.shoot(0, (-1), 0, 4, 5);
				projectileLevel.addFreshEntity(_entityToSpawn);
			}
		});
		HelldiversMod.queueServerWork(550, () -> {
			if (world instanceof ServerLevel projectileLevel) {
				Projectile _entityToSpawn = new Object() {
					public Projectile getArrow(Level level, float damage, int knockback) {
						AbstractArrow entityToSpawn = new RocketPodProjectileEntity(HelldiversModEntities.ROCKET_POD_PROJECTILE.get(), level);
						entityToSpawn.setBaseDamage(damage);
						entityToSpawn.setKnockback(knockback);
						entityToSpawn.setSilent(true);
						entityToSpawn.setCritArrow(true);
						return entityToSpawn;
					}
				}.getArrow(projectileLevel, 5, 1);
				_entityToSpawn.setPos((x + Mth.nextInt(RandomSource.create(), -10, 10)), (y + 100), (z + Mth.nextInt(RandomSource.create(), -10, 10)));
				_entityToSpawn.shoot(0, (-1), 0, 4, 5);
				projectileLevel.addFreshEntity(_entityToSpawn);
			}
		});
		HelldiversMod.queueServerWork(590, () -> {
			if (world instanceof ServerLevel projectileLevel) {
				Projectile _entityToSpawn = new Object() {
					public Projectile getArrow(Level level, float damage, int knockback) {
						AbstractArrow entityToSpawn = new RocketPodProjectileEntity(HelldiversModEntities.ROCKET_POD_PROJECTILE.get(), level);
						entityToSpawn.setBaseDamage(damage);
						entityToSpawn.setKnockback(knockback);
						entityToSpawn.setSilent(true);
						entityToSpawn.setCritArrow(true);
						return entityToSpawn;
					}
				}.getArrow(projectileLevel, 5, 1);
				_entityToSpawn.setPos((x + Mth.nextInt(RandomSource.create(), -10, 10)), (y + 100), (z + Mth.nextInt(RandomSource.create(), -10, 10)));
				_entityToSpawn.shoot(0, (-1), 0, 4, 5);
				projectileLevel.addFreshEntity(_entityToSpawn);
			}
		});
	}
}
