package kotlinx.coroutines;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Builders.common.kt */
/* loaded from: classes6.dex */
public final class h2<T> extends x0<T> {
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    private final Continuation<Unit> f71057d;

    public h2(@NotNull CoroutineContext coroutineContext, @NotNull Function2<? super q0, ? super Continuation<? super T>, ? extends Object> function2) {
        super(coroutineContext, false);
        Continuation<Unit> createCoroutineUnintercepted;
        createCoroutineUnintercepted = IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted(function2, this, this);
        this.f71057d = createCoroutineUnintercepted;
    }

    @Override // kotlinx.coroutines.JobSupport
    protected void b1() {
        s3.a.c(this.f71057d, this);
    }
}
