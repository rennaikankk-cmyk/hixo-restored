/*
 * RESTORED SOURCE — decompiled reconstruction, not the original files.
 * class: dev.hixo.P.s
 * context strings: 'category.hixo'
 */

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_304
 *  net.minecraft.class_310
 *  net.minecraft.class_3675$class_307
 */
package dev.hixo.P;

import dev.hixo.M.G;
import dev.hixo.M.d;
import dev.hixo.c.C;
import java.util.HashSet;
import java.util.Set;
import net.minecraft.class_304;
import net.minecraft.class_310;
import net.minecraft.class_3675;

public class s {
    private class_304 S;
    private final class_310 F = d.a("\u00f9", (long)179869930689441125L) /* => net.minecraft.class_310.method_1551 */;
    private final Set<Integer> E = new HashSet<Integer>();
    private static final int e;
    private boolean B;
    public static int X;
    private static final String[] a;

    public s() {
        d.a("\u00e7", (Object)this, (boolean)false, (long)191632907425486388L) /* => dev.hixo.P.s.B */;
    }

    public void f() {
        try {
            String[] stringArray = a;
            d.a("\u00e7", (Object)this, (class_304)d.a("\u00f9", (Object)new class_304(stringArray[2], (class_3675.class_307)d.a("\u00fd", (long)198095233490941532L) /* => net.minecraft.class_3675$class_307.field_1668 */, 344, stringArray[0]), (long)168382728148338726L) /* => net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper.registerKeyBinding */, (long)198292217130201823L) /* => dev.hixo.P.s.S */;
        }
        catch (Throwable throwable) {
            d.a("\u00e7", (Object)this, null, (long)198292217130201823L) /* => dev.hixo.P.s.S */;
            d.a("$", (Object)d.a("\u00fd", (long)75125634791150063L) /* => dev.hixo.Hixo.LOGGER */, (Object)a[1], (Object)d.a("$", (Object)throwable, (long)120621357894278260L) /* => java.lang.Throwable.toString */, (long)123364869560705799L) /* => org.slf4j.Logger.warn */;
        }
    }

    /*
     * Unable to fully structure code
     */
    public void k() {
        block17: {
            block16: {
                var1_1 = s.X;
                v0 = this;
                if (var1_1 == 0) {
                    if (d.a("z", (Object)d.a("z", (Object)v0, (long)62041303449001981L) /* => dev.hixo.P.s.F */, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */ == null) {
                        return;
                    }
                    v0 = this;
                }
                if (var1_1 != 0) ** GOTO lbl16
                if (d.a("z", (Object)v0, (long)198292217130201823L) /* => dev.hixo.P.s.S */ == null) ** GOTO lbl15
                while (d.a("$", (Object)d.a("z", (Object)this, (long)198292217130201823L) /* => dev.hixo.P.s.S */, (long)128462502623343467L) /* => net.minecraft.class_304.method_1436 */ != false) {
                    block20: {
                        block19: {
                            block18: {
                                v1 = this;
                                if (var1_1 == 0) {
                                    d.a("$", (Object)v1, (long)107014731039643240L) /* => dev.hixo.P.s.N */;
                                    if (var1_1 == 0) continue;
                                }
                                break block16;
lbl15:
                                // 2 sources

                                v0 = this;
lbl16:
                                // 2 sources

                                v2 = var2_2 = d.a("\u00f9", (long)d.a("$", (Object)d.a("$", (Object)d.a("z", (Object)v0, (long)62041303449001981L) /* => dev.hixo.P.s.F */, (long)169743140070480080L) /* => net.minecraft.class_310.method_22683 */, (long)77524380735066492L) /* => net.minecraft.class_1041.method_4490 */, (int)344, (long)96126775634961670L) /* => net.minecraft.class_3675.method_15987 */;
                                if (var1_1 != 0) break block18;
                                if (v2 == false) break block19;
                                v3 = this;
                                if (var1_1 != 0) break block20;
                                v2 = d.a("z", (Object)v3, (long)191632907425486388L) /* => dev.hixo.P.s.B */;
                            }
                            if (v2 == false) {
                                d.a("$", (Object)this, (long)107014731039643240L) /* => dev.hixo.P.s.N */;
                            }
                        }
                        v3 = this;
                    }
                    d.a("\u00e7", (Object)v3, (boolean)var2_2, (long)191632907425486388L) /* => dev.hixo.P.s.B */;
                    break;
                }
                v1 = this;
            }
            var2_3 = d.a("$", (Object)d.a("$", (Object)d.a("z", (Object)v1, (long)62041303449001981L) /* => dev.hixo.P.s.F */, (long)169743140070480080L) /* => net.minecraft.class_310.method_22683 */, (long)77524380735066492L) /* => net.minecraft.class_1041.method_4490 */;
            var4_4 = new HashSet<E>();
            var5_5 = d.a("$", (Object)d.a("$", (Object)d.a("$", (Object)d.a("\u00fd", (long)71498313283647962L) /* => dev.hixo.Hixo.INSTANCE */, (long)190425734249275754L) /* => dev.hixo.Hixo.getModuleManager */, (long)58260499210938850L) /* => dev.hixo.M.n.C */, (long)113221006393852506L) /* => java.util.List.iterator */;
            while (d.a("$", (Object)var5_5, (long)175361412755674352L) /* => java.util.Iterator.hasNext */ != false) {
                block22: {
                    block21: {
                        var6_6 = (G)d.a("$", (Object)var5_5, (long)64633749944946827L) /* => java.util.Iterator.next */;
                        if (var1_1 != 0) break block17;
                        v4 = var7_7 = d.a("$", (Object)var6_6, (long)130182560422634980L) /* => dev.hixo.M.G.x */;
                        if (var1_1 == 0) {
                            if (v4 <= 0) continue;
                            v4 = var8_8 = d.a("\u00f9", (long)var2_3, (int)var7_7, (long)96126775634961670L) /* => net.minecraft.class_3675.method_15987 */;
                        }
                        if (var1_1 != 0) break block21;
                        if (var8_8 == false) break block22;
                        d.a("$", var4_4, (Object)d.a("\u00f9", (int)var7_7, (long)67104637941965968L) /* => java.lang.Integer.valueOf */, (long)56498836055017186L) /* => java.util.Set.add */;
                    }
                    if (d.a("$", (Object)d.a("z", (Object)this, (long)125889301857120987L) /* => dev.hixo.P.s.E */, (Object)d.a("\u00f9", (int)var7_7, (long)67104637941965968L) /* => java.lang.Integer.valueOf */, (long)117209702718349922L) /* => java.util.Set.contains */ == false) {
                        d.a("$", (Object)var6_6, (long)140123850436802586L) /* => dev.hixo.M.G.w */;
                    }
                }
                if (var1_1 == 0) continue;
            }
            d.a("$", (Object)d.a("z", (Object)this, (long)125889301857120987L) /* => dev.hixo.P.s.E */, (long)44473385465221407L) /* => java.util.Set.clear */;
            d.a("$", (Object)d.a("z", (Object)this, (long)125889301857120987L) /* => dev.hixo.P.s.E */, var4_4, (long)67984373811676221L) /* => java.util.Set.addAll */;
        }
    }

    public void w() {
    }

    private void N() {
        if (d.a("z", (Object)d.a("z", (Object)this, (long)62041303449001981L) /* => dev.hixo.P.s.F */, (long)99309607406877471L) /* => net.minecraft.class_310.field_1755 */ == null) {
            d.a("$", (Object)d.a("z", (Object)this, (long)62041303449001981L) /* => dev.hixo.P.s.F */, (Object)((Object)new C()), (long)91906655460434537L) /* => net.minecraft.class_310.method_1507 */;
        } else {
            d.a("$", (Object)d.a("z", (Object)this, (long)62041303449001981L) /* => dev.hixo.P.s.F */, null, (long)91906655460434537L) /* => net.minecraft.class_310.method_1507 */;
        }
    }

    public class_304 c() {
        return d.a("z", (Object)this, (long)198292217130201823L) /* => dev.hixo.P.s.S */;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        var9 = new String[3];
        var7_1 = 0;
        var6_2 = "(\u0007@{U\u000eu2H\\wJ\u000eF\u0010\u000e]f]<' \u0003M|[\u000fc\"\bS>@\u0004`\"\u0015@lS\u0015n$\b\u0014lW\u000bb(\u0012Qz\u0012I|6O\u0018>G\u0012n%\u0001\u0014z[\u0013b(\u0012\u0014uW\u0018';\tXr[\u000f`\u0011 \u0003M0Z\b\u007f$HWr[\u0002l,\u0013]";
        var8_3 = "(\u0007@{U\u000eu2H\\wJ\u000eF\u0010\u000e]f]<' \u0003M|[\u000fc\"\bS>@\u0004`\"\u0015@lS\u0015n$\b\u0014lW\u000bb(\u0012Qz\u0012I|6O\u0018>G\u0012n%\u0001\u0014z[\u0013b(\u0012\u0014uW\u0018';\tXr[\u000f`\u0011 \u0003M0Z\b\u007f$HWr[\u0002l,\u0013]".length();
        var5_4 = 13;
        var4_5 = -1;
lbl7:
        // 2 sources

        while (true) {
            v0 = ++var4_5;
            v1 = var6_2.substring(v0, v0 + var5_4).toCharArray();
            v2 = v1;
            v3 = v1.length;
            var10_6 = 0;
            if (true) ** GOTO lbl44
            break;
        }
lbl14:
        // 1 sources

        while (true) {
            var5_4 = var6_2.charAt(var4_5);
            ** continue;
            break;
        }
        do {
            v2 = v2;
            v4 = var10_6;
            v5 = v2[v4];
            switch (var10_6 % 7) {
                case 0: {
                    v6 = 75;
                    break;
                }
                case 1: {
                    v6 = 102;
                    break;
                }
                case 2: {
                    v6 = 52;
                    break;
                }
                case 3: {
                    v6 = 30;
                    break;
                }
                case 4: {
                    v6 = 50;
                    break;
                }
                case 5: {
                    v6 = 97;
                    break;
                }
                default: {
                    v6 = 7;
                }
            }
            v2[v4] = (char)(v5 ^ v6);
            ++var10_6;
lbl44:
            // 2 sources

            v3 = v3;
        } while (v3 > var10_6);
        var9[var7_1++] = new String(v2).intern();
        ** while ((var4_5 += var5_4) < var8_3)
lbl50:
        // 1 sources

        s.a = var9;
        var2_7 = 1309814099423849439L;
        var0_8 = -8730494351019021689L ^ var2_7;
        s.e = (int)var0_8;
    }
}

