package net.veritas.tabs;

import net.threetag.palladiumcore.registry.RegistrySupplier;
import net.threetag.palladiumcore.registry.DeferredRegister;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.veritas.Veritas;
import net.veritas.items.VeritasItems;

public class VeritasTab {
    public static final DeferredRegister<CreativeModeTab> TABS =
            DeferredRegister.create(Veritas.MOD_ID, Registries.CREATIVE_MODE_TAB);

    public static final RegistrySupplier<CreativeModeTab> VERITAS_TAB = TABS.register(
            "veritas_tab",
            () -> CreativeModeTab.builder(CreativeModeTab.Row.TOP, 0)
                    .title(Component.translatable("itemGroup.veritas.main"))
                    .icon(() -> new ItemStack(VeritasItems.S_LOGO.get()))
                    .displayItems((parameters, output) -> {
                        output.accept(VeritasItems.OCTAGONAL_KEY.get());
                        output.accept(VeritasItems.GREEN_REFINED_KRYPTONITE.get());
                        output.accept(VeritasItems.RED_REFINED_KRYPTONITE.get());
                        output.accept(VeritasItems.BLUE_REFINED_KRYPTONITE.get());
                        output.accept(VeritasItems.BLACK_REFINED_KRYPTONITE.get());
                        output.accept(VeritasItems.SILVER_REFINED_KRYPTONITE.get());
                        output.accept(VeritasItems.GOLD_REFINED_KRYPTONITE.get());
                        output.accept(VeritasItems.WHITE_REFINED_KRYPTONITE.get());
                        output.accept(VeritasItems.COMPOSITE_REFINED_KRYPTONITE.get());
                        output.accept(VeritasItems.GREEN_KRYPTONITE_STONE_ORE.get());
                        output.accept(VeritasItems.RED_KRYPTONITE_STONE_ORE.get());
                        output.accept(VeritasItems.BLUE_KRYPTONITE_STONE_ORE.get());
                        output.accept(VeritasItems.KRYPTONIAN_KNOWLEDGE.get());
                    })
                    .build()
    );

    public static void register() {
        TABS.register();
    }
}