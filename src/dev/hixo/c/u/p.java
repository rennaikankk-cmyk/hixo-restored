/*
 * RESTORED SOURCE — decompiled reconstruction, not the original files.
 * class: dev.hixo.c.u.p
 * context strings: ' / '
 * decrypted string pool:
 *   a[0] =  / 
 *   a[1] = %.
 */

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_327
 *  net.minecraft.class_332
 */
package dev.hixo.c.u;

import dev.hixo.M.G;
import dev.hixo.M.K;
import dev.hixo.M.d;
import dev.hixo.b.C;
import dev.hixo.b.M;
import dev.hixo.b.g;
import dev.hixo.b.s;
import java.lang.invoke.CallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import net.minecraft.class_327;
import net.minecraft.class_332;

public final class p {
    private static final float e = 128.0f;
    private static final float u = 4.0f;
    private static final float E = 16.0f;
    private static final float l = 40.0f;
    private static final int H;
    private static final int D;
    private static final int G;
    private static final int K;
    private static final int Z;
    private static final int R = -1;
    private static final int f;
    private static final int y;
    private final List<K> T = new ArrayList<K>();
    private final Map<K, List<G>> W = new EnumMap<K, List<G>>(K.class);
    private final Map<K, G> C = new EnumMap<K, G>(K.class);
    private final Map<K, Float> X = new EnumMap<K, Float>(K.class);
    private final Map<K, c> U = new HashMap<K, c>();
    private final Map<K, c> g = new EnumMap<K, c>(K.class);
    private final Map<G, c> r = new HashMap<G, c>();
    private final Map<G, c> J = new HashMap<G, c>();
    private final Map<Object, c> Y = new HashMap<Object, c>();
    private final Map<M, float[]> o = new HashMap<M, float[]>();
    private final Map<G, Float> h = new HashMap<G, Float>();
    private long x;
    private long P;
    private M n;
    private K q;
    private final List<z> v;
    private static final Map<Class<?>, List<Field>> i;
    public static int s;
    private static final String[] a;
    private static final long[] b;
    private static final Integer[] c;
    private static final long[] d;
    private static final Long[] j;

    public p() {
        dev.hixo.M.d.a("\u00e7", (Object)this, (long)dev.hixo.M.d.a("\u00f9", (long)78882375305248292L) /* => java.lang.System.nanoTime */, (long)79348483839859764L) /* => dev.hixo.c.u.p.x */;
        dev.hixo.M.d.a("\u00e7", (Object)this, (long)p.b(14422, 589432920551370652L), (long)135113343169168471L) /* => dev.hixo.c.u.p.P */;
        this.v = new ArrayList<z>();
        CallSite callSite = dev.hixo.M.d.a("\u00f9", (long)179869930689441125L) /* => net.minecraft.class_310.method_1551 */;
        if (callSite == null || dev.hixo.M.d.a("\u00fd", (long)71498313283647962L) /* => dev.hixo.Hixo.INSTANCE */ == null) {
            return;
        }
        CallSite callSite2 = dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("\u00fd", (long)71498313283647962L) /* => dev.hixo.Hixo.INSTANCE */, (long)190425734249275754L) /* => dev.hixo.Hixo.getModuleManager */, (long)58260499210938850L) /* => dev.hixo.M.n.C */, (long)113221006393852506L) /* => java.util.List.iterator */;
        while (dev.hixo.M.d.a("$", (Object)callSite2, (long)175361412755674352L) /* => java.util.Iterator.hasNext */ != false) {
            G g2 = (G)((Object)dev.hixo.M.d.a("$", (Object)callSite2, (long)64633749944946827L) /* => java.util.Iterator.next */);
            dev.hixo.M.d.a("$", (Object)((List)((Object)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)81381928922745381L) /* => dev.hixo.c.u.p.W */, (Object)dev.hixo.M.d.a("$", (Object)g2, (long)118407510232379239L) /* => dev.hixo.M.G.P */, k2 -> new ArrayList(), (long)123211639374652458L) /* => java.util.Map.computeIfAbsent */)), (Object)g2, (long)184435215000867819L) /* => java.util.List.add */;
        }
        for (CallSite callSite3 : dev.hixo.M.d.a("\u00f9", (long)117546078189364258L) /* => dev.hixo.M.K.values */) {
            List list = (List)((Object)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)81381928922745381L) /* => dev.hixo.c.u.p.W */, (Object)callSite3, (long)150360683669181890L) /* => java.util.Map.get */);
            if (list == null || dev.hixo.M.d.a("$", (Object)list, (long)184224858935663280L) /* => java.util.List.isEmpty */ != false || dev.hixo.M.d.a("\u00fd", (long)75894116861205869L) /* => dev.hixo.M.s.A.l.r */ != null && dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("\u00fd", (long)75894116861205869L) /* => dev.hixo.M.s.A.l.r */, (Object)callSite3, (long)150302608133378369L) /* => dev.hixo.M.s.A.l.W */ != false) continue;
            dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)112410867447181304L) /* => dev.hixo.c.u.p.T */, (Object)callSite3, (long)184435215000867819L) /* => java.util.List.add */;
        }
    }

    public void o() {
        dev.hixo.M.d.a("\u00e7", (Object)this, (long)dev.hixo.M.d.a("\u00f9", (long)78882375305248292L) /* => java.lang.System.nanoTime */, (long)79348483839859764L) /* => dev.hixo.c.u.p.x */;
        dev.hixo.M.d.a("\u00e7", (Object)this, (long)p.b(10257, 6542920315211890650L), (long)135113343169168471L) /* => dev.hixo.c.u.p.P */;
        dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)42671516645783629L) /* => dev.hixo.c.u.p.C */, (long)197723832075338307L) /* => java.util.Map.clear */;
    }

    public void Q() {
        if (dev.hixo.M.d.a("z", (Object)this, (long)135113343169168471L) /* => dev.hixo.c.u.p.P */ < 0L) {
            dev.hixo.M.d.a("\u00e7", (Object)this, (long)dev.hixo.M.d.a("\u00f9", (long)78882375305248292L) /* => java.lang.System.nanoTime */, (long)135113343169168471L) /* => dev.hixo.c.u.p.P */;
        }
    }

    public boolean l() {
        return dev.hixo.M.d.a("z", (Object)this, (long)135113343169168471L) /* => dev.hixo.c.u.p.P */ > 0L && dev.hixo.M.d.a("\u00f9", (long)dev.hixo.M.d.a("z", (Object)this, (long)135113343169168471L) /* => dev.hixo.c.u.p.P */, (long)90557248410400724L) /* => dev.hixo.c.u.p.N */ > 240.0f;
    }

    private static float N(long l2) {
        return (float)(dev.hixo.M.d.a("\u00f9", (long)78882375305248292L) /* => java.lang.System.nanoTime */ - l2) / 1000000.0f;
    }

    private float d(int n2) {
        CallSite callSite = dev.hixo.M.d.a("\u00f9", (int)1, (int)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)112410867447181304L) /* => dev.hixo.c.u.p.T */, (long)180194190084079702L) /* => java.util.List.size */, (long)199527982987698177L) /* => java.lang.Math.max */;
        return ((float)n2 - ((float)callSite * 128.0f + (float)(callSite - true) * 4.0f)) / 2.0f;
    }

    private float e(int n2, int n3) {
        return (float)(dev.hixo.M.d.a("$", (Object)this, (int)n3, (long)48172543995111260L) /* => dev.hixo.c.u.p.d */ + (float)n2 * 132.0f);
    }

    private K P(double d2, int n2) {
        for (int i2 = 0; i2 < dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)112410867447181304L) /* => dev.hixo.c.u.p.T */, (long)180194190084079702L) /* => java.util.List.size */; ++i2) {
            CallSite callSite = dev.hixo.M.d.a("$", (Object)this, (int)i2, (int)n2, (long)158924503859573167L) /* => dev.hixo.c.u.p.e */;
            if (!(d2 >= (double)(callSite - 3.0f)) || !(d2 <= (double)(callSite + 128.0f + 3.0f))) continue;
            return (K)((Object)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)112410867447181304L) /* => dev.hixo.c.u.p.T */, (int)i2, (long)196824017790916210L) /* => java.util.List.get */);
        }
        return null;
    }

    public void D(class_332 class_3322, int n2, int n3, int n4, int n5) {
        CallSite callSite = dev.hixo.M.d.a("\u00f9", (long)179869930689441125L) /* => net.minecraft.class_310.method_1551 */;
        if (callSite == null) {
            return;
        }
        CallSite callSite2 = dev.hixo.M.d.a("z", (Object)callSite, (long)33332170178084458L) /* => net.minecraft.class_310.field_1772 */;
        CallSite callSite3 = dev.hixo.M.d.a("\u00f9", (long)dev.hixo.M.d.a("z", (Object)this, (long)79348483839859764L) /* => dev.hixo.c.u.p.x */, (long)90557248410400724L) /* => dev.hixo.c.u.p.N */;
        float f = dev.hixo.M.d.a("z", (Object)this, (long)135113343169168471L) /* => dev.hixo.c.u.p.P */ > 0L ? (float)(dev.hixo.M.d.a("\u00f9", (long)dev.hixo.M.d.a("z", (Object)this, (long)135113343169168471L) /* => dev.hixo.c.u.p.P */, (long)90557248410400724L) /* => dev.hixo.c.u.p.N */ / 240.0f) : 0.0f;
        boolean bl = dev.hixo.M.d.a("z", (Object)this, (long)135113343169168471L) /* => dev.hixo.c.u.p.P */ > 0L;
        float f2 = (float)n5 - 24.0f;
        dev.hixo.M.d.a("\u00e7", (Object)this, null, (long)106959514895244909L) /* => dev.hixo.c.u.p.q */;
        dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)152178195926548765L) /* => dev.hixo.c.u.p.v */, (long)191130606908305482L) /* => java.util.List.clear */;
        for (int i2 = 0; i2 < dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)112410867447181304L) /* => dev.hixo.c.u.p.T */, (long)180194190084079702L) /* => java.util.List.size */; ++i2) {
            Object object;
            K k3 = (K)((Object)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)112410867447181304L) /* => dev.hixo.c.u.p.T */, (int)i2, (long)196824017790916210L) /* => java.util.List.get */);
            List list = (List)((Object)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)81381928922745381L) /* => dev.hixo.c.u.p.W */, (Object)((Object)k3), (long)150360683669181890L) /* => java.util.Map.get */);
            if (list == null) continue;
            CallSite callSite4 = dev.hixo.M.d.a("\u00f9", (float)dev.hixo.M.d.a("\u00f9", (float)((callSite3 - (float)i2 * 55.0f) / 260.0f), (long)150686034155955851L) /* => dev.hixo.c.u.p.c */, (long)32016097036663416L) /* => dev.hixo.c.u.p.z */;
            Object object2 = (1.0f - callSite4) * 14.0f;
            if (bl) {
                object2 = dev.hixo.M.d.a("\u00f9", (float)f, (long)150686034155955851L) /* => dev.hixo.c.u.p.c */ * 16.0f;
            }
            CallSite callSite5 = dev.hixo.M.d.a("$", (Object)this, (int)i2, (int)n4, (long)158924503859573167L) /* => dev.hixo.c.u.p.e */;
            dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("$", (Object)class_3322, (long)182057530285180715L) /* => net.minecraft.class_332.method_51448 */, (long)107444705912078912L) /* => net.minecraft.class_4587.method_22903 */;
            dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("$", (Object)class_3322, (long)182057530285180715L) /* => net.minecraft.class_332.method_51448 */, (float)0.0f, (float)object2, (float)0.0f, (long)56023600929979137L) /* => net.minecraft.class_4587.method_46416 */;
            dev.hixo.M.d.a("\u00f9", (Object)class_3322, (float)(callSite5 - 3.0f), (float)16.0f, (float)(callSite5 + 128.0f + 3.0f), (float)f2, (float)2.0f, (int)p.a(26832, 3209138689245930311L), (long)149127743208642807L) /* => dev.hixo.c.u.p.r */;
            dev.hixo.M.d.a("\u00f9", (Object)class_3322, (Object)callSite2, (Object)dev.hixo.M.d.a("$", (Object)((Object)k3), (long)75959788416907125L) /* => dev.hixo.M.K.l */, (float)(callSite5 + 64.0f), (float)21.0f, (int)-1, (long)64048223507596958L) /* => dev.hixo.c.u.p.S */;
            dev.hixo.M.d.a("\u00f9", (Object)class_3322, (float)(callSite5 + 64.0f - 20.0f), (float)32.0f, (float)(callSite5 + 64.0f + 20.0f), (float)33.5f, (float)0.75f, (int)p.a(18517, 6470444445874406358L), (long)149127743208642807L) /* => dev.hixo.c.u.p.r */;
            CallSite callSite6 = dev.hixo.M.d.a("$", (Object)((Float)((Object)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)120239196506760815L) /* => dev.hixo.c.u.p.X */, (Object)((Object)k3), (Object)dev.hixo.M.d.a("\u00f9", (float)0.0f, (long)150107566387426058L) /* => java.lang.Float.valueOf */, (long)98318991380854553L) /* => java.util.Map.getOrDefault */)), (long)180878738827787874L) /* => java.lang.Float.floatValue */;
            float f3 = 40.0f - callSite6;
            G g3 = (G)((Object)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)42671516645783629L) /* => dev.hixo.c.u.p.C */, (Object)((Object)k3), (long)150360683669181890L) /* => java.util.Map.get */);
            c c2 = (c)((Object)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)118112551232623957L) /* => dev.hixo.c.u.p.g */, (Object)((Object)k3), k2 -> new c(0.0f, 0.3f), (long)123211639374652458L) /* => java.util.Map.computeIfAbsent */);
            dev.hixo.M.d.a("$", (Object)c2, (float)(g3 != null ? 1.0f : 0.0f), (long)72256369778637464L) /* => dev.hixo.c.u.p$c.C */;
            dev.hixo.M.d.a("$", (Object)c2, (long)200498710411923709L) /* => dev.hixo.c.u.p$c.T */;
            CallSite callSite7 = dev.hixo.M.d.a("$", (Object)list, (long)113221006393852506L) /* => java.util.List.iterator */;
            while (dev.hixo.M.d.a("$", (Object)callSite7, (long)175361412755674352L) /* => java.util.Iterator.hasNext */ != false) {
                CallSite callSite8;
                boolean bl2;
                G g4 = (G)((Object)dev.hixo.M.d.a("$", (Object)callSite7, (long)64633749944946827L) /* => java.util.Iterator.next */);
                object = f3;
                boolean bl3 = bl2 = (float)n2 >= callSite5 && (float)n2 <= callSite5 + 128.0f && (float)n3 >= object && (float)n3 <= object + 16.0f;
                if (bl2) {
                    dev.hixo.M.d.a("\u00e7", (Object)this, (K)k3, (long)106959514895244909L) /* => dev.hixo.c.u.p.q */;
                }
                c c3 = (c)((Object)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)158286595125473440L) /* => dev.hixo.c.u.p.r */, (Object)g4, g2 -> new c(0.0f, 0.32f), (long)123211639374652458L) /* => java.util.Map.computeIfAbsent */);
                c c4 = (c)((Object)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)82900073810216740L) /* => dev.hixo.c.u.p.J */, (Object)g4, g2 -> new c(0.0f, 0.28f), (long)123211639374652458L) /* => java.util.Map.computeIfAbsent */);
                dev.hixo.M.d.a("$", (Object)c3, (float)(bl2 ? 1.0f : 0.0f), (long)72256369778637464L) /* => dev.hixo.c.u.p$c.C */;
                dev.hixo.M.d.a("$", (Object)c4, (float)(dev.hixo.M.d.a("$", (Object)g4, (long)96089342888548907L) /* => dev.hixo.M.G.c */ != false ? 1.0f : 0.0f), (long)72256369778637464L) /* => dev.hixo.c.u.p$c.C */;
                dev.hixo.M.d.a("$", (Object)c3, (long)200498710411923709L) /* => dev.hixo.c.u.p$c.T */;
                dev.hixo.M.d.a("$", (Object)c4, (long)200498710411923709L) /* => dev.hixo.c.u.p$c.T */;
                dev.hixo.M.d.a("\u00f9", (Object)class_3322, (float)callSite5, (float)object, (float)(callSite5 + 128.0f), (float)(object + 16.0f), (float)2.0f, (int)p.a(8394, 4740124129033202520L), (long)149127743208642807L) /* => dev.hixo.c.u.p.r */;
                if (dev.hixo.M.d.a("z", (Object)c4, (long)129145670746197259L) /* => dev.hixo.c.u.p$c.C */ > 0.01f) {
                    dev.hixo.M.d.a("\u00f9", (Object)class_3322, (float)callSite5, (float)object, (float)(callSite5 + 128.0f), (float)(object + 16.0f), (float)2.0f, (int)dev.hixo.M.d.a("\u00f9", (int)p.a(5487, 5445245964499459833L), (float)dev.hixo.M.d.a("z", (Object)c4, (long)129145670746197259L) /* => dev.hixo.c.u.p$c.C */, (long)80157849264626188L) /* => dev.hixo.c.u.p.z */, (long)149127743208642807L) /* => dev.hixo.c.u.p.r */;
                }
                if (dev.hixo.M.d.a("z", (Object)c3, (long)129145670746197259L) /* => dev.hixo.c.u.p$c.C */ > 0.01f) {
                    dev.hixo.M.d.a("\u00f9", (Object)class_3322, (float)callSite5, (float)object, (float)(callSite5 + 128.0f), (float)(object + 16.0f), (float)2.0f, (int)dev.hixo.M.d.a("\u00f9", (int)-1, (float)(dev.hixo.M.d.a("z", (Object)c3, (long)129145670746197259L) /* => dev.hixo.c.u.p$c.C */ * 0.18f), (long)80157849264626188L) /* => dev.hixo.c.u.p.z */, (long)149127743208642807L) /* => dev.hixo.c.u.p.r */;
                }
                dev.hixo.M.d.a("\u00f9", (Object)class_3322, (Object)callSite2, (Object)dev.hixo.M.d.a("$", (Object)g4, (long)197754555450540863L) /* => dev.hixo.M.G.V */, (float)(callSite5 + 5.0f), (float)(object + 4.0f), (int)(dev.hixo.M.d.a("$", (Object)g4, (long)96089342888548907L) /* => dev.hixo.M.G.c */ != false ? -1 : p.a(28513, 4509411038915716346L)), (long)55939457012766636L) /* => dev.hixo.c.u.p.P */;
                if (g3 == g4) {
                    dev.hixo.M.d.a("\u00f9", (Object)class_3322, (float)(callSite5 + 128.0f - 11.0f), (float)(object + 5.0f), (float)(callSite5 + 128.0f - 4.0f), (float)(object + 11.0f), (float)0.5f, (int)p.a(7046, 3955771930128093202L), (long)149127743208642807L) /* => dev.hixo.c.u.p.r */;
                }
                f3 += 18.0f;
                if (g3 != g4 || dev.hixo.M.d.a("$", (Object)(callSite8 = dev.hixo.M.d.a("\u00f9", (Object)g4, (long)44274521335664869L) /* => dev.hixo.c.u.p.O */), (long)184224858935663280L) /* => java.util.List.isEmpty */ != false) continue;
                float f4 = f3 + 2.0f;
                CallSite callSite9 = dev.hixo.M.d.a("$", (Object)((Float)((Object)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)133987272722227568L) /* => dev.hixo.c.u.p.h */, (Object)g4, (Object)dev.hixo.M.d.a("\u00f9", (float)0.0f, (long)150107566387426058L) /* => java.lang.Float.valueOf */, (long)98318991380854553L) /* => java.util.Map.getOrDefault */)), (long)180878738827787874L) /* => java.lang.Float.floatValue */;
                CallSite callSite10 = dev.hixo.M.d.a("\u00f9", (float)0.0f, (float)(callSite9 * dev.hixo.M.d.a("z", (Object)c2, (long)129145670746197259L) /* => dev.hixo.c.u.p$c.C */), (long)121565737685922221L) /* => java.lang.Math.max */;
                if (callSite10 > 0.5f) {
                    CallSite callSite11 = dev.hixo.M.d.a("$", (Object)this, (Object)class_3322, (Object)callSite2, (Object)callSite8, (float)(callSite5 + 4.0f), (float)120.0f, (float)f4, (float)14.0f, (float)dev.hixo.M.d.a("\u00f9", (float)f2, (float)(f4 + callSite10), (long)139533018482628456L) /* => java.lang.Math.min */, (int)n2, (int)n3, (long)116177989677223353L) /* => dev.hixo.c.u.p.l */;
                    dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)133987272722227568L) /* => dev.hixo.c.u.p.h */, (Object)g4, (Object)dev.hixo.M.d.a("\u00f9", (float)(callSite11 - f4), (long)150107566387426058L) /* => java.lang.Float.valueOf */, (long)87609561069083692L) /* => java.util.Map.put */;
                }
                f3 = f4 + callSite10 + 5.0f;
            }
            float f5 = f2 - 40.0f;
            float f6 = f3 - 40.0f + callSite6;
            object = dev.hixo.M.d.a("\u00f9", (float)0.0f, (float)(f6 - f5), (long)121565737685922221L) /* => java.lang.Math.max */;
            CallSite callSite12 = dev.hixo.M.d.a("\u00f9", (float)callSite6, (float)object, (long)139533018482628456L) /* => java.lang.Math.min */;
            if (object > 1.0f) {
                CallSite callSite13 = dev.hixo.M.d.a("\u00f9", (float)16.0f, (float)(f5 * (f5 / dev.hixo.M.d.a("\u00f9", (float)1.0f, (float)f6, (long)121565737685922221L) /* => java.lang.Math.max */)), (long)121565737685922221L) /* => java.lang.Math.max */;
                float f7 = 40.0f + callSite12 / object * (f5 - callSite13);
                dev.hixo.M.d.a("\u00f9", (Object)class_3322, (float)(callSite5 + 128.0f + 4.0f), (float)f7, (float)(callSite5 + 128.0f + 6.0f), (float)(f7 + callSite13), (float)1.0f, (int)dev.hixo.M.d.a("\u00f9", (int)p.a(5487, 5445245964499459833L), (float)0.85f, (long)80157849264626188L) /* => dev.hixo.c.u.p.z */, (long)149127743208642807L) /* => dev.hixo.c.u.p.r */;
            }
            dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("$", (Object)class_3322, (long)182057530285180715L) /* => net.minecraft.class_332.method_51448 */, (long)173437477470911975L) /* => net.minecraft.class_4587.method_22909 */;
        }
        float f8 = 1.0f - dev.hixo.M.d.a("\u00f9", (float)dev.hixo.M.d.a("\u00f9", (float)(callSite3 / 420.0f), (long)150686034155955851L) /* => dev.hixo.c.u.p.c */, (long)32016097036663416L) /* => dev.hixo.c.u.p.z */;
        float f9 = f8 * 0.45f + dev.hixo.M.d.a("\u00f9", (float)f, (long)150686034155955851L) /* => dev.hixo.c.u.p.c */ * 0.45f;
        if (f9 > 0.01f) {
            dev.hixo.M.d.a("$", (Object)class_3322, (int)0, (int)0, (int)n4, (int)n5, (int)dev.hixo.M.d.a("\u00f9", (int)p.a(1669, 8414222945784433951L), (float)f9, (long)80157849264626188L) /* => dev.hixo.c.u.p.z */, (long)70222225705551889L) /* => net.minecraft.class_332.method_25294 */;
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private float l(class_332 var1_1, class_327 var2_2, List<Object> var3_3, float var4_4, float var5_5, float var6_6, float var7_7, float var8_8, int var9_9, int var10_10) {
        block39: {
            block38: {
                block37: {
                    var12_11 = var4_4;
                    var13_12 = false;
                    var14_13 = dev.hixo.M.d.a("$", var3_3, (long)113221006393852506L) /* => java.util.List.iterator */;
                    var11_14 = p.s;
                    while (dev.hixo.M.d.a("$", (Object)var14_13, (long)175361412755674352L) /* => java.util.Iterator.hasNext */ != false) {
                        block47: {
                            block46: {
                                block45: {
                                    block44: {
                                        block42: {
                                            block43: {
                                                var15_15 = dev.hixo.M.d.a("$", (Object)var14_13, (long)64633749944946827L) /* => java.util.Iterator.next */;
                                                if (var11_14 != 0) break block37;
                                                v0 = var15_15;
                                                if (var11_14 == 0) {
                                                    if (!(v0 instanceof g)) continue;
                                                    v0 = var15_15;
                                                }
                                                var16_16 = (g)v0;
                                                var13_12 = true;
                                                var17_17 = (c)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)38937209727315808L) /* => dev.hixo.c.u.p.Y */, (Object)var15_15, (Function<Object, c>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, lambda$renderSettings$4(java.lang.Object ), (Ljava/lang/Object;)Ldev/hixo/c/u/p$c;)(), (long)123211639374652458L) /* => java.util.Map.computeIfAbsent */;
                                                dev.hixo.M.d.a("$", (Object)var17_17, (float)(dev.hixo.M.d.a("$", (Object)var16_16, (long)65580906021680841L) /* => dev.hixo.b.g.x */ != false ? 1.0f : 0.0f), (long)72256369778637464L) /* => dev.hixo.c.u.p$c.C */;
                                                dev.hixo.M.d.a("$", (Object)var17_17, (long)200498710411923709L) /* => dev.hixo.c.u.p$c.T */;
                                                var18_18 = dev.hixo.M.d.a("$", (Object)var16_16, (long)187344131104489819L) /* => dev.hixo.b.g.m */;
                                                var19_21 = 17.0f + (float)dev.hixo.M.d.a("$", (Object)var2_2, (Object)var18_18, (long)60514977858798819L) /* => net.minecraft.class_327.method_1727 */ + 10.0f;
                                                v1 = var12_11;
                                                v2 = var4_4;
                                                if (var11_14 != 0) break block42;
                                                if (!(v1 > v2)) break block43;
                                                v1 = var12_11;
                                                v2 = var19_21;
                                                if (var11_14 != 0) break block42;
                                                if (v1 + v2 > var4_4 + var5_5) {
                                                    var12_11 = var4_4;
                                                    var6_6 += 17.0f;
                                                }
                                            }
                                            v3 = var9_9;
                                            if (var11_14 != 0) break block44;
                                            v1 = v3;
                                            v2 = var12_11;
                                        }
                                        if (!(v1 >= v2)) ** GOTO lbl-1000
                                        v4 = var9_9;
                                        v5 = var12_11;
                                        if (var11_14 != 0) break block45;
                                        cfr_temp_0 = v4 - (v5 + var19_21);
                                        v3 = cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 < 0.0f ? -1 : 1);
                                    }
                                    if (v3 > 0) ** GOTO lbl-1000
                                    v4 = var10_10;
                                    if (var11_14 != 0) break block46;
                                    v5 = var6_6;
                                }
                                if (!(v4 >= v5)) ** GOTO lbl-1000
                                v6 = var10_10;
                                if (var11_14 != 0) break block47;
                                v4 = v6;
                            }
                            ** if (!(v4 <= var6_6 + 14.0f)) goto lbl-1000
lbl-1000:
                            // 1 sources

                            {
                                v6 = 1;
                                ** GOTO lbl57
                            }
lbl-1000:
                            // 4 sources

                            {
                                v6 = 0;
                            }
                        }
                        var20_24 = v6;
                        dev.hixo.M.d.a("\u00f9", (Object)var1_1, (float)var12_11, (float)(var6_6 + 1.0f), (float)(var12_11 + 12.0f), (float)(var6_6 + 13.0f), (float)2.0f, (int)p.a(8668, 2335234895819844165L), (long)149127743208642807L) /* => dev.hixo.c.u.p.r */;
                        dev.hixo.M.d.a("\u00f9", (Object)var1_1, (float)(var12_11 + 2.0f), (float)(var6_6 + 3.0f), (float)(var12_11 + 10.0f), (float)(var6_6 + 11.0f), (float)1.5f, (int)dev.hixo.M.d.a("\u00f9", (int)p.a(5487, 5445245964499459833L), (float)dev.hixo.M.d.a("z", (Object)var17_17, (long)129145670746197259L) /* => dev.hixo.c.u.p$c.C */, (long)80157849264626188L) /* => dev.hixo.c.u.p.z */, (long)149127743208642807L) /* => dev.hixo.c.u.p.r */;
                        v7 /* !! */  = var20_24;
                        if (var11_14 != 0) ** GOTO lbl67
                        if (v7 /* !! */  != 0) {
                            v7 /* !! */  = -1;
                        } else {
                            v7 /* !! */  = (int)dev.hixo.M.d.a("$", (Object)var16_16, (long)65580906021680841L) /* => dev.hixo.b.g.x */;
lbl67:
                            // 2 sources

                            if (var11_14 == 0) {
                                v7 /* !! */  = v7 /* !! */  != 0 ? -1 : p.a(1181, 362899990972403461L);
                            }
                        }
                        dev.hixo.M.d.a("\u00f9", (Object)var1_1, (Object)var2_2, (Object)var18_18, (float)(var12_11 + 17.0f), (float)(var6_6 + 3.0f), (int)v7 /* !! */ , (long)55939457012766636L) /* => dev.hixo.c.u.p.P */;
                        var12_11 += var19_21;
                        if (var11_14 == 0) continue;
                    }
                    if (var13_12) {
                        var6_6 += 20.0f;
                    }
                }
                var14_13 = dev.hixo.M.d.a("$", var3_3, (long)113221006393852506L) /* => java.util.List.iterator */;
                while (dev.hixo.M.d.a("$", (Object)var14_13, (long)175361412755674352L) /* => java.util.Iterator.hasNext */ != false) {
                    block50: {
                        block49: {
                            block48: {
                                var15_15 = dev.hixo.M.d.a("$", (Object)var14_13, (long)64633749944946827L) /* => java.util.Iterator.next */;
                                if (var11_14 != 0) break block38;
                                v8 = var15_15;
                                if (var11_14 == 0) {
                                    if (!(v8 instanceof M)) continue;
                                    v8 = var15_15;
                                }
                                var16_16 = (M)v8;
                                var17_17 = (c)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)38937209727315808L) /* => dev.hixo.c.u.p.Y */, (Object)var15_15, (Function<Object, c>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, lambda$renderSettings$5(java.lang.Object ), (Ljava/lang/Object;)Ldev/hixo/c/u/p$c;)(), (long)123211639374652458L) /* => java.util.Map.computeIfAbsent */;
                                var18_18 = dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("$", (Object)new StringBuilder(), (Object)dev.hixo.M.d.a("\u00f9", (double)dev.hixo.M.d.a("$", (Object)var16_16, (long)86270808255001128L) /* => dev.hixo.b.M.J */, (double)dev.hixo.M.d.a("$", (Object)var16_16, (long)32416196599767288L) /* => dev.hixo.b.M.T */, (long)52602371584242957L) /* => dev.hixo.c.u.p.g */, (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (Object)p.a[0], (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (Object)dev.hixo.M.d.a("\u00f9", (double)dev.hixo.M.d.a("$", (Object)var16_16, (long)187200934986827103L) /* => dev.hixo.b.M.s */, (double)dev.hixo.M.d.a("$", (Object)var16_16, (long)32416196599767288L) /* => dev.hixo.b.M.T */, (long)52602371584242957L) /* => dev.hixo.c.u.p.g */, (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (long)59411206276622891L) /* => java.lang.StringBuilder.toString */;
                                dev.hixo.M.d.a("\u00f9", (Object)var1_1, (Object)var2_2, (Object)dev.hixo.M.d.a("\u00f9", (Object)var2_2, (Object)dev.hixo.M.d.a("$", (Object)var16_16, (long)134725525843708953L) /* => dev.hixo.b.M.C */, (float)(var5_5 * 0.55f), (long)192481212030952858L) /* => dev.hixo.c.u.p.A */, (float)var4_4, (float)(var6_6 + 1.0f), (int)p.a(1181, 362899990972403461L), (long)55939457012766636L) /* => dev.hixo.c.u.p.P */;
                                dev.hixo.M.d.a("\u00f9", (Object)var1_1, (Object)var2_2, (Object)var18_18, (float)(var4_4 + var5_5 - (float)dev.hixo.M.d.a("$", (Object)var2_2, (Object)var18_18, (long)60514977858798819L) /* => net.minecraft.class_327.method_1727 */), (float)(var6_6 + 1.0f), (int)-1, (long)55939457012766636L) /* => dev.hixo.c.u.p.P */;
                                var19_21 = var6_6 + 14.0f;
                                dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)55330818966379250L) /* => dev.hixo.c.u.p.o */, (Object)var16_16, (Object)new float[]{var4_4, var5_5}, (long)87609561069083692L) /* => java.util.Map.put */;
                                dev.hixo.M.d.a("\u00f9", (Object)var1_1, (float)var4_4, (float)var19_21, (float)(var4_4 + var5_5), (float)(var19_21 + 5.0f), (float)2.5f, (int)p.a(6931, 354699365361553538L), (long)149127743208642807L) /* => dev.hixo.c.u.p.r */;
                                var20_25 = (dev.hixo.M.d.a("$", (Object)var16_16, (long)86270808255001128L) /* => dev.hixo.b.M.J */ - dev.hixo.M.d.a("$", (Object)var16_16, (long)38706059364368044L) /* => dev.hixo.b.M.F */) / dev.hixo.M.d.a("\u00f9", (double)1.0E-9, (double)(dev.hixo.M.d.a("$", (Object)var16_16, (long)187200934986827103L) /* => dev.hixo.b.M.s */ - dev.hixo.M.d.a("$", (Object)var16_16, (long)38706059364368044L) /* => dev.hixo.b.M.F */), (long)53777445532228911L) /* => java.lang.Math.max */;
                                var22_28 = (float)((double)var5_5 * dev.hixo.M.d.a("\u00f9", (double)0.0, (double)dev.hixo.M.d.a("\u00f9", (double)1.0, (double)var20_25, (long)195251025896564278L) /* => java.lang.Math.min */, (long)53777445532228911L) /* => java.lang.Math.max */);
                                if (var11_14 != 0) break block48;
                                if (dev.hixo.M.d.a("z", (Object)this, (long)98015364533978757L) /* => dev.hixo.c.u.p.n */ != var16_16) break block49;
                                dev.hixo.M.d.a("$", (Object)var17_17, (float)var22_28, (long)180022289998243493L) /* => dev.hixo.c.u.p$c.R */;
                            }
                            if (var11_14 == 0) break block50;
                        }
                        dev.hixo.M.d.a("$", (Object)var17_17, (float)var22_28, (long)72256369778637464L) /* => dev.hixo.c.u.p$c.C */;
                    }
                    dev.hixo.M.d.a("$", (Object)var17_17, (long)200498710411923709L) /* => dev.hixo.c.u.p$c.T */;
                    if (var11_14 == 0) {
                        if (dev.hixo.M.d.a("z", (Object)var17_17, (long)129145670746197259L) /* => dev.hixo.c.u.p$c.C */ > 0.5f) {
                            dev.hixo.M.d.a("\u00f9", (Object)var1_1, (float)var4_4, (float)var19_21, (float)(var4_4 + dev.hixo.M.d.a("z", (Object)var17_17, (long)129145670746197259L) /* => dev.hixo.c.u.p$c.C */), (float)(var19_21 + 5.0f), (float)2.5f, (int)p.a(5487, 5445245964499459833L), (long)149127743208642807L) /* => dev.hixo.c.u.p.r */;
                        }
                        dev.hixo.M.d.a("\u00f9", (Object)var1_1, (float)(var4_4 + dev.hixo.M.d.a("z", (Object)var17_17, (long)129145670746197259L) /* => dev.hixo.c.u.p$c.C */ - 5.0f), (float)(var19_21 - 2.5f), (float)(var4_4 + dev.hixo.M.d.a("z", (Object)var17_17, (long)129145670746197259L) /* => dev.hixo.c.u.p$c.C */ + 5.0f), (float)(var19_21 + 7.5f), (float)5.0f, (int)-1, (long)149127743208642807L) /* => dev.hixo.c.u.p.r */;
                        var6_6 += 26.0f;
                    }
                    if (var11_14 == 0) continue;
                }
                var14_13 = dev.hixo.M.d.a("$", var3_3, (long)113221006393852506L) /* => java.util.List.iterator */;
            }
            while (dev.hixo.M.d.a("$", (Object)var14_13, (long)175361412755674352L) /* => java.util.Iterator.hasNext */ != false) {
                block40: {
                    var15_15 = dev.hixo.M.d.a("$", (Object)var14_13, (long)64633749944946827L) /* => java.util.Iterator.next */;
                    if (var11_14 != 0) break block39;
                    v9 = var15_15;
                    if (var11_14 == 0) {
                        if (!(v9 instanceof s)) continue;
                        v9 = var15_15;
                    }
                    var16_16 = (s)v9;
                    var17_17 = (c)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)38937209727315808L) /* => dev.hixo.c.u.p.Y */, (Object)var15_15, (Function<Object, c>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, lambda$renderSettings$6(java.lang.Object ), (Ljava/lang/Object;)Ldev/hixo/c/u/p$c;)(), (long)123211639374652458L) /* => java.util.Map.computeIfAbsent */;
                    dev.hixo.M.d.a("$", (Object)var17_17, (float)1.0f, (long)72256369778637464L) /* => dev.hixo.c.u.p$c.C */;
                    dev.hixo.M.d.a("$", (Object)var17_17, (long)200498710411923709L) /* => dev.hixo.c.u.p$c.T */;
                    dev.hixo.M.d.a("\u00f9", (Object)var1_1, (Object)var2_2, (Object)dev.hixo.M.d.a("\u00f9", (Object)var2_2, (Object)dev.hixo.M.d.a("$", (Object)var16_16, (long)37801073602694120L) /* => dev.hixo.b.s.O */, (float)var5_5, (long)192481212030952858L) /* => dev.hixo.c.u.p.A */, (float)var4_4, (float)(var6_6 + 1.0f), (int)p.a(1181, 362899990972403461L), (long)55939457012766636L) /* => dev.hixo.c.u.p.P */;
                    var6_6 += 13.0f;
                    var18_19 = var4_4;
                    var19_22 = dev.hixo.M.d.a("$", (Object)var16_16, (long)105057704192186989L) /* => dev.hixo.b.s.j */;
                    var20_26 = dev.hixo.M.d.a("$", (Object)var19_22, (long)113221006393852506L) /* => java.util.List.iterator */;
                    while (dev.hixo.M.d.a("$", (Object)var20_26, (long)175361412755674352L) /* => java.util.Iterator.hasNext */ != false) {
                        block51: {
                            block52: {
                                block53: {
                                    var21_30 = (String)dev.hixo.M.d.a("$", (Object)var20_26, (long)64633749944946827L) /* => java.util.Iterator.next */;
                                    var22_29 = dev.hixo.M.d.a("$", (Object)var16_16, (Object)var21_30, (long)114714509743429363L) /* => dev.hixo.b.s.P */;
                                    v10 = 15.0f;
                                    if (var11_14 != 0) break block40;
                                    var23_32 = v10 + (float)dev.hixo.M.d.a("$", (Object)var2_2, (Object)var21_30, (long)60514977858798819L) /* => net.minecraft.class_327.method_1727 */ + 12.0f;
                                    if (var11_14 != 0) break block51;
                                    if (!(var18_19 > var4_4)) break block52;
                                    v11 = var18_19 + var23_32;
                                    v12 = var4_4;
                                    if (var11_14 != 0) break block53;
                                    if (!(v11 > v12 + var5_5)) break block52;
                                    var18_19 = var4_4;
                                    v11 = var6_6;
                                    v12 = 17.0f;
                                }
                                var6_6 = v11 + v12;
                            }
                            dev.hixo.M.d.a("\u00f9", (Object)var1_1, (float)var18_19, (float)(var6_6 + 2.0f), (float)(var18_19 + 10.0f), (float)(var6_6 + 12.0f), (float)5.0f, (int)p.a(6931, 354699365361553538L), (long)149127743208642807L) /* => dev.hixo.c.u.p.r */;
                        }
                        dev.hixo.M.d.a("\u00f9", (Object)var1_1, (float)(var18_19 + 1.0f), (float)(var6_6 + 3.0f), (float)(var18_19 + 9.0f), (float)(var6_6 + 11.0f), (float)4.0f, (int)dev.hixo.M.d.a("\u00f9", (int)p.a(5487, 5445245964499459833L), (float)(var22_29 != false ? (float)dev.hixo.M.d.a("z", (Object)var17_17, (long)129145670746197259L) /* => dev.hixo.c.u.p$c.C */ : 0.1f), (long)80157849264626188L) /* => dev.hixo.c.u.p.z */, (long)149127743208642807L) /* => dev.hixo.c.u.p.r */;
                        v13 = var22_29;
                        if (var11_14 == 0) {
                            v13 = v13 != false ? (Object)-1 : (Object)p.a(1181, 362899990972403461L);
                        }
                        dev.hixo.M.d.a("\u00f9", (Object)var1_1, (Object)var2_2, (Object)var21_30, (float)(var18_19 + 15.0f), (float)(var6_6 + 3.0f), (int)v13, (long)55939457012766636L) /* => dev.hixo.c.u.p.P */;
                        var18_19 += var23_32;
                        if (var11_14 == 0) continue;
                    }
                    v10 = var6_6 = var6_6 + 19.0f;
                }
                if (var11_14 == 0) continue;
            }
            var14_13 = dev.hixo.M.d.a("$", var3_3, (long)113221006393852506L) /* => java.util.List.iterator */;
        }
        while (dev.hixo.M.d.a("$", (Object)var14_13, (long)175361412755674352L) /* => java.util.Iterator.hasNext */ != false) {
            block41: {
                v14 = var15_15 = dev.hixo.M.d.a("$", (Object)var14_13, (long)64633749944946827L) /* => java.util.Iterator.next */;
                if (var11_14 == 0) {
                    if (!(v14 instanceof C)) continue;
                    v14 = var15_15;
                }
                var16_16 = (C)v14;
                dev.hixo.M.d.a("\u00f9", (Object)var1_1, (Object)var2_2, (Object)dev.hixo.M.d.a("\u00f9", (Object)var2_2, (Object)dev.hixo.M.d.a("$", (Object)var16_16, (long)191474110668176287L) /* => dev.hixo.b.C.p */, (float)(var5_5 * 0.6f), (long)192481212030952858L) /* => dev.hixo.c.u.p.A */, (float)var4_4, (float)(var6_6 + 1.0f), (int)p.a(1181, 362899990972403461L), (long)55939457012766636L) /* => dev.hixo.c.u.p.P */;
                var17_17 = dev.hixo.M.d.a("$", (Object)var16_16, (long)84302160823436197L) /* => dev.hixo.b.C.x */;
                dev.hixo.M.d.a("\u00f9", (Object)var1_1, (Object)var2_2, (Object)var17_17, (float)(var4_4 + var5_5 - (float)dev.hixo.M.d.a("$", (Object)var2_2, (Object)var17_17, (long)60514977858798819L) /* => net.minecraft.class_327.method_1727 */), (float)(var6_6 + 1.0f), (int)p.a(32529, 1585347154895664273L), (long)55939457012766636L) /* => dev.hixo.c.u.p.P */;
                var6_6 += 13.0f;
                var18_20 = var4_4;
                var19_23 = dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("$", (Object)var16_16, (long)91655068552487544L) /* => dev.hixo.b.C.A */, (long)113221006393852506L) /* => java.util.List.iterator */;
                while (dev.hixo.M.d.a("$", (Object)var19_23, (long)175361412755674352L) /* => java.util.Iterator.hasNext */ != false) {
                    block57: {
                        block56: {
                            block54: {
                                block55: {
                                    var20_27 = (String)dev.hixo.M.d.a("$", (Object)var19_23, (long)64633749944946827L) /* => java.util.Iterator.next */;
                                    var21_31 = dev.hixo.M.d.a("$", (Object)var16_16, (Object)var20_27, (long)160647062577305305L) /* => dev.hixo.b.C.P */;
                                    var22_28 = 16.0f + (float)dev.hixo.M.d.a("$", (Object)var2_2, (Object)var20_27, (long)60514977858798819L) /* => net.minecraft.class_327.method_1727 */ + 10.0f;
                                    if (var11_14 != 0) break block54;
                                    v15 = var18_20;
                                    v16 = var4_4;
                                    if (var11_14 != 0) break block41;
                                    if (!(v15 > v16)) break block55;
                                    cfr_temp_1 = var18_20 + var22_28 - (var4_4 + var5_5);
                                    v17 /* !! */  = (CallSite)(cfr_temp_1 == 0.0f ? 0 : (cfr_temp_1 > 0.0f ? 1 : -1));
                                    if (var11_14 != 0) break block56;
                                    if (v17 /* !! */  > 0) {
                                        var18_20 = var4_4;
                                        var6_6 += 17.0f;
                                    }
                                }
                                v18 = var1_1;
                                if (var11_14 != 0) break block57;
                                dev.hixo.M.d.a("\u00f9", (Object)v18, (float)var18_20, (float)(var6_6 + 2.0f), (float)(var18_20 + 10.0f), (float)(var6_6 + 12.0f), (float)2.0f, (int)p.a(6931, 354699365361553538L), (long)149127743208642807L) /* => dev.hixo.c.u.p.r */;
                            }
                            v17 /* !! */  = var21_31;
                        }
                        if (v17 /* !! */  != false) {
                            dev.hixo.M.d.a("\u00f9", (Object)var1_1, (float)(var18_20 + 2.0f), (float)(var6_6 + 4.0f), (float)(var18_20 + 8.0f), (float)(var6_6 + 10.0f), (float)1.5f, (int)p.a(5487, 5445245964499459833L), (long)149127743208642807L) /* => dev.hixo.c.u.p.r */;
                        }
                        v18 = var1_1;
                    }
                    v19 = var21_31;
                    if (var11_14 == 0) {
                        v19 = v19 != false ? (Object)-1 : (Object)p.a(1181, 362899990972403461L);
                    }
                    dev.hixo.M.d.a("\u00f9", (Object)v18, (Object)var2_2, (Object)var20_27, (float)(var18_20 + 14.0f), (float)(var6_6 + 3.0f), (int)v19, (long)55939457012766636L) /* => dev.hixo.c.u.p.P */;
                    dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)152178195926548765L) /* => dev.hixo.c.u.p.v */, (Object)new z((C)var16_16, var20_27, var18_20, var6_6, var22_28, 15.0f), (long)184435215000867819L) /* => java.util.List.add */;
                    var18_20 += var22_28;
                    if (var11_14 == 0) continue;
                }
                v15 = var6_6;
                v16 = 19.0f;
            }
            var6_6 = v15 + v16;
            if (var11_14 == 0) continue;
        }
        return var6_6;
    }

    public boolean a(double d2, double d3, int n2, int n3) {
        Object object;
        Object object2;
        CallSite callSite;
        if (n2 == 0) {
            callSite = dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)152178195926548765L) /* => dev.hixo.c.u.p.v */, (long)113221006393852506L) /* => java.util.List.iterator */;
            while (dev.hixo.M.d.a("$", (Object)callSite, (long)175361412755674352L) /* => java.util.Iterator.hasNext */ != false) {
                object2 = (z)((Object)dev.hixo.M.d.a("$", (Object)callSite, (long)64633749944946827L) /* => java.util.Iterator.next */);
                if (!(d2 >= (double)dev.hixo.M.d.a("z", (Object)object2, (long)56434263195934496L) /* => dev.hixo.c.u.p$z.I */) || !(d2 <= (double)(dev.hixo.M.d.a("z", (Object)object2, (long)56434263195934496L) /* => dev.hixo.c.u.p$z.I */ + dev.hixo.M.d.a("z", (Object)object2, (long)120972799950869909L) /* => dev.hixo.c.u.p$z.u */)) || !(d3 >= (double)dev.hixo.M.d.a("z", (Object)object2, (long)77895622118112460L) /* => dev.hixo.c.u.p$z.O */) || !(d3 <= (double)(dev.hixo.M.d.a("z", (Object)object2, (long)77895622118112460L) /* => dev.hixo.c.u.p$z.O */ + dev.hixo.M.d.a("z", (Object)object2, (long)51090115245756024L) /* => dev.hixo.c.u.p$z.X */))) continue;
                dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)object2, (long)136681506382309758L) /* => dev.hixo.c.u.p$z.G */, (Object)dev.hixo.M.d.a("z", (Object)object2, (long)72778479560648846L) /* => dev.hixo.c.u.p$z.f */, (long)189967958864263498L) /* => dev.hixo.b.C.o */;
                return true;
            }
        }
        if (n2 == 0) {
            callSite = dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("$", (Object)this, (long)180105842022266765L) /* => dev.hixo.c.u.p.J */, (long)113221006393852506L) /* => java.util.List.iterator */;
            while (dev.hixo.M.d.a("$", (Object)callSite, (long)175361412755674352L) /* => java.util.Iterator.hasNext */ != false) {
                object2 = dev.hixo.M.d.a("$", (Object)callSite, (long)64633749944946827L) /* => java.util.Iterator.next */;
                if (object2 instanceof g && dev.hixo.M.d.a("$", (Object)this, (Object)(object = (g)object2), (double)d2, (double)d3, (int)n3, (long)65170137488798434L) /* => dev.hixo.c.u.p.I */ != false) {
                    dev.hixo.M.d.a("$", (Object)object, (long)162426360076710568L) /* => dev.hixo.b.g.a */;
                    return true;
                }
                if (object2 instanceof M && dev.hixo.M.d.a("$", (Object)this, (Object)(object = (M)object2), (double)d2, (double)d3, (long)80908086009251002L) /* => dev.hixo.c.u.p.o */ != false) {
                    dev.hixo.M.d.a("\u00e7", (Object)this, (M)object, (long)98015364533978757L) /* => dev.hixo.c.u.p.n */;
                    dev.hixo.M.d.a("$", (Object)this, (Object)object, (double)d2, (long)134799716785142557L) /* => dev.hixo.c.u.p.e */;
                    return true;
                }
                if (!(object2 instanceof s) || dev.hixo.M.d.a("$", (Object)this, (Object)(object = (s)object2), (double)d2, (double)d3, (int)n3, (long)88967186749765436L) /* => dev.hixo.c.u.p.Z */ == false) continue;
                return true;
            }
        }
        for (int i2 = 0; i2 < dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)112410867447181304L) /* => dev.hixo.c.u.p.T */, (long)180194190084079702L) /* => java.util.List.size */; ++i2) {
            object2 = (K)((Object)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)112410867447181304L) /* => dev.hixo.c.u.p.T */, (int)i2, (long)196824017790916210L) /* => java.util.List.get */);
            object = (List)((Object)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)81381928922745381L) /* => dev.hixo.c.u.p.W */, (Object)object2, (long)150360683669181890L) /* => java.util.Map.get */);
            if (object == null || d2 < (double)dev.hixo.M.d.a("$", (Object)this, (int)i2, (int)n3, (long)158924503859573167L) /* => dev.hixo.c.u.p.e */ || d2 > (double)(dev.hixo.M.d.a("$", (Object)this, (int)i2, (int)n3, (long)158924503859573167L) /* => dev.hixo.c.u.p.e */ + 128.0f)) continue;
            float f = 40.0f - dev.hixo.M.d.a("$", (Object)((Float)((Object)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)120239196506760815L) /* => dev.hixo.c.u.p.X */, (Object)object2, (Object)dev.hixo.M.d.a("\u00f9", (float)0.0f, (long)150107566387426058L) /* => java.lang.Float.valueOf */, (long)98318991380854553L) /* => java.util.Map.getOrDefault */)), (long)180878738827787874L) /* => java.lang.Float.floatValue */;
            CallSite callSite2 = dev.hixo.M.d.a("$", (Object)object, (long)113221006393852506L) /* => java.util.List.iterator */;
            while (dev.hixo.M.d.a("$", (Object)callSite2, (long)175361412755674352L) /* => java.util.Iterator.hasNext */ != false) {
                G g2 = (G)((Object)dev.hixo.M.d.a("$", (Object)callSite2, (long)64633749944946827L) /* => java.util.Iterator.next */);
                if (d3 >= (double)f && d3 <= (double)(f + 16.0f)) {
                    if (n2 == 0) {
                        dev.hixo.M.d.a("$", (Object)g2, (long)140123850436802586L) /* => dev.hixo.M.G.w */;
                    } else if (n2 == 1) {
                        dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)42671516645783629L) /* => dev.hixo.c.u.p.C */, (Object)object2, (Object)(dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)42671516645783629L) /* => dev.hixo.c.u.p.C */, (Object)object2, (long)150360683669181890L) /* => java.util.Map.get */ == g2 ? null : g2), (long)87609561069083692L) /* => java.util.Map.put */;
                    }
                    return true;
                }
                f += 18.0f;
                if (dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)42671516645783629L) /* => dev.hixo.c.u.p.C */, (Object)object2, (long)150360683669181890L) /* => java.util.Map.get */ != g2) continue;
                f += dev.hixo.M.d.a("$", (Object)((Float)((Object)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)133987272722227568L) /* => dev.hixo.c.u.p.h */, (Object)g2, (Object)dev.hixo.M.d.a("\u00f9", (float)0.0f, (long)150107566387426058L) /* => java.lang.Float.valueOf */, (long)98318991380854553L) /* => java.util.Map.getOrDefault */)), (long)180878738827787874L) /* => java.lang.Float.floatValue */ + 7.0f;
            }
        }
        return false;
    }

    public void G() {
        dev.hixo.M.d.a("\u00e7", (Object)this, null, (long)98015364533978757L) /* => dev.hixo.c.u.p.n */;
    }

    public void J(double d2) {
        if (dev.hixo.M.d.a("z", (Object)this, (long)98015364533978757L) /* => dev.hixo.c.u.p.n */ != null) {
            dev.hixo.M.d.a("$", (Object)this, (Object)dev.hixo.M.d.a("z", (Object)this, (long)98015364533978757L) /* => dev.hixo.c.u.p.n */, (double)d2, (long)134799716785142557L) /* => dev.hixo.c.u.p.e */;
        }
    }

    public boolean i(double d2, double d3, double d4, int n2) {
        CallSite callSite = dev.hixo.M.d.a("$", (Object)this, (double)d2, (int)n2, (long)197965040510845806L) /* => dev.hixo.c.u.p.P */;
        if (callSite == null) {
            return false;
        }
        dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)120239196506760815L) /* => dev.hixo.c.u.p.X */, (Object)callSite, (Object)dev.hixo.M.d.a("\u00f9", (float)dev.hixo.M.d.a("\u00f9", (float)0.0f, (float)(dev.hixo.M.d.a("$", (Object)((Float)((Object)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)120239196506760815L) /* => dev.hixo.c.u.p.X */, (Object)callSite, (Object)dev.hixo.M.d.a("\u00f9", (float)0.0f, (long)150107566387426058L) /* => java.lang.Float.valueOf */, (long)98318991380854553L) /* => java.util.Map.getOrDefault */)), (long)180878738827787874L) /* => java.lang.Float.floatValue */ - (float)d4 * 18.0f), (long)121565737685922221L) /* => java.lang.Math.max */, (long)150107566387426058L) /* => java.lang.Float.valueOf */, (long)87609561069083692L) /* => java.util.Map.put */;
        return true;
    }

    private List<Object> J() {
        ArrayList<Object> arrayList = new ArrayList<Object>();
        CallSite callSite = dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)112410867447181304L) /* => dev.hixo.c.u.p.T */, (long)113221006393852506L) /* => java.util.List.iterator */;
        while (dev.hixo.M.d.a("$", (Object)callSite, (long)175361412755674352L) /* => java.util.Iterator.hasNext */ != false) {
            K k2 = (K)((Object)dev.hixo.M.d.a("$", (Object)callSite, (long)64633749944946827L) /* => java.util.Iterator.next */);
            G g2 = (G)((Object)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)42671516645783629L) /* => dev.hixo.c.u.p.C */, (Object)((Object)k2), (long)150360683669181890L) /* => java.util.Map.get */);
            if (g2 == null) continue;
            dev.hixo.M.d.a("$", arrayList, (Object)dev.hixo.M.d.a("\u00f9", (Object)g2, (long)44274521335664869L) /* => dev.hixo.c.u.p.O */, (long)136382452326560341L) /* => java.util.List.addAll */;
        }
        return arrayList;
    }

    private float n(G g2) {
        if (g2 == null) {
            return 0.0f;
        }
        CallSite callSite = dev.hixo.M.d.a("$", (Object)g2, (long)118407510232379239L) /* => dev.hixo.M.G.P */;
        List list = (List)((Object)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)81381928922745381L) /* => dev.hixo.c.u.p.W */, (Object)callSite, (long)150360683669181890L) /* => java.util.Map.get */);
        if (list == null) {
            return 0.0f;
        }
        float f = 40.0f - dev.hixo.M.d.a("$", (Object)((Float)((Object)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)120239196506760815L) /* => dev.hixo.c.u.p.X */, (Object)callSite, (Object)dev.hixo.M.d.a("\u00f9", (float)0.0f, (long)150107566387426058L) /* => java.lang.Float.valueOf */, (long)98318991380854553L) /* => java.util.Map.getOrDefault */)), (long)180878738827787874L) /* => java.lang.Float.floatValue */;
        CallSite callSite2 = dev.hixo.M.d.a("$", (Object)list, (long)113221006393852506L) /* => java.util.List.iterator */;
        while (dev.hixo.M.d.a("$", (Object)callSite2, (long)175361412755674352L) /* => java.util.Iterator.hasNext */ != false) {
            G g3 = (G)((Object)dev.hixo.M.d.a("$", (Object)callSite2, (long)64633749944946827L) /* => java.util.Iterator.next */);
            f += 18.0f;
            if (g3 != g2) continue;
            return f + 2.0f;
        }
        return f;
    }

    private float i(G g2, int n2) {
        for (int i2 = 0; i2 < dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)112410867447181304L) /* => dev.hixo.c.u.p.T */, (long)180194190084079702L) /* => java.util.List.size */; ++i2) {
            if (dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)112410867447181304L) /* => dev.hixo.c.u.p.T */, (int)i2, (long)196824017790916210L) /* => java.util.List.get */ != dev.hixo.M.d.a("$", (Object)g2, (long)118407510232379239L) /* => dev.hixo.M.G.P */) continue;
            return (float)(dev.hixo.M.d.a("$", (Object)this, (int)i2, (int)n2, (long)158924503859573167L) /* => dev.hixo.c.u.p.e */ + 4.0f);
        }
        return 0.0f;
    }

    private boolean I(g g2, double d2, double d3, int n2) {
        CallSite callSite = dev.hixo.M.d.a("$", (Object)this, (Object)g2, (long)74639501028145618L) /* => dev.hixo.c.u.p.c */;
        if (callSite == null || dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)42671516645783629L) /* => dev.hixo.c.u.p.C */, (Object)dev.hixo.M.d.a("$", (Object)callSite, (long)118407510232379239L) /* => dev.hixo.M.G.P */, (long)150360683669181890L) /* => java.util.Map.get */ != callSite) {
            return false;
        }
        reference var8_6 = dev.hixo.M.d.a("$", (Object)this, (Object)callSite, (int)n2, (long)67621355517149987L) /* => dev.hixo.c.u.p.i */;
        float f = 120.0f;
        reference var10_8 = dev.hixo.M.d.a("$", (Object)this, (Object)callSite, (long)79454453769144532L) /* => dev.hixo.c.u.p.n */;
        reference var11_9 = var8_6;
        CallSite callSite2 = dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("\u00f9", (Object)callSite, (long)44274521335664869L) /* => dev.hixo.c.u.p.O */, (long)113221006393852506L) /* => java.util.List.iterator */;
        while (dev.hixo.M.d.a("$", (Object)callSite2, (long)175361412755674352L) /* => java.util.Iterator.hasNext */ != false) {
            CallSite callSite3 = dev.hixo.M.d.a("$", (Object)callSite2, (long)64633749944946827L) /* => java.util.Iterator.next */;
            if (!(callSite3 instanceof g)) continue;
            g g3 = (g)((Object)callSite3);
            float f2 = 17.0f + (float)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("\u00f9", (long)179869930689441125L) /* => net.minecraft.class_310.method_1551 */, (long)33332170178084458L) /* => net.minecraft.class_310.field_1772 */, (Object)dev.hixo.M.d.a("$", (Object)g3, (long)187344131104489819L) /* => dev.hixo.b.g.m */, (long)60514977858798819L) /* => net.minecraft.class_327.method_1727 */ + 10.0f;
            if (var11_9 > var8_6 && var11_9 + f2 > var8_6 + f) {
                var11_9 = var8_6;
                var10_8 += 17.0f;
            }
            if (g3 == g2 && d2 >= (double)var11_9 && d2 <= (double)(var11_9 + f2) && d3 >= (double)var10_8 && d3 <= (double)(var10_8 + 14.0f)) {
                return true;
            }
            var11_9 += f2;
        }
        return false;
    }

    private boolean o(M m2, double d2, double d3) {
        float[] fArray = (float[])dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)55330818966379250L) /* => dev.hixo.c.u.p.o */, (Object)m2, (long)150360683669181890L) /* => java.util.Map.get */;
        if (fArray == null) {
            return false;
        }
        CallSite callSite = dev.hixo.M.d.a("$", (Object)this, (Object)m2, (long)74639501028145618L) /* => dev.hixo.c.u.p.c */;
        if (callSite == null) {
            return false;
        }
        CallSite callSite2 = dev.hixo.M.d.a("$", (Object)this, (Object)callSite, (Object)m2, (long)132682924496190223L) /* => dev.hixo.c.u.p.i */;
        return d3 >= (double)callSite2 && d3 <= (double)(callSite2 + 24.0f) && d2 >= (double)(fArray[0] - 4.0f) && d2 <= (double)(fArray[0] + fArray[1] + 4.0f);
    }

    private float i(G g2, M m2) {
        CallSite callSite;
        reference var3_3 = dev.hixo.M.d.a("$", (Object)this, (Object)g2, (long)79454453769144532L) /* => dev.hixo.c.u.p.n */;
        boolean bl = false;
        CallSite callSite2 = dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("\u00f9", (Object)g2, (long)44274521335664869L) /* => dev.hixo.c.u.p.O */, (long)113221006393852506L) /* => java.util.List.iterator */;
        while (dev.hixo.M.d.a("$", (Object)callSite2, (long)175361412755674352L) /* => java.util.Iterator.hasNext */ != false) {
            callSite = dev.hixo.M.d.a("$", (Object)callSite2, (long)64633749944946827L) /* => java.util.Iterator.next */;
            if (!(callSite instanceof g)) continue;
            bl = true;
            break;
        }
        if (bl) {
            var3_3 += 20.0f;
        }
        callSite2 = dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("\u00f9", (Object)g2, (long)44274521335664869L) /* => dev.hixo.c.u.p.O */, (long)113221006393852506L) /* => java.util.List.iterator */;
        while (dev.hixo.M.d.a("$", (Object)callSite2, (long)175361412755674352L) /* => java.util.Iterator.hasNext */ != false) {
            callSite = dev.hixo.M.d.a("$", (Object)callSite2, (long)64633749944946827L) /* => java.util.Iterator.next */;
            if (!(callSite instanceof M)) continue;
            M m3 = (M)((Object)callSite);
            if (m3 == m2) {
                return (float)var3_3;
            }
            var3_3 += 26.0f;
        }
        return (float)var3_3;
    }

    private boolean Z(s s2, double d2, double d3, int n2) {
        CallSite callSite;
        CallSite callSite2 = dev.hixo.M.d.a("$", (Object)this, (Object)s2, (long)74639501028145618L) /* => dev.hixo.c.u.p.c */;
        if (callSite2 == null) {
            return false;
        }
        reference var8_6 = dev.hixo.M.d.a("$", (Object)this, (Object)callSite2, (int)n2, (long)67621355517149987L) /* => dev.hixo.c.u.p.i */;
        float f = 120.0f;
        reference var10_8 = dev.hixo.M.d.a("$", (Object)this, (Object)callSite2, (long)79454453769144532L) /* => dev.hixo.c.u.p.n */;
        boolean bl = false;
        CallSite callSite3 = dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("\u00f9", (Object)callSite2, (long)44274521335664869L) /* => dev.hixo.c.u.p.O */, (long)113221006393852506L) /* => java.util.List.iterator */;
        while (dev.hixo.M.d.a("$", (Object)callSite3, (long)175361412755674352L) /* => java.util.Iterator.hasNext */ != false) {
            callSite = dev.hixo.M.d.a("$", (Object)callSite3, (long)64633749944946827L) /* => java.util.Iterator.next */;
            if (!(callSite instanceof g)) continue;
            bl = true;
            break;
        }
        if (bl) {
            var10_8 += 20.0f;
        }
        callSite3 = dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("\u00f9", (Object)callSite2, (long)44274521335664869L) /* => dev.hixo.c.u.p.O */, (long)113221006393852506L) /* => java.util.List.iterator */;
        while (dev.hixo.M.d.a("$", (Object)callSite3, (long)175361412755674352L) /* => java.util.Iterator.hasNext */ != false) {
            callSite = dev.hixo.M.d.a("$", (Object)callSite3, (long)64633749944946827L) /* => java.util.Iterator.next */;
            if (!(callSite instanceof M)) continue;
            var10_8 += 26.0f;
        }
        callSite3 = dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("\u00f9", (long)179869930689441125L) /* => net.minecraft.class_310.method_1551 */, (long)33332170178084458L) /* => net.minecraft.class_310.field_1772 */;
        callSite = dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("\u00f9", (Object)callSite2, (long)44274521335664869L) /* => dev.hixo.c.u.p.O */, (long)113221006393852506L) /* => java.util.List.iterator */;
        while (dev.hixo.M.d.a("$", (Object)callSite, (long)175361412755674352L) /* => java.util.Iterator.hasNext */ != false) {
            CallSite callSite4 = dev.hixo.M.d.a("$", (Object)callSite, (long)64633749944946827L) /* => java.util.Iterator.next */;
            if (!(callSite4 instanceof s)) continue;
            s s3 = (s)((Object)callSite4);
            var10_8 += 13.0f;
            reference var16_14 = var8_6;
            CallSite callSite5 = dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("$", (Object)s3, (long)105057704192186989L) /* => dev.hixo.b.s.j */, (long)113221006393852506L) /* => java.util.List.iterator */;
            while (dev.hixo.M.d.a("$", (Object)callSite5, (long)175361412755674352L) /* => java.util.Iterator.hasNext */ != false) {
                String string = (String)((Object)dev.hixo.M.d.a("$", (Object)callSite5, (long)64633749944946827L) /* => java.util.Iterator.next */);
                float f2 = 15.0f + (float)dev.hixo.M.d.a("$", (Object)callSite3, (Object)string, (long)60514977858798819L) /* => net.minecraft.class_327.method_1727 */ + 12.0f;
                if (var16_14 > var8_6 && var16_14 + f2 > var8_6 + f) {
                    var16_14 = var8_6;
                    var10_8 += 17.0f;
                }
                if (s3 == s2 && d2 >= (double)var16_14 && d2 <= (double)(var16_14 + f2) && d3 >= (double)var10_8 && d3 <= (double)(var10_8 + 15.0f)) {
                    dev.hixo.M.d.a("$", (Object)s3, (Object)string, (long)89085773450015601L) /* => dev.hixo.b.s.w */;
                    c c2 = (c)((Object)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)38937209727315808L) /* => dev.hixo.c.u.p.Y */, (Object)s3, (long)150360683669181890L) /* => java.util.Map.get */);
                    if (c2 != null) {
                        dev.hixo.M.d.a("$", (Object)c2, (float)0.0f, (long)180022289998243493L) /* => dev.hixo.c.u.p$c.R */;
                    }
                    return true;
                }
                var16_14 += f2;
            }
            var10_8 += 19.0f;
        }
        return false;
    }

    private G c(Object object) {
        CallSite callSite = dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)112410867447181304L) /* => dev.hixo.c.u.p.T */, (long)113221006393852506L) /* => java.util.List.iterator */;
        while (dev.hixo.M.d.a("$", (Object)callSite, (long)175361412755674352L) /* => java.util.Iterator.hasNext */ != false) {
            K k2 = (K)((Object)dev.hixo.M.d.a("$", (Object)callSite, (long)64633749944946827L) /* => java.util.Iterator.next */);
            G g2 = (G)((Object)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)42671516645783629L) /* => dev.hixo.c.u.p.C */, (Object)((Object)k2), (long)150360683669181890L) /* => java.util.Map.get */);
            if (g2 == null || dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("\u00f9", (Object)g2, (long)44274521335664869L) /* => dev.hixo.c.u.p.O */, (Object)object, (long)68818840312729418L) /* => java.util.List.contains */ == false) continue;
            return g2;
        }
        return null;
    }

    private void e(M m2, double d2) {
        float[] fArray = (float[])dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)55330818966379250L) /* => dev.hixo.c.u.p.o */, (Object)m2, (long)150360683669181890L) /* => java.util.Map.get */;
        if (fArray == null) {
            return;
        }
        CallSite callSite = dev.hixo.M.d.a("\u00f9", (double)((d2 - (double)fArray[0]) / (double)dev.hixo.M.d.a("\u00f9", (float)1.0f, (float)fArray[1], (long)121565737685922221L) /* => java.lang.Math.max */), (double)0.0, (double)1.0, (long)74464747140271360L) /* => dev.hixo.c.u.p.n */;
        Object object = dev.hixo.M.d.a("$", (Object)m2, (long)38706059364368044L) /* => dev.hixo.b.M.F */ + callSite * (dev.hixo.M.d.a("$", (Object)m2, (long)187200934986827103L) /* => dev.hixo.b.M.s */ - dev.hixo.M.d.a("$", (Object)m2, (long)38706059364368044L) /* => dev.hixo.b.M.F */);
        if (dev.hixo.M.d.a("$", (Object)m2, (long)32416196599767288L) /* => dev.hixo.b.M.T */ > 0.0) {
            object = (double)dev.hixo.M.d.a("\u00f9", (double)(object / dev.hixo.M.d.a("$", (Object)m2, (long)32416196599767288L) /* => dev.hixo.b.M.T */), (long)33411004263283148L) /* => java.lang.Math.round */ * dev.hixo.M.d.a("$", (Object)m2, (long)32416196599767288L) /* => dev.hixo.b.M.T */;
        }
        dev.hixo.M.d.a("$", (Object)m2, (double)dev.hixo.M.d.a("\u00f9", (double)object, (double)dev.hixo.M.d.a("$", (Object)m2, (long)38706059364368044L) /* => dev.hixo.b.M.F */, (double)dev.hixo.M.d.a("$", (Object)m2, (long)187200934986827103L) /* => dev.hixo.b.M.s */, (long)74464747140271360L) /* => dev.hixo.c.u.p.n */, (long)40461037022129452L) /* => dev.hixo.b.M.j */;
    }

    private static List<Object> O(G g2) {
        ArrayList<Object> arrayList = new ArrayList<Object>();
        List list = (List)((Object)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("\u00fd", (long)50215281489291471L) /* => dev.hixo.c.u.p.i */, g2.getClass(), clazz -> {
            ArrayList arrayList = new ArrayList();
            for (CallSite callSite : dev.hixo.M.d.a("$", (Object)clazz, (long)169038102813085230L) /* => java.lang.Class.getFields */) {
                CallSite callSite2 = dev.hixo.M.d.a("$", (Object)callSite, (long)41971264004164462L) /* => java.lang.reflect.Field.getType */;
                if (dev.hixo.M.d.a("$", M.class, (Object)callSite2, (long)181628043272727078L) /* => java.lang.Class.isAssignableFrom */ == false && dev.hixo.M.d.a("$", g.class, (Object)callSite2, (long)181628043272727078L) /* => java.lang.Class.isAssignableFrom */ == false && dev.hixo.M.d.a("$", s.class, (Object)callSite2, (long)181628043272727078L) /* => java.lang.Class.isAssignableFrom */ == false && dev.hixo.M.d.a("$", C.class, (Object)callSite2, (long)181628043272727078L) /* => java.lang.Class.isAssignableFrom */ == false) continue;
                dev.hixo.M.d.a("$", arrayList, (Object)callSite, (long)184435215000867819L) /* => java.util.List.add */;
            }
            return arrayList;
        }, (long)123211639374652458L) /* => java.util.Map.computeIfAbsent */);
        CallSite callSite = dev.hixo.M.d.a("$", (Object)list, (long)113221006393852506L) /* => java.util.List.iterator */;
        while (dev.hixo.M.d.a("$", (Object)callSite, (long)175361412755674352L) /* => java.util.Iterator.hasNext */ != false) {
            Field field = (Field)((Object)dev.hixo.M.d.a("$", (Object)callSite, (long)64633749944946827L) /* => java.util.Iterator.next */);
            try {
                CallSite callSite2 = dev.hixo.M.d.a("$", (Object)field, (Object)g2, (long)69280199636988259L) /* => java.lang.reflect.Field.get */;
                if (callSite2 == null) continue;
                dev.hixo.M.d.a("$", arrayList, (Object)callSite2, (long)184435215000867819L) /* => java.util.List.add */;
            }
            catch (IllegalAccessException illegalAccessException) {
            }
        }
        return arrayList;
    }

    private static String g(double d2, double d3) {
        int n2 = d3 >= 1.0 ? 0 : (d3 >= 0.1 ? 1 : (d3 >= 0.01 ? 2 : 3));
        return dev.hixo.M.d.a("\u00f9", (Object)dev.hixo.M.d.a("\u00fd", (long)51037786433817985L) /* => java.util.Locale.ROOT */, (Object)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("$", (Object)new StringBuilder(), (Object)a[1], (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (int)n2, (long)32515713483113022L) /* => java.lang.StringBuilder.append */, (Object)"f", (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (long)59411206276622891L) /* => java.lang.StringBuilder.toString */, (Object)new Object[]{dev.hixo.M.d.a("\u00f9", (double)d2, (long)99715231705276505L) /* => java.lang.Double.valueOf */}, (long)55824363504792264L) /* => java.lang.String.format */;
    }

    private static String A(class_327 class_3272, String string, float f) {
        if (string == null) {
            return "";
        }
        if ((float)dev.hixo.M.d.a("$", (Object)class_3272, (Object)string, (long)60514977858798819L) /* => net.minecraft.class_327.method_1727 */ <= f) {
            return string;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i2 = 0; i2 < dev.hixo.M.d.a("$", string, (long)49243968837171037L) /* => java.lang.String.length */; ++i2) {
            CallSite callSite = dev.hixo.M.d.a("$", string, (int)i2, (long)62324382268630092L) /* => java.lang.String.charAt */;
            if ((float)dev.hixo.M.d.a("$", (Object)class_3272, (Object)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("$", (Object)new StringBuilder(), (Object)dev.hixo.M.d.a("$", (Object)stringBuilder, (long)59411206276622891L) /* => java.lang.StringBuilder.toString */, (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (char)callSite, (long)170414562223323178L) /* => java.lang.StringBuilder.append */, (Object)"\u2026", (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (long)59411206276622891L) /* => java.lang.StringBuilder.toString */, (long)60514977858798819L) /* => net.minecraft.class_327.method_1727 */ > f) break;
            dev.hixo.M.d.a("$", (Object)stringBuilder, (char)callSite, (long)170414562223323178L) /* => java.lang.StringBuilder.append */;
        }
        return dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("$", (Object)new StringBuilder(), (Object)stringBuilder, (long)121136869135998173L) /* => java.lang.StringBuilder.append */, (Object)"\u2026", (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (long)59411206276622891L) /* => java.lang.StringBuilder.toString */;
    }

    private static void r(class_332 class_3322, float f, float f2, float f3, float f4, float f5, int n2) {
        if (n2 >>> 24 == 0) {
            return;
        }
        CallSite callSite = dev.hixo.M.d.a("\u00f9", (float)f, (long)90255071001362112L) /* => java.lang.Math.round */;
        CallSite callSite2 = dev.hixo.M.d.a("\u00f9", (float)f2, (long)90255071001362112L) /* => java.lang.Math.round */;
        CallSite callSite3 = dev.hixo.M.d.a("\u00f9", (float)f3, (long)90255071001362112L) /* => java.lang.Math.round */;
        CallSite callSite4 = dev.hixo.M.d.a("\u00f9", (float)f4, (long)90255071001362112L) /* => java.lang.Math.round */;
        int n3 = (int)dev.hixo.M.d.a("\u00f9", (float)0.0f, (float)dev.hixo.M.d.a("\u00f9", (float)f5, (float)dev.hixo.M.d.a("\u00f9", (float)((float)(callSite3 - callSite) / 2.0f), (float)((float)(callSite4 - callSite2) / 2.0f), (long)139533018482628456L) /* => java.lang.Math.min */, (long)139533018482628456L) /* => java.lang.Math.min */, (long)121565737685922221L) /* => java.lang.Math.max */;
        if (callSite3 <= callSite || callSite4 <= callSite2) {
            return;
        }
        if (n3 == 0) {
            dev.hixo.M.d.a("$", (Object)class_3322, (int)callSite, (int)callSite2, (int)callSite3, (int)callSite4, (int)n2, (long)70222225705551889L) /* => net.minecraft.class_332.method_25294 */;
            return;
        }
        dev.hixo.M.d.a("$", (Object)class_3322, (int)callSite, (int)(callSite2 + n3), (int)callSite3, (int)(callSite4 - n3), (int)n2, (long)70222225705551889L) /* => net.minecraft.class_332.method_25294 */;
        for (int i2 = 0; i2 < n3; ++i2) {
            double d2 = (double)(n3 - i2) - 0.5;
            int n4 = (int)dev.hixo.M.d.a("\u00f9", (double)((double)n3 - dev.hixo.M.d.a("\u00f9", (double)((double)n3 * (double)n3 - d2 * d2), (long)146319326606007315L) /* => java.lang.Math.sqrt */), (long)33411004263283148L) /* => java.lang.Math.round */;
            dev.hixo.M.d.a("$", (Object)class_3322, (int)(callSite + n4), (int)(callSite2 + i2), (int)(callSite3 - n4), (int)(callSite2 + i2 + true), (int)n2, (long)70222225705551889L) /* => net.minecraft.class_332.method_25294 */;
            dev.hixo.M.d.a("$", (Object)class_3322, (int)(callSite + n4), (int)(callSite4 - i2 - true), (int)(callSite3 - n4), (int)(callSite4 - i2), (int)n2, (long)70222225705551889L) /* => net.minecraft.class_332.method_25294 */;
        }
    }

    private static void P(class_332 class_3322, class_327 class_3272, String string, float f, float f2, int n2) {
        if (n2 >>> 24 == 0 || string == null || dev.hixo.M.d.a("$", string, (long)139567490040770223L) /* => java.lang.String.isEmpty */ != false) {
            return;
        }
        dev.hixo.M.d.a("$", (Object)class_3322, (Object)class_3272, (Object)string, (int)dev.hixo.M.d.a("\u00f9", (float)f, (long)90255071001362112L) /* => java.lang.Math.round */, (int)dev.hixo.M.d.a("\u00f9", (float)f2, (long)90255071001362112L) /* => java.lang.Math.round */, (int)n2, (long)179776373438385131L) /* => net.minecraft.class_332.method_25303 */;
    }

    private static void S(class_332 class_3322, class_327 class_3272, String string, float f, float f2, int n2) {
        dev.hixo.M.d.a("\u00f9", (Object)class_3322, (Object)class_3272, (Object)string, (float)(f - (float)dev.hixo.M.d.a("$", (Object)class_3272, (Object)string, (long)60514977858798819L) /* => net.minecraft.class_327.method_1727 */ / 2.0f), (float)f2, (int)n2, (long)55939457012766636L) /* => dev.hixo.c.u.p.P */;
    }

    private static int z(int n2, float f) {
        CallSite callSite = dev.hixo.M.d.a("\u00f9", (float)0.0f, (float)dev.hixo.M.d.a("\u00f9", (float)1.0f, (float)f, (long)139533018482628456L) /* => java.lang.Math.min */, (long)121565737685922221L) /* => java.lang.Math.max */;
        CallSite callSite2 = dev.hixo.M.d.a("\u00f9", (float)((float)(n2 >>> 24 & 0xFF) * callSite), (long)90255071001362112L) /* => java.lang.Math.round */;
        return n2 & p.a(26342, 6410178787484200310L) | callSite2 << 24;
    }

    private static float c(float f) {
        return f < 0.0f ? 0.0f : (float)dev.hixo.M.d.a("\u00f9", (float)f, (float)1.0f, (long)139533018482628456L) /* => java.lang.Math.min */;
    }

    private static float z(float f) {
        return 1.0f - (float)dev.hixo.M.d.a("\u00f9", (double)(1.0f - dev.hixo.M.d.a("\u00f9", (float)f, (long)150686034155955851L) /* => dev.hixo.c.u.p.c */), (double)3.0, (long)69738387666927367L) /* => java.lang.Math.pow */;
    }

    private static float t(float f, float object, float f2) {
        if (f2 < object) {
            f2 = object;
        }
        return f < object ? object : (Object)dev.hixo.M.d.a("\u00f9", (float)f, (float)f2, (long)139533018482628456L) /* => java.lang.Math.min */;
    }

    private static double n(double d2, double object, double d3) {
        if (d3 < object) {
            d3 = object;
        }
        return d2 < object ? object : (Object)dev.hixo.M.d.a("\u00f9", (double)d2, (double)d3, (long)195251025896564278L) /* => java.lang.Math.min */;
    }

    private static /* synthetic */ c lambda$renderSettings$6(Object object) {
        return new c(0.0f, 0.3f);
    }

    private static /* synthetic */ c lambda$renderSettings$5(Object object) {
        return new c(0.0f, 0.35f);
    }

    private static /* synthetic */ c lambda$renderSettings$4(Object object) {
        return new c(0.0f, 0.3f);
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
                            var18_2 = "=rq\u00028s";
                            var20_3 = "=rq\u00028s".length();
                            var17_4 = 3;
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
                                        v6 = 29;
                                        break;
                                    }
                                    case 1: {
                                        v6 = 93;
                                        break;
                                    }
                                    case 2: {
                                        v6 = 81;
                                        break;
                                    }
                                    case 3: {
                                        v6 = 59;
                                        break;
                                    }
                                    case 4: {
                                        v6 = 13;
                                        break;
                                    }
                                    case 5: {
                                        v6 = 30;
                                        break;
                                    }
                                    default: {
                                        v6 = 33;
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
                        p.a = var21;
                        var8_7 = 5395818967919943181L;
                        var14_8 = new long[19];
                        var11_9 = 0;
                        var12_10 = "\u0093uCX^r\u00e2O3\u0081f\u009f\u00c24&=ef\u00ab\u00b7QlL\u00844\u000eyBmRZ\u00980\u00ee?\u00e2l\u0090\u00e2yl\u00ede\u0014ZY\u00bdJ.\"\u00f0$\u0083n1\u00e0\u009a\n\u0089\u008a\u00ff\u00ee\u00ec\u00fc\u00ff\u00dc\u009a\u000f\u00f8B\u00d3\u0012\u00c9\u00b9\u00c5\u00d5\u0018,\u00ee&\u00f2\u000eNP\u00d2\u0000\u0005\u00d9\u00e8\u0090/\t\u0007L\u00e0_]\u00ef\u00c5>\u00e4\u0081s\u00e7jK\u00b8b{\\\u00ab}\u0098A\u0002v\u00fdS\u00f7\u00cd!P\u001f\u00fe\u00fb\u0017\u00bfMh\u00b4\u00c7R\u00ae\u001eB\u0012";
                        var13_11 = "\u0093uCX^r\u00e2O3\u0081f\u009f\u00c24&=ef\u00ab\u00b7QlL\u00844\u000eyBmRZ\u00980\u00ee?\u00e2l\u0090\u00e2yl\u00ede\u0014ZY\u00bdJ.\"\u00f0$\u0083n1\u00e0\u009a\n\u0089\u008a\u00ff\u00ee\u00ec\u00fc\u00ff\u00dc\u009a\u000f\u00f8B\u00d3\u0012\u00c9\u00b9\u00c5\u00d5\u0018,\u00ee&\u00f2\u000eNP\u00d2\u0000\u0005\u00d9\u00e8\u0090/\t\u0007L\u00e0_]\u00ef\u00c5>\u00e4\u0081s\u00e7jK\u00b8b{\\\u00ab}\u0098A\u0002v\u00fdS\u00f7\u00cd!P\u001f\u00fe\u00fb\u0017\u00bfMh\u00b4\u00c7R\u00ae\u001eB\u0012".length();
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
                            var12_10 = "\u00bd\u00bdK\u00ea\u00a70?V(\u0084\u00922\u00d5i \u0014";
                            var13_11 = "\u00bd\u00bdK\u00ea\u00a70?V(\u0084\u00922\u00d5i \u0014".length();
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
                p.b = var14_8;
                p.c = new Integer[19];
                p.Z = p.a(26548, 2073659749282933799L);
                p.D = p.a(23650, 4658465614544951293L);
                p.y = p.a(13292, 6152242234369292409L);
                p.H = p.a(1273, 8460704408941825895L);
                p.K = p.a(27357, 411760744665276736L);
                p.f = p.a(30349, 5749498061453065489L);
                p.G = p.a(135, 4661228079742749445L);
                var0_14 = 3589927403861108330L;
                var6_15 = new long[2];
                var3_16 = 0;
                var4_17 = "\u00c6\u0000\u0012\u0015\u00ab\t\u00b6\t\u0094\u00e3\u001bW\u00be\u008f&O";
                var5_18 = "\u00c6\u0000\u0012\u0015\u00ab\t\u00b6\t\u0094\u00e3\u001bW\u00be\u008f&O".length();
                var2_19 = 0;
                while (true) {
                    break block24;
                    break;
                }
lbl111:
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
        p.d = var6_15;
        p.j = new Long[2];
        p.i = new HashMap<Class<?>, List<Field>>();
    }

    private static int a(int n2, long l2) {
        int n3 = n2 ^ (int)(l2 & 0x7FFFL) ^ 0xB92;
        if (c[n3] == null) {
            p.c[n3] = (int)(b[n3] ^ l2);
        }
        return c[n3];
    }

    private static long b(int n2, long l2) {
        int n3 = (n2 ^ (int)l2 ^ 0x17CA) & Short.MAX_VALUE;
        if (j[n3] == null) {
            p.j[n3] = d[n3] ^ l2;
        }
        return j[n3];
    }

    private static final class c {
        float C;
        float b;
        final float H;

        c(float f, float f2) {
            dev.hixo.M.d.a("\u00e7", (Object)this, (float)f, (long)129145670746197259L) /* => dev.hixo.c.u.p$c.C */;
            dev.hixo.M.d.a("\u00e7", (Object)this, (float)f, (long)107819553383237149L) /* => dev.hixo.c.u.p$c.b */;
            this.H = f2;
        }

        void C(float f) {
            dev.hixo.M.d.a("\u00e7", (Object)this, (float)f, (long)107819553383237149L) /* => dev.hixo.c.u.p$c.b */;
        }

        void R(float f) {
            dev.hixo.M.d.a("\u00e7", (Object)this, (float)f, (long)129145670746197259L) /* => dev.hixo.c.u.p$c.C */;
            dev.hixo.M.d.a("\u00e7", (Object)this, (float)f, (long)107819553383237149L) /* => dev.hixo.c.u.p$c.b */;
        }

        void T() {
            int n2 = s;
            reference var2_2 = dev.hixo.M.d.a("z", (Object)this, (long)107819553383237149L) /* => dev.hixo.c.u.p$c.b */ - dev.hixo.M.d.a("z", (Object)this, (long)129145670746197259L) /* => dev.hixo.c.u.p$c.C */;
            if (n2 == 0) {
                if (dev.hixo.M.d.a("\u00f9", (float)var2_2, (long)164168003445879722L) /* => java.lang.Math.abs */ < 0.01f) {
                    dev.hixo.M.d.a("\u00e7", (Object)this, (float)dev.hixo.M.d.a("z", (Object)this, (long)107819553383237149L) /* => dev.hixo.c.u.p$c.b */, (long)129145670746197259L) /* => dev.hixo.c.u.p$c.C */;
                    return;
                }
                c c2 = this;
                dev.hixo.M.d.a("\u00e7", (Object)c2, (float)(dev.hixo.M.d.a("z", (Object)c2, (long)129145670746197259L) /* => dev.hixo.c.u.p$c.C */ + var2_2 * dev.hixo.M.d.a("z", (Object)this, (long)79259246834330145L) /* => dev.hixo.c.u.p$c.H */), (long)129145670746197259L) /* => dev.hixo.c.u.p$c.C */;
            }
            if (dev.hixo.M.G.L) {
                s = ++n2;
            }
        }
    }

    private static final class z {
        final C G;
        final String f;
        final float I;
        final float O;
        final float u;
        final float X;

        z(C c2, String string, float f, float f2, float f3, float f4) {
            this.G = c2;
            this.f = string;
            int n2 = s;
            this.I = f;
            this.O = f2;
            this.u = f3;
            this.X = f4;
            if (n2 != 0) {
                dev.hixo.M.G.L = !dev.hixo.M.G.L;
            }
        }
    }

    private static final class D
    extends l {
        private D() {
        }
    }

    private static final class m
    extends l {
        private m() {
        }
    }

    private static final class i
    extends l {
        private i() {
        }
    }

    private static abstract class l
    extends E {
        private l() {
        }
    }

    private static final class T
    extends E {
        private T() {
        }
    }

    private static final class R
    extends E {
        private R() {
        }
    }

    private static abstract class E {
        float P;
        float n;
        float a;
        float H;

        private E() {
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        boolean f(double d2, double d3) {
            double d4;
            double d5;
            int n2;
            block5: {
                E e2;
                block4: {
                    n2 = s;
                    d5 = d2;
                    e2 = this;
                    if (n2 != 0) break block4;
                    if (!(d5 >= (double)dev.hixo.M.d.a("z", (Object)e2, (long)199414154865578719L) /* => dev.hixo.c.u.p$E.P */)) return 0 != 0;
                    d5 = d2;
                    if (n2 != 0) break block5;
                    e2 = this;
                }
                if (!(d5 <= (double)(dev.hixo.M.d.a("z", (Object)e2, (long)199414154865578719L) /* => dev.hixo.c.u.p$E.P */ + dev.hixo.M.d.a("z", (Object)this, (long)156912025441798370L) /* => dev.hixo.c.u.p$E.a */))) return 0 != 0;
                d5 = d3;
            }
            double d6 = (double)dev.hixo.M.d.a("z", (Object)this, (long)103096325185050782L) /* => dev.hixo.c.u.p$E.n */;
            if (n2 == 0) {
                if (!(d5 >= d6)) return 0 != 0;
                d5 = d3;
                d6 = (double)(dev.hixo.M.d.a("z", (Object)this, (long)103096325185050782L) /* => dev.hixo.c.u.p$E.n */ + dev.hixo.M.d.a("z", (Object)this, (long)60836895736554387L) /* => dev.hixo.c.u.p$E.H */);
            }
            int n3 = (d4 = d5 - d6) == 0.0 ? 0 : (d4 < 0.0 ? -1 : 1);
            if (n2 != 0) return n3 != 0;
            if (n3 > 0) return 0 != 0;
            return 1 != 0;
        }
    }
}

