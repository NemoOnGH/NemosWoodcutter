package com.devnemo.nemos.woodcutter;


import com.devnemo.nemos.woodcutter.item.ModCreativeModeTabs;
import com.devnemo.nemos.woodcutter.item.recipe.ModRecipeSerializerNeoForge;
import com.devnemo.nemos.woodcutter.item.recipe.ModRecipeTypesNeoForge;
import com.devnemo.nemos.woodcutter.item.recipe.book.ModRecipeBookCategoryNeoForge;
import com.devnemo.nemos.woodcutter.item.recipe.display.ModRecipeDisplaysNeoForge;
import com.devnemo.nemos.woodcutter.platform.Services;
import com.devnemo.nemos.woodcutter.screen.ModMenuTypesNeoForge;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.server.packs.PackLocationInfo;
import net.minecraft.server.packs.PackSelectionConfig;
import net.minecraft.server.packs.PackType;
import net.minecraft.server.packs.PathPackResources;
import net.minecraft.server.packs.repository.Pack;
import net.minecraft.server.packs.repository.PackSource;
import net.minecraft.world.item.CreativeModeTab;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModList;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.event.AddPackFindersEvent;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.Optional;

import static com.devnemo.nemos.woodcutter.Constants.*;

@Mod(Constants.MOD_ID)
@EventBusSubscriber(modid = MOD_ID)
public class NeoForgeNemosWoodcutter {

    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MOD_ID);
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MOD_ID);
    public static final DeferredRegister<CreativeModeTab> CREATIVE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MOD_ID);

    public NeoForgeNemosWoodcutter(IEventBus eventBus) {
        NemosWoodcutterCommon.init();

        BLOCKS.register(eventBus);
        ITEMS.register(eventBus);
        CREATIVE_TABS.register(eventBus);

        eventBus.addListener(ModCreativeModeTabs::modifyFunctionalItemGroup);

        ModRecipeSerializerNeoForge.register(eventBus);
        ModRecipeTypesNeoForge.register(eventBus);
        ModRecipeBookCategoryNeoForge.register(eventBus);
        ModRecipeDisplaysNeoForge.register(eventBus);
        ModMenuTypesNeoForge.register(eventBus);
    }

    @SubscribeEvent
    public static void addBuiltInResourcePacks(AddPackFindersEvent event) {
        var packType = event.getPackType();

        if (packType == PackType.CLIENT_RESOURCES) {
            var resourcePath = ModList.get().getModFileById(MOD_ID).getFile().findResource("resourcepacks/dark_mode");
            var packLocationInfo = new PackLocationInfo(
                    "builtin/dark_mode",
                    Component.translatable("resourcePack.nemos_woodcutter.dark_mode.name"),
                    PackSource.BUILT_IN,
                    Optional.empty());
            var pathResourcesSupplier = new PathPackResources.PathResourcesSupplier(resourcePath);
            var packSelectionConfig = new PackSelectionConfig(false, Pack.Position.TOP, false);
            var pack = Pack.readMetaAndCreate(packLocationInfo,
                    pathResourcesSupplier,
                    PackType.CLIENT_RESOURCES,
                    packSelectionConfig);

            event.addRepositorySource((packConsumer) -> packConsumer.accept(pack));
        }

        if (packType == PackType.SERVER_DATA) {
            registerBuiltInBiomesOPlentyDataPack(event);
            registerBuiltInNemosMossyBlocksDataPack(event);
        }
    }

    public static void registerBuiltInBiomesOPlentyDataPack(AddPackFindersEvent event) {
        if (!Services.MOD_LOADER_HELPER.isModLoaded(BIOMES_O_PLENTY_MOD_ID)) {
            return;
        }

        var resourcePath = ModList.get().getModFileById(MOD_ID).getFile().findResource("resourcepacks/biomesoplenty");
        var packLocationInfo = new PackLocationInfo(
                "builtin/biomesoplenty",
                Component.literal("Biomes O' Plenty"),
                PackSource.BUILT_IN,
                Optional.empty());
        var pathResourcesSupplier = new PathPackResources.PathResourcesSupplier(resourcePath);
        var packSelectionConfig = new PackSelectionConfig(true, Pack.Position.TOP, false);
        var pack = Pack.readMetaAndCreate(packLocationInfo,
                pathResourcesSupplier,
                PackType.SERVER_DATA,
                packSelectionConfig);

        event.addRepositorySource((packConsumer) -> packConsumer.accept(pack));
    }

    public static void registerBuiltInNemosMossyBlocksDataPack(AddPackFindersEvent event) {
        if (!Services.MOD_LOADER_HELPER.isModLoaded(NEMOS_MOSSY_BLOCKS_MOD_ID)) {
            return;
        }

        var resourcePath = ModList.get().getModFileById(MOD_ID).getFile().findResource("resourcepacks/nemos_mossy_blocks");
        var packLocationInfo = new PackLocationInfo(
                "builtin/nemos_mossy_blocks",
                Component.literal("Nemo's Mossy Blocks"),
                PackSource.BUILT_IN,
                Optional.empty());
        var pathResourcesSupplier = new PathPackResources.PathResourcesSupplier(resourcePath);
        var packSelectionConfig = new PackSelectionConfig(true, Pack.Position.TOP, false);
        var pack = Pack.readMetaAndCreate(packLocationInfo,
                pathResourcesSupplier,
                PackType.SERVER_DATA,
                packSelectionConfig);

        event.addRepositorySource((packConsumer) -> packConsumer.accept(pack));
    }
}