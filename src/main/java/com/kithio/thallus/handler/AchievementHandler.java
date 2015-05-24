package com.kithio.thallus.handler;

import com.kithio.thallus.init.ModItems;
import com.kithio.thallus.reference.Reference;
import net.minecraft.stats.Achievement;
import net.minecraft.stats.AchievementList;
import net.minecraftforge.common.AchievementPage;

import java.util.*;

public class AchievementHandler
{
    public static HashMap<String, Achievement> achievementList;
    public static AchievementPage achievementPage;
    static Achievement[] achievements;

    public static void init()
    {
        initAchievements();
        initAchievementPage();
    }

    private static void initAchievements()
    {
        achievements = new Achievement[] { };
    }

    private static void initAchievementPage()
    {
        achievementPage = new AchievementPage(Reference.MOD_NAME, achievements);
        AchievementPage.registerAchievementPage(achievementPage);
    }
}
