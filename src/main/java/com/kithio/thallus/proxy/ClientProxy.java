package com.kithio.thallus.proxy;

import com.kithio.thallus.client.handler.KeyInputEventHandler;
import com.kithio.thallus.client.settings.KeyBindings;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.common.FMLCommonHandler;

public class ClientProxy extends CommonProxy
{
    @Override
    public void registerKeyBindings()
    {
        // ClientRegistry.registerKeyBinding(KeyBindings.DEBUG);
    }

    @Override
    public void registerEventHandlers()
    {
        super.registerEventHandlers();
        FMLCommonHandler.instance().bus().register(new KeyInputEventHandler());
    }
}
