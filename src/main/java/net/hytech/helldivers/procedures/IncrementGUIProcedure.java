package net.hytech.helldivers.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.hytech.helldivers.network.HelldiversModVariables;

public class IncrementGUIProcedure {
	public static void execute(LevelAccessor world) {
		HelldiversModVariables.MapVariables.get(world).PROGRAM_GUI = HelldiversModVariables.MapVariables.get(world).PROGRAM_GUI + 1;
		HelldiversModVariables.MapVariables.get(world).syncData(world);
	}
}
