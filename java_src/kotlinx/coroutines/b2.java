package kotlinx.coroutines;

import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: JobSupport.kt */
/* loaded from: classes6.dex */
public class b2 extends JobSupport implements b0 {

    /* renamed from: c  reason: collision with root package name */
    private final boolean f69663c;

    public b2(@Nullable z1 z1Var) {
        super(true);
        J0(z1Var);
        this.f69663c = s1();
    }

    private final boolean s1() {
        v F0 = F0();
        w wVar = F0 instanceof w ? (w) F0 : null;
        JobSupport f02 = wVar == null ? null : wVar.f0();
        if (f02 == null) {
            return false;
        }
        while (!f02.C0()) {
            v F02 = f02.F0();
            w wVar2 = F02 instanceof w ? (w) F02 : null;
            if (wVar2 == null) {
                f02 = null;
                continue;
            } else {
                f02 = wVar2.f0();
                continue;
            }
            if (f02 == null) {
                return false;
            }
        }
        return true;
    }

    @Override // kotlinx.coroutines.JobSupport
    public boolean C0() {
        return this.f69663c;
    }

    @Override // kotlinx.coroutines.JobSupport
    public boolean D0() {
        return true;
    }

    @Override // kotlinx.coroutines.b0
    public boolean complete() {
        return R0(Unit.INSTANCE);
    }

    @Override // kotlinx.coroutines.b0
    public boolean d(@NotNull Throwable th) {
        return R0(new d0(th, false, 2, null));
    }
}
