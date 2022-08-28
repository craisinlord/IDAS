package com.craisinlord.idas.modinit;

import com.craisinlord.idas.IDAS;
import com.craisinlord.idas.world.processors.WaterloggingFixProcessor;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureProcessorType;

public final class IDASProcessors {
    private IDASProcessors() {}

    public static StructureProcessorType<WaterloggingFixProcessor> WATERLOGGING_FIX_PROCESSOR = () -> WaterloggingFixProcessor.CODEC;
    public static StructureProcessorType<WaterloggingFixProcessor> CLOSE_OFF_FLUID_SOURCES_PROCESSOR = () -> WaterloggingFixProcessor.CODEC;

    public static void registerProcessors() {
        Registry.register(Registry.STRUCTURE_PROCESSOR, new ResourceLocation(IDAS.MODID, "waterlogging_fix_processor"), WATERLOGGING_FIX_PROCESSOR);
        Registry.register(Registry.STRUCTURE_PROCESSOR, new ResourceLocation(IDAS.MODID, "close_off_fluid_sources_processor"), CLOSE_OFF_FLUID_SOURCES_PROCESSOR);
    }
}
