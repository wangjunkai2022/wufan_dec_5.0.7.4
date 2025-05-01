package kotlinx.coroutines;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Builders.common.kt */
/* loaded from: classes6.dex */
public class x0<T> extends a<T> implements w0<T>, kotlinx.coroutines.selects.d<T> {
    public x0(@NotNull CoroutineContext coroutineContext, boolean z4) {
        super(coroutineContext, true, z4);
    }

    @Override // kotlinx.coroutines.w0
    @NotNull
    public kotlinx.coroutines.selects.d<T> J() {
        return this;
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
