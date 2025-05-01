package kotlinx.coroutines.channels;

import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import kotlinx.coroutines.internal.o0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: AbstractChannel.kt */
/* loaded from: classes6.dex */
public interface y<E> {
    @NotNull
    Object d();

    void j(E e5);

    @Nullable
    o0 v(E e5, @Nullable LockFreeLinkedListNode.d dVar);
}
