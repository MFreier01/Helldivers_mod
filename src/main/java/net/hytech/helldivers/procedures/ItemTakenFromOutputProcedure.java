package net.hytech.helldivers.procedures;

import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import java.util.function.Supplier;
import java.util.Map;

public class ItemTakenFromOutputProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double slot = 0;
		slot = 0;
		for (int index0 = 0; index0 < 25; index0++) {
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				((Slot) _slots.get((int) slot)).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			slot = slot + 1;
		}
	}
}
