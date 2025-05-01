package kotlinx.coroutines;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: CompletionHandler.kt */
/* loaded from: classes6.dex */
public final class g0 {
    @NotNull
    public static final Function1<Throwable, Unit> a(@NotNull o oVar) {
        return oVar;
    }

    @NotNull
    public static final Function1<Throwable, Unit> b(@NotNull f0 f0Var) {
        return f0Var;
    }

    public static final void c(@NotNull Function1<? super Throwable, Unit> function1, @Nullable Throwable th) {
        function1.invoke(th);
    }
}
