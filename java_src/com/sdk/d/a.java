package com.sdk.d;
/* loaded from: classes5.dex */
public class a<T> {

    /* renamed from: a  reason: collision with root package name */
    public boolean f59994a = false;

    /* renamed from: b  reason: collision with root package name */
    public h<?> f59995b;

    /* renamed from: c  reason: collision with root package name */
    public a<T> f59996c;

    public a(T t4) {
        a(t4);
    }

    public b a() {
        return this.f59995b.f60023a;
    }

    public void a(T t4) {
        if (t4 == null) {
            this.f59995b = null;
        } else if (!(t4 instanceof h)) {
            this.f59995b = new h<>(b.DEFAULT, t4);
        } else {
            this.f59995b = (h) t4;
            this.f59994a = true;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.sdk.d.h, T, com.sdk.d.h<?>] */
    public T b() {
        ?? r02 = (T) this.f59995b;
        if (r02 == 0) {
            return null;
        }
        return this.f59994a ? r02 : (T) r02.f60024b;
    }
}
