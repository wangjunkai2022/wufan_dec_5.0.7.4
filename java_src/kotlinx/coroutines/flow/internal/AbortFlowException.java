package kotlinx.coroutines.flow.internal;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
/* compiled from: FlowExceptions.kt */
/* loaded from: classes6.dex */
public final class AbortFlowException extends CancellationException {
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    private final kotlinx.coroutines.flow.f<?> f70867b;

    public AbortFlowException(@NotNull kotlinx.coroutines.flow.f<?> fVar) {
        super("Flow was aborted, no more elements needed");
        this.f70867b = fVar;
    }

    @NotNull
    public final kotlinx.coroutines.flow.f<?> a() {
        return this.f70867b;
    }

    @Override // java.lang.Throwable
    @NotNull
    public Throwable fillInStackTrace() {
        if (s0.d()) {
            return super.fillInStackTrace();
        }
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
