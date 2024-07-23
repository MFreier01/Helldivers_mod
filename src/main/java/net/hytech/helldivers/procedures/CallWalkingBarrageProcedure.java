package net.hytech.helldivers.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;

import net.hytech.helldivers.init.HelldiversModParticleTypes;
import net.hytech.helldivers.init.HelldiversModEntities;
import net.hytech.helldivers.entity.RocketPodProjectileEntity;
import net.hytech.helldivers.entity.Orbital380mmprojectileEntity;
import net.hytech.helldivers.HelldiversMod;

public class CallWalkingBarrageProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (HelldiversModParticleTypes.RED_BEAM.get()), x, y, z, 6000, 0.1, 200, 0.1, 0);
		HelldiversMod.queueServerWork(70, () -> {
			HelldiversMod.queueServerWork(120, () -> {
				if (world instanceof ServerLevel projectileLevel) {
					Projectile _entityToSpawn = new Object() {
						public Projectile getArrow(Level level, float damage, int knockback) {
							AbstractArrow entityToSpawn = new Orbital380mmprojectileEntity(HelldiversModEntities.ORBITAL_380MMPROJECTILE.get(), level);
							entityToSpawn.setBaseDamage(damage);
							entityToSpawn.setKnockback(knockback);
							entityToSpawn.setSilent(true);
							entityToSpawn.setCritArrow(true);
							return entityToSpawn;
						}
					}.getArrow(projectileLevel, 5, 1);
					_entityToSpawn.setPos((x + 70), (y + 100), (z + -28));
					_entityToSpawn.shoot((-1), (-1), 1, 4, 1);
					projectileLevel.addFreshEntity(_entityToSpawn);
				}
				if (world instanceof ServerLevel projectileLevel) {
					Projectile _entityToSpawn = new Object() {
						public Projectile getArrow(Level level, float damage, int knockback) {
							AbstractArrow entityToSpawn = new Orbital380mmprojectileEntity(HelldiversModEntities.ORBITAL_380MMPROJECTILE.get(), level);
							entityToSpawn.setBaseDamage(damage);
							entityToSpawn.setKnockback(knockback);
							entityToSpawn.setSilent(true);
							entityToSpawn.setCritArrow(true);
							return entityToSpawn;
						}
					}.getArrow(projectileLevel, 5, 1);
					_entityToSpawn.setPos((x + 71), (y + 100), (z + -35));
					_entityToSpawn.shoot((-1), (-1), 1, 4, 1);
					projectileLevel.addFreshEntity(_entityToSpawn);
				}
			});
			HelldiversMod.queueServerWork(110, () -> {
				if (world instanceof ServerLevel projectileLevel) {
					Projectile _entityToSpawn = new Object() {
						public Projectile getArrow(Level level, float damage, int knockback) {
							AbstractArrow entityToSpawn = new Orbital380mmprojectileEntity(HelldiversModEntities.ORBITAL_380MMPROJECTILE.get(), level);
							entityToSpawn.setBaseDamage(damage);
							entityToSpawn.setKnockback(knockback);
							entityToSpawn.setSilent(true);
							entityToSpawn.setCritArrow(true);
							return entityToSpawn;
						}
					}.getArrow(projectileLevel, 5, 1);
					_entityToSpawn.setPos((x + 71), (y + 100), (z + -37));
					_entityToSpawn.shoot((-1), (-1), 1, 4, 1);
					projectileLevel.addFreshEntity(_entityToSpawn);
				}
			});
			HelldiversMod.queueServerWork(100, () -> {
				if (world instanceof ServerLevel projectileLevel) {
					Projectile _entityToSpawn = new Object() {
						public Projectile getArrow(Level level, float damage, int knockback) {
							AbstractArrow entityToSpawn = new Orbital380mmprojectileEntity(HelldiversModEntities.ORBITAL_380MMPROJECTILE.get(), level);
							entityToSpawn.setBaseDamage(damage);
							entityToSpawn.setKnockback(knockback);
							entityToSpawn.setSilent(true);
							entityToSpawn.setCritArrow(true);
							return entityToSpawn;
						}
					}.getArrow(projectileLevel, 5, 1);
					_entityToSpawn.setPos((x + 71), (y + 100), (z + -39));
					_entityToSpawn.shoot((-1), (-1), 1, 4, 1);
					projectileLevel.addFreshEntity(_entityToSpawn);
				}
				if (world instanceof ServerLevel projectileLevel) {
					Projectile _entityToSpawn = new Object() {
						public Projectile getArrow(Level level, float damage, int knockback) {
							AbstractArrow entityToSpawn = new Orbital380mmprojectileEntity(HelldiversModEntities.ORBITAL_380MMPROJECTILE.get(), level);
							entityToSpawn.setBaseDamage(damage);
							entityToSpawn.setKnockback(knockback);
							entityToSpawn.setSilent(true);
							entityToSpawn.setCritArrow(true);
							return entityToSpawn;
						}
					}.getArrow(projectileLevel, 5, 1);
					_entityToSpawn.setPos((x + 70), (y + 100), (z + -40));
					_entityToSpawn.shoot((-1), (-1), 1, 4, 1);
					projectileLevel.addFreshEntity(_entityToSpawn);
				}
			});
			HelldiversMod.queueServerWork(80, () -> {
				if (world instanceof ServerLevel projectileLevel) {
					Projectile _entityToSpawn = new Object() {
						public Projectile getArrow(Level level, float damage, int knockback) {
							AbstractArrow entityToSpawn = new Orbital380mmprojectileEntity(HelldiversModEntities.ORBITAL_380MMPROJECTILE.get(), level);
							entityToSpawn.setBaseDamage(damage);
							entityToSpawn.setKnockback(knockback);
							entityToSpawn.setSilent(true);
							entityToSpawn.setCritArrow(true);
							return entityToSpawn;
						}
					}.getArrow(projectileLevel, 5, 1);
					_entityToSpawn.setPos((x + 71), (y + 100), (z + -39));
					_entityToSpawn.shoot((-1), (-1), 1, 4, 1);
					projectileLevel.addFreshEntity(_entityToSpawn);
				}
				if (world instanceof ServerLevel projectileLevel) {
					Projectile _entityToSpawn = new Object() {
						public Projectile getArrow(Level level, float damage, int knockback) {
							AbstractArrow entityToSpawn = new Orbital380mmprojectileEntity(HelldiversModEntities.ORBITAL_380MMPROJECTILE.get(), level);
							entityToSpawn.setBaseDamage(damage);
							entityToSpawn.setKnockback(knockback);
							entityToSpawn.setSilent(true);
							entityToSpawn.setCritArrow(true);
							return entityToSpawn;
						}
					}.getArrow(projectileLevel, 5, 1);
					_entityToSpawn.setPos((x + 70), (y + 100), (z + -40));
					_entityToSpawn.shoot((-1), (-1), 1, 4, 1);
					projectileLevel.addFreshEntity(_entityToSpawn);
				}
			});
			HelldiversMod.queueServerWork(75, () -> {
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
					_entityToSpawn.setPos((x + 69), (y + 100), (z + -42));
					_entityToSpawn.shoot((-1), (-1), 1, 4, 1);
					projectileLevel.addFreshEntity(_entityToSpawn);
				}
			});
			HelldiversMod.queueServerWork(70, () -> {
				if (world instanceof ServerLevel projectileLevel) {
					Projectile _entityToSpawn = new Object() {
						public Projectile getArrow(Level level, float damage, int knockback) {
							AbstractArrow entityToSpawn = new Orbital380mmprojectileEntity(HelldiversModEntities.ORBITAL_380MMPROJECTILE.get(), level);
							entityToSpawn.setBaseDamage(damage);
							entityToSpawn.setKnockback(knockback);
							entityToSpawn.setSilent(true);
							entityToSpawn.setCritArrow(true);
							return entityToSpawn;
						}
					}.getArrow(projectileLevel, 5, 1);
					_entityToSpawn.setPos((x + 73), (y + 100), (z + -45));
					_entityToSpawn.shoot((-1), (-1), 1, 4, 1);
					projectileLevel.addFreshEntity(_entityToSpawn);
				}
			});
			HelldiversMod.queueServerWork(60, () -> {
				if (world instanceof ServerLevel projectileLevel) {
					Projectile _entityToSpawn = new Object() {
						public Projectile getArrow(Level level, float damage, int knockback) {
							AbstractArrow entityToSpawn = new Orbital380mmprojectileEntity(HelldiversModEntities.ORBITAL_380MMPROJECTILE.get(), level);
							entityToSpawn.setBaseDamage(damage);
							entityToSpawn.setKnockback(knockback);
							entityToSpawn.setSilent(true);
							entityToSpawn.setCritArrow(true);
							return entityToSpawn;
						}
					}.getArrow(projectileLevel, 5, 1);
					_entityToSpawn.setPos((x + 72), (y + 100), (z + -47));
					_entityToSpawn.shoot((-1), (-1), 1, 4, 1);
					projectileLevel.addFreshEntity(_entityToSpawn);
				}
			});
			HelldiversMod.queueServerWork(55, () -> {
				if (world instanceof ServerLevel projectileLevel) {
					Projectile _entityToSpawn = new Object() {
						public Projectile getArrow(Level level, float damage, int knockback) {
							AbstractArrow entityToSpawn = new Orbital380mmprojectileEntity(HelldiversModEntities.ORBITAL_380MMPROJECTILE.get(), level);
							entityToSpawn.setBaseDamage(damage);
							entityToSpawn.setKnockback(knockback);
							entityToSpawn.setSilent(true);
							entityToSpawn.setCritArrow(true);
							return entityToSpawn;
						}
					}.getArrow(projectileLevel, 5, 1);
					_entityToSpawn.setPos((x + 70), (y + 100), (z + -48));
					_entityToSpawn.shoot((-1), (-1), 1, 4, 1);
					projectileLevel.addFreshEntity(_entityToSpawn);
				}
				if (world instanceof ServerLevel projectileLevel) {
					Projectile _entityToSpawn = new Object() {
						public Projectile getArrow(Level level, float damage, int knockback) {
							AbstractArrow entityToSpawn = new Orbital380mmprojectileEntity(HelldiversModEntities.ORBITAL_380MMPROJECTILE.get(), level);
							entityToSpawn.setBaseDamage(damage);
							entityToSpawn.setKnockback(knockback);
							entityToSpawn.setSilent(true);
							entityToSpawn.setCritArrow(true);
							return entityToSpawn;
						}
					}.getArrow(projectileLevel, 5, 1);
					_entityToSpawn.setPos((x + 75), (y + 100), (z + -50));
					_entityToSpawn.shoot((-1), (-1), 1, 4, 1);
					projectileLevel.addFreshEntity(_entityToSpawn);
				}
			});
			HelldiversMod.queueServerWork(50, () -> {
				if (world instanceof ServerLevel projectileLevel) {
					Projectile _entityToSpawn = new Object() {
						public Projectile getArrow(Level level, float damage, int knockback) {
							AbstractArrow entityToSpawn = new Orbital380mmprojectileEntity(HelldiversModEntities.ORBITAL_380MMPROJECTILE.get(), level);
							entityToSpawn.setBaseDamage(damage);
							entityToSpawn.setKnockback(knockback);
							entityToSpawn.setSilent(true);
							entityToSpawn.setCritArrow(true);
							return entityToSpawn;
						}
					}.getArrow(projectileLevel, 5, 1);
					_entityToSpawn.setPos((x + 71), (y + 100), (z + -51));
					_entityToSpawn.shoot((-1), (-1), 1, 4, 1);
					projectileLevel.addFreshEntity(_entityToSpawn);
				}
			});
			HelldiversMod.queueServerWork(40, () -> {
				if (world instanceof ServerLevel projectileLevel) {
					Projectile _entityToSpawn = new Object() {
						public Projectile getArrow(Level level, float damage, int knockback) {
							AbstractArrow entityToSpawn = new Orbital380mmprojectileEntity(HelldiversModEntities.ORBITAL_380MMPROJECTILE.get(), level);
							entityToSpawn.setBaseDamage(damage);
							entityToSpawn.setKnockback(knockback);
							entityToSpawn.setSilent(true);
							entityToSpawn.setCritArrow(true);
							return entityToSpawn;
						}
					}.getArrow(projectileLevel, 5, 1);
					_entityToSpawn.setPos((x + 68), (y + 100), (z + -53));
					_entityToSpawn.shoot((-1), (-1), 1, 4, 1);
					projectileLevel.addFreshEntity(_entityToSpawn);
				}
				if (world instanceof ServerLevel projectileLevel) {
					Projectile _entityToSpawn = new Object() {
						public Projectile getArrow(Level level, float damage, int knockback) {
							AbstractArrow entityToSpawn = new Orbital380mmprojectileEntity(HelldiversModEntities.ORBITAL_380MMPROJECTILE.get(), level);
							entityToSpawn.setBaseDamage(damage);
							entityToSpawn.setKnockback(knockback);
							entityToSpawn.setSilent(true);
							entityToSpawn.setCritArrow(true);
							return entityToSpawn;
						}
					}.getArrow(projectileLevel, 5, 1);
					_entityToSpawn.setPos((x + 69), (y + 100), (z + -55));
					_entityToSpawn.shoot((-1), (-1), 1, 4, 1);
					projectileLevel.addFreshEntity(_entityToSpawn);
				}
			});
			HelldiversMod.queueServerWork(25, () -> {
				if (world instanceof ServerLevel projectileLevel) {
					Projectile _entityToSpawn = new Object() {
						public Projectile getArrow(Level level, float damage, int knockback) {
							AbstractArrow entityToSpawn = new Orbital380mmprojectileEntity(HelldiversModEntities.ORBITAL_380MMPROJECTILE.get(), level);
							entityToSpawn.setBaseDamage(damage);
							entityToSpawn.setKnockback(knockback);
							entityToSpawn.setSilent(true);
							entityToSpawn.setCritArrow(true);
							return entityToSpawn;
						}
					}.getArrow(projectileLevel, 5, 1);
					_entityToSpawn.setPos((x + 73), (y + 100), (z + 57));
					_entityToSpawn.shoot((-1), (-1), 1, 4, 1);
					projectileLevel.addFreshEntity(_entityToSpawn);
				}
			});
			HelldiversMod.queueServerWork(10, () -> {
				if (world instanceof ServerLevel projectileLevel) {
					Projectile _entityToSpawn = new Object() {
						public Projectile getArrow(Level level, float damage, int knockback) {
							AbstractArrow entityToSpawn = new Orbital380mmprojectileEntity(HelldiversModEntities.ORBITAL_380MMPROJECTILE.get(), level);
							entityToSpawn.setBaseDamage(damage);
							entityToSpawn.setKnockback(knockback);
							entityToSpawn.setSilent(true);
							entityToSpawn.setCritArrow(true);
							return entityToSpawn;
						}
					}.getArrow(projectileLevel, 5, 1);
					_entityToSpawn.setPos((x + 72), (y + 100), (z + -58));
					_entityToSpawn.shoot((-1), (-1), 1, 4, 1);
					projectileLevel.addFreshEntity(_entityToSpawn);
				}
			});
			HelldiversMod.queueServerWork(2, () -> {
				if (world instanceof ServerLevel projectileLevel) {
					Projectile _entityToSpawn = new Object() {
						public Projectile getArrow(Level level, float damage, int knockback) {
							AbstractArrow entityToSpawn = new Orbital380mmprojectileEntity(HelldiversModEntities.ORBITAL_380MMPROJECTILE.get(), level);
							entityToSpawn.setBaseDamage(damage);
							entityToSpawn.setKnockback(knockback);
							entityToSpawn.setSilent(true);
							entityToSpawn.setCritArrow(true);
							return entityToSpawn;
						}
					}.getArrow(projectileLevel, 5, 1);
					_entityToSpawn.setPos((x + 70), (y + 100), (z + -60));
					_entityToSpawn.shoot((-1), (-1), 1, 4, 1);
					projectileLevel.addFreshEntity(_entityToSpawn);
				}
			});
		});
	}
}
