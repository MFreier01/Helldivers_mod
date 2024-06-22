package net.hytech.helldivers.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.hytech.helldivers.network.HelldiversModVariables;

import java.util.function.Supplier;
import java.util.Map;

public class ReadStratProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
			ItemStack _setstack = HelldiversModVariables.MapVariables.get(world).stratagem_slot_0.copy();
			_setstack.setCount(HelldiversModVariables.MapVariables.get(world).stratagem_slot_0.getCount());
			((Slot) _slots.get(0)).set(_setstack);
			_player.containerMenu.broadcastChanges();
		}
		if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
			ItemStack _setstack = HelldiversModVariables.MapVariables.get(world).stratagem_slot_1.copy();
			_setstack.setCount(HelldiversModVariables.MapVariables.get(world).stratagem_slot_1.getCount());
			((Slot) _slots.get(1)).set(_setstack);
			_player.containerMenu.broadcastChanges();
		}
		if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
			ItemStack _setstack = HelldiversModVariables.MapVariables.get(world).stratagem_slot_2.copy();
			_setstack.setCount(HelldiversModVariables.MapVariables.get(world).stratagem_slot_2.getCount());
			((Slot) _slots.get(2)).set(_setstack);
			_player.containerMenu.broadcastChanges();
		}
		if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
			ItemStack _setstack = HelldiversModVariables.MapVariables.get(world).stratagem_slot_3.copy();
			_setstack.setCount(HelldiversModVariables.MapVariables.get(world).stratagem_slot_3.getCount());
			((Slot) _slots.get(3)).set(_setstack);
			_player.containerMenu.broadcastChanges();
		}
	}
}
