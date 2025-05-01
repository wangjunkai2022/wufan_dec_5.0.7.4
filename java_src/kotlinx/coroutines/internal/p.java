package kotlinx.coroutines.internal;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.JvmInline;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: InlineList.kt */
@JvmInline
/* loaded from: classes6.dex */
public final class p<E> {
    @Nullable

    /* renamed from: a  reason: collision with root package name */
    private final Object f71139a;

    private /* synthetic */ p(Object obj) {
        this.f71139a = obj;
    }

    public static final /* synthetic */ p a(Object obj) {
        return new p(obj);
    }

    @NotNull
    public static <E> Object b(@Nullable Object obj) {
        return obj;
    }

    public static /* synthetic */ Object c(Object obj, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i4 & 1) != 0) {
            obj = null;
        }
        return b(obj);
    }

    public static boolean d(Object obj, Object obj2) {
        return (obj2 instanceof p) && Intrinsics.areEqual(obj, ((p) obj2).j());
    }

    public static final boolean e(Object obj, Object obj2) {
        return Intrinsics.areEqual(obj, obj2);
    }

    public static final void f(Object obj, @NotNull Function1<? super E, Unit> function1) {
        if (obj == null) {
            return;
        }
        if (!(obj instanceof ArrayList)) {
            function1.invoke(obj);
            return;
        }
        ArrayList arrayList = (ArrayList) obj;
        int size = arrayList.size() - 1;
        if (size < 0) {
            return;
        }
        while (true) {
            int i4 = size - 1;
            function1.invoke((Object) arrayList.get(size));
            if (i4 < 0) {
                return;
            }
            size = i4;
        }
    }

    public static int g(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    @NotNull
    public static final Object h(Object obj, E e5) {
        if (!kotlinx.coroutines.s0.b() || (!(e5 instanceof List))) {
            if (obj == null) {
                return b(e5);
            }
            if (obj instanceof ArrayList) {
                ((ArrayList) obj).add(e5);
                return b(obj);
            }
            ArrayList arrayList = new ArrayList(4);
            arrayList.add(obj);
            arrayList.add(e5);
            return b(arrayList);
        }
        throw new AssertionError();
    }

    public static String i(Object obj) {
        return "InlineList(holder=" + obj + ')';
    }

    public boolean equals(Object obj) {
        return d(this.f71139a, obj);
    }

    public int hashCode() {
        return g(this.f71139a);
    }

    public final /* synthetic */ Object j() {
        return this.f71139a;
    }

    public String toString() {
        return i(this.f71139a);
    }
}
