package io.netty.handler.codec;

import io.netty.handler.codec.Headers;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* loaded from: classes6.dex */
public interface Headers<K, V, T extends Headers<K, V, T>> extends Iterable<Map.Entry<K, V>> {
    T add(Headers<? extends K, ? extends V, ?> headers);

    T add(K k4, Iterable<? extends V> iterable);

    T add(K k4, V v2);

    T add(K k4, V... vArr);

    T addBoolean(K k4, boolean z4);

    T addByte(K k4, byte b5);

    T addChar(K k4, char c5);

    T addDouble(K k4, double d5);

    T addFloat(K k4, float f5);

    T addInt(K k4, int i4);

    T addLong(K k4, long j4);

    T addObject(K k4, Iterable<?> iterable);

    T addObject(K k4, Object obj);

    T addObject(K k4, Object... objArr);

    T addShort(K k4, short s4);

    T addTimeMillis(K k4, long j4);

    T clear();

    boolean contains(K k4);

    boolean contains(K k4, V v2);

    boolean containsBoolean(K k4, boolean z4);

    boolean containsByte(K k4, byte b5);

    boolean containsChar(K k4, char c5);

    boolean containsDouble(K k4, double d5);

    boolean containsFloat(K k4, float f5);

    boolean containsInt(K k4, int i4);

    boolean containsLong(K k4, long j4);

    boolean containsObject(K k4, Object obj);

    boolean containsShort(K k4, short s4);

    boolean containsTimeMillis(K k4, long j4);

    V get(K k4);

    V get(K k4, V v2);

    List<V> getAll(K k4);

    List<V> getAllAndRemove(K k4);

    V getAndRemove(K k4);

    V getAndRemove(K k4, V v2);

    Boolean getBoolean(K k4);

    boolean getBoolean(K k4, boolean z4);

    Boolean getBooleanAndRemove(K k4);

    boolean getBooleanAndRemove(K k4, boolean z4);

    byte getByte(K k4, byte b5);

    Byte getByte(K k4);

    byte getByteAndRemove(K k4, byte b5);

    Byte getByteAndRemove(K k4);

    char getChar(K k4, char c5);

    Character getChar(K k4);

    char getCharAndRemove(K k4, char c5);

    Character getCharAndRemove(K k4);

    double getDouble(K k4, double d5);

    Double getDouble(K k4);

    double getDoubleAndRemove(K k4, double d5);

    Double getDoubleAndRemove(K k4);

    float getFloat(K k4, float f5);

    Float getFloat(K k4);

    float getFloatAndRemove(K k4, float f5);

    Float getFloatAndRemove(K k4);

    int getInt(K k4, int i4);

    Integer getInt(K k4);

    int getIntAndRemove(K k4, int i4);

    Integer getIntAndRemove(K k4);

    long getLong(K k4, long j4);

    Long getLong(K k4);

    long getLongAndRemove(K k4, long j4);

    Long getLongAndRemove(K k4);

    Short getShort(K k4);

    short getShort(K k4, short s4);

    Short getShortAndRemove(K k4);

    short getShortAndRemove(K k4, short s4);

    long getTimeMillis(K k4, long j4);

    Long getTimeMillis(K k4);

    long getTimeMillisAndRemove(K k4, long j4);

    Long getTimeMillisAndRemove(K k4);

    boolean isEmpty();

    @Override // java.lang.Iterable
    Iterator<Map.Entry<K, V>> iterator();

    Set<K> names();

    boolean remove(K k4);

    T set(Headers<? extends K, ? extends V, ?> headers);

    T set(K k4, Iterable<? extends V> iterable);

    T set(K k4, V v2);

    T set(K k4, V... vArr);

    T setAll(Headers<? extends K, ? extends V, ?> headers);

    T setBoolean(K k4, boolean z4);

    T setByte(K k4, byte b5);

    T setChar(K k4, char c5);

    T setDouble(K k4, double d5);

    T setFloat(K k4, float f5);

    T setInt(K k4, int i4);

    T setLong(K k4, long j4);

    T setObject(K k4, Iterable<?> iterable);

    T setObject(K k4, Object obj);

    T setObject(K k4, Object... objArr);

    T setShort(K k4, short s4);

    T setTimeMillis(K k4, long j4);

    int size();
}
