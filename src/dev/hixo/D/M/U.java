/*
 * RESTORED SOURCE — decompiled reconstruction, not the original files.
 * class: dev.hixo.D.M.U
 */

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_332
 */
package dev.hixo.D.M;

import dev.hixo.M.d;
import java.lang.invoke.CallSite;
import net.minecraft.class_332;

public final class U {
    public static boolean N;
    private static final long[] a;
    private static final Integer[] b;

    private U() {
    }

    public static void m(class_332 class_3322, float f, float f2, float f3, float f4, float f5, int n2) {
        d.a("\u00f9", (Object)class_3322, (int)d.a("\u00f9", (float)f, (long)90255071001362112L) /* => java.lang.Math.round */, (int)d.a("\u00f9", (float)f2, (long)90255071001362112L) /* => java.lang.Math.round */, (int)d.a("\u00f9", (float)f3, (long)90255071001362112L) /* => java.lang.Math.round */, (int)d.a("\u00f9", (float)f4, (long)90255071001362112L) /* => java.lang.Math.round */, (int)d.a("\u00f9", (int)0, (int)d.a("\u00f9", (float)f5, (long)90255071001362112L) /* => java.lang.Math.round */, (long)199527982987698177L) /* => java.lang.Math.max */, (int)n2, (long)115429395690603627L) /* => dev.hixo.D.M.U.p */;
    }

    public static void p(class_332 class_3322, int n2, int n3, int n4, int n5, int object, int n6) {
        int n7;
        boolean bl;
        block14: {
            int n8;
            int n9;
            block12: {
                block13: {
                    block11: {
                        block10: {
                            bl = N;
                            n9 = n6;
                            if (!bl) {
                                if (n9 >>> 24 == 0) {
                                    return;
                                }
                                n9 = n4;
                            }
                            if (bl) break block10;
                            if (n9 <= n2) break block11;
                            n9 = n5;
                        }
                        if (bl) break block12;
                        if (n9 > n3) break block13;
                    }
                    return;
                }
                n8 = 0;
                if (bl) break block14;
                n9 = object = (Object)d.a("\u00f9", (int)n8, (int)d.a("\u00f9", (int)object, (int)d.a("\u00f9", (int)((n4 - n2) / 2), (int)((n5 - n3) / 2), (long)62474117164247490L) /* => java.lang.Math.min */, (long)62474117164247490L) /* => java.lang.Math.min */, (long)199527982987698177L) /* => java.lang.Math.max */;
            }
            if (n9 == 0) {
                d.a("$", (Object)class_3322, (int)n2, (int)n3, (int)n4, (int)n5, (int)n6, (long)70222225705551889L) /* => net.minecraft.class_332.method_25294 */;
                return;
            }
            d.a("$", (Object)class_3322, (int)n2, (int)(n3 + object), (int)n4, (int)(n5 - object), (int)n6, (long)70222225705551889L) /* => net.minecraft.class_332.method_25294 */;
            n8 = n7 = 0;
        }
        while (n7 < object) {
            double d2 = (double)(object - n7) - 0.5;
            int n10 = (int)d.a("\u00f9", (double)((double)object - d.a("\u00f9", (double)((double)object * (double)object - d2 * d2), (long)146319326606007315L) /* => java.lang.Math.sqrt */), (long)33411004263283148L) /* => java.lang.Math.round */;
            d.a("$", (Object)class_3322, (int)(n2 + n10), (int)(n3 + n7), (int)(n4 - n10), (int)(n3 + n7 + 1), (int)n6, (long)70222225705551889L) /* => net.minecraft.class_332.method_25294 */;
            d.a("$", (Object)class_3322, (int)(n2 + n10), (int)(n5 - n7 - 1), (int)(n4 - n10), (int)(n5 - n7), (int)n6, (long)70222225705551889L) /* => net.minecraft.class_332.method_25294 */;
            ++n7;
            if (!bl) continue;
        }
    }

    public static void c(class_332 class_3322, float f, float f2, float f3, float f4, int n2) {
        d.a("\u00f9", (Object)class_3322, (float)f, (float)f2, (float)f3, (float)f4, (float)((f4 - f2) / 2.0f), (int)n2, (long)60011677004176817L) /* => dev.hixo.D.M.U.m */;
    }

    public static int w(int n2, float f) {
        CallSite callSite = d.a("\u00f9", (float)0.0f, (float)d.a("\u00f9", (float)1.0f, (float)f, (long)139533018482628456L) /* => java.lang.Math.min */, (long)121565737685922221L) /* => java.lang.Math.max */;
        CallSite callSite2 = d.a("\u00f9", (float)((float)(n2 >>> 24 & 0xFF) * callSite), (long)90255071001362112L) /* => java.lang.Math.round */;
        return n2 & U.a(7906, 4795457981462293423L) | callSite2 << 24;
    }

    public static int s(int n2, int n3, float object) {
        object = d.a("\u00f9", (float)0.0f, (float)d.a("\u00f9", (float)1.0f, (float)object, (long)139533018482628456L) /* => java.lang.Math.min */, (long)121565737685922221L) /* => java.lang.Math.max */;
        int n4 = n2 >>> 24 & 0xFF;
        int n5 = n3 >>> 24 & 0xFF;
        int n6 = n2 >> 16 & 0xFF;
        int n7 = n3 >> 16 & 0xFF;
        int n8 = n2 >> 8 & 0xFF;
        int n9 = n3 >> 8 & 0xFF;
        int n10 = n2 & 0xFF;
        int n11 = n3 & 0xFF;
        return (int)((float)n4 + (float)(n5 - n4) * object) << 24 | (int)((float)n6 + (float)(n7 - n6) * object) << 16 | (int)((float)n8 + (float)(n9 - n8) * object) << 8 | (int)((float)n10 + (float)(n11 - n10) * object);
    }

    public static int g(float f, float f2) {
        CallSite callSite = f > 0.5f ? d.a("\u00f9", (int)U.a(2879, 1410439107566059120L), (int)U.a(428, 4655722231661409506L), (float)((f - 0.5f) * 2.0f), (long)43593853357568520L) /* => dev.hixo.D.M.U.s */ : d.a("\u00f9", (int)U.a(29445, 5697839126762833481L), (int)U.a(17296, 1621562711871289050L), (float)(f * 2.0f), (long)43593853357568520L) /* => dev.hixo.D.M.U.s */;
        return (int)d.a("\u00f9", (int)callSite, (float)f2, (long)83608216081975749L) /* => dev.hixo.D.M.U.w */;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var0 = 8349758017945959876L;
                var6_1 = new long[5];
                var3_2 = 0;
                var4_3 = "\u0018W\u0004\u0001\u008c~\u0099[\r\u00c9\u00ddql\u0000\u0080\u00feQ\u00ec\u0010\u0097\u0001\u00ceQ\u00e7";
                var5_4 = "\u0018W\u0004\u0001\u008c~\u0099[\r\u00c9\u00ddql\u0000\u0080\u00feQ\u00ec\u0010\u0097\u0001\u00ceQ\u00e7".length();
                var2_5 = 0;
                while (true) {
                    var7_6 = var4_3.substring(var2_5, var2_5 += 8).getBytes("ISO-8859-1");
                    v0 = var6_1;
                    v1 = var3_2++;
                    v2 = ((long)var7_6[0] & 255L) << 56 | ((long)var7_6[1] & 255L) << 48 | ((long)var7_6[2] & 255L) << 40 | ((long)var7_6[3] & 255L) << 32 | ((long)var7_6[4] & 255L) << 24 | ((long)var7_6[5] & 255L) << 16 | ((long)var7_6[6] & 255L) << 8 | (long)var7_6[7] & 255L;
                    v3 = -1;
                    break block7;
                    break;
                }
lbl14:
                // 1 sources

                while (true) {
                    v0[v1] = v4;
                    if (var2_5 < var5_4) ** continue;
                    var4_3 = "\u0002_\u0090N\u00dc\u0083\u00a9\u0094NP\u0003e\u00bd\u00d0\u00c8T";
                    var5_4 = "\u0002_\u0090N\u00dc\u0083\u00a9\u0094NP\u0003e\u00bd\u00d0\u00c8T".length();
                    var2_5 = 0;
                    while (true) {
                        var7_6 = var4_3.substring(var2_5, var2_5 += 8).getBytes("ISO-8859-1");
                        v0 = var6_1;
                        v1 = var3_2++;
                        v2 = ((long)var7_6[0] & 255L) << 56 | ((long)var7_6[1] & 255L) << 48 | ((long)var7_6[2] & 255L) << 40 | ((long)var7_6[3] & 255L) << 32 | ((long)var7_6[4] & 255L) << 24 | ((long)var7_6[5] & 255L) << 16 | ((long)var7_6[6] & 255L) << 8 | (long)var7_6[7] & 255L;
                        v3 = 0;
                        break block7;
                        break;
                    }
                    break;
                }
lbl27:
                // 1 sources

                while (true) {
                    v0[v1] = v4;
                    if (var2_5 < var5_4) ** continue;
                    break block8;
                    break;
                }
            }
            v4 = v2 ^ var0;
            switch (v3) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl38:
                // 1 sources

                ** continue;
            }
        }
        U.a = var6_1;
        U.b = new Integer[5];
    }

    private static int a(int n2, long l2) {
        int n3 = n2 ^ (int)(l2 & 0x7FFFL) ^ 0x354E;
        if (b[n3] == null) {
            U.b[n3] = (int)(a[n3] ^ l2);
        }
        return b[n3];
    }
}

