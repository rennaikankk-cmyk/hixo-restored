/*
 * RESTORED SOURCE — decompiled reconstruction, not the original files.
 * class: dev.hixo.B.l
 */

/*
 * Decompiled with CFR 0.152.
 */
package dev.hixo.B;

import dev.hixo.B.D;
import dev.hixo.B.F;
import dev.hixo.M.d;
import java.util.List;

public final class l
implements F {
    private final Object X;
    private final D w;
    private static final String a;

    private l(Object object, D d2) {
        this.X = object;
        this.w = d2;
    }

    public static l W(Object object, D d2) {
        return new l(object, d2);
    }

    public static l h(D d2) {
        return new l(null, d2);
    }

    @Override
    public List<Object> B() {
        return d.a("$", (Object)d.a("z", (Object)this, (long)75310226151009998L) /* => dev.hixo.B.l.w */, (long)70445706909235022L) /* => dev.hixo.B.D.W */;
    }

    public Object c() {
        Object object;
        block4: {
            block5: {
                int n2 = D.U;
                object = this;
                if (n2 != 0) break block4;
                if (d.a("z", (Object)object, (long)188465993305341079L) /* => dev.hixo.B.l.X */ != null) break block5;
                throw new IllegalStateException(a);
            }
            object = d.a("z", (Object)this, (long)188465993305341079L) /* => dev.hixo.B.l.X */;
        }
        return object;
    }

    @Override
    public Object call() throws Exception {
        try {
            return d.a("$", (Object)d.a("z", (Object)this, (long)75310226151009998L) /* => dev.hixo.B.l.w */, (Object)d.a("z", (Object)this, (long)188465993305341079L) /* => dev.hixo.B.l.X */, (long)138743707910312899L) /* => dev.hixo.B.D.d */;
        }
        catch (Exception exception) {
            throw exception;
        }
        catch (Throwable throwable) {
            throw new RuntimeException(throwable);
        }
    }

    /*
     * Handled impossible loop by duplicating code
     * Enabled aggressive block sorting
     */
    static {
        char[] cArray;
        block11: {
            int n2;
            int n3;
            block10: {
                char[] cArray2 = "nU=<$n7pD( \"i7tO*'.lctN2".toCharArray();
                cArray = cArray2;
                n3 = cArray2.length;
                n2 = 0;
                if (!true) break block10;
                n3 = n3;
                if (n3 <= n2) break block11;
            }
            do {
                cArray = cArray;
                int n4 = n2;
                char c2 = cArray[n4];
                cArray[n4] = (char)(c2 ^ (switch (n2 % 7) {
                    case 0 -> 29;
                    case 1 -> 33;
                    case 2 -> 92;
                    case 3 -> 72;
                    case 4 -> 77;
                    case 5 -> 13;
                    default -> 23;
                }));
                ++n2;
                n3 = n3;
            } while (n3 > n2);
        }
        a = new String(cArray).intern();
    }
}

