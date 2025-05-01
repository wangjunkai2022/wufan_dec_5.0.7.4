package kotlinx.coroutines.flow;

import com.android.dx.io.Opcodes;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.q0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: T
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Share.kt */
@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1", f = "Share.kt", i = {}, l = {Opcodes.OR_INT_LIT16, 218, Opcodes.DIV_INT_LIT8, 225}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class FlowKt__ShareKt$launchSharing$1 extends SuspendLambda implements Function2<q0, Continuation<? super Unit>, Object> {

    /* renamed from: b  reason: collision with root package name */
    int f70561b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ r f70562c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ e<T> f70563d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ i<T> f70564e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ T f70565f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Share.kt */
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1", f = "Share.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<Integer, Continuation<? super Boolean>, Object> {

        /* renamed from: b  reason: collision with root package name */
        int f70566b;

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ int f70567c;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
            anonymousClass1.f70567c = ((Number) obj).intValue();
            return anonymousClass1;
        }

        @Nullable
        public final Object e(int i4, @Nullable Continuation<? super Boolean> continuation) {
            return ((AnonymousClass1) create(Integer.valueOf(i4), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Integer num, Continuation<? super Boolean> continuation) {
            return e(num.intValue(), continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f70566b == 0) {
                ResultKt.throwOnFailure(obj);
                return Boxing.boxBoolean(this.f70567c > 0);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Share.kt */
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2", f = "Share.kt", i = {}, l = {227}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<SharingCommand, Continuation<? super Unit>, Object> {

        /* renamed from: b  reason: collision with root package name */
        int f70568b;

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ Object f70569c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ e<T> f70570d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ i<T> f70571e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ T f70572f;

        /* compiled from: Share.kt */
        /* renamed from: kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2$a */
        /* loaded from: classes6.dex */
        public /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[SharingCommand.values().length];
                iArr[SharingCommand.START.ordinal()] = 1;
                iArr[SharingCommand.STOP.ordinal()] = 2;
                iArr[SharingCommand.STOP_AND_RESET_REPLAY_CACHE.ordinal()] = 3;
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(e<? extends T> eVar, i<T> iVar, T t4, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.f70570d = eVar;
            this.f70571e = iVar;
            this.f70572f = t4;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.f70570d, this.f70571e, this.f70572f, continuation);
            anonymousClass2.f70569c = obj;
            return anonymousClass2;
        }

        @Nullable
        public final Object e(@NotNull SharingCommand sharingCommand, @Nullable Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(sharingCommand, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(SharingCommand sharingCommand, Continuation<? super Unit> continuation) {
            return e(sharingCommand, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i4 = this.f70568b;
            if (i4 == 0) {
                ResultKt.throwOnFailure(obj);
                int i5 = a.$EnumSwitchMapping$0[((SharingCommand) this.f70569c).ordinal()];
                if (i5 == 1) {
                    e<T> eVar = this.f70570d;
                    f fVar = this.f70571e;
                    this.f70568b = 1;
                    if (eVar.a(fVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i5 == 3) {
                    T t4 = this.f70572f;
                    if (t4 == o.f71024a) {
                        this.f70571e.f();
                    } else {
                        this.f70571e.b(t4);
                    }
                }
            } else if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__ShareKt$launchSharing$1(r rVar, e<? extends T> eVar, i<T> iVar, T t4, Continuation<? super FlowKt__ShareKt$launchSharing$1> continuation) {
        super(2, continuation);
        this.f70562c = rVar;
        this.f70563d = eVar;
        this.f70564e = iVar;
        this.f70565f = t4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new FlowKt__ShareKt$launchSharing$1(this.f70562c, this.f70563d, this.f70564e, this.f70565f, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, Continuation<? super Unit> continuation) {
        return invoke2(q0Var, continuation);
    }

    @Nullable
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(@NotNull q0 q0Var, @Nullable Continuation<? super Unit> continuation) {
        return ((FlowKt__ShareKt$launchSharing$1) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0068 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r7.f70561b
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L25
            if (r1 == r5) goto L21
            if (r1 == r4) goto L1d
            if (r1 == r3) goto L21
            if (r1 != r2) goto L15
            goto L21
        L15:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1d:
            kotlin.ResultKt.throwOnFailure(r8)
            goto L5c
        L21:
            kotlin.ResultKt.throwOnFailure(r8)
            goto L8d
        L25:
            kotlin.ResultKt.throwOnFailure(r8)
            kotlinx.coroutines.flow.r r8 = r7.f70562c
            kotlinx.coroutines.flow.r$a r1 = kotlinx.coroutines.flow.r.f71031a
            kotlinx.coroutines.flow.r r6 = r1.c()
            if (r8 != r6) goto L3f
            kotlinx.coroutines.flow.e<T> r8 = r7.f70563d
            kotlinx.coroutines.flow.i<T> r1 = r7.f70564e
            r7.f70561b = r5
            java.lang.Object r8 = r8.a(r1, r7)
            if (r8 != r0) goto L8d
            return r0
        L3f:
            kotlinx.coroutines.flow.r r8 = r7.f70562c
            kotlinx.coroutines.flow.r r1 = r1.d()
            r5 = 0
            if (r8 != r1) goto L69
            kotlinx.coroutines.flow.i<T> r8 = r7.f70564e
            kotlinx.coroutines.flow.u r8 = r8.d()
            kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1 r1 = new kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1
            r1.<init>(r5)
            r7.f70561b = r4
            java.lang.Object r8 = kotlinx.coroutines.flow.g.u0(r8, r1, r7)
            if (r8 != r0) goto L5c
            return r0
        L5c:
            kotlinx.coroutines.flow.e<T> r8 = r7.f70563d
            kotlinx.coroutines.flow.i<T> r1 = r7.f70564e
            r7.f70561b = r3
            java.lang.Object r8 = r8.a(r1, r7)
            if (r8 != r0) goto L8d
            return r0
        L69:
            kotlinx.coroutines.flow.r r8 = r7.f70562c
            kotlinx.coroutines.flow.i<T> r1 = r7.f70564e
            kotlinx.coroutines.flow.u r1 = r1.d()
            kotlinx.coroutines.flow.e r8 = r8.a(r1)
            kotlinx.coroutines.flow.e r8 = kotlinx.coroutines.flow.g.g0(r8)
            kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2 r1 = new kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2
            kotlinx.coroutines.flow.e<T> r3 = r7.f70563d
            kotlinx.coroutines.flow.i<T> r4 = r7.f70564e
            T r6 = r7.f70565f
            r1.<init>(r3, r4, r6, r5)
            r7.f70561b = r2
            java.lang.Object r8 = kotlinx.coroutines.flow.g.A(r8, r1, r7)
            if (r8 != r0) goto L8d
            return r0
        L8d:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
