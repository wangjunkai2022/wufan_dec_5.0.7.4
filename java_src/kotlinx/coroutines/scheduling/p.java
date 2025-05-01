package kotlinx.coroutines.scheduling;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: WorkQueue.kt */
/* loaded from: classes7.dex */
public final class p {

    /* renamed from: b  reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f71323b = AtomicReferenceFieldUpdater.newUpdater(p.class, Object.class, "lastScheduledTask");

    /* renamed from: c  reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f71324c = AtomicIntegerFieldUpdater.newUpdater(p.class, "producerIndex");

    /* renamed from: d  reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f71325d = AtomicIntegerFieldUpdater.newUpdater(p.class, "consumerIndex");

    /* renamed from: e  reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f71326e = AtomicIntegerFieldUpdater.newUpdater(p.class, "blockingTasksInBuffer");
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    private final AtomicReferenceArray<j> f71327a = new AtomicReferenceArray<>(128);
    @NotNull
    private volatile /* synthetic */ Object lastScheduledTask = null;
    @NotNull
    private volatile /* synthetic */ int producerIndex = 0;
    @NotNull
    private volatile /* synthetic */ int consumerIndex = 0;
    @NotNull
    private volatile /* synthetic */ int blockingTasksInBuffer = 0;

    public static /* synthetic */ j b(p pVar, j jVar, boolean z4, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            z4 = false;
        }
        return pVar.a(jVar, z4);
    }

    private final j c(j jVar) {
        if (jVar.f71309c.P() == 1) {
            f71326e.incrementAndGet(this);
        }
        if (e() == 127) {
            return jVar;
        }
        int i4 = this.producerIndex & 127;
        while (this.f71327a.get(i4) != null) {
            Thread.yield();
        }
        this.f71327a.lazySet(i4, jVar);
        f71324c.incrementAndGet(this);
        return null;
    }

    private final void d(j jVar) {
        if (jVar != null) {
            if (jVar.f71309c.P() == 1) {
                int decrementAndGet = f71326e.decrementAndGet(this);
                if (s0.b()) {
                    if (!(decrementAndGet >= 0)) {
                        throw new AssertionError();
                    }
                }
            }
        }
    }

    private final j i() {
        j andSet;
        while (true) {
            int i4 = this.consumerIndex;
            if (i4 - this.producerIndex == 0) {
                return null;
            }
            int i5 = i4 & 127;
            if (f71325d.compareAndSet(this, i4, i4 + 1) && (andSet = this.f71327a.getAndSet(i5, null)) != null) {
                d(andSet);
                return andSet;
            }
        }
    }

    private final boolean j(e eVar) {
        j i4 = i();
        if (i4 == null) {
            return false;
        }
        eVar.a(i4);
        return true;
    }

    private final long m(p pVar, boolean z4) {
        j jVar;
        do {
            jVar = (j) pVar.lastScheduledTask;
            if (jVar == null) {
                return -2L;
            }
            if (z4) {
                if (!(jVar.f71309c.P() == 1)) {
                    return -2L;
                }
            }
            long a5 = n.f71317f.a() - jVar.f71308b;
            long j4 = n.f71313b;
            if (a5 < j4) {
                return j4 - a5;
            }
        } while (!f71323b.compareAndSet(pVar, jVar, null));
        b(this, jVar, false, 2, null);
        return -1L;
    }

    @Nullable
    public final j a(@NotNull j jVar, boolean z4) {
        if (z4) {
            return c(jVar);
        }
        j jVar2 = (j) f71323b.getAndSet(this, jVar);
        if (jVar2 == null) {
            return null;
        }
        return c(jVar2);
    }

    public final int e() {
        return this.producerIndex - this.consumerIndex;
    }

    public final int f() {
        return this.lastScheduledTask != null ? e() + 1 : e();
    }

    public final void g(@NotNull e eVar) {
        j jVar = (j) f71323b.getAndSet(this, null);
        if (jVar != null) {
            eVar.a(jVar);
        }
        do {
        } while (j(eVar));
    }

    @Nullable
    public final j h() {
        j jVar = (j) f71323b.getAndSet(this, null);
        return jVar == null ? i() : jVar;
    }

    public final long k(@NotNull p pVar) {
        if (s0.b()) {
            if (!(e() == 0)) {
                throw new AssertionError();
            }
        }
        int i4 = pVar.producerIndex;
        AtomicReferenceArray<j> atomicReferenceArray = pVar.f71327a;
        for (int i5 = pVar.consumerIndex; i5 != i4; i5++) {
            int i6 = i5 & 127;
            if (pVar.blockingTasksInBuffer == 0) {
                break;
            }
            j jVar = atomicReferenceArray.get(i6);
            if (jVar != null) {
                if ((jVar.f71309c.P() == 1) && atomicReferenceArray.compareAndSet(i6, jVar, null)) {
                    f71326e.decrementAndGet(pVar);
                    b(this, jVar, false, 2, null);
                    return -1L;
                }
            }
        }
        return m(pVar, true);
    }

    public final long l(@NotNull p pVar) {
        if (s0.b()) {
            if (!(e() == 0)) {
                throw new AssertionError();
            }
        }
        j i4 = pVar.i();
        if (i4 != null) {
            j b5 = b(this, i4, false, 2, null);
            if (s0.b()) {
                if (b5 == null) {
                    return -1L;
                }
                throw new AssertionError();
            }
            return -1L;
        }
        return m(pVar, false);
    }
}
