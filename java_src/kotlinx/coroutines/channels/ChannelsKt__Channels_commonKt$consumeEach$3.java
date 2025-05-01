package kotlinx.coroutines.channels;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Channels.common.kt */
@DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt", f = "Channels.common.kt", i = {0, 0}, l = {129}, m = "consumeEach", n = {"action", "channel$iv"}, s = {"L$0", "L$1"})
/* loaded from: classes6.dex */
public final class ChannelsKt__Channels_commonKt$consumeEach$3<E> extends ContinuationImpl {

    /* renamed from: b  reason: collision with root package name */
    Object f69711b;

    /* renamed from: c  reason: collision with root package name */
    Object f69712c;

    /* renamed from: d  reason: collision with root package name */
    Object f69713d;

    /* renamed from: e  reason: collision with root package name */
    /* synthetic */ Object f69714e;

    /* renamed from: f  reason: collision with root package name */
    int f69715f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ChannelsKt__Channels_commonKt$consumeEach$3(Continuation<? super ChannelsKt__Channels_commonKt$consumeEach$3> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f69714e = obj;
        this.f69715f |= Integer.MIN_VALUE;
        return ChannelsKt__Channels_commonKt.d(null, null, this);
    }
}
