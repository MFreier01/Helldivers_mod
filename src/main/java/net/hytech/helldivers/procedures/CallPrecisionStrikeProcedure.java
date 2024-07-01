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
import net.hytech.helldivers.entity.PrecisionStrikeEntity;
import net.hytech.helldivers.HelldiversMod;

public class CallPrecisionStrikeProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (HelldiversModParticleTypes.RED_BEAM.get()), x, y, z, 6000, 0.1, 200, 0.1, 0);
		if ((entity.getPersistentData().getString("ActiveStratagem")).equals("PrecisionStrike")) {
			HelldiversMod.queueServerWork(120, () -> {
				if (world instanceof ServerLevel projectileLevel) {
					Projectile _entityToSpawn = new Object() {
						public Projectile getArrow(Level level, float damage, int knockback) {
							AbstractArrow entityToSpawn = new PrecisionStrikeEntity(HelldiversModEntities.PRECISION_STRIKE.get(), level);
							entityToSpawn.setBaseDamage(damage);
							entityToSpawn.setKnockback(knockback);
							entityToSpawn.setSilent(true);
							entityToSpawn.setCritArrow(true);
							return entityToSpawn;
						}
					}.getArrow(projectileLevel, 5, 1);
					_entityToSpawn.setPos(x, (y + 100), z);
					_entityToSpawn.shoot(0, (-1), 0, 10, 0);
					projectileLevel.addFreshEntity(_entityToSpawn);
				}
			});
		}
		entity.getPersistentData().putString("ActiveStratagem", "None");
	}
}
