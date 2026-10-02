/*
 * RESTORED SOURCE — decompiled reconstruction, not the original files.
 * class: dev.hixo.Y.G
 */

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2684
 *  net.minecraft.class_2716
 *  net.minecraft.class_2743
 *  net.minecraft.class_2777
 *  net.minecraft.class_634
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package dev.hixo.Y;

import dev.hixo.M.d;
import dev.hixo.y.c_0;
import java.lang.invoke.CallSite;
import net.minecraft.class_2684;
import net.minecraft.class_2716;
import net.minecraft.class_2743;
import net.minecraft.class_2777;
import net.minecraft.class_634;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={class_634.class})
public abstract class G {
    @Inject(method={"sendChatMessage"}, at={@At(value="HEAD")}, cancellable=true)
    public void J(String string, CallbackInfo callbackInfo) {
        block3: {
            CallSite callSite;
            block5: {
                boolean bl;
                block4: {
                    String string2;
                    block2: {
                        bl = c_0.J;
                        string2 = string;
                        if (bl) break block2;
                        if (string2 == null) break block3;
                        string2 = string;
                    }
                    if (d.a("$", string2, (Object)".", (long)100670834987339679L) /* => java.lang.String.startsWith */ == false) break block3;
                    callSite = d.a("\u00fd", (long)71498313283647962L) /* => dev.hixo.Hixo.INSTANCE */;
                    if (bl) break block4;
                    if (callSite == null) break block3;
                    callSite = d.a("\u00fd", (long)71498313283647962L) /* => dev.hixo.Hixo.INSTANCE */;
                }
                if (bl) break block5;
                if (d.a("$", (Object)callSite, (long)142913085785962499L) /* => dev.hixo.Hixo.getCommandManager */ == null) break block3;
                callSite = d.a("\u00fd", (long)71498313283647962L) /* => dev.hixo.Hixo.INSTANCE */;
            }
            d.a("$", (Object)d.a("$", (Object)callSite, (long)142913085785962499L) /* => dev.hixo.Hixo.getCommandManager */, (Object)string, (long)95262853538165980L) /* => dev.hixo.P.T.o */;
            d.a("$", (Object)callbackInfo, (long)93974103570719951L) /* => org.spongepowered.asm.mixin.injection.callback.CallbackInfo.cancel */;
        }
    }

    @Inject(method={"onEntityVelocityUpdate"}, at={@At(value="HEAD")}, cancellable=true)
    public void O(class_2743 class_27432, CallbackInfo callbackInfo) {
    }

    @Inject(method={"onEntity"}, at={@At(value="HEAD")}, cancellable=true, require=0)
    public void l(class_2684 class_26842, CallbackInfo callbackInfo) {
        if (d.a("\u00fd", (long)57423885543036744L) /* => dev.hixo.M.s.S.a.Z */ != null && d.a("$", (Object)d.a("\u00fd", (long)57423885543036744L) /* => dev.hixo.M.s.S.a.Z */, (long)96089342888548907L) /* => dev.hixo.M.G.c */ != false && d.a("$", (Object)d.a("\u00fd", (long)57423885543036744L) /* => dev.hixo.M.s.S.a.Z */, (Object)class_26842, (long)60797035500065473L) /* => dev.hixo.M.s.S.a.C */ != false) {
            d.a("$", (Object)callbackInfo, (long)93974103570719951L) /* => org.spongepowered.asm.mixin.injection.callback.CallbackInfo.cancel */;
        }
    }

    @Inject(method={"onEntityPosition"}, at={@At(value="HEAD")}, cancellable=true, require=0)
    public void v(class_2777 class_27772, CallbackInfo callbackInfo) {
        if (d.a("\u00fd", (long)57423885543036744L) /* => dev.hixo.M.s.S.a.Z */ != null && d.a("$", (Object)d.a("\u00fd", (long)57423885543036744L) /* => dev.hixo.M.s.S.a.Z */, (long)96089342888548907L) /* => dev.hixo.M.G.c */ != false && d.a("$", (Object)d.a("\u00fd", (long)57423885543036744L) /* => dev.hixo.M.s.S.a.Z */, (Object)class_27772, (long)60797035500065473L) /* => dev.hixo.M.s.S.a.C */ != false) {
            d.a("$", (Object)callbackInfo, (long)93974103570719951L) /* => org.spongepowered.asm.mixin.injection.callback.CallbackInfo.cancel */;
        }
    }

    @Inject(method={"onEntitiesDestroy"}, at={@At(value="HEAD")}, cancellable=true)
    public void n(class_2716 class_27162, CallbackInfo callbackInfo) {
        if (d.a("\u00fd", (long)57423885543036744L) /* => dev.hixo.M.s.S.a.Z */ != null && d.a("$", (Object)d.a("\u00fd", (long)57423885543036744L) /* => dev.hixo.M.s.S.a.Z */, (long)96089342888548907L) /* => dev.hixo.M.G.c */ != false) {
            d.a("$", (Object)d.a("\u00fd", (long)57423885543036744L) /* => dev.hixo.M.s.S.a.Z */, (Object)class_27162, (long)60797035500065473L) /* => dev.hixo.M.s.S.a.C */;
        }
    }
}

