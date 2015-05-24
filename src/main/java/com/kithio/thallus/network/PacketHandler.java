package com.kithio.thallus.network;

import com.kithio.thallus.network.message.MessageTileEntityThallus;
import com.kithio.thallus.reference.Reference;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import cpw.mods.fml.relauncher.Side;

public class PacketHandler
{
    public static final SimpleNetworkWrapper INSTANCE = NetworkRegistry.INSTANCE.newSimpleChannel(Reference.MOD_ID.toLowerCase());

    public static void init()
    {
        INSTANCE.registerMessage(MessageTileEntityThallus.class, MessageTileEntityThallus.class, 0, Side.CLIENT);
    }
}
