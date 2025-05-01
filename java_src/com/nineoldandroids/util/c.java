package com.nineoldandroids.util;
/* compiled from: Property.java */
/* loaded from: classes5.dex */
public abstract class c<T, V> {

    /* renamed from: a  reason: collision with root package name */
    private final String f57788a;

    /* renamed from: b  reason: collision with root package name */
    private final Class<V> f57789b;

    public c(Class<V> cls, String str) {
        this.f57788a = str;
        this.f57789b = cls;
    }

    public static <T, V> c<T, V> d(Class<T> cls, Class<V> cls2, String str) {
        return new d(cls, cls2, str);
    }

    public abstract V a(T t4);

    public String b() {
        return this.f57788a;
    }

    public boolean c() {
        return false;
    }

    public void e(T t4, V v2) {
        throw new UnsupportedOperationException("Property " + b() + " is read-only");
    }

    public Class<V> getType() {
        return this.f57789b;
    }
}
