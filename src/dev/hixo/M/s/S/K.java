/*
 * RESTORED SOURCE — decompiled reconstruction, not the original files.
 * class: dev.hixo.M.s.S.K
 * identified as: Criticals
 * context strings: 'Crit Window Only' | 'Packet (1.8.9)' | 'Stop Sprint On Kill' | 'Cooldown Reset'
 */

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1297
 *  net.minecraft.class_1309
 *  net.minecraft.class_2848
 *  net.minecraft.class_2848$class_2849
 */
package dev.hixo.M.s.S;

import dev.hixo.M.G;
import dev.hixo.M.d;
import dev.hixo.M.s.S.Y;
import dev.hixo.T.E;
import dev.hixo.b.M;
import dev.hixo.b.g;
import dev.hixo.b.s;
import dev.hixo.t.q.p_0;
import java.lang.invoke.CallSite;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_2848;

public class K
extends G {
    public static K G;
    public final s Q;
    public final M n;
    public final g N;
    public final g v;
    public final M f;
    public final g m;
    public final g x;
    public final g S;
    public final g d;
    private volatile long T;
    private class_1309 J;
    private int s;
    private static final String[] c;

    public K() {
        String[] stringArray = c;
        super((dev.hixo.M.K)((Object)dev.hixo.M.d.a("\u00fd", (long)169407094224467032L) /* => dev.hixo.M.K.COMBAT */), stringArray[16], stringArray[10]);
        this.Q = new s(stringArray[8], stringArray[4], stringArray[4], stringArray[14]);
        this.n = new M(stringArray[5], 0.0625, 5.0E-4, 0.25, 5.0E-4);
        this.N = new g(stringArray[15], true);
        this.v = new g(stringArray[11], true);
        this.f = new M(stringArray[18], 300.0, 50.0, 1500.0, 50.0);
        this.m = new g(stringArray[3], true);
        this.x = new g(stringArray[2], true);
        this.S = new g(stringArray[0], true);
        this.d = new g(stringArray[19], false);
        dev.hixo.M.d.a("\u00e7", (Object)this, (long)0L, (long)51931005843206490L);
        dev.hixo.M.d.a("$", (Object)this, (int)0, (long)113806433936288059L) /* => dev.hixo.M.G.z */;
        dev.hixo.M.d.a("\u00c1", (K)this, (long)196543159768037306L) /* => dev.hixo.M.s.S.K.G */;
    }

    @Override
    public void I() {
        dev.hixo.M.d.a("\u00e7", (Object)this, (long)0L, (long)51931005843206490L);
        dev.hixo.M.d.a("\u00e7", (Object)this, null, (long)65477475304269557L);
        dev.hixo.M.d.a("\u00e7", (Object)this, (int)0, (long)129528461444210506L);
        super.I();
    }

    @Override
    public void a() {
        dev.hixo.M.d.a("\u00e7", (Object)this, (long)0L, (long)51931005843206490L);
        super.a();
    }

    public boolean I(class_1297 class_12972) {
        if (class_12972 instanceof class_1309) {
            class_1309 class_13092 = (class_1309)class_12972;
            dev.hixo.M.d.a("\u00e7", (Object)this, (class_1309)class_13092, (long)65477475304269557L);
        }
        dev.hixo.M.d.a("$", (Object)this, (long)124700925273195861L);
        return true;
    }

    public void T() {
        dev.hixo.M.d.a("$", (Object)this, (long)124700925273195861L);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void e() {
        if (dev.hixo.M.d.a("$", (Object)this, (long)96089342888548907L) /* => dev.hixo.M.G.c */ == false || dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("\u00fd", (long)191291687252741418L) /* => dev.hixo.M.G.a */, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */ == null) {
            return;
        }
        if (dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)133004516989930333L), (Object)c[4], (long)114714509743429363L) /* => dev.hixo.b.s.P */ == false) {
            return;
        }
        if (dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)43860147292207420L), (long)65580906021680841L) /* => dev.hixo.b.g.x */ != false && dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("\u00fd", (long)191291687252741418L) /* => dev.hixo.M.G.a */, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (long)135886899496477481L) /* => net.minecraft.class_746.method_5624 */ != false) {
            try {
                dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("\u00fd", (long)191291687252741418L) /* => dev.hixo.M.G.a */, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (boolean)false, (long)121854460523286196L) /* => net.minecraft.class_746.method_5728 */;
                dev.hixo.M.d.a("\u00f9", (Object)new class_2848((class_1297)dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("\u00fd", (long)191291687252741418L) /* => dev.hixo.M.G.a */, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (class_2848.class_2849)dev.hixo.M.d.a("\u00fd", (long)120364880155937319L) /* => net.minecraft.class_2848$class_2849.field_12985 */), (long)129367971854265225L) /* => dev.hixo.f.x.I.i */;
                if (dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)49785038317265315L), (long)65580906021680841L) /* => dev.hixo.b.g.x */ != false) {
                    dev.hixo.M.d.a("$", (Object)this, (Object)c[12], (long)57521436652742166L);
                }
            }
            catch (Throwable throwable) {
                // empty catch block
            }
        }
        dev.hixo.M.d.a("\u00e7", (Object)this, (long)(dev.hixo.M.d.a("\u00f9", (long)171188797904017458L) /* => java.lang.System.currentTimeMillis */ + (long)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)128933610301677206L), (long)86270808255001128L) /* => dev.hixo.b.M.J */), (long)51931005843206490L);
    }

    public boolean M() {
        if (dev.hixo.M.d.a("$", (Object)this, (long)96089342888548907L) /* => dev.hixo.M.G.c */ == false || dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("\u00fd", (long)191291687252741418L) /* => dev.hixo.M.G.a */, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */ == null) {
            return false;
        }
        String[] stringArray = c;
        if (dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)133004516989930333L), (Object)stringArray[1], (long)114714509743429363L) /* => dev.hixo.b.s.P */ == false) {
            return false;
        }
        if (dev.hixo.M.d.a("\u00f9", (long)171188797904017458L) /* => java.lang.System.currentTimeMillis */ > dev.hixo.M.d.a("z", (Object)this, (long)51931005843206490L)) {
            return false;
        }
        if (dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)169679833390437806L), (long)65580906021680841L) /* => dev.hixo.b.g.x */ != false && dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("\u00fd", (long)191291687252741418L) /* => dev.hixo.M.G.a */, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (long)175288240290473570L) /* => net.minecraft.class_746.method_24828 */ == false) {
            return false;
        }
        K k2 = this;
        dev.hixo.M.d.a("\u00e7", (Object)k2, (int)(dev.hixo.M.d.a("z", (Object)k2, (long)129528461444210506L) + true), (long)129528461444210506L);
        if (dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)49785038317265315L), (long)65580906021680841L) /* => dev.hixo.b.g.x */ != false && dev.hixo.M.d.a("z", (Object)this, (long)129528461444210506L) % 20 == true) {
            dev.hixo.M.d.a("$", (Object)this, (Object)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("$", (Object)new StringBuilder(), (Object)c[17], (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (int)dev.hixo.M.d.a("z", (Object)this, (long)129528461444210506L), (long)32515713483113022L) /* => java.lang.StringBuilder.append */, (long)59411206276622891L) /* => java.lang.StringBuilder.toString */, (long)57521436652742166L);
        }
        return true;
    }

    public double C() {
        return (double)(-dev.hixo.M.d.a("\u00f9", (double)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)148325348188930068L), (long)86270808255001128L) /* => dev.hixo.b.M.J */, (long)184451009312960843L) /* => java.lang.Math.abs */);
    }

    public boolean y() {
        if (dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("\u00fd", (long)191291687252741418L) /* => dev.hixo.M.G.a */, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */ == null) {
            return false;
        }
        return dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("\u00fd", (long)191291687252741418L) /* => dev.hixo.M.G.a */, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (long)42373144971856318L) > 0.0f && dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("\u00fd", (long)191291687252741418L) /* => dev.hixo.M.G.a */, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (long)175288240290473570L) /* => net.minecraft.class_746.method_24828 */ == false && dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("\u00fd", (long)191291687252741418L) /* => dev.hixo.M.G.a */, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (long)117810057227506494L) /* => net.minecraft.class_746.method_6101 */ == false && dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("\u00fd", (long)191291687252741418L) /* => dev.hixo.M.G.a */, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (long)99408139569770068L) /* => net.minecraft.class_746.method_5799 */ == false && dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("\u00fd", (long)191291687252741418L) /* => dev.hixo.M.G.a */, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (Object)dev.hixo.M.d.a("\u00fd", (long)177725023118179564L), (long)159201508096951145L) == false && dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("\u00fd", (long)191291687252741418L) /* => dev.hixo.M.G.a */, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (long)47722459008799058L) /* => net.minecraft.class_746.method_5765 */ == false;
    }

    /*
     * Loose catch block
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @E
    public void P(p_0 p_02) {
        K k2;
        block85: {
            block82: {
                CallSite callSite;
                int n2;
                block84: {
                    block83: {
                        CallSite callSite2;
                        block81: {
                            CallSite callSite3;
                            block79: {
                                CallSite callSite4;
                                block80: {
                                    block95: {
                                        block94: {
                                            block93: {
                                                block92: {
                                                    Object object;
                                                    block76: {
                                                        block78: {
                                                            block77: {
                                                                block91: {
                                                                    block90: {
                                                                        block74: {
                                                                            K k3;
                                                                            block73: {
                                                                                block75: {
                                                                                    block89: {
                                                                                        block88: {
                                                                                            Object object2;
                                                                                            block70: {
                                                                                                block72: {
                                                                                                    block71: {
                                                                                                        block87: {
                                                                                                            block86: {
                                                                                                                K k4;
                                                                                                                block68: {
                                                                                                                    block69: {
                                                                                                                        block66: {
                                                                                                                            block67: {
                                                                                                                                block65: {
                                                                                                                                    n2 = Y.w;
                                                                                                                                    if (dev.hixo.M.d.a("$", (Object)p_02, (long)52512254813896748L) /* => dev.hixo.T.q.p.W */ != dev.hixo.M.d.a("\u00fd", (long)199476637466971905L) /* => dev.hixo.T.S.PRE */) {
                                                                                                                                        return;
                                                                                                                                    }
                                                                                                                                    if (dev.hixo.M.d.a("$", (Object)this, (long)96089342888548907L) /* => dev.hixo.M.G.c */ == false) return;
                                                                                                                                    if (dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("\u00fd", (long)191291687252741418L) /* => dev.hixo.M.G.a */, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */ != null) break block65;
                                                                                                                                    return;
                                                                                                                                    catch (Throwable throwable) {
                                                                                                                                        throw throwable;
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                k4 = this;
                                                                                                                                if (n2 != 0) break block66;
                                                                                                                                if (dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)k4, (long)133004516989930333L), (Object)c[13], (long)114714509743429363L) /* => dev.hixo.b.s.P */ != false) break block67;
                                                                                                                                return;
                                                                                                                                catch (Throwable throwable) {
                                                                                                                                    throw throwable;
                                                                                                                                }
                                                                                                                            }
                                                                                                                            k4 = this;
                                                                                                                        }
                                                                                                                        if (n2 != 0) break block68;
                                                                                                                        if (dev.hixo.M.d.a("z", (Object)k4, (long)65477475304269557L) != null) break block69;
                                                                                                                        return;
                                                                                                                        catch (Throwable throwable) {
                                                                                                                            throw throwable;
                                                                                                                        }
                                                                                                                    }
                                                                                                                    k4 = this;
                                                                                                                }
                                                                                                                object2 = dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)k4, (long)65477475304269557L), (long)82520077281759901L) /* => net.minecraft.class_1309.method_29504 */;
                                                                                                                if (n2 != 0) break block70;
                                                                                                                if (object2 != false) break block71;
                                                                                                                break block86;
                                                                                                                catch (Throwable throwable) {
                                                                                                                    throw throwable;
                                                                                                                }
                                                                                                            }
                                                                                                            reference cfr_temp_0 = dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)65477475304269557L), (long)123974669313727410L) /* => net.minecraft.class_1309.method_6032 */ - 0.0f;
                                                                                                            object2 = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 < 0 ? -1 : 1);
                                                                                                            if (n2 != 0) break block70;
                                                                                                            break block87;
                                                                                                            catch (Throwable throwable) {
                                                                                                                throw throwable;
                                                                                                            }
                                                                                                        }
                                                                                                        if (object2 > 0) break block72;
                                                                                                    }
                                                                                                    object2 = true;
                                                                                                    break block70;
                                                                                                }
                                                                                                object2 = false;
                                                                                            }
                                                                                            callSite2 = object2;
                                                                                            k3 = this;
                                                                                            if (n2 != 0) break block73;
                                                                                            if (dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)k3, (long)65477475304269557L), (long)186030414168428766L) /* => net.minecraft.class_1309.method_31481 */ != false) break block75;
                                                                                            break block88;
                                                                                            catch (Throwable throwable) {
                                                                                                throw throwable;
                                                                                            }
                                                                                        }
                                                                                        object = callSite2;
                                                                                        if (n2 != 0) break block74;
                                                                                        break block89;
                                                                                        catch (Throwable throwable) {
                                                                                            throw throwable;
                                                                                        }
                                                                                    }
                                                                                    if (object != false) break block75;
                                                                                    return;
                                                                                }
                                                                                k3 = this;
                                                                            }
                                                                            object = dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)k3, (long)135304824491717617L), (long)65580906021680841L) /* => dev.hixo.b.g.x */;
                                                                        }
                                                                        if (n2 != 0) break block76;
                                                                        if (object == false) break block77;
                                                                        break block90;
                                                                        catch (Throwable throwable) {
                                                                            throw throwable;
                                                                        }
                                                                    }
                                                                    object = dev.hixo.M.d.a("$", (Object)this, (long)58036171035981129L);
                                                                    if (n2 != 0) break block76;
                                                                    break block91;
                                                                    catch (Throwable throwable) {
                                                                        throw throwable;
                                                                    }
                                                                }
                                                                if (object == false) break block78;
                                                            }
                                                            object = true;
                                                            break block76;
                                                        }
                                                        object = false;
                                                    }
                                                    callSite4 = object;
                                                    callSite3 = dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("\u00fd", (long)191291687252741418L) /* => dev.hixo.M.G.a */, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (long)135886899496477481L) /* => net.minecraft.class_746.method_5624 */;
                                                    callSite = callSite4;
                                                    if (n2 != 0) break block79;
                                                    if (callSite == false) break block80;
                                                    break block92;
                                                    catch (Throwable throwable) {
                                                        throw throwable;
                                                    }
                                                }
                                                callSite = callSite2;
                                                if (n2 != 0) break block79;
                                                break block93;
                                                catch (Throwable throwable) {
                                                    throw throwable;
                                                }
                                            }
                                            if (callSite != false) break block80;
                                            break block94;
                                            catch (Throwable throwable) {
                                                throw throwable;
                                            }
                                        }
                                        callSite = dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)36703296892217304L), (long)65580906021680841L) /* => dev.hixo.b.g.x */;
                                        if (n2 != 0) break block79;
                                        break block95;
                                        catch (Throwable throwable) {
                                            throw throwable;
                                        }
                                    }
                                    if (callSite == false) break block80;
                                    try {
                                        K k5;
                                        block96: {
                                            block97: {
                                                dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("\u00fd", (long)191291687252741418L) /* => dev.hixo.M.G.a */, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (long)135050973896434976L);
                                                k5 = this;
                                                if (n2 != 0) break block96;
                                                if (dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)k5, (long)49785038317265315L), (long)65580906021680841L) /* => dev.hixo.b.g.x */ == false) break block80;
                                                break block97;
                                                catch (Throwable throwable) {
                                                    throw throwable;
                                                }
                                            }
                                            k5 = this;
                                        }
                                        String[] stringArray = c;
                                        dev.hixo.M.d.a("$", (Object)k5, (Object)stringArray[6], (long)57521436652742166L);
                                    }
                                    catch (Throwable throwable) {
                                        // empty catch block
                                    }
                                }
                                callSite = callSite4;
                            }
                            if (n2 != 0) break block81;
                            if (callSite == false) break block82;
                            callSite = callSite3;
                        }
                        if (n2 != 0) break block83;
                        if (callSite == false) break block82;
                        callSite = callSite2;
                    }
                    if (n2 != 0) break block84;
                    if (callSite == false) break block82;
                    k2 = this;
                    if (n2 != 0) break block85;
                    callSite = dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)k2, (long)49957586912143826L), (long)65580906021680841L) /* => dev.hixo.b.g.x */;
                }
                if (callSite == false) break block82;
                dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("\u00fd", (long)191291687252741418L) /* => dev.hixo.M.G.a */, (long)129597241205579821L) /* => net.minecraft.class_310.field_1690 */, (long)73833912347181160L) /* => net.minecraft.class_315.field_1867 */, (boolean)false, (long)66388162404330922L) /* => net.minecraft.class_304.method_23481 */;
                dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)dev.hixo.M.d.a("\u00fd", (long)191291687252741418L) /* => dev.hixo.M.G.a */, (long)145915238106362539L) /* => net.minecraft.class_310.field_1724 */, (boolean)false, (long)121854460523286196L) /* => net.minecraft.class_746.method_5728 */;
                if (n2 != 0) return;
                if (dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("z", (Object)this, (long)49785038317265315L), (long)65580906021680841L) /* => dev.hixo.b.g.x */ == false) break block82;
                dev.hixo.M.d.a("$", (Object)this, (Object)c[9], (long)57521436652742166L);
            }
            k2 = this;
        }
        dev.hixo.M.d.a("\u00e7", (Object)k2, null, (long)65477475304269557L);
    }

    private void J(String string) {
        dev.hixo.M.d.a("\u00f9", (Object)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("$", (Object)dev.hixo.M.d.a("$", (Object)new StringBuilder(), (Object)c[7], (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (Object)string, (long)86542515882976328L) /* => java.lang.StringBuilder.append */, (long)59411206276622891L) /* => java.lang.StringBuilder.toString */, (long)46296556092243784L) /* => dev.hixo.f.E.o */;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block19: {
            block18: {
                var5 = new String[20];
                var3_1 = 0;
                var2_2 = "|24G[Q\u0007Q$2D[I\u0000S9\u000eo!>X\u001erN\u0017qs\u000bU?G\u0013l42C[U\u001eM)3G[I\u0000\u001f\u000b4_\u0017\u000e|/2_\u001fi\u0019Q`\u000fV\bc\u001a\u000eo!>X\u001erN\u0017qs\u000bU?G\u000bs);G[.\nP73\u001a\u0006\u91f2\u7f2e\u6566\u51c8\u51cc\u5372\fd\u0003/Z\u000fo\r^,.n[\u0004r/9V\u0006\u51c4\u6700\u5453\u674d\u75c5\u8dd7 \u000ene\u001dB&\u536b\u668b\u51bb\uff55\u650a\u51e2\u81ec\u8ec5\u79c4\u52e8\u5358\uff3aT&!O%3i\u001ehN\u5188\u5334\u9190\u7f5d\u000bl42C[U\u001eM)3G\u0016\u5063\u75fe\u8d8c\uff3b\u66cf\u51fd\u89ef\u6c7d`|Z\bU\u001eM)3G\u0012h\t\uff36\u0007p08]!c\u0000\u0007p08]!c\u0000\u000bx22F\u0015bNp.1J\t|24G\u0012e\u000fS3\u0007\u6506\u51d9\u79a6\u529b\u537e&M";
                var4_3 = "|24G[Q\u0007Q$2D[I\u0000S9\u000eo!>X\u001erN\u0017qs\u000bU?G\u0013l42C[U\u001eM)3G[I\u0000\u001f\u000b4_\u0017\u000e|/2_\u001fi\u0019Q`\u000fV\bc\u001a\u000eo!>X\u001erN\u0017qs\u000bU?G\u000bs);G[.\nP73\u001a\u0006\u91f2\u7f2e\u6566\u51c8\u51cc\u5372\fd\u0003/Z\u000fo\r^,.n[\u0004r/9V\u0006\u51c4\u6700\u5453\u674d\u75c5\u8dd7 \u000ene\u001dB&\u536b\u668b\u51bb\uff55\u650a\u51e2\u81ec\u8ec5\u79c4\u52e8\u5358\uff3aT&!O%3i\u001ehN\u5188\u5334\u9190\u7f5d\u000bl42C[U\u001eM)3G\u0016\u5063\u75fe\u8d8c\uff3b\u66cf\u51fd\u89ef\u6c7d`|Z\bU\u001eM)3G\u0012h\t\uff36\u0007p08]!c\u0000\u0007p08]!c\u0000\u000bx22F\u0015bNp.1J\t|24G\u0012e\u000fS3\u0007\u6506\u51d9\u79a6\u529b\u537e&M".length();
                var1_4 = 16;
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
                    var2_2 = "w/1W[.\u0003Li\u0005{%?F\u001c";
                    var4_3 = "w/1W[.\u0003Li\u0005{%?F\u001c".length();
                    var1_4 = 9;
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
                        v10 = 63;
                        break;
                    }
                    case 1: {
                        v10 = 64;
                        break;
                    }
                    case 2: {
                        v10 = 93;
                        break;
                    }
                    case 3: {
                        v10 = 51;
                        break;
                    }
                    case 4: {
                        v10 = 123;
                        break;
                    }
                    case 5: {
                        v10 = 6;
                        break;
                    }
                    default: {
                        v10 = 110;
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
        K.c = var5;
    }
}

