package kotlinx.coroutines.flow.internal;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
/* compiled from: AbstractSharedFlow.kt */
/* loaded from: classes6.dex */
public abstract class c<F> {
    public abstract boolean a(F f5);

    @NotNull
    public abstract Continuation<Unit>[] b(F f5);
}
