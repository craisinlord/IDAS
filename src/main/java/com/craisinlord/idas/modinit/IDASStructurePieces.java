package com.craisinlord.idas.modinit;

import com.craisinlord.idas.IDAS;
import com.craisinlord.idas.world.structures.pieces.MirroringSingleJigsawPiece;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.structure.pieces.StructurePieceType;
import net.minecraft.world.level.levelgen.structure.pools.StructurePoolElementType;


public final class IDASStructurePieces {
    private IDASStructurePieces() {}

    public static StructurePoolElementType<MirroringSingleJigsawPiece> MIRROR_SINGLE;

    public static void registerStructurePieces() {
        MIRROR_SINGLE = Registry.register(Registry.STRUCTURE_POOL_ELEMENT, new ResourceLocation(IDAS.MODID, "mirroring_single_pool_element"), () -> MirroringSingleJigsawPiece.CODEC);
    }
}
