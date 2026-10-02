/*
 * RESTORED SOURCE — decompiled reconstruction, not the original files.
 * class: dev.hixo.patch.ClientCommonNetworkHandlerPatch
 */

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2596
 *  net.minecraft.class_2824
 *  net.minecraft.class_2828
 *  net.minecraft.class_2879
 *  net.minecraft.class_2885
 *  net.minecraft.class_8673
 */
package dev.hixo.patch;

import asm.patchify.annotation.Inject;
import asm.patchify.annotation.Patch;
import dev.hixo.M.G;
import dev.hixo.M.d;
import dev.hixo.patch.CallbackInfo;
import java.lang.invoke.CallSite;
import net.minecraft.class_2596;
import net.minecraft.class_2824;
import net.minecraft.class_2828;
import net.minecraft.class_2879;
import net.minecraft.class_2885;
import net.minecraft.class_8673;

@Patch(value=class_8673.class)
public class ClientCommonNetworkHandlerPatch {
    @Inject(method="sendPacket", desc="(Lnet/minecraft/network/packet/Packet;)V")
    public static void onSendPacket(class_8673 class_86732, class_2596<?> class_28282, CallbackInfo callbackInfo) {
        block27: {
            class_2828 class_28283;
            block29: {
                block30: {
                    Object object;
                    int n2;
                    block28: {
                        CallSite callSite;
                        block26: {
                            block24: {
                                CallSite callSite2;
                                block25: {
                                    block23: {
                                        block21: {
                                            CallSite callSite3;
                                            block22: {
                                                block20: {
                                                    block17: {
                                                        Object object2;
                                                        block19: {
                                                            CallSite callSite4;
                                                            block18: {
                                                                block16: {
                                                                    n2 = CallbackInfo.i;
                                                                    if (d.a("\u00fd", (long)196543159768037306L) /* => dev.hixo.M.s.S.K.G */ != null && class_28282 instanceof class_2824) {
                                                                        d.a("$", (Object)d.a("\u00fd", (long)196543159768037306L) /* => dev.hixo.M.s.S.K.G */, (long)191421872219967168L) /* => dev.hixo.M.s.S.K.T */;
                                                                    }
                                                                    callSite4 = d.a("\u00fd", (long)55074934605809673L) /* => dev.hixo.M.s.Y.e.x */;
                                                                    if (n2 != 0) break block16;
                                                                    if (callSite4 == null) break block17;
                                                                    callSite4 = d.a("\u00fd", (long)55074934605809673L) /* => dev.hixo.M.s.Y.e.x */;
                                                                }
                                                                if (n2 != 0) break block18;
                                                                if (d.a("$", (Object)callSite4, (long)96089342888548907L) /* => dev.hixo.M.G.c */ == false) break block17;
                                                                callSite4 = d.a("\u00fd", (long)55074934605809673L) /* => dev.hixo.M.s.Y.e.x */;
                                                            }
                                                            object2 = d.a("$", (Object)d.a("z", (Object)callSite4, (long)193054601946402007L) /* => dev.hixo.M.s.Y.e.B */, (long)65580906021680841L) /* => dev.hixo.b.g.x */;
                                                            if (n2 != 0) break block19;
                                                            if (object2 == false) break block17;
                                                            object2 = class_28282 instanceof class_2879;
                                                        }
                                                        if (object2 != false) {
                                                            d.a("$", (Object)callbackInfo, (long)104461966334151429L) /* => dev.hixo.patch.CallbackInfo.cancel */;
                                                            return;
                                                        }
                                                    }
                                                    callSite3 = d.a("\u00fd", (long)143323006283238527L) /* => dev.hixo.M.s.O.s.U */;
                                                    if (n2 != 0) break block20;
                                                    if (callSite3 == null) break block21;
                                                    callSite3 = d.a("\u00fd", (long)143323006283238527L) /* => dev.hixo.M.s.O.s.U */;
                                                }
                                                if (n2 != 0) break block22;
                                                if (d.a("$", (Object)callSite3, (long)96089342888548907L) /* => dev.hixo.M.G.c */ == false) break block21;
                                                callSite3 = d.a("\u00fd", (long)143323006283238527L) /* => dev.hixo.M.s.O.s.U */;
                                            }
                                            if (d.a("$", (Object)callSite3, class_28282, (long)52107471946844975L) /* => dev.hixo.M.s.O.s.q */ != false) {
                                                d.a("$", (Object)callbackInfo, (long)104461966334151429L) /* => dev.hixo.patch.CallbackInfo.cancel */;
                                                return;
                                            }
                                        }
                                        callSite2 = d.a("\u00fd", (long)132476946628513321L) /* => dev.hixo.M.s.S.Y.k */;
                                        if (n2 != 0) break block23;
                                        if (callSite2 == null) break block24;
                                        callSite2 = d.a("\u00fd", (long)132476946628513321L) /* => dev.hixo.M.s.S.Y.k */;
                                    }
                                    if (n2 != 0) break block25;
                                    if (d.a("$", (Object)callSite2, class_28282, (long)134241760416773246L) /* => dev.hixo.M.s.S.Y.z */ == false) break block24;
                                    callSite2 = d.a("\u00fd", (long)132476946628513321L) /* => dev.hixo.M.s.S.Y.k */;
                                }
                                d.a("$", (Object)callSite2, class_28282, (long)138612788673900881L) /* => dev.hixo.M.s.S.Y.d */;
                                d.a("$", (Object)callbackInfo, (long)104461966334151429L) /* => dev.hixo.patch.CallbackInfo.cancel */;
                                return;
                            }
                            callSite = d.a("\u00fd", (long)126365528766909072L) /* => dev.hixo.M.s.H.S.R */;
                            if (n2 != 0) break block26;
                            if (callSite == null) break block27;
                            callSite = d.a("\u00fd", (long)126365528766909072L) /* => dev.hixo.M.s.H.S.R */;
                        }
                        object = d.a("$", (Object)callSite, (long)96089342888548907L) /* => dev.hixo.M.G.c */;
                        if (n2 != 0) break block28;
                        if (object == false) break block27;
                        class_28283 = class_28282;
                        if (n2 != 0) break block29;
                        object = class_28283 instanceof class_2828;
                    }
                    if (object == false) break block30;
                    class_28283 = class_28282;
                    if (n2 != 0) break block29;
                    class_2828 class_28284 = class_28283;
                    if (d.a("$", (Object)class_28284, (long)87497428456545609L) /* => net.minecraft.class_2828.method_36172 */ == false) break block30;
                    d.a("$", (Object)d.a("\u00fd", (long)126365528766909072L) /* => dev.hixo.M.s.H.S.R */, (Object)class_28284, (long)97657287600419451L) /* => dev.hixo.M.s.H.S.o */;
                    if (n2 == 0) break block27;
                    G.L = !G.L;
                }
                class_28283 = class_28282;
            }
            if (class_28283 instanceof class_2885) {
                d.a("$", (Object)d.a("\u00fd", (long)126365528766909072L) /* => dev.hixo.M.s.H.S.R */, (long)180418143291270187L) /* => dev.hixo.M.s.H.S.y */;
            }
        }
    }
}

