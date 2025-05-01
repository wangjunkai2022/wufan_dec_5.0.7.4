package kotlinx.coroutines.internal;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.JvmField;
import kotlinx.coroutines.z1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: Scopes.kt */
/* loaded from: classes6.dex */
public class k0<T> extends kotlinx.coroutines.a<T> implements CoroutineStackFrame {
    @JvmField
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    public final Continuation<T> f71120d;

    /* JADX WARN: Multi-variable type inference failed */
    public k0(@NotNull CoroutineContext coroutineContext, @NotNull Continuation<? super T> continuation) {
        super(coroutineContext, true, true);
        this.f71120d = continuation;
    }

    @Override // kotlinx.coroutines.JobSupport
    protected final boolean M0() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.JobSupport
    public void f0(@Nullable Object obj) {
        Continuation intercepted;
        intercepted = IntrinsicsKt__IntrinsicsJvmKt.intercepted(this.f71120d);
        m.g(intercepted, kotlinx.coroutines.i0.a(obj, this.f71120d), null, 2, null);
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    @Nullable
    public final CoroutineStackFrame getCallerFrame() {
        Continuation<T> continuation = this.f71120d;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    @Nullable
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // kotlinx.coroutines.a
    protected void s1(@Nullable Object obj) {
        Continuation<T> continuation = this.f71120d;
        continuation.resumeWith(kotlinx.coroutines.i0.a(obj, continuation));
    }

    @Nullable
    public final z1 x1() {
        kotlinx.coroutines.v F0 = F0();
        if (F0 == null) {
            return null;
        }
        return F0.getParent();
    }
}
