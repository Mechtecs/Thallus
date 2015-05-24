package com.kithio.thallus.util;

import com.kithio.thallus.reference.Reference;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import net.minecraftforge.common.IExtendedEntityProperties;

import java.lang.ref.WeakReference;

public class StatsHelper implements IExtendedEntityProperties
{
    public static final String PROP_NAME = Reference.MOD_NAME; // "Thallus"
    public WeakReference<EntityPlayer> player;

    public StatsHelper(EntityPlayer player)
    {
        this.player = new WeakReference<EntityPlayer>(player);
    }

    @Override
    public void saveNBTData(NBTTagCompound compound)
    {
        NBTTagCompound tagCompound = new NBTTagCompound();

        compound.setTag(PROP_NAME, tagCompound);
    }

    @Override
    public void loadNBTData(NBTTagCompound compound)
    {
        NBTTagCompound tagCompound = (NBTTagCompound) compound.getTag(PROP_NAME);
    }

    @Override
    public void init(Entity entity, World world)
    {

    }

    public void copyFrom(StatsHelper stats)
    {

    }

    public static void register(EntityPlayer player)
    {
        player.registerExtendedProperties(StatsHelper.PROP_NAME, new StatsHelper(player));
    }

    public static StatsHelper get(EntityPlayer player)
    {
        return (StatsHelper) player.getExtendedProperties(PROP_NAME);
    }
}
