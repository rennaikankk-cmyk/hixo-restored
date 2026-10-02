/*
 * RESTORED SOURCE — decompiled reconstruction, not the original files.
 * class: dev.hixo.D.a
 * context strings: '[hixo] frame gap: {} ms' | ' 已关闭' | ' 已启用'
 */

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_310
 *  net.minecraft.class_332
 *  net.minecraft.class_9779
 */
package dev.hixo.D;

import dev.hixo.D.t;
import dev.hixo.M.d;
import dev.hixo.T.q.X;
import java.lang.invoke.CallSite;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.class_310;
import net.minecraft.class_332;
import net.minecraft.class_9779;

public class a {
    private static final int P;
    private final class_310 r = dev.hixo.M.d.a("\u00f9", (long)179869930689441125L) /* => net.minecraft.class_310.method_1551 */;
    private final List<t> t = new ArrayList<t>();
    private static long e;
    public static boolean E;
    private static final String[] a;
    private static final long[] b;
    private static final Integer[] c;
    private static final long[] d;
    private static final Long[] f;

    public void F() {
        dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("\u00fd", (long)134965225121615627L) /* => net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback.EVENT */, this::h, (long)90971067691639174L) /* => net.fabricmc.fabric.api.event.Event.register */;
    }

    public void h(String string, int n2) {
        dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)194048358077563181L) /* => dev.hixo.D.a.t */, (Object)new t(string, n2), (long)184435215000867819L) /* => java.util.List.add */;
    }

    public void U(String string, boolean bl) {
        String string2;
        CallSite callSite = dev.hixo.M.d.a("z", (Object)this, (long)194048358077563181L) /* => dev.hixo.D.a.t */;
        CallSite callSite2 = dev.hixo.M.d.a("$", (Object)new StringBuilder(), (Object)string, (long)86542515882976328L) /* => java.lang.StringBuilder.append */;
        if (bl) {
            String[] stringArray = a;
            string2 = stringArray[2];
        } else {
            string2 = a[1];
        }
        dev.hixo.M.d.a("$", (Object)callSite, (Object)new t((String)((Object)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("$", (Object)callSite2, (Object)string2, (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (long)59411206276622891L) /* => java.lang.StringBuilder.toString */), bl ? dev.hixo.D.a.a(18603, 3457600244575370600L) : dev.hixo.D.a.a(12953, 160326701967607640L), string, bl), (long)184435215000867819L) /* => java.util.List.add */;
    }

    public t h() {
        CallSite callSite = dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)194048358077563181L) /* => dev.hixo.D.a.t */, (long)113221006393852506L) /* => java.util.List.iterator */;
        while (dev.hixo.M.d.a("$", (Object)callSite, (long)175361412755674352L) /* => java.util.Iterator.hasNext */ != false) {
            t t2 = (t)((Object)dev.hixo.M.d.a("$", (Object)callSite, (long)64633749944946827L) /* => java.util.Iterator.next */);
            if (dev.hixo.M.d.a("$", (Object)t2, (long)137406913450094414L) /* => dev.hixo.D.t.E */ != false) continue;
            return t2;
        }
        return null;
    }

    public int V() {
        int n2 = 0;
        CallSite callSite = dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)194048358077563181L) /* => dev.hixo.D.a.t */, (long)113221006393852506L) /* => java.util.List.iterator */;
        while (dev.hixo.M.d.a("$", (Object)callSite, (long)175361412755674352L) /* => java.util.Iterator.hasNext */ != false) {
            t t2 = (t)((Object)dev.hixo.M.d.a("$", (Object)callSite, (long)64633749944946827L) /* => java.util.Iterator.next */);
            if (dev.hixo.M.d.a("$", (Object)t2, (long)137406913450094414L) /* => dev.hixo.D.t.E */ != false) continue;
            ++n2;
        }
        return n2;
    }

    private void h(class_332 class_3322, class_9779 class_97792) {
        boolean bl;
        reference var5_4;
        CallSite callSite = dev.hixo.M.d.a("\u00f9", (long)78882375305248292L) /* => java.lang.System.nanoTime */;
        if (dev.hixo.M.d.a("\u00fd", (long)151179010698240102L) /* => dev.hixo.D.a.e */ != 0L && (var5_4 = (callSite - dev.hixo.M.d.a("\u00fd", (long)151179010698240102L) /* => dev.hixo.D.a.e */) / dev.hixo.D.a.b(11665, 514171157732996462L)) >= dev.hixo.D.a.b(5884, 603505868906106370L)) {
            dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("\u00fd", (long)75125634791150063L) /* => dev.hixo.Hixo.LOGGER */, (Object)a[0], (Object)dev.hixo.M.d.a("\u00f9", (long)var5_4, (long)85160129630559423L) /* => java.lang.Long.valueOf */, (long)123364869560705799L) /* => org.slf4j.Logger.warn */;
        }
        dev.hixo.M.d.a("\u00c1", (long)callSite, (long)151179010698240102L) /* => dev.hixo.D.a.e */;
        if (dev.hixo.M.d.a("\u00f9", (Object)class_3322, (Object)dev.hixo.M.d.a("z", (Object)this, (long)124220568847168008L) /* => dev.hixo.D.a.r */, (long)32814045884913601L) /* => dev.hixo.D.X.P */ != false) {
            return;
        }
        if (dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("z", (Object)this, (long)124220568847168008L) /* => dev.hixo.D.a.r */, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */ == null) {
            return;
        }
        if (dev.hixo.M.d.a("\u00fd", (long)71498313283647962L) /* => dev.hixo.Hixo.INSTANCE */ != null && dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("\u00fd", (long)71498313283647962L) /* => dev.hixo.Hixo.INSTANCE */, (long)190854338929747379L) /* => dev.hixo.Hixo.getEventBus */ != null) {
            dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("\u00fd", (long)71498313283647962L) /* => dev.hixo.Hixo.INSTANCE */, (long)190854338929747379L) /* => dev.hixo.Hixo.getEventBus */, (Object)new X(class_3322, (float)dev.hixo.M.d.a("$", (Object)class_97792, (boolean)false, (long)87456857126866604L) /* => net.minecraft.class_9779.method_60637 */), (long)177870116293240140L) /* => dev.hixo.T.V.T */;
        }
        boolean bl2 = bl = dev.hixo.M.d.a("\u00fd", (long)143530104075956606L) /* => dev.hixo.M.s.K.J.S */ != null && dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("\u00fd", (long)143530104075956606L) /* => dev.hixo.M.s.K.J.S */, (long)96089342888548907L) /* => dev.hixo.M.G.c */ != false;
        if (!bl) {
            dev.hixo.M.d.a("$", (Object)this, (Object)class_3322, (long)160929882321811647L) /* => dev.hixo.D.a.F */;
        }
        dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)194048358077563181L) /* => dev.hixo.D.a.t */, t::E, (long)77274808682653959L) /* => java.util.List.removeIf */;
    }

    private void F(class_332 class_3322) {
        CallSite callSite = dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("z", (Object)this, (long)124220568847168008L) /* => dev.hixo.D.a.r */, (long)33332170178084458L) /* => net.minecraft.class_310.field_1772 */;
        boolean bl = E;
        int n2 = 44;
        CallSite callSite2 = dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)194048358077563181L) /* => dev.hixo.D.a.t */, (long)113221006393852506L) /* => java.util.List.iterator */;
        while (dev.hixo.M.d.a("$", (Object)callSite2, (long)175361412755674352L) /* => java.util.Iterator.hasNext */ != false) {
            t t2;
            t t3 = t2 = (t)((Object)dev.hixo.M.d.a("$", (Object)callSite2, (long)64633749944946827L) /* => java.util.Iterator.next */);
            if (!bl) {
                if (dev.hixo.M.d.a("$", (Object)t3, (long)137406913450094414L) /* => dev.hixo.D.t.E */ != false) {
                    dev.hixo.M.d.a("$", (Object)callSite2, (long)73163157902764619L) /* => java.util.Iterator.remove */;
                    if (!bl) continue;
                }
                t3 = t2;
            }
            CallSite callSite3 = dev.hixo.M.d.a("$", (Object)t3, (long)133700491446016879L) /* => dev.hixo.D.t.k */;
            CallSite callSite4 = dev.hixo.M.d.a("$", (Object)this, (int)dev.hixo.M.d.a("z", (Object)t2, (long)161024664460561964L) /* => dev.hixo.D.t.Z */, (float)callSite3, (long)189923962848278787L) /* => dev.hixo.D.a.G */;
            CallSite callSite5 = dev.hixo.M.d.a("z", (Object)t2, (long)200994713622953849L) /* => dev.hixo.D.t.U */;
            reference var10_10 = dev.hixo.M.d.a("$", (Object)callSite, (Object)callSite5, (long)60514977858798819L) /* => net.minecraft.class_327.method_1727 */ + 22;
            int n3 = 20;
            reference var12_12 = (dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)124220568847168008L) /* => dev.hixo.D.a.r */, (long)169743140070480080L) /* => net.minecraft.class_310.method_22683 */, (long)107198687642898751L) /* => net.minecraft.class_1041.method_4486 */ - var10_10) / 2;
            int n4 = n3 / 2;
            dev.hixo.M.d.a("$", (Object)this, (Object)class_3322, (int)(var12_12 - true), (int)(n2 + 1), (int)(var12_12 + var10_10 + true), (int)(n2 + n3 + 2), (int)(n4 + 1), (int)dev.hixo.M.d.a("$", (Object)this, (int)dev.hixo.D.a.a(1978, 2339368528606999164L), (float)callSite3, (long)189923962848278787L) /* => dev.hixo.D.a.G */, (long)94216428472818850L) /* => dev.hixo.D.a.k */;
            dev.hixo.M.d.a("$", (Object)this, (Object)class_3322, (int)var12_12, (int)n2, (int)(var12_12 + var10_10), (int)(n2 + n3), (int)n4, (int)dev.hixo.M.d.a("$", (Object)this, (int)dev.hixo.D.a.a(3522, 3006912119090296834L), (float)callSite3, (long)189923962848278787L) /* => dev.hixo.D.a.G */, (long)94216428472818850L) /* => dev.hixo.D.a.k */;
            dev.hixo.M.d.a("$", (Object)this, (Object)class_3322, (int)(var12_12 + 5), (int)(n2 + 2), (int)(var12_12 + var10_10 - 5), (int)(n2 + 3), (int)1, (int)dev.hixo.M.d.a("$", (Object)this, (int)dev.hixo.D.a.a(19758, 4097208086385785066L), (float)callSite3, (long)189923962848278787L) /* => dev.hixo.D.a.G */, (long)94216428472818850L) /* => dev.hixo.D.a.k */;
            dev.hixo.M.d.a("$", (Object)this, (Object)class_3322, (int)(var12_12 + 8), (int)(n2 + n3 / 2 - 2), (int)(var12_12 + 12), (int)(n2 + n3 / 2 + 2), (int)2, (int)callSite4, (long)94216428472818850L) /* => dev.hixo.D.a.k */;
            reference v1 = var12_12 + 18;
            dev.hixo.M.d.a("\u00f9", (Object)callSite, (long)43751334837936130L) /* => java.util.Objects.requireNonNull */;
            dev.hixo.M.d.a("$", (Object)class_3322, (Object)callSite, (Object)callSite5, (int)v1, (int)(n2 + (n3 - 9) / 2), (int)callSite4, (long)179776373438385131L) /* => net.minecraft.class_332.method_25303 */;
            n2 += n3 + 4;
            if (!bl) continue;
        }
    }

    private void k(class_332 class_3322, int n2, int n3, int n4, int n5, int object, int n6) {
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

    private int G(int n2, float f) {
        int n3 = (int)((float)(n2 >> 24 & 0xFF) * f);
        return n3 << 24 | n2 & dev.hixo.D.a.a(13163, 7611420947594020524L);
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
                            var21 = new String[3];
                            var19_1 = 0;
                            var18_2 = "bQU\u0012`%\u0011_K]\u0007jXVXI\u0006Jt\u0005\u0011TJ\u0004\u0019\u5dcb\u514f\u9587\u0004\u0019\u5dcb\u5413\u7542";
                            var20_3 = "bQU\u0012`%\u0011_K]\u0007jXVXI\u0006Jt\u0005\u0011TJ\u0004\u0019\u5dcb\u514f\u9587\u0004\u0019\u5dcb\u5413\u7542".length();
                            var17_4 = 23;
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
                                        v6 = 57;
                                        break;
                                    }
                                    case 1: {
                                        v6 = 57;
                                        break;
                                    }
                                    case 2: {
                                        v6 = 60;
                                        break;
                                    }
                                    case 3: {
                                        v6 = 106;
                                        break;
                                    }
                                    case 4: {
                                        v6 = 15;
                                        break;
                                    }
                                    case 5: {
                                        v6 = 120;
                                        break;
                                    }
                                    default: {
                                        v6 = 49;
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
                        dev.hixo.D.a.a = var21;
                        var8_7 = 4526097887916244908L;
                        var14_8 = new long[7];
                        var11_9 = 0;
                        var12_10 = "\u00e4H\u00dc\u00ba\u008aQ\u00b80\u00edTR\u0001\u00f5\u0086\u00bd\u0091\u00e3\u00e7\u000f\u00c3\u0084\u00c7\u0012\u00b7\u0092\u0016\u00ec\u0004\u00b2\u00d1\u00ed\u00a1:\\\u00f8\u0007\u0019\u00bd\u008d\u00d0";
                        var13_11 = "\u00e4H\u00dc\u00ba\u008aQ\u00b80\u00edTR\u0001\u00f5\u0086\u00bd\u0091\u00e3\u00e7\u000f\u00c3\u0084\u00c7\u0012\u00b7\u0092\u0016\u00ec\u0004\u00b2\u00d1\u00ed\u00a1:\\\u00f8\u0007\u0019\u00bd\u008d\u00d0".length();
                        var10_12 = 0;
                        while (true) {
                            var15_13 = var12_10.substring(var10_12, var10_12 += 8).getBytes("ISO-8859-1");
                            v7 = var14_8;
                            v8 = var11_9++;
                            v9 = ((long)var15_13[0] & 255L) << 56 | ((long)var15_13[1] & 255L) << 48 | ((long)var15_13[2] & 255L) << 40 | ((long)var15_13[3] & 255L) << 32 | ((long)var15_13[4] & 255L) << 24 | ((long)var15_13[5] & 255L) << 16 | ((long)var15_13[6] & 255L) << 8 | (long)var15_13[7] & 255L;
                            v10 = -1;
                            break block22;
                            break;
                        }
lbl68:
                        // 1 sources

                        while (true) {
                            v7[v8] = v11;
                            if (var10_12 < var13_11) ** continue;
                            var12_10 = "\u00baA2\u00c2\"TF\u00ff\u0082J\u0014\u00e8\u00d4\u00fa\u00b8\u00b9";
                            var13_11 = "\u00baA2\u00c2\"TF\u00ff\u0082J\u0014\u00e8\u00d4\u00fa\u00b8\u00b9".length();
                            var10_12 = 0;
                            while (true) {
                                var15_13 = var12_10.substring(var10_12, var10_12 += 8).getBytes("ISO-8859-1");
                                v7 = var14_8;
                                v8 = var11_9++;
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
                            if (var10_12 < var13_11) ** continue;
                            break block23;
                            break;
                        }
                    }
                    v11 = v9 ^ var8_7;
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
                dev.hixo.D.a.b = var14_8;
                dev.hixo.D.a.c = new Integer[7];
                dev.hixo.D.a.P = dev.hixo.D.a.a(12914, 1893059607735371696L);
                var0_14 = 8854622768933790167L;
                var6_15 = new long[2];
                var3_16 = 0;
                var4_17 = "r\u0081\u00e5\u001draoC}\u00c3C\u008f\u0000\u0000\u0016\u00f9";
                var5_18 = "r\u0081\u00e5\u001draoC}\u00c3C\u008f\u0000\u0000\u0016\u00f9".length();
                var2_19 = 0;
                while (true) {
                    break block24;
                    break;
                }
lbl105:
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
        dev.hixo.D.a.d = var6_15;
        dev.hixo.D.a.f = new Long[2];
    }

    private static int a(int n2, long l2) {
        int n3 = n2 ^ (int)(l2 & 0x7FFFL) ^ 0x35C2;
        if (c[n3] == null) {
            dev.hixo.D.a.c[n3] = (int)(b[n3] ^ l2);
        }
        return c[n3];
    }

    private static long b(int n2, long l2) {
        int n3 = (n2 ^ (int)l2 ^ 0x18FE) & Short.MAX_VALUE;
        if (f[n3] == null) {
            dev.hixo.D.a.f[n3] = d[n3] ^ l2;
        }
        return f[n3];
    }
}

