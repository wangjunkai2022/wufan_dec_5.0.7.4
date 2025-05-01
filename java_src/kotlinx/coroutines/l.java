package kotlinx.coroutines;

import java.util.concurrent.Future;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: Future.kt */
/* loaded from: classes6.dex */
final class l extends n {
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    private final Future<?> f71198b;

    public l(@NotNull Future<?> future) {
        this.f71198b = future;
    }

    @Override // kotlinx.coroutines.o
    public void a(@Nullable Throwable th) {
        if (th != null) {
            this.f71198b.cancel(false);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
        a(th);
        return Unit.INSTANCE;
    }

    @NotNull
    public String toString() {
        return "CancelFutureOnCancel[" + this.f71198b + ']';
    }
}
