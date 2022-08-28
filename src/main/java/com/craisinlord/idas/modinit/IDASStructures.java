package com.craisinlord.idas.modinit;

import com.craisinlord.idas.mixin.structures.StructureFeatureAccessor;
import com.craisinlord.idas.IDAS;
import com.craisinlord.idas.world.structures.GenericJigsawStructure;
import com.craisinlord.idas.world.structures.GenericNetherJigsawStructure;
import com.craisinlord.idas.world.structures.GenericEndJigsawStructure;
import com.craisinlord.idas.world.structures.configs.IDASGenericConfig;
import com.craisinlord.idas.world.structures.configs.IDASGenericNetherConfig;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.feature.StructureFeature;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public final class IDASStructures {
    private IDASStructures() {}

    public static final DeferredRegister<StructureFeature<?>> STRUCTURE_FEATURES = DeferredRegister.create(ForgeRegistries.STRUCTURE_FEATURES, IDAS.MODID);

    public static RegistryObject<StructureFeature<?>> GENERIC_JIGSAW_STRUCTURE = STRUCTURE_FEATURES.register("idas_jigsaw_structure", () -> new GenericJigsawStructure<>(IDASGenericConfig.CODEC));
    public static RegistryObject<StructureFeature<?>> GENERIC_UNDERGROUND_JIGSAW_STRUCTURE = STRUCTURE_FEATURES.register("idas_underground_jigsaw_structure", () -> new GenericJigsawStructure<>(IDASGenericConfig.CODEC));
    public static RegistryObject<StructureFeature<?>> GENERIC_NETHER_JIGSAW_STRUCTURE = STRUCTURE_FEATURES.register("idas_nether_jigsaw_structure", () -> new GenericNetherJigsawStructure<>(IDASGenericNetherConfig.CODEC));
    public static RegistryObject<StructureFeature<?>> GENERIC_END_JIGSAW_STRUCTURE = STRUCTURE_FEATURES.register("idas_end_jigsaw_structure", () -> new GenericEndJigsawStructure<>(IDASGenericConfig.CODEC));
    public static void setupStructures() {
        StructureFeatureAccessor.getSTEP().put(GENERIC_JIGSAW_STRUCTURE.get(), GenerationStep.Decoration.SURFACE_STRUCTURES);
        StructureFeatureAccessor.getSTEP().put(GENERIC_UNDERGROUND_JIGSAW_STRUCTURE.get(), GenerationStep.Decoration.UNDERGROUND_STRUCTURES);
        StructureFeatureAccessor.getSTEP().put(GENERIC_NETHER_JIGSAW_STRUCTURE.get(), GenerationStep.Decoration.SURFACE_STRUCTURES);
        StructureFeatureAccessor.getSTEP().put(GENERIC_END_JIGSAW_STRUCTURE.get(), GenerationStep.Decoration.SURFACE_STRUCTURES);

        //registers the structure pieces.
        IDASStructurePieces.registerStructurePieces();
    }
}
