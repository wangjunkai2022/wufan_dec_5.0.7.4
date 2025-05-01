package kotlinx.coroutines.flow.internal;

import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.u;
import org.jetbrains.annotations.NotNull;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AbstractSharedFlow.kt */
/* loaded from: classes6.dex */
public final class o extends SharedFlowImpl<Integer> implements u<Integer> {
    public o(int i4) {
        super(1, Integer.MAX_VALUE, BufferOverflow.DROP_OLDEST);
        b(Integer.valueOf(i4));
    }

    @Override // kotlinx.coroutines.flow.u
    @NotNull
    /* renamed from: e0 */
    public Integer getValue() {
        Integer valueOf;
        synchronized (this) {
            valueOf = Integer.valueOf(Q().intValue());
        }
        return valueOf;
    }

    public final boolean f0(int i4) {
        boolean b5;
        synchronized (this) {
            b5 = b(Integer.valueOf(Q().intValue() + i4));
        }
        return b5;
    }
}
