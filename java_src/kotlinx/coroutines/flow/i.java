package kotlinx.coroutines.flow;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: SharedFlow.kt */
/* loaded from: classes6.dex */
public interface i<T> extends n<T>, f<T> {
    boolean b(T t4);

    @NotNull
    u<Integer> d();

    @Nullable
    Object emit(T t4, @NotNull Continuation<? super Unit> continuation);

    @ExperimentalCoroutinesApi
    void f();
}
