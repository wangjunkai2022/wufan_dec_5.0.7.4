package kotlinx.coroutines.flow;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.channels.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: Delay.kt */
@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$2", f = "Delay.kt", i = {0}, l = {243}, m = "invokeSuspend", n = {"$this$onFailure$iv"}, s = {"L$0"})
/* loaded from: classes6.dex */
final class FlowKt__DelayKt$debounceInternal$1$3$2 extends SuspendLambda implements Function2<kotlinx.coroutines.channels.n<? extends Object>, Continuation<? super Unit>, Object> {

    /* renamed from: b  reason: collision with root package name */
    Object f70262b;

    /* renamed from: c  reason: collision with root package name */
    int f70263c;

    /* renamed from: d  reason: collision with root package name */
    /* synthetic */ Object f70264d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ Ref.ObjectRef<Object> f70265e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ f<T> f70266f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__DelayKt$debounceInternal$1$3$2(Ref.ObjectRef<Object> objectRef, f<? super T> fVar, Continuation<? super FlowKt__DelayKt$debounceInternal$1$3$2> continuation) {
        super(2, continuation);
        this.f70265e = objectRef;
        this.f70266f = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        FlowKt__DelayKt$debounceInternal$1$3$2 flowKt__DelayKt$debounceInternal$1$3$2 = new FlowKt__DelayKt$debounceInternal$1$3$2(this.f70265e, this.f70266f, continuation);
        flowKt__DelayKt$debounceInternal$1$3$2.f70264d = obj;
        return flowKt__DelayKt$debounceInternal$1$3$2;
    }

    @Nullable
    public final Object e(@NotNull Object obj, @Nullable Continuation<? super Unit> continuation) {
        return ((FlowKt__DelayKt$debounceInternal$1$3$2) create(kotlinx.coroutines.channels.n.b(obj), continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(kotlinx.coroutines.channels.n<? extends Object> nVar, Continuation<? super Unit> continuation) {
        return e(nVar.o(), continuation);
    }

    /* JADX WARN: Type inference failed for: r7v3, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6, types: [T, kotlinx.coroutines.internal.o0] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended;
        Ref.ObjectRef<Object> objectRef;
        Ref.ObjectRef<Object> objectRef2;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = this.f70263c;
        if (i4 == 0) {
            ResultKt.throwOnFailure(obj);
            ?? o4 = ((kotlinx.coroutines.channels.n) this.f70264d).o();
            objectRef = this.f70265e;
            boolean z4 = o4 instanceof n.c;
            if (!z4) {
                objectRef.element = o4;
            }
            f<T> fVar = this.f70266f;
            if (z4) {
                Throwable f5 = kotlinx.coroutines.channels.n.f(o4);
                if (f5 == null) {
                    Object obj2 = objectRef.element;
                    if (obj2 != null) {
                        if (obj2 == kotlinx.coroutines.flow.internal.l.f71013a) {
                            obj2 = null;
                        }
                        this.f70264d = o4;
                        this.f70262b = objectRef;
                        this.f70263c = 1;
                        if (fVar.emit(obj2, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        objectRef2 = objectRef;
                    }
                    objectRef.element = kotlinx.coroutines.flow.internal.l.f71015c;
                } else {
                    throw f5;
                }
            }
            return Unit.INSTANCE;
        } else if (i4 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            objectRef2 = (Ref.ObjectRef) this.f70262b;
            ResultKt.throwOnFailure(obj);
        }
        objectRef = objectRef2;
        objectRef.element = kotlinx.coroutines.flow.internal.l.f71015c;
        return Unit.INSTANCE;
    }
}
