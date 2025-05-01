package kotlinx.coroutines;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: JobSupport.kt */
/* loaded from: classes6.dex */
public abstract class f2 extends f0 implements g1, u1 {

    /* renamed from: e  reason: collision with root package name */
    public JobSupport f70123e;

    @Override // kotlinx.coroutines.g1
    public void dispose() {
        f0().f1(this);
    }

    @Override // kotlinx.coroutines.u1
    @Nullable
    public k2 f() {
        return null;
    }

    @NotNull
    public final JobSupport f0() {
        JobSupport jobSupport = this.f70123e;
        if (jobSupport != null) {
            return jobSupport;
        }
        Intrinsics.throwUninitializedPropertyAccessException("job");
        return null;
    }

    public final void g0(@NotNull JobSupport jobSupport) {
        this.f70123e = jobSupport;
    }

    @Override // kotlinx.coroutines.u1
    public boolean isActive() {
        return true;
    }

    @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
    @NotNull
    public String toString() {
        return t0.a(this) + '@' + t0.b(this) + "[job@" + t0.b(f0()) + ']';
    }
}
