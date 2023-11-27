package com.chaottic.example.common;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;

@Mod(modid = Example.MOD_ID)
public final class Example {
    public static final String MOD_ID = "example";

    @SidedProxy(
            clientSide = "com.chaottic.example.client.ClientProxy",
            serverSide = "com.chaottic.example.common.ServerProxy"
    )
    public static Proxy PROXY;

    public static ResourceLocation resourceLocation(String path) {
        return new ResourceLocation(MOD_ID, path);
    }
}
