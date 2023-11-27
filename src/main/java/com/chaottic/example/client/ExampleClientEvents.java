package com.chaottic.example.client;

import com.chaottic.example.common.Example;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

@Mod.EventBusSubscriber(modid = Example.MOD_ID, value = Side.CLIENT)
public final class ExampleClientEvents {

    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent event) {

    }
}
