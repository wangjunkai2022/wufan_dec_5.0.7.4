package com.googlecode.mp4parser.util;

import java.lang.Comparable;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
/* compiled from: RangeStartMap.java */
/* loaded from: classes3.dex */
public class n<K extends Comparable, V> implements Map<K, V> {

    /* renamed from: b  reason: collision with root package name */
    TreeMap<K, V> f14249b = new TreeMap<>(new a());

    /* compiled from: RangeStartMap.java */
    /* loaded from: classes3.dex */
    class a implements Comparator<K> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(K k4, K k5) {
            return -k4.compareTo(k5);
        }
    }

    public n() {
    }

    @Override // java.util.Map
    /* renamed from: a */
    public V put(K k4, V v2) {
        return this.f14249b.put(k4, v2);
    }

    @Override // java.util.Map
    public void clear() {
        this.f14249b.clear();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.f14249b.get(obj) != null;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return false;
    }

    @Override // java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        return this.f14249b.entrySet();
    }

    @Override // java.util.Map
    public V get(Object obj) {
        if (!(obj instanceof Comparable)) {
            return null;
        }
        Comparable comparable = (Comparable) obj;
        if (isEmpty()) {
            return null;
        }
        Iterator<K> it2 = this.f14249b.keySet().iterator();
        K next = it2.next();
        while (true) {
            K k4 = next;
            if (it2.hasNext()) {
                if (comparable.compareTo(k4) < 0) {
                    next = it2.next();
                } else {
                    return this.f14249b.get(k4);
                }
            } else {
                return this.f14249b.get(k4);
            }
        }
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.f14249b.isEmpty();
    }

    @Override // java.util.Map
    public Set<K> keySet() {
        return this.f14249b.keySet();
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        this.f14249b.putAll(map);
    }

    @Override // java.util.Map
    public V remove(Object obj) {
        if (!(obj instanceof Comparable)) {
            return null;
        }
        Comparable comparable = (Comparable) obj;
        if (isEmpty()) {
            return null;
        }
        Iterator<K> it2 = this.f14249b.keySet().iterator();
        K next = it2.next();
        while (true) {
            K k4 = next;
            if (it2.hasNext()) {
                if (comparable.compareTo(k4) < 0) {
                    next = it2.next();
                } else {
                    return this.f14249b.remove(k4);
                }
            } else {
                return this.f14249b.remove(k4);
            }
        }
    }

    @Override // java.util.Map
    public int size() {
        return this.f14249b.size();
    }

    @Override // java.util.Map
    public Collection<V> values() {
        return this.f14249b.values();
    }

    public n(K k4, V v2) {
        put(k4, v2);
    }
}
