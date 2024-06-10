package com.finndog.mss.modinit;

import com.finndog.mss.MSSCommon;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.levelgen.structure.Structure;

public final class MSSTags {
    public static void initTags() {}

    public static TagKey<Structure> LARGER_LOCATE_SEARCH = TagKey.create(Registry.STRUCTURE_REGISTRY,
            new ResourceLocation(MSSCommon.MODID, "larger_locate_search"));

}
