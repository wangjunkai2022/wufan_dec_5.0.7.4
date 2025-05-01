package io.netty.handler.codec;

import io.netty.handler.codec.Headers;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* loaded from: classes6.dex */
public class EmptyHeaders<K, V, T extends Headers<K, V, T>> implements Headers<K, V, T> {
    private T thisT() {
        return this;
    }

    @Override // io.netty.handler.codec.Headers
    public T add(K k4, V v2) {
        throw new UnsupportedOperationException("read only");
    }

    @Override // io.netty.handler.codec.Headers
    public T addBoolean(K k4, boolean z4) {
        throw new UnsupportedOperationException("read only");
    }

    @Override // io.netty.handler.codec.Headers
    public T addByte(K k4, byte b5) {
        throw new UnsupportedOperationException("read only");
    }

    @Override // io.netty.handler.codec.Headers
    public T addChar(K k4, char c5) {
        throw new UnsupportedOperationException("read only");
    }

    @Override // io.netty.handler.codec.Headers
    public T addDouble(K k4, double d5) {
        throw new UnsupportedOperationException("read only");
    }

    @Override // io.netty.handler.codec.Headers
    public T addFloat(K k4, float f5) {
        throw new UnsupportedOperationException("read only");
    }

    @Override // io.netty.handler.codec.Headers
    public T addInt(K k4, int i4) {
        throw new UnsupportedOperationException("read only");
    }

    @Override // io.netty.handler.codec.Headers
    public T addLong(K k4, long j4) {
        throw new UnsupportedOperationException("read only");
    }

    @Override // io.netty.handler.codec.Headers
    public T addObject(K k4, Object obj) {
        throw new UnsupportedOperationException("read only");
    }

    @Override // io.netty.handler.codec.Headers
    public T addShort(K k4, short s4) {
        throw new UnsupportedOperationException("read only");
    }

    @Override // io.netty.handler.codec.Headers
    public T addTimeMillis(K k4, long j4) {
        throw new UnsupportedOperationException("read only");
    }

    @Override // io.netty.handler.codec.Headers
    public T clear() {
        return thisT();
    }

    @Override // io.netty.handler.codec.Headers
    public boolean contains(K k4) {
        return false;
    }

    @Override // io.netty.handler.codec.Headers
    public boolean contains(K k4, V v2) {
        return false;
    }

    @Override // io.netty.handler.codec.Headers
    public boolean containsBoolean(K k4, boolean z4) {
        return false;
    }

    @Override // io.netty.handler.codec.Headers
    public boolean containsByte(K k4, byte b5) {
        return false;
    }

    @Override // io.netty.handler.codec.Headers
    public boolean containsChar(K k4, char c5) {
        return false;
    }

    @Override // io.netty.handler.codec.Headers
    public boolean containsDouble(K k4, double d5) {
        return false;
    }

    @Override // io.netty.handler.codec.Headers
    public boolean containsFloat(K k4, float f5) {
        return false;
    }

    @Override // io.netty.handler.codec.Headers
    public boolean containsInt(K k4, int i4) {
        return false;
    }

    @Override // io.netty.handler.codec.Headers
    public boolean containsLong(K k4, long j4) {
        return false;
    }

    @Override // io.netty.handler.codec.Headers
    public boolean containsObject(K k4, Object obj) {
        return false;
    }

    @Override // io.netty.handler.codec.Headers
    public boolean containsShort(K k4, short s4) {
        return false;
    }

    @Override // io.netty.handler.codec.Headers
    public boolean containsTimeMillis(K k4, long j4) {
        return false;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Headers) {
            return isEmpty() && ((Headers) obj).isEmpty();
        }
        return false;
    }

    @Override // io.netty.handler.codec.Headers
    public V get(K k4) {
        return null;
    }

    @Override // io.netty.handler.codec.Headers
    public V get(K k4, V v2) {
        return v2;
    }

    @Override // io.netty.handler.codec.Headers
    public List<V> getAll(K k4) {
        return Collections.emptyList();
    }

    @Override // io.netty.handler.codec.Headers
    public List<V> getAllAndRemove(K k4) {
        return Collections.emptyList();
    }

    @Override // io.netty.handler.codec.Headers
    public V getAndRemove(K k4) {
        return null;
    }

    @Override // io.netty.handler.codec.Headers
    public V getAndRemove(K k4, V v2) {
        return v2;
    }

    @Override // io.netty.handler.codec.Headers
    public Boolean getBoolean(K k4) {
        return null;
    }

    @Override // io.netty.handler.codec.Headers
    public boolean getBoolean(K k4, boolean z4) {
        return z4;
    }

    @Override // io.netty.handler.codec.Headers
    public Boolean getBooleanAndRemove(K k4) {
        return null;
    }

    @Override // io.netty.handler.codec.Headers
    public boolean getBooleanAndRemove(K k4, boolean z4) {
        return z4;
    }

    @Override // io.netty.handler.codec.Headers
    public byte getByte(K k4, byte b5) {
        return b5;
    }

    @Override // io.netty.handler.codec.Headers
    public Byte getByte(K k4) {
        return null;
    }

    @Override // io.netty.handler.codec.Headers
    public byte getByteAndRemove(K k4, byte b5) {
        return b5;
    }

    @Override // io.netty.handler.codec.Headers
    public Byte getByteAndRemove(K k4) {
        return null;
    }

    @Override // io.netty.handler.codec.Headers
    public char getChar(K k4, char c5) {
        return c5;
    }

    @Override // io.netty.handler.codec.Headers
    public Character getChar(K k4) {
        return null;
    }

    @Override // io.netty.handler.codec.Headers
    public char getCharAndRemove(K k4, char c5) {
        return c5;
    }

    @Override // io.netty.handler.codec.Headers
    public Character getCharAndRemove(K k4) {
        return null;
    }

    @Override // io.netty.handler.codec.Headers
    public double getDouble(K k4, double d5) {
        return d5;
    }

    @Override // io.netty.handler.codec.Headers
    public Double getDouble(K k4) {
        return null;
    }

    @Override // io.netty.handler.codec.Headers
    public double getDoubleAndRemove(K k4, double d5) {
        return d5;
    }

    @Override // io.netty.handler.codec.Headers
    public Double getDoubleAndRemove(K k4) {
        return null;
    }

    @Override // io.netty.handler.codec.Headers
    public float getFloat(K k4, float f5) {
        return f5;
    }

    @Override // io.netty.handler.codec.Headers
    public Float getFloat(K k4) {
        return null;
    }

    @Override // io.netty.handler.codec.Headers
    public float getFloatAndRemove(K k4, float f5) {
        return f5;
    }

    @Override // io.netty.handler.codec.Headers
    public Float getFloatAndRemove(K k4) {
        return null;
    }

    @Override // io.netty.handler.codec.Headers
    public int getInt(K k4, int i4) {
        return i4;
    }

    @Override // io.netty.handler.codec.Headers
    public Integer getInt(K k4) {
        return null;
    }

    @Override // io.netty.handler.codec.Headers
    public int getIntAndRemove(K k4, int i4) {
        return i4;
    }

    @Override // io.netty.handler.codec.Headers
    public Integer getIntAndRemove(K k4) {
        return null;
    }

    @Override // io.netty.handler.codec.Headers
    public long getLong(K k4, long j4) {
        return j4;
    }

    @Override // io.netty.handler.codec.Headers
    public Long getLong(K k4) {
        return null;
    }

    @Override // io.netty.handler.codec.Headers
    public long getLongAndRemove(K k4, long j4) {
        return j4;
    }

    @Override // io.netty.handler.codec.Headers
    public Long getLongAndRemove(K k4) {
        return null;
    }

    @Override // io.netty.handler.codec.Headers
    public Short getShort(K k4) {
        return null;
    }

    @Override // io.netty.handler.codec.Headers
    public short getShort(K k4, short s4) {
        return s4;
    }

    @Override // io.netty.handler.codec.Headers
    public Short getShortAndRemove(K k4) {
        return null;
    }

    @Override // io.netty.handler.codec.Headers
    public short getShortAndRemove(K k4, short s4) {
        return s4;
    }

    @Override // io.netty.handler.codec.Headers
    public long getTimeMillis(K k4, long j4) {
        return j4;
    }

    @Override // io.netty.handler.codec.Headers
    public Long getTimeMillis(K k4) {
        return null;
    }

    @Override // io.netty.handler.codec.Headers
    public long getTimeMillisAndRemove(K k4, long j4) {
        return j4;
    }

    @Override // io.netty.handler.codec.Headers
    public Long getTimeMillisAndRemove(K k4) {
        return null;
    }

    public int hashCode() {
        return -1028477387;
    }

    @Override // io.netty.handler.codec.Headers
    public boolean isEmpty() {
        return true;
    }

    @Override // io.netty.handler.codec.Headers, java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        return Collections.emptyList().iterator();
    }

    @Override // io.netty.handler.codec.Headers
    public Set<K> names() {
        return Collections.emptySet();
    }

    @Override // io.netty.handler.codec.Headers
    public boolean remove(K k4) {
        return false;
    }

    @Override // io.netty.handler.codec.Headers
    public T set(K k4, V v2) {
        throw new UnsupportedOperationException("read only");
    }

    @Override // io.netty.handler.codec.Headers
    public T setAll(Headers<? extends K, ? extends V, ?> headers) {
        throw new UnsupportedOperationException("read only");
    }

    @Override // io.netty.handler.codec.Headers
    public T setBoolean(K k4, boolean z4) {
        throw new UnsupportedOperationException("read only");
    }

    @Override // io.netty.handler.codec.Headers
    public T setByte(K k4, byte b5) {
        throw new UnsupportedOperationException("read only");
    }

    @Override // io.netty.handler.codec.Headers
    public T setChar(K k4, char c5) {
        throw new UnsupportedOperationException("read only");
    }

    @Override // io.netty.handler.codec.Headers
    public T setDouble(K k4, double d5) {
        throw new UnsupportedOperationException("read only");
    }

    @Override // io.netty.handler.codec.Headers
    public T setFloat(K k4, float f5) {
        throw new UnsupportedOperationException("read only");
    }

    @Override // io.netty.handler.codec.Headers
    public T setInt(K k4, int i4) {
        throw new UnsupportedOperationException("read only");
    }

    @Override // io.netty.handler.codec.Headers
    public T setLong(K k4, long j4) {
        throw new UnsupportedOperationException("read only");
    }

    @Override // io.netty.handler.codec.Headers
    public T setObject(K k4, Object obj) {
        throw new UnsupportedOperationException("read only");
    }

    @Override // io.netty.handler.codec.Headers
    public T setShort(K k4, short s4) {
        throw new UnsupportedOperationException("read only");
    }

    @Override // io.netty.handler.codec.Headers
    public T setTimeMillis(K k4, long j4) {
        throw new UnsupportedOperationException("read only");
    }

    @Override // io.netty.handler.codec.Headers
    public int size() {
        return 0;
    }

    public String toString() {
        return getClass().getSimpleName() + "[]";
    }

    public Iterator<V> valueIterator(K k4) {
        return Collections.emptyList().iterator();
    }

    @Override // io.netty.handler.codec.Headers
    public T add(K k4, Iterable<? extends V> iterable) {
        throw new UnsupportedOperationException("read only");
    }

    @Override // io.netty.handler.codec.Headers
    public T addObject(K k4, Iterable<?> iterable) {
        throw new UnsupportedOperationException("read only");
    }

    @Override // io.netty.handler.codec.Headers
    public T set(K k4, Iterable<? extends V> iterable) {
        throw new UnsupportedOperationException("read only");
    }

    @Override // io.netty.handler.codec.Headers
    public T setObject(K k4, Iterable<?> iterable) {
        throw new UnsupportedOperationException("read only");
    }

    @Override // io.netty.handler.codec.Headers
    public T add(K k4, V... vArr) {
        throw new UnsupportedOperationException("read only");
    }

    @Override // io.netty.handler.codec.Headers
    public T addObject(K k4, Object... objArr) {
        throw new UnsupportedOperationException("read only");
    }

    @Override // io.netty.handler.codec.Headers
    public T set(K k4, V... vArr) {
        throw new UnsupportedOperationException("read only");
    }

    @Override // io.netty.handler.codec.Headers
    public T setObject(K k4, Object... objArr) {
        throw new UnsupportedOperationException("read only");
    }

    @Override // io.netty.handler.codec.Headers
    public T add(Headers<? extends K, ? extends V, ?> headers) {
        throw new UnsupportedOperationException("read only");
    }

    @Override // io.netty.handler.codec.Headers
    public T set(Headers<? extends K, ? extends V, ?> headers) {
        throw new UnsupportedOperationException("read only");
    }
}
