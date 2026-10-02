/*
 * RESTORED SOURCE — decompiled reconstruction, not the original files.
 * class: dev.hixo.Y.C
 */

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_744
 *  net.minecraft.class_746
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.At$Shift
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package dev.hixo.Y;

import dev.hixo.M.d;
import dev.hixo.y.c_0;
import java.lang.invoke.CallSite;
import net.minecraft.class_744;
import net.minecraft.class_746;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={class_746.class})
public abstract class C {
    @Shadow
    public class_744 W;
    private float v;
    private float d;
    private double y;
    private boolean F;
    private boolean G;

    @Inject(method={"tickMovement"}, at={@At(value="INVOKE", target="Lnet/minecraft/client/tutorial/TutorialManager;onMovement(Lnet/minecraft/client/input/Input;)V", shift=At.Shift.AFTER)})
    private void k(CallbackInfo callbackInfo) {
        dev.hixo.M.d.a("\u00f9", (Object)((class_746)this), (long)61056521565285331L) /* => dev.hixo.f.J.D.Z */;
    }

    @Inject(method={"sendMovementPackets"}, at={@At(value="HEAD")})
    private void W(CallbackInfo callbackInfo) {
        block11: {
            CallSite callSite;
            CallSite callSite2;
            block10: {
                boolean bl;
                block8: {
                    block9: {
                        bl = c_0.J;
                        CallSite callSite3 = dev.hixo.M.d.a("\u00f9", (long)52654057433724283L) /* => dev.hixo.f.B.G.w */;
                        if (bl) break block8;
                        if (callSite3 == null) break block9;
                        callSite2 = dev.hixo.M.d.a("\u00f9", (long)179869930689441125L) /* => net.minecraft.class_310.method_1551 */;
                        if (bl) break block8;
                        if (dev.hixo.M.d.a("z", (Object)callSite2, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */ != null) {
                            dev.hixo.M.d.a("\u00e7", (Object)this, (float)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)callSite2, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (long)68578805942358681L) /* => net.minecraft.class_746.method_36454 */, (long)130746693059063439L);
                            dev.hixo.M.d.a("\u00e7", (Object)this, (float)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)callSite2, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (long)130683892682073266L) /* => net.minecraft.class_746.method_36455 */, (long)63994705663389344L);
                            dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)callSite2, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (float)dev.hixo.M.d.a("z", (Object)callSite3, (long)164061588253527562L) /* => dev.hixo.f.V.C.l */, (long)55689365516132110L) /* => net.minecraft.class_746.method_36456 */;
                            dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)callSite2, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (float)dev.hixo.M.d.a("z", (Object)callSite3, (long)200440889690670743L) /* => dev.hixo.f.V.C.r */, (long)92081415245859107L) /* => net.minecraft.class_746.method_36457 */;
                        }
                    }
                    dev.hixo.M.d.a("\u00e7", (Object)this, (boolean)false, (long)67911658192087485L);
                }
                callSite = callSite2 = dev.hixo.M.d.a("\u00fd", (long)196543159768037306L) /* => dev.hixo.M.s.S.K.G */;
                if (bl) break block10;
                if (callSite == null) break block11;
                callSite = callSite2;
            }
            if (dev.hixo.M.d.a("$", (Object)callSite, (long)159297969125715197L) != false) {
                class_746 class_7462 = (class_746)this;
                dev.hixo.M.d.a("\u00e7", (Object)this, (double)dev.hixo.M.d.a("$", (Object)class_7462, (long)90587010555304668L) /* => net.minecraft.class_746.method_23318 */, (long)171602093660119215L);
                dev.hixo.M.d.a("\u00e7", (Object)this, (boolean)dev.hixo.M.d.a("$", (Object)class_7462, (long)175288240290473570L) /* => net.minecraft.class_746.method_24828 */, (long)166415183211595550L);
                reference var6_6 = dev.hixo.M.d.a("z", (Object)this, (long)171602093660119215L) + dev.hixo.M.d.a("$", (Object)callSite2, (long)119739508187023639L);
                dev.hixo.M.d.a("$", (Object)class_7462, (double)dev.hixo.M.d.a("$", (Object)class_7462, (long)96335688942052006L) /* => net.minecraft.class_746.method_23317 */, (double)var6_6, (double)dev.hixo.M.d.a("$", (Object)class_7462, (long)47103109275691764L) /* => net.minecraft.class_746.method_23321 */, (long)112290044443205533L);
                dev.hixo.M.d.a("$", (Object)class_7462, (boolean)false, (long)151684219002268013L);
                dev.hixo.M.d.a("\u00e7", (Object)this, (boolean)true, (long)67911658192087485L);
            }
        }
    }

    @Inject(method={"sendMovementPackets"}, at={@At(value="RETURN")})
    private void U(CallbackInfo callbackInfo) {
        CallSite callSite;
        Object object;
        if (dev.hixo.M.d.a("z", (Object)this, (long)67911658192087485L) != false) {
            object = (class_746)this;
            dev.hixo.M.d.a("$", (Object)object, (double)dev.hixo.M.d.a("$", (Object)object, (long)96335688942052006L) /* => net.minecraft.class_746.method_23317 */, (double)dev.hixo.M.d.a("z", (Object)this, (long)171602093660119215L), (double)dev.hixo.M.d.a("$", (Object)object, (long)47103109275691764L) /* => net.minecraft.class_746.method_23321 */, (long)112290044443205533L);
            dev.hixo.M.d.a("$", (Object)object, (boolean)dev.hixo.M.d.a("z", (Object)this, (long)166415183211595550L), (long)151684219002268013L);
            dev.hixo.M.d.a("\u00e7", (Object)this, (boolean)false, (long)67911658192087485L);
        }
        if ((object = dev.hixo.M.d.a("\u00f9", (long)52654057433724283L) /* => dev.hixo.f.B.G.w */) != null && dev.hixo.M.d.a("z", (Object)(callSite = dev.hixo.M.d.a("\u00f9", (long)179869930689441125L) /* => net.minecraft.class_310.method_1551 */), (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */ != null) {
            dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)callSite, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (float)dev.hixo.M.d.a("z", (Object)this, (long)130746693059063439L), (long)55689365516132110L) /* => net.minecraft.class_746.method_36456 */;
            dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)callSite, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (float)dev.hixo.M.d.a("z", (Object)this, (long)63994705663389344L), (long)92081415245859107L) /* => net.minecraft.class_746.method_36457 */;
        }
    }
}

