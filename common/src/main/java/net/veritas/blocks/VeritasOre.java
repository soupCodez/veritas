package net.veritas.blocks;

import net.minecraft.util.valueproviders.IntProvider;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;

public class VeritasOre extends DropExperienceBlock {
    private static final IntProvider DEFAULT_XP = UniformInt.of(3, 7);

    public VeritasOre(BlockBehaviour.Properties properties) {
        this(properties, DEFAULT_XP);
    }

    public VeritasOre(BlockBehaviour.Properties properties, IntProvider xpRange) {
        super(properties.mapColor(MapColor.STONE).requiresCorrectToolForDrops(), xpRange);
    }
}

