package kotlinx.coroutines.channels;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
/* compiled from: Broadcast.kt */
/* loaded from: classes6.dex */
final class t<E> extends j<E> {
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    private final Continuation<Unit> f70011e;

    public t(@NotNull CoroutineContext coroutineContext, @NotNull h<E> hVar, @NotNull Function2<? super w<? super E>, ? super Continuation<? super Unit>, ? extends Object> function2) {
        super(coroutineContext, hVar, false);
        Continuation<Unit> createCoroutineUnintercepted;
        createCoroutineUnintercepted = IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted(function2, this, this);
        this.f70011e = createCoroutineUnintercepted;
    }

    @Override // kotlinx.coroutines.JobSupport
    protected void b1() {
        s3.a.c(this.f70011e, this);
    }

    @Override // kotlinx.coroutines.channels.j, kotlinx.coroutines.channels.h
    @NotNull
    public ReceiveChannel<E> q() {
        ReceiveChannel<E> q4 = x1().q();
        start();
        return q4;
    }
}
