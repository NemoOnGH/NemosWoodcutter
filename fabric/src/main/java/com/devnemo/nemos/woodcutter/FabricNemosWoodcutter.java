package com.devnemo.nemos.woodcutter;

import com.devnemo.nemos.woodcutter.item.ModCreativeModeTabs;
import com.devnemo.nemos.woodcutter.item.recipe.ModRecipeSerializerFabric;
import com.devnemo.nemos.woodcutter.item.recipe.ModRecipeTypesFabric;
import com.devnemo.nemos.woodcutter.item.recipe.book.ModRecipeBookCategoryFabric;
import com.devnemo.nemos.woodcutter.item.recipe.display.ModRecipeDisplaysFabric;
import com.devnemo.nemos.woodcutter.platform.Services;
import com.devnemo.nemos.woodcutter.screen.ModMenuTypesFabric;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.resource.ResourceManagerHelper;
import net.fabricmc.fabric.api.resource.ResourcePackActivationType;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;

import static com.devnemo.nemos.woodcutter.Constants.*;

public class FabricNemosWoodcutter implements ModInitializer {

    @Override
    public void onInitialize() {
        NemosWoodcutterCommon.init();

        if (Services.MOD_LOADER_HELPER.isModLoaded(BIOMES_O_PLENTY_MOD_ID)) {
            registerBuiltInBiomesOPlentyDataPack();
        }

        if (Services.MOD_LOADER_HELPER.isModLoaded(NEMOS_MOSSY_BLOCKS_MOD_ID)) {
            registerBuiltInNemosMossyBlocksDataPack();
        }

        ModCreativeModeTabs.register();
        ModRecipeSerializerFabric.register();
        ModRecipeTypesFabric.register();
        ModRecipeBookCategoryFabric.register();
        ModRecipeDisplaysFabric.register();
        ModMenuTypesFabric.register();
    }

    private void registerBuiltInBiomesOPlentyDataPack() {
        FabricLoader.getInstance().getModContainer(MOD_ID).ifPresent(container ->
                ResourceManagerHelper.registerBuiltinResourcePack(
                        ResourceLocation.fromNamespaceAndPath(MOD_ID, BIOMES_O_PLENTY_MOD_ID),
                        container,
                        Component.literal("Biomes O' Plenty"),
                        ResourcePackActivationType.ALWAYS_ENABLED
                ));
    }

    private void registerBuiltInNemosMossyBlocksDataPack() {
        FabricLoader.getInstance().getModContainer(MOD_ID).ifPresent(container ->
                ResourceManagerHelper.registerBuiltinResourcePack(
                        ResourceLocation.fromNamespaceAndPath(MOD_ID, NEMOS_MOSSY_BLOCKS_MOD_ID),
                        container,
                        Component.literal("Nemo's Mossy Blocks"),
                        ResourcePackActivationType.ALWAYS_ENABLED
                ));
    }
}
