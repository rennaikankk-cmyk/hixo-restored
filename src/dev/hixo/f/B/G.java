/*
 * RESTORED SOURCE — decompiled reconstruction, not the original files.
 * class: dev.hixo.f.B.G
 */

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2338
 *  net.minecraft.class_2350
 *  net.minecraft.class_243
 *  net.minecraft.class_310
 */
package dev.hixo.f.B;

import dev.hixo.M.d;
import dev.hixo.T.q.w;
import dev.hixo.f.B.Z;
import dev.hixo.f.V.C;
import dev.hixo.f.X.D;
import java.lang.invoke.CallSite;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_243;
import net.minecraft.class_310;

public class G {
    private static final class_310 j;
    private static final Random a;
    public static C A;
    public static C J;
    public static Z N;
    public static final w t;
    public static final List<D<C, Integer>> l;
    public static boolean O;
    private static final long[] b;
    private static final Integer[] c;

    public static void N() {
        if (d.a("z", (Object)d.a("\u00fd", (long)98915845104622382L) /* => dev.hixo.f.B.G.j */, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */ != null) {
            d.a("$", (Object)d.a("\u00fd", (long)63118704734673823L) /* => dev.hixo.f.B.G.t */, (boolean)false, (long)119028643722935968L) /* => dev.hixo.T.q.w.s */;
            d.a("$", (Object)d.a("$", (Object)d.a("\u00fd", (long)71498313283647962L) /* => dev.hixo.Hixo.INSTANCE */, (long)190854338929747379L) /* => dev.hixo.Hixo.getEventBus */, (Object)d.a("\u00fd", (long)63118704734673823L) /* => dev.hixo.f.B.G.t */, (long)177870116293240140L) /* => dev.hixo.T.V.T */;
            if (d.a("$", (Object)d.a("\u00fd", (long)188173144644423007L) /* => dev.hixo.f.B.G.l */, (long)184224858935663280L) /* => java.util.List.isEmpty */ != false) {
                d.a("\u00f9", null, (long)101822531805591236L) /* => dev.hixo.f.B.G.d */;
            }
            if (d.a("\u00fd", (long)184907067778625532L) /* => dev.hixo.f.B.G.A */ != null) {
                d.a("\u00c1", (C)new C((float)d.a("z", (Object)d.a("\u00fd", (long)184907067778625532L) /* => dev.hixo.f.B.G.A */, (long)164061588253527562L) /* => dev.hixo.f.V.C.l */, (float)d.a("z", (Object)d.a("\u00fd", (long)184907067778625532L) /* => dev.hixo.f.B.G.A */, (long)200440889690670743L) /* => dev.hixo.f.V.C.r */), (long)59487610411342956L) /* => dev.hixo.f.B.G.J */;
            }
            d.a("\u00c1", d.a("$", (Object)d.a("\u00fd", (long)63118704734673823L) /* => dev.hixo.f.B.G.t */, (long)123015943185770462L) /* => dev.hixo.T.q.w.I */ != false ? null : d.a("\u00f9", (Object)d.a("\u00fd", (long)188173144644423007L) /* => dev.hixo.f.B.G.l */, (long)200025987678364755L) /* => dev.hixo.f.B.G.Q */, (long)184907067778625532L) /* => dev.hixo.f.B.G.A */;
            d.a("$", (Object)d.a("\u00fd", (long)188173144644423007L) /* => dev.hixo.f.B.G.l */, (long)191130606908305482L) /* => java.util.List.clear */;
        }
    }

    private static C Q(List<D<C, Integer>> list) {
        if (d.a("$", list, (long)184224858935663280L) /* => java.util.List.isEmpty */ != false) {
            return null;
        }
        CallSite callSite = d.a("$", (Object)d.a("$", (Object)d.a("$", (Object)d.a("$", list, (long)189075779412081675L) /* => java.util.List.stream */, D::e, (long)75621739497191619L) /* => java.util.stream.Stream.mapToInt */, (long)173820450131944199L) /* => java.util.stream.IntStream.max */, (int)G.a(22058, 7486692323292572790L), (long)197597202114009141L) /* => java.util.OptionalInt.orElse */;
        ArrayList arrayList = new ArrayList();
        CallSite callSite2 = d.a("$", list, (long)113221006393852506L) /* => java.util.List.iterator */;
        while (d.a("$", (Object)callSite2, (long)175361412755674352L) /* => java.util.Iterator.hasNext */ != false) {
            D d2 = (D)((Object)d.a("$", (Object)callSite2, (long)64633749944946827L) /* => java.util.Iterator.next */);
            if (d.a("$", (Object)((Integer)((Object)d.a("$", (Object)d2, (long)152020731121097111L) /* => dev.hixo.f.X.D.e */)), (long)38093469531709351L) /* => java.lang.Integer.intValue */ != callSite || d.a("$", (Object)d2, (long)128056114350486218L) /* => dev.hixo.f.X.D.U */ == null) continue;
            d.a("$", arrayList, (Object)((C)((Object)d.a("$", (Object)d2, (long)128056114350486218L) /* => dev.hixo.f.X.D.U */)), (long)184435215000867819L) /* => java.util.List.add */;
        }
        if (d.a("$", arrayList, (long)184224858935663280L) /* => java.util.List.isEmpty */ != false) {
            return null;
        }
        return (C)((Object)d.a("$", arrayList, (int)d.a("$", (Object)d.a("\u00fd", (long)58597290302429917L) /* => dev.hixo.f.B.G.a */, (int)d.a("$", arrayList, (long)180194190084079702L) /* => java.util.List.size */, (long)53070103815470834L) /* => java.util.Random.nextInt */, (long)196824017790916210L) /* => java.util.List.get */);
    }

    public static boolean N(int n2) {
        CallSite callSite = d.a("$", (Object)d.a("$", (Object)d.a("$", (Object)d.a("$", (Object)d.a("\u00fd", (long)188173144644423007L) /* => dev.hixo.f.B.G.l */, (long)189075779412081675L) /* => java.util.List.stream */, D::e, (long)75621739497191619L) /* => java.util.stream.Stream.mapToInt */, (long)173820450131944199L) /* => java.util.stream.IntStream.max */, (int)G.a(2616, 6038034461495799909L), (long)197597202114009141L) /* => java.util.OptionalInt.orElse */;
        return n2 >= callSite;
    }

    public static void s(C c2, Z z2) {
        d.a("\u00c1", (C)c2, (long)184907067778625532L) /* => dev.hixo.f.B.G.A */;
        d.a("\u00c1", (Z)z2, (long)154829759029610739L) /* => dev.hixo.f.B.G.N */;
    }

    public static void K(C c2, int n2) {
        d.a("$", (Object)d.a("\u00fd", (long)188173144644423007L) /* => dev.hixo.f.B.G.l */, new D<C, CallSite>(c2, d.a("\u00f9", (int)n2, (long)67104637941965968L) /* => java.lang.Integer.valueOf */), (long)184435215000867819L) /* => java.util.List.add */;
    }

    public static void l(C c2, int n2, Z z2) {
        d.a("\u00f9", (Object)c2, (int)n2, (long)130149411444024795L) /* => dev.hixo.f.B.G.K */;
        d.a("\u00c1", (Z)z2, (long)154829759029610739L) /* => dev.hixo.f.B.G.N */;
    }

    public static void d(C c2) {
        d.a("\u00f9", (Object)c2, (int)d.a("$", (Object)d.a("\u00fd", (long)68699440481168515L) /* => dev.hixo.f.B.v.Lower */, (long)132898491188594704L) /* => dev.hixo.f.B.v.l */, (long)130149411444024795L) /* => dev.hixo.f.B.G.K */;
    }

    public static C w() {
        return d.a("\u00fd", (long)184907067778625532L) /* => dev.hixo.f.B.G.A */;
    }

    public static C x() {
        return d.a("\u00fd", (long)184907067778625532L) /* => dev.hixo.f.B.G.A */ != null ? d.a("\u00fd", (long)184907067778625532L) /* => dev.hixo.f.B.G.A */ : d.a("\u00f9", (long)64365235551934972L) /* => dev.hixo.f.B.G.V */;
    }

    public static C V() {
        if (d.a("z", (Object)d.a("\u00fd", (long)98915845104622382L) /* => dev.hixo.f.B.G.j */, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */ == null) {
            return new C(0.0f, 0.0f);
        }
        return new C((float)d.a("$", (Object)d.a("z", (Object)d.a("\u00fd", (long)98915845104622382L) /* => dev.hixo.f.B.G.j */, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (long)68578805942358681L) /* => net.minecraft.class_746.method_36454 */, (float)d.a("$", (Object)d.a("z", (Object)d.a("\u00fd", (long)98915845104622382L) /* => dev.hixo.f.B.G.j */, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (long)130683892682073266L) /* => net.minecraft.class_746.method_36455 */);
    }

    public static C C() {
        return d.a("\u00fd", (long)59487610411342956L) /* => dev.hixo.f.B.G.J */ != null ? d.a("\u00fd", (long)59487610411342956L) /* => dev.hixo.f.B.G.J */ : d.a("\u00f9", (long)64365235551934972L) /* => dev.hixo.f.B.G.V */;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static C M(class_2338 var0, class_2350 var1_1, float var2_2, float var3_3) {
        var5_4 = (double)d.a("$", (Object)var0, (long)146045060684696872L) /* => net.minecraft.class_2338.method_10263 */ + 0.5;
        var7_5 = (double)d.a("$", (Object)var0, (long)36264061574346644L) /* => net.minecraft.class_2338.method_10264 */ + 0.5;
        var4_6 = G.O;
        var9_7 = (double)d.a("$", (Object)var0, (long)141489615891003620L) /* => net.minecraft.class_2338.method_10260 */ + 0.5;
        if (var4_6) ** GOTO lbl9
        switch (d.a("\u00fd", (long)187297136663585428L) /* => dev.hixo.f.B.G$K.B */[d.a("$", (Object)var1_1, (long)88069147782046080L) /* => net.minecraft.class_2350.ordinal */]) {
            case 1: {
                var7_5 = (double)d.a("$", (Object)var0, (long)36264061574346644L) /* => net.minecraft.class_2338.method_10264 */ + 1.0;
lbl9:
                // 2 sources

                if (!var4_6) break;
                dev.hixo.M.G.L = dev.hixo.M.G.L == false;
            }
            case 2: {
                var7_5 = (double)d.a("$", (Object)var0, (long)36264061574346644L) /* => net.minecraft.class_2338.method_10264 */;
                if (!var4_6) break;
            }
            case 3: {
                var9_7 = (double)d.a("$", (Object)var0, (long)141489615891003620L) /* => net.minecraft.class_2338.method_10260 */;
                if (!var4_6) break;
            }
            case 4: {
                var9_7 = (double)d.a("$", (Object)var0, (long)141489615891003620L) /* => net.minecraft.class_2338.method_10260 */ + 1.0;
                if (!var4_6) break;
            }
            case 5: {
                var5_4 = (double)d.a("$", (Object)var0, (long)146045060684696872L) /* => net.minecraft.class_2338.method_10263 */;
                if (!var4_6) break;
            }
            case 6: {
                var5_4 = (double)d.a("$", (Object)var0, (long)146045060684696872L) /* => net.minecraft.class_2338.method_10263 */ + 1.0;
            }
        }
        var11_8 = new class_243(var5_4, var7_5, var9_7);
        var12_9 = d.a("$", (Object)d.a("z", (Object)d.a("\u00fd", (long)98915845104622382L) /* => dev.hixo.f.B.G.j */, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (long)88005680930564042L) /* => net.minecraft.class_746.method_33571 */;
        var13_10 = d.a("z", (Object)var11_8, (long)114883955804304604L) /* => net.minecraft.class_243.field_1352 */ - d.a("z", (Object)var12_9, (long)114883955804304604L) /* => net.minecraft.class_243.field_1352 */;
        var15_11 = d.a("z", (Object)var11_8, (long)47504908757591323L) /* => net.minecraft.class_243.field_1351 */ - d.a("z", (Object)var12_9, (long)47504908757591323L) /* => net.minecraft.class_243.field_1351 */;
        var17_12 = d.a("z", (Object)var11_8, (long)171340593239983317L) /* => net.minecraft.class_243.field_1350 */ - d.a("z", (Object)var12_9, (long)171340593239983317L) /* => net.minecraft.class_243.field_1350 */;
        var19_13 = (float)d.a("\u00f9", (double)d.a("\u00f9", (double)var17_12, (double)var13_10, (long)130928682319801467L) /* => java.lang.Math.atan2 */, (long)59882655678323470L) /* => java.lang.Math.toDegrees */ - 90.0f;
        var20_14 = (float)(-d.a("\u00f9", (double)d.a("\u00f9", (double)var15_11, (double)d.a("\u00f9", (double)(var13_10 * var13_10 + var17_12 * var17_12), (long)146319326606007315L) /* => java.lang.Math.sqrt */, (long)130928682319801467L) /* => java.lang.Math.atan2 */, (long)59882655678323470L) /* => java.lang.Math.toDegrees */);
        return new C(var19_13, var20_14);
    }

    public static float S(float f, float f2) {
        reference var2_2 = d.a("\u00f9", (float)(f - f2), (long)169602695659846515L) /* => net.minecraft.class_3532.method_15393 */;
        if (var2_2 < 0.0f) {
            var2_2 += 360.0f;
        }
        return (float)var2_2;
    }

    public static double s(float f, float f2) {
        return (double)d.a("\u00f9", (float)(f - f2), (long)169602695659846515L) /* => net.minecraft.class_3532.method_15393 */;
    }

    public static float E(float f, float f2, float f3) {
        Object object = d.a("\u00f9", (float)(f2 - f), (long)169602695659846515L) /* => net.minecraft.class_3532.method_15393 */;
        if (object > f3) {
            object = f3;
        }
        if (object < -f3) {
            object = -f3;
        }
        return f + object;
    }

    public static float F(float f, float f2) {
        if (f > f2) {
            f = f2;
        }
        if (f < -f2) {
            f = -f2;
        }
        return f;
    }

    public static C R(class_243 class_2432, class_243 class_2433, boolean bl) {
        reference var3_3 = d.a("z", (Object)class_2433, (long)114883955804304604L) /* => net.minecraft.class_243.field_1352 */ - d.a("z", (Object)class_2432, (long)114883955804304604L) /* => net.minecraft.class_243.field_1352 */;
        reference var5_4 = d.a("z", (Object)class_2433, (long)47504908757591323L) /* => net.minecraft.class_243.field_1351 */ - d.a("z", (Object)class_2432, (long)47504908757591323L) /* => net.minecraft.class_243.field_1351 */;
        reference var7_5 = d.a("z", (Object)class_2433, (long)171340593239983317L) /* => net.minecraft.class_243.field_1350 */ - d.a("z", (Object)class_2432, (long)171340593239983317L) /* => net.minecraft.class_243.field_1350 */;
        float f = (float)d.a("\u00f9", (double)d.a("\u00f9", (double)var7_5, (double)var3_3, (long)130928682319801467L) /* => java.lang.Math.atan2 */, (long)59882655678323470L) /* => java.lang.Math.toDegrees */ - 90.0f;
        float f2 = (float)(-d.a("\u00f9", (double)d.a("\u00f9", (double)var5_4, (double)d.a("\u00f9", (double)(var3_3 * var3_3 + var7_5 * var7_5), (long)146319326606007315L) /* => java.lang.Math.sqrt */, (long)130928682319801467L) /* => java.lang.Math.atan2 */, (long)59882655678323470L) /* => java.lang.Math.toDegrees */);
        return new C(f, f2);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l2 = 6145422183300391866L;
        long[] lArray = new long[2];
        int n2 = 0;
        String string = "7\u00e4\u0095;\u008e\u0013\u008f\u00cc\u008c\u00af\u00c3\u00a0\u00e5j\u00d3\u00df";
        int n3 = "7\u00e4\u0095;\u008e\u0013\u008f\u00cc\u008c\u00af\u00c3\u00a0\u00e5j\u00d3\u00df".length();
        int n4 = 0;
        do {
            byte[] byArray = string.substring(n4, n4 += 8).getBytes("ISO-8859-1");
            int n5 = n2++;
            lArray[n5] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l2;
        } while (n4 < n3);
        b = lArray;
        c = new Integer[2];
        j = d.a("\u00f9", (long)179869930689441125L) /* => net.minecraft.class_310.method_1551 */;
        a = new Random();
        d.a("\u00c1", (Z)((Object)d.a("\u00fd", (long)140877822102124790L) /* => dev.hixo.f.B.Z.Normal */), (long)154829759029610739L) /* => dev.hixo.f.B.G.N */;
        t = new w();
        l = new ArrayList<D<C, Integer>>();
    }

    private static int a(int n2, long l2) {
        int n3 = n2 ^ (int)(l2 & 0x7FFFL) ^ 0x3A5C;
        if (c[n3] == null) {
            G.c[n3] = (int)(b[n3] ^ l2);
        }
        return c[n3];
    }
}

