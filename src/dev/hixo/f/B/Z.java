/*
 * RESTORED SOURCE — decompiled reconstruction, not the original files.
 * class: dev.hixo.f.B.Z
 * context strings: 'Off' | 'Strict' | 'Normal' | 'Silent'
 */

/*
 * Decompiled with CFR 0.152.
 */
package dev.hixo.f.B;

import dev.hixo.M.d;

public final class Z
extends Enum<Z> {
    public static final /* enum */ Z Off;
    public static final /* enum */ Z Normal;
    public static final /* enum */ Z Silent;
    public static final /* enum */ Z Strict;
    private static final /* synthetic */ Z[] A;

    public static Z[] values() {
        return (Z[])((Enum)((Object)d.a("\u00fd", (long)46452480096738802L) /* => dev.hixo.f.B.Z.A */)).clone();
    }

    public static Z valueOf(String string) {
        return (Z)((Object)d.a("\u00f9", Z.class, (Object)string, (long)61481714314123346L) /* => java.lang.Enum.valueOf */);
    }

    private static /* synthetic */ Z[] E() {
        return new Z[]{d.a("\u00fd", (long)163565839400272652L) /* => dev.hixo.f.B.Z.Off */, d.a("\u00fd", (long)140877822102124790L) /* => dev.hixo.f.B.Z.Normal */, d.a("\u00fd", (long)65795335008300943L) /* => dev.hixo.f.B.Z.Silent */, d.a("\u00fd", (long)133485953122849979L) /* => dev.hixo.f.B.Z.Strict */};
    }

    /*
     * Unable to fully structure code
     */
    static {
        block19: {
            block18: {
                var0 = new String[4];
                var4_1 = 0;
                var3_2 = ";6C\u0006'$WhD\u0000";
                var5_3 = ";6C\u0006'$WhD\u0000".length();
                var2_4 = 3;
                var1_5 = -1;
lbl7:
                // 2 sources

                while (true) {
                    v0 = ++var1_5;
                    v1 = var3_2.substring(v0, v0 + var2_4);
                    v2 = -1;
                    break block18;
                    break;
                }
lbl12:
                // 1 sources

                while (true) {
                    var0[var4_1++] = v3.intern();
                    if ((var1_5 += var2_4) < var5_3) {
                        var2_4 = var3_2.charAt(var1_5);
                        ** continue;
                    }
                    var3_2 = ":?WlF\u0018\u0006'9IdI\u0000";
                    var5_3 = ":?WlF\u0018\u0006'9IdI\u0000".length();
                    var2_4 = 6;
                    var1_5 = -1;
lbl21:
                    // 2 sources

                    while (true) {
                        v4 = ++var1_5;
                        v1 = var3_2.substring(v4, v4 + var2_4);
                        v2 = 0;
                        break block18;
                        break;
                    }
                    break;
                }
lbl26:
                // 1 sources

                while (true) {
                    var0[var4_1++] = v3.intern();
                    if ((var1_5 += var2_4) < var5_3) {
                        var2_4 = var3_2.charAt(var1_5);
                        ** continue;
                    }
                    break block19;
                    break;
                }
            }
            v5 = v1.toCharArray();
            v6 = v5;
            v7 = v5.length;
            var6_6 = 0;
            if (true) ** GOTO lbl65
            do {
                v6 = v6;
                v8 = var6_6;
                v9 = v6[v8];
                switch (var6_6 % 7) {
                    case 0: {
                        v10 = 116;
                        break;
                    }
                    case 1: {
                        v10 = 80;
                        break;
                    }
                    case 2: {
                        v10 = 37;
                        break;
                    }
                    case 3: {
                        v10 = 1;
                        break;
                    }
                    case 4: {
                        v10 = 39;
                        break;
                    }
                    case 5: {
                        v10 = 116;
                        break;
                    }
                    default: {
                        v10 = 19;
                    }
                }
                v6[v8] = (char)(v9 ^ v10);
                ++var6_6;
lbl65:
                // 2 sources

                v7 = v7;
            } while (v7 > var6_6);
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
        Z.Off = new Z();
        Z.Normal = new Z();
        Z.Silent = new Z();
        Z.Strict = new Z();
        Z.A = d.a("\u00f9", (long)177680359687213606L) /* => dev.hixo.f.B.Z.E */;
    }
}

