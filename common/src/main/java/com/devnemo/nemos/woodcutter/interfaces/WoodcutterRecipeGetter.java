package com.devnemo.nemos.woodcutter.interfaces;

import com.devnemo.nemos.woodcutter.recipe.display.WoodcuttingRecipeDisplay;

public interface WoodcutterRecipeGetter {

    default WoodcuttingRecipeDisplay.Grouping nemosWoodcutter$getWoodcutterRecipeForSync() {
        return WoodcuttingRecipeDisplay.Grouping.empty();
    }

    default WoodcuttingRecipeDisplay.Grouping nemosWoodcutter$getWoodcutterRecipes() {
        return WoodcuttingRecipeDisplay.Grouping.empty();
    }
}
