package kotlinx.coroutines;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Builders.common.kt */
/* loaded from: classes6.dex */
public class x2 extends a<Unit> {
    public x2(@NotNull CoroutineContext coroutineContext, boolean z4) {
        super(coroutineContext, true, z4);
    }

    @Override // kotlinx.coroutines.JobSupport
    protected boolean H0(@NotNull Throwable th) {
        n0.b(getContext(), th);
        return true;
    }
}
