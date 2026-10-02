/*
 * RESTORED SOURCE — decompiled reconstruction, not the original files.
 * class: asm.patchify.loader.PatchClassFileTransformer
 * context strings: '.class' | 'oz.dumpDir' | 'oz.dumpDir' | 'Failed to transform {}'
 */

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.Logger
 *  org.objectweb.asm.ClassReader
 *  org.objectweb.asm.ClassWriter
 *  org.objectweb.asm.tree.ClassNode
 */
package asm.patchify.loader;

import asm.patchify.annotation.Patch;
import asm.patchify.loader.PatchTransformer;
import dev.hixo.M.d;
import java.io.IOException;
import java.lang.instrument.ClassFileTransformer;
import java.lang.instrument.IllegalClassFormatException;
import java.lang.invoke.CallSite;
import java.nio.file.OpenOption;
import java.nio.file.attribute.FileAttribute;
import java.security.ProtectionDomain;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.logging.log4j.Logger;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.tree.ClassNode;

public final class PatchClassFileTransformer
implements ClassFileTransformer {
    private static final Logger LOGGER;
    private static final String DUMP_DIR_PROPERTY;
    private final Map<String, List<Class<?>>> patchesByTarget = new HashMap();
    private static final String[] a;

    public PatchClassFileTransformer() {
        d.a("$", (Object)this, (long)43772012265034934L) /* => asm.patchify.loader.PatchClassFileTransformer.rebuildIndex */;
    }

    public void rebuildIndex() {
        d.a("$", (Object)d.a("z", (Object)this, (long)85790760807768789L) /* => asm.patchify.loader.PatchClassFileTransformer.patchesByTarget */, (long)197723832075338307L) /* => java.util.Map.clear */;
        CallSite callSite = d.a("$", (Object)d.a("\u00f9", (long)77655036869043872L) /* => asm.patchify.loader.PatchRegistry.getPatches */, (long)113221006393852506L) /* => java.util.List.iterator */;
        while (d.a("$", (Object)callSite, (long)175361412755674352L) /* => java.util.Iterator.hasNext */ != false) {
            Class clazz = (Class)((Object)d.a("$", (Object)callSite, (long)64633749944946827L) /* => java.util.Iterator.next */);
            Patch patch = (Patch)((Object)d.a("$", (Object)clazz, Patch.class, (long)151718104097738338L) /* => java.lang.Class.getAnnotation */);
            if (patch == null) continue;
            CallSite callSite2 = d.a("$", (Object)d.a("$", (Object)patch, (long)75020256074922747L) /* => asm.patchify.annotation.Patch.className */, (long)139567490040770223L) /* => java.lang.String.isEmpty */ == false ? d.a("$", (Object)d.a("$", (Object)patch, (long)75020256074922747L) /* => asm.patchify.annotation.Patch.className */, (char)'.', (char)'/', (long)70594469537762889L) /* => java.lang.String.replace */ : d.a("$", (Object)d.a("$", (Object)d.a("$", (Object)patch, (long)80437421054490806L) /* => asm.patchify.annotation.Patch.value */, (long)182318511367922152L) /* => java.lang.Class.getName */, (char)'.', (char)'/', (long)70594469537762889L) /* => java.lang.String.replace */;
            d.a("$", (Object)((List)((Object)d.a("$", (Object)d.a("z", (Object)this, (long)85790760807768789L) /* => asm.patchify.loader.PatchClassFileTransformer.patchesByTarget */, (Object)callSite2, string -> new ArrayList(), (long)123211639374652458L) /* => java.util.Map.computeIfAbsent */)), (Object)clazz, (long)184435215000867819L) /* => java.util.List.add */;
        }
    }

    /*
     * Loose catch block
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public byte[] transform(ClassLoader classLoader, String string, Class<?> clazz, ProtectionDomain protectionDomain, byte[] byArray) throws IllegalClassFormatException {
        List list;
        List list2;
        boolean bl;
        block18: {
            Object object;
            block16: {
                block17: {
                    bl = PatchTransformer.O;
                    object = string;
                    if (bl) break block16;
                    if (object != null) break block17;
                    return null;
                    catch (Throwable throwable) {
                        throw throwable;
                    }
                }
                object = d.a("$", (Object)d.a("z", (Object)this, (long)85790760807768789L) /* => asm.patchify.loader.PatchClassFileTransformer.patchesByTarget */, (Object)string, (long)150360683669181890L) /* => java.util.Map.get */;
            }
            list2 = (List)object;
            list = list2;
            if (bl) break block18;
            if (list == null) return null;
            list = list2;
        }
        if (d.a("$", (Object)list, (long)184224858935663280L) /* => java.util.List.isEmpty */ != false) {
            return null;
        }
        try {
            Object object;
            Object object2;
            ClassNode classNode;
            ClassReader classReader;
            block20: {
                block19: {
                    classReader = new ClassReader(byArray);
                    classNode = new ClassNode();
                    d.a("$", (Object)classReader, (Object)classNode, (int)0, (long)84431464125202221L) /* => org.objectweb.asm.ClassReader.accept */;
                    object2 = d.a("$", (Object)list2, (long)113221006393852506L) /* => java.util.List.iterator */;
                    while (d.a("$", (Object)object2, (long)175361412755674352L) /* => java.util.Iterator.hasNext */ != false) {
                        String[] stringArray;
                        Class clazz2 = (Class)((Object)d.a("$", (Object)object2, (long)64633749944946827L) /* => java.util.Iterator.next */);
                        try {
                            stringArray = a;
                            d.a("$", (Object)d.a("\u00fd", (long)185941653928834825L) /* => asm.patchify.loader.PatchClassFileTransformer.LOGGER */, (Object)stringArray[5], (Object)d.a("$", (Object)clazz2, (long)182318511367922152L) /* => java.lang.Class.getName */, (Object)string, (long)74664868832672546L) /* => org.apache.logging.log4j.Logger.debug */;
                            if (bl) break block19;
                            d.a("\u00f9", (Object)clazz2, (Object)classNode, (long)201370554797954324L) /* => asm.patchify.loader.PatchTransformer.apply */;
                        }
                        catch (Throwable throwable) {
                            stringArray = a;
                            d.a("$", (Object)d.a("\u00fd", (long)185941653928834825L) /* => asm.patchify.loader.PatchClassFileTransformer.LOGGER */, (Object)stringArray[6], (Object)d.a("$", (Object)clazz2, (long)182318511367922152L) /* => java.lang.Class.getName */, (Object)string, (Object)throwable, (long)34118089164328516L) /* => org.apache.logging.log4j.Logger.error */;
                        }
                        if (!bl) continue;
                    }
                    object = classLoader;
                    if (bl) break block20;
                    if (object == null) break block19;
                    object = classLoader;
                    break block20;
                }
                object = d.a("$", (Object)d.a("\u00f9", (long)44386049656338218L) /* => java.lang.Thread.currentThread */, (long)190047261400389647L) /* => java.lang.Thread.getContextClassLoader */;
            }
            object2 = object;
            FrameAwareClassWriter frameAwareClassWriter = new FrameAwareClassWriter(classReader, 2, (ClassLoader)object2);
            d.a("$", (Object)classNode, (Object)((Object)frameAwareClassWriter), (long)156322706353645064L) /* => org.objectweb.asm.tree.ClassNode.accept */;
            CallSite callSite = d.a("$", (Object)((Object)frameAwareClassWriter), (long)68943141669409520L) /* => org.objectweb.asm.ClassWriter.toByteArray */;
            d.a("$", (Object)this, (Object)string, (Object)callSite, (long)196632844773914755L) /* => asm.patchify.loader.PatchClassFileTransformer.dumpIfRequested */;
            return callSite;
        }
        catch (Throwable throwable) {
            d.a("$", (Object)d.a("\u00fd", (long)185941653928834825L) /* => asm.patchify.loader.PatchClassFileTransformer.LOGGER */, (Object)a[3], (Object)string, (Object)throwable, (long)126798550974038020L) /* => org.apache.logging.log4j.Logger.error */;
            return null;
        }
    }

    private void dumpIfRequested(String string, byte[] byArray) {
        String[] stringArray = a;
        CallSite callSite = d.a("\u00f9", stringArray[2], (long)86310213400528686L) /* => java.lang.System.getProperty */;
        if (callSite == null) {
            return;
        }
        try {
            stringArray = a;
            CallSite callSite2 = d.a("$", (Object)d.a("\u00f9", (Object)callSite, (Object)new String[0], (long)120740575970976700L) /* => java.nio.file.Path.of */, (Object)d.a("$", (Object)d.a("$", (Object)d.a("$", (Object)new StringBuilder(), (Object)string, (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (Object)stringArray[0], (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (long)59411206276622891L) /* => java.lang.StringBuilder.toString */, (long)48741110158964543L) /* => java.nio.file.Path.resolve */;
            d.a("\u00f9", (Object)d.a("$", (Object)callSite2, (long)71294236451473837L) /* => java.nio.file.Path.getParent */, (Object)new FileAttribute[0], (long)74086661171466201L) /* => java.nio.file.Files.createDirectories */;
            d.a("\u00f9", (Object)callSite2, (Object)byArray, (Object)new OpenOption[0], (long)178509267793814482L) /* => java.nio.file.Files.write */;
        }
        catch (IOException iOException) {
            d.a("$", (Object)d.a("\u00fd", (long)185941653928834825L) /* => asm.patchify.loader.PatchClassFileTransformer.LOGGER */, (Object)a[4], (Object)string, (Object)iOException, (long)76007261926239716L) /* => org.apache.logging.log4j.Logger.warn */;
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block19: {
            block18: {
                var5 = new String[7];
                var3_1 = 0;
                var2_2 = "\u001a\r_\u0017I>\n[\u0014\u001d\u0012O ~p\u0007A\n[\u0014\u001d\u0012O ~p\u0007A\u0016r\u000fZ\u001a_).@\u0001\u0013\u0002H,`G\b\\\u0004WmuI#r\u000fZ\u001a_).@\u0001\u0013\u0012O ~\u0014\u001aA\u0017T>h[\u001c^\u0013^mmX\u000f@\u0005\u001a6s";
                var4_3 = "\u001a\r_\u0017I>\n[\u0014\u001d\u0012O ~p\u0007A\n[\u0014\u001d\u0012O ~p\u0007A\u0016r\u000fZ\u001a_).@\u0001\u0013\u0002H,`G\b\\\u0004WmuI#r\u000fZ\u001a_).@\u0001\u0013\u0012O ~\u0014\u001aA\u0017T>h[\u001c^\u0013^mmX\u000f@\u0005\u001a6s".length();
                var1_4 = 6;
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
                    var2_2 = "u\u001eC\u001aC$`SNC\u0017N.f\u0014\u0015NV\u0017s.O\u0013\u001er\u000fZ\u001a_).@\u0001\u0013\u0017J=bMNC\u0017N.f\u0014\u0015NV\u0017s.O\u0013";
                    var4_3 = "u\u001eC\u001aC$`SNC\u0017N.f\u0014\u0015NV\u0017s.O\u0013\u001er\u000fZ\u001a_).@\u0001\u0013\u0017J=bMNC\u0017N.f\u0014\u0015NV\u0017s.O\u0013".length();
                    var1_4 = 23;
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
                        v10 = 52;
                        break;
                    }
                    case 1: {
                        v10 = 110;
                        break;
                    }
                    case 2: {
                        v10 = 51;
                        break;
                    }
                    case 3: {
                        v10 = 118;
                        break;
                    }
                    case 4: {
                        v10 = 58;
                        break;
                    }
                    case 5: {
                        v10 = 77;
                        break;
                    }
                    default: {
                        v10 = 14;
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
        PatchClassFileTransformer.a = var5;
        PatchClassFileTransformer.DUMP_DIR_PROPERTY = PatchClassFileTransformer.a[1];
        PatchClassFileTransformer.LOGGER = d.a("\u00f9", PatchClassFileTransformer.class, (long)163330105986552197L) /* => org.apache.logging.log4j.LogManager.getLogger */;
    }

    private static final class FrameAwareClassWriter
    extends ClassWriter {
        private final ClassLoader loader;

        FrameAwareClassWriter(ClassReader classReader, int n2, ClassLoader classLoader) {
            super(classReader, n2);
            this.loader = classLoader;
        }

        protected ClassLoader getClassLoader() {
            return d.a("z", (Object)((Object)this), (long)143573840115196276L) /* => asm.patchify.loader.PatchClassFileTransformer$FrameAwareClassWriter.loader */;
        }
    }
}

