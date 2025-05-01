package kotlinx.coroutines.flow;

import java.util.List;
import java.util.Objects;
import kotlin.BuilderInference;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.functions.Function7;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.internal.CombineKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: Zip.kt */
/* loaded from: classes6.dex */
public final /* synthetic */ class FlowKt__ZipKt {

    /* compiled from: SafeCollector.common.kt */
    /* loaded from: classes6.dex */
    public static final class a<R> implements e<R> {

        /* renamed from: b */
        final /* synthetic */ e f70756b;

        /* renamed from: c */
        final /* synthetic */ e f70757c;

        /* renamed from: d */
        final /* synthetic */ Function3 f70758d;

        public a(e eVar, e eVar2, Function3 function3) {
            this.f70756b = eVar;
            this.f70757c = eVar2;
            this.f70758d = function3;
        }

        @Override // kotlinx.coroutines.flow.e
        @Nullable
        public Object a(@NotNull f<? super R> fVar, @NotNull Continuation<? super Unit> continuation) {
            Object coroutine_suspended;
            Object a5 = CombineKt.a(fVar, new e[]{this.f70756b, this.f70757c}, FlowKt__ZipKt.a(), new FlowKt__ZipKt$combine$1$1(this.f70758d, null), continuation);
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            return a5 == coroutine_suspended ? a5 : Unit.INSTANCE;
        }
    }

    public static final /* synthetic */ Function0 a() {
        return r();
    }

    public static final /* synthetic */ <T, R> e<R> b(Iterable<? extends e<? extends T>> iterable, Function2<? super T[], ? super Continuation<? super R>, ? extends Object> function2) {
        List list;
        list = CollectionsKt___CollectionsKt.toList(iterable);
        Object[] array = list.toArray(new e[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        Intrinsics.needClassReification();
        return new FlowKt__ZipKt$combine$$inlined$unsafeFlow$3((e[]) array, function2);
    }

    @NotNull
    public static final <T1, T2, R> e<R> c(@NotNull e<? extends T1> eVar, @NotNull e<? extends T2> eVar2, @NotNull Function3<? super T1, ? super T2, ? super Continuation<? super R>, ? extends Object> function3) {
        return g.J0(eVar, eVar2, function3);
    }

    @NotNull
    public static final <T1, T2, T3, R> e<R> d(@NotNull e<? extends T1> eVar, @NotNull e<? extends T2> eVar2, @NotNull e<? extends T3> eVar3, @BuilderInference @NotNull final Function4<? super T1, ? super T2, ? super T3, ? super Continuation<? super R>, ? extends Object> function4) {
        final e[] eVarArr = {eVar, eVar2, eVar3};
        return new e<R>() { // from class: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1

            /* compiled from: Zip.kt */
            @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1$2", f = "Zip.kt", i = {}, l = {cn.aigestudio.downloader.bizs.d.f419g, cn.aigestudio.downloader.bizs.d.f419g}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1$2  reason: invalid class name */
            /* loaded from: classes6.dex */
            public static final class AnonymousClass2 extends SuspendLambda implements Function3<f<? super R>, Object[], Continuation<? super Unit>, Object> {

                /* renamed from: b  reason: collision with root package name */
                int f70685b;

                /* renamed from: c  reason: collision with root package name */
                private /* synthetic */ Object f70686c;

                /* renamed from: d  reason: collision with root package name */
                /* synthetic */ Object f70687d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ Function4 f70688e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(Continuation continuation, Function4 function4) {
                    super(3, continuation);
                    this.f70688e = function4;
                }

                @Override // kotlin.jvm.functions.Function3
                @Nullable
                /* renamed from: e */
                public final Object invoke(@NotNull f<? super R> fVar, @NotNull Object[] objArr, @Nullable Continuation<? super Unit> continuation) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(continuation, this.f70688e);
                    anonymousClass2.f70686c = fVar;
                    anonymousClass2.f70687d = objArr;
                    return anonymousClass2.invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    Object coroutine_suspended;
                    f fVar;
                    coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i4 = this.f70685b;
                    if (i4 == 0) {
                        ResultKt.throwOnFailure(obj);
                        fVar = (f) this.f70686c;
                        Object[] objArr = (Object[]) this.f70687d;
                        Function4 function4 = this.f70688e;
                        Object obj2 = objArr[0];
                        Object obj3 = objArr[1];
                        Object obj4 = objArr[2];
                        this.f70686c = fVar;
                        this.f70685b = 1;
                        InlineMarker.mark(6);
                        obj = function4.invoke(obj2, obj3, obj4, this);
                        InlineMarker.mark(7);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else if (i4 != 1) {
                        if (i4 == 2) {
                            ResultKt.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        fVar = (f) this.f70686c;
                        ResultKt.throwOnFailure(obj);
                    }
                    this.f70686c = null;
                    this.f70685b = 2;
                    if (fVar.emit(obj, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.e
            @Nullable
            public Object a(@NotNull f fVar, @NotNull Continuation continuation) {
                Object coroutine_suspended;
                Object a5 = CombineKt.a(fVar, eVarArr, FlowKt__ZipKt.a(), new AnonymousClass2(null, function4), continuation);
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                return a5 == coroutine_suspended ? a5 : Unit.INSTANCE;
            }
        };
    }

    @NotNull
    public static final <T1, T2, T3, T4, R> e<R> e(@NotNull e<? extends T1> eVar, @NotNull e<? extends T2> eVar2, @NotNull e<? extends T3> eVar3, @NotNull e<? extends T4> eVar4, @NotNull final Function5<? super T1, ? super T2, ? super T3, ? super T4, ? super Continuation<? super R>, ? extends Object> function5) {
        final e[] eVarArr = {eVar, eVar2, eVar3, eVar4};
        return new e<R>() { // from class: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2

            /* compiled from: Zip.kt */
            @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2$2", f = "Zip.kt", i = {}, l = {cn.aigestudio.downloader.bizs.d.f419g, cn.aigestudio.downloader.bizs.d.f419g}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2$2  reason: invalid class name */
            /* loaded from: classes6.dex */
            public static final class AnonymousClass2 extends SuspendLambda implements Function3<f<? super R>, Object[], Continuation<? super Unit>, Object> {

                /* renamed from: b  reason: collision with root package name */
                int f70691b;

                /* renamed from: c  reason: collision with root package name */
                private /* synthetic */ Object f70692c;

                /* renamed from: d  reason: collision with root package name */
                /* synthetic */ Object f70693d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ Function5 f70694e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(Continuation continuation, Function5 function5) {
                    super(3, continuation);
                    this.f70694e = function5;
                }

                @Override // kotlin.jvm.functions.Function3
                @Nullable
                /* renamed from: e */
                public final Object invoke(@NotNull f<? super R> fVar, @NotNull Object[] objArr, @Nullable Continuation<? super Unit> continuation) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(continuation, this.f70694e);
                    anonymousClass2.f70692c = fVar;
                    anonymousClass2.f70693d = objArr;
                    return anonymousClass2.invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    Object coroutine_suspended;
                    f fVar;
                    coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i4 = this.f70691b;
                    if (i4 == 0) {
                        ResultKt.throwOnFailure(obj);
                        fVar = (f) this.f70692c;
                        Object[] objArr = (Object[]) this.f70693d;
                        Function5 function5 = this.f70694e;
                        Object obj2 = objArr[0];
                        Object obj3 = objArr[1];
                        Object obj4 = objArr[2];
                        Object obj5 = objArr[3];
                        this.f70692c = fVar;
                        this.f70691b = 1;
                        InlineMarker.mark(6);
                        obj = function5.invoke(obj2, obj3, obj4, obj5, this);
                        InlineMarker.mark(7);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else if (i4 != 1) {
                        if (i4 == 2) {
                            ResultKt.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        fVar = (f) this.f70692c;
                        ResultKt.throwOnFailure(obj);
                    }
                    this.f70692c = null;
                    this.f70691b = 2;
                    if (fVar.emit(obj, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.e
            @Nullable
            public Object a(@NotNull f fVar, @NotNull Continuation continuation) {
                Object coroutine_suspended;
                Object a5 = CombineKt.a(fVar, eVarArr, FlowKt__ZipKt.a(), new AnonymousClass2(null, function5), continuation);
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                return a5 == coroutine_suspended ? a5 : Unit.INSTANCE;
            }
        };
    }

    @NotNull
    public static final <T1, T2, T3, T4, T5, R> e<R> f(@NotNull e<? extends T1> eVar, @NotNull e<? extends T2> eVar2, @NotNull e<? extends T3> eVar3, @NotNull e<? extends T4> eVar4, @NotNull e<? extends T5> eVar5, @NotNull final Function6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super Continuation<? super R>, ? extends Object> function6) {
        final e[] eVarArr = {eVar, eVar2, eVar3, eVar4, eVar5};
        return new e<R>() { // from class: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3

            /* compiled from: Zip.kt */
            @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3$2", f = "Zip.kt", i = {}, l = {cn.aigestudio.downloader.bizs.d.f419g, cn.aigestudio.downloader.bizs.d.f419g}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3$2  reason: invalid class name */
            /* loaded from: classes6.dex */
            public static final class AnonymousClass2 extends SuspendLambda implements Function3<f<? super R>, Object[], Continuation<? super Unit>, Object> {

                /* renamed from: b  reason: collision with root package name */
                int f70697b;

                /* renamed from: c  reason: collision with root package name */
                private /* synthetic */ Object f70698c;

                /* renamed from: d  reason: collision with root package name */
                /* synthetic */ Object f70699d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ Function6 f70700e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(Continuation continuation, Function6 function6) {
                    super(3, continuation);
                    this.f70700e = function6;
                }

                @Override // kotlin.jvm.functions.Function3
                @Nullable
                /* renamed from: e */
                public final Object invoke(@NotNull f<? super R> fVar, @NotNull Object[] objArr, @Nullable Continuation<? super Unit> continuation) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(continuation, this.f70700e);
                    anonymousClass2.f70698c = fVar;
                    anonymousClass2.f70699d = objArr;
                    return anonymousClass2.invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    Object coroutine_suspended;
                    f fVar;
                    coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i4 = this.f70697b;
                    if (i4 == 0) {
                        ResultKt.throwOnFailure(obj);
                        fVar = (f) this.f70698c;
                        Object[] objArr = (Object[]) this.f70699d;
                        Function6 function6 = this.f70700e;
                        Object obj2 = objArr[0];
                        Object obj3 = objArr[1];
                        Object obj4 = objArr[2];
                        Object obj5 = objArr[3];
                        Object obj6 = objArr[4];
                        this.f70698c = fVar;
                        this.f70697b = 1;
                        InlineMarker.mark(6);
                        obj = function6.invoke(obj2, obj3, obj4, obj5, obj6, this);
                        InlineMarker.mark(7);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else if (i4 != 1) {
                        if (i4 == 2) {
                            ResultKt.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        fVar = (f) this.f70698c;
                        ResultKt.throwOnFailure(obj);
                    }
                    this.f70698c = null;
                    this.f70697b = 2;
                    if (fVar.emit(obj, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.e
            @Nullable
            public Object a(@NotNull f fVar, @NotNull Continuation continuation) {
                Object coroutine_suspended;
                Object a5 = CombineKt.a(fVar, eVarArr, FlowKt__ZipKt.a(), new AnonymousClass2(null, function6), continuation);
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                return a5 == coroutine_suspended ? a5 : Unit.INSTANCE;
            }
        };
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: MarkMethodsForInline
        java.lang.IndexOutOfBoundsException: Index: 0
        	at java.base/java.util.Collections$EmptyList.get(Collections.java:4483)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:104)
        	at jadx.core.dex.visitors.MarkMethodsForInline.isSyntheticAccessPattern(MarkMethodsForInline.java:117)
        	at jadx.core.dex.visitors.MarkMethodsForInline.inlineMth(MarkMethodsForInline.java:86)
        	at jadx.core.dex.visitors.MarkMethodsForInline.process(MarkMethodsForInline.java:53)
        	at jadx.core.dex.visitors.MarkMethodsForInline.visit(MarkMethodsForInline.java:37)
        */
    public static final /* synthetic */ <T, R> kotlinx.coroutines.flow.e<R> g(kotlinx.coroutines.flow.e<? extends T>[] r1, kotlin.jvm.functions.Function2<? super T[], ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r2) {
        /*
            kotlin.jvm.internal.Intrinsics.needClassReification()
            kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$2 r0 = new kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$2
            r0.<init>(r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ZipKt.g(kotlinx.coroutines.flow.e[], kotlin.jvm.functions.Function2):kotlinx.coroutines.flow.e");
    }

    public static final /* synthetic */ <T, R> e<R> h(Iterable<? extends e<? extends T>> iterable, @BuilderInference Function3<? super f<? super R>, ? super T[], ? super Continuation<? super Unit>, ? extends Object> function3) {
        List list;
        list = CollectionsKt___CollectionsKt.toList(iterable);
        Object[] array = list.toArray(new e[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        Intrinsics.needClassReification();
        return g.I0(new FlowKt__ZipKt$combineTransform$7((e[]) array, function3, null));
    }

    @NotNull
    public static final <T1, T2, R> e<R> i(@NotNull e<? extends T1> eVar, @NotNull e<? extends T2> eVar2, @BuilderInference @NotNull Function4<? super f<? super R>, ? super T1, ? super T2, ? super Continuation<? super Unit>, ? extends Object> function4) {
        return g.I0(new FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$2(new e[]{eVar, eVar2}, null, function4));
    }

    @NotNull
    public static final <T1, T2, T3, R> e<R> j(@NotNull e<? extends T1> eVar, @NotNull e<? extends T2> eVar2, @NotNull e<? extends T3> eVar3, @BuilderInference @NotNull Function5<? super f<? super R>, ? super T1, ? super T2, ? super T3, ? super Continuation<? super Unit>, ? extends Object> function5) {
        return g.I0(new FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$3(new e[]{eVar, eVar2, eVar3}, null, function5));
    }

    @NotNull
    public static final <T1, T2, T3, T4, R> e<R> k(@NotNull e<? extends T1> eVar, @NotNull e<? extends T2> eVar2, @NotNull e<? extends T3> eVar3, @NotNull e<? extends T4> eVar4, @BuilderInference @NotNull Function6<? super f<? super R>, ? super T1, ? super T2, ? super T3, ? super T4, ? super Continuation<? super Unit>, ? extends Object> function6) {
        return g.I0(new FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$4(new e[]{eVar, eVar2, eVar3, eVar4}, null, function6));
    }

    @NotNull
    public static final <T1, T2, T3, T4, T5, R> e<R> l(@NotNull e<? extends T1> eVar, @NotNull e<? extends T2> eVar2, @NotNull e<? extends T3> eVar3, @NotNull e<? extends T4> eVar4, @NotNull e<? extends T5> eVar5, @BuilderInference @NotNull Function7<? super f<? super R>, ? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super Continuation<? super Unit>, ? extends Object> function7) {
        return g.I0(new FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$5(new e[]{eVar, eVar2, eVar3, eVar4, eVar5}, null, function7));
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: MarkMethodsForInline
        java.lang.IndexOutOfBoundsException: Index: 0
        	at java.base/java.util.Collections$EmptyList.get(Collections.java:4483)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:104)
        	at jadx.core.dex.visitors.MarkMethodsForInline.isSyntheticAccessPattern(MarkMethodsForInline.java:117)
        	at jadx.core.dex.visitors.MarkMethodsForInline.inlineMth(MarkMethodsForInline.java:86)
        	at jadx.core.dex.visitors.MarkMethodsForInline.process(MarkMethodsForInline.java:53)
        	at jadx.core.dex.visitors.MarkMethodsForInline.visit(MarkMethodsForInline.java:37)
        */
    public static final /* synthetic */ <T, R> kotlinx.coroutines.flow.e<R> m(kotlinx.coroutines.flow.e<? extends T>[] r2, @kotlin.BuilderInference kotlin.jvm.functions.Function3<? super kotlinx.coroutines.flow.f<? super R>, ? super T[], ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r3) {
        /*
            kotlin.jvm.internal.Intrinsics.needClassReification()
            kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$6 r0 = new kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$6
            r1 = 0
            r0.<init>(r2, r3, r1)
            kotlinx.coroutines.flow.e r2 = kotlinx.coroutines.flow.g.I0(r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ZipKt.m(kotlinx.coroutines.flow.e[], kotlin.jvm.functions.Function3):kotlinx.coroutines.flow.e");
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: MarkMethodsForInline
        java.lang.IndexOutOfBoundsException: Index: 0
        	at java.base/java.util.Collections$EmptyList.get(Collections.java:4483)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:104)
        	at jadx.core.dex.visitors.MarkMethodsForInline.isSyntheticAccessPattern(MarkMethodsForInline.java:117)
        	at jadx.core.dex.visitors.MarkMethodsForInline.inlineMth(MarkMethodsForInline.java:86)
        	at jadx.core.dex.visitors.MarkMethodsForInline.process(MarkMethodsForInline.java:53)
        	at jadx.core.dex.visitors.MarkMethodsForInline.visit(MarkMethodsForInline.java:37)
        */
    private static final /* synthetic */ <T, R> kotlinx.coroutines.flow.e<R> n(kotlinx.coroutines.flow.e<? extends T>[] r2, @kotlin.BuilderInference kotlin.jvm.functions.Function3<? super kotlinx.coroutines.flow.f<? super R>, ? super T[], ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r3) {
        /*
            kotlin.jvm.internal.Intrinsics.needClassReification()
            kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransformUnsafe$1 r0 = new kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransformUnsafe$1
            r1 = 0
            r0.<init>(r2, r3, r1)
            kotlinx.coroutines.flow.e r2 = kotlinx.coroutines.flow.g.I0(r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ZipKt.n(kotlinx.coroutines.flow.e[], kotlin.jvm.functions.Function3):kotlinx.coroutines.flow.e");
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: MarkMethodsForInline
        java.lang.IndexOutOfBoundsException: Index: 0
        	at java.base/java.util.Collections$EmptyList.get(Collections.java:4483)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:104)
        	at jadx.core.dex.visitors.MarkMethodsForInline.isSyntheticAccessPattern(MarkMethodsForInline.java:117)
        	at jadx.core.dex.visitors.MarkMethodsForInline.inlineMth(MarkMethodsForInline.java:86)
        	at jadx.core.dex.visitors.MarkMethodsForInline.process(MarkMethodsForInline.java:53)
        	at jadx.core.dex.visitors.MarkMethodsForInline.visit(MarkMethodsForInline.java:37)
        */
    private static final /* synthetic */ <T, R> kotlinx.coroutines.flow.e<R> o(kotlinx.coroutines.flow.e<? extends T>[] r1, kotlin.jvm.functions.Function2<? super T[], ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r2) {
        /*
            kotlin.jvm.internal.Intrinsics.needClassReification()
            kotlinx.coroutines.flow.FlowKt__ZipKt$combineUnsafe$$inlined$unsafeFlow$1 r0 = new kotlinx.coroutines.flow.FlowKt__ZipKt$combineUnsafe$$inlined$unsafeFlow$1
            r0.<init>(r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ZipKt.o(kotlinx.coroutines.flow.e[], kotlin.jvm.functions.Function2):kotlinx.coroutines.flow.e");
    }

    @JvmName(name = "flowCombine")
    @NotNull
    public static final <T1, T2, R> e<R> p(@NotNull e<? extends T1> eVar, @NotNull e<? extends T2> eVar2, @NotNull Function3<? super T1, ? super T2, ? super Continuation<? super R>, ? extends Object> function3) {
        return new a(eVar, eVar2, function3);
    }

    @JvmName(name = "flowCombineTransform")
    @NotNull
    public static final <T1, T2, R> e<R> q(@NotNull e<? extends T1> eVar, @NotNull e<? extends T2> eVar2, @BuilderInference @NotNull Function4<? super f<? super R>, ? super T1, ? super T2, ? super Continuation<? super Unit>, ? extends Object> function4) {
        return g.I0(new FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$1(new e[]{eVar, eVar2}, null, function4));
    }

    private static final <T> Function0<T[]> r() {
        return new Function0() { // from class: kotlinx.coroutines.flow.FlowKt__ZipKt$nullArrayFactory$1
            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* renamed from: a */
            public final Void invoke() {
                return null;
            }
        };
    }

    @NotNull
    public static final <T1, T2, R> e<R> s(@NotNull e<? extends T1> eVar, @NotNull e<? extends T2> eVar2, @NotNull Function3<? super T1, ? super T2, ? super Continuation<? super R>, ? extends Object> function3) {
        return CombineKt.b(eVar, eVar2, function3);
    }
}
