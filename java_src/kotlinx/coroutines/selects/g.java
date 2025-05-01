package kotlinx.coroutines.selects;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.InlineMarker;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import kotlinx.coroutines.internal.o0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: Select.kt */
/* loaded from: classes7.dex */
public final class g {
    @NotNull

    /* renamed from: a */
    private static final Object f71362a = new o0("NOT_SELECTED");
    @NotNull

    /* renamed from: b */
    private static final Object f71363b = new o0("ALREADY_SELECTED");
    @NotNull

    /* renamed from: c */
    private static final Object f71364c = new o0("UNDECIDED");
    @NotNull

    /* renamed from: d */
    private static final Object f71365d = new o0("RESUMED");
    @NotNull

    /* renamed from: e */
    private static final i f71366e = new i();

    public static final /* synthetic */ Object a() {
        return f71365d;
    }

    public static final /* synthetic */ i b() {
        return f71366e;
    }

    public static final /* synthetic */ Object c() {
        return f71364c;
    }

    @NotNull
    public static final Object d() {
        return f71363b;
    }

    public static /* synthetic */ void e() {
    }

    @NotNull
    public static final Object f() {
        return f71362a;
    }

    public static /* synthetic */ void g() {
    }

    private static /* synthetic */ void h() {
    }

    private static /* synthetic */ void i() {
    }

    private static /* synthetic */ void j() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ExperimentalCoroutinesApi
    public static final <R> void k(@NotNull a<? super R> aVar, long j4, @NotNull Function1<? super Continuation<? super R>, ? extends Object> function1) {
        aVar.i(DelayKt.e(j4), function1);
    }

    @Nullable
    public static final <R> Object l(@NotNull Function1<? super a<? super R>, Unit> function1, @NotNull Continuation<? super R> continuation) {
        Object coroutine_suspended;
        b bVar = new b(continuation);
        try {
            function1.invoke(bVar);
        } catch (Throwable th) {
            bVar.n0(th);
        }
        Object m02 = bVar.m0();
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (m02 == coroutine_suspended) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return m02;
    }

    private static final <R> Object m(Function1<? super a<? super R>, Unit> function1, Continuation<? super R> continuation) {
        Object coroutine_suspended;
        InlineMarker.mark(0);
        b bVar = new b(continuation);
        try {
            function1.invoke(bVar);
        } catch (Throwable th) {
            bVar.n0(th);
        }
        Object m02 = bVar.m0();
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (m02 == coroutine_suspended) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        InlineMarker.mark(1);
        return m02;
    }
}
