package com.krento.nilsomod.init;

import com.krento.nilsomod.NilsoMod;
import com.krento.nilsomod.NilsoMod.NilsoItemGroup;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(modid = NilsoMod.MOD_ID, bus = Bus.MOD)
@ObjectHolder(NilsoMod.MOD_ID)
public class itemInit {
	public static final Item ksign = null;
	
	@SuppressWarnings("deprecation")
	@SubscribeEvent
	public static void registerItems(final RegistryEvent.Register<Item> event)
	{
		event.getRegistry().register(new Item(new Item.Properties().group(NilsoItemGroup.instanse).food(new Food.Builder().hunger(20).saturation(2.1f).setAlwaysEdible().effect(new EffectInstance(Effects.HEALTH_BOOST, 180, 50), 1.0f).effect(new EffectInstance(Effects.SPEED, 6000, 100), 1.0f).build())).setRegistryName("ksign"));
	}	
}
