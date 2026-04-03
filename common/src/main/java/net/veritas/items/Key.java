package net.veritas.items;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.Style;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraft.ChatFormatting;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class Key extends Item {
    public Key() {
        super(new Item.Properties()
                .stacksTo(1)
                .rarity(Rarity.EPIC)
                .fireResistant()
        );
    }

    @Override
    public boolean isFoil(ItemStack stack) {
        return true; 
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> tooltip, TooltipFlag flag) {
        boolean shift = Screen.hasShiftDown();
        ResourceLocation kryptonian = new ResourceLocation("veritas", "kryptonian_font");

        for (int i = 1; i <= 3; i++) {
            String key = "item.veritas.octagonal_key.tooltip." + i + (shift ? ".shifted" : "");

            if (shift) {
                tooltip.add(Component.translatable(key).withStyle(ChatFormatting.GRAY));
            } else {
                tooltip.add(Component.translatable(key)
                        .withStyle(style -> style.withFont(kryptonian))
                        .withStyle(ChatFormatting.DARK_GRAY));
            }
        }

        if (!shift) {
            tooltip.add(Component.empty());
            tooltip.add(Component.translatable("tooltip.veritas.hold_shift").withStyle(ChatFormatting.BLUE));
        }
    }
}