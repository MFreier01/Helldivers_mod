
package net.hytech.helldivers.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class OrbitalLaserItemItem extends Item {
	public OrbitalLaserItemItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.UNCOMMON));
	}
}
