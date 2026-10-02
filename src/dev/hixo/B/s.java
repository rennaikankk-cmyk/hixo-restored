/*
 * RESTORED SOURCE — decompiled reconstruction, not the original files.
 * class: dev.hixo.B.s
 */

/*
 * Decompiled with CFR 0.152.
 */
package dev.hixo.b;

import dev.hixo.M.G;
import dev.hixo.M.d;
import dev.hixo.b.g;
import java.lang.invoke.CallSite;
import java.util.List;

public class s {
    private final String l;
    private String O;
    private final List<String> M;

    public s(String string, String string2, String ... stringArray) {
        this.l = string;
        d.a("\u00e7", (Object)this, (String)string2, (long)83740568492560250L) /* => dev.hixo.b.s.O */;
        this.M = d.a("\u00f9", (Object)stringArray, (long)56280318188458236L) /* => java.util.Arrays.asList */;
    }

    public boolean P(String string) {
        return (boolean)d.a("$", (Object)d.a("z", (Object)this, (long)83740568492560250L) /* => dev.hixo.b.s.O */, (Object)string, (long)106044803757638707L) /* => java.lang.String.equalsIgnoreCase */;
    }

    public String I() {
        return d.a("z", (Object)this, (long)83740568492560250L) /* => dev.hixo.b.s.O */;
    }

    public String O() {
        return d.a("z", (Object)this, (long)187140318657694515L) /* => dev.hixo.b.s.l */;
    }

    public void w(String string) {
        d.a("\u00e7", (Object)this, (String)string, (long)83740568492560250L) /* => dev.hixo.b.s.O */;
    }

    public List<String> j() {
        return d.a("z", (Object)this, (long)32492982352364059L) /* => dev.hixo.b.s.M */;
    }

    public void D() {
        CallSite callSite = d.a("$", (Object)d.a("z", (Object)this, (long)32492982352364059L) /* => dev.hixo.b.s.M */, (Object)d.a("z", (Object)this, (long)83740568492560250L) /* => dev.hixo.b.s.O */, (long)65761006230833671L) /* => java.util.List.indexOf */;
        d.a("\u00e7", (Object)this, (String)((String)((Object)d.a("$", (Object)d.a("z", (Object)this, (long)32492982352364059L) /* => dev.hixo.b.s.M */, (int)((callSite + true) % d.a("$", (Object)d.a("z", (Object)this, (long)32492982352364059L) /* => dev.hixo.b.s.M */, (long)180194190084079702L) /* => java.util.List.size */), (long)196824017790916210L) /* => java.util.List.get */)), (long)83740568492560250L) /* => dev.hixo.b.s.O */;
        int n2 = g.L;
        if (G.L) {
            g.L = ++n2;
        }
    }
}

