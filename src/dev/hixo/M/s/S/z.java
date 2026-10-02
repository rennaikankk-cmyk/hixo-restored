/*
 * RESTORED SOURCE — decompiled reconstruction, not the original files.
 * class: dev.hixo.M.s.S.z
 * identified as: AutoThrow
 * context strings: 'Min Distance' | 'Delay(ms)' | 'AutoThrow' | '自动投掷鸡蛋雪球'
 */

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1657
 *  net.minecraft.class_1771
 *  net.minecraft.class_1823
 */
package dev.hixo.M.s.S;

import dev.hixo.M.G;
import dev.hixo.M.K;
import dev.hixo.M.d;
import dev.hixo.M.s.S.Y;
import dev.hixo.T.E;
import dev.hixo.T.q.S;
import dev.hixo.T.q.w;
import dev.hixo.b.M;
import dev.hixo.f.V.C;
import dev.hixo.t.q.p_0;
import java.lang.invoke.CallSite;
import net.minecraft.class_1657;
import net.minecraft.class_1771;
import net.minecraft.class_1823;

public class z
extends G {
    public final M T;
    public final M V;
    public final M f;
    private class_1657 D;
    private C R;
    private long H;
    private int A;
    private int M;
    private static final String[] c;
    private static final long d;

    public z() {
        String[] stringArray = c;
        super((K)((Object)dev.hixo.M.d.a("\u00fd", (long)169407094224467032L) /* => dev.hixo.M.K.COMBAT */), stringArray[2], stringArray[3]);
        this.T = new M(stringArray[0], 5.0, 3.0, 30.0, 1.0);
        this.V = new M(stringArray[4], 12.0, 3.0, 30.0, 1.0);
        this.f = new M(stringArray[1], 500.0, 100.0, 2000.0, 50.0);
        dev.hixo.M.d.a("\u00e7", (Object)this, (long)0L, (long)165159269182202677L) /* => dev.hixo.M.s.S.z.H */;
        dev.hixo.M.d.a("\u00e7", (Object)this, (int)-1, (long)35230308616756298L) /* => dev.hixo.M.s.S.z.A */;
        dev.hixo.M.d.a("\u00e7", (Object)this, (int)0, (long)184746612762928516L) /* => dev.hixo.M.s.S.z.M */;
        dev.hixo.M.d.a("$", (Object)this, (int)0, (long)113806433936288059L) /* => dev.hixo.M.G.z */;
    }

    @Override
    public void a() {
        super.a();
        dev.hixo.M.d.a("\u00e7", (Object)this, null, (long)35311253951440308L) /* => dev.hixo.M.s.S.z.D */;
        dev.hixo.M.d.a("\u00e7", (Object)this, null, (long)93805346117318748L) /* => dev.hixo.M.s.S.z.R */;
        dev.hixo.M.d.a("\u00e7", (Object)this, (int)-1, (long)35230308616756298L) /* => dev.hixo.M.s.S.z.A */;
        dev.hixo.M.d.a("\u00e7", (Object)this, (int)0, (long)184746612762928516L) /* => dev.hixo.M.s.S.z.M */;
    }

    @E
    public void B(p_0 p_02) {
        if (dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("$", (Object)p_02, (long)52512254813896748L) /* => dev.hixo.T.q.p.W */, (Object)dev.hixo.M.d.a("\u00fd", (long)199476637466971905L) /* => dev.hixo.T.S.PRE */, (long)115634047609526502L) /* => dev.hixo.T.S.equals */ == false) {
            return;
        }
        if (dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("\u00fd", (long)191291687252741418L) /* => dev.hixo.M.G.a */, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */ == null || dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("\u00fd", (long)191291687252741418L) /* => dev.hixo.M.G.a */, (long)38197671011210569L) /* => net.minecraft.class_310.field_1687 */ == null) {
            dev.hixo.M.d.a("\u00e7", (Object)this, null, (long)35311253951440308L) /* => dev.hixo.M.s.S.z.D */;
            return;
        }
        if (dev.hixo.M.d.a("z", (Object)this, (long)35230308616756298L) /* => dev.hixo.M.s.S.z.A */ != -1) {
            dev.hixo.M.d.a("\u00e7", (Object)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("\u00fd", (long)191291687252741418L) /* => dev.hixo.M.G.a */, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (long)154188433605680654L) /* => net.minecraft.class_746.method_31548 */, (int)dev.hixo.M.d.a("z", (Object)this, (long)35230308616756298L) /* => dev.hixo.M.s.S.z.A */, (long)155518450009451424L) /* => net.minecraft.class_1661.field_7545 */;
            dev.hixo.M.d.a("\u00e7", (Object)this, (int)-1, (long)35230308616756298L) /* => dev.hixo.M.s.S.z.A */;
        }
        if (dev.hixo.M.d.a("z", (Object)this, (long)184746612762928516L) /* => dev.hixo.M.s.S.z.M */ > 0) {
            z z2 = this;
            dev.hixo.M.d.a("\u00e7", (Object)z2, (int)(dev.hixo.M.d.a("z", (Object)z2, (long)184746612762928516L) /* => dev.hixo.M.s.S.z.M */ - true), (long)184746612762928516L) /* => dev.hixo.M.s.S.z.M */;
            return;
        }
        dev.hixo.M.d.a("\u00e7", (Object)this, (class_1657)dev.hixo.M.d.a("$", (Object)this, (long)180691440051946117L) /* => dev.hixo.M.s.S.z.b */, (long)35311253951440308L) /* => dev.hixo.M.s.S.z.D */;
    }

    @E
    public void i(w w2) {
        if (dev.hixo.M.d.a("z", (Object)this, (long)35311253951440308L) /* => dev.hixo.M.s.S.z.D */ == null) {
            return;
        }
        if (dev.hixo.M.d.a("\u00f9", (int)dev.hixo.M.d.a("$", (Object)this, (long)91610706355351322L) /* => dev.hixo.M.s.S.z.f */, (long)176350319891924083L) /* => dev.hixo.f.B.G.N */ == false) {
            return;
        }
        dev.hixo.M.d.a("\u00e7", (Object)this, (C)((Object)dev.hixo.M.d.a("$", (Object)this, (Object)dev.hixo.M.d.a("z", (Object)this, (long)35311253951440308L) /* => dev.hixo.M.s.S.z.D */, (long)33920047334072634L) /* => dev.hixo.M.s.S.z.W */), (long)93805346117318748L) /* => dev.hixo.M.s.S.z.R */;
        if (dev.hixo.M.d.a("z", (Object)this, (long)93805346117318748L) /* => dev.hixo.M.s.S.z.R */ != null) {
            dev.hixo.M.d.a("\u00f9", (Object)dev.hixo.M.d.a("z", (Object)this, (long)93805346117318748L) /* => dev.hixo.M.s.S.z.R */, (int)dev.hixo.M.d.a("$", (Object)this, (long)91610706355351322L) /* => dev.hixo.M.s.S.z.f */, (Object)dev.hixo.M.d.a("\u00fd", (long)65795335008300943L) /* => dev.hixo.f.B.Z.Silent */, (long)37503006147511700L) /* => dev.hixo.f.B.G.l */;
        }
    }

    @E
    public void R(S s2) {
        if (dev.hixo.M.d.a("z", (Object)this, (long)35311253951440308L) /* => dev.hixo.M.s.S.z.D */ == null || dev.hixo.M.d.a("z", (Object)this, (long)93805346117318748L) /* => dev.hixo.M.s.S.z.R */ == null) {
            return;
        }
        if (dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("\u00fd", (long)191291687252741418L) /* => dev.hixo.M.G.a */, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */ == null || dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("\u00fd", (long)191291687252741418L) /* => dev.hixo.M.G.a */, (long)100087742506519171L) /* => net.minecraft.class_310.field_1761 */ == null) {
            return;
        }
        if (dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("\u00fd", (long)191291687252741418L) /* => dev.hixo.M.G.a */, (long)99309607406877471L) /* => net.minecraft.class_310.field_1755 */ != null) {
            return;
        }
        CallSite callSite = dev.hixo.M.d.a("\u00f9", (long)171188797904017458L) /* => java.lang.System.currentTimeMillis */;
        if (callSite - dev.hixo.M.d.a("z", (Object)this, (long)165159269182202677L) /* => dev.hixo.M.s.S.z.H */ < (long)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)160970966587448728L) /* => dev.hixo.M.s.S.z.f */, (long)86270808255001128L) /* => dev.hixo.b.M.J */) {
            return;
        }
        CallSite callSite2 = dev.hixo.M.d.a("$", (Object)this, (long)155227120611488804L) /* => dev.hixo.M.s.S.z.d */;
        if (callSite2 == -1) {
            return;
        }
        dev.hixo.M.d.a("\u00e7", (Object)this, (int)dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("\u00fd", (long)191291687252741418L) /* => dev.hixo.M.G.a */, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (long)154188433605680654L) /* => net.minecraft.class_746.method_31548 */, (long)155518450009451424L) /* => net.minecraft.class_1661.field_7545 */, (long)35230308616756298L) /* => dev.hixo.M.s.S.z.A */;
        dev.hixo.M.d.a("\u00e7", (Object)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("\u00fd", (long)191291687252741418L) /* => dev.hixo.M.G.a */, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (long)154188433605680654L) /* => net.minecraft.class_746.method_31548 */, (int)callSite2, (long)155518450009451424L) /* => net.minecraft.class_1661.field_7545 */;
        dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("\u00fd", (long)191291687252741418L) /* => dev.hixo.M.G.a */, (long)100087742506519171L) /* => net.minecraft.class_310.field_1761 */, (Object)dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("\u00fd", (long)191291687252741418L) /* => dev.hixo.M.G.a */, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (Object)dev.hixo.M.d.a("\u00fd", (long)85943668217877665L) /* => net.minecraft.class_1268.field_5808 */, (long)88421954933898607L) /* => net.minecraft.class_636.method_2919 */;
        dev.hixo.M.d.a("\u00e7", (Object)this, (long)callSite, (long)165159269182202677L) /* => dev.hixo.M.s.S.z.H */;
        dev.hixo.M.d.a("\u00e7", (Object)this, (int)((int)d), (long)184746612762928516L) /* => dev.hixo.M.s.S.z.M */;
    }

    private class_1657 b() {
        class_1657 class_16572;
        block10: {
            CallSite callSite;
            int n2;
            block13: {
                block14: {
                    block12: {
                        block11: {
                            n2 = Y.w;
                            callSite = dev.hixo.M.d.a("\u00fd", (long)191291687252741418L) /* => dev.hixo.M.G.a */;
                            if (n2 != 0) break block11;
                            if (dev.hixo.M.d.a("z", (Object)callSite, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */ == null) break block12;
                            callSite = dev.hixo.M.d.a("\u00fd", (long)191291687252741418L) /* => dev.hixo.M.G.a */;
                        }
                        if (n2 != 0) break block13;
                        if (dev.hixo.M.d.a("z", (Object)callSite, (long)38197671011210569L) /* => net.minecraft.class_310.field_1687 */ != null) break block14;
                    }
                    return null;
                }
                callSite = dev.hixo.M.d.a("\u00fd", (long)191291687252741418L) /* => dev.hixo.M.G.a */;
            }
            CallSite callSite2 = dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)callSite, (long)38197671011210569L) /* => net.minecraft.class_310.field_1687 */, (long)137187573870165505L) /* => net.minecraft.class_638.method_18456 */;
            class_1657 class_16573 = null;
            double d2 = Double.MAX_VALUE;
            CallSite callSite3 = dev.hixo.M.d.a("$", (Object)callSite2, (long)113221006393852506L) /* => java.util.List.iterator */;
            while (dev.hixo.M.d.a("$", (Object)callSite3, (long)175361412755674352L) /* => java.util.Iterator.hasNext */ != false) {
                block17: {
                    double d3;
                    class_1657 class_16574;
                    block16: {
                        double d4;
                        double d5;
                        block15: {
                            double d6;
                            class_16572 = (class_1657)dev.hixo.M.d.a("$", (Object)callSite3, (long)64633749944946827L) /* => java.util.Iterator.next */;
                            if (n2 != 0) break block10;
                            class_1657 class_16575 = class_16574 = class_16572;
                            if (n2 == 0) {
                                if (class_16575 == dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("\u00fd", (long)191291687252741418L) /* => dev.hixo.M.G.a */, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */) continue;
                                class_16575 = class_16574;
                            }
                            if (dev.hixo.M.d.a("$", (Object)class_16575, (long)168276210089764626L) /* => net.minecraft.class_1657.method_5805 */ == false) continue;
                            double d7 = d5 = (double)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("\u00fd", (long)191291687252741418L) /* => dev.hixo.M.G.a */, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (Object)class_16574, (long)167756919979340704L) /* => net.minecraft.class_746.method_5739 */;
                            CallSite callSite4 = dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)129121131157601833L) /* => dev.hixo.M.s.S.z.T */, (long)86270808255001128L) /* => dev.hixo.b.M.J */;
                            if (n2 == 0) {
                                if (d7 < callSite4) continue;
                                d7 = d5;
                                callSite4 = dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)58746402627064186L) /* => dev.hixo.M.s.S.z.V */, (long)86270808255001128L) /* => dev.hixo.b.M.J */;
                            }
                            d4 = (d6 = d7 - callSite4) == 0.0 ? 0 : (d6 > 0.0 ? 1 : -1);
                            if (n2 == 0) {
                                if (d4 > 0) continue;
                                d4 = (double)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("\u00fd", (long)191291687252741418L) /* => dev.hixo.M.G.a */, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (Object)class_16574, (long)127584911130885072L) /* => net.minecraft.class_746.method_6057 */;
                            }
                            if (n2 != 0) break block15;
                            if (d4 == false) continue;
                            d3 = d5;
                            if (n2 != 0) break block16;
                            double d8 = d3 - d2;
                            d4 = d8 == 0.0 ? 0 : (d8 < 0.0 ? -1 : 1);
                        }
                        if (d4 >= 0) break block17;
                        d3 = d5;
                    }
                    d2 = d3;
                    class_16573 = class_16574;
                }
                if (n2 == 0) continue;
            }
            class_16572 = class_16573;
        }
        return class_16572;
    }

    private int d() {
        if (dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("\u00fd", (long)191291687252741418L) /* => dev.hixo.M.G.a */, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */ == null) {
            return -1;
        }
        for (int i2 = 0; i2 < 9; ++i2) {
            CallSite callSite = dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("\u00fd", (long)191291687252741418L) /* => dev.hixo.M.G.a */, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (long)154188433605680654L) /* => net.minecraft.class_746.method_31548 */, (int)i2, (long)104584719520783793L) /* => net.minecraft.class_1661.method_5438 */;
            if (dev.hixo.M.d.a("$", (Object)callSite, (long)170246929245689750L) /* => net.minecraft.class_1799.method_7960 */ != false || !(dev.hixo.M.d.a("$", (Object)callSite, (long)89510314790192383L) /* => net.minecraft.class_1799.method_7909 */ instanceof class_1771) && !(dev.hixo.M.d.a("$", (Object)callSite, (long)89510314790192383L) /* => net.minecraft.class_1799.method_7909 */ instanceof class_1823)) continue;
            return i2;
        }
        return -1;
    }

    /*
     * WARNING - void declaration
     */
    private C W(class_1657 class_16572) {
        Object object;
        CallSite callSite;
        reference v0;
        reference var15_10;
        reference var13_9;
        float f;
        float f2;
        block3: {
            void var17_12;
            int n2 = Y.w;
            if (dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("\u00fd", (long)191291687252741418L) /* => dev.hixo.M.G.a */, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */ == null) {
                return null;
            }
            f2 = 1.5f;
            f = 0.03f;
            reference var5_5 = dev.hixo.M.d.a("$", (Object)class_16572, (long)58997612901604286L) /* => net.minecraft.class_1657.method_23317 */ - dev.hixo.M.d.a("z", (Object)class_16572, (long)51377778931490492L) /* => net.minecraft.class_1657.field_6014 */;
            reference var7_6 = dev.hixo.M.d.a("$", (Object)class_16572, (long)64581300739053076L) /* => net.minecraft.class_1657.method_23318 */ - dev.hixo.M.d.a("z", (Object)class_16572, (long)144839365802362425L) /* => net.minecraft.class_1657.field_6036 */;
            reference var9_7 = dev.hixo.M.d.a("$", (Object)class_16572, (long)105907763657950122L) /* => net.minecraft.class_1657.method_23321 */ - dev.hixo.M.d.a("z", (Object)class_16572, (long)200636102066252152L) /* => net.minecraft.class_1657.field_5969 */;
            reference var11_8 = dev.hixo.M.d.a("$", (Object)class_16572, (long)58997612901604286L) /* => net.minecraft.class_1657.method_23317 */;
            var13_9 = dev.hixo.M.d.a("$", (Object)class_16572, (long)64581300739053076L) /* => net.minecraft.class_1657.method_23318 */ + (double)dev.hixo.M.d.a("$", (Object)class_16572, (long)114970717926639578L) /* => net.minecraft.class_1657.method_17682 */ * 0.8;
            var15_10 = dev.hixo.M.d.a("$", (Object)class_16572, (long)105907763657950122L) /* => net.minecraft.class_1657.method_23321 */;
            boolean i2 = false;
            while (var17_12 < 3) {
                reference var18_14 = var11_8 - dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("\u00fd", (long)191291687252741418L) /* => dev.hixo.M.G.a */, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (long)96335688942052006L) /* => net.minecraft.class_746.method_23317 */;
                reference var20_15 = var13_9 - (dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("\u00fd", (long)191291687252741418L) /* => dev.hixo.M.G.a */, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (long)90587010555304668L) /* => net.minecraft.class_746.method_23318 */ + (double)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("\u00fd", (long)191291687252741418L) /* => dev.hixo.M.G.a */, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (Object)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("\u00fd", (long)191291687252741418L) /* => dev.hixo.M.G.a */, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (long)176834329271870838L) /* => net.minecraft.class_746.method_18376 */, (long)158980927085041450L) /* => net.minecraft.class_746.method_18381 */);
                v0 = var15_10;
                callSite = dev.hixo.M.d.a("\u00fd", (long)191291687252741418L) /* => dev.hixo.M.G.a */;
                if (n2 == 0) {
                    reference var22_16 = v0 - dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)callSite, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (long)47103109275691764L) /* => net.minecraft.class_746.method_23321 */;
                    CallSite callSite2 = dev.hixo.M.d.a("\u00f9", (double)(var18_14 * var18_14 + var22_16 * var22_16), (long)146319326606007315L) /* => java.lang.Math.sqrt */;
                    object = (float)(callSite2 / (double)(f2 * 0.4f));
                    var11_8 = dev.hixo.M.d.a("$", (Object)class_16572, (long)58997612901604286L) /* => net.minecraft.class_1657.method_23317 */ + var5_5 * (double)object;
                    var13_9 = dev.hixo.M.d.a("$", (Object)class_16572, (long)64581300739053076L) /* => net.minecraft.class_1657.method_23318 */ + (double)dev.hixo.M.d.a("$", (Object)class_16572, (long)114970717926639578L) /* => net.minecraft.class_1657.method_17682 */ * 0.8 + var7_6 * (double)object;
                    var15_10 = dev.hixo.M.d.a("$", (Object)class_16572, (long)105907763657950122L) /* => net.minecraft.class_1657.method_23321 */ + var9_7 * (double)object;
                    ++var17_12;
                    if (n2 == 0) continue;
                }
                break block3;
            }
            v0 = var11_8;
            callSite = dev.hixo.M.d.a("\u00fd", (long)191291687252741418L) /* => dev.hixo.M.G.a */;
        }
        reference var17_13 = v0 - dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)callSite, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (long)96335688942052006L) /* => net.minecraft.class_746.method_23317 */;
        reference var19_19 = var13_9 - (dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("\u00fd", (long)191291687252741418L) /* => dev.hixo.M.G.a */, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (long)90587010555304668L) /* => net.minecraft.class_746.method_23318 */ + (double)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("\u00fd", (long)191291687252741418L) /* => dev.hixo.M.G.a */, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (Object)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("\u00fd", (long)191291687252741418L) /* => dev.hixo.M.G.a */, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (long)176834329271870838L) /* => net.minecraft.class_746.method_18376 */, (long)158980927085041450L) /* => net.minecraft.class_746.method_18381 */);
        reference var21_20 = var15_10 - dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("\u00fd", (long)191291687252741418L) /* => dev.hixo.M.G.a */, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (long)47103109275691764L) /* => net.minecraft.class_746.method_23321 */;
        CallSite callSite3 = dev.hixo.M.d.a("\u00f9", (double)(var17_13 * var17_13 + var21_20 * var21_20), (long)146319326606007315L) /* => java.lang.Math.sqrt */;
        float f3 = (float)(dev.hixo.M.d.a("\u00f9", (double)var21_20, (double)var17_13, (long)130928682319801467L) /* => java.lang.Math.atan2 */ * 180.0 / Math.PI) - 90.0f;
        object = -dev.hixo.M.d.a("$", (Object)this, (float)((float)callSite3), (float)((float)var19_19), (float)f2, (float)f, (long)108938442878813560L) /* => dev.hixo.M.s.S.z.z */;
        return new C(f3, (float)object);
    }

    private float z(float f, float f2, float f3, float f4) {
        double d2 = f3 * f3;
        double d3 = f4 * f * f;
        double d4 = d2 * d2 - (double)f4 * (d3 + (double)(2.0f * f2) * d2);
        if (d4 < 0.0) {
            return 45.0f;
        }
        CallSite callSite = dev.hixo.M.d.a("\u00f9", (double)d4, (long)146319326606007315L) /* => java.lang.Math.sqrt */;
        CallSite callSite2 = dev.hixo.M.d.a("\u00f9", (double)((d2 + callSite) / (double)(f4 * f)), (long)170307918711405253L) /* => java.lang.Math.atan */;
        CallSite callSite3 = dev.hixo.M.d.a("\u00f9", (double)((d2 - callSite) / (double)(f4 * f)), (long)170307918711405253L) /* => java.lang.Math.atan */;
        return (float)dev.hixo.M.d.a("\u00f9", (double)dev.hixo.M.d.a("\u00f9", (double)callSite2, (double)callSite3, (long)195251025896564278L) /* => java.lang.Math.min */, (long)59882655678323470L) /* => java.lang.Math.toDegrees */;
    }

    @Override
    public int f() {
        return 5;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                block19: {
                    var7 = new String[5];
                    var5_1 = 0;
                    var4_2 = "\u0006Ul!\u0000<Q?]lb!\t\u000fYn`=}O8\u0015\t\nIvn\u0010=P$K";
                    var6_3 = "\u0006Ul!\u0000<Q?]lb!\t\u000fYn`=}O8\u0015\t\nIvn\u0010=P$K".length();
                    var3_4 = 12;
                    var2_5 = -1;
lbl7:
                    // 2 sources

                    while (true) {
                        v0 = ++var2_5;
                        v1 = var4_2.substring(v0, v0 + var3_4);
                        v2 = -1;
                        break block19;
                        break;
                    }
lbl12:
                    // 1 sources

                    while (true) {
                        var7[var5_1++] = v3.intern();
                        if ((var2_5 += var3_4) < var6_3) {
                            var3_4 = var4_2.charAt(var2_5);
                            ** continue;
                        }
                        var4_2 = "\u81a1\u5294\u6297\u63b6\u9e65\u869e\u96c8\u7448\f\u0006]z!\u0000<Q?]lb!";
                        var6_3 = "\u81a1\u5294\u6297\u63b6\u9e65\u869e\u96c8\u7448\f\u0006]z!\u0000<Q?]lb!".length();
                        var3_4 = 8;
                        var2_5 = -1;
lbl21:
                        // 2 sources

                        while (true) {
                            v4 = ++var2_5;
                            v1 = var4_2.substring(v4, v4 + var3_4);
                            v2 = 0;
                            break block19;
                            break;
                        }
                        break;
                    }
lbl26:
                    // 1 sources

                    while (true) {
                        var7[var5_1++] = v3.intern();
                        if ((var2_5 += var3_4) < var6_3) {
                            var3_4 = var4_2.charAt(var2_5);
                            ** continue;
                        }
                        break block20;
                        break;
                    }
                }
                v5 = v1.toCharArray();
                v6 = v5;
                v7 = v5.length;
                var8_6 = 0;
                if (true) ** GOTO lbl65
                do {
                    v6 = v6;
                    v8 = var8_6;
                    v9 = v6[v8];
                    switch (var8_6 % 7) {
                        case 0: {
                            v10 = 75;
                            break;
                        }
                        case 1: {
                            v10 = 60;
                            break;
                        }
                        case 2: {
                            v10 = 2;
                            break;
                        }
                        case 3: {
                            v10 = 1;
                            break;
                        }
                        case 4: {
                            v10 = 68;
                            break;
                        }
                        case 5: {
                            v10 = 85;
                            break;
                        }
                        default: {
                            v10 = 34;
                        }
                    }
                    v6[v8] = (char)(v9 ^ v10);
                    ++var8_6;
lbl65:
                    // 2 sources

                    v7 = v7;
                } while (v7 > var8_6);
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
            z.c = var7;
            break block21;
lbl77:
            // 1 sources

            while (true) {
                continue;
                break;
            }
        }
        var0_7 = 5333906017777769347L;
        ** while (true)
        z.d = -239865237732959359L ^ var0_7;
    }
}

