package com.meituan.android.walle;
/* compiled from: Pair.java */
/* loaded from: classes5.dex */
final class e<A, B> {

    /* renamed from: a  reason: collision with root package name */
    private final A f55927a;

    /* renamed from: b  reason: collision with root package name */
    private final B f55928b;

    private e(A a5, B b5) {
        this.f55927a = a5;
        this.f55928b = b5;
    }

    public static <A, B> e<A, B> c(A a5, B b5) {
        return new e<>(a5, b5);
    }

    public A a() {
        return this.f55927a;
    }

    public B b() {
        return this.f55928b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e.class == obj.getClass()) {
            e eVar = (e) obj;
            A a5 = this.f55927a;
            if (a5 == null) {
                if (eVar.f55927a != null) {
                    return false;
                }
            } else if (!a5.equals(eVar.f55927a)) {
                return false;
            }
            B b5 = this.f55928b;
            if (b5 == null) {
                if (eVar.f55928b != null) {
                    return false;
                }
            } else if (!b5.equals(eVar.f55928b)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        A a5 = this.f55927a;
        int hashCode = ((a5 == null ? 0 : a5.hashCode()) + 31) * 31;
        B b5 = this.f55928b;
        return hashCode + (b5 != null ? b5.hashCode() : 0);
    }
}
