
package net.hytech.helldivers.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import net.hytech.helldivers.init.HelldiversModFluids;

public class NapalmItem extends BucketItem {
	public NapalmItem() {
		super(HelldiversModFluids.NAPALM, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.EPIC));
	}
}
