/*
 * RESTORED SOURCE — decompiled reconstruction, not the original files.
 * class: dev.hixo.B.C
 */

/*
 * Decompiled with CFR 0.152.
 */
package dev.hixo.b;

import dev.hixo.M.d;
import dev.hixo.b.g;
import java.lang.invoke.CallSite;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class C {
    private final String A;
    private final List<String> o;
    private final Set<String> t = new LinkedHashSet<String>();

    public C(String string, String ... stringArray) {
        this.A = string;
        this.o = new ArrayList<String>((Collection<String>)((Object)d.a("\u00f9", (Object)stringArray, (long)56280318188458236L) /* => java.util.Arrays.asList */));
        d.a("$", (Object)d.a("z", (Object)this, (long)136821608429824638L) /* => dev.hixo.b.C.t */, (Object)d.a("\u00f9", (Object)stringArray, (long)56280318188458236L) /* => java.util.Arrays.asList */, (long)67984373811676221L) /* => java.util.Set.addAll */;
    }

    public static C G(String string, List<String> list) {
        C c2 = new C(string, new String[0]);
        d.a("$", (Object)d.a("z", (Object)c2, (long)145768602649752050L) /* => dev.hixo.b.C.o */, (long)191130606908305482L) /* => java.util.List.clear */;
        d.a("$", (Object)d.a("z", (Object)c2, (long)145768602649752050L) /* => dev.hixo.b.C.o */, list, (long)136382452326560341L) /* => java.util.List.addAll */;
        return c2;
    }

    public String p() {
        return d.a("z", (Object)this, (long)166292743308844611L) /* => dev.hixo.b.C.A */;
    }

    public List<String> A() {
        return d.a("z", (Object)this, (long)145768602649752050L) /* => dev.hixo.b.C.o */;
    }

    public Set<String> Y() {
        return d.a("z", (Object)this, (long)136821608429824638L) /* => dev.hixo.b.C.t */;
    }

    public boolean P(String string) {
        return (boolean)d.a("$", (Object)d.a("z", (Object)this, (long)136821608429824638L) /* => dev.hixo.b.C.t */, (Object)string, (long)117209702718349922L) /* => java.util.Set.contains */;
    }

    public boolean i() {
        return (boolean)d.a("$", (Object)d.a("z", (Object)this, (long)136821608429824638L) /* => dev.hixo.b.C.t */, (long)56513549583578018L) /* => java.util.Set.isEmpty */;
    }

    public void P(String string, boolean bl) {
        if (bl) {
            d.a("$", (Object)d.a("z", (Object)this, (long)136821608429824638L) /* => dev.hixo.b.C.t */, (Object)string, (long)56498836055017186L) /* => java.util.Set.add */;
        } else {
            d.a("$", (Object)d.a("z", (Object)this, (long)136821608429824638L) /* => dev.hixo.b.C.t */, (Object)string, (long)93799606690088841L) /* => java.util.Set.remove */;
        }
    }

    public void o(String string) {
        d.a("$", (Object)this, (Object)string, (d.a("$", (Object)this, (Object)string, (long)160647062577305305L) /* => dev.hixo.b.C.P */ == false ? 1 : 0) != 0, (long)165299691735140744L) /* => dev.hixo.b.C.P */;
    }

    public String Z() {
        StringBuilder stringBuilder = new StringBuilder();
        CallSite callSite = d.a("$", (Object)d.a("z", (Object)this, (long)136821608429824638L) /* => dev.hixo.b.C.t */, (long)33822594988307322L) /* => java.util.Set.iterator */;
        while (d.a("$", (Object)callSite, (long)175361412755674352L) /* => java.util.Iterator.hasNext */ != false) {
            String string = (String)((Object)d.a("$", (Object)callSite, (long)64633749944946827L) /* => java.util.Iterator.next */);
            if (d.a("$", (Object)stringBuilder, (long)55478489624059755L) /* => java.lang.StringBuilder.length */ > 0) {
                d.a("$", (Object)stringBuilder, (char)',', (long)170414562223323178L) /* => java.lang.StringBuilder.append */;
            }
            d.a("$", (Object)stringBuilder, (Object)string, (long)86542515882976328L) /* => java.lang.StringBuilder.append */;
        }
        return d.a("$", (Object)stringBuilder, (long)59411206276622891L) /* => java.lang.StringBuilder.toString */;
    }

    public void a(String string) {
        String string2;
        int n2;
        block7: {
            block8: {
                block6: {
                    block5: {
                        d.a("$", (Object)d.a("z", (Object)this, (long)136821608429824638L) /* => dev.hixo.b.C.t */, (long)44473385465221407L) /* => java.util.Set.clear */;
                        n2 = g.L;
                        string2 = string;
                        if (n2 != 0) break block5;
                        if (string2 == null) break block6;
                        string2 = string;
                    }
                    if (n2 != 0) break block7;
                    if (d.a("$", string2, (long)113060954469207873L) /* => java.lang.String.isBlank */ == false) break block8;
                }
                return;
            }
            string2 = string;
        }
        CallSite callSite = d.a("$", string2, (Object)",", (long)198340420186474006L) /* => java.lang.String.split */;
        int n3 = ((CallSite)callSite).length;
        int n4 = 0;
        while (n4 < n3) {
            block9: {
                block10: {
                    C c2;
                    CallSite callSite2;
                    block11: {
                        CallSite callSite3 = callSite[n4];
                        callSite2 = d.a("$", (Object)callSite3, (long)95323155317830449L) /* => java.lang.String.trim */;
                        if (n2 != 0) break block9;
                        if (d.a("$", (Object)callSite2, (long)139567490040770223L) /* => java.lang.String.isEmpty */ != false) break block10;
                        c2 = this;
                        if (n2 != 0) break block11;
                        if (d.a("$", (Object)d.a("z", (Object)c2, (long)145768602649752050L) /* => dev.hixo.b.C.o */, (Object)callSite2, (long)68818840312729418L) /* => java.util.List.contains */ == false) break block10;
                        c2 = this;
                    }
                    d.a("$", (Object)d.a("z", (Object)c2, (long)136821608429824638L) /* => dev.hixo.b.C.t */, (Object)callSite2, (long)56498836055017186L) /* => java.util.Set.add */;
                }
                ++n4;
            }
            if (n2 == 0) continue;
        }
    }

    public String x() {
        if (d.a("$", (Object)d.a("z", (Object)this, (long)136821608429824638L) /* => dev.hixo.b.C.t */, (long)56513549583578018L) /* => java.util.Set.isEmpty */ != false) {
            return "-";
        }
        return d.a("$", (Object)d.a("$", (Object)d.a("$", (Object)d.a("$", (Object)new StringBuilder(), (int)d.a("$", (Object)d.a("z", (Object)this, (long)136821608429824638L) /* => dev.hixo.b.C.t */, (long)114988236337211727L) /* => java.util.Set.size */, (long)32515713483113022L) /* => java.lang.StringBuilder.append */, (Object)"/", (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (int)d.a("$", (Object)d.a("z", (Object)this, (long)145768602649752050L) /* => dev.hixo.b.C.o */, (long)180194190084079702L) /* => java.util.List.size */, (long)32515713483113022L) /* => java.lang.StringBuilder.append */, (long)59411206276622891L) /* => java.lang.StringBuilder.toString */;
    }
}

