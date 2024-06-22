package net.hytech.helldivers.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.hytech.helldivers.network.HelldiversModVariables;

public class WriteStratProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(HelldiversModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new HelldiversModVariables.PlayerVariables())).Save) {
			for (int index0 = 0; index0 < 10; index0++) {
				ReadStratProcedure.execute(world, entity);
			}
		}
		{
			boolean _setval = false;
			entity.getCapability(HelldiversModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.Save = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
