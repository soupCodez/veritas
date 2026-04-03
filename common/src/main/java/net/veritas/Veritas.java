package net.veritas;

import net.veritas.items.VeritasItems;
import net.veritas.tabs.VeritasTab;

public class Veritas {

    public static final String MOD_ID = "veritas";

    public static void init() {
        VeritasItems.register();
        VeritasTab.register();
    }
}
