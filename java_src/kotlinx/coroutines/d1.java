package kotlinx.coroutines;

import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
/* compiled from: Dispatchers.kt */
/* loaded from: classes6.dex */
public final class d1 {
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    public static final d1 f70015a = new d1();
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    private static final CoroutineDispatcher f70016b = kotlinx.coroutines.scheduling.c.f71290h;
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    private static final CoroutineDispatcher f70017c = i3.f71061b;
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    private static final CoroutineDispatcher f70018d = kotlinx.coroutines.scheduling.b.f71288c;

    private d1() {
    }

    @NotNull
    public static final CoroutineDispatcher a() {
        return f70016b;
    }

    @JvmStatic
    public static /* synthetic */ void b() {
    }

    @NotNull
    public static final CoroutineDispatcher c() {
        return f70018d;
    }

    @JvmStatic
    public static /* synthetic */ void d() {
    }

    @NotNull
    public static final j2 e() {
        return kotlinx.coroutines.internal.c0.f71104c;
    }

    @JvmStatic
    public static /* synthetic */ void f() {
    }

    @NotNull
    public static final CoroutineDispatcher g() {
        return f70017c;
    }

    @JvmStatic
    public static /* synthetic */ void h() {
    }

    @DelicateCoroutinesApi
    public final void i() {
        u0.f71444g.shutdown();
        kotlinx.coroutines.scheduling.c.f71290h.e0();
    }
}
