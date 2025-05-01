package kotlinx.coroutines.flow;

import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.i;
import kotlinx.coroutines.z1;
import org.jetbrains.annotations.NotNull;
/* compiled from: Context.kt */
/* loaded from: classes.dex */
public final /* synthetic */ class h {
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Since 1.4.0, binary compatibility with earlier versions")
    public static final /* synthetic */ e a(e eVar, int i4) {
        e d5;
        d5 = d(eVar, i4, null, 2, null);
        return d5;
    }

    @NotNull
    public static final <T> e<T> b(@NotNull e<? extends T> eVar, int i4, @NotNull BufferOverflow bufferOverflow) {
        int i5;
        BufferOverflow bufferOverflow2;
        boolean z4 = true;
        if (i4 >= 0 || i4 == -2 || i4 == -1) {
            if (i4 == -1 && bufferOverflow != BufferOverflow.SUSPEND) {
                z4 = false;
            }
            if (z4) {
                if (i4 == -1) {
                    bufferOverflow2 = BufferOverflow.DROP_OLDEST;
                    i5 = 0;
                } else {
                    i5 = i4;
                    bufferOverflow2 = bufferOverflow;
                }
                return eVar instanceof kotlinx.coroutines.flow.internal.i ? i.a.a((kotlinx.coroutines.flow.internal.i) eVar, null, i5, bufferOverflow2, 1, null) : new kotlinx.coroutines.flow.internal.e(eVar, null, i5, bufferOverflow2, 2, null);
            }
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
        }
        throw new IllegalArgumentException(Intrinsics.stringPlus("Buffer size should be non-negative, BUFFERED, or CONFLATED, but was ", Integer.valueOf(i4)).toString());
    }

    public static /* synthetic */ e c(e eVar, int i4, int i5, Object obj) {
        e a5;
        if ((i5 & 1) != 0) {
            i4 = -2;
        }
        a5 = a(eVar, i4);
        return a5;
    }

    public static /* synthetic */ e d(e eVar, int i4, BufferOverflow bufferOverflow, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i4 = -2;
        }
        if ((i5 & 2) != 0) {
            bufferOverflow = BufferOverflow.SUSPEND;
        }
        return g.o(eVar, i4, bufferOverflow);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <T> e<T> e(@NotNull e<? extends T> eVar) {
        return eVar instanceof a ? eVar : new CancellableFlowImpl(eVar);
    }

    private static final void f(CoroutineContext coroutineContext) {
        if (!(coroutineContext.get(z1.f71466g1) == null)) {
            throw new IllegalArgumentException(Intrinsics.stringPlus("Flow context cannot contain job in it. Had ", coroutineContext).toString());
        }
    }

    @NotNull
    public static final <T> e<T> g(@NotNull e<? extends T> eVar) {
        e<T> d5;
        d5 = d(eVar, -1, null, 2, null);
        return d5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <T> e<T> h(@NotNull e<? extends T> eVar, @NotNull CoroutineContext coroutineContext) {
        f(coroutineContext);
        return Intrinsics.areEqual(coroutineContext, EmptyCoroutineContext.INSTANCE) ? eVar : eVar instanceof kotlinx.coroutines.flow.internal.i ? i.a.a((kotlinx.coroutines.flow.internal.i) eVar, coroutineContext, 0, null, 6, null) : new kotlinx.coroutines.flow.internal.e(eVar, coroutineContext, 0, null, 12, null);
    }
}
