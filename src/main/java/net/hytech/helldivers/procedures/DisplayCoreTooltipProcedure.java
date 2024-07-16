package net.hytech.helldivers.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.network.chat.Component;

import net.hytech.helldivers.init.HelldiversModItems;

import javax.annotation.Nullable;

import java.util.List;

@Mod.EventBusSubscriber
public class DisplayCoreTooltipProcedure {
	@OnlyIn(Dist.CLIENT)
	@SubscribeEvent
	public static void onItemTooltip(ItemTooltipEvent event) {
		execute(event, event.getItemStack(), event.getToolTip());
	}

	public static void execute(ItemStack itemstack, List<Component> tooltip) {
		execute(null, itemstack, tooltip);
	}

	private static void execute(@Nullable Event event, ItemStack itemstack, List<Component> tooltip) {
		if (tooltip == null)
			return;
		if (HelldiversModItems.STRATAGEMCORE.get() == itemstack.getItem()) {
			if (("EagleAirStrike").equals(itemstack.getOrCreateTag().getString("CoreTag"))) {
				tooltip.add(Component.literal("Eagle Air Strike Core"));
			}
			if (("Eagle110MMRocket").equals(itemstack.getOrCreateTag().getString("CoreTag"))) {
				tooltip.add(Component.literal("Eagle 110MM Rocket Pod Core"));
			}
			if (("EagleNapalmStrike").equals(itemstack.getOrCreateTag().getString("CoreTag"))) {
				tooltip.add(Component.literal("Eagle Napalm Strike Core"));
			}
			if (("EagleClusterBomb").equals(itemstack.getOrCreateTag().getString("CoreTag"))) {
				tooltip.add(Component.literal("Eagle Cluster Bomb Core"));
			}
			if (("Eagle500KG").equals(itemstack.getOrCreateTag().getString("CoreTag"))) {
				tooltip.add(Component.literal("Eagle 500KG Bomb Core"));
			}
			if (("EagleSmokeStrike").equals(itemstack.getOrCreateTag().getString("CoreTag"))) {
				tooltip.add(Component.literal("Eagle Smoke Strike Core"));
			}
			if (("EagleStrafingRun").equals(itemstack.getOrCreateTag().getString("CoreTag"))) {
				tooltip.add(Component.literal("Eagle Strafing Run Core"));
			}
			if (("OrbitalRailcannon").equals(itemstack.getOrCreateTag().getString("CoreTag"))) {
				tooltip.add(Component.literal("Orbital Railcannon Core"));
			}
			if (("OrbitalLaser").equals(itemstack.getOrCreateTag().getString("CoreTag"))) {
				tooltip.add(Component.literal("Orbital Laser Core"));
			}
			if (("OrbitalAirburst").equals(itemstack.getOrCreateTag().getString("CoreTag"))) {
				tooltip.add(Component.literal("Orbital Airburst Core"));
			}
			if (("Orbital120MMBarrage").equals(itemstack.getOrCreateTag().getString("CoreTag"))) {
				tooltip.add(Component.literal("Orbital 120MM Barrage Core"));
			}
			if (("Orbital380MMBarrage").equals(itemstack.getOrCreateTag().getString("CoreTag"))) {
				tooltip.add(Component.literal("Orbital 380MM Barrage Core"));
			}
			if (("OrbitalGattlingBarrage").equals(itemstack.getOrCreateTag().getString("CoreTag"))) {
				tooltip.add(Component.literal("Orbital Gattling Barrage Core"));
			}
			if (("OrbitalGattlingBarrage").equals(itemstack.getOrCreateTag().getString("CoreTag"))) {
				tooltip.add(Component.literal("Orbital Gattling Barrage Core"));
			}
			if (("OrbitalWalkingBarrage").equals(itemstack.getOrCreateTag().getString("CoreTag"))) {
				tooltip.add(Component.literal("Orbital Walking Barrage Core"));
			}
			if (("OrbitalPrecisionStrike").equals(itemstack.getOrCreateTag().getString("CoreTag"))) {
				tooltip.add(Component.literal("Orbital Precision Strike Core"));
			}
			if (("OrbitalEMS").equals(itemstack.getOrCreateTag().getString("CoreTag"))) {
				tooltip.add(Component.literal("Orbital EMS Strike Core"));
			}
			if (("OrbitalSmoke").equals(itemstack.getOrCreateTag().getString("CoreTag"))) {
				tooltip.add(Component.literal("Orbital Smoke Strike Core"));
			}
			if (("OrbitalGas").equals(itemstack.getOrCreateTag().getString("CoreTag"))) {
				tooltip.add(Component.literal("Orbital Gas Strike Core"));
			}
		}
	}
}
