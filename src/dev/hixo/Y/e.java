/*
 * RESTORED SOURCE — decompiled reconstruction, not the original files.
 * class: dev.hixo.Y.e
 */

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1268
 *  net.minecraft.class_1309
 *  net.minecraft.class_2879
 *  net.minecraft.class_746
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package dev.hixo.Y;

import dev.hixo.M.d;
import dev.hixo.y.c_0;
import java.lang.invoke.CallSite;
import net.minecraft.class_1268;
import net.minecraft.class_1309;
import net.minecraft.class_2879;
import net.minecraft.class_746;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={class_1309.class})
public abstract class e {
    @Inject(method={"swingHand(Lnet/minecraft/util/Hand;Z)V"}, at={@At(value="HEAD")}, cancellable=true)
    private void l(class_1268 class_12682, boolean bl, CallbackInfo callbackInfo) {
        block14: {
            Object object;
            block15: {
                CallSite callSite;
                boolean bl2;
                block12: {
                    block13: {
                        CallSite callSite2;
                        block10: {
                            block11: {
                                block9: {
                                    block8: {
                                        bl2 = c_0.J;
                                        if (d.a("$", class_746.class, (Object)this, (long)63144341504987742L) /* => java.lang.Class.isInstance */ == false) {
                                            return;
                                        }
                                        callSite2 = d.a("\u00fd", (long)55074934605809673L) /* => dev.hixo.M.s.Y.e.x */;
                                        if (bl2) break block8;
                                        if (callSite2 == null) break block9;
                                        callSite2 = d.a("\u00fd", (long)55074934605809673L) /* => dev.hixo.M.s.Y.e.x */;
                                    }
                                    if (bl2) break block10;
                                    if (d.a("$", (Object)callSite2, (long)96089342888548907L) /* => dev.hixo.M.G.c */ != false) break block11;
                                }
                                return;
                            }
                            callSite2 = d.a("\u00fd", (long)55074934605809673L) /* => dev.hixo.M.s.Y.e.x */;
                        }
                        callSite = d.a("z", (Object)callSite2, (long)193054601946402007L) /* => dev.hixo.M.s.Y.e.B */;
                        if (bl2) break block12;
                        if (d.a("$", (Object)callSite, (long)65580906021680841L) /* => dev.hixo.b.g.x */ == false) break block13;
                        d.a("$", (Object)callbackInfo, (long)93974103570719951L) /* => org.spongepowered.asm.mixin.injection.callback.CallbackInfo.cancel */;
                        if (!bl2) break block14;
                    }
                    callSite = d.a("z", (Object)d.a("\u00fd", (long)55074934605809673L) /* => dev.hixo.M.s.Y.e.x */, (long)164773598024635355L) /* => dev.hixo.M.s.Y.e.r */;
                }
                object = d.a("$", (Object)callSite, (long)65580906021680841L) /* => dev.hixo.b.g.x */;
                if (bl2) break block15;
                if (object == false) break block14;
                object = bl;
            }
            if (object == false) {
                d.a("$", (Object)callbackInfo, (long)93974103570719951L) /* => org.spongepowered.asm.mixin.injection.callback.CallbackInfo.cancel */;
                d.a("\u00f9", (Object)new class_2879(class_12682), (long)129367971854265225L) /* => dev.hixo.f.x.I.i */;
            }
        }
    }
}

