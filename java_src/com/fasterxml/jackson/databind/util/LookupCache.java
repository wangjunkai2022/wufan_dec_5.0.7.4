package com.fasterxml.jackson.databind.util;
/* loaded from: classes3.dex */
public interface LookupCache<K, V> {
    void clear();

    V get(Object obj);

    V put(K k4, V v2);

    V putIfAbsent(K k4, V v2);

    int size();
}
