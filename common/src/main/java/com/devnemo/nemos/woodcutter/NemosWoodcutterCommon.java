package com.devnemo.nemos.woodcutter;

import com.devnemo.nemos.woodcutter.world.item.WoodcutterItems;
import com.devnemo.nemos.woodcutter.world.level.block.WoodcutterBlocks;

public class NemosWoodcutterCommon {

    public static void init() {
        Constants.LOG.info("Thank you for using Nemo's Woodcutter!");

        WoodcutterBlocks.init();
        WoodcutterItems.init();
    }
}