package kotlinx.coroutines;

import java.util.concurrent.locks.LockSupport;
import kotlin.Unit;
import kotlinx.coroutines.l1;
import org.jetbrains.annotations.NotNull;
/* compiled from: EventLoop.kt */
/* loaded from: classes6.dex */
public abstract class m1 extends k1 {
    @NotNull
    protected abstract Thread m0();

    /* JADX INFO: Access modifiers changed from: protected */
    public void n0(long j4, @NotNull l1.c cVar) {
        u0.f71444g.w0(j4, cVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void o0() {
        Unit unit;
        Thread m02 = m0();
        if (Thread.currentThread() != m02) {
            b b5 = c.b();
            if (b5 == null) {
                unit = null;
            } else {
                b5.g(m02);
                unit = Unit.INSTANCE;
            }
            if (unit == null) {
                LockSupport.unpark(m02);
            }
        }
    }
}
