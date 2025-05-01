package kotlinx.coroutines.flow;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.c2;
import kotlinx.coroutines.q0;
import kotlinx.coroutines.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Share.kt */
@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharingDeferred$1", f = "Share.kt", i = {}, l = {340}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class FlowKt__ShareKt$launchSharingDeferred$1 extends SuspendLambda implements Function2<q0, Continuation<? super Unit>, Object> {

    /* renamed from: b  reason: collision with root package name */
    int f70573b;

    /* renamed from: c  reason: collision with root package name */
    private /* synthetic */ Object f70574c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ e<T> f70575d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ y<u<T>> f70576e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Share.kt */
    /* loaded from: classes6.dex */
    public static final class a<T> implements f, SuspendFunction {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef<j<T>> f70577b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ q0 f70578c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ y<u<T>> f70579d;

        a(Ref.ObjectRef<j<T>> objectRef, q0 q0Var, y<u<T>> yVar) {
            this.f70577b = objectRef;
            this.f70578c = q0Var;
            this.f70579d = yVar;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [kotlinx.coroutines.flow.u, T, kotlinx.coroutines.flow.j] */
        @Override // kotlinx.coroutines.flow.f
        @Nullable
        public final Object emit(T t4, @NotNull Continuation<? super Unit> continuation) {
            Unit unit;
            j<T> jVar = this.f70577b.element;
            if (jVar == null) {
                unit = null;
            } else {
                jVar.setValue(t4);
                unit = Unit.INSTANCE;
            }
            if (unit == null) {
                q0 q0Var = this.f70578c;
                Ref.ObjectRef<j<T>> objectRef = this.f70577b;
                y<u<T>> yVar = this.f70579d;
                ?? r4 = (T) v.a(t4);
                yVar.D(new l(r4, c2.B(q0Var.getCoroutineContext())));
                objectRef.element = r4;
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__ShareKt$launchSharingDeferred$1(e<? extends T> eVar, y<u<T>> yVar, Continuation<? super FlowKt__ShareKt$launchSharingDeferred$1> continuation) {
        super(2, continuation);
        this.f70575d = eVar;
        this.f70576e = yVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        FlowKt__ShareKt$launchSharingDeferred$1 flowKt__ShareKt$launchSharingDeferred$1 = new FlowKt__ShareKt$launchSharingDeferred$1(this.f70575d, this.f70576e, continuation);
        flowKt__ShareKt$launchSharingDeferred$1.f70574c = obj;
        return flowKt__ShareKt$launchSharingDeferred$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull q0 q0Var, @Nullable Continuation<? super Unit> continuation) {
        return ((FlowKt__ShareKt$launchSharingDeferred$1) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = this.f70573b;
        try {
            if (i4 == 0) {
                ResultKt.throwOnFailure(obj);
                q0 q0Var = (q0) this.f70574c;
                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                e<T> eVar = this.f70575d;
                a aVar = new a(objectRef, q0Var, this.f70576e);
                this.f70573b = 1;
                if (eVar.a(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        } catch (Throwable th) {
            this.f70576e.d(th);
            throw th;
        }
    }
}
