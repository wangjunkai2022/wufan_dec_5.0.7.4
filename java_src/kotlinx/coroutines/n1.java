package kotlinx.coroutines;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
/* compiled from: EventLoop.kt */
/* loaded from: classes6.dex */
public final class n1 {
    @NotNull
    public static final k1 a() {
        return new h(Thread.currentThread());
    }

    public static final void b(@NotNull Function0<Unit> function0) {
        function0.invoke();
    }

    @InternalCoroutinesApi
    public static final long c() {
        k1 a5 = d3.f70019a.a();
        if (a5 == null) {
            return Long.MAX_VALUE;
        }
        return a5.j0();
    }
}
