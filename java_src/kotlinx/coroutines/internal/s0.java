package kotlinx.coroutines.internal;

import kotlin.text.StringsKt__StringNumberConversionsKt;
import org.jetbrains.annotations.NotNull;
/* compiled from: SystemProps.common.kt */
/* loaded from: classes6.dex */
public final /* synthetic */ class s0 {
    public static final int a(@NotNull String str, int i4, int i5, int i6) {
        return (int) q0.c(str, i4, i5, i6);
    }

    public static final long b(@NotNull String str, long j4, long j5, long j6) {
        Long longOrNull;
        String d5 = q0.d(str);
        if (d5 == null) {
            return j4;
        }
        longOrNull = StringsKt__StringNumberConversionsKt.toLongOrNull(d5);
        if (longOrNull == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + d5 + '\'').toString());
        }
        long longValue = longOrNull.longValue();
        boolean z4 = false;
        if (j5 <= longValue && longValue <= j6) {
            z4 = true;
        }
        if (z4) {
            return longValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j5 + ".." + j6 + ", but is '" + longValue + '\'').toString());
    }

    public static final boolean c(@NotNull String str, boolean z4) {
        String d5 = q0.d(str);
        return d5 == null ? z4 : Boolean.parseBoolean(d5);
    }

    public static /* synthetic */ int d(String str, int i4, int i5, int i6, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            i5 = 1;
        }
        if ((i7 & 8) != 0) {
            i6 = Integer.MAX_VALUE;
        }
        return q0.b(str, i4, i5, i6);
    }

    public static /* synthetic */ long e(String str, long j4, long j5, long j6, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            j5 = 1;
        }
        long j7 = j5;
        if ((i4 & 8) != 0) {
            j6 = Long.MAX_VALUE;
        }
        return q0.c(str, j4, j7, j6);
    }
}
