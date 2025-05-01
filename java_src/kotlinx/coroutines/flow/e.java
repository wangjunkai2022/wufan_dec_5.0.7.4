package kotlinx.coroutines.flow;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: Flow.kt */
/* loaded from: classes6.dex */
public interface e<T> {
    @Nullable
    Object a(@NotNull f<? super T> fVar, @NotNull Continuation<? super Unit> continuation);
}
