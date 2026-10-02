/*
 * RESTORED SOURCE — decompiled reconstruction, not the original files.
 * class: asm.patchify.loader.PatchTransformer
 * context strings: ' forwarded parameter(s) but target supp
 */

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.Logger
 *  org.objectweb.asm.Type
 *  org.objectweb.asm.tree.AbstractInsnNode
 *  org.objectweb.asm.tree.ClassNode
 *  org.objectweb.asm.tree.FieldInsnNode
 *  org.objectweb.asm.tree.InsnList
 *  org.objectweb.asm.tree.InsnNode
 *  org.objectweb.asm.tree.JumpInsnNode
 *  org.objectweb.asm.tree.LabelNode
 *  org.objectweb.asm.tree.LdcInsnNode
 *  org.objectweb.asm.tree.MethodInsnNode
 *  org.objectweb.asm.tree.MethodNode
 *  org.objectweb.asm.tree.VarInsnNode
 */
package asm.patchify.loader;

import asm.patchify.annotation.Inject;
import asm.patchify.annotation.Local;
import asm.patchify.annotation.ModifyLocals;
import asm.patchify.annotation.Overwrite;
import asm.patchify.annotation.Patch;
import asm.patchify.annotation.Slice;
import asm.patchify.annotation.Transform;
import asm.patchify.annotation.WrapInvoke;
import dev.hixo.B.D;
import dev.hixo.B.F;
import dev.hixo.B.V;
import dev.hixo.B.Y;
import dev.hixo.B.l;
import dev.hixo.M.d;
import dev.hixo.patch.CallbackInfo;
import java.lang.invoke.CallSite;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import org.apache.logging.log4j.Logger;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.FieldInsnNode;
import org.objectweb.asm.tree.InsnList;
import org.objectweb.asm.tree.InsnNode;
import org.objectweb.asm.tree.JumpInsnNode;
import org.objectweb.asm.tree.LabelNode;
import org.objectweb.asm.tree.LdcInsnNode;
import org.objectweb.asm.tree.MethodInsnNode;
import org.objectweb.asm.tree.MethodNode;
import org.objectweb.asm.tree.VarInsnNode;

public final class PatchTransformer {
    private static final Logger LOGGER;
    private static final String CALLBACK_INFO;
    private static final String CALLBACK_INFO_DESC;
    public static boolean O;
    private static final String[] a;
    private static final long b;

    private PatchTransformer() {
    }

    public static void apply(Class<?> clazz, ClassNode classNode) {
        ArrayList arrayList;
        Object object;
        Object object22;
        Patch patch = (Patch)((Object)d.a("$", clazz, Patch.class, (long)151718104097738338L) /* => java.lang.Class.getAnnotation */);
        if (patch == null) {
            throw new IllegalArgumentException((String)((Object)d.a("$", (Object)d.a("$", (Object)d.a("$", (Object)new StringBuilder(), (Object)d.a("$", clazz, (long)182318511367922152L) /* => java.lang.Class.getName */, (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (Object)a[13], (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (long)59411206276622891L) /* => java.lang.StringBuilder.toString */));
        }
        CallSite callSite = d.a("$", (Object)d.a("$", (Object)patch, (long)75020256074922747L) /* => asm.patchify.annotation.Patch.className */, (long)139567490040770223L) /* => java.lang.String.isEmpty */ == false ? d.a("$", (Object)d.a("$", (Object)patch, (long)75020256074922747L) /* => asm.patchify.annotation.Patch.className */, (char)'.', (char)'/', (long)70594469537762889L) /* => java.lang.String.replace */ : d.a("\u00f9", (Object)d.a("$", (Object)patch, (long)80437421054490806L) /* => asm.patchify.annotation.Patch.value */, (long)54385759495451154L) /* => org.objectweb.asm.Type.getInternalName */;
        HashMap hashMap = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        for (Object object22 : d.a("$", clazz, (long)160797904854251300L) /* => java.lang.Class.getDeclaredMethods */) {
            d.a("\u00f9", clazz, (Object)callSite, (Object)object22, hashMap, arrayList2, (long)168613356425779956L) /* => asm.patchify.loader.PatchTransformer.collectHandler */;
        }
        String[] stringArray = a;
        d.a("$", (Object)d.a("\u00fd", (long)147082103791028307L) /* => asm.patchify.loader.PatchTransformer.LOGGER */, (Object)stringArray[48], (Object)d.a("$", clazz, (long)182318511367922152L) /* => java.lang.Class.getName */, (Object)d.a("z", (Object)classNode, (long)189411955311871532L) /* => org.objectweb.asm.tree.ClassNode.name */, (Object)d.a("\u00f9", (int)(d.a("$", (Object)d.a("$", (Object)d.a("$", (Object)d.a("$", hashMap, (long)103619893215853235L) /* => java.util.Map.values */, (long)176870359883670332L) /* => java.util.Collection.stream */, List::size, (long)75621739497191619L) /* => java.util.stream.Stream.mapToInt */, (long)189201106804792651L) /* => java.util.stream.IntStream.sum */ + d.a("$", arrayList2, (long)180194190084079702L) /* => java.util.List.size */), (long)67104637941965968L) /* => java.lang.Integer.valueOf */, (long)32294872250390248L) /* => org.apache.logging.log4j.Logger.info */;
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        CallSite callSite2 = d.a("$", (Object)d.a("z", (Object)classNode, (long)170667899382447292L) /* => org.objectweb.asm.tree.ClassNode.methods */, (long)113221006393852506L) /* => java.util.List.iterator */;
        while (d.a("$", (Object)callSite2, (long)175361412755674352L) /* => java.util.Iterator.hasNext */ != false) {
            Method method;
            CallSite callSite3;
            block36: {
                object22 = (MethodNode)d.a("$", (Object)callSite2, (long)64633749944946827L) /* => java.util.Iterator.next */;
                object = new MethodKey((String)((Object)d.a("z", (Object)object22, (long)156822074479295918L) /* => org.objectweb.asm.tree.MethodNode.name */), (String)((Object)d.a("z", (Object)object22, (long)156623205465659605L) /* => org.objectweb.asm.tree.MethodNode.desc */));
                arrayList = (List)((Object)d.a("$", hashMap, (Object)object, (long)150360683669181890L) /* => java.util.Map.get */);
                if (arrayList != null || d.a("$", arrayList2, (long)184224858935663280L) /* => java.util.List.isEmpty */ != false) break block36;
                callSite3 = d.a("$", arrayList2, (long)113221006393852506L) /* => java.util.List.iterator */;
                while (d.a("$", (Object)callSite3, (long)175361412755674352L) /* => java.util.Iterator.hasNext */ != false) {
                    block37: {
                        method = (Method)((Object)d.a("$", (Object)callSite3, (long)64633749944946827L) /* => java.util.Iterator.next */);
                        CallSite callSite4 = d.a("\u00f9", (Object)method, (long)71448342308180753L) /* => asm.patchify.loader.PatchTransformer.getHandlerTargetMethodName */;
                        if (d.a("$", (Object)callSite4, (Object)d.a("z", (Object)object22, (long)156822074479295918L) /* => org.objectweb.asm.tree.MethodNode.name */, (long)130616148886603248L) /* => java.lang.String.equals */ == false) continue;
                        if (arrayList != null) break block37;
                        arrayList = new ArrayList();
                    }
                    d.a("$", (Object)arrayList, (Object)method, (long)184435215000867819L) /* => java.util.List.add */;
                    d.a("$", hashSet2, (Object)d.a("z", (Object)object22, (long)156822074479295918L) /* => org.objectweb.asm.tree.MethodNode.name */, (long)56498836055017186L) /* => java.util.Set.add */;
                }
            }
            if (arrayList == null) {
                continue;
            }
            d.a("$", (Object)hashSet, (Object)object, (long)56498836055017186L) /* => java.util.Set.add */;
            callSite3 = d.a("$", (Object)arrayList, (long)113221006393852506L) /* => java.util.List.iterator */;
            while (d.a("$", (Object)callSite3, (long)175361412755674352L) /* => java.util.Iterator.hasNext */ != false) {
                method = (Method)((Object)d.a("$", (Object)callSite3, (long)64633749944946827L) /* => java.util.Iterator.next */);
                if (d.a("$", (Object)method, Inject.class, (long)171526665379798521L) /* => java.lang.reflect.Method.isAnnotationPresent */ != false) {
                    d.a("\u00f9", (Object)object22, (Object)method, (long)133409583521256207L) /* => asm.patchify.loader.PatchTransformer.applyInject */;
                    continue;
                }
                if (d.a("$", (Object)method, Overwrite.class, (long)171526665379798521L) /* => java.lang.reflect.Method.isAnnotationPresent */ != false) {
                    d.a("\u00f9", (Object)object22, (Object)method, (long)192076297447411851L) /* => asm.patchify.loader.PatchTransformer.overwriteMethod */;
                    d.a("$", (Object)d.a("\u00fd", (long)147082103791028307L) /* => asm.patchify.loader.PatchTransformer.LOGGER */, (Object)a[46], (Object)d.a("z", (Object)classNode, (long)189411955311871532L) /* => org.objectweb.asm.tree.ClassNode.name */, (Object)d.a("z", (Object)object22, (long)156822074479295918L) /* => org.objectweb.asm.tree.MethodNode.name */, (Object)d.a("z", (Object)object22, (long)156623205465659605L) /* => org.objectweb.asm.tree.MethodNode.desc */, (Object)d.a("$", clazz, (long)182318511367922152L) /* => java.lang.Class.getName */, (Object)d.a("$", (Object)method, (long)86441620207627822L) /* => java.lang.reflect.Method.getName */, (long)106715614223153672L) /* => org.apache.logging.log4j.Logger.info */;
                    continue;
                }
                if (d.a("$", (Object)method, Transform.class, (long)171526665379798521L) /* => java.lang.reflect.Method.isAnnotationPresent */ != false) {
                    try {
                        d.a("$", (Object)method, (boolean)true, (long)162285088212208629L) /* => java.lang.reflect.Method.setAccessible */;
                        d.a("$", (Object)method, null, (Object)new Object[]{object22}, (long)74984033819264995L) /* => java.lang.reflect.Method.invoke */;
                    }
                    catch (Exception exception) {
                        stringArray = a;
                        throw new RuntimeException((String)((Object)d.a("$", (Object)d.a("$", (Object)d.a("$", (Object)new StringBuilder(), (Object)stringArray[11], (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (Object)method, (long)121136869135998173L) /* => java.lang.StringBuilder.append */, (long)59411206276622891L) /* => java.lang.StringBuilder.toString */), exception);
                    }
                    stringArray = a;
                    d.a("$", (Object)d.a("\u00fd", (long)147082103791028307L) /* => asm.patchify.loader.PatchTransformer.LOGGER */, (Object)stringArray[28], (Object)d.a("z", (Object)classNode, (long)189411955311871532L) /* => org.objectweb.asm.tree.ClassNode.name */, (Object)d.a("z", (Object)object22, (long)156822074479295918L) /* => org.objectweb.asm.tree.MethodNode.name */, (Object)d.a("z", (Object)object22, (long)156623205465659605L) /* => org.objectweb.asm.tree.MethodNode.desc */, (Object)d.a("$", clazz, (long)182318511367922152L) /* => java.lang.Class.getName */, (Object)d.a("$", (Object)method, (long)86441620207627822L) /* => java.lang.reflect.Method.getName */, (long)106715614223153672L) /* => org.apache.logging.log4j.Logger.info */;
                    continue;
                }
                if (d.a("$", (Object)method, WrapInvoke.class, (long)171526665379798521L) /* => java.lang.reflect.Method.isAnnotationPresent */ != false) {
                    d.a("\u00f9", (Object)object22, (Object)method, (long)192303145398108560L) /* => asm.patchify.loader.PatchTransformer.wrapInvoke */;
                    continue;
                }
                if (d.a("$", (Object)method, ModifyLocals.class, (long)171526665379798521L) /* => java.lang.reflect.Method.isAnnotationPresent */ == false) continue;
                d.a("\u00f9", (Object)object22, (Object)method, (long)47614117745834925L) /* => asm.patchify.loader.PatchTransformer.modifyLocals */;
            }
        }
        callSite2 = d.a("$", (Object)d.a("$", hashMap, (long)118687012426210117L) /* => java.util.Map.entrySet */, (long)33822594988307322L) /* => java.util.Set.iterator */;
        while (d.a("$", (Object)callSite2, (long)175361412755674352L) /* => java.util.Iterator.hasNext */ != false) {
            object22 = (Map.Entry)((Object)d.a("$", (Object)callSite2, (long)64633749944946827L) /* => java.util.Iterator.next */);
            if (d.a("$", (Object)hashSet, (Object)d.a("$", (Object)object22, (long)67507540212365111L) /* => java.util.Map$Entry.getKey */, (long)117209702718349922L) /* => java.util.Set.contains */ != false) {
                continue;
            }
            object = d.a("$", (Object)((List)((Object)d.a("$", (Object)object22, (long)154166632090388094L) /* => java.util.Map$Entry.getValue */)), (long)113221006393852506L) /* => java.util.List.iterator */;
            while (d.a("$", (Object)object, (long)175361412755674352L) /* => java.util.Iterator.hasNext */ != false) {
                arrayList = (Method)((Object)d.a("$", (Object)object, (long)64633749944946827L) /* => java.util.Iterator.next */);
                stringArray = a;
                d.a("$", (Object)d.a("\u00fd", (long)147082103791028307L) /* => asm.patchify.loader.PatchTransformer.LOGGER */, (Object)stringArray[41], (Object)d.a("$", (Object)d.a("$", (Object)arrayList, (long)45153845220366281L) /* => java.lang.reflect.Method.getDeclaringClass */, (long)182318511367922152L) /* => java.lang.Class.getName */, (Object)d.a("$", (Object)arrayList, (long)86441620207627822L) /* => java.lang.reflect.Method.getName */, (Object)d.a("\u00f9", (Object)arrayList, (long)106651601817445952L) /* => org.objectweb.asm.Type.getMethodDescriptor */, (Object)d.a("z", (Object)classNode, (long)189411955311871532L) /* => org.objectweb.asm.tree.ClassNode.name */, (Object)d.a("$", (Object)((Object)((MethodKey)((Object)d.a("$", (Object)object22, (long)67507540212365111L) /* => java.util.Map$Entry.getKey */))), (long)116988991255243078L) /* => asm.patchify.loader.PatchTransformer$MethodKey.name */, (Object)d.a("$", (Object)((Object)((MethodKey)((Object)d.a("$", (Object)object22, (long)67507540212365111L) /* => java.util.Map$Entry.getKey */))), (long)47308874867801541L) /* => asm.patchify.loader.PatchTransformer$MethodKey.desc */, (Object)d.a("z", (Object)classNode, (long)189411955311871532L) /* => org.objectweb.asm.tree.ClassNode.name */, (long)32105346431085725L) /* => org.apache.logging.log4j.Logger.warn */;
            }
        }
        callSite2 = d.a("$", arrayList2, (long)113221006393852506L) /* => java.util.List.iterator */;
        while (d.a("$", (Object)callSite2, (long)175361412755674352L) /* => java.util.Iterator.hasNext */ != false) {
            object22 = (Method)((Object)d.a("$", (Object)callSite2, (long)64633749944946827L) /* => java.util.Iterator.next */);
            if (d.a("$", hashSet2, (Object)d.a("\u00f9", (Object)object22, (long)71448342308180753L) /* => asm.patchify.loader.PatchTransformer.getHandlerTargetMethodName */, (long)117209702718349922L) /* => java.util.Set.contains */ != false) continue;
            d.a("$", (Object)d.a("\u00fd", (long)147082103791028307L) /* => asm.patchify.loader.PatchTransformer.LOGGER */, (Object)a[0], (Object)d.a("$", (Object)d.a("$", (Object)object22, (long)45153845220366281L) /* => java.lang.reflect.Method.getDeclaringClass */, (long)182318511367922152L) /* => java.lang.Class.getName */, (Object)d.a("$", (Object)object22, (long)86441620207627822L) /* => java.lang.reflect.Method.getName */, (Object)d.a("\u00f9", (Object)object22, (long)71448342308180753L) /* => asm.patchify.loader.PatchTransformer.getHandlerTargetMethodName */, (Object)d.a("z", (Object)classNode, (long)189411955311871532L) /* => org.objectweb.asm.tree.ClassNode.name */, (long)183599206433230404L) /* => org.apache.logging.log4j.Logger.warn */;
        }
    }

    private static String getHandlerTargetMethodName(Method method) {
        Inject inject = (Inject)((Object)d.a("$", (Object)method, Inject.class, (long)191687928670238848L) /* => java.lang.reflect.Method.getAnnotation */);
        if (inject != null) {
            return d.a("$", (Object)inject, (long)46431646783018305L) /* => asm.patchify.annotation.Inject.method */;
        }
        Overwrite overwrite = (Overwrite)((Object)d.a("$", (Object)method, Overwrite.class, (long)191687928670238848L) /* => java.lang.reflect.Method.getAnnotation */);
        if (overwrite != null) {
            return d.a("$", (Object)overwrite, (long)98740296964858888L) /* => asm.patchify.annotation.Overwrite.method */;
        }
        Transform transform = (Transform)((Object)d.a("$", (Object)method, Transform.class, (long)191687928670238848L) /* => java.lang.reflect.Method.getAnnotation */);
        if (transform != null) {
            return d.a("$", (Object)transform, (long)48979957944078374L) /* => asm.patchify.annotation.Transform.method */;
        }
        WrapInvoke wrapInvoke = (WrapInvoke)((Object)d.a("$", (Object)method, WrapInvoke.class, (long)191687928670238848L) /* => java.lang.reflect.Method.getAnnotation */);
        if (wrapInvoke != null) {
            return d.a("$", (Object)wrapInvoke, (long)83569167357906704L) /* => asm.patchify.annotation.WrapInvoke.method */;
        }
        ModifyLocals modifyLocals = (ModifyLocals)((Object)d.a("$", (Object)method, ModifyLocals.class, (long)191687928670238848L) /* => java.lang.reflect.Method.getAnnotation */);
        if (modifyLocals != null) {
            return d.a("$", (Object)modifyLocals, (long)163147416289336882L) /* => asm.patchify.annotation.ModifyLocals.method */;
        }
        return "?";
    }

    private static void collectHandler(Class<?> clazz, String string, Method method, Map<MethodKey, List<Method>> map, List<Method> list) {
        block36: {
            CallSite callSite;
            CallSite callSite2;
            block35: {
                Object object;
                block34: {
                    block33: {
                        if (d.a("$", (Object)method, Inject.class, (long)171526665379798521L) /* => java.lang.reflect.Method.isAnnotationPresent */ != false || d.a("$", (Object)method, Overwrite.class, (long)171526665379798521L) /* => java.lang.reflect.Method.isAnnotationPresent */ != false) break block33;
                        if (d.a("$", (Object)method, Transform.class, (long)171526665379798521L) /* => java.lang.reflect.Method.isAnnotationPresent */ != false) break block33;
                        if (d.a("$", (Object)method, WrapInvoke.class, (long)171526665379798521L) /* => java.lang.reflect.Method.isAnnotationPresent */ != false) break block33;
                        if (d.a("$", (Object)method, ModifyLocals.class, (long)171526665379798521L) /* => java.lang.reflect.Method.isAnnotationPresent */ != false) break block33;
                        return;
                    }
                    if (d.a("\u00f9", (int)d.a("$", (Object)method, (long)178109398223760847L) /* => java.lang.reflect.Method.getModifiers */, (long)80710149616051228L) /* => java.lang.reflect.Modifier.isStatic */ == false) {
                        throw new IllegalArgumentException((String)((Object)d.a("$", (Object)d.a("$", (Object)d.a("$", (Object)d.a("$", (Object)new StringBuilder(), (Object)a[2], (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (Object)method, (long)121136869135998173L) /* => java.lang.StringBuilder.append */, (Object)a[15], (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (long)59411206276622891L) /* => java.lang.StringBuilder.toString */));
                    }
                    if (d.a("$", (Object)method, Inject.class, (long)171526665379798521L) /* => java.lang.reflect.Method.isAnnotationPresent */ != false) {
                        object = (Inject)((Object)d.a("$", (Object)method, Inject.class, (long)191687928670238848L) /* => java.lang.reflect.Method.getAnnotation */);
                        callSite2 = d.a("$", (Object)object, (long)46431646783018305L) /* => asm.patchify.annotation.Inject.method */;
                        callSite = d.a("$", (Object)object, (long)162573439639233065L) /* => asm.patchify.annotation.Inject.desc */;
                        d.a("\u00f9", clazz, (Object)method, (Object)object, (long)58876784663179647L) /* => asm.patchify.loader.PatchTransformer.validateInjectSignature */;
                    } else if (d.a("$", (Object)method, Overwrite.class, (long)171526665379798521L) /* => java.lang.reflect.Method.isAnnotationPresent */ != false) {
                        object = (Overwrite)((Object)d.a("$", (Object)method, Overwrite.class, (long)191687928670238848L) /* => java.lang.reflect.Method.getAnnotation */);
                        callSite2 = d.a("$", (Object)object, (long)98740296964858888L) /* => asm.patchify.annotation.Overwrite.method */;
                        callSite = d.a("$", (Object)object, (long)92390979190594925L) /* => asm.patchify.annotation.Overwrite.desc */;
                    } else {
                        if (d.a("$", (Object)method, Transform.class, (long)171526665379798521L) /* => java.lang.reflect.Method.isAnnotationPresent */ != false) {
                            object = (Transform)((Object)d.a("$", (Object)method, Transform.class, (long)191687928670238848L) /* => java.lang.reflect.Method.getAnnotation */);
                            callSite2 = d.a("$", (Object)object, (long)48979957944078374L) /* => asm.patchify.annotation.Transform.method */;
                            callSite = d.a("$", (Object)object, (long)131764987457028459L) /* => asm.patchify.annotation.Transform.desc */;
                            if (d.a("$", (Object)method, (long)117970817046729596L) /* => java.lang.reflect.Method.getParameterCount */ == true && d.a("$", (Object)method, (long)148834412752581508L) /* => java.lang.reflect.Method.getParameterTypes */[0] == MethodNode.class) break block34;
                            throw new IllegalArgumentException((String)((Object)d.a("$", (Object)d.a("$", (Object)d.a("$", (Object)d.a("$", (Object)new StringBuilder(), (Object)a[14], (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (Object)method, (long)121136869135998173L) /* => java.lang.StringBuilder.append */, (Object)a[36], (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (long)59411206276622891L) /* => java.lang.StringBuilder.toString */));
                        }
                        if (d.a("$", (Object)method, WrapInvoke.class, (long)171526665379798521L) /* => java.lang.reflect.Method.isAnnotationPresent */ != false) {
                            object = (WrapInvoke)((Object)d.a("$", (Object)method, WrapInvoke.class, (long)191687928670238848L) /* => java.lang.reflect.Method.getAnnotation */);
                            callSite2 = d.a("$", (Object)object, (long)83569167357906704L) /* => asm.patchify.annotation.WrapInvoke.method */;
                            callSite = d.a("$", (Object)object, (long)140765957232643803L) /* => asm.patchify.annotation.WrapInvoke.desc */;
                            CallSite callSite3 = d.a("$", (Object)method, (long)148834412752581508L) /* => java.lang.reflect.Method.getParameterTypes */;
                            if (((CallSite)callSite3).length != 0 && d.a("$", F.class, (Object)callSite3[((CallSite)callSite3).length - 1], (long)181628043272727078L) /* => java.lang.Class.isAssignableFrom */ != false) break block34;
                            throw new IllegalArgumentException((String)((Object)d.a("$", (Object)d.a("$", (Object)d.a("$", (Object)d.a("$", (Object)new StringBuilder(), (Object)a[62], (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (Object)method, (long)121136869135998173L) /* => java.lang.StringBuilder.append */, (Object)a[59], (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (long)59411206276622891L) /* => java.lang.StringBuilder.toString */));
                        }
                        object = (ModifyLocals)((Object)d.a("$", (Object)method, ModifyLocals.class, (long)191687928670238848L) /* => java.lang.reflect.Method.getAnnotation */);
                        callSite2 = d.a("$", (Object)object, (long)163147416289336882L) /* => asm.patchify.annotation.ModifyLocals.method */;
                        callSite = d.a("$", (Object)object, (long)174984268705863442L) /* => asm.patchify.annotation.ModifyLocals.desc */;
                        if (d.a("$", (Object)method, (long)117970817046729596L) /* => java.lang.reflect.Method.getParameterCount */ == true && d.a("$", Y.class, (Object)d.a("$", (Object)method, (long)148834412752581508L) /* => java.lang.reflect.Method.getParameterTypes */[0], (long)181628043272727078L) /* => java.lang.Class.isAssignableFrom */ != false) break block34;
                        throw new IllegalArgumentException((String)((Object)d.a("$", (Object)d.a("$", (Object)d.a("$", (Object)d.a("$", (Object)new StringBuilder(), (Object)a[20], (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (Object)method, (long)121136869135998173L) /* => java.lang.StringBuilder.append */, (Object)a[57], (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (long)59411206276622891L) /* => java.lang.StringBuilder.toString */));
                    }
                }
                object = callSite;
                callSite2 = d.a("\u00f9", string, (Object)callSite2, (Object)object, (long)39845484636133880L) /* => dev.hixo.B.U.s */;
                callSite = d.a("\u00f9", (Object)object, (long)78240782398741172L) /* => dev.hixo.B.U.L */;
                if (d.a("$", (Object)callSite, (long)139567490040770223L) /* => java.lang.String.isEmpty */ == false) break block35;
                d.a("$", list, (Object)method, (long)184435215000867819L) /* => java.util.List.add */;
                break block36;
            }
            d.a("$", (Object)((List)((Object)d.a("$", map, (Object)((Object)new MethodKey((String)((Object)callSite2), (String)((Object)callSite))), methodKey -> new ArrayList(), (long)123211639374652458L) /* => java.util.Map.computeIfAbsent */)), (Object)method, (long)184435215000867819L) /* => java.util.List.add */;
        }
    }

    private static void validateInjectSignature(Class<?> clazz, Method method, Inject inject) {
        CallSite callSite;
        block11: {
            if (d.a("$", (Object)method, (long)57599446355728817L) /* => java.lang.reflect.Method.getReturnType */ != d.a("\u00fd", (long)39928666577380171L) /* => java.lang.Void.TYPE */) {
                throw new IllegalArgumentException((String)((Object)d.a("$", (Object)d.a("$", (Object)d.a("$", (Object)d.a("$", (Object)new StringBuilder(), (Object)a[32], (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (Object)method, (long)121136869135998173L) /* => java.lang.StringBuilder.append */, (Object)a[70], (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (long)59411206276622891L) /* => java.lang.StringBuilder.toString */));
            }
            callSite = d.a("$", (Object)method, (long)104245413360572917L) /* => java.lang.reflect.Method.getParameters */;
            if (((CallSite)callSite).length != 0 && d.a("$", (Object)callSite[((CallSite)callSite).length - 1], (long)122745395305198140L) /* => java.lang.reflect.Parameter.getType */ == CallbackInfo.class) break block11;
            throw new IllegalArgumentException((String)((Object)d.a("$", (Object)d.a("$", (Object)d.a("$", (Object)d.a("$", (Object)new StringBuilder(), (Object)a[71], (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (Object)method, (long)121136869135998173L) /* => java.lang.StringBuilder.append */, (Object)a[60], (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (long)59411206276622891L) /* => java.lang.StringBuilder.toString */));
        }
        if (d.a("$", (Object)d.a("$", (Object)inject, (long)34246844416155594L) /* => asm.patchify.annotation.Inject.at */, (long)182756530152823619L) /* => asm.patchify.annotation.At.value */ == d.a("\u00fd", (long)143466286864367341L) /* => asm.patchify.annotation.At$Type.HEAD */) {
            for (CallSite callSite2 : callSite) {
                if (d.a("$", (Object)callSite2, Local.class, (long)99261933231455388L) /* => java.lang.reflect.Parameter.isAnnotationPresent */ == false) continue;
                throw new IllegalArgumentException((String)((Object)d.a("$", (Object)d.a("$", (Object)d.a("$", (Object)d.a("$", (Object)new StringBuilder(), (Object)a[71], (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (Object)method, (long)121136869135998173L) /* => java.lang.StringBuilder.append */, (Object)a[8], (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (long)59411206276622891L) /* => java.lang.StringBuilder.toString */));
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void applyInject(MethodNode methodNode, Method method) {
        CallSite callSite = d.a("$", (Object)((Inject)((Object)d.a("$", (Object)method, Inject.class, (long)191687928670238848L) /* => java.lang.reflect.Method.getAnnotation */)), (long)34246844416155594L) /* => asm.patchify.annotation.Inject.at */;
        switch (d.a("\u00fd", (long)100983900646579542L) /* => asm.patchify.loader.PatchTransformer$1.$SwitchMap$asm$patchify$annotation$At$Type */[d.a("$", (Object)d.a("$", (Object)callSite, (long)182756530152823619L) /* => asm.patchify.annotation.At.value */, (long)174825007931725336L) /* => asm.patchify.annotation.At$Type.ordinal */]) {
            case 1: {
                d.a("\u00f9", (Object)methodNode, (Object)method, (long)155287698003056109L) /* => asm.patchify.loader.PatchTransformer.injectHead */;
                return;
            }
            case 2: {
                d.a("\u00f9", (Object)methodNode, (Object)method, (long)132406696525610068L) /* => asm.patchify.loader.PatchTransformer.injectTail */;
                return;
            }
            case 3: 
            case 4: {
                CallSite callSite2 = d.a("$", (Object)callSite, (long)168062214800108809L) /* => asm.patchify.annotation.At.method */;
                CallSite callSite3 = d.a("$", (Object)callSite, (long)99099064076044260L) /* => asm.patchify.annotation.At.desc */;
                if (d.a("$", (Object)callSite2, (long)139567490040770223L) /* => java.lang.String.isEmpty */ != false) throw new IllegalArgumentException((String)((Object)d.a("$", (Object)d.a("$", (Object)d.a("$", (Object)d.a("$", (Object)new StringBuilder(), (Object)a[47], (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (Object)method, (long)121136869135998173L) /* => java.lang.StringBuilder.append */, (Object)a[43], (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (long)59411206276622891L) /* => java.lang.StringBuilder.toString */));
                if (d.a("$", (Object)callSite3, (long)139567490040770223L) /* => java.lang.String.isEmpty */ != false) {
                    throw new IllegalArgumentException((String)((Object)d.a("$", (Object)d.a("$", (Object)d.a("$", (Object)d.a("$", (Object)new StringBuilder(), (Object)a[47], (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (Object)method, (long)121136869135998173L) /* => java.lang.StringBuilder.append */, (Object)a[43], (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (long)59411206276622891L) /* => java.lang.StringBuilder.toString */));
                }
                d.a("\u00f9", (Object)methodNode, (Object)method, (Object)callSite2, (Object)callSite3, (d.a("$", (Object)callSite, (long)182756530152823619L) /* => asm.patchify.annotation.At.value */ == d.a("\u00fd", (long)55996988491282502L) /* => asm.patchify.annotation.At$Type.BEFORE_INVOKE */ ? 1 : 0) != 0, (long)169023948065906987L) /* => asm.patchify.loader.PatchTransformer.injectAroundInvoke */;
                return;
            }
        }
    }

    private static String headHandlerMismatch(MethodNode methodNode, Method method) {
        ArrayList arrayList = new ArrayList();
        if (d.a("\u00f9", (int)d.a("z", (Object)methodNode, (long)147880355014847291L) /* => org.objectweb.asm.tree.MethodNode.access */, (long)80710149616051228L) /* => java.lang.reflect.Modifier.isStatic */ == false) {
            d.a("$", arrayList, (Object)d.a("\u00f9", a[38], (long)92431680023572471L) /* => org.objectweb.asm.Type.getObjectType */, (long)184435215000867819L) /* => java.util.List.add */;
        }
        d.a("$", arrayList, (Object)d.a("\u00f9", (Object)d.a("\u00f9", (Object)d.a("z", (Object)methodNode, (long)156623205465659605L) /* => org.objectweb.asm.tree.MethodNode.desc */, (long)38799255078832338L) /* => org.objectweb.asm.Type.getArgumentTypes */, (long)56280318188458236L) /* => java.util.Arrays.asList */, (long)136382452326560341L) /* => java.util.List.addAll */;
        reference var3_3 = d.a("$", (Object)method, (long)117970817046729596L) /* => java.lang.reflect.Method.getParameterCount */ - true;
        if (d.a("$", arrayList, (long)180194190084079702L) /* => java.util.List.size */ != var3_3) {
            return d.a("$", (Object)d.a("$", (Object)d.a("$", (Object)d.a("$", (Object)d.a("$", (Object)d.a("$", (Object)new StringBuilder(), (Object)a[22], (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (int)var3_3, (long)32515713483113022L) /* => java.lang.StringBuilder.append */, (Object)a[73], (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (int)d.a("$", arrayList, (long)180194190084079702L) /* => java.util.List.size */, (long)32515713483113022L) /* => java.lang.StringBuilder.append */, (Object)a[52], (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (long)59411206276622891L) /* => java.lang.StringBuilder.toString */;
        }
        CallSite callSite = d.a("$", (Object)method, (long)148834412752581508L) /* => java.lang.reflect.Method.getParameterTypes */;
        for (int i2 = 0; i2 < d.a("$", arrayList, (long)180194190084079702L) /* => java.util.List.size */; ++i2) {
            CallSite callSite2;
            block21: {
                Type type;
                block22: {
                    boolean bl;
                    block20: {
                        block19: {
                            type = (Type)d.a("$", arrayList, (int)i2, (long)196824017790916210L) /* => java.util.List.get */;
                            callSite2 = callSite[i2];
                            if (d.a("$", (Object)type, (long)45675156776176898L) /* => org.objectweb.asm.Type.getSort */ == 10 || d.a("$", (Object)type, (long)45675156776176898L) /* => org.objectweb.asm.Type.getSort */ == 9) break block19;
                            bl = true;
                            break block20;
                        }
                        bl = false;
                    }
                    boolean bl2 = bl;
                    if (!bl2) break block21;
                    if (d.a("$", (Object)callSite2, (long)159360467757925675L) /* => java.lang.Class.isPrimitive */ == false) break block22;
                    if (d.a("$", (Object)d.a("$", (Object)callSite2, (long)182318511367922152L) /* => java.lang.Class.getName */, (Object)d.a("$", (Object)type, (long)185620117239262415L) /* => org.objectweb.asm.Type.getClassName */, (long)130616148886603248L) /* => java.lang.String.equals */ != false) continue;
                }
                return d.a("$", (Object)d.a("$", (Object)d.a("$", (Object)d.a("$", (Object)d.a("$", (Object)d.a("$", (Object)d.a("$", (Object)new StringBuilder(), (Object)a[26], (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (int)i2, (long)32515713483113022L) /* => java.lang.StringBuilder.append */, (Object)a[1], (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (Object)d.a("$", (Object)type, (long)185620117239262415L) /* => org.objectweb.asm.Type.getClassName */, (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (Object)a[34], (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (Object)d.a("$", (Object)callSite2, (long)182318511367922152L) /* => java.lang.Class.getName */, (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (long)59411206276622891L) /* => java.lang.StringBuilder.toString */;
            }
            if (d.a("$", (Object)callSite2, (long)159360467757925675L) /* => java.lang.Class.isPrimitive */ == false) continue;
            return d.a("$", (Object)d.a("$", (Object)d.a("$", (Object)d.a("$", (Object)d.a("$", (Object)new StringBuilder(), (Object)a[21], (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (int)i2, (long)32515713483113022L) /* => java.lang.StringBuilder.append */, (Object)a[12], (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (Object)d.a("$", (Object)callSite2, (long)182318511367922152L) /* => java.lang.Class.getName */, (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (long)59411206276622891L) /* => java.lang.StringBuilder.toString */;
        }
        return null;
    }

    private static void injectHead(MethodNode methodNode, Method method) {
        LabelNode labelNode;
        InsnList insnList;
        block10: {
            CallSite callSite;
            block9: {
                CallSite callSite2 = d.a("\u00f9", (Object)methodNode, (Object)method, (long)135182405397595931L) /* => asm.patchify.loader.PatchTransformer.headHandlerMismatch */;
                if (callSite2 != null) {
                    d.a("$", (Object)d.a("\u00fd", (long)147082103791028307L) /* => asm.patchify.loader.PatchTransformer.LOGGER */, (Object)a[49], (Object)d.a("$", (Object)d.a("$", (Object)method, (long)45153845220366281L) /* => java.lang.reflect.Method.getDeclaringClass */, (long)182318511367922152L) /* => java.lang.Class.getName */, (Object)d.a("$", (Object)method, (long)86441620207627822L) /* => java.lang.reflect.Method.getName */, (Object)d.a("z", (Object)methodNode, (long)156822074479295918L) /* => org.objectweb.asm.tree.MethodNode.name */, (Object)d.a("z", (Object)methodNode, (long)156623205465659605L) /* => org.objectweb.asm.tree.MethodNode.desc */, (Object)callSite2, (long)180540571106642769L) /* => org.apache.logging.log4j.Logger.warn */;
                    return;
                }
                callSite = d.a("\u00f9", (Object)d.a("z", (Object)methodNode, (long)156623205465659605L) /* => org.objectweb.asm.tree.MethodNode.desc */, (long)43298794954611867L) /* => org.objectweb.asm.Type.getReturnType */;
                CallSite callSite3 = d.a("\u00f9", (Object)d.a("$", (Object)method, (long)45153845220366281L) /* => java.lang.reflect.Method.getDeclaringClass */, (long)54385759495451154L) /* => org.objectweb.asm.Type.getInternalName */;
                CallSite callSite4 = d.a("$", (Object)method, (long)86441620207627822L) /* => java.lang.reflect.Method.getName */;
                CallSite callSite5 = d.a("\u00f9", (Object)method, (long)106651601817445952L) /* => org.objectweb.asm.Type.getMethodDescriptor */;
                insnList = new InsnList();
                labelNode = new LabelNode();
                CallSite callSite6 = d.a("z", (Object)methodNode, (long)157308534519819390L) /* => org.objectweb.asm.tree.MethodNode.maxLocals */;
                MethodNode methodNode2 = methodNode;
                d.a("\u00e7", (Object)methodNode2, (int)(d.a("z", (Object)methodNode2, (long)157308534519819390L) /* => org.objectweb.asm.tree.MethodNode.maxLocals */ + true), (long)157308534519819390L) /* => org.objectweb.asm.tree.MethodNode.maxLocals */;
                int n2 = 0;
                if (d.a("\u00f9", (int)d.a("z", (Object)methodNode, (long)147880355014847291L) /* => org.objectweb.asm.tree.MethodNode.access */, (long)80710149616051228L) /* => java.lang.reflect.Modifier.isStatic */ == false) {
                    d.a("$", (Object)insnList, (Object)new VarInsnNode(25, n2++), (long)106385981662087614L) /* => org.objectweb.asm.tree.InsnList.add */;
                }
                for (CallSite callSite7 : d.a("\u00f9", (Object)d.a("z", (Object)methodNode, (long)156623205465659605L) /* => org.objectweb.asm.tree.MethodNode.desc */, (long)38799255078832338L) /* => org.objectweb.asm.Type.getArgumentTypes */) {
                    d.a("$", (Object)insnList, (Object)new VarInsnNode((int)d.a("$", (Object)callSite7, (int)21, (long)148032419351921676L) /* => org.objectweb.asm.Type.getOpcode */, n2), (long)106385981662087614L) /* => org.objectweb.asm.tree.InsnList.add */;
                    n2 += d.a("$", (Object)callSite7, (long)162733810066403069L) /* => org.objectweb.asm.Type.getSize */;
                }
                d.a("$", (Object)insnList, (Object)new InsnNode(1), (long)106385981662087614L) /* => org.objectweb.asm.tree.InsnList.add */;
                d.a("$", (Object)insnList, (Object)new MethodInsnNode(184, (String)((Object)d.a("\u00fd", (long)34522938484611753L) /* => asm.patchify.loader.PatchTransformer.CALLBACK_INFO */), a[6], (String)((Object)d.a("$", (Object)d.a("$", (Object)d.a("$", (Object)new StringBuilder(), (Object)a[4], (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (Object)d.a("\u00fd", (long)55251248730087977L) /* => asm.patchify.loader.PatchTransformer.CALLBACK_INFO_DESC */, (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (long)59411206276622891L) /* => java.lang.StringBuilder.toString */), false), (long)106385981662087614L) /* => org.objectweb.asm.tree.InsnList.add */;
                d.a("$", (Object)insnList, (Object)new InsnNode(89), (long)106385981662087614L) /* => org.objectweb.asm.tree.InsnList.add */;
                d.a("$", (Object)insnList, (Object)new VarInsnNode(58, (int)callSite6), (long)106385981662087614L) /* => org.objectweb.asm.tree.InsnList.add */;
                d.a("$", (Object)insnList, (Object)new MethodInsnNode(184, (String)((Object)callSite3), (String)((Object)callSite4), (String)((Object)callSite5), false), (long)106385981662087614L) /* => org.objectweb.asm.tree.InsnList.add */;
                d.a("$", (Object)insnList, (Object)new VarInsnNode(25, (int)callSite6), (long)106385981662087614L) /* => org.objectweb.asm.tree.InsnList.add */;
                d.a("$", (Object)insnList, (Object)new InsnNode(89), (long)106385981662087614L) /* => org.objectweb.asm.tree.InsnList.add */;
                d.a("$", (Object)insnList, (Object)new FieldInsnNode(180, (String)((Object)d.a("\u00fd", (long)34522938484611753L) /* => asm.patchify.loader.PatchTransformer.CALLBACK_INFO */), a[69], "Z"), (long)106385981662087614L) /* => org.objectweb.asm.tree.InsnList.add */;
                d.a("$", (Object)insnList, (Object)new JumpInsnNode(153, labelNode), (long)106385981662087614L) /* => org.objectweb.asm.tree.InsnList.add */;
                if (callSite != d.a("\u00fd", (long)199681424353591212L) /* => org.objectweb.asm.Type.VOID_TYPE */) break block9;
                d.a("$", (Object)insnList, (Object)new InsnNode(87), (long)106385981662087614L) /* => org.objectweb.asm.tree.InsnList.add */;
                d.a("$", (Object)insnList, (Object)new InsnNode(177), (long)106385981662087614L) /* => org.objectweb.asm.tree.InsnList.add */;
                break block10;
            }
            String[] stringArray = a;
            d.a("$", (Object)insnList, (Object)new FieldInsnNode(180, (String)((Object)d.a("\u00fd", (long)34522938484611753L) /* => asm.patchify.loader.PatchTransformer.CALLBACK_INFO */), stringArray[42], stringArray[40]), (long)106385981662087614L) /* => org.objectweb.asm.tree.InsnList.add */;
            d.a("$", (Object)insnList, (Object)d.a("\u00f9", (Object)callSite, (long)87139568849222242L) /* => asm.patchify.loader.ASMHelpers.unboxFromObject */, (long)61126761562052366L) /* => org.objectweb.asm.tree.InsnList.add */;
            d.a("$", (Object)insnList, (Object)new InsnNode((int)d.a("$", (Object)callSite, (int)172, (long)148032419351921676L) /* => org.objectweb.asm.Type.getOpcode */), (long)106385981662087614L) /* => org.objectweb.asm.tree.InsnList.add */;
        }
        d.a("$", (Object)insnList, (Object)labelNode, (long)106385981662087614L) /* => org.objectweb.asm.tree.InsnList.add */;
        d.a("$", (Object)insnList, (Object)new InsnNode(87), (long)106385981662087614L) /* => org.objectweb.asm.tree.InsnList.add */;
        d.a("$", (Object)d.a("z", (Object)methodNode, (long)151867910694456621L) /* => org.objectweb.asm.tree.MethodNode.instructions */, (Object)insnList, (long)56798945267895829L) /* => org.objectweb.asm.tree.InsnList.insert */;
        d.a("$", (Object)d.a("\u00fd", (long)147082103791028307L) /* => asm.patchify.loader.PatchTransformer.LOGGER */, (Object)a[5], (Object)d.a("\u00f9", (Object)method, (long)186447200685418840L) /* => asm.patchify.loader.PatchTransformer.targetClassName */, (Object)d.a("z", (Object)methodNode, (long)156822074479295918L) /* => org.objectweb.asm.tree.MethodNode.name */, (Object)d.a("z", (Object)methodNode, (long)156623205465659605L) /* => org.objectweb.asm.tree.MethodNode.desc */, (Object)d.a("$", (Object)d.a("$", (Object)method, (long)45153845220366281L) /* => java.lang.reflect.Method.getDeclaringClass */, (long)182318511367922152L) /* => java.lang.Class.getName */, (Object)d.a("$", (Object)method, (long)86441620207627822L) /* => java.lang.reflect.Method.getName */, (long)106715614223153672L) /* => org.apache.logging.log4j.Logger.info */;
    }

    private static void injectTail(MethodNode methodNode, Method method) {
        CallSite callSite = d.a("\u00f9", (Object)d.a("z", (Object)methodNode, (long)156623205465659605L) /* => org.objectweb.asm.tree.MethodNode.desc */, (long)43298794954611867L) /* => org.objectweb.asm.Type.getReturnType */;
        CallSite callSite2 = d.a("$", (Object)callSite, (int)172, (long)148032419351921676L) /* => org.objectweb.asm.Type.getOpcode */;
        CallSite callSite3 = d.a("$", (Object)((Inject)((Object)d.a("$", (Object)method, Inject.class, (long)191687928670238848L) /* => java.lang.reflect.Method.getAnnotation */)), (long)136450697794401287L) /* => asm.patchify.annotation.Inject.slice */;
        CallSite callSite4 = d.a("\u00f9", (Object)d.a("z", (Object)methodNode, (long)151867910694456621L) /* => org.objectweb.asm.tree.MethodNode.instructions */, (Object)callSite3, arg_0 -> PatchTransformer.lambda$injectTail$1((int)callSite2, arg_0), (long)69945554779653448L) /* => asm.patchify.loader.PatchTransformer.collectInjectionPoints */;
        if (d.a("$", (Object)callSite4, (long)184224858935663280L) /* => java.util.List.isEmpty */ != false) {
            d.a("$", (Object)d.a("\u00fd", (long)147082103791028307L) /* => asm.patchify.loader.PatchTransformer.LOGGER */, (Object)a[7], (Object)d.a("$", (Object)d.a("$", (Object)method, (long)45153845220366281L) /* => java.lang.reflect.Method.getDeclaringClass */, (long)182318511367922152L) /* => java.lang.Class.getName */, (Object)d.a("$", (Object)method, (long)86441620207627822L) /* => java.lang.reflect.Method.getName */, (Object)d.a("\u00f9", (Object)method, (long)106651601817445952L) /* => org.objectweb.asm.Type.getMethodDescriptor */, (Object)d.a("z", (Object)methodNode, (long)156822074479295918L) /* => org.objectweb.asm.tree.MethodNode.name */, (Object)d.a("z", (Object)methodNode, (long)156623205465659605L) /* => org.objectweb.asm.tree.MethodNode.desc */, (long)180540571106642769L) /* => org.apache.logging.log4j.Logger.warn */;
            return;
        }
        CallSite callSite5 = d.a("\u00f9", (Object)d.a("$", (Object)method, (long)45153845220366281L) /* => java.lang.reflect.Method.getDeclaringClass */, (long)54385759495451154L) /* => org.objectweb.asm.Type.getInternalName */;
        CallSite callSite6 = d.a("$", (Object)method, (long)86441620207627822L) /* => java.lang.reflect.Method.getName */;
        CallSite callSite7 = d.a("\u00f9", (Object)method, (long)106651601817445952L) /* => org.objectweb.asm.Type.getMethodDescriptor */;
        CallSite callSite8 = d.a("$", (Object)callSite4, (long)113221006393852506L) /* => java.util.List.iterator */;
        while (d.a("$", (Object)callSite8, (long)175361412755674352L) /* => java.util.Iterator.hasNext */ != false) {
            InsnList insnList;
            AbstractInsnNode abstractInsnNode;
            block19: {
                block18: {
                    CallSite callSite9;
                    block17: {
                        block16: {
                            abstractInsnNode = (AbstractInsnNode)d.a("$", (Object)callSite8, (long)64633749944946827L) /* => java.util.Iterator.next */;
                            insnList = new InsnList();
                            callSite9 = d.a("z", (Object)methodNode, (long)157308534519819390L) /* => org.objectweb.asm.tree.MethodNode.maxLocals */;
                            MethodNode methodNode2 = methodNode;
                            d.a("\u00e7", (Object)methodNode2, (int)(d.a("z", (Object)methodNode2, (long)157308534519819390L) /* => org.objectweb.asm.tree.MethodNode.maxLocals */ + true), (long)157308534519819390L) /* => org.objectweb.asm.tree.MethodNode.maxLocals */;
                            if (callSite != d.a("\u00fd", (long)199681424353591212L) /* => org.objectweb.asm.Type.VOID_TYPE */) break block16;
                            d.a("$", (Object)insnList, (Object)new InsnNode(1), (long)106385981662087614L) /* => org.objectweb.asm.tree.InsnList.add */;
                            break block17;
                        }
                        d.a("$", (Object)insnList, (Object)d.a("\u00f9", (Object)callSite, (long)147373822986669873L) /* => asm.patchify.loader.ASMHelpers.boxToObject */, (long)61126761562052366L) /* => org.objectweb.asm.tree.InsnList.add */;
                    }
                    String[] stringArray = a;
                    d.a("$", (Object)insnList, (Object)new MethodInsnNode(184, (String)((Object)d.a("\u00fd", (long)34522938484611753L) /* => asm.patchify.loader.PatchTransformer.CALLBACK_INFO */), stringArray[6], (String)((Object)d.a("$", (Object)d.a("$", (Object)d.a("$", (Object)new StringBuilder(), (Object)stringArray[66], (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (Object)d.a("\u00fd", (long)55251248730087977L) /* => asm.patchify.loader.PatchTransformer.CALLBACK_INFO_DESC */, (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (long)59411206276622891L) /* => java.lang.StringBuilder.toString */), false), (long)106385981662087614L) /* => org.objectweb.asm.tree.InsnList.add */;
                    int n2 = 0;
                    if (d.a("\u00f9", (int)d.a("z", (Object)methodNode, (long)147880355014847291L) /* => org.objectweb.asm.tree.MethodNode.access */, (long)80710149616051228L) /* => java.lang.reflect.Modifier.isStatic */ == false) {
                        d.a("$", (Object)insnList, (Object)new VarInsnNode(25, n2++), (long)106385981662087614L) /* => org.objectweb.asm.tree.InsnList.add */;
                        d.a("$", (Object)insnList, (Object)new InsnNode(95), (long)106385981662087614L) /* => org.objectweb.asm.tree.InsnList.add */;
                    }
                    for (CallSite callSite10 : d.a("\u00f9", (Object)d.a("z", (Object)methodNode, (long)156623205465659605L) /* => org.objectweb.asm.tree.MethodNode.desc */, (long)38799255078832338L) /* => org.objectweb.asm.Type.getArgumentTypes */) {
                        d.a("$", (Object)insnList, (Object)new VarInsnNode((int)d.a("$", (Object)callSite10, (int)21, (long)148032419351921676L) /* => org.objectweb.asm.Type.getOpcode */, n2), (long)106385981662087614L) /* => org.objectweb.asm.tree.InsnList.add */;
                        n2 += d.a("$", (Object)callSite10, (long)162733810066403069L) /* => org.objectweb.asm.Type.getSize */;
                        d.a("\u00f9", (Object)callSite10, (Object)insnList, (long)173716075424809593L) /* => asm.patchify.loader.PatchTransformer.swapForCallback */;
                    }
                    for (CallSite callSite10 : d.a("$", (Object)method, (long)104245413360572917L) /* => java.lang.reflect.Method.getParameters */) {
                        Local local = (Local)((Object)d.a("$", (Object)callSite10, Local.class, (long)113950198129706736L) /* => java.lang.reflect.Parameter.getAnnotation */);
                        if (local == null) {
                            continue;
                        }
                        CallSite callSite11 = d.a("\u00f9", (Object)d.a("$", (Object)callSite10, (long)122745395305198140L) /* => java.lang.reflect.Parameter.getType */, (long)135619412375939158L) /* => org.objectweb.asm.Type.getType */;
                        d.a("$", (Object)insnList, (Object)new VarInsnNode((int)d.a("$", (Object)callSite11, (int)21, (long)148032419351921676L) /* => org.objectweb.asm.Type.getOpcode */, (int)d.a("$", (Object)local, (long)126680457509114881L) /* => asm.patchify.annotation.Local.value */), (long)106385981662087614L) /* => org.objectweb.asm.tree.InsnList.add */;
                        d.a("\u00f9", (Object)callSite11, (Object)insnList, (long)173716075424809593L) /* => asm.patchify.loader.PatchTransformer.swapForCallback */;
                    }
                    d.a("$", (Object)insnList, (Object)new InsnNode(89), (long)106385981662087614L) /* => org.objectweb.asm.tree.InsnList.add */;
                    d.a("$", (Object)insnList, (Object)new VarInsnNode(58, (int)callSite9), (long)106385981662087614L) /* => org.objectweb.asm.tree.InsnList.add */;
                    d.a("$", (Object)insnList, (Object)new MethodInsnNode(184, (String)((Object)callSite5), (String)((Object)callSite6), (String)((Object)callSite7), false), (long)106385981662087614L) /* => org.objectweb.asm.tree.InsnList.add */;
                    d.a("$", (Object)insnList, (Object)new VarInsnNode(25, (int)callSite9), (long)106385981662087614L) /* => org.objectweb.asm.tree.InsnList.add */;
                    d.a("$", (Object)insnList, (Object)new FieldInsnNode(180, (String)((Object)d.a("\u00fd", (long)34522938484611753L) /* => asm.patchify.loader.PatchTransformer.CALLBACK_INFO */), a[74], a[67]), (long)106385981662087614L) /* => org.objectweb.asm.tree.InsnList.add */;
                    if (callSite != d.a("\u00fd", (long)199681424353591212L) /* => org.objectweb.asm.Type.VOID_TYPE */) break block18;
                    d.a("$", (Object)insnList, (Object)new InsnNode(87), (long)106385981662087614L) /* => org.objectweb.asm.tree.InsnList.add */;
                    break block19;
                }
                d.a("$", (Object)insnList, (Object)d.a("\u00f9", (Object)callSite, (long)87139568849222242L) /* => asm.patchify.loader.ASMHelpers.unboxFromObject */, (long)61126761562052366L) /* => org.objectweb.asm.tree.InsnList.add */;
            }
            d.a("$", (Object)d.a("z", (Object)methodNode, (long)151867910694456621L) /* => org.objectweb.asm.tree.MethodNode.instructions */, (Object)abstractInsnNode, (Object)insnList, (long)193757545116677425L) /* => org.objectweb.asm.tree.InsnList.insertBefore */;
        }
        d.a("$", (Object)d.a("\u00fd", (long)147082103791028307L) /* => asm.patchify.loader.PatchTransformer.LOGGER */, (Object)a[37], (Object)d.a("\u00f9", (Object)method, (long)186447200685418840L) /* => asm.patchify.loader.PatchTransformer.targetClassName */, (Object)d.a("z", (Object)methodNode, (long)156822074479295918L) /* => org.objectweb.asm.tree.MethodNode.name */, (Object)d.a("z", (Object)methodNode, (long)156623205465659605L) /* => org.objectweb.asm.tree.MethodNode.desc */, (Object)d.a("$", (Object)d.a("$", (Object)method, (long)45153845220366281L) /* => java.lang.reflect.Method.getDeclaringClass */, (long)182318511367922152L) /* => java.lang.Class.getName */, (Object)d.a("$", (Object)method, (long)86441620207627822L) /* => java.lang.reflect.Method.getName */, (Object)d.a("\u00f9", (int)d.a("$", (Object)callSite4, (long)180194190084079702L) /* => java.util.List.size */, (long)67104637941965968L) /* => java.lang.Integer.valueOf */, (long)146391184204678478L) /* => org.apache.logging.log4j.Logger.info */;
    }

    private static void injectAroundInvoke(MethodNode methodNode, Method method, String string, String string2, boolean bl) {
        CallSite callSite;
        CallSite callSite2;
        CallSite callSite3;
        CallSite callSite4;
        block23: {
            String string3;
            String string4;
            CallSite callSite5;
            block25: {
                block24: {
                    callSite4 = d.a("\u00f9", (Object)d.a("z", (Object)methodNode, (long)156623205465659605L) /* => org.objectweb.asm.tree.MethodNode.desc */, (long)43298794954611867L) /* => org.objectweb.asm.Type.getReturnType */;
                    CallSite callSite6 = d.a("\u00f9", string, (long)149783109185568965L) /* => asm.patchify.loader.ASMHelpers.splitOwnerName */;
                    callSite3 = d.a("\u00f9", (Object)callSite6[0], (long)149674385795215028L) /* => dev.hixo.B.U.l */;
                    callSite2 = d.a("\u00f9", (Object)callSite6[0], (Object)callSite6[1], (Object)string2, (long)165774466883552610L) /* => dev.hixo.B.U.y */;
                    CallSite callSite7 = d.a("\u00f9", string2, (long)78240782398741172L) /* => dev.hixo.B.U.L */;
                    CallSite callSite8 = d.a("$", (Object)((Inject)((Object)d.a("$", (Object)method, Inject.class, (long)191687928670238848L) /* => java.lang.reflect.Method.getAnnotation */)), (long)136450697794401287L) /* => asm.patchify.annotation.Inject.slice */;
                    callSite = d.a("\u00f9", (Object)d.a("z", (Object)methodNode, (long)151867910694456621L) /* => org.objectweb.asm.tree.MethodNode.instructions */, (Object)callSite8, arg_0 -> PatchTransformer.lambda$injectAroundInvoke$2((String)((Object)callSite3), (String)((Object)callSite2), (String)((Object)callSite7), arg_0), (long)69945554779653448L) /* => asm.patchify.loader.PatchTransformer.collectInjectionPoints */;
                    if (d.a("$", (Object)callSite, (long)184224858935663280L) /* => java.util.List.isEmpty */ == false) break block23;
                    callSite5 = d.a("\u00fd", (long)147082103791028307L) /* => asm.patchify.loader.PatchTransformer.LOGGER */;
                    string4 = a[72];
                    if (!bl) break block24;
                    string3 = a[23];
                    break block25;
                }
                String[] stringArray = a;
                string3 = stringArray[68];
            }
            d.a("$", (Object)callSite5, (Object)string4, (Object)string3, (Object)d.a("$", (Object)d.a("$", (Object)method, (long)45153845220366281L) /* => java.lang.reflect.Method.getDeclaringClass */, (long)182318511367922152L) /* => java.lang.Class.getName */, (Object)d.a("$", (Object)method, (long)86441620207627822L) /* => java.lang.reflect.Method.getName */, (Object)d.a("\u00f9", (Object)method, (long)106651601817445952L) /* => org.objectweb.asm.Type.getMethodDescriptor */, (Object)callSite3, (Object)callSite2, (Object)string2, (long)32105346431085725L) /* => org.apache.logging.log4j.Logger.warn */;
            return;
        }
        CallSite callSite9 = d.a("\u00f9", (Object)methodNode, (Object)((AbstractInsnNode)d.a("$", (Object)callSite, (int)0, (long)196824017790916210L) /* => java.util.List.get */), (long)184076429941708831L) /* => asm.patchify.loader.PatchTransformer.collectInitializedLocalsBefore */;
        CallSite callSite10 = d.a("z", (Object)methodNode, (long)157308534519819390L) /* => org.objectweb.asm.tree.MethodNode.maxLocals */;
        MethodNode methodNode2 = methodNode;
        d.a("\u00e7", (Object)methodNode2, (int)(d.a("z", (Object)methodNode2, (long)157308534519819390L) /* => org.objectweb.asm.tree.MethodNode.maxLocals */ + true), (long)157308534519819390L) /* => org.objectweb.asm.tree.MethodNode.maxLocals */;
        CallSite callSite11 = d.a("\u00f9", (Object)d.a("$", (Object)method, (long)45153845220366281L) /* => java.lang.reflect.Method.getDeclaringClass */, (long)54385759495451154L) /* => org.objectweb.asm.Type.getInternalName */;
        CallSite callSite12 = d.a("$", (Object)method, (long)86441620207627822L) /* => java.lang.reflect.Method.getName */;
        CallSite callSite13 = d.a("\u00f9", (Object)method, (long)106651601817445952L) /* => org.objectweb.asm.Type.getMethodDescriptor */;
        CallSite callSite14 = d.a("$", (Object)callSite, (long)113221006393852506L) /* => java.util.List.iterator */;
        while (d.a("$", (Object)callSite14, (long)175361412755674352L) /* => java.util.Iterator.hasNext */ != false) {
            LabelNode labelNode;
            InsnList insnList;
            AbstractInsnNode abstractInsnNode;
            block27: {
                block26: {
                    abstractInsnNode = (AbstractInsnNode)d.a("$", (Object)callSite14, (long)64633749944946827L) /* => java.util.Iterator.next */;
                    insnList = new InsnList();
                    labelNode = new LabelNode();
                    int n2 = 0;
                    if (d.a("\u00f9", (int)d.a("z", (Object)methodNode, (long)147880355014847291L) /* => org.objectweb.asm.tree.MethodNode.access */, (long)80710149616051228L) /* => java.lang.reflect.Modifier.isStatic */ == false) {
                        d.a("$", (Object)insnList, (Object)new VarInsnNode(25, n2++), (long)106385981662087614L) /* => org.objectweb.asm.tree.InsnList.add */;
                    }
                    for (CallSite callSite15 : d.a("\u00f9", (Object)d.a("z", (Object)methodNode, (long)156623205465659605L) /* => org.objectweb.asm.tree.MethodNode.desc */, (long)38799255078832338L) /* => org.objectweb.asm.Type.getArgumentTypes */) {
                        d.a("$", (Object)insnList, (Object)new VarInsnNode((int)d.a("$", (Object)callSite15, (int)21, (long)148032419351921676L) /* => org.objectweb.asm.Type.getOpcode */, n2), (long)106385981662087614L) /* => org.objectweb.asm.tree.InsnList.add */;
                        n2 += d.a("$", (Object)callSite15, (long)162733810066403069L) /* => org.objectweb.asm.Type.getSize */;
                    }
                    for (CallSite callSite15 : d.a("$", (Object)method, (long)104245413360572917L) /* => java.lang.reflect.Method.getParameters */) {
                        Local local = (Local)((Object)d.a("$", (Object)callSite15, Local.class, (long)113950198129706736L) /* => java.lang.reflect.Parameter.getAnnotation */);
                        if (local == null) {
                            continue;
                        }
                        if (d.a("$", (Object)callSite9, (Object)d.a("\u00f9", (int)d.a("$", (Object)local, (long)126680457509114881L) /* => asm.patchify.annotation.Local.value */, (long)67104637941965968L) /* => java.lang.Integer.valueOf */, (long)117209702718349922L) /* => java.util.Set.contains */ == false) {
                            throw new IllegalArgumentException((String)((Object)d.a("$", (Object)d.a("$", (Object)d.a("$", (Object)d.a("$", (Object)d.a("$", (Object)d.a("$", (Object)d.a("$", (Object)new StringBuilder(), (Object)a[61], (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (int)d.a("$", (Object)local, (long)126680457509114881L) /* => asm.patchify.annotation.Local.value */, (long)32515713483113022L) /* => java.lang.StringBuilder.append */, (Object)a[33], (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (Object)d.a("$", (Object)d.a("$", (Object)method, (long)45153845220366281L) /* => java.lang.reflect.Method.getDeclaringClass */, (long)182318511367922152L) /* => java.lang.Class.getName */, (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (Object)".", (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (Object)d.a("$", (Object)method, (long)86441620207627822L) /* => java.lang.reflect.Method.getName */, (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (long)59411206276622891L) /* => java.lang.StringBuilder.toString */));
                        }
                        CallSite callSite16 = d.a("\u00f9", (Object)d.a("$", (Object)callSite15, (long)122745395305198140L) /* => java.lang.reflect.Parameter.getType */, (long)135619412375939158L) /* => org.objectweb.asm.Type.getType */;
                        d.a("$", (Object)insnList, (Object)new VarInsnNode((int)d.a("$", (Object)callSite16, (int)21, (long)148032419351921676L) /* => org.objectweb.asm.Type.getOpcode */, (int)d.a("$", (Object)local, (long)126680457509114881L) /* => asm.patchify.annotation.Local.value */), (long)106385981662087614L) /* => org.objectweb.asm.tree.InsnList.add */;
                    }
                    d.a("$", (Object)insnList, (Object)new InsnNode(1), (long)106385981662087614L) /* => org.objectweb.asm.tree.InsnList.add */;
                    d.a("$", (Object)insnList, (Object)new MethodInsnNode(184, (String)((Object)d.a("\u00fd", (long)34522938484611753L) /* => asm.patchify.loader.PatchTransformer.CALLBACK_INFO */), a[6], (String)((Object)d.a("$", (Object)d.a("$", (Object)d.a("$", (Object)new StringBuilder(), (Object)a[4], (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (Object)d.a("\u00fd", (long)55251248730087977L) /* => asm.patchify.loader.PatchTransformer.CALLBACK_INFO_DESC */, (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (long)59411206276622891L) /* => java.lang.StringBuilder.toString */), false), (long)106385981662087614L) /* => org.objectweb.asm.tree.InsnList.add */;
                    d.a("$", (Object)insnList, (Object)new InsnNode(89), (long)106385981662087614L) /* => org.objectweb.asm.tree.InsnList.add */;
                    d.a("$", (Object)insnList, (Object)new VarInsnNode(58, (int)callSite10), (long)106385981662087614L) /* => org.objectweb.asm.tree.InsnList.add */;
                    d.a("$", (Object)insnList, (Object)new MethodInsnNode(184, (String)((Object)callSite11), (String)((Object)callSite12), (String)((Object)callSite13), false), (long)106385981662087614L) /* => org.objectweb.asm.tree.InsnList.add */;
                    d.a("$", (Object)insnList, (Object)new VarInsnNode(25, (int)callSite10), (long)106385981662087614L) /* => org.objectweb.asm.tree.InsnList.add */;
                    d.a("$", (Object)insnList, (Object)new InsnNode(89), (long)106385981662087614L) /* => org.objectweb.asm.tree.InsnList.add */;
                    d.a("$", (Object)insnList, (Object)new FieldInsnNode(180, (String)((Object)d.a("\u00fd", (long)34522938484611753L) /* => asm.patchify.loader.PatchTransformer.CALLBACK_INFO */), a[54], "Z"), (long)106385981662087614L) /* => org.objectweb.asm.tree.InsnList.add */;
                    d.a("$", (Object)insnList, (Object)new JumpInsnNode(153, labelNode), (long)106385981662087614L) /* => org.objectweb.asm.tree.InsnList.add */;
                    d.a("$", (Object)insnList, (Object)new FieldInsnNode(180, (String)((Object)d.a("\u00fd", (long)34522938484611753L) /* => asm.patchify.loader.PatchTransformer.CALLBACK_INFO */), a[42], a[40]), (long)106385981662087614L) /* => org.objectweb.asm.tree.InsnList.add */;
                    if (callSite4 != d.a("\u00fd", (long)199681424353591212L) /* => org.objectweb.asm.Type.VOID_TYPE */) break block26;
                    d.a("$", (Object)insnList, (Object)new InsnNode(87), (long)106385981662087614L) /* => org.objectweb.asm.tree.InsnList.add */;
                    d.a("$", (Object)insnList, (Object)new InsnNode(177), (long)106385981662087614L) /* => org.objectweb.asm.tree.InsnList.add */;
                    break block27;
                }
                d.a("$", (Object)insnList, (Object)d.a("\u00f9", (Object)callSite4, (long)87139568849222242L) /* => asm.patchify.loader.ASMHelpers.unboxFromObject */, (long)61126761562052366L) /* => org.objectweb.asm.tree.InsnList.add */;
                d.a("$", (Object)insnList, (Object)new InsnNode((int)d.a("$", (Object)callSite4, (int)172, (long)148032419351921676L) /* => org.objectweb.asm.Type.getOpcode */), (long)106385981662087614L) /* => org.objectweb.asm.tree.InsnList.add */;
            }
            d.a("$", (Object)insnList, (Object)labelNode, (long)106385981662087614L) /* => org.objectweb.asm.tree.InsnList.add */;
            d.a("$", (Object)insnList, (Object)new InsnNode(87), (long)106385981662087614L) /* => org.objectweb.asm.tree.InsnList.add */;
            if (bl) {
                d.a("$", (Object)d.a("z", (Object)methodNode, (long)151867910694456621L) /* => org.objectweb.asm.tree.MethodNode.instructions */, (Object)abstractInsnNode, (Object)insnList, (long)193757545116677425L) /* => org.objectweb.asm.tree.InsnList.insertBefore */;
                continue;
            }
            d.a("$", (Object)d.a("z", (Object)methodNode, (long)151867910694456621L) /* => org.objectweb.asm.tree.MethodNode.instructions */, (Object)abstractInsnNode, (Object)insnList, (long)116036096098301998L) /* => org.objectweb.asm.tree.InsnList.insert */;
        }
        CallSite callSite17 = d.a("\u00fd", (long)147082103791028307L) /* => asm.patchify.loader.PatchTransformer.LOGGER */;
        String string5 = a[24];
        String string6 = bl ? a[50] : a[55];
        d.a("$", (Object)callSite17, (Object)string5, (Object)string6, (Object)d.a("\u00f9", (Object)method, (long)186447200685418840L) /* => asm.patchify.loader.PatchTransformer.targetClassName */, (Object)d.a("z", (Object)methodNode, (long)156822074479295918L) /* => org.objectweb.asm.tree.MethodNode.name */, (Object)d.a("z", (Object)methodNode, (long)156623205465659605L) /* => org.objectweb.asm.tree.MethodNode.desc */, (Object)d.a("$", (Object)d.a("$", (Object)method, (long)45153845220366281L) /* => java.lang.reflect.Method.getDeclaringClass */, (long)182318511367922152L) /* => java.lang.Class.getName */, (Object)d.a("$", (Object)method, (long)86441620207627822L) /* => java.lang.reflect.Method.getName */, (Object)callSite3, (Object)callSite2, (Object)string2, (Object)d.a("\u00f9", (int)d.a("$", (Object)callSite, (long)180194190084079702L) /* => java.util.List.size */, (long)67104637941965968L) /* => java.lang.Integer.valueOf */, (long)52227001154594505L) /* => org.apache.logging.log4j.Logger.info */;
    }

    private static void overwriteMethod(MethodNode methodNode, Method method) {
        InsnList insnList;
        block12: {
            CallSite callSite;
            block11: {
                int n2 = ((CallSite)d.a("\u00f9", (Object)d.a("z", (Object)methodNode, (long)156623205465659605L) /* => org.objectweb.asm.tree.MethodNode.desc */, (long)38799255078832338L) /* => org.objectweb.asm.Type.getArgumentTypes */).length;
                int n3 = d.a("\u00f9", (int)d.a("z", (Object)methodNode, (long)147880355014847291L) /* => org.objectweb.asm.tree.MethodNode.access */, (long)80710149616051228L) /* => java.lang.reflect.Modifier.isStatic */ != false ? 0 : 1;
                int n4 = n2 + n3;
                if (d.a("$", (Object)method, (long)117970817046729596L) /* => java.lang.reflect.Method.getParameterCount */ != n4) {
                    throw new IllegalArgumentException((String)((Object)d.a("$", (Object)d.a("$", (Object)d.a("$", (Object)d.a("$", (Object)d.a("$", (Object)d.a("$", (Object)d.a("$", (Object)d.a("$", (Object)new StringBuilder(), (Object)a[31], (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (Object)method, (long)121136869135998173L) /* => java.lang.StringBuilder.append */, (Object)a[10], (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (int)d.a("$", (Object)method, (long)117970817046729596L) /* => java.lang.reflect.Method.getParameterCount */, (long)32515713483113022L) /* => java.lang.StringBuilder.append */, (Object)a[27], (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (int)n4, (long)32515713483113022L) /* => java.lang.StringBuilder.append */, (Object)a[9], (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (long)59411206276622891L) /* => java.lang.StringBuilder.toString */));
                }
                insnList = new InsnList();
                int n5 = 0;
                if (d.a("\u00f9", (int)d.a("z", (Object)methodNode, (long)147880355014847291L) /* => org.objectweb.asm.tree.MethodNode.access */, (long)80710149616051228L) /* => java.lang.reflect.Modifier.isStatic */ == false) {
                    d.a("$", (Object)insnList, (Object)new VarInsnNode(25, n5++), (long)106385981662087614L) /* => org.objectweb.asm.tree.InsnList.add */;
                }
                for (CallSite callSite2 : d.a("\u00f9", (Object)d.a("z", (Object)methodNode, (long)156623205465659605L) /* => org.objectweb.asm.tree.MethodNode.desc */, (long)38799255078832338L) /* => org.objectweb.asm.Type.getArgumentTypes */) {
                    d.a("$", (Object)insnList, (Object)new VarInsnNode((int)d.a("$", (Object)callSite2, (int)21, (long)148032419351921676L) /* => org.objectweb.asm.Type.getOpcode */, n5++), (long)106385981662087614L) /* => org.objectweb.asm.tree.InsnList.add */;
                }
                d.a("$", (Object)insnList, (Object)new MethodInsnNode(184, (String)((Object)d.a("\u00f9", (Object)d.a("$", (Object)method, (long)45153845220366281L) /* => java.lang.reflect.Method.getDeclaringClass */, (long)54385759495451154L) /* => org.objectweb.asm.Type.getInternalName */), (String)((Object)d.a("$", (Object)method, (long)86441620207627822L) /* => java.lang.reflect.Method.getName */), (String)((Object)d.a("\u00f9", (Object)method, (long)106651601817445952L) /* => org.objectweb.asm.Type.getMethodDescriptor */), false), (long)106385981662087614L) /* => org.objectweb.asm.tree.InsnList.add */;
                callSite = d.a("\u00f9", (Object)d.a("z", (Object)methodNode, (long)156623205465659605L) /* => org.objectweb.asm.tree.MethodNode.desc */, (long)43298794954611867L) /* => org.objectweb.asm.Type.getReturnType */;
                if (callSite != d.a("\u00fd", (long)199681424353591212L) /* => org.objectweb.asm.Type.VOID_TYPE */) break block11;
                d.a("$", (Object)insnList, (Object)new InsnNode(177), (long)106385981662087614L) /* => org.objectweb.asm.tree.InsnList.add */;
                break block12;
            }
            d.a("$", (Object)insnList, (Object)new InsnNode((int)d.a("$", (Object)callSite, (int)172, (long)148032419351921676L) /* => org.objectweb.asm.Type.getOpcode */), (long)106385981662087614L) /* => org.objectweb.asm.tree.InsnList.add */;
        }
        d.a("$", (Object)d.a("z", (Object)methodNode, (long)151867910694456621L) /* => org.objectweb.asm.tree.MethodNode.instructions */, (Object)insnList, (long)56798945267895829L) /* => org.objectweb.asm.tree.InsnList.insert */;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void wrapInvoke(MethodNode methodNode, Method method) {
        block34: {
            CallSite callSite;
            CallSite callSite2;
            CallSite callSite3;
            CallSite callSite4;
            CallSite callSite5;
            CallSite callSite6;
            CallSite callSite7;
            CallSite callSite8;
            CallSite callSite9;
            boolean bl;
            block39: {
                CallSite callSite10;
                block41: {
                    block40: {
                        Object object;
                        block37: {
                            block38: {
                                WrapInvoke wrapInvoke = (WrapInvoke)((Object)d.a("$", (Object)method, WrapInvoke.class, (long)191687928670238848L) /* => java.lang.reflect.Method.getAnnotation */);
                                CallSite callSite11 = d.a("$", (Object)wrapInvoke, (long)121929442956778791L) /* => asm.patchify.annotation.WrapInvoke.target */;
                                bl = O;
                                callSite9 = d.a("$", (Object)wrapInvoke, (long)49983504049816071L) /* => asm.patchify.annotation.WrapInvoke.targetDesc */;
                                CallSite callSite12 = d.a("\u00f9", (Object)callSite11, (long)149783109185568965L) /* => asm.patchify.loader.ASMHelpers.splitOwnerName */;
                                callSite8 = d.a("\u00f9", (Object)callSite12[0], (long)149674385795215028L) /* => dev.hixo.B.U.l */;
                                callSite7 = d.a("\u00f9", (Object)callSite12[0], (Object)callSite12[1], (Object)callSite9, (long)165774466883552610L) /* => dev.hixo.B.U.y */;
                                CallSite callSite13 = d.a("\u00f9", (Object)callSite9, (long)78240782398741172L) /* => dev.hixo.B.U.L */;
                                CallSite callSite14 = callSite6 = d.a("\u00f9", (Object)d.a("z", (Object)methodNode, (long)151867910694456621L) /* => org.objectweb.asm.tree.MethodNode.instructions */, (Object)d.a("$", (Object)wrapInvoke, (long)189531836278199891L) /* => asm.patchify.annotation.WrapInvoke.slice */, arg_0 -> PatchTransformer.lambda$wrapInvoke$3((String)((Object)callSite8), (String)((Object)callSite7), (String)((Object)callSite13), arg_0), (long)69945554779653448L) /* => asm.patchify.loader.PatchTransformer.collectInjectionPoints */;
                                if (!bl) {
                                    if (d.a("$", (Object)callSite14, (long)184224858935663280L) /* => java.util.List.isEmpty */ != false) {
                                        callSite6 = d.a("\u00f9", (Object)d.a("z", (Object)methodNode, (long)151867910694456621L) /* => org.objectweb.asm.tree.MethodNode.instructions */, (Object)d.a("$", (Object)wrapInvoke, (long)189531836278199891L) /* => asm.patchify.annotation.WrapInvoke.slice */, arg_0 -> PatchTransformer.lambda$wrapInvoke$4((String)((Object)callSite8), (String)((Object)callSite7), (String)((Object)callSite13), arg_0), (long)69945554779653448L) /* => asm.patchify.loader.PatchTransformer.collectInjectionPoints */;
                                    }
                                    callSite14 = callSite6;
                                }
                                if (d.a("$", (Object)callSite14, (long)184224858935663280L) /* => java.util.List.isEmpty */ != false) {
                                    d.a("$", (Object)d.a("\u00fd", (long)147082103791028307L) /* => asm.patchify.loader.PatchTransformer.LOGGER */, (Object)a[29], (Object)d.a("$", (Object)d.a("$", (Object)method, (long)45153845220366281L) /* => java.lang.reflect.Method.getDeclaringClass */, (long)182318511367922152L) /* => java.lang.Class.getName */, (Object)d.a("$", (Object)method, (long)86441620207627822L) /* => java.lang.reflect.Method.getName */, (Object)d.a("\u00f9", (Object)method, (long)106651601817445952L) /* => org.objectweb.asm.Type.getMethodDescriptor */, (Object)callSite8, (Object)callSite7, (Object)callSite9, (long)99466363445762575L) /* => org.apache.logging.log4j.Logger.warn */;
                                    return;
                                }
                                callSite5 = d.a("\u00f9", (Object)methodNode, (Object)((AbstractInsnNode)d.a("$", (Object)callSite6, (int)0, (long)196824017790916210L) /* => java.util.List.get */), (long)184076429941708831L) /* => asm.patchify.loader.PatchTransformer.collectInitializedLocalsBefore */;
                                callSite4 = d.a("\u00f9", (Object)d.a("$", (Object)method, (long)45153845220366281L) /* => java.lang.reflect.Method.getDeclaringClass */, (long)54385759495451154L) /* => org.objectweb.asm.Type.getInternalName */;
                                callSite3 = d.a("$", (Object)method, (long)86441620207627822L) /* => java.lang.reflect.Method.getName */;
                                callSite2 = d.a("\u00f9", (Object)method, (long)106651601817445952L) /* => org.objectweb.asm.Type.getMethodDescriptor */;
                                object = callSite10 = d.a("$", (Object)((AbstractInsnNode)d.a("$", (Object)callSite6, (int)0, (long)196824017790916210L) /* => java.util.List.get */), (long)55430713904448303L) /* => org.objectweb.asm.tree.AbstractInsnNode.getOpcode */;
                                if (bl) break block37;
                                if (object != 184) break block38;
                                boolean bl2 = true;
                                if (!bl) break block39;
                            }
                            object = callSite10;
                        }
                        if (bl) break block40;
                        if (object != 182) break block41;
                        object = callSite = (Object)false;
                    }
                    if (!bl) break block39;
                }
                throw new IllegalArgumentException((String)((Object)d.a("$", (Object)d.a("$", (Object)d.a("$", (Object)d.a("$", (Object)d.a("$", (Object)new StringBuilder(), (Object)a[25], (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (int)callSite10, (long)32515713483113022L) /* => java.lang.StringBuilder.append */, (Object)a[64], (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (Object)method, (long)121136869135998173L) /* => java.lang.StringBuilder.append */, (long)59411206276622891L) /* => java.lang.StringBuilder.toString */));
            }
            CallSite callSite15 = d.a("$", (Object)callSite6, (long)113221006393852506L) /* => java.util.List.iterator */;
            block14: while (d.a("$", (Object)callSite15, (long)175361412755674352L) /* => java.util.Iterator.hasNext */ != false) {
                block36: {
                    CallSite callSite162;
                    int n2;
                    InsnList insnList;
                    AbstractInsnNode abstractInsnNode;
                    block44: {
                        InsnList insnList2;
                        String[] stringArray;
                        block42: {
                            block43: {
                                CallSite callSite17;
                                block35: {
                                    abstractInsnNode = (AbstractInsnNode)d.a("$", (Object)callSite15, (long)64633749944946827L) /* => java.util.Iterator.next */;
                                    insnList = new InsnList();
                                    callSite17 = d.a("z", (Object)methodNode, (long)157308534519819390L) /* => org.objectweb.asm.tree.MethodNode.maxLocals */;
                                    MethodNode methodNode2 = methodNode;
                                    d.a("\u00e7", (Object)methodNode2, (int)(d.a("z", (Object)methodNode2, (long)157308534519819390L) /* => org.objectweb.asm.tree.MethodNode.maxLocals */ + true), (long)157308534519819390L) /* => org.objectweb.asm.tree.MethodNode.maxLocals */;
                                    d.a("$", (Object)insnList, (Object)new LdcInsnNode((Object)callSite8), (long)106385981662087614L) /* => org.objectweb.asm.tree.InsnList.add */;
                                    d.a("$", (Object)insnList, (Object)new LdcInsnNode((Object)callSite7), (long)106385981662087614L) /* => org.objectweb.asm.tree.InsnList.add */;
                                    d.a("$", (Object)insnList, (Object)new LdcInsnNode((Object)callSite9), (long)106385981662087614L) /* => org.objectweb.asm.tree.InsnList.add */;
                                    stringArray = a;
                                    d.a("$", (Object)insnList, (Object)new MethodInsnNode(184, (String)((Object)d.a("\u00f9", D.class, (long)54385759495451154L) /* => org.objectweb.asm.Type.getInternalName */), stringArray[39], (String)((Object)d.a("$", (Object)d.a("$", (Object)d.a("$", (Object)new StringBuilder(), (Object)stringArray[3], (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (Object)d.a("\u00f9", D.class, (long)69210428291579702L) /* => org.objectweb.asm.Type.getDescriptor */, (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (long)59411206276622891L) /* => java.lang.StringBuilder.toString */), false), (long)106385981662087614L) /* => org.objectweb.asm.tree.InsnList.add */;
                                    d.a("$", (Object)insnList, (Object)new VarInsnNode(58, (int)callSite17), (long)106385981662087614L) /* => org.objectweb.asm.tree.InsnList.add */;
                                    CallSite callSite18 = d.a("\u00f9", (Object)callSite9, (long)38799255078832338L) /* => org.objectweb.asm.Type.getArgumentTypes */;
                                    if (bl) break block34;
                                    for (n2 = ((CallSite)callSite18).length - 1; n2 >= 0; --n2) {
                                        d.a("$", (Object)insnList, (Object)d.a("\u00f9", (Object)callSite18[n2], (long)147373822986669873L) /* => asm.patchify.loader.ASMHelpers.boxToObject */, (long)61126761562052366L) /* => org.objectweb.asm.tree.InsnList.add */;
                                        d.a("$", (Object)insnList, (Object)new VarInsnNode(25, (int)callSite17), (long)106385981662087614L) /* => org.objectweb.asm.tree.InsnList.add */;
                                        insnList2 = insnList;
                                        if (!bl) {
                                            d.a("$", (Object)insnList2, (Object)new InsnNode(95), (long)106385981662087614L) /* => org.objectweb.asm.tree.InsnList.add */;
                                            d.a("$", (Object)insnList, (Object)new MethodInsnNode(182, (String)((Object)d.a("\u00f9", D.class, (long)54385759495451154L) /* => org.objectweb.asm.Type.getInternalName */), a[35], (String)((Object)d.a("$", (Object)d.a("$", (Object)d.a("$", (Object)new StringBuilder(), (Object)a[4], (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (Object)d.a("\u00f9", D.class, (long)69210428291579702L) /* => org.objectweb.asm.Type.getDescriptor */, (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (long)59411206276622891L) /* => java.lang.StringBuilder.toString */), false), (long)106385981662087614L) /* => org.objectweb.asm.tree.InsnList.add */;
                                            d.a("$", (Object)insnList, (Object)new InsnNode(87), (long)106385981662087614L) /* => org.objectweb.asm.tree.InsnList.add */;
                                            if (!bl) continue;
                                        }
                                        break block35;
                                    }
                                    insnList2 = insnList;
                                }
                                if (bl) break block42;
                                d.a("$", (Object)insnList2, (Object)new VarInsnNode(25, (int)callSite17), (long)106385981662087614L) /* => org.objectweb.asm.tree.InsnList.add */;
                                if (callSite == false) break block43;
                                d.a("$", (Object)insnList, (Object)new MethodInsnNode(184, (String)((Object)d.a("\u00f9", l.class, (long)54385759495451154L) /* => org.objectweb.asm.Type.getInternalName */), a[6], (String)((Object)d.a("$", (Object)d.a("$", (Object)d.a("$", (Object)d.a("$", (Object)d.a("$", (Object)new StringBuilder(), (Object)"(", (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (Object)d.a("\u00f9", D.class, (long)69210428291579702L) /* => org.objectweb.asm.Type.getDescriptor */, (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (Object)")", (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (Object)d.a("\u00f9", l.class, (long)69210428291579702L) /* => org.objectweb.asm.Type.getDescriptor */, (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (long)59411206276622891L) /* => java.lang.StringBuilder.toString */), false), (long)106385981662087614L) /* => org.objectweb.asm.tree.InsnList.add */;
                                if (!bl) break block44;
                            }
                            insnList2 = insnList;
                        }
                        stringArray = a;
                        d.a("$", (Object)insnList2, (Object)new MethodInsnNode(184, (String)((Object)d.a("\u00f9", l.class, (long)54385759495451154L) /* => org.objectweb.asm.Type.getInternalName */), stringArray[6], (String)((Object)d.a("$", (Object)d.a("$", (Object)d.a("$", (Object)d.a("$", (Object)d.a("$", (Object)new StringBuilder(), (Object)stringArray[65], (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (Object)d.a("\u00f9", D.class, (long)69210428291579702L) /* => org.objectweb.asm.Type.getDescriptor */, (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (Object)")", (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (Object)d.a("\u00f9", l.class, (long)69210428291579702L) /* => org.objectweb.asm.Type.getDescriptor */, (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (long)59411206276622891L) /* => java.lang.StringBuilder.toString */), false), (long)106385981662087614L) /* => org.objectweb.asm.tree.InsnList.add */;
                    }
                    n2 = 0;
                    MethodNode methodNode3 = methodNode;
                    if (!bl) {
                        if (d.a("\u00f9", (int)d.a("z", (Object)methodNode3, (long)147880355014847291L) /* => org.objectweb.asm.tree.MethodNode.access */, (long)80710149616051228L) /* => java.lang.reflect.Modifier.isStatic */ == false) {
                            d.a("$", (Object)insnList, (Object)new VarInsnNode(25, 0), (long)106385981662087614L) /* => org.objectweb.asm.tree.InsnList.add */;
                            d.a("$", (Object)insnList, (Object)new InsnNode(95), (long)106385981662087614L) /* => org.objectweb.asm.tree.InsnList.add */;
                            ++n2;
                        }
                        methodNode3 = methodNode;
                    }
                    CallSite callSite19 = d.a("\u00f9", (Object)d.a("z", (Object)methodNode3, (long)156623205465659605L) /* => org.objectweb.asm.tree.MethodNode.desc */, (long)38799255078832338L) /* => org.objectweb.asm.Type.getArgumentTypes */;
                    int n3 = ((CallSite)callSite19).length;
                    for (int i2 = 0; i2 < n3; n2 += d.a("$", (Object)callSite162, (long)162733810066403069L) /* => org.objectweb.asm.Type.getSize */, ++i2) {
                        callSite162 = callSite19[i2];
                        d.a("$", (Object)insnList, (Object)new VarInsnNode((int)d.a("$", (Object)callSite162, (int)21, (long)148032419351921676L) /* => org.objectweb.asm.Type.getOpcode */, n2), (long)106385981662087614L) /* => org.objectweb.asm.tree.InsnList.add */;
                        if (bl) continue block14;
                        d.a("\u00f9", (Object)callSite162, (Object)insnList, (long)173716075424809593L) /* => asm.patchify.loader.PatchTransformer.swapForCallback */;
                        if (!bl) continue;
                    }
                    for (CallSite callSite162 : d.a("$", (Object)method, (long)104245413360572917L) /* => java.lang.reflect.Method.getParameters */) {
                        if (!bl) {
                            Local local = (Local)((Object)d.a("$", (Object)callSite162, Local.class, (long)113950198129706736L) /* => java.lang.reflect.Parameter.getAnnotation */);
                            if (local == null) continue;
                            if (d.a("$", (Object)callSite5, (Object)d.a("\u00f9", (int)d.a("$", (Object)local, (long)126680457509114881L) /* => asm.patchify.annotation.Local.value */, (long)67104637941965968L) /* => java.lang.Integer.valueOf */, (long)117209702718349922L) /* => java.util.Set.contains */ == false) {
                                throw new IllegalArgumentException((String)((Object)d.a("$", (Object)d.a("$", (Object)d.a("$", (Object)d.a("$", (Object)d.a("$", (Object)new StringBuilder(), (Object)a[51], (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (int)d.a("$", (Object)local, (long)126680457509114881L) /* => asm.patchify.annotation.Local.value */, (long)32515713483113022L) /* => java.lang.StringBuilder.append */, (Object)a[44], (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (Object)method, (long)121136869135998173L) /* => java.lang.StringBuilder.append */, (long)59411206276622891L) /* => java.lang.StringBuilder.toString */));
                            }
                            CallSite callSite20 = d.a("\u00f9", (Object)d.a("$", (Object)callSite162, (long)122745395305198140L) /* => java.lang.reflect.Parameter.getType */, (long)135619412375939158L) /* => org.objectweb.asm.Type.getType */;
                            d.a("$", (Object)insnList, (Object)new VarInsnNode((int)d.a("$", (Object)callSite20, (int)21, (long)148032419351921676L) /* => org.objectweb.asm.Type.getOpcode */, (int)d.a("$", (Object)local, (long)126680457509114881L) /* => asm.patchify.annotation.Local.value */), (long)106385981662087614L) /* => org.objectweb.asm.tree.InsnList.add */;
                            d.a("\u00f9", (Object)callSite20, (Object)insnList, (long)173716075424809593L) /* => asm.patchify.loader.PatchTransformer.swapForCallback */;
                            if (!bl) continue;
                        }
                        break block36;
                    }
                    d.a("$", (Object)insnList, (Object)new MethodInsnNode(184, (String)((Object)callSite4), (String)((Object)callSite3), (String)((Object)callSite2), false), (long)106385981662087614L) /* => org.objectweb.asm.tree.InsnList.add */;
                    d.a("$", (Object)d.a("z", (Object)methodNode, (long)151867910694456621L) /* => org.objectweb.asm.tree.MethodNode.instructions */, (Object)abstractInsnNode, (Object)insnList, (long)193757545116677425L) /* => org.objectweb.asm.tree.InsnList.insertBefore */;
                    d.a("$", (Object)d.a("z", (Object)methodNode, (long)151867910694456621L) /* => org.objectweb.asm.tree.MethodNode.instructions */, (Object)abstractInsnNode, (long)95197671461780391L) /* => org.objectweb.asm.tree.InsnList.remove */;
                }
                if (!bl) continue;
            }
            d.a("$", (Object)d.a("\u00fd", (long)147082103791028307L) /* => asm.patchify.loader.PatchTransformer.LOGGER */, (Object)a[53], (Object)d.a("\u00f9", (Object)method, (long)186447200685418840L) /* => asm.patchify.loader.PatchTransformer.targetClassName */, (Object)d.a("z", (Object)methodNode, (long)156822074479295918L) /* => org.objectweb.asm.tree.MethodNode.name */, (Object)d.a("z", (Object)methodNode, (long)156623205465659605L) /* => org.objectweb.asm.tree.MethodNode.desc */, (Object)d.a("$", (Object)d.a("$", (Object)method, (long)45153845220366281L) /* => java.lang.reflect.Method.getDeclaringClass */, (long)182318511367922152L) /* => java.lang.Class.getName */, (Object)d.a("$", (Object)method, (long)86441620207627822L) /* => java.lang.reflect.Method.getName */, (Object)callSite8, (Object)callSite7, (Object)callSite9, (Object)d.a("\u00f9", (int)d.a("$", (Object)callSite6, (long)180194190084079702L) /* => java.util.List.size */, (long)67104637941965968L) /* => java.lang.Integer.valueOf */, (long)200618413748328237L) /* => org.apache.logging.log4j.Logger.info */;
        }
    }

    private static void modifyLocals(MethodNode methodNode, Method method) {
        Object object;
        int n2;
        ModifyLocals modifyLocals = (ModifyLocals)((Object)d.a("$", (Object)method, ModifyLocals.class, (long)191687928670238848L) /* => java.lang.reflect.Method.getAnnotation */);
        CallSite callSite = d.a("$", (Object)modifyLocals, (long)177370855274074125L) /* => asm.patchify.annotation.ModifyLocals.indexes */;
        CallSite callSite2 = d.a("$", (Object)modifyLocals, (long)157799136844666150L) /* => asm.patchify.annotation.ModifyLocals.types */;
        if (((CallSite)callSite).length != ((CallSite)callSite2).length) {
            throw new IllegalArgumentException((String)((Object)d.a("$", (Object)d.a("$", (Object)d.a("$", (Object)new StringBuilder(), (Object)a[58], (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (Object)method, (long)121136869135998173L) /* => java.lang.StringBuilder.append */, (long)59411206276622891L) /* => java.lang.StringBuilder.toString */));
        }
        Type[] typeArray = new Type[((CallSite)callSite2).length];
        for (int i2 = 0; i2 < ((CallSite)callSite2).length; ++i2) {
            typeArray[i2] = d.a("\u00f9", (Object)callSite2[i2], (long)135619412375939158L) /* => org.objectweb.asm.Type.getType */;
        }
        CallSite callSite3 = d.a("$", (Object)modifyLocals, (long)100855591803466931L) /* => asm.patchify.annotation.ModifyLocals.at */;
        CallSite callSite4 = d.a("$", (Object)d.a("z", (Object)methodNode, (long)151867910694456621L) /* => org.objectweb.asm.tree.MethodNode.instructions */, (long)155049272468584278L) /* => org.objectweb.asm.tree.InsnList.getFirst */;
        HashSet hashSet = new HashSet();
        if (d.a("$", (Object)callSite3, (long)182756530152823619L) /* => asm.patchify.annotation.At.value */ != d.a("\u00fd", (long)143466286864367341L) /* => asm.patchify.annotation.At$Type.HEAD */) {
            boolean bl = false;
            if (d.a("$", (Object)callSite3, (long)182756530152823619L) /* => asm.patchify.annotation.At.value */ == d.a("\u00fd", (long)179838826277856593L) /* => asm.patchify.annotation.At$Type.TAIL */) {
                CallSite callSite5 = d.a("$", (Object)d.a("\u00f9", (Object)d.a("z", (Object)methodNode, (long)156623205465659605L) /* => org.objectweb.asm.tree.MethodNode.desc */, (long)43298794954611867L) /* => org.objectweb.asm.Type.getReturnType */, (int)172, (long)148032419351921676L) /* => org.objectweb.asm.Type.getOpcode */;
                var11_16 = d.a("$", (Object)d.a("z", (Object)methodNode, (long)151867910694456621L) /* => org.objectweb.asm.tree.MethodNode.instructions */, (long)191402247639388640L) /* => org.objectweb.asm.tree.InsnList.iterator */;
                while (d.a("$", (Object)var11_16, (long)175361412755674352L) /* => java.util.Iterator.hasNext */ != false) {
                    var12_18 = (AbstractInsnNode)d.a("$", (Object)var11_16, (long)64633749944946827L) /* => java.util.Iterator.next */;
                    if (d.a("$", (Object)var12_18, (long)55430713904448303L) /* => org.objectweb.asm.tree.AbstractInsnNode.getOpcode */ == callSite5) {
                        callSite4 = var12_18;
                        bl = true;
                        break;
                    }
                    if (!(var12_18 instanceof VarInsnNode)) continue;
                    var13_22 = (VarInsnNode)var12_18;
                    if (d.a("$", (Object)var13_22, (long)71930670471595108L) /* => org.objectweb.asm.tree.VarInsnNode.getOpcode */ < 54 || d.a("$", (Object)var13_22, (long)71930670471595108L) /* => org.objectweb.asm.tree.VarInsnNode.getOpcode */ > 58) continue;
                    d.a("$", hashSet, (Object)d.a("\u00f9", (int)d.a("z", (Object)var13_22, (long)47280885003608792L) /* => org.objectweb.asm.tree.VarInsnNode.var */, (long)67104637941965968L) /* => java.lang.Integer.valueOf */, (long)56498836055017186L) /* => java.util.Set.add */;
                }
            } else {
                CallSite callSite6 = d.a("\u00f9", (Object)d.a("$", (Object)callSite3, (long)168062214800108809L) /* => asm.patchify.annotation.At.method */, (long)149783109185568965L) /* => asm.patchify.loader.ASMHelpers.splitOwnerName */;
                var11_16 = d.a("\u00f9", (Object)callSite6[0], (long)149674385795215028L) /* => dev.hixo.B.U.l */;
                var12_18 = d.a("\u00f9", (Object)callSite6[0], (Object)callSite6[1], (Object)d.a("$", (Object)callSite3, (long)99099064076044260L) /* => asm.patchify.annotation.At.desc */, (long)165774466883552610L) /* => dev.hixo.B.U.y */;
                var13_22 = d.a("\u00f9", (Object)d.a("$", (Object)callSite3, (long)99099064076044260L) /* => asm.patchify.annotation.At.desc */, (long)78240782398741172L) /* => dev.hixo.B.U.L */;
                CallSite callSite7 = d.a("$", (Object)d.a("z", (Object)methodNode, (long)151867910694456621L) /* => org.objectweb.asm.tree.MethodNode.instructions */, (long)191402247639388640L) /* => org.objectweb.asm.tree.InsnList.iterator */;
                while (d.a("$", (Object)callSite7, (long)175361412755674352L) /* => java.util.Iterator.hasNext */ != false) {
                    MethodInsnNode methodInsnNode;
                    AbstractInsnNode abstractInsnNode;
                    block34: {
                        abstractInsnNode = (AbstractInsnNode)d.a("$", (Object)callSite7, (long)64633749944946827L) /* => java.util.Iterator.next */;
                        if (abstractInsnNode instanceof MethodInsnNode) {
                            methodInsnNode = (MethodInsnNode)abstractInsnNode;
                            if (d.a("$", (Object)d.a("z", (Object)methodInsnNode, (long)81921427655303579L) /* => org.objectweb.asm.tree.MethodInsnNode.owner */, (Object)var11_16, (long)130616148886603248L) /* => java.lang.String.equals */ == false || d.a("$", (Object)d.a("z", (Object)methodInsnNode, (long)108767270504250416L) /* => org.objectweb.asm.tree.MethodInsnNode.name */, (Object)var12_18, (long)130616148886603248L) /* => java.lang.String.equals */ == false) break block34;
                            if (d.a("$", (Object)d.a("z", (Object)methodInsnNode, (long)160070358673798707L) /* => org.objectweb.asm.tree.MethodInsnNode.desc */, (Object)var13_22, (long)130616148886603248L) /* => java.lang.String.equals */ == false) break block34;
                            callSite4 = abstractInsnNode;
                            bl = true;
                            break;
                        }
                    }
                    if (!(abstractInsnNode instanceof VarInsnNode)) continue;
                    methodInsnNode = (VarInsnNode)abstractInsnNode;
                    if (d.a("$", (Object)methodInsnNode, (long)71930670471595108L) /* => org.objectweb.asm.tree.VarInsnNode.getOpcode */ < 54 || d.a("$", (Object)methodInsnNode, (long)71930670471595108L) /* => org.objectweb.asm.tree.VarInsnNode.getOpcode */ > 58) continue;
                    d.a("$", hashSet, (Object)d.a("\u00f9", (int)d.a("z", (Object)methodInsnNode, (long)47280885003608792L) /* => org.objectweb.asm.tree.VarInsnNode.var */, (long)67104637941965968L) /* => java.lang.Integer.valueOf */, (long)56498836055017186L) /* => java.util.Set.add */;
                }
            }
            if (!bl) {
                d.a("$", (Object)d.a("\u00fd", (long)147082103791028307L) /* => asm.patchify.loader.PatchTransformer.LOGGER */, (Object)a[63], (Object)d.a("$", (Object)d.a("$", (Object)method, (long)45153845220366281L) /* => java.lang.reflect.Method.getDeclaringClass */, (long)182318511367922152L) /* => java.lang.Class.getName */, (Object)d.a("$", (Object)method, (long)86441620207627822L) /* => java.lang.reflect.Method.getName */, (Object)d.a("\u00f9", (Object)method, (long)106651601817445952L) /* => org.objectweb.asm.Type.getMethodDescriptor */, (Object)d.a("$", (Object)callSite3, (long)182756530152823619L) /* => asm.patchify.annotation.At.value */, (Object)d.a("$", (Object)callSite3, (long)168062214800108809L) /* => asm.patchify.annotation.At.method */, (Object)d.a("$", (Object)callSite3, (long)99099064076044260L) /* => asm.patchify.annotation.At.desc */, (Object)d.a("z", (Object)methodNode, (long)156822074479295918L) /* => org.objectweb.asm.tree.MethodNode.name */, (Object)d.a("z", (Object)methodNode, (long)156623205465659605L) /* => org.objectweb.asm.tree.MethodNode.desc */, (long)117761648158401638L) /* => org.apache.logging.log4j.Logger.warn */;
                return;
            }
            for (CallSite callSite8 : callSite) {
                if (d.a("$", hashSet, (Object)d.a("\u00f9", (int)callSite8, (long)67104637941965968L) /* => java.lang.Integer.valueOf */, (long)117209702718349922L) /* => java.util.Set.contains */ != false || d.a("$", (Object)callSite3, (long)182756530152823619L) /* => asm.patchify.annotation.At.value */ == d.a("\u00fd", (long)143466286864367341L) /* => asm.patchify.annotation.At$Type.HEAD */) continue;
            }
        }
        InsnList insnList = new InsnList();
        String[] stringArray = a;
        d.a("$", (Object)insnList, (Object)new MethodInsnNode(184, (String)((Object)d.a("\u00f9", V.class, (long)54385759495451154L) /* => org.objectweb.asm.Type.getInternalName */), stringArray[17], (String)((Object)d.a("$", (Object)d.a("$", (Object)d.a("$", (Object)new StringBuilder(), (Object)stringArray[56], (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (Object)d.a("\u00f9", V.class, (long)69210428291579702L) /* => org.objectweb.asm.Type.getDescriptor */, (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (long)59411206276622891L) /* => java.lang.StringBuilder.toString */), false), (long)106385981662087614L) /* => org.objectweb.asm.tree.InsnList.add */;
        for (n2 = 0; n2 < ((CallSite)callSite).length; ++n2) {
            object = callSite[n2];
            Type type = typeArray[n2];
            d.a("$", (Object)insnList, (Object)new LdcInsnNode((Object)d.a("\u00f9", (int)object, (long)67104637941965968L) /* => java.lang.Integer.valueOf */), (long)106385981662087614L) /* => org.objectweb.asm.tree.InsnList.add */;
            d.a("$", (Object)insnList, (Object)new VarInsnNode((int)d.a("$", (Object)type, (int)21, (long)148032419351921676L) /* => org.objectweb.asm.Type.getOpcode */, object), (long)106385981662087614L) /* => org.objectweb.asm.tree.InsnList.add */;
            d.a("$", (Object)insnList, (Object)d.a("\u00f9", (Object)type, (long)147373822986669873L) /* => asm.patchify.loader.ASMHelpers.boxToObject */, (long)61126761562052366L) /* => org.objectweb.asm.tree.InsnList.add */;
            stringArray = a;
            d.a("$", (Object)insnList, (Object)new MethodInsnNode(185, (String)((Object)d.a("\u00f9", Y.class, (long)54385759495451154L) /* => org.objectweb.asm.Type.getInternalName */), stringArray[16], (String)((Object)d.a("$", (Object)d.a("$", (Object)d.a("$", (Object)new StringBuilder(), (Object)stringArray[30], (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (Object)d.a("\u00f9", Y.class, (long)69210428291579702L) /* => org.objectweb.asm.Type.getDescriptor */, (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (long)59411206276622891L) /* => java.lang.StringBuilder.toString */), true), (long)106385981662087614L) /* => org.objectweb.asm.tree.InsnList.add */;
        }
        d.a("$", (Object)insnList, (Object)new InsnNode(89), (long)106385981662087614L) /* => org.objectweb.asm.tree.InsnList.add */;
        d.a("$", (Object)insnList, (Object)new MethodInsnNode(184, (String)((Object)d.a("\u00f9", (Object)d.a("$", (Object)method, (long)45153845220366281L) /* => java.lang.reflect.Method.getDeclaringClass */, (long)54385759495451154L) /* => org.objectweb.asm.Type.getInternalName */), (String)((Object)d.a("$", (Object)method, (long)86441620207627822L) /* => java.lang.reflect.Method.getName */), (String)((Object)d.a("\u00f9", (Object)method, (long)106651601817445952L) /* => org.objectweb.asm.Type.getMethodDescriptor */), false), (long)106385981662087614L) /* => org.objectweb.asm.tree.InsnList.add */;
        for (n2 = 0; n2 < ((CallSite)callSite).length; ++n2) {
            object = callSite[n2];
            Type type = typeArray[n2];
            d.a("$", (Object)insnList, (Object)new InsnNode(89), (long)106385981662087614L) /* => org.objectweb.asm.tree.InsnList.add */;
            d.a("$", (Object)insnList, (Object)new LdcInsnNode((Object)d.a("\u00f9", (int)object, (long)67104637941965968L) /* => java.lang.Integer.valueOf */), (long)106385981662087614L) /* => org.objectweb.asm.tree.InsnList.add */;
            stringArray = a;
            d.a("$", (Object)insnList, (Object)new MethodInsnNode(185, (String)((Object)d.a("\u00f9", Y.class, (long)54385759495451154L) /* => org.objectweb.asm.Type.getInternalName */), stringArray[18], stringArray[19], true), (long)106385981662087614L) /* => org.objectweb.asm.tree.InsnList.add */;
            d.a("$", (Object)insnList, (Object)d.a("\u00f9", (Object)type, (long)87139568849222242L) /* => asm.patchify.loader.ASMHelpers.unboxFromObject */, (long)61126761562052366L) /* => org.objectweb.asm.tree.InsnList.add */;
            d.a("$", (Object)insnList, (Object)new VarInsnNode((int)d.a("$", (Object)type, (int)54, (long)148032419351921676L) /* => org.objectweb.asm.Type.getOpcode */, object), (long)106385981662087614L) /* => org.objectweb.asm.tree.InsnList.add */;
        }
        d.a("$", (Object)insnList, (Object)new InsnNode(87), (long)106385981662087614L) /* => org.objectweb.asm.tree.InsnList.add */;
        d.a("$", (Object)d.a("z", (Object)methodNode, (long)151867910694456621L) /* => org.objectweb.asm.tree.MethodNode.instructions */, (Object)callSite4, (Object)insnList, (long)193757545116677425L) /* => org.objectweb.asm.tree.InsnList.insertBefore */;
        d.a("$", (Object)d.a("\u00fd", (long)147082103791028307L) /* => asm.patchify.loader.PatchTransformer.LOGGER */, (Object)a[45], (Object)d.a("\u00f9", (Object)method, (long)186447200685418840L) /* => asm.patchify.loader.PatchTransformer.targetClassName */, (Object)d.a("z", (Object)methodNode, (long)156822074479295918L) /* => org.objectweb.asm.tree.MethodNode.name */, (Object)d.a("z", (Object)methodNode, (long)156623205465659605L) /* => org.objectweb.asm.tree.MethodNode.desc */, (Object)d.a("$", (Object)d.a("$", (Object)method, (long)45153845220366281L) /* => java.lang.reflect.Method.getDeclaringClass */, (long)182318511367922152L) /* => java.lang.Class.getName */, (Object)d.a("$", (Object)method, (long)86441620207627822L) /* => java.lang.reflect.Method.getName */, (Object)d.a("\u00f9", (Object)callSite, (long)49260694240156804L) /* => java.util.Arrays.toString */, (long)146391184204678478L) /* => org.apache.logging.log4j.Logger.info */;
    }

    private static String targetClassName(Method method) {
        Patch patch = (Patch)((Object)d.a("$", (Object)d.a("$", (Object)method, (long)45153845220366281L) /* => java.lang.reflect.Method.getDeclaringClass */, Patch.class, (long)151718104097738338L) /* => java.lang.Class.getAnnotation */);
        if (patch == null) {
            return "?";
        }
        if (d.a("$", (Object)d.a("$", (Object)patch, (long)75020256074922747L) /* => asm.patchify.annotation.Patch.className */, (long)139567490040770223L) /* => java.lang.String.isEmpty */ == false) {
            return d.a("$", (Object)d.a("$", (Object)patch, (long)75020256074922747L) /* => asm.patchify.annotation.Patch.className */, (char)'.', (char)'/', (long)70594469537762889L) /* => java.lang.String.replace */;
        }
        return d.a("\u00f9", (Object)d.a("$", (Object)patch, (long)80437421054490806L) /* => asm.patchify.annotation.Patch.value */, (long)54385759495451154L) /* => org.objectweb.asm.Type.getInternalName */;
    }

    private static List<AbstractInsnNode> collectInjectionPoints(InsnList insnList, Slice slice, Predicate<AbstractInsnNode> predicate) {
        ArrayList<AbstractInsnNode> arrayList;
        boolean bl;
        boolean bl2;
        boolean bl3;
        block66: {
            boolean bl4;
            block65: {
                block64: {
                    boolean bl5 = d.a("$", (Object)d.a("$", (Object)slice, (long)123785993447681520L) /* => asm.patchify.annotation.Slice.start */, (long)182756530152823619L) /* => asm.patchify.annotation.At.value */ == d.a("\u00fd", (long)143466286864367341L) /* => asm.patchify.annotation.At$Type.HEAD */;
                    bl3 = bl5;
                    boolean bl6 = d.a("$", (Object)d.a("$", (Object)slice, (long)177040187527739286L) /* => asm.patchify.annotation.Slice.end */, (long)182756530152823619L) /* => asm.patchify.annotation.At.value */ == d.a("\u00fd", (long)179838826277856593L) /* => asm.patchify.annotation.At$Type.TAIL */;
                    bl2 = bl6;
                    if (d.a("$", (Object)slice, (long)46904049798487003L) /* => asm.patchify.annotation.Slice.startIndex */ == -1 && d.a("$", (Object)slice, (long)170568758742105606L) /* => asm.patchify.annotation.Slice.endIndex */ == -1) break block64;
                    bl4 = true;
                    break block65;
                }
                bl4 = false;
            }
            bl = bl4;
            arrayList = new ArrayList<AbstractInsnNode>();
            if (!bl3 || !bl2) break block66;
            if (bl) break block66;
            CallSite callSite = d.a("$", (Object)insnList, (long)191402247639388640L) /* => org.objectweb.asm.tree.InsnList.iterator */;
            while (d.a("$", (Object)callSite, (long)175361412755674352L) /* => java.util.Iterator.hasNext */ != false) {
                AbstractInsnNode abstractInsnNode = (AbstractInsnNode)d.a("$", (Object)callSite, (long)64633749944946827L) /* => java.util.Iterator.next */;
                if (d.a("$", predicate, (Object)abstractInsnNode, (long)72134862657190924L) /* => java.util.function.Predicate.test */ == false) continue;
                d.a("$", arrayList, (Object)abstractInsnNode, (long)184435215000867819L) /* => java.util.List.add */;
            }
            return arrayList;
        }
        if (bl) {
            Object object = 0;
            Object object2 = d.a("$", (Object)slice, (long)170568758742105606L) /* => asm.patchify.annotation.Slice.endIndex */ == -1 ? (int)b : (Object)d.a("$", (Object)slice, (long)170568758742105606L) /* => asm.patchify.annotation.Slice.endIndex */;
            Object object3 = object2;
            Object object4 = d.a("$", (Object)slice, (long)46904049798487003L) /* => asm.patchify.annotation.Slice.startIndex */ == -1 ? 1 : d.a("$", (Object)slice, (long)46904049798487003L) /* => asm.patchify.annotation.Slice.startIndex */;
            Object object5 = object4;
            CallSite callSite = d.a("$", (Object)insnList, (long)191402247639388640L) /* => org.objectweb.asm.tree.InsnList.iterator */;
            while (d.a("$", (Object)callSite, (long)175361412755674352L) /* => java.util.Iterator.hasNext */ != false) {
                block67: {
                    AbstractInsnNode abstractInsnNode = (AbstractInsnNode)d.a("$", (Object)callSite, (long)64633749944946827L) /* => java.util.Iterator.next */;
                    if (d.a("$", predicate, (Object)abstractInsnNode, (long)72134862657190924L) /* => java.util.function.Predicate.test */ == false) {
                        continue;
                    }
                    if (++object < object5 || object > object3) break block67;
                    d.a("$", arrayList, (Object)abstractInsnNode, (long)184435215000867819L) /* => java.util.List.add */;
                    continue;
                }
                if (object <= object3) continue;
                break;
            }
            return arrayList;
        }
        CallSite callSite = d.a("$", (Object)d.a("$", (Object)d.a("$", (Object)slice, (long)123785993447681520L) /* => asm.patchify.annotation.Slice.start */, (long)168062214800108809L) /* => asm.patchify.annotation.At.method */, (long)139567490040770223L) /* => java.lang.String.isEmpty */ != false ? null : d.a("\u00f9", (Object)d.a("$", (Object)d.a("$", (Object)slice, (long)123785993447681520L) /* => asm.patchify.annotation.Slice.start */, (long)168062214800108809L) /* => asm.patchify.annotation.At.method */, (long)149783109185568965L) /* => asm.patchify.loader.ASMHelpers.splitOwnerName */;
        CallSite callSite2 = callSite;
        CallSite callSite3 = d.a("\u00f9", (Object)d.a("$", (Object)d.a("$", (Object)slice, (long)123785993447681520L) /* => asm.patchify.annotation.Slice.start */, (long)99099064076044260L) /* => asm.patchify.annotation.At.desc */, (long)78240782398741172L) /* => dev.hixo.B.U.L */;
        CallSite callSite4 = callSite2 == null ? null : d.a("\u00f9", (Object)callSite2[0], (long)149674385795215028L) /* => dev.hixo.B.U.l */;
        CallSite callSite5 = callSite4;
        CallSite callSite6 = callSite2 == null ? null : d.a("\u00f9", (Object)callSite2[0], (Object)callSite2[1], (Object)d.a("$", (Object)d.a("$", (Object)slice, (long)123785993447681520L) /* => asm.patchify.annotation.Slice.start */, (long)99099064076044260L) /* => asm.patchify.annotation.At.desc */, (long)165774466883552610L) /* => dev.hixo.B.U.y */;
        CallSite callSite7 = callSite6;
        CallSite callSite8 = d.a("$", (Object)d.a("$", (Object)d.a("$", (Object)slice, (long)177040187527739286L) /* => asm.patchify.annotation.Slice.end */, (long)168062214800108809L) /* => asm.patchify.annotation.At.method */, (long)139567490040770223L) /* => java.lang.String.isEmpty */ != false ? null : d.a("\u00f9", (Object)d.a("$", (Object)d.a("$", (Object)slice, (long)177040187527739286L) /* => asm.patchify.annotation.Slice.end */, (long)168062214800108809L) /* => asm.patchify.annotation.At.method */, (long)149783109185568965L) /* => asm.patchify.loader.ASMHelpers.splitOwnerName */;
        CallSite callSite9 = callSite8;
        CallSite callSite10 = d.a("\u00f9", (Object)d.a("$", (Object)d.a("$", (Object)slice, (long)177040187527739286L) /* => asm.patchify.annotation.Slice.end */, (long)99099064076044260L) /* => asm.patchify.annotation.At.desc */, (long)78240782398741172L) /* => dev.hixo.B.U.L */;
        CallSite callSite11 = callSite9 == null ? null : d.a("\u00f9", (Object)callSite9[0], (long)149674385795215028L) /* => dev.hixo.B.U.l */;
        CallSite callSite12 = callSite11;
        CallSite callSite13 = callSite9 == null ? null : d.a("\u00f9", (Object)callSite9[0], (Object)callSite9[1], (Object)d.a("$", (Object)d.a("$", (Object)slice, (long)177040187527739286L) /* => asm.patchify.annotation.Slice.end */, (long)99099064076044260L) /* => asm.patchify.annotation.At.desc */, (long)165774466883552610L) /* => dev.hixo.B.U.y */;
        CallSite callSite14 = callSite13;
        boolean bl7 = bl3;
        CallSite callSite15 = d.a("$", (Object)insnList, (long)191402247639388640L) /* => org.objectweb.asm.tree.InsnList.iterator */;
        while (d.a("$", (Object)callSite15, (long)175361412755674352L) /* => java.util.Iterator.hasNext */ != false) {
            AbstractInsnNode abstractInsnNode;
            block69: {
                block68: {
                    abstractInsnNode = (AbstractInsnNode)d.a("$", (Object)callSite15, (long)64633749944946827L) /* => java.util.Iterator.next */;
                    if (bl7 || callSite2 == null) break block68;
                    if (!(abstractInsnNode instanceof MethodInsnNode)) break block68;
                    MethodInsnNode methodInsnNode = (MethodInsnNode)abstractInsnNode;
                    if (d.a("$", (Object)d.a("z", (Object)methodInsnNode, (long)81921427655303579L) /* => org.objectweb.asm.tree.MethodInsnNode.owner */, (Object)callSite5, (long)130616148886603248L) /* => java.lang.String.equals */ == false || d.a("$", (Object)d.a("z", (Object)methodInsnNode, (long)108767270504250416L) /* => org.objectweb.asm.tree.MethodInsnNode.name */, (Object)callSite7, (long)130616148886603248L) /* => java.lang.String.equals */ == false) break block68;
                    if (d.a("$", (Object)d.a("z", (Object)methodInsnNode, (long)160070358673798707L) /* => org.objectweb.asm.tree.MethodInsnNode.desc */, (Object)callSite3, (long)130616148886603248L) /* => java.lang.String.equals */ == false) break block68;
                    bl7 = true;
                    break block69;
                }
                if (bl2 || callSite9 == null) break block69;
                if (!(abstractInsnNode instanceof MethodInsnNode)) break block69;
                MethodInsnNode methodInsnNode = (MethodInsnNode)abstractInsnNode;
                if (d.a("$", (Object)d.a("z", (Object)methodInsnNode, (long)81921427655303579L) /* => org.objectweb.asm.tree.MethodInsnNode.owner */, (Object)callSite12, (long)130616148886603248L) /* => java.lang.String.equals */ == false || d.a("$", (Object)d.a("z", (Object)methodInsnNode, (long)108767270504250416L) /* => org.objectweb.asm.tree.MethodInsnNode.name */, (Object)callSite14, (long)130616148886603248L) /* => java.lang.String.equals */ == false) break block69;
                if (d.a("$", (Object)d.a("z", (Object)methodInsnNode, (long)160070358673798707L) /* => org.objectweb.asm.tree.MethodInsnNode.desc */, (Object)callSite10, (long)130616148886603248L) /* => java.lang.String.equals */ != false) {
                    break;
                }
            }
            if (!bl7) continue;
            d.a("$", arrayList, (Object)abstractInsnNode, (long)184435215000867819L) /* => java.util.List.add */;
        }
        return arrayList;
    }

    private static Set<Integer> collectInitializedLocalsBefore(MethodNode methodNode, AbstractInsnNode abstractInsnNode) {
        HashSet<Integer> hashSet = new HashSet<Integer>();
        CallSite callSite = d.a("$", (Object)d.a("z", (Object)methodNode, (long)151867910694456621L) /* => org.objectweb.asm.tree.MethodNode.instructions */, (long)191402247639388640L) /* => org.objectweb.asm.tree.InsnList.iterator */;
        while (d.a("$", (Object)callSite, (long)175361412755674352L) /* => java.util.Iterator.hasNext */ != false) {
            AbstractInsnNode abstractInsnNode2 = (AbstractInsnNode)d.a("$", (Object)callSite, (long)64633749944946827L) /* => java.util.Iterator.next */;
            if (abstractInsnNode2 == abstractInsnNode) {
                break;
            }
            if (!(abstractInsnNode2 instanceof VarInsnNode)) continue;
            VarInsnNode varInsnNode = (VarInsnNode)abstractInsnNode2;
            if (d.a("$", (Object)varInsnNode, (long)71930670471595108L) /* => org.objectweb.asm.tree.VarInsnNode.getOpcode */ < 54 || d.a("$", (Object)varInsnNode, (long)71930670471595108L) /* => org.objectweb.asm.tree.VarInsnNode.getOpcode */ > 58) continue;
            d.a("$", hashSet, (Object)d.a("\u00f9", (int)d.a("z", (Object)varInsnNode, (long)47280885003608792L) /* => org.objectweb.asm.tree.VarInsnNode.var */, (long)67104637941965968L) /* => java.lang.Integer.valueOf */, (long)56498836055017186L) /* => java.util.Set.add */;
        }
        return hashSet;
    }

    private static void swapForCallback(Type type, InsnList insnList) {
        block5: {
            block4: {
                if (type != d.a("\u00fd", (long)146731522715480170L) /* => org.objectweb.asm.Type.LONG_TYPE */ && type != d.a("\u00fd", (long)87299290750320145L) /* => org.objectweb.asm.Type.DOUBLE_TYPE */) break block4;
                d.a("$", (Object)insnList, (Object)new InsnNode(93), (long)106385981662087614L) /* => org.objectweb.asm.tree.InsnList.add */;
                d.a("$", (Object)insnList, (Object)new InsnNode(88), (long)106385981662087614L) /* => org.objectweb.asm.tree.InsnList.add */;
                break block5;
            }
            d.a("$", (Object)insnList, (Object)new InsnNode(95), (long)106385981662087614L) /* => org.objectweb.asm.tree.InsnList.add */;
        }
    }

    private static void keepArraysImport() {
        d.a("\u00f9", (Object)new Object[0], (long)56280318188458236L) /* => java.util.Arrays.asList */;
    }

    private static /* synthetic */ boolean lambda$wrapInvoke$4(String string, String string2, String string3, AbstractInsnNode abstractInsnNode) {
        boolean bl;
        block8: {
            block7: {
                if (abstractInsnNode instanceof MethodInsnNode) {
                    MethodInsnNode methodInsnNode = (MethodInsnNode)abstractInsnNode;
                    if (d.a("$", (Object)d.a("z", (Object)methodInsnNode, (long)81921427655303579L) /* => org.objectweb.asm.tree.MethodInsnNode.owner */, (Object)string, (long)130616148886603248L) /* => java.lang.String.equals */ == false && d.a("$", (Object)d.a("z", (Object)methodInsnNode, (long)108767270504250416L) /* => org.objectweb.asm.tree.MethodInsnNode.name */, (Object)string2, (long)130616148886603248L) /* => java.lang.String.equals */ == false) break block7;
                    if (d.a("$", (Object)d.a("z", (Object)methodInsnNode, (long)160070358673798707L) /* => org.objectweb.asm.tree.MethodInsnNode.desc */, (Object)string3, (long)130616148886603248L) /* => java.lang.String.equals */ == false) break block7;
                    bl = true;
                    break block8;
                }
            }
            bl = false;
        }
        return bl;
    }

    private static /* synthetic */ boolean lambda$wrapInvoke$3(String string, String string2, String string3, AbstractInsnNode abstractInsnNode) {
        boolean bl;
        block8: {
            block7: {
                if (abstractInsnNode instanceof MethodInsnNode) {
                    MethodInsnNode methodInsnNode = (MethodInsnNode)abstractInsnNode;
                    if (d.a("$", (Object)d.a("z", (Object)methodInsnNode, (long)81921427655303579L) /* => org.objectweb.asm.tree.MethodInsnNode.owner */, (Object)string, (long)130616148886603248L) /* => java.lang.String.equals */ == false || d.a("$", (Object)d.a("z", (Object)methodInsnNode, (long)108767270504250416L) /* => org.objectweb.asm.tree.MethodInsnNode.name */, (Object)string2, (long)130616148886603248L) /* => java.lang.String.equals */ == false) break block7;
                    if (d.a("$", (Object)d.a("z", (Object)methodInsnNode, (long)160070358673798707L) /* => org.objectweb.asm.tree.MethodInsnNode.desc */, (Object)string3, (long)130616148886603248L) /* => java.lang.String.equals */ == false) break block7;
                    bl = true;
                    break block8;
                }
            }
            bl = false;
        }
        return bl;
    }

    private static /* synthetic */ boolean lambda$injectAroundInvoke$2(String string, String string2, String string3, AbstractInsnNode abstractInsnNode) {
        boolean bl;
        block8: {
            block7: {
                if (abstractInsnNode instanceof MethodInsnNode) {
                    MethodInsnNode methodInsnNode = (MethodInsnNode)abstractInsnNode;
                    if (d.a("$", (Object)d.a("z", (Object)methodInsnNode, (long)81921427655303579L) /* => org.objectweb.asm.tree.MethodInsnNode.owner */, (Object)string, (long)130616148886603248L) /* => java.lang.String.equals */ == false || d.a("$", (Object)d.a("z", (Object)methodInsnNode, (long)108767270504250416L) /* => org.objectweb.asm.tree.MethodInsnNode.name */, (Object)string2, (long)130616148886603248L) /* => java.lang.String.equals */ == false) break block7;
                    if (d.a("$", (Object)d.a("z", (Object)methodInsnNode, (long)160070358673798707L) /* => org.objectweb.asm.tree.MethodInsnNode.desc */, (Object)string3, (long)130616148886603248L) /* => java.lang.String.equals */ == false) break block7;
                    bl = true;
                    break block8;
                }
            }
            bl = false;
        }
        return bl;
    }

    private static /* synthetic */ boolean lambda$injectTail$1(int n2, AbstractInsnNode abstractInsnNode) {
        boolean bl = d.a("$", (Object)abstractInsnNode, (long)55430713904448303L) /* => org.objectweb.asm.tree.AbstractInsnNode.getOpcode */ == n2;
        return bl;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                block19: {
                    var7 = new String[75];
                    var5_1 = 0;
                    var4_2 = "\u0000q\u0012\\(\u0016!1~\u0002S%Di+mED=\u0016 #0\b^-Sd?~\nF`\u001e,=`\u0012F`R,#sO\u001f\"C=p~\t\u001f-S=8\u007f\u0002\u001f.W$5tF\u001d;Kkpu\u001eV3B:p\u007f\b\u001f;Ki\u9275/\u000e^.R%5bFH)Z%p~\tK`D<>>\u000epy\u0015\u001f0D =y\u0012V6Si\b\u0018q\b[,S;p8x\\\f^6Wf<q\bXoe=\"y\bX{z#1f\u0007\u0010,W'7?5K2_'7+*U!@(\u007f|\u0007Q'\u0019\u001a$b\u000fQ'\r`\u0014x\\\f^6Wf<q\bXoy+:u\u0005K{\u001f\u001f\u0010Y\bU%U=xX#~\u0004\u001fipk\u001b\u0010;K2-0Z\u0012`M4sk\u001b\u00063b\u0003^4S^\u0010Y\bU%U=xD'v\f\u001fi+mED=M4pv\tJ.Ri>\u007fFM%B<\"~FV.E=\"e\u0005K)Y'py\b\u001f4W;7u\u0012\u001f;K2-0\u9243\u00000W=3xFW!X-<u\u0014\u001f7_%<0\bP4\u0016;%~H\u0017pX#~\u0004\u0016*1~\bP4\u0016<#uF\u007f\fY*1|Ip8NK(_:py\u0000\u001f.Y'}c\u0012^4_*y<FK(S'p}\u0003K(Y-pq\u0014X3\u001fgpB\u0003R/@,pq\bF`u(<|\u0004^#]\u0000>v\t\u001f0W;1}H\u0005px\u0007L`\u001b\u0016q\u000fS%Ri$\u007fF^0F%)0&k2W'#v\tM-\u0016/py\u0015\u001f!\u0016;5v\u0003M%X*50\u0004J4\u0016!1~\u0002S%Di4u\u0005S!D,#0\u0016M)[ $y\u0010Z`\u000epy\u0015\u001f.Y=pP6^4U!\u000b\u0010D\u0014^.E/?b\u000b\u001f\u000fp}\u0013L4\u0016+50\u0015K!B 3\u0003#u\u0012\u00063b\u0003^4S\u00037u\u0012\u0015xYOs*W?1?\n^.Qf\u001fr\fZ#Br\u000e\u0010]\t[)P0\u001c\u007f\u0005^,Ei\n q\u0014^-S=5bF\u000e8q\b[,S;pd\u0007T%Ei\u0006\u0012U p\u0012s8\u0010Y\bU%U=xk\u001b\u0016`M4\u007fk\u001bD=\u0016u}0\u001dBcM4pq\u0014P5X-pk\u001b\u001c;K2-0ND=\u0016:9d\u0003\u00173\u001f`\u001f\u0010G\u0014^0\u007f'&\u007f\rZ`C'#e\u0016O/D=5tFP0U&4uF\n q\u0014^-S=5bF\u001cp`\u0007M![:pr\u0013K`B(\"w\u0003K`D,!e\u000fM%Ei\u001f\u0010D\u0014^.E/?b\u000b\u001f`\u0016ipk\u001b\u0010;K2-0Z\u0012`M4sk\u001bO\u0010G\u0014^0\u007f'&\u007f\rZ`M4sk\u001bD=\u0016/?e\b[`X&ps\u0007S,\u0016:9d\u0003\u001f/Pi+mED=M4p\u9235YO!B*80\u000e^.R%5bFH)Z%p~\tK`D<>>\u0015xY*U!@(\u007f|\u0007Q'\u0019\u00062z\u0003\\4\r`\u0013\u0010_\u0010Z2A;9d\u0003\u001f(W'4|\u0003M`\b\u0010Y\bU%U=p+p~\tK`_'9d\u000f^,_35tF]%P&\"uFV.\\,3d\u000fP.\u00169?y\bK`_'p\u0016pr\u0013K`^(>t\nZ2\u0016-5s\n^2S:p\b1t\u0002o!D(=\u001ep}\u0013L4\u0016=1{\u0003\u001f!\u0016:9~\u0001S%\u0016\u00045d\u000eP$x&4u3\u0010Y\bU%U=xD'v\f\u001fipk\u001b\u0010;K2-0Z\u0012`M4sk\u001b\u001fhM4pb\u0003K5D'pc\u000fK%\u001e:y9\u0010:q\u0010^oZ(>wIp\"\\,3d\u000b7u\u0012v.E=1~\u0005Z\u0012\u001cz\u0007I!\u0019%1~\u0001\u0010\u000fT#5s\u0012\u0004]\u0000q\u0012\\(\u0016!1~\u0002S%Di+mED=M4pd\u0007M'S=#0\u001dBcM4+mF]5Bi>\u007fFL5U!p}\u0003K(Y-pu\u001eV3B:p\u007f\b\u001f;Ki\u9275/\u000e^.R%5bFH)Z%p~\tK`D<>>\u0006\"u\u0015J,B\u0014p}\u000fL3_'70\u000bZ4^&4?\u0002Z3U\u0014p~\tK`_'9d\u000f^,_35tFV.\u0016,\u0010]\t[)P0\u001c\u007f\u0005^,Eipk\u001b\u0010;K2-0Z\u0012`M4sk\u001b\u001fhZ&3q\nLz\u00162-9\u001f\u0010_\u0010Z2A;9d\u0003\u001f`\u0016ipk\u001b\u0010;K2-0Z\u0012`M4sk\u001b\u0004\u0010Q\u0012\u001f&\u001c\u007f\u0007[)X.p`\u0007K#^i+mF\u0012~\u00162-0ND=\u0016!1~\u0002S%Da#9Oq\u0010Y\bU%U=xX#~\u0004\u001fi+mED=\u0016 #0\u000fQ#Y$ q\u0012V\"Z,pg\u000fK(\u0016$1d\u0005W%Ri$q\u0014X%Bi+m\u001dB`\u9213v+mF\u921a\u007fE\"9`\u0016V.Qi9~\fZ#B ?~FK/\u0016(&\u007f\u000f[`_'&q\nV$\u0016+)d\u0003\\/R,~\r\u0012U p\u0012s\u0016\u0019^0p\u000bs\r\u0010\\\t\\!Zi9~\u0002Z8\u0016\u0012p8\u0014Z#S &u\u0014\u001fk\u0016(\"w\u0015\u0016:\u0010G\u0014^0\u007f'&\u007f\rZ`\u0016ipk\u001b\u0010;K2-0Z\u0012`M4sk\u001b\u001f7D( cFD=\u00152-k\u001b\u001fhM4pc\u000fK%\u001e:y9\t3q\b\\%Z%5t\r\u0011V2z\u0012i\u0000\u001eF)t\u0005\u0016\u0002x9\u001bp}\u0013L4\u0016=1{\u0003\u001f!\u0016:9~\u0001S%\u0016\u0000\u001c\u007f\u0005^,E/\u0010]\t[)P0\u001c\u007f\u0005^,Ei9~\u0002Z8S:\u007fd\u001fO%Ei<u\bX4^i=y\u0015R!B*80\u000fQ`&p}\u0013L4\u0016=1{\u0003\u001f!Xi\u0019~\u0010P#W=9\u007f\b\u001f!Ei<q\u0015K`F(\"q\u000b%p}\u0013L4\u0016=1{\u0003\u001f\u0003W%<r\u0007\\+\u007f'6\u007fF^3\u0016%1c\u0012\u001f0W;1}\r\u0010\\\t\\!Zi9~\u0002Z8\u0016\f\u0010G\u0014^0\u007f'&\u007f\rZ`Z\u0010]\t[)P0\u001c\u007f\u0005^,Ei+mED=M4pv\tJ.Ri>\u007fF^.U!?bFD=\u00162-k\u001b\u001f)Xi$q\u0014X%Bi+m\u001dB`\u9213v q\u0012\\(\u0016!1~\u0002S%Di'y\nS`X&$0\u0014J.\u0018\u0004py\b\u001f\u0013x\\\f^6Wf<q\bXoy+:u\u0005K{\u0014x\\\f^6Wf<q\bXoy+:u\u0005K{\u001f\u0012\u001cz\u0007I!\u0019%1~\u0001\u0010\u000fT#5s\u0012\u0004\u0005\u0011V2z\u0012\t3q\b\\%Z%5t\u0011p}\u0013L4\u0016;5d\u0013M.\u0016??y\u0002\b\u0010Y\bU%U=pV\u0010Y\bU%U=xk\u001b`\tx\u001f\u001f[#\u0016`M4sk\u001bD=\u0016/?e\b[`X&ps\u0007S,\u0016:9d\u0003\u001f/Pi+mED=M4p\u9235YO!B*80\u000e^.R%5bFH)Z%p~\tK`D<>>";
                    var6_3 = "\u0000q\u0012\\(\u0016!1~\u0002S%Di+mED=\u0016 #0\b^-Sd?~\nF`\u001e,=`\u0012F`R,#sO\u001f\"C=p~\t\u001f-S=8\u007f\u0002\u001f.W$5tF\u001d;Kkpu\u001eV3B:p\u007f\b\u001f;Ki\u9275/\u000e^.R%5bFH)Z%p~\tK`D<>>\u000epy\u0015\u001f0D =y\u0012V6Si\b\u0018q\b[,S;p8x\\\f^6Wf<q\bXoe=\"y\bX{z#1f\u0007\u0010,W'7?5K2_'7+*U!@(\u007f|\u0007Q'\u0019\u001a$b\u000fQ'\r`\u0014x\\\f^6Wf<q\bXoy+:u\u0005K{\u001f\u001f\u0010Y\bU%U=xX#~\u0004\u001fipk\u001b\u0010;K2-0Z\u0012`M4sk\u001b\u00063b\u0003^4S^\u0010Y\bU%U=xD'v\f\u001fi+mED=M4pv\tJ.Ri>\u007fFM%B<\"~FV.E=\"e\u0005K)Y'py\b\u001f4W;7u\u0012\u001f;K2-0\u9243\u00000W=3xFW!X-<u\u0014\u001f7_%<0\bP4\u0016;%~H\u0017pX#~\u0004\u0016*1~\bP4\u0016<#uF\u007f\fY*1|Ip8NK(_:py\u0000\u001f.Y'}c\u0012^4_*y<FK(S'p}\u0003K(Y-pq\u0014X3\u001fgpB\u0003R/@,pq\bF`u(<|\u0004^#]\u0000>v\t\u001f0W;1}H\u0005px\u0007L`\u001b\u0016q\u000fS%Ri$\u007fF^0F%)0&k2W'#v\tM-\u0016/py\u0015\u001f!\u0016;5v\u0003M%X*50\u0004J4\u0016!1~\u0002S%Di4u\u0005S!D,#0\u0016M)[ $y\u0010Z`\u000epy\u0015\u001f.Y=pP6^4U!\u000b\u0010D\u0014^.E/?b\u000b\u001f\u000fp}\u0013L4\u0016+50\u0015K!B 3\u0003#u\u0012\u00063b\u0003^4S\u00037u\u0012\u0015xYOs*W?1?\n^.Qf\u001fr\fZ#Br\u000e\u0010]\t[)P0\u001c\u007f\u0005^,Ei\n q\u0014^-S=5bF\u000e8q\b[,S;pd\u0007T%Ei\u0006\u0012U p\u0012s8\u0010Y\bU%U=xk\u001b\u0016`M4\u007fk\u001bD=\u0016u}0\u001dBcM4pq\u0014P5X-pk\u001b\u001c;K2-0ND=\u0016:9d\u0003\u00173\u001f`\u001f\u0010G\u0014^0\u007f'&\u007f\rZ`C'#e\u0016O/D=5tFP0U&4uF\n q\u0014^-S=5bF\u001cp`\u0007M![:pr\u0013K`B(\"w\u0003K`D,!e\u000fM%Ei\u001f\u0010D\u0014^.E/?b\u000b\u001f`\u0016ipk\u001b\u0010;K2-0Z\u0012`M4sk\u001bO\u0010G\u0014^0\u007f'&\u007f\rZ`M4sk\u001bD=\u0016/?e\b[`X&ps\u0007S,\u0016:9d\u0003\u001f/Pi+mED=M4p\u9235YO!B*80\u000e^.R%5bFH)Z%p~\tK`D<>>\u0015xY*U!@(\u007f|\u0007Q'\u0019\u00062z\u0003\\4\r`\u0013\u0010_\u0010Z2A;9d\u0003\u001f(W'4|\u0003M`\b\u0010Y\bU%U=p+p~\tK`_'9d\u000f^,_35tF]%P&\"uFV.\\,3d\u000fP.\u00169?y\bK`_'p\u0016pr\u0013K`^(>t\nZ2\u0016-5s\n^2S:p\b1t\u0002o!D(=\u001ep}\u0013L4\u0016=1{\u0003\u001f!\u0016:9~\u0001S%\u0016\u00045d\u000eP$x&4u3\u0010Y\bU%U=xD'v\f\u001fipk\u001b\u0010;K2-0Z\u0012`M4sk\u001b\u001fhM4pb\u0003K5D'pc\u000fK%\u001e:y9\u0010:q\u0010^oZ(>wIp\"\\,3d\u000b7u\u0012v.E=1~\u0005Z\u0012\u001cz\u0007I!\u0019%1~\u0001\u0010\u000fT#5s\u0012\u0004]\u0000q\u0012\\(\u0016!1~\u0002S%Di+mED=M4pd\u0007M'S=#0\u001dBcM4+mF]5Bi>\u007fFL5U!p}\u0003K(Y-pu\u001eV3B:p\u007f\b\u001f;Ki\u9275/\u000e^.R%5bFH)Z%p~\tK`D<>>\u0006\"u\u0015J,B\u0014p}\u000fL3_'70\u000bZ4^&4?\u0002Z3U\u0014p~\tK`_'9d\u000f^,_35tFV.\u0016,\u0010]\t[)P0\u001c\u007f\u0005^,Eipk\u001b\u0010;K2-0Z\u0012`M4sk\u001b\u001fhZ&3q\nLz\u00162-9\u001f\u0010_\u0010Z2A;9d\u0003\u001f`\u0016ipk\u001b\u0010;K2-0Z\u0012`M4sk\u001b\u0004\u0010Q\u0012\u001f&\u001c\u007f\u0007[)X.p`\u0007K#^i+mF\u0012~\u00162-0ND=\u0016!1~\u0002S%Da#9Oq\u0010Y\bU%U=xX#~\u0004\u001fi+mED=\u0016 #0\u000fQ#Y$ q\u0012V\"Z,pg\u000fK(\u0016$1d\u0005W%Ri$q\u0014X%Bi+m\u001dB`\u9213v+mF\u921a\u007fE\"9`\u0016V.Qi9~\fZ#B ?~FK/\u0016(&\u007f\u000f[`_'&q\nV$\u0016+)d\u0003\\/R,~\r\u0012U p\u0012s\u0016\u0019^0p\u000bs\r\u0010\\\t\\!Zi9~\u0002Z8\u0016\u0012p8\u0014Z#S &u\u0014\u001fk\u0016(\"w\u0015\u0016:\u0010G\u0014^0\u007f'&\u007f\rZ`\u0016ipk\u001b\u0010;K2-0Z\u0012`M4sk\u001b\u001f7D( cFD=\u00152-k\u001b\u001fhM4pc\u000fK%\u001e:y9\t3q\b\\%Z%5t\r\u0011V2z\u0012i\u0000\u001eF)t\u0005\u0016\u0002x9\u001bp}\u0013L4\u0016=1{\u0003\u001f!\u0016:9~\u0001S%\u0016\u0000\u001c\u007f\u0005^,E/\u0010]\t[)P0\u001c\u007f\u0005^,Ei9~\u0002Z8S:\u007fd\u001fO%Ei<u\bX4^i=y\u0015R!B*80\u000fQ`&p}\u0013L4\u0016=1{\u0003\u001f!Xi\u0019~\u0010P#W=9\u007f\b\u001f!Ei<q\u0015K`F(\"q\u000b%p}\u0013L4\u0016=1{\u0003\u001f\u0003W%<r\u0007\\+\u007f'6\u007fF^3\u0016%1c\u0012\u001f0W;1}\r\u0010\\\t\\!Zi9~\u0002Z8\u0016\f\u0010G\u0014^0\u007f'&\u007f\rZ`Z\u0010]\t[)P0\u001c\u007f\u0005^,Ei+mED=M4pv\tJ.Ri>\u007fF^.U!?bFD=\u00162-k\u001b\u001f)Xi$q\u0014X%Bi+m\u001dB`\u9213v q\u0012\\(\u0016!1~\u0002S%Di'y\nS`X&$0\u0014J.\u0018\u0004py\b\u001f\u0013x\\\f^6Wf<q\bXoy+:u\u0005K{\u0014x\\\f^6Wf<q\bXoy+:u\u0005K{\u001f\u0012\u001cz\u0007I!\u0019%1~\u0001\u0010\u000fT#5s\u0012\u0004\u0005\u0011V2z\u0012\t3q\b\\%Z%5t\u0011p}\u0013L4\u0016;5d\u0013M.\u0016??y\u0002\b\u0010Y\bU%U=pV\u0010Y\bU%U=xk\u001b`\tx\u001f\u001f[#\u0016`M4sk\u001bD=\u0016/?e\b[`X&ps\u0007S,\u0016:9d\u0003\u001f/Pi+mED=M4p\u9235YO!B*80\u000e^.R%5bFH)Z%p~\tK`D<>>".length();
                    var3_4 = 107;
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
                        var4_2 = "pv\tM7W;4u\u0002\u001f0W;1}\u0003K%Da#9F]5Bi$q\u0014X%Bi#e\u0016O,_,#0\u0006\"u\u0015J,B";
                        var6_3 = "pv\tM7W;4u\u0002\u001f0W;1}\u0003K%Da#9F]5Bi$q\u0014X%Bi#e\u0016O,_,#0\u0006\"u\u0015J,B".length();
                        var3_4 = 44;
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
                            v10 = 80;
                            break;
                        }
                        case 1: {
                            v10 = 16;
                            break;
                        }
                        case 2: {
                            v10 = 102;
                            break;
                        }
                        case 3: {
                            v10 = 63;
                            break;
                        }
                        case 4: {
                            v10 = 64;
                            break;
                        }
                        case 5: {
                            v10 = 54;
                            break;
                        }
                        default: {
                            v10 = 73;
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
            PatchTransformer.a = var7;
            break block21;
lbl77:
            // 1 sources

            while (true) {
                continue;
                break;
            }
        }
        var0_7 = 8537051282016651352L;
        ** while (true)
        PatchTransformer.b = 8893672371066156967L ^ var0_7;
        PatchTransformer.LOGGER = d.a("\u00f9", PatchTransformer.class, (long)163330105986552197L) /* => org.apache.logging.log4j.LogManager.getLogger */;
        PatchTransformer.CALLBACK_INFO = d.a("\u00f9", CallbackInfo.class, (long)54385759495451154L) /* => org.objectweb.asm.Type.getInternalName */;
        PatchTransformer.CALLBACK_INFO_DESC = d.a("\u00f9", CallbackInfo.class, (long)69210428291579702L) /* => org.objectweb.asm.Type.getDescriptor */;
    }

    private record MethodKey(String name, String desc) {
        private final String name;
        private final String desc;

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        public boolean equals(Object object) {
            boolean bl = O;
            Object object2 = object;
            if (!bl) {
                if (!(object2 instanceof MethodKey)) return false;
                object2 = object;
            }
            MethodKey methodKey = (MethodKey)((Object)object2);
            CallSite callSite = d.a("z", (Object)((Object)methodKey), (long)128232573917038747L) /* => asm.patchify.loader.PatchTransformer$MethodKey.name */;
            MethodKey methodKey2 = this;
            if (!bl) {
                if (d.a("$", (Object)callSite, (Object)d.a("z", (Object)((Object)methodKey2), (long)128232573917038747L) /* => asm.patchify.loader.PatchTransformer$MethodKey.name */, (long)130616148886603248L) /* => java.lang.String.equals */ == false) return false;
                callSite = d.a("z", (Object)((Object)methodKey), (long)102167218605476140L) /* => asm.patchify.loader.PatchTransformer$MethodKey.desc */;
                methodKey2 = this;
            }
            Object object3 = d.a("$", (Object)callSite, (Object)d.a("z", (Object)((Object)methodKey2), (long)102167218605476140L) /* => asm.patchify.loader.PatchTransformer$MethodKey.desc */, (long)130616148886603248L) /* => java.lang.String.equals */;
            if (bl) return object3;
            if (!object3) return false;
            return 1;
        }

        public int hashCode() {
            return (int)(d.a("$", (Object)d.a("z", (Object)((Object)this), (long)128232573917038747L) /* => asm.patchify.loader.PatchTransformer$MethodKey.name */, (long)192171503307955577L) /* => java.lang.String.hashCode */ * 31 + d.a("$", (Object)d.a("z", (Object)((Object)this), (long)102167218605476140L) /* => asm.patchify.loader.PatchTransformer$MethodKey.desc */, (long)192171503307955577L) /* => java.lang.String.hashCode */);
        }

        public String name() {
            return d.a("z", (Object)((Object)this), (long)128232573917038747L) /* => asm.patchify.loader.PatchTransformer$MethodKey.name */;
        }

        public String desc() {
            return d.a("z", (Object)((Object)this), (long)102167218605476140L) /* => asm.patchify.loader.PatchTransformer$MethodKey.desc */;
        }
    }
}

