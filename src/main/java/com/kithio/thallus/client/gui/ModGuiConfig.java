package com.kithio.thallus.client.gui;

import com.kithio.thallus.handler.ConfigurationHandler;
import com.kithio.thallus.reference.Reference;
import cpw.mods.fml.client.config.DummyConfigElement.DummyCategoryElement;
import cpw.mods.fml.client.config.GuiConfig;
import cpw.mods.fml.client.config.GuiConfigEntries;
import cpw.mods.fml.client.config.GuiConfigEntries.CategoryEntry;
import cpw.mods.fml.client.config.IConfigElement;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.resources.I18n;
import net.minecraftforge.common.config.ConfigElement;

import java.util.ArrayList;
import java.util.List;

public class ModGuiConfig extends GuiConfig
{
    public ModGuiConfig(GuiScreen guiScreen)
    {
        super(guiScreen,
                getConfigElements(),
                Reference.MOD_ID,
                false,
                false,
                GuiConfig.getAbridgedConfigPath(ConfigurationHandler.configuration.toString()));
    }

    private static List<IConfigElement> getConfigElements()
    {
        List<IConfigElement> list = new ArrayList<IConfigElement>();
        list.add(new DummyCategoryElement(ConfigurationHandler.CONFIG_CATERGORY[0], "config.thallus:achievementConfig", AchievementEntry.class));
        list.add(new DummyCategoryElement(ConfigurationHandler.CONFIG_CATERGORY[1], "config.thallus:blockConfig", BlockEntry.class));
        list.add(new DummyCategoryElement(ConfigurationHandler.CONFIG_CATERGORY[2], "config.thallus:debugConfig", DebugEntry.class));
        list.add(new DummyCategoryElement(ConfigurationHandler.CONFIG_CATERGORY[3], "config.thallus:guiConfig", GuiEntry.class));
        list.add(new DummyCategoryElement(ConfigurationHandler.CONFIG_CATERGORY[4], "config.thallus:itemConfig", ItemEntry.class));
        list.add(new DummyCategoryElement(ConfigurationHandler.CONFIG_CATERGORY[5], "config.thallus:miscellaneousConfig", MiscellaneousEntry.class));
        list.add(new DummyCategoryElement(ConfigurationHandler.CONFIG_CATERGORY[6], "config.thallus:soundConfig", SoundEntry.class));
        list.add(new DummyCategoryElement(ConfigurationHandler.CONFIG_CATERGORY[7], "config.thallus:worldConfig", WorldEntry.class));
        return list;
    }

    public static class AchievementEntry extends CategoryEntry
    {
        public AchievementEntry(GuiConfig owningScreen, GuiConfigEntries owningEntryList, IConfigElement prop)
        {
            super(owningScreen, owningEntryList, prop);
        }

        @Override
        protected GuiScreen buildChildScreen()
        {
            return new GuiConfig(this.owningScreen,
                    (new ConfigElement(ConfigurationHandler.configuration.getCategory(ConfigurationHandler.CONFIG_CATERGORY[0]))).getChildElements(),
                    Reference.MOD_ID, true, false,
                    GuiConfig.getAbridgedConfigPath(ConfigurationHandler.configuration.toString()),
                    I18n.format("thallus.configgui."));
        }
    }

    public static class BlockEntry extends CategoryEntry
    {
        public BlockEntry(GuiConfig owningScreen, GuiConfigEntries owningEntryList, IConfigElement prop)
        {
            super(owningScreen, owningEntryList, prop);
        }

        @Override
        protected GuiScreen buildChildScreen()
        {
            return new GuiConfig(this.owningScreen,
                    (new ConfigElement(ConfigurationHandler.configuration.getCategory(ConfigurationHandler.CONFIG_CATERGORY[1]))).getChildElements(),
                    Reference.MOD_ID, true, false,
                    GuiConfig.getAbridgedConfigPath(ConfigurationHandler.configuration.toString()));
        }
    }

    public static class DebugEntry extends CategoryEntry
    {
        public DebugEntry(GuiConfig owningScreen, GuiConfigEntries owningEntryList, IConfigElement prop)
        {
            super(owningScreen, owningEntryList, prop);
        }

        @Override
        protected GuiScreen buildChildScreen()
        {
            return new GuiConfig(this.owningScreen,
                    (new ConfigElement(ConfigurationHandler.configuration.getCategory(ConfigurationHandler.CONFIG_CATERGORY[2]))).getChildElements(),
                    Reference.MOD_ID, false, true,
                    GuiConfig.getAbridgedConfigPath(ConfigurationHandler.configuration.toString()));
        }
    }

    public static class GuiEntry extends CategoryEntry
    {
        public GuiEntry(GuiConfig owningScreen, GuiConfigEntries owningEntryList, IConfigElement prop)
        {
            super(owningScreen, owningEntryList, prop);
        }

        @Override
        protected GuiScreen buildChildScreen()
        {
            return new GuiConfig(this.owningScreen,
                    (new ConfigElement(ConfigurationHandler.configuration.getCategory(ConfigurationHandler.CONFIG_CATERGORY[3]))).getChildElements(),
                    Reference.MOD_ID, true, false,
                    GuiConfig.getAbridgedConfigPath(ConfigurationHandler.configuration.toString()));
        }
    }

    public static class ItemEntry extends CategoryEntry
    {
        public ItemEntry(GuiConfig owningScreen, GuiConfigEntries owningEntryList, IConfigElement prop)
        {
            super(owningScreen, owningEntryList, prop);
        }

        @Override
        protected GuiScreen buildChildScreen()
        {
            return new GuiConfig(this.owningScreen,
                    (new ConfigElement(ConfigurationHandler.configuration.getCategory(ConfigurationHandler.CONFIG_CATERGORY[4]))).getChildElements(),
                    Reference.MOD_ID, true, false,
                    GuiConfig.getAbridgedConfigPath(ConfigurationHandler.configuration.toString()));
        }
    }

    public static class MiscellaneousEntry extends CategoryEntry
    {
        public MiscellaneousEntry(GuiConfig owningScreen, GuiConfigEntries owningEntryList, IConfigElement prop)
        {
            super(owningScreen, owningEntryList, prop);
        }

        @Override
        protected GuiScreen buildChildScreen()
        {
            return new GuiConfig(this.owningScreen,
                    (new ConfigElement(ConfigurationHandler.configuration.getCategory(ConfigurationHandler.CONFIG_CATERGORY[5]))).getChildElements(),
                    Reference.MOD_ID, true, false,
                    GuiConfig.getAbridgedConfigPath(ConfigurationHandler.configuration.toString()));
        }
    }

    public static class SoundEntry extends CategoryEntry
    {
        public SoundEntry(GuiConfig owningScreen, GuiConfigEntries owningEntryList, IConfigElement prop)
        {
            super(owningScreen, owningEntryList, prop);
        }

        @Override
        protected GuiScreen buildChildScreen()
        {
            return new GuiConfig(this.owningScreen,
                    (new ConfigElement(ConfigurationHandler.configuration.getCategory(ConfigurationHandler.CONFIG_CATERGORY[6]))).getChildElements(),
                    Reference.MOD_ID, true, false,
                    GuiConfig.getAbridgedConfigPath(ConfigurationHandler.configuration.toString()));
        }
    }

    public static class WorldEntry extends CategoryEntry
    {
        public WorldEntry(GuiConfig owningScreen, GuiConfigEntries owningEntryList, IConfigElement prop)
        {
            super(owningScreen, owningEntryList, prop);
        }

        @Override
        protected GuiScreen buildChildScreen()
        {
            return new GuiConfig(this.owningScreen,
                    (new ConfigElement(ConfigurationHandler.configuration.getCategory(ConfigurationHandler.CONFIG_CATERGORY[7]))).getChildElements(),
                    Reference.MOD_ID, true, false,
                    GuiConfig.getAbridgedConfigPath(ConfigurationHandler.configuration.toString()));
        }
    }
}
