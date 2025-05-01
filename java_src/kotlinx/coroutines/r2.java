package kotlinx.coroutines;

import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: JobSupport.kt */
/* loaded from: classes6.dex */
public final class r2 extends f2 {
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    private final Continuation<Unit> f71242f;

    /* JADX WARN: Multi-variable type inference failed */
    public r2(@NotNull Continuation<? super Unit> continuation) {
        this.f71242f = continuation;
    }

    @Override // kotlinx.coroutines.f0
    public void e0(@Nullable Throwable th) {
        Continuation<Unit> continuation = this.f71242f;
        Result.Companion companion = Result.Companion;
        continuation.resumeWith(Result.m35constructorimpl(Unit.INSTANCE));
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
        e0(th);
        return Unit.INSTANCE;
    }
}
