package kotlinx.coroutines;

import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.internal.ThreadContextKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: CoroutineContext.kt */
/* loaded from: classes6.dex */
public final class j3<T> extends kotlinx.coroutines.internal.k0<T> {
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    private ThreadLocal<Pair<CoroutineContext, Object>> f71190e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public j3(@org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext r3, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super T> r4) {
        /*
            r2 = this;
            kotlinx.coroutines.k3 r0 = kotlinx.coroutines.k3.f71197b
            kotlin.coroutines.CoroutineContext$Element r1 = r3.get(r0)
            if (r1 != 0) goto Lc
            kotlin.coroutines.CoroutineContext r3 = r3.plus(r0)
        Lc:
            r2.<init>(r3, r4)
            java.lang.ThreadLocal r3 = new java.lang.ThreadLocal
            r3.<init>()
            r2.f71190e = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.j3.<init>(kotlin.coroutines.CoroutineContext, kotlin.coroutines.Continuation):void");
    }

    @Override // kotlinx.coroutines.internal.k0, kotlinx.coroutines.a
    protected void s1(@Nullable Object obj) {
        Pair<CoroutineContext, Object> pair = this.f71190e.get();
        if (pair != null) {
            ThreadContextKt.a(pair.component1(), pair.component2());
            this.f71190e.set(null);
        }
        Object a5 = i0.a(obj, this.f71120d);
        Continuation<T> continuation = this.f71120d;
        CoroutineContext context = continuation.getContext();
        Object c5 = ThreadContextKt.c(context, null);
        j3<?> g4 = c5 != ThreadContextKt.f71089a ? CoroutineContextKt.g(continuation, context, c5) : null;
        try {
            this.f71120d.resumeWith(a5);
            Unit unit = Unit.INSTANCE;
        } finally {
            if (g4 == null || g4.y1()) {
                ThreadContextKt.a(context, c5);
            }
        }
    }

    public final boolean y1() {
        if (this.f71190e.get() == null) {
            return false;
        }
        this.f71190e.set(null);
        return true;
    }

    public final void z1(@NotNull CoroutineContext coroutineContext, @Nullable Object obj) {
        this.f71190e.set(TuplesKt.to(coroutineContext, obj));
    }
}
