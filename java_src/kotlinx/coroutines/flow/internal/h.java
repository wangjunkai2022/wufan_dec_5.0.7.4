package kotlinx.coroutines.flow.internal;

import kotlin.PublishedApi;
import org.jetbrains.annotations.NotNull;
/* compiled from: FlowExceptions.common.kt */
/* loaded from: classes6.dex */
public final class h {
    @PublishedApi
    public static final int a(int i4) {
        if (i4 >= 0) {
            return i4;
        }
        throw new ArithmeticException("Index overflow has happened");
    }

    public static final void b(@NotNull AbortFlowException abortFlowException, @NotNull kotlinx.coroutines.flow.f<?> fVar) {
        if (abortFlowException.a() != fVar) {
            throw abortFlowException;
        }
    }
}
