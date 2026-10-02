/*
 * RESTORED SOURCE — decompiled reconstruction, not the original files.
 * class: dev.hixo.M.s.K.A
 * identified as: ESP
 * context strings: 'ESP' | 'Animals' | 'Players' | 'Items'
 */

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1293
 *  net.minecraft.class_1297
 *  net.minecraft.class_1309
 *  net.minecraft.class_1429
 *  net.minecraft.class_1542
 *  net.minecraft.class_1588
 *  net.minecraft.class_1657
 *  net.minecraft.class_310
 *  net.minecraft.class_6880
 */
package dev.hixo.M.s.K;

import dev.hixo.M.G;
import dev.hixo.M.K;
import dev.hixo.M.d;
import dev.hixo.M.s.K.p;
import dev.hixo.T.E;
import dev.hixo.b.g;
import dev.hixo.t.q.p_0;
import java.lang.invoke.CallSite;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.class_1293;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_1429;
import net.minecraft.class_1542;
import net.minecraft.class_1588;
import net.minecraft.class_1657;
import net.minecraft.class_310;
import net.minecraft.class_6880;

public class A
extends G {
    private final class_310 Y;
    public final g l;
    public final g x;
    public final g s;
    public final g K;
    private final List<class_1297> k;
    private static final String[] c;
    private static final long d;

    public A() {
        String[] stringArray = c;
        super((K)((Object)dev.hixo.M.d.a("\u00fd", (long)63693867768511465L) /* => dev.hixo.M.K.RENDER */), stringArray[0], stringArray[5]);
        this.Y = dev.hixo.M.d.a("\u00f9", (long)179869930689441125L) /* => net.minecraft.class_310.method_1551 */;
        this.l = new g(stringArray[2], true);
        this.x = new g(stringArray[4], true);
        this.s = new g(stringArray[1], false);
        this.K = new g(stringArray[3], false);
        this.k = new ArrayList<class_1297>();
        dev.hixo.M.d.a("$", (Object)this, (int)0, (long)113806433936288059L) /* => dev.hixo.M.G.z */;
    }

    @E
    public void N(p_0 p_02) {
        A a2;
        int n2;
        block10: {
            block11: {
                block9: {
                    block8: {
                        n2 = p.d;
                        if (dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("$", (Object)p_02, (long)52512254813896748L) /* => dev.hixo.T.q.p.W */, (Object)dev.hixo.M.d.a("\u00fd", (long)199476637466971905L) /* => dev.hixo.T.S.PRE */, (long)115634047609526502L) /* => dev.hixo.T.S.equals */ == false) {
                            return;
                        }
                        a2 = this;
                        if (n2 != 0) break block8;
                        if (dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("z", (Object)a2, (long)52778157817724394L), (long)38197671011210569L) /* => net.minecraft.class_310.field_1687 */ == null) break block9;
                        a2 = this;
                    }
                    if (n2 != 0) break block10;
                    if (dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("z", (Object)a2, (long)52778157817724394L), (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */ != null) break block11;
                }
                return;
            }
            a2 = this;
        }
        CallSite callSite = dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("z", (Object)a2, (long)52778157817724394L), (long)38197671011210569L) /* => net.minecraft.class_310.field_1687 */;
        dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)102621639392905677L), (long)191130606908305482L) /* => java.util.List.clear */;
        CallSite callSite2 = dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("z", (Object)this, (long)52778157817724394L), (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (long)187596606581785047L) /* => net.minecraft.class_746.method_5829 */, (double)128.0, (long)134998869489725467L) /* => net.minecraft.class_238.method_1014 */;
        CallSite callSite3 = dev.hixo.M.d.a("$", (Object)callSite, (Object)dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("z", (Object)this, (long)52778157817724394L), (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (Object)callSite2, class_12972 -> true, (long)176550797537642808L);
        CallSite callSite4 = dev.hixo.M.d.a("$", (Object)callSite3, (long)113221006393852506L) /* => java.util.List.iterator */;
        while (dev.hixo.M.d.a("$", (Object)callSite4, (long)175361412755674352L) /* => java.util.Iterator.hasNext */ != false) {
            block14: {
                class_1297 class_12973;
                class_1297 class_12974;
                block13: {
                    Object object;
                    block12: {
                        class_12974 = (class_1297)dev.hixo.M.d.a("$", (Object)callSite4, (long)64633749944946827L) /* => java.util.Iterator.next */;
                        object = dev.hixo.M.d.a("$", (Object)this, (Object)class_12974, (long)201052034271107059L) /* => dev.hixo.M.s.K.A.o */;
                        if (n2 != 0) break block12;
                        if (object == false) continue;
                        class_12973 = class_12974;
                        if (n2 != 0) break block13;
                        object = class_12973 instanceof class_1309;
                    }
                    if (object == false) break block14;
                    class_12973 = class_12974;
                }
                class_1309 class_13092 = (class_1309)class_12973;
                class_1293 class_12932 = new class_1293((class_6880)dev.hixo.M.d.a("\u00fd", (long)169571925000440593L), (int)d, 0, false, false, false);
                dev.hixo.M.d.a("$", (Object)class_13092, (Object)class_12932, (long)109333410121661071L);
                dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)102621639392905677L), (Object)class_12974, (long)184435215000867819L) /* => java.util.List.add */;
            }
            if (n2 == 0) continue;
        }
    }

    public boolean o(class_1297 class_12972) {
        if (dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)172062991530587324L), (long)65580906021680841L) /* => dev.hixo.b.g.x */ != false && class_12972 instanceof class_1657) {
            return true;
        }
        if (dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)144324460381738069L), (long)65580906021680841L) /* => dev.hixo.b.g.x */ != false && class_12972 instanceof class_1588) {
            return true;
        }
        if (dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)196255810921379919L), (long)65580906021680841L) /* => dev.hixo.b.g.x */ != false && class_12972 instanceof class_1429) {
            return true;
        }
        return dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)50903761018062902L), (long)65580906021680841L) /* => dev.hixo.b.g.x */ != false && class_12972 instanceof class_1542;
    }

    @Override
    public void a() {
        super.a();
        if (dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("z", (Object)this, (long)52778157817724394L), (long)38197671011210569L) /* => net.minecraft.class_310.field_1687 */ != null && dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("z", (Object)this, (long)52778157817724394L), (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */ != null) {
            CallSite callSite = dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("z", (Object)this, (long)52778157817724394L), (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (long)187596606581785047L) /* => net.minecraft.class_746.method_5829 */, (double)128.0, (long)134998869489725467L) /* => net.minecraft.class_238.method_1014 */;
            CallSite callSite2 = dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("z", (Object)this, (long)52778157817724394L), (long)38197671011210569L) /* => net.minecraft.class_310.field_1687 */, (Object)dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("z", (Object)this, (long)52778157817724394L), (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (Object)callSite, class_12972 -> true, (long)111079478229881807L) /* => net.minecraft.class_638.method_8333 */;
            CallSite callSite3 = dev.hixo.M.d.a("$", (Object)callSite2, (long)113221006393852506L) /* => java.util.List.iterator */;
            while (dev.hixo.M.d.a("$", (Object)callSite3, (long)175361412755674352L) /* => java.util.Iterator.hasNext */ != false) {
                class_1309 class_13092;
                class_1297 class_12973 = (class_1297)dev.hixo.M.d.a("$", (Object)callSite3, (long)64633749944946827L) /* => java.util.Iterator.next */;
                if (!(class_12973 instanceof class_1309) || dev.hixo.M.d.a("$", (Object)(class_13092 = (class_1309)class_12973), (Object)dev.hixo.M.d.a("\u00fd", (long)169571925000440593L), (long)73288881116886451L) == false) continue;
                dev.hixo.M.d.a("$", (Object)class_13092, (Object)dev.hixo.M.d.a("\u00fd", (long)169571925000440593L), (long)178549076237792986L);
            }
        }
        dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)102621639392905677L), (long)191130606908305482L) /* => java.util.List.clear */;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                block19: {
                    var7 = new String[6];
                    var5_1 = 0;
                    var4_2 = "=AG\u00079|~0\u00017P\u0007(~v$\u0005)P\u00051fr0\u0013";
                    var6_3 = "=AG\u00079|~0\u00017P\u0007(~v$\u0005)P\u00051fr0\u0013".length();
                    var3_4 = 3;
                    var2_5 = -1;
lbl7:
                    // 2 sources

                    while (true) {
                        v0 = ++var2_5;
                        v1 = var4_2.substring(v0, v0 + var3_4);
                        v2 = -1;
                        break block19;
                        break;
                    }
lbl12:
                    // 1 sources

                    while (true) {
                        var7[var5_1++] = v3.intern();
                        if ((var2_5 += var3_4) < var6_3) {
                            var3_4 = var4_2.charAt(var2_5);
                            ** continue;
                        }
                        var4_2 = "5}u.\b\u9077\u89d4\u6629\u7967\u5bfe\u4f08\u8f4d\u5eab";
                        var6_3 = "5}u.\b\u9077\u89d4\u6629\u7967\u5bfe\u4f08\u8f4d\u5eab".length();
                        var3_4 = 4;
                        var2_5 = -1;
lbl21:
                        // 2 sources

                        while (true) {
                            v4 = ++var2_5;
                            v1 = var4_2.substring(v4, v4 + var3_4);
                            v2 = 0;
                            break block19;
                            break;
                        }
                        break;
                    }
lbl26:
                    // 1 sources

                    while (true) {
                        var7[var5_1++] = v3.intern();
                        if ((var2_5 += var3_4) < var6_3) {
                            var3_4 = var4_2.charAt(var2_5);
                            ** continue;
                        }
                        break block20;
                        break;
                    }
                }
                v5 = v1.toCharArray();
                v6 = v5;
                v7 = v5.length;
                var8_6 = 0;
                if (true) ** GOTO lbl65
                do {
                    v6 = v6;
                    v8 = var8_6;
                    v9 = v6[v8];
                    switch (var8_6 % 7) {
                        case 0: {
                            v10 = 120;
                            break;
                        }
                        case 1: {
                            v10 = 18;
                            break;
                        }
                        case 2: {
                            v10 = 23;
                            break;
                        }
                        case 3: {
                            v10 = 93;
                            break;
                        }
                        case 4: {
                            v10 = 96;
                            break;
                        }
                        case 5: {
                            v10 = 91;
                            break;
                        }
                        default: {
                            v10 = 35;
                        }
                    }
                    v6[v8] = (char)(v9 ^ v10);
                    ++var8_6;
lbl65:
                    // 2 sources

                    v7 = v7;
                } while (v7 > var8_6);
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
            A.c = var7;
            break block21;
lbl77:
            // 1 sources

            while (true) {
                continue;
                break;
            }
        }
        var0_7 = 8687069725202151753L;
        ** while (true)
        A.d = -5346047919428041034L ^ var0_7;
    }
}

