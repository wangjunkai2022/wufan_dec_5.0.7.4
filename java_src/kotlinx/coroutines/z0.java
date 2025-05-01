package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: Builders.common.kt */
/* loaded from: classes6.dex */
public final class z0<T> extends kotlinx.coroutines.internal.k0<T> {

    /* renamed from: e  reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f71465e = AtomicIntegerFieldUpdater.newUpdater(z0.class, "_decision");
    @NotNull
    private volatile /* synthetic */ int _decision;

    public z0(@NotNull CoroutineContext coroutineContext, @NotNull Continuation<? super T> continuation) {
        super(coroutineContext, continuation);
        this._decision = 0;
    }

    private final boolean A1() {
        do {
            int i4 = this._decision;
            if (i4 != 0) {
                if (i4 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!f71465e.compareAndSet(this, 0, 1));
        return true;
    }

    private final boolean z1() {
        do {
            int i4 = this._decision;
            if (i4 != 0) {
                if (i4 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!f71465e.compareAndSet(this, 0, 2));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.internal.k0, kotlinx.coroutines.JobSupport
    public void f0(@Nullable Object obj) {
        s1(obj);
    }

    @Override // kotlinx.coroutines.internal.k0, kotlinx.coroutines.a
    protected void s1(@Nullable Object obj) {
        Continuation intercepted;
        if (z1()) {
            return;
        }
        intercepted = IntrinsicsKt__IntrinsicsJvmKt.intercepted(this.f71120d);
        kotlinx.coroutines.internal.m.g(intercepted, i0.a(obj, this.f71120d), null, 2, null);
    }

    @Nullable
    public final Object y1() {
        Object coroutine_suspended;
        if (A1()) {
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            return coroutine_suspended;
        }
        Object o4 = g2.o(G0());
        if (o4 instanceof d0) {
            throw ((d0) o4).f70014a;
        }
        return o4;
    }
}
