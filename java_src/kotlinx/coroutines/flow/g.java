package kotlinx.coroutines.flow;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.BuilderInference;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.OverloadResolutionByLambdaReturnType;
import kotlin.PublishedApi;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.collections.IndexedValue;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.functions.Function7;
import kotlin.ranges.IntRange;
import kotlin.ranges.LongRange;
import kotlin.sequences.Sequence;
import kotlin.time.Duration;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import kotlinx.coroutines.FlowPreview;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.q0;
import kotlinx.coroutines.z1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* loaded from: classes.dex */
public final class g {
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    public static final String f70866a = "kotlinx.coroutines.flow.defaultConcurrency";

    @Nullable
    public static final <T> Object A(@NotNull e<? extends T> eVar, @NotNull Function2<? super T, ? super Continuation<? super Unit>, ? extends Object> function2, @NotNull Continuation<? super Unit> continuation) {
        return FlowKt__CollectKt.f(eVar, function2, continuation);
    }

    @FlowPreview
    @NotNull
    public static final <T, R> e<R> A0(@NotNull e<? extends T> eVar, @NotNull Function2<? super T, ? super Continuation<? super e<? extends R>>, ? extends Object> function2) {
        return FlowKt__MergeKt.a(eVar, function2);
    }

    @FlowPreview
    @NotNull
    public static final <T> e<T> A1(@NotNull e<? extends T> eVar, long j4) {
        return FlowKt__DelayKt.h(eVar, j4);
    }

    @Nullable
    public static final <T> Object B(@NotNull e<? extends T> eVar, @NotNull Function2<? super T, ? super Continuation<? super Boolean>, ? extends Object> function2, @NotNull Continuation<? super Unit> continuation) {
        return FlowKt__LimitKt.b(eVar, function2, continuation);
    }

    @ExperimentalCoroutinesApi
    @NotNull
    public static final <T, R> e<R> B0(@NotNull e<? extends T> eVar, @BuilderInference @NotNull Function2<? super T, ? super Continuation<? super e<? extends R>>, ? extends Object> function2) {
        return FlowKt__MergeKt.b(eVar, function2);
    }

    @FlowPreview
    @NotNull
    public static final <T> e<T> B1(@NotNull e<? extends T> eVar, long j4) {
        return FlowKt__DelayKt.i(eVar, j4);
    }

    @FlowPreview
    @NotNull
    public static final <T, R> e<R> C0(@NotNull e<? extends T> eVar, int i4, @NotNull Function2<? super T, ? super Continuation<? super e<? extends R>>, ? extends Object> function2) {
        return FlowKt__MergeKt.c(eVar, i4, function2);
    }

    @NotNull
    public static final <T, R> e<R> C1(@NotNull e<? extends T> eVar, R r4, @BuilderInference @NotNull Function3<? super R, ? super T, ? super Continuation<? super R>, ? extends Object> function3) {
        return FlowKt__TransformKt.j(eVar, r4, function3);
    }

    @NotNull
    public static final <T1, T2, R> e<R> D(@NotNull e<? extends T1> eVar, @NotNull e<? extends T2> eVar2, @NotNull Function3<? super T1, ? super T2, ? super Continuation<? super R>, ? extends Object> function3) {
        return FlowKt__ZipKt.c(eVar, eVar2, function3);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Flow has less verbose 'scan' shortcut", replaceWith = @ReplaceWith(expression = "scan(initial, operation)", imports = {}))
    @NotNull
    public static final <T, R> e<R> D1(@NotNull e<? extends T> eVar, R r4, @BuilderInference @NotNull Function3<? super R, ? super T, ? super Continuation<? super R>, ? extends Object> function3) {
        return FlowKt__MigrationKt.B(eVar, r4, function3);
    }

    @NotNull
    public static final <T1, T2, T3, R> e<R> E(@NotNull e<? extends T1> eVar, @NotNull e<? extends T2> eVar2, @NotNull e<? extends T3> eVar3, @BuilderInference @NotNull Function4<? super T1, ? super T2, ? super T3, ? super Continuation<? super R>, ? extends Object> function4) {
        return FlowKt__ZipKt.d(eVar, eVar2, eVar3, function4);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Flow analogue of 'flatten' is 'flattenConcat'", replaceWith = @ReplaceWith(expression = "flattenConcat()", imports = {}))
    @NotNull
    public static final <T> e<T> E0(@NotNull e<? extends e<? extends T>> eVar) {
        return FlowKt__MigrationKt.m(eVar);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "'scanReduce' was renamed to 'runningReduce' to be consistent with Kotlin standard library", replaceWith = @ReplaceWith(expression = "runningReduce(operation)", imports = {}))
    @NotNull
    public static final <T> e<T> E1(@NotNull e<? extends T> eVar, @NotNull Function3<? super T, ? super T, ? super Continuation<? super T>, ? extends Object> function3) {
        return FlowKt__MigrationKt.C(eVar, function3);
    }

    @NotNull
    public static final <T1, T2, T3, T4, R> e<R> F(@NotNull e<? extends T1> eVar, @NotNull e<? extends T2> eVar2, @NotNull e<? extends T3> eVar3, @NotNull e<? extends T4> eVar4, @NotNull Function5<? super T1, ? super T2, ? super T3, ? super T4, ? super Continuation<? super R>, ? extends Object> function5) {
        return FlowKt__ZipKt.e(eVar, eVar2, eVar3, eVar4, function5);
    }

    @FlowPreview
    @NotNull
    public static final <T> e<T> F0(@NotNull e<? extends e<? extends T>> eVar) {
        return FlowKt__MergeKt.e(eVar);
    }

    @NotNull
    public static final <T> n<T> F1(@NotNull e<? extends T> eVar, @NotNull q0 q0Var, @NotNull r rVar, int i4) {
        return FlowKt__ShareKt.g(eVar, q0Var, rVar, i4);
    }

    @NotNull
    public static final <T1, T2, T3, T4, T5, R> e<R> G(@NotNull e<? extends T1> eVar, @NotNull e<? extends T2> eVar2, @NotNull e<? extends T3> eVar3, @NotNull e<? extends T4> eVar4, @NotNull e<? extends T5> eVar5, @NotNull Function6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super Continuation<? super R>, ? extends Object> function6) {
        return FlowKt__ZipKt.f(eVar, eVar2, eVar3, eVar4, eVar5, function6);
    }

    @FlowPreview
    @NotNull
    public static final <T> e<T> G0(@NotNull e<? extends e<? extends T>> eVar, int i4) {
        return FlowKt__MergeKt.f(eVar, i4);
    }

    @Nullable
    public static final <T> Object H1(@NotNull e<? extends T> eVar, @NotNull Continuation<? super T> continuation) {
        return FlowKt__ReduceKt.j(eVar, continuation);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Flow analogue of 'combineLatest' is 'combine'", replaceWith = @ReplaceWith(expression = "this.combine(other, transform)", imports = {}))
    @NotNull
    public static final <T1, T2, R> e<R> I(@NotNull e<? extends T1> eVar, @NotNull e<? extends T2> eVar2, @NotNull Function3<? super T1, ? super T2, ? super Continuation<? super R>, ? extends Object> function3) {
        return FlowKt__MigrationKt.b(eVar, eVar2, function3);
    }

    @NotNull
    public static final <T> e<T> I0(@BuilderInference @NotNull Function2<? super f<? super T>, ? super Continuation<? super Unit>, ? extends Object> function2) {
        return FlowKt__BuildersKt.n(function2);
    }

    @Nullable
    public static final <T> Object I1(@NotNull e<? extends T> eVar, @NotNull Continuation<? super T> continuation) {
        return FlowKt__ReduceKt.k(eVar, continuation);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Flow analogue of 'combineLatest' is 'combine'", replaceWith = @ReplaceWith(expression = "combine(this, other, other2, transform)", imports = {}))
    @NotNull
    public static final <T1, T2, T3, R> e<R> J(@NotNull e<? extends T1> eVar, @NotNull e<? extends T2> eVar2, @NotNull e<? extends T3> eVar3, @NotNull Function4<? super T1, ? super T2, ? super T3, ? super Continuation<? super R>, ? extends Object> function4) {
        return FlowKt__MigrationKt.c(eVar, eVar2, eVar3, function4);
    }

    @JvmName(name = "flowCombine")
    @NotNull
    public static final <T1, T2, R> e<R> J0(@NotNull e<? extends T1> eVar, @NotNull e<? extends T2> eVar2, @NotNull Function3<? super T1, ? super T2, ? super Continuation<? super R>, ? extends Object> function3) {
        return FlowKt__ZipKt.p(eVar, eVar2, function3);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Flow analogue of 'skip' is 'drop'", replaceWith = @ReplaceWith(expression = "drop(count)", imports = {}))
    @NotNull
    public static final <T> e<T> J1(@NotNull e<? extends T> eVar, int i4) {
        return FlowKt__MigrationKt.D(eVar, i4);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Flow analogue of 'combineLatest' is 'combine'", replaceWith = @ReplaceWith(expression = "combine(this, other, other2, other3, transform)", imports = {}))
    @NotNull
    public static final <T1, T2, T3, T4, R> e<R> K(@NotNull e<? extends T1> eVar, @NotNull e<? extends T2> eVar2, @NotNull e<? extends T3> eVar3, @NotNull e<? extends T4> eVar4, @NotNull Function5<? super T1, ? super T2, ? super T3, ? super T4, ? super Continuation<? super R>, ? extends Object> function5) {
        return FlowKt__MigrationKt.d(eVar, eVar2, eVar3, eVar4, function5);
    }

    @JvmName(name = "flowCombineTransform")
    @NotNull
    public static final <T1, T2, R> e<R> K0(@NotNull e<? extends T1> eVar, @NotNull e<? extends T2> eVar2, @BuilderInference @NotNull Function4<? super f<? super R>, ? super T1, ? super T2, ? super Continuation<? super Unit>, ? extends Object> function4) {
        return FlowKt__ZipKt.q(eVar, eVar2, function4);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Flow analogue of 'startWith' is 'onStart'. Use 'onStart { emit(value) }'", replaceWith = @ReplaceWith(expression = "onStart { emit(value) }", imports = {}))
    @NotNull
    public static final <T> e<T> K1(@NotNull e<? extends T> eVar, T t4) {
        return FlowKt__MigrationKt.E(eVar, t4);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Flow analogue of 'combineLatest' is 'combine'", replaceWith = @ReplaceWith(expression = "combine(this, other, other2, other3, transform)", imports = {}))
    @NotNull
    public static final <T1, T2, T3, T4, T5, R> e<R> L(@NotNull e<? extends T1> eVar, @NotNull e<? extends T2> eVar2, @NotNull e<? extends T3> eVar3, @NotNull e<? extends T4> eVar4, @NotNull e<? extends T5> eVar5, @NotNull Function6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super Continuation<? super R>, ? extends Object> function6) {
        return FlowKt__MigrationKt.e(eVar, eVar2, eVar3, eVar4, eVar5, function6);
    }

    @NotNull
    public static final <T> e<T> L0(T t4) {
        return FlowKt__BuildersKt.o(t4);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Flow analogue of 'startWith' is 'onStart'. Use 'onStart { emitAll(other) }'", replaceWith = @ReplaceWith(expression = "onStart { emitAll(other) }", imports = {}))
    @NotNull
    public static final <T> e<T> L1(@NotNull e<? extends T> eVar, @NotNull e<? extends T> eVar2) {
        return FlowKt__MigrationKt.F(eVar, eVar2);
    }

    @NotNull
    public static final <T> e<T> M0(@NotNull T... tArr) {
        return FlowKt__BuildersKt.p(tArr);
    }

    @Nullable
    public static final <T> Object M1(@NotNull e<? extends T> eVar, @NotNull q0 q0Var, @NotNull Continuation<? super u<? extends T>> continuation) {
        return FlowKt__ShareKt.i(eVar, q0Var, continuation);
    }

    @NotNull
    public static final <T1, T2, R> e<R> N(@NotNull e<? extends T1> eVar, @NotNull e<? extends T2> eVar2, @BuilderInference @NotNull Function4<? super f<? super R>, ? super T1, ? super T2, ? super Continuation<? super Unit>, ? extends Object> function4) {
        return FlowKt__ZipKt.i(eVar, eVar2, function4);
    }

    @NotNull
    public static final <T> e<T> N0(@NotNull e<? extends T> eVar, @NotNull CoroutineContext coroutineContext) {
        return h.h(eVar, coroutineContext);
    }

    @NotNull
    public static final <T> u<T> N1(@NotNull e<? extends T> eVar, @NotNull q0 q0Var, @NotNull r rVar, T t4) {
        return FlowKt__ShareKt.j(eVar, q0Var, rVar, t4);
    }

    @NotNull
    public static final <T1, T2, T3, R> e<R> O(@NotNull e<? extends T1> eVar, @NotNull e<? extends T2> eVar2, @NotNull e<? extends T3> eVar3, @BuilderInference @NotNull Function5<? super f<? super R>, ? super T1, ? super T2, ? super T3, ? super Continuation<? super Unit>, ? extends Object> function5) {
        return FlowKt__ZipKt.j(eVar, eVar2, eVar3, function5);
    }

    @Nullable
    public static final <T, R> Object O0(@NotNull e<? extends T> eVar, R r4, @NotNull Function3<? super R, ? super T, ? super Continuation<? super R>, ? extends Object> function3, @NotNull Continuation<? super R> continuation) {
        return FlowKt__ReduceKt.e(eVar, r4, function3, continuation);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Use 'launchIn' with 'onEach', 'onCompletion' and 'catch' instead")
    public static final <T> void O1(@NotNull e<? extends T> eVar) {
        FlowKt__MigrationKt.G(eVar);
    }

    @NotNull
    public static final <T1, T2, T3, T4, R> e<R> P(@NotNull e<? extends T1> eVar, @NotNull e<? extends T2> eVar2, @NotNull e<? extends T3> eVar3, @NotNull e<? extends T4> eVar4, @BuilderInference @NotNull Function6<? super f<? super R>, ? super T1, ? super T2, ? super T3, ? super T4, ? super Continuation<? super Unit>, ? extends Object> function6) {
        return FlowKt__ZipKt.k(eVar, eVar2, eVar3, eVar4, function6);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Flow analogue of 'forEach' is 'collect'", replaceWith = @ReplaceWith(expression = "collect(action)", imports = {}))
    public static final <T> void P0(@NotNull e<? extends T> eVar, @NotNull Function2<? super T, ? super Continuation<? super Unit>, ? extends Object> function2) {
        FlowKt__MigrationKt.n(eVar, function2);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Use 'launchIn' with 'onEach', 'onCompletion' and 'catch' instead")
    public static final <T> void P1(@NotNull e<? extends T> eVar, @NotNull Function2<? super T, ? super Continuation<? super Unit>, ? extends Object> function2) {
        FlowKt__MigrationKt.H(eVar, function2);
    }

    @NotNull
    public static final <T1, T2, T3, T4, T5, R> e<R> Q(@NotNull e<? extends T1> eVar, @NotNull e<? extends T2> eVar2, @NotNull e<? extends T3> eVar3, @NotNull e<? extends T4> eVar4, @NotNull e<? extends T5> eVar5, @BuilderInference @NotNull Function7<? super f<? super R>, ? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super Continuation<? super Unit>, ? extends Object> function7) {
        return FlowKt__ZipKt.l(eVar, eVar2, eVar3, eVar4, eVar5, function7);
    }

    public static final int Q0() {
        return FlowKt__MergeKt.h();
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Use 'launchIn' with 'onEach', 'onCompletion' and 'catch' instead")
    public static final <T> void Q1(@NotNull e<? extends T> eVar, @NotNull Function2<? super T, ? super Continuation<? super Unit>, ? extends Object> function2, @NotNull Function2<? super Throwable, ? super Continuation<? super Unit>, ? extends Object> function22) {
        FlowKt__MigrationKt.I(eVar, function2, function22);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Use 'flowOn' instead")
    @NotNull
    public static final <T> e<T> R1(@NotNull e<? extends T> eVar, @NotNull CoroutineContext coroutineContext) {
        return FlowKt__MigrationKt.J(eVar, coroutineContext);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Flow analogue of 'compose' is 'let'", replaceWith = @ReplaceWith(expression = "let(transformer)", imports = {}))
    @NotNull
    public static final <T, R> e<R> S(@NotNull e<? extends T> eVar, @NotNull Function1<? super e<? extends T>, ? extends e<? extends R>> function1) {
        return FlowKt__MigrationKt.f(eVar, function1);
    }

    @Nullable
    public static final <T> Object S0(@NotNull e<? extends T> eVar, @NotNull Continuation<? super T> continuation) {
        return FlowKt__ReduceKt.g(eVar, continuation);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Flow analogues of 'switchMap' are 'transformLatest', 'flatMapLatest' and 'mapLatest'", replaceWith = @ReplaceWith(expression = "this.flatMapLatest(transform)", imports = {}))
    @NotNull
    public static final <T, R> e<R> S1(@NotNull e<? extends T> eVar, @NotNull Function2<? super T, ? super Continuation<? super e<? extends R>>, ? extends Object> function2) {
        return FlowKt__MigrationKt.K(eVar, function2);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Flow analogue of 'concatMap' is 'flatMapConcat'", replaceWith = @ReplaceWith(expression = "flatMapConcat(mapper)", imports = {}))
    @NotNull
    public static final <T, R> e<R> T(@NotNull e<? extends T> eVar, @NotNull Function1<? super T, ? extends e<? extends R>> function1) {
        return FlowKt__MigrationKt.g(eVar, function1);
    }

    @Nullable
    public static final <T> Object T0(@NotNull e<? extends T> eVar, @NotNull Continuation<? super T> continuation) {
        return FlowKt__ReduceKt.h(eVar, continuation);
    }

    @NotNull
    public static final <T> e<T> T1(@NotNull e<? extends T> eVar, int i4) {
        return FlowKt__LimitKt.g(eVar, i4);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Flow analogue of 'concatWith' is 'onCompletion'. Use 'onCompletion { emit(value) }'", replaceWith = @ReplaceWith(expression = "onCompletion { emit(value) }", imports = {}))
    @NotNull
    public static final <T> e<T> U(@NotNull e<? extends T> eVar, T t4) {
        return FlowKt__MigrationKt.h(eVar, t4);
    }

    @NotNull
    public static final <T> z1 U0(@NotNull e<? extends T> eVar, @NotNull q0 q0Var) {
        return FlowKt__CollectKt.h(eVar, q0Var);
    }

    @NotNull
    public static final <T> e<T> U1(@NotNull e<? extends T> eVar, @NotNull Function2<? super T, ? super Continuation<? super Boolean>, ? extends Object> function2) {
        return FlowKt__LimitKt.h(eVar, function2);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Flow analogue of 'concatWith' is 'onCompletion'. Use 'onCompletion { if (it == null) emitAll(other) }'", replaceWith = @ReplaceWith(expression = "onCompletion { if (it == null) emitAll(other) }", imports = {}))
    @NotNull
    public static final <T> e<T> V(@NotNull e<? extends T> eVar, @NotNull e<? extends T> eVar2) {
        return FlowKt__MigrationKt.i(eVar, eVar2);
    }

    @NotNull
    public static final <T, R> e<R> V0(@NotNull e<? extends T> eVar, @NotNull Function2<? super T, ? super Continuation<? super R>, ? extends Object> function2) {
        return FlowKt__TransformKt.e(eVar, function2);
    }

    @Nullable
    public static final <T, C extends Collection<? super T>> Object V1(@NotNull e<? extends T> eVar, @NotNull C c5, @NotNull Continuation<? super C> continuation) {
        return FlowKt__CollectionKt.a(eVar, c5, continuation);
    }

    @NotNull
    public static final <T> e<T> W(@NotNull e<? extends T> eVar) {
        return h.g(eVar);
    }

    @ExperimentalCoroutinesApi
    @NotNull
    public static final <T, R> e<R> W0(@NotNull e<? extends T> eVar, @BuilderInference @NotNull Function2<? super T, ? super Continuation<? super R>, ? extends Object> function2) {
        return FlowKt__MergeKt.k(eVar, function2);
    }

    @Nullable
    public static final <T> Object W1(@NotNull e<? extends T> eVar, @NotNull List<T> list, @NotNull Continuation<? super List<? extends T>> continuation) {
        return FlowKt__CollectionKt.b(eVar, list, continuation);
    }

    @NotNull
    public static final <T> e<T> X(@NotNull ReceiveChannel<? extends T> receiveChannel) {
        return FlowKt__ChannelsKt.c(receiveChannel);
    }

    @NotNull
    public static final <T, R> e<R> X0(@NotNull e<? extends T> eVar, @NotNull Function2<? super T, ? super Continuation<? super R>, ? extends Object> function2) {
        return FlowKt__TransformKt.f(eVar, function2);
    }

    @Nullable
    public static final <T> Object Y(@NotNull e<? extends T> eVar, @NotNull Continuation<? super Integer> continuation) {
        return FlowKt__CountKt.a(eVar, continuation);
    }

    @NotNull
    public static final <T> e<T> Y0(@NotNull Iterable<? extends e<? extends T>> iterable) {
        return FlowKt__MergeKt.l(iterable);
    }

    @Nullable
    public static final <T> Object Y1(@NotNull e<? extends T> eVar, @NotNull Set<T> set, @NotNull Continuation<? super Set<? extends T>> continuation) {
        return FlowKt__CollectionKt.d(eVar, set, continuation);
    }

    @Nullable
    public static final <T> Object Z(@NotNull e<? extends T> eVar, @NotNull Function2<? super T, ? super Continuation<? super Boolean>, ? extends Object> function2, @NotNull Continuation<? super Integer> continuation) {
        return FlowKt__CountKt.b(eVar, function2, continuation);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Flow analogue of 'merge' is 'flattenConcat'", replaceWith = @ReplaceWith(expression = "flattenConcat()", imports = {}))
    @NotNull
    public static final <T> e<T> Z0(@NotNull e<? extends e<? extends T>> eVar) {
        return FlowKt__MigrationKt.o(eVar);
    }

    @NotNull
    public static final <T> e<T> a(@NotNull Iterable<? extends T> iterable) {
        return FlowKt__BuildersKt.a(iterable);
    }

    @FlowPreview
    @NotNull
    public static final <T> e<T> a0(@NotNull e<? extends T> eVar, long j4) {
        return FlowKt__DelayKt.a(eVar, j4);
    }

    @NotNull
    public static final <T> e<T> a1(@NotNull e<? extends T>... eVarArr) {
        return FlowKt__MergeKt.m(eVarArr);
    }

    @NotNull
    public static final <T, R> e<R> a2(@NotNull e<? extends T> eVar, @BuilderInference @NotNull Function3<? super f<? super R>, ? super T, ? super Continuation<? super Unit>, ? extends Object> function3) {
        return FlowKt__EmittersKt.g(eVar, function3);
    }

    @NotNull
    public static final <T> e<T> b(@NotNull Iterator<? extends T> it2) {
        return FlowKt__BuildersKt.b(it2);
    }

    @FlowPreview
    @OverloadResolutionByLambdaReturnType
    @NotNull
    public static final <T> e<T> b0(@NotNull e<? extends T> eVar, @NotNull Function1<? super T, Long> function1) {
        return FlowKt__DelayKt.b(eVar, function1);
    }

    @NotNull
    public static final Void b1() {
        return FlowKt__MigrationKt.p();
    }

    @ExperimentalCoroutinesApi
    @NotNull
    public static final <T, R> e<R> b2(@NotNull e<? extends T> eVar, @BuilderInference @NotNull Function3<? super f<? super R>, ? super T, ? super Continuation<? super Unit>, ? extends Object> function3) {
        return FlowKt__MergeKt.n(eVar, function3);
    }

    @FlowPreview
    @NotNull
    public static final <T> e<T> c(@NotNull Function0<? extends T> function0) {
        return FlowKt__BuildersKt.c(function0);
    }

    @FlowPreview
    @NotNull
    public static final <T> e<T> c0(@NotNull e<? extends T> eVar, long j4) {
        return FlowKt__DelayKt.c(eVar, j4);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Collect flow in the desired context instead")
    @NotNull
    public static final <T> e<T> c1(@NotNull e<? extends T> eVar, @NotNull CoroutineContext coroutineContext) {
        return FlowKt__MigrationKt.q(eVar, coroutineContext);
    }

    @NotNull
    public static final <T, R> e<R> c2(@NotNull e<? extends T> eVar, @BuilderInference @NotNull Function3<? super f<? super R>, ? super T, ? super Continuation<? super Boolean>, ? extends Object> function3) {
        return FlowKt__LimitKt.i(eVar, function3);
    }

    @FlowPreview
    @NotNull
    public static final <T> e<T> d(@NotNull Function1<? super Continuation<? super T>, ? extends Object> function1) {
        return FlowKt__BuildersKt.d(function1);
    }

    @FlowPreview
    @JvmName(name = "debounceDuration")
    @NotNull
    @OverloadResolutionByLambdaReturnType
    public static final <T> e<T> d0(@NotNull e<? extends T> eVar, @NotNull Function1<? super T, Duration> function1) {
        return FlowKt__DelayKt.d(eVar, function1);
    }

    @NotNull
    public static final <T> e<T> d1(@NotNull e<? extends T> eVar, @NotNull Function3<? super f<? super T>, ? super Throwable, ? super Continuation<? super Unit>, ? extends Object> function3) {
        return FlowKt__EmittersKt.d(eVar, function3);
    }

    @PublishedApi
    @NotNull
    public static final <T, R> e<R> d2(@NotNull e<? extends T> eVar, @BuilderInference @NotNull Function3<? super f<? super R>, ? super T, ? super Continuation<? super Unit>, ? extends Object> function3) {
        return FlowKt__EmittersKt.h(eVar, function3);
    }

    @NotNull
    public static final e<Integer> e(@NotNull IntRange intRange) {
        return FlowKt__BuildersKt.e(intRange);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Use 'onEach { delay(timeMillis) }'", replaceWith = @ReplaceWith(expression = "onEach { delay(timeMillis) }", imports = {}))
    @NotNull
    public static final <T> e<T> e0(@NotNull e<? extends T> eVar, long j4) {
        return FlowKt__MigrationKt.j(eVar, j4);
    }

    @NotNull
    public static final <T> e<T> e1(@NotNull e<? extends T> eVar, @NotNull Function2<? super T, ? super Continuation<? super Unit>, ? extends Object> function2) {
        return FlowKt__TransformKt.g(eVar, function2);
    }

    @NotNull
    public static final <T> e<IndexedValue<T>> e2(@NotNull e<? extends T> eVar) {
        return FlowKt__TransformKt.k(eVar);
    }

    @NotNull
    public static final e<Long> f(@NotNull LongRange longRange) {
        return FlowKt__BuildersKt.f(longRange);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Use 'onStart { delay(timeMillis) }'", replaceWith = @ReplaceWith(expression = "onStart { delay(timeMillis) }", imports = {}))
    @NotNull
    public static final <T> e<T> f0(@NotNull e<? extends T> eVar, long j4) {
        return FlowKt__MigrationKt.k(eVar, j4);
    }

    @NotNull
    public static final <T> e<T> f1(@NotNull e<? extends T> eVar, @NotNull Function2<? super f<? super T>, ? super Continuation<? super Unit>, ? extends Object> function2) {
        return FlowKt__EmittersKt.e(eVar, function2);
    }

    @NotNull
    public static final <T1, T2, R> e<R> f2(@NotNull e<? extends T1> eVar, @NotNull e<? extends T2> eVar2, @NotNull Function3<? super T1, ? super T2, ? super Continuation<? super R>, ? extends Object> function3) {
        return FlowKt__ZipKt.s(eVar, eVar2, function3);
    }

    @NotNull
    public static final <T> e<T> g(@NotNull Sequence<? extends T> sequence) {
        return FlowKt__BuildersKt.g(sequence);
    }

    @NotNull
    public static final <T> e<T> g0(@NotNull e<? extends T> eVar) {
        return FlowKt__DistinctKt.a(eVar);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Flow analogue of 'onErrorXxx' is 'catch'. Use 'catch { emitAll(fallback) }'", replaceWith = @ReplaceWith(expression = "catch { emitAll(fallback) }", imports = {}))
    @NotNull
    public static final <T> e<T> g1(@NotNull e<? extends T> eVar, @NotNull e<? extends T> eVar2) {
        return FlowKt__MigrationKt.r(eVar, eVar2);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "'BroadcastChannel' is obsolete and all corresponding operators are deprecated in the favour of StateFlow and SharedFlow")
    @NotNull
    public static final <T> e<T> h(@NotNull kotlinx.coroutines.channels.h<T> hVar) {
        return FlowKt__ChannelsKt.b(hVar);
    }

    @NotNull
    public static final <T> e<T> h0(@NotNull e<? extends T> eVar, @NotNull Function2<? super T, ? super T, Boolean> function2) {
        return FlowKt__DistinctKt.b(eVar, function2);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Flow analogue of 'onErrorXxx' is 'catch'. Use 'catch { emitAll(fallback) }'", replaceWith = @ReplaceWith(expression = "catch { emitAll(fallback) }", imports = {}))
    @NotNull
    public static final <T> e<T> h1(@NotNull e<? extends T> eVar, @NotNull e<? extends T> eVar2) {
        return FlowKt__MigrationKt.s(eVar, eVar2);
    }

    @NotNull
    public static final e<Integer> i(@NotNull int[] iArr) {
        return FlowKt__BuildersKt.h(iArr);
    }

    @NotNull
    public static final <T, K> e<T> i0(@NotNull e<? extends T> eVar, @NotNull Function1<? super T, ? extends K> function1) {
        return FlowKt__DistinctKt.c(eVar, function1);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Flow analogue of 'onErrorXxx' is 'catch'. Use 'catch { emit(fallback) }'", replaceWith = @ReplaceWith(expression = "catch { emit(fallback) }", imports = {}))
    @NotNull
    public static final <T> e<T> i1(@NotNull e<? extends T> eVar, T t4) {
        return FlowKt__MigrationKt.t(eVar, t4);
    }

    @NotNull
    public static final e<Long> j(@NotNull long[] jArr) {
        return FlowKt__BuildersKt.i(jArr);
    }

    @NotNull
    public static final <T> e<T> j0(@NotNull e<? extends T> eVar, int i4) {
        return FlowKt__LimitKt.d(eVar, i4);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Flow analogue of 'onErrorXxx' is 'catch'. Use 'catch { e -> if (predicate(e)) emit(fallback) else throw e }'", replaceWith = @ReplaceWith(expression = "catch { e -> if (predicate(e)) emit(fallback) else throw e }", imports = {}))
    @NotNull
    public static final <T> e<T> j1(@NotNull e<? extends T> eVar, T t4, @NotNull Function1<? super Throwable, Boolean> function1) {
        return FlowKt__MigrationKt.u(eVar, t4, function1);
    }

    @NotNull
    public static final <T> e<T> k(@NotNull T[] tArr) {
        return FlowKt__BuildersKt.j(tArr);
    }

    @NotNull
    public static final <T> e<T> k0(@NotNull e<? extends T> eVar, @NotNull Function2<? super T, ? super Continuation<? super Boolean>, ? extends Object> function2) {
        return FlowKt__LimitKt.e(eVar, function2);
    }

    @NotNull
    public static final <T> n<T> l(@NotNull i<T> iVar) {
        return FlowKt__ShareKt.a(iVar);
    }

    @Nullable
    public static final <T> Object l0(@NotNull f<? super T> fVar, @NotNull ReceiveChannel<? extends T> receiveChannel, @NotNull Continuation<? super Unit> continuation) {
        return FlowKt__ChannelsKt.d(fVar, receiveChannel, continuation);
    }

    @NotNull
    public static final <T> e<T> l1(@NotNull e<? extends T> eVar, @NotNull Function2<? super f<? super T>, ? super Continuation<? super Unit>, ? extends Object> function2) {
        return FlowKt__EmittersKt.f(eVar, function2);
    }

    @NotNull
    public static final <T> u<T> m(@NotNull j<T> jVar) {
        return FlowKt__ShareKt.b(jVar);
    }

    @Nullable
    public static final <T> Object m0(@NotNull f<? super T> fVar, @NotNull e<? extends T> eVar, @NotNull Continuation<? super Unit> continuation) {
        return FlowKt__CollectKt.g(fVar, eVar, continuation);
    }

    @NotNull
    public static final <T> n<T> m1(@NotNull n<? extends T> nVar, @NotNull Function2<? super f<? super T>, ? super Continuation<? super Unit>, ? extends Object> function2) {
        return FlowKt__ShareKt.f(nVar, function2);
    }

    @NotNull
    public static final <T> e<T> n0() {
        return FlowKt__BuildersKt.m();
    }

    @FlowPreview
    @NotNull
    public static final <T> ReceiveChannel<T> n1(@NotNull e<? extends T> eVar, @NotNull q0 q0Var) {
        return FlowKt__ChannelsKt.f(eVar, q0Var);
    }

    @NotNull
    public static final <T> e<T> o(@NotNull e<? extends T> eVar, int i4, @NotNull BufferOverflow bufferOverflow) {
        return h.b(eVar, i4, bufferOverflow);
    }

    public static final void o0(@NotNull f<?> fVar) {
        FlowKt__EmittersKt.b(fVar);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Flow analogue of 'publish()' is 'shareIn'. \npublish().connect() is the default strategy (no extra call is needed), \npublish().autoConnect() translates to 'started = SharingStared.Lazily' argument, \npublish().refCount() translates to 'started = SharingStared.WhileSubscribed()' argument.", replaceWith = @ReplaceWith(expression = "this.shareIn(scope, 0)", imports = {}))
    @NotNull
    public static final <T> e<T> o1(@NotNull e<? extends T> eVar) {
        return FlowKt__MigrationKt.w(eVar);
    }

    @NotNull
    public static final <T> e<T> p0(@NotNull e<? extends T> eVar, @NotNull Function2<? super T, ? super Continuation<? super Boolean>, ? extends Object> function2) {
        return FlowKt__TransformKt.a(eVar, function2);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Flow analogue of 'publish(bufferSize)' is 'buffer' followed by 'shareIn'. \npublish().connect() is the default strategy (no extra call is needed), \npublish().autoConnect() translates to 'started = SharingStared.Lazily' argument, \npublish().refCount() translates to 'started = SharingStared.WhileSubscribed()' argument.", replaceWith = @ReplaceWith(expression = "this.buffer(bufferSize).shareIn(scope, 0)", imports = {}))
    @NotNull
    public static final <T> e<T> p1(@NotNull e<? extends T> eVar, int i4) {
        return FlowKt__MigrationKt.x(eVar, i4);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Collect flow in the desired context instead")
    @NotNull
    public static final <T> e<T> q1(@NotNull e<? extends T> eVar, @NotNull CoroutineContext coroutineContext) {
        return FlowKt__MigrationKt.y(eVar, coroutineContext);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Flow analogue of 'cache()' is 'shareIn' with unlimited replay and 'started = SharingStared.Lazily' argument'", replaceWith = @ReplaceWith(expression = "this.shareIn(scope, Int.MAX_VALUE, started = SharingStared.Lazily)", imports = {}))
    @NotNull
    public static final <T> e<T> r(@NotNull e<? extends T> eVar) {
        return FlowKt__MigrationKt.a(eVar);
    }

    @NotNull
    public static final <T> e<T> r0(@NotNull e<? extends T> eVar, @NotNull Function2<? super T, ? super Continuation<? super Boolean>, ? extends Object> function2) {
        return FlowKt__TransformKt.c(eVar, function2);
    }

    @NotNull
    public static final <T> e<T> r1(@NotNull ReceiveChannel<? extends T> receiveChannel) {
        return FlowKt__ChannelsKt.g(receiveChannel);
    }

    @NotNull
    public static final <T> e<T> s(@BuilderInference @NotNull Function2<? super kotlinx.coroutines.channels.w<? super T>, ? super Continuation<? super Unit>, ? extends Object> function2) {
        return FlowKt__BuildersKt.k(function2);
    }

    @NotNull
    public static final <T> e<T> s0(@NotNull e<? extends T> eVar) {
        return FlowKt__TransformKt.d(eVar);
    }

    @Nullable
    public static final <S, T extends S> Object s1(@NotNull e<? extends T> eVar, @NotNull Function3<? super S, ? super T, ? super Continuation<? super S>, ? extends Object> function3, @NotNull Continuation<? super S> continuation) {
        return FlowKt__ReduceKt.i(eVar, function3, continuation);
    }

    @NotNull
    public static final <T> e<T> t(@NotNull e<? extends T> eVar) {
        return h.e(eVar);
    }

    @Nullable
    public static final <T> Object t0(@NotNull e<? extends T> eVar, @NotNull Continuation<? super T> continuation) {
        return FlowKt__ReduceKt.a(eVar, continuation);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Flow analogue of 'replay()' is 'shareIn' with unlimited replay. \nreplay().connect() is the default strategy (no extra call is needed), \nreplay().autoConnect() translates to 'started = SharingStared.Lazily' argument, \nreplay().refCount() translates to 'started = SharingStared.WhileSubscribed()' argument.", replaceWith = @ReplaceWith(expression = "this.shareIn(scope, Int.MAX_VALUE)", imports = {}))
    @NotNull
    public static final <T> e<T> t1(@NotNull e<? extends T> eVar) {
        return FlowKt__MigrationKt.z(eVar);
    }

    @NotNull
    public static final <T> e<T> u(@NotNull e<? extends T> eVar, @NotNull Function3<? super f<? super T>, ? super Throwable, ? super Continuation<? super Unit>, ? extends Object> function3) {
        return FlowKt__ErrorsKt.a(eVar, function3);
    }

    @Nullable
    public static final <T> Object u0(@NotNull e<? extends T> eVar, @NotNull Function2<? super T, ? super Continuation<? super Boolean>, ? extends Object> function2, @NotNull Continuation<? super T> continuation) {
        return FlowKt__ReduceKt.b(eVar, function2, continuation);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Flow analogue of 'replay(bufferSize)' is 'shareIn' with the specified replay parameter. \nreplay().connect() is the default strategy (no extra call is needed), \nreplay().autoConnect() translates to 'started = SharingStared.Lazily' argument, \nreplay().refCount() translates to 'started = SharingStared.WhileSubscribed()' argument.", replaceWith = @ReplaceWith(expression = "this.shareIn(scope, bufferSize)", imports = {}))
    @NotNull
    public static final <T> e<T> u1(@NotNull e<? extends T> eVar, int i4) {
        return FlowKt__MigrationKt.A(eVar, i4);
    }

    @Nullable
    public static final <T> Object v(@NotNull e<? extends T> eVar, @NotNull f<? super T> fVar, @NotNull Continuation<? super Throwable> continuation) {
        return FlowKt__ErrorsKt.b(eVar, fVar, continuation);
    }

    @Nullable
    public static final <T> Object v0(@NotNull e<? extends T> eVar, @NotNull Continuation<? super T> continuation) {
        return FlowKt__ReduceKt.c(eVar, continuation);
    }

    @NotNull
    public static final <T> e<T> v1(@NotNull e<? extends T> eVar, long j4, @NotNull Function2<? super Throwable, ? super Continuation<? super Boolean>, ? extends Object> function2) {
        return FlowKt__ErrorsKt.e(eVar, j4, function2);
    }

    @NotNull
    public static final <T> e<T> w(@BuilderInference @NotNull Function2<? super kotlinx.coroutines.channels.w<? super T>, ? super Continuation<? super Unit>, ? extends Object> function2) {
        return FlowKt__BuildersKt.l(function2);
    }

    @Nullable
    public static final <T> Object w0(@NotNull e<? extends T> eVar, @NotNull Function2<? super T, ? super Continuation<? super Boolean>, ? extends Object> function2, @NotNull Continuation<? super T> continuation) {
        return FlowKt__ReduceKt.d(eVar, function2, continuation);
    }

    @Nullable
    public static final Object x(@NotNull e<?> eVar, @NotNull Continuation<? super Unit> continuation) {
        return FlowKt__CollectKt.a(eVar, continuation);
    }

    @NotNull
    public static final ReceiveChannel<Unit> x0(@NotNull q0 q0Var, long j4, long j5) {
        return FlowKt__DelayKt.f(q0Var, j4, j5);
    }

    @NotNull
    public static final <T> e<T> x1(@NotNull e<? extends T> eVar, @NotNull Function4<? super f<? super T>, ? super Throwable, ? super Long, ? super Continuation<? super Boolean>, ? extends Object> function4) {
        return FlowKt__ErrorsKt.g(eVar, function4);
    }

    @NotNull
    public static final <T, R> e<R> y1(@NotNull e<? extends T> eVar, R r4, @BuilderInference @NotNull Function3<? super R, ? super T, ? super Continuation<? super R>, ? extends Object> function3) {
        return FlowKt__TransformKt.h(eVar, r4, function3);
    }

    @Nullable
    public static final <T> Object z(@NotNull e<? extends T> eVar, @NotNull Function3<? super Integer, ? super T, ? super Continuation<? super Unit>, ? extends Object> function3, @NotNull Continuation<? super Unit> continuation) {
        return FlowKt__CollectKt.d(eVar, function3, continuation);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Flow analogue is 'flatMapConcat'", replaceWith = @ReplaceWith(expression = "flatMapConcat(mapper)", imports = {}))
    @NotNull
    public static final <T, R> e<R> z0(@NotNull e<? extends T> eVar, @NotNull Function2<? super T, ? super Continuation<? super e<? extends R>>, ? extends Object> function2) {
        return FlowKt__MigrationKt.l(eVar, function2);
    }

    @NotNull
    public static final <T> e<T> z1(@NotNull e<? extends T> eVar, @NotNull Function3<? super T, ? super T, ? super Continuation<? super T>, ? extends Object> function3) {
        return FlowKt__TransformKt.i(eVar, function3);
    }
}
