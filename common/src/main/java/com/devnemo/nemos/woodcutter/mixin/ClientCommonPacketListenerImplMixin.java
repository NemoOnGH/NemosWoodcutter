package com.devnemo.nemos.woodcutter.mixin;

import com.devnemo.nemos.woodcutter.interfaces.MinecraftClientGetter;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.ClientCommonPacketListenerImpl;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(ClientCommonPacketListenerImpl.class)
public class ClientCommonPacketListenerImplMixin implements MinecraftClientGetter {

    @Shadow @Final protected Minecraft minecraft;

    @Override
    public Minecraft nemosWoodcutter$getMinecraft() {
        return minecraft;
    }
}
