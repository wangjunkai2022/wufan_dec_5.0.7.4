package kotlinx.coroutines.channels;

import java.util.concurrent.CancellationException;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import kotlinx.coroutines.JobCancellationException;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.channels.b0;
import kotlinx.coroutines.n0;
import kotlinx.coroutines.z1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: Broadcast.kt */
/* loaded from: classes.dex */
class j<E> extends kotlinx.coroutines.a<Unit> implements w<E>, h<E> {
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    private final h<E> f69973d;

    public j(@NotNull CoroutineContext coroutineContext, @NotNull h<E> hVar, boolean z4) {
        super(coroutineContext, false, z4);
        this.f69973d = hVar;
        J0((z1) coroutineContext.get(z1.f71466g1));
    }

    @Override // kotlinx.coroutines.channels.b0
    public boolean R(@Nullable Throwable th) {
        boolean R = this.f69973d.R(th);
        start();
        return R;
    }

    @Override // kotlinx.coroutines.channels.b0
    @Nullable
    public Object S(E e5, @NotNull Continuation<? super Unit> continuation) {
        return this.f69973d.S(e5, continuation);
    }

    @Override // kotlinx.coroutines.channels.b0
    public boolean U() {
        return this.f69973d.U();
    }

    @Override // kotlinx.coroutines.JobSupport, kotlinx.coroutines.z1
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public final /* synthetic */ boolean a(Throwable th) {
        if (th == null) {
            th = new JobCancellationException(o0(), null, this);
        }
        l0(th);
        return true;
    }

    @Override // kotlinx.coroutines.JobSupport, kotlinx.coroutines.z1
    public final void b(@Nullable CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(o0(), null, this);
        }
        l0(cancellationException);
    }

    @Override // kotlinx.coroutines.channels.w
    @NotNull
    public b0<E> getChannel() {
        return this;
    }

    @Override // kotlinx.coroutines.a, kotlinx.coroutines.JobSupport, kotlinx.coroutines.z1
    public boolean isActive() {
        return super.isActive();
    }

    @Override // kotlinx.coroutines.JobSupport
    public void l0(@NotNull Throwable th) {
        CancellationException l12 = JobSupport.l1(this, th, null, 1, null);
        this.f69973d.b(l12);
        j0(l12);
    }

    @Override // kotlinx.coroutines.channels.b0
    @NotNull
    public kotlinx.coroutines.selects.e<E, b0<E>> o() {
        return this.f69973d.o();
    }

    @Override // kotlinx.coroutines.channels.b0
    @Deprecated(level = DeprecationLevel.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @ReplaceWith(expression = "trySend(element).isSuccess", imports = {}))
    public boolean offer(E e5) {
        return this.f69973d.offer(e5);
    }

    @Override // kotlinx.coroutines.channels.h
    @NotNull
    public ReceiveChannel<E> q() {
        return this.f69973d.q();
    }

    @Override // kotlinx.coroutines.a
    protected void u1(@NotNull Throwable th, boolean z4) {
        if (this.f69973d.R(th) || z4) {
            return;
        }
        n0.b(getContext(), th);
    }

    @Override // kotlinx.coroutines.channels.b0
    @ExperimentalCoroutinesApi
    public void w(@NotNull Function1<? super Throwable, Unit> function1) {
        this.f69973d.w(function1);
    }

    @Override // kotlinx.coroutines.channels.b0
    @NotNull
    public Object x(E e5) {
        return this.f69973d.x(e5);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @NotNull
    public final h<E> x1() {
        return this.f69973d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.a
    /* renamed from: y1 */
    public void v1(@NotNull Unit unit) {
        b0.a.a(this.f69973d, null, 1, null);
    }
}
