/*
 * RESTORED SOURCE — decompiled reconstruction, not the original files.
 * class: dev.hixo.M.s.Y.T
 * identified as: KillAura
 * context strings: 'Smart Stealing' | 'container.enderchest' | 'KillAura' | 'Chest'
 */

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1703
 *  net.minecraft.class_1707
 *  net.minecraft.class_1708
 *  net.minecraft.class_1735
 *  net.minecraft.class_1738
 *  net.minecraft.class_1743
 *  net.minecraft.class_1747
 *  net.minecraft.class_1753
 *  net.minecraft.class_1764
 *  net.minecraft.class_1766
 *  net.minecraft.class_1787
 *  net.minecraft.class_1792
 *  net.minecraft.class_1799
 *  net.minecraft.class_1810
 *  net.minecraft.class_1821
 *  net.minecraft.class_1829
 *  net.minecraft.class_3858
 *  net.minecraft.class_437
 *  net.minecraft.class_465
 *  net.minecraft.class_476
 */
package dev.hixo.M.s.Y;

import dev.hixo.M.G;
import dev.hixo.M.K;
import dev.hixo.M.d;
import dev.hixo.M.s.Y.e;
import dev.hixo.T.E;
import dev.hixo.b.M;
import dev.hixo.b.g;
import dev.hixo.t.q.p_0;
import java.lang.invoke.CallSite;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import net.minecraft.class_1703;
import net.minecraft.class_1707;
import net.minecraft.class_1708;
import net.minecraft.class_1735;
import net.minecraft.class_1738;
import net.minecraft.class_1743;
import net.minecraft.class_1747;
import net.minecraft.class_1753;
import net.minecraft.class_1764;
import net.minecraft.class_1766;
import net.minecraft.class_1787;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1810;
import net.minecraft.class_1821;
import net.minecraft.class_1829;
import net.minecraft.class_3858;
import net.minecraft.class_437;
import net.minecraft.class_465;
import net.minecraft.class_476;

public class T
extends G {
    public static T i;
    public final M z;
    public final M c;
    public final g f;
    public final g g;
    public final g x;
    public final g t;
    public final g r;
    public final g m;
    public final g e;
    public final g k;
    public final g D;
    private final Random H;
    private class_437 E;
    private int M;
    private long q;
    private boolean R;
    private int U;
    private int J;
    private boolean A;
    private final List<Integer> Q;
    private static final String[] d;
    private static final long[] h;
    private static final Long[] l;

    public T() {
        String[] stringArray = d;
        super((K)((Object)dev.hixo.M.d.a("\u00fd", (long)121611970599608920L) /* => dev.hixo.M.K.PLAYER */), stringArray[20], stringArray[12]);
        this.z = new M(stringArray[5], 200.0, 0.0, 1000.0, 10.0);
        this.c = new M(stringArray[10], 2.0, 0.0, 10.0, 1.0);
        this.f = new g(stringArray[3], true);
        this.g = new g(stringArray[9], false);
        this.x = new g(stringArray[14], true);
        this.t = new g(stringArray[15], true);
        this.r = new g(stringArray[6], false);
        this.m = new g(stringArray[21], true);
        this.e = new g(stringArray[0], true);
        this.k = new g(stringArray[11], false);
        this.D = new g(stringArray[7], false);
        this.H = new Random();
        dev.hixo.M.d.a("\u00e7", (Object)this, (int)-1, (long)194652863765156669L) /* => dev.hixo.M.s.Y.T.U */;
        dev.hixo.M.d.a("\u00e7", (Object)this, (int)-1, (long)104372838819330154L) /* => dev.hixo.M.s.Y.T.J */;
        this.Q = new ArrayList<Integer>();
        dev.hixo.M.d.a("\u00c1", (T)this, (long)145436253962135926L) /* => dev.hixo.M.s.Y.T.i */;
        dev.hixo.M.d.a("$", (Object)this, (int)0, (long)113806433936288059L) /* => dev.hixo.M.G.z */;
    }

    public boolean k() {
        return dev.hixo.M.d.a("\u00f9", (long)171188797904017458L) /* => java.lang.System.currentTimeMillis */ - dev.hixo.M.d.a("z", (Object)this, (long)174515180241762591L) /* => dev.hixo.M.s.Y.T.q */ < T.a(29276, 3471357069416569038L);
    }

    private static boolean b(String string) {
        if (dev.hixo.M.d.a("\u00fd", (long)71498313283647962L) /* => dev.hixo.Hixo.INSTANCE */ == null || dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("\u00fd", (long)71498313283647962L) /* => dev.hixo.Hixo.INSTANCE */, (long)190425734249275754L) /* => dev.hixo.Hixo.getModuleManager */ == null) {
            return false;
        }
        CallSite callSite = dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("\u00fd", (long)71498313283647962L) /* => dev.hixo.Hixo.INSTANCE */, (long)190425734249275754L) /* => dev.hixo.Hixo.getModuleManager */, (Object)string, (long)66688803195857997L) /* => dev.hixo.M.n.X */;
        return callSite != null && dev.hixo.M.d.a("$", (Object)callSite, (long)96089342888548907L) /* => dev.hixo.M.G.c */ != false;
    }

    @Override
    public void a() {
        dev.hixo.M.d.a("$", (Object)this, (long)127393810712863238L) /* => dev.hixo.M.s.Y.T.y */;
        dev.hixo.M.d.a("$", (Object)this, (long)42324317685603166L) /* => dev.hixo.M.s.Y.T.g */;
        super.a();
    }

    private void y() {
        dev.hixo.M.d.a("\u00e7", (Object)this, (boolean)false, (long)174752204214280656L) /* => dev.hixo.M.s.Y.T.R */;
        dev.hixo.M.d.a("\u00e7", (Object)this, (int)-1, (long)194652863765156669L) /* => dev.hixo.M.s.Y.T.U */;
        dev.hixo.M.d.a("\u00e7", (Object)this, (int)-1, (long)104372838819330154L) /* => dev.hixo.M.s.Y.T.J */;
    }

    private void g() {
        dev.hixo.M.d.a("\u00e7", (Object)this, null, (long)134578840171415548L) /* => dev.hixo.M.s.Y.T.E */;
        dev.hixo.M.d.a("\u00e7", (Object)this, (int)0, (long)101938960958278662L) /* => dev.hixo.M.s.Y.T.M */;
        dev.hixo.M.d.a("\u00e7", (Object)this, (boolean)false, (long)152542202006462987L) /* => dev.hixo.M.s.Y.T.A */;
        dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)107786003207287454L) /* => dev.hixo.M.s.Y.T.Q */, (long)191130606908305482L) /* => java.util.List.clear */;
    }

    @E
    public void l(p_0 p_02) {
        CallSite callSite;
        class_465 class_4652;
        if (dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("$", (Object)p_02, (long)52512254813896748L) /* => dev.hixo.T.q.p.W */, (Object)dev.hixo.M.d.a("\u00fd", (long)199476637466971905L) /* => dev.hixo.T.S.PRE */, (long)115634047609526502L) /* => dev.hixo.T.S.equals */ == false) {
            return;
        }
        if (dev.hixo.M.d.a("$", (Object)this, (long)96089342888548907L) /* => dev.hixo.M.G.c */ == false) {
            return;
        }
        if (dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("\u00fd", (long)191291687252741418L) /* => dev.hixo.M.G.a */, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */ == null || dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("\u00fd", (long)191291687252741418L) /* => dev.hixo.M.G.a */, (long)38197671011210569L) /* => net.minecraft.class_310.field_1687 */ == null || dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("\u00fd", (long)191291687252741418L) /* => dev.hixo.M.G.a */, (long)100087742506519171L) /* => net.minecraft.class_310.field_1761 */ == null) {
            return;
        }
        if (dev.hixo.M.d.a("z", (Object)this, (long)174752204214280656L) /* => dev.hixo.M.s.Y.T.R */ != false) {
            if (dev.hixo.M.d.a("z", (Object)this, (long)194652863765156669L) /* => dev.hixo.M.s.Y.T.U */ >= 0 && dev.hixo.M.d.a("z", (Object)this, (long)104372838819330154L) /* => dev.hixo.M.s.Y.T.J */ >= 0 && dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("\u00fd", (long)191291687252741418L) /* => dev.hixo.M.G.a */, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (long)37655260268941768L) /* => net.minecraft.class_746.field_7512 */ != null && dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("\u00fd", (long)191291687252741418L) /* => dev.hixo.M.G.a */, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (long)37655260268941768L) /* => net.minecraft.class_746.field_7512 */, (long)56142133474744285L) /* => net.minecraft.class_1703.field_7763 */ == dev.hixo.M.d.a("z", (Object)this, (long)194652863765156669L) /* => dev.hixo.M.s.Y.T.U */) {
                dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("\u00fd", (long)191291687252741418L) /* => dev.hixo.M.G.a */, (long)100087742506519171L) /* => net.minecraft.class_310.field_1761 */, (int)dev.hixo.M.d.a("z", (Object)this, (long)194652863765156669L) /* => dev.hixo.M.s.Y.T.U */, (int)dev.hixo.M.d.a("z", (Object)this, (long)104372838819330154L) /* => dev.hixo.M.s.Y.T.J */, (int)0, (Object)dev.hixo.M.d.a("\u00fd", (long)140516247412983394L) /* => net.minecraft.class_1713.field_7794 */, (Object)dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("\u00fd", (long)191291687252741418L) /* => dev.hixo.M.G.a */, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (long)191544602413520913L) /* => net.minecraft.class_636.method_2906 */;
                dev.hixo.M.d.a("\u00e7", (Object)this, (long)dev.hixo.M.d.a("\u00f9", (long)171188797904017458L) /* => java.lang.System.currentTimeMillis */, (long)174515180241762591L) /* => dev.hixo.M.s.Y.T.q */;
            }
            dev.hixo.M.d.a("$", (Object)this, (long)127393810712863238L) /* => dev.hixo.M.s.Y.T.y */;
            return;
        }
        if (dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("\u00fd", (long)191291687252741418L) /* => dev.hixo.M.G.a */, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (long)151372364218672536L) /* => net.minecraft.class_746.method_5805 */ == false || dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("\u00fd", (long)191291687252741418L) /* => dev.hixo.M.G.a */, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (long)185690765282080613L) /* => net.minecraft.class_746.method_7325 */ != false) {
            return;
        }
        String[] stringArray = d;
        if (dev.hixo.M.d.a("\u00f9", stringArray[2], (long)94842154852054974L) /* => dev.hixo.M.s.Y.T.b */ != false) {
            return;
        }
        if (dev.hixo.M.d.a("\u00f9", d[16], (long)94842154852054974L) /* => dev.hixo.M.s.Y.T.b */ != false) {
            return;
        }
        CallSite callSite2 = dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("\u00fd", (long)191291687252741418L) /* => dev.hixo.M.G.a */, (long)99309607406877471L) /* => net.minecraft.class_310.field_1755 */;
        if (callSite2 == null) {
            dev.hixo.M.d.a("$", (Object)this, (long)42324317685603166L) /* => dev.hixo.M.s.Y.T.g */;
            return;
        }
        if (callSite2 != dev.hixo.M.d.a("z", (Object)this, (long)134578840171415548L) /* => dev.hixo.M.s.Y.T.E */) {
            dev.hixo.M.d.a("\u00e7", (Object)this, (class_437)callSite2, (long)134578840171415548L) /* => dev.hixo.M.s.Y.T.E */;
            dev.hixo.M.d.a("\u00e7", (Object)this, (int)0, (long)101938960958278662L) /* => dev.hixo.M.s.Y.T.M */;
            dev.hixo.M.d.a("\u00e7", (Object)this, (boolean)false, (long)152542202006462987L) /* => dev.hixo.M.s.Y.T.A */;
            dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)107786003207287454L) /* => dev.hixo.M.s.Y.T.Q */, (long)191130606908305482L) /* => java.util.List.clear */;
            dev.hixo.M.d.a("\u00e7", (Object)this, (long)dev.hixo.M.d.a("\u00f9", (long)171188797904017458L) /* => java.lang.System.currentTimeMillis */, (long)174515180241762591L) /* => dev.hixo.M.s.Y.T.q */;
            return;
        }
        T t2 = this;
        reference v1 = dev.hixo.M.d.a("z", (Object)t2, (long)101938960958278662L) /* => dev.hixo.M.s.Y.T.M */ + true;
        dev.hixo.M.d.a("\u00e7", (Object)t2, (int)v1, (long)101938960958278662L) /* => dev.hixo.M.s.Y.T.M */;
        if (v1 < dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)159470712979855818L) /* => dev.hixo.M.s.Y.T.c */, (long)105488653926114013L) /* => dev.hixo.b.M.i */) {
            return;
        }
        if (dev.hixo.M.d.a("\u00f9", (long)171188797904017458L) /* => java.lang.System.currentTimeMillis */ - dev.hixo.M.d.a("z", (Object)this, (long)174515180241762591L) /* => dev.hixo.M.s.Y.T.q */ < (long)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)141844961375670139L) /* => dev.hixo.M.s.Y.T.z */, (long)120513388240390397L) /* => dev.hixo.b.M.K */) {
            return;
        }
        if (callSite2 instanceof class_465) {
            class_4652 = (class_465)callSite2;
            v2 = dev.hixo.M.d.a("$", (Object)class_4652, (long)72572767161980820L) /* => net.minecraft.class_465.method_17577 */;
        } else {
            v2 = callSite = null;
        }
        if (callSite == null) {
            return;
        }
        if (callSite2 instanceof class_476) {
            class_4652 = (class_476)callSite2;
            if (dev.hixo.M.d.a("$", (Object)this, (Object)class_4652, (long)92871486625602684L) /* => dev.hixo.M.s.Y.T.Q */ != false) {
                dev.hixo.M.d.a("$", (Object)this, (Object)callSite, (int)(dev.hixo.M.d.a("$", (Object)((class_1707)dev.hixo.M.d.a("$", (Object)class_4652, (long)148709250912587627L) /* => net.minecraft.class_476.method_17577 */), (long)45541628411288980L) /* => net.minecraft.class_1707.method_17388 */ * 9), (long)157621245597491865L) /* => dev.hixo.M.s.Y.T.B */;
            }
        } else if (callSite instanceof class_3858) {
            if (dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)62842254143861851L) /* => dev.hixo.M.s.Y.T.x */, (long)65580906021680841L) /* => dev.hixo.b.g.x */ != false) {
                dev.hixo.M.d.a("$", (Object)this, (Object)callSite, (int)3, (long)157621245597491865L) /* => dev.hixo.M.s.Y.T.B */;
            }
        } else if (callSite instanceof class_1708 && dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)183775736534074719L) /* => dev.hixo.M.s.Y.T.t */, (long)65580906021680841L) /* => dev.hixo.b.g.x */ != false) {
            dev.hixo.M.d.a("$", (Object)this, (Object)callSite, (int)5, (long)157621245597491865L) /* => dev.hixo.M.s.Y.T.B */;
        }
    }

    private boolean Q(class_476 class_4762) {
        String[] stringArray;
        CallSite callSite = dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("$", (Object)class_4762, (long)111820988290306886L) /* => net.minecraft.class_476.method_25440 */, (long)122260847307190419L) /* => net.minecraft.class_2561.getString */;
        if (dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)181408498257878760L) /* => dev.hixo.M.s.Y.T.f */, (long)65580906021680841L) /* => dev.hixo.b.g.x */ != false && (dev.hixo.M.d.a("$", (Object)callSite, (Object)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("\u00f9", (stringArray = d)[18], (long)127669030070406359L) /* => net.minecraft.class_2561.method_43471 */, (long)52478150711542090L) /* => net.minecraft.class_5250.getString */, (long)130616148886603248L) /* => java.lang.String.equals */ != false || dev.hixo.M.d.a("$", (Object)callSite, (Object)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("\u00f9", stringArray[8], (long)127669030070406359L) /* => net.minecraft.class_2561.method_43471 */, (long)52478150711542090L) /* => net.minecraft.class_5250.getString */, (long)130616148886603248L) /* => java.lang.String.equals */ != false || dev.hixo.M.d.a("$", (Object)callSite, (Object)stringArray[17], (long)106044803757638707L) /* => java.lang.String.equalsIgnoreCase */ != false || dev.hixo.M.d.a("$", (Object)callSite, (Object)stringArray[19], (long)130616148886603248L) /* => java.lang.String.equals */ != false)) {
            return true;
        }
        return dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)120175829240382041L) /* => dev.hixo.M.s.Y.T.g */, (long)65580906021680841L) /* => dev.hixo.b.g.x */ != false && (dev.hixo.M.d.a("$", (Object)callSite, (Object)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("\u00f9", (stringArray = d)[1], (long)127669030070406359L) /* => net.minecraft.class_2561.method_43471 */, (long)52478150711542090L) /* => net.minecraft.class_5250.getString */, (long)130616148886603248L) /* => java.lang.String.equals */ != false || dev.hixo.M.d.a("$", (Object)callSite, (Object)stringArray[4], (long)106044803757638707L) /* => java.lang.String.equalsIgnoreCase */ != false || dev.hixo.M.d.a("$", (Object)callSite, (Object)stringArray[13], (long)130616148886603248L) /* => java.lang.String.equals */ != false);
    }

    private void B(class_1703 class_17032, int n2) {
        if (dev.hixo.M.d.a("z", (Object)class_17032, (long)56142133474744285L) /* => net.minecraft.class_1703.field_7763 */ != dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("\u00fd", (long)191291687252741418L) /* => dev.hixo.M.G.a */, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (long)37655260268941768L) /* => net.minecraft.class_746.field_7512 */, (long)56142133474744285L) /* => net.minecraft.class_1703.field_7763 */) {
            return;
        }
        CallSite callSite = dev.hixo.M.d.a("z", (Object)class_17032, (long)56142133474744285L) /* => net.minecraft.class_1703.field_7763 */;
        if (dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)193845349375113178L) /* => dev.hixo.M.s.Y.T.e */, (long)65580906021680841L) /* => dev.hixo.b.g.x */ != false) {
            if (dev.hixo.M.d.a("z", (Object)this, (long)152542202006462987L) /* => dev.hixo.M.s.Y.T.A */ == false) {
                dev.hixo.M.d.a("$", (Object)this, (Object)class_17032, (int)n2, (long)45059346977164612L) /* => dev.hixo.M.s.Y.T.P */;
                dev.hixo.M.d.a("\u00e7", (Object)this, (boolean)true, (long)152542202006462987L) /* => dev.hixo.M.s.Y.T.A */;
            }
            while (dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)107786003207287454L) /* => dev.hixo.M.s.Y.T.Q */, (long)184224858935663280L) /* => java.util.List.isEmpty */ == false) {
                CallSite callSite2 = dev.hixo.M.d.a("$", (Object)((Integer)((Object)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)107786003207287454L) /* => dev.hixo.M.s.Y.T.Q */, (int)0, (long)196824017790916210L) /* => java.util.List.get */)), (long)38093469531709351L) /* => java.lang.Integer.intValue */;
                if (callSite2 >= 0 && callSite2 < dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)class_17032, (long)88771810064670855L) /* => net.minecraft.class_1703.field_7761 */, (long)195026751000670779L) /* => net.minecraft.class_2371.size */ && dev.hixo.M.d.a("$", (Object)((class_1735)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)class_17032, (long)88771810064670855L) /* => net.minecraft.class_1703.field_7761 */, (int)callSite2, (long)197380470797379505L) /* => net.minecraft.class_2371.get */), (long)41854009789147124L) /* => net.minecraft.class_1735.method_7681 */ != false) {
                    dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)107786003207287454L) /* => dev.hixo.M.s.Y.T.Q */, (int)0, (long)169315812468628486L) /* => java.util.List.remove */;
                    dev.hixo.M.d.a("$", (Object)this, (int)callSite, (int)callSite2, (long)42062176305890670L) /* => dev.hixo.M.s.Y.T.l */;
                    return;
                }
                dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)107786003207287454L) /* => dev.hixo.M.s.Y.T.Q */, (int)0, (long)169315812468628486L) /* => java.util.List.remove */;
            }
            if (dev.hixo.M.d.a("$", (Object)this, (Object)class_17032, (int)n2, (long)32171442957607293L) /* => dev.hixo.M.s.Y.T.u */ != false) {
                dev.hixo.M.d.a("$", (Object)this, (long)159734488721458407L) /* => dev.hixo.M.s.Y.T.W */;
            }
            return;
        }
        CallSite callSite3 = dev.hixo.M.d.a("$", (Object)this, (Object)class_17032, (int)n2, (long)177488712021961861L) /* => dev.hixo.M.s.Y.T.d */;
        if (dev.hixo.M.d.a("$", (Object)callSite3, (long)184224858935663280L) /* => java.util.List.isEmpty */ != false) {
            dev.hixo.M.d.a("$", (Object)this, (long)159734488721458407L) /* => dev.hixo.M.s.Y.T.W */;
            return;
        }
        CallSite callSite4 = dev.hixo.M.d.a("$", (Object)(dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)33055784153617563L) /* => dev.hixo.M.s.Y.T.k */, (long)65580906021680841L) /* => dev.hixo.b.g.x */ != false && dev.hixo.M.d.a("$", (Object)callSite3, (long)180194190084079702L) /* => java.util.List.size */ > true ? (Integer)((Object)dev.hixo.M.d.a("$", (Object)callSite3, (int)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)159746355098284193L) /* => dev.hixo.M.s.Y.T.H */, (int)dev.hixo.M.d.a("$", (Object)callSite3, (long)180194190084079702L) /* => java.util.List.size */, (long)53070103815470834L) /* => java.util.Random.nextInt */, (long)196824017790916210L) /* => java.util.List.get */) : (Integer)((Object)dev.hixo.M.d.a("$", (Object)callSite3, (int)0, (long)196824017790916210L) /* => java.util.List.get */)), (long)38093469531709351L) /* => java.lang.Integer.intValue */;
        dev.hixo.M.d.a("$", (Object)this, (int)callSite, (int)callSite4, (long)42062176305890670L) /* => dev.hixo.M.s.Y.T.l */;
    }

    private void l(int n2, int n3) {
        dev.hixo.M.d.a("\u00e7", (Object)this, (boolean)true, (long)174752204214280656L) /* => dev.hixo.M.s.Y.T.R */;
        dev.hixo.M.d.a("\u00e7", (Object)this, (int)n2, (long)194652863765156669L) /* => dev.hixo.M.s.Y.T.U */;
        dev.hixo.M.d.a("\u00e7", (Object)this, (int)n3, (long)104372838819330154L) /* => dev.hixo.M.s.Y.T.J */;
    }

    private void W() {
        if (dev.hixo.M.d.a("z", (Object)this, (long)174752204214280656L) /* => dev.hixo.M.s.Y.T.R */ != false) {
            return;
        }
        if (dev.hixo.M.d.a("\u00f9", (long)171188797904017458L) /* => java.lang.System.currentTimeMillis */ - dev.hixo.M.d.a("z", (Object)this, (long)174515180241762591L) /* => dev.hixo.M.s.Y.T.q */ < T.a(7921, 5136122585621722210L)) {
            return;
        }
        if (dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("\u00fd", (long)191291687252741418L) /* => dev.hixo.M.G.a */, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */ != null) {
            dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("\u00fd", (long)191291687252741418L) /* => dev.hixo.M.G.a */, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (long)85692694474582862L) /* => net.minecraft.class_746.method_7346 */;
        }
    }

    private void P(class_1703 class_17032, int n2) {
        block6: {
            Object object;
            dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)107786003207287454L) /* => dev.hixo.M.s.Y.T.Q */, (long)191130606908305482L) /* => java.util.List.clear */;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            ArrayList arrayList5 = new ArrayList();
            ArrayList arrayList6 = new ArrayList();
            ArrayList arrayList7 = new ArrayList();
            ArrayList arrayList8 = new ArrayList();
            int n3 = dev.hixo.M.s.Y.e.G;
            ArrayList arrayList9 = new ArrayList();
            int n4 = 0;
            while (n4 < n2 && n4 < dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)class_17032, (long)88771810064670855L) /* => net.minecraft.class_1703.field_7761 */, (long)195026751000670779L) /* => net.minecraft.class_2371.size */) {
                block7: {
                    block8: {
                        CallSite callSite;
                        block29: {
                            CallSite callSite2;
                            block27: {
                                CallSite callSite3;
                                block28: {
                                    block26: {
                                        block25: {
                                            block23: {
                                                block24: {
                                                    block21: {
                                                        Object object2;
                                                        block22: {
                                                            CallSite callSite4;
                                                            block19: {
                                                                block20: {
                                                                    block17: {
                                                                        block18: {
                                                                            block15: {
                                                                                block16: {
                                                                                    block13: {
                                                                                        block14: {
                                                                                            Object object3;
                                                                                            block11: {
                                                                                                block12: {
                                                                                                    block9: {
                                                                                                        block10: {
                                                                                                            object = dev.hixo.M.d.a("$", (Object)((class_1735)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)class_17032, (long)88771810064670855L) /* => net.minecraft.class_1703.field_7761 */, (int)n4, (long)197380470797379505L) /* => net.minecraft.class_2371.get */), (long)81779526580939260L) /* => net.minecraft.class_1735.method_7677 */;
                                                                                                            if (n3 != 0) break block7;
                                                                                                            if (dev.hixo.M.d.a("$", (Object)object, (long)170246929245689750L) /* => net.minecraft.class_1799.method_7960 */ != false || dev.hixo.M.d.a("$", (Object)this, (Object)object, (long)135350643181452070L) /* => dev.hixo.M.s.Y.T.b */ == false) break block8;
                                                                                                            callSite3 = dev.hixo.M.d.a("$", (Object)object, (long)89510314790192383L) /* => net.minecraft.class_1799.method_7909 */;
                                                                                                            if (n3 != 0) break block9;
                                                                                                            if (dev.hixo.M.d.a("\u00f9", (Object)object, (long)201910874354915171L) /* => dev.hixo.f.K.F.o */ != false) break block10;
                                                                                                            object3 = dev.hixo.M.d.a("\u00f9", (Object)object, (long)160521303720884971L) /* => dev.hixo.f.K.F.O */;
                                                                                                            if (n3 != 0) break block11;
                                                                                                            if (!object3) break block12;
                                                                                                        }
                                                                                                        dev.hixo.M.d.a("$", arrayList, (Object)dev.hixo.M.d.a("\u00f9", (int)n4, (long)67104637941965968L) /* => java.lang.Integer.valueOf */, (long)184435215000867819L) /* => java.util.List.add */;
                                                                                                    }
                                                                                                    if (n3 == 0) break block8;
                                                                                                }
                                                                                                callSite4 = callSite3;
                                                                                                if (n3 != 0) break block13;
                                                                                                object3 = callSite4 instanceof class_1738;
                                                                                            }
                                                                                            if (!object3) break block14;
                                                                                            dev.hixo.M.d.a("$", arrayList2, (Object)dev.hixo.M.d.a("\u00f9", (int)n4, (long)67104637941965968L) /* => java.lang.Integer.valueOf */, (long)184435215000867819L) /* => java.util.List.add */;
                                                                                            if (n3 == 0) break block8;
                                                                                        }
                                                                                        callSite4 = callSite3;
                                                                                    }
                                                                                    if (n3 != 0) break block15;
                                                                                    if (!(callSite4 instanceof class_1829)) break block16;
                                                                                    dev.hixo.M.d.a("$", arrayList3, (Object)dev.hixo.M.d.a("\u00f9", (int)n4, (long)67104637941965968L) /* => java.lang.Integer.valueOf */, (long)184435215000867819L) /* => java.util.List.add */;
                                                                                    if (n3 == 0) break block8;
                                                                                }
                                                                                callSite4 = callSite3;
                                                                            }
                                                                            if (n3 != 0) break block17;
                                                                            if (!(callSite4 instanceof class_1753)) break block18;
                                                                            dev.hixo.M.d.a("$", arrayList4, (Object)dev.hixo.M.d.a("\u00f9", (int)n4, (long)67104637941965968L) /* => java.lang.Integer.valueOf */, (long)184435215000867819L) /* => java.util.List.add */;
                                                                            if (n3 == 0) break block8;
                                                                        }
                                                                        callSite4 = callSite3;
                                                                    }
                                                                    if (n3 != 0) break block19;
                                                                    if (!(callSite4 instanceof class_1764)) break block20;
                                                                    dev.hixo.M.d.a("$", arrayList5, (Object)dev.hixo.M.d.a("\u00f9", (int)n4, (long)67104637941965968L) /* => java.lang.Integer.valueOf */, (long)184435215000867819L) /* => java.util.List.add */;
                                                                    if (n3 == 0) break block8;
                                                                }
                                                                callSite4 = callSite3;
                                                            }
                                                            object2 = callSite4 instanceof class_1810;
                                                            if (n3 != 0) break block21;
                                                            if (object2) break block22;
                                                            object2 = callSite3 instanceof class_1743;
                                                            if (n3 != 0) break block21;
                                                            if (object2) break block22;
                                                            callSite2 = callSite3;
                                                            if (n3 != 0) break block23;
                                                            if (!(callSite2 instanceof class_1821)) break block24;
                                                        }
                                                        object2 = dev.hixo.M.d.a("$", arrayList6, (Object)dev.hixo.M.d.a("\u00f9", (int)n4, (long)67104637941965968L) /* => java.lang.Integer.valueOf */, (long)184435215000867819L) /* => java.util.List.add */;
                                                    }
                                                    if (n3 == 0) break block8;
                                                }
                                                callSite2 = callSite3;
                                            }
                                            if (n3 != 0) break block25;
                                            if (callSite2 == dev.hixo.M.d.a("\u00fd", (long)122456730208592996L) /* => net.minecraft.class_1802.field_8463 */) break block26;
                                            callSite2 = callSite3;
                                        }
                                        if (n3 != 0) break block27;
                                        if (callSite2 != dev.hixo.M.d.a("\u00fd", (long)111024180222016096L) /* => net.minecraft.class_1802.field_8367 */) break block28;
                                    }
                                    dev.hixo.M.d.a("$", arrayList7, (Object)dev.hixo.M.d.a("\u00f9", (int)n4, (long)67104637941965968L) /* => java.lang.Integer.valueOf */, (long)184435215000867819L) /* => java.util.List.add */;
                                    if (n3 == 0) break block8;
                                }
                                callSite2 = callSite3;
                            }
                            callSite = dev.hixo.M.d.a("\u00f9", (Object)callSite2, (long)183206003259748055L) /* => dev.hixo.M.s.Y.T.u */;
                            if (n3 != 0) break block8;
                            if (callSite == false) break block29;
                            dev.hixo.M.d.a("$", arrayList8, (Object)dev.hixo.M.d.a("\u00f9", (int)n4, (long)67104637941965968L) /* => java.lang.Integer.valueOf */, (long)184435215000867819L) /* => java.util.List.add */;
                            if (n3 == 0) break block8;
                        }
                        callSite = dev.hixo.M.d.a("$", arrayList9, (Object)dev.hixo.M.d.a("\u00f9", (int)n4, (long)67104637941965968L) /* => java.lang.Integer.valueOf */, (long)184435215000867819L) /* => java.util.List.add */;
                    }
                    ++n4;
                }
                if (n3 == 0) continue;
            }
            CallSite callSite = dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("\u00f9", arrayList, arrayList2, arrayList3, arrayList4, arrayList5, arrayList6, (long)195552930501041794L) /* => java.util.List.of */, (long)113221006393852506L) /* => java.util.List.iterator */;
            while (dev.hixo.M.d.a("$", (Object)callSite, (long)175361412755674352L) /* => java.util.Iterator.hasNext */ != false) {
                block33: {
                    T t2;
                    block30: {
                        block31: {
                            Object object4;
                            block32: {
                                object = (List)((Object)dev.hixo.M.d.a("$", (Object)callSite, (long)64633749944946827L) /* => java.util.Iterator.next */);
                                if (n3 != 0) break block6;
                                t2 = this;
                                if (n3 != 0) break block30;
                                dev.hixo.M.d.a("$", (Object)t2, (Object)class_17032, (Object)object, (long)108268222961058778L) /* => dev.hixo.M.s.Y.T.o */;
                                if (dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)153605205639977444L) /* => dev.hixo.M.s.Y.T.m */, (long)65580906021680841L) /* => dev.hixo.b.g.x */ == false) break block31;
                                object4 = object;
                                if (n3 != 0) break block32;
                                if (dev.hixo.M.d.a("$", (Object)object4, (long)184224858935663280L) /* => java.util.List.isEmpty */ != false) break block33;
                                object4 = dev.hixo.M.d.a("z", (Object)this, (long)107786003207287454L) /* => dev.hixo.M.s.Y.T.Q */;
                            }
                            dev.hixo.M.d.a("$", (Object)object4, (Object)((Integer)((Object)dev.hixo.M.d.a("$", (Object)object, (int)0, (long)196824017790916210L) /* => java.util.List.get */)), (long)184435215000867819L) /* => java.util.List.add */;
                            if (n3 == 0) break block33;
                        }
                        t2 = this;
                    }
                    dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)t2, (long)107786003207287454L) /* => dev.hixo.M.s.Y.T.Q */, (Object)object, (long)136382452326560341L) /* => java.util.List.addAll */;
                }
                if (n3 == 0) continue;
            }
            dev.hixo.M.d.a("$", (Object)this, (Object)class_17032, arrayList7, (long)108268222961058778L) /* => dev.hixo.M.s.Y.T.o */;
            dev.hixo.M.d.a("$", (Object)this, (Object)class_17032, arrayList8, (long)108268222961058778L) /* => dev.hixo.M.s.Y.T.o */;
            dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)107786003207287454L) /* => dev.hixo.M.s.Y.T.Q */, arrayList7, (long)136382452326560341L) /* => java.util.List.addAll */;
            dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)107786003207287454L) /* => dev.hixo.M.s.Y.T.Q */, arrayList8, (long)136382452326560341L) /* => java.util.List.addAll */;
            dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)107786003207287454L) /* => dev.hixo.M.s.Y.T.Q */, arrayList9, (long)136382452326560341L) /* => java.util.List.addAll */;
        }
    }

    private static boolean u(class_1792 class_17922) {
        return class_17922 == dev.hixo.M.d.a("\u00fd", (long)132224845231862353L) /* => net.minecraft.class_1802.field_8786 */ || class_17922 == dev.hixo.M.d.a("\u00fd", (long)106548144337793850L) /* => net.minecraft.class_1802.field_8634 */ || class_17922 == dev.hixo.M.d.a("\u00fd", (long)164922844483618895L) /* => net.minecraft.class_1802.field_8107 */ || class_17922 == dev.hixo.M.d.a("\u00fd", (long)113484932722590047L) /* => net.minecraft.class_1802.field_8543 */ || class_17922 == dev.hixo.M.d.a("\u00fd", (long)186173826148335931L) /* => net.minecraft.class_1802.field_8803 */ || class_17922 == dev.hixo.M.d.a("\u00fd", (long)92763934931841227L) /* => net.minecraft.class_1802.field_8705 */ || class_17922 == dev.hixo.M.d.a("\u00fd", (long)139070299611821486L) /* => net.minecraft.class_1802.field_8187 */ || class_17922 == dev.hixo.M.d.a("\u00fd", (long)76644951499184003L) /* => net.minecraft.class_1802.field_8251 */ || class_17922 instanceof class_1787;
    }

    private void o(class_1703 class_17032, List<Integer> list) {
        dev.hixo.M.d.a("$", list, (Object)dev.hixo.M.d.a("\u00f9", n2 -> (double)(-dev.hixo.M.d.a("\u00f9", (Object)dev.hixo.M.d.a("$", (Object)((class_1735)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)class_17032, (long)88771810064670855L) /* => net.minecraft.class_1703.field_7761 */, (int)dev.hixo.M.d.a("$", (Object)n2, (long)38093469531709351L) /* => java.lang.Integer.intValue */, (long)197380470797379505L) /* => net.minecraft.class_2371.get */), (long)81779526580939260L) /* => net.minecraft.class_1735.method_7677 */, (long)130266676083848364L) /* => dev.hixo.M.s.Y.T.c */), (long)65351219141088406L) /* => java.util.Comparator.comparingDouble */, (long)195104403147929230L) /* => java.util.List.sort */;
    }

    private List<Integer> d(class_1703 class_17032, int n2) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (int i2 = 0; i2 < n2 && i2 < dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)class_17032, (long)88771810064670855L) /* => net.minecraft.class_1703.field_7761 */, (long)195026751000670779L) /* => net.minecraft.class_2371.size */; ++i2) {
            CallSite callSite = dev.hixo.M.d.a("$", (Object)((class_1735)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)class_17032, (long)88771810064670855L) /* => net.minecraft.class_1703.field_7761 */, (int)i2, (long)197380470797379505L) /* => net.minecraft.class_2371.get */), (long)81779526580939260L) /* => net.minecraft.class_1735.method_7677 */;
            if (dev.hixo.M.d.a("$", (Object)callSite, (long)170246929245689750L) /* => net.minecraft.class_1799.method_7960 */ != false || dev.hixo.M.d.a("$", (Object)this, (Object)callSite, (long)135350643181452070L) /* => dev.hixo.M.s.Y.T.b */ == false) continue;
            dev.hixo.M.d.a("$", arrayList, (Object)dev.hixo.M.d.a("\u00f9", (int)i2, (long)67104637941965968L) /* => java.lang.Integer.valueOf */, (long)184435215000867819L) /* => java.util.List.add */;
        }
        return arrayList;
    }

    private boolean u(class_1703 class_17032, int n2) {
        for (int i2 = 0; i2 < n2 && i2 < dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)class_17032, (long)88771810064670855L) /* => net.minecraft.class_1703.field_7761 */, (long)195026751000670779L) /* => net.minecraft.class_2371.size */; ++i2) {
            CallSite callSite = dev.hixo.M.d.a("$", (Object)((class_1735)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)class_17032, (long)88771810064670855L) /* => net.minecraft.class_1703.field_7761 */, (int)i2, (long)197380470797379505L) /* => net.minecraft.class_2371.get */), (long)81779526580939260L) /* => net.minecraft.class_1735.method_7677 */;
            if (dev.hixo.M.d.a("$", (Object)callSite, (long)170246929245689750L) /* => net.minecraft.class_1799.method_7960 */ != false || dev.hixo.M.d.a("$", (Object)this, (Object)callSite, (long)135350643181452070L) /* => dev.hixo.M.s.Y.T.b */ == false) continue;
            return false;
        }
        return true;
    }

    private boolean b(class_1799 class_17992) {
        if (dev.hixo.M.d.a("$", (Object)class_17992, (long)170246929245689750L) /* => net.minecraft.class_1799.method_7960 */ != false) {
            return false;
        }
        CallSite callSite = dev.hixo.M.d.a("$", (Object)class_17992, (long)89510314790192383L) /* => net.minecraft.class_1799.method_7909 */;
        if (callSite instanceof class_1787 && dev.hixo.M.d.a("\u00f9", (Object)dev.hixo.M.d.a("\u00fd", (long)63887877278139842L) /* => net.minecraft.class_1802.field_8378 */, (long)34453578974532597L) /* => dev.hixo.f.K.F.A */ >= dev.hixo.M.d.a("\u00f9", (long)167905662936431494L) /* => dev.hixo.f.K.F.I */) {
            return false;
        }
        if (callSite instanceof class_1747 && callSite != dev.hixo.M.d.a("\u00fd", (long)132224845231862353L) /* => net.minecraft.class_1802.field_8786 */ && dev.hixo.M.d.a("\u00f9", (long)126020998135604266L) /* => dev.hixo.f.K.F.D */ + dev.hixo.M.d.a("$", (Object)class_17992, (long)153993080313702192L) /* => net.minecraft.class_1799.method_7947 */ > dev.hixo.M.d.a("\u00f9", (long)149514644277117945L) /* => dev.hixo.f.K.F.T */) {
            return false;
        }
        if (dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)153605205639977444L) /* => dev.hixo.M.s.Y.T.m */, (long)65580906021680841L) /* => dev.hixo.b.g.x */ == false) {
            return dev.hixo.M.d.a("\u00f9", (Object)class_17992, (long)170888749505623464L) /* => dev.hixo.M.s.Y.T.N */ != false || dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)77778394044752085L) /* => dev.hixo.M.s.Y.T.r */, (long)65580906021680841L) /* => dev.hixo.b.g.x */ != false;
        }
        if (dev.hixo.M.d.a("\u00f9", (Object)class_17992, (long)201910874354915171L) /* => dev.hixo.f.K.F.o */ != false || dev.hixo.M.d.a("\u00f9", (Object)class_17992, (long)160521303720884971L) /* => dev.hixo.f.K.F.O */ != false) {
            return true;
        }
        if (callSite instanceof class_1829 || callSite instanceof class_1766 || callSite instanceof class_1738 || callSite instanceof class_1753 || callSite instanceof class_1764) {
            return (boolean)dev.hixo.M.d.a("$", (Object)this, (Object)class_17992, (long)197269375883078351L) /* => dev.hixo.M.s.Y.T.B */;
        }
        return dev.hixo.M.d.a("\u00f9", (Object)class_17992, (long)170888749505623464L) /* => dev.hixo.M.s.Y.T.N */ != false || dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)77778394044752085L) /* => dev.hixo.M.s.Y.T.r */, (long)65580906021680841L) /* => dev.hixo.b.g.x */ != false;
    }

    private boolean B(class_1799 class_17992) {
        CallSite callSite = dev.hixo.M.d.a("$", (Object)class_17992, (long)89510314790192383L) /* => net.minecraft.class_1799.method_7909 */;
        if (callSite instanceof class_1738) {
            CallSite callSite2 = dev.hixo.M.d.a("\u00f9", (Object)class_17992, (long)124610365207747468L) /* => dev.hixo.f.K.F.j */;
            return callSite2 != null && dev.hixo.M.d.a("\u00f9", (Object)class_17992, (long)126097513002051163L) /* => dev.hixo.f.K.F.N */ > dev.hixo.M.d.a("\u00f9", (Object)callSite2, (long)199747245828903076L) /* => dev.hixo.f.K.F.Z */ + 0.1f;
        }
        if (callSite instanceof class_1829) {
            return dev.hixo.M.d.a("\u00f9", (Object)class_17992, (long)184985467648913989L) /* => dev.hixo.f.K.F.u */ > dev.hixo.M.d.a("\u00f9", (long)170968721149368074L) /* => dev.hixo.f.K.F.z */;
        }
        if (callSite instanceof class_1810) {
            return dev.hixo.M.d.a("\u00f9", (Object)class_17992, (long)54848740956213303L) /* => dev.hixo.f.K.F.G */ > dev.hixo.M.d.a("\u00f9", (long)67768076820444371L) /* => dev.hixo.f.K.F.U */;
        }
        if (callSite instanceof class_1743) {
            if (dev.hixo.M.d.a("\u00f9", (Object)class_17992, (long)193911180360957346L) /* => dev.hixo.f.K.F.W */ != false) {
                CallSite callSite3 = dev.hixo.M.d.a("\u00f9", (long)42949420258372771L) /* => dev.hixo.f.K.F.K */;
                float f = callSite3 != null ? (float)dev.hixo.M.d.a("\u00f9", (Object)callSite3, (long)118798994153244870L) /* => dev.hixo.f.K.F.p */ : 0.0f;
                return dev.hixo.M.d.a("\u00f9", (Object)class_17992, (long)118798994153244870L) /* => dev.hixo.f.K.F.p */ > f;
            }
            return dev.hixo.M.d.a("\u00f9", (Object)class_17992, (long)54848740956213303L) /* => dev.hixo.f.K.F.G */ > dev.hixo.M.d.a("\u00f9", (long)58138108518868276L) /* => dev.hixo.f.K.F.p */;
        }
        if (callSite instanceof class_1821) {
            return dev.hixo.M.d.a("\u00f9", (Object)class_17992, (long)54848740956213303L) /* => dev.hixo.f.K.F.G */ > dev.hixo.M.d.a("\u00f9", (long)151281346742595753L) /* => dev.hixo.f.K.F.e */;
        }
        if (callSite instanceof class_1753) {
            if (dev.hixo.M.d.a("\u00f9", (Object)class_17992, (long)165263251292953970L) /* => dev.hixo.f.K.F.i */ != false) {
                return dev.hixo.M.d.a("\u00f9", (Object)class_17992, (long)184854238930973389L) /* => dev.hixo.f.K.F.a */ > dev.hixo.M.d.a("\u00f9", (long)131721400082171681L) /* => dev.hixo.f.K.F.P */;
            }
            if (dev.hixo.M.d.a("\u00f9", (Object)class_17992, (long)188160110519828618L) /* => dev.hixo.f.K.F.l */ != false) {
                return dev.hixo.M.d.a("\u00f9", (Object)class_17992, (long)179440445794160744L) /* => dev.hixo.f.K.F.J */ > dev.hixo.M.d.a("\u00f9", (long)48605450216338181L) /* => dev.hixo.f.K.F.S */;
            }
        } else if (callSite instanceof class_1764) {
            return dev.hixo.M.d.a("\u00f9", (Object)class_17992, (long)167543402615369697L) /* => dev.hixo.f.K.F.H */ > dev.hixo.M.d.a("\u00f9", (long)109497752606168260L) /* => dev.hixo.f.K.F.q */;
        }
        return true;
    }

    public static boolean N(class_1799 class_17992) {
        if (dev.hixo.M.d.a("$", (Object)class_17992, (long)170246929245689750L) /* => net.minecraft.class_1799.method_7960 */ != false) {
            return false;
        }
        if (dev.hixo.M.d.a("\u00f9", (Object)class_17992, (long)201910874354915171L) /* => dev.hixo.f.K.F.o */ != false || dev.hixo.M.d.a("\u00f9", (Object)class_17992, (long)160521303720884971L) /* => dev.hixo.f.K.F.O */ != false || dev.hixo.M.d.a("\u00f9", (Object)class_17992, (long)193911180360957346L) /* => dev.hixo.f.K.F.W */ != false) {
            return true;
        }
        CallSite callSite = dev.hixo.M.d.a("$", (Object)class_17992, (long)89510314790192383L) /* => net.minecraft.class_1799.method_7909 */;
        if (callSite instanceof class_1738) {
            CallSite callSite2 = dev.hixo.M.d.a("\u00f9", (Object)class_17992, (long)124610365207747468L) /* => dev.hixo.f.K.F.j */;
            if (callSite2 == null) {
                return false;
            }
            return dev.hixo.M.d.a("\u00f9", (Object)class_17992, (long)126097513002051163L) /* => dev.hixo.f.K.F.N */ > dev.hixo.M.d.a("\u00f9", (Object)callSite2, (long)91418123174534756L) /* => dev.hixo.f.K.F.k */;
        }
        if (callSite instanceof class_1829) {
            return dev.hixo.M.d.a("\u00f9", (Object)class_17992, (long)184985467648913989L) /* => dev.hixo.f.K.F.u */ > dev.hixo.M.d.a("\u00f9", (long)170968721149368074L) /* => dev.hixo.f.K.F.z */;
        }
        if (callSite instanceof class_1810) {
            return dev.hixo.M.d.a("\u00f9", (Object)class_17992, (long)54848740956213303L) /* => dev.hixo.f.K.F.G */ > dev.hixo.M.d.a("\u00f9", (long)67768076820444371L) /* => dev.hixo.f.K.F.U */;
        }
        if (callSite instanceof class_1743) {
            return dev.hixo.M.d.a("\u00f9", (Object)class_17992, (long)54848740956213303L) /* => dev.hixo.f.K.F.G */ > dev.hixo.M.d.a("\u00f9", (long)58138108518868276L) /* => dev.hixo.f.K.F.p */;
        }
        if (callSite instanceof class_1821) {
            return dev.hixo.M.d.a("\u00f9", (Object)class_17992, (long)54848740956213303L) /* => dev.hixo.f.K.F.G */ > dev.hixo.M.d.a("\u00f9", (long)151281346742595753L) /* => dev.hixo.f.K.F.e */;
        }
        if (callSite instanceof class_1764) {
            return dev.hixo.M.d.a("\u00f9", (Object)class_17992, (long)167543402615369697L) /* => dev.hixo.f.K.F.H */ > dev.hixo.M.d.a("\u00f9", (long)109497752606168260L) /* => dev.hixo.f.K.F.q */;
        }
        if (callSite instanceof class_1753 && dev.hixo.M.d.a("\u00f9", (Object)class_17992, (long)165263251292953970L) /* => dev.hixo.f.K.F.i */ != false) {
            return dev.hixo.M.d.a("\u00f9", (Object)class_17992, (long)184854238930973389L) /* => dev.hixo.f.K.F.a */ > dev.hixo.M.d.a("\u00f9", (long)131721400082171681L) /* => dev.hixo.f.K.F.P */;
        }
        if (callSite instanceof class_1753 && dev.hixo.M.d.a("\u00f9", (Object)class_17992, (long)188160110519828618L) /* => dev.hixo.f.K.F.l */ != false) {
            return dev.hixo.M.d.a("\u00f9", (Object)class_17992, (long)179440445794160744L) /* => dev.hixo.f.K.F.J */ > dev.hixo.M.d.a("\u00f9", (long)48605450216338181L) /* => dev.hixo.f.K.F.S */;
        }
        if (callSite == dev.hixo.M.d.a("\u00fd", (long)122456730208592996L) /* => net.minecraft.class_1802.field_8463 */ || callSite == dev.hixo.M.d.a("\u00fd", (long)111024180222016096L) /* => net.minecraft.class_1802.field_8367 */) {
            return true;
        }
        if (callSite == dev.hixo.M.d.a("\u00fd", (long)132224845231862353L) /* => net.minecraft.class_1802.field_8786 */) {
            return true;
        }
        if (callSite == dev.hixo.M.d.a("\u00fd", (long)76644951499184003L) /* => net.minecraft.class_1802.field_8251 */) {
            return dev.hixo.M.d.a("\u00f9", (Object)callSite, (long)123752580308107260L) /* => dev.hixo.f.K.F.L */ == false;
        }
        if (callSite == dev.hixo.M.d.a("\u00fd", (long)92763934931841227L) /* => net.minecraft.class_1802.field_8705 */ && dev.hixo.M.d.a("\u00f9", (Object)dev.hixo.M.d.a("\u00fd", (long)92763934931841227L) /* => net.minecraft.class_1802.field_8705 */, (long)34453578974532597L) /* => dev.hixo.f.K.F.A */ >= dev.hixo.M.d.a("\u00f9", (long)141149182431001656L) /* => dev.hixo.f.K.F.a */) {
            return false;
        }
        if (callSite == dev.hixo.M.d.a("\u00fd", (long)139070299611821486L) /* => net.minecraft.class_1802.field_8187 */ && dev.hixo.M.d.a("\u00f9", (Object)dev.hixo.M.d.a("\u00fd", (long)139070299611821486L) /* => net.minecraft.class_1802.field_8187 */, (long)34453578974532597L) /* => dev.hixo.f.K.F.A */ >= dev.hixo.M.d.a("\u00f9", (long)134122885167579391L) /* => dev.hixo.f.K.F.B */) {
            return false;
        }
        if (callSite instanceof class_1747 && dev.hixo.M.d.a("\u00f9", (Object)class_17992, (long)69660102614156139L) /* => dev.hixo.f.K.F.y */ != false && dev.hixo.M.d.a("\u00f9", (long)126020998135604266L) /* => dev.hixo.f.K.F.D */ + dev.hixo.M.d.a("$", (Object)class_17992, (long)153993080313702192L) /* => net.minecraft.class_1799.method_7947 */ >= dev.hixo.M.d.a("\u00f9", (long)149514644277117945L) /* => dev.hixo.f.K.F.T */) {
            return false;
        }
        if (callSite == dev.hixo.M.d.a("\u00fd", (long)164922844483618895L) /* => net.minecraft.class_1802.field_8107 */ && dev.hixo.M.d.a("\u00f9", (Object)dev.hixo.M.d.a("\u00fd", (long)164922844483618895L) /* => net.minecraft.class_1802.field_8107 */, (long)34453578974532597L) /* => dev.hixo.f.K.F.A */ + dev.hixo.M.d.a("$", (Object)class_17992, (long)153993080313702192L) /* => net.minecraft.class_1799.method_7947 */ >= dev.hixo.M.d.a("\u00f9", (long)112945978241449224L) /* => dev.hixo.f.K.F.N */) {
            return false;
        }
        if (callSite instanceof class_1787 && dev.hixo.M.d.a("\u00f9", (Object)dev.hixo.M.d.a("\u00fd", (long)63887877278139842L) /* => net.minecraft.class_1802.field_8378 */, (long)34453578974532597L) /* => dev.hixo.f.K.F.A */ >= dev.hixo.M.d.a("\u00f9", (long)167905662936431494L) /* => dev.hixo.f.K.F.I */) {
            return false;
        }
        if ((callSite == dev.hixo.M.d.a("\u00fd", (long)113484932722590047L) /* => net.minecraft.class_1802.field_8543 */ || callSite == dev.hixo.M.d.a("\u00fd", (long)186173826148335931L) /* => net.minecraft.class_1802.field_8803 */) && dev.hixo.M.d.a("\u00f9", (Object)dev.hixo.M.d.a("\u00fd", (long)113484932722590047L) /* => net.minecraft.class_1802.field_8543 */, (long)34453578974532597L) /* => dev.hixo.f.K.F.A */ + dev.hixo.M.d.a("\u00f9", (Object)dev.hixo.M.d.a("\u00fd", (long)186173826148335931L) /* => net.minecraft.class_1802.field_8803 */, (long)34453578974532597L) /* => dev.hixo.f.K.F.A */ + dev.hixo.M.d.a("$", (Object)class_17992, (long)153993080313702192L) /* => net.minecraft.class_1799.method_7947 */ >= dev.hixo.M.d.a("\u00f9", (long)104744125030736207L) /* => dev.hixo.f.K.F.i */) {
            return false;
        }
        return (boolean)dev.hixo.M.d.a("\u00f9", (Object)class_17992, (long)183985365301481005L) /* => dev.hixo.f.K.F.D */;
    }

    private static double c(class_1799 class_17992) {
        CallSite callSite = dev.hixo.M.d.a("$", (Object)class_17992, (long)89510314790192383L) /* => net.minecraft.class_1799.method_7909 */;
        if (dev.hixo.M.d.a("\u00f9", (Object)class_17992, (long)201910874354915171L) /* => dev.hixo.f.K.F.o */ != false || dev.hixo.M.d.a("\u00f9", (Object)class_17992, (long)160521303720884971L) /* => dev.hixo.f.K.F.O */ != false) {
            return 10000.0;
        }
        if (callSite instanceof class_1738) {
            return (double)dev.hixo.M.d.a("\u00f9", (Object)class_17992, (long)126097513002051163L) /* => dev.hixo.f.K.F.N */;
        }
        if (callSite instanceof class_1829) {
            return (double)dev.hixo.M.d.a("\u00f9", (Object)class_17992, (long)184985467648913989L) /* => dev.hixo.f.K.F.u */;
        }
        if (callSite instanceof class_1743 && dev.hixo.M.d.a("\u00f9", (Object)class_17992, (long)193911180360957346L) /* => dev.hixo.f.K.F.W */ != false) {
            return (double)dev.hixo.M.d.a("\u00f9", (Object)class_17992, (long)118798994153244870L) /* => dev.hixo.f.K.F.p */;
        }
        if (callSite instanceof class_1766) {
            return (double)dev.hixo.M.d.a("\u00f9", (Object)class_17992, (long)54848740956213303L) /* => dev.hixo.f.K.F.G */;
        }
        if (callSite instanceof class_1753) {
            if (dev.hixo.M.d.a("\u00f9", (Object)class_17992, (long)165263251292953970L) /* => dev.hixo.f.K.F.i */ != false) {
                return (double)dev.hixo.M.d.a("\u00f9", (Object)class_17992, (long)184854238930973389L) /* => dev.hixo.f.K.F.a */;
            }
            if (dev.hixo.M.d.a("\u00f9", (Object)class_17992, (long)188160110519828618L) /* => dev.hixo.f.K.F.l */ != false) {
                return (double)dev.hixo.M.d.a("\u00f9", (Object)class_17992, (long)179440445794160744L) /* => dev.hixo.f.K.F.J */;
            }
            return 1.0;
        }
        if (callSite instanceof class_1764) {
            return (double)dev.hixo.M.d.a("\u00f9", (Object)class_17992, (long)167543402615369697L) /* => dev.hixo.f.K.F.H */;
        }
        if (callSite == dev.hixo.M.d.a("\u00fd", (long)111024180222016096L) /* => net.minecraft.class_1802.field_8367 */) {
            return 50.0 + (double)dev.hixo.M.d.a("$", (Object)class_17992, (long)153993080313702192L) /* => net.minecraft.class_1799.method_7947 */;
        }
        if (callSite == dev.hixo.M.d.a("\u00fd", (long)122456730208592996L) /* => net.minecraft.class_1802.field_8463 */) {
            return 30.0 + (double)dev.hixo.M.d.a("$", (Object)class_17992, (long)153993080313702192L) /* => net.minecraft.class_1799.method_7947 */;
        }
        if (callSite == dev.hixo.M.d.a("\u00fd", (long)106548144337793850L) /* => net.minecraft.class_1802.field_8634 */) {
            return 10.0 + (double)dev.hixo.M.d.a("$", (Object)class_17992, (long)153993080313702192L) /* => net.minecraft.class_1799.method_7947 */;
        }
        if (callSite == dev.hixo.M.d.a("\u00fd", (long)164922844483618895L) /* => net.minecraft.class_1802.field_8107 */) {
            return 5.0 + (double)dev.hixo.M.d.a("$", (Object)class_17992, (long)153993080313702192L) /* => net.minecraft.class_1799.method_7947 */ * 0.1;
        }
        if (callSite == dev.hixo.M.d.a("\u00fd", (long)132224845231862353L) /* => net.minecraft.class_1802.field_8786 */) {
            return 4.0 + (double)dev.hixo.M.d.a("$", (Object)class_17992, (long)153993080313702192L) /* => net.minecraft.class_1799.method_7947 */ * 0.1;
        }
        if (callSite == dev.hixo.M.d.a("\u00fd", (long)113484932722590047L) /* => net.minecraft.class_1802.field_8543 */ || callSite == dev.hixo.M.d.a("\u00fd", (long)186173826148335931L) /* => net.minecraft.class_1802.field_8803 */) {
            return 3.0 + (double)dev.hixo.M.d.a("$", (Object)class_17992, (long)153993080313702192L) /* => net.minecraft.class_1799.method_7947 */ * 0.1;
        }
        if (callSite instanceof class_1787) {
            return (double)dev.hixo.M.d.a("\u00f9", (Object)class_17992, (long)54848740956213303L) /* => dev.hixo.f.K.F.G */;
        }
        if (callSite instanceof class_1747) {
            return 2.0 + (double)dev.hixo.M.d.a("$", (Object)class_17992, (long)153993080313702192L) /* => net.minecraft.class_1799.method_7947 */ * 0.05;
        }
        return 1.0;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block23: {
            block22: {
                block21: {
                    block20: {
                        var13 = new String[22];
                        var11_1 = 0;
                        var10_2 = "!\u0004J+4,\u001d\u0006\fJ5)b)\u0014\u0011\u0006E-!e \u0017\u001b\u0005<.h+\u0000\nC<3x\b9\u0000G5\u0001y<\u0013\u00051\u0001N*4\u000b7\u0007O<2,\r\u001a\fX-\u00056\fG89\t\"\u0000H2\u0014~/\u0001\u0001\u00056\fI,'\u0015\u0011\u0006E-!e \u0017\u001b\u0005:(i=\u0006-D,\"`+\u000b7\u0007O<2,\r\u001a\fX-\n=\u0019N7`H+\u001e\bR\f \bE=/an1\u0005B:+\b\u8198\u52c1\u5fc0\u9046\u646c\u7a76\u7bff\u5b22\u0003\u6759\u5f18\u7b9a\u00074\u001cY7!o+\f0\u001bN.)b)!\u001dJ7$\b!\nJ?&c\"\u0016\u00051\u0001N*4\u000f\u0011\u0006E-!e \u0017\u001b\u0005:(i=\u0006\u0002\u7bc3\u5b39";
                        var12_3 = "!\u0004J+4,\u001d\u0006\fJ5)b)\u0014\u0011\u0006E-!e \u0017\u001b\u0005<.h+\u0000\nC<3x\b9\u0000G5\u0001y<\u0013\u00051\u0001N*4\u000b7\u0007O<2,\r\u001a\fX-\u00056\fG89\t\"\u0000H2\u0014~/\u0001\u0001\u00056\fI,'\u0015\u0011\u0006E-!e \u0017\u001b\u0005:(i=\u0006-D,\"`+\u000b7\u0007O<2,\r\u001a\fX-\n=\u0019N7`H+\u001e\bR\f \bE=/an1\u0005B:+\b\u8198\u52c1\u5fc0\u9046\u646c\u7a76\u7bff\u5b22\u0003\u6759\u5f18\u7b9a\u00074\u001cY7!o+\f0\u001bN.)b)!\u001dJ7$\b!\nJ?&c\"\u0016\u00051\u0001N*4\u000f\u0011\u0006E-!e \u0017\u001b\u0005:(i=\u0006\u0002\u7bc3\u5b39".length();
                        var9_4 = 14;
                        var8_5 = -1;
lbl7:
                        // 2 sources

                        while (true) {
                            v0 = ++var8_5;
                            v1 = var10_2.substring(v0, v0 + var9_4);
                            v2 = -1;
                            break block20;
                            break;
                        }
lbl12:
                        // 1 sources

                        while (true) {
                            var13[var11_1++] = v3.intern();
                            if ((var8_5 += var9_4) < var12_3) {
                                var9_4 = var10_2.charAt(var8_5);
                                ** continue;
                            }
                            var10_2 = "1\u0001N*4_:\u0017\bG<2\t=\u0007G `N+\u0001\u001d";
                            var12_3 = "1\u0001N*4_:\u0017\bG<2\t=\u0007G `N+\u0001\u001d".length();
                            var9_4 = 12;
                            var8_5 = -1;
lbl21:
                            // 2 sources

                            while (true) {
                                v4 = ++var8_5;
                                v1 = var10_2.substring(v4, v4 + var9_4);
                                v2 = 0;
                                break block20;
                                break;
                            }
                            break;
                        }
lbl26:
                        // 1 sources

                        while (true) {
                            var13[var11_1++] = v3.intern();
                            if ((var8_5 += var9_4) < var12_3) {
                                var9_4 = var10_2.charAt(var8_5);
                                ** continue;
                            }
                            break block21;
                            break;
                        }
                    }
                    v5 = v1.toCharArray();
                    v6 = v5;
                    v7 = v5.length;
                    var14_6 = 0;
                    if (true) ** GOTO lbl65
                    do {
                        v6 = v6;
                        v8 = var14_6;
                        v9 = v6[v8];
                        switch (var14_6 % 7) {
                            case 0: {
                                v10 = 114;
                                break;
                            }
                            case 1: {
                                v10 = 105;
                                break;
                            }
                            case 2: {
                                v10 = 43;
                                break;
                            }
                            case 3: {
                                v10 = 89;
                                break;
                            }
                            case 4: {
                                v10 = 64;
                                break;
                            }
                            case 5: {
                                v10 = 12;
                                break;
                            }
                            default: {
                                v10 = 78;
                            }
                        }
                        v6[v8] = (char)(v9 ^ v10);
                        ++var14_6;
lbl65:
                        // 2 sources

                        v7 = v7;
                    } while (v7 > var14_6);
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
                T.d = var13;
                var0_7 = 3951803642282180245L;
                var6_8 = new long[2];
                var3_9 = 0;
                var4_10 = "q\u0090\u008c>\u00de\u0085\n\u0093\u0006\u00fb\u001c\u00a5sOf?";
                var5_11 = "q\u0090\u008c>\u00de\u0085\n\u0093\u0006\u00fb\u001c\u00a5sOf?".length();
                var2_12 = 0;
                while (true) {
                    break block22;
                    break;
                }
lbl84:
                // 1 sources

                while (true) {
                    var6_8[v11] = (((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L) ^ var0_7;
                    if (var2_12 < var5_11) ** continue;
                    break block23;
                    break;
                }
            }
            var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
            v11 = var3_9++;
            ** while (true)
        }
        T.h = var6_8;
        T.l = new Long[2];
    }

    private static long a(int n2, long l2) {
        int n3 = (n2 ^ (int)l2 ^ 0x6A93) & Short.MAX_VALUE;
        if (l[n3] == null) {
            T.l[n3] = h[n3] ^ l2;
        }
        return l[n3];
    }
}

