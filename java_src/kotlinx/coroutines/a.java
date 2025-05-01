package kotlinx.coroutines;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: AbstractCoroutine.kt */
@InternalCoroutinesApi
/* loaded from: classes6.dex */
public abstract class a<T> extends JobSupport implements z1, Continuation<T>, q0 {
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    private final CoroutineContext f69642c;

    public a(@NotNull CoroutineContext coroutineContext, boolean z4, boolean z5) {
        super(z5);
        if (z4) {
            J0((z1) coroutineContext.get(z1.f71466g1));
        }
        this.f69642c = coroutineContext.plus(this);
    }

    public static /* synthetic */ void t1() {
    }

    @Override // kotlinx.coroutines.JobSupport
    public final void I0(@NotNull Throwable th) {
        n0.b(this.f69642c, th);
    }

    @Override // kotlinx.coroutines.JobSupport
    @NotNull
    public String U0() {
        String b5 = CoroutineContextKt.b(this.f69642c);
        if (b5 == null) {
            return super.U0();
        }
        return '\"' + b5 + "\":" + super.U0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.JobSupport
    protected final void a1(@Nullable Object obj) {
        if (obj instanceof d0) {
            d0 d0Var = (d0) obj;
            u1(d0Var.f70014a, d0Var.a());
            return;
        }
        v1(obj);
    }

    @Override // kotlin.coroutines.Continuation
    @NotNull
    public final CoroutineContext getContext() {
        return this.f69642c;
    }

    @Override // kotlinx.coroutines.q0
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.f69642c;
    }

    @Override // kotlinx.coroutines.JobSupport, kotlinx.coroutines.z1
    public boolean isActive() {
        return super.isActive();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.JobSupport
    @NotNull
    public String o0() {
        return Intrinsics.stringPlus(t0.a(this), " was cancelled");
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(@NotNull Object obj) {
        Object S0 = S0(i0.d(obj, null, 1, null));
        if (S0 == g2.f71042b) {
            return;
        }
        s1(S0);
    }

    protected void s1(@Nullable Object obj) {
        f0(obj);
    }

    protected void u1(@NotNull Throwable th, boolean z4) {
    }

    protected void v1(T t4) {
    }

    public final <R> void w1(@NotNull CoroutineStart coroutineStart, R r4, @NotNull Function2<? super R, ? super Continuation<? super T>, ? extends Object> function2) {
        coroutineStart.invoke(function2, r4, this);
    }
}
