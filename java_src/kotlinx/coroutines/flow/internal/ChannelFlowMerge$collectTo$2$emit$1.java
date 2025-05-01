package kotlinx.coroutines.flow.internal;

import com.umeng.analytics.pro.bm;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Merge.kt */
@DebugMetadata(c = "kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2", f = "Merge.kt", i = {0, 0}, l = {66}, m = "emit", n = {"this", bm.ay}, s = {"L$0", "L$1"})
/* loaded from: classes6.dex */
public final class ChannelFlowMerge$collectTo$2$emit$1 extends ContinuationImpl {

    /* renamed from: b  reason: collision with root package name */
    Object f70888b;

    /* renamed from: c  reason: collision with root package name */
    Object f70889c;

    /* renamed from: d  reason: collision with root package name */
    /* synthetic */ Object f70890d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ ChannelFlowMerge$collectTo$2<T> f70891e;

    /* renamed from: f  reason: collision with root package name */
    int f70892f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ChannelFlowMerge$collectTo$2$emit$1(ChannelFlowMerge$collectTo$2<? super T> channelFlowMerge$collectTo$2, Continuation<? super ChannelFlowMerge$collectTo$2$emit$1> continuation) {
        super(continuation);
        this.f70891e = channelFlowMerge$collectTo$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f70890d = obj;
        this.f70892f |= Integer.MIN_VALUE;
        return this.f70891e.emit(null, this);
    }
}
