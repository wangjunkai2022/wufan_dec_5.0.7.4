package kotlinx.coroutines.scheduling;

import org.jetbrains.annotations.NotNull;
/* compiled from: Tasks.kt */
/* loaded from: classes7.dex */
public final class g extends i {
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    public static final g f71302a = new g();

    private g() {
    }

    @Override // kotlinx.coroutines.scheduling.i
    public long a() {
        return System.nanoTime();
    }
}
