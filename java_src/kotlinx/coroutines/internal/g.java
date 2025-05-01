package kotlinx.coroutines.internal;

import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
/* compiled from: ConcurrentLinkedList.kt */
/* loaded from: classes6.dex */
public final class g {

    /* renamed from: a */
    private static final int f71114a = 16;
    @NotNull

    /* renamed from: b */
    private static final o0 f71115b = new o0("CLOSED");

    public static final /* synthetic */ o0 a() {
        return f71115b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [kotlinx.coroutines.internal.h] */
    @NotNull
    public static final <N extends h<N>> N b(@NotNull N n4) {
        while (true) {
            Object e5 = n4.e();
            if (e5 == f71115b) {
                return n4;
            }
            ?? r02 = (h) e5;
            if (r02 != 0) {
                n4 = r02;
            } else if (n4.j()) {
                return n4;
            }
        }
    }

    private static final <S extends l0<S>> Object c(S s4, long j4, Function2<? super Long, ? super S, ? extends S> function2) {
        while (true) {
            if (s4.o() < j4 || s4.g()) {
                Object e5 = s4.e();
                if (e5 == f71115b) {
                    return m0.b(f71115b);
                }
                S s5 = (S) ((h) e5);
                if (s5 == null) {
                    s5 = function2.invoke(Long.valueOf(s4.o() + 1), s4);
                    if (s4.m(s5)) {
                        if (s4.g()) {
                            s4.l();
                        }
                    }
                }
                s4 = s5;
            } else {
                return m0.b(s4);
            }
        }
    }

    private static /* synthetic */ void d() {
    }
}
