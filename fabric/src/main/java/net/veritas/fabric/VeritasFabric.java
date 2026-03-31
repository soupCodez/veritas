package net.veritas.fabric;

import net.veritas.Veritas;
import net.fabricmc.api.ModInitializer;

public class VeritasFabric implements ModInitializer {

    @Override
    public void onInitialize() {
        Veritas.init();
    }

}
