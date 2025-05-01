package kotlin.internal;

import kotlin.PublishedApi;
/* compiled from: progressionUtil.kt */
/* loaded from: classes6.dex */
public final class ProgressionUtilKt {
    private static final int differenceModulo(int i4, int i5, int i6) {
        return mod(mod(i4, i6) - mod(i5, i6), i6);
    }

    @PublishedApi
    public static final int getProgressionLastElement(int i4, int i5, int i6) {
        if (i6 > 0) {
            return i4 >= i5 ? i5 : i5 - differenceModulo(i5, i4, i6);
        } else if (i6 < 0) {
            return i4 <= i5 ? i5 : i5 + differenceModulo(i4, i5, -i6);
        } else {
            throw new IllegalArgumentException("Step is zero.");
        }
    }

    private static final int mod(int i4, int i5) {
        int i6 = i4 % i5;
        return i6 >= 0 ? i6 : i6 + i5;
    }

    private static final long differenceModulo(long j4, long j5, long j6) {
        return mod(mod(j4, j6) - mod(j5, j6), j6);
    }

    private static final long mod(long j4, long j5) {
        long j6 = j4 % j5;
        return j6 >= 0 ? j6 : j6 + j5;
    }

    @PublishedApi
    public static final long getProgressionLastElement(long j4, long j5, long j6) {
        if (j6 > 0) {
            return j4 >= j5 ? j5 : j5 - differenceModulo(j5, j4, j6);
        } else if (j6 < 0) {
            return j4 <= j5 ? j5 : j5 + differenceModulo(j4, j5, -j6);
        } else {
            throw new IllegalArgumentException("Step is zero.");
        }
    }
}
