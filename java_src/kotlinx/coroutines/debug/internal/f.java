package kotlinx.coroutines.debug.internal;

import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
/* compiled from: DebugProbes.kt */
/* loaded from: classes6.dex */
public final class f {
    @NotNull
    public static final <T> Continuation<T> a(@NotNull Continuation<? super T> continuation) {
        return DebugProbesImpl.f70061a.F(continuation);
    }

    public static final void b(@NotNull Continuation<?> continuation) {
        DebugProbesImpl.f70061a.G(continuation);
    }

    public static final void c(@NotNull Continuation<?> continuation) {
        DebugProbesImpl.f70061a.H(continuation);
    }
}
