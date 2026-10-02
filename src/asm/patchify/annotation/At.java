/*
 * RESTORED SOURCE — decompiled reconstruction, not the original files.
 * class: asm.patchify.annotation.At
 * context strings: 'HEAD' | 'TAIL'
 */

/*
 * Decompiled with CFR 0.152.
 */
package asm.patchify.annotation;

import dev.hixo.M.d;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(value=RetentionPolicy.RUNTIME)
@Target(value={ElementType.TYPE_USE})
public @interface At {
    public Type value() default Type.HEAD;

    public String method() default "";

    public String remapped() default "";

    public String desc() default "";

    public static final class Type
    extends Enum<Type> {
        public static final /* enum */ Type BEFORE_INVOKE;
        public static final /* enum */ Type AFTER_INVOKE;
        public static final /* enum */ Type HEAD;
        public static final /* enum */ Type TAIL;
        private static final /* synthetic */ Type[] $VALUES;
        public static int Q;

        public static Type[] values() {
            return (Type[])((Enum)((Object)d.a("\u00fd", (long)168808294658964928L) /* => asm.patchify.annotation.At$Type.$VALUES */)).clone();
        }

        public static Type valueOf(String string) {
            return (Type)((Object)d.a("\u00f9", Type.class, (Object)string, (long)61481714314123346L) /* => java.lang.Enum.valueOf */);
        }

        private static /* synthetic */ Type[] $values() {
            return new Type[]{d.a("\u00fd", (long)55996988491282502L) /* => asm.patchify.annotation.At$Type.BEFORE_INVOKE */, d.a("\u00fd", (long)152328994871849616L) /* => asm.patchify.annotation.At$Type.AFTER_INVOKE */, d.a("\u00fd", (long)143466286864367341L) /* => asm.patchify.annotation.At$Type.HEAD */, d.a("\u00fd", (long)179838826277856593L) /* => asm.patchify.annotation.At$Type.TAIL */};
        }

        /*
         * Unable to fully structure code
         */
        static {
            block19: {
                block18: {
                    var0 = new String[4];
                    var4_1 = 0;
                    var3_2 = "(T]\u0011\u00044PU\u0019";
                    var5_3 = "(T]\u0011\u00044PU\u0019".length();
                    var2_4 = 4;
                    var1_5 = -1;
lbl7:
                    // 2 sources

                    while (true) {
                        v0 = ++var1_5;
                        v1 = var3_2.substring(v0, v0 + var2_4);
                        v2 = -1;
                        break block18;
                        break;
                    }
lbl12:
                    // 1 sources

                    while (true) {
                        var0[var4_1++] = v3.intern();
                        if ((var1_5 += var2_4) < var5_3) {
                            var2_4 = var3_2.charAt(var1_5);
                            ** continue;
                        }
                        var3_2 = "\"TZ\u001a\u001b6J)_J\u001a\u00026\f!WH\u0010\u001b,\\.GS\u001e\f";
                        var5_3 = "\"TZ\u001a\u001b6J)_J\u001a\u00026\f!WH\u0010\u001b,\\.GS\u001e\f".length();
                        var2_4 = 13;
                        var1_5 = -1;
lbl21:
                        // 2 sources

                        while (true) {
                            v4 = ++var1_5;
                            v1 = var3_2.substring(v4, v4 + var2_4);
                            v2 = 0;
                            break block18;
                            break;
                        }
                        break;
                    }
lbl26:
                    // 1 sources

                    while (true) {
                        var0[var4_1++] = v3.intern();
                        if ((var1_5 += var2_4) < var5_3) {
                            var2_4 = var3_2.charAt(var1_5);
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
                            v10 = 96;
                            break;
                        }
                        case 1: {
                            v10 = 17;
                            break;
                        }
                        case 2: {
                            v10 = 28;
                            break;
                        }
                        case 3: {
                            v10 = 85;
                            break;
                        }
                        case 4: {
                            v10 = 73;
                            break;
                        }
                        case 5: {
                            v10 = 115;
                            break;
                        }
                        default: {
                            v10 = 21;
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
            Type.BEFORE_INVOKE = new Type();
            Type.AFTER_INVOKE = new Type();
            Type.HEAD = new Type();
            Type.TAIL = new Type();
            Type.$VALUES = d.a("\u00f9", (long)175911541188430628L) /* => asm.patchify.annotation.At$Type.$values */;
        }
    }
}

