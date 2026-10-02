/*
 * RESTORED SOURCE — decompiled reconstruction, not the original files.
 * class: dev.hixo.M.s.S.a
 * identified as: Backtrack
 * context strings: 'getId' | 'Min Range' | 'Backtrack' | 'handle'
 */

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1657
 *  net.minecraft.class_2602
 *  net.minecraft.class_2684
 *  net.minecraft.class_2716
 *  net.minecraft.class_2777
 */
package dev.hixo.M.s.S;

import dev.hixo.M.G;
import dev.hixo.M.K;
import dev.hixo.M.d;
import dev.hixo.M.s.S.Y;
import dev.hixo.T.E;
import dev.hixo.b.M;
import dev.hixo.b.g;
import dev.hixo.t.q.p_0;
import java.lang.invoke.CallSite;
import java.util.concurrent.ConcurrentLinkedQueue;
import net.minecraft.class_1657;
import net.minecraft.class_2602;
import net.minecraft.class_2684;
import net.minecraft.class_2716;
import net.minecraft.class_2777;

public class a
extends G {
    public static a Z;
    public final M M;
    public final M Q;
    public final M l;
    public final g f;
    private final ConcurrentLinkedQueue<r> y;
    private class_1657 W;
    private boolean x;
    private static final String[] c;

    public a() {
        String[] stringArray = c;
        super((K)((Object)d.a("\u00fd", (long)169407094224467032L) /* => dev.hixo.M.K.COMBAT */), stringArray[3], stringArray[5]);
        this.M = new M(stringArray[2], 3.0, 1.0, 6.0, 0.1);
        this.Q = new M(stringArray[8], 6.0, 1.0, 6.0, 0.1);
        this.l = new M(stringArray[6], 200.0, 0.0, 1000.0, 10.0);
        this.f = new g(stringArray[7], true);
        this.y = new ConcurrentLinkedQueue();
        d.a("\u00c1", (a)this, (long)57423885543036744L) /* => dev.hixo.M.s.S.a.Z */;
        d.a("$", (Object)this, (int)0, (long)113806433936288059L) /* => dev.hixo.M.G.z */;
    }

    @Override
    public void I() {
        super.I();
        d.a("\u00e7", (Object)this, null, (long)153297887787170746L) /* => dev.hixo.M.s.S.a.W */;
        d.a("\u00e7", (Object)this, (boolean)false, (long)102277867777457156L) /* => dev.hixo.M.s.S.a.x */;
        d.a("$", (Object)d.a("z", (Object)this, (long)52012633994802055L) /* => dev.hixo.M.s.S.a.y */, (long)169234657527780854L) /* => java.util.concurrent.ConcurrentLinkedQueue.clear */;
    }

    @Override
    public void a() {
        super.a();
        d.a("\u00e7", (Object)this, null, (long)153297887787170746L) /* => dev.hixo.M.s.S.a.W */;
        d.a("$", (Object)this, (long)199939847585563701L) /* => dev.hixo.M.s.S.a.s */;
    }

    @E
    public void S(p_0 p_02) {
        if (d.a("$", (Object)d.a("$", (Object)p_02, (long)52512254813896748L) /* => dev.hixo.T.q.p.W */, (Object)d.a("\u00fd", (long)199476637466971905L) /* => dev.hixo.T.S.PRE */, (long)115634047609526502L) /* => dev.hixo.T.S.equals */ == false) {
            return;
        }
        if (d.a("z", (Object)d.a("\u00fd", (long)191291687252741418L) /* => dev.hixo.M.G.a */, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */ == null || d.a("z", (Object)d.a("\u00fd", (long)191291687252741418L) /* => dev.hixo.M.G.a */, (long)38197671011210569L) /* => net.minecraft.class_310.field_1687 */ == null) {
            d.a("\u00e7", (Object)this, null, (long)153297887787170746L) /* => dev.hixo.M.s.S.a.W */;
            d.a("$", (Object)this, (long)199939847585563701L) /* => dev.hixo.M.s.S.a.s */;
            return;
        }
        d.a("\u00e7", (Object)this, (class_1657)d.a("$", (Object)this, (long)50260711128580579L) /* => dev.hixo.M.s.S.a.q */, (long)153297887787170746L) /* => dev.hixo.M.s.S.a.W */;
        if (d.a("z", (Object)this, (long)153297887787170746L) /* => dev.hixo.M.s.S.a.W */ == null) {
            d.a("$", (Object)this, (long)199939847585563701L) /* => dev.hixo.M.s.S.a.s */;
            return;
        }
        double d2 = (double)d.a("$", (Object)d.a("z", (Object)d.a("\u00fd", (long)191291687252741418L) /* => dev.hixo.M.G.a */, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (Object)d.a("z", (Object)this, (long)153297887787170746L) /* => dev.hixo.M.s.S.a.W */, (long)167756919979340704L) /* => net.minecraft.class_746.method_5739 */;
        if (d2 < d.a("$", (Object)d.a("z", (Object)this, (long)138268375185981218L) /* => dev.hixo.M.s.S.a.M */, (long)86270808255001128L) /* => dev.hixo.b.M.J */ || d2 > d.a("$", (Object)d.a("z", (Object)this, (long)41792407712289420L) /* => dev.hixo.M.s.S.a.Q */, (long)86270808255001128L) /* => dev.hixo.b.M.J */) {
            d.a("$", (Object)this, (long)199939847585563701L) /* => dev.hixo.M.s.S.a.s */;
            return;
        }
        d.a("\u00e7", (Object)this, (boolean)true, (long)102277867777457156L) /* => dev.hixo.M.s.S.a.x */;
        d.a("$", (Object)this, (long)75526986160909986L) /* => dev.hixo.M.s.S.a.Z */;
    }

    private class_1657 q() {
        class_1657 class_16572;
        block8: {
            CallSite callSite;
            int n2;
            block11: {
                block12: {
                    block10: {
                        block9: {
                            n2 = Y.w;
                            callSite = d.a("\u00fd", (long)191291687252741418L) /* => dev.hixo.M.G.a */;
                            if (n2 != 0) break block9;
                            if (d.a("z", (Object)callSite, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */ == null) break block10;
                            callSite = d.a("\u00fd", (long)191291687252741418L) /* => dev.hixo.M.G.a */;
                        }
                        if (n2 != 0) break block11;
                        if (d.a("z", (Object)callSite, (long)38197671011210569L) /* => net.minecraft.class_310.field_1687 */ != null) break block12;
                    }
                    return null;
                }
                callSite = d.a("\u00fd", (long)191291687252741418L) /* => dev.hixo.M.G.a */;
            }
            CallSite callSite2 = d.a("$", (Object)d.a("z", (Object)callSite, (long)38197671011210569L) /* => net.minecraft.class_310.field_1687 */, (long)137187573870165505L) /* => net.minecraft.class_638.method_18456 */;
            class_1657 class_16573 = null;
            double d2 = Double.MAX_VALUE;
            CallSite callSite3 = d.a("$", (Object)callSite2, (long)113221006393852506L) /* => java.util.List.iterator */;
            while (d.a("$", (Object)callSite3, (long)175361412755674352L) /* => java.util.Iterator.hasNext */ != false) {
                block15: {
                    double d3;
                    class_1657 class_16574;
                    block14: {
                        Object object;
                        double d4;
                        block13: {
                            class_16572 = (class_1657)d.a("$", (Object)callSite3, (long)64633749944946827L) /* => java.util.Iterator.next */;
                            if (n2 != 0) break block8;
                            class_1657 class_16575 = class_16574 = class_16572;
                            if (n2 == 0) {
                                if (class_16575 == d.a("z", (Object)d.a("\u00fd", (long)191291687252741418L) /* => dev.hixo.M.G.a */, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */) continue;
                                class_16575 = class_16574;
                            }
                            if (d.a("$", (Object)class_16575, (long)168276210089764626L) /* => net.minecraft.class_1657.method_5805 */ == false) continue;
                            d3 = d4 = (double)d.a("$", (Object)d.a("z", (Object)d.a("\u00fd", (long)191291687252741418L) /* => dev.hixo.M.G.a */, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (Object)class_16574, (long)167756919979340704L) /* => net.minecraft.class_746.method_5739 */;
                            object = d.a("$", (Object)d.a("z", (Object)this, (long)41792407712289420L) /* => dev.hixo.M.s.S.a.Q */, (long)86270808255001128L) /* => dev.hixo.b.M.J */;
                            if (n2 != 0) break block13;
                            if (d3 > object) continue;
                            d3 = d4;
                            if (n2 != 0) break block14;
                            object = d2;
                        }
                        if (!(d3 < object)) break block15;
                        d3 = d4;
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

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean C(Object object) {
        if (d.a("$", (Object)this, (long)96089342888548907L) /* => dev.hixo.M.G.c */ == false) return false;
        if (d.a("z", (Object)this, (long)153297887787170746L) /* => dev.hixo.M.s.S.a.W */ == null) return false;
        if (d.a("z", (Object)this, (long)102277867777457156L) /* => dev.hixo.M.s.S.a.x */ == false) {
            return false;
        }
        try {
            CallSite callSite;
            int n2 = -1;
            if (object instanceof class_2684 || object instanceof class_2777) {
                callSite = d.a("$", (Object)this, (Object)object, (long)91791059914346980L) /* => dev.hixo.M.s.S.a.i */;
            } else if (object instanceof class_2716) {
                class_2716 class_27162 = (class_2716)object;
                if (d.a("$", (Object)d.a("$", (Object)class_27162, (long)172933966506622434L) /* => net.minecraft.class_2716.method_36548 */, (int)d.a("$", (Object)d.a("z", (Object)this, (long)153297887787170746L) /* => dev.hixo.M.s.S.a.W */, (long)98191165038202005L) /* => net.minecraft.class_1657.method_5628 */, (long)82966208933146796L) /* => it.unimi.dsi.fastutil.ints.IntList.contains */ == false) return false;
                d.a("\u00e7", (Object)this, null, (long)153297887787170746L) /* => dev.hixo.M.s.S.a.W */;
                d.a("$", (Object)this, (long)199939847585563701L) /* => dev.hixo.M.s.S.a.s */;
                return false;
            }
            if (callSite != d.a("$", (Object)d.a("z", (Object)this, (long)153297887787170746L) /* => dev.hixo.M.s.S.a.W */, (long)98191165038202005L) /* => net.minecraft.class_1657.method_5628 */) return false;
            d.a("$", (Object)d.a("z", (Object)this, (long)52012633994802055L) /* => dev.hixo.M.s.S.a.y */, (Object)new r(object), (long)36602647224533883L) /* => java.util.concurrent.ConcurrentLinkedQueue.add */;
            return true;
        }
        catch (Exception exception) {
            // empty catch block
        }
        return false;
    }

    private int i(Object object) {
        try {
            try {
                String[] stringArray = c;
                CallSite callSite = d.a("$", object.getClass(), (Object)stringArray[1], (Object)new Class[0], (long)196031613461188188L) /* => java.lang.Class.getMethod */;
                return (int)d.a("$", (Object)((Integer)((Object)d.a("$", (Object)callSite, (Object)object, (Object)new Object[0], (long)74984033819264995L) /* => java.lang.reflect.Method.invoke */)), (long)38093469531709351L) /* => java.lang.Integer.intValue */;
            }
            catch (NoSuchMethodException noSuchMethodException) {
                try {
                    CallSite callSite = d.a("$", object.getClass(), (Object)c[0], (Object)new Class[0], (long)196031613461188188L) /* => java.lang.Class.getMethod */;
                    return (int)d.a("$", (Object)((Integer)((Object)d.a("$", (Object)callSite, (Object)object, (Object)new Object[0], (long)74984033819264995L) /* => java.lang.reflect.Method.invoke */)), (long)38093469531709351L) /* => java.lang.Integer.intValue */;
                }
                catch (NoSuchMethodException noSuchMethodException2) {
                    for (CallSite callSite : d.a("$", object.getClass(), (long)148137054042197348L) /* => java.lang.Class.getDeclaredFields */) {
                        d.a("$", (Object)callSite, (boolean)true, (long)139619988684594193L) /* => java.lang.reflect.Field.setAccessible */;
                        if (d.a("$", (Object)callSite, (long)41971264004164462L) /* => java.lang.reflect.Field.getType */ != d.a("\u00fd", (long)94576327015742013L) /* => java.lang.Integer.TYPE */) continue;
                        return (int)d.a("$", (Object)callSite, (Object)object, (long)199292784682288803L) /* => java.lang.reflect.Field.getInt */;
                    }
                }
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
        return -1;
    }

    private void Z() {
        r r2;
        CallSite callSite = d.a("\u00f9", (long)171188797904017458L) /* => java.lang.System.currentTimeMillis */;
        long l2 = (long)d.a("$", (Object)d.a("z", (Object)this, (long)94017307735028857L) /* => dev.hixo.M.s.S.a.l */, (long)86270808255001128L) /* => dev.hixo.b.M.J */;
        while (d.a("$", (Object)d.a("z", (Object)this, (long)52012633994802055L) /* => dev.hixo.M.s.S.a.y */, (long)198185213629730296L) /* => java.util.concurrent.ConcurrentLinkedQueue.isEmpty */ == false && callSite - d.a("z", (Object)(r2 = (r)((Object)d.a("$", (Object)d.a("z", (Object)this, (long)52012633994802055L) /* => dev.hixo.M.s.S.a.y */, (long)142316552781344157L) /* => java.util.concurrent.ConcurrentLinkedQueue.peek */)), (long)110586260565019332L) /* => dev.hixo.M.s.S.a$r.M */ >= l2) {
            d.a("$", (Object)d.a("z", (Object)this, (long)52012633994802055L) /* => dev.hixo.M.s.S.a.y */, (long)123916111891130066L) /* => java.util.concurrent.ConcurrentLinkedQueue.poll */;
            d.a("$", (Object)this, (Object)d.a("z", (Object)r2, (long)176477238005205270L) /* => dev.hixo.M.s.S.a$r.U */, (long)198998871073919360L) /* => dev.hixo.M.s.S.a.A */;
        }
        if (d.a("$", (Object)d.a("z", (Object)this, (long)52012633994802055L) /* => dev.hixo.M.s.S.a.y */, (long)198185213629730296L) /* => java.util.concurrent.ConcurrentLinkedQueue.isEmpty */ != false) {
            d.a("\u00e7", (Object)this, (boolean)false, (long)102277867777457156L) /* => dev.hixo.M.s.S.a.x */;
        }
    }

    private void s() {
        d.a("\u00e7", (Object)this, (boolean)false, (long)102277867777457156L) /* => dev.hixo.M.s.S.a.x */;
        while (d.a("$", (Object)d.a("z", (Object)this, (long)52012633994802055L) /* => dev.hixo.M.s.S.a.y */, (long)198185213629730296L) /* => java.util.concurrent.ConcurrentLinkedQueue.isEmpty */ == false) {
            r r2 = (r)((Object)d.a("$", (Object)d.a("z", (Object)this, (long)52012633994802055L) /* => dev.hixo.M.s.S.a.y */, (long)123916111891130066L) /* => java.util.concurrent.ConcurrentLinkedQueue.poll */);
            d.a("$", (Object)this, (Object)d.a("z", (Object)r2, (long)176477238005205270L) /* => dev.hixo.M.s.S.a$r.U */, (long)198998871073919360L) /* => dev.hixo.M.s.S.a.A */;
        }
        d.a("$", (Object)d.a("z", (Object)this, (long)52012633994802055L) /* => dev.hixo.M.s.S.a.y */, (long)169234657527780854L) /* => java.util.concurrent.ConcurrentLinkedQueue.clear */;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void A(Object object) {
        if (d.a("z", (Object)d.a("\u00fd", (long)191291687252741418L) /* => dev.hixo.M.G.a */, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */ == null) return;
        if (d.a("z", (Object)d.a("z", (Object)d.a("\u00fd", (long)191291687252741418L) /* => dev.hixo.M.G.a */, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (long)200190009015651892L) /* => net.minecraft.class_746.field_3944 */ == null) {
            return;
        }
        try {
            try {
                String[] stringArray = c;
                CallSite callSite = d.a("$", object.getClass(), (Object)stringArray[9], (Object)new Class[]{class_2602.class}, (long)196031613461188188L) /* => java.lang.Class.getMethod */;
                d.a("$", (Object)callSite, (Object)object, (Object)new Object[]{d.a("z", (Object)d.a("z", (Object)d.a("\u00fd", (long)191291687252741418L) /* => dev.hixo.M.G.a */, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (long)200190009015651892L) /* => net.minecraft.class_746.field_3944 */}, (long)74984033819264995L) /* => java.lang.reflect.Method.invoke */;
                return;
            }
            catch (NoSuchMethodException noSuchMethodException) {
                try {
                    CallSite callSite = d.a("$", object.getClass(), (Object)c[4], (Object)new Class[]{class_2602.class}, (long)196031613461188188L) /* => java.lang.Class.getMethod */;
                    d.a("$", (Object)callSite, (Object)object, (Object)new Object[]{d.a("z", (Object)d.a("z", (Object)d.a("\u00fd", (long)191291687252741418L) /* => dev.hixo.M.G.a */, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (long)200190009015651892L) /* => net.minecraft.class_746.field_3944 */}, (long)74984033819264995L) /* => java.lang.reflect.Method.invoke */;
                    return;
                }
                catch (NoSuchMethodException noSuchMethodException2) {
                    return;
                }
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    public boolean O() {
        return d.a("z", (Object)this, (long)102277867777457156L) /* => dev.hixo.M.s.S.a.x */ != false && d.a("$", (Object)d.a("z", (Object)this, (long)52012633994802055L) /* => dev.hixo.M.s.S.a.y */, (long)198185213629730296L) /* => java.util.concurrent.ConcurrentLinkedQueue.isEmpty */ == false;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block19: {
            block18: {
                var5 = new String[10];
                var3_1 = 0;
                var2_2 = "M\r\u0005C\fPNu\ti\u0000J'Cm\u001cC\f\tf\bGle~\u0013G\u0002\u0006L\bJc}i\u0006\u56fa\u6ec6\u6568\u4ebd\u4f5c\u7f62\t`\fHfh$\u001fW@\u0006v\fJct~";
                var4_3 = "M\r\u0005C\fPNu\ti\u0000J'Cm\u001cC\f\tf\bGle~\u0013G\u0002\u0006L\bJc}i\u0006\u56fa\u6ec6\u6568\u4ebd\u4f5c\u7f62\t`\fHfh$\u001fW@\u0006v\fJct~".length();
                var1_4 = 2;
                var0_5 = -1;
lbl7:
                // 2 sources

                while (true) {
                    v0 = ++var0_5;
                    v1 = var2_2.substring(v0, v0 + var1_4);
                    v2 = -1;
                    break block18;
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
                    var2_2 = "i\b\\'Cm\u001cC\f\u0005E\u0019Tkh";
                    var4_3 = "i\b\\'Cm\u001cC\f\u0005E\u0019Tkh".length();
                    var1_4 = 9;
                    var0_5 = -1;
lbl21:
                    // 2 sources

                    while (true) {
                        v4 = ++var0_5;
                        v1 = var2_2.substring(v4, v4 + var1_4);
                        v2 = 0;
                        break block18;
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
                    break block19;
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
                        v10 = 36;
                        break;
                    }
                    case 1: {
                        v10 = 105;
                        break;
                    }
                    case 2: {
                        v10 = 36;
                        break;
                    }
                    case 3: {
                        v10 = 7;
                        break;
                    }
                    case 4: {
                        v10 = 17;
                        break;
                    }
                    case 5: {
                        v10 = 12;
                        break;
                    }
                    default: {
                        v10 = 114;
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
        dev.hixo.M.s.S.a.c = var5;
    }

    private static class r {
        final Object U;
        final long M;

        r(Object object) {
            this.U = object;
            int n2 = Y.w;
            this.M = (long)d.a("\u00f9", (long)171188797904017458L) /* => java.lang.System.currentTimeMillis */;
            if (n2 != 0) {
                G.L = !G.L;
            }
        }
    }
}

