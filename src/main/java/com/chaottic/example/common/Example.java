package com.chaottic.example.common;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.Mod;

@Mod(modid = Example.MOD_ID)
public final class Example {
    public static final String MOD_ID = "example";

    public static ResourceLocation resourceLocation(String path) {
        return new ResourceLocation(MOD_ID, path);
    }
}
