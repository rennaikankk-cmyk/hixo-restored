/*
 * RESTORED SOURCE — decompiled reconstruction, not the original files.
 * class: asm.patchify.loader.ASMHelpers
 * context strings: 'java/lang/Double' | 'shortValue' | '(J)Ljava/lang/Long;' | '()Z'
 * decrypted string pool:
 *   a[0] = java/lang/Double
 *   a[1] = shortValue
 *   a[2] = (J)Ljava/lang/Long;
 *   a[3] = ()Z
 *   a[4] = ()J
 *   a[5] = ()C
 *   a[6] = ()F
 *   a[7] = java/lang/Double
 *   a[8] = java/lang/Float
 *   a[9] = java/lang/Character
 *   a[10] = java/lang/Integer
 *   a[11] = doubleValue
 *   a[12] = java/lang/Boolean
 *   a[13] = ()D
 *   a[14] = longValue
 *   a[15] = java/lang/Long
 *   a[16] = java/lang/Short
 *   a[17] = ()S
 *   a[18] = (I)Ljava/lang/Integer;
 *   a[19] = floatValue
 *   a[20] = java/lang/Byte
 *   a[21] = java/lang/Character
 *   a[22] = java/lang/Object
 *   a[23] = (F)Ljava/lang/Float;
 *   a[24] = (C)Ljava/lang/Character;
 *   a[25] = java/lang/Long
 *   a[26] = booleanValue
 *   a[27] = (S)Ljava/lang/Short;
 *   a[28] = (D)Ljava/lang/Double;
 *   a[29] = charValue
 *   a[30] = (B)Ljava/lang/Byte;
 *   a[31] = valueOf
 *   a[32] = java/lang/Integer
 *   a[33] = ()B
 *   a[34] = java/lang/Boolean
 *   a[35] = byteValue
 *   a[36] = intValue
 *   a[37] = (Z)Ljava/lang/Boolean;
 *   a[38] = java/lang/Byte
 *   a[39] = ()I
 *   a[40] = java/lang/Float
 *   a[41] = valueOf
 *   a[42] = java/lang/Short
 */

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.objectweb.asm.Type
 *  org.objectweb.asm.tree.InsnList
 *  org.objectweb.asm.tree.MethodInsnNode
 *  org.objectweb.asm.tree.TypeInsnNode
 */
package asm.patchify.loader;

import asm.patchify.loader.PatchTransformer;
import dev.hixo.M.G;
import dev.hixo.M.d;
import java.lang.invoke.CallSite;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.InsnList;
import org.objectweb.asm.tree.MethodInsnNode;
import org.objectweb.asm.tree.TypeInsnNode;

public final class ASMHelpers {
    private static final String[] a;

    private ASMHelpers() {
    }

    /*
     * Unable to fully structure code
     */
    public static InsnList unboxFromObject(Type var0) {
        var1_1 = PatchTransformer.O;
        var2_2 = new InsnList();
        if (var1_1) ** GOTO lbl9
        switch (d.a("$", (Object)var0, (long)45675156776176898L) /* => org.objectweb.asm.Type.getSort */) {
            case 5: {
                var3_3 = ASMHelpers.a;
                d.a("$", (Object)var2_2, (Object)new TypeInsnNode(192, var3_3[10]), (long)106385981662087614L) /* => org.objectweb.asm.tree.InsnList.add */;
                d.a("$", (Object)var2_2, (Object)new MethodInsnNode(182, var3_3[32], var3_3[36], var3_3[39], false), (long)106385981662087614L) /* => org.objectweb.asm.tree.InsnList.add */;
lbl9:
                // 2 sources

                if (!var1_1) break;
            }
            case 1: {
                var3_3 = ASMHelpers.a;
                d.a("$", (Object)var2_2, (Object)new TypeInsnNode(192, var3_3[34]), (long)106385981662087614L) /* => org.objectweb.asm.tree.InsnList.add */;
                d.a("$", (Object)var2_2, (Object)new MethodInsnNode(182, var3_3[12], var3_3[26], var3_3[3], false), (long)106385981662087614L) /* => org.objectweb.asm.tree.InsnList.add */;
                if (!var1_1) break;
            }
            case 2: {
                var3_3 = ASMHelpers.a;
                d.a("$", (Object)var2_2, (Object)new TypeInsnNode(192, var3_3[21]), (long)106385981662087614L) /* => org.objectweb.asm.tree.InsnList.add */;
                d.a("$", (Object)var2_2, (Object)new MethodInsnNode(182, var3_3[9], var3_3[29], var3_3[5], false), (long)106385981662087614L) /* => org.objectweb.asm.tree.InsnList.add */;
                if (!var1_1) break;
            }
            case 3: {
                var3_3 = ASMHelpers.a;
                d.a("$", (Object)var2_2, (Object)new TypeInsnNode(192, var3_3[20]), (long)106385981662087614L) /* => org.objectweb.asm.tree.InsnList.add */;
                d.a("$", (Object)var2_2, (Object)new MethodInsnNode(182, var3_3[38], var3_3[35], var3_3[33], false), (long)106385981662087614L) /* => org.objectweb.asm.tree.InsnList.add */;
                if (!var1_1) break;
            }
            case 4: {
                var3_3 = ASMHelpers.a;
                d.a("$", (Object)var2_2, (Object)new TypeInsnNode(192, var3_3[16]), (long)106385981662087614L) /* => org.objectweb.asm.tree.InsnList.add */;
                d.a("$", (Object)var2_2, (Object)new MethodInsnNode(182, var3_3[42], var3_3[1], var3_3[17], false), (long)106385981662087614L) /* => org.objectweb.asm.tree.InsnList.add */;
                if (!var1_1) break;
            }
            case 7: {
                var3_3 = ASMHelpers.a;
                d.a("$", (Object)var2_2, (Object)new TypeInsnNode(192, var3_3[15]), (long)106385981662087614L) /* => org.objectweb.asm.tree.InsnList.add */;
                d.a("$", (Object)var2_2, (Object)new MethodInsnNode(182, var3_3[25], var3_3[14], var3_3[4], false), (long)106385981662087614L) /* => org.objectweb.asm.tree.InsnList.add */;
                if (!var1_1) break;
            }
            case 6: {
                var3_3 = ASMHelpers.a;
                d.a("$", (Object)var2_2, (Object)new TypeInsnNode(192, var3_3[40]), (long)106385981662087614L) /* => org.objectweb.asm.tree.InsnList.add */;
                d.a("$", (Object)var2_2, (Object)new MethodInsnNode(182, var3_3[8], var3_3[19], var3_3[6], false), (long)106385981662087614L) /* => org.objectweb.asm.tree.InsnList.add */;
                if (!var1_1) break;
            }
            case 8: {
                var3_3 = ASMHelpers.a;
                d.a("$", (Object)var2_2, (Object)new TypeInsnNode(192, var3_3[7]), (long)106385981662087614L) /* => org.objectweb.asm.tree.InsnList.add */;
                d.a("$", (Object)var2_2, (Object)new MethodInsnNode(182, var3_3[0], var3_3[11], var3_3[13], false), (long)106385981662087614L) /* => org.objectweb.asm.tree.InsnList.add */;
                if (!var1_1) break;
            }
            default: {
                d.a("$", (Object)var2_2, (Object)new TypeInsnNode(192, (String)d.a("$", (Object)var0, (long)92482108849764994L) /* => org.objectweb.asm.Type.getInternalName */), (long)106385981662087614L) /* => org.objectweb.asm.tree.InsnList.add */;
            }
        }
        if (G.L) {
            PatchTransformer.O = var1_1 == false;
        }
        return var2_2;
    }

    public static InsnList boxToObject(Type type) {
        InsnList insnList = new InsnList();
        switch (d.a("$", (Object)type, (long)45675156776176898L) /* => org.objectweb.asm.Type.getSort */) {
            case 5: {
                String[] stringArray = a;
                d.a("$", (Object)insnList, (Object)new MethodInsnNode(184, stringArray[32], stringArray[41], stringArray[18], false), (long)106385981662087614L) /* => org.objectweb.asm.tree.InsnList.add */;
                break;
            }
            case 1: {
                String[] stringArray = a;
                d.a("$", (Object)insnList, (Object)new MethodInsnNode(184, stringArray[12], stringArray[31], stringArray[37], false), (long)106385981662087614L) /* => org.objectweb.asm.tree.InsnList.add */;
                break;
            }
            case 2: {
                String[] stringArray = a;
                d.a("$", (Object)insnList, (Object)new MethodInsnNode(184, stringArray[9], stringArray[31], stringArray[24], false), (long)106385981662087614L) /* => org.objectweb.asm.tree.InsnList.add */;
                break;
            }
            case 3: {
                String[] stringArray = a;
                d.a("$", (Object)insnList, (Object)new MethodInsnNode(184, stringArray[38], stringArray[31], stringArray[30], false), (long)106385981662087614L) /* => org.objectweb.asm.tree.InsnList.add */;
                break;
            }
            case 4: {
                String[] stringArray = a;
                d.a("$", (Object)insnList, (Object)new MethodInsnNode(184, stringArray[42], stringArray[31], stringArray[27], false), (long)106385981662087614L) /* => org.objectweb.asm.tree.InsnList.add */;
                break;
            }
            case 7: {
                String[] stringArray = a;
                d.a("$", (Object)insnList, (Object)new MethodInsnNode(184, stringArray[25], stringArray[31], stringArray[2], false), (long)106385981662087614L) /* => org.objectweb.asm.tree.InsnList.add */;
                break;
            }
            case 6: {
                String[] stringArray = a;
                d.a("$", (Object)insnList, (Object)new MethodInsnNode(184, stringArray[8], stringArray[31], stringArray[23], false), (long)106385981662087614L) /* => org.objectweb.asm.tree.InsnList.add */;
                break;
            }
            case 8: {
                String[] stringArray = a;
                d.a("$", (Object)insnList, (Object)new MethodInsnNode(184, stringArray[0], stringArray[31], stringArray[28], false), (long)106385981662087614L) /* => org.objectweb.asm.tree.InsnList.add */;
                break;
            }
            default: {
                d.a("$", (Object)insnList, (Object)new TypeInsnNode(192, a[22]), (long)106385981662087614L) /* => org.objectweb.asm.tree.InsnList.add */;
            }
        }
        return insnList;
    }

    public static String[] splitOwnerName(String string) {
        CallSite callSite = d.a("$", string, (int)47, (long)192353098953509929L) /* => java.lang.String.lastIndexOf */;
        if (callSite < 0) {
            return new String[]{"", string};
        }
        return new String[]{d.a("$", string, (int)0, (int)callSite, (long)169274583096351474L) /* => java.lang.String.net.minecraft.class_243 */, d.a("$", string, (int)(callSite + true), (long)79217738799933847L) /* => java.lang.String.net.minecraft.class_243 */};
    }

    /*
     * Unable to fully structure code
     */
    static {
        block19: {
            block18: {
                var5 = new String[43];
                var3_1 = 0;
                var2_2 = "\u0011\u0017t_\n6`\u0015\u0011-zJ/c\u0017\u0013\n\b\u001emLQ\f`\u0017\u0003g\u0013S<+rO;w\u001aYn_K=.7\u0019lY\u001e\u0003S_X\u0003S_H\u0003S_A\u0003S_D\u0010\u0011\u0017t_\n6`\u0015\u0011-zJ/c\u0017\u0013\u000f\u0011\u0017t_\n6`\u0015\u0011-xI5`\u000f\u0013\u0011\u0017t_\n6`\u0015\u0011-}M;s\u001a\u0015v[W\u0011\u0011\u0017t_\n6`\u0015\u0011-wK.d\u001c\u0013p\u000b\u001f\u0019w\\I?W\u001a\u001aw[\u0011\u0011\u0017t_\n6`\u0015\u0011-|J5m\u001e\u0017l\u0003S_F\t\u0017\u0019lYs;m\u000e\u0013\u000e\u0011\u0017t_\n6`\u0015\u0011-rJ4f\u000f\u0011\u0017t_\n6`\u0015\u0011-mM5s\u000f\u0003S_Q\u0016S?+rO;w\u001aYn_K=.2\u0018v[B?s@\n\u001d\u001am_Q\f`\u0017\u0003g\u000e\u0011\u0017t_\n6`\u0015\u0011-|\\.d\u0013\u0011\u0017t_\n6`\u0015\u0011-}M;s\u001a\u0015v[W\u0010\u0011\u0017t_\n6`\u0015\u0011-qG0d\u0018\u0002\u0014S0+rO;w\u001aYn_K=.=\u001am_Qa\u0018S5+rO;w\u001aYn_K=.8\u001ecLD9u\u001e\u00049\u000e\u0011\u0017t_\n6`\u0015\u0011-rJ4f\f\u0019\u0019mR@;o-\u0017nK@\u0014S%+rO;w\u001aYn_K=.(\u001emLQa\u0015S2+rO;w\u001aYn_K=.?\u0019w\\I?:\t\u0018\u001ecLs;m\u000e\u0013\u0013S4+rO;w\u001aYn_K=.9\u000fv[\u001e\u0007\r\u0017nK@\u0015g\u0011\u0011\u0017t_\n6`\u0015\u0011-wK.d\u001c\u0013p\u0003S_@\u0011\u0011\u0017t_\n6`\u0015\u0011-|J5m\u001e\u0017l\t\u0019\u000fv[s;m\u000e\u0013\b\u0012\u0018vhD6t\u001e\u0016S,+rO;w\u001aYn_K=.9\u0019mR@;o@\u000e\u0011\u0017t_\n6`\u0015\u0011-|\\.d\u0003S_K\u000f\u0011\u0017t_\n6`\u0015\u0011-xI5`\u000f";
                var4_3 = "\u0011\u0017t_\n6`\u0015\u0011-zJ/c\u0017\u0013\n\b\u001emLQ\f`\u0017\u0003g\u0013S<+rO;w\u001aYn_K=.7\u0019lY\u001e\u0003S_X\u0003S_H\u0003S_A\u0003S_D\u0010\u0011\u0017t_\n6`\u0015\u0011-zJ/c\u0017\u0013\u000f\u0011\u0017t_\n6`\u0015\u0011-xI5`\u000f\u0013\u0011\u0017t_\n6`\u0015\u0011-}M;s\u001a\u0015v[W\u0011\u0011\u0017t_\n6`\u0015\u0011-wK.d\u001c\u0013p\u000b\u001f\u0019w\\I?W\u001a\u001aw[\u0011\u0011\u0017t_\n6`\u0015\u0011-|J5m\u001e\u0017l\u0003S_F\t\u0017\u0019lYs;m\u000e\u0013\u000e\u0011\u0017t_\n6`\u0015\u0011-rJ4f\u000f\u0011\u0017t_\n6`\u0015\u0011-mM5s\u000f\u0003S_Q\u0016S?+rO;w\u001aYn_K=.2\u0018v[B?s@\n\u001d\u001am_Q\f`\u0017\u0003g\u000e\u0011\u0017t_\n6`\u0015\u0011-|\\.d\u0013\u0011\u0017t_\n6`\u0015\u0011-}M;s\u001a\u0015v[W\u0010\u0011\u0017t_\n6`\u0015\u0011-qG0d\u0018\u0002\u0014S0+rO;w\u001aYn_K=.=\u001am_Qa\u0018S5+rO;w\u001aYn_K=.8\u001ecLD9u\u001e\u00049\u000e\u0011\u0017t_\n6`\u0015\u0011-rJ4f\f\u0019\u0019mR@;o-\u0017nK@\u0014S%+rO;w\u001aYn_K=.(\u001emLQa\u0015S2+rO;w\u001aYn_K=.?\u0019w\\I?:\t\u0018\u001ecLs;m\u000e\u0013\u0013S4+rO;w\u001aYn_K=.9\u000fv[\u001e\u0007\r\u0017nK@\u0015g\u0011\u0011\u0017t_\n6`\u0015\u0011-wK.d\u001c\u0013p\u0003S_@\u0011\u0011\u0017t_\n6`\u0015\u0011-|J5m\u001e\u0017l\t\u0019\u000fv[s;m\u000e\u0013\b\u0012\u0018vhD6t\u001e\u0016S,+rO;w\u001aYn_K=.9\u0019mR@;o@\u000e\u0011\u0017t_\n6`\u0015\u0011-|\\.d\u0003S_K\u000f\u0011\u0017t_\n6`\u0015\u0011-xI5`\u000f".length();
                var1_4 = 16;
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
                    var2_2 = "\r\u0017nK@\u0015g\u000f\u0011\u0017t_\n6`\u0015\u0011-mM5s\u000f";
                    var4_3 = "\r\u0017nK@\u0015g\u000f\u0011\u0017t_\n6`\u0015\u0011-mM5s\u000f".length();
                    var1_4 = 7;
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
                        v10 = 123;
                        break;
                    }
                    case 1: {
                        v10 = 118;
                        break;
                    }
                    case 2: {
                        v10 = 2;
                        break;
                    }
                    case 3: {
                        v10 = 62;
                        break;
                    }
                    case 4: {
                        v10 = 37;
                        break;
                    }
                    case 5: {
                        v10 = 90;
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
        ASMHelpers.a = var5;
    }
}

