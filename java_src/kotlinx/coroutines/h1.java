package kotlinx.coroutines;

import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: CancellableContinuation.kt */
/* loaded from: classes6.dex */
final class h1 extends n {
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    private final g1 f71056b;

    public h1(@NotNull g1 g1Var) {
        this.f71056b = g1Var;
    }

    @Override // kotlinx.coroutines.o
    public void a(@Nullable Throwable th) {
        this.f71056b.dispose();
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
        a(th);
        return Unit.INSTANCE;
    }

    @NotNull
    public String toString() {
        return "DisposeOnCancel[" + this.f71056b + ']';
    }
}
