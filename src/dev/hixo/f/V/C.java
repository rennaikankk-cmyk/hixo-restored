/*
 * RESTORED SOURCE — decompiled reconstruction, not the original files.
 * class: dev.hixo.f.V.C
 */

/*
 * Decompiled with CFR 0.152.
 */
package dev.hixo.f.V;

import dev.hixo.M.G;
import dev.hixo.M.d;

public class C {
    public float l;
    public float r;
    public static int G;

    public C(float f, float f2) {
        d.a("\u00e7", (Object)this, (float)f, (long)164061588253527562L) /* => dev.hixo.f.V.C.l */;
        d.a("\u00e7", (Object)this, (float)f2, (long)200440889690670743L) /* => dev.hixo.f.V.C.r */;
        int n2 = G;
        if (dev.hixo.M.G.L) {
            G = ++n2;
        }
    }

    public float F() {
        return (float)d.a("z", (Object)this, (long)164061588253527562L) /* => dev.hixo.f.V.C.l */;
    }

    public float H() {
        return (float)d.a("z", (Object)this, (long)200440889690670743L) /* => dev.hixo.f.V.C.r */;
    }

    public void k(float f) {
        d.a("\u00e7", (Object)this, (float)f, (long)164061588253527562L) /* => dev.hixo.f.V.C.l */;
    }

    public void q(float f) {
        d.a("\u00e7", (Object)this, (float)f, (long)200440889690670743L) /* => dev.hixo.f.V.C.r */;
    }

    public C b(float f) {
        float f2 = f * 0.6f + 0.2f;
        float f3 = f2 * f2 * f2 * 1.2f;
        int n2 = G;
        C c2 = this;
        d.a("\u00e7", (Object)c2, (float)(d.a("z", (Object)c2, (long)164061588253527562L) /* => dev.hixo.f.V.C.l */ - d.a("z", (Object)this, (long)164061588253527562L) /* => dev.hixo.f.V.C.l */ % f3), (long)164061588253527562L) /* => dev.hixo.f.V.C.l */;
        C c3 = this;
        d.a("\u00e7", (Object)c3, (float)(d.a("z", (Object)c3, (long)200440889690670743L) /* => dev.hixo.f.V.C.r */ - d.a("z", (Object)this, (long)200440889690670743L) /* => dev.hixo.f.V.C.r */ % f3), (long)200440889690670743L) /* => dev.hixo.f.V.C.r */;
        d.a("\u00e7", (Object)this, (float)d.a("\u00f9", (float)d.a("z", (Object)this, (long)200440889690670743L) /* => dev.hixo.f.V.C.r */, (float)-90.0f, (float)90.0f, (long)106481879684650277L) /* => net.minecraft.class_3532.method_15363 */, (long)200440889690670743L) /* => dev.hixo.f.V.C.r */;
        if (n2 != 0) {
            dev.hixo.M.G.L = !dev.hixo.M.G.L;
        }
        return this;
    }
}

