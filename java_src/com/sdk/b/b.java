package com.sdk.b;

import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes5.dex */
public class b<K, V> extends ConcurrentHashMap<K, Long> {
    public static final long serialVersionUID = 5514969596535320724L;

    public b(int i4, float f5) {
        super(i4, f5, 16);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
    /* renamed from: a */
    public synchronized Long put(K k4, Long l4) {
        if (containsKey(k4)) {
            remove((Object) k4);
        }
        return (Long) super.put(k4, l4);
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
    public synchronized void clear() {
        super.clear();
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
    public synchronized boolean containsKey(Object obj) {
        boolean z4;
        z4 = false;
        Long l4 = (Long) super.get(obj);
        if (l4 == null || System.currentTimeMillis() >= l4.longValue()) {
            remove(obj);
        } else {
            z4 = true;
        }
        return z4;
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
    public synchronized Long get(Object obj) {
        if (containsKey(obj)) {
            return (Long) super.get(obj);
        }
        return null;
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
    public synchronized Long remove(Object obj) {
        return (Long) super.remove(obj);
    }
}
