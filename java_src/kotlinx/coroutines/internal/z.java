package kotlinx.coroutines.internal;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: LockFreeTaskQueue.kt */
/* loaded from: classes6.dex */
public final class z<E> {

    /* renamed from: h  reason: collision with root package name */
    public static final int f71165h = 8;

    /* renamed from: i  reason: collision with root package name */
    public static final int f71166i = 30;

    /* renamed from: j  reason: collision with root package name */
    public static final int f71167j = 1073741823;

    /* renamed from: k  reason: collision with root package name */
    public static final int f71168k = 0;

    /* renamed from: l  reason: collision with root package name */
    public static final long f71169l = 1073741823;

    /* renamed from: m  reason: collision with root package name */
    public static final int f71170m = 30;

    /* renamed from: n  reason: collision with root package name */
    public static final long f71171n = 1152921503533105152L;

    /* renamed from: o  reason: collision with root package name */
    public static final int f71172o = 60;

    /* renamed from: p  reason: collision with root package name */
    public static final long f71173p = 1152921504606846976L;

    /* renamed from: q  reason: collision with root package name */
    public static final int f71174q = 61;

    /* renamed from: r  reason: collision with root package name */
    public static final long f71175r = 2305843009213693952L;

    /* renamed from: s  reason: collision with root package name */
    public static final int f71176s = 1024;

    /* renamed from: u  reason: collision with root package name */
    public static final int f71178u = 0;

    /* renamed from: v  reason: collision with root package name */
    public static final int f71179v = 1;

    /* renamed from: w  reason: collision with root package name */
    public static final int f71180w = 2;
    @NotNull
    private volatile /* synthetic */ Object _next = null;
    @NotNull
    private volatile /* synthetic */ long _state = 0;

    /* renamed from: a  reason: collision with root package name */
    private final int f71181a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f71182b;

    /* renamed from: c  reason: collision with root package name */
    private final int f71183c;
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    private /* synthetic */ AtomicReferenceArray f71184d;
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    public static final a f71162e = new a(null);
    @JvmField
    @NotNull

    /* renamed from: t  reason: collision with root package name */
    public static final o0 f71177t = new o0("REMOVE_FROZEN");

    /* renamed from: f  reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f71163f = AtomicReferenceFieldUpdater.newUpdater(z.class, Object.class, "_next");

    /* renamed from: g  reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f71164g = AtomicLongFieldUpdater.newUpdater(z.class, "_state");

    /* compiled from: LockFreeTaskQueue.kt */
    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a(long j4) {
            return (j4 & z.f71175r) != 0 ? 2 : 1;
        }

        public final long b(long j4, int i4) {
            return e(j4, z.f71169l) | (i4 << 0);
        }

        public final long c(long j4, int i4) {
            return e(j4, z.f71171n) | (i4 << 30);
        }

        public final <T> T d(long j4, @NotNull Function2<? super Integer, ? super Integer, ? extends T> function2) {
            return function2.invoke(Integer.valueOf((int) ((z.f71169l & j4) >> 0)), Integer.valueOf((int) ((j4 & z.f71171n) >> 30)));
        }

        public final long e(long j4, long j5) {
            return j4 & (j5 ^ (-1));
        }
    }

    /* compiled from: LockFreeTaskQueue.kt */
    /* loaded from: classes6.dex */
    public static final class b {
        @JvmField

        /* renamed from: a  reason: collision with root package name */
        public final int f71185a;

        public b(int i4) {
            this.f71185a = i4;
        }
    }

    public z(int i4, boolean z4) {
        this.f71181a = i4;
        this.f71182b = z4;
        int i5 = i4 - 1;
        this.f71183c = i5;
        this.f71184d = new AtomicReferenceArray(i4);
        if (!(i5 <= 1073741823)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (!((i4 & i5) == 0)) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final z<E> b(long j4) {
        z<E> zVar = new z<>(this.f71181a * 2, this.f71182b);
        int i4 = (int) ((f71169l & j4) >> 0);
        int i5 = (int) ((f71171n & j4) >> 30);
        while (true) {
            int i6 = this.f71183c;
            if ((i4 & i6) != (i5 & i6)) {
                Object obj = this.f71184d.get(i6 & i4);
                if (obj == null) {
                    obj = new b(i4);
                }
                zVar.f71184d.set(zVar.f71183c & i4, obj);
                i4++;
            } else {
                zVar._state = f71162e.e(j4, f71173p);
                return zVar;
            }
        }
    }

    private final z<E> c(long j4) {
        while (true) {
            z<E> zVar = (z) this._next;
            if (zVar != null) {
                return zVar;
            }
            f71163f.compareAndSet(this, null, b(j4));
        }
    }

    private final z<E> e(int i4, E e5) {
        Object obj = this.f71184d.get(this.f71183c & i4);
        if ((obj instanceof b) && ((b) obj).f71185a == i4) {
            this.f71184d.set(i4 & this.f71183c, e5);
            return this;
        }
        return null;
    }

    private final long j() {
        long j4;
        long j5;
        do {
            j4 = this._state;
            if ((j4 & f71173p) != 0) {
                return j4;
            }
            j5 = j4 | f71173p;
        } while (!f71164g.compareAndSet(this, j4, j5));
        return j5;
    }

    private final z<E> m(int i4, int i5) {
        long j4;
        a aVar;
        int i6;
        do {
            j4 = this._state;
            aVar = f71162e;
            i6 = (int) ((f71169l & j4) >> 0);
            if (kotlinx.coroutines.s0.b()) {
                if (!(i6 == i4)) {
                    throw new AssertionError();
                }
            }
            if ((f71173p & j4) != 0) {
                return k();
            }
        } while (!f71164g.compareAndSet(this, j4, aVar.b(j4, i5)));
        this.f71184d.set(this.f71183c & i6, null);
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004e, code lost:
        return 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(@org.jetbrains.annotations.NotNull E r14) {
        /*
            r13 = this;
        L0:
            long r2 = r13._state
            r0 = 3458764513820540928(0x3000000000000000, double:1.727233711018889E-77)
            long r0 = r0 & r2
            r6 = 0
            int r4 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r4 == 0) goto L12
            kotlinx.coroutines.internal.z$a r14 = kotlinx.coroutines.internal.z.f71162e
            int r14 = r14.a(r2)
            return r14
        L12:
            kotlinx.coroutines.internal.z$a r0 = kotlinx.coroutines.internal.z.f71162e
            r4 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r4 = r4 & r2
            r8 = 0
            long r4 = r4 >> r8
            int r1 = (int) r4
            r4 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r4 = r4 & r2
            r9 = 30
            long r4 = r4 >> r9
            int r9 = (int) r4
            int r10 = r13.f71183c
            int r4 = r9 + 2
            r4 = r4 & r10
            r5 = r1 & r10
            r11 = 1
            if (r4 != r5) goto L30
            return r11
        L30:
            boolean r4 = r13.f71182b
            r5 = 1073741823(0x3fffffff, float:1.9999999)
            if (r4 != 0) goto L4f
            java.util.concurrent.atomic.AtomicReferenceArray r4 = r13.f71184d
            r12 = r9 & r10
            java.lang.Object r4 = r4.get(r12)
            if (r4 == 0) goto L4f
            int r0 = r13.f71181a
            r2 = 1024(0x400, float:1.435E-42)
            if (r0 < r2) goto L4e
            int r9 = r9 - r1
            r1 = r9 & r5
            int r0 = r0 >> 1
            if (r1 <= r0) goto L0
        L4e:
            return r11
        L4f:
            int r1 = r9 + 1
            r1 = r1 & r5
            java.util.concurrent.atomic.AtomicLongFieldUpdater r4 = kotlinx.coroutines.internal.z.f71164g
            long r11 = r0.c(r2, r1)
            r0 = r4
            r1 = r13
            r4 = r11
            boolean r0 = r0.compareAndSet(r1, r2, r4)
            if (r0 == 0) goto L0
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r13.f71184d
            r1 = r9 & r10
            r0.set(r1, r14)
            r0 = r13
        L69:
            long r1 = r0._state
            r3 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r1 = r1 & r3
            int r3 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r3 != 0) goto L73
            goto L7d
        L73:
            kotlinx.coroutines.internal.z r0 = r0.k()
            kotlinx.coroutines.internal.z r0 = r0.e(r9, r14)
            if (r0 != 0) goto L69
        L7d:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.z.a(java.lang.Object):int");
    }

    public final boolean d() {
        long j4;
        do {
            j4 = this._state;
            if ((j4 & f71175r) != 0) {
                return true;
            }
            if ((f71173p & j4) != 0) {
                return false;
            }
        } while (!f71164g.compareAndSet(this, j4, j4 | f71175r));
        return true;
    }

    public final int f() {
        long j4 = this._state;
        return 1073741823 & (((int) ((j4 & f71171n) >> 30)) - ((int) ((f71169l & j4) >> 0)));
    }

    public final boolean g() {
        return (this._state & f71175r) != 0;
    }

    public final boolean h() {
        long j4 = this._state;
        return ((int) ((f71169l & j4) >> 0)) == ((int) ((j4 & f71171n) >> 30));
    }

    @NotNull
    public final <R> List<R> i(@NotNull Function1<? super E, ? extends R> function1) {
        ArrayList arrayList = new ArrayList(this.f71181a);
        long j4 = this._state;
        int i4 = (int) ((f71169l & j4) >> 0);
        int i5 = (int) ((j4 & f71171n) >> 30);
        while (true) {
            int i6 = this.f71183c;
            if ((i4 & i6) == (i5 & i6)) {
                return arrayList;
            }
            Object obj = (Object) this.f71184d.get(i6 & i4);
            if (obj != 0 && !(obj instanceof b)) {
                arrayList.add(function1.invoke(obj));
            }
            i4++;
        }
    }

    @NotNull
    public final z<E> k() {
        return c(j());
    }

    @Nullable
    public final Object l() {
        while (true) {
            long j4 = this._state;
            if ((f71173p & j4) != 0) {
                return f71177t;
            }
            a aVar = f71162e;
            int i4 = (int) ((f71169l & j4) >> 0);
            int i5 = (int) ((f71171n & j4) >> 30);
            int i6 = this.f71183c;
            if ((i5 & i6) == (i4 & i6)) {
                return null;
            }
            Object obj = this.f71184d.get(i6 & i4);
            if (obj == null) {
                if (this.f71182b) {
                    return null;
                }
            } else if (obj instanceof b) {
                return null;
            } else {
                int i7 = (i4 + 1) & f71167j;
                if (f71164g.compareAndSet(this, j4, aVar.b(j4, i7))) {
                    this.f71184d.set(this.f71183c & i4, null);
                    return obj;
                } else if (this.f71182b) {
                    z<E> zVar = this;
                    do {
                        zVar = zVar.m(i4, i7);
                    } while (zVar != null);
                    return obj;
                }
            }
        }
    }
}
