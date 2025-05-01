package kotlinx.coroutines.flow.internal;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlinx.coroutines.InternalCoroutinesApi;
import kotlinx.coroutines.channels.b0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: SendingCollector.kt */
@InternalCoroutinesApi
/* loaded from: classes6.dex */
public final class m<T> implements kotlinx.coroutines.flow.f<T> {
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    private final b0<T> f71016b;

    /* JADX WARN: Multi-variable type inference failed */
    public m(@NotNull b0<? super T> b0Var) {
        this.f71016b = b0Var;
    }

    @Override // kotlinx.coroutines.flow.f
    @Nullable
    public Object emit(T t4, @NotNull Continuation<? super Unit> continuation) {
        Object coroutine_suspended;
        Object S = this.f71016b.S(t4, continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return S == coroutine_suspended ? S : Unit.INSTANCE;
    }
}
