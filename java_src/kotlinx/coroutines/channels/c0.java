package kotlinx.coroutines.channels;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.JvmField;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import kotlinx.coroutines.internal.o0;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.t0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: AbstractChannel.kt */
/* loaded from: classes6.dex */
public class c0<E> extends a0 {

    /* renamed from: e  reason: collision with root package name */
    private final E f69959e;
    @JvmField
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    public final kotlinx.coroutines.p<Unit> f69960f;

    /* JADX WARN: Multi-variable type inference failed */
    public c0(E e5, @NotNull kotlinx.coroutines.p<? super Unit> pVar) {
        this.f69959e = e5;
        this.f69960f = pVar;
    }

    @Override // kotlinx.coroutines.channels.a0
    public void e0() {
        this.f69960f.Y(kotlinx.coroutines.r.f71241d);
    }

    @Override // kotlinx.coroutines.channels.a0
    public E f0() {
        return this.f69959e;
    }

    @Override // kotlinx.coroutines.channels.a0
    public void g0(@NotNull p<?> pVar) {
        kotlinx.coroutines.p<Unit> pVar2 = this.f69960f;
        Result.Companion companion = Result.Companion;
        pVar2.resumeWith(Result.m35constructorimpl(ResultKt.createFailure(pVar.m0())));
    }

    @Override // kotlinx.coroutines.channels.a0
    @Nullable
    public o0 h0(@Nullable LockFreeLinkedListNode.d dVar) {
        Object c5 = this.f69960f.c(Unit.INSTANCE, dVar == null ? null : dVar.f71080c);
        if (c5 == null) {
            return null;
        }
        if (s0.b()) {
            if (!(c5 == kotlinx.coroutines.r.f71241d)) {
                throw new AssertionError();
            }
        }
        if (dVar != null) {
            dVar.d();
        }
        return kotlinx.coroutines.r.f71241d;
    }

    @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
    @NotNull
    public String toString() {
        return t0.a(this) + '@' + t0.b(this) + '(' + f0() + ')';
    }
}
