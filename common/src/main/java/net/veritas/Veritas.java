package net.veritas;

import net.veritas.blocks.VeritasBlocks;
import net.veritas.handlers.PlayerEventHandler;
import net.veritas.items.VeritasItems;
import net.veritas.tabs.VeritasTab;

public class Veritas {

    public static final String MOD_ID = "veritas";

    public static void init() {
        VeritasBlocks.register();
        VeritasItems.register();
        VeritasTab.register();
        PlayerEventHandler.register();
    }
}
