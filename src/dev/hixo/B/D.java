/*
 * RESTORED SOURCE — decompiled reconstruction, not the original files.
 * class: dev.hixo.B.D
 * context strings: 'Method ' | ' not found on '
 * decrypted string pool:
 *   a[0] = Method 
 *   a[1] =  not found on 
 */

/*
 * Decompiled with CFR 0.152.
 */
package dev.hixo.B;

import dev.hixo.M.G;
import dev.hixo.M.d;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.InvocationTargetException;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class D {
    private static final MethodHandles.Lookup g;
    private static final Map<String, MethodHandle> E;
    private final MethodHandle r;
    private final List<Object> b = new LinkedList<Object>();
    public static int U;
    private static final String[] a;

    private D(MethodHandle methodHandle) {
        this.r = methodHandle;
    }

    public static D d(String string, String string2, String string3) throws Exception {
        D d2;
        block13: {
            boolean bl;
            block15: {
                block14: {
                    CallSite callSite;
                    int n2;
                    block11: {
                        CallSite callSite2;
                        block12: {
                            callSite2 = d.a("$", (Object)d.a("$", (Object)d.a("$", (Object)d.a("$", (Object)d.a("$", (Object)new StringBuilder(), (Object)string, (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (Object)"/", (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (Object)string2, (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (Object)string3, (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (long)59411206276622891L) /* => java.lang.StringBuilder.toString */;
                            MethodHandle methodHandle = (MethodHandle)((Object)d.a("$", (Object)d.a("\u00fd", (long)137076549721696360L), (Object)callSite2, (long)150360683669181890L) /* => java.util.Map.get */);
                            n2 = U;
                            if (methodHandle != null) {
                                return new D(methodHandle);
                            }
                            CallSite callSite3 = d.a("\u00f9", (Object)d.a("$", string, (char)'/', (char)'.', (long)70594469537762889L) /* => java.lang.String.replace */, (boolean)false, (Object)d.a("$", (Object)d.a("\u00f9", (long)44386049656338218L) /* => java.lang.Thread.currentThread */, (long)190047261400389647L) /* => java.lang.Thread.getContextClassLoader */, (long)137934999633070309L) /* => java.lang.Class.forName */;
                            callSite = d.a("\u00f9", (Object)callSite3, (Object)string2, (Object)string3, (long)125528291106572217L);
                            if (n2 != 0) break block11;
                            if (callSite != null) break block12;
                            throw new NoSuchMethodException((String)((Object)d.a("$", (Object)d.a("$", (Object)d.a("$", (Object)d.a("$", (Object)d.a("$", (Object)d.a("$", (Object)new StringBuilder(), (Object)a[0], (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (Object)string2, (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (Object)string3, (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (Object)a[1], (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (Object)string, (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (long)59411206276622891L) /* => java.lang.StringBuilder.toString */));
                        }
                        d.a("$", (Object)d.a("\u00fd", (long)137076549721696360L), (Object)callSite2, (Object)callSite, (long)87609561069083692L) /* => java.util.Map.put */;
                    }
                    d2 = new D((MethodHandle)((Object)callSite));
                    if (n2 == 0) break block13;
                    if (!G.L) break block14;
                    bl = false;
                    break block15;
                }
                bl = true;
            }
            G.L = bl;
        }
        return d2;
    }

    private static MethodHandle R(Class<?> clazz, String string, String string2) throws Exception {
        for (CallSite callSite : d.a("$", clazz, (long)160797904854251300L) /* => java.lang.Class.getDeclaredMethods */) {
            MethodHandle methodHandle;
            if (d.a("$", (Object)d.a("$", (Object)callSite, (long)86441620207627822L) /* => java.lang.reflect.Method.getName */, (Object)string, (long)130616148886603248L) /* => java.lang.String.equals */ == false || d.a("$", (Object)d.a("\u00f9", (Object)callSite, (long)106651601817445952L) /* => org.objectweb.asm.Type.getMethodDescriptor */, (Object)string2, (long)130616148886603248L) /* => java.lang.String.equals */ == false) continue;
            d.a("$", (Object)callSite, (boolean)true, (long)162285088212208629L) /* => java.lang.reflect.Method.setAccessible */;
            try {
                methodHandle = (MethodHandle)d.d(79672886168847484L).invoke(d.a("\u00fd", (long)182995443074946419L), d.a(callSite));
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
            return methodHandle;
        }
        return null;
    }

    public List<Object> W() {
        return d.a("z", (Object)this, (long)201725914289365403L);
    }

    public D F(Object object) {
        d.a("$", (Object)d.a("z", (Object)this, (long)201725914289365403L), (int)0, (Object)object, (long)36860418039359217L);
        return this;
    }

    public Object d(Object object) throws Throwable {
        Object object2;
        block17: {
            block18: {
                int n2;
                block14: {
                    Object object3;
                    block15: {
                        block16: {
                            n2 = U;
                            if (object != null) break block14;
                            object3 = this;
                            if (n2 != 0) break block15;
                            if (d.a("$", (Object)d.a("z", (Object)object3, (long)201725914289365403L), (long)184224858935663280L) /* => java.util.List.isEmpty */ == false) break block16;
                            return d.a("z", (Object)this, (long)183824495769824833L).invoke();
                        }
                        try {
                            object3 = d.d(192565332360025407L).invoke(d.a("z", (Object)this, (long)183824495769824833L), d.a(d.a("z", (Object)this, (long)201725914289365403L)));
                        }
                        catch (InvocationTargetException invocationTargetException) {
                            throw invocationTargetException.getTargetException();
                        }
                    }
                    return object3;
                }
                object2 = this;
                if (n2 != 0) break block17;
                if (d.a("$", (Object)d.a("z", (Object)object2, (long)201725914289365403L), (long)184224858935663280L) /* => java.util.List.isEmpty */ == false) break block18;
                return d.a("z", (Object)this, (long)183824495769824833L).invoke(object);
            }
            d.a("$", (Object)d.a("z", (Object)this, (long)201725914289365403L), (int)0, (Object)object, (long)36860418039359217L);
            try {
                object2 = d.d(192565332360025407L).invoke(d.a("z", (Object)this, (long)183824495769824833L), d.a(d.a("z", (Object)this, (long)201725914289365403L)));
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
        return object2;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block14: {
            var5 = new String[2];
            var3_1 = 0;
            var2_2 = "f\u0003^E@V\u001f\u000e\u000b\bEY\u000fTP^\bN\r@\\\u001f";
            var4_3 = "f\u0003^E@V\u001f\u000e\u000b\bEY\u000fTP^\bN\r@\\\u001f".length();
            var1_4 = 7;
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
                break block14;
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
                        v6 = 43;
                        break;
                    }
                    case 1: {
                        v6 = 102;
                        break;
                    }
                    case 2: {
                        v6 = 42;
                        break;
                    }
                    case 3: {
                        v6 = 45;
                        break;
                    }
                    case 4: {
                        v6 = 47;
                        break;
                    }
                    case 5: {
                        v6 = 50;
                        break;
                    }
                    default: {
                        v6 = 63;
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
        D.a = var5;
        try {
            v7 = (MethodHandles.Lookup)d.d(156067532622866795L).invoke(null, d.c());
        }
        catch (InvocationTargetException v8) {
            throw v8.getTargetException();
        }
        D.g = v7;
        D.E = new ConcurrentHashMap<String, MethodHandle>();
    }
}

