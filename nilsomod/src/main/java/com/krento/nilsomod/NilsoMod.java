package com.krento.nilsomod;

import com.krento.nilsomod.objects.NilsoObject;
import com.krento.nilsomod.objects.blocks.Cache;
import com.krento.nilsomod.objects.blocks.NilsoBlock;
import com.krento.nilsomod.objects.items.Amphetamine;
import com.krento.nilsomod.objects.items.NilsoItem;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.krento.nilsomod.init.BlockInit;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;


@Mod("nilsomod")
public class NilsoMod
{
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "nilsomod";
    public static NilsoMod instance;

    public static class Items {
        public static final NilsoItem AMPHETAMINE = new Amphetamine(new Item.Properties());
    }
    public static class Blocks {
        public static final NilsoBlock CACHE = new Cache(Block.Properties.create(Material.CACTUS));
    }

    
    public NilsoMod() {
    	final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
    	modEventBus.addListener(this::setup);
    	modEventBus.addListener(this::doClientStuff);
        instance = this;
        
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event)
    {

    }

    private void doClientStuff(final FMLClientSetupEvent event) {
    }


    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent event) {

    }
    
    public static class NilsoItemGroup extends ItemGroup {
    	
    	public static final NilsoItemGroup instanse = new NilsoItemGroup(ItemGroup.GROUPS.length, "NilsoTab");
    	
    	private NilsoItemGroup(int index, String label) {
    		super(index, label);
    	}
    	
    	@Override
    	public ItemStack createIcon() {
    		return new ItemStack(BlockInit.kblock);
    	}
    	
    }

}
