package kotlinx.coroutines.channels;

import kotlin.PublishedApi;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.InternalCoroutinesApi;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: Channel.kt */
@JvmInline
/* loaded from: classes6.dex */
public final class n<T> {
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public static final b f69990b = new b(null);
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    private static final c f69991c = new c();
    @Nullable

    /* renamed from: a  reason: collision with root package name */
    private final Object f69992a;

    /* compiled from: Channel.kt */
    /* loaded from: classes6.dex */
    public static final class a extends c {
        @JvmField
        @Nullable

        /* renamed from: a  reason: collision with root package name */
        public final Throwable f69993a;

        public a(@Nullable Throwable th) {
            this.f69993a = th;
        }

        public boolean equals(@Nullable Object obj) {
            return (obj instanceof a) && Intrinsics.areEqual(this.f69993a, ((a) obj).f69993a);
        }

        public int hashCode() {
            Throwable th = this.f69993a;
            if (th == null) {
                return 0;
            }
            return th.hashCode();
        }

        @Override // kotlinx.coroutines.channels.n.c
        @NotNull
        public String toString() {
            return "Closed(" + this.f69993a + ')';
        }
    }

    /* compiled from: Channel.kt */
    @InternalCoroutinesApi
    /* loaded from: classes6.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @InternalCoroutinesApi
        @NotNull
        public final <E> Object a(@Nullable Throwable th) {
            return n.c(new a(th));
        }

        @InternalCoroutinesApi
        @NotNull
        public final <E> Object b() {
            return n.c(n.f69991c);
        }

        @InternalCoroutinesApi
        @NotNull
        public final <E> Object c(E e5) {
            return n.c(e5);
        }
    }

    /* compiled from: Channel.kt */
    /* loaded from: classes6.dex */
    public static class c {
        @NotNull
        public String toString() {
            return "Failed";
        }
    }

    @PublishedApi
    private /* synthetic */ n(Object obj) {
        this.f69992a = obj;
    }

    public static final /* synthetic */ n b(Object obj) {
        return new n(obj);
    }

    @PublishedApi
    @NotNull
    public static <T> Object c(@Nullable Object obj) {
        return obj;
    }

    public static boolean d(Object obj, Object obj2) {
        return (obj2 instanceof n) && Intrinsics.areEqual(obj, ((n) obj2).o());
    }

    public static final boolean e(Object obj, Object obj2) {
        return Intrinsics.areEqual(obj, obj2);
    }

    @Nullable
    public static final Throwable f(Object obj) {
        a aVar = obj instanceof a ? (a) obj : null;
        if (aVar == null) {
            return null;
        }
        return aVar.f69993a;
    }

    @PublishedApi
    public static /* synthetic */ void g() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public static final T h(Object obj) {
        if (obj instanceof c) {
            return null;
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final T i(Object obj) {
        Throwable th;
        if (obj instanceof c) {
            if (!(obj instanceof a) || (th = ((a) obj).f69993a) == null) {
                throw new IllegalStateException(Intrinsics.stringPlus("Trying to call 'getOrThrow' on a failed channel result: ", obj).toString());
            }
            throw th;
        }
        return obj;
    }

    public static int j(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public static final boolean k(Object obj) {
        return obj instanceof a;
    }

    public static final boolean l(Object obj) {
        return obj instanceof c;
    }

    public static final boolean m(Object obj) {
        return !(obj instanceof c);
    }

    @NotNull
    public static String n(Object obj) {
        if (obj instanceof a) {
            return ((a) obj).toString();
        }
        return "Value(" + obj + ')';
    }

    public boolean equals(Object obj) {
        return d(this.f69992a, obj);
    }

    public int hashCode() {
        return j(this.f69992a);
    }

    public final /* synthetic */ Object o() {
        return this.f69992a;
    }

    @NotNull
    public String toString() {
        return n(this.f69992a);
    }
}
