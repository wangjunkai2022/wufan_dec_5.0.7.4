package kotlinx.coroutines.internal;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.b3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ThreadContext.kt */
/* loaded from: classes6.dex */
public final class t0<T> implements b3<T> {

    /* renamed from: b  reason: collision with root package name */
    private final T f71146b;
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    private final ThreadLocal<T> f71147c;
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    private final CoroutineContext.Key<?> f71148d;

    public t0(T t4, @NotNull ThreadLocal<T> threadLocal) {
        this.f71146b = t4;
        this.f71147c = threadLocal;
        this.f71148d = new u0(threadLocal);
    }

    @Override // kotlinx.coroutines.b3
    public void C(@NotNull CoroutineContext coroutineContext, T t4) {
        this.f71147c.set(t4);
    }

    @Override // kotlinx.coroutines.b3
    public T V(@NotNull CoroutineContext coroutineContext) {
        T t4 = this.f71147c.get();
        this.f71147c.set(this.f71146b);
        return t4;
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public <R> R fold(R r4, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
        return (R) b3.a.a(this, r4, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    @Nullable
    public <E extends CoroutineContext.Element> E get(@NotNull CoroutineContext.Key<E> key) {
        if (Intrinsics.areEqual(getKey(), key)) {
            return this;
        }
        return null;
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    @NotNull
    public CoroutineContext.Key<?> getKey() {
        return this.f71148d;
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    @NotNull
    public CoroutineContext minusKey(@NotNull CoroutineContext.Key<?> key) {
        return Intrinsics.areEqual(getKey(), key) ? EmptyCoroutineContext.INSTANCE : this;
    }

    @Override // kotlin.coroutines.CoroutineContext
    @NotNull
    public CoroutineContext plus(@NotNull CoroutineContext coroutineContext) {
        return b3.a.d(this, coroutineContext);
    }

    @NotNull
    public String toString() {
        return "ThreadLocal(value=" + this.f71146b + ", threadLocal = " + this.f71147c + ')';
    }
}
