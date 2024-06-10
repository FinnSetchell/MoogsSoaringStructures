package com.finndog.mss.modinit;

import com.finndog.mss.MSSCommon;
import com.finndog.mss.modinit.registry.RegistryEntry;
import com.finndog.mss.modinit.registry.ResourcefulRegistries;
import com.finndog.mss.modinit.registry.ResourcefulRegistry;
import com.finndog.mss.world.placements.MinusEightPlacement;
import com.finndog.mss.world.placements.SnapToLowerNonAirPlacement;
import com.finndog.mss.world.placements.UnlimitedCountPlacement;
import net.minecraft.core.Registry;
import net.minecraft.world.level.levelgen.placement.PlacementModifierType;

public final class MSSPlacements {
	public static final ResourcefulRegistry<PlacementModifierType<?>> PLACEMENT_MODIFIER = ResourcefulRegistries.create(Registry.PLACEMENT_MODIFIERS, MSSCommon.MODID);

	public static final RegistryEntry<PlacementModifierType<MinusEightPlacement>> MINUS_EIGHT_PLACEMENT = PLACEMENT_MODIFIER.register("minus_eight_placement", () -> () -> MinusEightPlacement.CODEC);
	public static final RegistryEntry<PlacementModifierType<UnlimitedCountPlacement>> UNLIMITED_COUNT = PLACEMENT_MODIFIER.register("unlimited_count", () -> () -> UnlimitedCountPlacement.CODEC);
	public static final RegistryEntry<PlacementModifierType<SnapToLowerNonAirPlacement>> SNAP_TO_LOWER_NON_AIR_PLACEMENT = PLACEMENT_MODIFIER.register("snap_to_lower_non_air_placement", () -> () -> SnapToLowerNonAirPlacement.CODEC);
}
