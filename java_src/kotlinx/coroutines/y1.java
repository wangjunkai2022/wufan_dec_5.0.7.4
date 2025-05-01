package kotlinx.coroutines;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: JobSupport.kt */
/* loaded from: classes6.dex */
public final class y1 extends f2 {
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    private final Function1<Throwable, Unit> f71464f;

    /* JADX WARN: Multi-variable type inference failed */
    public y1(@NotNull Function1<? super Throwable, Unit> function1) {
        this.f71464f = function1;
    }

    @Override // kotlinx.coroutines.f0
    public void e0(@Nullable Throwable th) {
        this.f71464f.invoke(th);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
        e0(th);
        return Unit.INSTANCE;
    }
}
