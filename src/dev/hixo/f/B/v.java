/*
 * RESTORED SOURCE — decompiled reconstruction, not the original files.
 * class: dev.hixo.f.B.v
 * context strings: 'Low' | 'Highest' | 'Lowest' | 'Normal'
 */

/*
 * Decompiled with CFR 0.152.
 */
package dev.hixo.f.B;

import dev.hixo.M.d;

public final class v
extends Enum<v> {
    public static final /* enum */ v Lowest;
    public static final /* enum */ v Lower;
    public static final /* enum */ v Low;
    public static final /* enum */ v Normal;
    public static final /* enum */ v High;
    public static final /* enum */ v Higher;
    public static final /* enum */ v Highest;
    private final int E;
    private static final /* synthetic */ v[] X;

    public static v[] values() {
        return (v[])((Enum)((Object)d.a("\u00fd", (long)98026076000976379L) /* => dev.hixo.f.B.v.X */)).clone();
    }

    public static v valueOf(String string) {
        return (v)((Object)d.a("\u00f9", v.class, (Object)string, (long)61481714314123346L) /* => java.lang.Enum.valueOf */);
    }

    private v(int n3) {
        this.E = n3;
    }

    public int l() {
        return (int)d.a("z", (Object)((Object)this), (long)148568493553642960L) /* => dev.hixo.f.B.v.E */;
    }

    private static /* synthetic */ v[] q() {
        return new v[]{d.a("\u00fd", (long)184292525727694267L) /* => dev.hixo.f.B.v.Lowest */, d.a("\u00fd", (long)68699440481168515L) /* => dev.hixo.f.B.v.Lower */, d.a("\u00fd", (long)65414556463188948L) /* => dev.hixo.f.B.v.Low */, d.a("\u00fd", (long)83236406400764799L) /* => dev.hixo.f.B.v.Normal */, d.a("\u00fd", (long)90054519127556939L) /* => dev.hixo.f.B.v.High */, d.a("\u00fd", (long)51749594565905539L) /* => dev.hixo.f.B.v.Higher */, d.a("\u00fd", (long)109385880566419482L) /* => dev.hixo.f.B.v.Highest */};
    }

    /*
     * Unable to fully structure code
     */
    static {
        block19: {
            block18: {
                var0 = new String[7];
                var4_1 = 0;
                var3_2 = "_:s\u0007[<cur\u001d3\u0006_:sxd\u001a\u0006]:vpv\u0002\u0005_:sxe";
                var5_3 = "_:s\u0007[<cur\u001d3\u0006_:sxd\u001a\u0006]:vpv\u0002\u0005_:sxe".length();
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
                    var3_2 = "[<cu\u0006[<cur\u001c";
                    var5_3 = "[<cu\u0006[<cur\u001c".length();
                    var2_4 = 4;
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
                        v10 = 19;
                        break;
                    }
                    case 1: {
                        v10 = 85;
                        break;
                    }
                    case 2: {
                        v10 = 4;
                        break;
                    }
                    case 3: {
                        v10 = 29;
                        break;
                    }
                    case 4: {
                        v10 = 23;
                        break;
                    }
                    case 5: {
                        v10 = 110;
                        break;
                    }
                    default: {
                        v10 = 71;
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
        v.Lowest = new v(-100);
        v.Lower = new v(-50);
        v.Low = new v(-10);
        v.Normal = new v(0);
        v.High = new v(10);
        v.Higher = new v(50);
        v.Highest = new v(100);
        v.X = d.a("\u00f9", (long)94104578460673634L) /* => dev.hixo.f.B.v.q */;
    }
}

