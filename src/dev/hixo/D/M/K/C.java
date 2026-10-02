/*
 * RESTORED SOURCE — decompiled reconstruction, not the original files.
 * class: dev.hixo.D.M.K.C
 * context strings: '已启用' | '已关闭'
 * decrypted string pool:
 *   a[0] = \u5df2\u542f\u7528
 *   a[1] = \u5df2\u5173\u95ed
 */

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_332
 */
package dev.hixo.D.M.K;

import dev.hixo.D.M.K.a;
import dev.hixo.D.M.Q;
import dev.hixo.D.M.c;
import dev.hixo.D.t;
import dev.hixo.M.d;
import java.lang.invoke.CallSite;
import net.minecraft.class_332;

public class C
implements c {
    private static final float X = 12.0f;
    private static final float r = 24.0f;
    private static final float e = 12.0f;
    private final Q f = new Q(1.0f, d);
    private t l;
    private static final String[] a;
    private static final long[] b;
    private static final Integer[] c;
    private static final long d;

    private static t G() {
        CallSite callSite = dev.hixo.M.d.a("\u00fd", (long)71498313283647962L) /* => dev.hixo.Hixo.INSTANCE */ != null ? dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("\u00fd", (long)71498313283647962L) /* => dev.hixo.Hixo.INSTANCE */, (long)51354103131046111L) /* => dev.hixo.Hixo.getHudRenderer */ : null;
        return callSite == null ? null : dev.hixo.M.d.a("$", (Object)callSite, (long)85030527320293503L) /* => dev.hixo.D.a.h */;
    }

    private static int V() {
        CallSite callSite = dev.hixo.M.d.a("\u00fd", (long)71498313283647962L) /* => dev.hixo.Hixo.INSTANCE */ != null ? dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("\u00fd", (long)71498313283647962L) /* => dev.hixo.Hixo.INSTANCE */, (long)51354103131046111L) /* => dev.hixo.Hixo.getHudRenderer */ : null;
        return callSite == null ? 0 : (int)dev.hixo.M.d.a("$", (Object)callSite, (long)182624966527079724L) /* => dev.hixo.D.a.V */;
    }

    private static String x(t t2) {
        String string;
        if (dev.hixo.M.d.a("z", (Object)t2, (long)122152172460624263L) /* => dev.hixo.D.t.N */ == null) {
            return "";
        }
        if (dev.hixo.M.d.a("z", (Object)t2, (long)36153776261024243L) /* => dev.hixo.D.t.F */ != false) {
            String[] stringArray = a;
            string = stringArray[0];
        } else {
            string = a[1];
        }
        return string;
    }

    @Override
    public boolean R() {
        return dev.hixo.M.d.a("\u00f9", (long)146150422444413998L) /* => dev.hixo.D.M.K.C.G */ != null;
    }

    @Override
    public float Z() {
        CallSite callSite;
        CallSite callSite2 = dev.hixo.M.d.a("\u00f9", (long)179869930689441125L) /* => net.minecraft.class_310.method_1551 */;
        CallSite callSite3 = dev.hixo.M.d.a("\u00f9", (long)146150422444413998L) /* => dev.hixo.D.M.K.C.G */;
        if (callSite2 == null || callSite3 == null) {
            return 1.0f;
        }
        CallSite callSite4 = dev.hixo.M.d.a("z", (Object)callSite2, (long)33332170178084458L) /* => net.minecraft.class_310.field_1772 */;
        float f = 56.0f;
        f += (float)dev.hixo.M.d.a("$", (Object)callSite4, (Object)(dev.hixo.M.d.a("z", (Object)callSite3, (long)122152172460624263L) /* => dev.hixo.D.t.N */ != null ? dev.hixo.M.d.a("z", (Object)callSite3, (long)122152172460624263L) /* => dev.hixo.D.t.N */ : dev.hixo.M.d.a("z", (Object)callSite3, (long)200994713622953849L) /* => dev.hixo.D.t.U */), (long)60514977858798819L) /* => net.minecraft.class_327.method_1727 */;
        CallSite callSite5 = dev.hixo.M.d.a("\u00f9", (Object)callSite3, (long)76718520065214092L) /* => dev.hixo.D.M.K.C.x */;
        if (dev.hixo.M.d.a("$", (Object)callSite5, (long)139567490040770223L) /* => java.lang.String.isEmpty */ == false) {
            f += 8.0f + (float)dev.hixo.M.d.a("$", (Object)callSite4, (Object)callSite5, (long)60514977858798819L) /* => net.minecraft.class_327.method_1727 */;
        }
        if ((callSite = dev.hixo.M.d.a("\u00f9", (long)181305036565665019L) /* => dev.hixo.D.M.K.C.V */) > true) {
            f += 8.0f + (float)dev.hixo.M.d.a("$", (Object)callSite4, (Object)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("$", (Object)new StringBuilder(), (Object)"+", (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (int)(callSite - true), (long)32515713483113022L) /* => java.lang.StringBuilder.append */, (long)59411206276622891L) /* => java.lang.StringBuilder.toString */, (long)60514977858798819L) /* => net.minecraft.class_327.method_1727 */;
        }
        return f;
    }

    @Override
    public float S() {
        return 28.0f;
    }

    @Override
    public int l() {
        return 10;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void L(class_332 var1_1, float var2_2, float var3_3, float var4_4, float var5_5, float var6_6) {
        block19: {
            block18: {
                block17: {
                    block16: {
                        block15: {
                            var8_7 = dev.hixo.M.d.a("\u00f9", (long)179869930689441125L) /* => net.minecraft.class_310.method_1551 */;
                            var9_8 = dev.hixo.M.d.a("\u00f9", (long)146150422444413998L) /* => dev.hixo.D.M.K.C.G */;
                            var7_9 = dev.hixo.D.M.K.a.B;
                            v0 = var8_7;
                            if (var7_9) break block15;
                            if (v0 == null) break block16;
                            v0 = var8_7;
                        }
                        if (dev.hixo.M.d.a("z", (Object)v0, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */ != null && var9_8 != null) break block17;
                    }
                    return;
                }
                var10_10 = dev.hixo.M.d.a("z", (Object)var8_7, (long)33332170178084458L) /* => net.minecraft.class_310.field_1772 */;
                if (!var7_9) {
                    if (var9_8 != dev.hixo.M.d.a("z", (Object)this, (long)193721223458633082L) /* => dev.hixo.D.M.K.C.l */) {
                        dev.hixo.M.d.a("\u00e7", (Object)this, (t)var9_8, (long)193721223458633082L) /* => dev.hixo.D.M.K.C.l */;
                        dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)119936751386618716L) /* => dev.hixo.D.M.K.C.f */, (float)0.0f, (long)179224135678115724L) /* => dev.hixo.D.M.Q.K */;
                    }
                    dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)119936751386618716L) /* => dev.hixo.D.M.K.C.f */, (float)1.0f, (long)39684999864552653L) /* => dev.hixo.D.M.Q.P */;
                }
                var11_11 = dev.hixo.M.d.a("\u00f9", (float)0.02f, (float)(dev.hixo.M.d.a("\u00f9", (float)1.0f, (float)var6_6, (long)139533018482628456L) /* => java.lang.Math.min */ * dev.hixo.M.d.a("\u00f9", (float)1.0f, (float)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)119936751386618716L) /* => dev.hixo.D.M.K.C.f */, (long)59918197667439198L) /* => dev.hixo.D.M.Q.O */, (long)139533018482628456L) /* => java.lang.Math.min */ * dev.hixo.M.d.a("$", (Object)var9_8, (long)133700491446016879L) /* => dev.hixo.D.t.k */), (long)121565737685922221L) /* => java.lang.Math.max */;
                var12_12 = var3_3 + var5_5 / 2.0f;
                var13_13 = var2_2 + 12.0f;
                var14_14 = var12_12 - 6.0f;
                v1 = var9_8;
                if (var7_9) ** GOTO lbl27
                if (dev.hixo.M.d.a("z", (Object)v1, (long)36153776261024243L) /* => dev.hixo.D.t.F */ != false) {
                    v1 = var9_8;
lbl27:
                    // 2 sources

                    v2 /* !! */  = dev.hixo.M.d.a("z", (Object)v1, (long)161024664460561964L) /* => dev.hixo.D.t.Z */;
                } else {
                    v2 /* !! */  = (CallSite)C.a(6612, 8456623064666937167L);
                }
                dev.hixo.M.d.a("\u00f9", (Object)var1_1, (float)var13_13, (float)var14_14, (float)(var13_13 + 24.0f), (float)(var14_14 + 12.0f), (float)6.0f, (int)dev.hixo.M.d.a("\u00f9", (int)v2 /* !! */ , (float)(var11_11 * (dev.hixo.M.d.a("z", (Object)var9_8, (long)36153776261024243L) /* => dev.hixo.D.t.F */ != false ? 0.95f : 1.0f)), (long)83608216081975749L) /* => dev.hixo.D.M.U.w */, (long)60011677004176817L) /* => dev.hixo.D.M.U.m */;
                var15_15 = 4.0f;
                var16_16 = dev.hixo.M.d.a("z", (Object)var9_8, (long)36153776261024243L) /* => dev.hixo.D.t.F */ != false ? var13_13 + 24.0f - 6.0f : var13_13 + 6.0f;
                dev.hixo.M.d.a("\u00f9", (Object)var1_1, (float)(var16_16 - var15_15), (float)(var12_12 - var15_15), (float)(var16_16 + var15_15), (float)(var12_12 + var15_15), (float)var15_15, (int)dev.hixo.M.d.a("\u00f9", (int)-1, (float)var11_11, (long)83608216081975749L) /* => dev.hixo.D.M.U.w */, (long)60011677004176817L) /* => dev.hixo.D.M.U.m */;
                var13_13 += 32.0f;
                dev.hixo.M.d.a("\u00f9", (Object)var10_10, (long)43751334837936130L) /* => java.util.Objects.requireNonNull */;
                var17_17 = dev.hixo.M.d.a("\u00f9", (float)(var12_12 - 9.0f / 2.0f), (long)90255071001362112L) /* => java.lang.Math.round */;
                v3 = var9_8;
                if (var7_9) ** GOTO lbl44
                if (dev.hixo.M.d.a("z", (Object)v3, (long)122152172460624263L) /* => dev.hixo.D.t.N */ != null) {
                    v4 = dev.hixo.M.d.a("z", (Object)var9_8, (long)122152172460624263L) /* => dev.hixo.D.t.N */;
                } else {
                    v3 = var9_8;
lbl44:
                    // 2 sources

                    v4 = dev.hixo.M.d.a("z", (Object)v3, (long)200994713622953849L) /* => dev.hixo.D.t.U */;
                }
                var18_18 = v4;
                dev.hixo.M.d.a("$", (Object)var1_1, (Object)var10_10, (Object)var18_18, (int)dev.hixo.M.d.a("\u00f9", (float)var13_13, (long)90255071001362112L) /* => java.lang.Math.round */, (int)var17_17, (int)dev.hixo.M.d.a("\u00f9", (int)-1, (float)var11_11, (long)83608216081975749L) /* => dev.hixo.D.M.U.w */, (long)179776373438385131L) /* => net.minecraft.class_332.method_25303 */;
                var13_13 += (float)dev.hixo.M.d.a("$", (Object)var10_10, (Object)var18_18, (long)60514977858798819L) /* => net.minecraft.class_327.method_1727 */;
                var19_19 = dev.hixo.M.d.a("\u00f9", (Object)var9_8, (long)76718520065214092L) /* => dev.hixo.D.M.K.C.x */;
                v5 = dev.hixo.M.d.a("$", (Object)var19_19, (long)139567490040770223L) /* => java.lang.String.isEmpty */;
                if (!var7_9) {
                    if (v5 == false) {
                        v6 = dev.hixo.M.d.a("\u00f9", (float)(var13_13 += 8.0f), (long)90255071001362112L) /* => java.lang.Math.round */;
                        v7 = dev.hixo.M.d.a("z", (Object)var9_8, (long)36153776261024243L) /* => dev.hixo.D.t.F */;
                        if (!var7_9) {
                            v7 = v7 != false ? (Object)C.a(8990, 8751861061056605572L) : (Object)C.a(24989, 4596904486587920132L);
                        }
                        dev.hixo.M.d.a("$", (Object)var1_1, (Object)var10_10, (Object)var19_19, (int)v6, (int)var17_17, (int)dev.hixo.M.d.a("\u00f9", (int)v7, (float)var11_11, (long)83608216081975749L) /* => dev.hixo.D.M.U.w */, (long)179776373438385131L) /* => net.minecraft.class_332.method_25303 */;
                        var13_13 += (float)dev.hixo.M.d.a("$", (Object)var10_10, (Object)var19_19, (long)60514977858798819L) /* => net.minecraft.class_327.method_1727 */;
                    }
                    v5 = var20_20 = dev.hixo.M.d.a("\u00f9", (long)181305036565665019L) /* => dev.hixo.D.M.K.C.V */;
                }
                if (var7_9) break block18;
                if (var20_20 <= true) break block19;
                var13_13 += 8.0f;
            }
            dev.hixo.M.d.a("$", (Object)var1_1, (Object)var10_10, (Object)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("$", (Object)new StringBuilder(), (Object)"+", (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (int)(var20_20 - true), (long)32515713483113022L) /* => java.lang.StringBuilder.append */, (long)59411206276622891L) /* => java.lang.StringBuilder.toString */, (int)dev.hixo.M.d.a("\u00f9", (float)var13_13, (long)90255071001362112L) /* => java.lang.Math.round */, (int)var17_17, (int)dev.hixo.M.d.a("\u00f9", (int)C.a(21695, 934662080247290407L), (float)var11_11, (long)83608216081975749L) /* => dev.hixo.D.M.U.w */, (long)179776373438385131L) /* => net.minecraft.class_332.method_25303 */;
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block23: {
            block22: {
                block21: {
                    block20: {
                        var15 = new String[2];
                        var13_1 = 0;
                        var12_2 = "\u5def\u5429\u7543\u0003\u5def\u5175\u9586";
                        var14_3 = "\u5def\u5429\u7543\u0003\u5def\u5175\u9586".length();
                        var11_4 = 3;
                        var10_5 = -1;
lbl7:
                        // 2 sources

                        while (true) {
                            continue;
                            break;
                        }
lbl9:
                        // 1 sources

                        while (true) {
                            var15[var13_1++] = new String(v0).intern();
                            if ((var10_5 += var11_4) < var14_3) {
                                var11_4 = var12_2.charAt(var10_5);
                                ** continue;
                            }
                            break block20;
                            break;
                        }
                        v1 = ++var10_5;
                        v2 = var12_2.substring(v1, v1 + var11_4).toCharArray();
                        v0 = v2;
                        v3 = v2.length;
                        var16_6 = 0;
                        if (true) ** GOTO lbl48
                        do {
                            v0 = v0;
                            v4 = var16_6;
                            v5 = v0[v4];
                            switch (var16_6 % 7) {
                                case 0: {
                                    v6 = 29;
                                    break;
                                }
                                case 1: {
                                    v6 = 6;
                                    break;
                                }
                                case 2: {
                                    v6 = 107;
                                    break;
                                }
                                case 3: {
                                    v6 = 121;
                                    break;
                                }
                                case 4: {
                                    v6 = 57;
                                    break;
                                }
                                case 5: {
                                    v6 = 19;
                                    break;
                                }
                                default: {
                                    v6 = 111;
                                }
                            }
                            v0[v4] = (char)(v5 ^ v6);
                            ++var16_6;
lbl48:
                            // 2 sources

                            v3 = v3;
                        } while (v3 > var16_6);
                        ** while (true)
                    }
                    C.a = var15;
                    var2_7 = 5738939124879024523L;
                    var8_8 = new long[4];
                    var5_9 = 0;
                    var6_10 = "\u00dc\u0016\u0093\u00d1\u00c4\u009a\u0014\u0015}\u0017\u009e\\q\u00d4DS";
                    var7_11 = "\u00dc\u0016\u0093\u00d1\u00c4\u009a\u0014\u0015}\u0017\u009e\\q\u00d4DS".length();
                    var4_12 = 0;
                    while (true) {
                        var9_13 = var6_10.substring(var4_12, var4_12 += 8).getBytes("ISO-8859-1");
                        v7 = var8_8;
                        v8 = var5_9++;
                        v9 = ((long)var9_13[0] & 255L) << 56 | ((long)var9_13[1] & 255L) << 48 | ((long)var9_13[2] & 255L) << 40 | ((long)var9_13[3] & 255L) << 32 | ((long)var9_13[4] & 255L) << 24 | ((long)var9_13[5] & 255L) << 16 | ((long)var9_13[6] & 255L) << 8 | (long)var9_13[7] & 255L;
                        v10 = -1;
                        break block21;
                        break;
                    }
lbl68:
                    // 1 sources

                    while (true) {
                        v7[v8] = v11;
                        if (var4_12 < var7_11) ** continue;
                        var6_10 = "\t\u00d7\u00e7w\u00e1\u00e2I\u008d\u00bb\u008c@\\\u00aaT\u00af\u00af";
                        var7_11 = "\t\u00d7\u00e7w\u00e1\u00e2I\u008d\u00bb\u008c@\\\u00aaT\u00af\u00af".length();
                        var4_12 = 0;
                        while (true) {
                            var9_13 = var6_10.substring(var4_12, var4_12 += 8).getBytes("ISO-8859-1");
                            v7 = var8_8;
                            v8 = var5_9++;
                            v9 = ((long)var9_13[0] & 255L) << 56 | ((long)var9_13[1] & 255L) << 48 | ((long)var9_13[2] & 255L) << 40 | ((long)var9_13[3] & 255L) << 32 | ((long)var9_13[4] & 255L) << 24 | ((long)var9_13[5] & 255L) << 16 | ((long)var9_13[6] & 255L) << 8 | (long)var9_13[7] & 255L;
                            v10 = 0;
                            break block21;
                            break;
                        }
                        break;
                    }
lbl81:
                    // 1 sources

                    while (true) {
                        v7[v8] = v11;
                        if (var4_12 < var7_11) ** continue;
                        break block22;
                        break;
                    }
                }
                v11 = v9 ^ var2_7;
                switch (v10) {
                    default: {
                        ** continue;
                    }
                    ** case 0:
lbl92:
                    // 1 sources

                    ** continue;
                }
            }
            C.b = var8_8;
            C.c = new Integer[4];
            break block23;
lbl97:
            // 1 sources

            while (true) {
                continue;
                break;
            }
        }
        var0_14 = 1384632711420372275L;
        ** while (true)
        C.d = 1384632711420372475L ^ var0_14;
    }

    private static int a(int n2, long l2) {
        int n3 = n2 ^ (int)(l2 & 0x7FFFL) ^ 0xE99;
        if (c[n3] == null) {
            C.c[n3] = (int)(b[n3] ^ l2);
        }
        return c[n3];
    }
}

