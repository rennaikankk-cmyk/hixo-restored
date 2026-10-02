/*
 * RESTORED SOURCE — decompiled reconstruction, not the original files.
 * class: dev.hixo.f.a.q
 */

/*
 * Decompiled with CFR 0.152.
 */
package dev.hixo.f.a;

import dev.hixo.M.G;
import dev.hixo.M.d;
import java.util.Random;

public class q {
    private static final Random y = new Random();
    public static boolean q;

    public static double t(double d2, double d3) {
        boolean bl = q;
        double d4 = d2 + (d3 - d2) * d.a("$", (Object)d.a("\u00fd", (long)64167126482250789L) /* => dev.hixo.f.a.q.y */, (long)58379670121163820L) /* => java.util.Random.nextDouble */;
        if (G.L) {
            q = !bl;
        }
        return d4;
    }

    public static float v(float f, float f2) {
        boolean bl = q;
        float f3 = f + (f2 - f) * d.a("$", (Object)d.a("\u00fd", (long)64167126482250789L) /* => dev.hixo.f.a.q.y */, (long)171017999122652309L) /* => java.util.Random.nextFloat */;
        if (bl) {
            G.L = !G.L;
        }
        return f3;
    }
}

