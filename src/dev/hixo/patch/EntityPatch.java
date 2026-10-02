/*
 * RESTORED SOURCE — decompiled reconstruction, not the original files.
 * class: dev.hixo.patch.EntityPatch
 */

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1297
 */
package dev.hixo.patch;

import asm.patchify.annotation.Inject;
import asm.patchify.annotation.Patch;
import dev.hixo.M.d;
import dev.hixo.M.s.K.A;
import dev.hixo.patch.CallbackInfo;
import java.lang.invoke.CallSite;
import net.minecraft.class_1297;

@Patch(value=class_1297.class)
public class EntityPatch {
    @Inject(method="isGlowing", desc="()Z")
    public static void onIsGlowing(class_1297 class_12972, CallbackInfo callbackInfo) {
        A a2;
        block13: {
            A a3;
            block14: {
                block12: {
                    int n2;
                    block11: {
                        CallSite callSite;
                        block9: {
                            CallSite callSite2;
                            block10: {
                                block8: {
                                    block7: {
                                        callSite2 = d.a("\u00fd", (long)71498313283647962L) /* => dev.hixo.Hixo.INSTANCE */;
                                        n2 = CallbackInfo.i;
                                        callSite = callSite2;
                                        if (n2 != 0) break block7;
                                        if (callSite == null) break block8;
                                        callSite = callSite2;
                                    }
                                    if (n2 != 0) break block9;
                                    if (d.a("$", (Object)callSite, (long)190425734249275754L) /* => dev.hixo.Hixo.getModuleManager */ != null) break block10;
                                }
                                return;
                            }
                            callSite = callSite2;
                        }
                        a2 = a3 = (A)((Object)d.a("$", (Object)d.a("$", (Object)callSite, (long)190425734249275754L) /* => dev.hixo.Hixo.getModuleManager */, A.class, (long)128753564242528692L) /* => dev.hixo.M.n.b */);
                        if (n2 != 0) break block11;
                        if (a2 == null) break block12;
                        a2 = a3;
                    }
                    if (n2 != 0) break block13;
                    if (d.a("$", (Object)a2, (long)96089342888548907L) /* => dev.hixo.M.G.c */ != false) break block14;
                }
                return;
            }
            a2 = a3;
        }
        if (d.a("$", (Object)a2, (Object)class_12972, (long)201052034271107059L) /* => dev.hixo.M.s.K.A.o */ != false) {
            d.a("\u00e7", (Object)callbackInfo, (Object)d.a("\u00fd", (long)47372699124985723L) /* => java.lang.Boolean.TRUE */, (long)159621490419341444L) /* => dev.hixo.patch.CallbackInfo.result */;
            d.a("$", (Object)callbackInfo, (long)104461966334151429L) /* => dev.hixo.patch.CallbackInfo.cancel */;
        }
    }
}

