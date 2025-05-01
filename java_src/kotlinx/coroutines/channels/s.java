package kotlinx.coroutines.channels;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: Actor.kt */
/* loaded from: classes6.dex */
final class s<E> extends c<E> implements kotlinx.coroutines.selects.e<E, b0<? super E>> {
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    private Continuation<? super Unit> f70010e;

    public s(@NotNull CoroutineContext coroutineContext, @NotNull k<E> kVar, @NotNull Function2<? super e<E>, ? super Continuation<? super Unit>, ? extends Object> function2) {
        super(coroutineContext, kVar, false);
        Continuation<Unit> createCoroutineUnintercepted;
        createCoroutineUnintercepted = IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted(function2, this, this);
        this.f70010e = createCoroutineUnintercepted;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.selects.e
    public <R> void A(@NotNull kotlinx.coroutines.selects.f<? super R> fVar, E e5, @NotNull Function2<? super b0<? super E>, ? super Continuation<? super R>, ? extends Object> function2) {
        start();
        super.o().A(fVar, e5, function2);
    }

    @Override // kotlinx.coroutines.channels.l, kotlinx.coroutines.channels.b0
    public boolean R(@Nullable Throwable th) {
        boolean R = super.R(th);
        start();
        return R;
    }

    @Override // kotlinx.coroutines.channels.l, kotlinx.coroutines.channels.b0
    @Nullable
    public Object S(E e5, @NotNull Continuation<? super Unit> continuation) {
        Object coroutine_suspended;
        start();
        Object S = super.S(e5, continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return S == coroutine_suspended ? S : Unit.INSTANCE;
    }

    @Override // kotlinx.coroutines.JobSupport
    protected void b1() {
        s3.a.c(this.f70010e, this);
    }

    @Override // kotlinx.coroutines.channels.l, kotlinx.coroutines.channels.b0
    @NotNull
    public kotlinx.coroutines.selects.e<E, b0<E>> o() {
        return this;
    }

    @Override // kotlinx.coroutines.channels.l, kotlinx.coroutines.channels.b0
    public boolean offer(E e5) {
        start();
        return super.offer(e5);
    }

    @Override // kotlinx.coroutines.channels.l, kotlinx.coroutines.channels.b0
    @NotNull
    public Object x(E e5) {
        start();
        return super.x(e5);
    }
}
