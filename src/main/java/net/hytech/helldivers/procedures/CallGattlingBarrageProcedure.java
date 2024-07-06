package net.hytech.helldivers.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;

import net.hytech.helldivers.init.HelldiversModParticleTypes;
import net.hytech.helldivers.init.HelldiversModEntities;
import net.hytech.helldivers.entity.GattlingProjectileEntity;
import net.hytech.helldivers.HelldiversMod;

public class CallGattlingBarrageProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (HelldiversModParticleTypes.RED_BEAM.get()), x, y, z, 6000, 0.1, 200, 0.1, 0);
		if ((entity.getPersistentData().getString("ActiveStratagem")).equals("OrbitalGattlingBarrage")) {
			HelldiversMod.queueServerWork(70, () -> {
				if (world instanceof ServerLevel projectileLevel) {
					Projectile _entityToSpawn = new Object() {
						public Projectile getArrow(Level level, float damage, int knockback) {
							AbstractArrow entityToSpawn = new GattlingProjectileEntity(HelldiversModEntities.GATTLING_PROJECTILE.get(), level);
							entityToSpawn.setBaseDamage(damage);
							entityToSpawn.setKnockback(knockback);
							entityToSpawn.setSilent(true);
							return entityToSpawn;
						}
					}.getArrow(projectileLevel, 5, 1);
					_entityToSpawn.setPos((x + 0), (y + 100), (z + 0));
					_entityToSpawn.shoot(0, (-1), 0, 10, 1);
					projectileLevel.addFreshEntity(_entityToSpawn);
				}
			});
			HelldiversMod.queueServerWork(80, () -> {
				if (world instanceof ServerLevel projectileLevel) {
					Projectile _entityToSpawn = new Object() {
						public Projectile getArrow(Level level, float damage, int knockback) {
							AbstractArrow entityToSpawn = new GattlingProjectileEntity(HelldiversModEntities.GATTLING_PROJECTILE.get(), level);
							entityToSpawn.setBaseDamage(damage);
							entityToSpawn.setKnockback(knockback);
							entityToSpawn.setSilent(true);
							return entityToSpawn;
						}
					}.getArrow(projectileLevel, 5, 1);
					_entityToSpawn.setPos((x + 1), (y + 100), (z + 1));
					_entityToSpawn.shoot(0, (-1), 0, 10, 1);
					projectileLevel.addFreshEntity(_entityToSpawn);
				}
			});
			HelldiversMod.queueServerWork(90, () -> {
				if (world instanceof ServerLevel projectileLevel) {
					Projectile _entityToSpawn = new Object() {
						public Projectile getArrow(Level level, float damage, int knockback) {
							AbstractArrow entityToSpawn = new GattlingProjectileEntity(HelldiversModEntities.GATTLING_PROJECTILE.get(), level);
							entityToSpawn.setBaseDamage(damage);
							entityToSpawn.setKnockback(knockback);
							entityToSpawn.setSilent(true);
							return entityToSpawn;
						}
					}.getArrow(projectileLevel, 5, 1);
					_entityToSpawn.setPos((x + 0), (y + 100), (z + 1));
					_entityToSpawn.shoot(0, (-1), 0, 10, 1);
					projectileLevel.addFreshEntity(_entityToSpawn);
				}
			});
			HelldiversMod.queueServerWork(100, () -> {
				if (world instanceof ServerLevel projectileLevel) {
					Projectile _entityToSpawn = new Object() {
						public Projectile getArrow(Level level, float damage, int knockback) {
							AbstractArrow entityToSpawn = new GattlingProjectileEntity(HelldiversModEntities.GATTLING_PROJECTILE.get(), level);
							entityToSpawn.setBaseDamage(damage);
							entityToSpawn.setKnockback(knockback);
							entityToSpawn.setSilent(true);
							return entityToSpawn;
						}
					}.getArrow(projectileLevel, 5, 1);
					_entityToSpawn.setPos((x + -1), (y + 100), (z + 1));
					_entityToSpawn.shoot(0, (-1), 0, 10, 1);
					projectileLevel.addFreshEntity(_entityToSpawn);
				}
			});
			HelldiversMod.queueServerWork(110, () -> {
				if (world instanceof ServerLevel projectileLevel) {
					Projectile _entityToSpawn = new Object() {
						public Projectile getArrow(Level level, float damage, int knockback) {
							AbstractArrow entityToSpawn = new GattlingProjectileEntity(HelldiversModEntities.GATTLING_PROJECTILE.get(), level);
							entityToSpawn.setBaseDamage(damage);
							entityToSpawn.setKnockback(knockback);
							entityToSpawn.setSilent(true);
							return entityToSpawn;
						}
					}.getArrow(projectileLevel, 5, 1);
					_entityToSpawn.setPos((x + -1), (y + 100), (z + 0));
					_entityToSpawn.shoot(0, (-1), 0, 10, 1);
					projectileLevel.addFreshEntity(_entityToSpawn);
				}
			});
			HelldiversMod.queueServerWork(120, () -> {
				if (world instanceof ServerLevel projectileLevel) {
					Projectile _entityToSpawn = new Object() {
						public Projectile getArrow(Level level, float damage, int knockback) {
							AbstractArrow entityToSpawn = new GattlingProjectileEntity(HelldiversModEntities.GATTLING_PROJECTILE.get(), level);
							entityToSpawn.setBaseDamage(damage);
							entityToSpawn.setKnockback(knockback);
							entityToSpawn.setSilent(true);
							return entityToSpawn;
						}
					}.getArrow(projectileLevel, 5, 1);
					_entityToSpawn.setPos((x + -1), (y + 100), (z + -1));
					_entityToSpawn.shoot(0, (-1), 0, 10, 1);
					projectileLevel.addFreshEntity(_entityToSpawn);
				}
			});
			HelldiversMod.queueServerWork(130, () -> {
				if (world instanceof ServerLevel projectileLevel) {
					Projectile _entityToSpawn = new Object() {
						public Projectile getArrow(Level level, float damage, int knockback) {
							AbstractArrow entityToSpawn = new GattlingProjectileEntity(HelldiversModEntities.GATTLING_PROJECTILE.get(), level);
							entityToSpawn.setBaseDamage(damage);
							entityToSpawn.setKnockback(knockback);
							entityToSpawn.setSilent(true);
							return entityToSpawn;
						}
					}.getArrow(projectileLevel, 5, 1);
					_entityToSpawn.setPos((x + 0), (y + 100), (z + -1));
					_entityToSpawn.shoot(0, (-1), 0, 10, 1);
					projectileLevel.addFreshEntity(_entityToSpawn);
				}
			});
			HelldiversMod.queueServerWork(140, () -> {
				if (world instanceof ServerLevel projectileLevel) {
					Projectile _entityToSpawn = new Object() {
						public Projectile getArrow(Level level, float damage, int knockback) {
							AbstractArrow entityToSpawn = new GattlingProjectileEntity(HelldiversModEntities.GATTLING_PROJECTILE.get(), level);
							entityToSpawn.setBaseDamage(damage);
							entityToSpawn.setKnockback(knockback);
							entityToSpawn.setSilent(true);
							return entityToSpawn;
						}
					}.getArrow(projectileLevel, 5, 1);
					_entityToSpawn.setPos((x + 1), (y + 100), (z + -1));
					_entityToSpawn.shoot(0, (-1), 0, 10, 1);
					projectileLevel.addFreshEntity(_entityToSpawn);
				}
			});
			HelldiversMod.queueServerWork(150, () -> {
				if (world instanceof ServerLevel projectileLevel) {
					Projectile _entityToSpawn = new Object() {
						public Projectile getArrow(Level level, float damage, int knockback) {
							AbstractArrow entityToSpawn = new GattlingProjectileEntity(HelldiversModEntities.GATTLING_PROJECTILE.get(), level);
							entityToSpawn.setBaseDamage(damage);
							entityToSpawn.setKnockback(knockback);
							entityToSpawn.setSilent(true);
							return entityToSpawn;
						}
					}.getArrow(projectileLevel, 5, 1);
					_entityToSpawn.setPos((x + 2), (y + 100), (z + 1));
					_entityToSpawn.shoot(0, (-1), 0, 10, 1);
					projectileLevel.addFreshEntity(_entityToSpawn);
				}
			});
			HelldiversMod.queueServerWork(160, () -> {
				if (world instanceof ServerLevel projectileLevel) {
					Projectile _entityToSpawn = new Object() {
						public Projectile getArrow(Level level, float damage, int knockback) {
							AbstractArrow entityToSpawn = new GattlingProjectileEntity(HelldiversModEntities.GATTLING_PROJECTILE.get(), level);
							entityToSpawn.setBaseDamage(damage);
							entityToSpawn.setKnockback(knockback);
							entityToSpawn.setSilent(true);
							return entityToSpawn;
						}
					}.getArrow(projectileLevel, 5, 1);
					_entityToSpawn.setPos((x + 2), (y + 100), (z + 2));
					_entityToSpawn.shoot(0, (-1), 0, 10, 1);
					projectileLevel.addFreshEntity(_entityToSpawn);
				}
			});
			HelldiversMod.queueServerWork(170, () -> {
				if (world instanceof ServerLevel projectileLevel) {
					Projectile _entityToSpawn = new Object() {
						public Projectile getArrow(Level level, float damage, int knockback) {
							AbstractArrow entityToSpawn = new GattlingProjectileEntity(HelldiversModEntities.GATTLING_PROJECTILE.get(), level);
							entityToSpawn.setBaseDamage(damage);
							entityToSpawn.setKnockback(knockback);
							entityToSpawn.setSilent(true);
							return entityToSpawn;
						}
					}.getArrow(projectileLevel, 5, 1);
					_entityToSpawn.setPos((x + 1), (y + 100), (z + 2));
					_entityToSpawn.shoot(0, (-1), 0, 10, 1);
					projectileLevel.addFreshEntity(_entityToSpawn);
				}
			});
			HelldiversMod.queueServerWork(180, () -> {
				if (world instanceof ServerLevel projectileLevel) {
					Projectile _entityToSpawn = new Object() {
						public Projectile getArrow(Level level, float damage, int knockback) {
							AbstractArrow entityToSpawn = new GattlingProjectileEntity(HelldiversModEntities.GATTLING_PROJECTILE.get(), level);
							entityToSpawn.setBaseDamage(damage);
							entityToSpawn.setKnockback(knockback);
							entityToSpawn.setSilent(true);
							return entityToSpawn;
						}
					}.getArrow(projectileLevel, 5, 1);
					_entityToSpawn.setPos((x + 0), (y + 100), (z + 2));
					_entityToSpawn.shoot(0, (-1), 0, 10, 1);
					projectileLevel.addFreshEntity(_entityToSpawn);
				}
			});
			HelldiversMod.queueServerWork(190, () -> {
				if (world instanceof ServerLevel projectileLevel) {
					Projectile _entityToSpawn = new Object() {
						public Projectile getArrow(Level level, float damage, int knockback) {
							AbstractArrow entityToSpawn = new GattlingProjectileEntity(HelldiversModEntities.GATTLING_PROJECTILE.get(), level);
							entityToSpawn.setBaseDamage(damage);
							entityToSpawn.setKnockback(knockback);
							entityToSpawn.setSilent(true);
							return entityToSpawn;
						}
					}.getArrow(projectileLevel, 5, 1);
					_entityToSpawn.setPos((x + -1), (y + 100), (z + 2));
					_entityToSpawn.shoot(0, (-1), 0, 10, 1);
					projectileLevel.addFreshEntity(_entityToSpawn);
				}
			});
			HelldiversMod.queueServerWork(200, () -> {
				if (world instanceof ServerLevel projectileLevel) {
					Projectile _entityToSpawn = new Object() {
						public Projectile getArrow(Level level, float damage, int knockback) {
							AbstractArrow entityToSpawn = new GattlingProjectileEntity(HelldiversModEntities.GATTLING_PROJECTILE.get(), level);
							entityToSpawn.setBaseDamage(damage);
							entityToSpawn.setKnockback(knockback);
							entityToSpawn.setSilent(true);
							return entityToSpawn;
						}
					}.getArrow(projectileLevel, 5, 1);
					_entityToSpawn.setPos((x + -2), (y + 100), (z + 2));
					_entityToSpawn.shoot(0, (-1), 0, 10, 1);
					projectileLevel.addFreshEntity(_entityToSpawn);
				}
			});
		}
		entity.getPersistentData().putString("ActiveStratagem", "None");
	}
}
