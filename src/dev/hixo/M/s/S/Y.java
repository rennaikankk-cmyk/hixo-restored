/*
 * RESTORED SOURCE — decompiled reconstruction, not the original files.
 * class: dev.hixo.M.s.S.Y
 * context strings: 'Jump Reset 起跳 #' | 'BufferJumpReset' | 'Buffer' | 'grim'
 */

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1297
 *  net.minecraft.class_1309
 *  net.minecraft.class_1937
 *  net.minecraft.class_2199
 *  net.minecraft.class_2244
 *  net.minecraft.class_2269
 *  net.minecraft.class_2304
 *  net.minecraft.class_2323
 *  net.minecraft.class_2338
 *  net.minecraft.class_2349
 *  net.minecraft.class_2350
 *  net.minecraft.class_238
 *  net.minecraft.class_2401
 *  net.minecraft.class_2406
 *  net.minecraft.class_2428
 *  net.minecraft.class_243
 *  net.minecraft.class_2533
 *  net.minecraft.class_2596
 *  net.minecraft.class_2626
 *  net.minecraft.class_2708
 *  net.minecraft.class_2743
 *  net.minecraft.class_2761
 *  net.minecraft.class_2828
 *  net.minecraft.class_2828$class_2830
 *  net.minecraft.class_2828$class_2831
 *  net.minecraft.class_2846
 *  net.minecraft.class_2846$class_2847
 *  net.minecraft.class_2848
 *  net.minecraft.class_2851
 *  net.minecraft.class_310
 *  net.minecraft.class_3711
 *  net.minecraft.class_3713
 *  net.minecraft.class_3717
 *  net.minecraft.class_3718
 *  net.minecraft.class_3959
 *  net.minecraft.class_3959$class_242
 *  net.minecraft.class_3959$class_3960
 *  net.minecraft.class_3966
 *  net.minecraft.class_5546
 *  net.minecraft.class_7438
 *  net.minecraft.class_7439
 */
package dev.hixo.M.s.S;

import dev.hixo.M.G;
import dev.hixo.M.K;
import dev.hixo.M.d;
import dev.hixo.T.E;
import dev.hixo.b.M;
import dev.hixo.b.g;
import dev.hixo.b.s;
import dev.hixo.f.V.C;
import dev.hixo.t.q.p_0;
import java.lang.invoke.CallSite;
import java.lang.invoke.LambdaMetafactory;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Random;
import java.util.concurrent.ConcurrentLinkedQueue;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_1937;
import net.minecraft.class_2199;
import net.minecraft.class_2244;
import net.minecraft.class_2269;
import net.minecraft.class_2304;
import net.minecraft.class_2323;
import net.minecraft.class_2338;
import net.minecraft.class_2349;
import net.minecraft.class_2350;
import net.minecraft.class_238;
import net.minecraft.class_2401;
import net.minecraft.class_2406;
import net.minecraft.class_2428;
import net.minecraft.class_243;
import net.minecraft.class_2533;
import net.minecraft.class_2596;
import net.minecraft.class_2626;
import net.minecraft.class_2708;
import net.minecraft.class_2743;
import net.minecraft.class_2761;
import net.minecraft.class_2828;
import net.minecraft.class_2846;
import net.minecraft.class_2848;
import net.minecraft.class_2851;
import net.minecraft.class_310;
import net.minecraft.class_3711;
import net.minecraft.class_3713;
import net.minecraft.class_3717;
import net.minecraft.class_3718;
import net.minecraft.class_3959;
import net.minecraft.class_3966;
import net.minecraft.class_5546;
import net.minecraft.class_7438;
import net.minecraft.class_7439;

public class Y
extends G {
    public static Y k;
    public final s B;
    public final g UH;
    public final M U;
    public final M Z;
    public final M Uk;
    public final g q;
    public final g u;
    public final g l;
    public final M e;
    public final g Ur;
    public final M Uy;
    public final M P;
    public final M y;
    public final g Ue;
    public final M U6;
    public final M UY;
    public final M D;
    public final g R;
    public final M H;
    public final g UA;
    public final g g;
    public final g Uz;
    public final M s;
    public final g z;
    public final g r;
    private static final Random h;
    private static volatile boolean Q;
    private final Deque<class_2743> i;
    private volatile boolean p;
    private int t;
    private boolean U_;
    private volatile boolean c;
    private volatile int UJ;
    private int f;
    private boolean N;
    private int Uh;
    private volatile float K;
    private volatile int UN;
    private boolean T;
    private int Uc;
    private int U5;
    private int Ud;
    private int Ua;
    private boolean UR;
    private int v;
    private boolean Ug;
    private boolean S;
    private volatile boolean M;
    private int U0;
    private volatile boolean d;
    private int UL;
    private volatile int m;
    private int C;
    private volatile class_2338 Uq;
    private final ConcurrentLinkedQueue<class_2596<?>> V;
    private volatile String A;
    private volatile int UM;
    private volatile boolean G;
    private int UF;
    private volatile class_243 UU;
    private int n;
    public volatile long Y;
    private static final int O;
    private volatile boolean U4;
    private int Uo;
    private volatile boolean UK;
    private class_1309 x;
    private int UB;
    private int J;
    private volatile boolean UW;
    private volatile int W;
    private int E;
    private final ConcurrentLinkedQueue<class_2596<?>> UI;
    private static volatile boolean Uw;
    public static int w;
    private static final String[] ab;
    private static final long[] bb;
    private static final Integer[] cb;

    public Y() {
        String[] stringArray = ab;
        super((K)((Object)dev.hixo.M.d.a("\u00fd", (long)169407094224467032L) /* => dev.hixo.M.K.COMBAT */), stringArray[22], stringArray[21]);
        this.B = new s(stringArray[62], stringArray[34], stringArray[3], stringArray[85], stringArray[1], stringArray[74], stringArray[51], stringArray[65], stringArray[41], stringArray[8], stringArray[53]);
        this.UH = new g(stringArray[3], false);
        this.U = new M(stringArray[70], 85.0, 0.0, 100.0, 5.0);
        this.Z = new M(stringArray[13], 3.0, 0.0, 6.0, 1.0);
        this.Uk = new M(stringArray[47], 8.0, 0.0, 40.0, 1.0);
        this.q = new g(stringArray[84], true);
        this.u = new g(stringArray[55], true);
        this.l = new g(stringArray[66], true);
        this.e = new M(stringArray[35], 8.0, 1.0, 20.0, 1.0);
        this.Ur = new g(stringArray[24], true);
        this.Uy = new M(stringArray[15], 10.0, 1.0, 40.0, 1.0);
        this.P = new M(stringArray[29], 20.0, 1.0, 60.0, 1.0);
        this.y = new M(stringArray[16], 5.0, 1.0, 60.0, 1.0);
        this.Ue = new g(stringArray[31], true);
        this.U6 = new M(stringArray[7], 0.0, 0.0, 100.0, 5.0);
        this.UY = new M(stringArray[26], 100.0, 0.0, 100.0, 5.0);
        this.D = new M(stringArray[17], 5.0, 1.0, 5.0, 1.0);
        this.R = new g(stringArray[61], true);
        this.H = new M(stringArray[79], 60.0, 0.0, 100.0, 5.0);
        this.UA = new g(stringArray[6], true);
        this.g = new g(stringArray[44], false);
        this.Uz = new g(stringArray[69], false);
        this.s = new M(stringArray[46], 3.5, 1.0, 6.0, 0.5);
        this.z = new g(stringArray[14], true);
        this.r = new g(stringArray[59], true);
        this.i = new ArrayDeque<class_2743>();
        dev.hixo.M.d.a("\u00e7", (Object)this, (boolean)false, (long)103312637376242931L) /* => dev.hixo.M.s.S.Y.p */;
        dev.hixo.M.d.a("\u00e7", (Object)this, (int)0, (long)66437176329997860L) /* => dev.hixo.M.s.S.Y.t */;
        dev.hixo.M.d.a("\u00e7", (Object)this, (boolean)false, (long)194579784118054002L) /* => dev.hixo.M.s.S.Y.U_ */;
        dev.hixo.M.d.a("\u00e7", (Object)this, (boolean)false, (long)106769124039414831L) /* => dev.hixo.M.s.S.Y.c */;
        dev.hixo.M.d.a("\u00e7", (Object)this, (int)0, (long)153771088441963898L) /* => dev.hixo.M.s.S.Y.UJ */;
        dev.hixo.M.d.a("\u00e7", (Object)this, (int)0, (long)144222617296946861L) /* => dev.hixo.M.s.S.Y.f */;
        dev.hixo.M.d.a("\u00e7", (Object)this, (boolean)false, (long)48779331642593393L) /* => dev.hixo.M.s.S.Y.N */;
        dev.hixo.M.d.a("\u00e7", (Object)this, (int)0, (long)133860200793568013L) /* => dev.hixo.M.s.S.Y.Uh */;
        dev.hixo.M.d.a("\u00e7", (Object)this, (float)Float.NaN, (long)50597547123342978L) /* => dev.hixo.M.s.S.Y.K */;
        dev.hixo.M.d.a("\u00e7", (Object)this, (int)0, (long)100514315248061815L) /* => dev.hixo.M.s.S.Y.UN */;
        dev.hixo.M.d.a("\u00e7", (Object)this, (boolean)false, (long)65686924782076862L) /* => dev.hixo.M.s.S.Y.T */;
        dev.hixo.M.d.a("\u00e7", (Object)this, (int)0, (long)137573817861904304L) /* => dev.hixo.M.s.S.Y.Uc */;
        dev.hixo.M.d.a("\u00e7", (Object)this, (int)0, (long)190346998449178644L) /* => dev.hixo.M.s.S.Y.U5 */;
        dev.hixo.M.d.a("\u00e7", (Object)this, (int)0, (long)57303462295818123L) /* => dev.hixo.M.s.S.Y.Ud */;
        dev.hixo.M.d.a("\u00e7", (Object)this, (int)0, (long)158762271070531726L) /* => dev.hixo.M.s.S.Y.Ua */;
        dev.hixo.M.d.a("\u00e7", (Object)this, (boolean)false, (long)181533902698171137L) /* => dev.hixo.M.s.S.Y.UR */;
        dev.hixo.M.d.a("\u00e7", (Object)this, (int)0, (long)147586035931317266L) /* => dev.hixo.M.s.S.Y.v */;
        dev.hixo.M.d.a("\u00e7", (Object)this, (boolean)false, (long)148681531676275373L) /* => dev.hixo.M.s.S.Y.Ug */;
        dev.hixo.M.d.a("\u00e7", (Object)this, (boolean)false, (long)171944770271334055L) /* => dev.hixo.M.s.S.Y.S */;
        dev.hixo.M.d.a("\u00e7", (Object)this, (boolean)false, (long)124497286045487820L) /* => dev.hixo.M.s.S.Y.M */;
        dev.hixo.M.d.a("\u00e7", (Object)this, (int)0, (long)34138200719249862L) /* => dev.hixo.M.s.S.Y.U0 */;
        dev.hixo.M.d.a("\u00e7", (Object)this, (boolean)false, (long)162918849087722895L) /* => dev.hixo.M.s.S.Y.d */;
        dev.hixo.M.d.a("\u00e7", (Object)this, (int)0, (long)136172686434858944L) /* => dev.hixo.M.s.S.Y.UL */;
        dev.hixo.M.d.a("\u00e7", (Object)this, (int)0, (long)122990745300639938L) /* => dev.hixo.M.s.S.Y.m */;
        dev.hixo.M.d.a("\u00e7", (Object)this, (int)0, (long)58823014778465840L) /* => dev.hixo.M.s.S.Y.C */;
        dev.hixo.M.d.a("\u00e7", (Object)this, null, (long)33454823054977219L) /* => dev.hixo.M.s.S.Y.Uq */;
        this.V = new ConcurrentLinkedQueue();
        dev.hixo.M.d.a("\u00e7", (Object)this, null, (long)156247685155309515L) /* => dev.hixo.M.s.S.Y.A */;
        dev.hixo.M.d.a("\u00e7", (Object)this, (int)0, (long)152616670085752559L) /* => dev.hixo.M.s.S.Y.UM */;
        dev.hixo.M.d.a("\u00e7", (Object)this, (boolean)false, (long)156548232470805456L) /* => dev.hixo.M.s.S.Y.G */;
        dev.hixo.M.d.a("\u00e7", (Object)this, (int)0, (long)45398163565104993L) /* => dev.hixo.M.s.S.Y.UF */;
        dev.hixo.M.d.a("\u00e7", (Object)this, null, (long)196130981205602808L) /* => dev.hixo.M.s.S.Y.UU */;
        dev.hixo.M.d.a("\u00e7", (Object)this, (int)1, (long)126298496164372661L) /* => dev.hixo.M.s.S.Y.n */;
        dev.hixo.M.d.a("\u00e7", (Object)this, (long)0L, (long)139404318586354683L) /* => dev.hixo.M.s.S.Y.Y */;
        dev.hixo.M.d.a("\u00e7", (Object)this, (boolean)false, (long)33132004760985665L) /* => dev.hixo.M.s.S.Y.U4 */;
        dev.hixo.M.d.a("\u00e7", (Object)this, (int)0, (long)181052502933075839L) /* => dev.hixo.M.s.S.Y.Uo */;
        dev.hixo.M.d.a("\u00e7", (Object)this, (boolean)false, (long)141317735219918779L) /* => dev.hixo.M.s.S.Y.UK */;
        dev.hixo.M.d.a("\u00e7", (Object)this, null, (long)195636415282267214L) /* => dev.hixo.M.s.S.Y.x */;
        dev.hixo.M.d.a("\u00e7", (Object)this, (int)0, (long)41597054297703683L) /* => dev.hixo.M.s.S.Y.UB */;
        dev.hixo.M.d.a("\u00e7", (Object)this, (int)0, (long)54254527441328088L) /* => dev.hixo.M.s.S.Y.J */;
        dev.hixo.M.d.a("\u00e7", (Object)this, (boolean)false, (long)167233183166192420L) /* => dev.hixo.M.s.S.Y.UW */;
        dev.hixo.M.d.a("\u00e7", (Object)this, (int)0, (long)60139537868346752L) /* => dev.hixo.M.s.S.Y.W */;
        dev.hixo.M.d.a("\u00e7", (Object)this, (int)0, (long)146168055768241404L) /* => dev.hixo.M.s.S.Y.E */;
        this.UI = new ConcurrentLinkedQueue();
        dev.hixo.M.d.a("$", (Object)this, (int)0, (long)113806433936288059L) /* => dev.hixo.M.G.z */;
        dev.hixo.M.d.a("\u00c1", (Y)this, (long)132476946628513321L) /* => dev.hixo.M.s.S.Y.k */;
    }

    @Override
    public void I() {
        dev.hixo.M.d.a("$", (Object)this, (long)75653898759624181L) /* => dev.hixo.M.s.S.Y.W */;
        dev.hixo.M.d.a("$", (Object)this, (long)94514944617974939L) /* => dev.hixo.M.s.S.Y.R */;
        super.I();
    }

    private void R() {
        dev.hixo.M.d.a("\u00e7", (Object)this, (boolean)false, (long)156548232470805456L) /* => dev.hixo.M.s.S.Y.G */;
        dev.hixo.M.d.a("\u00e7", (Object)this, (int)0, (long)45398163565104993L) /* => dev.hixo.M.s.S.Y.UF */;
        dev.hixo.M.d.a("\u00e7", (Object)this, null, (long)196130981205602808L) /* => dev.hixo.M.s.S.Y.UU */;
        dev.hixo.M.d.a("\u00e7", (Object)this, (int)0, (long)152616670085752559L) /* => dev.hixo.M.s.S.Y.UM */;
        dev.hixo.M.d.a("\u00e7", (Object)this, (int)1, (long)126298496164372661L) /* => dev.hixo.M.s.S.Y.n */;
        dev.hixo.M.d.a("$", (Object)this, (long)91333610362583717L) /* => dev.hixo.M.s.S.Y.j */;
    }

    @Override
    public void a() {
        if (dev.hixo.M.d.a("z", (Object)this, (long)103312637376242931L) /* => dev.hixo.M.s.S.Y.p */ != false) {
            dev.hixo.M.d.a("$", (Object)this, (long)197563193355678731L) /* => dev.hixo.M.s.S.Y.t */;
        }
        if (dev.hixo.M.d.a("z", (Object)this, (long)156548232470805456L) /* => dev.hixo.M.s.S.Y.G */ != false) {
            dev.hixo.M.d.a("$", (Object)this, (Object)ab[12], (long)43993329724287227L) /* => dev.hixo.M.s.S.Y.e */;
        }
        dev.hixo.M.d.a("$", (Object)this, (long)75653898759624181L) /* => dev.hixo.M.s.S.Y.W */;
        super.a();
    }

    private void W() {
        dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)137130533230656381L) /* => dev.hixo.M.s.S.Y.i */, (long)101892323560971662L) /* => java.util.Deque.clear */;
        dev.hixo.M.d.a("\u00e7", (Object)this, (boolean)false, (long)103312637376242931L) /* => dev.hixo.M.s.S.Y.p */;
        dev.hixo.M.d.a("\u00e7", (Object)this, (int)0, (long)66437176329997860L) /* => dev.hixo.M.s.S.Y.t */;
        dev.hixo.M.d.a("\u00e7", (Object)this, (boolean)false, (long)194579784118054002L) /* => dev.hixo.M.s.S.Y.U_ */;
        dev.hixo.M.d.a("\u00e7", (Object)this, (boolean)false, (long)106769124039414831L) /* => dev.hixo.M.s.S.Y.c */;
        dev.hixo.M.d.a("\u00e7", (Object)this, (int)0, (long)153771088441963898L) /* => dev.hixo.M.s.S.Y.UJ */;
        dev.hixo.M.d.a("\u00e7", (Object)this, (int)0, (long)144222617296946861L) /* => dev.hixo.M.s.S.Y.f */;
        dev.hixo.M.d.a("\u00e7", (Object)this, (boolean)false, (long)48779331642593393L) /* => dev.hixo.M.s.S.Y.N */;
        dev.hixo.M.d.a("\u00e7", (Object)this, (int)0, (long)133860200793568013L) /* => dev.hixo.M.s.S.Y.Uh */;
        dev.hixo.M.d.a("\u00e7", (Object)this, (float)Float.NaN, (long)50597547123342978L) /* => dev.hixo.M.s.S.Y.K */;
        dev.hixo.M.d.a("\u00e7", (Object)this, (int)0, (long)100514315248061815L) /* => dev.hixo.M.s.S.Y.UN */;
        dev.hixo.M.d.a("\u00e7", (Object)this, (boolean)false, (long)65686924782076862L) /* => dev.hixo.M.s.S.Y.T */;
        dev.hixo.M.d.a("\u00e7", (Object)this, (boolean)false, (long)124497286045487820L) /* => dev.hixo.M.s.S.Y.M */;
        dev.hixo.M.d.a("\u00e7", (Object)this, (int)0, (long)34138200719249862L) /* => dev.hixo.M.s.S.Y.U0 */;
        dev.hixo.M.d.a("\u00e7", (Object)this, (boolean)false, (long)181533902698171137L) /* => dev.hixo.M.s.S.Y.UR */;
        dev.hixo.M.d.a("\u00e7", (Object)this, (boolean)false, (long)148681531676275373L) /* => dev.hixo.M.s.S.Y.Ug */;
        dev.hixo.M.d.a("\u00e7", (Object)this, (int)0, (long)147586035931317266L) /* => dev.hixo.M.s.S.Y.v */;
        dev.hixo.M.d.a("\u00e7", (Object)this, (boolean)false, (long)171944770271334055L) /* => dev.hixo.M.s.S.Y.S */;
        if (dev.hixo.M.d.a("\u00fd", (long)191291687252741418L) /* => dev.hixo.M.G.a */ != null && dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("\u00fd", (long)191291687252741418L) /* => dev.hixo.M.G.a */, (long)129597241205579821L) /* => net.minecraft.class_310.field_1690 */ != null) {
            dev.hixo.M.d.a("\u00f9", (long)34890158137044018L) /* => net.minecraft.class_304.method_1424 */;
        }
    }

    private void X(String string) {
        if (dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)49866734866305102L) /* => dev.hixo.M.s.S.Y.r */, (long)65580906021680841L) /* => dev.hixo.b.g.x */ != false) {
            dev.hixo.M.d.a("\u00f9", (Object)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("$", (Object)new StringBuilder(), (Object)ab[63], (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (Object)string, (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (long)59411206276622891L) /* => java.lang.StringBuilder.toString */, (long)46296556092243784L) /* => dev.hixo.f.E.o */;
        }
    }

    private void Q(String string) {
        dev.hixo.M.d.a("\u00e7", (Object)this, (String)string, (long)156247685155309515L) /* => dev.hixo.M.s.S.Y.A */;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean b() {
        if (dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)174087295941856841L) /* => dev.hixo.M.s.S.Y.g */, (long)65580906021680841L) /* => dev.hixo.b.g.x */ == false) return false;
        String[] stringArray = ab;
        if (dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)100476154500012371L) /* => dev.hixo.M.s.S.Y.B */, (Object)stringArray[19], (long)114714509743429363L) /* => dev.hixo.b.s.P */ != false) return true;
        if (dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)100476154500012371L) /* => dev.hixo.M.s.S.Y.B */, (Object)stringArray[53], (long)114714509743429363L) /* => dev.hixo.b.s.P */ == false) return false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean p() {
        if (dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)174087295941856841L) /* => dev.hixo.M.s.S.Y.g */, (long)65580906021680841L) /* => dev.hixo.b.g.x */ == false) return false;
        String[] stringArray = ab;
        if (dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)100476154500012371L) /* => dev.hixo.M.s.S.Y.B */, (Object)stringArray[45], (long)114714509743429363L) /* => dev.hixo.b.s.P */ != false) return true;
        if (dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)100476154500012371L) /* => dev.hixo.M.s.S.Y.B */, (Object)stringArray[53], (long)114714509743429363L) /* => dev.hixo.b.s.P */ == false) return false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean e() {
        if (dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)174087295941856841L) /* => dev.hixo.M.s.S.Y.g */, (long)65580906021680841L) /* => dev.hixo.b.g.x */ == false) return false;
        String[] stringArray = ab;
        if (dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)100476154500012371L) /* => dev.hixo.M.s.S.Y.B */, (Object)stringArray[86], (long)114714509743429363L) /* => dev.hixo.b.s.P */ != false) return true;
        if (dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)100476154500012371L) /* => dev.hixo.M.s.S.Y.B */, (Object)stringArray[82], (long)114714509743429363L) /* => dev.hixo.b.s.P */ == false) return false;
        return true;
    }

    private boolean v() {
        String[] stringArray = ab;
        return dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)100476154500012371L) /* => dev.hixo.M.s.S.Y.B */, (Object)stringArray[18], (long)114714509743429363L) /* => dev.hixo.b.s.P */ != false || dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)100476154500012371L) /* => dev.hixo.M.s.S.Y.B */, (Object)stringArray[23], (long)114714509743429363L) /* => dev.hixo.b.s.P */ != false;
    }

    private boolean l() {
        return (boolean)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)100476154500012371L) /* => dev.hixo.M.s.S.Y.B */, (Object)ab[57], (long)114714509743429363L) /* => dev.hixo.b.s.P */;
    }

    private boolean L() {
        CallSite callSite = dev.hixo.M.d.a("\u00f9", (long)179869930689441125L) /* => net.minecraft.class_310.method_1551 */;
        return callSite != null && dev.hixo.M.d.a("z", (Object)callSite, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */ != null && dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)callSite, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (long)135886899496477481L) /* => net.minecraft.class_746.method_5624 */ != false && dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)callSite, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (long)158727577654635513L) /* => net.minecraft.class_746.method_5715 */ == false && dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("z", (Object)callSite, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (long)163878491127382498L) /* => net.minecraft.class_746.field_6250 */ > 0.0f && dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)callSite, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (long)178766331170989227L) /* => net.minecraft.class_746.method_6115 */ == false;
    }

    public String C() {
        return dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)100476154500012371L) /* => dev.hixo.M.s.S.Y.B */, (long)50503865389075616L) /* => dev.hixo.b.s.I */;
    }

    public int q() {
        return (int)dev.hixo.M.d.a("z", (Object)this, (long)190346998449178644L) /* => dev.hixo.M.s.S.Y.U5 */;
    }

    public boolean M() {
        return dev.hixo.M.d.a("z", (Object)this, (long)156548232470805456L) /* => dev.hixo.M.s.S.Y.G */ != false || dev.hixo.M.d.a("z", (Object)this, (long)103312637376242931L) /* => dev.hixo.M.s.S.Y.p */ != false || dev.hixo.M.d.a("z", (Object)this, (long)162918849087722895L) /* => dev.hixo.M.s.S.Y.d */ != false || dev.hixo.M.d.a("z", (Object)this, (long)33132004760985665L) /* => dev.hixo.M.s.S.Y.U4 */ != false;
    }

    private boolean d() {
        return (boolean)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)100476154500012371L) /* => dev.hixo.M.s.S.Y.B */, (Object)ab[39], (long)114714509743429363L) /* => dev.hixo.b.s.P */;
    }

    private boolean k(class_2743 class_27432) {
        if (dev.hixo.M.d.a("z", (Object)this, (long)60139537868346752L) /* => dev.hixo.M.s.S.Y.W */ > 0 || dev.hixo.M.d.a("$", (Object)class_27432, (long)33628572229374580L) /* => net.minecraft.class_2743.method_11816 */ <= 0.0) {
            return false;
        }
        if (dev.hixo.M.d.a("z", (Object)this, (long)33132004760985665L) /* => dev.hixo.M.s.S.Y.U4 */ != false) {
            return true;
        }
        if (dev.hixo.M.d.a("$", (Object)this, (long)90808402685927767L) /* => dev.hixo.M.s.S.Y.G */ != false) {
            return false;
        }
        CallSite callSite = dev.hixo.M.d.a("\u00f9", (long)179869930689441125L) /* => net.minecraft.class_310.method_1551 */;
        if (callSite == null || dev.hixo.M.d.a("z", (Object)callSite, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */ == null) {
            return false;
        }
        CallSite callSite2 = dev.hixo.M.d.a("$", (Object)this, (long)166223312087082898L) /* => dev.hixo.M.s.S.Y.B */;
        return dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)callSite, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (long)175288240290473570L) /* => net.minecraft.class_746.method_24828 */ == false || callSite2 == null || dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)callSite, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (long)135886899496477481L) /* => net.minecraft.class_746.method_5624 */ == false;
    }

    private boolean G() {
        CallSite callSite = dev.hixo.M.d.a("\u00f9", (long)179869930689441125L) /* => net.minecraft.class_310.method_1551 */;
        if (callSite == null || dev.hixo.M.d.a("z", (Object)callSite, (long)38197671011210569L) /* => net.minecraft.class_310.field_1687 */ == null || dev.hixo.M.d.a("z", (Object)callSite, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */ == null) {
            return true;
        }
        if (dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)callSite, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (long)151372364218672536L) /* => net.minecraft.class_746.method_5805 */ == false || dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)callSite, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (long)147827598445615920L) /* => net.minecraft.class_746.method_29504 */ != false || dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)callSite, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (long)107578859803646099L) /* => net.minecraft.class_746.method_6032 */ <= 0.0f) {
            return true;
        }
        if (dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)callSite, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (long)185690765282080613L) /* => net.minecraft.class_746.method_7325 */ != false || dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)callSite, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (long)146815996302975911L) /* => net.minecraft.class_746.method_31549 */, (long)58489664171555876L) /* => net.minecraft.class_1656.field_7479 */ != false) {
            return true;
        }
        if (dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)callSite, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (long)99408139569770068L) /* => net.minecraft.class_746.method_5799 */ != false || dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)callSite, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (long)32021340319509692L) /* => net.minecraft.class_746.method_5771 */ != false || dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)callSite, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (long)154541681367267964L) /* => net.minecraft.class_746.method_5809 */ != false) {
            return true;
        }
        if (dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)callSite, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (long)117810057227506494L) /* => net.minecraft.class_746.method_6101 */ != false || dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)callSite, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (long)173008928910219241L) /* => net.minecraft.class_746.method_6113 */ != false || dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)callSite, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (long)178766331170989227L) /* => net.minecraft.class_746.method_6115 */ != false) {
            return true;
        }
        return (boolean)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)callSite, (long)38197671011210569L) /* => net.minecraft.class_310.field_1687 */, (Object)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)callSite, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (long)62351957165567498L) /* => net.minecraft.class_746.method_24515 */, (long)170782435888130580L) /* => net.minecraft.class_638.method_8320 */, (Object)dev.hixo.M.d.a("\u00fd", (long)35390086457909619L) /* => net.minecraft.class_2246.field_10343 */, (long)85576448021108010L) /* => net.minecraft.class_2680.method_27852 */;
    }

    private class_1309 B() {
        class_1309 class_13092;
        CallSite callSite;
        CallSite callSite2 = dev.hixo.M.d.a("\u00f9", (long)179869930689441125L) /* => net.minecraft.class_310.method_1551 */;
        if (callSite2 == null || dev.hixo.M.d.a("z", (Object)callSite2, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */ == null) {
            return null;
        }
        CallSite callSite3 = dev.hixo.M.d.a("\u00fd", (long)34297500847572953L) /* => dev.hixo.M.s.S.t.f */;
        if (callSite3 != null && dev.hixo.M.d.a("$", (Object)callSite3, (long)96089342888548907L) /* => dev.hixo.M.G.c */ != false && dev.hixo.M.d.a("$", (Object)this, (Object)(callSite = dev.hixo.M.d.a("$", (Object)callSite3, (long)164466594068746767L) /* => dev.hixo.M.s.S.t.T */), (long)100580361378317283L) /* => dev.hixo.M.s.S.Y.I */ != false) {
            return callSite;
        }
        CallSite callSite4 = dev.hixo.M.d.a("z", (Object)callSite2, (long)114640399921836459L) /* => net.minecraft.class_310.field_1765 */;
        if (callSite4 instanceof class_3966 && (callSite4 = dev.hixo.M.d.a("$", (Object)(callSite = (class_3966)callSite4), (long)53250421511039028L) /* => net.minecraft.class_3966.method_17782 */) instanceof class_1309 && dev.hixo.M.d.a("$", (Object)this, (Object)(class_13092 = (class_1309)callSite4), (long)100580361378317283L) /* => dev.hixo.M.s.S.Y.I */ != false) {
            return class_13092;
        }
        return null;
    }

    private boolean I(class_1309 class_13092) {
        CallSite callSite = dev.hixo.M.d.a("\u00f9", (long)179869930689441125L) /* => net.minecraft.class_310.method_1551 */;
        if (class_13092 == null || callSite == null || dev.hixo.M.d.a("z", (Object)callSite, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */ == null) {
            return false;
        }
        if (class_13092 == dev.hixo.M.d.a("z", (Object)callSite, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */ || dev.hixo.M.d.a("$", (Object)class_13092, (long)186030414168428766L) /* => net.minecraft.class_1309.method_31481 */ != false || dev.hixo.M.d.a("$", (Object)class_13092, (long)82520077281759901L) /* => net.minecraft.class_1309.method_29504 */ != false || dev.hixo.M.d.a("$", (Object)class_13092, (long)83468261842299832L) /* => net.minecraft.class_1309.method_5805 */ == false || dev.hixo.M.d.a("$", (Object)class_13092, (long)123974669313727410L) /* => net.minecraft.class_1309.method_6032 */ <= 0.0f) {
            return false;
        }
        return (double)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)callSite, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (Object)class_13092, (long)167756919979340704L) /* => net.minecraft.class_746.method_5739 */ <= 3.7;
    }

    private void u(class_310 class_3102, class_2743 class_27432) {
        if (dev.hixo.M.d.a("z", (Object)this, (long)141317735219918779L) /* => dev.hixo.M.s.S.Y.UK */ == false) {
            CallSite callSite = dev.hixo.M.d.a("$", (Object)this, (long)166223312087082898L) /* => dev.hixo.M.s.S.Y.B */;
            if (callSite != null && dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)class_3102, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (long)175288240290473570L) /* => net.minecraft.class_746.method_24828 */ != false && dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)class_3102, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (long)135886899496477481L) /* => net.minecraft.class_746.method_5624 */ != false) {
                dev.hixo.M.d.a("$", (Object)this, (Object)callSite, (long)121695354242726282L) /* => dev.hixo.M.s.S.Y.x */;
                String[] stringArray = ab;
                dev.hixo.M.d.a("$", (Object)this, (Object)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("$", (Object)new StringBuilder(), (Object)stringArray[71], (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (int)dev.hixo.M.d.a("z", (Object)this, (long)41597054297703683L) /* => dev.hixo.M.s.S.Y.UB */, (long)32515713483113022L) /* => java.lang.StringBuilder.append */, (Object)stringArray[48], (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (long)59411206276622891L) /* => java.lang.StringBuilder.toString */, (long)88567634357029796L) /* => dev.hixo.M.s.S.Y.Q */;
            }
            return;
        }
        dev.hixo.M.d.a("\u00e7", (Object)this, (class_243)new class_243((double)dev.hixo.M.d.a("$", (Object)class_27432, (long)174595467974171539L) /* => net.minecraft.class_2743.method_11815 */, (double)dev.hixo.M.d.a("$", (Object)class_27432, (long)33628572229374580L) /* => net.minecraft.class_2743.method_11816 */, (double)dev.hixo.M.d.a("$", (Object)class_27432, (long)124368122574228271L) /* => net.minecraft.class_2743.method_11819 */), (long)196130981205602808L) /* => dev.hixo.M.s.S.Y.UU */;
        dev.hixo.M.d.a("\u00e7", (Object)this, (boolean)true, (long)33132004760985665L) /* => dev.hixo.M.s.S.Y.U4 */;
        dev.hixo.M.d.a("\u00e7", (Object)this, (int)0, (long)181052502933075839L) /* => dev.hixo.M.s.S.Y.Uo */;
        dev.hixo.M.d.a("\u00e7", (Object)this, (boolean)true, (long)162918849087722895L) /* => dev.hixo.M.s.S.Y.d */;
        dev.hixo.M.d.a("\u00e7", (Object)this, null, (long)33454823054977219L) /* => dev.hixo.M.s.S.Y.Uq */;
        dev.hixo.M.d.a("\u00e7", (Object)this, (int)0, (long)122990745300639938L) /* => dev.hixo.M.s.S.Y.m */;
        dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)103231341918994697L) /* => dev.hixo.M.s.S.Y.UI */, (long)169234657527780854L) /* => java.util.concurrent.ConcurrentLinkedQueue.clear */;
        if (dev.hixo.M.d.a("\u00f9", (double)dev.hixo.M.d.a("$", (Object)class_27432, (long)174595467974171539L) /* => net.minecraft.class_2743.method_11815 */, (long)184451009312960843L) /* => java.lang.Math.abs */ > 0.01 || dev.hixo.M.d.a("\u00f9", (double)dev.hixo.M.d.a("$", (Object)class_27432, (long)124368122574228271L) /* => net.minecraft.class_2743.method_11819 */, (long)184451009312960843L) /* => java.lang.Math.abs */ > 0.01) {
            dev.hixo.M.d.a("\u00e7", (Object)this, (int)dev.hixo.M.s.S.Y.a(16530, 4358987288078511596L), (long)146168055768241404L) /* => dev.hixo.M.s.S.Y.E */;
        }
        dev.hixo.M.d.a("$", (Object)this, (Object)ab[38], (long)88567634357029796L) /* => dev.hixo.M.s.S.Y.Q */;
    }

    private void x(class_1309 class_13092) {
        dev.hixo.M.d.a("\u00e7", (Object)this, (class_1309)class_13092, (long)195636415282267214L) /* => dev.hixo.M.s.S.Y.x */;
        dev.hixo.M.d.a("\u00e7", (Object)this, (int)dev.hixo.M.d.a("\u00f9", (int)1, (int)dev.hixo.M.d.a("\u00f9", (int)5, (int)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)138049727076281407L) /* => dev.hixo.M.s.S.Y.D */, (long)105488653926114013L) /* => dev.hixo.b.M.i */, (long)62474117164247490L) /* => java.lang.Math.min */, (long)199527982987698177L) /* => java.lang.Math.max */, (long)41597054297703683L) /* => dev.hixo.M.s.S.Y.UB */;
        dev.hixo.M.d.a("\u00e7", (Object)this, (int)dev.hixo.M.d.a("\u00f9", (int)6, (int)(dev.hixo.M.d.a("z", (Object)this, (long)41597054297703683L) /* => dev.hixo.M.s.S.Y.UB */ * 4), (long)199527982987698177L) /* => java.lang.Math.max */, (long)54254527441328088L) /* => dev.hixo.M.s.S.Y.J */;
    }

    private void m() {
        dev.hixo.M.d.a("\u00e7", (Object)this, null, (long)195636415282267214L) /* => dev.hixo.M.s.S.Y.x */;
        dev.hixo.M.d.a("\u00e7", (Object)this, (int)0, (long)41597054297703683L) /* => dev.hixo.M.s.S.Y.UB */;
        dev.hixo.M.d.a("\u00e7", (Object)this, (int)0, (long)54254527441328088L) /* => dev.hixo.M.s.S.Y.J */;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void g(String string) {
        block9: {
            block8: {
                class_2596 class_25962;
                dev.hixo.M.d.a("\u00e7", (Object)this, (boolean)false, (long)33132004760985665L) /* => dev.hixo.M.s.S.Y.U4 */;
                dev.hixo.M.d.a("\u00e7", (Object)this, (int)0, (long)181052502933075839L) /* => dev.hixo.M.s.S.Y.Uo */;
                CallSite callSite = dev.hixo.M.d.a("\u00f9", (long)179869930689441125L) /* => net.minecraft.class_310.method_1551 */;
                if (callSite == null || dev.hixo.M.d.a("$", (Object)callSite, (long)142529340399696089L) /* => net.minecraft.class_310.method_1562 */ == null) break block8;
                while ((class_25962 = (class_2596)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)103231341918994697L) /* => dev.hixo.M.s.S.Y.UI */, (long)123916111891130066L) /* => java.util.concurrent.ConcurrentLinkedQueue.poll */) != null) {
                    dev.hixo.M.d.a("\u00c1", (boolean)true, (long)85409331305917590L) /* => dev.hixo.M.s.S.Y.Uw */;
                    try {
                        dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("$", (Object)callSite, (long)142529340399696089L) /* => net.minecraft.class_310.method_1562 */, (Object)class_25962, (long)69141358163525131L) /* => net.minecraft.class_634.method_52787 */;
                    }
                    catch (Throwable throwable) {}
                    continue;
                    finally {
                        dev.hixo.M.d.a("\u00c1", (boolean)false, (long)85409331305917590L) /* => dev.hixo.M.s.S.Y.Uw */;
                    }
                }
                break block9;
            }
            dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)103231341918994697L) /* => dev.hixo.M.s.S.Y.UI */, (long)169234657527780854L) /* => java.util.concurrent.ConcurrentLinkedQueue.clear */;
        }
        dev.hixo.M.d.a("$", (Object)this, (Object)string, (long)43993329724287227L) /* => dev.hixo.M.s.S.Y.e */;
    }

    private void q(class_310 class_3102) {
        if (dev.hixo.M.d.a("z", (Object)this, (long)54254527441328088L) /* => dev.hixo.M.s.S.Y.J */ <= 0) {
            return;
        }
        Y y = this;
        reference v1 = dev.hixo.M.d.a("z", (Object)y, (long)54254527441328088L) /* => dev.hixo.M.s.S.Y.J */ - true;
        dev.hixo.M.d.a("\u00e7", (Object)y, (int)v1, (long)54254527441328088L) /* => dev.hixo.M.s.S.Y.J */;
        if (v1 <= 0) {
            dev.hixo.M.d.a("$", (Object)this, (long)92737571348502520L) /* => dev.hixo.M.s.S.Y.m */;
            return;
        }
        if (dev.hixo.M.d.a("z", (Object)this, (long)41597054297703683L) /* => dev.hixo.M.s.S.Y.UB */ <= 0 || dev.hixo.M.d.a("$", (Object)this, (Object)dev.hixo.M.d.a("z", (Object)this, (long)195636415282267214L) /* => dev.hixo.M.s.S.Y.x */, (long)100580361378317283L) /* => dev.hixo.M.s.S.Y.I */ == false) {
            dev.hixo.M.d.a("$", (Object)this, (long)92737571348502520L) /* => dev.hixo.M.s.S.Y.m */;
            return;
        }
        if (dev.hixo.M.d.a("z", (Object)class_3102, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */ == null || dev.hixo.M.d.a("z", (Object)class_3102, (long)100087742506519171L) /* => net.minecraft.class_310.field_1761 */ == null) {
            return;
        }
        if (dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)197517357066047766L) /* => dev.hixo.M.s.S.Y.R */, (long)65580906021680841L) /* => dev.hixo.b.g.x */ != false && dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)class_3102, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (long)135886899496477481L) /* => net.minecraft.class_746.method_5624 */ == false) {
            return;
        }
        if (dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)class_3102, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (long)178766331170989227L) /* => net.minecraft.class_746.method_6115 */ != false) {
            return;
        }
        if ((double)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)class_3102, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (Object)dev.hixo.M.d.a("z", (Object)this, (long)195636415282267214L) /* => dev.hixo.M.s.S.Y.x */, (long)167756919979340704L) /* => net.minecraft.class_746.method_5739 */ > 3.0) {
            return;
        }
        CallSite callSite = dev.hixo.M.d.a("\u00fd", (long)34297500847572953L) /* => dev.hixo.M.s.S.t.f */;
        if (callSite != null && dev.hixo.M.d.a("$", (Object)callSite, (long)96089342888548907L) /* => dev.hixo.M.G.c */ != false && dev.hixo.M.d.a("$", (Object)callSite, (long)164466594068746767L) /* => dev.hixo.M.s.S.t.T */ == dev.hixo.M.d.a("z", (Object)this, (long)195636415282267214L) /* => dev.hixo.M.s.S.Y.x */) {
            dev.hixo.M.d.a("\u00e7", (Object)this, (boolean)true, (long)167233183166192420L) /* => dev.hixo.M.s.S.Y.UW */;
            return;
        }
        dev.hixo.M.d.a("$", (Object)this, (Object)class_3102, (Object)dev.hixo.M.d.a("z", (Object)this, (long)195636415282267214L) /* => dev.hixo.M.s.S.Y.x */, (long)166836894013046425L) /* => dev.hixo.M.s.S.Y.c */;
    }

    private void c(class_310 class_3102, class_1309 class_13092) {
        try {
            CallSite callSite = dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)class_3102, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (long)135886899496477481L) /* => net.minecraft.class_746.method_5624 */;
            if (callSite != false) {
                dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)class_3102, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (boolean)false, (long)121854460523286196L) /* => net.minecraft.class_746.method_5728 */;
            }
            dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)class_3102, (long)100087742506519171L) /* => net.minecraft.class_310.field_1761 */, (Object)dev.hixo.M.d.a("z", (Object)class_3102, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (Object)class_13092, (long)74844823550591302L) /* => net.minecraft.class_636.method_2918 */;
            dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)class_3102, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (Object)dev.hixo.M.d.a("\u00fd", (long)85943668217877665L) /* => net.minecraft.class_1268.field_5808 */, (long)83963391352857873L) /* => net.minecraft.class_746.method_6104 */;
            if (callSite != false) {
                dev.hixo.M.d.a("$", (Object)this, (Object)class_3102, (long)58274535677844470L) /* => dev.hixo.M.s.S.Y.j */;
            }
            Y y = this;
            dev.hixo.M.d.a("\u00e7", (Object)y, (int)(dev.hixo.M.d.a("z", (Object)y, (long)41597054297703683L) /* => dev.hixo.M.s.S.Y.UB */ - true), (long)41597054297703683L) /* => dev.hixo.M.s.S.Y.UB */;
            dev.hixo.M.d.a("\u00e7", (Object)this, (int)dev.hixo.M.d.a("\u00f9", (int)dev.hixo.M.d.a("z", (Object)this, (long)54254527441328088L) /* => dev.hixo.M.s.S.Y.J */, (int)2, (long)199527982987698177L) /* => java.lang.Math.max */, (long)54254527441328088L) /* => dev.hixo.M.s.S.Y.J */;
            dev.hixo.M.d.a("$", (Object)this, (Object)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("$", (Object)new StringBuilder(), (Object)ab[78], (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (int)dev.hixo.M.d.a("z", (Object)this, (long)41597054297703683L) /* => dev.hixo.M.s.S.Y.UB */, (long)32515713483113022L) /* => java.lang.StringBuilder.append */, (Object)"\uff09", (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (long)59411206276622891L) /* => java.lang.StringBuilder.toString */, (long)143713508524126408L) /* => dev.hixo.M.s.S.Y.X */;
            if (dev.hixo.M.d.a("z", (Object)this, (long)41597054297703683L) /* => dev.hixo.M.s.S.Y.UB */ <= 0) {
                dev.hixo.M.d.a("$", (Object)this, (long)92737571348502520L) /* => dev.hixo.M.s.S.Y.m */;
            }
        }
        catch (Throwable throwable) {
            dev.hixo.M.d.a("$", (Object)this, (long)92737571348502520L) /* => dev.hixo.M.s.S.Y.m */;
        }
    }

    public void u() {
        CallSite callSite = dev.hixo.M.d.a("\u00f9", (long)179869930689441125L) /* => net.minecraft.class_310.method_1551 */;
        if (callSite == null || dev.hixo.M.d.a("z", (Object)callSite, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */ == null) {
            return;
        }
        dev.hixo.M.d.a("$", (Object)this, (Object)callSite, (long)58274535677844470L) /* => dev.hixo.M.s.S.Y.j */;
        if (dev.hixo.M.d.a("z", (Object)this, (long)41597054297703683L) /* => dev.hixo.M.s.S.Y.UB */ > 0) {
            Y y = this;
            dev.hixo.M.d.a("\u00e7", (Object)y, (int)(dev.hixo.M.d.a("z", (Object)y, (long)41597054297703683L) /* => dev.hixo.M.s.S.Y.UB */ - true), (long)41597054297703683L) /* => dev.hixo.M.s.S.Y.UB */;
        }
        dev.hixo.M.d.a("\u00e7", (Object)this, (int)dev.hixo.M.d.a("\u00f9", (int)dev.hixo.M.d.a("z", (Object)this, (long)54254527441328088L) /* => dev.hixo.M.s.S.Y.J */, (int)2, (long)199527982987698177L) /* => java.lang.Math.max */, (long)54254527441328088L) /* => dev.hixo.M.s.S.Y.J */;
        if (dev.hixo.M.d.a("z", (Object)this, (long)41597054297703683L) /* => dev.hixo.M.s.S.Y.UB */ <= 0) {
            dev.hixo.M.d.a("$", (Object)this, (long)92737571348502520L) /* => dev.hixo.M.s.S.Y.m */;
        }
    }

    public boolean K() {
        CallSite callSite = dev.hixo.M.d.a("z", (Object)this, (long)167233183166192420L) /* => dev.hixo.M.s.S.Y.UW */;
        dev.hixo.M.d.a("\u00e7", (Object)this, (boolean)false, (long)167233183166192420L) /* => dev.hixo.M.s.S.Y.UW */;
        return (boolean)callSite;
    }

    private void j(class_310 class_3102) {
        if (dev.hixo.M.d.a("z", (Object)class_3102, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */ == null) {
            return;
        }
        CallSite callSite = dev.hixo.M.d.a("\u00f9", (double)0.0, (double)dev.hixo.M.d.a("\u00f9", (double)1.0, (double)(dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)37999623404029984L) /* => dev.hixo.M.s.S.Y.H */, (long)86270808255001128L) /* => dev.hixo.b.M.J */ / 100.0), (long)195251025896564278L) /* => java.lang.Math.min */, (long)53777445532228911L) /* => java.lang.Math.max */;
        CallSite callSite2 = dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)class_3102, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (long)84667892282276784L) /* => net.minecraft.class_746.method_18798 */;
        dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)class_3102, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (double)(dev.hixo.M.d.a("$", (Object)callSite2, (long)117073359287434767L) /* => net.minecraft.class_243.method_10216 */ * callSite), (double)dev.hixo.M.d.a("$", (Object)callSite2, (long)102339986038638921L) /* => net.minecraft.class_243.method_10214 */, (double)(dev.hixo.M.d.a("$", (Object)callSite2, (long)128690190337235573L) /* => net.minecraft.class_243.method_10215 */ * callSite), (long)135514272950376820L) /* => net.minecraft.class_746.method_18800 */;
    }

    public boolean z(class_2596<?> class_25962) {
        if (dev.hixo.M.d.a("$", (Object)this, (long)96089342888548907L) /* => dev.hixo.M.G.c */ == false || dev.hixo.M.d.a("z", (Object)this, (long)33132004760985665L) /* => dev.hixo.M.s.S.Y.U4 */ == false || dev.hixo.M.d.a("\u00fd", (long)85409331305917590L) /* => dev.hixo.M.s.S.Y.Uw */ != false) {
            return false;
        }
        if (class_25962 instanceof class_2828 || class_25962 instanceof class_2851) {
            return true;
        }
        if (class_25962 instanceof class_2848) {
            class_2848 class_28482 = (class_2848)class_25962;
            return dev.hixo.M.d.a("$", (Object)class_28482, (long)148252621768106651L) /* => net.minecraft.class_2848.method_12365 */ == dev.hixo.M.d.a("\u00fd", (long)70722661036529958L) /* => net.minecraft.class_2848$class_2849.field_12981 */ || dev.hixo.M.d.a("$", (Object)class_28482, (long)148252621768106651L) /* => net.minecraft.class_2848.method_12365 */ == dev.hixo.M.d.a("\u00fd", (long)120364880155937319L) /* => net.minecraft.class_2848$class_2849.field_12985 */;
        }
        return false;
    }

    public void d(class_2596<?> class_25962) {
        if (dev.hixo.M.d.a("z", (Object)this, (long)33132004760985665L) /* => dev.hixo.M.s.S.Y.U4 */ != false) {
            dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)103231341918994697L) /* => dev.hixo.M.s.S.Y.UI */, class_25962, (long)36602647224533883L) /* => java.util.concurrent.ConcurrentLinkedQueue.add */;
        }
    }

    private void j() {
        dev.hixo.M.d.a("\u00e7", (Object)this, (boolean)false, (long)33132004760985665L) /* => dev.hixo.M.s.S.Y.U4 */;
        dev.hixo.M.d.a("\u00e7", (Object)this, (int)0, (long)181052502933075839L) /* => dev.hixo.M.s.S.Y.Uo */;
        dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)103231341918994697L) /* => dev.hixo.M.s.S.Y.UI */, (long)169234657527780854L) /* => java.util.concurrent.ConcurrentLinkedQueue.clear */;
        dev.hixo.M.d.a("\u00e7", (Object)this, (boolean)false, (long)141317735219918779L) /* => dev.hixo.M.s.S.Y.UK */;
        dev.hixo.M.d.a("\u00e7", (Object)this, (boolean)false, (long)167233183166192420L) /* => dev.hixo.M.s.S.Y.UW */;
        dev.hixo.M.d.a("\u00e7", (Object)this, (int)0, (long)146168055768241404L) /* => dev.hixo.M.s.S.Y.E */;
        dev.hixo.M.d.a("\u00e7", (Object)this, (int)0, (long)60139537868346752L) /* => dev.hixo.M.s.S.Y.W */;
        dev.hixo.M.d.a("$", (Object)this, (long)92737571348502520L) /* => dev.hixo.M.s.S.Y.m */;
    }

    public boolean g(class_2743 class_27432) {
        if (dev.hixo.M.d.a("$", (Object)this, (long)96089342888548907L) /* => dev.hixo.M.G.c */ == false || class_27432 == null || dev.hixo.M.d.a("\u00fd", (long)111172814197402593L) /* => dev.hixo.M.s.S.Y.Q */ != false) {
            return false;
        }
        if (dev.hixo.M.d.a("$", (Object)this, (long)64917908534334614L) /* => dev.hixo.M.s.S.Y.l */ != false) {
            return true;
        }
        if (dev.hixo.M.d.a("$", (Object)this, (long)139745142425630406L) /* => dev.hixo.M.s.S.Y.v */ != false) {
            if (dev.hixo.M.d.a("$", (Object)class_27432, (long)33628572229374580L) /* => net.minecraft.class_2743.method_11816 */ < 0.0) {
                return false;
            }
            return dev.hixo.M.d.a("z", (Object)this, (long)156548232470805456L) /* => dev.hixo.M.s.S.Y.G */ != false || dev.hixo.M.d.a("z", (Object)this, (long)152616670085752559L) /* => dev.hixo.M.s.S.Y.UM */ > 0;
        }
        if (dev.hixo.M.d.a("$", (Object)this, (long)81902397357159314L) /* => dev.hixo.M.s.S.Y.d */ != false) {
            dev.hixo.M.d.a("\u00e7", (Object)this, (boolean)dev.hixo.M.d.a("$", (Object)this, (Object)class_27432, (long)141879935423240895L) /* => dev.hixo.M.s.S.Y.k */, (long)141317735219918779L) /* => dev.hixo.M.s.S.Y.UK */;
            return (boolean)dev.hixo.M.d.a("z", (Object)this, (long)141317735219918779L) /* => dev.hixo.M.s.S.Y.UK */;
        }
        if (dev.hixo.M.d.a("$", (Object)this, (long)112838884836381076L) /* => dev.hixo.M.s.S.Y.p */ != false) {
            return (boolean)dev.hixo.M.d.a("z", (Object)this, (long)124497286045487820L) /* => dev.hixo.M.s.S.Y.M */;
        }
        if (dev.hixo.M.d.a("$", (Object)this, (long)79625085895809656L) /* => dev.hixo.M.s.S.Y.e */ != false) {
            return dev.hixo.M.d.a("$", (Object)class_27432, (long)33628572229374580L) /* => net.minecraft.class_2743.method_11816 */ >= 0.0;
        }
        return (boolean)dev.hixo.M.d.a("$", (Object)this, (long)58684295219914090L) /* => dev.hixo.M.s.S.Y.b */;
    }

    public boolean i() {
        return dev.hixo.M.d.a("z", (Object)this, (long)162918849087722895L) /* => dev.hixo.M.s.S.Y.d */ != false && dev.hixo.M.d.a("$", (Object)this, (long)96089342888548907L) /* => dev.hixo.M.G.c */ != false;
    }

    public boolean U(class_2596<?> class_25962) {
        if (dev.hixo.M.d.a("z", (Object)this, (long)156548232470805456L) /* => dev.hixo.M.s.S.Y.G */ != false && class_25962 instanceof class_2708) {
            String[] stringArray = ab;
            dev.hixo.M.d.a("$", (Object)this, (Object)stringArray[11], (long)43993329724287227L) /* => dev.hixo.M.s.S.Y.e */;
            return false;
        }
        if (dev.hixo.M.d.a("z", (Object)this, (long)33132004760985665L) /* => dev.hixo.M.s.S.Y.U4 */ != false && class_25962 instanceof class_2708) {
            dev.hixo.M.d.a("\u00e7", (Object)this, (int)dev.hixo.M.s.S.Y.a(16530, 4358987288078511596L), (long)60139537868346752L) /* => dev.hixo.M.s.S.Y.W */;
            String[] stringArray = ab;
            dev.hixo.M.d.a("$", (Object)this, (Object)stringArray[32], (long)81426466808365221L) /* => dev.hixo.M.s.S.Y.g */;
            return false;
        }
        if (class_25962 instanceof class_2626) {
            class_2626 class_26262 = (class_2626)class_25962;
            if (dev.hixo.M.d.a("z", (Object)this, (long)33454823054977219L) /* => dev.hixo.M.s.S.Y.Uq */ != null && dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)33454823054977219L) /* => dev.hixo.M.s.S.Y.Uq */, (Object)dev.hixo.M.d.a("$", (Object)class_26262, (long)61425051332801672L) /* => net.minecraft.class_2626.method_11309 */, (long)66918057010244211L) /* => net.minecraft.class_2338.equals */ != false) {
                dev.hixo.M.d.a("$", (Object)this, (Object)ab[27], (long)43993329724287227L) /* => dev.hixo.M.s.S.Y.e */;
                return false;
            }
        }
        return !(class_25962 instanceof class_7439) && !(class_25962 instanceof class_7438) && !(class_25962 instanceof class_2761);
    }

    public void b(class_2596<?> class_25962) {
        if (dev.hixo.M.d.a("z", (Object)this, (long)162918849087722895L) /* => dev.hixo.M.s.S.Y.d */ != false) {
            dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)157929119578870532L) /* => dev.hixo.M.s.S.Y.V */, class_25962, (long)36602647224533883L) /* => java.util.concurrent.ConcurrentLinkedQueue.add */;
        }
    }

    public void Q() {
        if (dev.hixo.M.d.a("$", (Object)this, (long)96089342888548907L) /* => dev.hixo.M.G.c */ == false) {
            return;
        }
        dev.hixo.M.d.a("\u00e7", (Object)this, (int)dev.hixo.M.s.S.Y.a(30854, 8310924116356617722L), (long)152616670085752559L) /* => dev.hixo.M.s.S.Y.UM */;
        if (dev.hixo.M.d.a("$", (Object)this, (long)112838884836381076L) /* => dev.hixo.M.s.S.Y.p */ != false) {
            dev.hixo.M.d.a("\u00e7", (Object)this, (boolean)true, (long)124497286045487820L) /* => dev.hixo.M.s.S.Y.M */;
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void N(class_2743 var1_1) {
        block101: {
            block105: {
                block104: {
                    block102: {
                        block103: {
                            block100: {
                                block99: {
                                    block98: {
                                        block96: {
                                            block97: {
                                                block95: {
                                                    block93: {
                                                        block94: {
                                                            block92: {
                                                                block84: {
                                                                    block82: {
                                                                        block83: {
                                                                            block90: {
                                                                                block91: {
                                                                                    block85: {
                                                                                        block86: {
                                                                                            block89: {
                                                                                                block87: {
                                                                                                    block88: {
                                                                                                        block78: {
                                                                                                            block79: {
                                                                                                                block80: {
                                                                                                                    block81: {
                                                                                                                        block76: {
                                                                                                                            block77: {
                                                                                                                                block74: {
                                                                                                                                    block75: {
                                                                                                                                        block72: {
                                                                                                                                            block73: {
                                                                                                                                                block71: {
                                                                                                                                                    block69: {
                                                                                                                                                        block70: {
                                                                                                                                                            block68: {
                                                                                                                                                                block67: {
                                                                                                                                                                    var3_2 = dev.hixo.M.d.a("\u00f9", (long)179869930689441125L) /* => net.minecraft.class_310.method_1551 */;
                                                                                                                                                                    var2_3 = dev.hixo.M.s.S.Y.w;
                                                                                                                                                                    v0 = var3_2;
                                                                                                                                                                    if (var2_3 != 0) break block67;
                                                                                                                                                                    if (v0 == null) break block68;
                                                                                                                                                                    v0 = var3_2;
                                                                                                                                                                }
                                                                                                                                                                if (dev.hixo.M.d.a("z", (Object)v0, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */ == null || var1_1 == null) break block68;
                                                                                                                                                                v1 = dev.hixo.M.d.a("\u00fd", (long)111172814197402593L) /* => dev.hixo.M.s.S.Y.Q */;
                                                                                                                                                                if (var2_3 != 0) break block69;
                                                                                                                                                                if (v1 == false) break block70;
                                                                                                                                                            }
                                                                                                                                                            return;
                                                                                                                                                        }
                                                                                                                                                        v2 = var1_1;
                                                                                                                                                        if (var2_3 != 0) break block71;
                                                                                                                                                        v1 = dev.hixo.M.d.a("$", (Object)v2, (long)120268019544200973L) /* => net.minecraft.class_2743.method_11818 */;
                                                                                                                                                    }
                                                                                                                                                    if (v1 != dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)var3_2, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (long)49557901471620191L) /* => net.minecraft.class_746.method_5628 */) {
                                                                                                                                                        return;
                                                                                                                                                    }
                                                                                                                                                    v2 = var1_1;
                                                                                                                                                }
                                                                                                                                                var4_4 = dev.hixo.M.d.a("$", (Object)v2, (long)174595467974171539L) /* => net.minecraft.class_2743.method_11815 */;
                                                                                                                                                var6_5 = dev.hixo.M.d.a("$", (Object)var1_1, (long)124368122574228271L) /* => net.minecraft.class_2743.method_11819 */;
                                                                                                                                                v3 = dev.hixo.M.d.a("\u00f9", (double)var4_4, (long)184451009312960843L) /* => java.lang.Math.abs */;
                                                                                                                                                v4 = 1.0E-4;
                                                                                                                                                if (var2_3 != 0) break block72;
                                                                                                                                                if (!(v3 < v4)) break block73;
                                                                                                                                                v3 = dev.hixo.M.d.a("\u00f9", (double)var6_5, (long)184451009312960843L) /* => java.lang.Math.abs */;
                                                                                                                                                v4 = 1.0E-4;
                                                                                                                                                if (var2_3 == 0) {
                                                                                                                                                    if (v3 < v4) {
                                                                                                                                                        return;
                                                                                                                                                    } else {
                                                                                                                                                        ** GOTO lbl35
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                                break block72;
                                                                                                                                            }
                                                                                                                                            v5 = this;
                                                                                                                                            dev.hixo.M.d.a("\u00e7", (Object)v5, (int)(dev.hixo.M.d.a("z", (Object)v5, (long)190346998449178644L) /* => dev.hixo.M.s.S.Y.U5 */ + true), (long)190346998449178644L) /* => dev.hixo.M.s.S.Y.U5 */;
                                                                                                                                            v6 = this;
                                                                                                                                            if (var2_3 != 0) break block74;
                                                                                                                                            dev.hixo.M.d.a("\u00e7", (Object)v6, (long)dev.hixo.M.d.a("\u00f9", (long)171188797904017458L) /* => java.lang.System.currentTimeMillis */, (long)139404318586354683L) /* => dev.hixo.M.s.S.Y.Y */;
                                                                                                                                            dev.hixo.M.d.a("\u00e7", (Object)this, (int)dev.hixo.M.s.S.Y.a(8959, 6394097224001589126L), (long)147586035931317266L) /* => dev.hixo.M.s.S.Y.v */;
                                                                                                                                            v3 = var4_4;
                                                                                                                                            v4 = 0.0;
                                                                                                                                        }
                                                                                                                                        if (v3 != v4) break block75;
                                                                                                                                        cfr_temp_0 = var6_5 - 0.0;
                                                                                                                                        v7 = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 > 0 ? 1 : -1);
                                                                                                                                        if (var2_3 != 0) break block76;
                                                                                                                                        if (v7 == false) break block77;
                                                                                                                                    }
                                                                                                                                    v6 = this;
                                                                                                                                }
                                                                                                                                dev.hixo.M.d.a("\u00e7", (Object)v6, (float)((float)dev.hixo.M.d.a("\u00f9", (double)dev.hixo.M.d.a("\u00f9", (double)var4_4, (double)(-var6_5), (long)130928682319801467L) /* => java.lang.Math.atan2 */, (long)59882655678323470L) /* => java.lang.Math.toDegrees */), (long)50597547123342978L) /* => dev.hixo.M.s.S.Y.K */;
                                                                                                                            }
                                                                                                                            v8 = this;
                                                                                                                            if (var2_3 != 0) break block78;
                                                                                                                            v7 = dev.hixo.M.d.a("\u00f9", (float)dev.hixo.M.d.a("z", (Object)v8, (long)50597547123342978L) /* => dev.hixo.M.s.S.Y.K */, (long)84869243229000521L) /* => java.lang.Float.isNaN */;
                                                                                                                        }
                                                                                                                        if (v7 != false) break block79;
                                                                                                                        v9 = this;
                                                                                                                        if (var2_3 != 0) break block80;
                                                                                                                        if (dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)v9, (long)58067084913954844L) /* => dev.hixo.M.s.S.Y.l */, (long)65580906021680841L) /* => dev.hixo.b.g.x */ != false) break block81;
                                                                                                                        v9 = this;
                                                                                                                        if (var2_3 != 0) break block80;
                                                                                                                        if (dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)v9, (long)78010308783148302L) /* => dev.hixo.M.s.S.Y.u */, (long)65580906021680841L) /* => dev.hixo.b.g.x */ != false) break block81;
                                                                                                                        v8 = this;
                                                                                                                        if (var2_3 != 0) break block78;
                                                                                                                        if (dev.hixo.M.d.a("$", (Object)v8, (long)58684295219914090L) /* => dev.hixo.M.s.S.Y.b */ == false) break block79;
                                                                                                                    }
                                                                                                                    v9 = this;
                                                                                                                }
                                                                                                                v10 = dev.hixo.M.d.a("z", (Object)this, (long)100514315248061815L) /* => dev.hixo.M.s.S.Y.UN */;
                                                                                                                v11 = this;
                                                                                                                if (var2_3 != 0) ** GOTO lbl79
                                                                                                                if (dev.hixo.M.d.a("$", (Object)v11, (long)58684295219914090L) /* => dev.hixo.M.s.S.Y.b */ != false) {
                                                                                                                    v12 = dev.hixo.M.d.a("$", (Object)this, (Object)var3_2, (long)123674012224966273L) /* => dev.hixo.M.s.S.Y.f */ + 4;
                                                                                                                } else {
                                                                                                                    v11 = this;
lbl79:
                                                                                                                    // 2 sources

                                                                                                                    v12 = dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)v11, (long)174335674662795500L) /* => dev.hixo.M.s.S.Y.e */, (long)105488653926114013L) /* => dev.hixo.b.M.i */;
                                                                                                                }
                                                                                                                dev.hixo.M.d.a("\u00e7", (Object)v9, (int)dev.hixo.M.d.a("\u00f9", (int)v10, (int)v12, (long)199527982987698177L) /* => java.lang.Math.max */, (long)100514315248061815L) /* => dev.hixo.M.s.S.Y.UN */;
                                                                                                            }
                                                                                                            v8 = this;
                                                                                                        }
                                                                                                        if (var2_3 == 0) {
                                                                                                            if (dev.hixo.M.d.a("$", (Object)v8, (long)81902397357159314L) /* => dev.hixo.M.s.S.Y.d */ != false) {
                                                                                                                dev.hixo.M.d.a("$", (Object)this, (Object)var3_2, (Object)var1_1, (long)97234000858602385L) /* => dev.hixo.M.s.S.Y.u */;
                                                                                                                return;
                                                                                                            }
                                                                                                            v8 = this;
                                                                                                        }
                                                                                                        if (var2_3 == 0) {
                                                                                                            if (dev.hixo.M.d.a("$", (Object)v8, (long)64917908534334614L) /* => dev.hixo.M.s.S.Y.l */ != false) {
                                                                                                                var8_6 = dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)147675052188975146L) /* => dev.hixo.M.s.S.Y.U6 */, (long)86270808255001128L) /* => dev.hixo.b.M.J */ / 100.0;
                                                                                                                var10_8 = dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)190138265832449807L) /* => dev.hixo.M.s.S.Y.UY */, (long)86270808255001128L) /* => dev.hixo.b.M.J */ / 100.0;
                                                                                                                var12_9 = new class_243((double)(dev.hixo.M.d.a("$", (Object)var1_1, (long)174595467974171539L) /* => net.minecraft.class_2743.method_11815 */ * var8_6), (double)(dev.hixo.M.d.a("$", (Object)var1_1, (long)33628572229374580L) /* => net.minecraft.class_2743.method_11816 */ * var10_8), (double)(dev.hixo.M.d.a("$", (Object)var1_1, (long)124368122574228271L) /* => net.minecraft.class_2743.method_11819 */ * var8_6));
                                                                                                                dev.hixo.M.d.a("$", (Object)var3_2, (Object)(Runnable)LambdaMetafactory.metafactory(null, null, null, ()V, lambda$onVelocityPacket$0(net.minecraft.class_310 net.minecraft.class_243 ), ()V)((class_310)var3_2, (class_243)var12_9), (long)185512432602743166L) /* => net.minecraft.class_310.execute */;
                                                                                                                var13_10 = dev.hixo.M.s.S.Y.ab;
                                                                                                                dev.hixo.M.d.a("$", (Object)this, (Object)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("$", (Object)new StringBuilder(), (Object)var13_10[9], (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (int)((int)(var8_6 * 100.0)), (long)32515713483113022L) /* => java.lang.StringBuilder.append */, (Object)var13_10[68], (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (int)((int)(var10_8 * 100.0)), (long)32515713483113022L) /* => java.lang.StringBuilder.append */, (Object)var13_10[30], (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (long)59411206276622891L) /* => java.lang.StringBuilder.toString */, (long)88567634357029796L) /* => dev.hixo.M.s.S.Y.Q */;
                                                                                                                return;
                                                                                                            }
                                                                                                            v8 = this;
                                                                                                        }
                                                                                                        if (var2_3 != 0) break block82;
                                                                                                        if (dev.hixo.M.d.a("$", (Object)v8, (long)139745142425630406L) /* => dev.hixo.M.s.S.Y.v */ == false) break block83;
                                                                                                        cfr_temp_1 = dev.hixo.M.d.a("$", (Object)var1_1, (long)33628572229374580L) /* => net.minecraft.class_2743.method_11816 */ - 0.0;
                                                                                                        v13 = cfr_temp_1 == 0 ? 0 : (cfr_temp_1 > 0 ? 1 : -1);
                                                                                                        if (var2_3 != 0) break block84;
                                                                                                        if (v13 < 0) break block83;
                                                                                                        v8 = this;
                                                                                                        if (var2_3 != 0) break block85;
                                                                                                        if (dev.hixo.M.d.a("z", (Object)v8, (long)156548232470805456L) /* => dev.hixo.M.s.S.Y.G */ == false) break block86;
                                                                                                        v14 = this;
                                                                                                        if (var2_3 != 0) break block87;
                                                                                                        if (dev.hixo.M.d.a("z", (Object)v14, (long)45398163565104993L) /* => dev.hixo.M.s.S.Y.UF */ <= 0) break block88;
                                                                                                        v14 = this;
                                                                                                        if (var2_3 != 0) break block87;
                                                                                                        if (dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)v14, (long)122555950847109799L) /* => dev.hixo.M.s.S.Y.Ue */, (long)65580906021680841L) /* => dev.hixo.b.g.x */ == false) break block88;
                                                                                                        v14 = this;
                                                                                                        if (var2_3 != 0) break block87;
                                                                                                        if (dev.hixo.M.d.a("$", (Object)v14, (long)144030804714470724L) /* => dev.hixo.M.s.S.Y.L */ == false) break block88;
                                                                                                        dev.hixo.M.d.a("\u00e7", (Object)this, null, (long)196130981205602808L) /* => dev.hixo.M.s.S.Y.UU */;
                                                                                                        dev.hixo.M.d.a("\u00e7", (Object)this, (int)1, (long)45398163565104993L) /* => dev.hixo.M.s.S.Y.UF */;
                                                                                                        var13_11 = dev.hixo.M.s.S.Y.ab;
                                                                                                        dev.hixo.M.d.a("$", (Object)this, (Object)var13_11[83], (long)88567634357029796L) /* => dev.hixo.M.s.S.Y.Q */;
                                                                                                        if (var2_3 == 0) break block89;
                                                                                                    }
                                                                                                    v14 = this;
                                                                                                }
                                                                                                var13_11 = dev.hixo.M.s.S.Y.ab;
                                                                                                dev.hixo.M.d.a("$", (Object)v14, (Object)var13_11[58], (long)88567634357029796L) /* => dev.hixo.M.s.S.Y.Q */;
                                                                                            }
                                                                                            dev.hixo.M.d.a("\u00e7", (Object)this, (int)0, (long)152616670085752559L) /* => dev.hixo.M.s.S.Y.UM */;
                                                                                            return;
                                                                                        }
                                                                                        v8 = this;
                                                                                    }
                                                                                    if (var2_3 != 0) break block82;
                                                                                    if (dev.hixo.M.d.a("z", (Object)v8, (long)152616670085752559L) /* => dev.hixo.M.s.S.Y.UM */ <= 0) break block83;
                                                                                    v15 = this;
                                                                                    if (var2_3 != 0) break block90;
                                                                                    if (dev.hixo.M.d.a("z", (Object)v15, (long)126298496164372661L) /* => dev.hixo.M.s.S.Y.n */ <= 0) break block91;
                                                                                    v15 = this;
                                                                                    if (var2_3 != 0) break block90;
                                                                                    if (dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)v15, (long)122555950847109799L) /* => dev.hixo.M.s.S.Y.Ue */, (long)65580906021680841L) /* => dev.hixo.b.g.x */ != false) {
                                                                                        v15 = this;
                                                                                        if (var2_3 == 0) {
                                                                                            if (dev.hixo.M.d.a("$", (Object)v15, (long)144030804714470724L) /* => dev.hixo.M.s.S.Y.L */ != false) {
                                                                                                v16 = this;
                                                                                                dev.hixo.M.d.a("\u00e7", (Object)v16, (int)(dev.hixo.M.d.a("z", (Object)v16, (long)126298496164372661L) /* => dev.hixo.M.s.S.Y.n */ - true), (long)126298496164372661L) /* => dev.hixo.M.s.S.Y.n */;
                                                                                                dev.hixo.M.d.a("\u00e7", (Object)this, (int)0, (long)152616670085752559L) /* => dev.hixo.M.s.S.Y.UM */;
                                                                                                var13_12 = dev.hixo.M.s.S.Y.ab;
                                                                                                dev.hixo.M.d.a("$", (Object)this, (Object)var13_12[49], (long)88567634357029796L) /* => dev.hixo.M.s.S.Y.Q */;
                                                                                                return;
                                                                                            } else {
                                                                                                ** GOTO lbl152
                                                                                            }
                                                                                        } else {
                                                                                            ** GOTO lbl151
                                                                                        }
                                                                                    }
                                                                                    break block91;
lbl151:
                                                                                    // 2 sources

                                                                                    break block90;
                                                                                }
                                                                                dev.hixo.M.d.a("\u00e7", (Object)this, (class_243)new class_243((double)dev.hixo.M.d.a("$", (Object)var1_1, (long)174595467974171539L) /* => net.minecraft.class_2743.method_11815 */, (double)dev.hixo.M.d.a("$", (Object)var1_1, (long)33628572229374580L) /* => net.minecraft.class_2743.method_11816 */, (double)dev.hixo.M.d.a("$", (Object)var1_1, (long)124368122574228271L) /* => net.minecraft.class_2743.method_11819 */), (long)196130981205602808L) /* => dev.hixo.M.s.S.Y.UU */;
                                                                                dev.hixo.M.d.a("\u00e7", (Object)this, (int)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)51518094437983296L) /* => dev.hixo.M.s.S.Y.y */, (long)105488653926114013L) /* => dev.hixo.b.M.i */, (long)45398163565104993L) /* => dev.hixo.M.s.S.Y.UF */;
                                                                                dev.hixo.M.d.a("\u00e7", (Object)this, (boolean)true, (long)156548232470805456L) /* => dev.hixo.M.s.S.Y.G */;
                                                                                dev.hixo.M.d.a("\u00e7", (Object)this, (boolean)true, (long)162918849087722895L) /* => dev.hixo.M.s.S.Y.d */;
                                                                                dev.hixo.M.d.a("\u00e7", (Object)this, null, (long)33454823054977219L) /* => dev.hixo.M.s.S.Y.Uq */;
                                                                                dev.hixo.M.d.a("\u00e7", (Object)this, (int)0, (long)122990745300639938L) /* => dev.hixo.M.s.S.Y.m */;
                                                                                dev.hixo.M.d.a("\u00e7", (Object)this, (int)0, (long)152616670085752559L) /* => dev.hixo.M.s.S.Y.UM */;
                                                                                v15 = this;
                                                                            }
                                                                            var13_13 = dev.hixo.M.s.S.Y.ab;
                                                                            dev.hixo.M.d.a("$", (Object)v15, (Object)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("$", (Object)new StringBuilder(), (Object)var13_13[81], (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (int)dev.hixo.M.d.a("z", (Object)this, (long)45398163565104993L) /* => dev.hixo.M.s.S.Y.UF */, (long)32515713483113022L) /* => java.lang.StringBuilder.append */, (Object)var13_13[25], (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (long)59411206276622891L) /* => java.lang.StringBuilder.toString */, (long)88567634357029796L) /* => dev.hixo.M.s.S.Y.Q */;
                                                                            return;
                                                                        }
                                                                        v8 = this;
                                                                    }
                                                                    if (var2_3 != 0) break block92;
                                                                    v13 = dev.hixo.M.d.a("$", (Object)v8, (long)58684295219914090L) /* => dev.hixo.M.s.S.Y.b */;
                                                                }
                                                                if (v13 != false) {
                                                                    dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)137130533230656381L) /* => dev.hixo.M.s.S.Y.i */, (Object)var1_1, (long)106283459724144669L) /* => java.util.Deque.add */;
                                                                    dev.hixo.M.d.a("\u00e7", (Object)this, (boolean)true, (long)103312637376242931L) /* => dev.hixo.M.s.S.Y.p */;
                                                                    dev.hixo.M.d.a("\u00e7", (Object)this, (boolean)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)var3_2, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (long)175288240290473570L) /* => net.minecraft.class_746.method_24828 */, (long)194579784118054002L) /* => dev.hixo.M.s.S.Y.U_ */;
                                                                    dev.hixo.M.d.a("\u00e7", (Object)this, (int)dev.hixo.M.d.a("$", (Object)this, (Object)var3_2, (long)123674012224966273L) /* => dev.hixo.M.s.S.Y.f */, (long)66437176329997860L) /* => dev.hixo.M.s.S.Y.t */;
                                                                }
                                                                v8 = this;
                                                            }
                                                            if (var2_3 != 0) break block93;
                                                            if (dev.hixo.M.d.a("$", (Object)v8, (long)79625085895809656L) /* => dev.hixo.M.s.S.Y.e */ == false) break block94;
                                                            cfr_temp_2 = dev.hixo.M.d.a("$", (Object)var1_1, (long)33628572229374580L) /* => net.minecraft.class_2743.method_11816 */ - 0.0;
                                                            v17 = cfr_temp_2 == 0 ? 0 : (cfr_temp_2 > 0 ? 1 : -1);
                                                            if (var2_3 != 0) break block95;
                                                            if (v17 >= 0) {
                                                                dev.hixo.M.d.a("\u00e7", (Object)this, (int)1, (long)122990745300639938L) /* => dev.hixo.M.s.S.Y.m */;
                                                                dev.hixo.M.d.a("\u00e7", (Object)this, (int)dev.hixo.M.s.S.Y.a(717, 6711818625119989682L), (long)58823014778465840L) /* => dev.hixo.M.s.S.Y.C */;
                                                                dev.hixo.M.d.a("\u00e7", (Object)this, (boolean)true, (long)162918849087722895L) /* => dev.hixo.M.s.S.Y.d */;
                                                                dev.hixo.M.d.a("\u00e7", (Object)this, (int)dev.hixo.M.s.S.Y.a(25184, 921852713040629531L), (long)136172686434858944L) /* => dev.hixo.M.s.S.Y.UL */;
                                                                dev.hixo.M.d.a("\u00e7", (Object)this, null, (long)33454823054977219L) /* => dev.hixo.M.s.S.Y.Uq */;
                                                                var13_14 = dev.hixo.M.s.S.Y.ab;
                                                                dev.hixo.M.d.a("$", (Object)this, (Object)var13_14[33], (long)88567634357029796L) /* => dev.hixo.M.s.S.Y.Q */;
                                                            }
                                                        }
                                                        v8 = this;
                                                    }
                                                    if (var2_3 != 0) break block96;
                                                    v17 = dev.hixo.M.d.a("$", (Object)v8, (long)112838884836381076L) /* => dev.hixo.M.s.S.Y.p */;
                                                }
                                                if (v17 == false) break block97;
                                                v8 = this;
                                                if (var2_3 != 0) break block96;
                                                if (dev.hixo.M.d.a("z", (Object)v8, (long)124497286045487820L) /* => dev.hixo.M.s.S.Y.M */ == false) break block97;
                                                dev.hixo.M.d.a("\u00e7", (Object)this, (boolean)false, (long)124497286045487820L) /* => dev.hixo.M.s.S.Y.M */;
                                                dev.hixo.M.d.a("\u00e7", (Object)this, (int)1, (long)34138200719249862L) /* => dev.hixo.M.s.S.Y.U0 */;
                                                var13_14 = dev.hixo.M.s.S.Y.ab;
                                                v18 = dev.hixo.M.d.a("$", (Object)new StringBuilder(), (Object)var13_14[64], (long)86542515882976328L) /* => java.lang.StringBuilder.append */;
                                                v19 = dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)142952690696426536L) /* => dev.hixo.M.s.S.Y.UA */, (long)65580906021680841L) /* => dev.hixo.b.g.x */;
                                                if (var2_3 == 0) {
                                                    v19 = v19 != false ? (Object)4 : (Object)true;
                                                }
                                                var13_14 = dev.hixo.M.s.S.Y.ab;
                                                dev.hixo.M.d.a("$", (Object)this, (Object)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("$", (Object)v18, (int)v19, (long)32515713483113022L) /* => java.lang.StringBuilder.append */, (Object)var13_14[2], (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (long)59411206276622891L) /* => java.lang.StringBuilder.toString */, (long)88567634357029796L) /* => dev.hixo.M.s.S.Y.Q */;
                                                if (var2_3 == 0) break block98;
                                            }
                                            v8 = this;
                                        }
                                        if (var2_3 != 0) break block99;
                                        if (dev.hixo.M.d.a("\u00f9", (float)dev.hixo.M.d.a("z", (Object)v8, (long)50597547123342978L) /* => dev.hixo.M.s.S.Y.K */, (long)84869243229000521L) /* => java.lang.Float.isNaN */ == false) {
                                            var13_14 = dev.hixo.M.s.S.Y.ab;
                                            v20 = dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("$", (Object)new StringBuilder(), (Object)var13_14[76], (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (int)dev.hixo.M.d.a("z", (Object)this, (long)190346998449178644L) /* => dev.hixo.M.s.S.Y.U5 */, (long)32515713483113022L) /* => java.lang.StringBuilder.append */;
                                            v21 = var13_14[80];
                                            if (var2_3 == 0) {
                                                v20 = dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("$", (Object)v20, (Object)v21, (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (int)dev.hixo.M.d.a("\u00f9", (float)dev.hixo.M.d.a("z", (Object)this, (long)50597547123342978L) /* => dev.hixo.M.s.S.Y.K */, (long)90255071001362112L) /* => java.lang.Math.round */, (long)32515713483113022L) /* => java.lang.StringBuilder.append */, (Object)"\u00b0", (long)86542515882976328L) /* => java.lang.StringBuilder.append */;
                                                v21 = dev.hixo.M.d.a("$", (Object)this, (long)58684295219914090L) /* => dev.hixo.M.s.S.Y.b */ != false ? dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("$", (Object)new StringBuilder(), (Object)var13_14[50], (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (int)dev.hixo.M.d.a("z", (Object)this, (long)66437176329997860L) /* => dev.hixo.M.s.S.Y.t */, (long)32515713483113022L) /* => java.lang.StringBuilder.append */, (Object)var13_14[43], (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (long)59411206276622891L) /* => java.lang.StringBuilder.toString */ : "";
                                            }
                                            dev.hixo.M.d.a("$", (Object)this, (Object)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("$", (Object)v20, (Object)v21, (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (long)59411206276622891L) /* => java.lang.StringBuilder.toString */, (long)88567634357029796L) /* => dev.hixo.M.s.S.Y.Q */;
                                        }
                                    }
                                    v8 = this;
                                }
                                v22 /* !! */  = dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)v8, (long)93486873927977905L) /* => dev.hixo.M.s.S.Y.UH */, (long)65580906021680841L) /* => dev.hixo.b.g.x */;
                                if (var2_3 != 0) break block100;
                                if (v22 /* !! */  == false) break block101;
                                v22 /* !! */  = true;
                            }
                            var8_7 /* !! */  = v22 /* !! */ ;
                            v23 /* !! */  = dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)138935281466816344L) /* => dev.hixo.M.s.S.Y.q */, (long)65580906021680841L) /* => dev.hixo.b.g.x */;
                            if (var2_3 != 0) break block102;
                            if (v23 /* !! */  == false) break block103;
                            cfr_temp_3 = dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("\u00fd", (long)77194179047865275L) /* => dev.hixo.M.s.S.Y.h */, (long)171017999122652309L) /* => java.util.Random.nextFloat */ - (float)(dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)107946669314962452L) /* => dev.hixo.M.s.S.Y.U */, (long)86270808255001128L) /* => dev.hixo.b.M.J */ / 100.0);
                            v24 = cfr_temp_3 == 0 ? 0 : (cfr_temp_3 < 0 ? -1 : 1);
                            if (var2_3 == 0) {
                                v24 = v24 < 0 ? (Object)true : (Object)false;
                            }
                            v23 /* !! */  = var8_7 /* !! */  = v24;
                            if (var2_3 != 0) break block102;
                            if (v23 /* !! */  == false) break block103;
                            cfr_temp_4 = dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("\u00fd", (long)77194179047865275L) /* => dev.hixo.M.s.S.Y.h */, (long)171017999122652309L) /* => java.util.Random.nextFloat */ - 0.1f;
                            v23 /* !! */  = cfr_temp_4 == 0 ? 0 : (cfr_temp_4 < 0 ? -1 : 1);
                            if (var2_3 != 0) break block102;
                            if (v23 /* !! */  < 0) {
                                var8_7 /* !! */  = (reference)false;
                            }
                        }
                        v23 /* !! */  = var8_7 /* !! */ ;
                    }
                    if (var2_3 != 0) break block104;
                    if (v23 /* !! */  == false) break block101;
                    v23 /* !! */  = dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)var3_2, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (long)175288240290473570L) /* => net.minecraft.class_746.method_24828 */;
                }
                if (v23 /* !! */  == false) break block105;
                dev.hixo.M.d.a("\u00e7", (Object)this, (boolean)true, (long)106769124039414831L) /* => dev.hixo.M.s.S.Y.c */;
                dev.hixo.M.d.a("\u00e7", (Object)this, (int)dev.hixo.M.s.S.Y.a(16530, 4358987288078511596L), (long)153771088441963898L) /* => dev.hixo.M.s.S.Y.UJ */;
                if (var2_3 == 0) break block101;
            }
            dev.hixo.M.d.a("\u00e7", (Object)this, (boolean)true, (long)48779331642593393L) /* => dev.hixo.M.s.S.Y.N */;
            dev.hixo.M.d.a("\u00e7", (Object)this, (int)0, (long)133860200793568013L) /* => dev.hixo.M.s.S.Y.Uh */;
        }
    }

    private int f(class_310 class_3102) {
        return (int)(dev.hixo.M.d.a("z", (Object)class_3102, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */ != null && dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)class_3102, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (long)175288240290473570L) /* => net.minecraft.class_746.method_24828 */ != false ? dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)63267763479217164L) /* => dev.hixo.M.s.S.Y.Uy */, (long)105488653926114013L) /* => dev.hixo.b.M.i */ : dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)45633880719883045L) /* => dev.hixo.M.s.S.Y.P */, (long)105488653926114013L) /* => dev.hixo.b.M.i */);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void t() {
        CallSite callSite = dev.hixo.M.d.a("\u00f9", (long)179869930689441125L) /* => net.minecraft.class_310.method_1551 */;
        dev.hixo.M.d.a("\u00e7", (Object)this, (boolean)false, (long)103312637376242931L) /* => dev.hixo.M.s.S.Y.p */;
        dev.hixo.M.d.a("\u00e7", (Object)this, (int)0, (long)66437176329997860L) /* => dev.hixo.M.s.S.Y.t */;
        if (callSite == null || dev.hixo.M.d.a("$", (Object)callSite, (long)142529340399696089L) /* => net.minecraft.class_310.method_1562 */ == null) {
            dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)137130533230656381L) /* => dev.hixo.M.s.S.Y.i */, (long)101892323560971662L) /* => java.util.Deque.clear */;
            return;
        }
        while (dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)137130533230656381L) /* => dev.hixo.M.s.S.Y.i */, (long)59737830465201786L) /* => java.util.Deque.isEmpty */ == false) {
            class_2743 class_27432 = (class_2743)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)137130533230656381L) /* => dev.hixo.M.s.S.Y.i */, (long)84120656892549789L) /* => java.util.Deque.pollFirst */;
            dev.hixo.M.d.a("\u00c1", (boolean)true, (long)111172814197402593L) /* => dev.hixo.M.s.S.Y.Q */;
            try {
                dev.hixo.M.d.a("$", (Object)class_27432, (Object)dev.hixo.M.d.a("$", (Object)callSite, (long)142529340399696089L) /* => net.minecraft.class_310.method_1562 */, (long)95918870023154264L) /* => net.minecraft.class_2743.method_11817 */;
            }
            finally {
                dev.hixo.M.d.a("\u00c1", (boolean)false, (long)111172814197402593L) /* => dev.hixo.M.s.S.Y.Q */;
            }
        }
        dev.hixo.M.d.a("\u00e7", (Object)this, (boolean)true, (long)106769124039414831L) /* => dev.hixo.M.s.S.Y.c */;
        dev.hixo.M.d.a("\u00e7", (Object)this, (int)dev.hixo.M.s.S.Y.a(12450, 7200630640873414106L), (long)153771088441963898L) /* => dev.hixo.M.s.S.Y.UJ */;
        dev.hixo.M.d.a("$", (Object)this, (Object)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("$", (Object)new StringBuilder(), (Object)ab[4], (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (Object)(dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)93486873927977905L) /* => dev.hixo.M.s.S.Y.UH */, (long)65580906021680841L) /* => dev.hixo.b.g.x */ != false ? ab[60] : ""), (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (long)59411206276622891L) /* => java.lang.StringBuilder.toString */, (long)143713508524126408L) /* => dev.hixo.M.s.S.Y.X */;
    }

    @E
    public void C(p_0 p_02) {
        String[] stringArray;
        Object object;
        if (dev.hixo.M.d.a("$", (Object)p_02, (long)52512254813896748L) /* => dev.hixo.T.q.p.W */ != dev.hixo.M.d.a("\u00fd", (long)199476637466971905L) /* => dev.hixo.T.S.PRE */) {
            return;
        }
        CallSite callSite = dev.hixo.M.d.a("\u00f9", (long)179869930689441125L) /* => net.minecraft.class_310.method_1551 */;
        if (callSite == null || dev.hixo.M.d.a("z", (Object)callSite, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */ == null || dev.hixo.M.d.a("z", (Object)callSite, (long)129597241205579821L) /* => net.minecraft.class_310.field_1690 */ == null) {
            return;
        }
        if (dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)callSite, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (long)147827598445615920L) /* => net.minecraft.class_746.method_29504 */ != false) {
            return;
        }
        if (dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)callSite, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (long)175288240290473570L) /* => net.minecraft.class_746.method_24828 */ != false) {
            Y y = this;
            dev.hixo.M.d.a("\u00e7", (Object)y, (int)(dev.hixo.M.d.a("z", (Object)y, (long)137573817861904304L) /* => dev.hixo.M.s.S.Y.Uc */ + true), (long)137573817861904304L) /* => dev.hixo.M.s.S.Y.Uc */;
        } else {
            dev.hixo.M.d.a("\u00e7", (Object)this, (int)0, (long)137573817861904304L) /* => dev.hixo.M.s.S.Y.Uc */;
        }
        CallSite callSite2 = dev.hixo.M.d.a("z", (Object)this, (long)156247685155309515L) /* => dev.hixo.M.s.S.Y.A */;
        if (callSite2 != null) {
            dev.hixo.M.d.a("\u00e7", (Object)this, null, (long)156247685155309515L) /* => dev.hixo.M.s.S.Y.A */;
            dev.hixo.M.d.a("$", (Object)this, (Object)callSite2, (long)143713508524126408L) /* => dev.hixo.M.s.S.Y.X */;
        }
        if (dev.hixo.M.d.a("z", (Object)this, (long)103312637376242931L) /* => dev.hixo.M.s.S.Y.p */ != false) {
            boolean bl;
            Y y = this;
            reference v2 = dev.hixo.M.d.a("z", (Object)y, (long)66437176329997860L) /* => dev.hixo.M.s.S.Y.t */ - true;
            dev.hixo.M.d.a("\u00e7", (Object)y, (int)v2, (long)66437176329997860L) /* => dev.hixo.M.s.S.Y.t */;
            object = v2 <= 0;
            boolean bl2 = bl = dev.hixo.M.d.a("z", (Object)this, (long)194579784118054002L) /* => dev.hixo.M.s.S.Y.U_ */ == false && dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)callSite, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (long)175288240290473570L) /* => net.minecraft.class_746.method_24828 */ != false;
            if (object || bl) {
                dev.hixo.M.d.a("$", (Object)this, (long)197563193355678731L) /* => dev.hixo.M.s.S.Y.t */;
            }
        }
        if (dev.hixo.M.d.a("z", (Object)this, (long)156548232470805456L) /* => dev.hixo.M.s.S.Y.G */ != false) {
            if (dev.hixo.M.d.a("z", (Object)this, (long)152616670085752559L) /* => dev.hixo.M.s.S.Y.UM */ > 0) {
                Y y = this;
                dev.hixo.M.d.a("\u00e7", (Object)y, (int)(dev.hixo.M.d.a("z", (Object)y, (long)152616670085752559L) /* => dev.hixo.M.s.S.Y.UM */ - true), (long)152616670085752559L) /* => dev.hixo.M.s.S.Y.UM */;
            }
            Y y = this;
            reference v6 = dev.hixo.M.d.a("z", (Object)y, (long)45398163565104993L) /* => dev.hixo.M.s.S.Y.UF */ - true;
            dev.hixo.M.d.a("\u00e7", (Object)y, (int)v6, (long)45398163565104993L) /* => dev.hixo.M.s.S.Y.UF */;
            if (v6 <= 0) {
                stringArray = ab;
                dev.hixo.M.d.a("$", (Object)this, (Object)stringArray[36], (long)43993329724287227L) /* => dev.hixo.M.s.S.Y.e */;
            }
        } else if (dev.hixo.M.d.a("z", (Object)this, (long)152616670085752559L) /* => dev.hixo.M.s.S.Y.UM */ > 0) {
            Y y = this;
            dev.hixo.M.d.a("\u00e7", (Object)y, (int)(dev.hixo.M.d.a("z", (Object)y, (long)152616670085752559L) /* => dev.hixo.M.s.S.Y.UM */ - true), (long)152616670085752559L) /* => dev.hixo.M.s.S.Y.UM */;
        }
        if (dev.hixo.M.d.a("z", (Object)this, (long)60139537868346752L) /* => dev.hixo.M.s.S.Y.W */ > 0) {
            Y y = this;
            dev.hixo.M.d.a("\u00e7", (Object)y, (int)(dev.hixo.M.d.a("z", (Object)y, (long)60139537868346752L) /* => dev.hixo.M.s.S.Y.W */ - true), (long)60139537868346752L) /* => dev.hixo.M.s.S.Y.W */;
        }
        if (dev.hixo.M.d.a("z", (Object)this, (long)146168055768241404L) /* => dev.hixo.M.s.S.Y.E */ > 0) {
            Y y = this;
            dev.hixo.M.d.a("\u00e7", (Object)y, (int)(dev.hixo.M.d.a("z", (Object)y, (long)146168055768241404L) /* => dev.hixo.M.s.S.Y.E */ - true), (long)146168055768241404L) /* => dev.hixo.M.s.S.Y.E */;
            dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("z", (Object)callSite, (long)129597241205579821L) /* => net.minecraft.class_310.field_1690 */, (long)67693188334162439L) /* => net.minecraft.class_315.field_1894 */, (boolean)true, (long)66388162404330922L) /* => net.minecraft.class_304.method_23481 */;
        }
        if (dev.hixo.M.d.a("z", (Object)this, (long)33132004760985665L) /* => dev.hixo.M.s.S.Y.U4 */ != false) {
            Y y = this;
            dev.hixo.M.d.a("\u00e7", (Object)y, (int)(dev.hixo.M.d.a("z", (Object)y, (long)181052502933075839L) /* => dev.hixo.M.s.S.Y.Uo */ + true), (long)181052502933075839L) /* => dev.hixo.M.s.S.Y.Uo */;
            object = dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)callSite, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (long)175288240290473570L) /* => net.minecraft.class_746.method_24828 */;
            if (object || dev.hixo.M.d.a("z", (Object)this, (long)181052502933075839L) /* => dev.hixo.M.s.S.Y.Uo */ >= 12) {
                CallSite callSite3 = dev.hixo.M.d.a("$", (Object)this, (long)166223312087082898L) /* => dev.hixo.M.s.S.Y.B */;
                if (object && callSite3 != null && dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)callSite, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (long)135886899496477481L) /* => net.minecraft.class_746.method_5624 */ != false) {
                    stringArray = ab;
                    dev.hixo.M.d.a("$", (Object)this, (Object)stringArray[56], (long)81426466808365221L) /* => dev.hixo.M.s.S.Y.g */;
                    dev.hixo.M.d.a("$", (Object)this, (Object)callSite3, (long)121695354242726282L) /* => dev.hixo.M.s.S.Y.x */;
                } else {
                    String string;
                    if (dev.hixo.M.d.a("z", (Object)this, (long)181052502933075839L) /* => dev.hixo.M.s.S.Y.Uo */ >= 12) {
                        stringArray = ab;
                        string = stringArray[20];
                    } else {
                        string = ab[73];
                    }
                    dev.hixo.M.d.a("$", (Object)this, (Object)string, (long)81426466808365221L) /* => dev.hixo.M.s.S.Y.g */;
                    if (object && dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)callSite, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (long)135886899496477481L) /* => net.minecraft.class_746.method_5624 */ != false) {
                        dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)callSite, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (boolean)false, (long)121854460523286196L) /* => net.minecraft.class_746.method_5728 */;
                    }
                }
            }
        }
        if (dev.hixo.M.d.a("z", (Object)this, (long)33132004760985665L) /* => dev.hixo.M.s.S.Y.U4 */ == false) {
            dev.hixo.M.d.a("$", (Object)this, (Object)callSite, (long)172380227581783087L) /* => dev.hixo.M.s.S.Y.q */;
        }
        dev.hixo.M.d.a("$", (Object)this, (Object)callSite, (long)107122299599996653L) /* => dev.hixo.M.s.S.Y.B */;
        dev.hixo.M.d.a("$", (Object)this, (Object)callSite, (long)89404676174492535L) /* => dev.hixo.M.s.S.Y.H */;
        dev.hixo.M.d.a("$", (Object)this, (Object)callSite, (long)181124157533445817L) /* => dev.hixo.M.s.S.Y.i */;
        dev.hixo.M.d.a("$", (Object)this, (Object)callSite, (long)63597395503719256L) /* => dev.hixo.M.s.S.Y.J */;
        dev.hixo.M.d.a("$", (Object)this, (Object)callSite, (long)70982605179264955L) /* => dev.hixo.M.s.S.Y.h */;
        dev.hixo.M.d.a("$", (Object)this, (Object)callSite, (long)53990279155608797L) /* => dev.hixo.M.s.S.Y.k */;
        if (dev.hixo.M.d.a("z", (Object)this, (long)34138200719249862L) /* => dev.hixo.M.s.S.Y.U0 */ > 0) {
            Y y = this;
            reference v13 = dev.hixo.M.d.a("z", (Object)y, (long)34138200719249862L) /* => dev.hixo.M.s.S.Y.U0 */ - true;
            dev.hixo.M.d.a("\u00e7", (Object)y, (int)v13, (long)34138200719249862L) /* => dev.hixo.M.s.S.Y.U0 */;
            if (v13 == false) {
                dev.hixo.M.d.a("$", (Object)this, (Object)callSite, (long)187422138702246976L) /* => dev.hixo.M.s.S.Y.m */;
            }
        }
        if (dev.hixo.M.d.a("z", (Object)this, (long)158762271070531726L) /* => dev.hixo.M.s.S.Y.Ua */ > 0) {
            Y y = this;
            dev.hixo.M.d.a("\u00e7", (Object)y, (int)(dev.hixo.M.d.a("z", (Object)y, (long)158762271070531726L) /* => dev.hixo.M.s.S.Y.Ua */ - true), (long)158762271070531726L) /* => dev.hixo.M.s.S.Y.Ua */;
        }
    }

    private void k(class_310 class_3102) {
        if (dev.hixo.M.d.a("z", (Object)this, (long)162918849087722895L) /* => dev.hixo.M.s.S.Y.d */ == false || dev.hixo.M.d.a("z", (Object)this, (long)156548232470805456L) /* => dev.hixo.M.s.S.Y.G */ != false) {
            return;
        }
        Y y = this;
        reference v1 = dev.hixo.M.d.a("z", (Object)y, (long)136172686434858944L) /* => dev.hixo.M.s.S.Y.UL */ - true;
        dev.hixo.M.d.a("\u00e7", (Object)y, (int)v1, (long)136172686434858944L) /* => dev.hixo.M.s.S.Y.UL */;
        if (v1 <= 0) {
            dev.hixo.M.d.a("$", (Object)this, (Object)ab[28], (long)43993329724287227L) /* => dev.hixo.M.s.S.Y.e */;
            return;
        }
        if (dev.hixo.M.d.a("z", (Object)this, (long)122990745300639938L) /* => dev.hixo.M.s.S.Y.m */ == true) {
            Y y2 = this;
            reference v3 = dev.hixo.M.d.a("z", (Object)y2, (long)58823014778465840L) /* => dev.hixo.M.s.S.Y.C */ - true;
            dev.hixo.M.d.a("\u00e7", (Object)y2, (int)v3, (long)58823014778465840L) /* => dev.hixo.M.s.S.Y.C */;
            if (v3 <= 0) {
                dev.hixo.M.d.a("$", (Object)this, (Object)class_3102, (long)182518045153770213L) /* => dev.hixo.M.s.S.Y.E */;
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void E(class_310 class_3102) {
        dev.hixo.M.d.a("\u00e7", (Object)this, (int)0, (long)122990745300639938L) /* => dev.hixo.M.s.S.Y.m */;
        if (dev.hixo.M.d.a("z", (Object)class_3102, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */ == null) return;
        if (dev.hixo.M.d.a("z", (Object)class_3102, (long)38197671011210569L) /* => net.minecraft.class_310.field_1687 */ == null) return;
        if (dev.hixo.M.d.a("z", (Object)class_3102, (long)100087742506519171L) /* => net.minecraft.class_310.field_1761 */ == null) return;
        if (dev.hixo.M.d.a("$", (Object)class_3102, (long)142529340399696089L) /* => net.minecraft.class_310.method_1562 */ == null) {
            return;
        }
        try {
            float f = 89.79f;
            reference var3_4 = dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)class_3102, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (long)68578805942358681L) /* => net.minecraft.class_746.method_36454 */;
            CallSite callSite3 = dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)class_3102, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (long)88005680930564042L) /* => net.minecraft.class_746.method_33571 */;
            CallSite callSite4 = dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)class_3102, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (float)f, (float)var3_4, (long)50689960509270277L) /* => net.minecraft.class_746.method_5631 */;
            CallSite callSite5 = dev.hixo.M.d.a("$", (Object)callSite3, (Object)dev.hixo.M.d.a("$", (Object)callSite4, (double)3.7, (long)173986879005556268L) /* => net.minecraft.class_243.method_1021 */, (long)161433989394049089L) /* => net.minecraft.class_243.method_1019 */;
            CallSite callSite2 = dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)class_3102, (long)38197671011210569L) /* => net.minecraft.class_310.field_1687 */, (Object)new class_3959((class_243)callSite3, (class_243)callSite5, (class_3959.class_3960)dev.hixo.M.d.a("\u00fd", (long)183271091819016643L) /* => net.minecraft.class_3959$class_3960.field_17559 */, (class_3959.class_242)dev.hixo.M.d.a("\u00fd", (long)176130370867232441L) /* => net.minecraft.class_3959$class_242.field_1348 */, (class_1297)dev.hixo.M.d.a("z", (Object)class_3102, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */), (long)199056274235906075L) /* => net.minecraft.class_638.method_17742 */;
            if (callSite2 == null) return;
            if (dev.hixo.M.d.a("$", (Object)callSite2, (long)195314132873797734L) /* => net.minecraft.class_3965.method_17777 */ == null) {
                return;
            }
            CallSite callSite = dev.hixo.M.d.a("$", (Object)callSite2, (long)195314132873797734L) /* => net.minecraft.class_3965.method_17777 */;
            if (dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)class_3102, (long)38197671011210569L) /* => net.minecraft.class_310.field_1687 */, (Object)callSite, (long)170782435888130580L) /* => net.minecraft.class_638.method_8320 */, (long)41663768830184110L) /* => net.minecraft.class_2680.method_26215 */ != false) {
                return;
            }
            if (dev.hixo.M.d.a("\u00f9", (Object)dev.hixo.M.d.a("z", (Object)class_3102, (long)38197671011210569L) /* => net.minecraft.class_310.field_1687 */, (Object)callSite, (long)163417932527127049L) /* => dev.hixo.M.s.S.Y.j */ != false) {
                return;
            }
            if (dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)class_3102, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (long)187596606581785047L) /* => net.minecraft.class_746.method_5829 */, (Object)new class_238((class_2338)dev.hixo.M.d.a("$", (Object)callSite, (long)73640821017464249L) /* => net.minecraft.class_2338.method_10084 */), (long)32943740138406812L) /* => net.minecraft.class_238.method_994 */ == false) {
                return;
            }
            if (var3_4 < 360.0f && var3_4 > -360.0f) {
                var3_4 += 720.0f;
            }
            dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("$", (Object)class_3102, (long)142529340399696089L) /* => net.minecraft.class_310.method_1562 */, (Object)new class_2828.class_2831((float)var3_4, f, (boolean)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)class_3102, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (long)175288240290473570L) /* => net.minecraft.class_746.method_24828 */, (boolean)dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("z", (Object)class_3102, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (long)130379310159622624L) /* => net.minecraft.class_746.field_5976 */), (long)69141358163525131L) /* => net.minecraft.class_634.method_52787 */;
            dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)class_3102, (long)100087742506519171L) /* => net.minecraft.class_310.field_1761 */, (Object)dev.hixo.M.d.a("z", (Object)class_3102, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (Object)dev.hixo.M.d.a("\u00fd", (long)85943668217877665L) /* => net.minecraft.class_1268.field_5808 */, (Object)callSite2, (long)105874227183593887L) /* => net.minecraft.class_636.method_2896 */;
            dev.hixo.M.d.a("\u00e7", (Object)this, (class_2338)callSite, (long)33454823054977219L) /* => dev.hixo.M.s.S.Y.Uq */;
            dev.hixo.M.d.a("\u00e7", (Object)this, (int)dev.hixo.M.s.S.Y.a(16530, 4358987288078511596L), (long)122990745300639938L) /* => dev.hixo.M.s.S.Y.m */;
            String[] stringArray = ab;
            dev.hixo.M.d.a("$", (Object)this, (Object)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("$", (Object)new StringBuilder(), (Object)stringArray[72], (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (Object)dev.hixo.M.d.a("$", (Object)callSite, (long)200204213334732132L) /* => net.minecraft.class_2338.method_23854 */, (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (Object)stringArray[10], (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (long)59411206276622891L) /* => java.lang.StringBuilder.toString */, (long)143713508524126408L) /* => dev.hixo.M.s.S.Y.X */;
            return;
        }
        catch (Throwable throwable) {
            dev.hixo.M.d.a("$", (Object)this, (Object)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("$", (Object)new StringBuilder(), (Object)ab[67], (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (Object)throwable, (long)121136869135998173L) /* => java.lang.StringBuilder.append */, (long)59411206276622891L) /* => java.lang.StringBuilder.toString */, (long)88567634357029796L) /* => dev.hixo.M.s.S.Y.Q */;
        }
    }

    private void e(String string) {
        block28: {
            CallSite callSite;
            CallSite callSite2;
            block26: {
                block27: {
                    CallSite callSite3;
                    block25: {
                        block24: {
                            class_2596 class_25962;
                            CallSite callSite4;
                            block23: {
                                callSite3 = dev.hixo.M.d.a("z", (Object)this, (long)162918849087722895L) /* => dev.hixo.M.s.S.Y.d */;
                                dev.hixo.M.d.a("\u00e7", (Object)this, (boolean)false, (long)162918849087722895L) /* => dev.hixo.M.s.S.Y.d */;
                                dev.hixo.M.d.a("\u00e7", (Object)this, (int)0, (long)122990745300639938L) /* => dev.hixo.M.s.S.Y.m */;
                                dev.hixo.M.d.a("\u00e7", (Object)this, (int)0, (long)136172686434858944L) /* => dev.hixo.M.s.S.Y.UL */;
                                dev.hixo.M.d.a("\u00e7", (Object)this, null, (long)33454823054977219L) /* => dev.hixo.M.s.S.Y.Uq */;
                                callSite2 = dev.hixo.M.d.a("z", (Object)this, (long)156548232470805456L) /* => dev.hixo.M.s.S.Y.G */;
                                dev.hixo.M.d.a("\u00e7", (Object)this, (boolean)false, (long)156548232470805456L) /* => dev.hixo.M.s.S.Y.G */;
                                dev.hixo.M.d.a("\u00e7", (Object)this, (int)0, (long)45398163565104993L) /* => dev.hixo.M.s.S.Y.UF */;
                                callSite = dev.hixo.M.d.a("z", (Object)this, (long)196130981205602808L) /* => dev.hixo.M.s.S.Y.UU */;
                                dev.hixo.M.d.a("\u00e7", (Object)this, null, (long)196130981205602808L) /* => dev.hixo.M.s.S.Y.UU */;
                                if (callSite != null) {
                                    callSite4 = dev.hixo.M.d.a("\u00f9", (long)179869930689441125L) /* => net.minecraft.class_310.method_1551 */;
                                    if (callSite4 == null || dev.hixo.M.d.a("z", (Object)callSite4, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */ == null) break block23;
                                    try {
                                        dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)callSite4, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (double)dev.hixo.M.d.a("$", (Object)callSite, (long)117073359287434767L) /* => net.minecraft.class_243.method_10216 */, (double)dev.hixo.M.d.a("$", (Object)callSite, (long)102339986038638921L) /* => net.minecraft.class_243.method_10214 */, (double)dev.hixo.M.d.a("$", (Object)callSite, (long)128690190337235573L) /* => net.minecraft.class_243.method_10215 */, (long)100027587322678724L) /* => net.minecraft.class_746.method_5750 */;
                                    }
                                    catch (Throwable throwable) {
                                        // empty catch block
                                    }
                                }
                            }
                            callSite4 = dev.hixo.M.d.a("\u00f9", (long)179869930689441125L) /* => net.minecraft.class_310.method_1551 */;
                            if (callSite4 == null || dev.hixo.M.d.a("$", (Object)callSite4, (long)142529340399696089L) /* => net.minecraft.class_310.method_1562 */ == null) break block24;
                            while ((class_25962 = (class_2596)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)157929119578870532L) /* => dev.hixo.M.s.S.Y.V */, (long)123916111891130066L) /* => java.util.concurrent.ConcurrentLinkedQueue.poll */) != null) {
                                try {
                                    class_2596 class_25963 = class_25962;
                                    dev.hixo.M.d.a("$", (Object)class_25963, (Object)dev.hixo.M.d.a("$", (Object)callSite4, (long)142529340399696089L) /* => net.minecraft.class_310.method_1562 */, (long)193226502786398358L) /* => net.minecraft.class_2596.method_65081 */;
                                }
                                catch (Throwable throwable) {}
                            }
                        }
                        if (dev.hixo.M.d.a("$", (Object)this, (long)81902397357159314L) /* => dev.hixo.M.s.S.Y.d */ == false) break block25;
                        dev.hixo.M.d.a("$", (Object)this, (Object)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("$", (Object)new StringBuilder(), (Object)ab[77], (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (Object)string, (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (long)59411206276622891L) /* => java.lang.StringBuilder.toString */, (long)143713508524126408L) /* => dev.hixo.M.s.S.Y.X */;
                        break block26;
                    }
                    if (callSite3 == false) break block27;
                    dev.hixo.M.d.a("$", (Object)this, (Object)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("$", (Object)new StringBuilder(), (Object)ab[75], (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (Object)string, (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (long)59411206276622891L) /* => java.lang.StringBuilder.toString */, (long)143713508524126408L) /* => dev.hixo.M.s.S.Y.X */;
                    break block26;
                }
                if (callSite2 != false) {
                    dev.hixo.M.d.a("$", (Object)this, (Object)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("$", (Object)new StringBuilder(), (Object)ab[40], (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (Object)string, (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (long)59411206276622891L) /* => java.lang.StringBuilder.toString */, (long)143713508524126408L) /* => dev.hixo.M.s.S.Y.X */;
                }
            }
            if (callSite2 == false || callSite == null) break block28;
            if (dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)100476154500012371L) /* => dev.hixo.M.s.S.Y.B */, (Object)ab[23], (long)114714509743429363L) /* => dev.hixo.b.s.P */ == false) break block28;
            dev.hixo.M.d.a("\u00e7", (Object)this, (float)((float)dev.hixo.M.d.a("\u00f9", (double)dev.hixo.M.d.a("\u00f9", (double)dev.hixo.M.d.a("$", (Object)callSite, (long)117073359287434767L) /* => net.minecraft.class_243.method_10216 */, (double)(-dev.hixo.M.d.a("$", (Object)callSite, (long)128690190337235573L) /* => net.minecraft.class_243.method_10215 */), (long)130928682319801467L) /* => java.lang.Math.atan2 */, (long)59882655678323470L) /* => java.lang.Math.toDegrees */), (long)50597547123342978L) /* => dev.hixo.M.s.S.Y.K */;
            dev.hixo.M.d.a("\u00e7", (Object)this, (int)dev.hixo.M.d.a("\u00f9", (int)dev.hixo.M.d.a("z", (Object)this, (long)100514315248061815L) /* => dev.hixo.M.s.S.Y.UN */, (int)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)174335674662795500L) /* => dev.hixo.M.s.S.Y.e */, (long)105488653926114013L) /* => dev.hixo.b.M.i */, (long)199527982987698177L) /* => java.lang.Math.max */, (long)100514315248061815L) /* => dev.hixo.M.s.S.Y.UN */;
            dev.hixo.M.d.a("\u00e7", (Object)this, (boolean)true, (long)106769124039414831L) /* => dev.hixo.M.s.S.Y.c */;
            dev.hixo.M.d.a("\u00e7", (Object)this, (int)dev.hixo.M.s.S.Y.a(30854, 8310924116356617722L), (long)153771088441963898L) /* => dev.hixo.M.s.S.Y.UJ */;
        }
    }

    private static boolean j(class_1937 class_19372, class_2338 class_23382) {
        if (dev.hixo.M.d.a("$", (Object)class_19372, (Object)class_23382, (long)61521712382024515L) /* => net.minecraft.class_1937.method_8321 */ != null) {
            return true;
        }
        CallSite callSite = dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("$", (Object)class_19372, (Object)class_23382, (long)118017976719602861L) /* => net.minecraft.class_1937.method_8320 */, (long)89715234522094410L) /* => net.minecraft.class_2680.method_26204 */;
        return callSite instanceof class_2304 || callSite instanceof class_2199 || callSite instanceof class_2323 || callSite instanceof class_2533 || callSite instanceof class_2349 || callSite instanceof class_2269 || callSite instanceof class_2401 || callSite instanceof class_2428 || callSite instanceof class_2244 || callSite instanceof class_5546 || callSite instanceof class_3713 || callSite instanceof class_2406 || callSite instanceof class_3711 || callSite instanceof class_3717 || callSite instanceof class_3718;
    }

    private void m(class_310 class_3102) {
        if (dev.hixo.M.d.a("$", (Object)class_3102, (long)142529340399696089L) /* => net.minecraft.class_310.method_1562 */ == null || dev.hixo.M.d.a("z", (Object)class_3102, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */ == null) {
            return;
        }
        int n2 = dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)142952690696426536L) /* => dev.hixo.M.s.S.Y.UA */, (long)65580906021680841L) /* => dev.hixo.b.g.x */ != false ? 4 : 1;
        for (int i2 = 0; i2 < n2; ++i2) {
            dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("$", (Object)class_3102, (long)142529340399696089L) /* => net.minecraft.class_310.method_1562 */, (Object)new class_2828.class_2830((double)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)class_3102, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (long)96335688942052006L) /* => net.minecraft.class_746.method_23317 */, (double)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)class_3102, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (long)90587010555304668L) /* => net.minecraft.class_746.method_23318 */, (double)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)class_3102, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (long)47103109275691764L) /* => net.minecraft.class_746.method_23321 */, (float)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)class_3102, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (long)68578805942358681L) /* => net.minecraft.class_746.method_36454 */, (float)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)class_3102, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (long)130683892682073266L) /* => net.minecraft.class_746.method_36455 */, (boolean)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)class_3102, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (long)175288240290473570L) /* => net.minecraft.class_746.method_24828 */, (boolean)dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("z", (Object)class_3102, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (long)130379310159622624L) /* => net.minecraft.class_746.field_5976 */), (long)69141358163525131L) /* => net.minecraft.class_634.method_52787 */;
        }
        dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("$", (Object)class_3102, (long)142529340399696089L) /* => net.minecraft.class_310.method_1562 */, (Object)new class_2846((class_2846.class_2847)dev.hixo.M.d.a("\u00fd", (long)88675496977752319L) /* => net.minecraft.class_2846$class_2847.field_12973 */, (class_2338)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)class_3102, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (long)62351957165567498L) /* => net.minecraft.class_746.method_24515 */, (class_2350)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)class_3102, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (long)105769702240994676L) /* => net.minecraft.class_746.method_5735 */, (long)150931043222020746L) /* => net.minecraft.class_2350.method_10153 */), (long)69141358163525131L) /* => net.minecraft.class_634.method_52787 */;
    }

    private void J(class_310 class_3102) {
        boolean bl;
        boolean bl2 = bl = dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)138117317803541654L) /* => dev.hixo.M.s.S.Y.Uz */, (long)65580906021680841L) /* => dev.hixo.b.g.x */ != false && dev.hixo.M.d.a("z", (Object)class_3102, (long)99309607406877471L) /* => net.minecraft.class_310.field_1755 */ == null && dev.hixo.M.d.a("\u00f9", (Object)class_3102, (long)162855260850613193L) /* => dev.hixo.M.s.S.Y.c */ != false && dev.hixo.M.d.a("\u00f9", (Object)class_3102, (double)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)183382377836370352L) /* => dev.hixo.M.s.S.Y.s */, (long)120513388240390397L) /* => dev.hixo.b.M.K */, (long)110723507582889368L) /* => dev.hixo.M.s.S.Y.T */ != false;
        if (bl) {
            if (dev.hixo.M.d.a("z", (Object)this, (long)181533902698171137L) /* => dev.hixo.M.s.S.Y.UR */ == false) {
                dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("z", (Object)class_3102, (long)129597241205579821L) /* => net.minecraft.class_310.field_1690 */, (long)127068279799713157L) /* => net.minecraft.class_315.field_1904 */, (boolean)true, (long)66388162404330922L) /* => net.minecraft.class_304.method_23481 */;
                dev.hixo.M.d.a("\u00e7", (Object)this, (boolean)true, (long)181533902698171137L) /* => dev.hixo.M.s.S.Y.UR */;
                String[] stringArray = ab;
                dev.hixo.M.d.a("$", (Object)this, (Object)stringArray[42], (long)143713508524126408L) /* => dev.hixo.M.s.S.Y.X */;
            }
        } else if (dev.hixo.M.d.a("z", (Object)this, (long)181533902698171137L) /* => dev.hixo.M.s.S.Y.UR */ != false) {
            dev.hixo.M.d.a("\u00e7", (Object)this, (boolean)false, (long)181533902698171137L) /* => dev.hixo.M.s.S.Y.UR */;
            dev.hixo.M.d.a("\u00f9", (long)34890158137044018L) /* => net.minecraft.class_304.method_1424 */;
            dev.hixo.M.d.a("$", (Object)this, (Object)ab[54], (long)143713508524126408L) /* => dev.hixo.M.s.S.Y.X */;
        }
    }

    private static boolean c(class_310 class_3102) {
        if (dev.hixo.M.d.a("z", (Object)class_3102, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */ == null) {
            return false;
        }
        return dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)class_3102, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (Object)dev.hixo.M.d.a("\u00fd", (long)85943668217877665L) /* => net.minecraft.class_1268.field_5808 */, (long)159420538595008673L) /* => net.minecraft.class_746.method_5998 */, (long)89510314790192383L) /* => net.minecraft.class_1799.method_7909 */ == dev.hixo.M.d.a("\u00fd", (long)102479880874505575L) /* => net.minecraft.class_1802.field_8255 */ || dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)class_3102, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (Object)dev.hixo.M.d.a("\u00fd", (long)74280917607947214L) /* => net.minecraft.class_1268.field_5810 */, (long)159420538595008673L) /* => net.minecraft.class_746.method_5998 */, (long)89510314790192383L) /* => net.minecraft.class_1799.method_7909 */ == dev.hixo.M.d.a("\u00fd", (long)102479880874505575L) /* => net.minecraft.class_1802.field_8255 */;
    }

    private static boolean T(class_310 class_3102, double d2) {
        if (dev.hixo.M.d.a("z", (Object)class_3102, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */ == null || dev.hixo.M.d.a("z", (Object)class_3102, (long)38197671011210569L) /* => net.minecraft.class_310.field_1687 */ == null) {
            return false;
        }
        CallSite callSite = dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)class_3102, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (long)187596606581785047L) /* => net.minecraft.class_746.method_5829 */, (double)d2, (long)134998869489725467L) /* => net.minecraft.class_238.method_1014 */;
        CallSite callSite2 = dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)class_3102, (long)38197671011210569L) /* => net.minecraft.class_310.field_1687 */, (Object)dev.hixo.M.d.a("z", (Object)class_3102, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (Object)callSite, class_12972 -> true, (long)111079478229881807L) /* => net.minecraft.class_638.method_8333 */, (long)113221006393852506L) /* => java.util.List.iterator */;
        while (dev.hixo.M.d.a("$", (Object)callSite2, (long)175361412755674352L) /* => java.util.Iterator.hasNext */ != false) {
            class_1309 class_13092;
            class_1297 class_12973 = (class_1297)dev.hixo.M.d.a("$", (Object)callSite2, (long)64633749944946827L) /* => java.util.Iterator.next */;
            if (!(class_12973 instanceof class_1309) || (class_13092 = (class_1309)class_12973) == dev.hixo.M.d.a("z", (Object)class_3102, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */ || dev.hixo.M.d.a("$", (Object)class_13092, (long)82520077281759901L) /* => net.minecraft.class_1309.method_29504 */ != false || dev.hixo.M.d.a("$", (Object)class_13092, (long)123974669313727410L) /* => net.minecraft.class_1309.method_6032 */ <= 0.0f || !((double)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)class_3102, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (Object)class_13092, (long)167756919979340704L) /* => net.minecraft.class_746.method_5739 */ <= d2)) continue;
            return true;
        }
        return false;
    }

    private void h(class_310 class_3102) {
        CallSite callSite = dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("z", (Object)class_3102, (long)129597241205579821L) /* => net.minecraft.class_310.field_1690 */, (long)102881252691501563L) /* => net.minecraft.class_315.field_1903 */, (long)91073722283869168L) /* => net.minecraft.class_304.method_1434 */;
        if (dev.hixo.M.d.a("z", (Object)this, (long)147586035931317266L) /* => dev.hixo.M.s.S.Y.v */ > 0) {
            if (callSite != false && dev.hixo.M.d.a("z", (Object)this, (long)148681531676275373L) /* => dev.hixo.M.s.S.Y.Ug */ == false) {
                dev.hixo.M.d.a("$", (Object)this, (Object)ab[5], (long)143713508524126408L) /* => dev.hixo.M.s.S.Y.X */;
            }
            Y y = this;
            dev.hixo.M.d.a("\u00e7", (Object)y, (int)(dev.hixo.M.d.a("z", (Object)y, (long)147586035931317266L) /* => dev.hixo.M.s.S.Y.v */ - true), (long)147586035931317266L) /* => dev.hixo.M.s.S.Y.v */;
        }
        dev.hixo.M.d.a("\u00e7", (Object)this, (boolean)callSite, (long)148681531676275373L) /* => dev.hixo.M.s.S.Y.Ug */;
    }

    private void B(class_310 class_3102) {
        boolean bl;
        if (dev.hixo.M.d.a("z", (Object)this, (long)144222617296946861L) /* => dev.hixo.M.s.S.Y.f */ > 0) {
            Y y = this;
            reference v1 = dev.hixo.M.d.a("z", (Object)y, (long)144222617296946861L) /* => dev.hixo.M.s.S.Y.f */ - true;
            dev.hixo.M.d.a("\u00e7", (Object)y, (int)v1, (long)144222617296946861L) /* => dev.hixo.M.s.S.Y.f */;
            if (v1 == false) {
                dev.hixo.M.d.a("\u00f9", (long)34890158137044018L) /* => net.minecraft.class_304.method_1424 */;
            }
            return;
        }
        boolean bl2 = bl = dev.hixo.M.d.a("z", (Object)this, (long)158762271070531726L) /* => dev.hixo.M.s.S.Y.Ua */ <= 0 && dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)class_3102, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (long)175288240290473570L) /* => net.minecraft.class_746.method_24828 */ != false && dev.hixo.M.d.a("z", (Object)this, (long)137573817861904304L) /* => dev.hixo.M.s.S.Y.Uc */ >= dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)36227610756102096L) /* => dev.hixo.M.s.S.Y.Z */, (long)105488653926114013L) /* => dev.hixo.b.M.i */;
        if (dev.hixo.M.d.a("z", (Object)this, (long)106769124039414831L) /* => dev.hixo.M.s.S.Y.c */ != false) {
            if (bl) {
                dev.hixo.M.d.a("$", (Object)this, (Object)class_3102, (long)52730682416402898L) /* => dev.hixo.M.s.S.Y.F */;
                dev.hixo.M.d.a("\u00e7", (Object)this, (boolean)false, (long)106769124039414831L) /* => dev.hixo.M.s.S.Y.c */;
            } else {
                Y y = this;
                reference v4 = dev.hixo.M.d.a("z", (Object)y, (long)153771088441963898L) /* => dev.hixo.M.s.S.Y.UJ */ - true;
                dev.hixo.M.d.a("\u00e7", (Object)y, (int)v4, (long)153771088441963898L) /* => dev.hixo.M.s.S.Y.UJ */;
                if (v4 <= 0) {
                    dev.hixo.M.d.a("\u00e7", (Object)this, (boolean)false, (long)106769124039414831L) /* => dev.hixo.M.s.S.Y.c */;
                }
            }
            return;
        }
        if (dev.hixo.M.d.a("z", (Object)this, (long)48779331642593393L) /* => dev.hixo.M.s.S.Y.N */ != false) {
            Y y = this;
            dev.hixo.M.d.a("\u00e7", (Object)y, (int)(dev.hixo.M.d.a("z", (Object)y, (long)133860200793568013L) /* => dev.hixo.M.s.S.Y.Uh */ + true), (long)133860200793568013L) /* => dev.hixo.M.s.S.Y.Uh */;
            if (bl) {
                dev.hixo.M.d.a("$", (Object)this, (Object)class_3102, (long)52730682416402898L) /* => dev.hixo.M.s.S.Y.F */;
                dev.hixo.M.d.a("\u00e7", (Object)this, (boolean)false, (long)48779331642593393L) /* => dev.hixo.M.s.S.Y.N */;
            } else if (dev.hixo.M.d.a("z", (Object)this, (long)133860200793568013L) /* => dev.hixo.M.s.S.Y.Uh */ > 40) {
                dev.hixo.M.d.a("\u00e7", (Object)this, (boolean)false, (long)48779331642593393L) /* => dev.hixo.M.s.S.Y.N */;
            }
        }
    }

    private void F(class_310 class_3102) {
        dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("z", (Object)class_3102, (long)129597241205579821L) /* => net.minecraft.class_310.field_1690 */, (long)102881252691501563L) /* => net.minecraft.class_315.field_1903 */, (boolean)true, (long)66388162404330922L) /* => net.minecraft.class_304.method_23481 */;
        dev.hixo.M.d.a("\u00e7", (Object)this, (int)1, (long)144222617296946861L) /* => dev.hixo.M.s.S.Y.f */;
        Y y = this;
        dev.hixo.M.d.a("\u00e7", (Object)y, (int)(dev.hixo.M.d.a("z", (Object)y, (long)57303462295818123L) /* => dev.hixo.M.s.S.Y.Ud */ + true), (long)57303462295818123L) /* => dev.hixo.M.s.S.Y.Ud */;
        dev.hixo.M.d.a("\u00e7", (Object)this, (int)dev.hixo.M.d.a("\u00f9", (int)1, (int)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)177403173719524410L) /* => dev.hixo.M.s.S.Y.Uk */, (long)105488653926114013L) /* => dev.hixo.b.M.i */, (long)199527982987698177L) /* => java.lang.Math.max */, (long)158762271070531726L) /* => dev.hixo.M.s.S.Y.Ua */;
        dev.hixo.M.d.a("$", (Object)this, (Object)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("$", (Object)new StringBuilder(), (Object)ab[0], (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (int)dev.hixo.M.d.a("z", (Object)this, (long)57303462295818123L) /* => dev.hixo.M.s.S.Y.Ud */, (long)32515713483113022L) /* => java.lang.StringBuilder.append */, (long)59411206276622891L) /* => java.lang.StringBuilder.toString */, (long)143713508524126408L) /* => dev.hixo.M.s.S.Y.X */;
    }

    private void H(class_310 class_3102) {
        if (dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)78010308783148302L) /* => dev.hixo.M.s.S.Y.u */, (long)65580906021680841L) /* => dev.hixo.b.g.x */ == false || dev.hixo.M.d.a("z", (Object)this, (long)100514315248061815L) /* => dev.hixo.M.s.S.Y.UN */ <= 0 || dev.hixo.M.d.a("\u00f9", (float)dev.hixo.M.d.a("z", (Object)this, (long)50597547123342978L) /* => dev.hixo.M.s.S.Y.K */, (long)84869243229000521L) /* => java.lang.Float.isNaN */ != false) {
            dev.hixo.M.d.a("\u00e7", (Object)this, (boolean)false, (long)171944770271334055L) /* => dev.hixo.M.s.S.Y.S */;
            return;
        }
        if (dev.hixo.M.d.a("z", (Object)this, (long)171944770271334055L) /* => dev.hixo.M.s.S.Y.S */ != false) {
            return;
        }
        dev.hixo.M.d.a("\u00f9", (Object)new C((float)dev.hixo.M.d.a("z", (Object)this, (long)50597547123342978L) /* => dev.hixo.M.s.S.Y.K */, (float)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)class_3102, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (long)130683892682073266L) /* => net.minecraft.class_746.method_36455 */), (int)dev.hixo.M.d.a("$", (Object)this, (long)141673616480331103L) /* => dev.hixo.M.s.S.Y.f */, (Object)dev.hixo.M.d.a("\u00fd", (long)65795335008300943L) /* => dev.hixo.f.B.Z.Silent */, (long)37503006147511700L) /* => dev.hixo.f.B.G.l */;
        dev.hixo.M.d.a("\u00e7", (Object)this, (boolean)true, (long)171944770271334055L) /* => dev.hixo.M.s.S.Y.S */;
    }

    private void i(class_310 class_3102) {
        CallSite callSite = dev.hixo.M.d.a("\u00fd", (long)143806643421623685L) /* => dev.hixo.M.s.D.U.K */;
        if (dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)58067084913954844L) /* => dev.hixo.M.s.S.Y.l */, (long)65580906021680841L) /* => dev.hixo.b.g.x */ != false && dev.hixo.M.d.a("z", (Object)this, (long)100514315248061815L) /* => dev.hixo.M.s.S.Y.UN */ > 0 && dev.hixo.M.d.a("\u00f9", (float)dev.hixo.M.d.a("z", (Object)this, (long)50597547123342978L) /* => dev.hixo.M.s.S.Y.K */, (long)84869243229000521L) /* => java.lang.Float.isNaN */ == false && callSite == false) {
            dev.hixo.M.d.a("$", (Object)this, (Object)class_3102, (long)81624239527112509L) /* => dev.hixo.M.s.S.Y.I */;
            dev.hixo.M.d.a("\u00e7", (Object)this, (boolean)true, (long)65686924782076862L) /* => dev.hixo.M.s.S.Y.T */;
            Y y = this;
            dev.hixo.M.d.a("\u00e7", (Object)y, (int)(dev.hixo.M.d.a("z", (Object)y, (long)100514315248061815L) /* => dev.hixo.M.s.S.Y.UN */ - true), (long)100514315248061815L) /* => dev.hixo.M.s.S.Y.UN */;
            return;
        }
        if (dev.hixo.M.d.a("z", (Object)this, (long)100514315248061815L) /* => dev.hixo.M.s.S.Y.UN */ > 0) {
            Y y = this;
            dev.hixo.M.d.a("\u00e7", (Object)y, (int)(dev.hixo.M.d.a("z", (Object)y, (long)100514315248061815L) /* => dev.hixo.M.s.S.Y.UN */ - true), (long)100514315248061815L) /* => dev.hixo.M.s.S.Y.UN */;
        }
        if (dev.hixo.M.d.a("z", (Object)this, (long)65686924782076862L) /* => dev.hixo.M.s.S.Y.T */ != false) {
            dev.hixo.M.d.a("\u00e7", (Object)this, (boolean)false, (long)65686924782076862L) /* => dev.hixo.M.s.S.Y.T */;
            dev.hixo.M.d.a("\u00f9", (long)34890158137044018L) /* => net.minecraft.class_304.method_1424 */;
        }
    }

    private void I(class_310 class_3102) {
        CallSite callSite = dev.hixo.M.d.a("\u00f9", (float)(dev.hixo.M.d.a("z", (Object)this, (long)50597547123342978L) /* => dev.hixo.M.s.S.Y.K */ - dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)class_3102, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (long)68578805942358681L) /* => net.minecraft.class_746.method_36454 */), (long)169602695659846515L) /* => net.minecraft.class_3532.method_15393 */;
        CallSite callSite2 = dev.hixo.M.d.a("\u00f9", (float)callSite, (long)164168003445879722L) /* => java.lang.Math.abs */;
        dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("z", (Object)class_3102, (long)129597241205579821L) /* => net.minecraft.class_310.field_1690 */, (long)67693188334162439L) /* => net.minecraft.class_315.field_1894 */, (callSite2 <= 67.5f ? 1 : 0) != 0, (long)66388162404330922L) /* => net.minecraft.class_304.method_23481 */;
        dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("z", (Object)class_3102, (long)129597241205579821L) /* => net.minecraft.class_310.field_1690 */, (long)121502188636432549L) /* => net.minecraft.class_315.field_1881 */, (callSite2 >= 112.5f ? 1 : 0) != 0, (long)66388162404330922L) /* => net.minecraft.class_304.method_23481 */;
        dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("z", (Object)class_3102, (long)129597241205579821L) /* => net.minecraft.class_310.field_1690 */, (long)177290900468325678L) /* => net.minecraft.class_315.field_1849 */, (callSite > 22.5f && callSite < 157.5f ? 1 : 0) != 0, (long)66388162404330922L) /* => net.minecraft.class_304.method_23481 */;
        dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("z", (Object)class_3102, (long)129597241205579821L) /* => net.minecraft.class_310.field_1690 */, (long)131802311120984393L) /* => net.minecraft.class_315.field_1913 */, (callSite < -22.5f && callSite > -157.5f ? 1 : 0) != 0, (long)66388162404330922L) /* => net.minecraft.class_304.method_23481 */;
        if (dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)61712414780534040L) /* => dev.hixo.M.s.S.Y.Ur */, (long)65580906021680841L) /* => dev.hixo.b.g.x */ != false) {
            dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("z", (Object)class_3102, (long)129597241205579821L) /* => net.minecraft.class_310.field_1690 */, (long)73833912347181160L) /* => net.minecraft.class_315.field_1867 */, (boolean)true, (long)66388162404330922L) /* => net.minecraft.class_304.method_23481 */;
        }
    }

    @Override
    public int f() {
        return (int)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("\u00fd", (long)83236406400764799L) /* => dev.hixo.f.B.v.Normal */, (long)132898491188594704L) /* => dev.hixo.f.B.v.l */;
    }

    @Override
    public String A() {
        if (dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)101559854304462408L) /* => dev.hixo.M.s.S.Y.z */, (long)65580906021680841L) /* => dev.hixo.b.g.x */ == false || dev.hixo.M.d.a("z", (Object)this, (long)190346998449178644L) /* => dev.hixo.M.s.S.Y.U5 */ == false) {
            return "";
        }
        String[] stringArray = ab;
        return dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("$", (Object)new StringBuilder(), (Object)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)100476154500012371L) /* => dev.hixo.M.s.S.Y.B */, (long)50503865389075616L) /* => dev.hixo.b.s.I */, (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (Object)" ", (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (int)dev.hixo.M.d.a("z", (Object)this, (long)190346998449178644L) /* => dev.hixo.M.s.S.Y.U5 */, (long)32515713483113022L) /* => java.lang.StringBuilder.append */, (Object)stringArray[37], (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (int)dev.hixo.M.d.a("z", (Object)this, (long)57303462295818123L) /* => dev.hixo.M.s.S.Y.Ud */, (long)32515713483113022L) /* => java.lang.StringBuilder.append */, (Object)"j", (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (Object)(dev.hixo.M.d.a("z", (Object)this, (long)103312637376242931L) /* => dev.hixo.M.s.S.Y.p */ != false ? stringArray[52] : ""), (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (long)59411206276622891L) /* => java.lang.StringBuilder.toString */;
    }

    private static /* synthetic */ void lambda$onVelocityPacket$0(class_310 class_3102, class_243 class_2432) {
        if (dev.hixo.M.d.a("z", (Object)class_3102, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */ != null) {
            dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)class_3102, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (double)dev.hixo.M.d.a("$", (Object)class_2432, (long)117073359287434767L) /* => net.minecraft.class_243.method_10216 */, (double)dev.hixo.M.d.a("$", (Object)class_2432, (long)102339986038638921L) /* => net.minecraft.class_243.method_10214 */, (double)dev.hixo.M.d.a("$", (Object)class_2432, (long)128690190337235573L) /* => net.minecraft.class_243.method_10215 */, (long)100027587322678724L) /* => net.minecraft.class_746.method_5750 */;
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block28: {
            block27: {
                block26: {
                    block25: {
                        var13 = new String[87];
                        var11_1 = 0;
                        var10_2 = ",/[A\u000bu(\u0015?B\u0011\u8d5c\u8dd4mE\u000f$/PWNU\u0007\u00137FcNT(\u00129F\u4e70\u4f7b\u7f5f\u532e\u0007fF\tb~{x\t#\tbcd~\u0012$\u0016yr`\u0007m=\u73ea\u4ed5\u0011lU$\u000bz\u4f2c\u6294\u000bs$\u000b?D\u001e|U\"\b=tCNF&;\n,/[A\u000bu(\u0015?B\u000bN4Y^E\u000em\u6558\u535f\u51cd\u9031-G{\u0016\u4f51\u5703\u51dc\u904d\u7af1\u53b9\u51b3\u81db\u5dda\u632e\u4e46\u4ee0\u8da9\u8df5\u951f\u000b\u2033\u2059F\u001bup\u001e\u0007\u76c9F7YGN\u0007\u5c7c\u6649\u8f83\u6757\uff39r\u0007\u5bb4\u4e6b\u4e50\uff3f\u000f!(_\\\u000bf!\u0012ztH[F>\u0015\f.5DXQH#\u0012;Z\u0011\u000e\r!(_\\\u0019\u0014yRrY]O\u000e\b(5D\\JKwF\tF\u21c8\u0016\u7b78\u6592\u5770\u66b9\u65d6\u535f\f\u676b\u52fb\u565e\u6810\u6b48\u0007\u21dfF\u638a\u527b\u650f\u8867\t\u6a47\u570d\u5145\u95dc\u000b\u21b5m\u6558\u8816\u000f,/[A\u000bj$\bzqCDR#\u0002\u0005\"?TDL\u0011.5ZU\u000b`?\t/XU\u000bs$\u00051E\u0013\"?ZPR\u0007\u001e6;UZNSm23UZX\r'.BPHLm'7YDES\u0006$/PWNU\u0004\b5Y_\u0002\u8de3\u65ac-\u53ab\u51a1\u9036\uff39aR \u0016zdTXB9Fu\u0016s^A+\u0003(\u0016\u001e\u000bI\"\t4\u0016\u001e\u000bf8\u00125\u0016bCN(\n>\uff3f\u00030\u0016\u0004\u000f$/PWNU\u0007\u00137FcNT(\u0012\u000b-?SA\u000bt=\u00143XE\u0002F\u5261\n0?DEBD,\nz\u0013\u000b\u6550\u526a\u658f\u5766\u66df\u6597m\u21f4z\u6508\u887d\u0007\u8de3\u65ac\u0016\u21a3\u000b\u6519\u8801\u000e.5ZU\u000bf$\u0014zbXHL>\u0004Cz\u51cd\u9031\r5*DXESm%;XRNK\f\u676b\u52fb\u565e\u6810\u6b48\uff3c\u51fa\u5312z\u0004\u0011\u5210 \u0001(_\\\u0011\u0007\u539b\u6dee\u51a1\u9036\u0011\u0000\u0007\u51f6\u7eb5\u513f\u7aef\uff3d\u0019\u00079\u000f9]\u0011\u5425\u4f69\u5979\u5395\u9574\u658f\u5766\n,/[A\u000bu(\u0015?B\r%5C__B?F\u000e_R@T\r\u5256\u65ac\u0016\u21a3\u000b\u8842\u51b6\u9066z\u001d\u0011\u6515\u886b\u0003\r8\u0019\u0012(5nk\u0011\u0007\u634f\u8d11\uff52\u7b7f\u840c\u571b\u0007bF\u8ddf\u65c0\uff38\u0004(5nk\b$/PWNUwF\u0004\u0001(_\\\u0017'/B^\u000bt%\u000f?ZU\u000b\u4e19\u76b3\uff6ew\u0003\u0001\u000e\u0007\u51b6\u9066\uff53\u0002F\u5261\u0019'6Z^\\\u0007\t\u0003;R\u0011fH)\u0003)\u0016\u0019\u4f31Q!I\u533b\u9849\u0018\r!(_\\\u0019\u0014yRrY]O\u000e\f52_TGCm4;XVN\r,/[A\u000bd\"\t6R^\\I\u0002F\u6b7b\u0015$/PWNUwF\u51e8\u520c\u527c\u6383\u0007\u21dfF\u5444\u63bf\u8fe8\u6b0a\u51dc\u904d\fFz\u001e_DH#Oz\u6334\u8d46\u000b\u0006(5D\\JK\u0005F2Y]O\u0003+3N\u000e'/B^\u000bt%\u000f?ZU\u000b\u6511\u76b3\u000645BP_B\u0002\u845b\u576a\u0006(5D\\JK\u0010$/PWNUwF\u7acd\u53d5\u51b4\u51d0\u9027\u5dbf\u4e44\u5f59\b%2WE\u000bk\"\u0001\u0005Fq\u0016\u8d46\u8dd8\u00125*DXESm5.WEN\u0007\u000e\u000e?UZ\u0004+5RT\u0006=\fz\u0003v\u0007\u0013!(_\\\u0019\u0014yRz\u53e0\u6db9\u51d0\u9027m\u21f4z\u8853\u53e0\u000b\u0004\b5Y_\r%5C__B?F\u0013XA^S\u000b\u0001(_\\\u000b\u4e83\u4edf\u5957\u8d7f\f\u0011\u0004Cz\u0019\u0011\u000b'/B^\u000bt%\u000f?ZU\r,/[A\u000bd%\u00074UT\u000b\u0002\u0012(5nk\u0011\u0007\u544e\u6e87\u51a1\u9036\u0011\u21b9\u0007\u51b7\u6295\u62ef\u6dbe\u0011\u000b\u0001(_\\\u0011\u0007\u4f03\u5952\u53a9\u9518\u0011\u0006\u845b\u576a\u4f70\u6c90\u76c5\u6820\u0004(5nk\u0006\u0001(_\\\u0011\u0007\u0004\u519d\u905a\u0016\u0012\u0006(5nk\u0011\u0007\u000b(5nk\u0011\u0007\u51b7\u6295\uff52\u525f\u0011\u00100?Z^HN9\u001fzdTXB9F\u007f\nF\u6747\u650d\u51ca\u802e\u00074\u0007-\u000b\r$/PWNUwF\u51e1\u7ee5\u5154\u7af2\u0007\u0003+3N\u0017$/PWNUwF\u51e8\u520c\u89d7\u53fa\u0007\u21dfF\u8f84\u7f25\u5183\u76af\u4e27\u8d3a\u5478\u63d3\b./[PEN7\u0003";
                        var12_3 = ",/[A\u000bu(\u0015?B\u0011\u8d5c\u8dd4mE\u000f$/PWNU\u0007\u00137FcNT(\u00129F\u4e70\u4f7b\u7f5f\u532e\u0007fF\tb~{x\t#\tbcd~\u0012$\u0016yr`\u0007m=\u73ea\u4ed5\u0011lU$\u000bz\u4f2c\u6294\u000bs$\u000b?D\u001e|U\"\b=tCNF&;\n,/[A\u000bu(\u0015?B\u000bN4Y^E\u000em\u6558\u535f\u51cd\u9031-G{\u0016\u4f51\u5703\u51dc\u904d\u7af1\u53b9\u51b3\u81db\u5dda\u632e\u4e46\u4ee0\u8da9\u8df5\u951f\u000b\u2033\u2059F\u001bup\u001e\u0007\u76c9F7YGN\u0007\u5c7c\u6649\u8f83\u6757\uff39r\u0007\u5bb4\u4e6b\u4e50\uff3f\u000f!(_\\\u000bf!\u0012ztH[F>\u0015\f.5DXQH#\u0012;Z\u0011\u000e\r!(_\\\u0019\u0014yRrY]O\u000e\b(5D\\JKwF\tF\u21c8\u0016\u7b78\u6592\u5770\u66b9\u65d6\u535f\f\u676b\u52fb\u565e\u6810\u6b48\u0007\u21dfF\u638a\u527b\u650f\u8867\t\u6a47\u570d\u5145\u95dc\u000b\u21b5m\u6558\u8816\u000f,/[A\u000bj$\bzqCDR#\u0002\u0005\"?TDL\u0011.5ZU\u000b`?\t/XU\u000bs$\u00051E\u0013\"?ZPR\u0007\u001e6;UZNSm23UZX\r'.BPHLm'7YDES\u0006$/PWNU\u0004\b5Y_\u0002\u8de3\u65ac-\u53ab\u51a1\u9036\uff39aR \u0016zdTXB9Fu\u0016s^A+\u0003(\u0016\u001e\u000bI\"\t4\u0016\u001e\u000bf8\u00125\u0016bCN(\n>\uff3f\u00030\u0016\u0004\u000f$/PWNU\u0007\u00137FcNT(\u0012\u000b-?SA\u000bt=\u00143XE\u0002F\u5261\n0?DEBD,\nz\u0013\u000b\u6550\u526a\u658f\u5766\u66df\u6597m\u21f4z\u6508\u887d\u0007\u8de3\u65ac\u0016\u21a3\u000b\u6519\u8801\u000e.5ZU\u000bf$\u0014zbXHL>\u0004Cz\u51cd\u9031\r5*DXESm%;XRNK\f\u676b\u52fb\u565e\u6810\u6b48\uff3c\u51fa\u5312z\u0004\u0011\u5210 \u0001(_\\\u0011\u0007\u539b\u6dee\u51a1\u9036\u0011\u0000\u0007\u51f6\u7eb5\u513f\u7aef\uff3d\u0019\u00079\u000f9]\u0011\u5425\u4f69\u5979\u5395\u9574\u658f\u5766\n,/[A\u000bu(\u0015?B\r%5C__B?F\u000e_R@T\r\u5256\u65ac\u0016\u21a3\u000b\u8842\u51b6\u9066z\u001d\u0011\u6515\u886b\u0003\r8\u0019\u0012(5nk\u0011\u0007\u634f\u8d11\uff52\u7b7f\u840c\u571b\u0007bF\u8ddf\u65c0\uff38\u0004(5nk\b$/PWNUwF\u0004\u0001(_\\\u0017'/B^\u000bt%\u000f?ZU\u000b\u4e19\u76b3\uff6ew\u0003\u0001\u000e\u0007\u51b6\u9066\uff53\u0002F\u5261\u0019'6Z^\\\u0007\t\u0003;R\u0011fH)\u0003)\u0016\u0019\u4f31Q!I\u533b\u9849\u0018\r!(_\\\u0019\u0014yRrY]O\u000e\f52_TGCm4;XVN\r,/[A\u000bd\"\t6R^\\I\u0002F\u6b7b\u0015$/PWNUwF\u51e8\u520c\u527c\u6383\u0007\u21dfF\u5444\u63bf\u8fe8\u6b0a\u51dc\u904d\fFz\u001e_DH#Oz\u6334\u8d46\u000b\u0006(5D\\JK\u0005F2Y]O\u0003+3N\u000e'/B^\u000bt%\u000f?ZU\u000b\u6511\u76b3\u000645BP_B\u0002\u845b\u576a\u0006(5D\\JK\u0010$/PWNUwF\u7acd\u53d5\u51b4\u51d0\u9027\u5dbf\u4e44\u5f59\b%2WE\u000bk\"\u0001\u0005Fq\u0016\u8d46\u8dd8\u00125*DXESm5.WEN\u0007\u000e\u000e?UZ\u0004+5RT\u0006=\fz\u0003v\u0007\u0013!(_\\\u0019\u0014yRz\u53e0\u6db9\u51d0\u9027m\u21f4z\u8853\u53e0\u000b\u0004\b5Y_\r%5C__B?F\u0013XA^S\u000b\u0001(_\\\u000b\u4e83\u4edf\u5957\u8d7f\f\u0011\u0004Cz\u0019\u0011\u000b'/B^\u000bt%\u000f?ZU\r,/[A\u000bd%\u00074UT\u000b\u0002\u0012(5nk\u0011\u0007\u544e\u6e87\u51a1\u9036\u0011\u21b9\u0007\u51b7\u6295\u62ef\u6dbe\u0011\u000b\u0001(_\\\u0011\u0007\u4f03\u5952\u53a9\u9518\u0011\u0006\u845b\u576a\u4f70\u6c90\u76c5\u6820\u0004(5nk\u0006\u0001(_\\\u0011\u0007\u0004\u519d\u905a\u0016\u0012\u0006(5nk\u0011\u0007\u000b(5nk\u0011\u0007\u51b7\u6295\uff52\u525f\u0011\u00100?Z^HN9\u001fzdTXB9F\u007f\nF\u6747\u650d\u51ca\u802e\u00074\u0007-\u000b\r$/PWNUwF\u51e1\u7ee5\u5154\u7af2\u0007\u0003+3N\u0017$/PWNUwF\u51e8\u520c\u89d7\u53fa\u0007\u21dfF\u8f84\u7f25\u5183\u76af\u4e27\u8d3a\u5478\u63d3\b./[PEN7\u0003".length();
                        var9_4 = 15;
                        var8_5 = -1;
lbl7:
                        // 2 sources

                        while (true) {
                            v0 = ++var8_5;
                            v1 = var10_2.substring(v0, v0 + var9_4);
                            v2 = -1;
                            break block25;
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
                            var10_2 = "$/PWNU\u0004\u0001(_\\";
                            var12_3 = "$/PWNU\u0004\u0001(_\\".length();
                            var9_4 = 6;
                            var8_5 = -1;
lbl21:
                            // 2 sources

                            while (true) {
                                v4 = ++var8_5;
                                v1 = var10_2.substring(v4, v4 + var9_4);
                                v2 = 0;
                                break block25;
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
                            break block26;
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
                                v10 = 102;
                                break;
                            }
                            case 1: {
                                v10 = 90;
                                break;
                            }
                            case 2: {
                                v10 = 54;
                                break;
                            }
                            case 3: {
                                v10 = 49;
                                break;
                            }
                            case 4: {
                                v10 = 43;
                                break;
                            }
                            case 5: {
                                v10 = 39;
                                break;
                            }
                            default: {
                                v10 = 77;
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
                dev.hixo.M.s.S.Y.ab = var13;
                var0_7 = 3084171243864156406L;
                var6_8 = new long[7];
                var3_9 = 0;
                var4_10 = "\u00e7\f\u0086G3g\u00ce\u00fe\u00bb\u00ac\u0097\u0091\u0086V\u00bd\u000f\u008a\u00e3\u00bf\u00f1K\u00df\u00c7Fo\u009e\u0003P.\u00a3\u0085\u0018\u00ca\u00e9\u00ac\u00d0\u00e7\u0012g|";
                var5_11 = "\u00e7\f\u0086G3g\u00ce\u00fe\u00bb\u00ac\u0097\u0091\u0086V\u00bd\u000f\u008a\u00e3\u00bf\u00f1K\u00df\u00c7Fo\u009e\u0003P.\u00a3\u0085\u0018\u00ca\u00e9\u00ac\u00d0\u00e7\u0012g|".length();
                var2_12 = 0;
                while (true) {
                    var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
                    v11 = var6_8;
                    v12 = var3_9++;
                    v13 = ((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L;
                    v14 = -1;
                    break block27;
                    break;
                }
lbl89:
                // 1 sources

                while (true) {
                    v11[v12] = v15;
                    if (var2_12 < var5_11) ** continue;
                    var4_10 = "#\u0007\u0015}\f\u00f2\u00f5/\u00f2\u0093\u00d3rP\u00fb'\u00f9";
                    var5_11 = "#\u0007\u0015}\f\u00f2\u00f5/\u00f2\u0093\u00d3rP\u00fb'\u00f9".length();
                    var2_12 = 0;
                    while (true) {
                        var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
                        v11 = var6_8;
                        v12 = var3_9++;
                        v13 = ((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L;
                        v14 = 0;
                        break block27;
                        break;
                    }
                    break;
                }
lbl102:
                // 1 sources

                while (true) {
                    v11[v12] = v15;
                    if (var2_12 < var5_11) ** continue;
                    break block28;
                    break;
                }
            }
            v15 = v13 ^ var0_7;
            switch (v14) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl113:
                // 1 sources

                ** continue;
            }
        }
        dev.hixo.M.s.S.Y.bb = var6_8;
        dev.hixo.M.s.S.Y.cb = new Integer[7];
        dev.hixo.M.s.S.Y.O = dev.hixo.M.s.S.Y.a(2937, 3518816458448086532L);
        dev.hixo.M.s.S.Y.h = new Random();
        dev.hixo.M.d.a("\u00c1", (boolean)false, (long)111172814197402593L) /* => dev.hixo.M.s.S.Y.Q */;
        dev.hixo.M.d.a("\u00c1", (boolean)false, (long)85409331305917590L) /* => dev.hixo.M.s.S.Y.Uw */;
    }

    private static int a(int n2, long l2) {
        int n3 = n2 ^ (int)(l2 & 0x7FFFL) ^ 0x2D7D;
        if (cb[n3] == null) {
            dev.hixo.M.s.S.Y.cb[n3] = (int)(bb[n3] ^ l2);
        }
        return cb[n3];
    }
}

