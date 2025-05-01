package kotlinx.coroutines.sync;

import kotlin.Unit;
import kotlinx.coroutines.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: Semaphore.kt */
/* loaded from: classes7.dex */
final class a extends n {
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    private final e f71418b;

    /* renamed from: c  reason: collision with root package name */
    private final int f71419c;

    public a(@NotNull e eVar, int i4) {
        this.f71418b = eVar;
        this.f71419c = i4;
    }

    @Override // kotlinx.coroutines.o
    public void a(@Nullable Throwable th) {
        this.f71418b.s(this.f71419c);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
        a(th);
        return Unit.INSTANCE;
    }

    @NotNull
    public String toString() {
        return "CancelSemaphoreAcquisitionHandler[" + this.f71418b + ", " + this.f71419c + ']';
    }
}
