package kotlinx.coroutines.channels;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.channels.b0;
import kotlinx.coroutines.n0;
import org.jetbrains.annotations.NotNull;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Produce.kt */
/* loaded from: classes6.dex */
public final class v<E> extends l<E> implements w<E> {
    public v(@NotNull CoroutineContext coroutineContext, @NotNull k<E> kVar) {
        super(coroutineContext, kVar, true, true);
    }

    @Override // kotlinx.coroutines.channels.w
    public /* bridge */ /* synthetic */ b0 getChannel() {
        return getChannel();
    }

    @Override // kotlinx.coroutines.a, kotlinx.coroutines.JobSupport, kotlinx.coroutines.z1
    public boolean isActive() {
        return super.isActive();
    }

    @Override // kotlinx.coroutines.a
    protected void u1(@NotNull Throwable th, boolean z4) {
        if (x1().R(th) || z4) {
            return;
        }
        n0.b(getContext(), th);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.a
    /* renamed from: y1 */
    public void v1(@NotNull Unit unit) {
        b0.a.a(x1(), null, 1, null);
    }
}
