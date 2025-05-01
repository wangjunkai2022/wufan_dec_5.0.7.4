package kotlinx.coroutines.channels;

import kotlin.jvm.JvmField;
import kotlinx.coroutines.internal.o0;
import org.jetbrains.annotations.NotNull;
/* compiled from: AbstractChannel.kt */
/* loaded from: classes6.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final int f69939a = 0;

    /* renamed from: b  reason: collision with root package name */
    public static final int f69940b = 1;
    @JvmField
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public static final o0 f69941c = new o0("EMPTY");
    @JvmField
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    public static final o0 f69942d = new o0("OFFER_SUCCESS");
    @JvmField
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    public static final o0 f69943e = new o0("OFFER_FAILED");
    @JvmField
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    public static final o0 f69944f = new o0("POLL_FAILED");
    @JvmField
    @NotNull

    /* renamed from: g  reason: collision with root package name */
    public static final o0 f69945g = new o0("ENQUEUE_FAILED");
    @JvmField
    @NotNull

    /* renamed from: h  reason: collision with root package name */
    public static final o0 f69946h = new o0("ON_CLOSE_HANDLER_INVOKED");

    public static /* synthetic */ void a() {
    }

    public static /* synthetic */ void b() {
    }

    public static /* synthetic */ void c() {
    }

    public static /* synthetic */ void d() {
    }

    public static /* synthetic */ void e() {
    }

    public static /* synthetic */ void f() {
    }

    private static final <E> Object g(Object obj) {
        return obj instanceof p ? n.f69990b.a(((p) obj).f69995e) : n.f69990b.c(obj);
    }

    private static final <E> Object h(p<?> pVar) {
        return n.f69990b.a(pVar.f69995e);
    }
}
