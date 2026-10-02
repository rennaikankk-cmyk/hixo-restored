/*
 * RESTORED SOURCE — decompiled reconstruction, not the original files.
 * class: dev.hixo.M.s.K.i
 * identified as: TargetHUD
 * context strings: 'Health: ' | 'Show Name' | 'Background' | 'Health Text'
 */

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  net.minecraft.class_1309
 *  net.minecraft.class_1657
 *  net.minecraft.class_1799
 *  net.minecraft.class_1921
 *  net.minecraft.class_1935
 *  net.minecraft.class_327
 *  net.minecraft.class_332
 *  net.minecraft.class_742
 *  net.minecraft.class_9296
 */
package dev.hixo.M.s.K;

import com.mojang.authlib.GameProfile;
import dev.hixo.D.Z;
import dev.hixo.M.G;
import dev.hixo.M.K;
import dev.hixo.M.d;
import dev.hixo.M.s.K.p;
import dev.hixo.T.E;
import dev.hixo.T.q.X;
import dev.hixo.b.M;
import dev.hixo.b.g;
import dev.hixo.b.s;
import dev.hixo.t.q.p_0;
import java.lang.invoke.CallSite;
import java.util.ArrayDeque;
import java.util.Deque;
import net.minecraft.class_1309;
import net.minecraft.class_1657;
import net.minecraft.class_1799;
import net.minecraft.class_1921;
import net.minecraft.class_1935;
import net.minecraft.class_327;
import net.minecraft.class_332;
import net.minecraft.class_742;
import net.minecraft.class_9296;

public class i
extends G
implements Z {
    public static i t;
    public final M h;
    public final M p;
    public final s v;
    public final M N;
    public final M Y;
    public final g U;
    public final g Z;
    public final g n;
    public final g O;
    public final g J;
    public final g P;
    public final g c;
    public final g f;
    public final g T;
    public final g Q;
    public int s;
    public int k;
    public int H;
    public int g;
    private static final int M;
    private static final Deque<Boolean> W;
    private static int K;
    private static final int e;
    private static final int R;
    private static final int V;
    private static final int E;
    private static final String[] d;
    private static final long[] i;
    private static final Integer[] l;

    public i() {
        String[] stringArray = d;
        super((K)((Object)dev.hixo.M.d.a("\u00fd", (long)63693867768511465L) /* => dev.hixo.M.K.RENDER */), stringArray[5], stringArray[23]);
        this.h = new M("X", 12.0, 0.0, 2000.0, 1.0);
        this.p = new M("Y", 120.0, 0.0, 2000.0, 1.0);
        this.v = new s(stringArray[6], stringArray[22], stringArray[21], stringArray[7]);
        this.N = new M(stringArray[12], 30.0, 16.0, 64.0, 1.0);
        this.Y = new M(stringArray[13], 1.0, 0.6, 1.6, 0.05);
        this.U = new g(stringArray[2], true);
        this.Z = new g(stringArray[11], true);
        this.n = new g(stringArray[3], true);
        this.O = new g(stringArray[1], true);
        this.J = new g(stringArray[17], true);
        this.P = new g(stringArray[4], true);
        this.c = new g(stringArray[20], false);
        this.f = new g(stringArray[9], false);
        this.T = new g(stringArray[14], false);
        this.Q = new g(stringArray[8], false);
        dev.hixo.M.d.a("$", (Object)this, (int)0, (long)113806433936288059L) /* => dev.hixo.M.G.z */;
        dev.hixo.M.d.a("\u00c1", (i)this, (long)45199624102395110L) /* => dev.hixo.M.s.K.i.t */;
    }

    @Override
    public int[] p() {
        return new int[]{(int)dev.hixo.M.d.a("z", (Object)this, (long)82356099264854046L) /* => dev.hixo.M.s.K.i.s */, (int)dev.hixo.M.d.a("z", (Object)this, (long)69704464419488637L) /* => dev.hixo.M.s.K.i.k */, (int)dev.hixo.M.d.a("z", (Object)this, (long)137543186420192504L) /* => dev.hixo.M.s.K.i.H */, (int)dev.hixo.M.d.a("z", (Object)this, (long)36955362248500966L) /* => dev.hixo.M.s.K.i.g */};
    }

    @Override
    public void Y(int n2, int n3) {
        dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)82660234599053746L) /* => dev.hixo.M.s.K.i.h */, (double)((double)dev.hixo.M.d.a("\u00f9", (int)0, (int)n2, (long)199527982987698177L) /* => java.lang.Math.max */), (long)40461037022129452L) /* => dev.hixo.b.M.j */;
        dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)178257012889559005L) /* => dev.hixo.M.s.K.i.p */, (double)((double)dev.hixo.M.d.a("\u00f9", (int)0, (int)n3, (long)199527982987698177L) /* => java.lang.Math.max */), (long)40461037022129452L) /* => dev.hixo.b.M.j */;
    }

    @Override
    public boolean h() {
        return (boolean)dev.hixo.M.d.a("$", (Object)this, (long)96089342888548907L) /* => dev.hixo.M.G.c */;
    }

    @Override
    public void b(class_332 class_3322) {
        dev.hixo.M.d.a("$", (Object)this, (Object)class_3322, (long)62681111254391720L) /* => dev.hixo.M.s.K.i.s */;
    }

    public class_1309 W() {
        CallSite callSite;
        CallSite callSite2 = dev.hixo.M.d.a("\u00fd", (long)34297500847572953L) /* => dev.hixo.M.s.S.t.f */;
        if (callSite2 != null && dev.hixo.M.d.a("$", (Object)callSite2, (long)96089342888548907L) /* => dev.hixo.M.G.c */ != false && (callSite = dev.hixo.M.d.a("$", (Object)callSite2, (long)164466594068746767L) /* => dev.hixo.M.s.S.t.T */) != null && dev.hixo.M.d.a("$", (Object)callSite, (long)83468261842299832L) /* => net.minecraft.class_1309.method_5805 */ != false && dev.hixo.M.d.a("$", (Object)callSite, (long)123974669313727410L) /* => net.minecraft.class_1309.method_6032 */ > 0.0f) {
            return callSite;
        }
        return null;
    }

    @E
    public void H(X x) {
        CallSite callSite = dev.hixo.M.d.a("\u00f9", (long)179869930689441125L) /* => net.minecraft.class_310.method_1551 */;
        if (dev.hixo.M.d.a("z", (Object)callSite, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */ == null || dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("z", (Object)callSite, (long)129597241205579821L) /* => net.minecraft.class_310.field_1690 */, (long)198773491697282574L) /* => net.minecraft.class_315.field_1842 */ != false) {
            return;
        }
        CallSite callSite2 = dev.hixo.M.d.a("$", (Object)this, (long)193381975986445651L) /* => dev.hixo.M.s.K.i.W */;
        if (callSite2 == null) {
            if (dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)98528014722490496L) /* => dev.hixo.M.s.K.i.Q */, (long)65580906021680841L) /* => dev.hixo.b.g.x */ != false) {
                callSite2 = dev.hixo.M.d.a("z", (Object)callSite, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */;
            } else {
                return;
            }
        }
        dev.hixo.M.d.a("$", (Object)this, (Object)dev.hixo.M.d.a("$", (Object)x, (long)107704720655344721L) /* => dev.hixo.T.q.X.f */, (Object)callSite2, (long)147193535556871072L) /* => dev.hixo.M.s.K.i.c */;
    }

    @E
    public void I(p_0 p_02) {
        CallSite callSite;
        if (dev.hixo.M.d.a("$", (Object)p_02, (long)52512254813896748L) /* => dev.hixo.T.q.p.W */ != dev.hixo.M.d.a("\u00fd", (long)199476637466971905L) /* => dev.hixo.T.S.PRE */) {
            return;
        }
        CallSite callSite2 = dev.hixo.M.d.a("\u00f9", (long)179869930689441125L) /* => net.minecraft.class_310.method_1551 */;
        CallSite callSite3 = callSite = dev.hixo.M.d.a("z", (Object)callSite2, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */ == null ? null : dev.hixo.M.d.a("$", (Object)this, (long)193381975986445651L) /* => dev.hixo.M.s.K.i.W */;
        if (callSite == null) {
            dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("\u00fd", (long)181161818569545984L) /* => dev.hixo.M.s.K.i.W */, (long)101892323560971662L) /* => java.util.Deque.clear */;
            dev.hixo.M.d.a("\u00c1", (int)-1, (long)137685480921732877L) /* => dev.hixo.M.s.K.i.K */;
            return;
        }
        if (dev.hixo.M.d.a("$", (Object)callSite, (long)181977475578374902L) /* => net.minecraft.class_1309.method_5628 */ != dev.hixo.M.d.a("\u00fd", (long)137685480921732877L) /* => dev.hixo.M.s.K.i.K */) {
            dev.hixo.M.d.a("\u00c1", (int)dev.hixo.M.d.a("$", (Object)callSite, (long)181977475578374902L) /* => net.minecraft.class_1309.method_5628 */, (long)137685480921732877L) /* => dev.hixo.M.s.K.i.K */;
            dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("\u00fd", (long)181161818569545984L) /* => dev.hixo.M.s.K.i.W */, (long)101892323560971662L) /* => java.util.Deque.clear */;
        }
        dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("\u00fd", (long)181161818569545984L) /* => dev.hixo.M.s.K.i.W */, (Object)dev.hixo.M.d.a("\u00f9", (boolean)dev.hixo.M.d.a("$", (Object)callSite, (long)132040930613070569L) /* => net.minecraft.class_1309.method_6039 */, (long)119505102668051061L) /* => java.lang.Boolean.valueOf */, (long)125274377582873492L) /* => java.util.Deque.addLast */;
        while (dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("\u00fd", (long)181161818569545984L) /* => dev.hixo.M.s.K.i.W */, (long)139774805315457882L) /* => java.util.Deque.size */ > 40) {
            dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("\u00fd", (long)181161818569545984L) /* => dev.hixo.M.s.K.i.W */, (long)111469621638989690L) /* => java.util.Deque.removeFirst */;
        }
    }

    private static int y() {
        if (dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("\u00fd", (long)181161818569545984L) /* => dev.hixo.M.s.K.i.W */, (long)59737830465201786L) /* => java.util.Deque.isEmpty */ != false) {
            return 0;
        }
        int n2 = 0;
        CallSite callSite = dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("\u00fd", (long)181161818569545984L) /* => dev.hixo.M.s.K.i.W */, (long)57789542790782957L) /* => java.util.Deque.iterator */;
        while (dev.hixo.M.d.a("$", (Object)callSite, (long)175361412755674352L) /* => java.util.Iterator.hasNext */ != false) {
            CallSite callSite2 = dev.hixo.M.d.a("$", (Object)((Boolean)((Object)dev.hixo.M.d.a("$", (Object)callSite, (long)64633749944946827L) /* => java.util.Iterator.next */)), (long)119183164553849833L) /* => java.lang.Boolean.booleanValue */;
            if (callSite2 == false) continue;
            ++n2;
        }
        return (int)dev.hixo.M.d.a("\u00f9", (float)(100.0f * (float)n2 / (float)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("\u00fd", (long)181161818569545984L) /* => dev.hixo.M.s.K.i.W */, (long)139774805315457882L) /* => java.util.Deque.size */), (long)90255071001362112L) /* => java.lang.Math.round */;
    }

    public void s(class_332 class_3322) {
        CallSite callSite = dev.hixo.M.d.a("\u00f9", (long)179869930689441125L) /* => net.minecraft.class_310.method_1551 */;
        if (dev.hixo.M.d.a("z", (Object)callSite, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */ == null) {
            return;
        }
        dev.hixo.M.d.a("$", (Object)this, (Object)class_3322, (Object)dev.hixo.M.d.a("z", (Object)callSite, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (long)147193535556871072L) /* => dev.hixo.M.s.K.i.c */;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void c(class_332 var1_1, class_1309 var2_2) {
        block40: {
            block39: {
                block35: {
                    block36: {
                        block37: {
                            block38: {
                                block34: {
                                    block33: {
                                        block32: {
                                            block31: {
                                                var3_3 = dev.hixo.M.s.K.p.d;
                                                v0 = this;
                                                if (var3_3 != 0) break block31;
                                                var32_4 = dev.hixo.M.s.K.i.d;
                                                if (dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)v0, (long)137301271972739501L) /* => dev.hixo.M.s.K.i.v */, (Object)var32_4[19], (long)114714509743429363L) /* => dev.hixo.b.s.P */ == false) break block32;
                                                v0 = this;
                                            }
                                            dev.hixo.M.d.a("$", (Object)v0, (Object)var1_1, (Object)var2_2, (long)72436489725928546L) /* => dev.hixo.M.s.K.i.F */;
                                            return;
                                        }
                                        var4_5 = dev.hixo.M.d.a("\u00f9", (long)179869930689441125L) /* => net.minecraft.class_310.method_1551 */;
                                        var5_6 = dev.hixo.M.d.a("z", (Object)var4_5, (long)33332170178084458L) /* => net.minecraft.class_310.field_1772 */;
                                        var6_7 = (float)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)154653833435777730L) /* => dev.hixo.M.s.K.i.Y */, (long)120513388240390397L) /* => dev.hixo.b.M.K */;
                                        dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("$", (Object)var1_1, (long)182057530285180715L) /* => net.minecraft.class_332.method_51448 */, (long)107444705912078912L) /* => net.minecraft.class_4587.method_22903 */;
                                        dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("$", (Object)var1_1, (long)182057530285180715L) /* => net.minecraft.class_332.method_51448 */, (float)((float)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)82660234599053746L) /* => dev.hixo.M.s.K.i.h */, (long)105488653926114013L) /* => dev.hixo.b.M.i */), (float)((float)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)178257012889559005L) /* => dev.hixo.M.s.K.i.p */, (long)105488653926114013L) /* => dev.hixo.b.M.i */), (float)0.0f, (long)56023600929979137L) /* => net.minecraft.class_4587.method_46416 */;
                                        dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("$", (Object)var1_1, (long)182057530285180715L) /* => net.minecraft.class_332.method_51448 */, (float)var6_7, (float)var6_7, (float)1.0f, (long)64702201591988101L) /* => net.minecraft.class_4587.method_22905 */;
                                        var7_8 = 4;
                                        v1 = this;
                                        if (var3_3 != 0) ** GOTO lbl22
                                        if (dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)v1, (long)97726315905437075L) /* => dev.hixo.M.s.K.i.J */, (long)65580906021680841L) /* => dev.hixo.b.g.x */ != false) {
                                            v1 = this;
lbl22:
                                            // 2 sources

                                            v2 = (int)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)v1, (long)79996921048399190L) /* => dev.hixo.M.s.K.i.N */, (long)120513388240390397L) /* => dev.hixo.b.M.K */;
                                        } else {
                                            v2 = 0;
                                        }
                                        var8_9 = v2;
                                        var9_10 = dev.hixo.M.d.a("$", (Object)var2_2, (long)123974669313727410L) /* => net.minecraft.class_1309.method_6032 */;
                                        var10_11 = dev.hixo.M.d.a("\u00f9", (float)0.1f, (float)dev.hixo.M.d.a("$", (Object)var2_2, (long)116637677832552308L) /* => net.minecraft.class_1309.method_6063 */, (long)121565737685922221L) /* => java.lang.Math.max */;
                                        var11_12 = dev.hixo.M.d.a("\u00f9", (float)0.0f, (float)dev.hixo.M.d.a("$", (Object)var2_2, (long)138996559064967828L) /* => net.minecraft.class_1309.method_6067 */, (long)121565737685922221L) /* => java.lang.Math.max */;
                                        var12_13 = dev.hixo.M.d.a("\u00f9", (float)0.0f, (float)dev.hixo.M.d.a("\u00f9", (float)1.0f, (float)(var9_10 / var10_11), (long)139533018482628456L) /* => java.lang.Math.min */, (long)121565737685922221L) /* => java.lang.Math.max */;
                                        var13_14 = dev.hixo.M.d.a("\u00f9", (float)0.0f, (float)dev.hixo.M.d.a("\u00f9", (float)(1.0f - var12_13), (float)(var11_12 / var10_11), (long)139533018482628456L) /* => java.lang.Math.min */, (long)121565737685922221L) /* => java.lang.Math.max */;
                                        var14_15 = dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("$", (Object)var2_2, (long)178041648957543290L) /* => net.minecraft.class_1309.method_5477 */, (long)122260847307190419L) /* => net.minecraft.class_2561.getString */;
                                        var32_4 = dev.hixo.M.s.K.i.d;
                                        var15_16 = dev.hixo.M.d.a("\u00f9", var32_4[18], (Object)new Object[]{dev.hixo.M.d.a("\u00f9", (float)var9_10, (long)150107566387426058L) /* => java.lang.Float.valueOf */}, (long)134076065087704526L) /* => java.lang.String.format */;
                                        var16_17 = dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("$", (Object)new StringBuilder(), (Object)var32_4[0], (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (Object)var15_16, (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (long)59411206276622891L) /* => java.lang.StringBuilder.toString */;
                                        v3 /* !! */  = dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)176331214736493120L) /* => dev.hixo.M.s.K.i.T */, (long)65580906021680841L) /* => dev.hixo.b.g.x */;
                                        if (var3_3 == 0) {
                                            if (v3 /* !! */  != false) {
                                                var16_17 = dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("$", (Object)new StringBuilder(), (Object)var16_17, (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (Object)var32_4[10], (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (int)dev.hixo.M.d.a("\u00f9", (long)77742045934859777L) /* => dev.hixo.M.s.K.i.y */, (long)32515713483113022L) /* => java.lang.StringBuilder.append */, (Object)"%", (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (long)59411206276622891L) /* => java.lang.StringBuilder.toString */;
                                            }
                                            v3 /* !! */  = (CallSite)var7_8;
                                        }
                                        v4 = var8_9;
                                        if (var3_3 == 0) {
                                            v4 = v4 > 0 ? var8_9 + 5 : 0;
                                        }
                                        var17_18 = v3 /* !! */  + v4;
                                        v5 /* !! */  = dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)32714706553978102L) /* => dev.hixo.M.s.K.i.O */, (long)65580906021680841L) /* => dev.hixo.b.g.x */;
                                        if (var3_3 == 0) {
                                            v5 /* !! */  = v5 /* !! */  != false ? dev.hixo.M.d.a("$", (Object)var5_6, (Object)var14_15, (long)60514977858798819L) /* => net.minecraft.class_327.method_1727 */ : (CallSite)false;
                                        }
                                        var18_19 /* !! */  = v5 /* !! */ ;
                                        v6 /* !! */  = dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)194123705921716788L) /* => dev.hixo.M.s.K.i.n */, (long)65580906021680841L) /* => dev.hixo.b.g.x */;
                                        if (var3_3 == 0) {
                                            v6 /* !! */  = v6 /* !! */  != false ? dev.hixo.M.d.a("$", (Object)var5_6, (Object)var15_16, (long)60514977858798819L) /* => net.minecraft.class_327.method_1727 */ : (CallSite)false;
                                        }
                                        v7 = dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)194123705921716788L) /* => dev.hixo.M.s.K.i.n */, (long)65580906021680841L) /* => dev.hixo.b.g.x */;
                                        if (var3_3 == 0) {
                                            v7 = v7 != false ? (Object)9 : (Object)false;
                                        }
                                        var19_20 = v6 /* !! */  + v7;
                                        v8 /* !! */  = dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)152893232058897560L) /* => dev.hixo.M.s.K.i.f */, (long)65580906021680841L) /* => dev.hixo.b.g.x */;
                                        if (var3_3 == 0) {
                                            v8 /* !! */  = v8 /* !! */  != false ? dev.hixo.M.d.a("$", (Object)var5_6, (Object)var16_17, (long)60514977858798819L) /* => net.minecraft.class_327.method_1727 */ : (CallSite)false;
                                        }
                                        var20_21 /* !! */  = v8 /* !! */ ;
                                        var21_22 = dev.hixo.M.d.a("\u00f9", (int)120, (int)dev.hixo.M.d.a("\u00f9", (int)(var18_19 /* !! */  + var17_18 + var7_8), (int)dev.hixo.M.d.a("\u00f9", (int)(var19_20 + var17_18 + var7_8), (int)(var20_21 /* !! */  + var7_8 * 2), (long)199527982987698177L) /* => java.lang.Math.max */, (long)199527982987698177L) /* => java.lang.Math.max */, (long)199527982987698177L) /* => java.lang.Math.max */;
                                        var22_23 = var7_8 + 12;
                                        var23_24 = 8;
                                        var24_25 = var22_23 + var23_24 + 2;
                                        var25_26 = dev.hixo.M.d.a("\u00f9", (int)(var7_8 + var8_9 + var7_8), (int)(var24_25 + 10 + var7_8), (long)199527982987698177L) /* => java.lang.Math.max */;
                                        dev.hixo.M.d.a("\u00e7", (Object)this, (int)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)82660234599053746L) /* => dev.hixo.M.s.K.i.h */, (long)105488653926114013L) /* => dev.hixo.b.M.i */, (long)82356099264854046L) /* => dev.hixo.M.s.K.i.s */;
                                        dev.hixo.M.d.a("\u00e7", (Object)this, (int)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)178257012889559005L) /* => dev.hixo.M.s.K.i.p */, (long)105488653926114013L) /* => dev.hixo.b.M.i */, (long)69704464419488637L) /* => dev.hixo.M.s.K.i.k */;
                                        dev.hixo.M.d.a("\u00e7", (Object)this, (int)((int)((float)var21_22 * var6_7)), (long)137543186420192504L) /* => dev.hixo.M.s.K.i.H */;
                                        dev.hixo.M.d.a("\u00e7", (Object)this, (int)((int)((float)var25_26 * var6_7)), (long)36955362248500966L) /* => dev.hixo.M.s.K.i.g */;
                                        v9 = this;
                                        if (var3_3 == 0) {
                                            if (dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)v9, (long)168841636554581043L) /* => dev.hixo.M.s.K.i.c */, (long)65580906021680841L) /* => dev.hixo.b.g.x */ != false) {
                                                dev.hixo.M.d.a("\u00f9", (Object)var1_1, (int)-6, (int)7, (int)-3, (int)(var25_26 - 7), (int)2, (int)dev.hixo.M.s.K.i.a(32388, 5444987161148104147L), (long)165554156958399055L) /* => dev.hixo.M.s.K.i.Z */;
                                            }
                                            v9 = this;
                                        }
                                        v10 /* !! */  = dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)v9, (long)172851308646236330L) /* => dev.hixo.M.s.K.i.U */, (long)65580906021680841L) /* => dev.hixo.b.g.x */;
                                        if (var3_3 == 0) {
                                            if (v10 /* !! */  != false) {
                                                dev.hixo.M.d.a("\u00f9", (Object)var1_1, (int)0, (int)0, (int)var21_22, (int)var25_26, (int)5, (long)34010843839536680L) /* => dev.hixo.M.s.K.i.J */;
                                            }
                                            v10 /* !! */  = (CallSite)var8_9;
                                        }
                                        if (var3_3 != 0) break block33;
                                        if (v10 /* !! */  > 0) {
                                            dev.hixo.M.d.a("$", (Object)this, (Object)var1_1, (Object)var5_6, (Object)var2_2, (int)var7_8, (int)var7_8, (int)var8_9, (long)188834886839526948L) /* => dev.hixo.M.s.K.i.z */;
                                        }
                                        v11 = this;
                                        if (var3_3 != 0) break block34;
                                        v10 /* !! */  = dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)v11, (long)32714706553978102L) /* => dev.hixo.M.s.K.i.O */, (long)65580906021680841L) /* => dev.hixo.b.g.x */;
                                    }
                                    if (v10 /* !! */  != false) {
                                        dev.hixo.M.d.a("$", (Object)var1_1, (Object)var5_6, (Object)var14_15, (int)var17_18, (int)(var7_8 - 1), (int)-1, (long)179776373438385131L) /* => net.minecraft.class_332.method_25303 */;
                                    }
                                    v11 = this;
                                }
                                if (var3_3 != 0) break block35;
                                if (dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)v11, (long)138514502576516819L) /* => dev.hixo.M.s.K.i.Z */, (long)65580906021680841L) /* => dev.hixo.b.g.x */ == false) break block36;
                                var26_27 = var17_18;
                                var27_28 = var21_22 - var7_8;
                                var28_29 = var22_23;
                                var29_30 = var22_23 + var23_24;
                                dev.hixo.M.d.a("\u00f9", (Object)var1_1, (int)var26_27, (int)var28_29, (int)var27_28, (int)var29_30, (int)(var23_24 / 2), (int)dev.hixo.M.s.K.i.a(30025, 1031243162428347932L), (long)165554156958399055L) /* => dev.hixo.M.s.K.i.Z */;
                                var30_31 = (int)((float)(var27_28 - var26_27 - 2) * var12_13);
                                v12 = (reference)var30_31;
                                if (var3_3 != 0) break block37;
                                if (v12 <= 0) break block38;
                                v12 = (reference)var23_24;
                                if (var3_3 != 0) break block37;
                                var31_32 /* !! */  = (v12 - 2) / 2;
                                dev.hixo.M.d.a("\u00f9", (Object)var1_1, (int)(var26_27 + true), (int)(var28_29 + 1), (int)(var26_27 + true + var30_31), (int)(var29_30 - 1), (int)var31_32 /* !! */ , (int)dev.hixo.M.s.K.i.a(7445, 8358893540107451980L), (long)165554156958399055L) /* => dev.hixo.M.s.K.i.Z */;
                                if (var30_31 > 3) {
                                    dev.hixo.M.d.a("\u00f9", (Object)var1_1, (int)(var26_27 + 2), (int)(var28_29 + 2), (int)(var26_27 + var30_31), (int)(var28_29 + 3), (int)1, (int)dev.hixo.M.s.K.i.a(20830, 1634507420033036831L), (long)165554156958399055L) /* => dev.hixo.M.s.K.i.Z */;
                                }
                            }
                            v12 = (cfr_temp_0 = var13_14 - 0.01f) == 0 ? 0 : (cfr_temp_0 > 0 ? 1 : -1);
                        }
                        if (var3_3 != 0) break block39;
                        if (v12 <= 0) break block36;
                        v12 = var27_28;
                        if (var3_3 != 0) break block39;
                        var31_32 /* !! */  = (reference)((float)(v12 - var26_27 - 2) * var13_14);
                        if (var31_32 /* !! */  > true) {
                            dev.hixo.M.d.a("$", (Object)var1_1, (int)(var26_27 + true + var30_31), (int)(var28_29 + 1), (int)(var26_27 + true + var30_31 + var31_32 /* !! */ ), (int)(var29_30 - 1), (int)-8062, (int)dev.hixo.M.s.K.i.a(13320, 6445990441666959194L), (long)124960968149806774L) /* => net.minecraft.class_332.method_25296 */;
                        }
                    }
                    v11 = this;
                }
                if (var3_3 != 0) break block40;
                v12 = dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)v11, (long)194123705921716788L) /* => dev.hixo.M.s.K.i.n */, (long)65580906021680841L) /* => dev.hixo.b.g.x */;
            }
            if (v12 != false) {
                dev.hixo.M.d.a("$", (Object)var1_1, (Object)var5_6, (Object)var15_16, (int)var17_18, (int)var24_25, (int)-1, (long)179776373438385131L) /* => net.minecraft.class_332.method_25303 */;
                var26_27 = var17_18 + dev.hixo.M.d.a("$", (Object)var5_6, (Object)var15_16, (long)60514977858798819L) /* => net.minecraft.class_327.method_1727 */ + 2;
                dev.hixo.M.d.a("\u00f9", (Object)var1_1, (int)var26_27, (int)var24_25, (int)dev.hixo.M.s.K.i.a(14745, 5437066443536063178L), (long)60869558160488122L) /* => dev.hixo.M.s.K.i.Y */;
            }
            v11 = this;
        }
        v13 = dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)v11, (long)152893232058897560L) /* => dev.hixo.M.s.K.i.f */, (long)65580906021680841L) /* => dev.hixo.b.g.x */;
        if (var3_3 == 0 && v13 != false) {
            v13 = dev.hixo.M.d.a("$", (Object)var1_1, (Object)var5_6, (Object)var16_17, (int)var7_8, (int)(var25_26 - 12), (int)dev.hixo.M.s.K.i.a(4493, 8427813392568906455L), (long)179776373438385131L) /* => net.minecraft.class_332.method_25303 */;
        }
        dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("$", (Object)var1_1, (long)182057530285180715L) /* => net.minecraft.class_332.method_51448 */, (long)173437477470911975L) /* => net.minecraft.class_4587.method_22909 */;
    }

    private void F(class_332 class_3322, class_1309 class_13092) {
        String string;
        CallSite callSite = dev.hixo.M.d.a("\u00f9", (long)179869930689441125L) /* => net.minecraft.class_310.method_1551 */;
        CallSite callSite2 = dev.hixo.M.d.a("z", (Object)callSite, (long)33332170178084458L) /* => net.minecraft.class_310.field_1772 */;
        float f = (float)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)154653833435777730L) /* => dev.hixo.M.s.K.i.Y */, (long)120513388240390397L) /* => dev.hixo.b.M.K */;
        dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("$", (Object)class_3322, (long)182057530285180715L) /* => net.minecraft.class_332.method_51448 */, (long)107444705912078912L) /* => net.minecraft.class_4587.method_22903 */;
        dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("$", (Object)class_3322, (long)182057530285180715L) /* => net.minecraft.class_332.method_51448 */, (float)((float)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)82660234599053746L) /* => dev.hixo.M.s.K.i.h */, (long)105488653926114013L) /* => dev.hixo.b.M.i */), (float)((float)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)178257012889559005L) /* => dev.hixo.M.s.K.i.p */, (long)105488653926114013L) /* => dev.hixo.b.M.i */), (float)0.0f, (long)56023600929979137L) /* => net.minecraft.class_4587.method_46416 */;
        dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("$", (Object)class_3322, (long)182057530285180715L) /* => net.minecraft.class_332.method_51448 */, (float)f, (float)f, (float)1.0f, (long)64702201591988101L) /* => net.minecraft.class_4587.method_22905 */;
        CallSite callSite3 = dev.hixo.M.d.a("$", (Object)new StringBuilder(), (Object)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("$", (Object)class_13092, (long)178041648957543290L) /* => net.minecraft.class_1309.method_5477 */, (long)122260847307190419L) /* => net.minecraft.class_2561.getString */, (long)86542515882976328L) /* => java.lang.StringBuilder.append */;
        if (dev.hixo.M.d.a("$", (Object)class_13092, (long)112491459111516074L) /* => net.minecraft.class_1309.method_6109 */ != false) {
            String[] stringArray = d;
            string = stringArray[16];
        } else {
            string = "";
        }
        CallSite callSite4 = dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("$", (Object)callSite3, (Object)string, (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (long)59411206276622891L) /* => java.lang.StringBuilder.toString */;
        CallSite callSite5 = dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("$", (Object)new StringBuilder(), (Object)d[15], (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (int)dev.hixo.M.d.a("\u00f9", (float)dev.hixo.M.d.a("$", (Object)class_13092, (long)123974669313727410L) /* => net.minecraft.class_1309.method_6032 */, (long)90255071001362112L) /* => java.lang.Math.round */, (long)32515713483113022L) /* => java.lang.StringBuilder.append */, (Object)(dev.hixo.M.d.a("$", (Object)class_13092, (long)138996559064967828L) /* => net.minecraft.class_1309.method_6067 */ > 0.0f ? dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("$", (Object)new StringBuilder(), (Object)"+", (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (int)dev.hixo.M.d.a("\u00f9", (float)dev.hixo.M.d.a("$", (Object)class_13092, (long)138996559064967828L) /* => net.minecraft.class_1309.method_6067 */, (long)90255071001362112L) /* => java.lang.Math.round */, (long)32515713483113022L) /* => java.lang.StringBuilder.append */, (long)59411206276622891L) /* => java.lang.StringBuilder.toString */ : ""), (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (long)59411206276622891L) /* => java.lang.StringBuilder.toString */;
        CallSite callSite6 = dev.hixo.M.d.a("\u00f9", (float)0.1f, (float)dev.hixo.M.d.a("$", (Object)class_13092, (long)116637677832552308L) /* => net.minecraft.class_1309.method_6063 */, (long)121565737685922221L) /* => java.lang.Math.max */;
        CallSite callSite7 = dev.hixo.M.d.a("\u00f9", (float)0.0f, (float)dev.hixo.M.d.a("\u00f9", (float)1.0f, (float)(dev.hixo.M.d.a("$", (Object)class_13092, (long)123974669313727410L) /* => net.minecraft.class_1309.method_6032 */ / callSite6), (long)139533018482628456L) /* => java.lang.Math.min */, (long)121565737685922221L) /* => java.lang.Math.max */;
        CallSite callSite8 = dev.hixo.M.d.a("\u00f9", (int)(dev.hixo.M.d.a("$", (Object)callSite2, (Object)callSite4, (long)60514977858798819L) /* => net.minecraft.class_327.method_1727 */ + 10), (int)60, (long)199527982987698177L) /* => java.lang.Math.max */;
        int n2 = 30;
        dev.hixo.M.d.a("\u00e7", (Object)this, (int)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)82660234599053746L) /* => dev.hixo.M.s.K.i.h */, (long)105488653926114013L) /* => dev.hixo.b.M.i */, (long)82356099264854046L) /* => dev.hixo.M.s.K.i.s */;
        dev.hixo.M.d.a("\u00e7", (Object)this, (int)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)178257012889559005L) /* => dev.hixo.M.s.K.i.p */, (long)105488653926114013L) /* => dev.hixo.b.M.i */, (long)69704464419488637L) /* => dev.hixo.M.s.K.i.k */;
        dev.hixo.M.d.a("\u00e7", (Object)this, (int)((int)((float)callSite8 * f)), (long)137543186420192504L) /* => dev.hixo.M.s.K.i.H */;
        dev.hixo.M.d.a("\u00e7", (Object)this, (int)((int)((float)n2 * f)), (long)36955362248500966L) /* => dev.hixo.M.s.K.i.g */;
        dev.hixo.M.d.a("\u00f9", (Object)class_3322, (int)0, (int)0, (int)callSite8, (int)n2, (int)5, (int)dev.hixo.M.s.K.i.a(9658, 2818455676341470950L), (long)165554156958399055L) /* => dev.hixo.M.s.K.i.Z */;
        dev.hixo.M.d.a("\u00f9", (Object)class_3322, (int)1, (int)1, (int)(callSite8 - true), (int)(n2 - 1), (int)4, (int)dev.hixo.M.s.K.i.a(5897, 3938576075035014226L), (long)165554156958399055L) /* => dev.hixo.M.s.K.i.Z */;
        int n3 = (int)((float)(callSite8 - 2) * callSite7);
        if (n3 > 0) {
            dev.hixo.M.d.a("\u00f9", (Object)class_3322, (int)1, (int)1, (int)dev.hixo.M.d.a("\u00f9", (int)2, (int)(1 + n3), (long)199527982987698177L) /* => java.lang.Math.max */, (int)4, (int)2, (int)dev.hixo.M.s.K.i.a(10982, 3425142137928763832L), (long)165554156958399055L) /* => dev.hixo.M.s.K.i.Z */;
        }
        dev.hixo.M.d.a("$", (Object)class_3322, (Object)callSite2, (Object)callSite4, (int)5, (int)6, (int)-1, (long)179776373438385131L) /* => net.minecraft.class_332.method_25303 */;
        dev.hixo.M.d.a("$", (Object)class_3322, (Object)callSite2, (Object)callSite5, (int)5, (int)17, (int)-1, (long)179776373438385131L) /* => net.minecraft.class_332.method_25303 */;
        dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("$", (Object)class_3322, (long)182057530285180715L) /* => net.minecraft.class_332.method_51448 */, (long)173437477470911975L) /* => net.minecraft.class_4587.method_22909 */;
    }

    private void z(class_332 class_3322, class_327 class_3272, class_1309 class_13092, int n2, int n3, int n4) {
        Object object;
        if (class_13092 instanceof class_1657) {
            object = (class_1657)class_13092;
            try {
                Object object2;
                block9: {
                    CallSite callSite = null;
                    if (class_13092 instanceof class_742) {
                        object2 = (class_742)class_13092;
                        callSite = dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("$", (Object)object2, (long)168126076345139221L) /* => net.minecraft.class_742.method_52814 */, (long)117596823144093505L) /* => net.minecraft.class_8685.comp_1626 */;
                    }
                    if (callSite == null) {
                        object2 = dev.hixo.M.d.a("\u00f9", (long)179869930689441125L) /* => net.minecraft.class_310.method_1551 */;
                        callSite = dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("$", (Object)object2, (long)133812782757335248L) /* => net.minecraft.class_310.method_1582 */, (Object)dev.hixo.M.d.a("$", (Object)object, (long)103687348761533565L) /* => net.minecraft.class_1657.method_7334 */, (long)53558701425159584L) /* => net.minecraft.class_1071.method_52862 */, (long)117596823144093505L) /* => net.minecraft.class_8685.comp_1626 */;
                    }
                    if (callSite == null || dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)79104240307793162L) /* => dev.hixo.M.s.K.i.P */, (long)65580906021680841L) /* => dev.hixo.b.g.x */ == false) break block9;
                    float f = (float)n4 / 8.0f;
                    dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("$", (Object)class_3322, (long)182057530285180715L) /* => net.minecraft.class_332.method_51448 */, (long)107444705912078912L) /* => net.minecraft.class_4587.method_22903 */;
                    dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("$", (Object)class_3322, (long)182057530285180715L) /* => net.minecraft.class_332.method_51448 */, (float)n2, (float)n3, (float)0.0f, (long)56023600929979137L) /* => net.minecraft.class_4587.method_46416 */;
                    dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("$", (Object)class_3322, (long)182057530285180715L) /* => net.minecraft.class_332.method_51448 */, (float)f, (float)f, (float)1.0f, (long)64702201591988101L) /* => net.minecraft.class_4587.method_22905 */;
                    dev.hixo.M.d.a("$", (Object)class_3322, class_1921::method_62277, (Object)callSite, (int)0, (int)0, (float)8.0f, (float)8.0f, (int)8, (int)8, (int)64, (int)64, (int)-1, (long)149383142301202237L) /* => net.minecraft.class_332.method_25291 */;
                    dev.hixo.M.d.a("$", (Object)class_3322, class_1921::method_62277, (Object)callSite, (int)0, (int)0, (float)40.0f, (float)8.0f, (int)8, (int)8, (int)64, (int)64, (int)-1, (long)149383142301202237L) /* => net.minecraft.class_332.method_25291 */;
                    dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("$", (Object)class_3322, (long)182057530285180715L) /* => net.minecraft.class_332.method_51448 */, (long)173437477470911975L) /* => net.minecraft.class_4587.method_22909 */;
                    return;
                }
                object2 = new class_1799((class_1935)dev.hixo.M.d.a("\u00fd", (long)110298407653061948L) /* => net.minecraft.class_1802.field_8575 */);
                dev.hixo.M.d.a("$", (Object)object2, (Object)dev.hixo.M.d.a("\u00fd", (long)189812231296198527L) /* => net.minecraft.class_9334.field_49617 */, (Object)new class_9296((GameProfile)dev.hixo.M.d.a("$", (Object)object, (long)103687348761533565L) /* => net.minecraft.class_1657.method_7334 */), (long)84070722051027097L) /* => net.minecraft.class_1799.method_57379 */;
                float f = (float)n4 / 16.0f;
                dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("$", (Object)class_3322, (long)182057530285180715L) /* => net.minecraft.class_332.method_51448 */, (long)107444705912078912L) /* => net.minecraft.class_4587.method_22903 */;
                dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("$", (Object)class_3322, (long)182057530285180715L) /* => net.minecraft.class_332.method_51448 */, (float)n2, (float)n3, (float)0.0f, (long)56023600929979137L) /* => net.minecraft.class_4587.method_46416 */;
                dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("$", (Object)class_3322, (long)182057530285180715L) /* => net.minecraft.class_332.method_51448 */, (float)f, (float)f, (float)1.0f, (long)64702201591988101L) /* => net.minecraft.class_4587.method_22905 */;
                dev.hixo.M.d.a("$", (Object)class_3322, (Object)object2, (int)0, (int)0, (long)44428553601884325L) /* => net.minecraft.class_332.method_51427 */;
                dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("$", (Object)class_3322, (long)182057530285180715L) /* => net.minecraft.class_332.method_51448 */, (long)173437477470911975L) /* => net.minecraft.class_4587.method_22909 */;
                return;
            }
            catch (Throwable throwable) {
                // empty catch block
            }
        }
        dev.hixo.M.d.a("\u00f9", (Object)class_3322, (int)n2, (int)n3, (int)(n2 + n4), (int)(n3 + n4), (int)4, (int)dev.hixo.M.s.K.i.a(14468, 2165761045626051536L), (long)165554156958399055L) /* => dev.hixo.M.s.K.i.Z */;
        object = dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("$", (Object)class_13092, (long)178041648957543290L) /* => net.minecraft.class_1309.method_5477 */, (long)122260847307190419L) /* => net.minecraft.class_2561.getString */;
        Object object3 = dev.hixo.M.d.a("$", (Object)object, (long)139567490040770223L) /* => java.lang.String.isEmpty */ != false ? "?" : dev.hixo.M.d.a("$", (Object)object, (int)0, (int)1, (long)169274583096351474L) /* => java.lang.String.net.minecraft.class_243 */;
        String string = object3;
        dev.hixo.M.d.a("$", (Object)class_3322, (Object)class_3272, (Object)string, (int)(n2 + (n4 - dev.hixo.M.d.a("$", (Object)class_3272, (Object)string, (long)60514977858798819L) /* => net.minecraft.class_327.method_1727 */) / 2), (int)(n3 + (n4 - 8) / 2), (int)-1, (long)179776373438385131L) /* => net.minecraft.class_332.method_25303 */;
    }

    private static void Y(class_332 class_3322, int n2, int n3, int n4) {
        dev.hixo.M.d.a("$", (Object)class_3322, (int)n2, (int)(n3 + 1), (int)(n2 + 2), (int)(n3 + 2), (int)n4, (long)70222225705551889L) /* => net.minecraft.class_332.method_25294 */;
        dev.hixo.M.d.a("$", (Object)class_3322, (int)(n2 + 4), (int)(n3 + 1), (int)(n2 + 6), (int)(n3 + 2), (int)n4, (long)70222225705551889L) /* => net.minecraft.class_332.method_25294 */;
        dev.hixo.M.d.a("$", (Object)class_3322, (int)n2, (int)(n3 + 2), (int)(n2 + 6), (int)(n3 + 3), (int)n4, (long)70222225705551889L) /* => net.minecraft.class_332.method_25294 */;
        dev.hixo.M.d.a("$", (Object)class_3322, (int)n2, (int)(n3 + 3), (int)(n2 + 6), (int)(n3 + 4), (int)n4, (long)70222225705551889L) /* => net.minecraft.class_332.method_25294 */;
        dev.hixo.M.d.a("$", (Object)class_3322, (int)(n2 + 1), (int)(n3 + 4), (int)(n2 + 5), (int)(n3 + 5), (int)n4, (long)70222225705551889L) /* => net.minecraft.class_332.method_25294 */;
        dev.hixo.M.d.a("$", (Object)class_3322, (int)(n2 + 2), (int)(n3 + 5), (int)(n2 + 4), (int)(n3 + 6), (int)n4, (long)70222225705551889L) /* => net.minecraft.class_332.method_25294 */;
        dev.hixo.M.d.a("$", (Object)class_3322, (int)(n2 + 3), (int)(n3 + 6), (int)(n2 + 4), (int)(n3 + 7), (int)n4, (long)70222225705551889L) /* => net.minecraft.class_332.method_25294 */;
    }

    private static void J(class_332 class_3322, int n2, int n3, int n4, int n5, int n6) {
        dev.hixo.M.d.a("\u00f9", (Object)class_3322, (int)(n2 - 1), (int)(n3 - 1), (int)(n4 + 1), (int)(n5 + 1), (int)(n6 + 1), (int)dev.hixo.M.s.K.i.a(2582, 3567958000064555350L), (long)165554156958399055L) /* => dev.hixo.M.s.K.i.Z */;
        dev.hixo.M.d.a("\u00f9", (Object)class_3322, (int)n2, (int)n3, (int)n4, (int)n5, (int)n6, (int)dev.hixo.M.s.K.i.a(21757, 7641882105458800557L), (long)165554156958399055L) /* => dev.hixo.M.s.K.i.Z */;
    }

    private static void Z(class_332 class_3322, int n2, int n3, int n4, int n5, int object, int n6) {
        if (n4 <= n2 || n5 <= n3) {
            return;
        }
        if ((object = (Object)dev.hixo.M.d.a("\u00f9", (int)0, (int)dev.hixo.M.d.a("\u00f9", (int)object, (int)dev.hixo.M.d.a("\u00f9", (int)((n4 - n2) / 2), (int)((n5 - n3) / 2), (long)62474117164247490L) /* => java.lang.Math.min */, (long)62474117164247490L) /* => java.lang.Math.min */, (long)199527982987698177L) /* => java.lang.Math.max */) == 0) {
            dev.hixo.M.d.a("$", (Object)class_3322, (int)n2, (int)n3, (int)n4, (int)n5, (int)n6, (long)70222225705551889L) /* => net.minecraft.class_332.method_25294 */;
            return;
        }
        dev.hixo.M.d.a("$", (Object)class_3322, (int)n2, (int)(n3 + object), (int)n4, (int)(n5 - object), (int)n6, (long)70222225705551889L) /* => net.minecraft.class_332.method_25294 */;
        for (Object object2 = 0; object2 < object; ++object2) {
            double d2 = (double)(object - object2) - 0.5;
            int n7 = (int)dev.hixo.M.d.a("\u00f9", (double)((double)object - dev.hixo.M.d.a("\u00f9", (double)((double)object * (double)object - d2 * d2), (long)146319326606007315L) /* => java.lang.Math.sqrt */), (long)33411004263283148L) /* => java.lang.Math.round */;
            dev.hixo.M.d.a("$", (Object)class_3322, (int)(n2 + n7), (int)(n3 + object2), (int)(n4 - n7), (int)(n3 + object2 + 1), (int)n6, (long)70222225705551889L) /* => net.minecraft.class_332.method_25294 */;
            dev.hixo.M.d.a("$", (Object)class_3322, (int)(n2 + n7), (int)(n5 - object2 - 1), (int)(n4 - n7), (int)(n5 - object2), (int)n6, (long)70222225705551889L) /* => net.minecraft.class_332.method_25294 */;
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
                        var13 = new String[24];
                        var11_1 = 0;
                        var10_2 = "MZ^C\u0007u;%\tVWPXSS`hZ\nG^\\D\u0014onpQ[\u000bMZ^C\u0007u!QZG[\tCS^[S[`fZ\tQ^MH\u0016iIP{\u0005VKFC\u0016\u0005K^IJ\u001d\u0013UMZY\u001axv%\u0017Q@Si`wXZ[Z\tLQY@SQhkZ\u000f%\u001f\u001fm\u001frbn\u001fmN\u0007x;%\nMZ^C\u0007u!G^M\tMZ^KSNh\u007fZ\u0005V\\^C\u0016\nGSPL\u0018=SdKZ\u0004Mo\u0005\u000f\u0007%\u0017}N\u0011d(\tVWPXSUdd[\u0004 \u0011\u000eI\u0005K^IJ\u001d\nD\\\\J\u001di!G^M\tWZYJ\u0001xofZ";
                        var12_3 = "MZ^C\u0007u;%\tVWPXSS`hZ\nG^\\D\u0014onpQ[\u000bMZ^C\u0007u!QZG[\tCS^[S[`fZ\tQ^MH\u0016iIP{\u0005VKFC\u0016\u0005K^IJ\u001d\u0013UMZY\u001axv%\u0017Q@Si`wXZ[Z\tLQY@SQhkZ\u000f%\u001f\u001fm\u001frbn\u001fmN\u0007x;%\nMZ^C\u0007u!G^M\tMZ^KSNh\u007fZ\u0005V\\^C\u0016\nGSPL\u0018=SdKZ\u0004Mo\u0005\u000f\u0007%\u0017}N\u0011d(\tVWPXSUdd[\u0004 \u0011\u000eI\u0005K^IJ\u001d\nD\\\\J\u001di!G^M\tWZYJ\u0001xofZ".length();
                        var9_4 = 8;
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
                            var10_2 = "WZYJ\u0001xofZ\r\u663b\u7905\u677f\u6201\u769d\u681a\u8841\u91ca\uff37\u53d0\u62f9\u52db\uff14";
                            var12_3 = "WZYJ\u0001xofZ\r\u663b\u7905\u677f\u6201\u769d\u681a\u8841\u91ca\uff37\u53d0\u62f9\u52db\uff14".length();
                            var9_4 = 9;
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
                                v10 = 5;
                                break;
                            }
                            case 1: {
                                v10 = 63;
                                break;
                            }
                            case 2: {
                                v10 = 63;
                                break;
                            }
                            case 3: {
                                v10 = 47;
                                break;
                            }
                            case 4: {
                                v10 = 115;
                                break;
                            }
                            case 5: {
                                v10 = 29;
                                break;
                            }
                            default: {
                                v10 = 1;
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
                dev.hixo.M.s.K.i.d = var13;
                var0_7 = 4234135953578899878L;
                var6_8 = new long[18];
                var3_9 = 0;
                var4_10 = "DY\u0097\u00bf\u00f3\u0082\u0083\u001b{\u00b3\u00c0v\u00be\u00cf\u00cc_2\u00d7]J\u0019\fN\u00ebm\u00af\u008c\u00cc?\u0019\u00c2w`/\u00bc{\u00dc\u0015\u00a1,\u0087\u0001}\u00ae@P/\u00ba7\u0086\u000b,\u00f4$t\u009aVY\u00c0\u008d\u00e1\u00f3\u00db\u008a\u0017\u0012\u00b0\u001c\u00ac\u00c8&W\u00f9\u001e\u00d2`\u00b1YS\u00fd\u00a4e\u00dbCUv!\u0081\u00d4\u00a1\u0091\u00e2N\u0097\u00cd\u00f4\u00b6yNT\u00a7\u00d5\u00d2m\u00fd\u008a(\u00e2\u00c9^\u00eb\u008b\u008f\u00ca\t\u00b5\b&\u00dd3\u009b\u00b3 \u00c6\u00cbT!\u00e3";
                var5_11 = "DY\u0097\u00bf\u00f3\u0082\u0083\u001b{\u00b3\u00c0v\u00be\u00cf\u00cc_2\u00d7]J\u0019\fN\u00ebm\u00af\u008c\u00cc?\u0019\u00c2w`/\u00bc{\u00dc\u0015\u00a1,\u0087\u0001}\u00ae@P/\u00ba7\u0086\u000b,\u00f4$t\u009aVY\u00c0\u008d\u00e1\u00f3\u00db\u008a\u0017\u0012\u00b0\u001c\u00ac\u00c8&W\u00f9\u001e\u00d2`\u00b1YS\u00fd\u00a4e\u00dbCUv!\u0081\u00d4\u00a1\u0091\u00e2N\u0097\u00cd\u00f4\u00b6yNT\u00a7\u00d5\u00d2m\u00fd\u008a(\u00e2\u00c9^\u00eb\u008b\u008f\u00ca\t\u00b5\b&\u00dd3\u009b\u00b3 \u00c6\u00cbT!\u00e3".length();
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
                    var4_10 = "\u0017#\u00f6Z\u00f1d/\u000f\"pya\u00ac\u00f7tF";
                    var5_11 = "\u0017#\u00f6Z\u00f1d/\u000f\"pya\u00ac\u00f7tF".length();
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
        dev.hixo.M.s.K.i.i = var6_8;
        dev.hixo.M.s.K.i.l = new Integer[18];
        dev.hixo.M.s.K.i.M = dev.hixo.M.s.K.i.a(5760, 707721390438512081L);
        dev.hixo.M.s.K.i.R = dev.hixo.M.s.K.i.a(4128, 7765476227839456118L);
        dev.hixo.M.s.K.i.e = dev.hixo.M.s.K.i.a(31514, 2606004988368099397L);
        dev.hixo.M.s.K.i.E = dev.hixo.M.s.K.i.a(23986, 2656648053212593898L);
        dev.hixo.M.s.K.i.V = dev.hixo.M.s.K.i.a(15228, 7350564828906051617L);
        dev.hixo.M.s.K.i.W = new ArrayDeque<Boolean>();
        dev.hixo.M.d.a("\u00c1", (int)-1, (long)137685480921732877L) /* => dev.hixo.M.s.K.i.K */;
    }

    private static int a(int n2, long l2) {
        int n3 = n2 ^ (int)(l2 & 0x7FFFL) ^ 0x6350;
        if (l[n3] == null) {
            dev.hixo.M.s.K.i.l[n3] = (int)(i[n3] ^ l2);
        }
        return l[n3];
    }
}

