package com.craisinlord.idas.mixin.structures;

import net.minecraft.server.commands.LocateCommand;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(LocateCommand.class)
public class LocateCommandMixin {

    @ModifyConstant(
            method = "locate(Lnet/minecraft/commands/CommandSourceStack;Lnet/minecraft/commands/arguments/ResourceOrTagLocationArgument$Result;)I",
            constant = @Constant(intValue = 100),
            require = 0
    )
    private static int idas_increaseLocateRadius(int constant) {
        return 2000;
    }
}