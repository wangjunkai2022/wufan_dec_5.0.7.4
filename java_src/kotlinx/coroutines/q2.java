package kotlinx.coroutines;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: JobSupport.kt */
/* loaded from: classes6.dex */
public final class q2<T> extends f2 {
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    private final q<T> f71237f;

    /* JADX WARN: Multi-variable type inference failed */
    public q2(@NotNull q<? super T> qVar) {
        this.f71237f = qVar;
    }

    @Override // kotlinx.coroutines.f0
    public void e0(@Nullable Throwable th) {
        Object G0 = f0().G0();
        if (s0.b() && !(!(G0 instanceof u1))) {
            throw new AssertionError();
        }
        if (G0 instanceof d0) {
            q<T> qVar = this.f71237f;
            Result.Companion companion = Result.Companion;
            qVar.resumeWith(Result.m35constructorimpl(ResultKt.createFailure(((d0) G0).f70014a)));
            return;
        }
        q<T> qVar2 = this.f71237f;
        Result.Companion companion2 = Result.Companion;
        qVar2.resumeWith(Result.m35constructorimpl(g2.o(G0)));
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
        e0(th);
        return Unit.INSTANCE;
    }
}
