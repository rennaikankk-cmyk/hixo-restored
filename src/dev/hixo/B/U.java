/*
 * RESTORED SOURCE — decompiled reconstruction, not the original files.
 * class: dev.hixo.B.U
 * context strings: 'hixo.resources' | '[hixo] failed to load mappings.tiny: {}
 */

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.Logger
 */
package dev.hixo.B;

import dev.hixo.B.D;
import dev.hixo.M.d;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.invoke.CallSite;
import java.nio.charset.Charset;
import java.nio.file.OpenOption;
import java.util.HashMap;
import java.util.Map;
import org.apache.logging.log4j.Logger;

public final class U {
    private static final Logger A;
    private static volatile boolean f;
    private static final Map<String, String> i;
    private static final Map<String, String> V;
    private static final Map<String, String> W;
    private static final Map<String, String> M;
    private static final Map<String, String> T;
    private static final Map<String, String> h;
    private static final String[] a;
    private static final long b;

    private U() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static synchronized void W() {
        int n2 = D.U;
        Object object = d.a("\u00fd", (long)142411473567318142L) /* => dev.hixo.B.U.f */;
        if (n2 == 0) {
            if (object != false) {
                return;
            }
            object = true;
        }
        d.a("\u00c1", (boolean)object, (long)142411473567318142L) /* => dev.hixo.B.U.f */;
        CallSite callSite = d.a("\u00f9", (long)78882375305248292L) /* => java.lang.System.nanoTime */;
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader((InputStream)((Object)d.a("\u00f9", (long)144544036570002819L) /* => dev.hixo.B.U.h */), (Charset)((Object)d.a("\u00fd", (long)42196630579865547L) /* => java.nio.charset.StandardCharsets.UTF_8 */)));
            try {
                CallSite callSite2;
                CallSite callSite3 = null;
                while ((callSite2 = d.a("$", (Object)bufferedReader, (long)93440649255867876L) /* => java.io.BufferedReader.readLine */) != null) {
                    block64: {
                        CallSite callSite4;
                        Object object2;
                        CallSite callSite5;
                        block72: {
                            block68: {
                                CallSite callSite6;
                                block69: {
                                    block71: {
                                        CallSite callSite7;
                                        CallSite callSite8;
                                        block70: {
                                            block67: {
                                                CallSite callSite9;
                                                block66: {
                                                    CallSite callSite10;
                                                    block65: {
                                                        CallSite callSite11;
                                                        block59: {
                                                            CallSite callSite12;
                                                            block60: {
                                                                block62: {
                                                                    CallSite callSite13;
                                                                    CallSite callSite14;
                                                                    block63: {
                                                                        CallSite callSite15;
                                                                        CallSite callSite16;
                                                                        block61: {
                                                                            if (n2 != 0) return;
                                                                            CallSite callSite17 = callSite2;
                                                                            if (n2 == 0) {
                                                                                if (d.a("$", (Object)callSite17, (long)139567490040770223L) /* => java.lang.String.isEmpty */ != false) continue;
                                                                                callSite17 = callSite2;
                                                                            }
                                                                            callSite11 = callSite12 = d.a("$", (Object)callSite17, (int)0, (long)62324382268630092L) /* => java.lang.String.charAt */;
                                                                            if (n2 != 0) break block59;
                                                                            if (callSite11 != 99) break block60;
                                                                            callSite15 = callSite16 = d.a("$", (Object)callSite2, (Object)"\t", (int)-1, (long)183700585267436096L) /* => java.lang.String.split */;
                                                                            if (n2 != 0) break block61;
                                                                            if (((CallSite)callSite15).length < 4) break block62;
                                                                            callSite15 = callSite16;
                                                                        }
                                                                        callSite5 = callSite15[1];
                                                                        CallSite callSite18 = callSite16[2];
                                                                        callSite13 = callSite14 = callSite16[3];
                                                                        if (n2 != 0) break block62;
                                                                        if (d.a("$", (Object)callSite13, (long)139567490040770223L) /* => java.lang.String.isEmpty */ != false) break block63;
                                                                        callSite13 = callSite18;
                                                                        if (n2 == 0) {
                                                                            if (d.a("$", (Object)callSite13, (long)139567490040770223L) /* => java.lang.String.isEmpty */ == false) {
                                                                                d.a("$", (Object)d.a("\u00fd", (long)57165688028256270L) /* => dev.hixo.B.U.i */, (Object)callSite14, (Object)callSite18, (long)87609561069083692L) /* => java.util.Map.put */;
                                                                                d.a("$", (Object)d.a("\u00fd", (long)101426941198264824L) /* => dev.hixo.B.U.V */, (Object)callSite18, (Object)callSite14, (long)87609561069083692L) /* => java.util.Map.put */;
                                                                            }
                                                                            callSite13 = callSite5;
                                                                        }
                                                                        if (n2 != 0) break block62;
                                                                        if (d.a("$", (Object)callSite13, (long)139567490040770223L) /* => java.lang.String.isEmpty */ == false) {
                                                                            d.a("$", (Object)d.a("\u00fd", (long)196899062918026314L) /* => dev.hixo.B.U.W */, (Object)callSite14, (Object)callSite5, (long)87609561069083692L) /* => java.util.Map.put */;
                                                                        }
                                                                    }
                                                                    callSite13 = callSite3 = callSite14;
                                                                }
                                                                if (n2 == 0) break block64;
                                                            }
                                                            callSite11 = callSite12;
                                                        }
                                                        if (callSite11 != 9) break block64;
                                                        callSite10 = callSite3;
                                                        if (n2 != 0) break block65;
                                                        if (callSite10 == null) break block64;
                                                        callSite10 = callSite2;
                                                    }
                                                    callSite9 = callSite6 = d.a("$", callSite10, (int)1, (long)62324382268630092L) /* => java.lang.String.charAt */;
                                                    if (n2 != 0) break block66;
                                                    if (callSite9 == 109) break block67;
                                                    callSite9 = callSite6;
                                                }
                                                if (callSite9 != 102) continue;
                                            }
                                            callSite5 = d.a("$", (Object)callSite2, (Object)"\t", (int)-1, (long)183700585267436096L) /* => java.lang.String.split */;
                                            object2 = ((CallSite)callSite5).length;
                                            if (n2 == 0) {
                                                if (object2 < 4) continue;
                                                object2 = callSite6;
                                            }
                                            if (n2 != 0) break block68;
                                            if (object2 != 109) break block69;
                                            object2 = ((CallSite)callSite5).length;
                                            if (n2 != 0) break block68;
                                            if (object2 < 6) break block69;
                                            d.a("$", (Object)d.a("\u00fd", (long)146565692936481966L) /* => dev.hixo.B.U.M */, (Object)d.a("$", (Object)d.a("$", (Object)d.a("$", (Object)d.a("$", (Object)d.a("$", (Object)new StringBuilder(), (Object)callSite3, (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (Object)"#", (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (Object)callSite5[5], (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (Object)callSite5[2], (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (long)59411206276622891L) /* => java.lang.StringBuilder.toString */, (Object)callSite5[4], (long)87609561069083692L) /* => java.util.Map.put */;
                                            callSite8 = callSite5[2];
                                            if (n2 != 0) break block70;
                                            if (d.a("$", (Object)callSite8, (long)139567490040770223L) /* => java.lang.String.isEmpty */ != false) break block64;
                                            callSite7 = callSite5;
                                            if (n2 != 0) break block71;
                                            callSite8 = callSite7[5];
                                        }
                                        if (d.a("$", (Object)callSite8, (long)139567490040770223L) /* => java.lang.String.isEmpty */ != false) break block64;
                                        callSite7 = d.a("$", (Object)d.a("\u00fd", (long)51012593761669330L) /* => dev.hixo.B.U.T */, (Object)d.a("$", (Object)d.a("$", (Object)d.a("$", (Object)new StringBuilder(), (Object)callSite5[5], (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (Object)callSite5[2], (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (long)59411206276622891L) /* => java.lang.StringBuilder.toString */, (Object)callSite5[4], (long)73007754622217488L) /* => java.util.Map.putIfAbsent */;
                                    }
                                    if (n2 == 0) break block64;
                                }
                                object2 = callSite6;
                            }
                            if (n2 != 0) break block72;
                            if (object2 != 102) break block64;
                            callSite4 = callSite5;
                            if (n2 != 0) break block64;
                            object2 = ((CallSite)callSite4).length;
                        }
                        if (object2 >= 6) {
                            callSite4 = d.a("$", (Object)d.a("\u00fd", (long)174250992492563301L) /* => dev.hixo.B.U.h */, (Object)d.a("$", (Object)d.a("$", (Object)d.a("$", (Object)d.a("$", (Object)new StringBuilder(), (Object)callSite3, (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (Object)"#", (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (Object)callSite5[5], (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (long)59411206276622891L) /* => java.lang.StringBuilder.toString */, (Object)callSite5[4], (long)87609561069083692L) /* => java.util.Map.put */;
                        }
                    }
                    if (n2 == 0) continue;
                }
                reference var6_9 = (d.a("\u00f9", (long)78882375305248292L) /* => java.lang.System.nanoTime */ - callSite) / b;
                String[] stringArray = a;
                d.a("$", (Object)d.a("\u00fd", (long)32644622212493876L) /* => dev.hixo.B.U.A */, (Object)stringArray[0], (Object)d.a("\u00f9", (int)d.a("$", (Object)d.a("\u00fd", (long)57165688028256270L) /* => dev.hixo.B.U.i */, (long)45267615869066604L) /* => java.util.Map.size */, (long)67104637941965968L) /* => java.lang.Integer.valueOf */, (Object)d.a("\u00f9", (int)d.a("$", (Object)d.a("\u00fd", (long)146565692936481966L) /* => dev.hixo.B.U.M */, (long)45267615869066604L) /* => java.util.Map.size */, (long)67104637941965968L) /* => java.lang.Integer.valueOf */, (Object)d.a("\u00f9", (int)d.a("$", (Object)d.a("\u00fd", (long)174250992492563301L) /* => dev.hixo.B.U.h */, (long)45267615869066604L) /* => java.util.Map.size */, (long)67104637941965968L) /* => java.lang.Integer.valueOf */, (Object)d.a("\u00f9", (long)var6_9, (long)85160129630559423L) /* => java.lang.Long.valueOf */, (long)125424199617423982L) /* => org.apache.logging.log4j.Logger.info */;
            }
            catch (Throwable throwable) {
                try {
                    d.a("$", (Object)bufferedReader, (long)115491125018054141L) /* => java.io.BufferedReader.close */;
                    throw throwable;
                }
                catch (Throwable throwable2) {
                    d.a("$", (Object)throwable, (Object)throwable2, (long)176239701128201553L) /* => java.lang.Throwable.addSuppressed */;
                }
                throw throwable;
            }
            d.a("$", (Object)bufferedReader, (long)115491125018054141L) /* => java.io.BufferedReader.close */;
            return;
        }
        catch (Throwable throwable) {
            d.a("$", (Object)d.a("\u00fd", (long)32644622212493876L) /* => dev.hixo.B.U.A */, (Object)a[5], (Object)d.a("$", (Object)throwable, (long)120621357894278260L) /* => java.lang.Throwable.toString */, (long)113341148471985915L) /* => org.apache.logging.log4j.Logger.warn */;
        }
    }

    private static InputStream h() throws Exception {
        Object object;
        String[] stringArray = a;
        CallSite callSite = d.a("\u00f9", stringArray[1], (long)86310213400528686L) /* => java.lang.System.getProperty */;
        if (callSite != null) {
            object = new File((String)((Object)callSite), stringArray[6]);
            if (d.a("$", (Object)object, (long)46027041108829781L) /* => java.io.File.isFile */ != false) {
                return d.a("\u00f9", (Object)d.a("$", (Object)object, (long)76478556598448330L) /* => java.io.File.toPath */, (Object)new OpenOption[0], (long)47004219412604239L) /* => java.nio.file.Files.newInputStream */;
            }
        }
        stringArray = a;
        object = d.a("$", U.class, (Object)stringArray[2], (long)45506956279409619L) /* => java.lang.Class.getResourceAsStream */;
        if (object != null) {
            return object;
        }
        throw new IllegalStateException(a[3]);
    }

    public static String l(String string) {
        String string2 = (String)((Object)d.a("$", (Object)d.a("\u00fd", (long)57165688028256270L) /* => dev.hixo.B.U.i */, (Object)string, (long)150360683669181890L) /* => java.util.Map.get */);
        String string3 = string2 != null ? string2 : string;
        return string3;
    }

    private static String W(Map<String, String> map, String string) {
        block11: {
            if (string != null && d.a("$", string, (int)76, (long)104317560493873190L) /* => java.lang.String.indexOf */ >= 0) break block11;
            return string;
        }
        StringBuilder stringBuilder = new StringBuilder((int)d.a("$", string, (long)49243968837171037L) /* => java.lang.String.length */);
        Object object = 0;
        while (object < d.a("$", string, (long)49243968837171037L) /* => java.lang.String.length */) {
            CallSite callSite = d.a("$", string, (int)object, (long)62324382268630092L) /* => java.lang.String.charAt */;
            if (callSite == 76) {
                CallSite callSite2 = d.a("$", string, (int)59, (int)object, (long)57010716484477819L) /* => java.lang.String.indexOf */;
                if (callSite2 < 0) {
                    d.a("$", (Object)stringBuilder, (Object)string, (int)object, (int)d.a("$", string, (long)49243968837171037L) /* => java.lang.String.length */, (long)63906743935491439L) /* => java.lang.StringBuilder.append */;
                    break;
                }
                CallSite callSite3 = d.a("$", string, (int)(object + 1), (int)callSite2, (long)169274583096351474L) /* => java.lang.String.net.minecraft.class_243 */;
                String string2 = (String)((Object)d.a("$", map, (Object)callSite3, (long)150360683669181890L) /* => java.util.Map.get */);
                CallSite callSite4 = d.a("$", (Object)stringBuilder, (char)'L', (long)170414562223323178L) /* => java.lang.StringBuilder.append */;
                Object object2 = string2 != null ? string2 : callSite3;
                d.a("$", (Object)d.a("$", (Object)callSite4, (Object)object2, (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (char)';', (long)170414562223323178L) /* => java.lang.StringBuilder.append */;
                object = callSite2 + true;
                continue;
            }
            d.a("$", (Object)stringBuilder, (char)callSite, (long)170414562223323178L) /* => java.lang.StringBuilder.append */;
            ++object;
        }
        return d.a("$", (Object)stringBuilder, (long)59411206276622891L) /* => java.lang.StringBuilder.toString */;
    }

    public static String L(String string) {
        return d.a("\u00f9", (Object)d.a("\u00fd", (long)57165688028256270L) /* => dev.hixo.B.U.i */, (Object)string, (long)172225537900506947L) /* => dev.hixo.B.U.W */;
    }

    public static String G(String string) {
        return d.a("\u00f9", (Object)d.a("\u00fd", (long)196899062918026314L) /* => dev.hixo.B.U.W */, (Object)string, (long)172225537900506947L) /* => dev.hixo.B.U.W */;
    }

    public static String y(String string, String string2, String string3) {
        CallSite callSite = d.a("\u00f9", string3, (long)199190735603141868L) /* => dev.hixo.B.U.G */;
        String string4 = (String)((Object)d.a("$", (Object)d.a("\u00fd", (long)146565692936481966L) /* => dev.hixo.B.U.M */, (Object)d.a("$", (Object)d.a("$", (Object)d.a("$", (Object)d.a("$", (Object)d.a("$", (Object)new StringBuilder(), (Object)string, (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (Object)"#", (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (Object)string2, (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (Object)callSite, (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (long)59411206276622891L) /* => java.lang.StringBuilder.toString */, (long)150360683669181890L) /* => java.util.Map.get */);
        if (string4 != null) {
            return string4;
        }
        string4 = (String)((Object)d.a("$", (Object)d.a("\u00fd", (long)51012593761669330L) /* => dev.hixo.B.U.T */, (Object)d.a("$", (Object)d.a("$", (Object)d.a("$", (Object)new StringBuilder(), (Object)string2, (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (Object)callSite, (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (long)59411206276622891L) /* => java.lang.StringBuilder.toString */, (long)150360683669181890L) /* => java.util.Map.get */);
        if (string4 != null) {
            return string4;
        }
        return string2;
    }

    public static String s(String string, String string2, String string3) {
        String string4 = (String)((Object)d.a("$", (Object)d.a("\u00fd", (long)101426941198264824L) /* => dev.hixo.B.U.V */, (Object)string, (long)150360683669181890L) /* => java.util.Map.get */);
        if (string4 == null) {
            string4 = string;
        }
        return d.a("\u00f9", string4, (Object)string2, (Object)string3, (long)165774466883552610L) /* => dev.hixo.B.U.y */;
    }

    public static String w(String string, String string2, String string3) {
        String string4 = (String)((Object)d.a("$", (Object)d.a("\u00fd", (long)174250992492563301L) /* => dev.hixo.B.U.h */, (Object)d.a("$", (Object)d.a("$", (Object)d.a("$", (Object)d.a("$", (Object)new StringBuilder(), (Object)string, (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (Object)"#", (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (Object)string2, (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (long)59411206276622891L) /* => java.lang.StringBuilder.toString */, (long)150360683669181890L) /* => java.util.Map.get */);
        String string5 = string4 != null ? string4 : string2;
        return string5;
    }

    public static boolean T() {
        return false;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                block19: {
                    var7 = new String[7];
                    var5_1 = 0;
                    var4_2 = "\u0004\\D4TOL2U]<R|\u000b\u007fXB-_w\be\u0014V1\u001bq\u0000>G^)H>L$I\r!^f\u00040P^`\u001bi\u0011\u007fRD)Wv\u001f\u007f\u001cV1\u001b\u007f\u001fv\u000e7]U#\u0015`\t,[X>Xw\u001f\u0013p\\D4T=\u0001>D]%Uu\u001fq@D\"B\u001c7]U#\u0014\u007f\r/DD\"\\aB+]C5\u001b|\u0003+\u0014K#N|\b\f\u0017]U#\u0014B\r+WE)H";
                    var6_3 = "\u0004\\D4TOL2U]<R|\u000b\u007fXB-_w\be\u0014V1\u001bq\u0000>G^)H>L$I\r!^f\u00040P^`\u001bi\u0011\u007fRD)Wv\u001f\u007f\u001cV1\u001b\u007f\u001fv\u000e7]U#\u0015`\t,[X>Xw\u001f\u0013p\\D4T=\u0001>D]%Uu\u001fq@D\"B\u001c7]U#\u0014\u007f\r/DD\"\\aB+]C5\u001b|\u0003+\u0014K#N|\b\f\u0017]U#\u0014B\r+WE)H".length();
                    var3_4 = 64;
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
                        var4_2 = "\u0004\\D4TOL9UD ^vL+[\r Ts\b\u007fYL<K{\u00028G\u00038R|\u0015e\u0014V1\u00127]U#\u0014\u007f\r/DD\"\\aB+]C5";
                        var6_3 = "\u0004\\D4TOL9UD ^vL+[\r Ts\b\u007fYL<K{\u00028G\u00038R|\u0015e\u0014V1\u00127]U#\u0014\u007f\r/DD\"\\aB+]C5".length();
                        var3_4 = 39;
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
                            v10 = 95;
                            break;
                        }
                        case 1: {
                            v10 = 52;
                            break;
                        }
                        case 2: {
                            v10 = 45;
                            break;
                        }
                        case 3: {
                            v10 = 76;
                            break;
                        }
                        case 4: {
                            v10 = 59;
                            break;
                        }
                        case 5: {
                            v10 = 18;
                            break;
                        }
                        default: {
                            v10 = 108;
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
            U.a = var7;
            break block21;
lbl77:
            // 1 sources

            while (true) {
                continue;
                break;
            }
        }
        var0_7 = 2070462444075679461L;
        ** while (true)
        U.b = 2070462444075334821L ^ var0_7;
        U.A = d.a("\u00f9", U.a[4], (long)120942883416063627L) /* => org.apache.logging.log4j.LogManager.getLogger */;
        d.a("\u00c1", (boolean)false, (long)142411473567318142L) /* => dev.hixo.B.U.f */;
        U.i = new HashMap<String, String>();
        U.V = new HashMap<String, String>();
        U.W = new HashMap<String, String>();
        U.M = new HashMap<String, String>();
        U.T = new HashMap<String, String>();
        U.h = new HashMap<String, String>();
    }
}

