/*
 * RESTORED SOURCE — decompiled reconstruction, not the original files.
 * class: dev.hixo.D.M.Q
 */

/*
 * Decompiled with CFR 0.152.
 */
package dev.hixo.D.M;

import dev.hixo.D.M.U;
import dev.hixo.M.G;
import dev.hixo.M.d;
import java.lang.invoke.CallSite;

public final class Q {
    private long H;
    private final long K;
    private float E;
    private float A;
    private float h;

    public Q(float f, long l2) {
        this.K = l2;
        d.a("\u00e7", (Object)this, (float)f, (long)146441846604118896L) /* => dev.hixo.D.M.Q.h */;
        d.a("\u00e7", (Object)this, (float)f, (long)138821275966380697L) /* => dev.hixo.D.M.Q.E */;
        d.a("\u00e7", (Object)this, (float)f, (long)158610601283621063L) /* => dev.hixo.D.M.Q.A */;
        d.a("\u00e7", (Object)this, (long)d.a("\u00f9", (long)171188797904017458L) /* => java.lang.System.currentTimeMillis */, (long)144479521044875126L) /* => dev.hixo.D.M.Q.H */;
    }

    public void P(float f) {
        reference v1;
        boolean bl;
        block8: {
            CallSite callSite;
            block9: {
                block7: {
                    reference v0;
                    block6: {
                        callSite = d.a("\u00f9", (long)171188797904017458L) /* => java.lang.System.currentTimeMillis */;
                        bl = U.N;
                        reference v0 = d.a("z", (Object)this, (long)158610601283621063L) /* => dev.hixo.D.M.Q.A */ - f;
                        v0 = v0 == 0 ? 0 : (v0 > 0 ? 1 : -1);
                        if (!bl) {
                            if (v0 != false) {
                                d.a("\u00e7", (Object)this, (float)f, (long)158610601283621063L) /* => dev.hixo.D.M.Q.A */;
                                d.a("\u00e7", (Object)this, (float)d.a("z", (Object)this, (long)146441846604118896L) /* => dev.hixo.D.M.Q.h */, (long)138821275966380697L) /* => dev.hixo.D.M.Q.E */;
                                d.a("\u00e7", (Object)this, (long)callSite, (long)144479521044875126L) /* => dev.hixo.D.M.Q.H */;
                                return;
                            }
                            reference v0 = callSite - d.a("z", (Object)this, (long)36412362274681232L) /* => dev.hixo.D.M.Q.K */ - d.a("z", (Object)this, (long)144479521044875126L) /* => dev.hixo.D.M.Q.H */;
                            v0 = v0 == 0 ? 0 : (v0 < 0 ? -1 : 1);
                        }
                        if (bl) break block6;
                        if (v0 > 0) break block7;
                        v1 = d.a("z", (Object)this, (long)146441846604118896L) /* => dev.hixo.D.M.Q.h */;
                        if (bl) break block8;
                        reference v0 = v1 - f;
                        v0 = v0 == 0 ? 0 : (v0 > 0 ? 1 : -1);
                    }
                    if (v0 != false) break block9;
                }
                d.a("\u00e7", (Object)this, (float)f, (long)146441846604118896L) /* => dev.hixo.D.M.Q.h */;
                return;
            }
            v1 = (reference)((float)(callSite - d.a("z", (Object)this, (long)144479521044875126L) /* => dev.hixo.D.M.Q.H */) / (float)d.a("z", (Object)this, (long)36412362274681232L) /* => dev.hixo.D.M.Q.K */);
        }
        CallSite callSite = v1;
        d.a("\u00e7", (Object)this, (float)(d.a("z", (Object)this, (long)138821275966380697L) /* => dev.hixo.D.M.Q.E */ + (f - d.a("z", (Object)this, (long)138821275966380697L) /* => dev.hixo.D.M.Q.E */) * d.a("\u00f9", (float)callSite, (long)152368962118677361L) /* => dev.hixo.D.M.Q.r */), (long)146441846604118896L) /* => dev.hixo.D.M.Q.h */;
        if (bl) {
            G.L = !G.L;
        }
    }

    public void K(float f) {
        d.a("\u00e7", (Object)this, (float)f, (long)146441846604118896L) /* => dev.hixo.D.M.Q.h */;
        d.a("\u00e7", (Object)this, (float)f, (long)138821275966380697L) /* => dev.hixo.D.M.Q.E */;
        d.a("\u00e7", (Object)this, (float)f, (long)158610601283621063L) /* => dev.hixo.D.M.Q.A */;
        d.a("\u00e7", (Object)this, (long)d.a("\u00f9", (long)171188797904017458L) /* => java.lang.System.currentTimeMillis */, (long)144479521044875126L) /* => dev.hixo.D.M.Q.H */;
    }

    public float O() {
        return (float)d.a("z", (Object)this, (long)146441846604118896L) /* => dev.hixo.D.M.Q.h */;
    }

    public float t() {
        if (d.a("z", (Object)this, (long)36412362274681232L) /* => dev.hixo.D.M.Q.K */ <= 0L) {
            return 1.0f;
        }
        float f = (float)(d.a("\u00f9", (long)171188797904017458L) /* => java.lang.System.currentTimeMillis */ - d.a("z", (Object)this, (long)144479521044875126L) /* => dev.hixo.D.M.Q.H */) / (float)d.a("z", (Object)this, (long)36412362274681232L) /* => dev.hixo.D.M.Q.K */;
        return (float)d.a("\u00f9", (float)0.0f, (float)d.a("\u00f9", (float)1.0f, (float)f, (long)139533018482628456L) /* => java.lang.Math.min */, (long)121565737685922221L) /* => java.lang.Math.max */;
    }

    private static float r(float f) {
        return (float)(1.0 - d.a("\u00f9", (double)((double)f * Math.PI * (0.2 + 2.5 * d.a("\u00f9", (double)f, (double)3.0, (long)69738387666927367L) /* => java.lang.Math.pow */)), (long)62255261239063850L) /* => java.lang.Math.cos */ * d.a("\u00f9", (double)(-f * 5.0f), (long)153661041496651682L) /* => java.lang.Math.exp */);
    }
}

