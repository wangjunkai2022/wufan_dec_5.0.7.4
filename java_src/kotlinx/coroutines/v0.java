package kotlinx.coroutines;

import org.jetbrains.annotations.NotNull;
/* compiled from: DefaultExecutor.kt */
/* loaded from: classes6.dex */
public final class v0 {

    /* renamed from: a  reason: collision with root package name */
    private static final boolean f71453a = kotlinx.coroutines.internal.q0.e("kotlinx.coroutines.main.delay", false);
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    private static final y0 f71454b = b();

    @NotNull
    public static final y0 a() {
        return f71454b;
    }

    private static final y0 b() {
        if (f71453a) {
            j2 e5 = d1.e();
            return (kotlinx.coroutines.internal.d0.d(e5) || !(e5 instanceof y0)) ? u0.f71444g : (y0) e5;
        }
        return u0.f71444g;
    }
}
