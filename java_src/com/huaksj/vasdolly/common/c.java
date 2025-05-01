package com.huaksj.vasdolly.common;
/* compiled from: Pair.java */
/* loaded from: classes3.dex */
public final class c<A, B> {

    /* renamed from: a  reason: collision with root package name */
    private final A f14491a;

    /* renamed from: b  reason: collision with root package name */
    private final B f14492b;

    private c(A a5, B b5) {
        this.f14491a = a5;
        this.f14492b = b5;
    }

    public static <A, B> c<A, B> a(A a5, B b5) {
        return new c<>(a5, b5);
    }

    public A b() {
        return this.f14491a;
    }

    public B c() {
        return this.f14492b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            A a5 = this.f14491a;
            if (a5 == null) {
                if (cVar.f14491a != null) {
                    return false;
                }
            } else if (!a5.equals(cVar.f14491a)) {
                return false;
            }
            B b5 = this.f14492b;
            if (b5 == null) {
                if (cVar.f14492b != null) {
                    return false;
                }
            } else if (!b5.equals(cVar.f14492b)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        A a5 = this.f14491a;
        int hashCode = ((a5 == null ? 0 : a5.hashCode()) + 31) * 31;
        B b5 = this.f14492b;
        return hashCode + (b5 != null ? b5.hashCode() : 0);
    }

    public String toString() {
        return "first = " + this.f14491a + " , second = " + this.f14492b;
    }
}
