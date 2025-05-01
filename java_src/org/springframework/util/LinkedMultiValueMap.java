package org.springframework.util;

import java.io.Serializable;
import java.util.LinkedHashMap;
/* loaded from: classes7.dex */
public class LinkedMultiValueMap<K, V> extends LinkedHashMap<K, V> implements Serializable, Cloneable {
    public void add(K k4, V v2) {
        put(k4, v2);
    }
}
