package com.devnemo.nemos.woodcutter.datagen;

import biomesoplenty.api.block.BOPBlocks;
import biomesoplenty.api.item.BOPItems;
import biomesoplenty.init.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public class BiomesOPlentyRecipeProvider extends FabricRecipeProvider {
    
    public BiomesOPlentyRecipeProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> provider) {
        super(output, provider);
    }

    @Override
    protected @NotNull RecipeProvider createRecipeProvider(HolderLookup.Provider provider, RecipeOutput recipeOutput) {
        return new WoodcutterRecipeProvider(provider, recipeOutput) {

            @Override
            public void buildRecipes() {
                String hasFirLogsCriteria = "has_fir_logs";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModTags.Items.FIR_LOGS, hasFirLogsCriteria, BOPItems.FIR_PLANKS, 4);
                createWoodcuttingRecipe(RecipeCategory.TRANSPORTATION, ModTags.Items.FIR_LOGS, hasFirLogsCriteria, BOPItems.FIR_BOAT);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, ModTags.Items.FIR_LOGS, hasFirLogsCriteria, BOPItems.FIR_BUTTON, 16);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, ModTags.Items.FIR_LOGS, hasFirLogsCriteria, BOPItems.FIR_DOOR, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, ModTags.Items.FIR_LOGS, hasFirLogsCriteria, BOPItems.FIR_FENCE_GATE, 4);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, ModTags.Items.FIR_LOGS, hasFirLogsCriteria, BOPItems.FIR_FENCE, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, ModTags.Items.FIR_LOGS, hasFirLogsCriteria, BOPItems.FIR_PRESSURE_PLATE, 16);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, ModTags.Items.FIR_LOGS, hasFirLogsCriteria, BOPItems.FIR_SIGN, 12);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModTags.Items.FIR_LOGS, hasFirLogsCriteria, BOPItems.FIR_SLAB, 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModTags.Items.FIR_LOGS, hasFirLogsCriteria, BOPItems.FIR_STAIRS, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, ModTags.Items.FIR_LOGS, hasFirLogsCriteria, BOPItems.FIR_TRAPDOOR, 8);

                createWoodcuttingRecipe(RecipeCategory.TRANSPORTATION, BOPBlocks.FIR_PLANKS, 2, BOPItems.FIR_BOAT);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, BOPBlocks.FIR_PLANKS, BOPItems.FIR_BUTTON, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, BOPBlocks.FIR_PLANKS, 2, BOPItems.FIR_DOOR, 2);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, BOPBlocks.FIR_PLANKS, BOPItems.FIR_FENCE_GATE);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, BOPBlocks.FIR_PLANKS, BOPItems.FIR_FENCE);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, BOPBlocks.FIR_PLANKS, BOPItems.FIR_PRESSURE_PLATE, 4);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, BOPBlocks.FIR_PLANKS, BOPItems.FIR_SIGN, 3);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, BOPBlocks.FIR_PLANKS, BOPItems.FIR_SLAB, 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, BOPBlocks.FIR_PLANKS, BOPItems.FIR_STAIRS);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, BOPBlocks.FIR_PLANKS, BOPItems.FIR_TRAPDOOR, 2);

                String hasPineLogsCriteria = "has_pine_logs";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModTags.Items.PINE_LOGS, hasPineLogsCriteria, BOPItems.PINE_PLANKS, 4);
                createWoodcuttingRecipe(RecipeCategory.TRANSPORTATION, ModTags.Items.PINE_LOGS, hasPineLogsCriteria, BOPItems.PINE_BOAT);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, ModTags.Items.PINE_LOGS, hasPineLogsCriteria, BOPItems.PINE_BUTTON, 16);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, ModTags.Items.PINE_LOGS, hasPineLogsCriteria, BOPItems.PINE_DOOR, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, ModTags.Items.PINE_LOGS, hasPineLogsCriteria, BOPItems.PINE_FENCE_GATE, 4);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, ModTags.Items.PINE_LOGS, hasPineLogsCriteria, BOPItems.PINE_FENCE, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, ModTags.Items.PINE_LOGS, hasPineLogsCriteria, BOPItems.PINE_PRESSURE_PLATE, 16);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, ModTags.Items.PINE_LOGS, hasPineLogsCriteria, BOPItems.PINE_SIGN, 12);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModTags.Items.PINE_LOGS, hasPineLogsCriteria, BOPItems.PINE_SLAB, 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModTags.Items.PINE_LOGS, hasPineLogsCriteria, BOPItems.PINE_STAIRS, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, ModTags.Items.PINE_LOGS, hasPineLogsCriteria, BOPItems.PINE_TRAPDOOR, 8);

                createWoodcuttingRecipe(RecipeCategory.TRANSPORTATION, BOPBlocks.PINE_PLANKS, 2, BOPItems.PINE_BOAT);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, BOPBlocks.PINE_PLANKS, BOPItems.PINE_BUTTON, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, BOPBlocks.PINE_PLANKS, 2, BOPItems.PINE_DOOR, 2);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, BOPBlocks.PINE_PLANKS, BOPItems.PINE_FENCE_GATE);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, BOPBlocks.PINE_PLANKS, BOPItems.PINE_FENCE);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, BOPBlocks.PINE_PLANKS, BOPItems.PINE_PRESSURE_PLATE, 4);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, BOPBlocks.PINE_PLANKS, BOPItems.PINE_SIGN, 3);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, BOPBlocks.PINE_PLANKS, BOPItems.PINE_SLAB, 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, BOPBlocks.PINE_PLANKS, BOPItems.PINE_STAIRS);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, BOPBlocks.PINE_PLANKS, BOPItems.PINE_TRAPDOOR, 2);

                String hasMapleLogsCriteria = "has_maple_logs";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModTags.Items.MAPLE_LOGS, hasMapleLogsCriteria, BOPItems.MAPLE_PLANKS, 4);
                createWoodcuttingRecipe(RecipeCategory.TRANSPORTATION, ModTags.Items.MAPLE_LOGS, hasMapleLogsCriteria, BOPItems.MAPLE_BOAT);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, ModTags.Items.MAPLE_LOGS, hasMapleLogsCriteria, BOPItems.MAPLE_BUTTON, 16);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, ModTags.Items.MAPLE_LOGS, hasMapleLogsCriteria, BOPItems.MAPLE_DOOR, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, ModTags.Items.MAPLE_LOGS, hasMapleLogsCriteria, BOPItems.MAPLE_FENCE_GATE, 4);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, ModTags.Items.MAPLE_LOGS, hasMapleLogsCriteria, BOPItems.MAPLE_FENCE, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, ModTags.Items.MAPLE_LOGS, hasMapleLogsCriteria, BOPItems.MAPLE_PRESSURE_PLATE, 16);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, ModTags.Items.MAPLE_LOGS, hasMapleLogsCriteria, BOPItems.MAPLE_SIGN, 12);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModTags.Items.MAPLE_LOGS, hasMapleLogsCriteria, BOPItems.MAPLE_SLAB, 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModTags.Items.MAPLE_LOGS, hasMapleLogsCriteria, BOPItems.MAPLE_STAIRS, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, ModTags.Items.MAPLE_LOGS, hasMapleLogsCriteria, BOPItems.MAPLE_TRAPDOOR, 8);

                createWoodcuttingRecipe(RecipeCategory.TRANSPORTATION, BOPBlocks.MAPLE_PLANKS, 2, BOPItems.MAPLE_BOAT);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, BOPBlocks.MAPLE_PLANKS, BOPItems.MAPLE_BUTTON, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, BOPBlocks.MAPLE_PLANKS, 2, BOPItems.MAPLE_DOOR, 2);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, BOPBlocks.MAPLE_PLANKS, BOPItems.MAPLE_FENCE_GATE);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, BOPBlocks.MAPLE_PLANKS, BOPItems.MAPLE_FENCE);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, BOPBlocks.MAPLE_PLANKS, BOPItems.MAPLE_PRESSURE_PLATE, 4);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, BOPBlocks.MAPLE_PLANKS, BOPItems.MAPLE_SIGN, 3);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, BOPBlocks.MAPLE_PLANKS, BOPItems.MAPLE_SLAB, 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, BOPBlocks.MAPLE_PLANKS, BOPItems.MAPLE_STAIRS);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, BOPBlocks.MAPLE_PLANKS, BOPItems.MAPLE_TRAPDOOR, 2);

                String hasRedwoodLogsCriteria = "has_redwood_logs";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModTags.Items.REDWOOD_LOGS, hasRedwoodLogsCriteria, BOPItems.REDWOOD_PLANKS, 4);
                createWoodcuttingRecipe(RecipeCategory.TRANSPORTATION, ModTags.Items.REDWOOD_LOGS, hasRedwoodLogsCriteria, BOPItems.REDWOOD_BOAT);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, ModTags.Items.REDWOOD_LOGS, hasRedwoodLogsCriteria, BOPItems.REDWOOD_BUTTON, 16);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, ModTags.Items.REDWOOD_LOGS, hasRedwoodLogsCriteria, BOPItems.REDWOOD_DOOR, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, ModTags.Items.REDWOOD_LOGS, hasRedwoodLogsCriteria, BOPItems.REDWOOD_FENCE_GATE, 4);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, ModTags.Items.REDWOOD_LOGS, hasRedwoodLogsCriteria, BOPItems.REDWOOD_FENCE, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, ModTags.Items.REDWOOD_LOGS, hasRedwoodLogsCriteria, BOPItems.REDWOOD_PRESSURE_PLATE, 16);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, ModTags.Items.REDWOOD_LOGS, hasRedwoodLogsCriteria, BOPItems.REDWOOD_SIGN, 12);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModTags.Items.REDWOOD_LOGS, hasRedwoodLogsCriteria, BOPItems.REDWOOD_SLAB, 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModTags.Items.REDWOOD_LOGS, hasRedwoodLogsCriteria, BOPItems.REDWOOD_STAIRS, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, ModTags.Items.REDWOOD_LOGS, hasRedwoodLogsCriteria, BOPItems.REDWOOD_TRAPDOOR, 8);

                createWoodcuttingRecipe(RecipeCategory.TRANSPORTATION, BOPBlocks.REDWOOD_PLANKS, 2, BOPItems.REDWOOD_BOAT);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, BOPBlocks.REDWOOD_PLANKS, BOPItems.REDWOOD_BUTTON, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, BOPBlocks.REDWOOD_PLANKS, 2, BOPItems.REDWOOD_DOOR, 2);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, BOPBlocks.REDWOOD_PLANKS, BOPItems.REDWOOD_FENCE_GATE);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, BOPBlocks.REDWOOD_PLANKS, BOPItems.REDWOOD_FENCE);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, BOPBlocks.REDWOOD_PLANKS, BOPItems.REDWOOD_PRESSURE_PLATE, 4);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, BOPBlocks.REDWOOD_PLANKS, BOPItems.REDWOOD_SIGN, 3);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, BOPBlocks.REDWOOD_PLANKS, BOPItems.REDWOOD_SLAB, 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, BOPBlocks.REDWOOD_PLANKS, BOPItems.REDWOOD_STAIRS);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, BOPBlocks.REDWOOD_PLANKS, BOPItems.REDWOOD_TRAPDOOR, 2);

                String hasMahoganyLogsCriteria = "has_mahogany_logs";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModTags.Items.MAHOGANY_LOGS, hasMahoganyLogsCriteria, BOPItems.MAHOGANY_PLANKS, 4);
                createWoodcuttingRecipe(RecipeCategory.TRANSPORTATION, ModTags.Items.MAHOGANY_LOGS, hasMahoganyLogsCriteria, BOPItems.MAHOGANY_BOAT);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, ModTags.Items.MAHOGANY_LOGS, hasMahoganyLogsCriteria, BOPItems.MAHOGANY_BUTTON, 16);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, ModTags.Items.MAHOGANY_LOGS, hasMahoganyLogsCriteria, BOPItems.MAHOGANY_DOOR, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, ModTags.Items.MAHOGANY_LOGS, hasMahoganyLogsCriteria, BOPItems.MAHOGANY_FENCE_GATE, 4);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, ModTags.Items.MAHOGANY_LOGS, hasMahoganyLogsCriteria, BOPItems.MAHOGANY_FENCE, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, ModTags.Items.MAHOGANY_LOGS, hasMahoganyLogsCriteria, BOPItems.MAHOGANY_PRESSURE_PLATE, 16);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, ModTags.Items.MAHOGANY_LOGS, hasMahoganyLogsCriteria, BOPItems.MAHOGANY_SIGN, 12);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModTags.Items.MAHOGANY_LOGS, hasMahoganyLogsCriteria, BOPItems.MAHOGANY_SLAB, 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModTags.Items.MAHOGANY_LOGS, hasMahoganyLogsCriteria, BOPItems.MAHOGANY_STAIRS, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, ModTags.Items.MAHOGANY_LOGS, hasMahoganyLogsCriteria, BOPItems.MAHOGANY_TRAPDOOR, 8);

                createWoodcuttingRecipe(RecipeCategory.TRANSPORTATION, BOPBlocks.MAHOGANY_PLANKS, 2, BOPItems.MAHOGANY_BOAT);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, BOPBlocks.MAHOGANY_PLANKS, BOPItems.MAHOGANY_BUTTON, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, BOPBlocks.MAHOGANY_PLANKS, 2, BOPItems.MAHOGANY_DOOR, 2);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, BOPBlocks.MAHOGANY_PLANKS, BOPItems.MAHOGANY_FENCE_GATE);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, BOPBlocks.MAHOGANY_PLANKS, BOPItems.MAHOGANY_FENCE);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, BOPBlocks.MAHOGANY_PLANKS, BOPItems.MAHOGANY_PRESSURE_PLATE, 4);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, BOPBlocks.MAHOGANY_PLANKS, BOPItems.MAHOGANY_SIGN, 3);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, BOPBlocks.MAHOGANY_PLANKS, BOPItems.MAHOGANY_SLAB, 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, BOPBlocks.MAHOGANY_PLANKS, BOPItems.MAHOGANY_STAIRS);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, BOPBlocks.MAHOGANY_PLANKS, BOPItems.MAHOGANY_TRAPDOOR, 2);

                String hasJacarandaLogsCriteria = "has_jacaranda_logs";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModTags.Items.JACARANDA_LOGS, hasJacarandaLogsCriteria, BOPItems.JACARANDA_PLANKS, 4);
                createWoodcuttingRecipe(RecipeCategory.TRANSPORTATION, ModTags.Items.JACARANDA_LOGS, hasJacarandaLogsCriteria, BOPItems.JACARANDA_BOAT);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, ModTags.Items.JACARANDA_LOGS, hasJacarandaLogsCriteria, BOPItems.JACARANDA_BUTTON, 16);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, ModTags.Items.JACARANDA_LOGS, hasJacarandaLogsCriteria, BOPItems.JACARANDA_DOOR, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, ModTags.Items.JACARANDA_LOGS, hasJacarandaLogsCriteria, BOPItems.JACARANDA_FENCE_GATE, 4);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, ModTags.Items.JACARANDA_LOGS, hasJacarandaLogsCriteria, BOPItems.JACARANDA_FENCE, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, ModTags.Items.JACARANDA_LOGS, hasJacarandaLogsCriteria, BOPItems.JACARANDA_PRESSURE_PLATE, 16);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, ModTags.Items.JACARANDA_LOGS, hasJacarandaLogsCriteria, BOPItems.JACARANDA_SIGN, 12);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModTags.Items.JACARANDA_LOGS, hasJacarandaLogsCriteria, BOPItems.JACARANDA_SLAB, 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModTags.Items.JACARANDA_LOGS, hasJacarandaLogsCriteria, BOPItems.JACARANDA_STAIRS, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, ModTags.Items.JACARANDA_LOGS, hasJacarandaLogsCriteria, BOPItems.JACARANDA_TRAPDOOR, 8);

                createWoodcuttingRecipe(RecipeCategory.TRANSPORTATION, BOPBlocks.JACARANDA_PLANKS, 2, BOPItems.JACARANDA_BOAT);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, BOPBlocks.JACARANDA_PLANKS, BOPItems.JACARANDA_BUTTON, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, BOPBlocks.JACARANDA_PLANKS, 2, BOPItems.JACARANDA_DOOR, 2);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, BOPBlocks.JACARANDA_PLANKS, BOPItems.JACARANDA_FENCE_GATE);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, BOPBlocks.JACARANDA_PLANKS, BOPItems.JACARANDA_FENCE);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, BOPBlocks.JACARANDA_PLANKS, BOPItems.JACARANDA_PRESSURE_PLATE, 4);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, BOPBlocks.JACARANDA_PLANKS, BOPItems.JACARANDA_SIGN, 3);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, BOPBlocks.JACARANDA_PLANKS, BOPItems.JACARANDA_SLAB, 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, BOPBlocks.JACARANDA_PLANKS, BOPItems.JACARANDA_STAIRS);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, BOPBlocks.JACARANDA_PLANKS, BOPItems.JACARANDA_TRAPDOOR, 2);

                String hasPalmLogsCriteria = "has_palm_logs";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModTags.Items.PALM_LOGS, hasPalmLogsCriteria, BOPItems.PALM_PLANKS, 4);
                createWoodcuttingRecipe(RecipeCategory.TRANSPORTATION, ModTags.Items.PALM_LOGS, hasPalmLogsCriteria, BOPItems.PALM_BOAT);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, ModTags.Items.PALM_LOGS, hasPalmLogsCriteria, BOPItems.PALM_BUTTON, 16);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, ModTags.Items.PALM_LOGS, hasPalmLogsCriteria, BOPItems.PALM_DOOR, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, ModTags.Items.PALM_LOGS, hasPalmLogsCriteria, BOPItems.PALM_FENCE_GATE, 4);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, ModTags.Items.PALM_LOGS, hasPalmLogsCriteria, BOPItems.PALM_FENCE, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, ModTags.Items.PALM_LOGS, hasPalmLogsCriteria, BOPItems.PALM_PRESSURE_PLATE, 16);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, ModTags.Items.PALM_LOGS, hasPalmLogsCriteria, BOPItems.PALM_SIGN, 12);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModTags.Items.PALM_LOGS, hasPalmLogsCriteria, BOPItems.PALM_SLAB, 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModTags.Items.PALM_LOGS, hasPalmLogsCriteria, BOPItems.PALM_STAIRS, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, ModTags.Items.PALM_LOGS, hasPalmLogsCriteria, BOPItems.PALM_TRAPDOOR, 8);

                createWoodcuttingRecipe(RecipeCategory.TRANSPORTATION, BOPBlocks.PALM_PLANKS, 2, BOPItems.PALM_BOAT);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, BOPBlocks.PALM_PLANKS, BOPItems.PALM_BUTTON, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, BOPBlocks.PALM_PLANKS, 2, BOPItems.PALM_DOOR, 2);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, BOPBlocks.PALM_PLANKS, BOPItems.PALM_FENCE_GATE);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, BOPBlocks.PALM_PLANKS, BOPItems.PALM_FENCE);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, BOPBlocks.PALM_PLANKS, BOPItems.PALM_PRESSURE_PLATE, 4);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, BOPBlocks.PALM_PLANKS, BOPItems.PALM_SIGN, 3);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, BOPBlocks.PALM_PLANKS, BOPItems.PALM_SLAB, 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, BOPBlocks.PALM_PLANKS, BOPItems.PALM_STAIRS);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, BOPBlocks.PALM_PLANKS, BOPItems.PALM_TRAPDOOR, 2);

                String hasWillowLogsCriteria = "has_willow_logs";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModTags.Items.WILLOW_LOGS, hasWillowLogsCriteria, BOPItems.WILLOW_PLANKS, 4);
                createWoodcuttingRecipe(RecipeCategory.TRANSPORTATION, ModTags.Items.WILLOW_LOGS, hasWillowLogsCriteria, BOPItems.WILLOW_BOAT);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, ModTags.Items.WILLOW_LOGS, hasWillowLogsCriteria, BOPItems.WILLOW_BUTTON, 16);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, ModTags.Items.WILLOW_LOGS, hasWillowLogsCriteria, BOPItems.WILLOW_DOOR, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, ModTags.Items.WILLOW_LOGS, hasWillowLogsCriteria, BOPItems.WILLOW_FENCE_GATE, 4);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, ModTags.Items.WILLOW_LOGS, hasWillowLogsCriteria, BOPItems.WILLOW_FENCE, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, ModTags.Items.WILLOW_LOGS, hasWillowLogsCriteria, BOPItems.WILLOW_PRESSURE_PLATE, 16);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, ModTags.Items.WILLOW_LOGS, hasWillowLogsCriteria, BOPItems.WILLOW_SIGN, 12);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModTags.Items.WILLOW_LOGS, hasWillowLogsCriteria, BOPItems.WILLOW_SLAB, 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModTags.Items.WILLOW_LOGS, hasWillowLogsCriteria, BOPItems.WILLOW_STAIRS, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, ModTags.Items.WILLOW_LOGS, hasWillowLogsCriteria, BOPItems.WILLOW_TRAPDOOR, 8);

                createWoodcuttingRecipe(RecipeCategory.TRANSPORTATION, BOPBlocks.WILLOW_PLANKS, 2, BOPItems.WILLOW_BOAT);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, BOPBlocks.WILLOW_PLANKS, BOPItems.WILLOW_BUTTON, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, BOPBlocks.WILLOW_PLANKS, 2, BOPItems.WILLOW_DOOR, 2);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, BOPBlocks.WILLOW_PLANKS, BOPItems.WILLOW_FENCE_GATE);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, BOPBlocks.WILLOW_PLANKS, BOPItems.WILLOW_FENCE);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, BOPBlocks.WILLOW_PLANKS, BOPItems.WILLOW_PRESSURE_PLATE, 4);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, BOPBlocks.WILLOW_PLANKS, BOPItems.WILLOW_SIGN, 3);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, BOPBlocks.WILLOW_PLANKS, BOPItems.WILLOW_SLAB, 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, BOPBlocks.WILLOW_PLANKS, BOPItems.WILLOW_STAIRS);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, BOPBlocks.WILLOW_PLANKS, BOPItems.WILLOW_TRAPDOOR, 2);

                String hasDeadLogsCriteria = "has_dead_logs";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModTags.Items.DEAD_LOGS, hasDeadLogsCriteria, BOPItems.DEAD_PLANKS, 4);
                createWoodcuttingRecipe(RecipeCategory.TRANSPORTATION, ModTags.Items.DEAD_LOGS, hasDeadLogsCriteria, BOPItems.DEAD_BOAT);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, ModTags.Items.DEAD_LOGS, hasDeadLogsCriteria, BOPItems.DEAD_BUTTON, 16);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, ModTags.Items.DEAD_LOGS, hasDeadLogsCriteria, BOPItems.DEAD_DOOR, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, ModTags.Items.DEAD_LOGS, hasDeadLogsCriteria, BOPItems.DEAD_FENCE_GATE, 4);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, ModTags.Items.DEAD_LOGS, hasDeadLogsCriteria, BOPItems.DEAD_FENCE, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, ModTags.Items.DEAD_LOGS, hasDeadLogsCriteria, BOPItems.DEAD_PRESSURE_PLATE, 16);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, ModTags.Items.DEAD_LOGS, hasDeadLogsCriteria, BOPItems.DEAD_SIGN, 12);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModTags.Items.DEAD_LOGS, hasDeadLogsCriteria, BOPItems.DEAD_SLAB, 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModTags.Items.DEAD_LOGS, hasDeadLogsCriteria, BOPItems.DEAD_STAIRS, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, ModTags.Items.DEAD_LOGS, hasDeadLogsCriteria, BOPItems.DEAD_TRAPDOOR, 8);

                createWoodcuttingRecipe(RecipeCategory.TRANSPORTATION, BOPBlocks.DEAD_PLANKS, 2, BOPItems.DEAD_BOAT);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, BOPBlocks.DEAD_PLANKS, BOPItems.DEAD_BUTTON, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, BOPBlocks.DEAD_PLANKS, 2, BOPItems.DEAD_DOOR, 2);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, BOPBlocks.DEAD_PLANKS, BOPItems.DEAD_FENCE_GATE);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, BOPBlocks.DEAD_PLANKS, BOPItems.DEAD_FENCE);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, BOPBlocks.DEAD_PLANKS, BOPItems.DEAD_PRESSURE_PLATE, 4);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, BOPBlocks.DEAD_PLANKS, BOPItems.DEAD_SIGN, 3);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, BOPBlocks.DEAD_PLANKS, BOPItems.DEAD_SLAB, 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, BOPBlocks.DEAD_PLANKS, BOPItems.DEAD_STAIRS);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, BOPBlocks.DEAD_PLANKS, BOPItems.DEAD_TRAPDOOR, 2);

                String hasMagicLogsCriteria = "has_magic_logs";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModTags.Items.MAGIC_LOGS, hasMagicLogsCriteria, BOPItems.MAGIC_PLANKS, 4);
                createWoodcuttingRecipe(RecipeCategory.TRANSPORTATION, ModTags.Items.MAGIC_LOGS, hasMagicLogsCriteria, BOPItems.MAGIC_BOAT);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, ModTags.Items.MAGIC_LOGS, hasMagicLogsCriteria, BOPItems.MAGIC_BUTTON, 16);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, ModTags.Items.MAGIC_LOGS, hasMagicLogsCriteria, BOPItems.MAGIC_DOOR, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, ModTags.Items.MAGIC_LOGS, hasMagicLogsCriteria, BOPItems.MAGIC_FENCE_GATE, 4);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, ModTags.Items.MAGIC_LOGS, hasMagicLogsCriteria, BOPItems.MAGIC_FENCE, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, ModTags.Items.MAGIC_LOGS, hasMagicLogsCriteria, BOPItems.MAGIC_PRESSURE_PLATE, 16);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, ModTags.Items.MAGIC_LOGS, hasMagicLogsCriteria, BOPItems.MAGIC_SIGN, 12);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModTags.Items.MAGIC_LOGS, hasMagicLogsCriteria, BOPItems.MAGIC_SLAB, 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModTags.Items.MAGIC_LOGS, hasMagicLogsCriteria, BOPItems.MAGIC_STAIRS, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, ModTags.Items.MAGIC_LOGS, hasMagicLogsCriteria, BOPItems.MAGIC_TRAPDOOR, 8);

                createWoodcuttingRecipe(RecipeCategory.TRANSPORTATION, BOPBlocks.MAGIC_PLANKS, 2, BOPItems.MAGIC_BOAT);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, BOPBlocks.MAGIC_PLANKS, BOPItems.MAGIC_BUTTON, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, BOPBlocks.MAGIC_PLANKS, 2, BOPItems.MAGIC_DOOR, 2);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, BOPBlocks.MAGIC_PLANKS, BOPItems.MAGIC_FENCE_GATE);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, BOPBlocks.MAGIC_PLANKS, BOPItems.MAGIC_FENCE);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, BOPBlocks.MAGIC_PLANKS, BOPItems.MAGIC_PRESSURE_PLATE, 4);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, BOPBlocks.MAGIC_PLANKS, BOPItems.MAGIC_SIGN, 3);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, BOPBlocks.MAGIC_PLANKS, BOPItems.MAGIC_SLAB, 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, BOPBlocks.MAGIC_PLANKS, BOPItems.MAGIC_STAIRS);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, BOPBlocks.MAGIC_PLANKS, BOPItems.MAGIC_TRAPDOOR, 2);

                String hasUmbranLogsCriteria = "has_umbran_logs";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModTags.Items.UMBRAN_LOGS, hasUmbranLogsCriteria, BOPItems.UMBRAN_PLANKS, 4);
                createWoodcuttingRecipe(RecipeCategory.TRANSPORTATION, ModTags.Items.UMBRAN_LOGS, hasUmbranLogsCriteria, BOPItems.UMBRAN_BOAT);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, ModTags.Items.UMBRAN_LOGS, hasUmbranLogsCriteria, BOPItems.UMBRAN_BUTTON, 16);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, ModTags.Items.UMBRAN_LOGS, hasUmbranLogsCriteria, BOPItems.UMBRAN_DOOR, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, ModTags.Items.UMBRAN_LOGS, hasUmbranLogsCriteria, BOPItems.UMBRAN_FENCE_GATE, 4);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, ModTags.Items.UMBRAN_LOGS, hasUmbranLogsCriteria, BOPItems.UMBRAN_FENCE, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, ModTags.Items.UMBRAN_LOGS, hasUmbranLogsCriteria, BOPItems.UMBRAN_PRESSURE_PLATE, 16);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, ModTags.Items.UMBRAN_LOGS, hasUmbranLogsCriteria, BOPItems.UMBRAN_SIGN, 12);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModTags.Items.UMBRAN_LOGS, hasUmbranLogsCriteria, BOPItems.UMBRAN_SLAB, 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModTags.Items.UMBRAN_LOGS, hasUmbranLogsCriteria, BOPItems.UMBRAN_STAIRS, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, ModTags.Items.UMBRAN_LOGS, hasUmbranLogsCriteria, BOPItems.UMBRAN_TRAPDOOR, 8);

                createWoodcuttingRecipe(RecipeCategory.TRANSPORTATION, BOPBlocks.UMBRAN_PLANKS, 2, BOPItems.UMBRAN_BOAT);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, BOPBlocks.UMBRAN_PLANKS, BOPItems.UMBRAN_BUTTON, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, BOPBlocks.UMBRAN_PLANKS, 2, BOPItems.UMBRAN_DOOR, 2);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, BOPBlocks.UMBRAN_PLANKS, BOPItems.UMBRAN_FENCE_GATE);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, BOPBlocks.UMBRAN_PLANKS, BOPItems.UMBRAN_FENCE);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, BOPBlocks.UMBRAN_PLANKS, BOPItems.UMBRAN_PRESSURE_PLATE, 4);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, BOPBlocks.UMBRAN_PLANKS, BOPItems.UMBRAN_SIGN, 3);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, BOPBlocks.UMBRAN_PLANKS, BOPItems.UMBRAN_SLAB, 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, BOPBlocks.UMBRAN_PLANKS, BOPItems.UMBRAN_STAIRS);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, BOPBlocks.UMBRAN_PLANKS, BOPItems.UMBRAN_TRAPDOOR, 2);

                String hasHellbarkLogsCriteria = "has_hellbark_logs";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModTags.Items.HELLBARK_LOGS, hasHellbarkLogsCriteria, BOPItems.HELLBARK_PLANKS, 4);
                createWoodcuttingRecipe(RecipeCategory.TRANSPORTATION, ModTags.Items.HELLBARK_LOGS, hasHellbarkLogsCriteria, BOPItems.HELLBARK_BOAT);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, ModTags.Items.HELLBARK_LOGS, hasHellbarkLogsCriteria, BOPItems.HELLBARK_BUTTON, 16);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, ModTags.Items.HELLBARK_LOGS, hasHellbarkLogsCriteria, BOPItems.HELLBARK_DOOR, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, ModTags.Items.HELLBARK_LOGS, hasHellbarkLogsCriteria, BOPItems.HELLBARK_FENCE_GATE, 4);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, ModTags.Items.HELLBARK_LOGS, hasHellbarkLogsCriteria, BOPItems.HELLBARK_FENCE, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, ModTags.Items.HELLBARK_LOGS, hasHellbarkLogsCriteria, BOPItems.HELLBARK_PRESSURE_PLATE, 16);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, ModTags.Items.HELLBARK_LOGS, hasHellbarkLogsCriteria, BOPItems.HELLBARK_SIGN, 12);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModTags.Items.HELLBARK_LOGS, hasHellbarkLogsCriteria, BOPItems.HELLBARK_SLAB, 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModTags.Items.HELLBARK_LOGS, hasHellbarkLogsCriteria, BOPItems.HELLBARK_STAIRS, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, ModTags.Items.HELLBARK_LOGS, hasHellbarkLogsCriteria, BOPItems.HELLBARK_TRAPDOOR, 8);

                createWoodcuttingRecipe(RecipeCategory.TRANSPORTATION, BOPBlocks.HELLBARK_PLANKS, 2, BOPItems.HELLBARK_BOAT);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, BOPBlocks.HELLBARK_PLANKS, BOPItems.HELLBARK_BUTTON, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, BOPBlocks.HELLBARK_PLANKS, 2, BOPItems.HELLBARK_DOOR, 2);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, BOPBlocks.HELLBARK_PLANKS, BOPItems.HELLBARK_FENCE_GATE);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, BOPBlocks.HELLBARK_PLANKS, BOPItems.HELLBARK_FENCE);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, BOPBlocks.HELLBARK_PLANKS, BOPItems.HELLBARK_PRESSURE_PLATE, 4);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, BOPBlocks.HELLBARK_PLANKS, BOPItems.HELLBARK_SIGN, 3);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, BOPBlocks.HELLBARK_PLANKS, BOPItems.HELLBARK_SLAB, 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, BOPBlocks.HELLBARK_PLANKS, BOPItems.HELLBARK_STAIRS);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, BOPBlocks.HELLBARK_PLANKS, BOPItems.HELLBARK_TRAPDOOR, 2);

                String hasEmpyrealLogsCriteria = "has_empyreal_logs";
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModTags.Items.EMPYREAL_LOGS, hasEmpyrealLogsCriteria, BOPItems.EMPYREAL_PLANKS, 4);
                createWoodcuttingRecipe(RecipeCategory.TRANSPORTATION, ModTags.Items.EMPYREAL_LOGS, hasEmpyrealLogsCriteria, BOPItems.EMPYREAL_BOAT);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, ModTags.Items.EMPYREAL_LOGS, hasEmpyrealLogsCriteria, BOPItems.EMPYREAL_BUTTON, 16);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, ModTags.Items.EMPYREAL_LOGS, hasEmpyrealLogsCriteria, BOPItems.EMPYREAL_DOOR, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, ModTags.Items.EMPYREAL_LOGS, hasEmpyrealLogsCriteria, BOPItems.EMPYREAL_FENCE_GATE, 4);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, ModTags.Items.EMPYREAL_LOGS, hasEmpyrealLogsCriteria, BOPItems.EMPYREAL_FENCE, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, ModTags.Items.EMPYREAL_LOGS, hasEmpyrealLogsCriteria, BOPItems.EMPYREAL_PRESSURE_PLATE, 16);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, ModTags.Items.EMPYREAL_LOGS, hasEmpyrealLogsCriteria, BOPItems.EMPYREAL_SIGN, 12);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModTags.Items.EMPYREAL_LOGS, hasEmpyrealLogsCriteria, BOPItems.EMPYREAL_SLAB, 8);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, ModTags.Items.EMPYREAL_LOGS, hasEmpyrealLogsCriteria, BOPItems.EMPYREAL_STAIRS, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, ModTags.Items.EMPYREAL_LOGS, hasEmpyrealLogsCriteria, BOPItems.EMPYREAL_TRAPDOOR, 8);

                createWoodcuttingRecipe(RecipeCategory.TRANSPORTATION, BOPBlocks.EMPYREAL_PLANKS, 2, BOPItems.EMPYREAL_BOAT);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, BOPBlocks.EMPYREAL_PLANKS, BOPItems.EMPYREAL_BUTTON, 4);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, BOPBlocks.EMPYREAL_PLANKS, 2, BOPItems.EMPYREAL_DOOR, 2);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, BOPBlocks.EMPYREAL_PLANKS, BOPItems.EMPYREAL_FENCE_GATE);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, BOPBlocks.EMPYREAL_PLANKS, BOPItems.EMPYREAL_FENCE);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, BOPBlocks.EMPYREAL_PLANKS, BOPItems.EMPYREAL_PRESSURE_PLATE, 4);
                createWoodcuttingRecipe(RecipeCategory.DECORATIONS, BOPBlocks.EMPYREAL_PLANKS, BOPItems.EMPYREAL_SIGN, 3);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, BOPBlocks.EMPYREAL_PLANKS, BOPItems.EMPYREAL_SLAB, 2);
                createWoodcuttingRecipe(RecipeCategory.BUILDING_BLOCKS, BOPBlocks.EMPYREAL_PLANKS, BOPItems.EMPYREAL_STAIRS);
                createWoodcuttingRecipe(RecipeCategory.REDSTONE, BOPBlocks.EMPYREAL_PLANKS, BOPItems.EMPYREAL_TRAPDOOR, 2);
            }
        };
    }

    @Override
    public @NotNull String getName() {
        return "Biomes O' Plenty Woodcutting Recipes";
    }
}
