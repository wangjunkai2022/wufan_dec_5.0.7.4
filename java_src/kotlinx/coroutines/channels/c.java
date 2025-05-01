package kotlinx.coroutines.channels;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.n0;
import kotlinx.coroutines.p1;
import kotlinx.coroutines.t0;
import kotlinx.coroutines.z1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: Actor.kt */
/* loaded from: classes6.dex */
class c<E> extends l<E> implements e<E> {
    public c(@NotNull CoroutineContext coroutineContext, @NotNull k<E> kVar, boolean z4) {
        super(coroutineContext, kVar, false, z4);
        J0((z1) coroutineContext.get(z1.f71466g1));
    }

    @Override // kotlinx.coroutines.JobSupport
    protected boolean H0(@NotNull Throwable th) {
        n0.b(getContext(), th);
        return true;
    }

    @Override // kotlinx.coroutines.JobSupport
    protected void Z0(@Nullable Throwable th) {
        k<E> x12 = x1();
        if (th != null) {
            r1 = th instanceof CancellationException ? (CancellationException) th : null;
            if (r1 == null) {
                r1 = p1.a(Intrinsics.stringPlus(t0.a(this), " was cancelled"), th);
            }
        }
        x12.b(r1);
    }
}
