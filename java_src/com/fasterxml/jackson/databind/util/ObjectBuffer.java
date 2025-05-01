package com.fasterxml.jackson.databind.util;

import java.lang.reflect.Array;
import java.util.List;
/* loaded from: classes3.dex */
public final class ObjectBuffer {
    private static final int MAX_CHUNK = 262144;
    private static final int SMALL_CHUNK = 16384;
    private Object[] _freeBuffer;
    private LinkedNode<Object[]> _head;
    private int _size;
    private LinkedNode<Object[]> _tail;

    protected final void _copyTo(Object obj, int i4, Object[] objArr, int i5) {
        int i6 = 0;
        for (LinkedNode<Object[]> linkedNode = this._head; linkedNode != null; linkedNode = linkedNode.next()) {
            Object[] value = linkedNode.value();
            int length = value.length;
            System.arraycopy(value, 0, obj, i6, length);
            i6 += length;
        }
        System.arraycopy(objArr, 0, obj, i6, i5);
        int i7 = i6 + i5;
        if (i7 == i4) {
            return;
        }
        throw new IllegalStateException("Should have gotten " + i4 + " entries, got " + i7);
    }

    protected void _reset() {
        LinkedNode<Object[]> linkedNode = this._tail;
        if (linkedNode != null) {
            this._freeBuffer = linkedNode.value();
        }
        this._tail = null;
        this._head = null;
        this._size = 0;
    }

    public Object[] appendCompletedChunk(Object[] objArr) {
        LinkedNode<Object[]> linkedNode = new LinkedNode<>(objArr, null);
        if (this._head == null) {
            this._tail = linkedNode;
            this._head = linkedNode;
        } else {
            this._tail.linkNext(linkedNode);
            this._tail = linkedNode;
        }
        int length = objArr.length;
        this._size += length;
        if (length < 16384) {
            length += length;
        } else if (length < 262144) {
            length += length >> 2;
        }
        return new Object[length];
    }

    public int bufferedSize() {
        return this._size;
    }

    public Object[] completeAndClearBuffer(Object[] objArr, int i4) {
        int i5 = this._size + i4;
        Object[] objArr2 = new Object[i5];
        _copyTo(objArr2, i5, objArr, i4);
        _reset();
        return objArr2;
    }

    public int initialCapacity() {
        Object[] objArr = this._freeBuffer;
        if (objArr == null) {
            return 0;
        }
        return objArr.length;
    }

    public Object[] resetAndStart() {
        _reset();
        Object[] objArr = this._freeBuffer;
        if (objArr == null) {
            Object[] objArr2 = new Object[12];
            this._freeBuffer = objArr2;
            return objArr2;
        }
        return objArr;
    }

    public Object[] resetAndStart(Object[] objArr, int i4) {
        _reset();
        Object[] objArr2 = this._freeBuffer;
        if (objArr2 == null || objArr2.length < i4) {
            this._freeBuffer = new Object[Math.max(12, i4)];
        }
        System.arraycopy(objArr, 0, this._freeBuffer, 0, i4);
        return this._freeBuffer;
    }

    public <T> T[] completeAndClearBuffer(Object[] objArr, int i4, Class<T> cls) {
        int i5 = this._size + i4;
        T[] tArr = (T[]) ((Object[]) Array.newInstance((Class<?>) cls, i5));
        _copyTo(tArr, i5, objArr, i4);
        _reset();
        return tArr;
    }

    public void completeAndClearBuffer(Object[] objArr, int i4, List<Object> list) {
        int i5;
        LinkedNode<Object[]> linkedNode = this._head;
        while (true) {
            i5 = 0;
            if (linkedNode == null) {
                break;
            }
            Object[] value = linkedNode.value();
            int length = value.length;
            while (i5 < length) {
                list.add(value[i5]);
                i5++;
            }
            linkedNode = linkedNode.next();
        }
        while (i5 < i4) {
            list.add(objArr[i5]);
            i5++;
        }
        _reset();
    }
}
