package kotlinx.coroutines.internal;

import androidx.core.internal.view.SupportMenu;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlinx.coroutines.internal.l0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ConcurrentLinkedList.kt */
/* loaded from: classes6.dex */
public abstract class l0<S extends l0<S>> extends h<S> {

    /* renamed from: d  reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f71126d = AtomicIntegerFieldUpdater.newUpdater(l0.class, "cleanedAndPointers");

    /* renamed from: c  reason: collision with root package name */
    private final long f71127c;
    @NotNull
    private volatile /* synthetic */ int cleanedAndPointers;

    public l0(long j4, @Nullable S s4, int i4) {
        super(s4);
        this.f71127c = j4;
        this.cleanedAndPointers = i4 << 16;
    }

    @Override // kotlinx.coroutines.internal.h
    public boolean g() {
        return this.cleanedAndPointers == p() && !i();
    }

    public final boolean n() {
        return f71126d.addAndGet(this, SupportMenu.CATEGORY_MASK) == p() && !i();
    }

    public final long o() {
        return this.f71127c;
    }

    public abstract int p();

    public final void q() {
        if (f71126d.incrementAndGet(this) != p() || i()) {
            return;
        }
        l();
    }

    public final boolean r() {
        int i4;
        do {
            i4 = this.cleanedAndPointers;
            if (!(i4 != p() || i())) {
                return false;
            }
        } while (!f71126d.compareAndSet(this, i4, 65536 + i4));
        return true;
    }
}
