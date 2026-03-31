package net.veritas.forge;

import net.veritas.Veritas;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.threetag.palladiumcore.forge.PalladiumCoreForge;

@Mod(Veritas.MOD_ID)
public class VeritasForge {

    public VeritasForge() {
        // Submit our event bus to let PalladiumCore register our content on the right time
        PalladiumCoreForge.registerModEventBus(Veritas.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        Veritas.init();
    }
}
