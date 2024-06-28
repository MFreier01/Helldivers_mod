package net.hytech.helldivers.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.hytech.helldivers.init.HelldiversModItems;

public class GunFireProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (HelldiversModItems.AR_23_LIBERATOR.get() == (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem()) {
			AR23LiberatorFireProcedure.execute(world, x, y, z, entity);
		}
		if (HelldiversModItems.SG_225_BREAKER.get() == (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem()) {
			SG225BreakerFireProcedure.execute(world, x, y, z, entity);
		}
		if (HelldiversModItems.M_105_STALWART.get() == (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem()) {
			M105StalwartFireProcedure.execute(world, x, y, z, entity);
		}
		if (HelldiversModItems.APW_1_ANTI_MATERIAL_RIFLE.get() == (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem()) {
			APW1AntiMaterialRifleFireProcedure.execute(world, x, y, z, entity);
		}
	}
}
