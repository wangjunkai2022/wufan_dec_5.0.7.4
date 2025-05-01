package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.internal.k0;
import org.jetbrains.annotations.NotNull;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FlowCoroutine.kt */
/* loaded from: classes6.dex */
public final class g<T> extends k0<T> {
    public g(@NotNull CoroutineContext coroutineContext, @NotNull Continuation<? super T> continuation) {
        super(coroutineContext, continuation);
    }

    @Override // kotlinx.coroutines.JobSupport
    public boolean p0(@NotNull Throwable th) {
        if (th instanceof ChildCancelledException) {
            return true;
        }
        return k0(th);
    }
}
