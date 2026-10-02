/*
 * RESTORED SOURCE — decompiled reconstruction, not the original files.
 * class: dev.hixo.M.s.S.k_0
 * identified as: AntiKnockback
 * context strings: 'NoXZ' | 'Shield' | 'JumpReset' | 'AntiKnockback'
 */

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_243
 *  net.minecraft.class_2743
 */
package dev.hixo.m.s.s;

import dev.hixo.M.G;
import dev.hixo.M.K;
import dev.hixo.M.d;
import dev.hixo.M.s.S.Y;
import dev.hixo.T.E;
import dev.hixo.t.q.p_0;
import java.lang.invoke.CallSite;
import java.util.Random;
import net.minecraft.class_243;
import net.minecraft.class_2743;

/*
 * Renamed from dev.hixo.M.s.S.k
 */
public class k_0
extends G {
    public static k_0 O;
    public static int M;
    public static final String[] h;
    public static float f;
    public static float i;
    public static float t;
    public static boolean u;
    public static int P;
    public static int y;
    public static boolean x;
    public static boolean n;
    public static float v;
    public static int m;
    public static final String[] V;
    public static float W;
    public static boolean d;
    public static boolean q;
    public static float J;
    public static float R;
    public static float r;
    private long T;
    private boolean g;
    private final Random A;
    private int l;
    private boolean Q;
    private boolean N;
    private int S;
    private boolean e;
    private int c;
    private static final String[] k;
    private static final long[] p;
    private static final Integer[] s;
    private static final long w;

    public k_0() {
        String[] stringArray = k;
        super((K)((Object)dev.hixo.M.d.a("\u00fd", (long)169407094224467032L) /* => dev.hixo.M.K.COMBAT */), stringArray[3], stringArray[7]);
        dev.hixo.M.d.a("\u00e7", (Object)this, (long)0L, (long)83277939509221339L) /* => dev.hixo.M.s.S.k.T */;
        dev.hixo.M.d.a("\u00e7", (Object)this, (boolean)false, (long)68517633949934072L) /* => dev.hixo.M.s.S.k.g */;
        this.A = new Random();
        dev.hixo.M.d.a("\u00e7", (Object)this, (int)0, (long)57215671298548536L) /* => dev.hixo.M.s.S.k.l */;
        dev.hixo.M.d.a("\u00e7", (Object)this, (boolean)false, (long)46762501296249802L) /* => dev.hixo.M.s.S.k.Q */;
        dev.hixo.M.d.a("\u00e7", (Object)this, (boolean)false, (long)128140357997113289L) /* => dev.hixo.M.s.S.k.N */;
        dev.hixo.M.d.a("\u00e7", (Object)this, (int)-1, (long)42785371016204698L) /* => dev.hixo.M.s.S.k.S */;
        dev.hixo.M.d.a("\u00e7", (Object)this, (boolean)false, (long)32319254270065371L) /* => dev.hixo.M.s.S.k.e */;
        dev.hixo.M.d.a("\u00e7", (Object)this, (int)0, (long)182843301085989191L) /* => dev.hixo.M.s.S.k.c */;
        dev.hixo.M.d.a("$", (Object)this, (int)0, (long)113806433936288059L) /* => dev.hixo.M.G.z */;
        dev.hixo.M.d.a("\u00c1", (k_0)this, (long)86895315529002551L) /* => dev.hixo.M.s.S.k.O */;
    }

    @E
    public void L(p_0 p_02) {
        if (dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("$", (Object)p_02, (long)52512254813896748L) /* => dev.hixo.T.q.p.W */, (Object)dev.hixo.M.d.a("\u00fd", (long)199476637466971905L) /* => dev.hixo.T.S.PRE */, (long)115634047609526502L) /* => dev.hixo.T.S.equals */ == false) {
            return;
        }
        if (dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("\u00fd", (long)191291687252741418L) /* => dev.hixo.M.G.a */, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */ == null) {
            return;
        }
        if (dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("\u00fd", (long)191291687252741418L) /* => dev.hixo.M.G.a */, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (long)155889441742630934L) /* => net.minecraft.class_746.field_6235 */ > 0) {
            dev.hixo.M.d.a("\u00e7", (Object)this, (long)dev.hixo.M.d.a("\u00f9", (long)171188797904017458L) /* => java.lang.System.currentTimeMillis */, (long)83277939509221339L) /* => dev.hixo.M.s.S.k.T */;
        }
        if (dev.hixo.M.d.a("\u00fd", (long)202144354867551725L) /* => dev.hixo.M.s.S.k.M */ == 2) {
            dev.hixo.M.d.a("$", (Object)this, (long)66187506937115375L) /* => dev.hixo.M.s.S.k.j */;
        }
        if (dev.hixo.M.d.a("\u00fd", (long)202144354867551725L) /* => dev.hixo.M.s.S.k.M */ == 4) {
            dev.hixo.M.d.a("$", (Object)this, (long)85753904294869353L) /* => dev.hixo.M.s.S.k.v */;
        }
        if (dev.hixo.M.d.a("\u00fd", (long)181947588123366562L) /* => dev.hixo.M.s.S.k.x */ != false && dev.hixo.M.d.a("\u00fd", (long)202144354867551725L) /* => dev.hixo.M.s.S.k.M */ == 3) {
            dev.hixo.M.d.a("$", (Object)this, (long)197023034429950961L) /* => dev.hixo.M.s.S.k.r */;
        }
    }

    public void v(class_2743 class_27432) {
        if (dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("\u00fd", (long)191291687252741418L) /* => dev.hixo.M.G.a */, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */ == null || dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("\u00fd", (long)191291687252741418L) /* => dev.hixo.M.G.a */, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (long)200190009015651892L) /* => net.minecraft.class_746.field_3944 */ == null) {
            return;
        }
        if (dev.hixo.M.d.a("$", (Object)this, (Object)class_27432, (long)65108549155354757L) /* => dev.hixo.M.s.S.k.S */ != dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("\u00fd", (long)191291687252741418L) /* => dev.hixo.M.G.a */, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (long)49557901471620191L) /* => net.minecraft.class_746.method_5628 */) {
            return;
        }
        if (dev.hixo.M.d.a("\u00fd", (long)202144354867551725L) /* => dev.hixo.M.s.S.k.M */ == 4) {
            if (dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)120089322031119991L) /* => dev.hixo.M.s.S.k.A */, (long)171017999122652309L) /* => java.util.Random.nextFloat */ * 100.0f > dev.hixo.M.d.a("\u00fd", (long)137802360832649036L) /* => dev.hixo.M.s.S.k.W */) {
                return;
            }
            if (dev.hixo.M.d.a("\u00fd", (long)134273734332864806L) /* => dev.hixo.M.s.S.k.d */ != false && dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("\u00fd", (long)191291687252741418L) /* => dev.hixo.M.G.a */, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (long)175288240290473570L) /* => net.minecraft.class_746.method_24828 */ == false) {
                return;
            }
            if (dev.hixo.M.d.a("\u00fd", (long)170631921641852345L) /* => dev.hixo.M.s.S.k.q */ != false && dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("\u00fd", (long)191291687252741418L) /* => dev.hixo.M.G.a */, (long)129597241205579821L) /* => net.minecraft.class_310.field_1690 */, (long)67693188334162439L) /* => net.minecraft.class_315.field_1894 */, (long)91073722283869168L) /* => net.minecraft.class_304.method_1434 */ == false) {
                return;
            }
        }
        switch (dev.hixo.M.d.a("\u00fd", (long)202144354867551725L) /* => dev.hixo.M.s.S.k.M */) {
            case 0: {
                dev.hixo.M.d.a("$", (Object)this, (Object)class_27432, (long)155391502682819011L) /* => dev.hixo.M.s.S.k.g */;
                break;
            }
            case 1: {
                dev.hixo.M.d.a("$", (Object)this, (Object)class_27432, (long)161620254599818551L) /* => dev.hixo.M.s.S.k.M */;
                break;
            }
            case 2: {
                dev.hixo.M.d.a("$", (Object)this, (Object)class_27432, (long)189682994309530151L) /* => dev.hixo.M.s.S.k.y */;
                break;
            }
            case 3: {
                dev.hixo.M.d.a("$", (Object)this, (Object)class_27432, (long)125112636502843831L) /* => dev.hixo.M.s.S.k.x */;
                break;
            }
            case 4: {
                dev.hixo.M.d.a("$", (Object)this, (Object)class_27432, (long)107906601853036622L) /* => dev.hixo.M.s.S.k.Q */;
            }
        }
    }

    private int S(class_2743 class_27432) {
        try {
            for (CallSite callSite : dev.hixo.M.d.a("$", class_27432.getClass(), (long)148137054042197348L) /* => java.lang.Class.getDeclaredFields */) {
                dev.hixo.M.d.a("$", (Object)callSite, (boolean)true, (long)139619988684594193L) /* => java.lang.reflect.Field.setAccessible */;
                if (dev.hixo.M.d.a("$", (Object)callSite, (long)41971264004164462L) /* => java.lang.reflect.Field.getType */ != dev.hixo.M.d.a("\u00fd", (long)94576327015742013L) /* => java.lang.Integer.TYPE */) continue;
                return (int)dev.hixo.M.d.a("$", (Object)callSite, (Object)class_27432, (long)199292784682288803L) /* => java.lang.reflect.Field.getInt */;
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
        return -1;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private class_243 V(class_2743 class_27432) {
        try {
            CallSite callSite2222;
            for (CallSite callSite2222 : dev.hixo.M.d.a("$", class_27432.getClass(), (long)148137054042197348L) /* => java.lang.Class.getDeclaredFields */) {
                dev.hixo.M.d.a("$", (Object)callSite2222, (boolean)true, (long)139619988684594193L) /* => java.lang.reflect.Field.setAccessible */;
                if (dev.hixo.M.d.a("$", (Object)callSite2222, (long)41971264004164462L) /* => java.lang.reflect.Field.getType */ != class_243.class) continue;
                return (class_243)dev.hixo.M.d.a("$", (Object)callSite2222, (Object)class_27432, (long)69280199636988259L) /* => java.lang.reflect.Field.get */;
            }
            Object object3 = false;
            Object object2 = 0;
            Object object = 0;
            CallSite callSite = callSite2222 = dev.hixo.M.d.a("$", class_27432.getClass(), (long)148137054042197348L) /* => java.lang.Class.getDeclaredFields */;
            int n2 = ((CallSite)callSite).length;
            int n3 = 0;
            while (true) {
                if (n3 >= n2) {
                    if (object3) return new class_243((double)object3 / 8000.0, (double)object2 / 8000.0, (double)object / 8000.0);
                    if (object2 != 0) return new class_243((double)object3 / 8000.0, (double)object2 / 8000.0, (double)object / 8000.0);
                    if (object == 0) return dev.hixo.M.d.a("\u00fd", (long)70523582748142256L) /* => net.minecraft.class_243.field_1353 */;
                    return new class_243((double)object3 / 8000.0, (double)object2 / 8000.0, (double)object / 8000.0);
                }
                CallSite callSite3 = callSite[n3];
                dev.hixo.M.d.a("$", (Object)callSite3, (boolean)true, (long)139619988684594193L) /* => java.lang.reflect.Field.setAccessible */;
                CallSite callSite4 = dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("$", (Object)callSite3, (long)195904467410730364L) /* => java.lang.reflect.Field.getName */, (long)96946307116803295L) /* => java.lang.String.toLowerCase */;
                if (dev.hixo.M.d.a("$", (Object)callSite3, (long)41971264004164462L) /* => java.lang.reflect.Field.getType */ == dev.hixo.M.d.a("\u00fd", (long)94576327015742013L) /* => java.lang.Integer.TYPE */) {
                    if (dev.hixo.M.d.a("$", (Object)callSite4, (Object)"x", (long)172573425030479669L) /* => java.lang.String.contains */ != false) {
                        object3 = dev.hixo.M.d.a("$", (Object)callSite3, (Object)class_27432, (long)199292784682288803L) /* => java.lang.reflect.Field.getInt */;
                    } else if (dev.hixo.M.d.a("$", (Object)callSite4, (Object)"y", (long)172573425030479669L) /* => java.lang.String.contains */ != false) {
                        object2 = dev.hixo.M.d.a("$", (Object)callSite3, (Object)class_27432, (long)199292784682288803L) /* => java.lang.reflect.Field.getInt */;
                    } else if (dev.hixo.M.d.a("$", (Object)callSite4, (Object)"z", (long)172573425030479669L) /* => java.lang.String.contains */ != false) {
                        object = dev.hixo.M.d.a("$", (Object)callSite3, (Object)class_27432, (long)199292784682288803L) /* => java.lang.reflect.Field.getInt */;
                    }
                }
                ++n3;
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
        return dev.hixo.M.d.a("\u00fd", (long)70523582748142256L) /* => net.minecraft.class_243.field_1353 */;
    }

    private void g(class_2743 class_27432) {
        CallSite callSite = dev.hixo.M.d.a("\u00fd", (long)113754268155865614L) /* => dev.hixo.M.s.S.k.f */;
        CallSite callSite2 = dev.hixo.M.d.a("\u00fd", (long)125548611300406320L) /* => dev.hixo.M.s.S.k.i */;
        if (dev.hixo.M.d.a("\u00fd", (long)64839102230855481L) /* => dev.hixo.M.s.S.k.n */ != false && dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("\u00fd", (long)191291687252741418L) /* => dev.hixo.M.G.a */, (long)129597241205579821L) /* => net.minecraft.class_310.field_1690 */, (long)127068279799713157L) /* => net.minecraft.class_315.field_1904 */, (long)91073722283869168L) /* => net.minecraft.class_304.method_1434 */ != false) {
            callSite = dev.hixo.M.d.a("\u00f9", (float)(dev.hixo.M.d.a("\u00fd", (long)113754268155865614L) /* => dev.hixo.M.s.S.k.f */ + dev.hixo.M.d.a("\u00fd", (long)48117041307606930L) /* => dev.hixo.M.s.S.k.v */), (float)1.0f, (long)139533018482628456L) /* => java.lang.Math.min */;
            callSite2 = dev.hixo.M.d.a("\u00f9", (float)(dev.hixo.M.d.a("\u00fd", (long)125548611300406320L) /* => dev.hixo.M.s.S.k.i */ + dev.hixo.M.d.a("\u00fd", (long)48117041307606930L) /* => dev.hixo.M.s.S.k.v */), (float)1.0f, (long)139533018482628456L) /* => java.lang.Math.min */;
        }
        reference var4_4 = dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("$", (Object)this, (Object)class_27432, (long)109955571023286391L) /* => dev.hixo.M.s.S.k.V */, (long)114883955804304604L) /* => net.minecraft.class_243.field_1352 */ * (double)callSite;
        reference var6_5 = dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("$", (Object)this, (Object)class_27432, (long)109955571023286391L) /* => dev.hixo.M.s.S.k.V */, (long)47504908757591323L) /* => net.minecraft.class_243.field_1351 */ * (double)callSite2;
        reference var8_6 = dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("$", (Object)this, (Object)class_27432, (long)109955571023286391L) /* => dev.hixo.M.s.S.k.V */, (long)171340593239983317L) /* => net.minecraft.class_243.field_1350 */ * (double)callSite;
        dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("\u00fd", (long)191291687252741418L) /* => dev.hixo.M.G.a */, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (double)var4_4, (double)var6_5, (double)var8_6, (long)100027587322678724L) /* => net.minecraft.class_746.method_5750 */;
    }

    private void M(class_2743 class_27432) {
        CallSite callSite = dev.hixo.M.d.a("\u00fd", (long)125548611300406320L) /* => dev.hixo.M.s.S.k.i */;
        if (dev.hixo.M.d.a("\u00fd", (long)64839102230855481L) /* => dev.hixo.M.s.S.k.n */ != false && dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("\u00fd", (long)191291687252741418L) /* => dev.hixo.M.G.a */, (long)129597241205579821L) /* => net.minecraft.class_310.field_1690 */, (long)127068279799713157L) /* => net.minecraft.class_315.field_1904 */, (long)91073722283869168L) /* => net.minecraft.class_304.method_1434 */ != false) {
            callSite = dev.hixo.M.d.a("\u00f9", (float)(dev.hixo.M.d.a("\u00fd", (long)125548611300406320L) /* => dev.hixo.M.s.S.k.i */ + dev.hixo.M.d.a("\u00fd", (long)48117041307606930L) /* => dev.hixo.M.s.S.k.v */), (float)1.0f, (long)139533018482628456L) /* => java.lang.Math.min */;
        }
        reference var3_3 = dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("$", (Object)this, (Object)class_27432, (long)109955571023286391L) /* => dev.hixo.M.s.S.k.V */, (long)47504908757591323L) /* => net.minecraft.class_243.field_1351 */ * (double)callSite;
        dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("\u00fd", (long)191291687252741418L) /* => dev.hixo.M.G.a */, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (double)0.0, (double)var3_3, (double)0.0, (long)100027587322678724L) /* => net.minecraft.class_746.method_5750 */;
    }

    private void y(class_2743 class_27432) {
        CallSite callSite = dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("$", (Object)this, (Object)class_27432, (long)109955571023286391L) /* => dev.hixo.M.s.S.k.V */, (long)47504908757591323L) /* => net.minecraft.class_243.field_1351 */;
        dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("\u00fd", (long)191291687252741418L) /* => dev.hixo.M.G.a */, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (double)0.0, (double)callSite, (double)0.0, (long)100027587322678724L) /* => net.minecraft.class_746.method_5750 */;
        if (dev.hixo.M.d.a("z", (Object)this, (long)46762501296249802L) /* => dev.hixo.M.s.S.k.Q */ == false) {
            reference var4_3;
            reference v0 = var4_3 = dev.hixo.M.d.a("\u00fd", (long)93562061572480327L) /* => dev.hixo.M.s.S.k.u */ != false ? dev.hixo.M.d.a("\u00fd", (long)143191007492491062L) /* => dev.hixo.M.s.S.k.t */ / 100.0f * 0.92f : dev.hixo.M.d.a("\u00fd", (long)143191007492491062L) /* => dev.hixo.M.s.S.k.t */ / 100.0f;
            if (dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)120089322031119991L) /* => dev.hixo.M.s.S.k.A */, (long)171017999122652309L) /* => java.util.Random.nextFloat */ < var4_3) {
                dev.hixo.M.d.a("\u00e7", (Object)this, (boolean)true, (long)46762501296249802L) /* => dev.hixo.M.s.S.k.Q */;
                if (dev.hixo.M.d.a("\u00fd", (long)93562061572480327L) /* => dev.hixo.M.s.S.k.u */ != false) {
                    dev.hixo.M.d.a("\u00e7", (Object)this, (int)(dev.hixo.M.d.a("\u00fd", (long)95665695898903648L) /* => dev.hixo.M.s.S.k.P */ + dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)120089322031119991L) /* => dev.hixo.M.s.S.k.A */, (int)(dev.hixo.M.d.a("\u00fd", (long)122606980740321157L) /* => dev.hixo.M.s.S.k.y */ - dev.hixo.M.d.a("\u00fd", (long)95665695898903648L) /* => dev.hixo.M.s.S.k.P */ + true), (long)53070103815470834L) /* => java.util.Random.nextInt */), (long)57215671298548536L) /* => dev.hixo.M.s.S.k.l */;
                } else {
                    dev.hixo.M.d.a("\u00e7", (Object)this, (int)1, (long)57215671298548536L) /* => dev.hixo.M.s.S.k.l */;
                }
            }
        }
    }

    private void j() {
        if (dev.hixo.M.d.a("z", (Object)this, (long)46762501296249802L) /* => dev.hixo.M.s.S.k.Q */ == false) {
            return;
        }
        if (dev.hixo.M.d.a("z", (Object)this, (long)57215671298548536L) /* => dev.hixo.M.s.S.k.l */ > 0) {
            k_0 k_02 = this;
            dev.hixo.M.d.a("\u00e7", (Object)k_02, (int)(dev.hixo.M.d.a("z", (Object)k_02, (long)57215671298548536L) /* => dev.hixo.M.s.S.k.l */ - true), (long)57215671298548536L) /* => dev.hixo.M.s.S.k.l */;
            return;
        }
        if (dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("\u00fd", (long)191291687252741418L) /* => dev.hixo.M.G.a */, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (long)175288240290473570L) /* => net.minecraft.class_746.method_24828 */ != false) {
            double d2;
            if (dev.hixo.M.d.a("\u00fd", (long)93562061572480327L) /* => dev.hixo.M.s.S.k.u */ != false) {
                d2 = 0.4 + dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)120089322031119991L) /* => dev.hixo.M.s.S.k.A */, (long)58379670121163820L) /* => java.util.Random.nextDouble */ * 0.04;
                if (dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)120089322031119991L) /* => dev.hixo.M.s.S.k.A */, (long)171017999122652309L) /* => java.util.Random.nextFloat */ < 0.08f) {
                    dev.hixo.M.d.a("\u00e7", (Object)this, (boolean)false, (long)46762501296249802L) /* => dev.hixo.M.s.S.k.Q */;
                    return;
                }
            } else {
                d2 = 0.42;
            }
            dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("\u00fd", (long)191291687252741418L) /* => dev.hixo.M.G.a */, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (double)dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("\u00fd", (long)191291687252741418L) /* => dev.hixo.M.G.a */, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (long)84667892282276784L) /* => net.minecraft.class_746.method_18798 */, (long)114883955804304604L) /* => net.minecraft.class_243.field_1352 */, (double)d2, (double)dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("\u00fd", (long)191291687252741418L) /* => dev.hixo.M.G.a */, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (long)84667892282276784L) /* => net.minecraft.class_746.method_18798 */, (long)171340593239983317L) /* => net.minecraft.class_243.field_1350 */, (long)135514272950376820L) /* => net.minecraft.class_746.method_18800 */;
            dev.hixo.M.d.a("\u00e7", (Object)this, (boolean)false, (long)46762501296249802L) /* => dev.hixo.M.s.S.k.Q */;
        }
    }

    private void x(class_2743 class_27432) {
        CallSite callSite = dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("\u00fd", (long)191291687252741418L) /* => dev.hixo.M.G.a */, (long)129597241205579821L) /* => net.minecraft.class_310.field_1690 */, (long)127068279799713157L) /* => net.minecraft.class_315.field_1904 */, (long)91073722283869168L) /* => net.minecraft.class_304.method_1434 */;
        CallSite callSite2 = dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("\u00fd", (long)191291687252741418L) /* => dev.hixo.M.G.a */, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (Object)dev.hixo.M.d.a("\u00fd", (long)85943668217877665L) /* => net.minecraft.class_1268.field_5808 */, (long)159420538595008673L) /* => net.minecraft.class_746.method_5998 */;
        CallSite callSite3 = dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("\u00fd", (long)191291687252741418L) /* => dev.hixo.M.G.a */, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (Object)dev.hixo.M.d.a("\u00fd", (long)74280917607947214L) /* => net.minecraft.class_1268.field_5810 */, (long)159420538595008673L) /* => net.minecraft.class_746.method_5998 */;
        boolean bl = dev.hixo.M.d.a("$", (Object)callSite2, (long)89510314790192383L) /* => net.minecraft.class_1799.method_7909 */ == dev.hixo.M.d.a("\u00fd", (long)102479880874505575L) /* => net.minecraft.class_1802.field_8255 */ || dev.hixo.M.d.a("$", (Object)callSite3, (long)89510314790192383L) /* => net.minecraft.class_1799.method_7909 */ == dev.hixo.M.d.a("\u00fd", (long)102479880874505575L) /* => net.minecraft.class_1802.field_8255 */;
        CallSite callSite4 = dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("$", (Object)this, (Object)class_27432, (long)109955571023286391L) /* => dev.hixo.M.s.S.k.V */, (long)114883955804304604L) /* => net.minecraft.class_243.field_1352 */;
        CallSite callSite5 = dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("$", (Object)this, (Object)class_27432, (long)109955571023286391L) /* => dev.hixo.M.s.S.k.V */, (long)47504908757591323L) /* => net.minecraft.class_243.field_1351 */;
        CallSite callSite6 = dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("$", (Object)this, (Object)class_27432, (long)109955571023286391L) /* => dev.hixo.M.s.S.k.V */, (long)171340593239983317L) /* => net.minecraft.class_243.field_1350 */;
        if (callSite != false && bl) {
            dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("\u00fd", (long)191291687252741418L) /* => dev.hixo.M.G.a */, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (double)(callSite4 * (double)dev.hixo.M.d.a("\u00fd", (long)48117041307606930L) /* => dev.hixo.M.s.S.k.v */), (double)(callSite5 * (double)(dev.hixo.M.d.a("\u00fd", (long)48117041307606930L) /* => dev.hixo.M.s.S.k.v */ + 0.5f)), (double)(callSite6 * (double)dev.hixo.M.d.a("\u00fd", (long)48117041307606930L) /* => dev.hixo.M.s.S.k.v */), (long)100027587322678724L) /* => net.minecraft.class_746.method_5750 */;
        } else {
            dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("\u00fd", (long)191291687252741418L) /* => dev.hixo.M.G.a */, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (double)(callSite4 * (double)0.4f), (double)(callSite5 * (double)0.8f), (double)(callSite6 * (double)0.4f), (long)100027587322678724L) /* => net.minecraft.class_746.method_5750 */;
        }
    }

    private void Q(class_2743 class_27432) {
        reference v0;
        int n2;
        block12: {
            block10: {
                Object object;
                reference var21_12;
                Object object2;
                block11: {
                    CallSite callSite = dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("$", (Object)this, (Object)class_27432, (long)109955571023286391L) /* => dev.hixo.M.s.S.k.V */, (long)114883955804304604L) /* => net.minecraft.class_243.field_1352 */;
                    CallSite callSite2 = dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("$", (Object)this, (Object)class_27432, (long)109955571023286391L) /* => dev.hixo.M.s.S.k.V */, (long)47504908757591323L) /* => net.minecraft.class_243.field_1351 */;
                    CallSite callSite3 = dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("$", (Object)this, (Object)class_27432, (long)109955571023286391L) /* => dev.hixo.M.s.S.k.V */, (long)171340593239983317L) /* => net.minecraft.class_243.field_1350 */;
                    CallSite callSite4 = dev.hixo.M.d.a("\u00f9", (double)0.0, (double)dev.hixo.M.d.a("\u00f9", (double)1.0, (double)((double)dev.hixo.M.d.a("\u00fd", (long)154724593810065957L) /* => dev.hixo.M.s.S.k.J */), (long)195251025896564278L) /* => java.lang.Math.min */, (long)53777445532228911L) /* => java.lang.Math.max */;
                    CallSite callSite5 = dev.hixo.M.d.a("\u00f9", (double)0.0, (double)dev.hixo.M.d.a("\u00f9", (double)1.0, (double)((double)dev.hixo.M.d.a("\u00fd", (long)134371445931010506L) /* => dev.hixo.M.s.S.k.R */), (long)195251025896564278L) /* => java.lang.Math.min */, (long)53777445532228911L) /* => java.lang.Math.max */;
                    CallSite callSite6 = dev.hixo.M.d.a("\u00f9", (double)0.0, (double)((double)dev.hixo.M.d.a("\u00fd", (long)201203127544059657L) /* => dev.hixo.M.s.S.k.r */), (long)53777445532228911L) /* => java.lang.Math.max */;
                    reference var15_8 = (dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)120089322031119991L) /* => dev.hixo.M.s.S.k.A */, (long)58379670121163820L) /* => java.util.Random.nextDouble */ - 0.5) * 2.0 * callSite6;
                    reference var17_9 = (dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)120089322031119991L) /* => dev.hixo.M.s.S.k.A */, (long)58379670121163820L) /* => java.util.Random.nextDouble */ - 0.5) * 2.0 * callSite6;
                    n2 = Y.w;
                    object2 = callSite * (callSite4 + var15_8);
                    var21_12 = callSite2 * (callSite5 + var17_9);
                    object = callSite3 * (callSite4 + var15_8);
                    if (n2 != 0) break block10;
                    if (!(dev.hixo.M.d.a("\u00f9", (double)callSite, (long)184451009312960843L) /* => java.lang.Math.abs */ < 0.001)) break block11;
                    reference v0 = dev.hixo.M.d.a("\u00f9", (double)callSite3, (long)184451009312960843L) /* => java.lang.Math.abs */ - 0.001;
                    v0 = v0 == 0 ? 0 : (v0 < 0 ? -1 : 1);
                    if (n2 != 0) break block12;
                    if (v0 < 0) {
                        object2 = 0.0;
                        object = 0.0;
                    }
                }
                dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("\u00fd", (long)191291687252741418L) /* => dev.hixo.M.G.a */, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (double)object2, (double)var21_12, (double)object, (long)100027587322678724L) /* => net.minecraft.class_746.method_5750 */;
            }
            v0 = dev.hixo.M.d.a("\u00fd", (long)127202030612619980L) /* => dev.hixo.M.s.S.k.m */;
        }
        switch (v0) {
            case 0: {
                if (n2 == 0) break;
            }
            case 1: {
                CallSite callSite = dev.hixo.M.d.a("\u00fd", (long)191291687252741418L) /* => dev.hixo.M.G.a */;
                if (n2 == 0) {
                    if (dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)callSite, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (long)135886899496477481L) /* => net.minecraft.class_746.method_5624 */ == false) break;
                    callSite = dev.hixo.M.d.a("\u00fd", (long)191291687252741418L) /* => dev.hixo.M.G.a */;
                }
                dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)callSite, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (boolean)false, (long)121854460523286196L) /* => net.minecraft.class_746.method_5728 */;
                dev.hixo.M.d.a("\u00e7", (Object)this, (boolean)true, (long)128140357997113289L) /* => dev.hixo.M.s.S.k.N */;
                if (n2 == 0) break;
            }
            case 2: {
                dev.hixo.M.d.a("$", (Object)this, (long)84276831829239782L) /* => dev.hixo.M.s.S.k.Z */;
            }
        }
    }

    private void v() {
        if (dev.hixo.M.d.a("z", (Object)this, (long)42785371016204698L) /* => dev.hixo.M.s.S.k.S */ >= 0) {
            k_0 k_02 = this;
            dev.hixo.M.d.a("\u00e7", (Object)k_02, (int)(dev.hixo.M.d.a("z", (Object)k_02, (long)42785371016204698L) /* => dev.hixo.M.s.S.k.S */ + true), (long)42785371016204698L) /* => dev.hixo.M.s.S.k.S */;
            if (dev.hixo.M.d.a("z", (Object)this, (long)42785371016204698L) /* => dev.hixo.M.s.S.k.S */ > 10) {
                dev.hixo.M.d.a("\u00e7", (Object)this, (int)-1, (long)42785371016204698L) /* => dev.hixo.M.s.S.k.S */;
            }
        }
        if (dev.hixo.M.d.a("z", (Object)this, (long)128140357997113289L) /* => dev.hixo.M.s.S.k.N */ != false && dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("\u00fd", (long)191291687252741418L) /* => dev.hixo.M.G.a */, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */ != null && dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("\u00fd", (long)191291687252741418L) /* => dev.hixo.M.G.a */, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (long)155889441742630934L) /* => net.minecraft.class_746.field_6235 */ <= 0) {
            dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("\u00fd", (long)191291687252741418L) /* => dev.hixo.M.G.a */, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (boolean)false, (long)121854460523286196L) /* => net.minecraft.class_746.method_5728 */;
            dev.hixo.M.d.a("\u00e7", (Object)this, (boolean)false, (long)128140357997113289L) /* => dev.hixo.M.s.S.k.N */;
        }
        if (dev.hixo.M.d.a("z", (Object)this, (long)182843301085989191L) /* => dev.hixo.M.s.S.k.c */ > 0) {
            dev.hixo.M.d.a("$", (Object)this, (long)145959412572238127L) /* => dev.hixo.M.s.S.k.O */;
        }
    }

    private void O() {
        switch (dev.hixo.M.d.a("z", (Object)this, (long)182843301085989191L) /* => dev.hixo.M.s.S.k.c */) {
            case 1: {
                dev.hixo.M.d.a("\u00e7", (Object)this, (boolean)true, (long)32319254270065371L) /* => dev.hixo.M.s.S.k.e */;
                dev.hixo.M.d.a("\u00e7", (Object)this, (int)k_0.a(30214, 1651470841873225556L), (long)182843301085989191L) /* => dev.hixo.M.s.S.k.c */;
                break;
            }
            case 2: {
                dev.hixo.M.d.a("\u00e7", (Object)this, (boolean)false, (long)32319254270065371L) /* => dev.hixo.M.s.S.k.e */;
                dev.hixo.M.d.a("\u00e7", (Object)this, (int)k_0.a(14778, 7787559851802368235L), (long)182843301085989191L) /* => dev.hixo.M.s.S.k.c */;
                break;
            }
            case 3: {
                dev.hixo.M.d.a("\u00e7", (Object)this, (int)0, (long)182843301085989191L) /* => dev.hixo.M.s.S.k.c */;
            }
        }
    }

    private void Z() {
        dev.hixo.M.d.a("\u00e7", (Object)this, (int)1, (long)182843301085989191L) /* => dev.hixo.M.s.S.k.c */;
    }

    public boolean D() {
        return dev.hixo.M.d.a("\u00fd", (long)202144354867551725L) /* => dev.hixo.M.s.S.k.M */ == 4 && dev.hixo.M.d.a("\u00fd", (long)127202030612619980L) /* => dev.hixo.M.s.S.k.m */ == 2 && dev.hixo.M.d.a("z", (Object)this, (long)32319254270065371L) /* => dev.hixo.M.s.S.k.e */ != false;
    }

    private void r() {
        boolean bl;
        reference var1_1 = dev.hixo.M.d.a("\u00f9", (long)171188797904017458L) /* => java.lang.System.currentTimeMillis */ - dev.hixo.M.d.a("z", (Object)this, (long)83277939509221339L) /* => dev.hixo.M.s.S.k.T */;
        boolean bl2 = var1_1 < w;
        CallSite callSite = dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("\u00fd", (long)191291687252741418L) /* => dev.hixo.M.G.a */, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (Object)dev.hixo.M.d.a("\u00fd", (long)85943668217877665L) /* => net.minecraft.class_1268.field_5808 */, (long)159420538595008673L) /* => net.minecraft.class_746.method_5998 */;
        CallSite callSite2 = dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("\u00fd", (long)191291687252741418L) /* => dev.hixo.M.G.a */, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (Object)dev.hixo.M.d.a("\u00fd", (long)74280917607947214L) /* => net.minecraft.class_1268.field_5810 */, (long)159420538595008673L) /* => net.minecraft.class_746.method_5998 */;
        boolean bl3 = dev.hixo.M.d.a("$", (Object)callSite, (long)89510314790192383L) /* => net.minecraft.class_1799.method_7909 */ == dev.hixo.M.d.a("\u00fd", (long)102479880874505575L) /* => net.minecraft.class_1802.field_8255 */;
        boolean bl4 = bl = dev.hixo.M.d.a("$", (Object)callSite2, (long)89510314790192383L) /* => net.minecraft.class_1799.method_7909 */ == dev.hixo.M.d.a("\u00fd", (long)102479880874505575L) /* => net.minecraft.class_1802.field_8255 */;
        if (bl2 && !bl3 && !bl) {
            for (int i2 = 0; i2 < 9; ++i2) {
                CallSite callSite3 = dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("\u00fd", (long)191291687252741418L) /* => dev.hixo.M.G.a */, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (long)154188433605680654L) /* => net.minecraft.class_746.method_31548 */, (int)i2, (long)104584719520783793L) /* => net.minecraft.class_1661.method_5438 */;
                if (dev.hixo.M.d.a("$", (Object)callSite3, (long)89510314790192383L) /* => net.minecraft.class_1799.method_7909 */ != dev.hixo.M.d.a("\u00fd", (long)102479880874505575L) /* => net.minecraft.class_1802.field_8255 */) continue;
                dev.hixo.M.d.a("\u00e7", (Object)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("\u00fd", (long)191291687252741418L) /* => dev.hixo.M.G.a */, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (long)154188433605680654L) /* => net.minecraft.class_746.method_31548 */, (int)i2, (long)155518450009451424L) /* => net.minecraft.class_1661.field_7545 */;
                break;
            }
        }
        if (bl2 && (bl3 || bl)) {
            if (dev.hixo.M.d.a("z", (Object)this, (long)68517633949934072L) /* => dev.hixo.M.s.S.k.g */ == false) {
                dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("\u00fd", (long)191291687252741418L) /* => dev.hixo.M.G.a */, (long)129597241205579821L) /* => net.minecraft.class_310.field_1690 */, (long)127068279799713157L) /* => net.minecraft.class_315.field_1904 */, (boolean)true, (long)66388162404330922L) /* => net.minecraft.class_304.method_23481 */;
                dev.hixo.M.d.a("\u00e7", (Object)this, (boolean)true, (long)68517633949934072L) /* => dev.hixo.M.s.S.k.g */;
            }
        } else if (dev.hixo.M.d.a("z", (Object)this, (long)68517633949934072L) /* => dev.hixo.M.s.S.k.g */ != false) {
            dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("\u00fd", (long)191291687252741418L) /* => dev.hixo.M.G.a */, (long)129597241205579821L) /* => net.minecraft.class_310.field_1690 */, (long)127068279799713157L) /* => net.minecraft.class_315.field_1904 */, (boolean)false, (long)66388162404330922L) /* => net.minecraft.class_304.method_23481 */;
            dev.hixo.M.d.a("\u00e7", (Object)this, (boolean)false, (long)68517633949934072L) /* => dev.hixo.M.s.S.k.g */;
        }
    }

    @Override
    public void a() {
        super.a();
        if (dev.hixo.M.d.a("\u00fd", (long)191291687252741418L) /* => dev.hixo.M.G.a */ != null && dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("\u00fd", (long)191291687252741418L) /* => dev.hixo.M.G.a */, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */ != null) {
            dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("\u00fd", (long)191291687252741418L) /* => dev.hixo.M.G.a */, (long)129597241205579821L) /* => net.minecraft.class_310.field_1690 */, (long)127068279799713157L) /* => net.minecraft.class_315.field_1904 */, (boolean)false, (long)66388162404330922L) /* => net.minecraft.class_304.method_23481 */;
        }
        dev.hixo.M.d.a("\u00e7", (Object)this, (boolean)false, (long)68517633949934072L) /* => dev.hixo.M.s.S.k.g */;
        dev.hixo.M.d.a("\u00e7", (Object)this, (boolean)false, (long)128140357997113289L) /* => dev.hixo.M.s.S.k.N */;
        dev.hixo.M.d.a("\u00e7", (Object)this, (int)-1, (long)42785371016204698L) /* => dev.hixo.M.s.S.k.S */;
        dev.hixo.M.d.a("\u00e7", (Object)this, (boolean)false, (long)32319254270065371L) /* => dev.hixo.M.s.S.k.e */;
        dev.hixo.M.d.a("\u00e7", (Object)this, (int)0, (long)182843301085989191L) /* => dev.hixo.M.s.S.k.c */;
        dev.hixo.M.d.a("\u00e7", (Object)this, (boolean)false, (long)46762501296249802L) /* => dev.hixo.M.s.S.k.Q */;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block25: {
            block24: {
                block23: {
                    block22: {
                        block21: {
                            var15 = new String[10];
                            var13_1 = 0;
                            var12_2 = "['W=\u0006F f\u0002Bc\t_=b\u0017|b\u0006p<\rT&{\u000eei\u001av#m\u0006Ml\u0007G-k\u0012Mb\u0011\fF8}\u000e@sUG-|\u0002Z\u0005Be[\u0006^\r\u9627\u51b3\u900f\uff6b\u51e1\u5c16\u88de\u652e\u51b3\u5401\u76e3\u4f63\u79fc";
                            var14_3 = "['W=\u0006F f\u0002Bc\t_=b\u0017|b\u0006p<\rT&{\u000eei\u001av#m\u0006Ml\u0007G-k\u0012Mb\u0011\fF8}\u000e@sUG-|\u0002Z\u0005Be[\u0006^\r\u9627\u51b3\u900f\uff6b\u51e1\u5c16\u88de\u652e\u51b3\u5401\u76e3\u4f63\u79fc".length();
                            var11_4 = 4;
                            var10_5 = -1;
lbl7:
                            // 2 sources

                            while (true) {
                                v0 = ++var10_5;
                                v1 = var12_2.substring(v0, v0 + var11_4);
                                v2 = -1;
                                break block21;
                                break;
                            }
lbl12:
                            // 1 sources

                            while (true) {
                                var15[var13_1++] = v3.intern();
                                if ((var10_5 += var11_4) < var14_3) {
                                    var11_4 = var12_2.charAt(var10_5);
                                    ** continue;
                                }
                                var12_2 = "R:f\n\u0007C)a\u000eBk\u0014";
                                var14_3 = "R:f\n\u0007C)a\u000eBk\u0014".length();
                                var11_4 = 4;
                                var10_5 = -1;
lbl21:
                                // 2 sources

                                while (true) {
                                    v4 = ++var10_5;
                                    v1 = var12_2.substring(v4, v4 + var11_4);
                                    v2 = 0;
                                    break block21;
                                    break;
                                }
                                break;
                            }
lbl26:
                            // 1 sources

                            while (true) {
                                var15[var13_1++] = v3.intern();
                                if ((var10_5 += var11_4) < var14_3) {
                                    var11_4 = var12_2.charAt(var10_5);
                                    ** continue;
                                }
                                break block22;
                                break;
                            }
                        }
                        v5 = v1.toCharArray();
                        v6 = v5;
                        v7 = v5.length;
                        var16_7 = 0;
                        if (true) ** GOTO lbl65
                        do {
                            v6 = v6;
                            v8 = var16_7;
                            v9 = v6[v8];
                            switch (var16_7 % 7) {
                                case 0: {
                                    v10 = 21;
                                    break;
                                }
                                case 1: {
                                    v10 = 72;
                                    break;
                                }
                                case 2: {
                                    v10 = 15;
                                    break;
                                }
                                case 3: {
                                    v10 = 103;
                                    break;
                                }
                                case 4: {
                                    v10 = 46;
                                    break;
                                }
                                case 5: {
                                    v10 = 7;
                                    break;
                                }
                                default: {
                                    v10 = 117;
                                }
                            }
                            v6[v8] = (char)(v9 ^ v10);
                            ++var16_7;
lbl65:
                            // 2 sources

                            v7 = v7;
                        } while (v7 > var16_7);
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
                    k_0.k = var15;
                    var2_8 = 5874118856699604686L;
                    var8_9 = new long[3];
                    var5_10 = 0;
                    var6_11 = "0\u00dd\u0080\u0003\u001d\u009a\u0085\u00ed\u0081C\u00ccO\u0087\u00c6\u00f6&U>m\u00aeX\u00c49\u0098";
                    var7_12 = "0\u00dd\u0080\u0003\u001d\u009a\u0085\u00ed\u0081C\u00ccO\u0087\u00c6\u00f6&U>m\u00aeX\u00c49\u0098".length();
                    var4_13 = 0;
                    while (true) {
                        break block23;
                        break;
                    }
lbl84:
                    // 1 sources

                    while (true) {
                        var8_9[v11] = (((long)var9_14[0] & 255L) << 56 | ((long)var9_14[1] & 255L) << 48 | ((long)var9_14[2] & 255L) << 40 | ((long)var9_14[3] & 255L) << 32 | ((long)var9_14[4] & 255L) << 24 | ((long)var9_14[5] & 255L) << 16 | ((long)var9_14[6] & 255L) << 8 | (long)var9_14[7] & 255L) ^ var2_8;
                        if (var4_13 < var7_12) ** continue;
                        break block24;
                        break;
                    }
                }
                var9_14 = var6_11.substring(var4_13, var4_13 += 8).getBytes("ISO-8859-1");
                v11 = var5_10++;
                ** while (true)
            }
            k_0.p = var8_9;
            k_0.s = new Integer[3];
            break block25;
lbl99:
            // 1 sources

            while (true) {
                continue;
                break;
            }
        }
        var0_15 = 2877844690666700448L;
        ** while (true)
        k_0.w = 2877844690666699120L ^ var0_15;
        dev.hixo.M.d.a("\u00c1", (int)0, (long)202144354867551725L) /* => dev.hixo.M.s.S.k.M */;
        v12 = new String[5];
        var10_6 = k_0.k;
        v12[0] = var10_6[9];
        v12[1] = var10_6[0];
        v12[2] = var10_6[2];
        v12[3] = var10_6[1];
        v12[4] = var10_6[8];
        k_0.h = v12;
        dev.hixo.M.d.a("\u00c1", (float)0.0f, (long)113754268155865614L) /* => dev.hixo.M.s.S.k.f */;
        dev.hixo.M.d.a("\u00c1", (float)1.0f, (long)125548611300406320L) /* => dev.hixo.M.s.S.k.i */;
        dev.hixo.M.d.a("\u00c1", (float)100.0f, (long)143191007492491062L) /* => dev.hixo.M.s.S.k.t */;
        dev.hixo.M.d.a("\u00c1", (boolean)true, (long)93562061572480327L) /* => dev.hixo.M.s.S.k.u */;
        dev.hixo.M.d.a("\u00c1", (int)1, (long)95665695898903648L) /* => dev.hixo.M.s.S.k.P */;
        dev.hixo.M.d.a("\u00c1", (int)k_0.a(19056, 2845752186776480544L), (long)122606980740321157L) /* => dev.hixo.M.s.S.k.y */;
        dev.hixo.M.d.a("\u00c1", (boolean)false, (long)181947588123366562L) /* => dev.hixo.M.s.S.k.x */;
        dev.hixo.M.d.a("\u00c1", (boolean)true, (long)64839102230855481L) /* => dev.hixo.M.s.S.k.n */;
        dev.hixo.M.d.a("\u00c1", (float)0.2f, (long)48117041307606930L) /* => dev.hixo.M.s.S.k.v */;
        dev.hixo.M.d.a("\u00c1", (int)0, (long)127202030612619980L) /* => dev.hixo.M.s.S.k.m */;
        k_0.V = new String[]{var10_6[4], var10_6[5], var10_6[6]};
        dev.hixo.M.d.a("\u00c1", (float)100.0f, (long)137802360832649036L) /* => dev.hixo.M.s.S.k.W */;
        dev.hixo.M.d.a("\u00c1", (boolean)true, (long)134273734332864806L) /* => dev.hixo.M.s.S.k.d */;
        dev.hixo.M.d.a("\u00c1", (boolean)true, (long)170631921641852345L) /* => dev.hixo.M.s.S.k.q */;
        dev.hixo.M.d.a("\u00c1", (float)0.08f, (long)154724593810065957L) /* => dev.hixo.M.s.S.k.J */;
        dev.hixo.M.d.a("\u00c1", (float)0.15f, (long)134371445931010506L) /* => dev.hixo.M.s.S.k.R */;
        dev.hixo.M.d.a("\u00c1", (float)0.02f, (long)201203127544059657L) /* => dev.hixo.M.s.S.k.r */;
    }

    private static int a(int n2, long l2) {
        int n3 = n2 ^ (int)(l2 & 0x7FFFL) ^ 0x2150;
        if (s[n3] == null) {
            k_0.s[n3] = (int)(p[n3] ^ l2);
        }
        return s[n3];
    }
}

