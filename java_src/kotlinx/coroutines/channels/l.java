package kotlinx.coroutines.channels;

import java.util.concurrent.CancellationException;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.internal.LowPriorityInOverloadResolution;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import kotlinx.coroutines.JobCancellationException;
import kotlinx.coroutines.JobSupport;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ChannelCoroutine.kt */
/* loaded from: classes.dex */
public class l<E> extends kotlinx.coroutines.a<Unit> implements k<E> {
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    private final k<E> f69989d;

    public l(@NotNull CoroutineContext coroutineContext, @NotNull k<E> kVar, boolean z4, boolean z5) {
        super(coroutineContext, z4, z5);
        this.f69989d = kVar;
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    @NotNull
    public kotlinx.coroutines.selects.d<E> F() {
        return this.f69989d.F();
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    @NotNull
    public kotlinx.coroutines.selects.d<n<E>> G() {
        return this.f69989d.G();
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    @NotNull
    public kotlinx.coroutines.selects.d<E> H() {
        return this.f69989d.H();
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    @NotNull
    public Object I() {
        return this.f69989d.I();
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    @Deprecated(level = DeprecationLevel.ERROR, message = "Deprecated in favor of 'receiveCatching'. Please note that the provided replacement does not rethrow channel's close cause as 'receiveOrNull' did, for the detailed replacement please refer to the 'receiveOrNull' documentation", replaceWith = @ReplaceWith(expression = "receiveCatching().getOrNull()", imports = {}))
    @LowPriorityInOverloadResolution
    @Nullable
    public Object L(@NotNull Continuation<? super E> continuation) {
        return this.f69989d.L(continuation);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    @Nullable
    public Object M(@NotNull Continuation<? super n<? extends E>> continuation) {
        Object M = this.f69989d.M(continuation);
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return M;
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    @Nullable
    public Object Q(@NotNull Continuation<? super E> continuation) {
        return this.f69989d.Q(continuation);
    }

    @Override // kotlinx.coroutines.channels.b0
    public boolean R(@Nullable Throwable th) {
        return this.f69989d.R(th);
    }

    @Override // kotlinx.coroutines.channels.b0
    @Nullable
    public Object S(E e5, @NotNull Continuation<? super Unit> continuation) {
        return this.f69989d.S(e5, continuation);
    }

    @Override // kotlinx.coroutines.channels.b0
    public boolean U() {
        return this.f69989d.U();
    }

    @Override // kotlinx.coroutines.JobSupport, kotlinx.coroutines.z1
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public final /* synthetic */ boolean a(Throwable th) {
        l0(new JobCancellationException(o0(), null, this));
        return true;
    }

    @Override // kotlinx.coroutines.JobSupport, kotlinx.coroutines.z1
    public final void b(@Nullable CancellationException cancellationException) {
        if (isCancelled()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(o0(), null, this);
        }
        l0(cancellationException);
    }

    @Override // kotlinx.coroutines.JobSupport, kotlinx.coroutines.z1
    public /* synthetic */ void cancel() {
        l0(new JobCancellationException(o0(), null, this));
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public boolean f() {
        return this.f69989d.f();
    }

    @NotNull
    public final k<E> getChannel() {
        return this;
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public boolean isEmpty() {
        return this.f69989d.isEmpty();
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    @NotNull
    public ChannelIterator<E> iterator() {
        return this.f69989d.iterator();
    }

    @Override // kotlinx.coroutines.JobSupport
    public void l0(@NotNull Throwable th) {
        CancellationException l12 = JobSupport.l1(this, th, null, 1, null);
        this.f69989d.b(l12);
        j0(l12);
    }

    @Override // kotlinx.coroutines.channels.b0
    @NotNull
    public kotlinx.coroutines.selects.e<E, b0<E>> o() {
        return this.f69989d.o();
    }

    @Override // kotlinx.coroutines.channels.b0
    @Deprecated(level = DeprecationLevel.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @ReplaceWith(expression = "trySend(element).isSuccess", imports = {}))
    public boolean offer(E e5) {
        return this.f69989d.offer(e5);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    @Deprecated(level = DeprecationLevel.ERROR, message = "Deprecated in the favour of 'tryReceive'. Please note that the provided replacement does not rethrow channel's close cause as 'poll' did, for the precise replacement please refer to the 'poll' documentation", replaceWith = @ReplaceWith(expression = "tryReceive().getOrNull()", imports = {}))
    @Nullable
    public E poll() {
        return this.f69989d.poll();
    }

    @Override // kotlinx.coroutines.channels.b0
    @ExperimentalCoroutinesApi
    public void w(@NotNull Function1<? super Throwable, Unit> function1) {
        this.f69989d.w(function1);
    }

    @Override // kotlinx.coroutines.channels.b0
    @NotNull
    public Object x(E e5) {
        return this.f69989d.x(e5);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @NotNull
    public final k<E> x1() {
        return this.f69989d;
    }
}
