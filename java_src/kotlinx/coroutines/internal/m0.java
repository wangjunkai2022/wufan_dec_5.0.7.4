package kotlinx.coroutines.internal;

import java.util.Objects;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.internal.l0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ConcurrentLinkedList.kt */
@JvmInline
/* loaded from: classes6.dex */
public final class m0<S extends l0<S>> {
    @Nullable

    /* renamed from: a  reason: collision with root package name */
    private final Object f71130a;

    private /* synthetic */ m0(Object obj) {
        this.f71130a = obj;
    }

    public static final /* synthetic */ m0 a(Object obj) {
        return new m0(obj);
    }

    @NotNull
    public static <S extends l0<S>> Object b(@Nullable Object obj) {
        return obj;
    }

    public static boolean c(Object obj, Object obj2) {
        return (obj2 instanceof m0) && Intrinsics.areEqual(obj, ((m0) obj2).j());
    }

    public static final boolean d(Object obj, Object obj2) {
        return Intrinsics.areEqual(obj, obj2);
    }

    public static /* synthetic */ void e() {
    }

    @NotNull
    public static final S f(Object obj) {
        if (obj != g.f71115b) {
            Objects.requireNonNull(obj, "null cannot be cast to non-null type S of kotlinx.coroutines.internal.SegmentOrClosed");
            return (S) obj;
        }
        throw new IllegalStateException("Does not contain segment".toString());
    }

    public static int g(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public static final boolean h(Object obj) {
        return obj == g.f71115b;
    }

    public static String i(Object obj) {
        return "SegmentOrClosed(value=" + obj + ')';
    }

    public boolean equals(Object obj) {
        return c(this.f71130a, obj);
    }

    public int hashCode() {
        return g(this.f71130a);
    }

    public final /* synthetic */ Object j() {
        return this.f71130a;
    }

    public String toString() {
        return i(this.f71130a);
    }
}
