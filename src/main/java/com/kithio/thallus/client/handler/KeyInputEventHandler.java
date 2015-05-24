package com.kithio.thallus.client.handler;

import com.kithio.thallus.client.settings.KeyBindings;
import com.kithio.thallus.reference.Key;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;

public class KeyInputEventHandler
{
    private static Key getPressedKeybinding()
    {
        //if (KeyBindings.toggle.isPressed())

        return Key.UNKNOWN;
    }

    @SubscribeEvent
    public void handleKeyInputEvent(InputEvent.KeyInputEvent event)
    {
        Key keyPressed = getPressedKeybinding();
        EntityPlayer player = Minecraft.getMinecraft().thePlayer;
    }
}
