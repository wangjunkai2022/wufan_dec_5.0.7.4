package kotlinx.coroutines.sync;

import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.InlineMarker;
import kotlinx.coroutines.internal.o0;
import org.jetbrains.annotations.NotNull;
/* compiled from: Mutex.kt */
/* loaded from: classes7.dex */
public final class MutexKt {
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    private static final o0 f71389a = new o0("LOCK_FAIL");
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    private static final o0 f71390b = new o0("UNLOCK_FAIL");
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    private static final o0 f71391c;
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    private static final o0 f71392d;
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    private static final b f71393e;
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    private static final b f71394f;

    static {
        o0 o0Var = new o0("LOCKED");
        f71391c = o0Var;
        o0 o0Var2 = new o0("UNLOCKED");
        f71392d = o0Var2;
        f71393e = new b(o0Var);
        f71394f = new b(o0Var2);
    }

    @NotNull
    public static final c a(boolean z4) {
        return new MutexImpl(z4);
    }

    public static /* synthetic */ c b(boolean z4, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z4 = false;
        }
        return a(z4);
    }

    private static /* synthetic */ void i() {
    }

    private static /* synthetic */ void j() {
    }

    private static /* synthetic */ void k() {
    }

    private static /* synthetic */ void l() {
    }

    private static /* synthetic */ void m() {
    }

    private static /* synthetic */ void n() {
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object o(@org.jetbrains.annotations.NotNull kotlinx.coroutines.sync.c r4, @org.jetbrains.annotations.Nullable java.lang.Object r5, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<? extends T> r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super T> r7) {
        /*
            boolean r0 = r7 instanceof kotlinx.coroutines.sync.MutexKt$withLock$1
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.sync.MutexKt$withLock$1 r0 = (kotlinx.coroutines.sync.MutexKt$withLock$1) r0
            int r1 = r0.f71399f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f71399f = r1
            goto L18
        L13:
            kotlinx.coroutines.sync.MutexKt$withLock$1 r0 = new kotlinx.coroutines.sync.MutexKt$withLock$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f71398e
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f71399f
            r3 = 1
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r4 = r0.f71397d
            r6 = r4
            kotlin.jvm.functions.Function0 r6 = (kotlin.jvm.functions.Function0) r6
            java.lang.Object r5 = r0.f71396c
            java.lang.Object r4 = r0.f71395b
            kotlinx.coroutines.sync.c r4 = (kotlinx.coroutines.sync.c) r4
            kotlin.ResultKt.throwOnFailure(r7)
            goto L4e
        L34:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3c:
            kotlin.ResultKt.throwOnFailure(r7)
            r0.f71395b = r4
            r0.f71396c = r5
            r0.f71397d = r6
            r0.f71399f = r3
            java.lang.Object r7 = r4.c(r5, r0)
            if (r7 != r1) goto L4e
            return r1
        L4e:
            java.lang.Object r6 = r6.invoke()     // Catch: java.lang.Throwable -> L5c
            kotlin.jvm.internal.InlineMarker.finallyStart(r3)
            r4.d(r5)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r3)
            return r6
        L5c:
            r6 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r3)
            r4.d(r5)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r3)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.sync.MutexKt.o(kotlinx.coroutines.sync.c, java.lang.Object, kotlin.jvm.functions.Function0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private static final <T> Object p(c cVar, Object obj, Function0<? extends T> function0, Continuation<? super T> continuation) {
        InlineMarker.mark(0);
        cVar.c(obj, continuation);
        InlineMarker.mark(1);
        try {
            return function0.invoke();
        } finally {
            InlineMarker.finallyStart(1);
            cVar.d(obj);
            InlineMarker.finallyEnd(1);
        }
    }

    public static /* synthetic */ Object q(c cVar, Object obj, Function0 function0, Continuation continuation, int i4, Object obj2) {
        if ((i4 & 1) != 0) {
            obj = null;
        }
        InlineMarker.mark(0);
        cVar.c(obj, continuation);
        InlineMarker.mark(1);
        try {
            return function0.invoke();
        } finally {
            InlineMarker.finallyStart(1);
            cVar.d(obj);
            InlineMarker.finallyEnd(1);
        }
    }
}
