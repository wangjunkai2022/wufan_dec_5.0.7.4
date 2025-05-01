package kotlinx.coroutines;

import kotlin.coroutines.Continuation;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Timeout.kt */
/* loaded from: classes6.dex */
public final class h3<U, T extends U> extends kotlinx.coroutines.internal.k0<T> implements Runnable {
    @JvmField

    /* renamed from: e  reason: collision with root package name */
    public final long f71058e;

    public h3(long j4, @NotNull Continuation<? super U> continuation) {
        super(continuation.getContext(), continuation);
        this.f71058e = j4;
    }

    @Override // kotlinx.coroutines.a, kotlinx.coroutines.JobSupport
    @NotNull
    public String U0() {
        return super.U0() + "(timeMillis=" + this.f71058e + ')';
    }

    @Override // java.lang.Runnable
    public void run() {
        j0(TimeoutKt.a(this.f71058e, this));
    }
}
