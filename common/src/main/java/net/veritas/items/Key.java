package net.veritas.items;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;

public class Key extends Item {
    public Key() {
        super(new Item.Properties()
                .stacksTo(1)
                .rarity(Rarity.EPIC)
        );
    }

    @Override
    public boolean isFoil(ItemStack stack) {
        return true; // This gives it the enchantment shimmer permanently
    }
}