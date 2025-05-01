package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import org.jetbrains.annotations.NotNull;
/* compiled from: SafeCollector.kt */
/* loaded from: classes6.dex */
final class j implements Continuation<Object> {
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public static final j f71010b = new j();
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    private static final CoroutineContext f71011c = EmptyCoroutineContext.INSTANCE;

    private j() {
    }

    @Override // kotlin.coroutines.Continuation
    @NotNull
    public CoroutineContext getContext() {
        return f71011c;
    }

    @Override // kotlin.coroutines.Continuation
    public void resumeWith(@NotNull Object obj) {
    }
}
