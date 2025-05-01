package kotlinx.coroutines.flow;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.internal.o0;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
/* compiled from: StateFlow.kt */
/* loaded from: classes6.dex */
public final class v {
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    private static final o0 f71035a = new o0("NONE");
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    private static final o0 f71036b = new o0("PENDING");

    @NotNull
    public static final <T> j<T> a(T t4) {
        if (t4 == null) {
            t4 = (T) kotlinx.coroutines.flow.internal.l.f71013a;
        }
        return new StateFlowImpl(t4);
    }

    @NotNull
    public static final <T> e<T> d(@NotNull u<? extends T> uVar, @NotNull CoroutineContext coroutineContext, int i4, @NotNull BufferOverflow bufferOverflow) {
        boolean z4 = true;
        if (s0.b()) {
            if (!(i4 != -1)) {
                throw new AssertionError();
            }
        }
        return ((((i4 < 0 || i4 >= 2) ? false : false) || i4 == -2) && bufferOverflow == BufferOverflow.DROP_OLDEST) ? uVar : o.e(uVar, coroutineContext, i4, bufferOverflow);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [T, java.lang.Object] */
    public static final <T> T e(@NotNull j<T> jVar, @NotNull Function1<? super T, ? extends T> function1) {
        ?? r02;
        do {
            r02 = (Object) jVar.getValue();
        } while (!jVar.compareAndSet(r02, function1.invoke(r02)));
        return r02;
    }

    private static /* synthetic */ void f() {
    }

    private static /* synthetic */ void g() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> T h(@NotNull j<T> jVar, @NotNull Function1<? super T, ? extends T> function1) {
        Object obj;
        T invoke;
        do {
            obj = (Object) jVar.getValue();
            invoke = function1.invoke(obj);
        } while (!jVar.compareAndSet(obj, invoke));
        return invoke;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> void update(@NotNull j<T> jVar, @NotNull Function1<? super T, ? extends T> function1) {
        Object obj;
        do {
            obj = (Object) jVar.getValue();
        } while (!jVar.compareAndSet(obj, function1.invoke(obj)));
    }
}
