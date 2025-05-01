package kotlinx.coroutines;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: CancellableContinuationImpl.kt */
/* loaded from: classes6.dex */
final class w1 extends n {
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    private final Function1<Throwable, Unit> f71459b;

    /* JADX WARN: Multi-variable type inference failed */
    public w1(@NotNull Function1<? super Throwable, Unit> function1) {
        this.f71459b = function1;
    }

    @Override // kotlinx.coroutines.o
    public void a(@Nullable Throwable th) {
        this.f71459b.invoke(th);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
        a(th);
        return Unit.INSTANCE;
    }

    @NotNull
    public String toString() {
        return "InvokeOnCancel[" + t0.a(this.f71459b) + '@' + t0.b(this) + ']';
    }
}
