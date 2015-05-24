package com.kithio.thallus.util;

import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.FakePlayer;

public class ItemHelper
{
    public static void spawnItemAtEntity(Entity entity, ItemStack stack, int delay)
    {
        if (!entity.worldObj.isRemote)
        {
            EntityItem item = new EntityItem(entity.worldObj, entity.posX + 0.5D, entity.posY + 0.5D, entity.posZ + 0.5D, stack);
            item.delayBeforeCanPickup = delay;
            entity.worldObj.spawnEntityInWorld(item);
        }
    }

    public static void spawnItemAtPlayer(EntityPlayer player, ItemStack stack)
    {
        if (!player.worldObj.isRemote)
        {
            EntityItem item = new EntityItem(player.worldObj, player.posX + 0.5D, player.posY + 0.5D, player.posZ + 0.5D, stack);
            player.worldObj.spawnEntityInWorld(item);
            if (!(player instanceof FakePlayer))
                item.onCollideWithPlayer(player);
        }
    }
}
