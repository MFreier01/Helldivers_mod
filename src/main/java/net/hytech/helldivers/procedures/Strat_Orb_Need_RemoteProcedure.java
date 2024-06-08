package net.hytech.helldivers.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;

import net.hytech.helldivers.init.HelldiversModItems;
import net.hytech.helldivers.init.HelldiversModEntities;
import net.hytech.helldivers.entity.EmptyStratagemOrbProjectileEntity;

public class Strat_Orb_Need_RemoteProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (!((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == HelldiversModItems.STRATAGEM_REMOTE.get())) {
			if (world instanceof ServerLevel projectileLevel) {
				Projectile _entityToSpawn = new Object() {
					public Projectile getArrow(Level level, float damage, int knockback) {
						AbstractArrow entityToSpawn = new EmptyStratagemOrbProjectileEntity(HelldiversModEntities.EMPTY_STRATAGEM_ORB_PROJECTILE.get(), level);
						entityToSpawn.setBaseDamage(damage);
						entityToSpawn.setKnockback(knockback);
						entityToSpawn.setSilent(true);
						return entityToSpawn;
					}
				}.getArrow(projectileLevel, 1, 1);
				_entityToSpawn.setPos(x, y, z);
				_entityToSpawn.shoot(1, 1, 1, 5, 0);
				projectileLevel.addFreshEntity(_entityToSpawn);
			}
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(HelldiversModItems.EMPTY_STRATAGEMORB.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
		}
	}
}
