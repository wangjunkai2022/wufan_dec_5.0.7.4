package kotlinx.coroutines.flow;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.internal.o0;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: StateFlow.kt */
/* loaded from: classes6.dex */
public final class w extends kotlinx.coroutines.flow.internal.c<StateFlowImpl<?>> {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ AtomicReferenceFieldUpdater f71037a = AtomicReferenceFieldUpdater.newUpdater(w.class, Object.class, "_state");
    @NotNull
    volatile /* synthetic */ Object _state = null;

    @Override // kotlinx.coroutines.flow.internal.c
    /* renamed from: c */
    public boolean a(@NotNull StateFlowImpl<?> stateFlowImpl) {
        o0 o0Var;
        if (this._state != null) {
            return false;
        }
        o0Var = v.f71035a;
        this._state = o0Var;
        return true;
    }

    @Nullable
    public final Object d(@NotNull Continuation<? super Unit> continuation) {
        Continuation intercepted;
        o0 o0Var;
        Object coroutine_suspended;
        Object coroutine_suspended2;
        o0 o0Var2;
        intercepted = IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation);
        kotlinx.coroutines.q qVar = new kotlinx.coroutines.q(intercepted, 1);
        qVar.P();
        if (!s0.b() || (!(this._state instanceof kotlinx.coroutines.q))) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f71037a;
            o0Var = v.f71035a;
            if (!atomicReferenceFieldUpdater.compareAndSet(this, o0Var, qVar)) {
                if (s0.b()) {
                    Object obj = this._state;
                    o0Var2 = v.f71036b;
                    if (!(obj == o0Var2)) {
                        throw new AssertionError();
                    }
                }
                Result.Companion companion = Result.Companion;
                qVar.resumeWith(Result.m35constructorimpl(Unit.INSTANCE));
            }
            Object y2 = qVar.y();
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (y2 == coroutine_suspended) {
                DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            coroutine_suspended2 = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            return y2 == coroutine_suspended2 ? y2 : Unit.INSTANCE;
        }
        throw new AssertionError();
    }

    @Override // kotlinx.coroutines.flow.internal.c
    @NotNull
    /* renamed from: e */
    public Continuation<Unit>[] b(@NotNull StateFlowImpl<?> stateFlowImpl) {
        this._state = null;
        return kotlinx.coroutines.flow.internal.b.f71007a;
    }

    public final void f() {
        o0 o0Var;
        o0 o0Var2;
        o0 o0Var3;
        o0 o0Var4;
        while (true) {
            Object obj = this._state;
            if (obj == null) {
                return;
            }
            o0Var = v.f71036b;
            if (obj == o0Var) {
                return;
            }
            o0Var2 = v.f71035a;
            if (obj == o0Var2) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f71037a;
                o0Var3 = v.f71036b;
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj, o0Var3)) {
                    return;
                }
            } else {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f71037a;
                o0Var4 = v.f71035a;
                if (atomicReferenceFieldUpdater2.compareAndSet(this, obj, o0Var4)) {
                    Result.Companion companion = Result.Companion;
                    ((kotlinx.coroutines.q) obj).resumeWith(Result.m35constructorimpl(Unit.INSTANCE));
                    return;
                }
            }
        }
    }

    public final boolean g() {
        o0 o0Var;
        o0 o0Var2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f71037a;
        o0Var = v.f71035a;
        Object andSet = atomicReferenceFieldUpdater.getAndSet(this, o0Var);
        Intrinsics.checkNotNull(andSet);
        if (!s0.b() || (!(andSet instanceof kotlinx.coroutines.q))) {
            o0Var2 = v.f71036b;
            return andSet == o0Var2;
        }
        throw new AssertionError();
    }
}
