package kotlinx.coroutines.channels;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: Channels.common.kt */
@DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt", f = "Channels.common.kt", i = {0, 0}, l = {148}, m = "toList", n = {"$this$toList_u24lambda_u2d3", "$this$consume$iv$iv"}, s = {"L$1", "L$2"})
/* loaded from: classes6.dex */
final class ChannelsKt__Channels_commonKt$toList$1<E> extends ContinuationImpl {

    /* renamed from: b  reason: collision with root package name */
    Object f69716b;

    /* renamed from: c  reason: collision with root package name */
    Object f69717c;

    /* renamed from: d  reason: collision with root package name */
    Object f69718d;

    /* renamed from: e  reason: collision with root package name */
    Object f69719e;

    /* renamed from: f  reason: collision with root package name */
    /* synthetic */ Object f69720f;

    /* renamed from: g  reason: collision with root package name */
    int f69721g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ChannelsKt__Channels_commonKt$toList$1(Continuation<? super ChannelsKt__Channels_commonKt$toList$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f69720f = obj;
        this.f69721g |= Integer.MIN_VALUE;
        return o.g0(null, this);
    }
}
