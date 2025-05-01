package kotlinx.coroutines.channels;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TickerChannels.kt */
@DebugMetadata(c = "kotlinx.coroutines.channels.TickerChannelsKt", f = "TickerChannels.kt", i = {0, 0, 1, 1, 2, 2}, l = {106, 108, 109}, m = "fixedDelayTicker", n = {"channel", "delayMillis", "channel", "delayMillis", "channel", "delayMillis"}, s = {"L$0", "J$0", "L$0", "J$0", "L$0", "J$0"})
/* loaded from: classes6.dex */
public final class TickerChannelsKt$fixedDelayTicker$1 extends ContinuationImpl {

    /* renamed from: b  reason: collision with root package name */
    long f69925b;

    /* renamed from: c  reason: collision with root package name */
    Object f69926c;

    /* renamed from: d  reason: collision with root package name */
    /* synthetic */ Object f69927d;

    /* renamed from: e  reason: collision with root package name */
    int f69928e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public TickerChannelsKt$fixedDelayTicker$1(Continuation<? super TickerChannelsKt$fixedDelayTicker$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object c5;
        this.f69927d = obj;
        this.f69928e |= Integer.MIN_VALUE;
        c5 = TickerChannelsKt.c(0L, 0L, null, this);
        return c5;
    }
}
