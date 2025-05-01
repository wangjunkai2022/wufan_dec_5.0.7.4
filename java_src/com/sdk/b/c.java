package com.sdk.b;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
/* loaded from: classes5.dex */
public class c<K, V> {

    /* renamed from: a  reason: collision with root package name */
    public final LinkedHashMap<K, V> f59989a;

    /* renamed from: b  reason: collision with root package name */
    public int f59990b;

    /* renamed from: c  reason: collision with root package name */
    public int f59991c;

    /* renamed from: d  reason: collision with root package name */
    public b<K, Long> f59992d;

    public c(int i4) {
        if (i4 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f59991c = i4;
        this.f59989a = new LinkedHashMap<>(0, 0.75f, true);
        this.f59992d = new b<>(0, 0.75f);
    }

    public final int a(K k4, V v2) {
        int b5 = b(k4, v2);
        if (b5 <= 0) {
            this.f59990b = 0;
            for (Map.Entry<K, V> entry : this.f59989a.entrySet()) {
                this.f59990b = b(entry.getKey(), entry.getValue()) + this.f59990b;
            }
        }
        return b5;
    }

    public final V a(K k4) {
        Objects.requireNonNull(k4, "key == null");
        synchronized (this) {
            if (!this.f59992d.containsKey(k4)) {
                b(k4);
                return null;
            }
            V v2 = this.f59989a.get(k4);
            if (v2 != null) {
                return v2;
            }
            return null;
        }
    }

    public final V a(K k4, V v2, long j4) {
        V put;
        if (k4 == null || v2 == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            this.f59990b += a(k4, v2);
            put = this.f59989a.put(k4, v2);
            this.f59992d.put(k4, Long.valueOf(j4));
            if (put != null) {
                this.f59990b -= a(k4, put);
            }
        }
        a(this.f59991c);
        return put;
    }

    public final void a(int i4) {
        while (true) {
            synchronized (this) {
                if (this.f59990b <= i4 || this.f59989a.isEmpty()) {
                    break;
                }
                Map.Entry<K, V> next = this.f59989a.entrySet().iterator().next();
                K key = next.getKey();
                V value = next.getValue();
                this.f59989a.remove(key);
                this.f59992d.remove((Object) key);
                this.f59990b -= a(key, value);
            }
        }
    }

    public int b(K k4, V v2) {
        throw null;
    }

    public final V b(K k4) {
        V remove;
        Objects.requireNonNull(k4, "key == null");
        synchronized (this) {
            remove = this.f59989a.remove(k4);
            this.f59992d.remove((Object) k4);
            if (remove != null) {
                this.f59990b -= a(k4, remove);
            }
        }
        return remove;
    }
}
