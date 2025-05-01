package kotlinx.coroutines.flow;

import com.android.dx.io.Opcodes;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.flow.internal.CombineKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* JADX INFO: Add missing generic type declarations: [R] */
/* compiled from: Zip.kt */
@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$6", f = "Zip.kt", i = {}, l = {Opcodes.INVOKE_POLYMORPHIC_RANGE}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class FlowKt__ZipKt$combineTransform$6<R> extends SuspendLambda implements Function2<f<? super R>, Continuation<? super Unit>, Object> {

    /* renamed from: b  reason: collision with root package name */
    int f70773b;

    /* renamed from: c  reason: collision with root package name */
    private /* synthetic */ Object f70774c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ e<T>[] f70775d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ Function3<f<? super R>, T[], Continuation<? super Unit>, Object> f70776e;

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Zip.kt */
    /* renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$6$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1<T> extends Lambda implements Function0<T[]> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e<T>[] f70777b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(e<? extends T>[] eVarArr) {
            super(0);
            this.f70777b = eVarArr;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* renamed from: a */
        public final T[] invoke() {
            int length = this.f70777b.length;
            Intrinsics.reifiedOperationMarker(0, "T?");
            return (T[]) new Object[length];
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Zip.kt */
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$6$2", f = "Zip.kt", i = {}, l = {Opcodes.INVOKE_POLYMORPHIC_RANGE}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$6$2  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass2<T> extends SuspendLambda implements Function3<f<? super R>, T[], Continuation<? super Unit>, Object> {

        /* renamed from: b  reason: collision with root package name */
        int f70778b;

        /* renamed from: c  reason: collision with root package name */
        private /* synthetic */ Object f70779c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f70780d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Function3<f<? super R>, T[], Continuation<? super Unit>, Object> f70781e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(Function3<? super f<? super R>, ? super T[], ? super Continuation<? super Unit>, ? extends Object> function3, Continuation<? super AnonymousClass2> continuation) {
            super(3, continuation);
            this.f70781e = function3;
        }

        @Override // kotlin.jvm.functions.Function3
        @Nullable
        /* renamed from: e */
        public final Object invoke(@NotNull f<? super R> fVar, @NotNull T[] tArr, @Nullable Continuation<? super Unit> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.f70781e, continuation);
            anonymousClass2.f70779c = fVar;
            anonymousClass2.f70780d = tArr;
            return anonymousClass2.invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i4 = this.f70778b;
            if (i4 == 0) {
                ResultKt.throwOnFailure(obj);
                Function3<f<? super R>, T[], Continuation<? super Unit>, Object> function3 = this.f70781e;
                this.f70779c = null;
                this.f70778b = 1;
                if (function3.invoke((f) this.f70779c, (Object[]) this.f70780d, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Nullable
        public final Object invokeSuspend$$forInline(@NotNull Object obj) {
            this.f70781e.invoke((f) this.f70779c, (Object[]) this.f70780d, this);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__ZipKt$combineTransform$6(e<? extends T>[] eVarArr, Function3<? super f<? super R>, ? super T[], ? super Continuation<? super Unit>, ? extends Object> function3, Continuation<? super FlowKt__ZipKt$combineTransform$6> continuation) {
        super(2, continuation);
        this.f70775d = eVarArr;
        this.f70776e = function3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        FlowKt__ZipKt$combineTransform$6 flowKt__ZipKt$combineTransform$6 = new FlowKt__ZipKt$combineTransform$6(this.f70775d, this.f70776e, continuation);
        flowKt__ZipKt$combineTransform$6.f70774c = obj;
        return flowKt__ZipKt$combineTransform$6;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    /* renamed from: e */
    public final Object invoke(@NotNull f<? super R> fVar, @Nullable Continuation<? super Unit> continuation) {
        return ((FlowKt__ZipKt$combineTransform$6) create(fVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = this.f70773b;
        if (i4 == 0) {
            ResultKt.throwOnFailure(obj);
            e<T>[] eVarArr = this.f70775d;
            Intrinsics.needClassReification();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f70775d);
            Intrinsics.needClassReification();
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.f70776e, null);
            this.f70773b = 1;
            if (CombineKt.a((f) this.f70774c, eVarArr, anonymousClass1, anonymousClass2, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i4 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    @Nullable
    public final Object invokeSuspend$$forInline(@NotNull Object obj) {
        e<T>[] eVarArr = this.f70775d;
        Intrinsics.needClassReification();
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f70775d);
        Intrinsics.needClassReification();
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.f70776e, null);
        InlineMarker.mark(0);
        CombineKt.a((f) this.f70774c, eVarArr, anonymousClass1, anonymousClass2, this);
        InlineMarker.mark(1);
        return Unit.INSTANCE;
    }
}
