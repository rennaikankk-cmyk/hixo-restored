/*
 * RESTORED SOURCE — decompiled reconstruction, not the original files.
 * class: dev.hixo.T.S
 * context strings: 'POST' | 'PRE'
 */

/*
 * Decompiled with CFR 0.152.
 */
package dev.hixo.T;

import dev.hixo.M.d;

public final class S
extends Enum<S> {
    public static final /* enum */ S PRE;
    public static final /* enum */ S POST;
    private static final /* synthetic */ S[] O;
    public static int G;

    public static S[] values() {
        return (S[])((Enum)((Object)d.a("\u00fd", (long)90338474601783760L) /* => dev.hixo.T.S.O */)).clone();
    }

    public static S valueOf(String string) {
        return (S)((Object)d.a("\u00f9", S.class, (Object)string, (long)61481714314123346L) /* => java.lang.Enum.valueOf */);
    }

    private static /* synthetic */ S[] W() {
        return new S[]{d.a("\u00fd", (long)199476637466971905L) /* => dev.hixo.T.S.PRE */, d.a("\u00fd", (long)39527997715613417L) /* => dev.hixo.T.S.POST */};
    }

    /*
     * Unable to fully structure code
     */
    static {
        block12: {
            var0 = new String[2];
            var4_1 = 0;
            var3_2 = "\u000f%fe\u0003\u000f8p";
            var5_3 = "\u000f%fe\u0003\u000f8p".length();
            var2_4 = 4;
            var1_5 = -1;
lbl7:
            // 2 sources

            while (true) {
                continue;
                break;
            }
lbl9:
            // 1 sources

            while (true) {
                var0[var4_1++] = new String(v0).intern();
                if ((var1_5 += var2_4) < var5_3) {
                    var2_4 = var3_2.charAt(var1_5);
                    ** continue;
                }
                break block12;
                break;
            }
            v1 = ++var1_5;
            v2 = var3_2.substring(v1, v1 + var2_4).toCharArray();
            v0 = v2;
            v3 = v2.length;
            var6_6 = 0;
            if (true) ** GOTO lbl48
            do {
                v0 = v0;
                v4 = var6_6;
                v5 = v0[v4];
                switch (var6_6 % 7) {
                    case 0: {
                        v6 = 95;
                        break;
                    }
                    case 1: {
                        v6 = 106;
                        break;
                    }
                    case 2: {
                        v6 = 53;
                        break;
                    }
                    case 3: {
                        v6 = 49;
                        break;
                    }
                    case 4: {
                        v6 = 41;
                        break;
                    }
                    case 5: {
                        v6 = 115;
                        break;
                    }
                    default: {
                        v6 = 23;
                    }
                }
                v0[v4] = (char)(v5 ^ v6);
                ++var6_6;
lbl48:
                // 2 sources

                v3 = v3;
            } while (v3 > var6_6);
            ** while (true)
        }
        S.PRE = new S();
        S.POST = new S();
        S.O = d.a("\u00f9", (long)35615391989220501L) /* => dev.hixo.T.S.W */;
    }
}

