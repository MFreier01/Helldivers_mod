
package net.hytech.helldivers.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class TestflameItem extends Item {
	public TestflameItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
