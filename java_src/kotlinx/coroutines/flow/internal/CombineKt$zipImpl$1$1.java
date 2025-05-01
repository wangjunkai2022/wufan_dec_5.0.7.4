package kotlinx.coroutines.flow.internal;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.b0;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.e2;
import kotlinx.coroutines.internal.ThreadContextKt;
import kotlinx.coroutines.q0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: T1
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
/* compiled from: Combine.kt */
@DebugMetadata(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1", f = "Combine.kt", i = {0}, l = {129}, m = "invokeSuspend", n = {"second"}, s = {"L$0"})
/* loaded from: classes6.dex */
final class CombineKt$zipImpl$1$1 extends SuspendLambda implements Function2<q0, Continuation<? super Unit>, Object> {

    /* renamed from: b  reason: collision with root package name */
    int f70943b;

    /* renamed from: c  reason: collision with root package name */
    private /* synthetic */ Object f70944c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.flow.f<R> f70945d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.flow.e<T2> f70946e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.flow.e<T1> f70947f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ Function3<T1, T2, Continuation<? super R>, Object> f70948g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Combine.kt */
    @DebugMetadata(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2", f = "Combine.kt", i = {}, l = {130}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {

        /* renamed from: b  reason: collision with root package name */
        int f70951b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.e<T1> f70952c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ CoroutineContext f70953d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Object f70954e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ ReceiveChannel<Object> f70955f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.f<R> f70956g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ Function3<T1, T2, Continuation<? super R>, Object> f70957h;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Combine.kt */
        /* renamed from: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1  reason: invalid class name */
        /* loaded from: classes6.dex */
        public static final class AnonymousClass1<T> implements kotlinx.coroutines.flow.f, SuspendFunction {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ CoroutineContext f70958b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ Object f70959c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ ReceiveChannel<Object> f70960d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.flow.f<R> f70961e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ Function3<T1, T2, Continuation<? super R>, Object> f70962f;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: Combine.kt */
            @DebugMetadata(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$1", f = "Combine.kt", i = {}, l = {132, 135, 135}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$1  reason: invalid class name and collision with other inner class name */
            /* loaded from: classes6.dex */
            public static final class C07801 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {

                /* renamed from: b  reason: collision with root package name */
                Object f70963b;

                /* renamed from: c  reason: collision with root package name */
                int f70964c;

                /* renamed from: d  reason: collision with root package name */
                final /* synthetic */ ReceiveChannel<Object> f70965d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ kotlinx.coroutines.flow.f<R> f70966e;

                /* renamed from: f  reason: collision with root package name */
                final /* synthetic */ Function3<T1, T2, Continuation<? super R>, Object> f70967f;

                /* renamed from: g  reason: collision with root package name */
                final /* synthetic */ T1 f70968g;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C07801(ReceiveChannel<? extends Object> receiveChannel, kotlinx.coroutines.flow.f<? super R> fVar, Function3<? super T1, ? super T2, ? super Continuation<? super R>, ? extends Object> function3, T1 t12, Continuation<? super C07801> continuation) {
                    super(2, continuation);
                    this.f70965d = receiveChannel;
                    this.f70966e = fVar;
                    this.f70967f = function3;
                    this.f70968g = t12;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                    return new C07801(this.f70965d, this.f70966e, this.f70967f, this.f70968g, continuation);
                }

                @Nullable
                public final Object e(@NotNull Unit unit, @Nullable Continuation<? super Unit> continuation) {
                    return ((C07801) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Unit unit, Continuation<? super Unit> continuation) {
                    return e(unit, continuation);
                }

                /* JADX WARN: Removed duplicated region for block: B:29:0x006e A[RETURN] */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @org.jetbrains.annotations.Nullable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r9) {
                    /*
                        r8 = this;
                        java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        int r1 = r8.f70964c
                        r2 = 0
                        r3 = 3
                        r4 = 2
                        r5 = 1
                        if (r1 == 0) goto L30
                        if (r1 == r5) goto L26
                        if (r1 == r4) goto L1e
                        if (r1 != r3) goto L16
                        kotlin.ResultKt.throwOnFailure(r9)
                        goto L6f
                    L16:
                        java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r9.<init>(r0)
                        throw r9
                    L1e:
                        java.lang.Object r1 = r8.f70963b
                        kotlinx.coroutines.flow.f r1 = (kotlinx.coroutines.flow.f) r1
                        kotlin.ResultKt.throwOnFailure(r9)
                        goto L64
                    L26:
                        kotlin.ResultKt.throwOnFailure(r9)
                        kotlinx.coroutines.channels.n r9 = (kotlinx.coroutines.channels.n) r9
                        java.lang.Object r9 = r9.o()
                        goto L3e
                    L30:
                        kotlin.ResultKt.throwOnFailure(r9)
                        kotlinx.coroutines.channels.ReceiveChannel<java.lang.Object> r9 = r8.f70965d
                        r8.f70964c = r5
                        java.lang.Object r9 = r9.M(r8)
                        if (r9 != r0) goto L3e
                        return r0
                    L3e:
                        kotlinx.coroutines.flow.f<R> r1 = r8.f70966e
                        boolean r5 = r9 instanceof kotlinx.coroutines.channels.n.c
                        if (r5 == 0) goto L50
                        java.lang.Throwable r9 = kotlinx.coroutines.channels.n.f(r9)
                        if (r9 != 0) goto L4f
                        kotlinx.coroutines.flow.internal.AbortFlowException r9 = new kotlinx.coroutines.flow.internal.AbortFlowException
                        r9.<init>(r1)
                    L4f:
                        throw r9
                    L50:
                        kotlin.jvm.functions.Function3<T1, T2, kotlin.coroutines.Continuation<? super R>, java.lang.Object> r5 = r8.f70967f
                        T1 r6 = r8.f70968g
                        kotlinx.coroutines.internal.o0 r7 = kotlinx.coroutines.flow.internal.l.f71013a
                        if (r9 != r7) goto L59
                        r9 = r2
                    L59:
                        r8.f70963b = r1
                        r8.f70964c = r4
                        java.lang.Object r9 = r5.invoke(r6, r9, r8)
                        if (r9 != r0) goto L64
                        return r0
                    L64:
                        r8.f70963b = r2
                        r8.f70964c = r3
                        java.lang.Object r9 = r1.emit(r9, r8)
                        if (r9 != r0) goto L6f
                        return r0
                    L6f:
                        kotlin.Unit r9 = kotlin.Unit.INSTANCE
                        return r9
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1.AnonymousClass2.AnonymousClass1.C07801.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass1(CoroutineContext coroutineContext, Object obj, ReceiveChannel<? extends Object> receiveChannel, kotlinx.coroutines.flow.f<? super R> fVar, Function3<? super T1, ? super T2, ? super Continuation<? super R>, ? extends Object> function3) {
                this.f70958b = coroutineContext;
                this.f70959c = obj;
                this.f70960d = receiveChannel;
                this.f70961e = fVar;
                this.f70962f = function3;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
            @Override // kotlinx.coroutines.flow.f
            @org.jetbrains.annotations.Nullable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(T1 r13, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r14) {
                /*
                    r12 = this;
                    boolean r0 = r14 instanceof kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$emit$1
                    if (r0 == 0) goto L13
                    r0 = r14
                    kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$emit$1 r0 = (kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$emit$1) r0
                    int r1 = r0.f70971d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f70971d = r1
                    goto L18
                L13:
                    kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$emit$1 r0 = new kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$emit$1
                    r0.<init>(r12, r14)
                L18:
                    java.lang.Object r14 = r0.f70969b
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f70971d
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.ResultKt.throwOnFailure(r14)
                    goto L51
                L29:
                    java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                    java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
                    r13.<init>(r14)
                    throw r13
                L31:
                    kotlin.ResultKt.throwOnFailure(r14)
                    kotlin.coroutines.CoroutineContext r14 = r12.f70958b
                    kotlin.Unit r2 = kotlin.Unit.INSTANCE
                    java.lang.Object r4 = r12.f70959c
                    kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$1 r11 = new kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$1
                    kotlinx.coroutines.channels.ReceiveChannel<java.lang.Object> r6 = r12.f70960d
                    kotlinx.coroutines.flow.f<R> r7 = r12.f70961e
                    kotlin.jvm.functions.Function3<T1, T2, kotlin.coroutines.Continuation<? super R>, java.lang.Object> r8 = r12.f70962f
                    r10 = 0
                    r5 = r11
                    r9 = r13
                    r5.<init>(r6, r7, r8, r9, r10)
                    r0.f70971d = r3
                    java.lang.Object r13 = kotlinx.coroutines.flow.internal.d.c(r14, r2, r4, r11, r0)
                    if (r13 != r1) goto L51
                    return r1
                L51:
                    kotlin.Unit r13 = kotlin.Unit.INSTANCE
                    return r13
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1.AnonymousClass2.AnonymousClass1.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(kotlinx.coroutines.flow.e<? extends T1> eVar, CoroutineContext coroutineContext, Object obj, ReceiveChannel<? extends Object> receiveChannel, kotlinx.coroutines.flow.f<? super R> fVar, Function3<? super T1, ? super T2, ? super Continuation<? super R>, ? extends Object> function3, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.f70952c = eVar;
            this.f70953d = coroutineContext;
            this.f70954e = obj;
            this.f70955f = receiveChannel;
            this.f70956g = fVar;
            this.f70957h = function3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new AnonymousClass2(this.f70952c, this.f70953d, this.f70954e, this.f70955f, this.f70956g, this.f70957h, continuation);
        }

        @Nullable
        public final Object e(@NotNull Unit unit, @Nullable Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Unit unit, Continuation<? super Unit> continuation) {
            return e(unit, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i4 = this.f70951b;
            if (i4 == 0) {
                ResultKt.throwOnFailure(obj);
                kotlinx.coroutines.flow.e<T1> eVar = this.f70952c;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f70953d, this.f70954e, this.f70955f, this.f70956g, this.f70957h);
                this.f70951b = 1;
                if (eVar.a(anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
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
    public CombineKt$zipImpl$1$1(kotlinx.coroutines.flow.f<? super R> fVar, kotlinx.coroutines.flow.e<? extends T2> eVar, kotlinx.coroutines.flow.e<? extends T1> eVar2, Function3<? super T1, ? super T2, ? super Continuation<? super R>, ? extends Object> function3, Continuation<? super CombineKt$zipImpl$1$1> continuation) {
        super(2, continuation);
        this.f70945d = fVar;
        this.f70946e = eVar;
        this.f70947f = eVar2;
        this.f70948g = function3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        CombineKt$zipImpl$1$1 combineKt$zipImpl$1$1 = new CombineKt$zipImpl$1$1(this.f70945d, this.f70946e, this.f70947f, this.f70948g, continuation);
        combineKt$zipImpl$1$1.f70944c = obj;
        return combineKt$zipImpl$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, Continuation<? super Unit> continuation) {
        return invoke2(q0Var, continuation);
    }

    @Nullable
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(@NotNull q0 q0Var, @Nullable Continuation<? super Unit> continuation) {
        return ((CombineKt$zipImpl$1$1) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v12, types: [kotlinx.coroutines.channels.ReceiveChannel] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v2, types: [kotlinx.coroutines.channels.ReceiveChannel] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended;
        final b0 c5;
        ReceiveChannel receiveChannel;
        ReceiveChannel receiveChannel2;
        CoroutineContext plus;
        Unit unit;
        AnonymousClass2 anonymousClass2;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ReceiveChannel receiveChannel3 = this.f70943b;
        try {
            if (receiveChannel3 != 0) {
                if (receiveChannel3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                receiveChannel2 = (ReceiveChannel) this.f70944c;
                try {
                    ResultKt.throwOnFailure(obj);
                    receiveChannel3 = receiveChannel2;
                } catch (AbortFlowException e5) {
                    e = e5;
                }
                ReceiveChannel.DefaultImpls.b(receiveChannel3, null, 1, null);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            q0 q0Var = (q0) this.f70944c;
            ReceiveChannel f5 = ProduceKt.f(q0Var, null, 0, new CombineKt$zipImpl$1$1$second$1(this.f70946e, null), 3, null);
            c5 = e2.c(null, 1, null);
            final kotlinx.coroutines.flow.f fVar = this.f70945d;
            ((kotlinx.coroutines.channels.b0) f5).w(new Function1<Throwable, Unit>() { // from class: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                    invoke2(th);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2(@Nullable Throwable th) {
                    if (b0.this.isActive()) {
                        b0.this.b(new AbortFlowException(fVar));
                    }
                }
            });
            try {
                CoroutineContext coroutineContext = q0Var.getCoroutineContext();
                Object b5 = ThreadContextKt.b(coroutineContext);
                plus = q0Var.getCoroutineContext().plus(c5);
                unit = Unit.INSTANCE;
                anonymousClass2 = new AnonymousClass2(this.f70947f, coroutineContext, b5, f5, this.f70945d, this.f70948g, null);
                this.f70944c = f5;
                this.f70943b = 1;
                receiveChannel = f5;
                try {
                } catch (AbortFlowException e6) {
                    e = e6;
                    receiveChannel2 = receiveChannel;
                    h.b(e, this.f70945d);
                    receiveChannel3 = receiveChannel2;
                    ReceiveChannel.DefaultImpls.b(receiveChannel3, null, 1, null);
                    return Unit.INSTANCE;
                } catch (Throwable th) {
                    th = th;
                    receiveChannel3 = receiveChannel;
                    ReceiveChannel.DefaultImpls.b(receiveChannel3, null, 1, null);
                    throw th;
                }
            } catch (AbortFlowException e7) {
                e = e7;
                receiveChannel = f5;
            } catch (Throwable th2) {
                th = th2;
                receiveChannel = f5;
            }
            if (d.d(plus, unit, null, anonymousClass2, this, 4, null) == coroutine_suspended) {
                return coroutine_suspended;
            }
            receiveChannel3 = receiveChannel;
            ReceiveChannel.DefaultImpls.b(receiveChannel3, null, 1, null);
            return Unit.INSTANCE;
            h.b(e, this.f70945d);
            receiveChannel3 = receiveChannel2;
            ReceiveChannel.DefaultImpls.b(receiveChannel3, null, 1, null);
            return Unit.INSTANCE;
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
