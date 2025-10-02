package com.devnemo.nemos.woodcutter.platform;

import com.devnemo.nemos.woodcutter.platform.services.IModLoaderHelper;
import net.neoforged.fml.ModList;
import net.neoforged.fml.loading.FMLLoader;

public class NeoForgeModLoaderHelper implements IModLoaderHelper {

    @Override
    public String getModLoaderName() {
        return "NeoForge";
    }

    @Override
    public boolean isModLoaded(String modId) {
        return ModList.get().isLoaded(modId);
    }

    @Override
    public boolean isDevelopmentEnvironment() {
        return !FMLLoader.getCurrent().isProduction();
    }
}