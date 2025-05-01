package kotlinx.coroutines.channels;

import io.netty.handler.codec.rtsp.RtspHeaders;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.channels.b0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Deprecated.kt */
@DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 1, 1}, l = {487, 242}, m = "filterNotNullTo", n = {RtspHeaders.Values.DESTINATION, "$this$consume$iv$iv", RtspHeaders.Values.DESTINATION, "$this$consume$iv$iv"}, s = {"L$0", "L$1", "L$0", "L$1"})
/* loaded from: classes6.dex */
public final class ChannelsKt__DeprecatedKt$filterNotNullTo$3<E, C extends b0<? super E>> extends ContinuationImpl {

    /* renamed from: b  reason: collision with root package name */
    Object f69788b;

    /* renamed from: c  reason: collision with root package name */
    Object f69789c;

    /* renamed from: d  reason: collision with root package name */
    Object f69790d;

    /* renamed from: e  reason: collision with root package name */
    /* synthetic */ Object f69791e;

    /* renamed from: f  reason: collision with root package name */
    int f69792f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ChannelsKt__DeprecatedKt$filterNotNullTo$3(Continuation<? super ChannelsKt__DeprecatedKt$filterNotNullTo$3> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object v2;
        this.f69791e = obj;
        this.f69792f |= Integer.MIN_VALUE;
        v2 = ChannelsKt__DeprecatedKt.v(null, null, this);
        return v2;
    }
}
