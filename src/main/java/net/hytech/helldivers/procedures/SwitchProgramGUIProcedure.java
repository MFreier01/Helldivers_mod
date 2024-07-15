package net.hytech.helldivers.procedures;

import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.MenuProvider;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.network.chat.Component;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.hytech.helldivers.world.inventory.EagleSmokeGUIMenu;
import net.hytech.helldivers.world.inventory.EagleNapalmGUIMenu;
import net.hytech.helldivers.world.inventory.EagleClusterBombGUIMenu;
import net.hytech.helldivers.world.inventory.EagleAirStrikeGUIMenu;
import net.hytech.helldivers.world.inventory.Eagle500KGGUIMenu;
import net.hytech.helldivers.world.inventory.Eagle110MMRocketPodGUIMenu;
import net.hytech.helldivers.network.HelldiversModVariables;

import javax.annotation.Nullable;

import io.netty.buffer.Unpooled;

@Mod.EventBusSubscriber
public class SwitchProgramGUIProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level(), event.player.getX(), event.player.getY(), event.player.getZ(), event.player);
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _plr0 && _plr0.containerMenu instanceof Eagle500KGGUIMenu || entity instanceof Player _plr1 && _plr1.containerMenu instanceof EagleSmokeGUIMenu
				|| entity instanceof Player _plr2 && _plr2.containerMenu instanceof EagleClusterBombGUIMenu || entity instanceof Player _plr3 && _plr3.containerMenu instanceof EagleAirStrikeGUIMenu
				|| entity instanceof Player _plr4 && _plr4.containerMenu instanceof Eagle110MMRocketPodGUIMenu || entity instanceof Player _plr5 && _plr5.containerMenu instanceof EagleNapalmGUIMenu) {
			if (0 == HelldiversModVariables.MapVariables.get(world).PROGRAM_GUI) {
				if (entity instanceof ServerPlayer _ent) {
					BlockPos _bpos = BlockPos.containing(x, y, z);
					NetworkHooks.openScreen((ServerPlayer) _ent, new MenuProvider() {
						@Override
						public Component getDisplayName() {
							return Component.literal("EagleAirStrikeGUI");
						}

						@Override
						public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
							return new EagleAirStrikeGUIMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
						}
					}, _bpos);
				}
			}
			if (1 == HelldiversModVariables.MapVariables.get(world).PROGRAM_GUI) {
				if (entity instanceof ServerPlayer _ent) {
					BlockPos _bpos = BlockPos.containing(x, y, z);
					NetworkHooks.openScreen((ServerPlayer) _ent, new MenuProvider() {
						@Override
						public Component getDisplayName() {
							return Component.literal("Eagle110MMRocketPodGUI");
						}

						@Override
						public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
							return new Eagle110MMRocketPodGUIMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
						}
					}, _bpos);
				}
			}
			if (2 == HelldiversModVariables.MapVariables.get(world).PROGRAM_GUI) {
				if (entity instanceof ServerPlayer _ent) {
					BlockPos _bpos = BlockPos.containing(x, y, z);
					NetworkHooks.openScreen((ServerPlayer) _ent, new MenuProvider() {
						@Override
						public Component getDisplayName() {
							return Component.literal("EagleNapalmGUI");
						}

						@Override
						public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
							return new EagleNapalmGUIMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
						}
					}, _bpos);
				}
			}
			if (3 == HelldiversModVariables.MapVariables.get(world).PROGRAM_GUI) {
				if (entity instanceof ServerPlayer _ent) {
					BlockPos _bpos = BlockPos.containing(x, y, z);
					NetworkHooks.openScreen((ServerPlayer) _ent, new MenuProvider() {
						@Override
						public Component getDisplayName() {
							return Component.literal("EagleClusterBombGUI");
						}

						@Override
						public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
							return new EagleClusterBombGUIMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
						}
					}, _bpos);
				}
			}
			if (4 == HelldiversModVariables.MapVariables.get(world).PROGRAM_GUI) {
				if (entity instanceof ServerPlayer _ent) {
					BlockPos _bpos = BlockPos.containing(x, y, z);
					NetworkHooks.openScreen((ServerPlayer) _ent, new MenuProvider() {
						@Override
						public Component getDisplayName() {
							return Component.literal("Eagle500KGGUI");
						}

						@Override
						public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
							return new Eagle500KGGUIMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
						}
					}, _bpos);
				}
			}
			if (5 == HelldiversModVariables.MapVariables.get(world).PROGRAM_GUI) {
				if (entity instanceof ServerPlayer _ent) {
					BlockPos _bpos = BlockPos.containing(x, y, z);
					NetworkHooks.openScreen((ServerPlayer) _ent, new MenuProvider() {
						@Override
						public Component getDisplayName() {
							return Component.literal("EagleSmokeGUI");
						}

						@Override
						public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
							return new EagleSmokeGUIMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
						}
					}, _bpos);
				}
			}
		}
		if (HelldiversModVariables.MapVariables.get(world).PROGRAM_GUI > 5) {
			HelldiversModVariables.MapVariables.get(world).PROGRAM_GUI = 0;
			HelldiversModVariables.MapVariables.get(world).syncData(world);
		}
		if (HelldiversModVariables.MapVariables.get(world).PROGRAM_GUI < 0) {
			HelldiversModVariables.MapVariables.get(world).PROGRAM_GUI = 5;
			HelldiversModVariables.MapVariables.get(world).syncData(world);
		}
	}
}
