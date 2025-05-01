package io.reactivex.internal.util;
/* loaded from: classes6.dex */
public final class Pow2 {
    private Pow2() {
        throw new IllegalStateException("No instances!");
    }

    public static boolean isPowerOfTwo(int i4) {
        return (i4 & (i4 + (-1))) == 0;
    }

    public static int roundToPowerOfTwo(int i4) {
        return 1 << (32 - Integer.numberOfLeadingZeros(i4 - 1));
    }
}
