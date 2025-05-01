package kotlinx.coroutines.channels;

import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import kotlinx.coroutines.internal.o0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: AbstractChannel.kt */
/* loaded from: classes6.dex */
public abstract class a0 extends LockFreeLinkedListNode {
    public abstract void e0();

    @Nullable
    public abstract Object f0();

    public abstract void g0(@NotNull p<?> pVar);

    @Nullable
    public abstract o0 h0(@Nullable LockFreeLinkedListNode.d dVar);

    public void i0() {
    }
}
