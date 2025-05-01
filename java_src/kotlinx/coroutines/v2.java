package kotlinx.coroutines;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: JobSupport.kt */
/* loaded from: classes6.dex */
public final class v2<T, R> extends f2 {
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    private final kotlinx.coroutines.selects.f<R> f71456f;
    @NotNull

    /* renamed from: g  reason: collision with root package name */
    private final Function2<T, Continuation<? super R>, Object> f71457g;

    /* JADX WARN: Multi-variable type inference failed */
    public v2(@NotNull kotlinx.coroutines.selects.f<? super R> fVar, @NotNull Function2<? super T, ? super Continuation<? super R>, ? extends Object> function2) {
        this.f71456f = fVar;
        this.f71457g = function2;
    }

    @Override // kotlinx.coroutines.f0
    public void e0(@Nullable Throwable th) {
        if (this.f71456f.q()) {
            f0().g1(this.f71456f, this.f71457g);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
        e0(th);
        return Unit.INSTANCE;
    }
}
