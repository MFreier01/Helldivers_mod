
package net.hytech.helldivers.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.hytech.helldivers.world.inventory.Eagle110MMRocketPodGUIMenu;
import net.hytech.helldivers.procedures.Tag110MMRocketPodProcedure;
import net.hytech.helldivers.procedures.IncrementGUIProcedure;
import net.hytech.helldivers.procedures.DeIncrementGUIProcedure;
import net.hytech.helldivers.HelldiversMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class Eagle110MMRocketPodGUIButtonMessage {
	private final int buttonID, x, y, z;

	public Eagle110MMRocketPodGUIButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public Eagle110MMRocketPodGUIButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(Eagle110MMRocketPodGUIButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(Eagle110MMRocketPodGUIButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
		NetworkEvent.Context context = contextSupplier.get();
		context.enqueueWork(() -> {
			Player entity = context.getSender();
			int buttonID = message.buttonID;
			int x = message.x;
			int y = message.y;
			int z = message.z;
			handleButtonAction(entity, buttonID, x, y, z);
		});
		context.setPacketHandled(true);
	}

	public static void handleButtonAction(Player entity, int buttonID, int x, int y, int z) {
		Level world = entity.level();
		HashMap guistate = Eagle110MMRocketPodGUIMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			Tag110MMRocketPodProcedure.execute(entity);
		}
		if (buttonID == 1) {

			IncrementGUIProcedure.execute(world);
		}
		if (buttonID == 2) {

			DeIncrementGUIProcedure.execute(world);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		HelldiversMod.addNetworkMessage(Eagle110MMRocketPodGUIButtonMessage.class, Eagle110MMRocketPodGUIButtonMessage::buffer, Eagle110MMRocketPodGUIButtonMessage::new, Eagle110MMRocketPodGUIButtonMessage::handler);
	}
}
