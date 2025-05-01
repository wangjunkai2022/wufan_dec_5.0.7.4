package kotlinx.coroutines.flow;

import com.android.dx.io.Opcodes;
import kotlin.BuilderInference;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import kotlinx.coroutines.FlowPreview;
import kotlinx.coroutines.flow.internal.ChannelFlowMerge;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;
import kotlinx.coroutines.flow.internal.ChannelLimitedFlowMerge;
import kotlinx.coroutines.internal.q0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: Merge.kt */
/* loaded from: classes6.dex */
public final /* synthetic */ class FlowKt__MergeKt {

    /* renamed from: a */
    private static final int f70449a = q0.b(g.f70866a, 16, 1, Integer.MAX_VALUE);

    /* compiled from: SafeCollector.common.kt */
    /* loaded from: classes6.dex */
    public static final class a<T> implements e<T> {

        /* renamed from: b */
        final /* synthetic */ e f70466b;

        public a(e eVar) {
            this.f70466b = eVar;
        }

        @Override // kotlinx.coroutines.flow.e
        @Nullable
        public Object a(@NotNull f<? super T> fVar, @NotNull Continuation<? super Unit> continuation) {
            Object coroutine_suspended;
            Object a5 = this.f70466b.a(new FlowKt__MergeKt$flattenConcat$1$1(fVar), continuation);
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            return a5 == coroutine_suspended ? a5 : Unit.INSTANCE;
        }
    }

    @FlowPreview
    @NotNull
    public static final <T, R> e<R> a(@NotNull final e<? extends T> eVar, @NotNull final Function2<? super T, ? super Continuation<? super e<? extends R>>, ? extends Object> function2) {
        return g.F0(new e<e<? extends R>>() { // from class: kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1

            /* compiled from: Emitters.kt */
            /* renamed from: kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1$2  reason: invalid class name */
            /* loaded from: classes6.dex */
            public static final class AnonymousClass2<T> implements f, SuspendFunction {

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ f f70452b;

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ Function2 f70453c;

                /* compiled from: Emitters.kt */
                @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1$2", f = "Merge.kt", i = {}, l = {Opcodes.XOR_INT_LIT8, Opcodes.XOR_INT_LIT8}, m = "emit", n = {}, s = {})
                /* renamed from: kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1$2$1  reason: invalid class name */
                /* loaded from: classes6.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* renamed from: b  reason: collision with root package name */
                    /* synthetic */ Object f70454b;

                    /* renamed from: c  reason: collision with root package name */
                    int f70455c;

                    /* renamed from: d  reason: collision with root package name */
                    Object f70456d;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.f70454b = obj;
                        this.f70455c |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(f fVar, Function2 function2) {
                    this.f70452b = fVar;
                    this.f70453c = function2;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
                /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
                /* JADX WARN: Removed duplicated region for block: B:22:0x005c A[RETURN] */
                @Override // kotlinx.coroutines.flow.f
                @org.jetbrains.annotations.Nullable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r8) {
                    /*
                        r6 = this;
                        boolean r0 = r8 instanceof kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r8
                        kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1$2$1 r0 = (kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.f70455c
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f70455c = r1
                        goto L18
                    L13:
                        kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1$2$1 r0 = new kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1$2$1
                        r0.<init>(r8)
                    L18:
                        java.lang.Object r8 = r0.f70454b
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        int r2 = r0.f70455c
                        r3 = 2
                        r4 = 1
                        if (r2 == 0) goto L3c
                        if (r2 == r4) goto L34
                        if (r2 != r3) goto L2c
                        kotlin.ResultKt.throwOnFailure(r8)
                        goto L5d
                    L2c:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r8)
                        throw r7
                    L34:
                        java.lang.Object r7 = r0.f70456d
                        kotlinx.coroutines.flow.f r7 = (kotlinx.coroutines.flow.f) r7
                        kotlin.ResultKt.throwOnFailure(r8)
                        goto L51
                    L3c:
                        kotlin.ResultKt.throwOnFailure(r8)
                        kotlinx.coroutines.flow.f r8 = r6.f70452b
                        kotlin.jvm.functions.Function2 r2 = r6.f70453c
                        r0.f70456d = r8
                        r0.f70455c = r4
                        java.lang.Object r7 = r2.invoke(r7, r0)
                        if (r7 != r1) goto L4e
                        return r1
                    L4e:
                        r5 = r8
                        r8 = r7
                        r7 = r5
                    L51:
                        r2 = 0
                        r0.f70456d = r2
                        r0.f70455c = r3
                        java.lang.Object r7 = r7.emit(r8, r0)
                        if (r7 != r1) goto L5d
                        return r1
                    L5d:
                        kotlin.Unit r7 = kotlin.Unit.INSTANCE
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.e
            @Nullable
            public Object a(@NotNull f fVar, @NotNull Continuation continuation) {
                Object coroutine_suspended;
                Object a5 = e.this.a(new AnonymousClass2(fVar, function2), continuation);
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                return a5 == coroutine_suspended ? a5 : Unit.INSTANCE;
            }
        });
    }

    @ExperimentalCoroutinesApi
    @NotNull
    public static final <T, R> e<R> b(@NotNull e<? extends T> eVar, @BuilderInference @NotNull Function2<? super T, ? super Continuation<? super e<? extends R>>, ? extends Object> function2) {
        return g.b2(eVar, new FlowKt__MergeKt$flatMapLatest$1(function2, null));
    }

    @FlowPreview
    @NotNull
    public static final <T, R> e<R> c(@NotNull final e<? extends T> eVar, int i4, @NotNull final Function2<? super T, ? super Continuation<? super e<? extends R>>, ? extends Object> function2) {
        return g.G0(new e<e<? extends R>>() { // from class: kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapMerge$$inlined$map$1

            /* compiled from: Emitters.kt */
            /* renamed from: kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapMerge$$inlined$map$1$2  reason: invalid class name */
            /* loaded from: classes6.dex */
            public static final class AnonymousClass2<T> implements f, SuspendFunction {

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ f f70460b;

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ Function2 f70461c;

                /* compiled from: Emitters.kt */
                @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapMerge$$inlined$map$1$2", f = "Merge.kt", i = {}, l = {Opcodes.XOR_INT_LIT8, Opcodes.XOR_INT_LIT8}, m = "emit", n = {}, s = {})
                /* renamed from: kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapMerge$$inlined$map$1$2$1  reason: invalid class name */
                /* loaded from: classes6.dex */
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* renamed from: b  reason: collision with root package name */
                    /* synthetic */ Object f70462b;

                    /* renamed from: c  reason: collision with root package name */
                    int f70463c;

                    /* renamed from: d  reason: collision with root package name */
                    Object f70464d;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.f70462b = obj;
                        this.f70463c |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(f fVar, Function2 function2) {
                    this.f70460b = fVar;
                    this.f70461c = function2;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
                /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
                /* JADX WARN: Removed duplicated region for block: B:22:0x005c A[RETURN] */
                @Override // kotlinx.coroutines.flow.f
                @org.jetbrains.annotations.Nullable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r8) {
                    /*
                        r6 = this;
                        boolean r0 = r8 instanceof kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapMerge$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r8
                        kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapMerge$$inlined$map$1$2$1 r0 = (kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapMerge$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.f70463c
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f70463c = r1
                        goto L18
                    L13:
                        kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapMerge$$inlined$map$1$2$1 r0 = new kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapMerge$$inlined$map$1$2$1
                        r0.<init>(r8)
                    L18:
                        java.lang.Object r8 = r0.f70462b
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        int r2 = r0.f70463c
                        r3 = 2
                        r4 = 1
                        if (r2 == 0) goto L3c
                        if (r2 == r4) goto L34
                        if (r2 != r3) goto L2c
                        kotlin.ResultKt.throwOnFailure(r8)
                        goto L5d
                    L2c:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r8)
                        throw r7
                    L34:
                        java.lang.Object r7 = r0.f70464d
                        kotlinx.coroutines.flow.f r7 = (kotlinx.coroutines.flow.f) r7
                        kotlin.ResultKt.throwOnFailure(r8)
                        goto L51
                    L3c:
                        kotlin.ResultKt.throwOnFailure(r8)
                        kotlinx.coroutines.flow.f r8 = r6.f70460b
                        kotlin.jvm.functions.Function2 r2 = r6.f70461c
                        r0.f70464d = r8
                        r0.f70463c = r4
                        java.lang.Object r7 = r2.invoke(r7, r0)
                        if (r7 != r1) goto L4e
                        return r1
                    L4e:
                        r5 = r8
                        r8 = r7
                        r7 = r5
                    L51:
                        r2 = 0
                        r0.f70464d = r2
                        r0.f70463c = r3
                        java.lang.Object r7 = r7.emit(r8, r0)
                        if (r7 != r1) goto L5d
                        return r1
                    L5d:
                        kotlin.Unit r7 = kotlin.Unit.INSTANCE
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapMerge$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.e
            @Nullable
            public Object a(@NotNull f fVar, @NotNull Continuation continuation) {
                Object coroutine_suspended;
                Object a5 = e.this.a(new AnonymousClass2(fVar, function2), continuation);
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                return a5 == coroutine_suspended ? a5 : Unit.INSTANCE;
            }
        }, i4);
    }

    public static /* synthetic */ e d(e eVar, int i4, Function2 function2, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i4 = f70449a;
        }
        return g.C0(eVar, i4, function2);
    }

    @FlowPreview
    @NotNull
    public static final <T> e<T> e(@NotNull e<? extends e<? extends T>> eVar) {
        return new a(eVar);
    }

    @FlowPreview
    @NotNull
    public static final <T> e<T> f(@NotNull e<? extends e<? extends T>> eVar, int i4) {
        if (i4 > 0) {
            return i4 == 1 ? g.F0(eVar) : new ChannelFlowMerge(eVar, i4, null, 0, null, 28, null);
        }
        throw new IllegalArgumentException(Intrinsics.stringPlus("Expected positive concurrency level, but had ", Integer.valueOf(i4)).toString());
    }

    public static /* synthetic */ e g(e eVar, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i4 = f70449a;
        }
        return g.G0(eVar, i4);
    }

    public static final int h() {
        return f70449a;
    }

    @FlowPreview
    public static /* synthetic */ void i() {
    }

    @FlowPreview
    public static /* synthetic */ void j() {
    }

    @ExperimentalCoroutinesApi
    @NotNull
    public static final <T, R> e<R> k(@NotNull e<? extends T> eVar, @BuilderInference @NotNull Function2<? super T, ? super Continuation<? super R>, ? extends Object> function2) {
        return g.b2(eVar, new FlowKt__MergeKt$mapLatest$1(function2, null));
    }

    @NotNull
    public static final <T> e<T> l(@NotNull Iterable<? extends e<? extends T>> iterable) {
        return new ChannelLimitedFlowMerge(iterable, null, 0, null, 14, null);
    }

    @NotNull
    public static final <T> e<T> m(@NotNull e<? extends T>... eVarArr) {
        Iterable asIterable;
        asIterable = ArraysKt___ArraysKt.asIterable(eVarArr);
        return g.Y0(asIterable);
    }

    @ExperimentalCoroutinesApi
    @NotNull
    public static final <T, R> e<R> n(@NotNull e<? extends T> eVar, @BuilderInference @NotNull Function3<? super f<? super R>, ? super T, ? super Continuation<? super Unit>, ? extends Object> function3) {
        return new ChannelFlowTransformLatest(function3, eVar, null, 0, null, 28, null);
    }
}
