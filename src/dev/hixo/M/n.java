/*
 * RESTORED SOURCE — decompiled reconstruction, not the original files.
 * class: dev.hixo.M.n
 */

/*
 * Decompiled with CFR 0.152.
 */
package dev.hixo.M;

import dev.hixo.M.G;
import dev.hixo.M.K;
import dev.hixo.M.d;
import dev.hixo.M.s.A.l;
import dev.hixo.M.s.D.F;
import dev.hixo.M.s.D.U;
import dev.hixo.M.s.H.S;
import dev.hixo.M.s.K.A;
import dev.hixo.M.s.K.J;
import dev.hixo.M.s.K.M;
import dev.hixo.M.s.K.e;
import dev.hixo.M.s.K.i;
import dev.hixo.M.s.K.p;
import dev.hixo.M.s.O.s;
import dev.hixo.M.s.S.Y;
import dev.hixo.M.s.S.a;
import dev.hixo.M.s.S.t;
import dev.hixo.M.s.S.z;
import dev.hixo.M.s.Y.N;
import dev.hixo.M.s.Y.T;
import dev.hixo.M.s.Y.g;
import dev.hixo.m.s.k.a_0;
import java.lang.invoke.CallSite;
import java.util.ArrayList;
import java.util.List;

public class n {
    private final List<G> K = new ArrayList<G>();

    public n() {
        d.a("$", (Object)this, (Object)new U(), (long)197166734910732532L) /* => dev.hixo.M.n.Q */;
        d.a("$", (Object)this, (Object)new F(), (long)197166734910732532L) /* => dev.hixo.M.n.Q */;
        d.a("$", (Object)this, (Object)new e(), (long)197166734910732532L) /* => dev.hixo.M.n.Q */;
        d.a("$", (Object)this, (Object)new A(), (long)197166734910732532L) /* => dev.hixo.M.n.Q */;
        d.a("$", (Object)this, (Object)new t(), (long)197166734910732532L) /* => dev.hixo.M.n.Q */;
        d.a("$", (Object)this, (Object)new dev.hixo.M.s.Y.J(), (long)197166734910732532L) /* => dev.hixo.M.n.Q */;
        int n2 = dev.hixo.M.K.W;
        d.a("$", (Object)this, (Object)new T(), (long)197166734910732532L) /* => dev.hixo.M.n.Q */;
        d.a("$", (Object)this, (Object)new g(), (long)197166734910732532L) /* => dev.hixo.M.n.Q */;
        d.a("$", (Object)this, (Object)new N(), (long)197166734910732532L) /* => dev.hixo.M.n.Q */;
        d.a("$", (Object)this, (Object)new dev.hixo.M.s.Y.e(), (long)197166734910732532L) /* => dev.hixo.M.n.Q */;
        d.a("$", (Object)this, (Object)new dev.hixo.M.s.S.K(), (long)197166734910732532L) /* => dev.hixo.M.n.Q */;
        d.a("$", (Object)this, (Object)new Y(), (long)197166734910732532L) /* => dev.hixo.M.n.Q */;
        d.a("$", (Object)this, (Object)new S(), (long)197166734910732532L) /* => dev.hixo.M.n.Q */;
        d.a("$", (Object)this, (Object)new s(), (long)197166734910732532L) /* => dev.hixo.M.n.Q */;
        d.a("$", (Object)this, (Object)new z(), (long)197166734910732532L) /* => dev.hixo.M.n.Q */;
        d.a("$", (Object)this, (Object)new a(), (long)197166734910732532L) /* => dev.hixo.M.n.Q */;
        d.a("$", (Object)this, (Object)new dev.hixo.M.s.K.U(), (long)197166734910732532L) /* => dev.hixo.M.n.Q */;
        d.a("$", (Object)this, (Object)new p(), (long)197166734910732532L) /* => dev.hixo.M.n.Q */;
        d.a("$", (Object)this, (Object)new M(), (long)197166734910732532L) /* => dev.hixo.M.n.Q */;
        d.a("$", (Object)this, (Object)new i(), (long)197166734910732532L) /* => dev.hixo.M.n.Q */;
        d.a("$", (Object)this, (Object)new a_0(), (long)197166734910732532L) /* => dev.hixo.M.n.Q */;
        d.a("$", (Object)this, (Object)new J(), (long)197166734910732532L) /* => dev.hixo.M.n.Q */;
        d.a("$", (Object)this, (Object)new l(), (long)197166734910732532L) /* => dev.hixo.M.n.Q */;
        if (n2 != 0) {
            G.L = !G.L;
        }
    }

    private void Q(G g2) {
        d.a("$", (Object)d.a("z", (Object)this, (long)126481077090501221L) /* => dev.hixo.M.n.K */, (Object)g2, (long)184435215000867819L) /* => java.util.List.add */;
        d.a("$", (Object)g2, (long)200330852931355173L) /* => dev.hixo.M.G.X */;
    }

    public List<G> C() {
        return d.a("z", (Object)this, (long)126481077090501221L) /* => dev.hixo.M.n.K */;
    }

    public <T extends G> T b(Class<T> clazz) {
        CallSite callSite = d.a("$", (Object)d.a("z", (Object)this, (long)126481077090501221L) /* => dev.hixo.M.n.K */, (long)113221006393852506L) /* => java.util.List.iterator */;
        int n2 = dev.hixo.M.K.W;
        while (d.a("$", (Object)callSite, (long)175361412755674352L) /* => java.util.Iterator.hasNext */ != false) {
            G g2 = (G)((Object)d.a("$", (Object)callSite, (long)64633749944946827L) /* => java.util.Iterator.next */);
            if (d.a("$", clazz, (Object)g2, (long)63144341504987742L) /* => java.lang.Class.isInstance */ != false) {
                return (T)g2;
            }
            if (n2 == 0) continue;
        }
        return null;
    }

    public G X(String string) {
        CallSite callSite = d.a("$", (Object)d.a("z", (Object)this, (long)126481077090501221L) /* => dev.hixo.M.n.K */, (long)113221006393852506L) /* => java.util.List.iterator */;
        int n2 = dev.hixo.M.K.W;
        while (d.a("$", (Object)callSite, (long)175361412755674352L) /* => java.util.Iterator.hasNext */ != false) {
            block6: {
                G g2;
                block5: {
                    G g3;
                    g2 = g3 = (G)((Object)d.a("$", (Object)callSite, (long)64633749944946827L) /* => java.util.Iterator.next */);
                    if (n2 != 0) break block5;
                    if (d.a("$", (Object)d.a("$", (Object)g2, (long)197754555450540863L) /* => dev.hixo.M.G.V */, (Object)string, (long)106044803757638707L) /* => java.lang.String.equalsIgnoreCase */ == false) break block6;
                    g2 = g3;
                }
                return g2;
            }
            if (n2 == 0) continue;
        }
        if (G.L) {
            dev.hixo.M.K.W = ++n2;
        }
        return null;
    }
}

