package kotlinx.coroutines.flow;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.a0;
import kotlinx.coroutines.q0;
import kotlinx.coroutines.y;
import kotlinx.coroutines.z1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: Share.kt */
/* loaded from: classes6.dex */
public final /* synthetic */ class FlowKt__ShareKt {
    @NotNull
    public static final <T> n<T> a(@NotNull i<T> iVar) {
        return new k(iVar, null);
    }

    @NotNull
    public static final <T> u<T> b(@NotNull j<T> jVar) {
        return new l(jVar, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0047, code lost:
        if (r9 == 0) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final <T> kotlinx.coroutines.flow.q<T> c(kotlinx.coroutines.flow.e<? extends T> r8, int r9) {
        /*
            boolean r0 = kotlinx.coroutines.s0.b()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L16
            if (r9 < 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            if (r0 == 0) goto L10
            goto L16
        L10:
            java.lang.AssertionError r8 = new java.lang.AssertionError
            r8.<init>()
            throw r8
        L16:
            kotlinx.coroutines.channels.k$b r0 = kotlinx.coroutines.channels.k.f69974h1
            int r0 = r0.a()
            int r0 = kotlin.ranges.RangesKt.coerceAtLeast(r9, r0)
            int r0 = r0 - r9
            boolean r3 = r8 instanceof kotlinx.coroutines.flow.internal.ChannelFlow
            if (r3 == 0) goto L53
            r3 = r8
            kotlinx.coroutines.flow.internal.ChannelFlow r3 = (kotlinx.coroutines.flow.internal.ChannelFlow) r3
            kotlinx.coroutines.flow.e r4 = r3.k()
            if (r4 == 0) goto L53
            kotlinx.coroutines.flow.q r8 = new kotlinx.coroutines.flow.q
            int r5 = r3.f70869c
            r6 = -3
            if (r5 == r6) goto L3c
            r6 = -2
            if (r5 == r6) goto L3c
            if (r5 == 0) goto L3c
            r1 = r5
            goto L4b
        L3c:
            kotlinx.coroutines.channels.BufferOverflow r6 = r3.f70870d
            kotlinx.coroutines.channels.BufferOverflow r7 = kotlinx.coroutines.channels.BufferOverflow.SUSPEND
            if (r6 != r7) goto L47
            if (r5 != 0) goto L45
            goto L4a
        L45:
            r1 = r0
            goto L4b
        L47:
            if (r9 != 0) goto L4a
            goto L4b
        L4a:
            r1 = 0
        L4b:
            kotlinx.coroutines.channels.BufferOverflow r9 = r3.f70870d
            kotlin.coroutines.CoroutineContext r0 = r3.f70868b
            r8.<init>(r4, r1, r9, r0)
            return r8
        L53:
            kotlinx.coroutines.flow.q r9 = new kotlinx.coroutines.flow.q
            kotlinx.coroutines.channels.BufferOverflow r1 = kotlinx.coroutines.channels.BufferOverflow.SUSPEND
            kotlin.coroutines.EmptyCoroutineContext r2 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
            r9.<init>(r8, r0, r1, r2)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ShareKt.c(kotlinx.coroutines.flow.e, int):kotlinx.coroutines.flow.q");
    }

    private static final <T> z1 d(q0 q0Var, CoroutineContext coroutineContext, e<? extends T> eVar, i<T> iVar, r rVar, T t4) {
        return kotlinx.coroutines.i.d(q0Var, coroutineContext, Intrinsics.areEqual(rVar, r.f71031a.c()) ? CoroutineStart.DEFAULT : CoroutineStart.UNDISPATCHED, new FlowKt__ShareKt$launchSharing$1(rVar, eVar, iVar, t4, null));
    }

    private static final <T> void e(q0 q0Var, CoroutineContext coroutineContext, e<? extends T> eVar, y<u<T>> yVar) {
        kotlinx.coroutines.k.f(q0Var, coroutineContext, null, new FlowKt__ShareKt$launchSharingDeferred$1(eVar, yVar, null), 2, null);
    }

    @NotNull
    public static final <T> n<T> f(@NotNull n<? extends T> nVar, @NotNull Function2<? super f<? super T>, ? super Continuation<? super Unit>, ? extends Object> function2) {
        return new SubscribedSharedFlow(nVar, function2);
    }

    @NotNull
    public static final <T> n<T> g(@NotNull e<? extends T> eVar, @NotNull q0 q0Var, @NotNull r rVar, int i4) {
        q c5 = c(eVar, i4);
        i a5 = o.a(i4, c5.f71028b, c5.f71029c);
        return new k(a5, d(q0Var, c5.f71030d, c5.f71027a, a5, rVar, o.f71024a));
    }

    public static /* synthetic */ n h(e eVar, q0 q0Var, r rVar, int i4, int i5, Object obj) {
        if ((i5 & 4) != 0) {
            i4 = 0;
        }
        return g.F1(eVar, q0Var, rVar, i4);
    }

    @Nullable
    public static final <T> Object i(@NotNull e<? extends T> eVar, @NotNull q0 q0Var, @NotNull Continuation<? super u<? extends T>> continuation) {
        q c5 = c(eVar, 1);
        y c6 = a0.c(null, 1, null);
        e(q0Var, c5.f71030d, c5.f71027a, c6);
        return c6.t(continuation);
    }

    @NotNull
    public static final <T> u<T> j(@NotNull e<? extends T> eVar, @NotNull q0 q0Var, @NotNull r rVar, T t4) {
        q c5 = c(eVar, 1);
        j a5 = v.a(t4);
        return new l(a5, d(q0Var, c5.f71030d, c5.f71027a, a5, rVar, t4));
    }
}
