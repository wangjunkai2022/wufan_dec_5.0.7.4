package com.bykv.vk.openvk.api.proto;

import java.util.Set;
/* loaded from: classes2.dex */
public interface ValueSet {

    /* loaded from: classes2.dex */
    public interface ValueGetter<T> {
        T get();
    }

    <T> T[] arrayValue(int i4, Class<T> cls);

    boolean booleanValue(int i4);

    boolean booleanValue(int i4, boolean z4);

    boolean containsKey(int i4);

    double doubleValue(int i4);

    float floatValue(int i4);

    float floatValue(int i4, float f5);

    int intValue(int i4);

    int intValue(int i4, int i5);

    boolean isEmpty();

    Set<Integer> keys();

    long longValue(int i4);

    long longValue(int i4, long j4);

    <T> T objectValue(int i4, Class<T> cls);

    int size();

    String stringValue(int i4);

    String stringValue(int i4, String str);
}
