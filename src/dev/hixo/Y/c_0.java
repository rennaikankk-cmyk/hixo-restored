/*
 * RESTORED SOURCE — decompiled reconstruction, not the original files.
 * class: dev.hixo.Y.c_0
 */

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_310
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.At$Shift
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package dev.hixo.y;

import dev.hixo.M.d;
import dev.hixo.T.q.S;
import dev.hixo.t.q.p_0;
import net.minecraft.class_310;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

/*
 * Renamed from dev.hixo.Y.c
 */
@Mixin(value={class_310.class})
public abstract class c_0 {
    private float T;
    private boolean Z;
    public static boolean J;

    public c_0() {
        d.a("\u00e7", (Object)this, (boolean)false, (long)173204899486402654L) /* => dev.hixo.Y.c.Z */;
    }

    @Inject(method={"tick"}, at={@At(value="HEAD")})
    public void O(CallbackInfo callbackInfo) {
        d.a("\u00f9", (long)134643471574343951L) /* => dev.hixo.f.P.h.R */;
        if (d.a("\u00fd", (long)71498313283647962L) /* => dev.hixo.Hixo.INSTANCE */ != null && d.a("$", (Object)d.a("\u00fd", (long)71498313283647962L) /* => dev.hixo.Hixo.INSTANCE */, (long)190854338929747379L) /* => dev.hixo.Hixo.getEventBus */ != null) {
            d.a("$", (Object)d.a("$", (Object)d.a("\u00fd", (long)71498313283647962L) /* => dev.hixo.Hixo.INSTANCE */, (long)190854338929747379L) /* => dev.hixo.Hixo.getEventBus */, (Object)new p_0((dev.hixo.T.S)((Object)d.a("\u00fd", (long)199476637466971905L) /* => dev.hixo.T.S.PRE */)), (long)177870116293240140L) /* => dev.hixo.T.V.T */;
        }
    }

    @Inject(method={"tick"}, at={@At(value="RETURN")})
    public void p(CallbackInfo callbackInfo) {
        if (d.a("\u00fd", (long)71498313283647962L) /* => dev.hixo.Hixo.INSTANCE */ != null && d.a("$", (Object)d.a("\u00fd", (long)71498313283647962L) /* => dev.hixo.Hixo.INSTANCE */, (long)190854338929747379L) /* => dev.hixo.Hixo.getEventBus */ != null) {
            d.a("$", (Object)d.a("$", (Object)d.a("\u00fd", (long)71498313283647962L) /* => dev.hixo.Hixo.INSTANCE */, (long)190854338929747379L) /* => dev.hixo.Hixo.getEventBus */, (Object)new p_0((dev.hixo.T.S)((Object)d.a("\u00fd", (long)39527997715613417L) /* => dev.hixo.T.S.POST */)), (long)177870116293240140L) /* => dev.hixo.T.V.T */;
        }
        d.a("$", (Object)this, (long)106080158265662309L) /* => dev.hixo.Y.c.N */;
    }

    @Inject(method={"tick"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/render/GameRenderer;updateCrosshairTarget(F)V", shift=At.Shift.BEFORE)})
    public void U(CallbackInfo callbackInfo) {
        if (d.a("\u00fd", (long)71498313283647962L) /* => dev.hixo.Hixo.INSTANCE */ == null) {
            return;
        }
        d.a("\u00f9", (long)193984876551119524L) /* => dev.hixo.f.L.E.k */;
        d.a("\u00f9", (long)44766089139684868L) /* => dev.hixo.f.B.G.N */;
    }

    @Inject(method={"tick"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/MinecraftClient;handleInputEvents()V", shift=At.Shift.BEFORE)})
    public void B(CallbackInfo callbackInfo) {
        if (d.a("\u00fd", (long)71498313283647962L) /* => dev.hixo.Hixo.INSTANCE */ == null || d.a("$", (Object)d.a("\u00fd", (long)71498313283647962L) /* => dev.hixo.Hixo.INSTANCE */, (long)190854338929747379L) /* => dev.hixo.Hixo.getEventBus */ == null) {
            return;
        }
        d.a("$", (Object)d.a("$", (Object)d.a("\u00fd", (long)71498313283647962L) /* => dev.hixo.Hixo.INSTANCE */, (long)190854338929747379L) /* => dev.hixo.Hixo.getEventBus */, (Object)new S(), (long)177870116293240140L) /* => dev.hixo.T.V.T */;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void N() {
        block16: {
            block19: {
                block20: {
                    block21: {
                        block18: {
                            block17: {
                                var2_1 = d.a("\u00f9", (long)179869930689441125L) /* => net.minecraft.class_310.method_1551 */;
                                var1_2 = c_0.J;
                                if (d.a("z", (Object)var2_1, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */ == null) {
                                    return;
                                }
                                var3_3 = d.a("\u00f9", (long)120787599445451503L) /* => dev.hixo.f.B.G.C */;
                                var4_4 = d.a("$", (Object)d.a("z", (Object)var2_1, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (long)68578805942358681L) /* => net.minecraft.class_746.method_36454 */;
                                v0 = var3_3;
                                if (var1_2) break block17;
                                if (v0 == null) ** GOTO lbl-1000
                                v0 = d.a("\u00f9", (long)52654057433724283L) /* => dev.hixo.f.B.G.w */;
                            }
                            if (var1_2) break block18;
                            if (v0 == null) ** GOTO lbl-1000
                            v0 = var3_3;
                        }
                        var5_5 = d.a("z", (Object)v0, (long)164061588253527562L) /* => dev.hixo.f.V.C.l */;
                        d.a("\u00e7", (Object)this, (boolean)true, (long)173204899486402654L) /* => dev.hixo.Y.c.Z */;
                        if (var1_2) lbl-1000:
                        // 3 sources

                        {
                            var5_5 = var4_4;
                            v1 = this;
                            if (!var1_2) {
                                if (d.a("z", (Object)v1, (long)173204899486402654L) /* => dev.hixo.Y.c.Z */ == false) {
                                    return;
                                } else {
                                    ** GOTO lbl-1000
                                }
                            }
                        } else lbl-1000:
                        // 3 sources

                        {
                            v1 = this;
                        }
                        if (!var1_2) {
                            if (d.a("z", (Object)v1, (long)173204899486402654L) /* => dev.hixo.Y.c.Z */ == false && var3_3 == null) {
                                return;
                            }
                            v1 = this;
                        }
                        v2 = d.a("z", (Object)v1, (long)115807956247984564L) /* => dev.hixo.Y.c.T */;
                        if (var1_2) break block19;
                        if (v2 != 0.0f) break block20;
                        v3 = this;
                        if (var1_2) break block21;
                        if (d.a("z", (Object)v3, (long)173204899486402654L) /* => dev.hixo.Y.c.Z */ != false) break block20;
                        v3 = this;
                    }
                    d.a("\u00e7", (Object)v3, (float)var4_4, (long)115807956247984564L) /* => dev.hixo.Y.c.T */;
                }
                v2 = var6_6 = var5_5 - d.a("z", (Object)this, (long)115807956247984564L) /* => dev.hixo.Y.c.T */;
            }
            while (var6_6 > 180.0f) {
                v4 = var6_6;
                v5 = 360.0f;
                if (!var1_2) {
                    var6_6 = v4 - v5;
                    if (!var1_2) continue;
                }
                ** GOTO lbl52
            }
            do {
                v4 = var6_6;
                v5 = -180.0f;
lbl52:
                // 2 sources

                if (!(v4 < v5)) break;
                v6 /* !! */  = var6_6;
                if (var1_2) break block16;
                var6_6 = v6 /* !! */  + 360.0f;
            } while (!var1_2);
            v6 /* !! */  = var7_7 /* !! */  = (reference)0.4f;
        }
        if (!var1_2) {
            v7 = this;
            d.a("\u00e7", (Object)v7, (float)(d.a("z", (Object)v7, (long)115807956247984564L) /* => dev.hixo.Y.c.T */ + var6_6 * var7_7 /* !! */ ), (long)115807956247984564L) /* => dev.hixo.Y.c.T */;
            if (d.a("\u00f9", (long)52654057433724283L) /* => dev.hixo.f.B.G.w */ == null && d.a("\u00f9", (float)var6_6, (long)164168003445879722L) /* => java.lang.Math.abs */ < 1.0f) {
                d.a("\u00e7", (Object)this, (boolean)false, (long)173204899486402654L) /* => dev.hixo.Y.c.Z */;
                d.a("\u00e7", (Object)this, (float)var4_4, (long)115807956247984564L) /* => dev.hixo.Y.c.T */;
                return;
            }
            d.a("\u00e7", (Object)d.a("z", (Object)var2_1, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (float)d.a("z", (Object)this, (long)115807956247984564L) /* => dev.hixo.Y.c.T */, (long)135817470729844828L) /* => net.minecraft.class_746.field_6241 */;
            d.a("\u00e7", (Object)d.a("z", (Object)var2_1, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (float)d.a("z", (Object)this, (long)115807956247984564L) /* => dev.hixo.Y.c.T */, (long)167307650357324481L) /* => net.minecraft.class_746.field_6283 */;
        }
    }
}

