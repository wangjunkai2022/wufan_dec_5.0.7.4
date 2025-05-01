package kotlinx.coroutines.channels;

import kotlin.jvm.JvmField;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import kotlinx.coroutines.internal.o0;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.t0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: AbstractChannel.kt */
/* loaded from: classes6.dex */
public final class p<E> extends a0 implements y<E> {
    @JvmField
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    public final Throwable f69995e;

    public p(@Nullable Throwable th) {
        this.f69995e = th;
    }

    @Override // kotlinx.coroutines.channels.a0
    public void e0() {
    }

    @Override // kotlinx.coroutines.channels.a0
    public void g0(@NotNull p<?> pVar) {
        if (s0.b()) {
            throw new AssertionError();
        }
    }

    @Override // kotlinx.coroutines.channels.a0
    @NotNull
    public o0 h0(@Nullable LockFreeLinkedListNode.d dVar) {
        o0 o0Var = kotlinx.coroutines.r.f71241d;
        if (dVar != null) {
            dVar.d();
        }
        return o0Var;
    }

    @Override // kotlinx.coroutines.channels.y
    public void j(E e5) {
    }

    @Override // kotlinx.coroutines.channels.y
    @NotNull
    /* renamed from: j0 */
    public p<E> d() {
        return this;
    }

    @Override // kotlinx.coroutines.channels.a0
    @NotNull
    /* renamed from: k0 */
    public p<E> f0() {
        return this;
    }

    @NotNull
    public final Throwable l0() {
        Throwable th = this.f69995e;
        return th == null ? new ClosedReceiveChannelException(o.f69994a) : th;
    }

    @NotNull
    public final Throwable m0() {
        Throwable th = this.f69995e;
        return th == null ? new ClosedSendChannelException(o.f69994a) : th;
    }

    @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
    @NotNull
    public String toString() {
        return "Closed@" + t0.b(this) + '[' + this.f69995e + ']';
    }

    @Override // kotlinx.coroutines.channels.y
    @NotNull
    public o0 v(E e5, @Nullable LockFreeLinkedListNode.d dVar) {
        o0 o0Var = kotlinx.coroutines.r.f71241d;
        if (dVar != null) {
            dVar.d();
        }
        return o0Var;
    }
}
