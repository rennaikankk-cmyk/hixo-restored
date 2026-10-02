/*
 * RESTORED SOURCE — decompiled reconstruction, not the original files.
 * class: dev.hixo.B.V
 * context strings: 'Index '
 * decrypted string pool:
 *   a[0] = Index 
 *   a[1] =  is not defined in the local list
 */

/*
 * Decompiled with CFR 0.152.
 */
package dev.hixo.B;

import dev.hixo.B.D;
import dev.hixo.B.Y;
import dev.hixo.M.G;
import dev.hixo.M.d;
import java.lang.invoke.CallSite;
import java.util.HashMap;
import java.util.Map;

public final class V
implements Y {
    private final Map<Integer, Object> R = new HashMap<Integer, Object>();
    private static final String[] a;

    private V() {
    }

    public static V d() {
        return new V();
    }

    @Override
    public Object S(int n2) {
        CallSite callSite;
        int n3;
        block7: {
            block8: {
                n3 = D.U;
                callSite = d.a("z", (Object)this, (long)97299302965264510L) /* => dev.hixo.B.V.R */;
                if (n3 != 0) break block7;
                if (d.a("$", (Object)callSite, (Object)d.a("\u00f9", (int)n2, (long)67104637941965968L) /* => java.lang.Integer.valueOf */, (long)35001487691355426L) /* => java.util.Map.containsKey */ != false) break block8;
                throw new IllegalArgumentException((String)((Object)d.a("$", (Object)d.a("$", (Object)d.a("$", (Object)d.a("$", (Object)new StringBuilder(), (Object)a[0], (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (int)n2, (long)32515713483113022L) /* => java.lang.StringBuilder.append */, (Object)a[1], (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (long)59411206276622891L) /* => java.lang.StringBuilder.toString */));
            }
            callSite = d.a("$", (Object)d.a("z", (Object)this, (long)97299302965264510L) /* => dev.hixo.B.V.R */, (Object)d.a("\u00f9", (int)n2, (long)67104637941965968L) /* => java.lang.Integer.valueOf */, (long)150360683669181890L) /* => java.util.Map.get */;
        }
        if (G.L) {
            D.U = ++n3;
        }
        return callSite;
    }

    public V V(int n2, Object object) {
        d.a("$", (Object)d.a("z", (Object)this, (long)97299302965264510L) /* => dev.hixo.B.V.R */, (Object)d.a("\u00f9", (int)n2, (long)67104637941965968L) /* => java.lang.Integer.valueOf */, (Object)object, (long)87609561069083692L) /* => java.util.Map.put */;
        return this;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block12: {
            var5 = new String[2];
            var3_1 = 0;
            var2_2 = "tl\u0001\u0002o>!\u001dk\u0016Gyq@\u001df\u0000\u0001~pQY\"\f\t7j\\X\"\t\bt\u007fX\u001dn\f\u0014c";
            var4_3 = "tl\u0001\u0002o>!\u001dk\u0016Gyq@\u001df\u0000\u0001~pQY\"\f\t7j\\X\"\t\bt\u007fX\u001dn\f\u0014c".length();
            var1_4 = 6;
            var0_5 = -1;
lbl7:
            // 2 sources

            while (true) {
                continue;
                break;
            }
lbl9:
            // 1 sources

            while (true) {
                var5[var3_1++] = new String(v0).intern();
                if ((var0_5 += var1_4) < var4_3) {
                    var1_4 = var2_2.charAt(var0_5);
                    ** continue;
                }
                break block12;
                break;
            }
            v1 = ++var0_5;
            v2 = var2_2.substring(v1, v1 + var1_4).toCharArray();
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
                        v6 = 61;
                        break;
                    }
                    case 1: {
                        v6 = 2;
                        break;
                    }
                    case 2: {
                        v6 = 101;
                        break;
                    }
                    case 3: {
                        v6 = 103;
                        break;
                    }
                    case 4: {
                        v6 = 23;
                        break;
                    }
                    case 5: {
                        v6 = 30;
                        break;
                    }
                    default: {
                        v6 = 52;
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
        V.a = var5;
    }
}

