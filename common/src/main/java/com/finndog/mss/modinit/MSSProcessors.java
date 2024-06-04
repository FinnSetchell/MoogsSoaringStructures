package com.finndog.mss.modinit;

import com.finndog.mss.MSSCommon;
import com.finndog.mss.modinit.registry.RegistryEntry;
import com.finndog.mss.modinit.registry.ResourcefulRegistries;
import com.finndog.mss.modinit.registry.ResourcefulRegistry;
import com.finndog.mss.world.processors.WaterloggingFixProcessor;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureProcessorType;

public final class MSSProcessors {
    public static final ResourcefulRegistry<StructureProcessorType<?>> STRUCTURE_PROCESSOR = ResourcefulRegistries.create(BuiltInRegistries.STRUCTURE_PROCESSOR, MSSCommon.MODID);

    public static final RegistryEntry<StructureProcessorType<WaterloggingFixProcessor>> WATERLOGGING_FIX_PROCESSOR = STRUCTURE_PROCESSOR.register("waterlogging_fix_processor", () -> () -> WaterloggingFixProcessor.CODEC);
}
