/*
 * RESTORED SOURCE — decompiled reconstruction, not the original files.
 * class: dev.hixo.agent.Strings
 */

/*
 * Decompiled with CFR 0.152.
 */
package dev.hixo.agent;

import dev.hixo.M.d;
import java.lang.invoke.CallSite;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class Strings {
    private static final byte[] K = new byte[]{90, -61, 17, -98, 116, 40, -15, 107, 13, -92, 55, -30, -112, 76, -72, 19};
    private static final Map<String, String> CACHE = new ConcurrentHashMap<String, String>();
    public static boolean Y;

    private Strings() {
    }

    public static String d(String string) {
        boolean bl;
        block7: {
            String string2;
            block6: {
                String string3;
                bl = Y;
                String string4 = string;
                if (!bl) {
                    if (string4 == null) {
                        return null;
                    }
                    string4 = (String)((Object)d.a("$", (Object)d.a("\u00fd", (long)92586687728639908L) /* => dev.hixo.agent.Strings.CACHE */, (Object)string, (long)150360683669181890L) /* => java.util.Map.get */);
                }
                string2 = string3 = string4;
                if (bl) break block6;
                if (string2 == null) break block7;
                string2 = string3;
            }
            return string2;
        }
        CallSite callSite = d.a("$", (Object)d.a("\u00f9", (long)167862464166757431L) /* => java.util.Base64.getDecoder */, (Object)string, (long)66735150800830321L) /* => java.util.Base64$Decoder.decode */;
        byte[] byArray = new byte[((CallSite)callSite).length];
        for (int i2 = 0; i2 < ((CallSite)callSite).length; ++i2) {
            byArray[i2] = (byte)(callSite[i2] ^ d.a("\u00fd", (long)193015192154531787L) /* => dev.hixo.agent.Strings.K */[i2 % ((CallSite)d.a("\u00fd", (long)193015192154531787L) /* => dev.hixo.agent.Strings.K */).length] ^ (byte)(i2 * 31));
            if (!bl) continue;
        }
        String string5 = new String(byArray, (Charset)((Object)d.a("\u00fd", (long)42196630579865547L) /* => java.nio.charset.StandardCharsets.UTF_8 */));
        d.a("$", (Object)d.a("\u00fd", (long)92586687728639908L) /* => dev.hixo.agent.Strings.CACHE */, (Object)string, (Object)string5, (long)87609561069083692L) /* => java.util.Map.put */;
        return string5;
    }
}

