package com.devnemo.nemos.woodcutter.item;

import com.devnemo.nemos.woodcutter.world.item.WoodcutterItems;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Items;

import static com.devnemo.nemos.woodcutter.Constants.LOG;

public class ModCreativeModeTabs {

    public static void register() {
        LOG.info("Registering creative mode tabs");

        modifyFunctionalItemGroup();
    }

    private static void modifyFunctionalItemGroup() {
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.FUNCTIONAL_BLOCKS)
                .register(entries -> entries.addAfter(Items.STONECUTTER, WoodcutterItems.WOODCUTTER.get()));
    }
}
