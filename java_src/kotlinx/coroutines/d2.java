package kotlinx.coroutines;

import java.util.concurrent.Future;
import org.jetbrains.annotations.NotNull;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Future.kt */
/* loaded from: classes6.dex */
public final /* synthetic */ class d2 {
    public static final void a(@NotNull p<?> pVar, @NotNull Future<?> future) {
        pVar.k(new l(future));
    }

    @InternalCoroutinesApi
    @NotNull
    public static final g1 b(@NotNull z1 z1Var, @NotNull Future<?> future) {
        return z1Var.z(new m(future));
    }
}
