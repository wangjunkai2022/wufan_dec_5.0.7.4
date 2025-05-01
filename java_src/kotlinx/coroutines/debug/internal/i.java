package kotlinx.coroutines.debug.internal;

import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: StackTraceFrame.kt */
/* loaded from: classes6.dex */
public final class i implements CoroutineStackFrame {
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    private final CoroutineStackFrame f70107b;
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    private final StackTraceElement f70108c;

    public i(@Nullable CoroutineStackFrame coroutineStackFrame, @NotNull StackTraceElement stackTraceElement) {
        this.f70107b = coroutineStackFrame;
        this.f70108c = stackTraceElement;
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    @Nullable
    public CoroutineStackFrame getCallerFrame() {
        return this.f70107b;
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    @NotNull
    public StackTraceElement getStackTraceElement() {
        return this.f70108c;
    }
}
