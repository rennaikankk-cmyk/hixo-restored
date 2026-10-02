/*
 * RESTORED SOURCE — decompiled reconstruction, not the original files.
 * class: dev.hixo.f.z
 */

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  net.minecraft.class_2338
 *  net.minecraft.class_2350
 */
package dev.hixo.f;

import dev.hixo.M.G;
import dev.hixo.M.d;
import dev.hixo.f.E;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import net.minecraft.class_2338;
import net.minecraft.class_2350;

public final class z
extends Record {
    private final class_2338 t;
    private final class_2350 j;

    public z(class_2338 class_23382, class_2350 class_23502) {
        this.t = class_23382;
        int n2 = E.J;
        this.j = class_23502;
        if (n2 != 0) {
            G.L = !G.L;
        }
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{z.class, "t;j", "t", "j"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{z.class, "t;j", "t", "j"}, this);
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{z.class, "t;j", "t", "j"}, this, object);
    }

    public class_2338 T() {
        return d.a("z", (Object)((Object)this), (long)167639256802159498L) /* => dev.hixo.f.z.t */;
    }

    public class_2350 j() {
        return d.a("z", (Object)((Object)this), (long)59782816657647564L) /* => dev.hixo.f.z.j */;
    }
}

