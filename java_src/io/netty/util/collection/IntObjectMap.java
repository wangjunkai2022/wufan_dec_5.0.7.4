package io.netty.util.collection;

import java.util.Map;
/* loaded from: classes6.dex */
public interface IntObjectMap<V> extends Map<Integer, V> {

    /* loaded from: classes6.dex */
    public interface PrimitiveEntry<V> {
        int key();

        void setValue(V v2);

        V value();
    }

    boolean containsKey(int i4);

    Iterable<PrimitiveEntry<V>> entries();

    V get(int i4);

    V put(int i4, V v2);

    V remove(int i4);
}
