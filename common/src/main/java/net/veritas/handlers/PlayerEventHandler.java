package net.veritas.handlers;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Player;
import net.threetag.palladium.event.PalladiumEvents;
import net.threetag.palladium.power.SuperpowerUtil;
import net.threetag.palladium.util.property.BooleanProperty;
import net.threetag.palladium.util.property.PalladiumProperty;
import net.threetag.palladiumcore.event.PlayerEvents;

public class PlayerEventHandler {

    private static final ResourceLocation TRAVELER_POWER_ID = new ResourceLocation("veritas", "traveler");
    private static final PalladiumProperty<Boolean> RECEIVED_STARTER_POWER =
            new BooleanProperty("received_starter_power");

    public static void register() {
        PalladiumEvents.REGISTER_PROPERTY.register(handler -> {
            if (handler.getEntity() instanceof Player) {
                handler.register(RECEIVED_STARTER_POWER, false);
            }
        });

        PlayerEvents.JOIN.register(player -> {
            if (!RECEIVED_STARTER_POWER.get(player)) {
                SuperpowerUtil.addSuperpower(player, TRAVELER_POWER_ID);
                RECEIVED_STARTER_POWER.set(player, true);
            }
        });
    }
}
