/*
 * RESTORED SOURCE — decompiled reconstruction, not the original files.
 * class: dev.hixo.Y.A
 */

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1297
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package dev.hixo.Y;

import dev.hixo.M.d;
import dev.hixo.y.c_0;
import java.lang.invoke.CallSite;
import net.minecraft.class_1297;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={class_1297.class})
public abstract class A {
    @Inject(method={"isGlowing"}, at={@At(value="HEAD")}, cancellable=true)
    public void K(CallbackInfoReturnable<Boolean> callbackInfoReturnable) {
        dev.hixo.M.s.K.A a2;
        block8: {
            block7: {
                dev.hixo.M.s.K.A a3;
                block6: {
                    boolean bl = c_0.J;
                    CallSite callSite = d.a("\u00fd", (long)71498313283647962L) /* => dev.hixo.Hixo.INSTANCE */;
                    if (!bl) {
                        if (callSite == null) {
                            return;
                        }
                        callSite = d.a("\u00fd", (long)71498313283647962L) /* => dev.hixo.Hixo.INSTANCE */;
                    }
                    a3 = a2 = (dev.hixo.M.s.K.A)((Object)d.a("$", (Object)d.a("$", (Object)callSite, (long)190425734249275754L) /* => dev.hixo.Hixo.getModuleManager */, dev.hixo.M.s.K.A.class, (long)128753564242528692L) /* => dev.hixo.M.n.b */);
                    if (bl) break block6;
                    if (a3 == null) break block7;
                    a3 = a2;
                }
                if (d.a("$", (Object)a3, (long)96089342888548907L) /* => dev.hixo.M.G.c */ != false) break block8;
            }
            return;
        }
        class_1297 class_12972 = (class_1297)this;
        if (d.a("$", (Object)a2, (Object)class_12972, (long)201052034271107059L) /* => dev.hixo.M.s.K.A.o */ != false) {
            d.a("$", callbackInfoReturnable, (Object)d.a("\u00f9", (boolean)true, (long)119505102668051061L) /* => java.lang.Boolean.valueOf */, (long)93117332308854695L) /* => org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable.setReturnValue */;
        }
    }
}

