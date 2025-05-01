package kotlinx.coroutines.flow;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.JvmField;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: SharedFlow.kt */
/* loaded from: classes6.dex */
public final class p extends kotlinx.coroutines.flow.internal.c<SharedFlowImpl<?>> {
    @JvmField

    /* renamed from: a  reason: collision with root package name */
    public long f71025a = -1;
    @JvmField
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public Continuation<? super Unit> f71026b;

    @Override // kotlinx.coroutines.flow.internal.c
    /* renamed from: c */
    public boolean a(@NotNull SharedFlowImpl<?> sharedFlowImpl) {
        if (this.f71025a >= 0) {
            return false;
        }
        this.f71025a = sharedFlowImpl.d0();
        return true;
    }

    @Override // kotlinx.coroutines.flow.internal.c
    @NotNull
    /* renamed from: d */
    public Continuation<Unit>[] b(@NotNull SharedFlowImpl<?> sharedFlowImpl) {
        if (s0.b()) {
            if (!(this.f71025a >= 0)) {
                throw new AssertionError();
            }
        }
        long j4 = this.f71025a;
        this.f71025a = -1L;
        this.f71026b = null;
        return sharedFlowImpl.c0(j4);
    }
}
