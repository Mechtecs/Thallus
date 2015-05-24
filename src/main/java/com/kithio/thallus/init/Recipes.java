package com.kithio.thallus.init;

public class Recipes
{
    public static void init()
    {
        initCraftRecipes();
        initSmeltRecipes();
    }

    private static void initCraftRecipes()
    {
        /*
         * Vanilla Shaped Recipe
         * GameRegistry.addRecipe(new ItemStack(ModItems.testItem), "xxx", "xxx", "x x", 'x', new ItemStack(Items.stick));
         *
         * Vanilla Shapeless Recipe
         * GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.testBlock), new ItemStack(ModItems.testItem), new ItemStack(Items.stick), new ItemStack(Blocks.gravel));
         *
         * Forge OreDict Shaped Recipe
         * GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.testItem), "xxx", "xxx", "x x", 'x', "stickWood"));
         *
         * Forge OreDict Shapeless Recipe
         * GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModBlocks.testBlock), new ItemStack(ModItems.testItem), "stickWood", "blockGravel"));
         */
    }

    private static void initSmeltRecipes()
    {
        /*
         * Vanilla Smelt Recipe
         * GameRegistry.addSmelting(ModItems.testItem, new ItemStack(Items.diamond), 0.0F);
         * GameRegistry.addSmelting(ModBlocks.testBlock, new ItemStack(Blocks.diamond_block), 0.0F);
         * GameRegistry.addSmelting(new ItemStack(ModBlocks.testBlock), new ItemStack(Items.carrot), 0.0F);
         */
    }
}
