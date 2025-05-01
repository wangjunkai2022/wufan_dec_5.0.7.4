package io.netty.util.collection;

import java.util.Map;
/* loaded from: classes6.dex */
public interface ShortObjectMap<V> extends Map<Short, V> {

    /* loaded from: classes6.dex */
    public interface PrimitiveEntry<V> {
        short key();

        void setValue(V v2);

        V value();
    }

    boolean containsKey(short s4);

    Iterable<PrimitiveEntry<V>> entries();

    V get(short s4);

    V put(short s4, V v2);

    V remove(short s4);
}
