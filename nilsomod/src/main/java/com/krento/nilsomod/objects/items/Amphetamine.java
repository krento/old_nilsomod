package com.krento.nilsomod.objects.items;

import com.krento.nilsomod.NilsoMod;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraftforge.event.RegistryEvent;

import javax.annotation.Nullable;

public class Amphetamine extends Item {
    private static final String name = "amphetamine";
    public Amphetamine() {
        super(new Item.Properties()
                .group(NilsoMod.NilsoItemGroup.instanse)
                .food(new Food.Builder().hunger(20)
                        .saturation(2.1f)
                        .setAlwaysEdible()
                        .effect(()-> new EffectInstance(Effects.HEALTH_BOOST, 180, 50), 1.0f)
                        .effect(()-> new EffectInstance(Effects.SPEED, 6000, 100), 1.0f)
                        .build()));
    }
    static public void register(final RegistryEvent.Register<Item> event) {
        event.getRegistry().register(new Amphetamine()
                .setRegistryName(name));
    }
}
