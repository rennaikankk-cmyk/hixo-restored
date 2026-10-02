/*
 * RESTORED SOURCE — decompiled reconstruction, not the original files.
 * class: dev.hixo.M.s.Y.e
 * identified as: NoSwing
 * context strings: 'Cancel Packets' | 'Hide Visual' | '防砍动画：隐藏攻击挥手动画（1.8.9 NoSwing 等效）' | 'NoSwing'
 */

/*
 * Decompiled with CFR 0.152.
 */
package dev.hixo.M.s.Y;

import dev.hixo.M.G;
import dev.hixo.M.K;
import dev.hixo.M.d;
import dev.hixo.b.g;

public class e
extends G {
    public static e x;
    public final g B;
    public final g r;
    public static int G;
    private static final String[] c;

    public e() {
        String[] stringArray = c;
        super((K)((Object)d.a("\u00fd", (long)121611970599608920L) /* => dev.hixo.M.K.PLAYER */), stringArray[3], stringArray[2]);
        this.B = new g(stringArray[0], true);
        int n2 = G;
        this.r = new g(stringArray[1], false);
        d.a("\u00c1", (e)this, (long)55074934605809673L) /* => dev.hixo.M.s.Y.e.x */;
        d.a("$", (Object)this, (int)0, (long)113806433936288059L) /* => dev.hixo.M.G.z */;
        if (n2 != 0) {
            dev.hixo.M.G.L = !dev.hixo.M.G.L;
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block19: {
            block18: {
                var5 = new String[4];
                var3_1 = 0;
                var2_2 = "v\u001cJ\u0016:@ve\u001cG\u001e:X%\u000b}\u0014@\u0010\u007fz?F\bE\u0019";
                var4_3 = "v\u001cJ\u0016:@ve\u001cG\u001e:X%\u000b}\u0014@\u0010\u007fz?F\bE\u0019".length();
                var1_4 = 14;
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
                    var2_2 = "\u9607\u7870\u528c\u754e\uff45\u96bc\u8599\u650e\u5186\u6301\u623e\u52f7\u7517\uff5e\u0004S\u001c[f\f\u0018Z.S\u001c1Kv\u7b7c\u6535\uff2d\u0007{\u0012w\u00026B1";
                    var4_3 = "\u9607\u7870\u528c\u754e\uff45\u96bc\u8599\u650e\u5186\u6301\u623e\u52f7\u7517\uff5e\u0004S\u001c[f\f\u0018Z.S\u001c1Kv\u7b7c\u6535\uff2d\u0007{\u0012w\u00026B1".length();
                    var1_4 = 31;
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
                        v10 = 53;
                        break;
                    }
                    case 1: {
                        v10 = 125;
                        break;
                    }
                    case 2: {
                        v10 = 36;
                        break;
                    }
                    case 3: {
                        v10 = 117;
                        break;
                    }
                    case 4: {
                        v10 = 95;
                        break;
                    }
                    case 5: {
                        v10 = 44;
                        break;
                    }
                    default: {
                        v10 = 86;
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
        e.c = var5;
    }
}

