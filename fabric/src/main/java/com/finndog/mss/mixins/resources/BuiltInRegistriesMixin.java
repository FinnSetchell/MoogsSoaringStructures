package com.finndog.mss.mixins.resources;

import com.finndog.mss.modinit.MSSConditionsRegistry;
import net.minecraft.data.BuiltinRegistries;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(BuiltinRegistries.class)
public class BuiltInRegistriesMixin {

    /**
     * Creates and inits our custom registry at game startup
     * @author TelepathicGrunt
     */
    @Inject(method = "bootstrap()V",
            at = @At(value = "RETURN"))
    private static void mss_initCustomRegistries(CallbackInfo ci) {
        MSSConditionsRegistry.MSS_JSON_CONDITIONS_REGISTRY.init();
    }
}
