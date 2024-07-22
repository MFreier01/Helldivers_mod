package net.hytech.helldivers.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.hytech.helldivers.init.HelldiversModItems;

public class Add500KGProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putString("ActiveStratagem", "Eagle500KG");
		if (!(entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(HelldiversModItems.ARMED_ATTACK_STRATAGEM_ORB.get())) : false)
				&& (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(HelldiversModItems.EMPTY_STRATAGEM_ORB.get())) : false)) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(HelldiversModItems.ARMED_ATTACK_STRATAGEM_ORB.get()).copy();
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(HelldiversModItems.EMPTY_STRATAGEM_ORB.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
		}
	}
}
