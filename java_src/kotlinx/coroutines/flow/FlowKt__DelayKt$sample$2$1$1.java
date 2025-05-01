package kotlinx.coroutines.flow;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.channels.n;
import kotlinx.coroutines.flow.internal.ChildCancelledException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: Delay.kt */
@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$1$1", f = "Delay.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class FlowKt__DelayKt$sample$2$1$1 extends SuspendLambda implements Function2<kotlinx.coroutines.channels.n<? extends Object>, Continuation<? super Unit>, Object> {

    /* renamed from: b  reason: collision with root package name */
    int f70285b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ Object f70286c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ Ref.ObjectRef<Object> f70287d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ ReceiveChannel<Unit> f70288e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$sample$2$1$1(Ref.ObjectRef<Object> objectRef, ReceiveChannel<Unit> receiveChannel, Continuation<? super FlowKt__DelayKt$sample$2$1$1> continuation) {
        super(2, continuation);
        this.f70287d = objectRef;
        this.f70288e = receiveChannel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        FlowKt__DelayKt$sample$2$1$1 flowKt__DelayKt$sample$2$1$1 = new FlowKt__DelayKt$sample$2$1$1(this.f70287d, this.f70288e, continuation);
        flowKt__DelayKt$sample$2$1$1.f70286c = obj;
        return flowKt__DelayKt$sample$2$1$1;
    }

    @Nullable
    public final Object e(@NotNull Object obj, @Nullable Continuation<? super Unit> continuation) {
        return ((FlowKt__DelayKt$sample$2$1$1) create(kotlinx.coroutines.channels.n.b(obj), continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(kotlinx.coroutines.channels.n<? extends Object> nVar, Continuation<? super Unit> continuation) {
        return e(nVar.o(), continuation);
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8, types: [T, kotlinx.coroutines.internal.o0] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.f70285b == 0) {
            ResultKt.throwOnFailure(obj);
            ?? o4 = ((kotlinx.coroutines.channels.n) this.f70286c).o();
            Ref.ObjectRef<Object> objectRef = this.f70287d;
            boolean z4 = o4 instanceof n.c;
            if (!z4) {
                objectRef.element = o4;
            }
            ReceiveChannel<Unit> receiveChannel = this.f70288e;
            if (z4) {
                Throwable f5 = kotlinx.coroutines.channels.n.f(o4);
                if (f5 == null) {
                    receiveChannel.b(new ChildCancelledException());
                    objectRef.element = kotlinx.coroutines.flow.internal.l.f71015c;
                } else {
                    throw f5;
                }
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
