
package net.hytech.helldivers.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class BileSpewItemItem extends Item {
	public BileSpewItemItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
