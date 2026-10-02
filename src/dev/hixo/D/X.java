/*
 * RESTORED SOURCE — decompiled reconstruction, not the original files.
 * class: dev.hixo.D.X
 * context strings: '正在注入… ' | 'Hixo' | 'Hixo' | '已注入 · Injected'
 * decrypted string pool:
 *   a[0] = \u6b63\u5728\u6ce8\u5165\u2026 
 *   a[1] = Hixo
 *   a[2] = Hixo
 *   a[3] = \u5df2\u6ce8\u5165 \u00b7 Injected
 */

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_310
 *  net.minecraft.class_332
 */
package dev.hixo.D;

import dev.hixo.D.a;
import dev.hixo.M.d;
import java.lang.invoke.CallSite;
import net.minecraft.class_310;
import net.minecraft.class_332;

public final class X {
    private static final long W;
    private static boolean P;
    private static long T;
    private static final String[] a;
    private static final long[] b;
    private static final Integer[] c;

    private X() {
    }

    public static void r() {
        d.a("\u00c1", (long)d.a("\u00f9", (long)78882375305248292L) /* => java.lang.System.nanoTime */, (long)164429485818002793L) /* => dev.hixo.D.X.T */;
        d.a("\u00c1", (boolean)true, (long)59294068209092365L) /* => dev.hixo.D.X.P */;
    }

    public static boolean C() {
        return d.a("\u00fd", (long)59294068209092365L) /* => dev.hixo.D.X.P */ != false && d.a("\u00f9", (long)125005550029393639L) /* => dev.hixo.D.X.q */ < 1800.0f;
    }

    private static float q() {
        return (float)(d.a("\u00f9", (long)78882375305248292L) /* => java.lang.System.nanoTime */ - d.a("\u00fd", (long)164429485818002793L) /* => dev.hixo.D.X.T */) / 1000000.0f;
    }

    public static boolean P(class_332 class_3322, class_310 class_3102) {
        Object object;
        Object object2;
        String[] stringArray;
        reference var11_11;
        CallSite callSite;
        boolean bl;
        block18: {
            block17: {
                class_310 class_3103;
                block16: {
                    block15: {
                        Object object3;
                        block14: {
                            bl = dev.hixo.D.a.E;
                            object3 = d.a("\u00fd", (long)59294068209092365L) /* => dev.hixo.D.X.P */;
                            if (!bl) {
                                if (object3 == false) {
                                    d.a("\u00f9", (long)35950364137661294L) /* => dev.hixo.D.X.r */;
                                }
                                object3 = d.a("\u00f9", (long)98383881107534576L) /* => dev.hixo.D.X.C */;
                            }
                            if (bl) break block14;
                            if (object3 != false) break block15;
                            object3 = false;
                        }
                        return (boolean)object3;
                    }
                    class_3103 = class_3102;
                    if (bl) break block16;
                    if (class_3103 == null) break block17;
                    class_3103 = class_3102;
                }
                if (d.a("z", (Object)class_3103, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */ != null && class_3322 != null) break block18;
            }
            return true;
        }
        CallSite callSite2 = d.a("z", (Object)class_3102, (long)33332170178084458L) /* => net.minecraft.class_310.field_1772 */;
        CallSite callSite3 = d.a("$", (Object)d.a("$", (Object)class_3102, (long)169743140070480080L) /* => net.minecraft.class_310.method_22683 */, (long)107198687642898751L) /* => net.minecraft.class_1041.method_4486 */;
        CallSite callSite4 = d.a("$", (Object)d.a("$", (Object)class_3102, (long)169743140070480080L) /* => net.minecraft.class_310.method_22683 */, (long)186961627710706300L) /* => net.minecraft.class_1041.method_4502 */;
        CallSite callSite5 = d.a("\u00f9", (long)125005550029393639L) /* => dev.hixo.D.X.q */;
        float f = (float)callSite3 / 2.0f;
        float f2 = (float)callSite4 / 2.0f;
        CallSite callSite6 = d.a("\u00f9", (float)d.a("\u00f9", (float)(callSite5 / 220.0f), (long)121315951531344064L) /* => dev.hixo.D.X.k */, (float)d.a("\u00f9", (float)((1800.0f - callSite5) / 320.0f), (long)121315951531344064L) /* => dev.hixo.D.X.k */, (long)139533018482628456L) /* => java.lang.Math.min */;
        d.a("$", (Object)class_3322, (int)0, (int)0, (int)callSite3, (int)callSite4, (int)d.a("\u00f9", (int)X.a(20566, 6445677508974167597L), (float)(callSite6 * 0.72f), (long)83608216081975749L) /* => dev.hixo.D.M.U.w */, (long)70222225705551889L) /* => net.minecraft.class_332.method_25294 */;
        CallSite callSite7 = callSite = callSite6 * d.a("\u00f9", (float)d.a("\u00f9", (float)((callSite5 - 150.0f) / 400.0f), (long)121315951531344064L) /* => dev.hixo.D.X.k */, (long)77562303178111804L) /* => dev.hixo.D.X.Y */;
        if (!bl) {
            if (callSite7 > 0.01f) {
                var11_11 = (reference)2.2f;
                d.a("$", (Object)d.a("$", (Object)class_3322, (long)182057530285180715L) /* => net.minecraft.class_332.method_51448 */, (long)107444705912078912L) /* => net.minecraft.class_4587.method_22903 */;
                d.a("$", (Object)d.a("$", (Object)class_3322, (long)182057530285180715L) /* => net.minecraft.class_332.method_51448 */, (float)f, (float)(f2 - 16.0f), (float)0.0f, (long)56023600929979137L) /* => net.minecraft.class_4587.method_46416 */;
                d.a("$", (Object)d.a("$", (Object)class_3322, (long)182057530285180715L) /* => net.minecraft.class_332.method_51448 */, (float)var11_11, (float)var11_11, (float)1.0f, (long)64702201591988101L) /* => net.minecraft.class_4587.method_22905 */;
                stringArray = a;
                d.a("$", (Object)class_3322, (Object)callSite2, (Object)stringArray[1], (int)(-d.a("$", (Object)callSite2, (Object)stringArray[2], (long)60514977858798819L) /* => net.minecraft.class_327.method_1727 */ / 2), (int)0, (int)d.a("\u00f9", (int)-1, (float)callSite, (long)83608216081975749L) /* => dev.hixo.D.M.U.w */, (long)179776373438385131L) /* => net.minecraft.class_332.method_25303 */;
                d.a("$", (Object)d.a("$", (Object)class_3322, (long)182057530285180715L) /* => net.minecraft.class_332.method_51448 */, (long)173437477470911975L) /* => net.minecraft.class_4587.method_22909 */;
            }
            callSite7 = d.a("\u00f9", (float)((callSite5 - 300.0f) / 900.0f), (long)121315951531344064L) /* => dev.hixo.D.X.k */;
        }
        var11_11 = callSite7;
        reference cfr_temp_0 = var11_11 - 1.0f;
        Object object4 = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 > 0 ? 1 : -1);
        if (!bl) {
            object4 = object2 = object4 >= 0 ? (Object)true : (Object)false;
        }
        if (object2 != false) {
            stringArray = a;
            object = stringArray[3];
        } else {
            object = d.a("$", (Object)d.a("$", (Object)d.a("$", (Object)d.a("$", (Object)new StringBuilder(), (Object)a[0], (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (int)((int)(var11_11 * 100.0f)), (long)32515713483113022L) /* => java.lang.StringBuilder.append */, (Object)"%", (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (long)59411206276622891L) /* => java.lang.StringBuilder.toString */;
        }
        String string = object;
        CallSite callSite9 = d.a("\u00f9", (float)(f - (float)d.a("$", (Object)callSite2, (Object)string, (long)60514977858798819L) /* => net.minecraft.class_327.method_1727 */ / 2.0f), (long)90255071001362112L) /* => java.lang.Math.round */;
        callSite9 = d.a("\u00f9", (float)(f2 + 24.0f), (long)90255071001362112L) /* => java.lang.Math.round */;
        Object object5 = object2;
        if (!bl) {
            object5 = object5 != false ? (Object)X.a(27978, 7521241492612348720L) : (Object)X.a(22439, 5099350028812272094L);
        }
        d.a("$", (Object)class_3322, (Object)callSite2, (Object)string, (int)callSite8, (int)callSite9, (int)d.a("\u00f9", (int)object5, (float)callSite6, (long)83608216081975749L) /* => dev.hixo.D.M.U.w */, (long)179776373438385131L) /* => net.minecraft.class_332.method_25303 */;
        return true;
    }

    private static float k(float f) {
        return f < 0.0f ? 0.0f : (float)d.a("\u00f9", (float)f, (float)1.0f, (long)139533018482628456L) /* => java.lang.Math.min */;
    }

    private static float Y(float f) {
        return 1.0f - (float)d.a("\u00f9", (double)(1.0f - d.a("\u00f9", (float)f, (long)121315951531344064L) /* => dev.hixo.D.X.k */), (double)3.0, (long)69738387666927367L) /* => java.lang.Math.pow */;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block25: {
            block24: {
                block23: {
                    block22: {
                        block21: {
                            var17 = new String[4];
                            var15_1 = 0;
                            var14_2 = "\u6b11\u572d\u6cb0\u5145\u206dm\u0004:l O";
                            var16_3 = "\u6b11\u572d\u6cb0\u5145\u206dm\u0004:l O".length();
                            var13_4 = 6;
                            var12_5 = -1;
lbl7:
                            // 2 sources

                            while (true) {
                                v0 = ++var12_5;
                                v1 = var14_2.substring(v0, v0 + var13_4);
                                v2 = -1;
                                break block21;
                                break;
                            }
lbl12:
                            // 1 sources

                            while (true) {
                                var17[var15_1++] = v3.intern();
                                if ((var12_5 += var13_4) < var16_3) {
                                    var13_4 = var14_2.charAt(var12_5);
                                    ** continue;
                                }
                                var14_2 = ":l O\u000e\u5d80\u6ced\u513d\u0000\u00fcmF\u001co=C?(k";
                                var16_3 = ":l O\u000e\u5d80\u6ced\u513d\u0000\u00fcmF\u001co=C?(k".length();
                                var13_4 = 4;
                                var12_5 = -1;
lbl21:
                                // 2 sources

                                while (true) {
                                    v4 = ++var12_5;
                                    v1 = var14_2.substring(v4, v4 + var13_4);
                                    v2 = 0;
                                    break block21;
                                    break;
                                }
                                break;
                            }
lbl26:
                            // 1 sources

                            while (true) {
                                var17[var15_1++] = v3.intern();
                                if ((var12_5 += var13_4) < var16_3) {
                                    var13_4 = var14_2.charAt(var12_5);
                                    ** continue;
                                }
                                break block22;
                                break;
                            }
                        }
                        v5 = v1.toCharArray();
                        v6 = v5;
                        v7 = v5.length;
                        var18_6 = 0;
                        if (true) ** GOTO lbl65
                        do {
                            v6 = v6;
                            v8 = var18_6;
                            v9 = v6[v8];
                            switch (var18_6 % 7) {
                                case 0: {
                                    v10 = 114;
                                    break;
                                }
                                case 1: {
                                    v10 = 5;
                                    break;
                                }
                                case 2: {
                                    v10 = 88;
                                    break;
                                }
                                case 3: {
                                    v10 = 32;
                                    break;
                                }
                                case 4: {
                                    v10 = 75;
                                    break;
                                }
                                case 5: {
                                    v10 = 77;
                                    break;
                                }
                                default: {
                                    v10 = 15;
                                }
                            }
                            v6[v8] = (char)(v9 ^ v10);
                            ++var18_6;
lbl65:
                            // 2 sources

                            v7 = v7;
                        } while (v7 > var18_6);
                        v3 = new String(v6);
                        switch (v2) {
                            default: {
                                ** continue;
                            }
                            ** case 0:
lbl73:
                            // 1 sources

                            ** continue;
                        }
                    }
                    X.a = var17;
                    var4_7 = 7305834935813180951L;
                    var10_8 = new long[3];
                    var7_9 = 0;
                    var8_10 = "\u00f1h\n\u00a7D\u00ec\u00cf6\u00b7\u00b0}1\u00ba\u00a1\u0016\u00bd$\b\u00fd0\u001b\u00cb\u008f\u0005";
                    var9_11 = "\u00f1h\n\u00a7D\u00ec\u00cf6\u00b7\u00b0}1\u00ba\u00a1\u0016\u00bd$\b\u00fd0\u001b\u00cb\u008f\u0005".length();
                    var6_12 = 0;
                    while (true) {
                        break block23;
                        break;
                    }
lbl84:
                    // 1 sources

                    while (true) {
                        var10_8[v11] = (((long)var11_13[0] & 255L) << 56 | ((long)var11_13[1] & 255L) << 48 | ((long)var11_13[2] & 255L) << 40 | ((long)var11_13[3] & 255L) << 32 | ((long)var11_13[4] & 255L) << 24 | ((long)var11_13[5] & 255L) << 16 | ((long)var11_13[6] & 255L) << 8 | (long)var11_13[7] & 255L) ^ var4_7;
                        if (var6_12 < var9_11) ** continue;
                        break block24;
                        break;
                    }
                }
                var11_13 = var8_10.substring(var6_12, var6_12 += 8).getBytes("ISO-8859-1");
                v11 = var7_9++;
                ** while (true)
            }
            X.b = var10_8;
            X.c = new Integer[3];
            break block25;
lbl99:
            // 1 sources

            while (true) {
                continue;
                break;
            }
        }
        var2_14 = 1715314072754022620L;
        ** while (true)
        X.W = var0_15 = 1715314072754024404L ^ var2_14;
    }

    private static int a(int n2, long l2) {
        int n3 = n2 ^ (int)(l2 & 0x7FFFL) ^ 0x167B;
        if (c[n3] == null) {
            X.c[n3] = (int)(b[n3] ^ l2);
        }
        return c[n3];
    }
}

