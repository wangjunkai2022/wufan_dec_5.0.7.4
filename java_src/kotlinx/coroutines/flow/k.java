package kotlinx.coroutines.flow;

import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.z1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Share.kt */
/* loaded from: classes6.dex */
public final class k<T> implements n<T>, a<T>, kotlinx.coroutines.flow.internal.i<T> {
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    private final z1 f71019b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ n<T> f71020c;

    /* JADX WARN: Multi-variable type inference failed */
    public k(@NotNull n<? extends T> nVar, @Nullable z1 z1Var) {
        this.f71019b = z1Var;
        this.f71020c = nVar;
    }

    @Override // kotlinx.coroutines.flow.n, kotlinx.coroutines.flow.e
    @Nullable
    public Object a(@NotNull f<? super T> fVar, @NotNull Continuation<?> continuation) {
        return this.f71020c.a(fVar, continuation);
    }

    @Override // kotlinx.coroutines.flow.internal.i
    @NotNull
    public e<T> c(@NotNull CoroutineContext coroutineContext, int i4, @NotNull BufferOverflow bufferOverflow) {
        return o.e(this, coroutineContext, i4, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.n
    @NotNull
    public List<T> e() {
        return this.f71020c.e();
    }
}
