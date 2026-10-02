/*
 * RESTORED SOURCE — decompiled reconstruction, not the original files.
 * class: dev.hixo.M.s.K.p
 * identified as: Animation
 * context strings: 'Y-Offset' | 'Vanilla' | '1.8.9 打击动画' | 'Slide'
 */

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1306
 *  net.minecraft.class_4587
 *  org.joml.Quaternionf
 */
package dev.hixo.M.s.K;

import dev.hixo.M.G;
import dev.hixo.M.K;
import dev.hixo.M.d;
import dev.hixo.b.M;
import dev.hixo.b.s;
import java.lang.invoke.CallSite;
import net.minecraft.class_1306;
import net.minecraft.class_4587;
import org.joml.Quaternionf;

public class p
extends G {
    public static p k;
    public final s H;
    public final M v;
    public final M N;
    public final M M;
    public static int d;
    private static final String[] c;

    public p() {
        String[] stringArray = c;
        super((K)((Object)dev.hixo.M.d.a("\u00fd", (long)63693867768511465L) /* => dev.hixo.M.K.RENDER */), stringArray[6], stringArray[2]);
        this.H = new s(stringArray[7], stringArray[11], stringArray[5], stringArray[10], stringArray[1]);
        this.v = new M(stringArray[9], 1.0, 0.1, 3.0, 0.1);
        this.N = new M(stringArray[4], 1.0, 0.1, 5.0, 0.1);
        this.M = new M(stringArray[0], 0.0, -1.0, 1.0, 0.1);
        dev.hixo.M.d.a("\u00c1", (p)this, (long)123081311337954036L) /* => dev.hixo.M.s.K.p.k */;
        dev.hixo.M.d.a("$", (Object)this, (int)0, (long)113806433936288059L) /* => dev.hixo.M.G.z */;
    }

    public static void w(double d2, double d3, double d4, class_4587 class_45872) {
        dev.hixo.M.d.a("$", (Object)class_45872, (double)d2, (double)d3, (double)d4, (long)143635764114987016L) /* => net.minecraft.class_4587.method_22904 */;
    }

    public static void D(float f, float f2, float f3, float f4, class_4587 class_45872) {
        dev.hixo.M.d.a("$", (Object)class_45872, (Object)dev.hixo.M.d.a("$", (Object)new Quaternionf(), (float)(f * ((float)Math.PI / 180)), (float)f2, (float)f3, (float)f4, (long)184682144767673675L) /* => org.joml.Quaternionf.rotationAxis */, (long)196398976281991708L) /* => net.minecraft.class_4587.method_22907 */;
    }

    public static void o(float f, float f2, float f3, class_4587 class_45872) {
        dev.hixo.M.d.a("$", (Object)class_45872, (float)f, (float)f2, (float)f3, (long)64702201591988101L) /* => net.minecraft.class_4587.method_22905 */;
    }

    public void U(class_4587 class_45872, float f, class_1306 class_13062, float f2) {
        block4: {
            CallSite callSite;
            float f3;
            block5: {
                String string;
                CallSite callSite2;
                int n2;
                block2: {
                    CallSite callSite3;
                    block3: {
                        f3 = f * dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)155690659343673283L) /* => dev.hixo.M.s.K.p.N */, (long)160421759095868388L) /* => dev.hixo.b.M.e */;
                        callSite = dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)170500899347523305L) /* => dev.hixo.M.s.K.p.v */, (long)160421759095868388L) /* => dev.hixo.b.M.e */;
                        dev.hixo.M.d.a("$", (Object)class_45872, (float)0.0f, (float)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)189501715846352876L) /* => dev.hixo.M.s.K.p.M */, (long)160421759095868388L) /* => dev.hixo.b.M.e */, (float)0.0f, (long)56023600929979137L) /* => net.minecraft.class_4587.method_46416 */;
                        callSite3 = dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)119840901262968255L) /* => dev.hixo.M.s.K.p.H */, (long)50503865389075616L) /* => dev.hixo.b.s.I */;
                        n2 = d;
                        callSite2 = callSite3;
                        String[] stringArray = c;
                        string = stringArray[8];
                        if (n2 != 0) break block2;
                        if (dev.hixo.M.d.a("$", (Object)callSite2, (Object)string, (long)106044803757638707L) /* => java.lang.String.equalsIgnoreCase */ == false) break block3;
                        int n3 = class_13062 == dev.hixo.M.d.a("\u00fd", (long)194515715450480306L) /* => net.minecraft.class_1306.field_6183 */ ? 1 : -1;
                        dev.hixo.M.d.a("\u00f9", (double)((float)n3 * 0.56f), (double)(-0.52f + f2 * -0.6f), (double)-0.72, (Object)class_45872, (long)104922553944187609L) /* => dev.hixo.M.s.K.p.w */;
                        dev.hixo.M.d.a("\u00f9", (double)((float)n3 * -0.1414214f), (double)0.08f, (double)0.1414213925600052, (Object)class_45872, (long)104922553944187609L) /* => dev.hixo.M.s.K.p.w */;
                        dev.hixo.M.d.a("\u00f9", (float)-102.25f, (float)1.0f, (float)0.0f, (float)0.0f, (Object)class_45872, (long)40807255679689617L) /* => dev.hixo.M.s.K.p.D */;
                        dev.hixo.M.d.a("\u00f9", (float)((float)n3 * 13.365f), (float)0.0f, (float)1.0f, (float)0.0f, (Object)class_45872, (long)40807255679689617L) /* => dev.hixo.M.s.K.p.D */;
                        dev.hixo.M.d.a("\u00f9", (float)((float)n3 * 78.05f), (float)0.0f, (float)0.0f, (float)1.0f, (Object)class_45872, (long)40807255679689617L) /* => dev.hixo.M.s.K.p.D */;
                        CallSite callSite4 = dev.hixo.M.d.a("\u00f9", (double)((double)(f3 * f3) * Math.PI), (long)180820358742946423L) /* => java.lang.Math.sin */;
                        CallSite callSite5 = dev.hixo.M.d.a("\u00f9", (double)(dev.hixo.M.d.a("\u00f9", (double)f3, (long)146319326606007315L) /* => java.lang.Math.sqrt */ * Math.PI), (long)180820358742946423L) /* => java.lang.Math.sin */;
                        dev.hixo.M.d.a("\u00f9", (float)((float)(callSite4 * -20.0)), (float)0.0f, (float)1.0f, (float)0.0f, (Object)class_45872, (long)40807255679689617L) /* => dev.hixo.M.s.K.p.D */;
                        dev.hixo.M.d.a("\u00f9", (float)((float)(callSite5 * -20.0)), (float)0.0f, (float)0.0f, (float)1.0f, (Object)class_45872, (long)40807255679689617L) /* => dev.hixo.M.s.K.p.D */;
                        dev.hixo.M.d.a("\u00f9", (float)((float)(callSite5 * -80.0)), (float)1.0f, (float)0.0f, (float)0.0f, (Object)class_45872, (long)40807255679689617L) /* => dev.hixo.M.s.K.p.D */;
                        dev.hixo.M.d.a("\u00f9", (float)callSite, (float)callSite, (float)callSite, (Object)class_45872, (long)164299771124329616L) /* => dev.hixo.M.s.K.p.o */;
                        if (n2 == 0) break block4;
                        G.L = !G.L;
                    }
                    callSite2 = callSite3;
                    string = c[3];
                }
                if (dev.hixo.M.d.a("$", (Object)callSite2, (Object)string, (long)106044803757638707L) /* => java.lang.String.equalsIgnoreCase */ == false) break block5;
                CallSite callSite6 = dev.hixo.M.d.a("\u00f9", (float)(dev.hixo.M.d.a("\u00f9", (float)f3, (long)109721793118570916L) /* => net.minecraft.class_3532.method_15355 */ * (float)Math.PI), (long)185016405017717227L) /* => net.minecraft.class_3532.method_15374 */;
                dev.hixo.M.d.a("\u00f9", (double)0.648f, (double)-0.55f, (double)-0.7199999690055847, (Object)class_45872, (long)104922553944187609L) /* => dev.hixo.M.s.K.p.w */;
                dev.hixo.M.d.a("\u00f9", (float)77.0f, (float)0.0f, (float)1.0f, (float)0.0f, (Object)class_45872, (long)40807255679689617L) /* => dev.hixo.M.s.K.p.D */;
                dev.hixo.M.d.a("\u00f9", (float)-10.0f, (float)0.0f, (float)0.0f, (float)1.0f, (Object)class_45872, (long)40807255679689617L) /* => dev.hixo.M.s.K.p.D */;
                dev.hixo.M.d.a("\u00f9", (float)-80.0f, (float)1.0f, (float)0.0f, (float)0.0f, (Object)class_45872, (long)40807255679689617L) /* => dev.hixo.M.s.K.p.D */;
                dev.hixo.M.d.a("\u00f9", (float)(-callSite6 * 20.0f), (float)1.0f, (float)0.0f, (float)0.0f, (Object)class_45872, (long)40807255679689617L) /* => dev.hixo.M.s.K.p.D */;
                dev.hixo.M.d.a("\u00f9", (float)(1.2f * callSite), (float)(1.2f * callSite), (float)(1.2f * callSite), (Object)class_45872, (long)164299771124329616L) /* => dev.hixo.M.s.K.p.o */;
                dev.hixo.M.d.a("\u00f9", (float)callSite, (float)callSite, (float)callSite, (Object)class_45872, (long)164299771124329616L) /* => dev.hixo.M.s.K.p.o */;
                if (n2 == 0) break block4;
            }
            dev.hixo.M.d.a("$", (Object)this, (Object)class_45872, (float)f2, (float)f3, (float)callSite, (long)86656868606036968L) /* => dev.hixo.M.s.K.p.P */;
            dev.hixo.M.d.a("$", (Object)this, (Object)class_45872, (long)186061014593392678L) /* => dev.hixo.M.s.K.p.S */;
            reference var9_12 = dev.hixo.M.d.a("\u00f9", (float)(dev.hixo.M.d.a("\u00f9", (float)f3, (long)109721793118570916L) /* => net.minecraft.class_3532.method_15355 */ * (float)Math.PI), (long)185016405017717227L) /* => net.minecraft.class_3532.method_15374 */ / 8.0f;
            dev.hixo.M.d.a("$", (Object)class_45872, (double)0.008, (double)0.24, (double)0.03, (long)143635764114987016L) /* => net.minecraft.class_4587.method_22904 */;
            dev.hixo.M.d.a("$", (Object)class_45872, (double)-0.16, (double)-0.25, (double)0.0, (long)143635764114987016L) /* => net.minecraft.class_4587.method_22904 */;
            dev.hixo.M.d.a("\u00f9", (float)((float)(0.8 + (double)var9_12) * callSite), (float)((float)(0.8 + (double)var9_12) * callSite), (float)((float)(0.8 + (double)var9_12) * callSite), (Object)class_45872, (long)164299771124329616L) /* => dev.hixo.M.s.K.p.o */;
            dev.hixo.M.d.a("\u00f9", (float)(-dev.hixo.M.d.a("\u00f9", (float)((float)((double)dev.hixo.M.d.a("\u00f9", (float)f3, (long)109721793118570916L) /* => net.minecraft.class_3532.method_15355 */ * Math.PI)), (long)185016405017717227L) /* => net.minecraft.class_3532.method_15374 */ * 20.0f), (float)0.0f, (float)1.2f, (float)-0.8f, (Object)class_45872, (long)40807255679689617L) /* => dev.hixo.M.s.K.p.D */;
            dev.hixo.M.d.a("\u00f9", (float)(-dev.hixo.M.d.a("\u00f9", (float)((float)((double)dev.hixo.M.d.a("\u00f9", (float)f3, (long)109721793118570916L) /* => net.minecraft.class_3532.method_15355 */ * Math.PI)), (long)185016405017717227L) /* => net.minecraft.class_3532.method_15374 */ * 30.0f), (float)1.0f, (float)0.0f, (float)0.0f, (Object)class_45872, (long)40807255679689617L) /* => dev.hixo.M.s.K.p.D */;
            dev.hixo.M.d.a("\u00f9", (float)(2.4f * callSite), (float)(2.4f * callSite), (float)(2.4f * callSite), (Object)class_45872, (long)164299771124329616L) /* => dev.hixo.M.s.K.p.o */;
            dev.hixo.M.d.a("\u00f9", (float)-38.4f, (float)0.0f, (float)1.0f, (float)0.0f, (Object)class_45872, (long)40807255679689617L) /* => dev.hixo.M.s.K.p.D */;
            dev.hixo.M.d.a("\u00f9", (float)callSite, (float)callSite, (float)callSite, (Object)class_45872, (long)164299771124329616L) /* => dev.hixo.M.s.K.p.o */;
        }
    }

    private void P(class_4587 class_45872, float f, float f2, float f3) {
        dev.hixo.M.d.a("$", (Object)class_45872, (float)0.56f, (float)-0.52f, (float)-0.71999997f, (long)56023600929979137L) /* => net.minecraft.class_4587.method_46416 */;
        dev.hixo.M.d.a("\u00f9", (float)45.0f, (float)0.0f, (float)1.0f, (float)0.0f, (Object)class_45872, (long)40807255679689617L) /* => dev.hixo.M.s.K.p.D */;
        CallSite callSite = dev.hixo.M.d.a("\u00f9", (float)(f2 * f2 * (float)Math.PI), (long)185016405017717227L) /* => net.minecraft.class_3532.method_15374 */;
        CallSite callSite2 = dev.hixo.M.d.a("\u00f9", (float)(dev.hixo.M.d.a("\u00f9", (float)f2, (long)109721793118570916L) /* => net.minecraft.class_3532.method_15355 */ * (float)Math.PI), (long)185016405017717227L) /* => net.minecraft.class_3532.method_15374 */;
        dev.hixo.M.d.a("\u00f9", (float)(callSite * -20.0f), (float)0.0f, (float)1.0f, (float)0.0f, (Object)class_45872, (long)40807255679689617L) /* => dev.hixo.M.s.K.p.D */;
        dev.hixo.M.d.a("\u00f9", (float)(callSite2 * -20.0f), (float)0.0f, (float)0.0f, (float)1.0f, (Object)class_45872, (long)40807255679689617L) /* => dev.hixo.M.s.K.p.D */;
        dev.hixo.M.d.a("\u00f9", (float)(callSite2 * -80.0f), (float)1.0f, (float)0.0f, (float)0.0f, (Object)class_45872, (long)40807255679689617L) /* => dev.hixo.M.s.K.p.D */;
        dev.hixo.M.d.a("\u00f9", (float)(0.4f * f3), (float)(0.4f * f3), (float)(0.4f * f3), (Object)class_45872, (long)164299771124329616L) /* => dev.hixo.M.s.K.p.o */;
    }

    private void S(class_4587 class_45872) {
        dev.hixo.M.d.a("$", (Object)class_45872, (float)-0.5f, (float)0.2f, (float)0.0f, (long)56023600929979137L) /* => net.minecraft.class_4587.method_46416 */;
        dev.hixo.M.d.a("\u00f9", (float)30.0f, (float)0.0f, (float)1.0f, (float)0.0f, (Object)class_45872, (long)40807255679689617L) /* => dev.hixo.M.s.K.p.D */;
        dev.hixo.M.d.a("\u00f9", (float)-80.0f, (float)1.0f, (float)0.0f, (float)0.0f, (Object)class_45872, (long)40807255679689617L) /* => dev.hixo.M.s.K.p.D */;
        dev.hixo.M.d.a("\u00f9", (float)60.0f, (float)0.0f, (float)1.0f, (float)0.0f, (Object)class_45872, (long)40807255679689617L) /* => dev.hixo.M.s.K.p.D */;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block19: {
            block18: {
                var5 = new String[12];
                var3_1 = 0;
                var2_2 = "qPC\u00075r\u0000\\\u0007~\u001cb\b?m\u0004\n\u0019S4Oj!\u6236\u51d3\u52d5\u7537\u0005{\u0011e\u00056\u0005{\ri\u00047\u0006d\u0018m\n6e\ng\u0011h):u\u0011A\u0013k\ti\u0013e\f2u\fG\u0013\u0007~\u001cb\b?m\u0004\u0004{\u0014v\u0004";
                var4_3 = "qPC\u00075r\u0000\\\u0007~\u001cb\b?m\u0004\n\u0019S4Oj!\u6236\u51d3\u52d5\u7537\u0005{\u0011e\u00056\u0005{\ri\u00047\u0006d\u0018m\n6e\ng\u0011h):u\u0011A\u0013k\ti\u0013e\f2u\fG\u0013\u0007~\u001cb\b?m\u0004\u0004{\u0014v\u0004".length();
                var1_4 = 8;
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
                    var2_2 = "{\u0011e\u00056\u0006d\u0018m\n6e";
                    var4_3 = "{\u0011e\u00056\u0006d\u0018m\n6e".length();
                    var1_4 = 5;
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
                        v10 = 40;
                        break;
                    }
                    case 1: {
                        v10 = 125;
                        break;
                    }
                    case 2: {
                        v10 = 12;
                        break;
                    }
                    case 3: {
                        v10 = 97;
                        break;
                    }
                    case 4: {
                        v10 = 83;
                        break;
                    }
                    case 5: {
                        v10 = 1;
                        break;
                    }
                    default: {
                        v10 = 101;
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
        p.c = var5;
    }
}

