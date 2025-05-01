package io.netty.util.collection;

import java.util.Map;
/* loaded from: classes6.dex */
public interface ByteObjectMap<V> extends Map<Byte, V> {

    /* loaded from: classes6.dex */
    public interface PrimitiveEntry<V> {
        byte key();

        void setValue(V v2);

        V value();
    }

    boolean containsKey(byte b5);

    Iterable<PrimitiveEntry<V>> entries();

    V get(byte b5);

    V put(byte b5, V v2);

    V remove(byte b5);
}
