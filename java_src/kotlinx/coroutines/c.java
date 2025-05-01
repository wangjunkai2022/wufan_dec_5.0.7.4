package kotlinx.coroutines;

import java.util.concurrent.locks.LockSupport;
import kotlin.Unit;
import kotlin.internal.InlineOnly;
import org.jetbrains.annotations.Nullable;
/* compiled from: AbstractTimeSource.kt */
/* loaded from: classes6.dex */
public final class c {
    @Nullable

    /* renamed from: a  reason: collision with root package name */
    private static b f69664a;

    @InlineOnly
    private static final long a() {
        b b5 = b();
        Long valueOf = b5 == null ? null : Long.valueOf(b5.a());
        return valueOf == null ? System.currentTimeMillis() : valueOf.longValue();
    }

    @Nullable
    public static final b b() {
        return f69664a;
    }

    @InlineOnly
    private static final long c() {
        b b5 = b();
        Long valueOf = b5 == null ? null : Long.valueOf(b5.b());
        return valueOf == null ? System.nanoTime() : valueOf.longValue();
    }

    @InlineOnly
    private static final void d(Object obj, long j4) {
        Unit unit;
        b b5 = b();
        if (b5 == null) {
            unit = null;
        } else {
            b5.c(obj, j4);
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            LockSupport.parkNanos(obj, j4);
        }
    }

    @InlineOnly
    private static final void e() {
        b b5 = b();
        if (b5 == null) {
            return;
        }
        b5.d();
    }

    public static final void f(@Nullable b bVar) {
        f69664a = bVar;
    }

    @InlineOnly
    private static final void g() {
        b b5 = b();
        if (b5 == null) {
            return;
        }
        b5.e();
    }

    @InlineOnly
    private static final void h() {
        b b5 = b();
        if (b5 == null) {
            return;
        }
        b5.f();
    }

    @InlineOnly
    private static final void i(Thread thread) {
        Unit unit;
        b b5 = b();
        if (b5 == null) {
            unit = null;
        } else {
            b5.g(thread);
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            LockSupport.unpark(thread);
        }
    }

    @InlineOnly
    private static final void j() {
        b b5 = b();
        if (b5 == null) {
            return;
        }
        b5.h();
    }

    @InlineOnly
    private static final Runnable k(Runnable runnable) {
        Runnable i4;
        b b5 = b();
        return (b5 == null || (i4 = b5.i(runnable)) == null) ? runnable : i4;
    }
}
