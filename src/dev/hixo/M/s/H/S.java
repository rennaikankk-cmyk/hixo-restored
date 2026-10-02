/*
 * RESTORED SOURCE — decompiled reconstruction, not the original files.
 * class: dev.hixo.M.s.H.S
 * identified as: RotationFix
 * context strings: 'theUnsafe' | '放方块后 pitch 变化量重复 → +0.002' | 'ACA Perfect Rotation' | 'Debug'
 */

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2828
 */
package dev.hixo.M.s.H;

import dev.hixo.M.G;
import dev.hixo.M.K;
import dev.hixo.M.d;
import dev.hixo.b.g;
import java.lang.invoke.CallSite;
import java.lang.reflect.Field;
import java.util.Random;
import net.minecraft.class_2828;
import sun.misc.Unsafe;

public class S
extends G {
    public static S R;
    public final g p;
    public final g y;
    public final g Y;
    public final g M;
    private static final double[] l;
    private final Random u;
    private float e;
    private float W;
    private boolean q;
    private float D;
    private float U;
    private boolean r;
    private static Unsafe w;
    private static Field x;
    private static Field k;
    private static boolean h;
    public static boolean Q;
    private static final String[] c;

    public S() {
        String[] stringArray = c;
        super((K)((Object)d.a("\u00fd", (long)113909078088013201L) /* => dev.hixo.M.K.MISC */), stringArray[7], stringArray[6]);
        this.p = new g(stringArray[5], true);
        this.y = new g(stringArray[2], true);
        this.Y = new g(stringArray[4], true);
        this.M = new g(stringArray[3], false);
        this.u = new Random();
        d.a("\u00e7", (Object)this, (boolean)false, (long)166515211398403719L) /* => dev.hixo.M.s.H.S.q */;
        d.a("\u00e7", (Object)this, (float)0.0f, (long)112687552792153921L) /* => dev.hixo.M.s.H.S.D */;
        d.a("\u00e7", (Object)this, (float)-1.0f, (long)66952089952688663L) /* => dev.hixo.M.s.H.S.U */;
        d.a("\u00e7", (Object)this, (boolean)false, (long)56328235566958139L) /* => dev.hixo.M.s.H.S.r */;
        d.a("$", (Object)this, (int)0, (long)113806433936288059L) /* => dev.hixo.M.G.z */;
        d.a("\u00c1", (S)this, (long)126365528766909072L) /* => dev.hixo.M.s.H.S.R */;
    }

    private void W(String string) {
        if (d.a("$", (Object)d.a("z", (Object)this, (long)85883175254158935L) /* => dev.hixo.M.s.H.S.M */, (long)65580906021680841L) /* => dev.hixo.b.g.x */ != false) {
            d.a("\u00f9", (Object)d.a("$", (Object)d.a("$", (Object)d.a("$", (Object)new StringBuilder(), (Object)c[8], (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (Object)string, (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (long)59411206276622891L) /* => java.lang.StringBuilder.toString */, (long)46296556092243784L) /* => dev.hixo.f.E.o */;
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void o(class_2828 var1_1) {
        block66: {
            block84: {
                block67: {
                    block85: {
                        block86: {
                            block88: {
                                block87: {
                                    block83: {
                                        block79: {
                                            block80: {
                                                block81: {
                                                    block82: {
                                                        block78: {
                                                            block68: {
                                                                block69: {
                                                                    block76: {
                                                                        block77: {
                                                                            block75: {
                                                                                block74: {
                                                                                    block73: {
                                                                                        block72: {
                                                                                            block71: {
                                                                                                block70: {
                                                                                                    block65: {
                                                                                                        block89: {
                                                                                                            block90: {
                                                                                                                var2_2 = S.Q;
                                                                                                                if (d.a("$", (Object)this, (long)96089342888548907L) /* => dev.hixo.M.G.c */ == false) break block89;
                                                                                                                v0 = var1_1;
                                                                                                                if (var2_2) ** GOTO lbl20
                                                                                                                break block90;
                                                                                                                catch (Throwable v1) {
                                                                                                                    throw v1;
                                                                                                                }
                                                                                                            }
                                                                                                            if (v0 != null) break block65;
                                                                                                        }
                                                                                                        return;
                                                                                                    }
                                                                                                    try {
                                                                                                        v0 = var1_1;
lbl20:
                                                                                                        // 2 sources

                                                                                                        var3_3 = d.a("$", (Object)v0, (float)0.0f, (long)146662696112953841L) /* => net.minecraft.class_2828.method_12271 */;
                                                                                                        var4_4 = d.a("$", (Object)var1_1, (float)0.0f, (long)112566322865880841L) /* => net.minecraft.class_2828.method_12270 */;
                                                                                                    }
                                                                                                    catch (Throwable var5_5) {
                                                                                                        return;
                                                                                                    }
                                                                                                    var5_6 = var3_3;
                                                                                                    var6_7 = var4_4;
                                                                                                    var7_8 = false;
                                                                                                    if (var2_2) break block66;
                                                                                                    if (d.a("z", (Object)this, (long)166515211398403719L) /* => dev.hixo.M.s.H.S.q */ == false) break block67;
                                                                                                    var8_9 = (double)d.a("\u00f9", (float)d.a("\u00f9", (float)(var3_3 - d.a("z", (Object)this, (long)80925624212322002L) /* => dev.hixo.M.s.H.S.e */), (long)39581190969117005L) /* => dev.hixo.M.s.H.S.X */, (long)164168003445879722L) /* => java.lang.Math.abs */;
                                                                                                    var10_10 = (double)d.a("\u00f9", (float)(var4_4 - d.a("z", (Object)this, (long)126976778155341161L) /* => dev.hixo.M.s.H.S.W */), (long)164168003445879722L) /* => java.lang.Math.abs */;
                                                                                                    v4 = this;
                                                                                                    if (var2_2) break block68;
                                                                                                    if (d.a("$", (Object)d.a("z", (Object)v4, (long)124091306528285253L) /* => dev.hixo.M.s.H.S.p */, (long)65580906021680841L) /* => dev.hixo.b.g.x */ == false) break block69;
                                                                                                    v6 = var8_9;
                                                                                                    v7 = 1.0E-5;
                                                                                                    if (var2_2) break block70;
                                                                                                    if (!(v6 < v7)) break block71;
                                                                                                    v6 = var10_10;
                                                                                                    v7 = 1.0;
                                                                                                }
                                                                                                cfr_temp_0 = v6 - v7;
                                                                                                v11 = cfr_temp_0 == 0.0 ? 0 : (cfr_temp_0 > 0.0 ? 1 : -1);
                                                                                                if (var2_2) break block72;
                                                                                                if (v11 <= 0) break block71;
                                                                                                v11 = (double)true;
                                                                                                break block72;
                                                                                            }
                                                                                            v11 = (double)false;
                                                                                        }
                                                                                        var12_11 = v11;
                                                                                        v13 = var10_10;
                                                                                        v14 = 1.0E-5;
                                                                                        if (var2_2) break block73;
                                                                                        if (!(v13 < v14)) break block74;
                                                                                        v13 = var8_9;
                                                                                        v14 = 1.0;
                                                                                    }
                                                                                    cfr_temp_1 = v13 - v14;
                                                                                    v17 = cfr_temp_1 == 0.0 ? 0 : (cfr_temp_1 > 0.0 ? 1 : -1);
                                                                                    if (var2_2) break block75;
                                                                                    if (v17 <= 0) break block74;
                                                                                    v17 = (double)true;
                                                                                    break block75;
                                                                                }
                                                                                v17 = (double)false;
                                                                            }
                                                                            var13_12 = v17;
                                                                            v19 /* !! */  = (CallSite)var12_11;
                                                                            if (var2_2) break block76;
                                                                            if (v19 /* !! */  == false) break block77;
                                                                            var5_6 = d.a("z", (Object)this, (long)80925624212322002L) /* => dev.hixo.M.s.H.S.e */ + (float)(d.a("$", (Object)d.a("z", (Object)this, (long)60430755032485927L) /* => dev.hixo.M.s.H.S.u */, (long)37138789431181569L) /* => java.util.Random.nextGaussian */ * 0.001);
                                                                            var7_8 = true;
                                                                        }
                                                                        v19 /* !! */  = (CallSite)var13_12;
                                                                    }
                                                                    if (var2_2) break block78;
                                                                    if (v19 /* !! */  == false) break block69;
                                                                    var6_7 = d.a("z", (Object)this, (long)126976778155341161L) /* => dev.hixo.M.s.H.S.W */ + (float)(d.a("$", (Object)d.a("z", (Object)this, (long)60430755032485927L) /* => dev.hixo.M.s.H.S.u */, (long)37138789431181569L) /* => java.util.Random.nextGaussian */ * 0.001);
                                                                    var7_8 = true;
                                                                }
                                                                v4 = this;
                                                            }
                                                            if (var2_2) break block79;
                                                            v19 /* !! */  = d.a("$", (Object)d.a("z", (Object)v4, (long)108631731522641111L) /* => dev.hixo.M.s.H.S.y */, (long)65580906021680841L) /* => dev.hixo.b.g.x */;
                                                        }
                                                        if (v19 /* !! */  == false) break block80;
                                                        v23 = var8_9;
                                                        if (var2_2) break block81;
                                                        if (!(v23 > 1.0E-10)) break block82;
                                                        v23 = var8_9;
                                                        if (var2_2) break block81;
                                                        if (d.a("\u00f9", (double)v23, (long)50369605071708175L) /* => dev.hixo.M.s.H.S.Y */ == false) break block82;
                                                        var5_6 += (float)(d.a("$", (Object)d.a("z", (Object)this, (long)60430755032485927L) /* => dev.hixo.M.s.H.S.u */, (long)37138789431181569L) /* => java.util.Random.nextGaussian */ * 0.005);
                                                        var7_8 = true;
                                                    }
                                                    v23 = var10_10;
                                                }
                                                cfr_temp_2 = v23 - 1.0E-10;
                                                v28 /* !! */  = (CallSite)(cfr_temp_2 == 0.0 ? 0 : (cfr_temp_2 > 0.0 ? 1 : -1));
                                                if (var2_2) break block83;
                                                if (v28 /* !! */  <= 0) break block80;
                                                v28 /* !! */  = d.a("\u00f9", (double)var10_10, (long)50369605071708175L) /* => dev.hixo.M.s.H.S.Y */;
                                                if (var2_2) break block83;
                                                if (v28 /* !! */  == false) break block80;
                                                var6_7 += (float)(d.a("$", (Object)d.a("z", (Object)this, (long)60430755032485927L) /* => dev.hixo.M.s.H.S.u */, (long)37138789431181569L) /* => java.util.Random.nextGaussian */ * 0.005);
                                                var7_8 = true;
                                            }
                                            v4 = this;
                                        }
                                        if (var2_2) break block84;
                                        v28 /* !! */  = d.a("$", (Object)d.a("z", (Object)v4, (long)126147870851643031L) /* => dev.hixo.M.s.H.S.Y */, (long)65580906021680841L) /* => dev.hixo.b.g.x */;
                                    }
                                    if (v28 /* !! */  == false) break block67;
                                    v33 = this;
                                    if (var2_2) break block85;
                                    if (d.a("z", (Object)v33, (long)56328235566958139L) /* => dev.hixo.M.s.H.S.r */ == false) break block86;
                                    v33 = this;
                                    if (var2_2) break block85;
                                    if (!(d.a("z", (Object)v33, (long)66952089952688663L) /* => dev.hixo.M.s.H.S.U */ >= 0.0f)) break block86;
                                    v38 = var10_10;
                                    v39 = 2.0;
                                    if (var2_2) break block87;
                                    if (!(v38 > v39)) break block86;
                                    v38 = (double)d.a("\u00f9", (double)(var10_10 - (double)d.a("z", (Object)this, (long)66952089952688663L) /* => dev.hixo.M.s.H.S.U */), (long)184451009312960843L) /* => java.lang.Math.abs */;
                                    v39 = 1.0E-4;
                                }
                                cfr_temp_3 = v38 - v39;
                                v43 = cfr_temp_3 == 0.0 ? 0 : (cfr_temp_3 < 0.0 ? -1 : 1);
                                if (var2_2) break block88;
                                if (v43 >= 0) break block86;
                                var6_7 += 0.002f;
                                v43 = (double)true;
                            }
                            var7_8 = v43;
                            d.a("$", (Object)this, (Object)S.c[1], (long)46114084978672150L) /* => dev.hixo.M.s.H.S.W */;
                        }
                        d.a("\u00e7", (Object)this, (float)((float)var10_10), (long)112687552792153921L) /* => dev.hixo.M.s.H.S.D */;
                        v33 = this;
                    }
                    d.a("\u00e7", (Object)v33, (boolean)true, (long)56328235566958139L) /* => dev.hixo.M.s.H.S.r */;
                }
                d.a("\u00e7", (Object)this, (float)var3_3, (long)80925624212322002L) /* => dev.hixo.M.s.H.S.e */;
                d.a("\u00e7", (Object)this, (float)var4_4, (long)126976778155341161L) /* => dev.hixo.M.s.H.S.W */;
                v4 = this;
            }
            d.a("\u00e7", (Object)v4, (boolean)true, (long)166515211398403719L) /* => dev.hixo.M.s.H.S.q */;
        }
        if (var7_8) {
            d.a("\u00f9", (Object)var1_1, (float)var5_6, (float)var6_7, (long)175202377597443649L) /* => dev.hixo.M.s.H.S.T */;
        }
    }

    public void y() {
        if (d.a("$", (Object)this, (long)96089342888548907L) /* => dev.hixo.M.G.c */ == false) {
            return;
        }
        if (d.a("z", (Object)this, (long)56328235566958139L) /* => dev.hixo.M.s.H.S.r */ != false) {
            d.a("\u00e7", (Object)this, (float)d.a("z", (Object)this, (long)112687552792153921L) /* => dev.hixo.M.s.H.S.D */, (long)66952089952688663L) /* => dev.hixo.M.s.H.S.U */;
        }
        d.a("\u00e7", (Object)this, (boolean)false, (long)56328235566958139L) /* => dev.hixo.M.s.H.S.r */;
    }

    private static float X(float f) {
        while (f > 180.0f) {
            f -= 360.0f;
        }
        while (f < -180.0f) {
            f += 360.0f;
        }
        return f;
    }

    private static boolean Y(double d2) {
        if (d.a("\u00f9", (double)d2, (long)112068928121973836L) /* => java.lang.Double.isNaN */ != false || d.a("\u00f9", (double)d2, (long)141074380138655274L) /* => java.lang.Double.isInfinite */ != false) {
            return false;
        }
        for (CallSite callSite : d.a("\u00fd", (long)46718322940355879L) /* => dev.hixo.M.s.H.S.l */) {
            double d3 = d2 / callSite;
            if (!(d.a("\u00f9", (double)(d3 - (double)d.a("\u00f9", (double)d3, (long)33411004263283148L) /* => java.lang.Math.round */), (long)184451009312960843L) /* => java.lang.Math.abs */ <= 1.0E-10)) continue;
            return true;
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void S(class_2828 class_28282) {
        if (d.a("\u00fd", (long)165112921136812519L) /* => dev.hixo.M.s.H.S.h */ != false) {
            return;
        }
        d.a("\u00c1", (boolean)true, (long)165112921136812519L) /* => dev.hixo.M.s.H.S.h */;
        try {
            CallSite callSite = d.a("$", (Object)class_28282, (float)0.0f, (long)146662696112953841L) /* => net.minecraft.class_2828.method_12271 */;
            CallSite callSite2 = d.a("$", (Object)class_28282, (float)0.0f, (long)112566322865880841L) /* => net.minecraft.class_2828.method_12270 */;
            for (CallSite callSite3 : d.a("$", class_2828.class, (long)148137054042197348L) /* => java.lang.Class.getDeclaredFields */) {
                if (d.a("$", (Object)callSite3, (long)41971264004164462L) /* => java.lang.reflect.Field.getType */ != d.a("\u00fd", (long)84165193614146617L) /* => java.lang.Float.TYPE */) continue;
                try {
                    d.a("$", (Object)callSite3, (boolean)true, (long)139619988684594193L) /* => java.lang.reflect.Field.setAccessible */;
                    CallSite callSite4 = d.a("$", (Object)callSite3, (Object)class_28282, (long)116709506028063179L) /* => java.lang.reflect.Field.getFloat */;
                    if (d.a("\u00fd", (long)94986316314828241L) /* => dev.hixo.M.s.H.S.x */ == null && callSite4 == callSite) {
                        d.a("\u00c1", (Field)((Object)callSite3), (long)94986316314828241L) /* => dev.hixo.M.s.H.S.x */;
                        continue;
                    }
                    if (d.a("\u00fd", (long)162626437017452591L) /* => dev.hixo.M.s.H.S.k */ != null || callSite4 != callSite2) continue;
                    d.a("\u00c1", (Field)((Object)callSite3), (long)162626437017452591L) /* => dev.hixo.M.s.H.S.k */;
                }
                catch (Throwable throwable) {
                    // empty catch block
                }
            }
            return;
        }
        catch (Throwable throwable) {
            // empty catch block
        }
    }

    private static void T(class_2828 class_28282, float f, float f2) {
        d.a("\u00f9", (Object)class_28282, (long)124672505671627691L) /* => dev.hixo.M.s.H.S.S */;
        d.a("\u00f9", (Object)class_28282, (Object)d.a("\u00fd", (long)94986316314828241L) /* => dev.hixo.M.s.H.S.x */, (float)f, (long)86777919948952116L) /* => dev.hixo.M.s.H.S.c */;
        d.a("\u00f9", (Object)class_28282, (Object)d.a("\u00fd", (long)162626437017452591L) /* => dev.hixo.M.s.H.S.k */, (float)f2, (long)86777919948952116L) /* => dev.hixo.M.s.H.S.c */;
    }

    private static void c(class_2828 class_28282, Field field, float f) {
        block8: {
            if (field == null) {
                return;
            }
            try {
                block7: {
                    if (d.a("\u00fd", (long)165049920955514037L) /* => dev.hixo.M.s.H.S.w */ == null) break block7;
                    d.a("$", (Object)d.a("\u00fd", (long)165049920955514037L) /* => dev.hixo.M.s.H.S.w */, (Object)class_28282, (long)d.a("$", (Object)d.a("\u00fd", (long)165049920955514037L) /* => dev.hixo.M.s.H.S.w */, (Object)field, (long)55213080438924922L) /* => sun.misc.Unsafe.objectFieldOffset */, (float)f, (long)174465083353511198L) /* => sun.misc.Unsafe.putFloat */;
                    break block8;
                }
                d.a("$", (Object)field, (Object)class_28282, (float)f, (long)119677858055233486L) /* => java.lang.reflect.Field.setFloat */;
            }
            catch (Throwable throwable) {
                // empty catch block
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                var5 = new String[9];
                var3_1 = 0;
                var2_2 = "\u000fR+|z\u001a\u0011\u001d_\u0019\u6545\u6583\u5719\u54274\u0019\u0019\u000fY&\t\u53cc\u537f\u91bf\u91b6\u5937n\u21bb4B@U\n~\u001b\u0014:y\u000f\tD\f\u0002\u001d_-]4;\u001f\u000f[:@{\u0007\u0005?_,\\s\u0012<H'D4-\u0005\u000bV'Ju\u001d\u0015[h!]\u000b:y\u000f\tU\u0000\u001d(N+Y\u001e\u8f17\u542b\u5383\u68e9\u6d5f\uff6118{n\u00064.\u0002\u0012Wnma\u0019\u001c\u0012Y/]q;\u001f\u000f\uff33";
                var4_3 = "\u000fR+|z\u001a\u0011\u001d_\u0019\u6545\u6583\u5719\u54274\u0019\u0019\u000fY&\t\u53cc\u537f\u91bf\u91b6\u5937n\u21bb4B@U\n~\u001b\u0014:y\u000f\tD\f\u0002\u001d_-]4;\u001f\u000f[:@{\u0007\u0005?_,\\s\u0012<H'D4-\u0005\u000bV'Ju\u001d\u0015[h!]\u000b:y\u000f\tU\u0000\u001d(N+Y\u001e\u8f17\u542b\u5383\u68e9\u6d5f\uff6118{n\u00064.\u0002\u0012Wnma\u0019\u001c\u0012Y/]q;\u001f\u000f\uff33".length();
                var1_4 = 9;
                var0_5 = -1;
lbl7:
                // 2 sources

                while (true) {
                    v0 = ++var0_5;
                    v1 = var2_2.substring(v0, v0 + var1_4);
                    v2 = -1;
                    break block20;
                    break;
                }
lbl12:
                // 1 sources

                while (true) {
                    var5[var3_1++] = v3.intern();
                    if ((var0_5 += var1_4) < var4_3) {
                        var1_4 = var2_2.charAt(var0_5);
                        ** continue;
                    }
                    var2_2 = ")U:H`\u0000\u001f\u0015|'Q\u000e h!]u\u001d\u0019\u0014T\b@l4P";
                    var4_3 = ")U:H`\u0000\u001f\u0015|'Q\u000e h!]u\u001d\u0019\u0014T\b@l4P".length();
                    var1_4 = 11;
                    var0_5 = -1;
lbl21:
                    // 2 sources

                    while (true) {
                        v4 = ++var0_5;
                        v1 = var2_2.substring(v4, v4 + var1_4);
                        v2 = 0;
                        break block20;
                        break;
                    }
                    break;
                }
lbl26:
                // 1 sources

                while (true) {
                    var5[var3_1++] = v3.intern();
                    if ((var0_5 += var1_4) < var4_3) {
                        var1_4 = var2_2.charAt(var0_5);
                        ** continue;
                    }
                    break block21;
                    break;
                }
            }
            v5 = v1.toCharArray();
            v6 = v5;
            v7 = v5.length;
            var6_6 = 0;
            if (true) ** GOTO lbl65
            do {
                v6 = v6;
                v8 = var6_6;
                v9 = v6[v8];
                switch (var6_6 % 7) {
                    case 0: {
                        v10 = 123;
                        break;
                    }
                    case 1: {
                        v10 = 58;
                        break;
                    }
                    case 2: {
                        v10 = 78;
                        break;
                    }
                    case 3: {
                        v10 = 41;
                        break;
                    }
                    case 4: {
                        v10 = 20;
                        break;
                    }
                    case 5: {
                        v10 = 105;
                        break;
                    }
                    default: {
                        v10 = 112;
                    }
                }
                v6[v8] = (char)(v9 ^ v10);
                ++var6_6;
lbl65:
                // 2 sources

                v7 = v7;
            } while (v7 > var6_6);
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
        S.c = var5;
        S.l = new double[]{0.1, 0.25};
        d.a("\u00c1", (boolean)false, (long)165112921136812519L) /* => dev.hixo.M.s.H.S.h */;
        try {
            var7_7 = d.a("$", Unsafe.class, (Object)S.c[0], (long)86589041439327632L) /* => java.lang.Class.getDeclaredField */;
            d.a("$", (Object)var7_7, (boolean)true, (long)139619988684594193L) /* => java.lang.reflect.Field.setAccessible */;
            d.a("\u00c1", (Unsafe)((Unsafe)d.a("$", (Object)var7_7, null, (long)69280199636988259L) /* => java.lang.reflect.Field.get */), (long)165049920955514037L) /* => dev.hixo.M.s.H.S.w */;
        }
        catch (Throwable var7_8) {
            d.a("\u00c1", null, (long)165049920955514037L) /* => dev.hixo.M.s.H.S.w */;
        }
    }
}

