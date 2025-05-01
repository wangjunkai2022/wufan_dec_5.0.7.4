package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: Interruptible.kt */
/* loaded from: classes6.dex */
final class g3 implements Function1<Throwable, Unit> {

    /* renamed from: e  reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f71051e = AtomicIntegerFieldUpdater.newUpdater(g3.class, "_state");
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    private final z1 f71052b;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    private g1 f71054d;
    @NotNull
    private volatile /* synthetic */ int _state = 0;

    /* renamed from: c  reason: collision with root package name */
    private final Thread f71053c = Thread.currentThread();

    public g3(@NotNull z1 z1Var) {
        this.f71052b = z1Var;
    }

    private final Void b(int i4) {
        throw new IllegalStateException(Intrinsics.stringPlus("Illegal state ", Integer.valueOf(i4)).toString());
    }

    public final void a() {
        while (true) {
            int i4 = this._state;
            if (i4 != 0) {
                if (i4 != 2) {
                    if (i4 == 3) {
                        Thread.interrupted();
                        return;
                    } else {
                        b(i4);
                        throw new KotlinNothingValueException();
                    }
                }
            } else if (f71051e.compareAndSet(this, i4, 1)) {
                g1 g1Var = this.f71054d;
                if (g1Var == null) {
                    return;
                }
                g1Var.dispose();
                return;
            }
        }
    }

    public void c(@Nullable Throwable th) {
        int i4;
        do {
            i4 = this._state;
            if (i4 != 0) {
                if (i4 == 1 || i4 == 2 || i4 == 3) {
                    return;
                }
                b(i4);
                throw new KotlinNothingValueException();
            }
        } while (!f71051e.compareAndSet(this, i4, 2));
        this.f71053c.interrupt();
        this._state = 3;
    }

    public final void d() {
        int i4;
        this.f71054d = this.f71052b.p(true, true, this);
        do {
            i4 = this._state;
            if (i4 != 0) {
                if (i4 == 2 || i4 == 3) {
                    return;
                }
                b(i4);
                throw new KotlinNothingValueException();
            }
        } while (!f71051e.compareAndSet(this, i4, 0));
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
        c(th);
        return Unit.INSTANCE;
    }
}
