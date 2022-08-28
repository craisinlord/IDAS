package com.craisinlord.idas.mixin.structures;

import net.minecraft.world.level.levelgen.structure.pools.StructureTemplatePool;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(StructureTemplatePool.class)
public class StructurePoolMixin {

    @ModifyConstant(
            method = "lambda$static$1(Lcom/mojang/serialization/codecs/RecordCodecBuilder$Instance;)Lcom/mojang/datafixers/kinds/App;",
            constant = @Constant(intValue = 150),
            require = 0
    )
    private static int idas_increaseWeightLimitDev(int constant) {
        return 5000;
    }
}