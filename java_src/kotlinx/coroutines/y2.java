package kotlinx.coroutines;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;
/* compiled from: Supervisor.kt */
/* loaded from: classes6.dex */
final class y2<T> extends kotlinx.coroutines.internal.k0<T> {
    public y2(@NotNull CoroutineContext coroutineContext, @NotNull Continuation<? super T> continuation) {
        super(coroutineContext, continuation);
    }

    @Override // kotlinx.coroutines.JobSupport
    public boolean p0(@NotNull Throwable th) {
        return false;
    }
}
