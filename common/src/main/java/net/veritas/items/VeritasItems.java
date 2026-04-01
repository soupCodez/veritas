package net.veritas.items;

import net.veritas.Veritas;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Item;

public class VeritasItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(Veritas.MOD_ID, Registries.ITEM);

    public static final RegistrySupplier<Item> OCTAGONAL_KEY =
            ITEMS.register("octagonal_key", Key::new);

    public static void register() {
        ITEMS.register();
    }
}