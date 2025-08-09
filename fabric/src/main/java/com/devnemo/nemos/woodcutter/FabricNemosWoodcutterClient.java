package com.devnemo.nemos.woodcutter;

import com.devnemo.nemos.woodcutter.world.level.block.WoodcutterBlocks;
import com.devnemo.nemos.woodcutter.client.gui.screen.WoodcutterScreen;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.resource.ResourceManagerHelper;
import net.fabricmc.fabric.api.resource.ResourcePackActivationType;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.client.renderer.chunk.ChunkSectionLayer;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;

import static com.devnemo.nemos.woodcutter.Constants.MOD_ID;
import static com.devnemo.nemos.woodcutter.client.gui.screen.ModMenuTypes.WOODCUTTER_SCREEN_HANDLER;

public class FabricNemosWoodcutterClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        MenuScreens.register(WOODCUTTER_SCREEN_HANDLER.get(), WoodcutterScreen::new);
        BlockRenderLayerMap.putBlock(WoodcutterBlocks.WOODCUTTER.get(), ChunkSectionLayer.CUTOUT);
        registerBuiltInResourcePack();
    }

    private void registerBuiltInResourcePack() {
        FabricLoader.getInstance().getModContainer(MOD_ID).ifPresent(container ->
                ResourceManagerHelper.registerBuiltinResourcePack(
                        ResourceLocation.fromNamespaceAndPath(MOD_ID, "dark_mode"),
                        container,
                        Component.translatable("resourcePack.nemos_woodcutter.dark_mode.name"),
                        ResourcePackActivationType.NORMAL
                ));
    }
}
