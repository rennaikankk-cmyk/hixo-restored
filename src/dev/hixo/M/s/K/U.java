/*
 * RESTORED SOURCE — decompiled reconstruction, not the original files.
 * class: dev.hixo.M.s.K.U
 * identified as: ChestESP
 * context strings: 'ChestESP' | 'Trapped Chest' | '高亮显示箱子' | 'Chest'
 */

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.fabric.api.client.rendering.v1.WorldRenderContext
 *  net.minecraft.class_1937
 *  net.minecraft.class_2281
 *  net.minecraft.class_2338
 *  net.minecraft.class_2350
 *  net.minecraft.class_238
 *  net.minecraft.class_2586
 *  net.minecraft.class_2595
 *  net.minecraft.class_2611
 *  net.minecraft.class_2680
 *  net.minecraft.class_2745
 *  net.minecraft.class_2818
 *  net.minecraft.class_287
 *  net.minecraft.class_4587
 *  org.joml.Matrix4f
 */
package dev.hixo.M.s.K;

import dev.hixo.M.G;
import dev.hixo.M.K;
import dev.hixo.M.d;
import dev.hixo.M.s.K.p;
import dev.hixo.T.E;
import dev.hixo.b.g;
import dev.hixo.t.q.p_0;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import net.fabricmc.fabric.api.client.rendering.v1.WorldRenderContext;
import net.minecraft.class_1937;
import net.minecraft.class_2281;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_238;
import net.minecraft.class_2586;
import net.minecraft.class_2595;
import net.minecraft.class_2611;
import net.minecraft.class_2680;
import net.minecraft.class_2745;
import net.minecraft.class_2818;
import net.minecraft.class_287;
import net.minecraft.class_4587;
import org.joml.Matrix4f;

public class U
extends G {
    public final g O;
    public final g Z;
    public final g q;
    public final g n;
    private boolean V;
    private final List<class_238> k;
    private final List<class_238> u;
    private final List<class_238> N;
    private int v;
    private static final String[] c;

    public U() {
        String[] stringArray = c;
        super((K)((Object)d.a("\u00fd", (long)63693867768511465L) /* => dev.hixo.M.K.RENDER */), stringArray[0], stringArray[2]);
        this.O = new g(stringArray[3], true);
        this.Z = new g(stringArray[1], true);
        this.q = new g(stringArray[4], true);
        this.n = new g(stringArray[5], true);
        d.a("\u00e7", (Object)this, (boolean)false, (long)139210539762958651L) /* => dev.hixo.M.s.K.U.V */;
        this.k = new CopyOnWriteArrayList<class_238>();
        this.u = new CopyOnWriteArrayList<class_238>();
        this.N = new CopyOnWriteArrayList<class_238>();
        d.a("\u00e7", (Object)this, (int)0, (long)185339048752085776L) /* => dev.hixo.M.s.K.U.v */;
        d.a("$", (Object)this, (int)0, (long)113806433936288059L) /* => dev.hixo.M.G.z */;
    }

    @Override
    public void I() {
        super.I();
        if (d.a("z", (Object)this, (long)139210539762958651L) /* => dev.hixo.M.s.K.U.V */ == false) {
            d.a("$", (Object)d.a("\u00fd", (long)41498357980631213L) /* => net.fabricmc.fabric.api.client.rendering.v1.WorldRenderEvents.AFTER_TRANSLUCENT */, this::C, (long)90971067691639174L) /* => net.fabricmc.fabric.api.event.Event.register */;
            d.a("\u00e7", (Object)this, (boolean)true, (long)139210539762958651L) /* => dev.hixo.M.s.K.U.V */;
        }
        d.a("\u00e7", (Object)this, (int)0, (long)185339048752085776L) /* => dev.hixo.M.s.K.U.v */;
    }

    @Override
    public void a() {
        super.a();
        d.a("$", (Object)d.a("z", (Object)this, (long)140178363798669437L) /* => dev.hixo.M.s.K.U.k */, (long)191130606908305482L) /* => java.util.List.clear */;
        d.a("$", (Object)d.a("z", (Object)this, (long)72066604684558396L) /* => dev.hixo.M.s.K.U.u */, (long)191130606908305482L) /* => java.util.List.clear */;
        d.a("$", (Object)d.a("z", (Object)this, (long)119475424839982742L) /* => dev.hixo.M.s.K.U.N */, (long)191130606908305482L) /* => java.util.List.clear */;
    }

    @E
    public void V(p_0 p_02) {
        if (d.a("$", (Object)d.a("$", (Object)p_02, (long)52512254813896748L) /* => dev.hixo.T.q.p.W */, (Object)d.a("\u00fd", (long)199476637466971905L) /* => dev.hixo.T.S.PRE */, (long)115634047609526502L) /* => dev.hixo.T.S.equals */ == false) {
            return;
        }
        if (d.a("z", (Object)d.a("\u00fd", (long)191291687252741418L) /* => dev.hixo.M.G.a */, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */ == null || d.a("z", (Object)d.a("\u00fd", (long)191291687252741418L) /* => dev.hixo.M.G.a */, (long)38197671011210569L) /* => net.minecraft.class_310.field_1687 */ == null) {
            return;
        }
        U u2 = this;
        CallSite callSite = d.a("z", (Object)u2, (long)185339048752085776L) /* => dev.hixo.M.s.K.U.v */;
        d.a("\u00e7", (Object)u2, (int)(callSite + true), (long)185339048752085776L) /* => dev.hixo.M.s.K.U.v */;
        if (callSite < 20) {
            return;
        }
        d.a("\u00e7", (Object)this, (int)0, (long)185339048752085776L) /* => dev.hixo.M.s.K.U.v */;
        d.a("$", (Object)this, (long)79064975728283210L) /* => dev.hixo.M.s.K.U.E */;
    }

    /*
     * WARNING - void declaration
     */
    private void E() {
        block16: {
            void var10_11;
            int n2;
            block20: {
                block19: {
                    CallSite callSite;
                    block18: {
                        n2 = p.d;
                        callSite = d.a("\u00fd", (long)191291687252741418L) /* => dev.hixo.M.G.a */;
                        if (n2 != 0) break block18;
                        if (d.a("z", (Object)callSite, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */ == null) break block19;
                        callSite = d.a("\u00fd", (long)191291687252741418L) /* => dev.hixo.M.G.a */;
                    }
                    if (d.a("z", (Object)callSite, (long)38197671011210569L) /* => net.minecraft.class_310.field_1687 */ != null) break block20;
                }
                return;
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            CallSite callSite = d.a("$", (Object)d.a("z", (Object)d.a("\u00fd", (long)191291687252741418L) /* => dev.hixo.M.G.a */, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (long)62351957165567498L) /* => net.minecraft.class_746.method_24515 */;
            int n3 = 32;
            int n4 = (n3 >> 4) + 1;
            reference var8_8 = d.a("$", (Object)callSite, (long)146045060684696872L) /* => net.minecraft.class_2338.method_10263 */ >> 4;
            reference var9_9 = d.a("$", (Object)callSite, (long)141489615891003620L) /* => net.minecraft.class_2338.method_10260 */ >> 4;
            reference var10_10 = var8_8 - n4;
            while (var10_11 <= var8_8 + n4) {
                block17: {
                    if (n2 != 0) break block16;
                    CallSite callSite2 = var9_9 - n4;
                    block1: while (true) {
                        CallSite callSite3 = callSite2;
                        block2: while (callSite3 <= var9_9 + n4) {
                            block22: {
                                CallSite callSite4;
                                block23: {
                                    CallSite callSite5;
                                    block21: {
                                        if (n2 != 0) break block17;
                                        callSite4 = callSite5 = d.a("$", (Object)d.a("z", (Object)d.a("\u00fd", (long)191291687252741418L) /* => dev.hixo.M.G.a */, (long)38197671011210569L) /* => net.minecraft.class_310.field_1687 */, (int)var10_11, (int)callSite2, (long)188430746550559589L) /* => net.minecraft.class_638.method_8497 */;
                                        if (n2 != 0) break block21;
                                        if (callSite4 == null) break block22;
                                        callSite4 = callSite5;
                                    }
                                    if (n2 != 0) break block23;
                                    if (!(callSite4 instanceof class_2818)) break block22;
                                    callSite4 = (class_2818)callSite5;
                                }
                                CallSite callSite6 = callSite4;
                                CallSite callSite7 = d.a("$", (Object)d.a("$", (Object)d.a("$", (Object)callSite6, (long)50587357730439206L) /* => net.minecraft.class_2818.method_12214 */, (long)103619893215853235L) /* => java.util.Map.values */, (long)76211354953178111L) /* => java.util.Collection.iterator */;
                                while (d.a("$", (Object)callSite7, (long)175361412755674352L) /* => java.util.Iterator.hasNext */ != false) {
                                    block32: {
                                        Object object;
                                        CallSite callSite8;
                                        block33: {
                                            class_2586 class_25862;
                                            block27: {
                                                class_2586 class_25863;
                                                block28: {
                                                    block31: {
                                                        CallSite callSite9;
                                                        block29: {
                                                            block30: {
                                                                class_2745 class_27452;
                                                                CallSite callSite10;
                                                                Object object2;
                                                                block26: {
                                                                    Object object3;
                                                                    CallSite callSite11;
                                                                    block25: {
                                                                        CallSite callSite12;
                                                                        block24: {
                                                                            class_25863 = (class_2586)d.a("$", (Object)callSite7, (long)64633749944946827L) /* => java.util.Iterator.next */;
                                                                            callSite8 = d.a("$", (Object)class_25863, (long)160121134513001485L) /* => net.minecraft.class_2586.method_11016 */;
                                                                            callSite3 = d.a("$", (Object)callSite8, (long)146045060684696872L) /* => net.minecraft.class_2338.method_10263 */;
                                                                            if (n2 != 0) continue block2;
                                                                            if (n2 != 0) break block24;
                                                                            if (d.a("\u00f9", (int)(callSite3 - d.a("$", (Object)callSite, (long)146045060684696872L) /* => net.minecraft.class_2338.method_10263 */), (long)80759342818032744L) /* => java.lang.Math.abs */ > n3) continue;
                                                                            callSite11 = d.a("$", (Object)callSite8, (long)36264061574346644L) /* => net.minecraft.class_2338.method_10264 */;
                                                                            object3 = d.a("$", (Object)callSite, (long)36264061574346644L) /* => net.minecraft.class_2338.method_10264 */;
                                                                            if (n2 != 0) break block25;
                                                                            callSite12 = d.a("\u00f9", (int)(callSite11 - object3), (long)80759342818032744L) /* => java.lang.Math.abs */;
                                                                        }
                                                                        if (callSite12 > n3) continue;
                                                                        object2 = d.a("$", (Object)callSite8, (long)141489615891003620L) /* => net.minecraft.class_2338.method_10260 */;
                                                                        if (n2 != 0) break block26;
                                                                        callSite11 = d.a("\u00f9", (int)(object2 - d.a("$", (Object)callSite, (long)141489615891003620L) /* => net.minecraft.class_2338.method_10260 */), (long)80759342818032744L) /* => java.lang.Math.abs */;
                                                                        object3 = n3;
                                                                    }
                                                                    if (callSite11 > object3) continue;
                                                                    class_25862 = class_25863;
                                                                    if (n2 != 0) break block27;
                                                                    object2 = class_25862 instanceof class_2595;
                                                                }
                                                                if (object2 == false) break block28;
                                                                CallSite callSite13 = callSite10 = d.a("$", (Object)d.a("z", (Object)d.a("\u00fd", (long)191291687252741418L) /* => dev.hixo.M.G.a */, (long)38197671011210569L) /* => net.minecraft.class_310.field_1687 */, (Object)callSite8, (long)170782435888130580L) /* => net.minecraft.class_638.method_8320 */;
                                                                if (n2 == 0) {
                                                                    if (!(d.a("$", (Object)callSite13, (long)89715234522094410L) /* => net.minecraft.class_2680.method_26204 */ instanceof class_2281)) continue;
                                                                    callSite13 = callSite10;
                                                                }
                                                                if ((class_27452 = (class_2745)d.a("$", (Object)callSite13, (Object)d.a("\u00fd", (long)34391757548349038L) /* => net.minecraft.class_2281.field_10770 */, (long)39707677163647470L) /* => net.minecraft.class_2680.method_11654 */) == d.a("\u00fd", (long)41202437015250692L) /* => net.minecraft.class_2745.field_12574 */ || (callSite9 = d.a("$", (Object)this, (Object)d.a("z", (Object)d.a("\u00fd", (long)191291687252741418L) /* => dev.hixo.M.G.a */, (long)38197671011210569L) /* => net.minecraft.class_310.field_1687 */, (Object)callSite8, (Object)callSite10, (long)202067928453863858L) /* => dev.hixo.M.s.K.U.h */) == null) continue;
                                                                if (d.a("$", (Object)callSite10, (long)89715234522094410L) /* => net.minecraft.class_2680.method_26204 */ != d.a("\u00fd", (long)40885568595480259L) /* => net.minecraft.class_2246.field_10380 */) break block29;
                                                                CallSite callSite14 = d.a("$", (Object)d.a("z", (Object)this, (long)55558927399039921L) /* => dev.hixo.M.s.K.U.Z */, (long)65580906021680841L) /* => dev.hixo.b.g.x */;
                                                                if (n2 != 0) break block30;
                                                                if (callSite14 == false) break block31;
                                                                callSite14 = d.a("$", arrayList2, (Object)callSite9, (long)184435215000867819L) /* => java.util.List.add */;
                                                            }
                                                            if (n2 == 0) break block31;
                                                        }
                                                        CallSite callSite15 = d.a("$", (Object)d.a("z", (Object)this, (long)54163617988641457L) /* => dev.hixo.M.s.K.U.O */, (long)65580906021680841L) /* => dev.hixo.b.g.x */;
                                                        if (n2 == 0 && callSite15 != false) {
                                                            callSite15 = d.a("$", arrayList, (Object)callSite9, (long)184435215000867819L) /* => java.util.List.add */;
                                                        }
                                                    }
                                                    if (n2 == 0) break block32;
                                                }
                                                class_25862 = class_25863;
                                            }
                                            object = class_25862 instanceof class_2611;
                                            if (n2 != 0) break block33;
                                            if (!object) break block32;
                                            object = d.a("$", (Object)d.a("z", (Object)this, (long)176143147605304990L) /* => dev.hixo.M.s.K.U.q */, (long)65580906021680841L) /* => dev.hixo.b.g.x */;
                                        }
                                        if (n2 == 0 && object) {
                                            object = d.a("$", arrayList3, (Object)d.a("$", (Object)new class_238((class_2338)callSite8), (double)0.0625, (double)0.0, (double)0.0625, (long)43220379489392683L) /* => net.minecraft.class_238.method_1009 */, (long)184435215000867819L) /* => java.util.List.add */;
                                        }
                                    }
                                    if (n2 == 0) continue;
                                }
                            }
                            ++callSite2;
                            if (n2 == 0) continue block1;
                        }
                        break;
                    }
                    ++var10_11;
                }
                if (n2 == 0) continue;
            }
            d.a("$", (Object)d.a("z", (Object)this, (long)140178363798669437L) /* => dev.hixo.M.s.K.U.k */, (long)191130606908305482L) /* => java.util.List.clear */;
            d.a("$", (Object)d.a("z", (Object)this, (long)140178363798669437L) /* => dev.hixo.M.s.K.U.k */, arrayList, (long)136382452326560341L) /* => java.util.List.addAll */;
            d.a("$", (Object)d.a("z", (Object)this, (long)72066604684558396L) /* => dev.hixo.M.s.K.U.u */, (long)191130606908305482L) /* => java.util.List.clear */;
            d.a("$", (Object)d.a("z", (Object)this, (long)72066604684558396L) /* => dev.hixo.M.s.K.U.u */, arrayList2, (long)136382452326560341L) /* => java.util.List.addAll */;
            d.a("$", (Object)d.a("z", (Object)this, (long)119475424839982742L) /* => dev.hixo.M.s.K.U.N */, (long)191130606908305482L) /* => java.util.List.clear */;
            d.a("$", (Object)d.a("z", (Object)this, (long)119475424839982742L) /* => dev.hixo.M.s.K.U.N */, arrayList3, (long)136382452326560341L) /* => java.util.List.addAll */;
        }
    }

    private void C(WorldRenderContext worldRenderContext) {
        if (d.a("$", (Object)this, (long)96089342888548907L) /* => dev.hixo.M.G.c */ == false) {
            return;
        }
        CallSite callSite = d.a("\u00f9", (long)179869930689441125L) /* => net.minecraft.class_310.method_1551 */;
        if (d.a("z", (Object)callSite, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */ == null || d.a("z", (Object)callSite, (long)38197671011210569L) /* => net.minecraft.class_310.field_1687 */ == null) {
            return;
        }
        CallSite callSite2 = d.a("$", (Object)worldRenderContext, (long)117893513461834714L) /* => net.fabricmc.fabric.api.client.rendering.v1.WorldRenderContext.matrixStack */;
        if (callSite2 == null) {
            return;
        }
        if (d.a("$", (Object)d.a("z", (Object)this, (long)115376213082329200L) /* => dev.hixo.M.s.K.U.n */, (long)65580906021680841L) /* => dev.hixo.b.g.x */ != false) {
            d.a("\u00f9", (long)47210620476595523L) /* => com.mojang.blaze3d.systems.RenderSystem.disableDepthTest */;
        }
        d.a("\u00f9", (long)171790026474808587L) /* => com.mojang.blaze3d.systems.RenderSystem.enableBlend */;
        d.a("\u00f9", (long)35570276773764026L) /* => com.mojang.blaze3d.systems.RenderSystem.defaultBlendFunc */;
        d.a("$", (Object)this, (Object)callSite2, (Object)d.a("z", (Object)this, (long)140178363798669437L) /* => dev.hixo.M.s.K.U.k */, (Object)new Color(0, 255, 0, 200), (long)159173251839207626L) /* => dev.hixo.M.s.K.U.z */;
        d.a("$", (Object)this, (Object)callSite2, (Object)d.a("z", (Object)this, (long)72066604684558396L) /* => dev.hixo.M.s.K.U.u */, (Object)new Color(255, 80, 0, 200), (long)159173251839207626L) /* => dev.hixo.M.s.K.U.z */;
        d.a("$", (Object)this, (Object)callSite2, (Object)d.a("z", (Object)this, (long)119475424839982742L) /* => dev.hixo.M.s.K.U.N */, (Object)new Color(180, 0, 255, 200), (long)159173251839207626L) /* => dev.hixo.M.s.K.U.z */;
        d.a("\u00f9", (long)111372239067536238L) /* => com.mojang.blaze3d.systems.RenderSystem.disableBlend */;
        d.a("\u00f9", (long)56956175505444518L) /* => com.mojang.blaze3d.systems.RenderSystem.enableDepthTest */;
    }

    private class_238 h(class_1937 class_19372, class_2338 class_23382, class_2680 class_26802) {
        class_2745 class_27452 = (class_2745)d.a("$", (Object)class_26802, (Object)d.a("\u00fd", (long)34391757548349038L) /* => net.minecraft.class_2281.field_10770 */, (long)39707677163647470L) /* => net.minecraft.class_2680.method_11654 */;
        Object object = new class_238(class_23382);
        if (class_27452 != d.a("\u00fd", (long)109216478555586371L) /* => net.minecraft.class_2745.field_12569 */) {
            class_2350 class_23502 = (class_2350)d.a("$", (Object)class_26802, (Object)d.a("\u00fd", (long)80273997301417185L) /* => net.minecraft.class_2281.field_10768 */, (long)39707677163647470L) /* => net.minecraft.class_2680.method_11654 */;
            CallSite callSite = class_27452 == d.a("\u00fd", (long)179033845127107975L) /* => net.minecraft.class_2745.field_12571 */ ? d.a("$", (Object)class_23502, (long)166937448954837685L) /* => net.minecraft.class_2350.method_10170 */ : d.a("$", (Object)class_23502, (long)140903452203826912L) /* => net.minecraft.class_2350.method_10160 */;
            CallSite callSite2 = d.a("$", (Object)class_23382, (Object)callSite, (long)70337776471491941L) /* => net.minecraft.class_2338.method_10093 */;
            class_238 class_2382 = new class_238((class_2338)callSite2);
            object = d.a("$", (Object)object, (Object)class_2382, (long)140435788319564050L) /* => net.minecraft.class_238.method_991 */;
        }
        return d.a("$", (Object)d.a("$", (Object)object, (double)-0.0625, (double)0.0, (double)-0.0625, (long)43220379489392683L) /* => net.minecraft.class_238.method_1009 */, (double)0.0, (double)-0.0625, (double)0.0, (long)46834034994569020L) /* => net.minecraft.class_238.method_1012 */;
    }

    private void z(class_4587 class_45872, List<class_238> list, Color color) {
        if (d.a("$", list, (long)184224858935663280L) /* => java.util.List.isEmpty */ != false) {
            return;
        }
        try {
            CallSite callSite = d.a("\u00f9", (long)169852566105857743L) /* => net.minecraft.class_289.method_1348 */;
            CallSite callSite2 = d.a("$", (Object)callSite, (Object)d.a("\u00fd", (long)37060526761024368L) /* => net.minecraft.class_293$class_5596.field_29344 */, (Object)d.a("\u00fd", (long)99785419235178649L) /* => net.minecraft.class_290.field_1576 */, (long)199622338865663900L) /* => net.minecraft.class_289.method_60827 */;
            CallSite callSite3 = d.a("$", (Object)d.a("$", (Object)class_45872, (long)97471359082572647L) /* => net.minecraft.class_4587.method_23760 */, (long)113700312997324141L) /* => net.minecraft.class_4587$class_4665.method_23761 */;
            CallSite callSite4 = d.a("$", list, (long)113221006393852506L) /* => java.util.List.iterator */;
            while (d.a("$", (Object)callSite4, (long)175361412755674352L) /* => java.util.Iterator.hasNext */ != false) {
                class_238 class_2382 = (class_238)d.a("$", (Object)callSite4, (long)64633749944946827L) /* => java.util.Iterator.next */;
                d.a("$", (Object)this, (Object)callSite2, (Object)callSite3, (Object)class_2382, (Object)color, (long)68450287911413728L) /* => dev.hixo.M.s.K.U.x */;
            }
            d.a("\u00f9", (Object)d.a("$", (Object)callSite2, (long)187674277782318066L) /* => net.minecraft.class_287.method_60800 */, (long)38987589419994316L) /* => net.minecraft.class_286.method_43433 */;
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    private void x(class_287 class_2872, Matrix4f matrix4f, class_238 class_2382, Color color) {
        float f = (float)d.a("$", (Object)color, (long)187898433921536053L) /* => java.awt.Color.getRed */ / 255.0f;
        float f2 = (float)d.a("$", (Object)color, (long)162797136666712529L) /* => java.awt.Color.getGreen */ / 255.0f;
        float f3 = (float)d.a("$", (Object)color, (long)158063203583267738L) /* => java.awt.Color.getBlue */ / 255.0f;
        float f4 = (float)d.a("$", (Object)color, (long)169924750293442172L) /* => java.awt.Color.getAlpha */ / 255.0f;
        d.a("$", (Object)d.a("$", (Object)class_2872, (Object)matrix4f, (float)((float)d.a("z", (Object)class_2382, (long)177922596087782249L) /* => net.minecraft.class_238.field_1323 */), (float)((float)d.a("z", (Object)class_2382, (long)177966774934378051L) /* => net.minecraft.class_238.field_1322 */), (float)((float)d.a("z", (Object)class_2382, (long)117426342739757700L) /* => net.minecraft.class_238.field_1321 */), (long)45914431249797495L) /* => net.minecraft.class_287.method_22918 */, (float)f, (float)f2, (float)f3, (float)f4, (long)171274618387020276L) /* => net.minecraft.class_4588.method_22915 */;
        d.a("$", (Object)d.a("$", (Object)class_2872, (Object)matrix4f, (float)((float)d.a("z", (Object)class_2382, (long)179412265540759175L) /* => net.minecraft.class_238.field_1320 */), (float)((float)d.a("z", (Object)class_2382, (long)177966774934378051L) /* => net.minecraft.class_238.field_1322 */), (float)((float)d.a("z", (Object)class_2382, (long)117426342739757700L) /* => net.minecraft.class_238.field_1321 */), (long)45914431249797495L) /* => net.minecraft.class_287.method_22918 */, (float)f, (float)f2, (float)f3, (float)f4, (long)171274618387020276L) /* => net.minecraft.class_4588.method_22915 */;
        d.a("$", (Object)d.a("$", (Object)class_2872, (Object)matrix4f, (float)((float)d.a("z", (Object)class_2382, (long)179412265540759175L) /* => net.minecraft.class_238.field_1320 */), (float)((float)d.a("z", (Object)class_2382, (long)177966774934378051L) /* => net.minecraft.class_238.field_1322 */), (float)((float)d.a("z", (Object)class_2382, (long)117426342739757700L) /* => net.minecraft.class_238.field_1321 */), (long)45914431249797495L) /* => net.minecraft.class_287.method_22918 */, (float)f, (float)f2, (float)f3, (float)f4, (long)171274618387020276L) /* => net.minecraft.class_4588.method_22915 */;
        d.a("$", (Object)d.a("$", (Object)class_2872, (Object)matrix4f, (float)((float)d.a("z", (Object)class_2382, (long)179412265540759175L) /* => net.minecraft.class_238.field_1320 */), (float)((float)d.a("z", (Object)class_2382, (long)177966774934378051L) /* => net.minecraft.class_238.field_1322 */), (float)((float)d.a("z", (Object)class_2382, (long)71869161352084160L) /* => net.minecraft.class_238.field_1324 */), (long)45914431249797495L) /* => net.minecraft.class_287.method_22918 */, (float)f, (float)f2, (float)f3, (float)f4, (long)171274618387020276L) /* => net.minecraft.class_4588.method_22915 */;
        d.a("$", (Object)d.a("$", (Object)class_2872, (Object)matrix4f, (float)((float)d.a("z", (Object)class_2382, (long)179412265540759175L) /* => net.minecraft.class_238.field_1320 */), (float)((float)d.a("z", (Object)class_2382, (long)177966774934378051L) /* => net.minecraft.class_238.field_1322 */), (float)((float)d.a("z", (Object)class_2382, (long)71869161352084160L) /* => net.minecraft.class_238.field_1324 */), (long)45914431249797495L) /* => net.minecraft.class_287.method_22918 */, (float)f, (float)f2, (float)f3, (float)f4, (long)171274618387020276L) /* => net.minecraft.class_4588.method_22915 */;
        d.a("$", (Object)d.a("$", (Object)class_2872, (Object)matrix4f, (float)((float)d.a("z", (Object)class_2382, (long)177922596087782249L) /* => net.minecraft.class_238.field_1323 */), (float)((float)d.a("z", (Object)class_2382, (long)177966774934378051L) /* => net.minecraft.class_238.field_1322 */), (float)((float)d.a("z", (Object)class_2382, (long)71869161352084160L) /* => net.minecraft.class_238.field_1324 */), (long)45914431249797495L) /* => net.minecraft.class_287.method_22918 */, (float)f, (float)f2, (float)f3, (float)f4, (long)171274618387020276L) /* => net.minecraft.class_4588.method_22915 */;
        d.a("$", (Object)d.a("$", (Object)class_2872, (Object)matrix4f, (float)((float)d.a("z", (Object)class_2382, (long)177922596087782249L) /* => net.minecraft.class_238.field_1323 */), (float)((float)d.a("z", (Object)class_2382, (long)177966774934378051L) /* => net.minecraft.class_238.field_1322 */), (float)((float)d.a("z", (Object)class_2382, (long)71869161352084160L) /* => net.minecraft.class_238.field_1324 */), (long)45914431249797495L) /* => net.minecraft.class_287.method_22918 */, (float)f, (float)f2, (float)f3, (float)f4, (long)171274618387020276L) /* => net.minecraft.class_4588.method_22915 */;
        d.a("$", (Object)d.a("$", (Object)class_2872, (Object)matrix4f, (float)((float)d.a("z", (Object)class_2382, (long)177922596087782249L) /* => net.minecraft.class_238.field_1323 */), (float)((float)d.a("z", (Object)class_2382, (long)177966774934378051L) /* => net.minecraft.class_238.field_1322 */), (float)((float)d.a("z", (Object)class_2382, (long)117426342739757700L) /* => net.minecraft.class_238.field_1321 */), (long)45914431249797495L) /* => net.minecraft.class_287.method_22918 */, (float)f, (float)f2, (float)f3, (float)f4, (long)171274618387020276L) /* => net.minecraft.class_4588.method_22915 */;
        d.a("$", (Object)d.a("$", (Object)class_2872, (Object)matrix4f, (float)((float)d.a("z", (Object)class_2382, (long)177922596087782249L) /* => net.minecraft.class_238.field_1323 */), (float)((float)d.a("z", (Object)class_2382, (long)81730488982605762L) /* => net.minecraft.class_238.field_1325 */), (float)((float)d.a("z", (Object)class_2382, (long)117426342739757700L) /* => net.minecraft.class_238.field_1321 */), (long)45914431249797495L) /* => net.minecraft.class_287.method_22918 */, (float)f, (float)f2, (float)f3, (float)f4, (long)171274618387020276L) /* => net.minecraft.class_4588.method_22915 */;
        d.a("$", (Object)d.a("$", (Object)class_2872, (Object)matrix4f, (float)((float)d.a("z", (Object)class_2382, (long)179412265540759175L) /* => net.minecraft.class_238.field_1320 */), (float)((float)d.a("z", (Object)class_2382, (long)81730488982605762L) /* => net.minecraft.class_238.field_1325 */), (float)((float)d.a("z", (Object)class_2382, (long)117426342739757700L) /* => net.minecraft.class_238.field_1321 */), (long)45914431249797495L) /* => net.minecraft.class_287.method_22918 */, (float)f, (float)f2, (float)f3, (float)f4, (long)171274618387020276L) /* => net.minecraft.class_4588.method_22915 */;
        d.a("$", (Object)d.a("$", (Object)class_2872, (Object)matrix4f, (float)((float)d.a("z", (Object)class_2382, (long)179412265540759175L) /* => net.minecraft.class_238.field_1320 */), (float)((float)d.a("z", (Object)class_2382, (long)81730488982605762L) /* => net.minecraft.class_238.field_1325 */), (float)((float)d.a("z", (Object)class_2382, (long)117426342739757700L) /* => net.minecraft.class_238.field_1321 */), (long)45914431249797495L) /* => net.minecraft.class_287.method_22918 */, (float)f, (float)f2, (float)f3, (float)f4, (long)171274618387020276L) /* => net.minecraft.class_4588.method_22915 */;
        d.a("$", (Object)d.a("$", (Object)class_2872, (Object)matrix4f, (float)((float)d.a("z", (Object)class_2382, (long)179412265540759175L) /* => net.minecraft.class_238.field_1320 */), (float)((float)d.a("z", (Object)class_2382, (long)81730488982605762L) /* => net.minecraft.class_238.field_1325 */), (float)((float)d.a("z", (Object)class_2382, (long)71869161352084160L) /* => net.minecraft.class_238.field_1324 */), (long)45914431249797495L) /* => net.minecraft.class_287.method_22918 */, (float)f, (float)f2, (float)f3, (float)f4, (long)171274618387020276L) /* => net.minecraft.class_4588.method_22915 */;
        d.a("$", (Object)d.a("$", (Object)class_2872, (Object)matrix4f, (float)((float)d.a("z", (Object)class_2382, (long)179412265540759175L) /* => net.minecraft.class_238.field_1320 */), (float)((float)d.a("z", (Object)class_2382, (long)81730488982605762L) /* => net.minecraft.class_238.field_1325 */), (float)((float)d.a("z", (Object)class_2382, (long)71869161352084160L) /* => net.minecraft.class_238.field_1324 */), (long)45914431249797495L) /* => net.minecraft.class_287.method_22918 */, (float)f, (float)f2, (float)f3, (float)f4, (long)171274618387020276L) /* => net.minecraft.class_4588.method_22915 */;
        d.a("$", (Object)d.a("$", (Object)class_2872, (Object)matrix4f, (float)((float)d.a("z", (Object)class_2382, (long)177922596087782249L) /* => net.minecraft.class_238.field_1323 */), (float)((float)d.a("z", (Object)class_2382, (long)81730488982605762L) /* => net.minecraft.class_238.field_1325 */), (float)((float)d.a("z", (Object)class_2382, (long)71869161352084160L) /* => net.minecraft.class_238.field_1324 */), (long)45914431249797495L) /* => net.minecraft.class_287.method_22918 */, (float)f, (float)f2, (float)f3, (float)f4, (long)171274618387020276L) /* => net.minecraft.class_4588.method_22915 */;
        d.a("$", (Object)d.a("$", (Object)class_2872, (Object)matrix4f, (float)((float)d.a("z", (Object)class_2382, (long)177922596087782249L) /* => net.minecraft.class_238.field_1323 */), (float)((float)d.a("z", (Object)class_2382, (long)81730488982605762L) /* => net.minecraft.class_238.field_1325 */), (float)((float)d.a("z", (Object)class_2382, (long)71869161352084160L) /* => net.minecraft.class_238.field_1324 */), (long)45914431249797495L) /* => net.minecraft.class_287.method_22918 */, (float)f, (float)f2, (float)f3, (float)f4, (long)171274618387020276L) /* => net.minecraft.class_4588.method_22915 */;
        d.a("$", (Object)d.a("$", (Object)class_2872, (Object)matrix4f, (float)((float)d.a("z", (Object)class_2382, (long)177922596087782249L) /* => net.minecraft.class_238.field_1323 */), (float)((float)d.a("z", (Object)class_2382, (long)81730488982605762L) /* => net.minecraft.class_238.field_1325 */), (float)((float)d.a("z", (Object)class_2382, (long)117426342739757700L) /* => net.minecraft.class_238.field_1321 */), (long)45914431249797495L) /* => net.minecraft.class_287.method_22918 */, (float)f, (float)f2, (float)f3, (float)f4, (long)171274618387020276L) /* => net.minecraft.class_4588.method_22915 */;
        d.a("$", (Object)d.a("$", (Object)class_2872, (Object)matrix4f, (float)((float)d.a("z", (Object)class_2382, (long)177922596087782249L) /* => net.minecraft.class_238.field_1323 */), (float)((float)d.a("z", (Object)class_2382, (long)177966774934378051L) /* => net.minecraft.class_238.field_1322 */), (float)((float)d.a("z", (Object)class_2382, (long)117426342739757700L) /* => net.minecraft.class_238.field_1321 */), (long)45914431249797495L) /* => net.minecraft.class_287.method_22918 */, (float)f, (float)f2, (float)f3, (float)f4, (long)171274618387020276L) /* => net.minecraft.class_4588.method_22915 */;
        d.a("$", (Object)d.a("$", (Object)class_2872, (Object)matrix4f, (float)((float)d.a("z", (Object)class_2382, (long)177922596087782249L) /* => net.minecraft.class_238.field_1323 */), (float)((float)d.a("z", (Object)class_2382, (long)81730488982605762L) /* => net.minecraft.class_238.field_1325 */), (float)((float)d.a("z", (Object)class_2382, (long)117426342739757700L) /* => net.minecraft.class_238.field_1321 */), (long)45914431249797495L) /* => net.minecraft.class_287.method_22918 */, (float)f, (float)f2, (float)f3, (float)f4, (long)171274618387020276L) /* => net.minecraft.class_4588.method_22915 */;
        d.a("$", (Object)d.a("$", (Object)class_2872, (Object)matrix4f, (float)((float)d.a("z", (Object)class_2382, (long)179412265540759175L) /* => net.minecraft.class_238.field_1320 */), (float)((float)d.a("z", (Object)class_2382, (long)177966774934378051L) /* => net.minecraft.class_238.field_1322 */), (float)((float)d.a("z", (Object)class_2382, (long)117426342739757700L) /* => net.minecraft.class_238.field_1321 */), (long)45914431249797495L) /* => net.minecraft.class_287.method_22918 */, (float)f, (float)f2, (float)f3, (float)f4, (long)171274618387020276L) /* => net.minecraft.class_4588.method_22915 */;
        d.a("$", (Object)d.a("$", (Object)class_2872, (Object)matrix4f, (float)((float)d.a("z", (Object)class_2382, (long)179412265540759175L) /* => net.minecraft.class_238.field_1320 */), (float)((float)d.a("z", (Object)class_2382, (long)81730488982605762L) /* => net.minecraft.class_238.field_1325 */), (float)((float)d.a("z", (Object)class_2382, (long)117426342739757700L) /* => net.minecraft.class_238.field_1321 */), (long)45914431249797495L) /* => net.minecraft.class_287.method_22918 */, (float)f, (float)f2, (float)f3, (float)f4, (long)171274618387020276L) /* => net.minecraft.class_4588.method_22915 */;
        d.a("$", (Object)d.a("$", (Object)class_2872, (Object)matrix4f, (float)((float)d.a("z", (Object)class_2382, (long)179412265540759175L) /* => net.minecraft.class_238.field_1320 */), (float)((float)d.a("z", (Object)class_2382, (long)177966774934378051L) /* => net.minecraft.class_238.field_1322 */), (float)((float)d.a("z", (Object)class_2382, (long)71869161352084160L) /* => net.minecraft.class_238.field_1324 */), (long)45914431249797495L) /* => net.minecraft.class_287.method_22918 */, (float)f, (float)f2, (float)f3, (float)f4, (long)171274618387020276L) /* => net.minecraft.class_4588.method_22915 */;
        d.a("$", (Object)d.a("$", (Object)class_2872, (Object)matrix4f, (float)((float)d.a("z", (Object)class_2382, (long)179412265540759175L) /* => net.minecraft.class_238.field_1320 */), (float)((float)d.a("z", (Object)class_2382, (long)81730488982605762L) /* => net.minecraft.class_238.field_1325 */), (float)((float)d.a("z", (Object)class_2382, (long)71869161352084160L) /* => net.minecraft.class_238.field_1324 */), (long)45914431249797495L) /* => net.minecraft.class_287.method_22918 */, (float)f, (float)f2, (float)f3, (float)f4, (long)171274618387020276L) /* => net.minecraft.class_4588.method_22915 */;
        d.a("$", (Object)d.a("$", (Object)class_2872, (Object)matrix4f, (float)((float)d.a("z", (Object)class_2382, (long)177922596087782249L) /* => net.minecraft.class_238.field_1323 */), (float)((float)d.a("z", (Object)class_2382, (long)177966774934378051L) /* => net.minecraft.class_238.field_1322 */), (float)((float)d.a("z", (Object)class_2382, (long)71869161352084160L) /* => net.minecraft.class_238.field_1324 */), (long)45914431249797495L) /* => net.minecraft.class_287.method_22918 */, (float)f, (float)f2, (float)f3, (float)f4, (long)171274618387020276L) /* => net.minecraft.class_4588.method_22915 */;
        d.a("$", (Object)d.a("$", (Object)class_2872, (Object)matrix4f, (float)((float)d.a("z", (Object)class_2382, (long)177922596087782249L) /* => net.minecraft.class_238.field_1323 */), (float)((float)d.a("z", (Object)class_2382, (long)81730488982605762L) /* => net.minecraft.class_238.field_1325 */), (float)((float)d.a("z", (Object)class_2382, (long)71869161352084160L) /* => net.minecraft.class_238.field_1324 */), (long)45914431249797495L) /* => net.minecraft.class_287.method_22918 */, (float)f, (float)f2, (float)f3, (float)f4, (long)171274618387020276L) /* => net.minecraft.class_4588.method_22915 */;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block19: {
            block18: {
                var5 = new String[6];
                var3_1 = 0;
                var2_2 = "U#y\u0012\u000fHRF\rB9}\u0011\u000bhe6\bt\u0004\by\u0006\u9ace\u4ee5\u6622\u795b\u7bca\u5b5d\u0005U#y\u0012\u000f";
                var4_3 = "U#y\u0012\u000fHRF\rB9}\u0011\u000bhe6\bt\u0004\by\u0006\u9ace\u4ee5\u6622\u795b\u7bca\u5b5d\u0005U#y\u0012\u000f".length();
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
                    var2_2 = "S%x\u0004\t-B~.o\u0015\rB#n\u000e\u000eji6\u001c}\r\u0017~";
                    var4_3 = "S%x\u0004\t-B~.o\u0015\rB#n\u000e\u000eji6\u001c}\r\u0017~".length();
                    var1_4 = 11;
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
                        v10 = 22;
                        break;
                    }
                    case 1: {
                        v10 = 75;
                        break;
                    }
                    case 2: {
                        v10 = 28;
                        break;
                    }
                    case 3: {
                        v10 = 97;
                        break;
                    }
                    case 4: {
                        v10 = 123;
                        break;
                    }
                    case 5: {
                        v10 = 13;
                        break;
                    }
                    default: {
                        v10 = 1;
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
        U.c = var5;
    }
}

