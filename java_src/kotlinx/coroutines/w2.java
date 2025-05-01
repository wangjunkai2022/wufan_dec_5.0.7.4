package kotlinx.coroutines;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: JobSupport.kt */
/* loaded from: classes6.dex */
final class w2<R> extends f2 {
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    private final kotlinx.coroutines.selects.f<R> f71460f;
    @NotNull

    /* renamed from: g  reason: collision with root package name */
    private final Function1<Continuation<? super R>, Object> f71461g;

    /* JADX WARN: Multi-variable type inference failed */
    public w2(@NotNull kotlinx.coroutines.selects.f<? super R> fVar, @NotNull Function1<? super Continuation<? super R>, ? extends Object> function1) {
        this.f71460f = fVar;
        this.f71461g = function1;
    }

    @Override // kotlinx.coroutines.f0
    public void e0(@Nullable Throwable th) {
        if (this.f71460f.q()) {
            s3.a.d(this.f71461g, this.f71460f.r());
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
        e0(th);
        return Unit.INSTANCE;
    }
}
