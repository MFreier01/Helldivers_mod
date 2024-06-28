package net.hytech.helldivers.procedures;

import net.minecraft.world.entity.Entity;

import net.hytech.helldivers.network.HelldiversModVariables;

public class OFF_FullAutoProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			boolean _setval = false;
			entity.getCapability(HelldiversModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.is_full_auto = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
