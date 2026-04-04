package net.veritas.items;

import net.minecraft.world.item.Rarity;
import net.veritas.Veritas;
import net.threetag.palladiumcore.registry.RegistrySupplier;
import net.threetag.palladiumcore.registry.DeferredRegister;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Item;

public class VeritasItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(Veritas.MOD_ID, Registries.ITEM);

    public static final RegistrySupplier<Item> OCTAGONAL_KEY =
            ITEMS.register("octagonal_key", Key::new);

    public static final RegistrySupplier<Item> GREEN_REFINED_KRYPTONITE =
            ITEMS.register("green_refined_kryptonite", () -> new RefinedKryptoniteItem(Rarity.COMMON));

    public static final RegistrySupplier<Item> RED_REFINED_KRYPTONITE =
            ITEMS.register("red_refined_kryptonite", () -> new RefinedKryptoniteItem(Rarity.UNCOMMON));

    public static final RegistrySupplier<Item> BLUE_REFINED_KRYPTONITE =
            ITEMS.register("blue_refined_kryptonite", () -> new RefinedKryptoniteItem(Rarity.RARE));

    public static final RegistrySupplier<Item> BLACK_REFINED_KRYPTONITE =
            ITEMS.register("black_refined_kryptonite", () -> new RefinedKryptoniteItem(Rarity.EPIC));

    public static final RegistrySupplier<Item> SILVER_REFINED_KRYPTONITE =
            ITEMS.register("silver_refined_kryptonite", () -> new RefinedKryptoniteItem(Rarity.EPIC));

    public static final RegistrySupplier<Item> GOLD_REFINED_KRYPTONITE =
            ITEMS.register("gold_refined_kryptonite", () -> new RefinedKryptoniteItem(Rarity.EPIC));

    public static final RegistrySupplier<Item> WHITE_REFINED_KRYPTONITE =
            ITEMS.register("white_refined_kryptonite", () -> new RefinedKryptoniteItem(Rarity.RARE));

    public static final RegistrySupplier<Item> COMPOSITE_REFINED_KRYPTONITE =
            ITEMS.register("composite_refined_kryptonite", () -> new RefinedKryptoniteItem(Rarity.EPIC));

    public static final RegistrySupplier<Item> S_LOGO =
            ITEMS.register("s_logo", () -> new Item(new Item.Properties().stacksTo(1).rarity(Rarity.EPIC).fireResistant()));

    public static final RegistrySupplier<Item> KRYPTONIAN_KNOWLEDGE =
            ITEMS.register("kryptonian_knowledge", KryptonianKnowledge::new);


    public static void register() {
        ITEMS.register();
    }
}