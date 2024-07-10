package com.finndog.mss.neoforge;

import com.finndog.mss.MSSCommon;
import com.finndog.mss.events.lifecycle.RegisterReloadListenerEvent;
import com.finndog.mss.events.lifecycle.ServerGoingToStartEvent;
import com.finndog.mss.events.lifecycle.ServerGoingToStopEvent;
import com.finndog.mss.events.lifecycle.SetupEvent;
import com.finndog.mss.modinit.registry.neoforge.ResourcefulRegistriesImpl;
import net.neoforged.bus.api.EventPriority;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.AddReloadListenerEvent;
import net.neoforged.neoforge.event.server.ServerAboutToStartEvent;
import net.neoforged.neoforge.event.server.ServerStoppingEvent;


@Mod(MSSCommon.MODID)
public class MSSNeoforge {

    public static IEventBus modEventBusTempHolder = null;

    public MSSNeoforge(IEventBus modEventBus, ModContainer modContainer) {
        modEventBus.addListener(EventPriority.NORMAL, ResourcefulRegistriesImpl::onRegisterForgeRegistries);

        modEventBusTempHolder = modEventBus;
        MSSCommon.init();
        modEventBusTempHolder = null;

        modEventBus.addListener(MSSNeoforge::onSetup);

        IEventBus eventBus = NeoForge.EVENT_BUS;
        eventBus.addListener(MSSNeoforge::onServerStarting);
        eventBus.addListener(MSSNeoforge::onServerStopping);
        eventBus.addListener(MSSNeoforge::onAddReloadListeners);
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
