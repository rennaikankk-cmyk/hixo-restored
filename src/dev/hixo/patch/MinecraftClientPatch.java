/*
 * RESTORED SOURCE — decompiled reconstruction, not the original files.
 * class: dev.hixo.patch.MinecraftClientPatch
 */

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_310
 */
package dev.hixo.patch;

import asm.patchify.annotation.At;
import asm.patchify.annotation.Inject;
import asm.patchify.annotation.Patch;
import dev.hixo.M.d;
import dev.hixo.T.q.S;
import dev.hixo.patch.CallbackInfo;
import dev.hixo.t.q.p_0;
import java.lang.invoke.CallSite;
import net.minecraft.class_310;

@Patch(value=class_310.class)
public class MinecraftClientPatch {
    private static float smoothedHeadYaw;
    private static boolean hasTarget;
    private static long tickStartNanos;
    private static final String a;
    private static final long[] b;
    private static final Long[] c;

    @Inject(method="tick", desc="()V")
    public static void onTickHead(class_310 class_3102, CallbackInfo callbackInfo) {
        d.a("\u00c1", (long)d.a("\u00f9", (long)78882375305248292L) /* => java.lang.System.nanoTime */, (long)148081849256704685L) /* => dev.hixo.patch.MinecraftClientPatch.tickStartNanos */;
        d.a("\u00f9", (long)134643471574343951L) /* => dev.hixo.f.P.h.R */;
        CallSite callSite = d.a("\u00fd", (long)71498313283647962L) /* => dev.hixo.Hixo.INSTANCE */;
        if (callSite == null) {
            return;
        }
        if (d.a("$", (Object)callSite, (long)190854338929747379L) /* => dev.hixo.Hixo.getEventBus */ != null) {
            d.a("$", (Object)d.a("$", (Object)callSite, (long)190854338929747379L) /* => dev.hixo.Hixo.getEventBus */, (Object)new p_0((dev.hixo.T.S)((Object)d.a("\u00fd", (long)199476637466971905L) /* => dev.hixo.T.S.PRE */)), (long)177870116293240140L) /* => dev.hixo.T.V.T */;
        }
        if (d.a("$", (Object)callSite, (long)176688321739837625L) /* => dev.hixo.Hixo.getKeyBindManager */ != null) {
            d.a("$", (Object)d.a("$", (Object)callSite, (long)176688321739837625L) /* => dev.hixo.Hixo.getKeyBindManager */, (long)135389886239577580L) /* => dev.hixo.P.s.k */;
        }
    }

    @Inject(method="tick", desc="()V", at=@At(value=At.Type.TAIL))
    public static void onTickReturn(class_310 class_3102, CallbackInfo callbackInfo) {
        if (d.a("\u00fd", (long)71498313283647962L) /* => dev.hixo.Hixo.INSTANCE */ != null && d.a("$", (Object)d.a("\u00fd", (long)71498313283647962L) /* => dev.hixo.Hixo.INSTANCE */, (long)190854338929747379L) /* => dev.hixo.Hixo.getEventBus */ != null) {
            d.a("$", (Object)d.a("$", (Object)d.a("\u00fd", (long)71498313283647962L) /* => dev.hixo.Hixo.INSTANCE */, (long)190854338929747379L) /* => dev.hixo.Hixo.getEventBus */, (Object)new p_0((dev.hixo.T.S)((Object)d.a("\u00fd", (long)39527997715613417L) /* => dev.hixo.T.S.POST */)), (long)177870116293240140L) /* => dev.hixo.T.V.T */;
        }
        d.a("\u00f9", (Object)class_3102, (long)178441542761580481L) /* => dev.hixo.patch.MinecraftClientPatch.applyVisualRotation */;
        if (d.a("\u00fd", (long)148081849256704685L) /* => dev.hixo.patch.MinecraftClientPatch.tickStartNanos */ != 0L) {
            reference var2_2 = (d.a("\u00f9", (long)78882375305248292L) /* => java.lang.System.nanoTime */ - d.a("\u00fd", (long)148081849256704685L) /* => dev.hixo.patch.MinecraftClientPatch.tickStartNanos */) / MinecraftClientPatch.a(20961, 6821167348370469701L);
            if (var2_2 >= MinecraftClientPatch.a(22992, 7690881299765361525L)) {
                d.a("$", (Object)d.a("\u00fd", (long)75125634791150063L) /* => dev.hixo.Hixo.LOGGER */, (Object)a, (Object)d.a("\u00f9", (long)var2_2, (long)85160129630559423L) /* => java.lang.Long.valueOf */, (long)123364869560705799L) /* => org.slf4j.Logger.warn */;
            }
            d.a("\u00c1", (long)0L, (long)148081849256704685L) /* => dev.hixo.patch.MinecraftClientPatch.tickStartNanos */;
        }
    }

    @Inject(method="tick", desc="()V", at=@At(value=At.Type.BEFORE_INVOKE, method="net/minecraft/client/render/GameRenderer/updateCrosshairTarget", desc="(F)V"))
    public static void hookRotation(class_310 class_3102, CallbackInfo callbackInfo) {
        CallSite callSite = d.a("\u00fd", (long)71498313283647962L) /* => dev.hixo.Hixo.INSTANCE */;
        if (callSite == null || d.a("$", (Object)callSite, (long)190854338929747379L) /* => dev.hixo.Hixo.getEventBus */ == null) {
            return;
        }
        d.a("\u00f9", (long)193984876551119524L) /* => dev.hixo.f.L.E.k */;
        d.a("\u00f9", (long)44766089139684868L) /* => dev.hixo.f.B.G.N */;
    }

    @Inject(method="tick", desc="()V", at=@At(value=At.Type.BEFORE_INVOKE, method="net/minecraft/client/MinecraftClient/handleInputEvents", desc="()V"))
    public static void hookRotationApplied(class_310 class_3102, CallbackInfo callbackInfo) {
        if (d.a("\u00fd", (long)71498313283647962L) /* => dev.hixo.Hixo.INSTANCE */ == null || d.a("$", (Object)d.a("\u00fd", (long)71498313283647962L) /* => dev.hixo.Hixo.INSTANCE */, (long)190854338929747379L) /* => dev.hixo.Hixo.getEventBus */ == null) {
            return;
        }
        d.a("$", (Object)d.a("$", (Object)d.a("\u00fd", (long)71498313283647962L) /* => dev.hixo.Hixo.INSTANCE */, (long)190854338929747379L) /* => dev.hixo.Hixo.getEventBus */, (Object)new S(), (long)177870116293240140L) /* => dev.hixo.T.V.T */;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static void applyVisualRotation(class_310 var0) {
        block23: {
            block24: {
                block25: {
                    block18: {
                        block22: {
                            block21: {
                                block20: {
                                    block19: {
                                        var1_1 = CallbackInfo.i;
                                        if (d.a("z", (Object)var0, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */ == null) {
                                            return;
                                        }
                                        var2_2 = d.a("\u00f9", (long)120787599445451503L) /* => dev.hixo.f.B.G.C */;
                                        var3_3 = d.a("$", (Object)d.a("z", (Object)var0, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (long)68578805942358681L) /* => net.minecraft.class_746.method_36454 */;
                                        v0 = var2_2;
                                        if (var1_1 != 0) break block19;
                                        if (v0 == null) ** GOTO lbl-1000
                                        v0 = d.a("\u00f9", (long)52654057433724283L) /* => dev.hixo.f.B.G.w */;
                                    }
                                    if (var1_1 != 0) break block20;
                                    if (v0 == null) ** GOTO lbl-1000
                                    v0 = var2_2;
                                }
                                var4_4 = d.a("z", (Object)v0, (long)164061588253527562L) /* => dev.hixo.f.V.C.l */;
                                d.a("\u00c1", (boolean)true, (long)194215149775738729L) /* => dev.hixo.patch.MinecraftClientPatch.hasTarget */;
                                if (var1_1 != 0) lbl-1000:
                                // 3 sources

                                {
                                    var4_4 = var3_3;
                                    v1 = d.a("\u00fd", (long)194215149775738729L) /* => dev.hixo.patch.MinecraftClientPatch.hasTarget */;
                                    if (var1_1 == 0) {
                                        if (v1 == false) {
                                            return;
                                        } else {
                                            ** GOTO lbl-1000
                                        }
                                    }
                                } else lbl-1000:
                                // 3 sources

                                {
                                    v1 = d.a("\u00fd", (long)194215149775738729L) /* => dev.hixo.patch.MinecraftClientPatch.hasTarget */;
                                }
                                if (var1_1 != 0) break block21;
                                if (v1 == false && var2_2 == null) {
                                    return;
                                }
                                v2 = d.a("\u00fd", (long)113086210553185679L) /* => dev.hixo.patch.MinecraftClientPatch.smoothedHeadYaw */;
                                if (var1_1 != 0) break block22;
                                cfr_temp_0 = v2 - 0.0f;
                                v1 = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 > 0 ? 1 : -1);
                            }
                            if (v1 == false && d.a("\u00fd", (long)194215149775738729L) /* => dev.hixo.patch.MinecraftClientPatch.hasTarget */ == false) {
                                d.a("\u00c1", (float)var3_3, (long)113086210553185679L) /* => dev.hixo.patch.MinecraftClientPatch.smoothedHeadYaw */;
                            }
                            v2 = var5_5 = var4_4 - d.a("\u00fd", (long)113086210553185679L) /* => dev.hixo.patch.MinecraftClientPatch.smoothedHeadYaw */;
                        }
                        while (var5_5 > 180.0f) {
                            v3 = var5_5;
                            if (var1_1 == 0) {
                                var5_5 = v3 - 360.0f;
                                if (var1_1 == 0) continue;
                            }
                            ** GOTO lbl45
                        }
                        do {
                            v3 = var5_5;
lbl45:
                            // 2 sources

                            if (!(v3 < -180.0f)) break;
                            v4 = var5_5;
                            if (var1_1 != 0) break block18;
                            var5_5 = v4 + 360.0f;
                        } while (var1_1 == 0);
                        v4 = d.a("\u00fd", (long)113086210553185679L) /* => dev.hixo.patch.MinecraftClientPatch.smoothedHeadYaw */ + var5_5 * 0.4f;
                    }
                    d.a("\u00c1", (float)v4, (long)113086210553185679L) /* => dev.hixo.patch.MinecraftClientPatch.smoothedHeadYaw */;
                    if (var1_1 != 0) break block23;
                    if (d.a("\u00f9", (long)52654057433724283L) /* => dev.hixo.f.B.G.w */ != null) break block24;
                    v5 = d.a("\u00f9", (float)var5_5, (long)164168003445879722L) /* => java.lang.Math.abs */;
                    if (var1_1 != 0) break block25;
                    if (!(v5 < 1.0f)) break block24;
                    d.a("\u00c1", (boolean)false, (long)194215149775738729L) /* => dev.hixo.patch.MinecraftClientPatch.hasTarget */;
                    v5 = var3_3;
                }
                d.a("\u00c1", (float)v5, (long)113086210553185679L) /* => dev.hixo.patch.MinecraftClientPatch.smoothedHeadYaw */;
                return;
            }
            d.a("\u00e7", (Object)d.a("z", (Object)var0, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (float)d.a("\u00fd", (long)113086210553185679L) /* => dev.hixo.patch.MinecraftClientPatch.smoothedHeadYaw */, (long)135817470729844828L) /* => net.minecraft.class_746.field_6241 */;
            d.a("\u00e7", (Object)d.a("z", (Object)var0, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (float)d.a("\u00fd", (long)113086210553185679L) /* => dev.hixo.patch.MinecraftClientPatch.smoothedHeadYaw */, (long)167307650357324481L) /* => net.minecraft.class_746.field_6283 */;
        }
    }

    /*
     * Handled impossible loop by duplicating code
     * Enabled aggressive block sorting
     */
    static {
        char[] cArray;
        block12: {
            int n2;
            int n3;
            block11: {
                char[] cArray2 = "\u007f(RI\"m\u001bW,TFmDRG+\u0001\u00116M\u001bI3".toCharArray();
                cArray = cArray2;
                n3 = cArray2.length;
                n2 = 0;
                if (!true) break block11;
                n3 = n3;
                if (n3 <= n2) break block12;
            }
            do {
                cArray = cArray;
                int n4 = n2;
                char c2 = cArray[n4];
                cArray[n4] = (char)(c2 ^ (switch (n2 % 7) {
                    case 0 -> 36;
                    case 1 -> 64;
                    case 2 -> 59;
                    case 3 -> 49;
                    case 4 -> 77;
                    case 5 -> 48;
                    default -> 59;
                }));
                ++n2;
                n3 = n3;
            } while (n3 > n2);
        }
        a = new String(cArray).intern();
        long l2 = 1859948628025529320L;
        long[] lArray = new long[2];
        int n5 = 0;
        String string = "st\u00a2\u00a7s\u00da\u00a8\u00b5Gfz\u00fc\b\u00fd\u00e2\u00ed";
        int n6 = "st\u00a2\u00a7s\u00da\u00a8\u00b5Gfz\u00fc\b\u00fd\u00e2\u00ed".length();
        int n7 = 0;
        do {
            byte[] byArray = string.substring(n7, n7 += 8).getBytes("ISO-8859-1");
            int n8 = n5++;
            lArray[n8] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l2;
        } while (n7 < n6);
        b = lArray;
        c = new Long[2];
    }

    private static long a(int n2, long l2) {
        int n3 = (n2 ^ (int)l2 ^ 0x22A5) & Short.MAX_VALUE;
        if (c[n3] == null) {
            MinecraftClientPatch.c[n3] = b[n3] ^ l2;
        }
        return c[n3];
    }
}

