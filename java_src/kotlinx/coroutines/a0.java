package kotlinx.coroutines;

import kotlin.Result;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: CompletableDeferred.kt */
/* loaded from: classes6.dex */
public final class a0 {
    @NotNull
    public static final <T> y<T> a(T t4) {
        z zVar = new z(null);
        zVar.D(t4);
        return zVar;
    }

    @NotNull
    public static final <T> y<T> b(@Nullable z1 z1Var) {
        return new z(z1Var);
    }

    public static /* synthetic */ y c(z1 z1Var, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z1Var = null;
        }
        return b(z1Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> boolean d(@NotNull y<T> yVar, @NotNull Object obj) {
        Throwable m38exceptionOrNullimpl = Result.m38exceptionOrNullimpl(obj);
        return m38exceptionOrNullimpl == null ? yVar.D(obj) : yVar.d(m38exceptionOrNullimpl);
    }
}
