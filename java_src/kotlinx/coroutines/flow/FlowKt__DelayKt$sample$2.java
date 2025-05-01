package kotlinx.coroutines.flow;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.q0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: Delay.kt */
@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2", f = "Delay.kt", i = {0, 0, 0, 0}, l = {352}, m = "invokeSuspend", n = {"downstream", "values", "lastValue", "ticker"}, s = {"L$0", "L$1", "L$2", "L$3"})
/* loaded from: classes6.dex */
public final class FlowKt__DelayKt$sample$2<T> extends SuspendLambda implements Function3<q0, f<? super T>, Continuation<? super Unit>, Object> {

    /* renamed from: b  reason: collision with root package name */
    Object f70278b;

    /* renamed from: c  reason: collision with root package name */
    Object f70279c;

    /* renamed from: d  reason: collision with root package name */
    int f70280d;

    /* renamed from: e  reason: collision with root package name */
    private /* synthetic */ Object f70281e;

    /* renamed from: f  reason: collision with root package name */
    /* synthetic */ Object f70282f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ long f70283g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ e<T> f70284h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__DelayKt$sample$2(long j4, e<? extends T> eVar, Continuation<? super FlowKt__DelayKt$sample$2> continuation) {
        super(3, continuation);
        this.f70283g = j4;
        this.f70284h = eVar;
    }

    @Override // kotlin.jvm.functions.Function3
    @Nullable
    /* renamed from: e */
    public final Object invoke(@NotNull q0 q0Var, @NotNull f<? super T> fVar, @Nullable Continuation<? super Unit> continuation) {
        FlowKt__DelayKt$sample$2 flowKt__DelayKt$sample$2 = new FlowKt__DelayKt$sample$2(this.f70283g, this.f70284h, continuation);
        flowKt__DelayKt$sample$2.f70281e = q0Var;
        flowKt__DelayKt$sample$2.f70282f = fVar;
        return flowKt__DelayKt$sample$2.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended;
        ReceiveChannel g4;
        f fVar;
        ReceiveChannel receiveChannel;
        Ref.ObjectRef objectRef;
        ReceiveChannel receiveChannel2;
        Object coroutine_suspended2;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = this.f70280d;
        if (i4 == 0) {
            ResultKt.throwOnFailure(obj);
            q0 q0Var = (q0) this.f70281e;
            ReceiveChannel f5 = ProduceKt.f(q0Var, null, -1, new FlowKt__DelayKt$sample$2$values$1(this.f70284h, null), 1, null);
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            g4 = FlowKt__DelayKt.g(q0Var, this.f70283g, 0L, 2, null);
            fVar = (f) this.f70282f;
            receiveChannel = f5;
            objectRef = objectRef2;
            receiveChannel2 = g4;
        } else if (i4 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            receiveChannel2 = (ReceiveChannel) this.f70279c;
            objectRef = (Ref.ObjectRef) this.f70278b;
            receiveChannel = (ReceiveChannel) this.f70282f;
            fVar = (f) this.f70281e;
            ResultKt.throwOnFailure(obj);
        }
        while (objectRef.element != kotlinx.coroutines.flow.internal.l.f71015c) {
            this.f70281e = fVar;
            this.f70282f = receiveChannel;
            this.f70278b = objectRef;
            this.f70279c = receiveChannel2;
            this.f70280d = 1;
            kotlinx.coroutines.selects.b bVar = new kotlinx.coroutines.selects.b(this);
            try {
                bVar.w(receiveChannel.G(), new FlowKt__DelayKt$sample$2$1$1(objectRef, receiveChannel2, null));
                bVar.w(receiveChannel2.F(), new FlowKt__DelayKt$sample$2$1$2(objectRef, fVar, null));
            } catch (Throwable th) {
                bVar.n0(th);
            }
            Object m02 = bVar.m0();
            coroutine_suspended2 = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (m02 == coroutine_suspended2) {
                DebugProbesKt.probeCoroutineSuspended(this);
                continue;
            }
            if (m02 == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
