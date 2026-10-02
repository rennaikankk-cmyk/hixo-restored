/*
 * RESTORED SOURCE — decompiled reconstruction, not the original files.
 * class: dev.hixo.D.t
 */

/*
 * Decompiled with CFR 0.152.
 */
package dev.hixo.D;

import dev.hixo.D.a;
import dev.hixo.M.G;
import dev.hixo.M.d;
import java.lang.invoke.CallSite;

public class t {
    private static final long W;
    private static final long y;
    public final String U;
    public final int Z;
    public final String N;
    public final boolean F;
    public final long R;
    private static final long[] a;
    private static final Long[] b;

    public t(String string, int n2) {
        this(string, n2, null, true);
    }

    public t(String string, int n2, String string2, boolean bl) {
        this.U = string;
        this.Z = n2;
        this.N = string2;
        this.F = bl;
        boolean bl2 = dev.hixo.D.a.E;
        this.R = (long)d.a("\u00f9", (long)171188797904017458L) /* => java.lang.System.currentTimeMillis */;
        if (bl2) {
            G.L = !G.L;
        }
    }

    public long c() {
        return (long)(d.a("\u00f9", (long)171188797904017458L) /* => java.lang.System.currentTimeMillis */ - d.a("z", (Object)this, (long)63219607679970953L) /* => dev.hixo.D.t.R */);
    }

    public boolean E() {
        boolean bl = dev.hixo.D.a.E;
        reference cfr_temp_0 = d.a("$", (Object)this, (long)90363587549350324L) /* => dev.hixo.D.t.c */ - t.a(8505, 2748095168539557591L);
        Object object = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 < 0 ? -1 : 1);
        if (!bl) {
            object = object > 0 ? (Object)true : (Object)false;
        }
        return (boolean)object;
    }

    public float k() {
        CallSite callSite = d.a("$", (Object)this, (long)90363587549350324L) /* => dev.hixo.D.t.c */;
        boolean bl = dev.hixo.D.a.E;
        CallSite callSite2 = callSite;
        long l2 = t.a(23252, 2098935006662264121L);
        if (!bl) {
            if (callSite2 < l2) {
                return (float)callSite / 200.0f;
            }
            callSite2 = callSite;
            l2 = t.a(10339, 8177410394169440143L);
        }
        if (callSite2 > l2) {
            return (float)d.a("\u00f9", (float)0.0f, (float)((float)(t.a(18581, 4814773140901205882L) - callSite) / 200.0f), (long)121565737685922221L) /* => java.lang.Math.max */;
        }
        if (G.L) {
            dev.hixo.D.a.E = !bl;
        }
        return 1.0f;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block8: {
            block7: {
                var0 = 1852507197234815462L;
                var6_1 = new long[6];
                var3_2 = 0;
                var4_3 = "?\u0096\\\u0085\u00f2\u00cdT\u0089[d\u00ef\u00d2j\u008b=$h\u00ce\u0092\u0016d\u0007\\\u0099\u0004\u0095\u0087?\u008d\u00b5\u00a4\u0017";
                var5_4 = "?\u0096\\\u0085\u00f2\u00cdT\u0089[d\u00ef\u00d2j\u008b=$h\u00ce\u0092\u0016d\u0007\\\u0099\u0004\u0095\u0087?\u008d\u00b5\u00a4\u0017".length();
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
                    var4_3 = "\rk\u00c1\f\u008a\u0005w\u008b\n\u0005*\u00b7 \u00c9@[";
                    var5_4 = "\rk\u00c1\f\u008a\u0005w\u008b\n\u0005*\u00b7 \u00c9@[".length();
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
        t.a = var6_1;
        t.b = new Long[6];
        t.W = t.a(575, 1503828955122916821L);
        t.y = t.a(16030, 1418712825123070325L);
    }

    private static long a(int n2, long l2) {
        int n3 = (n2 ^ (int)l2 ^ 0x5FEE) & Short.MAX_VALUE;
        if (b[n3] == null) {
            t.b[n3] = a[n3] ^ l2;
        }
        return b[n3];
    }
}

