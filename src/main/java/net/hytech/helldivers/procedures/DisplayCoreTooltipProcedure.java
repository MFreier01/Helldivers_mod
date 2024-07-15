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
		}
	}
}
