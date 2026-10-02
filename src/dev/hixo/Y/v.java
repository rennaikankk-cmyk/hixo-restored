/*
 * RESTORED SOURCE — decompiled reconstruction, not the original files.
 * class: dev.hixo.Y.v
 */

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2596
 *  net.minecraft.class_2879
 *  net.minecraft.class_8673
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package dev.hixo.Y;

import dev.hixo.M.d;
import dev.hixo.y.c_0;
import java.lang.invoke.CallSite;
import net.minecraft.class_2596;
import net.minecraft.class_2879;
import net.minecraft.class_8673;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={class_8673.class})
public abstract class v {
    @Inject(method={"sendPacket"}, at={@At(value="HEAD")}, cancellable=true)
    private void W(class_2596<?> class_25962, CallbackInfo callbackInfo) {
        block5: {
            Object object;
            block7: {
                CallSite callSite;
                boolean bl;
                block6: {
                    block4: {
                        bl = c_0.J;
                        callSite = d.a("\u00fd", (long)55074934605809673L) /* => dev.hixo.M.s.Y.e.x */;
                        if (bl) break block4;
                        if (callSite == null) break block5;
                        callSite = d.a("\u00fd", (long)55074934605809673L) /* => dev.hixo.M.s.Y.e.x */;
                    }
                    if (bl) break block6;
                    if (d.a("$", (Object)callSite, (long)96089342888548907L) /* => dev.hixo.M.G.c */ == false) break block5;
                    callSite = d.a("\u00fd", (long)55074934605809673L) /* => dev.hixo.M.s.Y.e.x */;
                }
                object = d.a("$", (Object)d.a("z", (Object)callSite, (long)193054601946402007L) /* => dev.hixo.M.s.Y.e.B */, (long)65580906021680841L) /* => dev.hixo.b.g.x */;
                if (bl) break block7;
                if (object == false) break block5;
                object = class_25962 instanceof class_2879;
            }
            if (object != false) {
                d.a("$", (Object)callbackInfo, (long)93974103570719951L) /* => org.spongepowered.asm.mixin.injection.callback.CallbackInfo.cancel */;
            }
        }
    }
}

