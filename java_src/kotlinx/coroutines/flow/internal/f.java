package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: SafeCollector.kt */
/* loaded from: classes6.dex */
public final class f implements CoroutineContext {
    @JvmField
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public final Throwable f71008b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ CoroutineContext f71009c;

    public f(@NotNull Throwable th, @NotNull CoroutineContext coroutineContext) {
        this.f71008b = th;
        this.f71009c = coroutineContext;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public <R> R fold(R r4, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
        return (R) this.f71009c.fold(r4, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext
    @Nullable
    public <E extends CoroutineContext.Element> E get(@NotNull CoroutineContext.Key<E> key) {
        return (E) this.f71009c.get(key);
    }

    @Override // kotlin.coroutines.CoroutineContext
    @NotNull
    public CoroutineContext minusKey(@NotNull CoroutineContext.Key<?> key) {
        return this.f71009c.minusKey(key);
    }

    @Override // kotlin.coroutines.CoroutineContext
    @NotNull
    public CoroutineContext plus(@NotNull CoroutineContext coroutineContext) {
        return this.f71009c.plus(coroutineContext);
    }
}
