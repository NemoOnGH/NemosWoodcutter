package com.devnemo.nemos.woodcutter.item.recipe;

import com.devnemo.nemos.woodcutter.recipe.SingleWithCountRecipe;
import com.devnemo.nemos.woodcutter.recipe.WoodcuttingRecipe;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import static com.devnemo.nemos.woodcutter.Constants.LOG;
import static com.devnemo.nemos.woodcutter.Constants.MOD_ID;
import static com.devnemo.nemos.woodcutter.recipe.WoodcutterRecipeSerializer.WOODCUTTING;

public class ModRecipeSerializerNeoForge {

    public static final DeferredRegister<RecipeSerializer<?>> RECIPE_SERIALIZER = DeferredRegister.create(BuiltInRegistries.RECIPE_SERIALIZER, MOD_ID);

    public static void register(IEventBus eventBus) {
        LOG.info("Registering recipe serializer");
        RECIPE_SERIALIZER.register(eventBus);

        WOODCUTTING = RECIPE_SERIALIZER.register("woodcutting", () -> new SingleWithCountRecipe.Serializer<>(WoodcuttingRecipe::new));
    }
}
