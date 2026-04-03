package net.veritas.items;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;

public class RefinedKryptoniteItem extends Item {

    public RefinedKryptoniteItem(Rarity rarity) {
        super(new Item.Properties()
                .stacksTo(64)
                .rarity(rarity)
        );
    }
}