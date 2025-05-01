package kotlinx.coroutines;

import org.jetbrains.annotations.NotNull;
/* compiled from: EventLoop.common.kt */
/* loaded from: classes6.dex */
public final class o1 {

    /* renamed from: b  reason: collision with root package name */
    private static final int f71221b = 0;

    /* renamed from: c  reason: collision with root package name */
    private static final int f71222c = 1;

    /* renamed from: d  reason: collision with root package name */
    private static final int f71223d = 2;

    /* renamed from: e  reason: collision with root package name */
    private static final long f71224e = 1000000;

    /* renamed from: f  reason: collision with root package name */
    private static final long f71225f = 9223372036854L;

    /* renamed from: g  reason: collision with root package name */
    private static final long f71226g = 4611686018427387903L;
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    private static final kotlinx.coroutines.internal.o0 f71220a = new kotlinx.coroutines.internal.o0("REMOVED_TASK");
    @NotNull

    /* renamed from: h  reason: collision with root package name */
    private static final kotlinx.coroutines.internal.o0 f71227h = new kotlinx.coroutines.internal.o0("CLOSED_EMPTY");

    public static final long c(long j4) {
        return j4 / f71224e;
    }

    public static final long d(long j4) {
        if (j4 <= 0) {
            return 0L;
        }
        if (j4 >= f71225f) {
            return Long.MAX_VALUE;
        }
        return f71224e * j4;
    }

    private static /* synthetic */ void e() {
    }

    private static /* synthetic */ void f() {
    }
}
