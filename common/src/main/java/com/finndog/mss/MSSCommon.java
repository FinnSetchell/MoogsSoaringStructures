package com.finndog.mss;

import com.finndog.mss.events.lifecycle.RegisterReloadListenerEvent;
import com.finndog.mss.events.lifecycle.ServerGoingToStartEvent;
import com.finndog.mss.events.lifecycle.ServerGoingToStopEvent;
import com.finndog.mss.events.lifecycle.SetupEvent;
import com.finndog.mss.misc.pooladditions.PoolAdditionMerger;
import com.finndog.mss.modinit.MSSPlacements;
import com.finndog.mss.modinit.MSSProcessors;
import com.finndog.mss.modinit.MSSStructurePieces;
import com.finndog.mss.modinit.MSSStructurePlacementType;
import com.finndog.mss.modinit.MSSStructures;
import com.finndog.mss.modinit.MSSTags;
import com.finndog.mss.utils.AsyncLocator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class MSSCommon {
    public static final String MODID = "mss";
    public static final Logger LOGGER = LogManager.getLogger();

    public static void init() {
        MSSTags.initTags();

        MSSStructures.STRUCTURE_TYPE.init();
        MSSPlacements.PLACEMENT_MODIFIER.init();
        MSSProcessors.STRUCTURE_PROCESSOR.init();
        MSSStructurePieces.STRUCTURE_PIECE.init();
        MSSStructurePieces.STRUCTURE_POOL_ELEMENT.init();
        MSSStructurePlacementType.STRUCTURE_PLACEMENT_TYPE.init();

        SetupEvent.EVENT.addListener(MSSCommon::setup);
        RegisterReloadListenerEvent.EVENT.addListener(MSSCommon::registerDatapackListener);
        ServerGoingToStartEvent.EVENT.addListener(MSSCommon::serverAboutToStart);
        ServerGoingToStopEvent.EVENT.addListener(MSSCommon::onServerStopping);
    }

    private static void setup(final SetupEvent event) {
    }

    private static void serverAboutToStart(final ServerGoingToStartEvent event) {

        AsyncLocator.handleServerAboutToStartEvent();
    }

    private static void onServerStopping(final ServerGoingToStopEvent event) {
        AsyncLocator.handleServerStoppingEvent();
    }

    public static void registerDatapackListener(final RegisterReloadListenerEvent event) {
    }
}
