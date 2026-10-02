/*
 * RESTORED SOURCE — decompiled reconstruction, not the original files.
 * class: dev.hixo.patch.CallbackInfo
 */

/*
 * Decompiled with CFR 0.152.
 */
package dev.hixo.patch;

import dev.hixo.M.G;
import dev.hixo.M.d;

public final class CallbackInfo {
    public Object result;
    public boolean cancelled;
    public static int i;

    public CallbackInfo(Object object, boolean bl) {
        d.a("\u00e7", (Object)this, (Object)object, (long)159621490419341444L) /* => dev.hixo.patch.CallbackInfo.result */;
        d.a("\u00e7", (Object)this, (boolean)bl, (long)73708226413787498L) /* => dev.hixo.patch.CallbackInfo.cancelled */;
        int n2 = i;
        if (G.L) {
            i = ++n2;
        }
    }

    public static CallbackInfo create(Object object) {
        return new CallbackInfo(object, false);
    }

    public void cancel() {
        d.a("\u00e7", (Object)this, (boolean)true, (long)73708226413787498L) /* => dev.hixo.patch.CallbackInfo.cancelled */;
    }
}

