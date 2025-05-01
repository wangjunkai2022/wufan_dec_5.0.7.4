package kotlinx.coroutines.flow;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Context.kt */
/* loaded from: classes6.dex */
public final class CancellableFlowImpl<T> implements a<T> {
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    private final e<T> f70133b;

    /* JADX WARN: Multi-variable type inference failed */
    public CancellableFlowImpl(@NotNull e<? extends T> eVar) {
        this.f70133b = eVar;
    }

    @Override // kotlinx.coroutines.flow.e
    @Nullable
    public Object a(@NotNull f<? super T> fVar, @NotNull Continuation<? super Unit> continuation) {
        Object coroutine_suspended;
        Object a5 = this.f70133b.a(new CancellableFlowImpl$collect$2(fVar), continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return a5 == coroutine_suspended ? a5 : Unit.INSTANCE;
    }
}
