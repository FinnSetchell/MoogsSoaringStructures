package com.finndog.mss.forge;

import com.finndog.mss.MSSCommon;
import com.finndog.mss.events.lifecycle.RegisterReloadListenerEvent;
import com.finndog.mss.events.lifecycle.ServerGoingToStartEvent;
import com.finndog.mss.events.lifecycle.ServerGoingToStopEvent;
import com.finndog.mss.events.lifecycle.SetupEvent;
import com.finndog.mss.modinit.registry.forge.ResourcefulRegistriesImpl;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.AddReloadListenerEvent;
import net.minecraftforge.event.server.ServerAboutToStartEvent;
import net.minecraftforge.event.server.ServerStoppingEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;


@Mod(MSSCommon.MODID)
public class MSSForge {

    public MSSForge() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(EventPriority.NORMAL, ResourcefulRegistriesImpl::onRegisterForgeRegistries);

        MSSCommon.init();

        IEventBus eventBus = MinecraftForge.EVENT_BUS;
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        modEventBus.addListener(MSSForge::onSetup);
        eventBus.addListener(MSSForge::onServerStarting);
        eventBus.addListener(MSSForge::onServerStopping);
        eventBus.addListener(MSSForge::onAddReloadListeners);
    }

    private static void onSetup(FMLCommonSetupEvent event) {
        SetupEvent.EVENT.invoke(new SetupEvent(event::enqueueWork));
    }

    private static void onServerStarting(ServerAboutToStartEvent event) {
        ServerGoingToStartEvent.EVENT.invoke(new ServerGoingToStartEvent(event.getServer()));
    }

    private static void onServerStopping(ServerStoppingEvent event) {
        ServerGoingToStopEvent.EVENT.invoke(ServerGoingToStopEvent.INSTANCE);
    }

    private static void onAddReloadListeners(AddReloadListenerEvent event) {
        RegisterReloadListenerEvent.EVENT.invoke(new RegisterReloadListenerEvent((id, listener) -> event.addListener(listener)));
    }

}
