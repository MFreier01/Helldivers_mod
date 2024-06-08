
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.hytech.helldivers.init;

import org.lwjgl.glfw.GLFW;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

import net.hytech.helldivers.network.ReloadKeyMessage;
import net.hytech.helldivers.network.OpenStratagemMenuMessage;
import net.hytech.helldivers.HelldiversMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class HelldiversModKeyMappings {
	public static final KeyMapping RELOAD_KEY = new KeyMapping("key.helldivers.reload_key", GLFW.GLFW_KEY_R, "key.categories.misc") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				HelldiversMod.PACKET_HANDLER.sendToServer(new ReloadKeyMessage(0, 0));
				ReloadKeyMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping OPEN_STRATAGEM_MENU = new KeyMapping("key.helldivers.open_stratagem_menu", GLFW.GLFW_KEY_C, "key.categories.ui") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				HelldiversMod.PACKET_HANDLER.sendToServer(new OpenStratagemMenuMessage(0, 0));
				OpenStratagemMenuMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};

	@SubscribeEvent
	public static void registerKeyMappings(RegisterKeyMappingsEvent event) {
		event.register(RELOAD_KEY);
		event.register(OPEN_STRATAGEM_MENU);
	}

	@Mod.EventBusSubscriber({Dist.CLIENT})
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onClientTick(TickEvent.ClientTickEvent event) {
			if (Minecraft.getInstance().screen == null) {
				RELOAD_KEY.consumeClick();
				OPEN_STRATAGEM_MENU.consumeClick();
			}
		}
	}
}
