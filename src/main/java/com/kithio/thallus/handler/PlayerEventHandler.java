package com.kithio.thallus.handler;

import com.kithio.thallus.init.ModItems;
import com.kithio.thallus.reference.Configs;
import com.kithio.thallus.reference.Reference;
import com.kithio.thallus.util.StatsHelper;
import com.kithio.thallus.util.ItemHelper;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraftforge.event.entity.EntityEvent;

public class PlayerEventHandler
{
    @SubscribeEvent
    public void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event)
    {
        onPlayerLogin(event.player);
    }

    @SubscribeEvent
    public void onPlayerRespawn(PlayerEvent.PlayerRespawnEvent event)
    {
        onPlayerRespawn(event.player);
    }

    @SubscribeEvent
    public void onEntityConstructing(EntityEvent.EntityConstructing event)
    {
        if (event.entity instanceof EntityPlayer && StatsHelper.get((EntityPlayer) event.entity) == null)
        {
            StatsHelper.register((EntityPlayer) event.entity);
        }
    }

    @SubscribeEvent
    public void onItemPickup(PlayerEvent.ItemPickupEvent event)
    {
        onItemPickup(event.player, event.pickedUp);
    }

    @SubscribeEvent
    public void onCrafting(PlayerEvent.ItemCraftedEvent event)
    {
        onItemCrafted(event.player, event.crafting);
    }

    @SubscribeEvent
    public void onSmelting(PlayerEvent.ItemSmeltedEvent event)
    {
        onItemSmelt(event.player, event.smelting);
    }

    public void onPlayerLogin(EntityPlayer player)
    {
        StatsHelper stats = StatsHelper.get(player);

        player.addChatMessage(new ChatComponentText(UpdateHandler.status));
    }

    public void onPlayerRespawn(EntityPlayer player)
    {
        // TODO: Implement PlayerRespawnEventHandler (Keep Certain amount of items, Keep specific item, Get specific item on x Death)
    }

    public void onItemPickup(EntityPlayer player, EntityItem item)
    {
        // TODO: Implement ItemPickupEventHandler (Achievement on ItemPickup ??)

        //if (item.getEntityItem().getItem().equals(ModItems.testItem))
        //if (item.getEntityItem().getItem().equals(Item.getItemFromBlock(ModBlocks.testBlock))

        //player.addStat(Thallus.testAchievement, 1);
    }

    public void onItemSmelt(EntityPlayer player, ItemStack item)
    {
        // TODO: Implement ItemSmeltingHandler (Achievement on Smelt ??)

        //if (item.getItem().equals(ModItems.testItem))
        //if (item.getItem().equals(Item.getItemFromBlock(ModBlocks.testBlock))

        //player.addStat(Thallus.testAchievement, 1);
    }

    public void onItemCrafted(EntityPlayer player, ItemStack item)
    {
        // TODO: Implement ItemCraftedHandler (Achievement on Craft ??)

        //if (item.getItem().equals(ModItems.testItem))
        //if (item.getItem().equals(Item.getItemFromBlock(ModBlocks.testBlock))

        //player.addStat(AchievementHandler.theUnknownAchievement, 1);

        //player.addStat(Thallus.testAchievement, 1);
    }
}
