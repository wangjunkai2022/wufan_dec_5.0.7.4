package kotlinx.coroutines.scheduling;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.JvmField;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.internal.q0;
import kotlinx.coroutines.internal.s0;
import org.jetbrains.annotations.NotNull;
/* compiled from: Tasks.kt */
/* loaded from: classes7.dex */
public final class n {
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    public static final String f71312a = "DefaultDispatcher";
    @JvmField

    /* renamed from: b  reason: collision with root package name */
    public static final long f71313b;
    @JvmField

    /* renamed from: c  reason: collision with root package name */
    public static final int f71314c;
    @JvmField

    /* renamed from: d  reason: collision with root package name */
    public static final int f71315d;
    @JvmField

    /* renamed from: e  reason: collision with root package name */
    public static final long f71316e;
    @JvmField
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    public static i f71317f = null;

    /* renamed from: g  reason: collision with root package name */
    public static final int f71318g = 0;

    /* renamed from: h  reason: collision with root package name */
    public static final int f71319h = 1;
    @JvmField
    @NotNull

    /* renamed from: i  reason: collision with root package name */
    public static final k f71320i;
    @JvmField
    @NotNull

    /* renamed from: j  reason: collision with root package name */
    public static final k f71321j;

    static {
        long e5;
        int d5;
        int d6;
        long e6;
        e5 = s0.e("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 0L, 0L, 12, null);
        f71313b = e5;
        d5 = s0.d("kotlinx.coroutines.scheduler.core.pool.size", RangesKt.coerceAtLeast(q0.a(), 2), 1, 0, 8, null);
        f71314c = d5;
        d6 = s0.d("kotlinx.coroutines.scheduler.max.pool.size", CoroutineScheduler.f71269w, 0, CoroutineScheduler.f71269w, 4, null);
        f71315d = d6;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        e6 = s0.e("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 0L, 0L, 12, null);
        f71316e = timeUnit.toNanos(e6);
        f71317f = g.f71302a;
        f71320i = new l(0);
        f71321j = new l(1);
    }

    public static final boolean a(@NotNull j jVar) {
        return jVar.f71309c.P() == 1;
    }
}
