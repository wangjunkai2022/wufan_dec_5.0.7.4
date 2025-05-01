package kotlin.text;

import kotlin.ExperimentalStdlibApi;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.internal.InlineOnly;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.CharRange;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Char.kt */
@SourceDebugExtension({"SMAP\nChar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Char.kt\nkotlin/text/CharsKt__CharKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,344:1\n1#2:345\n*E\n"})
/* loaded from: classes6.dex */
public class CharsKt__CharKt extends CharsKt__CharJVMKt {
    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static final char digitToChar(int i4) {
        if (new IntRange(0, 9).contains(i4)) {
            return (char) (i4 + 48);
        }
        throw new IllegalArgumentException("Int " + i4 + " is not a decimal digit");
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static final int digitToInt(char c5) {
        int digitOf = CharsKt__CharJVMKt.digitOf(c5, 10);
        if (digitOf >= 0) {
            return digitOf;
        }
        throw new IllegalArgumentException("Char " + c5 + " is not a decimal digit");
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @Nullable
    public static final Integer digitToIntOrNull(char c5) {
        Integer valueOf = Integer.valueOf(CharsKt__CharJVMKt.digitOf(c5, 10));
        if (valueOf.intValue() >= 0) {
            return valueOf;
        }
        return null;
    }

    public static final boolean equals(char c5, char c6, boolean z4) {
        if (c5 == c6) {
            return true;
        }
        if (z4) {
            char upperCase = Character.toUpperCase(c5);
            char upperCase2 = Character.toUpperCase(c6);
            return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
        }
        return false;
    }

    public static /* synthetic */ boolean equals$default(char c5, char c6, boolean z4, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            z4 = false;
        }
        return equals(c5, c6, z4);
    }

    public static final boolean isSurrogate(char c5) {
        return new CharRange((char) 55296, (char) 57343).contains(c5);
    }

    @InlineOnly
    private static final String plus(char c5, String other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return c5 + other;
    }

    @SinceKotlin(version = "1.5")
    @NotNull
    public static final String titlecase(char c5) {
        return _OneToManyTitlecaseMappingsKt.titlecaseImpl(c5);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @Nullable
    public static final Integer digitToIntOrNull(char c5, int i4) {
        CharsKt__CharJVMKt.checkRadix(i4);
        Integer valueOf = Integer.valueOf(CharsKt__CharJVMKt.digitOf(c5, i4));
        if (valueOf.intValue() >= 0) {
            return valueOf;
        }
        return null;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static final char digitToChar(int i4, int i5) {
        if (!new IntRange(2, 36).contains(i5)) {
            throw new IllegalArgumentException("Invalid radix: " + i5 + ". Valid radix values are in range 2..36");
        } else if (i4 >= 0 && i4 < i5) {
            return (char) (i4 < 10 ? i4 + 48 : ((char) (i4 + 65)) - '\n');
        } else {
            throw new IllegalArgumentException("Digit " + i4 + " does not represent a valid digit in radix " + i5);
        }
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static final int digitToInt(char c5, int i4) {
        Integer digitToIntOrNull = digitToIntOrNull(c5, i4);
        if (digitToIntOrNull != null) {
            return digitToIntOrNull.intValue();
        }
        throw new IllegalArgumentException("Char " + c5 + " is not a digit in the given radix=" + i4);
    }
}
