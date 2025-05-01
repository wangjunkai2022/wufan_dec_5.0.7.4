package kotlinx.coroutines.flow;

import com.join.mgps.activity.QuarkInstallAppActivity_;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Count.kt */
@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__CountKt", f = "Count.kt", i = {0}, l = {18}, m = QuarkInstallAppActivity_.f36990i, n = {"i"}, s = {"L$0"})
/* loaded from: classes6.dex */
public final class FlowKt__CountKt$count$1<T> extends ContinuationImpl {

    /* renamed from: b  reason: collision with root package name */
    Object f70238b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ Object f70239c;

    /* renamed from: d  reason: collision with root package name */
    int f70240d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public FlowKt__CountKt$count$1(Continuation<? super FlowKt__CountKt$count$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f70239c = obj;
        this.f70240d |= Integer.MIN_VALUE;
        return g.Y(null, this);
    }
}
