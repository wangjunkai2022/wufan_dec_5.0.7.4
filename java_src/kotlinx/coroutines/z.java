package kotlinx.coroutines;

import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: CompletableDeferred.kt */
/* loaded from: classes6.dex */
final class z<T> extends JobSupport implements y<T>, kotlinx.coroutines.selects.d<T> {
    public z(@Nullable z1 z1Var) {
        super(true);
        J0(z1Var);
    }

    @Override // kotlinx.coroutines.y
    public boolean D(T t4) {
        return R0(t4);
    }

    @Override // kotlinx.coroutines.JobSupport
    public boolean D0() {
        return true;
    }

    @Override // kotlinx.coroutines.w0
    @NotNull
    public kotlinx.coroutines.selects.d<T> J() {
        return this;
    }

    @Override // kotlinx.coroutines.y
    public boolean d(@NotNull Throwable th) {
        return R0(new d0(th, false, 2, null));
    }

    @Override // kotlinx.coroutines.selects.d
    public <R> void e(@NotNull kotlinx.coroutines.selects.f<? super R> fVar, @NotNull Function2<? super T, ? super Continuation<? super R>, ? extends Object> function2) {
        e1(fVar, function2);
    }

    @Override // kotlinx.coroutines.w0
    public T g() {
        return (T) x0();
    }

    @Override // kotlinx.coroutines.w0
    @Nullable
    public Object t(@NotNull Continuation<? super T> continuation) {
        return h0(continuation);
    }
}
