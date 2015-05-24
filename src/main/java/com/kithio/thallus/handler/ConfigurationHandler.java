package com.kithio.thallus.handler;

import com.kithio.thallus.reference.Configs;
import com.kithio.thallus.reference.Reference;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigurationHandler
{
    /*
     * 0: Achievement
     * 1: Block
     * 2: Debug
     * 3: Gui
     * 4: Item
     * 5: Miscellaneous
     * 6: Sound
     * 7: World
     */
    public static final String[] CONFIG_CATERGORY = { "achievement", "block", "debug", "gui", "item", "miscellaneous", "sound", "world" };
    public static Configuration configuration;

    public static void init(File configFile)
    {
        if (configuration == null)
        {
            configuration = new Configuration(configFile);
            loadConfiguration();
        }
    }

    private static void loadConfiguration()
    {
        // Configs.Item.DEBUG = configuration.getBoolean("DEBUG", CONFIG_CATERGORY[7], true, "Just a debug config Boolean.");

        if (configuration.hasChanged())
        {
            configuration.save();
        }
    }

    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event)
    {
        if (event.modID.equalsIgnoreCase(Reference.MOD_ID))
        {
            loadConfiguration();
        }
    }
}
