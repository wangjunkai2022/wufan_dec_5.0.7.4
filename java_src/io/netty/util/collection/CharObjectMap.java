package io.netty.util.collection;

import java.util.Map;
/* loaded from: classes6.dex */
public interface CharObjectMap<V> extends Map<Character, V> {

    /* loaded from: classes6.dex */
    public interface PrimitiveEntry<V> {
        char key();

        void setValue(V v2);

        V value();
    }

    boolean containsKey(char c5);

    Iterable<PrimitiveEntry<V>> entries();

    V get(char c5);

    V put(char c5, V v2);

    V remove(char c5);
}
