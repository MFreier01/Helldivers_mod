package net.hytech.helldivers.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.network.chat.Component;

import javax.annotation.Nullable;

import java.util.List;

@Mod.EventBusSubscriber
public class BasicArmorRemoteTooltipProcedure {
	@OnlyIn(Dist.CLIENT)
	@SubscribeEvent
	public static void onItemTooltip(ItemTooltipEvent event) {
		execute(event, event.getToolTip());
	}

	public static void execute(List<Component> tooltip) {
		execute(null, tooltip);
	}

	private static void execute(@Nullable Event event, List<Component> tooltip) {
		if (tooltip == null)
			return;
		tooltip.add(Component.literal("Has Stratagem Remote Capabilities"));
	}
}
