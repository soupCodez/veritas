package net.veritas.handlers;

import net.minecraft.world.entity.player.Player;
import net.threetag.palladium.event.PalladiumEvents;
import net.threetag.palladium.power.SuperpowerUtil;
import net.threetag.palladium.util.property.BooleanProperty;
import net.threetag.palladium.util.property.PalladiumProperty;
import net.threetag.palladiumcore.event.LifecycleEvents;
import net.threetag.palladiumcore.event.PlayerEvents;
import net.veritas.powers.TravelerPower;

public class PlayerEventHandler {

    private static final PalladiumProperty<Boolean> RECEIVED_STARTER_POWER =
            new BooleanProperty("received_starter_power");

    public static void register() {
        PalladiumEvents.REGISTER_PROPERTY.register(handler -> {
            if (handler.getEntity() instanceof Player) {
                handler.register(RECEIVED_STARTER_POWER, false);
            }
        });

        LifecycleEvents.DATAPACK_SYNC.register((playerList, player) -> TravelerPower.inject());

        PlayerEvents.JOIN.register(player -> {
            if (!RECEIVED_STARTER_POWER.get(player)) {
                SuperpowerUtil.addSuperpower(player, TravelerPower.ID);
                RECEIVED_STARTER_POWER.set(player, true);
            }
        });
    }
}
