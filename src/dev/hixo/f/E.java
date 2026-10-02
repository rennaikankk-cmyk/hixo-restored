/*
 * RESTORED SOURCE — decompiled reconstruction, not the original files.
 * class: dev.hixo.f.E
 */

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_310
 */
package dev.hixo.f;

import dev.hixo.M.d;
import java.lang.invoke.CallSite;
import net.minecraft.class_310;

public class E {
    private static final class_310 l;
    public static int J;
    private static final String a;

    public static void o(String string) {
        block3: {
            CallSite callSite;
            block2: {
                int n2 = J;
                callSite = d.a("\u00fd", (long)94750949081696178L) /* => dev.hixo.f.E.l */;
                if (n2 != 0) break block2;
                if (d.a("z", (Object)callSite, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */ == null) break block3;
                callSite = d.a("\u00fd", (long)94750949081696178L) /* => dev.hixo.f.E.l */;
            }
            d.a("$", (Object)d.a("z", (Object)callSite, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (Object)d.a("\u00f9", (Object)d.a("$", (Object)d.a("$", (Object)d.a("$", (Object)new StringBuilder(), (Object)a, (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (Object)string, (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (long)59411206276622891L) /* => java.lang.StringBuilder.toString */, (long)42607881705406997L) /* => net.minecraft.class_2561.method_43470 */, (boolean)false, (long)101990227485629672L) /* => net.minecraft.class_746.method_7353 */;
        }
    }

    /*
     * Handled impossible loop by duplicating code
     * Enabled aggressive block sorting
     */
    static {
        char[] cArray;
        block11: {
            int n2;
            int n3;
            block10: {
                char[] cArray2 = "N;\u0011J+\bc".toCharArray();
                cArray = cArray2;
                n3 = cArray2.length;
                n2 = 0;
                if (!true) break block10;
                n3 = n3;
                if (n3 <= n2) break block11;
            }
            do {
                cArray = cArray;
                int n4 = n2;
                char c2 = cArray[n4];
                cArray[n4] = (char)(c2 ^ (switch (n2 % 7) {
                    case 0 -> 21;
                    case 1 -> 115;
                    case 2 -> 120;
                    case 3 -> 50;
                    case 4 -> 68;
                    case 5 -> 85;
                    default -> 67;
                }));
                ++n2;
                n3 = n3;
            } while (n3 > n2);
        }
        a = new String(cArray).intern();
        l = d.a("\u00f9", (long)179869930689441125L) /* => net.minecraft.class_310.method_1551 */;
    }
}

