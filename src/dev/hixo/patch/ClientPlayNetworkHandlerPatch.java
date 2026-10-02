/*
 * RESTORED SOURCE — decompiled reconstruction, not the original files.
 * class: dev.hixo.patch.ClientPlayNetworkHandlerPatch
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
 *  net.minecraft.class_8143
 */
package dev.hixo.patch;

import asm.patchify.annotation.Inject;
import asm.patchify.annotation.Patch;
import dev.hixo.M.d;
import dev.hixo.patch.CallbackInfo;
import java.lang.invoke.CallSite;
import net.minecraft.class_2684;
import net.minecraft.class_2716;
import net.minecraft.class_2743;
import net.minecraft.class_2777;
import net.minecraft.class_634;
import net.minecraft.class_8143;

@Patch(value=class_634.class)
public class ClientPlayNetworkHandlerPatch {
    @Inject(method="sendChatMessage", desc="(Ljava/lang/String;)V")
    public static void onSendChatMessage(class_634 class_6342, String string, CallbackInfo callbackInfo) {
        if (string != null && d.a("$", string, (Object)".", (long)100670834987339679L) /* => java.lang.String.startsWith */ != false && d.a("\u00fd", (long)71498313283647962L) /* => dev.hixo.Hixo.INSTANCE */ != null && d.a("$", (Object)d.a("\u00fd", (long)71498313283647962L) /* => dev.hixo.Hixo.INSTANCE */, (long)142913085785962499L) /* => dev.hixo.Hixo.getCommandManager */ != null) {
            d.a("$", (Object)d.a("$", (Object)d.a("\u00fd", (long)71498313283647962L) /* => dev.hixo.Hixo.INSTANCE */, (long)142913085785962499L) /* => dev.hixo.Hixo.getCommandManager */, (Object)string, (long)95262853538165980L) /* => dev.hixo.P.T.o */;
            d.a("$", (Object)callbackInfo, (long)104461966334151429L) /* => dev.hixo.patch.CallbackInfo.cancel */;
        }
    }

    @Inject(method="onEntityVelocityUpdate", desc="(Lnet/minecraft/network/packet/s2c/play/EntityVelocityUpdateS2CPacket;)V")
    public static void onEntityVelocityUpdate(class_634 class_6342, class_2743 class_27432, CallbackInfo callbackInfo) {
        block8: {
            block10: {
                CallSite callSite;
                int n2;
                block9: {
                    block7: {
                        CallSite callSite2;
                        CallSite callSite3;
                        n2 = CallbackInfo.i;
                        if (class_27432 == null) {
                            return;
                        }
                        CallSite callSite4 = callSite3 = d.a("\u00f9", (long)179869930689441125L) /* => net.minecraft.class_310.method_1551 */;
                        if (n2 == 0) {
                            if (callSite4 == null) {
                                return;
                            }
                            callSite4 = callSite3;
                        }
                        if ((callSite2 = d.a("z", (Object)callSite4, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */) == null || d.a("$", (Object)class_27432, (long)120268019544200973L) /* => net.minecraft.class_2743.method_11818 */ != d.a("$", (Object)callSite2, (long)108870003427537288L) /* => net.minecraft.class_1297.method_5628 */) {
                            return;
                        }
                        callSite = d.a("\u00fd", (long)132476946628513321L) /* => dev.hixo.M.s.S.Y.k */;
                        if (n2 != 0) break block7;
                        if (callSite == null) break block8;
                        callSite = d.a("\u00fd", (long)132476946628513321L) /* => dev.hixo.M.s.S.Y.k */;
                    }
                    if (n2 != 0) break block9;
                    if (d.a("$", (Object)callSite, (long)96089342888548907L) /* => dev.hixo.M.G.c */ == false) break block8;
                    callSite = d.a("\u00fd", (long)132476946628513321L) /* => dev.hixo.M.s.S.Y.k */;
                }
                CallSite callSite5 = d.a("$", (Object)callSite, (Object)class_27432, (long)62976185950709368L) /* => dev.hixo.M.s.S.Y.g */;
                if (n2 != 0) break block10;
                d.a("$", (Object)d.a("\u00fd", (long)132476946628513321L) /* => dev.hixo.M.s.S.Y.k */, (Object)class_27432, (long)106820225135644100L) /* => dev.hixo.M.s.S.Y.N */;
                if (callSite5 == false) break block8;
                d.a("$", (Object)callbackInfo, (long)104461966334151429L) /* => dev.hixo.patch.CallbackInfo.cancel */;
            }
            return;
        }
    }

    @Inject(method="onEntityDamage", desc="(Lnet/minecraft/network/packet/s2c/play/EntityDamageS2CPacket;)V")
    public static void onEntityDamage(class_634 class_6342, class_8143 class_81432, CallbackInfo callbackInfo) {
        if (class_81432 == null) {
            return;
        }
        CallSite callSite = d.a("\u00f9", (long)179869930689441125L) /* => net.minecraft.class_310.method_1551 */;
        if (callSite == null || d.a("z", (Object)callSite, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */ == null) {
            return;
        }
        if (d.a("$", (Object)class_81432, (long)81094730534504105L) /* => net.minecraft.class_8143.comp_1267 */ != d.a("$", (Object)d.a("z", (Object)callSite, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (long)49557901471620191L) /* => net.minecraft.class_746.method_5628 */) {
            return;
        }
        if (d.a("\u00fd", (long)132476946628513321L) /* => dev.hixo.M.s.S.Y.k */ != null && d.a("$", (Object)d.a("\u00fd", (long)132476946628513321L) /* => dev.hixo.M.s.S.Y.k */, (long)96089342888548907L) /* => dev.hixo.M.G.c */ != false) {
            d.a("$", (Object)d.a("\u00fd", (long)132476946628513321L) /* => dev.hixo.M.s.S.Y.k */, (long)112901097464701952L) /* => dev.hixo.M.s.S.Y.Q */;
        }
    }

    @Inject(method="onEntity", desc="(Lnet/minecraft/network/packet/s2c/play/EntityS2CPacket;)V")
    public static void onEntity(class_634 class_6342, class_2684 class_26842, CallbackInfo callbackInfo) {
        if (d.a("\u00fd", (long)57423885543036744L) /* => dev.hixo.M.s.S.a.Z */ != null && d.a("$", (Object)d.a("\u00fd", (long)57423885543036744L) /* => dev.hixo.M.s.S.a.Z */, (long)96089342888548907L) /* => dev.hixo.M.G.c */ != false && d.a("$", (Object)d.a("\u00fd", (long)57423885543036744L) /* => dev.hixo.M.s.S.a.Z */, (Object)class_26842, (long)60797035500065473L) /* => dev.hixo.M.s.S.a.C */ != false) {
            d.a("$", (Object)callbackInfo, (long)104461966334151429L) /* => dev.hixo.patch.CallbackInfo.cancel */;
        }
    }

    @Inject(method="onEntityPosition", desc="(Lnet/minecraft/network/packet/s2c/play/EntityPositionS2CPacket;)V")
    public static void onEntityPosition(class_634 class_6342, class_2777 class_27772, CallbackInfo callbackInfo) {
        if (d.a("\u00fd", (long)57423885543036744L) /* => dev.hixo.M.s.S.a.Z */ != null && d.a("$", (Object)d.a("\u00fd", (long)57423885543036744L) /* => dev.hixo.M.s.S.a.Z */, (long)96089342888548907L) /* => dev.hixo.M.G.c */ != false && d.a("$", (Object)d.a("\u00fd", (long)57423885543036744L) /* => dev.hixo.M.s.S.a.Z */, (Object)class_27772, (long)60797035500065473L) /* => dev.hixo.M.s.S.a.C */ != false) {
            d.a("$", (Object)callbackInfo, (long)104461966334151429L) /* => dev.hixo.patch.CallbackInfo.cancel */;
        }
    }

    @Inject(method="onEntitiesDestroy", desc="(Lnet/minecraft/network/packet/s2c/play/EntitiesDestroyS2CPacket;)V")
    public static void onEntitiesDestroy(class_634 class_6342, class_2716 class_27162, CallbackInfo callbackInfo) {
        if (d.a("\u00fd", (long)57423885543036744L) /* => dev.hixo.M.s.S.a.Z */ != null && d.a("$", (Object)d.a("\u00fd", (long)57423885543036744L) /* => dev.hixo.M.s.S.a.Z */, (long)96089342888548907L) /* => dev.hixo.M.G.c */ != false) {
            d.a("$", (Object)d.a("\u00fd", (long)57423885543036744L) /* => dev.hixo.M.s.S.a.Z */, (Object)class_27162, (long)60797035500065473L) /* => dev.hixo.M.s.S.a.C */;
        }
    }
}

