package net.vantaforge.sowandsimmer.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;
import net.vantaforge.sowandsimmer.item.ModItems;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }


    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {

        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, ModItems.GARLIC.get())
                .pattern("BB")
                .pattern("BB")
                .define('B', ModItems.GARLIC_CLOVE.get())
                .unlockedBy("has_garlic_clove", has(ModItems.GARLIC_CLOVE.get())).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ModItems.GARLIC_CLOVE.get(),4)
                .requires(ModItems.GARLIC.get())
                .unlockedBy("has_garlic", has(ModItems.GARLIC.get())).save(recipeOutput);
    }
}
