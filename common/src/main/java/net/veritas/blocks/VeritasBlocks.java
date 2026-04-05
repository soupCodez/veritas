package net.veritas.blocks;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.threetag.palladiumcore.registry.DeferredRegister;
import net.threetag.palladiumcore.registry.RegistrySupplier;
import net.veritas.Veritas;

public class VeritasBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(Veritas.MOD_ID, Registries.BLOCK);

    public static final RegistrySupplier<Block> GREEN_KRYPTONITE_STONE_ORE = BLOCKS.register("green_kryptonite_stone_ore", () -> new VeritasOre(BlockBehaviour.Properties.of().strength(3.0F, 3.0F)));
    public static final RegistrySupplier<Block> RED_KRYPTONITE_STONE_ORE = BLOCKS.register("red_kryptonite_stone_ore", () -> new VeritasOre(BlockBehaviour.Properties.of().strength(3.0F, 3.0F)));
    public static final RegistrySupplier<Block> BLUE_KRYPTONITE_STONE_ORE = BLOCKS.register("blue_kryptonite_stone_ore", () -> new VeritasOre(BlockBehaviour.Properties.of().strength(3.0F, 3.0F)));

    public static void register() {
        BLOCKS.register();
    }
}