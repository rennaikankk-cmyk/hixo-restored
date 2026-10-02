/*
 * RESTORED SOURCE — decompiled reconstruction, not the original files.
 * class: dev.hixo.M.s.A.l
 * identified as: ClickGui
 * context strings: 'Hidden Categories' | 'Flat Panels' | '内置 ClickGUI 的风格设置' | 'Style'
 */

/*
 * Decompiled with CFR 0.152.
 */
package dev.hixo.M.s.A;

import dev.hixo.M.G;
import dev.hixo.M.K;
import dev.hixo.M.d;
import dev.hixo.b.C;
import dev.hixo.b.M;
import dev.hixo.b.g;
import dev.hixo.b.s;
import java.util.List;

public class l
extends G {
    public static l r;
    public final s t;
    public final g k;
    public final C g;
    public final g u;
    public final M n;
    public final M E;
    public static boolean f;
    private static final String[] c;

    public l() {
        String[] stringArray = c;
        super((K)((Object)d.a("\u00fd", (long)192242340975787132L) /* => dev.hixo.M.K.CLIENT */), stringArray[6], stringArray[2]);
        this.t = new s(stringArray[3], stringArray[8], stringArray[4]);
        this.k = new g(stringArray[1], true);
        this.g = d.a("\u00f9", stringArray[0], (Object)((List)((Object)d.a("$", (Object)d.a("$", (Object)d.a("\u00f9", (Object)d.a("\u00f9", (long)117546078189364258L) /* => dev.hixo.M.K.values */, (long)132832282728055309L) /* => java.util.Arrays.stream */, K::l, (long)109148098324279153L) /* => java.util.stream.Stream.map */, (Object)d.a("\u00f9", (long)123252391519380206L) /* => java.util.stream.Collectors.toList */, (long)132097220901184243L) /* => java.util.stream.Stream.collect */)), (long)191025601808930253L) /* => dev.hixo.b.C.G */;
        this.u = new g(stringArray[5], false);
        boolean bl = f;
        this.n = new M(stringArray[9], 64.0, 24.0, 160.0, 4.0);
        this.E = new M(stringArray[7], 40.0, 0.0, 200.0, 4.0);
        d.a("$", (Object)this, (int)0, (long)113806433936288059L) /* => dev.hixo.M.G.z */;
        d.a("\u00c1", (l)this, (long)75894116861205869L) /* => dev.hixo.M.s.A.l.r */;
        if (bl) {
            G.L = !G.L;
        }
    }

    public String e() {
        return c[4];
    }

    public boolean Z() {
        return false;
    }

    public boolean W(K k2) {
        return (boolean)d.a("$", (Object)d.a("z", (Object)this, (long)185220872024158273L) /* => dev.hixo.M.s.A.l.g */, (Object)d.a("$", (Object)((Object)k2), (long)75959788416907125L) /* => dev.hixo.M.K.l */, (long)160647062577305305L) /* => dev.hixo.b.C.P */;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block19: {
            block18: {
                var5 = new String[10];
                var3_1 = 0;
                var2_2 = "&B\u001eplVq-J\u000eqnW#\u0007N\t\u000b(G\u001b`)h0\u0000N\u0016g\u0011\u51eb\u7f45ZWeQ2\u0005l/])\u76bc\u989f\u6852\u8b95\u7f14\u0005=_\u0003xl\u0005 J\fqg\u0007=_\u0013wb]#\b-G\u0013wb\u007f$\u0007\u000e=_\u0013wb]#Nf\u001bfnQ?";
                var4_3 = "&B\u001eplVq-J\u000eqnW#\u0007N\t\u000b(G\u001b`)h0\u0000N\u0016g\u0011\u51eb\u7f45ZWeQ2\u0005l/])\u76bc\u989f\u6852\u8b95\u7f14\u0005=_\u0003xl\u0005 J\fqg\u0007=_\u0013wb]#\b-G\u0013wb\u007f$\u0007\u000e=_\u0013wb]#Nf\u001bfnQ?".length();
                var1_4 = 17;
                var0_5 = -1;
lbl7:
                // 2 sources

                while (true) {
                    v0 = ++var0_5;
                    v1 = var2_2.substring(v0, v0 + var1_4);
                    v2 = -1;
                    break block18;
                    break;
                }
lbl12:
                // 1 sources

                while (true) {
                    var5[var3_1++] = v3.intern();
                    if ((var0_5 += var1_4) < var4_3) {
                        var1_4 = var2_2.charAt(var0_5);
                        ** continue;
                    }
                    var2_2 = " J\fqg\f=_\u0013wb]#Nx\u0013nl";
                    var4_3 = " J\fqg\f=_\u0013wb]#Nx\u0013nl".length();
                    var1_4 = 5;
                    var0_5 = -1;
lbl21:
                    // 2 sources

                    while (true) {
                        v4 = ++var0_5;
                        v1 = var2_2.substring(v4, v4 + var1_4);
                        v2 = 0;
                        break block18;
                        break;
                    }
                    break;
                }
lbl26:
                // 1 sources

                while (true) {
                    var5[var3_1++] = v3.intern();
                    if ((var0_5 += var1_4) < var4_3) {
                        var1_4 = var2_2.charAt(var0_5);
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
                        v10 = 110;
                        break;
                    }
                    case 1: {
                        v10 = 43;
                        break;
                    }
                    case 2: {
                        v10 = 122;
                        break;
                    }
                    case 3: {
                        v10 = 20;
                        break;
                    }
                    case 4: {
                        v10 = 9;
                        break;
                    }
                    case 5: {
                        v10 = 56;
                        break;
                    }
                    default: {
                        v10 = 81;
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
        l.c = var5;
    }
}

