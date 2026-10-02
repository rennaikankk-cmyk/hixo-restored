/*
 * RESTORED SOURCE — decompiled reconstruction, not the original files.
 * class: dev.hixo.M.s.D.F
 * identified as: Clutch
 * context strings: 'Clutch' | '掉落时自动在脚下放方块自救'
 */

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1268
 *  net.minecraft.class_1657
 *  net.minecraft.class_1747
 *  net.minecraft.class_1799
 *  net.minecraft.class_2338
 *  net.minecraft.class_2350
 *  net.minecraft.class_243
 *  net.minecraft.class_310
 *  net.minecraft.class_3965
 */
package dev.hixo.M.s.D;

import dev.hixo.M.G;
import dev.hixo.M.K;
import dev.hixo.M.d;
import dev.hixo.M.s.D.U;
import dev.hixo.T.E;
import dev.hixo.T.q.S;
import dev.hixo.T.q.w;
import dev.hixo.f.P.v;
import dev.hixo.f.V.C;
import dev.hixo.t.q.p_0;
import java.lang.invoke.CallSite;
import net.minecraft.class_1268;
import net.minecraft.class_1657;
import net.minecraft.class_1747;
import net.minecraft.class_1799;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_243;
import net.minecraft.class_310;
import net.minecraft.class_3965;

public class F
extends G {
    private final class_310 P;
    private class_2338 l;
    private class_2350 f;
    private C Y;
    private int s;
    private class_1268 p;
    private static final String[] c;
    private static final long d;

    public F() {
        String[] stringArray = c;
        super((K)((Object)dev.hixo.M.d.a("\u00fd", (long)42780286670305511L) /* => dev.hixo.M.K.WORLD */), stringArray[0], stringArray[1]);
        this.P = dev.hixo.M.d.a("\u00f9", (long)179869930689441125L) /* => net.minecraft.class_310.method_1551 */;
        dev.hixo.M.d.a("\u00e7", (Object)this, (int)((int)d), (long)201163748832744828L) /* => dev.hixo.M.s.D.F.s */;
        dev.hixo.M.d.a("\u00e7", (Object)this, (class_1268)dev.hixo.M.d.a("\u00fd", (long)85943668217877665L) /* => net.minecraft.class_1268.field_5808 */, (long)39392256730222825L) /* => dev.hixo.M.s.D.F.p */;
        dev.hixo.M.d.a("$", (Object)this, (int)0, (long)113806433936288059L) /* => dev.hixo.M.G.z */;
    }

    @E
    public void D(p_0 p_02) {
        CallSite callSite;
        CallSite callSite2;
        boolean bl;
        block27: {
            block26: {
                block25: {
                    block24: {
                        CallSite callSite3;
                        block23: {
                            F f;
                            block21: {
                                block22: {
                                    block19: {
                                        block20: {
                                            block18: {
                                                block17: {
                                                    bl = U.PQ;
                                                    if (dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("$", (Object)p_02, (long)52512254813896748L) /* => dev.hixo.T.q.p.W */, (Object)dev.hixo.M.d.a("\u00fd", (long)199476637466971905L) /* => dev.hixo.T.S.PRE */, (long)115634047609526502L) /* => dev.hixo.T.S.equals */ == false) {
                                                        return;
                                                    }
                                                    f = this;
                                                    if (bl) break block17;
                                                    if (dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("z", (Object)f, (long)108552105626612456L) /* => dev.hixo.M.s.D.F.P */, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */ == null) break block18;
                                                    f = this;
                                                }
                                                if (bl) break block19;
                                                if (dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("z", (Object)f, (long)108552105626612456L) /* => dev.hixo.M.s.D.F.P */, (long)38197671011210569L) /* => net.minecraft.class_310.field_1687 */ != null) break block20;
                                            }
                                            return;
                                        }
                                        f = this;
                                    }
                                    if (bl) break block21;
                                    if (dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("z", (Object)f, (long)108552105626612456L) /* => dev.hixo.M.s.D.F.P */, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (long)175288240290473570L) /* => net.minecraft.class_746.method_24828 */ != false) break block22;
                                    f = this;
                                    if (bl) break block21;
                                    if (!(dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("z", (Object)f, (long)108552105626612456L) /* => dev.hixo.M.s.D.F.P */, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (long)84667892282276784L) /* => net.minecraft.class_746.method_18798 */, (long)47504908757591323L) /* => net.minecraft.class_243.field_1351 */ > -0.1)) break block23;
                                }
                                f = this;
                            }
                            dev.hixo.M.d.a("\u00e7", (Object)f, null, (long)195483603385007791L) /* => dev.hixo.M.s.D.F.l */;
                            return;
                        }
                        v v2 = new v((class_1657)dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("z", (Object)this, (long)108552105626612456L) /* => dev.hixo.M.s.D.F.P */, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */);
                        CallSite callSite4 = callSite3 = dev.hixo.M.d.a("$", (Object)v2, (int)20, (long)78603235067093558L) /* => ciazeb7n6.h */;
                        if (!bl) {
                            if (callSite4 == null) {
                                dev.hixo.M.d.a("\u00e7", (Object)this, null, (long)195483603385007791L) /* => dev.hixo.M.s.D.F.l */;
                                return;
                            }
                            callSite4 = dev.hixo.M.d.a("$", (Object)callSite3, (long)73640821017464249L) /* => net.minecraft.class_2338.method_10084 */;
                        }
                        callSite2 = callSite4;
                        CallSite callSite5 = dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("z", (Object)this, (long)108552105626612456L) /* => dev.hixo.M.s.D.F.P */, (long)38197671011210569L) /* => net.minecraft.class_310.field_1687 */, (Object)callSite2, (long)170782435888130580L) /* => net.minecraft.class_638.method_8320 */;
                        if (bl) break block24;
                        if (dev.hixo.M.d.a("$", (Object)callSite5, (long)41663768830184110L) /* => net.minecraft.class_2680.method_26215 */ != false) break block25;
                        dev.hixo.M.d.a("\u00e7", (Object)this, null, (long)195483603385007791L) /* => dev.hixo.M.s.D.F.l */;
                    }
                    return;
                }
                callSite = dev.hixo.M.d.a("$", (Object)this, (Object)callSite2, (long)51238006093834490L) /* => dev.hixo.M.s.D.F.k */;
                if (bl) break block26;
                if (callSite != null) break block27;
                dev.hixo.M.d.a("\u00e7", (Object)this, null, (long)195483603385007791L) /* => dev.hixo.M.s.D.F.l */;
            }
            return;
        }
        CallSite callSite6 = dev.hixo.M.d.a("$", (Object)this, (long)127258918575400286L) /* => dev.hixo.M.s.D.F.Q */;
        if (!bl) {
            if (callSite6 == -2) {
                dev.hixo.M.d.a("\u00e7", (Object)this, null, (long)195483603385007791L) /* => dev.hixo.M.s.D.F.l */;
                return;
            }
            dev.hixo.M.d.a("\u00e7", (Object)this, (class_2338)callSite2, (long)195483603385007791L) /* => dev.hixo.M.s.D.F.l */;
            dev.hixo.M.d.a("\u00e7", (Object)this, (class_2350)callSite, (long)199865626152747027L) /* => dev.hixo.M.s.D.F.f */;
        }
    }

    @E
    public void L(w w2) {
        if (dev.hixo.M.d.a("z", (Object)this, (long)195483603385007791L) /* => dev.hixo.M.s.D.F.l */ == null || dev.hixo.M.d.a("z", (Object)this, (long)199865626152747027L) /* => dev.hixo.M.s.D.F.f */ == null) {
            return;
        }
        if (dev.hixo.M.d.a("\u00f9", (int)dev.hixo.M.d.a("$", (Object)this, (long)151031034642205849L) /* => dev.hixo.M.s.D.F.f */, (long)176350319891924083L) /* => dev.hixo.f.B.G.N */ == false) {
            return;
        }
        if (dev.hixo.M.d.a("z", (Object)this, (long)201163748832744828L) /* => dev.hixo.M.s.D.F.s */ >= 0 && dev.hixo.M.d.a("z", (Object)this, (long)201163748832744828L) /* => dev.hixo.M.s.D.F.s */ <= 8) {
            dev.hixo.M.d.a("\u00e7", (Object)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("z", (Object)this, (long)108552105626612456L) /* => dev.hixo.M.s.D.F.P */, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (long)154188433605680654L) /* => net.minecraft.class_746.method_31548 */, (int)dev.hixo.M.d.a("z", (Object)this, (long)201163748832744828L) /* => dev.hixo.M.s.D.F.s */, (long)155518450009451424L) /* => net.minecraft.class_1661.field_7545 */;
            dev.hixo.M.d.a("\u00e7", (Object)this, (class_1268)dev.hixo.M.d.a("\u00fd", (long)85943668217877665L) /* => net.minecraft.class_1268.field_5808 */, (long)39392256730222825L) /* => dev.hixo.M.s.D.F.p */;
        } else if (dev.hixo.M.d.a("z", (Object)this, (long)201163748832744828L) /* => dev.hixo.M.s.D.F.s */ == -1) {
            dev.hixo.M.d.a("\u00e7", (Object)this, (class_1268)dev.hixo.M.d.a("\u00fd", (long)74280917607947214L) /* => net.minecraft.class_1268.field_5810 */, (long)39392256730222825L) /* => dev.hixo.M.s.D.F.p */;
        }
        CallSite callSite = dev.hixo.M.d.a("$", (Object)this, (Object)dev.hixo.M.d.a("z", (Object)this, (long)195483603385007791L) /* => dev.hixo.M.s.D.F.l */, (Object)dev.hixo.M.d.a("z", (Object)this, (long)199865626152747027L) /* => dev.hixo.M.s.D.F.f */, (long)69963694134651287L) /* => dev.hixo.M.s.D.F.y */;
        CallSite callSite2 = dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("z", (Object)this, (long)108552105626612456L) /* => dev.hixo.M.s.D.F.P */, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (long)88005680930564042L) /* => net.minecraft.class_746.method_33571 */;
        dev.hixo.M.d.a("\u00e7", (Object)this, (C)((Object)dev.hixo.M.d.a("$", (Object)this, (Object)callSite, (Object)callSite2, (long)135790488945354250L) /* => dev.hixo.M.s.D.F.q */), (long)69585917210623725L) /* => dev.hixo.M.s.D.F.Y */;
        if (dev.hixo.M.d.a("z", (Object)this, (long)69585917210623725L) /* => dev.hixo.M.s.D.F.Y */ != null) {
            dev.hixo.M.d.a("\u00f9", (Object)dev.hixo.M.d.a("z", (Object)this, (long)69585917210623725L) /* => dev.hixo.M.s.D.F.Y */, (int)dev.hixo.M.d.a("$", (Object)this, (long)151031034642205849L) /* => dev.hixo.M.s.D.F.f */, (Object)dev.hixo.M.d.a("\u00fd", (long)65795335008300943L) /* => dev.hixo.f.B.Z.Silent */, (long)37503006147511700L) /* => dev.hixo.f.B.G.l */;
        }
    }

    @E
    public void g(S s2) {
        if (dev.hixo.M.d.a("z", (Object)this, (long)195483603385007791L) /* => dev.hixo.M.s.D.F.l */ == null || dev.hixo.M.d.a("z", (Object)this, (long)199865626152747027L) /* => dev.hixo.M.s.D.F.f */ == null || dev.hixo.M.d.a("z", (Object)this, (long)69585917210623725L) /* => dev.hixo.M.s.D.F.Y */ == null) {
            return;
        }
        if (dev.hixo.M.d.a("\u00f9", (Object)dev.hixo.M.d.a("z", (Object)this, (long)69585917210623725L) /* => dev.hixo.M.s.D.F.Y */, (Object)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)195483603385007791L) /* => dev.hixo.M.s.D.F.l */, (Object)dev.hixo.M.d.a("z", (Object)this, (long)199865626152747027L) /* => dev.hixo.M.s.D.F.f */, (long)70337776471491941L) /* => net.minecraft.class_2338.method_10093 */, (Object)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)199865626152747027L) /* => dev.hixo.M.s.D.F.f */, (long)150931043222020746L) /* => net.minecraft.class_2350.method_10153 */, (boolean)true, (long)42524948132683596L) /* => dev.hixo.f.L.E.I */ == false) {
            return;
        }
        class_3965 class_39652 = new class_3965((class_243)dev.hixo.M.d.a("$", (Object)this, (Object)dev.hixo.M.d.a("z", (Object)this, (long)195483603385007791L) /* => dev.hixo.M.s.D.F.l */, (Object)dev.hixo.M.d.a("z", (Object)this, (long)199865626152747027L) /* => dev.hixo.M.s.D.F.f */, (long)69963694134651287L) /* => dev.hixo.M.s.D.F.y */, (class_2350)dev.hixo.M.d.a("z", (Object)this, (long)199865626152747027L) /* => dev.hixo.M.s.D.F.f */, (class_2338)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)195483603385007791L) /* => dev.hixo.M.s.D.F.l */, (Object)dev.hixo.M.d.a("z", (Object)this, (long)199865626152747027L) /* => dev.hixo.M.s.D.F.f */, (long)70337776471491941L) /* => net.minecraft.class_2338.method_10093 */, false);
        dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("z", (Object)this, (long)108552105626612456L) /* => dev.hixo.M.s.D.F.P */, (long)100087742506519171L) /* => net.minecraft.class_310.field_1761 */, (Object)dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("z", (Object)this, (long)108552105626612456L) /* => dev.hixo.M.s.D.F.P */, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (Object)dev.hixo.M.d.a("z", (Object)this, (long)39392256730222825L) /* => dev.hixo.M.s.D.F.p */, (Object)class_39652, (long)105874227183593887L) /* => net.minecraft.class_636.method_2896 */;
        dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("z", (Object)this, (long)108552105626612456L) /* => dev.hixo.M.s.D.F.P */, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (Object)dev.hixo.M.d.a("z", (Object)this, (long)39392256730222825L) /* => dev.hixo.M.s.D.F.p */, (long)83963391352857873L) /* => net.minecraft.class_746.method_6104 */;
    }

    private class_2350 k(class_2338 class_23382) {
        for (CallSite callSite : dev.hixo.M.d.a("\u00f9", (long)104053693301277796L) /* => net.minecraft.class_2350.values */) {
            CallSite callSite2 = dev.hixo.M.d.a("$", (Object)class_23382, (Object)callSite, (long)70337776471491941L) /* => net.minecraft.class_2338.method_10093 */;
            CallSite callSite3 = dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("z", (Object)this, (long)108552105626612456L) /* => dev.hixo.M.s.D.F.P */, (long)38197671011210569L) /* => net.minecraft.class_310.field_1687 */, (Object)callSite2, (long)170782435888130580L) /* => net.minecraft.class_638.method_8320 */;
            if (dev.hixo.M.d.a("$", (Object)callSite3, (Object)dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("z", (Object)this, (long)108552105626612456L) /* => dev.hixo.M.s.D.F.P */, (long)38197671011210569L) /* => net.minecraft.class_310.field_1687 */, (Object)callSite2, (long)187769254462234295L) /* => net.minecraft.class_2680.method_26212 */ == false) continue;
            return dev.hixo.M.d.a("$", (Object)callSite, (long)150931043222020746L) /* => net.minecraft.class_2350.method_10153 */;
        }
        return null;
    }

    private int Q() {
        CallSite callSite = dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("z", (Object)this, (long)108552105626612456L) /* => dev.hixo.M.s.D.F.P */, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (long)166073668598036692L) /* => net.minecraft.class_746.method_6047 */;
        if (dev.hixo.M.d.a("$", (Object)this, (Object)callSite, (long)49087929872933779L) /* => dev.hixo.M.s.D.F.i */ != false) {
            dev.hixo.M.d.a("\u00e7", (Object)this, (class_1268)dev.hixo.M.d.a("\u00fd", (long)85943668217877665L) /* => net.minecraft.class_1268.field_5808 */, (long)39392256730222825L) /* => dev.hixo.M.s.D.F.p */;
            return (int)dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("z", (Object)this, (long)108552105626612456L) /* => dev.hixo.M.s.D.F.P */, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (long)154188433605680654L) /* => net.minecraft.class_746.method_31548 */, (long)155518450009451424L) /* => net.minecraft.class_1661.field_7545 */;
        }
        CallSite callSite2 = dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("z", (Object)this, (long)108552105626612456L) /* => dev.hixo.M.s.D.F.P */, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (long)73546619331198210L) /* => net.minecraft.class_746.method_6079 */;
        if (dev.hixo.M.d.a("$", (Object)this, (Object)callSite2, (long)49087929872933779L) /* => dev.hixo.M.s.D.F.i */ != false) {
            dev.hixo.M.d.a("\u00e7", (Object)this, (class_1268)dev.hixo.M.d.a("\u00fd", (long)74280917607947214L) /* => net.minecraft.class_1268.field_5810 */, (long)39392256730222825L) /* => dev.hixo.M.s.D.F.p */;
            return -1;
        }
        for (int i2 = 0; i2 <= 8; ++i2) {
            CallSite callSite3 = dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("z", (Object)this, (long)108552105626612456L) /* => dev.hixo.M.s.D.F.P */, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (long)154188433605680654L) /* => net.minecraft.class_746.method_31548 */, (int)i2, (long)104584719520783793L) /* => net.minecraft.class_1661.method_5438 */;
            if (dev.hixo.M.d.a("$", (Object)this, (Object)callSite3, (long)49087929872933779L) /* => dev.hixo.M.s.D.F.i */ == false) continue;
            dev.hixo.M.d.a("\u00e7", (Object)this, (class_1268)dev.hixo.M.d.a("\u00fd", (long)85943668217877665L) /* => net.minecraft.class_1268.field_5808 */, (long)39392256730222825L) /* => dev.hixo.M.s.D.F.p */;
            return i2;
        }
        return -2;
    }

    private boolean i(class_1799 class_17992) {
        if (class_17992 == null || dev.hixo.M.d.a("$", (Object)class_17992, (long)170246929245689750L) /* => net.minecraft.class_1799.method_7960 */ != false) {
            return false;
        }
        return dev.hixo.M.d.a("$", (Object)class_17992, (long)89510314790192383L) /* => net.minecraft.class_1799.method_7909 */ instanceof class_1747;
    }

    private class_243 y(class_2338 class_23382, class_2350 class_23502) {
        double d2 = (double)dev.hixo.M.d.a("$", (Object)class_23382, (long)146045060684696872L) /* => net.minecraft.class_2338.method_10263 */ + 0.5;
        double d3 = (double)dev.hixo.M.d.a("$", (Object)class_23382, (long)36264061574346644L) /* => net.minecraft.class_2338.method_10264 */ + 0.5;
        double d4 = (double)dev.hixo.M.d.a("$", (Object)class_23382, (long)141489615891003620L) /* => net.minecraft.class_2338.method_10260 */ + 0.5;
        switch (dev.hixo.M.d.a("\u00fd", (long)48259106305644980L) /* => dev.hixo.M.s.D.F$c.T */[dev.hixo.M.d.a("$", (Object)class_23502, (long)88069147782046080L) /* => net.minecraft.class_2350.ordinal */]) {
            case 1: {
                d3 += 0.5;
                break;
            }
            case 2: {
                d3 -= 0.5;
                break;
            }
            case 3: {
                d4 -= 0.5;
                break;
            }
            case 4: {
                d4 += 0.5;
                break;
            }
            case 5: {
                d2 -= 0.5;
                break;
            }
            case 6: {
                d2 += 0.5;
            }
        }
        return new class_243(d2, d3, d4);
    }

    private C q(class_243 class_2432, class_243 class_2433) {
        reference var3_3 = dev.hixo.M.d.a("z", (Object)class_2432, (long)114883955804304604L) /* => net.minecraft.class_243.field_1352 */ - dev.hixo.M.d.a("z", (Object)class_2433, (long)114883955804304604L) /* => net.minecraft.class_243.field_1352 */;
        reference var5_4 = dev.hixo.M.d.a("z", (Object)class_2432, (long)47504908757591323L) /* => net.minecraft.class_243.field_1351 */ - dev.hixo.M.d.a("z", (Object)class_2433, (long)47504908757591323L) /* => net.minecraft.class_243.field_1351 */;
        reference var7_5 = dev.hixo.M.d.a("z", (Object)class_2432, (long)171340593239983317L) /* => net.minecraft.class_243.field_1350 */ - dev.hixo.M.d.a("z", (Object)class_2433, (long)171340593239983317L) /* => net.minecraft.class_243.field_1350 */;
        return new C((float)dev.hixo.M.d.a("\u00f9", (double)dev.hixo.M.d.a("\u00f9", (double)var7_5, (double)var3_3, (long)130928682319801467L) /* => java.lang.Math.atan2 */, (long)59882655678323470L) /* => java.lang.Math.toDegrees */ - 90.0f, (float)(-dev.hixo.M.d.a("\u00f9", (double)dev.hixo.M.d.a("\u00f9", (double)var5_4, (double)dev.hixo.M.d.a("\u00f9", (double)(var3_3 * var3_3 + var7_5 * var7_5), (long)146319326606007315L) /* => java.lang.Math.sqrt */, (long)130928682319801467L) /* => java.lang.Math.atan2 */, (long)59882655678323470L) /* => java.lang.Math.toDegrees */));
    }

    @Override
    public int f() {
        return 100;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block14: {
            block13: {
                var7 = new String[2];
                var5_1 = 0;
                var4_2 = "Xj\u00175 =\r\u6392\u843b\u6594\u81ab\u52eb\u577d\u811f\u4e10\u6538\u65db\u5716\u81a9\u6504";
                var6_3 = "Xj\u00175 =\r\u6392\u843b\u6594\u81ab\u52eb\u577d\u811f\u4e10\u6538\u65db\u5716\u81a9\u6504".length();
                var3_4 = 6;
                var2_5 = -1;
lbl7:
                // 2 sources

                while (true) {
                    continue;
                    break;
                }
lbl9:
                // 1 sources

                while (true) {
                    var7[var5_1++] = new String(v0).intern();
                    if ((var2_5 += var3_4) < var6_3) {
                        var3_4 = var4_2.charAt(var2_5);
                        ** continue;
                    }
                    break block13;
                    break;
                }
                v1 = ++var2_5;
                v2 = var4_2.substring(v1, v1 + var3_4).toCharArray();
                v0 = v2;
                v3 = v2.length;
                var8_6 = 0;
                if (true) ** GOTO lbl48
                do {
                    v0 = v0;
                    v4 = var8_6;
                    v5 = v0[v4];
                    switch (var8_6 % 7) {
                        case 0: {
                            v6 = 27;
                            break;
                        }
                        case 1: {
                            v6 = 6;
                            break;
                        }
                        case 2: {
                            v6 = 98;
                            break;
                        }
                        case 3: {
                            v6 = 65;
                            break;
                        }
                        case 4: {
                            v6 = 67;
                            break;
                        }
                        case 5: {
                            v6 = 85;
                            break;
                        }
                        default: {
                            v6 = 5;
                        }
                    }
                    v0[v4] = (char)(v5 ^ v6);
                    ++var8_6;
lbl48:
                    // 2 sources

                    v3 = v3;
                } while (v3 > var8_6);
                ** while (true)
            }
            F.c = var7;
            break block14;
lbl56:
            // 1 sources

            while (true) {
                continue;
                break;
            }
        }
        var0_7 = 3147114319643268658L;
        ** while (true)
        F.d = 7660088128075344332L ^ var0_7;
    }
}

