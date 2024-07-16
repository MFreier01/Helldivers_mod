
package net.hytech.helldivers.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.hytech.helldivers.world.inventory.Orbital120MMGUIMenu;
import net.hytech.helldivers.procedures.TagOrbital120MMProcedure;
import net.hytech.helldivers.procedures.IncrementGUIProcedure;
import net.hytech.helldivers.procedures.DeIncrementGUIProcedure;
import net.hytech.helldivers.HelldiversMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class Orbital120MMGUIButtonMessage {
	private final int buttonID, x, y, z;

	public Orbital120MMGUIButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public Orbital120MMGUIButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(Orbital120MMGUIButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(Orbital120MMGUIButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
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
		HashMap guistate = Orbital120MMGUIMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			TagOrbital120MMProcedure.execute(entity);
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
		HelldiversMod.addNetworkMessage(Orbital120MMGUIButtonMessage.class, Orbital120MMGUIButtonMessage::buffer, Orbital120MMGUIButtonMessage::new, Orbital120MMGUIButtonMessage::handler);
	}
}
