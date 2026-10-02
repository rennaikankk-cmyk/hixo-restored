/*
 * RESTORED SOURCE — decompiled reconstruction, not the original files.
 * class: dev.hixo.patch.ClientPlayerEntityPatch
 */

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_746
 */
package dev.hixo.patch;

import asm.patchify.annotation.At;
import asm.patchify.annotation.Inject;
import asm.patchify.annotation.Patch;
import dev.hixo.M.d;
import dev.hixo.patch.CallbackInfo;
import java.lang.invoke.CallSite;
import net.minecraft.class_746;

@Patch(value=class_746.class)
public class ClientPlayerEntityPatch {
    private static float savedForward;
    private static float savedSideways;
    private static boolean savedInput;
    private static int preScaledAge;
    private static float savedYaw;
    private static float savedPitch;
    private static float lastLookYaw;
    private static float lastLookPitch;
    private static boolean hasLook;
    private static float moveFixSavedYaw;
    private static float moveFixSavedPitch;
    private static boolean moveFixActive;

    private static float wrapYaw(float f) {
        return (float)d.a("\u00f9", (float)f, (long)169602695659846515L) /* => net.minecraft.class_3532.method_15393 */;
    }

    private static float clampPitch(float f) {
        return (float)d.a("\u00f9", (float)f, (float)-90.0f, (float)90.0f, (long)106481879684650277L) /* => net.minecraft.class_3532.method_15363 */;
    }

    private static double directionYawDeg(float f, float f2, float f3) {
        float f4 = f;
        if (f2 < 0.0f) {
            f4 += 180.0f;
        }
        float f5 = 1.0f;
        if (f2 < 0.0f) {
            f5 = -0.5f;
        } else if (f2 > 0.0f) {
            f5 = 0.5f;
        }
        if (f3 > 0.0f) {
            f4 -= 90.0f * f5;
        } else if (f3 < 0.0f) {
            f4 += 90.0f * f5;
        }
        return f4;
    }

    @Inject(method="tickMovement", desc="()V")
    public static void onTickMovementHead(class_746 class_7462, CallbackInfo callbackInfo) {
        if (d.a("\u00fd", (long)71498313283647962L) /* => dev.hixo.Hixo.INSTANCE */ == null) {
            return;
        }
        if (d.a("$", (Object)class_7462, (long)178766331170989227L) /* => net.minecraft.class_746.method_6115 */ != false && d.a("z", (Object)class_7462, (long)109064100002971075L) /* => net.minecraft.class_746.field_3913 */ != null) {
            d.a("\u00c1", (float)d.a("z", (Object)d.a("z", (Object)class_7462, (long)109064100002971075L) /* => net.minecraft.class_746.field_3913 */, (long)185872274658290934L) /* => net.minecraft.class_744.field_3905 */, (long)118437495033063835L) /* => dev.hixo.patch.ClientPlayerEntityPatch.savedForward */;
            d.a("\u00c1", (float)d.a("z", (Object)d.a("z", (Object)class_7462, (long)109064100002971075L) /* => net.minecraft.class_746.field_3913 */, (long)103027505002171931L) /* => net.minecraft.class_744.field_3907 */, (long)198892111612614816L) /* => dev.hixo.patch.ClientPlayerEntityPatch.savedSideways */;
            d.a("\u00c1", (boolean)true, (long)104865509876044974L) /* => dev.hixo.patch.ClientPlayerEntityPatch.savedInput */;
        } else {
            d.a("\u00c1", (boolean)false, (long)104865509876044974L) /* => dev.hixo.patch.ClientPlayerEntityPatch.savedInput */;
        }
    }

    /*
     * Exception decompiling
     */
    @Inject(method="tickMovement", desc="()V", at=@At(value=At.Type.AFTER_INVOKE, method="net/minecraft/client/input/Input/tick", desc="()V"))
    public static void onTickMovementAfterInput(class_746 var0, CallbackInfo var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Statement already marked as first in another block
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.markFirstStatementInBlock(Op03SimpleStatement.java:461)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.Misc.markWholeBlock(Misc.java:251)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.ConditionalRewriter.considerAsSimpleIf(ConditionalRewriter.java:673)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.ConditionalRewriter.identifyNonjumpingConditionals(ConditionalRewriter.java:56)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:722)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    @Inject(method="tickMovement", desc="()V", at=@At(value=At.Type.AFTER_INVOKE, method="net/minecraft/client/tutorial/TutorialManager/onMovement", desc="(Lnet/minecraft/client/input/Input;)V"))
    public static void onTickMovementBeforeSlowdown(class_746 class_7462, CallbackInfo callbackInfo) {
        d.a("\u00f9", (Object)class_7462, (long)61056521565285331L) /* => dev.hixo.f.J.D.Z */;
    }

    @Inject(method="tickMovement", desc="()V", at=@At(value=At.Type.TAIL))
    public static void onTickMovementTail(class_746 class_7462, CallbackInfo callbackInfo) {
        if (d.a("\u00fd", (long)96453250068861829L) /* => dev.hixo.patch.ClientPlayerEntityPatch.moveFixActive */ != false) {
            d.a("$", (Object)class_7462, (float)d.a("\u00fd", (long)76822621975481092L) /* => dev.hixo.patch.ClientPlayerEntityPatch.moveFixSavedYaw */, (long)55689365516132110L) /* => net.minecraft.class_746.method_36456 */;
            d.a("$", (Object)class_7462, (float)d.a("\u00fd", (long)68378275013371229L) /* => dev.hixo.patch.ClientPlayerEntityPatch.moveFixSavedPitch */, (long)92081415245859107L) /* => net.minecraft.class_746.method_36457 */;
            d.a("\u00c1", (boolean)false, (long)96453250068861829L) /* => dev.hixo.patch.ClientPlayerEntityPatch.moveFixActive */;
        }
    }

    @Inject(method="sendMovementPackets", desc="()V")
    public static void onSendMovementHead(class_746 class_7462, CallbackInfo callbackInfo) {
        CallSite callSite;
        d.a("\u00c1", (float)d.a("$", (Object)class_7462, (long)68578805942358681L) /* => net.minecraft.class_746.method_36454 */, (long)154484936280619678L) /* => dev.hixo.patch.ClientPlayerEntityPatch.savedYaw */;
        d.a("\u00c1", (float)d.a("$", (Object)class_7462, (long)130683892682073266L) /* => net.minecraft.class_746.method_36455 */, (long)43040402726406672L) /* => dev.hixo.patch.ClientPlayerEntityPatch.savedPitch */;
        CallSite callSite2 = d.a("\u00f9", (long)52654057433724283L) /* => dev.hixo.f.B.G.w */;
        reference var3_3 = d.a("\u00f9", (float)(callSite2 != null ? d.a("z", (Object)callSite2, (long)164061588253527562L) /* => dev.hixo.f.V.C.l */ : d.a("\u00fd", (long)154484936280619678L) /* => dev.hixo.patch.ClientPlayerEntityPatch.savedYaw */), (long)94353190335112093L) /* => dev.hixo.patch.ClientPlayerEntityPatch.wrapYaw */;
        CallSite callSite3 = d.a("\u00f9", (float)(callSite2 != null ? d.a("z", (Object)callSite2, (long)200440889690670743L) /* => dev.hixo.f.V.C.r */ : d.a("\u00fd", (long)43040402726406672L) /* => dev.hixo.patch.ClientPlayerEntityPatch.savedPitch */), (long)53427196873253436L) /* => dev.hixo.patch.ClientPlayerEntityPatch.clampPitch */;
        if (d.a("\u00fd", (long)116283476371392759L) /* => dev.hixo.patch.ClientPlayerEntityPatch.hasLook */ != false && var3_3 == d.a("\u00fd", (long)70660603880426550L) /* => dev.hixo.patch.ClientPlayerEntityPatch.lastLookYaw */ && callSite3 == d.a("\u00fd", (long)164372409509363408L) /* => dev.hixo.patch.ClientPlayerEntityPatch.lastLookPitch */ && (callSite = d.a("\u00f9", (long)162080539408376107L) /* => dev.hixo.patch.ClientPlayerEntityPatch.mouseGcd */) > 0.0f) {
            var3_3 += callSite;
        }
        d.a("\u00c1", (float)var3_3, (long)70660603880426550L) /* => dev.hixo.patch.ClientPlayerEntityPatch.lastLookYaw */;
        d.a("\u00c1", (float)callSite3, (long)164372409509363408L) /* => dev.hixo.patch.ClientPlayerEntityPatch.lastLookPitch */;
        d.a("\u00c1", (boolean)true, (long)116283476371392759L) /* => dev.hixo.patch.ClientPlayerEntityPatch.hasLook */;
        d.a("$", (Object)class_7462, (float)(var3_3 + 720.0f), (long)55689365516132110L) /* => net.minecraft.class_746.method_36456 */;
        d.a("$", (Object)class_7462, (float)callSite3, (long)92081415245859107L) /* => net.minecraft.class_746.method_36457 */;
    }

    private static float mouseGcd() {
        try {
            float f = (float)d.a("$", (Object)((Double)((Object)d.a("$", (Object)d.a("$", (Object)d.a("z", (Object)d.a("\u00f9", (long)179869930689441125L) /* => net.minecraft.class_310.method_1551 */, (long)129597241205579821L) /* => net.minecraft.class_310.field_1690 */, (long)137882846016052397L) /* => net.minecraft.class_315.method_42495 */, (long)110245592303159542L) /* => net.minecraft.class_7172.method_41753 */)), (long)157550107272708233L) /* => java.lang.Double.doubleValue */;
            float f2 = f * 0.6f + 0.2f;
            return f2 * f2 * f2 * 1.2f;
        }
        catch (Throwable throwable) {
            return 0.0f;
        }
    }

    @Inject(method="sendMovementPackets", desc="()V", at=@At(value=At.Type.TAIL))
    public static void onSendMovementReturn(class_746 class_7462, CallbackInfo callbackInfo) {
        d.a("$", (Object)class_7462, (float)d.a("\u00fd", (long)154484936280619678L) /* => dev.hixo.patch.ClientPlayerEntityPatch.savedYaw */, (long)55689365516132110L) /* => net.minecraft.class_746.method_36456 */;
        d.a("$", (Object)class_7462, (float)d.a("\u00fd", (long)43040402726406672L) /* => dev.hixo.patch.ClientPlayerEntityPatch.savedPitch */, (long)92081415245859107L) /* => net.minecraft.class_746.method_36457 */;
    }

    static {
        d.a("\u00c1", (int)-1, (long)52143696162836740L) /* => dev.hixo.patch.ClientPlayerEntityPatch.preScaledAge */;
    }
}

