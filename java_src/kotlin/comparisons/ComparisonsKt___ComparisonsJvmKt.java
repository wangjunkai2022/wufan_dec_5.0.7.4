package kotlin.comparisons;

import kotlin.SinceKotlin;
import kotlin.internal.InlineOnly;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: _ComparisonsJvm.kt */
/* loaded from: classes.dex */
public class ComparisonsKt___ComparisonsJvmKt extends ComparisonsKt__ComparisonsKt {
    @SinceKotlin(version = "1.1")
    @NotNull
    public static <T extends Comparable<? super T>> T maxOf(@NotNull T a5, @NotNull T b5) {
        Intrinsics.checkNotNullParameter(a5, "a");
        Intrinsics.checkNotNullParameter(b5, "b");
        return a5.compareTo(b5) >= 0 ? a5 : b5;
    }

    @SinceKotlin(version = "1.1")
    @NotNull
    public static final <T extends Comparable<? super T>> T minOf(@NotNull T a5, @NotNull T b5) {
        Intrinsics.checkNotNullParameter(a5, "a");
        Intrinsics.checkNotNullParameter(b5, "b");
        return a5.compareTo(b5) <= 0 ? a5 : b5;
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final byte maxOf(byte b5, byte b6) {
        return (byte) Math.max((int) b5, (int) b6);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final byte minOf(byte b5, byte b6) {
        return (byte) Math.min((int) b5, (int) b6);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final short maxOf(short s4, short s5) {
        return (short) Math.max((int) s4, (int) s5);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final short minOf(short s4, short s5) {
        return (short) Math.min((int) s4, (int) s5);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final int maxOf(int i4, int i5) {
        return Math.max(i4, i5);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final int minOf(int i4, int i5) {
        return Math.min(i4, i5);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final long maxOf(long j4, long j5) {
        return Math.max(j4, j5);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final long minOf(long j4, long j5) {
        return Math.min(j4, j5);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final float maxOf(float f5, float f6) {
        return Math.max(f5, f6);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final float minOf(float f5, float f6) {
        return Math.min(f5, f6);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final double maxOf(double d5, double d6) {
        return Math.max(d5, d6);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final double minOf(double d5, double d6) {
        return Math.min(d5, d6);
    }

    @SinceKotlin(version = "1.1")
    @NotNull
    public static final <T extends Comparable<? super T>> T maxOf(@NotNull T a5, @NotNull T b5, @NotNull T c5) {
        Intrinsics.checkNotNullParameter(a5, "a");
        Intrinsics.checkNotNullParameter(b5, "b");
        Intrinsics.checkNotNullParameter(c5, "c");
        return (T) ComparisonsKt.maxOf(a5, ComparisonsKt.maxOf(b5, c5));
    }

    @SinceKotlin(version = "1.1")
    @NotNull
    public static final <T extends Comparable<? super T>> T minOf(@NotNull T a5, @NotNull T b5, @NotNull T c5) {
        Intrinsics.checkNotNullParameter(a5, "a");
        Intrinsics.checkNotNullParameter(b5, "b");
        Intrinsics.checkNotNullParameter(c5, "c");
        return (T) minOf(a5, minOf(b5, c5));
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final byte maxOf(byte b5, byte b6, byte b7) {
        return (byte) Math.max((int) b5, Math.max((int) b6, (int) b7));
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final byte minOf(byte b5, byte b6, byte b7) {
        return (byte) Math.min((int) b5, Math.min((int) b6, (int) b7));
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final short maxOf(short s4, short s5, short s6) {
        return (short) Math.max((int) s4, Math.max((int) s5, (int) s6));
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final short minOf(short s4, short s5, short s6) {
        return (short) Math.min((int) s4, Math.min((int) s5, (int) s6));
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final int maxOf(int i4, int i5, int i6) {
        return Math.max(i4, Math.max(i5, i6));
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final int minOf(int i4, int i5, int i6) {
        return Math.min(i4, Math.min(i5, i6));
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final long maxOf(long j4, long j5, long j6) {
        return Math.max(j4, Math.max(j5, j6));
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final long minOf(long j4, long j5, long j6) {
        return Math.min(j4, Math.min(j5, j6));
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final float maxOf(float f5, float f6, float f7) {
        return Math.max(f5, Math.max(f6, f7));
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final float minOf(float f5, float f6, float f7) {
        return Math.min(f5, Math.min(f6, f7));
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final double maxOf(double d5, double d6, double d7) {
        return Math.max(d5, Math.max(d6, d7));
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final double minOf(double d5, double d6, double d7) {
        return Math.min(d5, Math.min(d6, d7));
    }

    @SinceKotlin(version = "1.4")
    @NotNull
    public static final <T extends Comparable<? super T>> T maxOf(@NotNull T a5, @NotNull T... other) {
        Intrinsics.checkNotNullParameter(a5, "a");
        Intrinsics.checkNotNullParameter(other, "other");
        for (T t4 : other) {
            a5 = (T) ComparisonsKt.maxOf(a5, t4);
        }
        return a5;
    }

    @SinceKotlin(version = "1.4")
    @NotNull
    public static final <T extends Comparable<? super T>> T minOf(@NotNull T a5, @NotNull T... other) {
        Intrinsics.checkNotNullParameter(a5, "a");
        Intrinsics.checkNotNullParameter(other, "other");
        for (T t4 : other) {
            a5 = (T) minOf(a5, t4);
        }
        return a5;
    }

    @SinceKotlin(version = "1.4")
    public static final byte maxOf(byte b5, @NotNull byte... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (byte b6 : other) {
            b5 = (byte) Math.max((int) b5, (int) b6);
        }
        return b5;
    }

    @SinceKotlin(version = "1.4")
    public static final byte minOf(byte b5, @NotNull byte... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (byte b6 : other) {
            b5 = (byte) Math.min((int) b5, (int) b6);
        }
        return b5;
    }

    @SinceKotlin(version = "1.4")
    public static final short maxOf(short s4, @NotNull short... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (short s5 : other) {
            s4 = (short) Math.max((int) s4, (int) s5);
        }
        return s4;
    }

    @SinceKotlin(version = "1.4")
    public static final short minOf(short s4, @NotNull short... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (short s5 : other) {
            s4 = (short) Math.min((int) s4, (int) s5);
        }
        return s4;
    }

    @SinceKotlin(version = "1.4")
    public static final int maxOf(int i4, @NotNull int... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (int i5 : other) {
            i4 = Math.max(i4, i5);
        }
        return i4;
    }

    @SinceKotlin(version = "1.4")
    public static final int minOf(int i4, @NotNull int... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (int i5 : other) {
            i4 = Math.min(i4, i5);
        }
        return i4;
    }

    @SinceKotlin(version = "1.4")
    public static final long maxOf(long j4, @NotNull long... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (long j5 : other) {
            j4 = Math.max(j4, j5);
        }
        return j4;
    }

    @SinceKotlin(version = "1.4")
    public static final long minOf(long j4, @NotNull long... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (long j5 : other) {
            j4 = Math.min(j4, j5);
        }
        return j4;
    }

    @SinceKotlin(version = "1.4")
    public static final float maxOf(float f5, @NotNull float... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (float f6 : other) {
            f5 = Math.max(f5, f6);
        }
        return f5;
    }

    @SinceKotlin(version = "1.4")
    public static final float minOf(float f5, @NotNull float... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (float f6 : other) {
            f5 = Math.min(f5, f6);
        }
        return f5;
    }

    @SinceKotlin(version = "1.4")
    public static final double maxOf(double d5, @NotNull double... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (double d6 : other) {
            d5 = Math.max(d5, d6);
        }
        return d5;
    }

    @SinceKotlin(version = "1.4")
    public static final double minOf(double d5, @NotNull double... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (double d6 : other) {
            d5 = Math.min(d5, d6);
        }
        return d5;
    }
}
