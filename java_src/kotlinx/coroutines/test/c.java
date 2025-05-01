package kotlinx.coroutines.test;

import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.internal.w0;
import kotlinx.coroutines.internal.x0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TestCoroutineContext.kt */
/* loaded from: classes7.dex */
public final class c implements Comparable<c>, Runnable, x0 {
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    private final Runnable f71438b;

    /* renamed from: c  reason: collision with root package name */
    private final long f71439c;
    @JvmField

    /* renamed from: d  reason: collision with root package name */
    public final long f71440d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    private w0<?> f71441e;

    /* renamed from: f  reason: collision with root package name */
    private int f71442f;

    public c(@NotNull Runnable runnable, long j4, long j5) {
        this.f71438b = runnable;
        this.f71439c = j4;
        this.f71440d = j5;
    }

    @Override // kotlinx.coroutines.internal.x0
    public void d(@Nullable w0<?> w0Var) {
        this.f71441e = w0Var;
    }

    @Override // java.lang.Comparable
    /* renamed from: e */
    public int compareTo(@NotNull c cVar) {
        long j4 = this.f71440d;
        long j5 = cVar.f71440d;
        if (j4 == j5) {
            return Intrinsics.compare(this.f71439c, cVar.f71439c);
        }
        return Intrinsics.compare(j4, j5);
    }

    @Override // kotlinx.coroutines.internal.x0
    @Nullable
    public w0<?> f() {
        return this.f71441e;
    }

    @Override // kotlinx.coroutines.internal.x0
    public int getIndex() {
        return this.f71442f;
    }

    @Override // kotlinx.coroutines.internal.x0
    public void m(int i4) {
        this.f71442f = i4;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f71438b.run();
    }

    @NotNull
    public String toString() {
        return "TimedRunnable(time=" + this.f71440d + ", run=" + this.f71438b + ')';
    }

    public /* synthetic */ c(Runnable runnable, long j4, long j5, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(runnable, (i4 & 2) != 0 ? 0L : j4, (i4 & 4) != 0 ? 0L : j5);
    }
}
