package com.craisinlord.idas.modinit;

import com.craisinlord.idas.IDAS;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.levelgen.feature.ConfiguredStructureFeature;

public class IDASTags {
    public static void initTags() {}

    public static TagKey<ConfiguredStructureFeature<?, ?>> LARGER_LOCATE_SEARCH = TagKey.create(Registry.CONFIGURED_STRUCTURE_FEATURE_REGISTRY,
            new ResourceLocation(IDAS.MODID, "larger_locate_search"));
}
