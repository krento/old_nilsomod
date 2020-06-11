package com.krento.nilsomod.init;

import com.krento.nilsomod.NilsoMod;
import com.krento.nilsomod.NilsoMod.NilsoItemGroup;

import com.krento.nilsomod.objects.items.Amphetamine;
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
	@SubscribeEvent
	public static void registerItems(final RegistryEvent.Register<Item> event)
	{
		event.getRegistry().register(NilsoMod.Items.AMPHETAMINE.setRegistryName(NilsoMod.Items.AMPHETAMINE.getObjectName()));
	}	
}
