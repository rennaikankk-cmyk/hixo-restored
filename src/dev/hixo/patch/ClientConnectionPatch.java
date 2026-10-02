/*
 * RESTORED SOURCE — decompiled reconstruction, not the original files.
 * class: dev.hixo.patch.ClientConnectionPatch
 */

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.channel.ChannelHandlerContext
 *  net.minecraft.class_2535
 *  net.minecraft.class_2596
 */
package dev.hixo.patch;

import asm.patchify.annotation.Inject;
import asm.patchify.annotation.Patch;
import dev.hixo.M.d;
import dev.hixo.patch.CallbackInfo;
import io.netty.channel.ChannelHandlerContext;
import java.lang.invoke.CallSite;
import net.minecraft.class_2535;
import net.minecraft.class_2596;

@Patch(value=class_2535.class)
public class ClientConnectionPatch {
    @Inject(method="channelRead0", desc="(Lio/netty/channel/ChannelHandlerContext;Lnet/minecraft/network/packet/Packet;)V")
    public static void onChannelRead(class_2535 class_25352, ChannelHandlerContext channelHandlerContext, class_2596<?> class_25962, CallbackInfo callbackInfo) {
        block5: {
            CallSite callSite;
            block7: {
                int n2;
                block6: {
                    block4: {
                        n2 = CallbackInfo.i;
                        if (class_25962 == null) {
                            return;
                        }
                        callSite = d.a("\u00fd", (long)132476946628513321L) /* => dev.hixo.M.s.S.Y.k */;
                        if (n2 != 0) break block4;
                        if (callSite == null) break block5;
                        callSite = d.a("\u00fd", (long)132476946628513321L) /* => dev.hixo.M.s.S.Y.k */;
                    }
                    if (n2 != 0) break block6;
                    if (d.a("$", (Object)callSite, (long)132966216907989006L) /* => dev.hixo.M.s.S.Y.i */ == false) break block5;
                    callSite = d.a("\u00fd", (long)132476946628513321L) /* => dev.hixo.M.s.S.Y.k */;
                }
                if (n2 != 0) break block7;
                if (d.a("$", (Object)callSite, class_25962, (long)190579055735132287L) /* => dev.hixo.M.s.S.Y.U */ == false) break block5;
                callSite = d.a("\u00fd", (long)132476946628513321L) /* => dev.hixo.M.s.S.Y.k */;
            }
            d.a("$", (Object)callSite, class_25962, (long)108675284823383215L) /* => dev.hixo.M.s.S.Y.b */;
            d.a("$", (Object)callbackInfo, (long)104461966334151429L) /* => dev.hixo.patch.CallbackInfo.cancel */;
        }
    }
}

