package net.veritas.items;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;

public class KryptonianKnowledge extends Item {

    public KryptonianKnowledge() {
        super(new Item.Properties()
                .stacksTo(64)
                .rarity(Rarity.EPIC)
        );
    }

    @Override
    public boolean isFoil(ItemStack stack) {
        return true;
    }
}
