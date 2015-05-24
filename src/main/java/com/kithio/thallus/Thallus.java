package com.kithio.thallus;

import com.kithio.thallus.handler.*;
import com.kithio.thallus.init.ModBlocks;
import com.kithio.thallus.init.ModItems;
import com.kithio.thallus.init.Recipes;
import com.kithio.thallus.init.TileEntities;
import com.kithio.thallus.network.PacketHandler;
import com.kithio.thallus.proxy.IProxy;
import com.kithio.thallus.reference.Reference;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.*;
import cpw.mods.fml.common.network.NetworkRegistry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class Thallus
{
    @Mod.Instance(Reference.MOD_ID)
    public static Thallus instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    public static PlayerEventHandler playerEventHandler;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        // Initialize mods UpdateHandler to ensure mod is up-to-date
        UpdateHandler.init();

        // Adds a PlayerEventHandler so user is given Starter Scroll when he/she first joins
        playerEventHandler = new PlayerEventHandler();

        // Initialize mod configs
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());

        // Initialize mod packets
        PacketHandler.init();

        // Adds the mod related key bindings to the game
        proxy.registerKeyBindings();

        // Initialize mod items
        ModItems.init();

        // Initialize mod blocks
        ModBlocks.init();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        // Register the GUI Handler
        NetworkRegistry.INSTANCE.registerGuiHandler(instance, new GuiHandler());

        // Register the Achievement Handler
        FMLCommonHandler.instance().bus().register(new AchievementHandler());

        // Initialize mod tile entities
        TileEntities.init();

        // Initialize event handlers
        proxy.registerEventHandlers();

        // Initialize mod recipes
        Recipes.init();

        // Register the Waila data provider
        // FMLInterModComms.sendMessage("Waila", "register", "com.kithio.thallus.waila.WailaDataProvider.callbackRegister");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        AchievementHandler.init();
    }
}
