package kotlinx.coroutines;

import java.util.concurrent.Future;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: Future.kt */
/* loaded from: classes6.dex */
final class m extends f2 {
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    private final Future<?> f71214f;

    public m(@NotNull Future<?> future) {
        this.f71214f = future;
    }

    @Override // kotlinx.coroutines.f0
    public void e0(@Nullable Throwable th) {
        if (th != null) {
            this.f71214f.cancel(false);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
        e0(th);
        return Unit.INSTANCE;
    }
}
