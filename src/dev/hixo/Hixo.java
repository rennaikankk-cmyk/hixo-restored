/*
 * RESTORED SOURCE — decompiled reconstruction, not the original files.
 * class: dev.hixo.Hixo
 * context strings: 'worldRender' | 'clientTick' | 'configLoad' | 'hudRenderer'
 */

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.ClientModInitializer
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.class_4587
 *  org.slf4j.Logger
 */
package dev.hixo;

import dev.hixo.D.a;
import dev.hixo.M.G;
import dev.hixo.M.d;
import dev.hixo.M.n;
import dev.hixo.P.T;
import dev.hixo.P.s;
import dev.hixo.T.V;
import dev.hixo.T.q.O;
import java.lang.invoke.CallSite;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_4587;
import org.slf4j.Logger;

@Environment(value=EnvType.CLIENT)
public class Hixo
implements ClientModInitializer {
    public static final String MOD_ID;
    public static final Logger LOGGER;
    public static Hixo INSTANCE;
    private V eventBus;
    private n moduleManager;
    private s keyBindManager;
    private T commandManager;
    private a hudRenderer;
    public static int Q;
    private static final String[] a;

    public void onInitializeClient() {
        d.a("\u00c1", (Hixo)this, (long)71498313283647962L) /* => dev.hixo.Hixo.INSTANCE */;
        d.a("\u00e7", (Object)this, (V)new V(), (long)137265496952807659L) /* => dev.hixo.Hixo.eventBus */;
        d.a("\u00e7", (Object)this, (n)new n(), (long)110076142922730912L) /* => dev.hixo.Hixo.moduleManager */;
        d.a("\u00e7", (Object)this, (s)new s(), (long)44670677571499518L) /* => dev.hixo.Hixo.keyBindManager */;
        d.a("\u00e7", (Object)this, (T)new T(), (long)82122855982317520L) /* => dev.hixo.Hixo.commandManager */;
        d.a("\u00e7", (Object)this, (a)new a(), (long)150074710091416274L) /* => dev.hixo.Hixo.hudRenderer */;
        String[] stringArray = a;
        String string = stringArray[7];
        CallSite callSite = d.a("z", (Object)this, (long)44670677571499518L) /* => dev.hixo.Hixo.keyBindManager */;
        d.a("\u00f9", (Object)callSite, (long)43751334837936130L) /* => java.util.Objects.requireNonNull */;
        d.a("\u00f9", string, ((s)((Object)callSite))::f, (long)62080815654387649L) /* => dev.hixo.Hixo.safe */;
        String string2 = stringArray[9];
        CallSite callSite2 = d.a("z", (Object)this, (long)150074710091416274L) /* => dev.hixo.Hixo.hudRenderer */;
        d.a("\u00f9", (Object)callSite2, (long)43751334837936130L) /* => java.util.Objects.requireNonNull */;
        d.a("\u00f9", string2, ((a)((Object)callSite2))::F, (long)62080815654387649L) /* => dev.hixo.Hixo.safe */;
        d.a("\u00f9", stringArray[8], () -> d.a("\u00f9", (Object)d.a("$", (Object)d.a("z", (Object)this, (long)110076142922730912L) /* => dev.hixo.Hixo.moduleManager */, (long)58260499210938850L) /* => dev.hixo.M.n.C */, (long)48424498212610147L) /* => dev.hixo.P.r.V */, (long)62080815654387649L) /* => dev.hixo.Hixo.safe */;
        d.a("\u00f9", stringArray[4], () -> d.a("$", (Object)d.a("\u00fd", (long)36047153426547634L) /* => net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientLifecycleEvents.CLIENT_STOPPING */, class_3102 -> d.a("\u00f9", (Object)d.a("$", (Object)d.a("z", (Object)this, (long)110076142922730912L) /* => dev.hixo.Hixo.moduleManager */, (long)58260499210938850L) /* => dev.hixo.M.n.C */, (long)109857164430865514L) /* => dev.hixo.P.r.c */, (long)90971067691639174L) /* => net.fabricmc.fabric.api.event.Event.register */, (long)62080815654387649L) /* => dev.hixo.Hixo.safe */;
        d.a("\u00f9", stringArray[0], () -> d.a("$", (Object)d.a("\u00fd", (long)41498357980631213L) /* => net.fabricmc.fabric.api.client.rendering.v1.WorldRenderEvents.AFTER_TRANSLUCENT */, worldRenderContext -> {
            int n2 = Q;
            CallSite callSite = d.a("$", (Object)worldRenderContext, (long)117893513461834714L) /* => net.fabricmc.fabric.api.client.rendering.v1.WorldRenderContext.matrixStack */;
            if (n2 == 0) {
                if (callSite == null) {
                    return;
                }
                d.a("\u00c1", (class_4587)callSite, (long)34680093630227085L) /* => dev.hixo.g.P.h */;
                d.a("$", (Object)d.a("z", (Object)this, (long)137265496952807659L) /* => dev.hixo.Hixo.eventBus */, (Object)new O((class_4587)callSite, 0.0f), (long)177870116293240140L) /* => dev.hixo.T.V.T */;
            }
        }, (long)90971067691639174L) /* => net.fabricmc.fabric.api.event.Event.register */, (long)62080815654387649L) /* => dev.hixo.Hixo.safe */;
        d.a("\u00f9", stringArray[1], () -> d.a("$", (Object)d.a("\u00fd", (long)101524556051471510L) /* => net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents.END_CLIENT_TICK */, class_3102 -> d.a("$", (Object)d.a("z", (Object)this, (long)44670677571499518L) /* => dev.hixo.Hixo.keyBindManager */, (long)135389886239577580L) /* => dev.hixo.P.s.k */, (long)90971067691639174L) /* => net.fabricmc.fabric.api.event.Event.register */, (long)62080815654387649L) /* => dev.hixo.Hixo.safe */;
        int n2 = Q;
        d.a("$", (Object)d.a("\u00fd", (long)75125634791150063L) /* => dev.hixo.Hixo.LOGGER */, (Object)stringArray[3], (long)98504182083921510L) /* => org.slf4j.Logger.info */;
        if (n2 != 0) {
            G.L = !G.L;
        }
    }

    private static void safe(String string, Runnable runnable) {
        try {
            d.a("$", (Object)runnable, (long)84544887026165305L) /* => java.lang.Runnable.run */;
        }
        catch (Throwable throwable) {
            d.a("$", (Object)d.a("\u00fd", (long)75125634791150063L) /* => dev.hixo.Hixo.LOGGER */, (Object)a[2], (Object)string, (Object)d.a("$", (Object)throwable, (long)120621357894278260L) /* => java.lang.Throwable.toString */, (long)67268235436971313L) /* => org.slf4j.Logger.warn */;
        }
    }

    public V getEventBus() {
        return d.a("z", (Object)this, (long)137265496952807659L) /* => dev.hixo.Hixo.eventBus */;
    }

    public n getModuleManager() {
        return d.a("z", (Object)this, (long)110076142922730912L) /* => dev.hixo.Hixo.moduleManager */;
    }

    public s getKeyBindManager() {
        return d.a("z", (Object)this, (long)44670677571499518L) /* => dev.hixo.Hixo.keyBindManager */;
    }

    public T getCommandManager() {
        return d.a("z", (Object)this, (long)82122855982317520L) /* => dev.hixo.Hixo.commandManager */;
    }

    public a getHudRenderer() {
        return d.a("z", (Object)this, (long)150074710091416274L) /* => dev.hixo.Hixo.hudRenderer */;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block19: {
            block18: {
                var5 = new String[10];
                var3_1 = 0;
                var2_2 = "Q\bV6gb'H\u0003A(\nE\u000bM?mD\u0016O\u0004O#}\u000fM\"lmbT\u0002C3pD0G\u0013M5m\u0010e]\u001a\u0003zeQ+J\u0002@`#K?\u0018n\u000e\\5#s.O\u0002J.#Y,O\u0013M;oY8C\u0003\u0005\u000eE\u000bM?mD\u0011R\bT*j^%\u0004N\u000e\\5\u0004n\u000e\\5\u000eM\u0002]\u0018j^&k\u0006J;dU0";
                var4_3 = "Q\bV6gb'H\u0003A(\nE\u000bM?mD\u0016O\u0004O#}\u000fM\"lmbT\u0002C3pD0G\u0013M5m\u0010e]\u001a\u0003zeQ+J\u0002@`#K?\u0018n\u000e\\5#s.O\u0002J.#Y,O\u0013M;oY8C\u0003\u0005\u000eE\u000bM?mD\u0011R\bT*j^%\u0004N\u000e\\5\u0004n\u000e\\5\u000eM\u0002]\u0018j^&k\u0006J;dU0".length();
                var1_4 = 11;
                var0_5 = -1;
lbl7:
                // 2 sources

                while (true) {
                    v0 = ++var0_5;
                    v1 = var2_2.substring(v0, v0 + var1_4);
                    v2 = -1;
                    break block18;
                    break;
                }
lbl12:
                // 1 sources

                while (true) {
                    var5[var3_1++] = v3.intern();
                    if ((var0_5 += var1_4) < var4_3) {
                        var1_4 = var2_2.charAt(var0_5);
                        ** continue;
                    }
                    var2_2 = "E\bJ<jW\u000eI\u0006@\u000bN\u0012@\bf^&C\u0015A(";
                    var4_3 = "E\bJ<jW\u000eI\u0006@\u000bN\u0012@\bf^&C\u0015A(".length();
                    var1_4 = 10;
                    var0_5 = -1;
lbl21:
                    // 2 sources

                    while (true) {
                        v4 = ++var0_5;
                        v1 = var2_2.substring(v4, v4 + var1_4);
                        v2 = 0;
                        break block18;
                        break;
                    }
                    break;
                }
lbl26:
                // 1 sources

                while (true) {
                    var5[var3_1++] = v3.intern();
                    if ((var0_5 += var1_4) < var4_3) {
                        var1_4 = var2_2.charAt(var0_5);
                        ** continue;
                    }
                    break block19;
                    break;
                }
            }
            v5 = v1.toCharArray();
            v6 = v5;
            v7 = v5.length;
            var6_6 = 0;
            if (true) ** GOTO lbl65
            do {
                v6 = v6;
                v8 = var6_6;
                v9 = v6[v8];
                switch (var6_6 % 7) {
                    case 0: {
                        v10 = 38;
                        break;
                    }
                    case 1: {
                        v10 = 103;
                        break;
                    }
                    case 2: {
                        v10 = 36;
                        break;
                    }
                    case 3: {
                        v10 = 90;
                        break;
                    }
                    case 4: {
                        v10 = 3;
                        break;
                    }
                    case 5: {
                        v10 = 48;
                        break;
                    }
                    default: {
                        v10 = 66;
                    }
                }
                v6[v8] = (char)(v9 ^ v10);
                ++var6_6;
lbl65:
                // 2 sources

                v7 = v7;
            } while (v7 > var6_6);
            v3 = new String(v6);
            switch (v2) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl73:
                // 1 sources

                ** continue;
            }
        }
        Hixo.a = var5;
        Hixo.MOD_ID = Hixo.a[5];
        Hixo.LOGGER = d.a("\u00f9", Hixo.a[6], (long)188937189501766979L) /* => org.slf4j.LoggerFactory.getLogger */;
    }
}

