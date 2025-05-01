package kotlinx.coroutines.sync;

import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlinx.coroutines.internal.l0;
import kotlinx.coroutines.internal.o0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Semaphore.kt */
/* loaded from: classes7.dex */
public final class e extends l0<e> {
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    /* synthetic */ AtomicReferenceArray f71421e;

    public e(long j4, @Nullable e eVar, int i4) {
        super(j4, eVar, i4);
        int i5;
        i5 = SemaphoreKt.f71413f;
        this.f71421e = new AtomicReferenceArray(i5);
    }

    @Override // kotlinx.coroutines.internal.l0
    public int p() {
        int i4;
        i4 = SemaphoreKt.f71413f;
        return i4;
    }

    public final void s(int i4) {
        o0 o0Var;
        o0Var = SemaphoreKt.f71412e;
        this.f71421e.set(i4, o0Var);
        q();
    }

    public final boolean t(int i4, @Nullable Object obj, @Nullable Object obj2) {
        return this.f71421e.compareAndSet(i4, obj, obj2);
    }

    @NotNull
    public String toString() {
        return "SemaphoreSegment[id=" + o() + ", hashCode=" + hashCode() + ']';
    }

    @Nullable
    public final Object u(int i4) {
        return this.f71421e.get(i4);
    }

    @Nullable
    public final Object v(int i4, @Nullable Object obj) {
        return this.f71421e.getAndSet(i4, obj);
    }

    public final void w(int i4, @Nullable Object obj) {
        this.f71421e.set(i4, obj);
    }
}
