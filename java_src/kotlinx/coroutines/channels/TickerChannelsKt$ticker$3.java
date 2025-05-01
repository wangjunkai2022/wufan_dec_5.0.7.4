package kotlinx.coroutines.channels;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TickerChannels.kt */
@DebugMetadata(c = "kotlinx.coroutines.channels.TickerChannelsKt$ticker$3", f = "TickerChannels.kt", i = {}, l = {72, 73}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class TickerChannelsKt$ticker$3 extends SuspendLambda implements Function2<w<? super Unit>, Continuation<? super Unit>, Object> {

    /* renamed from: b  reason: collision with root package name */
    int f69934b;

    /* renamed from: c  reason: collision with root package name */
    private /* synthetic */ Object f69935c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ TickerMode f69936d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ long f69937e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ long f69938f;

    /* compiled from: TickerChannels.kt */
    /* loaded from: classes6.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TickerMode.values().length];
            iArr[TickerMode.FIXED_PERIOD.ordinal()] = 1;
            iArr[TickerMode.FIXED_DELAY.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TickerChannelsKt$ticker$3(TickerMode tickerMode, long j4, long j5, Continuation<? super TickerChannelsKt$ticker$3> continuation) {
        super(2, continuation);
        this.f69936d = tickerMode;
        this.f69937e = j4;
        this.f69938f = j5;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        TickerChannelsKt$ticker$3 tickerChannelsKt$ticker$3 = new TickerChannelsKt$ticker$3(this.f69936d, this.f69937e, this.f69938f, continuation);
        tickerChannelsKt$ticker$3.f69935c = obj;
        return tickerChannelsKt$ticker$3;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    /* renamed from: e */
    public final Object invoke(@NotNull w<? super Unit> wVar, @Nullable Continuation<? super Unit> continuation) {
        return ((TickerChannelsKt$ticker$3) create(wVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended;
        Object d5;
        Object c5;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = this.f69934b;
        if (i4 == 0) {
            ResultKt.throwOnFailure(obj);
            w wVar = (w) this.f69935c;
            int i5 = a.$EnumSwitchMapping$0[this.f69936d.ordinal()];
            if (i5 == 1) {
                long j4 = this.f69937e;
                long j5 = this.f69938f;
                b0 channel = wVar.getChannel();
                this.f69934b = 1;
                d5 = TickerChannelsKt.d(j4, j5, channel, this);
                if (d5 == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i5 == 2) {
                long j6 = this.f69937e;
                long j7 = this.f69938f;
                b0 channel2 = wVar.getChannel();
                this.f69934b = 2;
                c5 = TickerChannelsKt.c(j6, j7, channel2, this);
                if (c5 == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else if (i4 != 1 && i4 != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
