/*
 * RESTORED SOURCE — decompiled reconstruction, not the original files.
 * class: dev.hixo.T.V
 */

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package dev.hixo.T;

import dev.hixo.M.G;
import dev.hixo.M.d;
import dev.hixo.T.E;
import dev.hixo.T.S;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.reflect.Method;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class V {
    private final Map<Class<?>, List<a>> t = new ConcurrentHashMap();

    public void s(Object object) {
        CallSite callSite = d.a("$", object.getClass(), (long)160797904854251300L) /* => java.lang.Class.getDeclaredMethods */;
        int n2 = S.G;
        int n3 = ((CallSite)callSite).length;
        int n4 = 0;
        while (n4 < n3) {
            block3: {
                block4: {
                    CallSite callSite2;
                    CallSite callSite3;
                    block5: {
                        callSite3 = callSite[n4];
                        if (n2 != 0) break block3;
                        if (d.a("$", (Object)callSite3, E.class, (long)171526665379798521L) /* => java.lang.reflect.Method.isAnnotationPresent */ == false) break block4;
                        callSite2 = callSite3;
                        if (n2 != 0) break block5;
                        if (d.a("$", (Object)callSite2, (long)117970817046729596L) /* => java.lang.reflect.Method.getParameterCount */ != true) break block4;
                        callSite2 = callSite3;
                    }
                    CallSite callSite4 = d.a("$", (Object)callSite2, (long)148834412752581508L) /* => java.lang.reflect.Method.getParameterTypes */[0];
                    d.a("$", (Object)callSite3, (boolean)true, (long)162285088212208629L) /* => java.lang.reflect.Method.setAccessible */;
                    d.a("$", (Object)((List)((Object)d.a("$", (Object)d.a("z", (Object)this, (long)161239258320471345L) /* => dev.hixo.T.V.t */, (Object)callSite4, clazz -> new CopyOnWriteArrayList(), (long)123211639374652458L) /* => java.util.Map.computeIfAbsent */)), (Object)((Object)new a(object, (Method)((Object)callSite3))), (long)184435215000867819L) /* => java.util.List.add */;
                }
                ++n4;
            }
            if (n2 == 0) continue;
            G.L = !G.L;
            break;
        }
    }

    public void S(Object object) {
        d.a("$", (Object)d.a("$", (Object)d.a("z", (Object)this, (long)161239258320471345L) /* => dev.hixo.T.V.t */, (long)103619893215853235L) /* => java.util.Map.values */, list -> d.a("$", (Object)list, a2 -> d.a("z", (Object)a2, (long)163071764079864570L) /* => dev.hixo.T.V$a.o */ == object, (long)77274808682653959L) /* => java.util.List.removeIf */, (long)99546268602485022L) /* => java.util.Collection.forEach */;
    }

    public void T(Object object) {
        List list = (List)((Object)d.a("$", (Object)d.a("z", (Object)this, (long)161239258320471345L) /* => dev.hixo.T.V.t */, object.getClass(), (long)150360683669181890L) /* => java.util.Map.get */);
        if (list == null) {
            return;
        }
        CallSite callSite = d.a("$", (Object)list, (long)113221006393852506L) /* => java.util.List.iterator */;
        while (d.a("$", (Object)callSite, (long)175361412755674352L) /* => java.util.Iterator.hasNext */ != false) {
            a a2 = (a)((Object)d.a("$", (Object)callSite, (long)64633749944946827L) /* => java.util.Iterator.next */);
            try {
                d.a("$", (Object)d.a("z", (Object)((Object)a2), (long)36367144118592599L) /* => dev.hixo.T.V$a.y */, (Object)d.a("z", (Object)((Object)a2), (long)163071764079864570L) /* => dev.hixo.T.V$a.o */, (Object)new Object[]{object}, (long)74984033819264995L) /* => java.lang.reflect.Method.invoke */;
            }
            catch (Exception exception) {
                d.a("$", (Object)exception, (long)104804239545952609L) /* => java.lang.Exception.printStackTrace */;
            }
        }
    }

    private static final class a
    extends Record {
        private final Object o;
        private final Method y;

        private a(Object object, Method method) {
            this.o = object;
            this.y = method;
        }

        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "o;y", "o", "y"}, this);
        }

        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "o;y", "o", "y"}, this);
        }

        public final boolean equals(Object object) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "o;y", "o", "y"}, this, object);
        }

        public Object o() {
            return d.a("z", (Object)((Object)this), (long)163071764079864570L) /* => dev.hixo.T.V$a.o */;
        }

        public Method Y() {
            return d.a("z", (Object)((Object)this), (long)36367144118592599L) /* => dev.hixo.T.V$a.y */;
        }
    }
}

