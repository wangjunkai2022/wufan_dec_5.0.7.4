package kotlinx.coroutines.channels;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import kotlinx.coroutines.internal.o0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: AbstractChannel.kt */
/* loaded from: classes6.dex */
public abstract class x<E> extends LockFreeLinkedListNode implements y<E> {
    @Override // kotlinx.coroutines.channels.y
    @NotNull
    /* renamed from: e0 */
    public o0 d() {
        return a.f69942d;
    }

    @Nullable
    public Function1<Throwable, Unit> f0(E e5) {
        return null;
    }

    public abstract void g0(@NotNull p<?> pVar);
}
