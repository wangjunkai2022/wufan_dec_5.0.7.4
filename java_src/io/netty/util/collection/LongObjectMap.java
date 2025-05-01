package io.netty.util.collection;

import java.util.Map;
/* loaded from: classes6.dex */
public interface LongObjectMap<V> extends Map<Long, V> {

    /* loaded from: classes6.dex */
    public interface PrimitiveEntry<V> {
        long key();

        void setValue(V v2);

        V value();
    }

    boolean containsKey(long j4);

    Iterable<PrimitiveEntry<V>> entries();

    V get(long j4);

    V put(long j4, V v2);

    V remove(long j4);
}
