package com.finndog.mss.modinit;

import com.finndog.mss.MSSCommon;
import com.finndog.mss.modinit.registry.RegistryEntry;
import com.finndog.mss.modinit.registry.ResourcefulRegistries;
import com.finndog.mss.modinit.registry.ResourcefulRegistry;
import com.finndog.mss.world.structures.placements.AdvancedRandomSpread;
import net.minecraft.core.Registry;
import net.minecraft.world.level.levelgen.structure.placement.StructurePlacementType;


public final class MSSStructurePlacementType {
    public static final ResourcefulRegistry<StructurePlacementType<?>> STRUCTURE_PLACEMENT_TYPE = ResourcefulRegistries.create(Registry.STRUCTURE_PLACEMENT_TYPE, MSSCommon.MODID);

    public static final RegistryEntry<StructurePlacementType<AdvancedRandomSpread>> ADVANCED_RANDOM_SPREAD = STRUCTURE_PLACEMENT_TYPE.register("advanced_random_spread", () -> () -> AdvancedRandomSpread.CODEC);
}
