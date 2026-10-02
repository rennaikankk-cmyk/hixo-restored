/*
 * RESTORED SOURCE — decompiled reconstruction, not the original files.
 * class: asm.patchify.loader.PatchRegistry
 * context strings: ' is missing @Patch' | 'Registered patch {} -> {}'
 */

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.Logger
 */
package asm.patchify.loader;

import asm.patchify.annotation.Patch;
import asm.patchify.loader.PatchTransformer;
import dev.hixo.M.G;
import dev.hixo.M.d;
import java.lang.invoke.CallSite;
import java.util.ArrayList;
import java.util.List;
import org.apache.logging.log4j.Logger;

public final class PatchRegistry {
    private static final Logger LOGGER;
    private static final List<Class<?>> PATCHES;
    private static final String[] a;

    private PatchRegistry() {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public static void register(Class<?> clazz) {
        boolean bl;
        block10: {
            Patch patch;
            block9: {
                patch = (Patch)((Object)d.a("$", clazz, Patch.class, (long)151718104097738338L) /* => java.lang.Class.getAnnotation */);
                bl = PatchTransformer.O;
                if (patch == null) {
                    throw new IllegalArgumentException((String)((Object)d.a("$", (Object)d.a("$", (Object)d.a("$", (Object)new StringBuilder(), (Object)d.a("$", clazz, (long)182318511367922152L) /* => java.lang.Class.getName */, (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (Object)a[0], (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (long)59411206276622891L) /* => java.lang.StringBuilder.toString */));
                }
                CallSite callSite = d.a("\u00fd", (long)62786168055807617L) /* => asm.patchify.loader.PatchRegistry.PATCHES */;
                // MONITORENTER : callSite
                if (bl) break block9;
                if (d.a("$", (Object)d.a("\u00fd", (long)62786168055807617L) /* => asm.patchify.loader.PatchRegistry.PATCHES */, clazz, (long)68818840312729418L) /* => java.util.List.contains */ != false) break block10;
                d.a("$", (Object)d.a("\u00fd", (long)62786168055807617L) /* => asm.patchify.loader.PatchRegistry.PATCHES */, clazz, (long)184435215000867819L) /* => java.util.List.add */;
            }
            d.a("$", (Object)d.a("\u00fd", (long)172623342481687544L) /* => asm.patchify.loader.PatchRegistry.LOGGER */, (Object)a[1], (Object)d.a("$", clazz, (long)182318511367922152L) /* => java.lang.Class.getName */, (Object)d.a("$", (Object)d.a("$", (Object)patch, (long)80437421054490806L) /* => asm.patchify.annotation.Patch.value */, (long)182318511367922152L) /* => java.lang.Class.getName */, (long)74664868832672546L) /* => org.apache.logging.log4j.Logger.debug */;
        }
        // MONITOREXIT : callSite
        if (!bl) return;
        G.L = !G.L;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static List<Class<?>> getPatches() {
        CallSite callSite = d.a("\u00fd", (long)62786168055807617L) /* => asm.patchify.loader.PatchRegistry.PATCHES */;
        synchronized (callSite) {
            return d.a("\u00f9", new ArrayList(d.a("\u00fd", (long)62786168055807617L) /* => asm.patchify.loader.PatchRegistry.PATCHES */), (long)89911962213194532L) /* => java.util.Collections.unmodifiableList */;
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block12: {
            var5 = new String[2];
            var3_1 = 0;
            var2_2 = "\\\u0003)\u0001dBk\u000f\u00034F)kH\u001d\u001e9I\u0019.\u000f=Hz_}\u000e\u000f>\u0001yJl\u001f\u0002zZt\u000b5BJ!\\";
            var4_3 = "\\\u0003)\u0001dBk\u000f\u00034F)kH\u001d\u001e9I\u0019.\u000f=Hz_}\u000e\u000f>\u0001yJl\u001f\u0002zZt\u000b5BJ!\\".length();
            var1_4 = 18;
            var0_5 = -1;
lbl7:
            // 2 sources

            while (true) {
                continue;
                break;
            }
lbl9:
            // 1 sources

            while (true) {
                var5[var3_1++] = new String(v0).intern();
                if ((var0_5 += var1_4) < var4_3) {
                    var1_4 = var2_2.charAt(var0_5);
                    ** continue;
                }
                break block12;
                break;
            }
            v1 = ++var0_5;
            v2 = var2_2.substring(v1, v1 + var1_4).toCharArray();
            v0 = v2;
            v3 = v2.length;
            var6_6 = 0;
            if (true) ** GOTO lbl48
            do {
                v0 = v0;
                v4 = var6_6;
                v5 = v0[v4];
                switch (var6_6 % 7) {
                    case 0: {
                        v6 = 124;
                        break;
                    }
                    case 1: {
                        v6 = 106;
                        break;
                    }
                    case 2: {
                        v6 = 90;
                        break;
                    }
                    case 3: {
                        v6 = 33;
                        break;
                    }
                    case 4: {
                        v6 = 9;
                        break;
                    }
                    case 5: {
                        v6 = 43;
                        break;
                    }
                    default: {
                        v6 = 24;
                    }
                }
                v0[v4] = (char)(v5 ^ v6);
                ++var6_6;
lbl48:
                // 2 sources

                v3 = v3;
            } while (v3 > var6_6);
            ** while (true)
        }
        PatchRegistry.a = var5;
        PatchRegistry.LOGGER = d.a("\u00f9", PatchRegistry.class, (long)163330105986552197L) /* => org.apache.logging.log4j.LogManager.getLogger */;
        PatchRegistry.PATCHES = new ArrayList<Class<?>>();
    }
}

