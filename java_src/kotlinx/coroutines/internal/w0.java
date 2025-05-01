package kotlinx.coroutines.internal;

import java.lang.Comparable;
import java.util.Arrays;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.InternalCoroutinesApi;
import kotlinx.coroutines.internal.x0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ThreadSafeHeap.kt */
@InternalCoroutinesApi
/* loaded from: classes6.dex */
public class w0<T extends x0 & Comparable<? super T>> {
    @NotNull
    private volatile /* synthetic */ int _size = 0;
    @Nullable

    /* renamed from: a  reason: collision with root package name */
    private T[] f71155a;

    private final T[] i() {
        T[] tArr = this.f71155a;
        if (tArr == null) {
            T[] tArr2 = (T[]) new x0[4];
            this.f71155a = tArr2;
            return tArr2;
        } else if (f() >= tArr.length) {
            Object[] copyOf = Arrays.copyOf(tArr, f() * 2);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            T[] tArr3 = (T[]) ((x0[]) copyOf);
            this.f71155a = tArr3;
            return tArr3;
        } else {
            return tArr;
        }
    }

    private final void n(int i4) {
        this._size = i4;
    }

    private final void o(int i4) {
        while (true) {
            int i5 = (i4 * 2) + 1;
            if (i5 >= f()) {
                return;
            }
            T[] tArr = this.f71155a;
            Intrinsics.checkNotNull(tArr);
            int i6 = i5 + 1;
            if (i6 < f()) {
                T t4 = tArr[i6];
                Intrinsics.checkNotNull(t4);
                T t5 = tArr[i5];
                Intrinsics.checkNotNull(t5);
                if (((Comparable) t4).compareTo(t5) < 0) {
                    i5 = i6;
                }
            }
            T t6 = tArr[i4];
            Intrinsics.checkNotNull(t6);
            T t7 = tArr[i5];
            Intrinsics.checkNotNull(t7);
            if (((Comparable) t6).compareTo(t7) <= 0) {
                return;
            }
            q(i4, i5);
            i4 = i5;
        }
    }

    private final void p(int i4) {
        while (i4 > 0) {
            T[] tArr = this.f71155a;
            Intrinsics.checkNotNull(tArr);
            int i5 = (i4 - 1) / 2;
            T t4 = tArr[i5];
            Intrinsics.checkNotNull(t4);
            T t5 = tArr[i4];
            Intrinsics.checkNotNull(t5);
            if (((Comparable) t4).compareTo(t5) <= 0) {
                return;
            }
            q(i4, i5);
            i4 = i5;
        }
    }

    private final void q(int i4, int i5) {
        T[] tArr = this.f71155a;
        Intrinsics.checkNotNull(tArr);
        T t4 = tArr[i5];
        Intrinsics.checkNotNull(t4);
        T t5 = tArr[i4];
        Intrinsics.checkNotNull(t5);
        tArr[i4] = t4;
        tArr[i5] = t5;
        t4.m(i4);
        t5.m(i5);
    }

    @PublishedApi
    public final void a(@NotNull T t4) {
        if (kotlinx.coroutines.s0.b()) {
            if (!(t4.f() == null)) {
                throw new AssertionError();
            }
        }
        t4.d(this);
        T[] i4 = i();
        int f5 = f();
        n(f5 + 1);
        i4[f5] = t4;
        t4.m(f5);
        p(f5);
    }

    public final void b(@NotNull T t4) {
        synchronized (this) {
            a(t4);
            Unit unit = Unit.INSTANCE;
        }
    }

    public final boolean c(@NotNull T t4, @NotNull Function1<? super T, Boolean> function1) {
        boolean z4;
        synchronized (this) {
            try {
                if (function1.invoke(e()).booleanValue()) {
                    a(t4);
                    z4 = true;
                } else {
                    z4 = false;
                }
                InlineMarker.finallyStart(1);
            } catch (Throwable th) {
                InlineMarker.finallyStart(1);
                InlineMarker.finallyEnd(1);
                throw th;
            }
        }
        InlineMarker.finallyEnd(1);
        return z4;
    }

    public final void d() {
        synchronized (this) {
            T[] tArr = this.f71155a;
            if (tArr != null) {
                ArraysKt___ArraysJvmKt.fill$default(tArr, (Object) null, 0, 0, 6, (Object) null);
            }
            this._size = 0;
            Unit unit = Unit.INSTANCE;
        }
    }

    @PublishedApi
    @Nullable
    public final T e() {
        T[] tArr = this.f71155a;
        if (tArr == null) {
            return null;
        }
        return tArr[0];
    }

    public final int f() {
        return this._size;
    }

    public final boolean g() {
        return f() == 0;
    }

    @Nullable
    public final T h() {
        T e5;
        synchronized (this) {
            e5 = e();
        }
        return e5;
    }

    public final boolean j(@NotNull T t4) {
        boolean z4;
        synchronized (this) {
            z4 = true;
            if (t4.f() == null) {
                z4 = false;
            } else {
                int index = t4.getIndex();
                if (kotlinx.coroutines.s0.b()) {
                    if (!(index >= 0)) {
                        throw new AssertionError();
                    }
                }
                k(index);
            }
        }
        return z4;
    }

    @PublishedApi
    @NotNull
    public final T k(int i4) {
        if (kotlinx.coroutines.s0.b()) {
            if (!(f() > 0)) {
                throw new AssertionError();
            }
        }
        T[] tArr = this.f71155a;
        Intrinsics.checkNotNull(tArr);
        n(f() - 1);
        if (i4 < f()) {
            q(i4, f());
            int i5 = (i4 - 1) / 2;
            if (i4 > 0) {
                T t4 = tArr[i4];
                Intrinsics.checkNotNull(t4);
                T t5 = tArr[i5];
                Intrinsics.checkNotNull(t5);
                if (((Comparable) t4).compareTo(t5) < 0) {
                    q(i4, i5);
                    p(i5);
                }
            }
            o(i4);
        }
        T t6 = tArr[f()];
        Intrinsics.checkNotNull(t6);
        if (kotlinx.coroutines.s0.b()) {
            if (!(t6.f() == this)) {
                throw new AssertionError();
            }
        }
        t6.d(null);
        t6.m(-1);
        tArr[f()] = null;
        return t6;
    }

    @Nullable
    public final T l(@NotNull Function1<? super T, Boolean> function1) {
        synchronized (this) {
            try {
                T e5 = e();
                if (e5 == null) {
                    InlineMarker.finallyStart(2);
                    InlineMarker.finallyEnd(2);
                    return null;
                }
                T k4 = function1.invoke(e5).booleanValue() ? k(0) : null;
                InlineMarker.finallyStart(1);
                InlineMarker.finallyEnd(1);
                return k4;
            } catch (Throwable th) {
                InlineMarker.finallyStart(1);
                InlineMarker.finallyEnd(1);
                throw th;
            }
        }
    }

    @Nullable
    public final T m() {
        T k4;
        synchronized (this) {
            k4 = f() > 0 ? k(0) : null;
        }
        return k4;
    }
}
