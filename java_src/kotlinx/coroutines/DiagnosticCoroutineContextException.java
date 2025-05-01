package kotlinx.coroutines;

import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;
/* compiled from: CoroutineExceptionHandlerImpl.kt */
/* loaded from: classes6.dex */
final class DiagnosticCoroutineContextException extends RuntimeException {
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    private final CoroutineContext f69610b;

    public DiagnosticCoroutineContextException(@NotNull CoroutineContext coroutineContext) {
        this.f69610b = coroutineContext;
    }

    @Override // java.lang.Throwable
    @NotNull
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    @NotNull
    public String getLocalizedMessage() {
        return this.f69610b.toString();
    }
}
