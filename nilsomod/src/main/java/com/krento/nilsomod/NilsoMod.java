package com.krento.nilsomod;

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
    public static NilsoMod instanse;
    
    public NilsoMod() {
    	final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
    	modEventBus.addListener(this::setup);
    	modEventBus.addListener(this::doClientStuff);
        instanse = this;
        
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
