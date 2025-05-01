package kotlinx.coroutines.channels;

import kotlin.Unit;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.internal.OnUndeliveredElementKt;
import org.jetbrains.annotations.NotNull;
/* compiled from: AbstractChannel.kt */
/* loaded from: classes6.dex */
public final class d0<E> extends c0<E> {
    @JvmField
    @NotNull

    /* renamed from: g  reason: collision with root package name */
    public final Function1<E, Unit> f69961g;

    /* JADX WARN: Multi-variable type inference failed */
    public d0(E e5, @NotNull kotlinx.coroutines.p<? super Unit> pVar, @NotNull Function1<? super E, Unit> function1) {
        super(e5, pVar);
        this.f69961g = function1;
    }

    @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
    public boolean W() {
        if (super.W()) {
            i0();
            return true;
        }
        return false;
    }

    @Override // kotlinx.coroutines.channels.a0
    public void i0() {
        OnUndeliveredElementKt.b(this.f69961g, f0(), this.f69960f.getContext());
    }
}
