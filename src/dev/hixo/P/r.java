/*
 * RESTORED SOURCE — decompiled reconstruction, not the original files.
 * class: dev.hixo.P.r
 * context strings: 'slider' | 'hixo' | 'key' | 'enabled'
 */

/*
 * Decompiled with CFR 0.152.
 */
package dev.hixo.P;

import dev.hixo.M.G;
import dev.hixo.M.d;
import dev.hixo.P.s;
import dev.hixo.b.C;
import dev.hixo.b.M;
import dev.hixo.b.g;
import java.io.IOException;
import java.lang.invoke.CallSite;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.util.List;

public final class r {
    private static final Path O;
    private static final Path V;
    private static final String[] a;

    private r() {
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void V(List<G> var0) {
        var1_1 = s.X;
        v0 = d.a("\u00fd", (long)183583755167375451L) /* => dev.hixo.P.r.V */;
        if (var1_1 != 0) ** GOTO lbl8
        if (d.a("\u00f9", (Object)v0, (Object)new LinkOption[0], (long)36492623627969450L) /* => java.nio.file.Files.exists */ == false) {
            return;
        }
        try {
            v0 = d.a("\u00fd", (long)183583755167375451L) /* => dev.hixo.P.r.V */;
lbl8:
            // 2 sources

            var2_2 = d.a("$", (Object)d.a("\u00f9", (Object)v0, (long)173169755040636832L) /* => java.nio.file.Files.readAllLines */, (long)113221006393852506L) /* => java.util.List.iterator */;
            while (d.a("$", (Object)var2_2, (long)175361412755674352L) /* => java.util.Iterator.hasNext */ != false) {
                block57: {
                    var3_4 = (String)d.a("$", (Object)var2_2, (long)64633749944946827L) /* => java.util.Iterator.next */;
                    if (var1_1 != 0) return;
                    v1 = var3_4;
                    if (var1_1 == 0) {
                        if (d.a("$", v1, (long)113060954469207873L) /* => java.lang.String.isBlank */ != false) continue;
                        v1 = var3_4;
                    }
                    if (((CallSite)(var4_5 = d.a("$", v1, (Object)"\t", (int)-1, (long)183700585267436096L) /* => java.lang.String.split */)).length < 3 || (var5_6 = d.a("\u00f9", var0, (Object)var4_5[1], (long)182732308398023214L) /* => dev.hixo.P.r.x */) == null) continue;
                    var6_7 = var4_5[0];
                    var7_8 = -1;
                    v2 /* !! */  = d.a("$", (Object)var6_7, (long)192171503307955577L) /* => java.lang.String.hashCode */;
                    if (var1_1 != 0) break block57;
                    switch (v2 /* !! */ ) {
                        case 106079: {
                            v2 /* !! */  = d.a("$", (Object)var6_7, (Object)r.a[5], (long)130616148886603248L) /* => java.lang.String.equals */;
                            if (var1_1 == 0) {
                                if (v2 /* !! */  == false) break;
                                var7_8 = 0;
                                if (var1_1 == 0) break;
                            }
                            break block57;
                        }
                        case -1609594047: {
                            v2 /* !! */  = d.a("$", (Object)var6_7, (Object)r.a[6], (long)130616148886603248L) /* => java.lang.String.equals */;
                            if (var1_1 == 0) {
                                if (v2 /* !! */  == false) break;
                                var7_8 = 1;
                                if (var1_1 == 0) break;
                            }
                            break block57;
                        }
                        case -889473228: {
                            v2 /* !! */  = d.a("$", (Object)var6_7, (Object)r.a[7], (long)130616148886603248L) /* => java.lang.String.equals */;
                            if (var1_1 == 0) {
                                if (v2 /* !! */  == false) break;
                                var7_8 = 2;
                                if (var1_1 == 0) break;
                            }
                            break block57;
                        }
                        case -899647263: {
                            v2 /* !! */  = d.a("$", (Object)var6_7, (Object)r.a[1], (long)130616148886603248L) /* => java.lang.String.equals */;
                            if (var1_1 == 0) {
                                if (v2 /* !! */  == false) break;
                                var7_8 = 3;
                                if (var1_1 == 0) break;
                            }
                            break block57;
                        }
                        case -432061423: {
                            v2 /* !! */  = d.a("$", (Object)var6_7, (Object)r.a[10], (long)130616148886603248L) /* => java.lang.String.equals */;
                            if (var1_1 != 0) break block57;
                            if (v2 /* !! */  == false) break;
                            var7_8 = 4;
                        }
                    }
                    v2 /* !! */  = (CallSite)var7_8;
                }
                switch (v2 /* !! */ ) {
                    case 0: {
                        d.a("$", (Object)var5_6, (int)d.a("\u00f9", (Object)var4_5[2], (long)126227374378648910L) /* => dev.hixo.P.r.p */, (long)113806433936288059L) /* => dev.hixo.M.G.z */;
                        if (var1_1 == 0) break;
                    }
                    case 1: {
                        v3 = d.a("\u00f9", (Object)var4_5[2], (long)60089249307669847L) /* => java.lang.Boolean.parseBoolean */;
                        if (var1_1 != 0) ** GOTO lbl68
                        if (v3 == false) break;
                        v4 = var5_6;
                        if (var1_1 != 0) ** GOTO lbl70
                        v3 = d.a("$", (Object)v4, (long)96089342888548907L) /* => dev.hixo.M.G.c */;
lbl68:
                        // 2 sources

                        if (v3 != false) break;
                        v4 = var5_6;
lbl70:
                        // 2 sources

                        d.a("$", (Object)v4, (boolean)true, (long)182143715398436705L) /* => dev.hixo.M.G.r */;
                        if (var1_1 == 0) break;
                    }
                    case 2: {
                        if (((CallSite)var4_5).length < 4) break;
                        d.a("\u00f9", (Object)var5_6, (Object)var4_5[2], (boolean)d.a("\u00f9", (Object)var4_5[3], (long)60089249307669847L) /* => java.lang.Boolean.parseBoolean */, (long)173624602924681548L) /* => dev.hixo.P.r.i */;
                        if (var1_1 == 0) break;
                    }
                    case 3: {
                        if (((CallSite)var4_5).length < 4) break;
                        d.a("\u00f9", (Object)var5_6, (Object)var4_5[2], (Object)var4_5[3], (long)95901978532695726L) /* => dev.hixo.P.r.i */;
                        if (var1_1 == 0) break;
                    }
                    case 4: {
                        if (((CallSite)var4_5).length < 4) break;
                        d.a("\u00f9", (Object)var5_6, (Object)var4_5[2], (Object)var4_5[3], (long)200704492043868354L) /* => dev.hixo.P.r.G */;
                        break;
                    }
                }
                if (var1_1 != 0) return;
            }
            return;
        }
        catch (IOException var2_3) {
            // empty catch block
        }
    }

    public static void c(List<G> list) {
        StringBuilder stringBuilder = new StringBuilder();
        CallSite callSite = d.a("$", list, (long)113221006393852506L) /* => java.util.List.iterator */;
        while (d.a("$", (Object)callSite, (long)175361412755674352L) /* => java.util.Iterator.hasNext */ != false) {
            G g2 = (G)((Object)d.a("$", (Object)callSite, (long)64633749944946827L) /* => java.util.Iterator.next */);
            String[] stringArray = a;
            d.a("$", (Object)d.a("$", (Object)d.a("$", (Object)d.a("$", (Object)d.a("$", (Object)stringBuilder, (Object)stringArray[0], (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (Object)d.a("$", (Object)g2, (long)197754555450540863L) /* => dev.hixo.M.G.V */, (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (char)'\t', (long)170414562223323178L) /* => java.lang.StringBuilder.append */, (int)d.a("$", (Object)g2, (long)130182560422634980L) /* => dev.hixo.M.G.x */, (long)32515713483113022L) /* => java.lang.StringBuilder.append */, (char)'\n', (long)170414562223323178L) /* => java.lang.StringBuilder.append */;
            d.a("$", (Object)d.a("$", (Object)d.a("$", (Object)d.a("$", (Object)d.a("$", (Object)stringBuilder, (Object)stringArray[8], (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (Object)d.a("$", (Object)g2, (long)197754555450540863L) /* => dev.hixo.M.G.V */, (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (char)'\t', (long)170414562223323178L) /* => java.lang.StringBuilder.append */, (boolean)d.a("$", (Object)g2, (long)96089342888548907L) /* => dev.hixo.M.G.c */, (long)174170300402165012L) /* => java.lang.StringBuilder.append */, (char)'\n', (long)170414562223323178L) /* => java.lang.StringBuilder.append */;
            for (CallSite callSite2 : d.a("$", g2.getClass(), (long)169038102813085230L) /* => java.lang.Class.getFields */) {
                try {
                    CallSite callSite3 = d.a("$", (Object)callSite2, (Object)g2, (long)69280199636988259L) /* => java.lang.reflect.Field.get */;
                    if (callSite3 instanceof g) {
                        g g3 = (g)((Object)callSite3);
                        stringArray = a;
                        d.a("$", (Object)d.a("$", (Object)d.a("$", (Object)d.a("$", (Object)d.a("$", (Object)d.a("$", (Object)d.a("$", (Object)stringBuilder, (Object)stringArray[3], (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (Object)d.a("$", (Object)g2, (long)197754555450540863L) /* => dev.hixo.M.G.V */, (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (char)'\t', (long)170414562223323178L) /* => java.lang.StringBuilder.append */, (Object)d.a("$", (Object)g3, (long)187344131104489819L) /* => dev.hixo.b.g.m */, (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (char)'\t', (long)170414562223323178L) /* => java.lang.StringBuilder.append */, (boolean)d.a("$", (Object)g3, (long)65580906021680841L) /* => dev.hixo.b.g.x */, (long)174170300402165012L) /* => java.lang.StringBuilder.append */, (char)'\n', (long)170414562223323178L) /* => java.lang.StringBuilder.append */;
                        continue;
                    }
                    if (callSite3 instanceof M) {
                        M m2 = (M)((Object)callSite3);
                        stringArray = a;
                        d.a("$", (Object)d.a("$", (Object)d.a("$", (Object)d.a("$", (Object)d.a("$", (Object)d.a("$", (Object)d.a("$", (Object)stringBuilder, (Object)stringArray[2], (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (Object)d.a("$", (Object)g2, (long)197754555450540863L) /* => dev.hixo.M.G.V */, (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (char)'\t', (long)170414562223323178L) /* => java.lang.StringBuilder.append */, (Object)d.a("$", (Object)m2, (long)134725525843708953L) /* => dev.hixo.b.M.C */, (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (char)'\t', (long)170414562223323178L) /* => java.lang.StringBuilder.append */, (double)d.a("$", (Object)m2, (long)86270808255001128L) /* => dev.hixo.b.M.J */, (long)82583502000467467L) /* => java.lang.StringBuilder.append */, (char)'\n', (long)170414562223323178L) /* => java.lang.StringBuilder.append */;
                        continue;
                    }
                    if (!(callSite3 instanceof dev.hixo.b.s)) continue;
                    dev.hixo.b.s s2 = (dev.hixo.b.s)((Object)callSite3);
                    d.a("$", (Object)d.a("$", (Object)d.a("$", (Object)d.a("$", (Object)d.a("$", (Object)d.a("$", (Object)d.a("$", (Object)stringBuilder, (Object)a[9], (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (Object)d.a("$", (Object)g2, (long)197754555450540863L) /* => dev.hixo.M.G.V */, (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (char)'\t', (long)170414562223323178L) /* => java.lang.StringBuilder.append */, (Object)d.a("$", (Object)s2, (long)37801073602694120L) /* => dev.hixo.b.s.O */, (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (char)'\t', (long)170414562223323178L) /* => java.lang.StringBuilder.append */, (Object)d.a("$", (Object)s2, (long)50503865389075616L) /* => dev.hixo.b.s.I */, (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (char)'\n', (long)170414562223323178L) /* => java.lang.StringBuilder.append */;
                }
                catch (IllegalAccessException illegalAccessException) {
                    // empty catch block
                }
            }
        }
        try {
            d.a("\u00f9", (Object)d.a("\u00fd", (long)116944432064175890L) /* => dev.hixo.P.r.O */, (Object)new FileAttribute[0], (long)74086661171466201L) /* => java.nio.file.Files.createDirectories */;
            d.a("\u00f9", (Object)d.a("\u00fd", (long)183583755167375451L) /* => dev.hixo.P.r.V */, (Object)d.a("$", (Object)stringBuilder, (long)59411206276622891L) /* => java.lang.StringBuilder.toString */, (Object)new OpenOption[0], (long)172763035246580897L) /* => java.nio.file.Files.writeString */;
        }
        catch (IOException iOException) {
            // empty catch block
        }
    }

    private static void E(G g2, String string, String string2) {
        for (CallSite callSite : d.a("$", g2.getClass(), (long)169038102813085230L) /* => java.lang.Class.getFields */) {
            try {
                CallSite callSite2 = d.a("$", (Object)callSite, (Object)g2, (long)69280199636988259L) /* => java.lang.reflect.Field.get */;
                if (!(callSite2 instanceof C)) continue;
                C c2 = (C)((Object)callSite2);
                if (d.a("$", (Object)d.a("$", (Object)c2, (long)191474110668176287L) /* => dev.hixo.b.C.p */, (Object)string, (long)130616148886603248L) /* => java.lang.String.equals */ == false) continue;
                d.a("$", (Object)c2, (Object)string2, (long)68996179405621104L) /* => dev.hixo.b.C.a */;
            }
            catch (IllegalAccessException illegalAccessException) {
                // empty catch block
            }
        }
    }

    private static G x(List<G> list, String string) {
        CallSite callSite = d.a("$", list, (long)113221006393852506L) /* => java.util.List.iterator */;
        while (d.a("$", (Object)callSite, (long)175361412755674352L) /* => java.util.Iterator.hasNext */ != false) {
            G g2 = (G)((Object)d.a("$", (Object)callSite, (long)64633749944946827L) /* => java.util.Iterator.next */);
            if (d.a("$", (Object)d.a("$", (Object)g2, (long)197754555450540863L) /* => dev.hixo.M.G.V */, (Object)string, (long)106044803757638707L) /* => java.lang.String.equalsIgnoreCase */ == false) continue;
            return g2;
        }
        return null;
    }

    private static int p(String string) {
        try {
            return (int)d.a("\u00f9", (Object)d.a("$", string, (long)95323155317830449L) /* => java.lang.String.trim */, (long)116575146714505514L) /* => java.lang.Integer.parseInt */;
        }
        catch (NumberFormatException numberFormatException) {
            return 0;
        }
    }

    private static void i(G g2, String string, boolean bl) {
        for (CallSite callSite : d.a("$", g2.getClass(), (long)169038102813085230L) /* => java.lang.Class.getFields */) {
            try {
                CallSite callSite2 = d.a("$", (Object)callSite, (Object)g2, (long)69280199636988259L) /* => java.lang.reflect.Field.get */;
                if (!(callSite2 instanceof g)) continue;
                g g3 = (g)((Object)callSite2);
                if (d.a("$", (Object)d.a("$", (Object)g3, (long)187344131104489819L) /* => dev.hixo.b.g.m */, (Object)string, (long)130616148886603248L) /* => java.lang.String.equals */ == false) continue;
                d.a("$", (Object)g3, (boolean)bl, (long)168496403069269529L) /* => dev.hixo.b.g.M */;
            }
            catch (IllegalAccessException illegalAccessException) {
                // empty catch block
            }
        }
    }

    private static void i(G g2, String string, String string2) {
        CallSite callSite;
        try {
            callSite = d.a("\u00f9", (Object)d.a("$", string2, (long)95323155317830449L) /* => java.lang.String.trim */, (long)112127253143226518L) /* => java.lang.Double.parseDouble */;
        }
        catch (NumberFormatException numberFormatException) {
            return;
        }
        for (CallSite callSite2 : d.a("$", g2.getClass(), (long)169038102813085230L) /* => java.lang.Class.getFields */) {
            try {
                CallSite callSite3 = d.a("$", (Object)callSite2, (Object)g2, (long)69280199636988259L) /* => java.lang.reflect.Field.get */;
                if (!(callSite3 instanceof M)) continue;
                M m2 = (M)((Object)callSite3);
                if (d.a("$", (Object)d.a("$", (Object)m2, (long)134725525843708953L) /* => dev.hixo.b.M.C */, (Object)string, (long)130616148886603248L) /* => java.lang.String.equals */ == false) continue;
                d.a("$", (Object)m2, (double)callSite, (long)40461037022129452L) /* => dev.hixo.b.M.j */;
            }
            catch (IllegalAccessException illegalAccessException) {
                // empty catch block
            }
        }
    }

    private static void G(G g2, String string, String string2) {
        for (CallSite callSite : d.a("$", g2.getClass(), (long)169038102813085230L) /* => java.lang.Class.getFields */) {
            try {
                CallSite callSite2 = d.a("$", (Object)callSite, (Object)g2, (long)69280199636988259L) /* => java.lang.reflect.Field.get */;
                if (!(callSite2 instanceof dev.hixo.b.s)) continue;
                dev.hixo.b.s s2 = (dev.hixo.b.s)((Object)callSite2);
                if (d.a("$", (Object)d.a("$", (Object)s2, (long)37801073602694120L) /* => dev.hixo.b.s.O */, (Object)string, (long)130616148886603248L) /* => java.lang.String.equals */ == false) continue;
                d.a("$", (Object)s2, (Object)string2, (long)89085773450015601L) /* => dev.hixo.b.s.w */;
            }
            catch (IllegalAccessException illegalAccessException) {
                // empty catch block
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block19: {
            block18: {
                var5 = new String[12];
                var3_1 = 0;
                var2_2 = "\u0007\u0002\u001e\u0001\u0006\u001f\u000b\u000elU3\u0007\u001f\u000b\u000elU3\u0001\u0007\u001f\u0010\u000e|S)\u0001\u0004\u0004\u000e\u001fg\u0003\u0007\u0002\u001e\u0007\t\t\u0006j\\$l\u0006\u001f\u0010\u000e|S)\b\t\t\u0006j\\$le\t\b\u0015\bxT.\u007f\u0002n";
                var4_3 = "\u0007\u0002\u001e\u0001\u0006\u001f\u000b\u000elU3\u0007\u001f\u000b\u000elU3\u0001\u0007\u001f\u0010\u000e|S)\u0001\u0004\u0004\u000e\u001fg\u0003\u0007\u0002\u001e\u0007\t\t\u0006j\\$l\u0006\u001f\u0010\u000e|S)\b\t\t\u0006j\\$le\t\b\u0015\bxT.\u007f\u0002n".length();
                var1_4 = 4;
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
                    var2_2 = "\b\u0015\bxT.\u007f\u0002\u000b\u0001\b\u0003}\\${B\u0013\u001f|";
                    var4_3 = "\b\u0015\bxT.\u007f\u0002\u000b\u0001\b\u0003}\\${B\u0013\u001f|".length();
                    var1_4 = 8;
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
            var6_7 = 0;
            if (true) ** GOTO lbl65
            do {
                v6 = v6;
                v8 = var6_7;
                v9 = v6[v8];
                switch (var6_7 % 7) {
                    case 0: {
                        v10 = 108;
                        break;
                    }
                    case 1: {
                        v10 = 103;
                        break;
                    }
                    case 2: {
                        v10 = 103;
                        break;
                    }
                    case 3: {
                        v10 = 8;
                        break;
                    }
                    case 4: {
                        v10 = 48;
                        break;
                    }
                    case 5: {
                        v10 = 65;
                        break;
                    }
                    default: {
                        v10 = 8;
                    }
                }
                v6[v8] = (char)(v9 ^ v10);
                ++var6_7;
lbl65:
                // 2 sources

                v7 = v7;
            } while (v7 > var6_7);
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
        r.a = var5;
        var0_6 = r.a;
        r.O = d.a("$", (Object)d.a("$", (Object)d.a("\u00f9", (long)90911588868832161L) /* => net.fabricmc.loader.api.FabricLoader.getInstance */, (long)79829488086528476L) /* => net.fabricmc.loader.api.FabricLoader.getGameDir */, (Object)var0_6[4], (long)48741110158964543L) /* => java.nio.file.Path.resolve */;
        r.V = d.a("$", (Object)d.a("\u00fd", (long)116944432064175890L) /* => dev.hixo.P.r.O */, (Object)var0_6[11], (long)48741110158964543L) /* => java.nio.file.Path.resolve */;
    }
}

