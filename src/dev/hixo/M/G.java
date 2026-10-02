/*
 * RESTORED SOURCE — decompiled reconstruction, not the original files.
 * class: dev.hixo.M.G
 */

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_310
 */
package dev.hixo.M;

import dev.hixo.M.K;
import dev.hixo.M.d;
import java.util.function.Supplier;
import net.minecraft.class_310;

public abstract class G {
    protected static final class_310 a = d.a("\u00f9", (long)179869930689441125L) /* => net.minecraft.class_310.method_1551 */;
    private final K I;
    private final String X;
    private final String F;
    private boolean j;
    private String b;
    private int o;
    public static boolean L;

    public G(K k2, String string, String string2) {
        d.a("\u00e7", (Object)this, (String)"", (long)98830445702562697L) /* => dev.hixo.M.G.b */;
        this.I = k2;
        this.X = string;
        this.F = string2;
    }

    public void I() {
        d.a("$", (Object)d.a("$", (Object)d.a("\u00fd", (long)71498313283647962L) /* => dev.hixo.Hixo.INSTANCE */, (long)190854338929747379L) /* => dev.hixo.Hixo.getEventBus */, (Object)this, (long)37752566538187156L) /* => dev.hixo.T.V.s */;
    }

    public void a() {
        d.a("$", (Object)d.a("$", (Object)d.a("\u00fd", (long)71498313283647962L) /* => dev.hixo.Hixo.INSTANCE */, (long)190854338929747379L) /* => dev.hixo.Hixo.getEventBus */, (Object)this, (long)102227226557585461L) /* => dev.hixo.T.V.S */;
    }

    public void w() {
        d.a("$", (Object)this, (d.a("z", (Object)this, (long)151534336729339102L) /* => dev.hixo.M.G.j */ == false ? 1 : 0) != 0, (long)182143715398436705L) /* => dev.hixo.M.G.r */;
    }

    public void r(boolean bl) {
        block7: {
            boolean bl2;
            G g2;
            block5: {
                block6: {
                    int n2 = K.W;
                    g2 = this;
                    if (n2 == 0) {
                        if (d.a("z", (Object)g2, (long)151534336729339102L) /* => dev.hixo.M.G.j */ == bl) {
                            return;
                        }
                        g2 = this;
                    }
                    bl2 = bl;
                    if (n2 != 0) break block5;
                    d.a("\u00e7", (Object)g2, (boolean)bl2, (long)151534336729339102L) /* => dev.hixo.M.G.j */;
                    if (!bl) break block6;
                    d.a("$", (Object)this, (long)62705954122876963L) /* => dev.hixo.M.G.I */;
                    d.a("$", (Object)this, (boolean)true, (long)40276194464339512L) /* => dev.hixo.M.G.S */;
                    if (n2 == 0) break block7;
                }
                d.a("$", (Object)this, (long)169155355157655020L) /* => dev.hixo.M.G.a */;
                g2 = this;
                bl2 = false;
            }
            d.a("$", (Object)g2, (boolean)bl2, (long)40276194464339512L) /* => dev.hixo.M.G.S */;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void S(boolean bl) {
        try {
            if (d.a("\u00fd", (long)71498313283647962L) /* => dev.hixo.Hixo.INSTANCE */ == null) return;
            if (d.a("$", (Object)d.a("\u00fd", (long)71498313283647962L) /* => dev.hixo.Hixo.INSTANCE */, (long)51354103131046111L) /* => dev.hixo.Hixo.getHudRenderer */ == null) return;
            d.a("$", (Object)d.a("$", (Object)d.a("\u00fd", (long)71498313283647962L) /* => dev.hixo.Hixo.INSTANCE */, (long)51354103131046111L) /* => dev.hixo.Hixo.getHudRenderer */, (Object)d.a("z", (Object)this, (long)88898082105002941L) /* => dev.hixo.M.G.X */, (boolean)bl, (long)57114478951364214L) /* => dev.hixo.D.a.U */;
            return;
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    public boolean c() {
        return (boolean)d.a("z", (Object)this, (long)151534336729339102L) /* => dev.hixo.M.G.j */;
    }

    public K P() {
        return d.a("z", (Object)this, (long)35829378330453676L) /* => dev.hixo.M.G.I */;
    }

    public String V() {
        return d.a("z", (Object)this, (long)88898082105002941L) /* => dev.hixo.M.G.X */;
    }

    public String N() {
        return d.a("z", (Object)this, (long)139993926434091785L) /* => dev.hixo.M.G.F */;
    }

    public String S() {
        return d.a("z", (Object)this, (long)98830445702562697L) /* => dev.hixo.M.G.b */;
    }

    public void a(String string) {
        d.a("\u00e7", (Object)this, (String)string, (long)98830445702562697L) /* => dev.hixo.M.G.b */;
    }

    public int x() {
        return (int)d.a("z", (Object)this, (long)55116620137810972L) /* => dev.hixo.M.G.o */;
    }

    public void z(int n2) {
        d.a("\u00e7", (Object)this, (int)n2, (long)55116620137810972L) /* => dev.hixo.M.G.o */;
    }

    public int f() {
        return 0;
    }

    public void X() {
    }

    public void J() {
    }

    public String A() {
        return "";
    }

    protected void C(String string, Supplier<Boolean> supplier) {
    }
}

