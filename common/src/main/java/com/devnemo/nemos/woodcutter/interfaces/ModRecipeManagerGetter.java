package com.devnemo.nemos.woodcutter.interfaces;

import com.devnemo.nemos.woodcutter.client.recipebook.ClientModRecipeManager;
import com.devnemo.nemos.woodcutter.recipe.display.WoodcuttingRecipeDisplay;

public interface ModRecipeManagerGetter {

    default ClientModRecipeManager nemosWoodcutter$getModRecipeManager() {
        return new ClientModRecipeManager(WoodcuttingRecipeDisplay.Grouping.empty());
    }
}
