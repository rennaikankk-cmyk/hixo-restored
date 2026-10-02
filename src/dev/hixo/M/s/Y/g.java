/*
 * RESTORED SOURCE — decompiled reconstruction, not the original files.
 * class: dev.hixo.M.s.Y.g
 * identified as: AutoClicker
 * context strings: '自动连点，可调节CPS' | 'AutoClicker'
 */

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_3965
 *  net.minecraft.class_3966
 */
package dev.hixo.M.s.Y;

import dev.hixo.M.G;
import dev.hixo.M.K;
import dev.hixo.M.d;
import dev.hixo.M.s.Y.e;
import dev.hixo.T.E;
import dev.hixo.t.q.p_0;
import java.lang.invoke.CallSite;
import java.util.Random;
import net.minecraft.class_3965;
import net.minecraft.class_3966;

public class g
extends G {
    public static g B;
    public static int k;
    public static int D;
    public static int M;
    public static int t;
    public static boolean J;
    public static boolean Y;
    public static boolean E;
    public static boolean u;
    public static boolean N;
    private long y;
    private long V;
    private final Random r;
    private static final String[] c;
    private static final long[] d;
    private static final Long[] e;

    public g() {
        String[] stringArray = c;
        super((K)((Object)dev.hixo.M.d.a("\u00fd", (long)121611970599608920L) /* => dev.hixo.M.K.PLAYER */), stringArray[1], stringArray[0]);
        dev.hixo.M.d.a("\u00e7", (Object)this, (long)0L, (long)104540823563172331L) /* => dev.hixo.M.s.Y.g.y */;
        dev.hixo.M.d.a("\u00e7", (Object)this, (long)0L, (long)127778564805542317L) /* => dev.hixo.M.s.Y.g.V */;
        this.r = new Random();
        dev.hixo.M.d.a("$", (Object)this, (int)0, (long)113806433936288059L) /* => dev.hixo.M.G.z */;
        dev.hixo.M.d.a("\u00c1", (g)this, (long)142579543479140399L) /* => dev.hixo.M.s.Y.g.B */;
    }

    @E
    public void x(p_0 p_02) {
        CallSite callSite;
        if (dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("$", (Object)p_02, (long)52512254813896748L) /* => dev.hixo.T.q.p.W */, (Object)dev.hixo.M.d.a("\u00fd", (long)199476637466971905L) /* => dev.hixo.T.S.PRE */, (long)115634047609526502L) /* => dev.hixo.T.S.equals */ == false) {
            return;
        }
        if (dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("\u00fd", (long)191291687252741418L) /* => dev.hixo.M.G.a */, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */ == null || dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("\u00fd", (long)191291687252741418L) /* => dev.hixo.M.G.a */, (long)99309607406877471L) /* => net.minecraft.class_310.field_1755 */ != null) {
            return;
        }
        CallSite callSite2 = dev.hixo.M.d.a("\u00f9", (long)171188797904017458L) /* => java.lang.System.currentTimeMillis */;
        if (dev.hixo.M.d.a("\u00fd", (long)108460216881140965L) /* => dev.hixo.M.s.Y.g.J */ != false) {
            callSite = dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("\u00fd", (long)191291687252741418L) /* => dev.hixo.M.G.a */, (long)129597241205579821L) /* => net.minecraft.class_310.field_1690 */, (long)165928742443091168L) /* => net.minecraft.class_315.field_1886 */, (long)91073722283869168L) /* => net.minecraft.class_304.method_1434 */;
            if ((dev.hixo.M.d.a("\u00fd", (long)70918005520630584L) /* => dev.hixo.M.s.Y.g.E */ == false || callSite != false) && dev.hixo.M.d.a("$", (Object)this, (long)callSite2, (long)dev.hixo.M.d.a("z", (Object)this, (long)104540823563172331L) /* => dev.hixo.M.s.Y.g.y */, (int)dev.hixo.M.d.a("\u00fd", (long)44125574098712651L) /* => dev.hixo.M.s.Y.g.k */, (int)dev.hixo.M.d.a("\u00fd", (long)171873494392767390L) /* => dev.hixo.M.s.Y.g.D */, (long)63792502280364143L) /* => dev.hixo.M.s.Y.g.m */ != false) {
                dev.hixo.M.d.a("$", (Object)this, (long)117514978649555019L) /* => dev.hixo.M.s.Y.g.W */;
                dev.hixo.M.d.a("\u00e7", (Object)this, (long)callSite2, (long)104540823563172331L) /* => dev.hixo.M.s.Y.g.y */;
            }
        }
        if (dev.hixo.M.d.a("\u00fd", (long)44070649200941632L) /* => dev.hixo.M.s.Y.g.Y */ != false) {
            callSite = dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("\u00fd", (long)191291687252741418L) /* => dev.hixo.M.G.a */, (long)129597241205579821L) /* => net.minecraft.class_310.field_1690 */, (long)127068279799713157L) /* => net.minecraft.class_315.field_1904 */, (long)91073722283869168L) /* => net.minecraft.class_304.method_1434 */;
            if ((dev.hixo.M.d.a("\u00fd", (long)70918005520630584L) /* => dev.hixo.M.s.Y.g.E */ == false || callSite != false) && dev.hixo.M.d.a("$", (Object)this, (long)callSite2, (long)dev.hixo.M.d.a("z", (Object)this, (long)127778564805542317L) /* => dev.hixo.M.s.Y.g.V */, (int)dev.hixo.M.d.a("\u00fd", (long)61956590892211150L) /* => dev.hixo.M.s.Y.g.M */, (int)dev.hixo.M.d.a("\u00fd", (long)95520986587290529L) /* => dev.hixo.M.s.Y.g.t */, (long)63792502280364143L) /* => dev.hixo.M.s.Y.g.m */ != false) {
                dev.hixo.M.d.a("$", (Object)this, (long)171386462533832801L) /* => dev.hixo.M.s.Y.g.B */;
                dev.hixo.M.d.a("\u00e7", (Object)this, (long)callSite2, (long)127778564805542317L) /* => dev.hixo.M.s.Y.g.V */;
            }
        }
    }

    private void W() {
        if (dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("\u00fd", (long)191291687252741418L) /* => dev.hixo.M.G.a */, (long)114640399921836459L) /* => net.minecraft.class_310.field_1765 */ != null) {
            switch (dev.hixo.M.d.a("\u00fd", (long)140965142992287970L) /* => dev.hixo.M.s.Y.g$u.c */[dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("\u00fd", (long)191291687252741418L) /* => dev.hixo.M.G.a */, (long)114640399921836459L) /* => net.minecraft.class_310.field_1765 */, (long)201641114949047391L) /* => net.minecraft.class_239.method_17783 */, (long)86763277162972468L) /* => net.minecraft.class_239$class_240.ordinal */]) {
                case 1: {
                    CallSite callSite = dev.hixo.M.d.a("$", (Object)((class_3966)dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("\u00fd", (long)191291687252741418L) /* => dev.hixo.M.G.a */, (long)114640399921836459L) /* => net.minecraft.class_310.field_1765 */), (long)53250421511039028L) /* => net.minecraft.class_3966.method_17782 */;
                    dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("\u00fd", (long)191291687252741418L) /* => dev.hixo.M.G.a */, (long)100087742506519171L) /* => net.minecraft.class_310.field_1761 */, (Object)dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("\u00fd", (long)191291687252741418L) /* => dev.hixo.M.G.a */, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (Object)callSite, (long)74844823550591302L) /* => net.minecraft.class_636.method_2918 */;
                    break;
                }
                case 2: {
                    class_3965 class_39652 = (class_3965)dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("\u00fd", (long)191291687252741418L) /* => dev.hixo.M.G.a */, (long)114640399921836459L) /* => net.minecraft.class_310.field_1765 */;
                    dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("\u00fd", (long)191291687252741418L) /* => dev.hixo.M.G.a */, (long)100087742506519171L) /* => net.minecraft.class_310.field_1761 */, (Object)dev.hixo.M.d.a("$", (Object)class_39652, (long)195314132873797734L) /* => net.minecraft.class_3965.method_17777 */, (Object)dev.hixo.M.d.a("$", (Object)class_39652, (long)101343188264919267L) /* => net.minecraft.class_3965.method_17780 */, (long)53867996719237092L) /* => net.minecraft.class_636.method_2910 */;
                }
            }
        }
        dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("\u00fd", (long)191291687252741418L) /* => dev.hixo.M.G.a */, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (Object)dev.hixo.M.d.a("\u00fd", (long)85943668217877665L) /* => net.minecraft.class_1268.field_5808 */, (long)83963391352857873L) /* => net.minecraft.class_746.method_6104 */;
    }

    private void B() {
        if (dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("\u00fd", (long)191291687252741418L) /* => dev.hixo.M.G.a */, (long)114640399921836459L) /* => net.minecraft.class_310.field_1765 */ != null && dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("\u00fd", (long)191291687252741418L) /* => dev.hixo.M.G.a */, (long)114640399921836459L) /* => net.minecraft.class_310.field_1765 */, (long)201641114949047391L) /* => net.minecraft.class_239.method_17783 */ == dev.hixo.M.d.a("\u00fd", (long)102835837837780328L) /* => net.minecraft.class_239$class_240.field_1332 */) {
            dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("\u00fd", (long)191291687252741418L) /* => dev.hixo.M.G.a */, (long)100087742506519171L) /* => net.minecraft.class_310.field_1761 */, (Object)dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("\u00fd", (long)191291687252741418L) /* => dev.hixo.M.G.a */, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (Object)dev.hixo.M.d.a("\u00fd", (long)85943668217877665L) /* => net.minecraft.class_1268.field_5808 */, (Object)((class_3965)dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("\u00fd", (long)191291687252741418L) /* => dev.hixo.M.G.a */, (long)114640399921836459L) /* => net.minecraft.class_310.field_1765 */), (long)105874227183593887L) /* => net.minecraft.class_636.method_2896 */;
        }
        dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("\u00fd", (long)191291687252741418L) /* => dev.hixo.M.G.a */, (long)100087742506519171L) /* => net.minecraft.class_310.field_1761 */, (Object)dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("\u00fd", (long)191291687252741418L) /* => dev.hixo.M.G.a */, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (Object)dev.hixo.M.d.a("\u00fd", (long)85943668217877665L) /* => net.minecraft.class_1268.field_5808 */, (long)88421954933898607L) /* => net.minecraft.class_636.method_2919 */;
        dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("\u00fd", (long)191291687252741418L) /* => dev.hixo.M.G.a */, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (Object)dev.hixo.M.d.a("\u00fd", (long)85943668217877665L) /* => net.minecraft.class_1268.field_5808 */, (long)83963391352857873L) /* => net.minecraft.class_746.method_6104 */;
    }

    private boolean m(long l2, long l3, int n2, int n3) {
        Object object;
        int n4;
        block10: {
            Object object2;
            block6: {
                block7: {
                    Object object3;
                    block8: {
                        block9: {
                            n4 = dev.hixo.M.s.Y.e.G;
                            object2 = dev.hixo.M.d.a("\u00fd", (long)46218784515922201L) /* => dev.hixo.M.s.Y.g.u */;
                            if (n4 != 0) break block6;
                            if (object2 == false) break block7;
                            object3 = dev.hixo.M.d.a("\u00fd", (long)117327314716853634L) /* => dev.hixo.M.s.Y.g.N */;
                            if (n4 != 0) break block8;
                            if (object3 == false) break block9;
                            double d2 = (double)n2 + dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)171487070105507800L) /* => dev.hixo.M.s.Y.g.r */, (long)58379670121163820L) /* => java.util.Random.nextDouble */ * (double)(n3 - n2);
                            reference var12_8 = dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)171487070105507800L) /* => dev.hixo.M.s.Y.g.r */, (long)37138789431181569L) /* => java.util.Random.nextGaussian */ * 1.5;
                            object = dev.hixo.M.d.a("\u00f9", (double)1.0, (double)(d2 + var12_8), (long)53777445532228911L) /* => java.lang.Math.max */;
                            if (n4 == 0) break block10;
                        }
                        object3 = n2;
                    }
                    object = (double)object3 + dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)171487070105507800L) /* => dev.hixo.M.s.Y.g.r */, (long)58379670121163820L) /* => java.util.Random.nextDouble */ * (double)(n3 - n2);
                    if (n4 == 0) break block10;
                }
                object2 = n2 + n3;
            }
            object = (double)object2 / 2.0;
        }
        long l4 = (long)(1000.0 / object);
        Object object4 = dev.hixo.M.d.a("\u00fd", (long)117327314716853634L) /* => dev.hixo.M.s.Y.g.N */;
        if (n4 == 0) {
            long l5;
            if (object4 != false) {
                Object object5 = (long)(dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)171487070105507800L) /* => dev.hixo.M.s.Y.g.r */, (long)37138789431181569L) /* => java.util.Random.nextGaussian */ * 15.0);
                object5 = dev.hixo.M.d.a("\u00f9", (long)g.a(14951, 2166961998053644970L), (long)dev.hixo.M.d.a("\u00f9", (long)g.a(18990, 7249856259621743329L), (long)object5, (long)76913770722234232L) /* => java.lang.Math.min */, (long)194262027966503823L) /* => java.lang.Math.max */;
                l4 += object5;
            }
            object4 = (l5 = l2 - l3 - dev.hixo.M.d.a("\u00f9", (long)g.a(13822, 1599661962413315376L), (long)l4, (long)194262027966503823L) /* => java.lang.Math.max */) == 0L ? 0 : (l5 < 0L ? -1 : 1);
        }
        if (n4 == 0) {
            object4 = object4 >= 0 ? (Object)true : (Object)false;
        }
        return (boolean)object4;
    }

    public void Z() {
        super.a();
        dev.hixo.M.d.a("\u00e7", (Object)this, (long)0L, (long)104540823563172331L) /* => dev.hixo.M.s.Y.g.y */;
        dev.hixo.M.d.a("\u00e7", (Object)this, (long)0L, (long)127778564805542317L) /* => dev.hixo.M.s.Y.g.V */;
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
                            var21 = new String[2];
                            var19_1 = 0;
                            var18_2 = "\u81c4\u52d2\u8fe2\u70ad\uff67\u53c4\u8c18\u82ac9lG\u000bo\u000fH{(GrM\u0011Yf";
                            var20_3 = "\u81c4\u52d2\u8fe2\u70ad\uff67\u53c4\u8c18\u82ac9lG\u000bo\u000fH{(GrM\u0011Yf".length();
                            var17_4 = 11;
                            var16_5 = -1;
lbl7:
                            // 2 sources

                            while (true) {
                                continue;
                                break;
                            }
lbl9:
                            // 1 sources

                            while (true) {
                                var21[var19_1++] = new String(v0).intern();
                                if ((var16_5 += var17_4) < var20_3) {
                                    var17_4 = var18_2.charAt(var16_5);
                                    ** continue;
                                }
                                break block21;
                                break;
                            }
                            v1 = ++var16_5;
                            v2 = var18_2.substring(v1, v1 + var17_4).toCharArray();
                            v0 = v2;
                            v3 = v2.length;
                            var22_6 = 0;
                            if (true) ** GOTO lbl48
                            do {
                                v0 = v0;
                                v4 = var22_6;
                                v5 = v0[v4];
                                switch (var22_6 % 7) {
                                    case 0: {
                                        v6 = 46;
                                        break;
                                    }
                                    case 1: {
                                        v6 = 122;
                                        break;
                                    }
                                    case 2: {
                                        v6 = 60;
                                        break;
                                    }
                                    case 3: {
                                        v6 = 20;
                                        break;
                                    }
                                    case 4: {
                                        v6 = 107;
                                        break;
                                    }
                                    case 5: {
                                        v6 = 43;
                                        break;
                                    }
                                    default: {
                                        v6 = 27;
                                    }
                                }
                                v0[v4] = (char)(v5 ^ v6);
                                ++var22_6;
lbl48:
                                // 2 sources

                                v3 = v3;
                            } while (v3 > var22_6);
                            ** while (true)
                        }
                        g.c = var21;
                        var9_7 = 8788943145131753935L;
                        var8_8 = new long[4];
                        var12_9 = 0;
                        var13_10 = "\u00bf\u00bd\u00deL\u0084\u00ae\u00c1\u00c3\u000ee5{\u0084\u00ae\u00c1\u00c7";
                        var14_11 = "\u00bf\u00bd\u00deL\u0084\u00ae\u00c1\u00c3\u000ee5{\u0084\u00ae\u00c1\u00c7".length();
                        var11_12 = 0;
                        while (true) {
                            var15_13 = var13_10.substring(var11_12, var11_12 += 8).getBytes("ISO-8859-1");
                            v7 = var8_8;
                            v8 = var12_9++;
                            v9 = ((long)var15_13[0] & 255L) << 56 | ((long)var15_13[1] & 255L) << 48 | ((long)var15_13[2] & 255L) << 40 | ((long)var15_13[3] & 255L) << 32 | ((long)var15_13[4] & 255L) << 24 | ((long)var15_13[5] & 255L) << 16 | ((long)var15_13[6] & 255L) << 8 | (long)var15_13[7] & 255L;
                            v10 = -1;
                            break block22;
                            break;
                        }
lbl68:
                        // 1 sources

                        while (true) {
                            v7[v8] = v11;
                            if (var11_12 < var14_11) ** continue;
                            var13_10 = "Kr\u00cao\u0084\u00ae\u00c1\u00c3\u00d7\u0006\u008ac\u0084\u00ae\u00c1\u00c7";
                            var14_11 = "Kr\u00cao\u0084\u00ae\u00c1\u00c3\u00d7\u0006\u008ac\u0084\u00ae\u00c1\u00c7".length();
                            var11_12 = 0;
                            while (true) {
                                var15_13 = var13_10.substring(var11_12, var11_12 += 8).getBytes("ISO-8859-1");
                                v7 = var8_8;
                                v8 = var12_9++;
                                v9 = ((long)var15_13[0] & 255L) << 56 | ((long)var15_13[1] & 255L) << 48 | ((long)var15_13[2] & 255L) << 40 | ((long)var15_13[3] & 255L) << 32 | ((long)var15_13[4] & 255L) << 24 | ((long)var15_13[5] & 255L) << 16 | ((long)var15_13[6] & 255L) << 8 | (long)var15_13[7] & 255L;
                                v10 = 0;
                                break block22;
                                break;
                            }
                            break;
                        }
lbl81:
                        // 1 sources

                        while (true) {
                            v7[v8] = v11;
                            if (var11_12 < var14_11) ** continue;
                            break block23;
                            break;
                        }
                    }
                    v11 = v9 ^ var9_7;
                    switch (v10) {
                        default: {
                            ** continue;
                        }
                        ** case 0:
lbl92:
                        // 1 sources

                        ** continue;
                    }
                }
                var0_14 = 4557499713435438027L;
                var6_15 = new long[3];
                var3_16 = 0;
                var4_17 = "[\u00a3\u00d4\f\u00e8&\u00e14)\fY\u00c3\u00ed\u001a\u001e\u00c9\u00de\u00d2\u001a\\\u0083~n\u0083";
                var5_18 = "[\u00a3\u00d4\f\u00e8&\u00e14)\fY\u00c3\u00ed\u001a\u001e\u00c9\u00de\u00d2\u001a\\\u0083~n\u0083".length();
                var2_19 = 0;
                while (true) {
                    break block24;
                    break;
                }
lbl102:
                // 1 sources

                while (true) {
                    var6_15[v12] = (((long)var7_20[0] & 255L) << 56 | ((long)var7_20[1] & 255L) << 48 | ((long)var7_20[2] & 255L) << 40 | ((long)var7_20[3] & 255L) << 32 | ((long)var7_20[4] & 255L) << 24 | ((long)var7_20[5] & 255L) << 16 | ((long)var7_20[6] & 255L) << 8 | (long)var7_20[7] & 255L) ^ var0_14;
                    if (var2_19 < var5_18) ** continue;
                    break block25;
                    break;
                }
            }
            var7_20 = var4_17.substring(var2_19, var2_19 += 8).getBytes("ISO-8859-1");
            v12 = var3_16++;
            ** while (true)
        }
        g.d = var6_15;
        g.e = new Long[3];
        dev.hixo.M.d.a("\u00c1", (int)((int)var8_8[3]), (long)44125574098712651L) /* => dev.hixo.M.s.Y.g.k */;
        dev.hixo.M.d.a("\u00c1", (int)((int)var8_8[0]), (long)171873494392767390L) /* => dev.hixo.M.s.Y.g.D */;
        dev.hixo.M.d.a("\u00c1", (int)((int)var8_8[1]), (long)61956590892211150L) /* => dev.hixo.M.s.Y.g.M */;
        dev.hixo.M.d.a("\u00c1", (int)((int)var8_8[2]), (long)95520986587290529L) /* => dev.hixo.M.s.Y.g.t */;
        dev.hixo.M.d.a("\u00c1", (boolean)true, (long)108460216881140965L) /* => dev.hixo.M.s.Y.g.J */;
        dev.hixo.M.d.a("\u00c1", (boolean)false, (long)44070649200941632L) /* => dev.hixo.M.s.Y.g.Y */;
        dev.hixo.M.d.a("\u00c1", (boolean)true, (long)70918005520630584L) /* => dev.hixo.M.s.Y.g.E */;
        dev.hixo.M.d.a("\u00c1", (boolean)true, (long)46218784515922201L) /* => dev.hixo.M.s.Y.g.u */;
        dev.hixo.M.d.a("\u00c1", (boolean)true, (long)117327314716853634L) /* => dev.hixo.M.s.Y.g.N */;
    }

    private static long a(int n2, long l2) {
        int n3 = (n2 ^ (int)l2 ^ 0x20CF) & Short.MAX_VALUE;
        if (e[n3] == null) {
            g.e[n3] = d[n3] ^ l2;
        }
        return e[n3];
    }
}

