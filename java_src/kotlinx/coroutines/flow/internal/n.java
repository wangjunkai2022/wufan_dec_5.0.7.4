package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ChannelFlow.kt */
/* loaded from: classes6.dex */
final class n<T> implements Continuation<T>, CoroutineStackFrame {
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    private final Continuation<T> f71017b;
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    private final CoroutineContext f71018c;

    /* JADX WARN: Multi-variable type inference failed */
    public n(@NotNull Continuation<? super T> continuation, @NotNull CoroutineContext coroutineContext) {
        this.f71017b = continuation;
        this.f71018c = coroutineContext;
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    @Nullable
    public CoroutineStackFrame getCallerFrame() {
        Continuation<T> continuation = this.f71017b;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    @Override // kotlin.coroutines.Continuation
    @NotNull
    public CoroutineContext getContext() {
        return this.f71018c;
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    @Nullable
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // kotlin.coroutines.Continuation
    public void resumeWith(@NotNull Object obj) {
        this.f71017b.resumeWith(obj);
    }
}
