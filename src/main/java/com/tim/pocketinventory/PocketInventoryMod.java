package com.tim.pocketinventory;

import com.mojang.logging.LogUtils;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegisterCommandsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// This annotation marks this class as a Mod and defines its ID
@Mod(PocketInventoryMod.MODID)
public class PocketInventoryMod {
    // Define mod id in a common place for everything to reference
    public static final String MODID = "pocketinventory";
    // Logger for outputting information to the console and logs
    private static final Logger LOGGER = LogUtils.getLogger();

    public PocketInventoryMod() {
        LOGGER.info("Initializing Pocket Inventory Mod");
        
        // Get the mod event bus to register our events
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        
        // Register the setup method for mod loading
        modEventBus.addListener(this::setup);
        
        // Register ourselves for server and other game events
        MinecraftForge.EVENT_BUS.register(this);
    }

    /**
     * Common setup method - called during mod startup
     */
    private void setup(final FMLCommonSetupEvent event) {
        LOGGER.info("Pocket Inventory Mod setup");
        // Common setup code goes here
    }

    /**
     * Called when the server is starting
     */
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
        LOGGER.info("Pocket Inventory Mod server starting");
    }
    
    /**
     * Register commands when the server is ready
     */
    @SubscribeEvent
    public void onRegisterCommands(RegisterCommandsEvent event) {
        LOGGER.info("Registering Pocket Inventory commands");
        // We'll add our command registration here later
    }
} 