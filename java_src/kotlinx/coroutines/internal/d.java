package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.InternalCoroutinesApi;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: Atomic.kt */
@InternalCoroutinesApi
/* loaded from: classes6.dex */
public abstract class d<T> extends g0 {

    /* renamed from: a  reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f71105a = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "_consensus");
    @NotNull
    private volatile /* synthetic */ Object _consensus = c.f71100a;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.internal.g0
    @NotNull
    public d<?> a() {
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.internal.g0
    @Nullable
    public final Object c(@Nullable Object obj) {
        Object obj2 = this._consensus;
        if (obj2 == c.f71100a) {
            obj2 = e(i(obj));
        }
        d(obj, obj2);
        return obj2;
    }

    public abstract void d(T t4, @Nullable Object obj);

    @Nullable
    public final Object e(@Nullable Object obj) {
        if (kotlinx.coroutines.s0.b()) {
            if (!(obj != c.f71100a)) {
                throw new AssertionError();
            }
        }
        Object obj2 = this._consensus;
        Object obj3 = c.f71100a;
        return obj2 != obj3 ? obj2 : f71105a.compareAndSet(this, obj3, obj) ? obj : this._consensus;
    }

    @Nullable
    public final Object f() {
        return this._consensus;
    }

    public long g() {
        return 0L;
    }

    public final boolean h() {
        return this._consensus != c.f71100a;
    }

    @Nullable
    public abstract Object i(T t4);
}
