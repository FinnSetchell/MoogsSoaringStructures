package com.finndog.mss.modinit;

import com.finndog.mss.MSSCommon;
import com.finndog.mss.modinit.registry.RegistryEntry;
import com.finndog.mss.modinit.registry.ResourcefulRegistries;
import com.finndog.mss.modinit.registry.ResourcefulRegistry;
import com.finndog.mss.world.structures.GenericJigsawStructure;
import com.finndog.mss.world.structures.GenericNetherJigsawStructure;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.levelgen.structure.StructureType;


public final class MSSStructures {
    public static final ResourcefulRegistry<StructureType<?>> STRUCTURE_TYPE = ResourcefulRegistries.create(BuiltInRegistries.STRUCTURE_TYPE, MSSCommon.MODID);

    public static RegistryEntry<StructureType<GenericJigsawStructure>> GENERIC_JIGSAW_STRUCTURE = STRUCTURE_TYPE.register("mss_generic_jigsaw_structure", () -> () -> GenericJigsawStructure.CODEC);
    public static RegistryEntry<StructureType<GenericNetherJigsawStructure>> GENERIC_NETHER_JIGSAW_STRUCTURE = STRUCTURE_TYPE.register("mss_generic_nether_jigsaw_structure", () -> () -> GenericNetherJigsawStructure.CODEC);
}


