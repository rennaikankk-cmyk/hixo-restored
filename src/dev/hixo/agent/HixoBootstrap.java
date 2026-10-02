/*
 * RESTORED SOURCE — decompiled reconstruction, not the original files.
 * class: dev.hixo.agent.HixoBootstrap
 * context strings: '[hixo] bootstrap.start' | '[hixo] loader = ' | '[hixo] client init failed: ' | '[hixo] bootstrap.done'
 * decrypted string pool:
 *   a[0] = [hixo] bootstrap.start
 *   a[1] = [hixo] loader = 
 *   a[2] = [hixo] client init failed: 
 *   a[3] = [hixo] bootstrap.done
 */

/*
 * Decompiled with CFR 0.152.
 */
package dev.hixo.agent;

import dev.hixo.Hixo;
import dev.hixo.M.d;
import dev.hixo.agent.Strings;
import dev.hixo.patch.ClientCommonNetworkHandlerPatch;
import dev.hixo.patch.ClientConnectionPatch;
import dev.hixo.patch.ClientPlayNetworkHandlerPatch;
import dev.hixo.patch.ClientPlayerEntityPatch;
import dev.hixo.patch.EntityPatch;
import dev.hixo.patch.HeldItemRendererPatch;
import dev.hixo.patch.LivingEntityPatch;
import dev.hixo.patch.MinecraftClientPatch;
import java.lang.invoke.CallSite;

public final class HixoBootstrap {
    private static volatile boolean started;
    private static final String[] a;

    private HixoBootstrap() {
    }

    public static synchronized void start() {
        block5: {
            block6: {
                block8: {
                    boolean bl;
                    block7: {
                        bl = Strings.Y;
                        Object object = d.a("\u00fd", (long)65584569206850903L) /* => dev.hixo.agent.HixoBootstrap.started */;
                        if (!bl) {
                            if (object != false) {
                                return;
                            }
                            object = true;
                        }
                        d.a("\u00c1", (boolean)object, (long)65584569206850903L) /* => dev.hixo.agent.HixoBootstrap.started */;
                        String[] stringArray = a;
                        d.a("$", (Object)d.a("\u00fd", (long)53330690048667339L) /* => java.lang.System.out */, (Object)stringArray[0], (long)190492993133616615L) /* => java.io.PrintStream.println */;
                        d.a("$", (Object)d.a("\u00fd", (long)53330690048667339L) /* => java.lang.System.out */, (Object)d.a("$", (Object)d.a("$", (Object)d.a("$", (Object)new StringBuilder(), (Object)stringArray[1], (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (Object)d.a("$", HixoBootstrap.class, (long)99957887028967471L) /* => java.lang.Class.getClassLoader */, (long)121136869135998173L) /* => java.lang.StringBuilder.append */, (long)59411206276622891L) /* => java.lang.StringBuilder.toString */, (long)190492993133616615L) /* => java.io.PrintStream.println */;
                        d.a("\u00f9", (long)116348175511796057L) /* => dev.hixo.B.U.W */;
                        d.a("\u00f9", MinecraftClientPatch.class, (long)188601363272967480L) /* => asm.patchify.loader.PatchRegistry.register */;
                        d.a("\u00f9", ClientPlayNetworkHandlerPatch.class, (long)188601363272967480L) /* => asm.patchify.loader.PatchRegistry.register */;
                        if (bl) break block5;
                        d.a("\u00f9", ClientPlayerEntityPatch.class, (long)188601363272967480L) /* => asm.patchify.loader.PatchRegistry.register */;
                        d.a("\u00f9", ClientCommonNetworkHandlerPatch.class, (long)188601363272967480L) /* => asm.patchify.loader.PatchRegistry.register */;
                        d.a("\u00f9", LivingEntityPatch.class, (long)188601363272967480L) /* => asm.patchify.loader.PatchRegistry.register */;
                        d.a("\u00f9", EntityPatch.class, (long)188601363272967480L) /* => asm.patchify.loader.PatchRegistry.register */;
                        d.a("\u00f9", HeldItemRendererPatch.class, (long)188601363272967480L) /* => asm.patchify.loader.PatchRegistry.register */;
                        d.a("\u00f9", ClientConnectionPatch.class, (long)188601363272967480L) /* => asm.patchify.loader.PatchRegistry.register */;
                        d.a("\u00f9", (long)119614497315055567L) /* => asm.patchify.loader.PatchAgent.installPatchesAndRetransform */;
                        if (d.a("\u00fd", (long)71498313283647962L) /* => dev.hixo.Hixo.INSTANCE */ != null) break block6;
                        CallSite callSite = d.a("\u00f9", (long)179869930689441125L) /* => net.minecraft.class_310.method_1551 */;
                        if (bl) break block7;
                        if (callSite == null) break block8;
                        d.a("$", (Object)callSite, () -> {
                            try {
                                if (d.a("\u00fd", (long)71498313283647962L) /* => dev.hixo.Hixo.INSTANCE */ == null) {
                                    d.a("$", (Object)new Hixo(), (long)75731425376429306L) /* => dev.hixo.Hixo.onInitializeClient */;
                                }
                            }
                            catch (Throwable throwable) {
                                d.a("$", (Object)d.a("\u00fd", (long)53330690048667339L) /* => java.lang.System.out */, (Object)d.a("$", (Object)d.a("$", (Object)d.a("$", (Object)new StringBuilder(), (Object)a[2], (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (Object)throwable, (long)121136869135998173L) /* => java.lang.StringBuilder.append */, (long)59411206276622891L) /* => java.lang.StringBuilder.toString */, (long)190492993133616615L) /* => java.io.PrintStream.println */;
                                d.a("$", (Object)throwable, (long)115058041102162518L) /* => java.lang.Throwable.printStackTrace */;
                            }
                        }, (long)185512432602743166L) /* => net.minecraft.class_310.execute */;
                    }
                    if (!bl) break block6;
                }
                d.a("$", (Object)new Hixo(), (long)75731425376429306L) /* => dev.hixo.Hixo.onInitializeClient */;
            }
            d.a("$", (Object)d.a("\u00fd", (long)53330690048667339L) /* => java.lang.System.out */, (Object)a[3], (long)190492993133616615L) /* => java.io.PrintStream.println */;
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block19: {
            block18: {
                var5 = new String[4];
                var3_1 = 0;
                var2_2 = "\u0006[|\u0019p6D?\\z\u0015l\u001f\u0016<C;\u0012k\n\u0016)\u0010\u0006[|\u0019p6D1\\t\u0005z\u0019D`\u0013";
                var4_3 = "\u0006[|\u0019p6D?\\z\u0015l\u001f\u0016<C;\u0012k\n\u0016)\u0010\u0006[|\u0019p6D1\\t\u0005z\u0019D`\u0013".length();
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
                    var2_2 = "\u0006[|\u0019p6D>_|\u0004q\u001fD4]|\u0015?\r\u00054_p\u0005%K\u0015\u0006[|\u0019p6D?\\z\u0015l\u001f\u0016<C;\u0005p\u0005\u0001";
                    var4_3 = "\u0006[|\u0019p6D>_|\u0004q\u001fD4]|\u0015?\r\u00054_p\u0005%K\u0015\u0006[|\u0019p6D?\\z\u0015l\u001f\u0016<C;\u0005p\u0005\u0001".length();
                    var1_4 = 27;
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
                        v10 = 93;
                        break;
                    }
                    case 1: {
                        v10 = 51;
                        break;
                    }
                    case 2: {
                        v10 = 21;
                        break;
                    }
                    case 3: {
                        v10 = 97;
                        break;
                    }
                    case 4: {
                        v10 = 31;
                        break;
                    }
                    case 5: {
                        v10 = 107;
                        break;
                    }
                    default: {
                        v10 = 100;
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
        HixoBootstrap.a = var5;
        d.a("\u00c1", (boolean)false, (long)65584569206850903L) /* => dev.hixo.agent.HixoBootstrap.started */;
    }
}

