package kotlinx.coroutines.flow;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.internal.o0;
import org.jetbrains.annotations.NotNull;
/* compiled from: SharedFlow.kt */
/* loaded from: classes6.dex */
public final class o {
    @JvmField
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    public static final o0 f71024a = new o0("NO_VALUE");

    @NotNull
    public static final <T> i<T> a(int i4, int i5, @NotNull BufferOverflow bufferOverflow) {
        boolean z4 = true;
        if (i4 >= 0) {
            if (i5 >= 0) {
                if (i4 <= 0 && i5 <= 0 && bufferOverflow != BufferOverflow.SUSPEND) {
                    z4 = false;
                }
                if (z4) {
                    int i6 = i5 + i4;
                    if (i6 < 0) {
                        i6 = Integer.MAX_VALUE;
                    }
                    return new SharedFlowImpl(i4, i6, bufferOverflow);
                }
                throw new IllegalArgumentException(Intrinsics.stringPlus("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy ", bufferOverflow).toString());
            }
            throw new IllegalArgumentException(Intrinsics.stringPlus("extraBufferCapacity cannot be negative, but was ", Integer.valueOf(i5)).toString());
        }
        throw new IllegalArgumentException(Intrinsics.stringPlus("replay cannot be negative, but was ", Integer.valueOf(i4)).toString());
    }

    public static /* synthetic */ i b(int i4, int i5, BufferOverflow bufferOverflow, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i4 = 0;
        }
        if ((i6 & 2) != 0) {
            i5 = 0;
        }
        if ((i6 & 4) != 0) {
            bufferOverflow = BufferOverflow.SUSPEND;
        }
        return a(i4, i5, bufferOverflow);
    }

    public static final /* synthetic */ Object c(Object[] objArr, long j4) {
        return f(objArr, j4);
    }

    public static final /* synthetic */ void d(Object[] objArr, long j4, Object obj) {
        h(objArr, j4, obj);
    }

    @NotNull
    public static final <T> e<T> e(@NotNull n<? extends T> nVar, @NotNull CoroutineContext coroutineContext, int i4, @NotNull BufferOverflow bufferOverflow) {
        return ((i4 == 0 || i4 == -3) && bufferOverflow == BufferOverflow.SUSPEND) ? nVar : new kotlinx.coroutines.flow.internal.e(nVar, coroutineContext, i4, bufferOverflow);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object f(Object[] objArr, long j4) {
        return objArr[(objArr.length - 1) & ((int) j4)];
    }

    public static /* synthetic */ void g() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(Object[] objArr, long j4, Object obj) {
        objArr[(objArr.length - 1) & ((int) j4)] = obj;
    }
}
