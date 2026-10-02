/*
 * RESTORED SOURCE — decompiled reconstruction, not the original files.
 * class: dev.hixo.f.P.O
 */

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1792
 *  net.minecraft.class_1799
 */
package dev.hixo.f.P;

import dev.hixo.M.d;
import dev.hixo.f.P.h;
import net.minecraft.class_1792;
import net.minecraft.class_1799;

public class O {
    public static final int M;

    public static boolean q(class_1792 class_17922) {
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean n(class_1799 class_17992) {
        int n2 = h.F;
        class_1799 class_17993 = class_17992;
        if (n2 == 0) {
            if (class_17993 == null) return false;
            class_17993 = class_17992;
        }
        Object object = d.a("$", (Object)class_17993, (long)170246929245689750L) /* => net.minecraft.class_1799.method_7960 */;
        if (n2 != 0) return object;
        if (object) return false;
        return 1;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 7584226647685117504L;
        long l3 = 0x73639346FF52B668L ^ l2;
        M = (int)l3;
    }
}

