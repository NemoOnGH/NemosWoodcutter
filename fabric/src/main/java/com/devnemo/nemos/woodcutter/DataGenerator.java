package com.devnemo.nemos.woodcutter;

import com.devnemo.nemos.woodcutter.datagen.BiomesOPlentyRecipeProvider;
import com.devnemo.nemos.woodcutter.datagen.NemosMossyBlocksRecipeProvider;
import com.devnemo.nemos.woodcutter.datagen.WoodcuttingRecipeProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;

public class DataGenerator implements DataGeneratorEntrypoint {

    @Override
    public void onInitializeDataGenerator(net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator fabricDataGenerator) {
        net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

        pack.addProvider(WoodcuttingRecipeProvider::new);
        pack.addProvider(BiomesOPlentyRecipeProvider::new);
        pack.addProvider(NemosMossyBlocksRecipeProvider::new);
    }
}
