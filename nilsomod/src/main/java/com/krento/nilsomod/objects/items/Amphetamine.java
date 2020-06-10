package com.krento.nilsomod.objects.items;

import com.krento.nilsomod.NilsoMod;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class Amphetamine extends Item {
    public static final String NAME = "amphetamine";

    public static Amphetamine getInstance() {
        return instance;
    }

    private static final Amphetamine instance = new Amphetamine(new Item.Properties());

    public Amphetamine(Properties properties) {
        super(properties
                .group(NilsoMod.NilsoItemGroup.instanse)
                .food(new Food.Builder()
                        .hunger(20)
                        .saturation(2.1f)
                        .setAlwaysEdible()
                        .effect(()-> new EffectInstance(Effects.HEALTH_BOOST, 180, 50), 1.0f)
                        .effect(()-> new EffectInstance(Effects.SPEED, 6000, 100), 1.0f)
                        .build()
                )
        );
    }
}
