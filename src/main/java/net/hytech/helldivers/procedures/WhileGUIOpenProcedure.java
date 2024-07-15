package net.hytech.helldivers.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.hytech.helldivers.init.HelldiversModItems;

import java.util.function.Supplier;
import java.util.Map;

public class WhileGUIOpenProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double outputSlot = 0;
		double slot = 0;
		outputSlot = 25;
		slot = 0;
		if (EagleAirStrikeRecipeProcedure.execute(entity)) {
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(HelldiversModItems.EAGLE_AIR_STRIKE.get()).copy();
				_setstack.setCount(1);
				((Slot) _slots.get((int) outputSlot)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if (Eagle110MMRocketRecipeProcedure.execute(entity)) {
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(HelldiversModItems.EAGLE_110_MM_ROCKET_POD.get()).copy();
				_setstack.setCount(1);
				((Slot) _slots.get((int) outputSlot)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if (EagleClusterBombRecipeProcedure.execute(entity)) {
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(HelldiversModItems.EAGLE_CLUSTER_BOMB.get()).copy();
				_setstack.setCount(1);
				((Slot) _slots.get((int) outputSlot)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if (EagleSmokeStrikeRecipeProcedure.execute(entity)) {
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(HelldiversModItems.EAGLE_SMOKE_STRIKE.get()).copy();
				_setstack.setCount(1);
				((Slot) _slots.get((int) outputSlot)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if (EagleNapalmStrikeRecipeProcedure.execute(entity)) {
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(HelldiversModItems.EAGLE_NAPALM_STRIKE.get()).copy();
				_setstack.setCount(1);
				((Slot) _slots.get((int) outputSlot)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else {
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				((Slot) _slots.get((int) outputSlot)).set(ItemStack.EMPTY);
				_player.containerMenu.broadcastChanges();
			}
		}
	}
}
