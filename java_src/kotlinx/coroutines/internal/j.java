package kotlinx.coroutines.internal;

import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;
/* compiled from: Scopes.kt */
/* loaded from: classes6.dex */
public final class j implements kotlinx.coroutines.q0 {
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    private final CoroutineContext f71119b;

    public j(@NotNull CoroutineContext coroutineContext) {
        this.f71119b = coroutineContext;
    }

    @Override // kotlinx.coroutines.q0
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.f71119b;
    }

    @NotNull
    public String toString() {
        return "CoroutineScope(coroutineContext=" + getCoroutineContext() + ')';
    }
}
