package kotlinx.coroutines.selects;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.InternalCoroutinesApi;
import kotlinx.coroutines.g1;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: Select.kt */
@InternalCoroutinesApi
/* loaded from: classes7.dex */
public interface f<R> {
    boolean h();

    void l(@NotNull g1 g1Var);

    @Nullable
    Object o(@Nullable LockFreeLinkedListNode.d dVar);

    boolean q();

    @NotNull
    Continuation<R> r();

    void t(@NotNull Throwable th);

    @Nullable
    Object u(@NotNull kotlinx.coroutines.internal.b bVar);
}
