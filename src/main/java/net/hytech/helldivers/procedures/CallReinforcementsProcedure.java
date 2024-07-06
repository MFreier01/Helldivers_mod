package net.hytech.helldivers.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;

import net.hytech.helldivers.init.HelldiversModParticleTypes;
import net.hytech.helldivers.init.HelldiversModEntities;
import net.hytech.helldivers.entity.HellpodProjectileEntity;
import net.hytech.helldivers.HelldiversMod;

public class CallReinforcementsProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (HelldiversModParticleTypes.BLUE_BEAM.get()), x, y, z, 6000, 0.1, 200, 0.1, 0);
		HelldiversMod.queueServerWork(100, () -> {
			if (world instanceof ServerLevel projectileLevel) {
				Projectile _entityToSpawn = new Object() {
					public Projectile getArrow(Level level, float damage, int knockback) {
						AbstractArrow entityToSpawn = new HellpodProjectileEntity(HelldiversModEntities.HELLPOD_PROJECTILE.get(), level);
						entityToSpawn.setBaseDamage(damage);
						entityToSpawn.setKnockback(knockback);
						entityToSpawn.setSilent(true);
						return entityToSpawn;
					}
				}.getArrow(projectileLevel, 20, 1);
				_entityToSpawn.setPos(x, (y + 100), z);
				_entityToSpawn.shoot(0, (-1), 0, 1, 0);
				projectileLevel.addFreshEntity(_entityToSpawn);
			}
		});
	}
}
