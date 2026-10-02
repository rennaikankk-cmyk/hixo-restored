/*
 * RESTORED SOURCE — decompiled reconstruction, not the original files.
 * class: dev.hixo.patch.LivingEntityPatch
 */

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1268
 *  net.minecraft.class_1309
 *  net.minecraft.class_2879
 *  net.minecraft.class_746
 */
package dev.hixo.patch;

import asm.patchify.annotation.Inject;
import asm.patchify.annotation.Patch;
import dev.hixo.M.d;
import dev.hixo.patch.CallbackInfo;
import java.lang.invoke.CallSite;
import net.minecraft.class_1268;
import net.minecraft.class_1309;
import net.minecraft.class_2879;
import net.minecraft.class_746;

@Patch(value=class_1309.class)
public class LivingEntityPatch {
    @Inject(method="swingHand", desc="(Lnet/minecraft/util/Hand;Z)V")
    public static void onSwingHand(class_1309 class_13092, class_1268 class_12682, boolean bl, CallbackInfo callbackInfo) {
        block14: {
            Object object;
            block15: {
                CallSite callSite;
                int n2;
                block12: {
                    block13: {
                        block10: {
                            block11: {
                                block9: {
                                    block8: {
                                        n2 = CallbackInfo.i;
                                        if (!(class_13092 instanceof class_746)) {
                                            return;
                                        }
                                        callSite = d.a("\u00fd", (long)55074934605809673L) /* => dev.hixo.M.s.Y.e.x */;
                                        if (n2 != 0) break block8;
                                        if (callSite == null) break block9;
                                        callSite = d.a("\u00fd", (long)55074934605809673L) /* => dev.hixo.M.s.Y.e.x */;
                                    }
                                    if (n2 != 0) break block10;
                                    if (d.a("$", (Object)callSite, (long)96089342888548907L) /* => dev.hixo.M.G.c */ != false) break block11;
                                }
                                return;
                            }
                            callSite = d.a("\u00fd", (long)55074934605809673L) /* => dev.hixo.M.s.Y.e.x */;
                        }
                        if (n2 != 0) break block12;
                        if (d.a("$", (Object)d.a("z", (Object)callSite, (long)193054601946402007L) /* => dev.hixo.M.s.Y.e.B */, (long)65580906021680841L) /* => dev.hixo.b.g.x */ == false) break block13;
                        d.a("$", (Object)callbackInfo, (long)104461966334151429L) /* => dev.hixo.patch.CallbackInfo.cancel */;
                        if (n2 == 0) break block14;
                    }
                    callSite = d.a("\u00fd", (long)55074934605809673L) /* => dev.hixo.M.s.Y.e.x */;
                }
                object = d.a("$", (Object)d.a("z", (Object)callSite, (long)164773598024635355L) /* => dev.hixo.M.s.Y.e.r */, (long)65580906021680841L) /* => dev.hixo.b.g.x */;
                if (n2 != 0) break block15;
                if (object == false) break block14;
                object = bl;
            }
            if (object == false) {
                d.a("$", (Object)callbackInfo, (long)104461966334151429L) /* => dev.hixo.patch.CallbackInfo.cancel */;
                d.a("\u00f9", (Object)new class_2879(class_12682), (long)129367971854265225L) /* => dev.hixo.f.x.I.i */;
            }
        }
    }
}

