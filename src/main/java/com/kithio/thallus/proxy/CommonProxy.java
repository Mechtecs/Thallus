package com.kithio.thallus.proxy;

import com.kithio.thallus.handler.ConfigurationHandler;
import com.kithio.thallus.handler.PlayerEventHandler;
import cpw.mods.fml.common.FMLCommonHandler;
import net.minecraftforge.common.MinecraftForge;

public abstract class CommonProxy implements IProxy
{
    public void registerEventHandlers()
    {
        PlayerEventHandler playerEventHandler = new PlayerEventHandler();

        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
        MinecraftForge.EVENT_BUS.register(playerEventHandler);
        FMLCommonHandler.instance().bus().register(playerEventHandler);
    }
}
