package com.craisinlord.idas.mixin.resources;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.storage.loot.LootContext;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(LootContext.class)
public interface LootContextAccessor {
    @Accessor(value = "queriedLootTableId", remap = false)
    void idas_setQueriedLootTableId(ResourceLocation queriedLootTableId);
}
