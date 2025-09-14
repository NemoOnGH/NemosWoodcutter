package com.devnemo.nemos.woodcutter.item.recipe;

import com.devnemo.nemos.woodcutter.recipe.SingleWithCountRecipe;
import com.devnemo.nemos.woodcutter.recipe.WoodcuttingRecipe;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.item.crafting.RecipeSerializer;

import java.util.function.Supplier;

import static com.devnemo.nemos.woodcutter.Constants.LOG;
import static com.devnemo.nemos.woodcutter.Constants.MOD_ID;
import static com.devnemo.nemos.woodcutter.recipe.WoodcutterRecipeSerializer.WOODCUTTING;

public class ModRecipeSerializerFabric {

    public static void register() {
        LOG.info("Registering recipe serializer");

        WOODCUTTING = register("woodcutting", new SingleWithCountRecipe.Serializer<>(WoodcuttingRecipe::new));
    }

    private static <S extends RecipeSerializer<T>, T extends Recipe<?>> Supplier<S> register(String path, S serializer) {
        S registeredSerializer = Registry.register(BuiltInRegistries.RECIPE_SERIALIZER, ResourceLocation.fromNamespaceAndPath(MOD_ID, path), serializer);

        return () -> registeredSerializer;
    }
}
