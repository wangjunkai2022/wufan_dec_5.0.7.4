package kotlinx.coroutines.flow.internal;

import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.r0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: Combine.kt */
/* loaded from: classes6.dex */
public final class CombineKt {

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: SafeCollector.common.kt */
    /* loaded from: classes6.dex */
    public static final class a<R> implements kotlinx.coroutines.flow.e<R> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.e f70920b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.e f70921c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Function3 f70922d;

        public a(kotlinx.coroutines.flow.e eVar, kotlinx.coroutines.flow.e eVar2, Function3 function3) {
            this.f70920b = eVar;
            this.f70921c = eVar2;
            this.f70922d = function3;
        }

        @Override // kotlinx.coroutines.flow.e
        @Nullable
        public Object a(@NotNull kotlinx.coroutines.flow.f<? super R> fVar, @NotNull Continuation<? super Unit> continuation) {
            Object coroutine_suspended;
            Object g4 = r0.g(new CombineKt$zipImpl$1$1(fVar, this.f70920b, this.f70921c, this.f70922d, null), continuation);
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            return g4 == coroutine_suspended ? g4 : Unit.INSTANCE;
        }
    }

    @PublishedApi
    @Nullable
    public static final <R, T> Object a(@NotNull kotlinx.coroutines.flow.f<? super R> fVar, @NotNull kotlinx.coroutines.flow.e<? extends T>[] eVarArr, @NotNull Function0<T[]> function0, @NotNull Function3<? super kotlinx.coroutines.flow.f<? super R>, ? super T[], ? super Continuation<? super Unit>, ? extends Object> function3, @NotNull Continuation<? super Unit> continuation) {
        Object coroutine_suspended;
        Object a5 = FlowCoroutineKt.a(new CombineKt$combineInternal$2(eVarArr, function0, function3, fVar, null), continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return a5 == coroutine_suspended ? a5 : Unit.INSTANCE;
    }

    @NotNull
    public static final <T1, T2, R> kotlinx.coroutines.flow.e<R> b(@NotNull kotlinx.coroutines.flow.e<? extends T1> eVar, @NotNull kotlinx.coroutines.flow.e<? extends T2> eVar2, @NotNull Function3<? super T1, ? super T2, ? super Continuation<? super R>, ? extends Object> function3) {
        return new a(eVar2, eVar, function3);
    }
}
