package net.veritas.powers;

import com.google.common.collect.ImmutableMap;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.threetag.palladium.power.Power;
import net.threetag.palladium.power.PowerManager;
import net.threetag.palladium.power.ability.AbilityConfiguration;
import net.threetag.palladium.power.ability.AbilityReference;
import net.threetag.palladium.power.ability.Abilities;
import net.threetag.palladium.power.ability.AttributeModifierAbility;
import net.threetag.palladium.util.icon.ItemIcon;
import net.veritas.items.VeritasItems;

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class TravelerPower {

    public static final ResourceLocation ID = new ResourceLocation("veritas", "traveler");

    private static final UUID SUPER_STRENGTH_UUID = UUID.fromString("a8f1c2d3-b4e5-4f67-a891-012345678901");
    private static final UUID RESISTANCE_UUID = UUID.fromString("b9d2e3f4-c5f6-4078-b902-123456789012");
    private static final UUID SPEED_UUID = UUID.fromString("c0e3f4a5-d6b7-4189-c013-234567890123");

    private static Power INSTANCE;

    private static Power build() {
        Power power = new Power(
                ID,
                Component.translatable("superpower.veritas.traveler.name"),
                new ItemIcon(VeritasItems.S_LOGO.get()),
                null,
                null,
                new Color(0, 170, 255),
                new Color(0, 85, 128),
                false,
                false,
                true,
                Power.GuiDisplayType.AUTO
        );

        AbilityConfiguration superStrength = new AbilityConfiguration(
                new AbilityReference(ID, "super_strength"),
                Abilities.ATTRIBUTE_MODIFIER.get()
        );
        superStrength.set(AttributeModifierAbility.ATTRIBUTE, Attributes.ATTACK_DAMAGE);
        superStrength.set(AttributeModifierAbility.AMOUNT, 10.0);
        superStrength.set(AttributeModifierAbility.OPERATION, 0);
        superStrength.set(AttributeModifierAbility.UUID, SUPER_STRENGTH_UUID);
        power.addAbility(superStrength);

        AbilityConfiguration resistance = new AbilityConfiguration(
                new AbilityReference(ID, "resistance"),
                Abilities.ATTRIBUTE_MODIFIER.get()
        );
        resistance.set(AttributeModifierAbility.ATTRIBUTE, Attributes.ARMOR);
        resistance.set(AttributeModifierAbility.AMOUNT, 10.0);
        resistance.set(AttributeModifierAbility.OPERATION, 0);
        resistance.set(AttributeModifierAbility.UUID, RESISTANCE_UUID);
        power.addAbility(resistance);

        AbilityConfiguration speed = new AbilityConfiguration(
                new AbilityReference(ID, "speed"),
                Abilities.ATTRIBUTE_MODIFIER.get()
        );
        speed.set(AttributeModifierAbility.ATTRIBUTE, Attributes.MOVEMENT_SPEED);
        speed.set(AttributeModifierAbility.AMOUNT, 0.3);
        speed.set(AttributeModifierAbility.OPERATION, 1);
        speed.set(AttributeModifierAbility.UUID, SPEED_UUID);
        power.addAbility(speed);

        return power;
    }

    public static void inject() {
        PowerManager pm = PowerManager.getInstance(true);
        if (pm == null) {
            return;
        }
        if (INSTANCE == null) {
            INSTANCE = build();
        }
        Map<ResourceLocation, Power> extended = new HashMap<>(pm.byName);
        extended.put(ID, INSTANCE);
        pm.byName = ImmutableMap.copyOf(extended);
    }
}
