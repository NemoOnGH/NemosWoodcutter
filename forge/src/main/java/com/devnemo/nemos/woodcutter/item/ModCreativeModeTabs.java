package com.devnemo.nemos.woodcutter.item;

import com.devnemo.nemos.woodcutter.world.item.WoodcutterItems;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

public class ModCreativeModeTabs {

    public static void modifyFunctionalItemGroup(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.FUNCTIONAL_BLOCKS) {
            event.accept(WoodcutterItems.WOODCUTTER.get());
        }
    }
}
