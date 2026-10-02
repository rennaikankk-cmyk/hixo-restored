/*
 * RESTORED SOURCE — decompiled reconstruction, not the original files.
 * class: dev.hixo.patch.HeldItemRendererPatch
 */

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1268
 *  net.minecraft.class_1799
 *  net.minecraft.class_1829
 *  net.minecraft.class_4587
 *  net.minecraft.class_4597
 *  net.minecraft.class_742
 *  net.minecraft.class_759
 */
package dev.hixo.patch;

import asm.patchify.annotation.Inject;
import asm.patchify.annotation.Patch;
import dev.hixo.M.d;
import dev.hixo.patch.CallbackInfo;
import java.lang.invoke.CallSite;
import net.minecraft.class_1268;
import net.minecraft.class_1799;
import net.minecraft.class_1829;
import net.minecraft.class_4587;
import net.minecraft.class_4597;
import net.minecraft.class_742;
import net.minecraft.class_759;

@Patch(value=class_759.class)
public class HeldItemRendererPatch {
    @Inject(method="renderFirstPersonItem", desc="(Lnet/minecraft/client/network/AbstractClientPlayerEntity;FFLnet/minecraft/util/Hand;FLnet/minecraft/item/ItemStack;FLnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;I)V")
    public static void onRenderFirstPersonItem(class_759 class_7592, class_742 class_7422, float f, float f2, class_1268 class_12682, float f3, class_1799 class_17992, float f4, class_4587 class_45872, class_4597 class_45972, int n2, CallbackInfo callbackInfo) {
        boolean bl;
        int n3;
        CallSite callSite;
        block13: {
            Object object;
            block14: {
                block12: {
                    block11: {
                        block10: {
                            CallSite callSite2;
                            block9: {
                                callSite = d.a("\u00fd", (long)123081311337954036L) /* => dev.hixo.M.s.K.p.k */;
                                n3 = CallbackInfo.i;
                                callSite2 = callSite;
                                if (n3 != 0) break block9;
                                if (callSite2 == null) break block10;
                                callSite2 = callSite;
                            }
                            if (d.a("$", (Object)callSite2, (long)96089342888548907L) /* => dev.hixo.M.G.c */ != false) break block11;
                        }
                        return;
                    }
                    if (class_12682 != d.a("\u00fd", (long)85943668217877665L) /* => net.minecraft.class_1268.field_5808 */) break block12;
                    object = d.a("$", (Object)class_17992, (long)89510314790192383L) /* => net.minecraft.class_1799.method_7909 */ instanceof class_1829;
                    if (n3 != 0) break block13;
                    if (object) break block14;
                }
                return;
            }
            object = bl = d.a("$", (Object)d.a("z", (Object)d.a("z", (Object)d.a("\u00f9", (long)179869930689441125L) /* => net.minecraft.class_310.method_1551 */, (long)129597241205579821L) /* => net.minecraft.class_310.field_1690 */, (long)127068279799713157L) /* => net.minecraft.class_315.field_1904 */, (long)91073722283869168L) /* => net.minecraft.class_304.method_1434 */;
        }
        if (n3 == 0) {
            if (f3 <= 0.0f && !bl) {
                return;
            }
            d.a("$", (Object)callbackInfo, (long)104461966334151429L) /* => dev.hixo.patch.CallbackInfo.cancel */;
            d.a("$", (Object)callSite, (Object)class_45872, (float)f3, (Object)d.a("$", (Object)class_7422, (long)136923312166365250L) /* => net.minecraft.class_742.method_6068 */, (float)f4, (long)101056691808491299L) /* => dev.hixo.M.s.K.p.U */;
        }
        boolean bl2 = d.a("$", (Object)class_7422, (long)136923312166365250L) /* => net.minecraft.class_742.method_6068 */ == d.a("\u00fd", (long)194515715450480306L) /* => net.minecraft.class_1306.field_6183 */;
        CallSite callSite3 = bl2 ? d.a("\u00fd", (long)34702619318713014L) /* => net.minecraft.class_811.field_4322 */ : d.a("\u00fd", (long)80535620650780411L) /* => net.minecraft.class_811.field_4321 */;
        boolean bl3 = bl2;
        if (n3 == 0) {
            bl3 = !bl3;
        }
        d.a("$", (Object)class_7592, (Object)class_7422, (Object)class_17992, (Object)callSite3, (boolean)bl3, (Object)class_45872, (Object)class_45972, (int)n2, (long)174676200955776570L) /* => net.minecraft.class_759.method_3233 */;
    }
}

