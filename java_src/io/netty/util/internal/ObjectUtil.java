package io.netty.util.internal;

import java.util.Collection;
import java.util.Objects;
/* loaded from: classes6.dex */
public final class ObjectUtil {
    private ObjectUtil() {
    }

    public static <T> T[] checkNonEmpty(T[] tArr, String str) {
        checkNotNull(tArr, str);
        int length = tArr.length;
        checkPositive(length, str + ".length");
        return tArr;
    }

    public static <T> T checkNotNull(T t4, String str) {
        Objects.requireNonNull(t4, str);
        return t4;
    }

    public static int checkPositive(int i4, String str) {
        if (i4 > 0) {
            return i4;
        }
        throw new IllegalArgumentException(str + ": " + i4 + " (expected: > 0)");
    }

    public static int checkPositiveOrZero(int i4, String str) {
        if (i4 >= 0) {
            return i4;
        }
        throw new IllegalArgumentException(str + ": " + i4 + " (expected: >= 0)");
    }

    public static int intValue(Integer num, int i4) {
        return num != null ? num.intValue() : i4;
    }

    public static long longValue(Long l4, long j4) {
        return l4 != null ? l4.longValue() : j4;
    }

    public static long checkPositive(long j4, String str) {
        if (j4 > 0) {
            return j4;
        }
        throw new IllegalArgumentException(str + ": " + j4 + " (expected: > 0)");
    }

    public static long checkPositiveOrZero(long j4, String str) {
        if (j4 >= 0) {
            return j4;
        }
        throw new IllegalArgumentException(str + ": " + j4 + " (expected: >= 0)");
    }

    public static <T extends Collection<?>> T checkNonEmpty(T t4, String str) {
        checkNotNull(t4, str);
        int size = t4.size();
        checkPositive(size, str + ".size");
        return t4;
    }
}
