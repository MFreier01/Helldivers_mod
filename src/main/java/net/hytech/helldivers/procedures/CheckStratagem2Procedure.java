package net.hytech.helldivers.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.hytech.helldivers.init.HelldiversModItems;

import java.util.function.Supplier;
import java.util.Map;

public class CheckStratagem2Procedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY).getItem() == HelldiversModItems.EAGLE_AIR_STRIKE
				.get()) {
			AddEagleAirStrikeProcedure.execute(entity);
		}
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY).getItem() == HelldiversModItems.EAGLE_500_KG.get()) {
			Add500KGProcedure.execute(entity);
		}
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY)
				.getItem() == HelldiversModItems.ORBITAL_RAIL_CANNON_STRIKE.get()) {
			AddRailCannonStrikeProcedure.execute(entity);
		}
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY).getItem() == HelldiversModItems.ORBITAL_PRECISION_STRIKE
				.get()) {
			AddPrecisionStrikeProcedure.execute(entity);
		}
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY).getItem() == HelldiversModItems.EAGLE_STRAFING_RUN
				.get()) {
			AddStrafingRunProcedure.execute(entity);
		}
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY).getItem() == HelldiversModItems.ORBITAL_LASER_ITEM
				.get()) {
			AddOrbitalLaserProcedure.execute(entity);
		}
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY).getItem() == HelldiversModItems.ORBITAL_AIRBURST
				.get()) {
			AddOrbitalAirburstProcedure.execute(entity);
		}
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY).getItem() == HelldiversModItems.ORBITAL_EMS_STRIKE
				.get()) {
			AddOrbitalEMSProcedure.execute(entity);
		}
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY).getItem() == HelldiversModItems.EAGLE_CLUSTER_BOMB
				.get()) {
			AddEagleClusterBombProcedure.execute(entity);
		}
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY).getItem() == HelldiversModItems.ORBITAL_SMOKE_STRIKE
				.get()) {
			AddOrbitalSmokeStriikeProcedure.execute(entity);
		}
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY).getItem() == HelldiversModItems.EAGLE_SMOKE_STRIKE
				.get()) {
			AddEagleSmokeStrikeProcedure.execute(entity);
		}
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY).getItem() == HelldiversModItems.EAGLE_110_MM_ROCKET_POD
				.get()) {
			AddEagle110mmProcedure.execute(entity);
		}
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY).getItem() == HelldiversModItems.ORBITAL_120_MMHE_BARRAGE
				.get()) {
			AddOrbital120MMProcedure.execute(entity);
		}
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY).getItem() == HelldiversModItems.ORBITAL_380_MMHE_BARRAGE
				.get()) {
			AddOrbital380MMProcedure.execute(entity);
		}
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY).getItem() == HelldiversModItems.ORBITAL_WALKING_BARRAGE
				.get()) {
			AddOrbitalWalkingBarrageProcedure.execute(entity);
		}
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY).getItem() == HelldiversModItems.ORBITAL_GAS_STRIKE
				.get()) {
			AddOrbitalGasStrikewProcedure.execute(entity);
		}
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY).getItem() == HelldiversModItems.EAGLE_NAPALM_STRIKE
				.get()) {
			AddEagleNapalmStrikeProcedure.execute(entity);
		}
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY).getItem() == HelldiversModItems.ORBITAL_GATTLING_BARRAGE
				.get()) {
			AddOrbitalGattlingBarrageProcedure.execute(entity);
		}
	}
}
