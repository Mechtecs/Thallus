package com.kithio.thallus.creativetab;

import com.kithio.thallus.init.ModBlocks;
import com.kithio.thallus.init.ModItems;
import com.kithio.thallus.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class ThallusTabs
{
    public static final CreativeTabs tabBlock = new CreativeTabs(Reference.MOD_ID.toLowerCase() + ":blocks")
    {
        @Override
        public Item getTabIconItem()
        {
            return Item.getItemFromBlock(Blocks.skull);
        }
    };

    public static final CreativeTabs tabItems = new CreativeTabs(Reference.MOD_ID.toLowerCase() + ":items")
    {
        @Override
        public Item getTabIconItem()
        {
            return Items.stone_sword;
        }
    };
}
