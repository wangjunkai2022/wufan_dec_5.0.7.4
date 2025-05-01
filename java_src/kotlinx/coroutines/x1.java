package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: JobSupport.kt */
/* loaded from: classes6.dex */
final class x1 extends a2 {

    /* renamed from: g  reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f71462g = AtomicIntegerFieldUpdater.newUpdater(x1.class, "_invoked");
    @NotNull
    private volatile /* synthetic */ int _invoked = 0;
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    private final Function1<Throwable, Unit> f71463f;

    /* JADX WARN: Multi-variable type inference failed */
    public x1(@NotNull Function1<? super Throwable, Unit> function1) {
        this.f71463f = function1;
    }

    @Override // kotlinx.coroutines.f0
    public void e0(@Nullable Throwable th) {
        if (f71462g.compareAndSet(this, 0, 1)) {
            this.f71463f.invoke(th);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
        e0(th);
        return Unit.INSTANCE;
    }
}
