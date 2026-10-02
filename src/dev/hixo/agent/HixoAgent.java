/*
 * RESTORED SOURCE — decompiled reconstruction, not the original files.
 * class: dev.hixo.agent.HixoAgent
 * context strings: '[hixo] agent attached. retransform=' | ' redefine='
 * decrypted string pool:
 *   a[0] = [hixo] agent attached. retransform=
 *   a[1] = [hixo] waiting for game-loader bridge to call HixoBootstrap.start()
 *   a[2] =  redefine=
 */

/*
 * Decompiled with CFR 0.152.
 */
package dev.hixo.agent;

import dev.hixo.M.d;
import java.lang.instrument.Instrumentation;

public final class HixoAgent {
    public static volatile Instrumentation instrumentation;
    private static final String[] a;

    private HixoAgent() {
    }

    public static void premain(String string, Instrumentation instrumentation) {
        d.a("\u00f9", string, (Object)instrumentation, (long)85317473511231868L) /* => dev.hixo.agent.HixoAgent.attach */;
    }

    public static void agentmain(String string, Instrumentation instrumentation) {
        d.a("\u00f9", string, (Object)instrumentation, (long)85317473511231868L) /* => dev.hixo.agent.HixoAgent.attach */;
    }

    private static void attach(String string, Instrumentation instrumentation) {
        d.a("\u00c1", (Instrumentation)instrumentation, (long)118295289731270594L) /* => dev.hixo.agent.HixoAgent.instrumentation */;
        d.a("\u00f9", (Object)instrumentation, (long)146644246061227980L) /* => asm.patchify.loader.PatchAgent.install */;
        String[] stringArray = a;
        d.a("$", (Object)d.a("\u00fd", (long)53330690048667339L) /* => java.lang.System.out */, (Object)d.a("$", (Object)d.a("$", (Object)d.a("$", (Object)d.a("$", (Object)d.a("$", (Object)new StringBuilder(), (Object)stringArray[0], (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (boolean)d.a("$", (Object)instrumentation, (long)151480742652594260L) /* => java.lang.instrument.Instrumentation.isRetransformClassesSupported */, (long)174170300402165012L) /* => java.lang.StringBuilder.append */, (Object)stringArray[2], (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (boolean)d.a("$", (Object)instrumentation, (long)80333851804388638L) /* => java.lang.instrument.Instrumentation.isRedefineClassesSupported */, (long)174170300402165012L) /* => java.lang.StringBuilder.append */, (long)59411206276622891L) /* => java.lang.StringBuilder.toString */, (long)190492993133616615L) /* => java.io.PrintStream.println */;
        d.a("$", (Object)d.a("\u00fd", (long)53330690048667339L) /* => java.lang.System.out */, (Object)stringArray[1], (long)190492993133616615L) /* => java.io.PrintStream.println */;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block12: {
            var5 = new String[3];
            var3_1 = 0;
            var2_2 = "8\u0001\u0002nZb\u0010\u0002\u000e\u000exA\u001fQ\u0017\u001d\nu]ZTMI\u0019sAMQ\r\u001a\ryGR\rC8\u0001\u0002nZb\u0010\u0014\b\u0002b\\QWC\u000f\u0004d\u0015XQ\u000e\fFzZ^T\u0006\u001bKtGVT\u0004\fKbZ\u001fS\u0002\u0005\u00076}VH\f+\u0004yALD\u0011\b\u001b8FKQ\u0011\u001dC?\nC\u001b\u000erPYY\r\fV";
            var4_3 = "8\u0001\u0002nZb\u0010\u0002\u000e\u000exA\u001fQ\u0017\u001d\nu]ZTMI\u0019sAMQ\r\u001a\ryGR\rC8\u0001\u0002nZb\u0010\u0014\b\u0002b\\QWC\u000f\u0004d\u0015XQ\u000e\fFzZ^T\u0006\u001bKtGVT\u0004\fKbZ\u001fS\u0002\u0005\u00076}VH\f+\u0004yALD\u0011\b\u001b8FKQ\u0011\u001dC?\nC\u001b\u000erPYY\r\fV".length();
            var1_4 = 35;
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
                        v6 = 99;
                        break;
                    }
                    case 1: {
                        v6 = 105;
                        break;
                    }
                    case 2: {
                        v6 = 107;
                        break;
                    }
                    case 3: {
                        v6 = 22;
                        break;
                    }
                    case 4: {
                        v6 = 53;
                        break;
                    }
                    case 5: {
                        v6 = 63;
                        break;
                    }
                    default: {
                        v6 = 48;
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
        HixoAgent.a = var5;
    }
}

