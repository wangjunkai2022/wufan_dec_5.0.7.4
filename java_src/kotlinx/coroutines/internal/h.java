package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.internal.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ConcurrentLinkedList.kt */
/* loaded from: classes6.dex */
public abstract class h<N extends h<N>> {

    /* renamed from: a  reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f71116a = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "_next");

    /* renamed from: b  reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f71117b = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "_prev");
    @NotNull
    private volatile /* synthetic */ Object _next = null;
    @NotNull
    private volatile /* synthetic */ Object _prev;

    public h(@Nullable N n4) {
        this._prev = n4;
    }

    private final N c() {
        N f5 = f();
        while (f5 != null && f5.g()) {
            f5 = (N) f5._prev;
        }
        return f5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object e() {
        return this._next;
    }

    private final N h() {
        if (!kotlinx.coroutines.s0.b() || (!i())) {
            N d5 = d();
            Intrinsics.checkNotNull(d5);
            while (d5.g()) {
                d5 = (N) d5.d();
                Intrinsics.checkNotNull(d5);
            }
            return d5;
        }
        throw new AssertionError();
    }

    public final void b() {
        f71117b.lazySet(this, null);
    }

    @Nullable
    public final N d() {
        Object e5 = e();
        if (e5 == g.a()) {
            return null;
        }
        return (N) e5;
    }

    @Nullable
    public final N f() {
        return (N) this._prev;
    }

    public abstract boolean g();

    public final boolean i() {
        return d() == null;
    }

    public final boolean j() {
        return f71116a.compareAndSet(this, null, g.a());
    }

    @Nullable
    public final N k(@NotNull Function0 function0) {
        Object e5 = e();
        if (e5 != g.a()) {
            return (N) e5;
        }
        function0.invoke();
        throw new KotlinNothingValueException();
    }

    public final void l() {
        if (kotlinx.coroutines.s0.b() && !g()) {
            throw new AssertionError();
        }
        if (kotlinx.coroutines.s0.b() && !(!i())) {
            throw new AssertionError();
        }
        while (true) {
            N c5 = c();
            N h4 = h();
            h4._prev = c5;
            if (c5 != null) {
                c5._next = h4;
            }
            if (!h4.g() && (c5 == null || !c5.g())) {
                return;
            }
        }
    }

    public final boolean m(@NotNull N n4) {
        return f71116a.compareAndSet(this, null, n4);
    }
}
