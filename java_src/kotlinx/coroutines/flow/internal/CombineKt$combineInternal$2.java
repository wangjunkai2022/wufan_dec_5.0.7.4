package kotlinx.coroutines.flow.internal;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.IndexedValue;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.channels.b0;
import kotlinx.coroutines.q0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: Combine.kt */
@DebugMetadata(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2", f = "Combine.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2}, l = {57, 79, 82}, m = "invokeSuspend", n = {"latestValues", "resultChannel", "lastReceivedEpoch", "remainingAbsentValues", "currentEpoch", "latestValues", "resultChannel", "lastReceivedEpoch", "remainingAbsentValues", "currentEpoch", "latestValues", "resultChannel", "lastReceivedEpoch", "remainingAbsentValues", "currentEpoch"}, s = {"L$0", "L$1", "L$2", "I$0", "I$1", "L$0", "L$1", "L$2", "I$0", "I$1", "L$0", "L$1", "L$2", "I$0", "I$1"})
/* loaded from: classes6.dex */
final class CombineKt$combineInternal$2 extends SuspendLambda implements Function2<q0, Continuation<? super Unit>, Object> {

    /* renamed from: b  reason: collision with root package name */
    Object f70923b;

    /* renamed from: c  reason: collision with root package name */
    Object f70924c;

    /* renamed from: d  reason: collision with root package name */
    int f70925d;

    /* renamed from: e  reason: collision with root package name */
    int f70926e;

    /* renamed from: f  reason: collision with root package name */
    int f70927f;

    /* renamed from: g  reason: collision with root package name */
    private /* synthetic */ Object f70928g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.flow.e<T>[] f70929h;

    /* renamed from: i  reason: collision with root package name */
    final /* synthetic */ Function0<T[]> f70930i;

    /* renamed from: j  reason: collision with root package name */
    final /* synthetic */ Function3<kotlinx.coroutines.flow.f<? super R>, T[], Continuation<? super Unit>, Object> f70931j;

    /* renamed from: k  reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.flow.f<R> f70932k;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Combine.kt */
    @DebugMetadata(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1", f = "Combine.kt", i = {}, l = {34}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<q0, Continuation<? super Unit>, Object> {

        /* renamed from: b  reason: collision with root package name */
        int f70933b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.e<T>[] f70934c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f70935d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ AtomicInteger f70936e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.channels.k<IndexedValue<Object>> f70937f;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Combine.kt */
        /* renamed from: kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes6.dex */
        public static final class C07791<T> implements kotlinx.coroutines.flow.f, SuspendFunction {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.channels.k<IndexedValue<Object>> f70938b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ int f70939c;

            C07791(kotlinx.coroutines.channels.k<IndexedValue<Object>> kVar, int i4) {
                this.f70938b = kVar;
                this.f70939c = i4;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
            /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
            /* JADX WARN: Removed duplicated region for block: B:21:0x0055 A[RETURN] */
            @Override // kotlinx.coroutines.flow.f
            @org.jetbrains.annotations.Nullable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(T r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1$emit$1
                    if (r0 == 0) goto L13
                    r0 = r8
                    kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1$emit$1 r0 = (kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1$emit$1) r0
                    int r1 = r0.f70942d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f70942d = r1
                    goto L18
                L13:
                    kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1$emit$1 r0 = new kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1$emit$1
                    r0.<init>(r6, r8)
                L18:
                    java.lang.Object r8 = r0.f70940b
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f70942d
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L38
                    if (r2 == r4) goto L34
                    if (r2 != r3) goto L2c
                    kotlin.ResultKt.throwOnFailure(r8)
                    goto L56
                L2c:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L34:
                    kotlin.ResultKt.throwOnFailure(r8)
                    goto L4d
                L38:
                    kotlin.ResultKt.throwOnFailure(r8)
                    kotlinx.coroutines.channels.k<kotlin.collections.IndexedValue<java.lang.Object>> r8 = r6.f70938b
                    kotlin.collections.IndexedValue r2 = new kotlin.collections.IndexedValue
                    int r5 = r6.f70939c
                    r2.<init>(r5, r7)
                    r0.f70942d = r4
                    java.lang.Object r7 = r8.S(r2, r0)
                    if (r7 != r1) goto L4d
                    return r1
                L4d:
                    r0.f70942d = r3
                    java.lang.Object r7 = kotlinx.coroutines.m3.a(r0)
                    if (r7 != r1) goto L56
                    return r1
                L56:
                    kotlin.Unit r7 = kotlin.Unit.INSTANCE
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2.AnonymousClass1.C07791.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(kotlinx.coroutines.flow.e<? extends T>[] eVarArr, int i4, AtomicInteger atomicInteger, kotlinx.coroutines.channels.k<IndexedValue<Object>> kVar, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.f70934c = eVarArr;
            this.f70935d = i4;
            this.f70936e = atomicInteger;
            this.f70937f = kVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new AnonymousClass1(this.f70934c, this.f70935d, this.f70936e, this.f70937f, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull q0 q0Var, @Nullable Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended;
            AtomicInteger atomicInteger;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i4 = this.f70933b;
            try {
                if (i4 == 0) {
                    ResultKt.throwOnFailure(obj);
                    kotlinx.coroutines.flow.e[] eVarArr = this.f70934c;
                    int i5 = this.f70935d;
                    kotlinx.coroutines.flow.e eVar = eVarArr[i5];
                    C07791 c07791 = new C07791(this.f70937f, i5);
                    this.f70933b = 1;
                    if (eVar.a(c07791, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ResultKt.throwOnFailure(obj);
                }
                if (atomicInteger.decrementAndGet() == 0) {
                    b0.a.a(this.f70937f, null, 1, null);
                }
                return Unit.INSTANCE;
            } finally {
                if (this.f70936e.decrementAndGet() == 0) {
                    b0.a.a(this.f70937f, null, 1, null);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CombineKt$combineInternal$2(kotlinx.coroutines.flow.e<? extends T>[] eVarArr, Function0<T[]> function0, Function3<? super kotlinx.coroutines.flow.f<? super R>, ? super T[], ? super Continuation<? super Unit>, ? extends Object> function3, kotlinx.coroutines.flow.f<? super R> fVar, Continuation<? super CombineKt$combineInternal$2> continuation) {
        super(2, continuation);
        this.f70929h = eVarArr;
        this.f70930i = function0;
        this.f70931j = function3;
        this.f70932k = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        CombineKt$combineInternal$2 combineKt$combineInternal$2 = new CombineKt$combineInternal$2(this.f70929h, this.f70930i, this.f70931j, this.f70932k, continuation);
        combineKt$combineInternal$2.f70928g = obj;
        return combineKt$combineInternal$2;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull q0 q0Var, @Nullable Continuation<? super Unit> continuation) {
        return ((CombineKt$combineInternal$2) create(q0Var, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ed A[LOOP:0: B:28:0x00ed->B:35:0x0111, LOOP_START, PHI: r3 r10 
      PHI: (r3v2 int) = (r3v1 int), (r3v3 int) binds: [B:25:0x00e8, B:35:0x0111] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r10v5 kotlin.collections.IndexedValue) = (r10v4 kotlin.collections.IndexedValue), (r10v18 kotlin.collections.IndexedValue) binds: [B:25:0x00e8, B:35:0x0111] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r11v1, types: [kotlinx.coroutines.flow.e[], kotlinx.coroutines.flow.e<T>[]] */
    /* JADX WARN: Type inference failed for: r2v12, types: [int] */
    /* JADX WARN: Type inference failed for: r2v7, types: [int] */
    /* JADX WARN: Type inference failed for: r2v9, types: [int] */
    /* JADX WARN: Type inference failed for: r7v0, types: [kotlinx.coroutines.flow.e<T>[]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x0136 -> B:20:0x00c8). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x016b -> B:46:0x0167). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r25) {
        /*
            Method dump skipped, instructions count: 369
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
