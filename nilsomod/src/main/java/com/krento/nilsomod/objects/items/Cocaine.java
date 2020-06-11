package com.krento.nilsomod.objects.items;

import com.krento.nilsomod.NilsoMod;
import net.minecraft.item.Food;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class Cocaine extends NilsoItem {
    public static final String NAME = "cocaine";

    public Cocaine(Properties properties) {
        super(properties
                .group(NilsoMod.NilsoItemGroup.instanse)
                .food(new Food.Builder()
                        .hunger(20)
                        .saturation(2.1f)
                        .setAlwaysEdible()
                        .effect(()-> new EffectInstance(Effects.SPEED, 500, 10), 1.0f)
                        .build()
                )
        );
    }

    @Override
    public String getObjectName() {
        return NAME;
    }
}
