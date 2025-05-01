package kotlinx.coroutines.flow;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Flow.kt */
@DebugMetadata(c = "kotlinx.coroutines.flow.AbstractFlow", f = "Flow.kt", i = {0}, l = {230}, m = "collect", n = {"safeCollector"}, s = {"L$0"})
/* loaded from: classes6.dex */
public final class AbstractFlow$collect$1 extends ContinuationImpl {

    /* renamed from: b  reason: collision with root package name */
    Object f70124b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ Object f70125c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ AbstractFlow<T> f70126d;

    /* renamed from: e  reason: collision with root package name */
    int f70127e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractFlow$collect$1(AbstractFlow<T> abstractFlow, Continuation<? super AbstractFlow$collect$1> continuation) {
        super(continuation);
        this.f70126d = abstractFlow;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f70125c = obj;
        this.f70127e |= Integer.MIN_VALUE;
        return this.f70126d.a(null, this);
    }
}
