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

import net.hytech.helldivers.world.inventory.OrbitalWalkingBarrageGUIMenu;
import net.hytech.helldivers.world.inventory.OrbitalSmokeGUIMenu;
import net.hytech.helldivers.world.inventory.OrbitalRailCannonGUIMenu;
import net.hytech.helldivers.world.inventory.OrbitalPrecisionStrikeGUIMenu;
import net.hytech.helldivers.world.inventory.OrbitalLaserGUIMenu;
import net.hytech.helldivers.world.inventory.OrbitalGattlingBarrageGUIMenu;
import net.hytech.helldivers.world.inventory.OrbitalGasGUIMenu;
import net.hytech.helldivers.world.inventory.OrbitalEMSGUIMenu;
import net.hytech.helldivers.world.inventory.OrbitalAirburstGUIMenu;
import net.hytech.helldivers.world.inventory.Orbital380MMGUIMenu;
import net.hytech.helldivers.world.inventory.Orbital120MMGUIMenu;
import net.hytech.helldivers.world.inventory.EagleStrafingGUIMenu;
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
		if (entity instanceof Player _plr0 && _plr0.containerMenu instanceof OrbitalGasGUIMenu || entity instanceof Player _plr1 && _plr1.containerMenu instanceof OrbitalGattlingBarrageGUIMenu
				|| entity instanceof Player _plr2 && _plr2.containerMenu instanceof OrbitalWalkingBarrageGUIMenu || entity instanceof Player _plr3 && _plr3.containerMenu instanceof OrbitalPrecisionStrikeGUIMenu
				|| entity instanceof Player _plr4 && _plr4.containerMenu instanceof OrbitalEMSGUIMenu || entity instanceof Player _plr5 && _plr5.containerMenu instanceof OrbitalSmokeGUIMenu
				|| entity instanceof Player _plr6 && _plr6.containerMenu instanceof Orbital380MMGUIMenu || entity instanceof Player _plr7 && _plr7.containerMenu instanceof OrbitalAirburstGUIMenu
				|| entity instanceof Player _plr8 && _plr8.containerMenu instanceof Orbital120MMGUIMenu || entity instanceof Player _plr9 && _plr9.containerMenu instanceof OrbitalLaserGUIMenu
				|| entity instanceof Player _plr10 && _plr10.containerMenu instanceof OrbitalRailCannonGUIMenu || entity instanceof Player _plr11 && _plr11.containerMenu instanceof EagleStrafingGUIMenu
				|| entity instanceof Player _plr12 && _plr12.containerMenu instanceof Eagle500KGGUIMenu || entity instanceof Player _plr13 && _plr13.containerMenu instanceof EagleSmokeGUIMenu
				|| entity instanceof Player _plr14 && _plr14.containerMenu instanceof EagleClusterBombGUIMenu || entity instanceof Player _plr15 && _plr15.containerMenu instanceof EagleNapalmGUIMenu
				|| entity instanceof Player _plr16 && _plr16.containerMenu instanceof EagleAirStrikeGUIMenu || entity instanceof Player _plr17 && _plr17.containerMenu instanceof Eagle110MMRocketPodGUIMenu) {
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
			if (6 == HelldiversModVariables.MapVariables.get(world).PROGRAM_GUI) {
				if (entity instanceof ServerPlayer _ent) {
					BlockPos _bpos = BlockPos.containing(x, y, z);
					NetworkHooks.openScreen((ServerPlayer) _ent, new MenuProvider() {
						@Override
						public Component getDisplayName() {
							return Component.literal("EagleStrafingGUI");
						}

						@Override
						public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
							return new EagleStrafingGUIMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
						}
					}, _bpos);
				}
			}
			if (7 == HelldiversModVariables.MapVariables.get(world).PROGRAM_GUI) {
				if (entity instanceof ServerPlayer _ent) {
					BlockPos _bpos = BlockPos.containing(x, y, z);
					NetworkHooks.openScreen((ServerPlayer) _ent, new MenuProvider() {
						@Override
						public Component getDisplayName() {
							return Component.literal("OrbitalRailCannonGUI");
						}

						@Override
						public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
							return new OrbitalRailCannonGUIMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
						}
					}, _bpos);
				}
			}
			if (8 == HelldiversModVariables.MapVariables.get(world).PROGRAM_GUI) {
				if (entity instanceof ServerPlayer _ent) {
					BlockPos _bpos = BlockPos.containing(x, y, z);
					NetworkHooks.openScreen((ServerPlayer) _ent, new MenuProvider() {
						@Override
						public Component getDisplayName() {
							return Component.literal("OrbitalLaserGUI");
						}

						@Override
						public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
							return new OrbitalLaserGUIMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
						}
					}, _bpos);
				}
			}
			if (9 == HelldiversModVariables.MapVariables.get(world).PROGRAM_GUI) {
				if (entity instanceof ServerPlayer _ent) {
					BlockPos _bpos = BlockPos.containing(x, y, z);
					NetworkHooks.openScreen((ServerPlayer) _ent, new MenuProvider() {
						@Override
						public Component getDisplayName() {
							return Component.literal("OrbitalAirburstGUI");
						}

						@Override
						public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
							return new OrbitalAirburstGUIMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
						}
					}, _bpos);
				}
			}
			if (10 == HelldiversModVariables.MapVariables.get(world).PROGRAM_GUI) {
				if (entity instanceof ServerPlayer _ent) {
					BlockPos _bpos = BlockPos.containing(x, y, z);
					NetworkHooks.openScreen((ServerPlayer) _ent, new MenuProvider() {
						@Override
						public Component getDisplayName() {
							return Component.literal("Orbital120MMGUI");
						}

						@Override
						public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
							return new Orbital120MMGUIMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
						}
					}, _bpos);
				}
			}
			if (11 == HelldiversModVariables.MapVariables.get(world).PROGRAM_GUI) {
				if (entity instanceof ServerPlayer _ent) {
					BlockPos _bpos = BlockPos.containing(x, y, z);
					NetworkHooks.openScreen((ServerPlayer) _ent, new MenuProvider() {
						@Override
						public Component getDisplayName() {
							return Component.literal("Orbital380MMGUI");
						}

						@Override
						public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
							return new Orbital380MMGUIMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
						}
					}, _bpos);
				}
			}
			if (12 == HelldiversModVariables.MapVariables.get(world).PROGRAM_GUI) {
				if (entity instanceof ServerPlayer _ent) {
					BlockPos _bpos = BlockPos.containing(x, y, z);
					NetworkHooks.openScreen((ServerPlayer) _ent, new MenuProvider() {
						@Override
						public Component getDisplayName() {
							return Component.literal("OrbitalWalkingBarrageGUI");
						}

						@Override
						public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
							return new OrbitalWalkingBarrageGUIMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
						}
					}, _bpos);
				}
			}
			if (13 == HelldiversModVariables.MapVariables.get(world).PROGRAM_GUI) {
				if (entity instanceof ServerPlayer _ent) {
					BlockPos _bpos = BlockPos.containing(x, y, z);
					NetworkHooks.openScreen((ServerPlayer) _ent, new MenuProvider() {
						@Override
						public Component getDisplayName() {
							return Component.literal("OrbitalGattlingBarrageGUI");
						}

						@Override
						public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
							return new OrbitalGattlingBarrageGUIMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
						}
					}, _bpos);
				}
			}
			if (14 == HelldiversModVariables.MapVariables.get(world).PROGRAM_GUI) {
				if (entity instanceof ServerPlayer _ent) {
					BlockPos _bpos = BlockPos.containing(x, y, z);
					NetworkHooks.openScreen((ServerPlayer) _ent, new MenuProvider() {
						@Override
						public Component getDisplayName() {
							return Component.literal("OrbitalPrecisionStrikeGUI");
						}

						@Override
						public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
							return new OrbitalPrecisionStrikeGUIMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
						}
					}, _bpos);
				}
			}
			if (15 == HelldiversModVariables.MapVariables.get(world).PROGRAM_GUI) {
				if (entity instanceof ServerPlayer _ent) {
					BlockPos _bpos = BlockPos.containing(x, y, z);
					NetworkHooks.openScreen((ServerPlayer) _ent, new MenuProvider() {
						@Override
						public Component getDisplayName() {
							return Component.literal("OrbitalEMSGUI");
						}

						@Override
						public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
							return new OrbitalEMSGUIMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
						}
					}, _bpos);
				}
			}
			if (16 == HelldiversModVariables.MapVariables.get(world).PROGRAM_GUI) {
				if (entity instanceof ServerPlayer _ent) {
					BlockPos _bpos = BlockPos.containing(x, y, z);
					NetworkHooks.openScreen((ServerPlayer) _ent, new MenuProvider() {
						@Override
						public Component getDisplayName() {
							return Component.literal("OrbitalSmokeGUI");
						}

						@Override
						public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
							return new OrbitalSmokeGUIMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
						}
					}, _bpos);
				}
			}
			if (17 == HelldiversModVariables.MapVariables.get(world).PROGRAM_GUI) {
				if (entity instanceof ServerPlayer _ent) {
					BlockPos _bpos = BlockPos.containing(x, y, z);
					NetworkHooks.openScreen((ServerPlayer) _ent, new MenuProvider() {
						@Override
						public Component getDisplayName() {
							return Component.literal("OrbitalGasGUI");
						}

						@Override
						public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
							return new OrbitalGasGUIMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
						}
					}, _bpos);
				}
			}
		}
		if (HelldiversModVariables.MapVariables.get(world).PROGRAM_GUI > 17) {
			HelldiversModVariables.MapVariables.get(world).PROGRAM_GUI = 0;
			HelldiversModVariables.MapVariables.get(world).syncData(world);
		}
		if (HelldiversModVariables.MapVariables.get(world).PROGRAM_GUI < 0) {
			HelldiversModVariables.MapVariables.get(world).PROGRAM_GUI = 17;
			HelldiversModVariables.MapVariables.get(world).syncData(world);
		}
	}
}
