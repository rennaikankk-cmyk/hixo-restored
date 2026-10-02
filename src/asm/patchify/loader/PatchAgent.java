/*
 * RESTORED SOURCE — decompiled reconstruction, not the original files.
 * class: asm.patchify.loader.PatchAgent
 * context strings: 'agent attached, retransform supported = | 'oz.instrumentation' | 'agent not attached; cannot install patc | 'Cannot retransform unmodifiable target 
 */

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.Logger
 */
package asm.patchify.loader;

import asm.patchify.annotation.Patch;
import asm.patchify.loader.PatchClassFileTransformer;
import asm.patchify.loader.PatchTransformer;
import dev.hixo.M.d;
import java.lang.instrument.Instrumentation;
import java.lang.invoke.CallSite;
import java.util.ArrayList;
import org.apache.logging.log4j.Logger;

public final class PatchAgent {
    public static final String INSTRUMENTATION_KEY;
    private static final Logger LOGGER;
    private static volatile boolean transformerInstalled;
    private static final String[] a;

    private PatchAgent() {
    }

    public static void premain(String string, Instrumentation instrumentation) {
        d.a("\u00f9", (Object)instrumentation, (long)146644246061227980L) /* => asm.patchify.loader.PatchAgent.install */;
    }

    public static void agentmain(String string, Instrumentation instrumentation) {
        d.a("\u00f9", (Object)instrumentation, (long)146644246061227980L) /* => asm.patchify.loader.PatchAgent.install */;
    }

    public static synchronized void install(Instrumentation instrumentation) {
        String[] stringArray = a;
        CallSite callSite = d.a("$", (Object)d.a("\u00f9", (long)181568752537917202L) /* => java.lang.System.getProperties */, (Object)stringArray[7], (long)146234593578405645L) /* => java.util.Properties.get */;
        if (callSite == instrumentation) {
            return;
        }
        stringArray = a;
        d.a("$", (Object)d.a("\u00f9", (long)181568752537917202L) /* => java.lang.System.getProperties */, (Object)stringArray[1], (Object)instrumentation, (long)82730464176579647L) /* => java.util.Properties.put */;
        d.a("$", (Object)d.a("\u00fd", (long)147466910333961503L) /* => asm.patchify.loader.PatchAgent.LOGGER */, (Object)stringArray[0], (Object)d.a("\u00f9", (boolean)d.a("$", (Object)instrumentation, (long)151480742652594260L) /* => java.lang.instrument.Instrumentation.isRetransformClassesSupported */, (long)119505102668051061L) /* => java.lang.Boolean.valueOf */, (long)122433899029164574L) /* => org.apache.logging.log4j.Logger.info */;
    }

    public static Instrumentation getInstrumentation() {
        CallSite callSite = d.a("$", (Object)d.a("\u00f9", (long)181568752537917202L) /* => java.lang.System.getProperties */, (Object)a[1], (long)146234593578405645L) /* => java.util.Properties.get */;
        return callSite instanceof Instrumentation ? (Instrumentation)((Object)callSite) : null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static synchronized void installPatchesAndRetransform() {
        block52: {
            block51: {
                block43: {
                    block42: {
                        block53: {
                            block54: {
                                var0 = PatchTransformer.O;
                                if (d.a("\u00fd", (long)175066456452445265L) /* => asm.patchify.loader.PatchAgent.transformerInstalled */ != false) {
                                    d.a("$", (Object)d.a("\u00fd", (long)147466910333961503L) /* => asm.patchify.loader.PatchAgent.LOGGER */, (Object)PatchAgent.a[4], (long)148353076054620892L) /* => org.apache.logging.log4j.Logger.info */;
                                    return;
                                }
                                var1_1 = d.a("\u00f9", (long)74775915159620901L) /* => asm.patchify.loader.PatchAgent.getInstrumentation */;
                                if (var0) break block53;
                                if (var1_1 != null) break block42;
                                break block54;
                                catch (Throwable v1) {
                                    throw v1;
                                }
                            }
                            d.a("$", (Object)d.a("\u00fd", (long)147466910333961503L) /* => asm.patchify.loader.PatchAgent.LOGGER */, (Object)PatchAgent.a[2], (long)96482166188733934L) /* => org.apache.logging.log4j.Logger.warn */;
                        }
                        return;
                    }
                    var2_2 = new PatchClassFileTransformer();
                    d.a("$", (Object)var1_1, (Object)var2_2, (boolean)true, (long)160451413836299375L) /* => java.lang.instrument.Instrumentation.addTransformer */;
                    d.a("\u00c1", (boolean)true, (long)175066456452445265L) /* => asm.patchify.loader.PatchAgent.transformerInstalled */;
                    var3_3 = new ArrayList<E>();
                    var4_4 = d.a("$", (Object)d.a("\u00f9", (long)77655036869043872L) /* => asm.patchify.loader.PatchRegistry.getPatches */, (long)113221006393852506L) /* => java.util.List.iterator */;
                    block34: while (true) {
                        v3 /* !! */  = d.a("$", (Object)var4_4, (long)175361412755674352L) /* => java.util.Iterator.hasNext */;
                        while (v3 /* !! */  != false) {
                            block50: {
                                block49: {
                                    block59: {
                                        block45: {
                                            block44: {
                                                var5_6 = (Class)d.a("$", (Object)var4_4, (long)64633749944946827L) /* => java.util.Iterator.next */;
                                                if (var0) break block43;
                                                var6_7 = (Patch)d.a("$", (Object)var5_6, Patch.class, (long)151718104097738338L) /* => java.lang.Class.getAnnotation */;
                                                v4 = var6_7;
                                                if (var0) break block44;
                                                if (v4 == null) {
                                                    continue block34;
                                                }
                                                v4 = var6_7;
                                            }
                                            if (!var0) {
                                                if (d.a("$", (Object)d.a("$", (Object)v4, (long)75020256074922747L) /* => asm.patchify.annotation.Patch.className */, (long)139567490040770223L) /* => java.lang.String.isEmpty */ != false) break block45;
                                            }
                                            ** GOTO lbl117
                                            var7_8 = false;
                                            var8_11 = d.a("$", (Object)var1_1, (long)52000551743891507L) /* => java.lang.instrument.Instrumentation.getAllLoadedClasses */;
                                            var9_13 = ((CallSite)var8_11).length;
                                            var10_14 = 0;
                                            while (var10_14 < var9_13) {
                                                block46: {
                                                    block48: {
                                                        block47: {
                                                            block58: {
                                                                block57: {
                                                                    block56: {
                                                                        block55: {
                                                                            var11_15 = var8_11[var10_14];
                                                                            if (var0) continue block34;
                                                                            if (var0) break block46;
                                                                            if (d.a("$", (Object)d.a("$", (Object)var11_15, (long)182318511367922152L) /* => java.lang.Class.getName */, (Object)d.a("$", (Object)var6_7, (long)75020256074922747L) /* => asm.patchify.annotation.Patch.className */, (long)130616148886603248L) /* => java.lang.String.equals */ == false) ** GOTO lbl102
                                                                            break block55;
                                                                            catch (Throwable v7) {
                                                                                throw v7;
                                                                            }
                                                                        }
                                                                        v8 = d.a("\u00fd", (long)147466910333961503L) /* => asm.patchify.loader.PatchAgent.LOGGER */;
                                                                        v9 = PatchAgent.a[5];
                                                                        if (var0) break block47;
                                                                        break block56;
                                                                        catch (Throwable v10) {
                                                                            throw v10;
                                                                        }
                                                                    }
                                                                    d.a("$", (Object)v8, (Object)v9, (Object)d.a("$", (Object)var6_7, (long)75020256074922747L) /* => asm.patchify.annotation.Patch.className */, (Object)d.a("$", (Object)var5_6, (long)182318511367922152L) /* => java.lang.Class.getName */, (long)74664868832672546L) /* => org.apache.logging.log4j.Logger.debug */;
                                                                    if (d.a("$", (Object)var1_1, (Object)var11_15, (long)163308985568196685L) /* => java.lang.instrument.Instrumentation.isModifiableClass */ == false) ** GOTO lbl90
                                                                    break block57;
                                                                    catch (Throwable v11) {
                                                                        throw v11;
                                                                    }
                                                                }
                                                                d.a("$", var3_3, (Object)var11_15, (long)184435215000867819L) /* => java.util.List.add */;
                                                                if (!var0) break block48;
                                                                break block58;
                                                                catch (Throwable v12) {
                                                                    throw v12;
                                                                }
                                                            }
                                                            v8 = d.a("\u00fd", (long)147466910333961503L) /* => asm.patchify.loader.PatchAgent.LOGGER */;
                                                            v9 = PatchAgent.a[3];
                                                        }
                                                        d.a("$", (Object)v8, (Object)v9, (Object)d.a("$", (Object)var6_7, (long)75020256074922747L) /* => asm.patchify.annotation.Patch.className */, (long)113341148471985915L) /* => org.apache.logging.log4j.Logger.warn */;
                                                    }
                                                    var7_8 = true;
                                                    if (!var0) break;
lbl102:
                                                    // 2 sources

                                                    ++var10_14;
                                                }
                                                if (!var0) continue;
                                            }
                                            v3 /* !! */  = (CallSite)var7_8;
                                            if (var0) continue;
                                            if (v3 /* !! */  != false) continue block34;
                                            var12_16 = PatchAgent.a;
                                            d.a("$", (Object)d.a("\u00fd", (long)147466910333961503L) /* => asm.patchify.loader.PatchAgent.LOGGER */, (Object)var12_16[9], (Object)d.a("$", (Object)var6_7, (long)75020256074922747L) /* => asm.patchify.annotation.Patch.className */, (long)85112683122598738L) /* => org.apache.logging.log4j.Logger.debug */;
                                            if (!var0) continue block34;
                                        }
                                        try {
                                            v4 = var6_7;
lbl117:
                                            // 2 sources

                                            var7_9 = d.a("$", (Object)v4, (long)80437421054490806L) /* => asm.patchify.annotation.Patch.value */;
                                        }
                                        catch (Throwable var8_12) {
                                            var12_16 = PatchAgent.a;
                                            d.a("$", (Object)d.a("\u00fd", (long)147466910333961503L) /* => asm.patchify.loader.PatchAgent.LOGGER */, (Object)var12_16[8], (Object)d.a("$", (Object)var5_6, (long)182318511367922152L) /* => java.lang.Class.getName */, (Object)d.a("$", (Object)var8_12, (long)120621357894278260L) /* => java.lang.Throwable.toString */, (long)76007261926239716L) /* => org.apache.logging.log4j.Logger.warn */;
                                            continue block34;
                                        }
                                        v15 = d.a("$", (Object)var1_1, (Object)var7_9, (long)163308985568196685L) /* => java.lang.instrument.Instrumentation.isModifiableClass */;
                                        if (var0) break block49;
                                        if (v15 == false) ** GOTO lbl139
                                        break block59;
                                        catch (Throwable v16) {
                                            throw v16;
                                        }
                                    }
                                    v15 = d.a("$", var3_3, (Object)var7_9, (long)184435215000867819L) /* => java.util.List.add */;
                                }
                                if (!var0) break block50;
lbl139:
                                // 2 sources

                                d.a("$", (Object)d.a("\u00fd", (long)147466910333961503L) /* => asm.patchify.loader.PatchAgent.LOGGER */, (Object)PatchAgent.a[11], (Object)d.a("$", (Object)var7_9, (long)182318511367922152L) /* => java.lang.Class.getName */, (long)113341148471985915L) /* => org.apache.logging.log4j.Logger.warn */;
                            }
                            if (var0) break block34;
                            continue block34;
                        }
                        break;
                    }
                    v19 /* !! */  = d.a("$", var3_3, (long)184224858935663280L) /* => java.util.List.isEmpty */;
                    if (var0) break block51;
                    if (v19 /* !! */  == false) break block43;
                    return;
                }
                v19 /* !! */  = (reference)false;
            }
            var4_5 = v19 /* !! */ ;
            var5_6 = d.a("$", var3_3, (long)113221006393852506L) /* => java.util.List.iterator */;
            while (d.a("$", (Object)var5_6, (long)175361412755674352L) /* => java.util.Iterator.hasNext */ != false) {
                var6_7 = (Class)d.a("$", (Object)var5_6, (long)64633749944946827L) /* => java.util.Iterator.next */;
                if (var0) break block52;
                try {
                    d.a("$", (Object)var1_1, (Object)new Class[]{var6_7}, (long)105320950359389965L) /* => java.lang.instrument.Instrumentation.retransformClasses */;
                    ++var4_5;
                }
                catch (Throwable var7_10) {
                    var12_16 = PatchAgent.a;
                    d.a("$", (Object)d.a("\u00fd", (long)147466910333961503L) /* => asm.patchify.loader.PatchAgent.LOGGER */, (Object)var12_16[10], (Object)d.a("$", (Object)var6_7, (long)182318511367922152L) /* => java.lang.Class.getName */, (Object)d.a("$", (Object)var7_10, (long)120621357894278260L) /* => java.lang.Throwable.toString */, (long)126798550974038020L) /* => org.apache.logging.log4j.Logger.error */;
                }
                if (!var0) continue;
            }
            d.a("$", (Object)d.a("\u00fd", (long)147466910333961503L) /* => asm.patchify.loader.PatchAgent.LOGGER */, (Object)PatchAgent.a[6], (Object)d.a("\u00f9", (int)var4_5, (long)67104637941965968L) /* => java.lang.Integer.valueOf */, (Object)d.a("\u00f9", (int)d.a("$", var3_3, (long)180194190084079702L) /* => java.util.List.size */, (long)67104637941965968L) /* => java.lang.Integer.valueOf */, (long)49636417321295941L) /* => org.apache.logging.log4j.Logger.info */;
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
                var2_2 = "|2v\u0011\u001b{:i!r\u001c\u0007>?1ua\u001a\u001b):s&u\u0010\u001d6{n c\u000f\u0000)/x13BO &\u0012r/=\u0016\u0001(/o ~\u001a\u0001/:i<|\u0011*|2v\u0011\u001b{5r!3\u001e\u001b/:~=v\u001bT{8|;}\u0010\u001b{2s&g\u001e\u00037{m4g\u001c\u0007>()^4}\u0011\u0000/{o0g\r\u000e5({:a\u0012O.5p:w\u0016\t2:\u007f9v_\u001b:)z0g_\u0014&AM4g\u001c\u0007>(=4\u007f\r\n:?duz\u0011\u001c/:q9v\u001bT{(v<c\u000f\u00065<=1f\u000f\u000328|!v_\u001d>/o4}\f\t4)pua\u001a\u001e.>n!;[:f\u0011\u000b{:q'v\u001e\u000b\"vq:r\u001b\n?{i4a\u0018\n/{f(3\u0019\u0000){~9r\f\u001c\u0015:p0>\u001d\u000e(>yuc\u001e\u001b83=.n%O0g\r\u000e5({:a\u0012\n?{f(3PO &=%r\u000b\f3{i4a\u0018\n/sn|\u0012r/=\u0016\u0001(/o ~\u001a\u0001/:i<|\u0011\"M4g\u001c\u0007{/|'t\u001a\u001b{.s'v\f\u00007-x13\u0019\u0000){f()_\u0014&GI4a\u0018\n/{f(3\u0011\u0000/{d0g_\u00034:y0w_\u207b{/o4}\f\t4)p0a_\u001827qup\u001e\u001b83=<g_\u000e/{~9r\f\u001cv7r4w_\u001b26x";
                var4_3 = "|2v\u0011\u001b{:i!r\u001c\u0007>?1ua\u001a\u001b):s&u\u0010\u001d6{n c\u000f\u0000)/x13BO &\u0012r/=\u0016\u0001(/o ~\u001a\u0001/:i<|\u0011*|2v\u0011\u001b{5r!3\u001e\u001b/:~=v\u001bT{8|;}\u0010\u001b{2s&g\u001e\u00037{m4g\u001c\u0007>()^4}\u0011\u0000/{o0g\r\u000e5({:a\u0012O.5p:w\u0016\t2:\u007f9v_\u001b:)z0g_\u0014&AM4g\u001c\u0007>(=4\u007f\r\n:?duz\u0011\u001c/:q9v\u001bT{(v<c\u000f\u00065<=1f\u000f\u000328|!v_\u001d>/o4}\f\t4)pua\u001a\u001e.>n!;[:f\u0011\u000b{:q'v\u001e\u000b\"vq:r\u001b\n?{i4a\u0018\n/{f(3\u0019\u0000){~9r\f\u001c\u0015:p0>\u001d\u000e(>yuc\u001e\u001b83=.n%O0g\r\u000e5({:a\u0012\n?{f(3PO &=%r\u000b\f3{i4a\u0018\n/sn|\u0012r/=\u0016\u0001(/o ~\u001a\u0001/:i<|\u0011\"M4g\u001c\u0007{/|'t\u001a\u001b{.s'v\f\u00007-x13\u0019\u0000){f()_\u0014&GI4a\u0018\n/{f(3\u0011\u0000/{d0g_\u00034:y0w_\u207b{/o4}\f\t4)p0a_\u001827qup\u001e\u001b83=<g_\u000e/{~9r\f\u001cv7r4w_\u001b26x".length();
                var1_4 = 42;
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
                    var2_2 = "O0g\r\u000e5({:a\u0012O=:t9v\u001bO=4ouh\u0002U{ `)^4}\u0011\u0000/{o0g\r\u000e5({:a\u0012O.5p:w\u0016\t2:\u007f9v_\u001b:)z0g_\u0014&";
                    var4_3 = "O0g\r\u000e5({:a\u0012O=:t9v\u001bO=4ouh\u0002U{ `)^4}\u0011\u0000/{o0g\r\u000e5({:a\u0012O.5p:w\u0016\t2:\u007f9v_\u001b:)z0g_\u0014&".length();
                    var1_4 = 29;
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
                        v10 = 29;
                        break;
                    }
                    case 1: {
                        v10 = 85;
                        break;
                    }
                    case 2: {
                        v10 = 19;
                        break;
                    }
                    case 3: {
                        v10 = 127;
                        break;
                    }
                    case 4: {
                        v10 = 111;
                        break;
                    }
                    case 5: {
                        v10 = 91;
                        break;
                    }
                    default: {
                        v10 = 91;
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
        PatchAgent.a = var5;
        PatchAgent.INSTRUMENTATION_KEY = PatchAgent.a[1];
        PatchAgent.LOGGER = d.a("\u00f9", PatchAgent.class, (long)163330105986552197L) /* => org.apache.logging.log4j.LogManager.getLogger */;
        d.a("\u00c1", (boolean)false, (long)175066456452445265L) /* => asm.patchify.loader.PatchAgent.transformerInstalled */;
    }
}

