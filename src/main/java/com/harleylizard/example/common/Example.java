package com.harleylizard.example.common;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import net.minecraft.util.ResourceLocation;

@Mod(modid = Example.MOD_ID)
public final class Example {
    public static final String MOD_ID = "example";

    @SidedProxy(
            clientSide = "com.harleylizard.example.client.ClientProxy",
            serverSide = "com.harleylizard.example.common.ServerProxy"
    )
    public static Proxy PROXY;

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
    }

    public static ResourceLocation resourceLocation(String path) {
        return new ResourceLocation(MOD_ID, path);
    }
}
