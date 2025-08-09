package com.devnemo.nemos.woodcutter.network.protocol.game;

import net.minecraft.network.protocol.ping.ClientPongPacketListener;

public interface ClientGamePacketListener extends ClientPongPacketListener {

    void nemosWoodcutter$handleUpdateRecipes(ClientboundUpdateRecipesPacket packet);
}
