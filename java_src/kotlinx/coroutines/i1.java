package kotlinx.coroutines;

import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: JobSupport.kt */
/* loaded from: classes6.dex */
public final class i1 extends f2 {
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    private final g1 f71059f;

    public i1(@NotNull g1 g1Var) {
        this.f71059f = g1Var;
    }

    @Override // kotlinx.coroutines.f0
    public void e0(@Nullable Throwable th) {
        this.f71059f.dispose();
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
        e0(th);
        return Unit.INSTANCE;
    }
}
