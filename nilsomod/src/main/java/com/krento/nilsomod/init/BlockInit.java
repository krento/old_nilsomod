package com.krento.nilsomod.init;

import com.krento.nilsomod.NilsoMod;
import com.krento.nilsomod.NilsoMod.NilsoItemGroup;

import com.krento.nilsomod.objects.blocks.Cache;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ObjectHolder;

@ObjectHolder(NilsoMod.MOD_ID)
@Mod.EventBusSubscriber(modid = NilsoMod.MOD_ID, bus = Bus.MOD)
public class BlockInit {
	
	public static final Block kblock = null;
	
	@SubscribeEvent
	public static void registerBlocks(final RegistryEvent.Register<Block> event) {
		event.getRegistry().register(new Block(Block.Properties.create(Material.IRON)
				.hardnessAndResistance(0.5f, 15.0f)
				.sound(SoundType.BAMBOO)).setRegistryName("kblock"));
	}
	
	@SubscribeEvent
	public static void registerItemBlocks(final RegistryEvent.Register<Item> event) {
		event.getRegistry().register(new BlockItem(kblock, new Item.Properties().maxStackSize(3).group(NilsoItemGroup.instanse)).setRegistryName("kblock"));
		event.getRegistry().register(
				new BlockItem(
						new Cache(Block.Properties.create(Material.CACTUS)),
						new Item.Properties().maxStackSize(3).group(NilsoItemGroup.instanse))
						.setRegistryName("cache"));
//		event.getRegistry().register(new BlockItem(kblock, new Item.Properties().maxStackSize(3).group(NilsoItemGroup.instanse)).setRegistryName("cache"));
	}
}
