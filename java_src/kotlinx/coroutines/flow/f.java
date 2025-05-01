package kotlinx.coroutines.flow;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: FlowCollector.kt */
/* loaded from: classes6.dex */
public interface f<T> {
    @Nullable
    Object emit(T t4, @NotNull Continuation<? super Unit> continuation);
}
