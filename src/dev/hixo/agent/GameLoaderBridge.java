/*
 * RESTORED SOURCE — decompiled reconstruction, not the original files.
 * class: dev.hixo.agent.GameLoaderBridge
 * context strings: '[hixo] bridge defined ' | 'java.io.tmpdir' | '[hixo] redefineModule(java.base/java.la | 'start'
 * decrypted string pool:
 *   a[0] = [hixo] bridge defined 
 *   a[1] = java.io.tmpdir
 *   a[2] = [hixo] redefineModule(java.base/java.lang) failed: 
 *   a[3] = start
 *   a[4] = java.io.tmpdir
 *   a[5] = hixo.resources
 *   a[6] = no Instrumentation - did agent attach run first?
 *   a[7] = .class
 *   a[8] = java.lang
 *   a[9] = [hixo] bootstrap loader = 
 *   a[10] =  classes, resources -> 
 *   a[11] = [hixo] bridge FAILED to define 
 *   a[12] = [hixo] bridge.load failed:\u000a
 *   a[13] = [hixo] bridge.load jar=
 *   a[14] = hixo.resources
 *   a[15] = hixo-java.log
 *   a[16] = hixo-resources-
 *   a[17] = META-INF/
 *   a[18] = defineClass
 *   a[19] =  loader=
 *   a[20] = dev.hixo.agent.HixoBootstrap
 */

/*
 * Decompiled with CFR 0.152.
 */
package dev.hixo.agent;

import dev.hixo.M.d;
import dev.hixo.agent.Strings;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.instrument.Instrumentation;
import java.lang.invoke.CallSite;
import java.lang.reflect.Method;
import java.nio.file.OpenOption;
import java.nio.file.attribute.FileAttribute;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public final class GameLoaderBridge {
    public static final String RESOURCES_PROP;
    private static final String[] a;

    private GameLoaderBridge() {
    }

    public static void load(String string, ClassLoader classLoader) throws Throwable {
        try {
            d.a("\u00f9", string, (Object)classLoader, (long)86029120097169888L) /* => dev.hixo.agent.GameLoaderBridge.loadImpl */;
        }
        catch (Throwable throwable) {
            d.a("\u00f9", (Object)throwable, (long)121303650239424264L) /* => dev.hixo.agent.GameLoaderBridge.writeJavaLog */;
            throw throwable;
        }
    }

    private static void writeJavaLog(Throwable throwable) {
        try {
            StringWriter stringWriter = new StringWriter();
            d.a("$", (Object)throwable, (Object)new PrintWriter(stringWriter), (long)159833257395170069L) /* => java.lang.Throwable.printStackTrace */;
            String[] stringArray = a;
            CallSite callSite = d.a("\u00f9", (Object)d.a("\u00f9", stringArray[1], (long)86310213400528686L) /* => java.lang.System.getProperty */, (Object)new String[]{stringArray[15]}, (long)161659434137558068L) /* => java.nio.file.Paths.get */;
            d.a("\u00f9", (Object)callSite, (Object)d.a("$", (Object)stringWriter, (long)87906211061683484L) /* => java.io.StringWriter.toString */, (Object)new OpenOption[0], (long)172763035246580897L) /* => java.nio.file.Files.writeString */;
            d.a("$", (Object)d.a("\u00fd", (long)53330690048667339L) /* => java.lang.System.out */, (Object)d.a("$", (Object)d.a("$", (Object)d.a("$", (Object)new StringBuilder(), (Object)stringArray[12], (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (Object)stringWriter, (long)121136869135998173L) /* => java.lang.StringBuilder.append */, (long)59411206276622891L) /* => java.lang.StringBuilder.toString */, (long)190492993133616615L) /* => java.io.PrintStream.println */;
        }
        catch (Throwable throwable2) {
            // empty catch block
        }
    }

    /*
     * Unable to fully structure code
     */
    private static void loadImpl(String var0, ClassLoader var1_1) throws Throwable {
        block56: {
            block57: {
                block47: {
                    block45: {
                        block46: {
                            block58: {
                                var15_2 = GameLoaderBridge.a;
                                d.a("$", (Object)d.a("\u00fd", (long)53330690048667339L) /* => java.lang.System.out */, (Object)d.a("$", (Object)d.a("$", (Object)d.a("$", (Object)d.a("$", (Object)d.a("$", (Object)new StringBuilder(), (Object)var15_2[13], (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (Object)var0, (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (Object)var15_2[19], (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (Object)var1_1, (long)121136869135998173L) /* => java.lang.StringBuilder.append */, (long)59411206276622891L) /* => java.lang.StringBuilder.toString */, (long)190492993133616615L) /* => java.io.PrintStream.println */;
                                var2_3 = Strings.Y;
                                var3_4 = d.a("\u00f9", (long)74775915159620901L) /* => asm.patchify.loader.PatchAgent.getInstrumentation */;
                                if (var2_3) break block45;
                                if (var3_4 != null) break block46;
                                break block58;
                                catch (Throwable v0) {
                                    throw v0;
                                }
                            }
                            throw new IllegalStateException(GameLoaderBridge.a[6]);
                        }
                        d.a("\u00f9", (Object)var3_4, (long)120554815797394392L) /* => dev.hixo.agent.GameLoaderBridge.openJavaBaseToSelf */;
                    }
                    var15_2 = GameLoaderBridge.a;
                    var4_5 = d.a("$", ClassLoader.class, (Object)var15_2[18], (Object)new Class[]{String.class, byte[].class, d.a("\u00fd", (long)94576327015742013L) /* => java.lang.Integer.TYPE */, d.a("\u00fd", (long)94576327015742013L) /* => java.lang.Integer.TYPE */}, (long)88657862627297602L) /* => java.lang.Class.getDeclaredMethod */;
                    d.a("$", (Object)var4_5, (boolean)true, (long)162285088212208629L) /* => java.lang.reflect.Method.setAccessible */;
                    var5_6 = d.a("\u00f9", (Object)d.a("\u00f9", var15_2[4], (long)86310213400528686L) /* => java.lang.System.getProperty */, (Object)new String[]{d.a("$", (Object)d.a("$", (Object)d.a("$", (Object)new StringBuilder(), (Object)var15_2[16], (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (long)d.a("$", (Object)d.a("\u00f9", (long)129251450744349603L) /* => java.lang.ProcessHandle.current */, (long)61193969445776548L) /* => java.lang.ProcessHandle.pid */, (long)35727418710126082L) /* => java.lang.StringBuilder.append */, (long)59411206276622891L) /* => java.lang.StringBuilder.toString */}, (long)161659434137558068L) /* => java.nio.file.Paths.get */;
                    d.a("\u00f9", (Object)var5_6, (Object)new FileAttribute[0], (long)74086661171466201L) /* => java.nio.file.Files.createDirectories */;
                    var6_7 = new LinkedHashMap<K, V>();
                    var7_8 = new ZipFile(var0);
                    try {
                        var8_10 = d.a("$", (Object)var7_8, (long)153015151887561991L) /* => java.util.zip.ZipFile.entries */;
                        while (d.a("$", (Object)var8_10, (long)150996255552028372L) /* => java.util.Enumeration.hasMoreElements */ != false) {
                            block53: {
                                block55: {
                                    block61: {
                                        block52: {
                                            block54: {
                                                block51: {
                                                    block60: {
                                                        block48: {
                                                            block49: {
                                                                block59: {
                                                                    var9_12 = (ZipEntry)d.a("$", (Object)var8_10, (long)57738031158264059L) /* => java.util.Enumeration.nextElement */;
                                                                    if (var2_3) break block47;
                                                                    v2 = var9_12;
                                                                    if (var2_3) break block48;
                                                                    break block59;
                                                                    catch (Throwable v3) {
                                                                        throw v3;
                                                                    }
                                                                }
                                                                if (d.a("$", (Object)v2, (long)45016942630867816L) /* => java.util.zip.ZipEntry.isDirectory */ != false) {
                                                                    continue;
                                                                }
                                                                break block49;
                                                                catch (Throwable v4) {
                                                                    throw v4;
                                                                }
                                                            }
                                                            v2 = var9_12;
                                                        }
                                                        var10_14 = d.a("$", (Object)v2, (long)145351519526555599L) /* => java.util.zip.ZipEntry.getName */;
                                                        if (d.a("$", (Object)var10_14, (Object)GameLoaderBridge.a[17], (long)100670834987339679L) /* => java.lang.String.startsWith */ != false) {
                                                            continue;
                                                        }
                                                        var12_16 = d.a("$", (Object)var7_8, (Object)var9_12, (long)112740666582070709L) /* => java.util.zip.ZipFile.getInputStream */;
                                                        try {
                                                            var11_15 = d.a("$", (Object)var12_16, (long)160362925886237876L) /* => java.io.InputStream.readAllBytes */;
                                                            ** if (var2_3) goto lbl-1000
                                                        }
                                                        catch (Throwable var13_18) {
                                                            block50: {
                                                                if (var2_3 || var12_16 == null) break block50;
                                                                try {
                                                                    d.a("$", (Object)var12_16, (long)149958501447197527L) /* => java.io.InputStream.close */;
                                                                }
                                                                catch (Throwable var14_19) {
                                                                    d.a("$", (Object)var13_18, (Object)var14_19, (long)176239701128201553L) /* => java.lang.Throwable.addSuppressed */;
                                                                }
                                                            }
                                                            throw var13_18;
                                                        }
lbl-1000:
                                                        // 1 sources

                                                        {
                                                            if (var12_16 == null) ** GOTO lbl83
                                                            d.a("$", (Object)var12_16, (long)149958501447197527L) /* => java.io.InputStream.close */;
                                                        }
lbl-1000:
                                                        // 1 sources

                                                        {
                                                        }
lbl83:
                                                        // 4 sources

                                                        v9 = var10_14;
                                                        if (var2_3) break block51;
                                                        if (d.a("$", (Object)v9, (Object)GameLoaderBridge.a[7], (long)157160043761898297L) /* => java.lang.String.endsWith */ == false) break block52;
                                                        break block60;
                                                        catch (Throwable v10) {
                                                            throw v10;
                                                        }
                                                    }
                                                    v9 = d.a("$", (Object)d.a("$", (Object)var10_14, (int)0, (int)(d.a("$", (Object)var10_14, (long)49243968837171037L) /* => java.lang.String.length */ - 6), (long)169274583096351474L) /* => java.lang.String.net.minecraft.class_243 */, (char)'/', (char)'.', (long)70594469537762889L) /* => java.lang.String.replace */;
                                                }
                                                var12_16 = v9;
                                                if (var2_3) break block53;
                                                if (d.a("$", (Object)var12_16, (Object)d.a("$", GameLoaderBridge.class, (long)182318511367922152L) /* => java.lang.Class.getName */, (long)130616148886603248L) /* => java.lang.String.equals */ != false) {
                                                    continue;
                                                }
                                                break block54;
                                                catch (Throwable v12) {
                                                    throw v12;
                                                }
                                            }
                                            d.a("$", var6_7, (Object)var12_16, (Object)var11_15, (long)77208467660230536L) /* => java.util.LinkedHashMap.put */;
                                            break block53;
                                        }
                                        var12_16 = d.a("$", (Object)var5_6, (Object)var10_14, (long)48741110158964543L) /* => java.nio.file.Path.resolve */;
                                        var13_17 = d.a("$", (Object)var12_16, (long)71294236451473837L) /* => java.nio.file.Path.getParent */;
                                        v14 = var13_17;
                                        if (var2_3) break block53;
                                        if (v14 == null) break block55;
                                        break block61;
                                        catch (Throwable v15) {
                                            throw v15;
                                        }
                                    }
                                    d.a("\u00f9", (Object)var13_17, (Object)new FileAttribute[0], (long)74086661171466201L) /* => java.nio.file.Files.createDirectories */;
                                }
                                v14 = d.a("\u00f9", (Object)var12_16, (Object)var11_15, (Object)new OpenOption[0], (long)178509267793814482L) /* => java.nio.file.Files.write */;
                            }
                            if (!var2_3) continue;
                        }
                    }
                    catch (Throwable var8_11) {
                        try {
                            d.a("$", (Object)var7_8, (long)165456157836240192L) /* => java.util.zip.ZipFile.close */;
                        }
                        catch (Throwable var9_13) {
                            d.a("$", (Object)var8_11, (Object)var9_13, (long)176239701128201553L) /* => java.lang.Throwable.addSuppressed */;
                        }
                        throw var8_11;
                    }
                    d.a("$", (Object)var7_8, (long)165456157836240192L) /* => java.util.zip.ZipFile.close */;
                }
                var7_9 = d.a("\u00f9", (Object)var4_5, (Object)var1_1, var6_7, (long)153209372171167102L) /* => dev.hixo.agent.GameLoaderBridge.definePassUntilFixedPoint */;
                v17 = GameLoaderBridge.a[14];
                if (var2_3) break block56;
                d.a("\u00f9", v17, (Object)d.a("$", (Object)var5_6, (long)96637982861918904L) /* => java.nio.file.Path.toAbsolutePath */.toString(), (long)135998161225585284L) /* => java.lang.System.setProperty */;
                d.a("$", (Object)d.a("\u00fd", (long)53330690048667339L) /* => java.lang.System.out */, (Object)d.a("$", (Object)d.a("$", (Object)d.a("$", (Object)d.a("$", (Object)d.a("$", (Object)new StringBuilder(), (Object)GameLoaderBridge.a[0], (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (int)var7_9, (long)32515713483113022L) /* => java.lang.StringBuilder.append */, (Object)GameLoaderBridge.a[10], (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (Object)var5_6, (long)121136869135998173L) /* => java.lang.StringBuilder.append */, (long)59411206276622891L) /* => java.lang.StringBuilder.toString */, (long)190492993133616615L) /* => java.io.PrintStream.println */;
                if (d.a("$", var6_7, (long)128191031447313197L) /* => java.util.LinkedHashMap.isEmpty */ != false) break block57;
                var8_10 = d.a("$", (Object)d.a("$", var6_7, (long)82072112596398301L) /* => java.util.LinkedHashMap.keySet */, (long)33822594988307322L) /* => java.util.Set.iterator */;
                while (d.a("$", (Object)var8_10, (long)175361412755674352L) /* => java.util.Iterator.hasNext */ != false) {
                    v17 = (String)d.a("$", (Object)var8_10, (long)64633749944946827L) /* => java.util.Iterator.next */;
                    if (!var2_3) {
                        var9_12 = v17;
                        var15_2 = GameLoaderBridge.a;
                        d.a("$", (Object)d.a("\u00fd", (long)53330690048667339L) /* => java.lang.System.out */, (Object)d.a("$", (Object)d.a("$", (Object)d.a("$", (Object)new StringBuilder(), (Object)var15_2[11], (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (Object)var9_12, (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (long)59411206276622891L) /* => java.lang.StringBuilder.toString */, (long)190492993133616615L) /* => java.io.PrintStream.println */;
                        if (!var2_3) continue;
                    }
                    break block56;
                }
            }
            var15_2 = GameLoaderBridge.a;
            v17 = var15_2[20];
        }
        var8_10 = d.a("\u00f9", v17, (boolean)true, (Object)var1_1, (long)137934999633070309L) /* => java.lang.Class.forName */;
        var15_2 = GameLoaderBridge.a;
        d.a("$", (Object)d.a("\u00fd", (long)53330690048667339L) /* => java.lang.System.out */, (Object)d.a("$", (Object)d.a("$", (Object)d.a("$", (Object)new StringBuilder(), (Object)var15_2[9], (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (Object)d.a("$", (Object)var8_10, (long)99957887028967471L) /* => java.lang.Class.getClassLoader */, (long)121136869135998173L) /* => java.lang.StringBuilder.append */, (long)59411206276622891L) /* => java.lang.StringBuilder.toString */, (long)190492993133616615L) /* => java.io.PrintStream.println */;
        d.a("$", (Object)d.a("$", (Object)var8_10, (Object)var15_2[3], (Object)new Class[0], (long)196031613461188188L) /* => java.lang.Class.getMethod */, null, (Object)new Object[0], (long)74984033819264995L) /* => java.lang.reflect.Method.invoke */;
    }

    private static int definePassUntilFixedPoint(Method method, ClassLoader classLoader, LinkedHashMap<String, byte[]> linkedHashMap) {
        int n2 = 0;
        boolean bl = true;
        block4: while (true) {
            if (!bl || d.a("$", linkedHashMap, (long)128191031447313197L) /* => java.util.LinkedHashMap.isEmpty */ != false) break;
            bl = false;
            CallSite callSite = d.a("$", (Object)d.a("$", linkedHashMap, (long)81506358708282150L) /* => java.util.LinkedHashMap.entrySet */, (long)33822594988307322L) /* => java.util.Set.iterator */;
            while (true) {
                if (d.a("$", (Object)callSite, (long)175361412755674352L) /* => java.util.Iterator.hasNext */ == false) continue block4;
                Map.Entry entry = (Map.Entry)((Object)d.a("$", (Object)callSite, (long)64633749944946827L) /* => java.util.Iterator.next */);
                try {
                    d.a("$", (Object)method, (Object)classLoader, (Object)new Object[]{d.a("$", (Object)entry, (long)67507540212365111L) /* => java.util.Map$Entry.getKey */, d.a("$", (Object)entry, (long)154166632090388094L) /* => java.util.Map$Entry.getValue */, d.a("\u00f9", (int)0, (long)67104637941965968L) /* => java.lang.Integer.valueOf */, d.a("\u00f9", (int)((byte[])d.a("$", (Object)entry, (long)154166632090388094L) /* => java.util.Map$Entry.getValue */).length, (long)67104637941965968L) /* => java.lang.Integer.valueOf */}, (long)74984033819264995L) /* => java.lang.reflect.Method.invoke */;
                    d.a("$", (Object)callSite, (long)73163157902764619L) /* => java.util.Iterator.remove */;
                    bl = true;
                    ++n2;
                }
                catch (Throwable throwable) {}
            }
            break;
        }
        return n2;
    }

    private static void openJavaBaseToSelf(Instrumentation instrumentation) {
        CallSite callSite = d.a("$", ClassLoader.class, (long)47457287414987228L) /* => java.lang.Class.getModule */;
        CallSite callSite2 = d.a("$", GameLoaderBridge.class, (long)47457287414987228L) /* => java.lang.Class.getModule */;
        try {
            String[] stringArray = a;
            d.a("$", (Object)instrumentation, (Object)callSite, (Object)d.a("\u00f9", (long)70102866043313175L) /* => java.util.Set.of */, (Object)d.a("\u00f9", (long)121043651404267939L) /* => java.util.Map.of */, (Object)d.a("\u00f9", stringArray[8], (Object)d.a("\u00f9", (Object)callSite2, (long)135702338503836030L) /* => java.util.Set.of */, (long)120047565932497708L) /* => java.util.Map.of */, (Object)d.a("\u00f9", (long)70102866043313175L) /* => java.util.Set.of */, (Object)d.a("\u00f9", (long)121043651404267939L) /* => java.util.Map.of */, (long)51675167043274808L) /* => java.lang.instrument.Instrumentation.redefineModule */;
        }
        catch (Throwable throwable) {
            d.a("$", (Object)d.a("\u00fd", (long)53330690048667339L) /* => java.lang.System.out */, (Object)d.a("$", (Object)d.a("$", (Object)d.a("$", (Object)new StringBuilder(), (Object)a[2], (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (Object)throwable, (long)121136869135998173L) /* => java.lang.StringBuilder.append */, (long)59411206276622891L) /* => java.lang.StringBuilder.toString */, (long)190492993133616615L) /* => java.io.PrintStream.println */;
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block19: {
            block18: {
                var5 = new String[21];
                var3_1 = 0;
                var2_2 = "\\6%C\u0010<9e,%_\u0018\u00049c;*R\u0011\u0004}'\u000em?:ZQ\bv)*!K\u001b\bk3\\6%C\u0010<9u;(^\u0019\bwb\u0013#_\n\r|/4-M\u001eO{f-)\u0014\u0015\u0000ofp Z\u0011\u00060'8-R\u0013\u0004}=~\u0005t*-I\u000b\u000em?:ZQ\bv)*!K\u001b\bk\u000eo74TQ\u0013|t19I\u001c\u0004j0i1lr\u0011\u0012mu+!^\u0011\u0015xs7#U_L9c7(\u001b\u001e\u0006|i*lZ\u000b\u0015xd6lI\n\u000f9a7>H\u000b^\u0006)= Z\f\u0012\tm?:ZQ\rxi9\u001a\\6%C\u0010<9e1#O\f\u0015kf.lW\u0010\u0000}b,l\u0006_\u0017'= Z\f\u0012|trlI\u001a\u0012vr,/^\fA49~\u001f\\6%C\u0010<9e,%_\u0018\u00049A\u001f\u0005w:%9s1l_\u001a\u0007pi;l\u001b\\6%C\u0010<9e,%_\u0018\u00047k1-__\u0007xn2)_Ek\u0017\\6%C\u0010<9e,%_\u0018\u00047k1-__\u000bxuc\u000eo74TQ\u0013|t19I\u001c\u0004j\ro74TR\u000bxq?bW\u0010\u0006\u000fo74TR\u0013|t19I\u001c\u0004j*\tJ\u001b\u0018zR(WAq\u000bc;*R\u0011\u0004Zk??H";
                var4_3 = "\\6%C\u0010<9e,%_\u0018\u00049c;*R\u0011\u0004}'\u000em?:ZQ\bv)*!K\u001b\bk3\\6%C\u0010<9u;(^\u0019\bwb\u0013#_\n\r|/4-M\u001eO{f-)\u0014\u0015\u0000ofp Z\u0011\u00060'8-R\u0013\u0004}=~\u0005t*-I\u000b\u000em?:ZQ\bv)*!K\u001b\bk\u000eo74TQ\u0013|t19I\u001c\u0004j0i1lr\u0011\u0012mu+!^\u0011\u0015xs7#U_L9c7(\u001b\u001e\u0006|i*lZ\u000b\u0015xd6lI\n\u000f9a7>H\u000b^\u0006)= Z\f\u0012\tm?:ZQ\rxi9\u001a\\6%C\u0010<9e1#O\f\u0015kf.lW\u0010\u0000}b,l\u0006_\u0017'= Z\f\u0012|trlI\u001a\u0012vr,/^\fA49~\u001f\\6%C\u0010<9e,%_\u0018\u00049A\u001f\u0005w:%9s1l_\u001a\u0007pi;l\u001b\\6%C\u0010<9e,%_\u0018\u00047k1-__\u0007xn2)_Ek\u0017\\6%C\u0010<9e,%_\u0018\u00047k1-__\u000bxuc\u000eo74TQ\u0013|t19I\u001c\u0004j\ro74TR\u000bxq?bW\u0010\u0006\u000fo74TR\u0013|t19I\u001c\u0004j*\tJ\u001b\u0018zR(WAq\u000bc;*R\u0011\u0004Zk??H".length();
                var1_4 = 22;
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
                    var2_2 = "'2#Z\u001b\u0004k:\u001cc;:\u0015\u0017\bahp-\\\u001a\u000fm)\u0016%C\u0010#vh*?O\r\u0000i";
                    var4_3 = "'2#Z\u001b\u0004k:\u001cc;:\u0015\u0017\bahp-\\\u001a\u000fm)\u0016%C\u0010#vh*?O\r\u0000i".length();
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
            var6_6 = 0;
            if (true) ** GOTO lbl65
            do {
                v6 = v6;
                v8 = var6_6;
                v9 = v6[v8];
                switch (var6_6 % 7) {
                    case 0: {
                        v10 = 7;
                        break;
                    }
                    case 1: {
                        v10 = 94;
                        break;
                    }
                    case 2: {
                        v10 = 76;
                        break;
                    }
                    case 3: {
                        v10 = 59;
                        break;
                    }
                    case 4: {
                        v10 = 127;
                        break;
                    }
                    case 5: {
                        v10 = 97;
                        break;
                    }
                    default: {
                        v10 = 25;
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
        GameLoaderBridge.a = var5;
        GameLoaderBridge.RESOURCES_PROP = GameLoaderBridge.a[5];
    }
}

