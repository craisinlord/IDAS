package com.craisinlord.idas.modinit;

import com.craisinlord.idas.IDAS;
import com.craisinlord.idas.world.predicates.MatterPhaseRuleTest;
import com.craisinlord.idas.world.predicates.PieceOriginAxisAlignedLinearPosRuleTest;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.structure.templatesystem.PosRuleTestType;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTestType;

public final class IDASPredicates {
    private IDASPredicates() {}

    public static RuleTestType<MatterPhaseRuleTest> MATTER_PHASE_RULE_TEST = () -> MatterPhaseRuleTest.CODEC;

    public static PosRuleTestType<PieceOriginAxisAlignedLinearPosRuleTest> PIECE_ORIGIN_AXIS_ALIGNED_LINEAR_POS_RULE_TEST = () -> PieceOriginAxisAlignedLinearPosRuleTest.CODEC;

    public static void registerPredicates() {
        Registry.register(Registry.RULE_TEST, new ResourceLocation(IDAS.MODID, "matter_phase_rule_test"), MATTER_PHASE_RULE_TEST);

        Registry.register(Registry.POS_RULE_TEST, new ResourceLocation(IDAS.MODID, "piece_origin_axis_aligned_linear_pos_rule_test"), PIECE_ORIGIN_AXIS_ALIGNED_LINEAR_POS_RULE_TEST);
    }
}
