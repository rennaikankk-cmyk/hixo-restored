/*
 * RESTORED SOURCE — decompiled reconstruction, not the original files.
 * class: dev.hixo.M.K
 * context strings: 'CLIENT' | 'MOVEMENT' | 'Movement' | 'World'
 */

/*
 * Decompiled with CFR 0.152.
 */
package dev.hixo.M;

import dev.hixo.M.d;

public final class K
extends Enum<K> {
    public static final /* enum */ K COMBAT;
    public static final /* enum */ K MOVEMENT;
    public static final /* enum */ K PLAYER;
    public static final /* enum */ K RENDER;
    public static final /* enum */ K WORLD;
    public static final /* enum */ K MISC;
    public static final /* enum */ K CLIENT;
    private final String Z;
    private static final /* synthetic */ K[] e;
    public static int W;

    public static K[] values() {
        return (K[])((Enum)((Object)d.a("\u00fd", (long)156441859866009773L) /* => dev.hixo.M.K.e */)).clone();
    }

    public static K valueOf(String string) {
        return (K)((Object)d.a("\u00f9", K.class, (Object)string, (long)61481714314123346L) /* => java.lang.Enum.valueOf */);
    }

    private K(String string2) {
        this.Z = string2;
    }

    public String l() {
        return d.a("z", (Object)((Object)this), (long)53365400742783618L) /* => dev.hixo.M.K.Z */;
    }

    private static /* synthetic */ K[] Z() {
        return new K[]{d.a("\u00fd", (long)169407094224467032L) /* => dev.hixo.M.K.COMBAT */, d.a("\u00fd", (long)72885841312652165L) /* => dev.hixo.M.K.MOVEMENT */, d.a("\u00fd", (long)121611970599608920L) /* => dev.hixo.M.K.PLAYER */, d.a("\u00fd", (long)63693867768511465L) /* => dev.hixo.M.K.RENDER */, d.a("\u00fd", (long)42780286670305511L) /* => dev.hixo.M.K.WORLD */, d.a("\u00fd", (long)113909078088013201L) /* => dev.hixo.M.K.MISC */, d.a("\u00fd", (long)192242340975787132L) /* => dev.hixo.M.K.CLIENT */};
    }

    /*
     * Unable to fully structure code
     */
    static {
        block19: {
            block18: {
                var0 = new String[14];
                var4_1 = 0;
                var3_2 = "S>y\f7E\b]=f\f4T\\D\b]\u001dF,\u0014t|d\u0005G\u001dB%\u001d\u0006B\u0017^-\u001cc\u0004];c\n\u0006S\u001eY,\u0017e\u0006S=}\u000b8E\u0006S\u001d]+\u0018e\u0006@>q\u0010<C\u0006B7~\r<C\u0005G=b\u0005=";
                var5_3 = "S>y\f7E\b]=f\f4T\\D\b]\u001dF,\u0014t|d\u0005G\u001dB%\u001d\u0006B\u0017^-\u001cc\u0004];c\n\u0006S\u001eY,\u0017e\u0006S=}\u000b8E\u0006S\u001d]+\u0018e\u0006@>q\u0010<C\u0006B7~\r<C\u0005G=b\u0005=".length();
                var2_4 = 6;
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
                    var3_2 = "@\u001eQ0\u001cc\u0004]\u001bC*";
                    var5_3 = "@\u001eQ0\u001cc\u0004]\u001bC*".length();
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
                        v10 = 16;
                        break;
                    }
                    case 1: {
                        v10 = 114;
                        break;
                    }
                    case 2: {
                        v10 = 48;
                        break;
                    }
                    case 3: {
                        v10 = 73;
                        break;
                    }
                    case 4: {
                        v10 = 121;
                        break;
                    }
                    case 5: {
                        v10 = 17;
                        break;
                    }
                    default: {
                        v10 = 18;
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
        K.COMBAT = new K(var0[8]);
        K.MOVEMENT = new K(var0[2]);
        K.PLAYER = new K(var0[12]);
        K.RENDER = new K(var0[4]);
        K.WORLD = new K(var0[3]);
        K.MISC = new K(var0[13]);
        K.CLIENT = new K(var0[6]);
        K.e = d.a("\u00f9", (long)132594472417172765L) /* => dev.hixo.M.K.Z */;
    }
}

