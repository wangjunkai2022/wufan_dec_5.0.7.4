package kotlinx.coroutines.internal;

import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: LockFreeTaskQueue.kt */
/* loaded from: classes6.dex */
public class y<E> {

    /* renamed from: a  reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f71157a = AtomicReferenceFieldUpdater.newUpdater(y.class, Object.class, "_cur");
    @NotNull
    private volatile /* synthetic */ Object _cur;

    public y(boolean z4) {
        this._cur = new z(8, z4);
    }

    public final boolean a(@NotNull E e5) {
        while (true) {
            z zVar = (z) this._cur;
            int a5 = zVar.a(e5);
            if (a5 == 0) {
                return true;
            }
            if (a5 == 1) {
                f71157a.compareAndSet(this, zVar, zVar.k());
            } else if (a5 == 2) {
                return false;
            }
        }
    }

    public final void b() {
        while (true) {
            z zVar = (z) this._cur;
            if (zVar.d()) {
                return;
            }
            f71157a.compareAndSet(this, zVar, zVar.k());
        }
    }

    public final int c() {
        return ((z) this._cur).f();
    }

    public final boolean d() {
        return ((z) this._cur).g();
    }

    public final boolean e() {
        return ((z) this._cur).h();
    }

    @NotNull
    public final <R> List<R> f(@NotNull Function1<? super E, ? extends R> function1) {
        return ((z) this._cur).i(function1);
    }

    @Nullable
    public final E g() {
        while (true) {
            z zVar = (z) this._cur;
            E e5 = (E) zVar.l();
            if (e5 != z.f71177t) {
                return e5;
            }
            f71157a.compareAndSet(this, zVar, zVar.k());
        }
    }
}
