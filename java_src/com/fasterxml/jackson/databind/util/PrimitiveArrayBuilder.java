package com.fasterxml.jackson.databind.util;
/* loaded from: classes3.dex */
public abstract class PrimitiveArrayBuilder<T> {
    static final int INITIAL_CHUNK_SIZE = 12;
    static final int MAX_CHUNK_SIZE = 262144;
    static final int SMALL_CHUNK_SIZE = 16384;
    protected Node<T> _bufferHead;
    protected Node<T> _bufferTail;
    protected int _bufferedEntryCount;
    protected T _freeBuffer;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class Node<T> {
        final T _data;
        final int _dataLength;
        Node<T> _next;

        public Node(T t4, int i4) {
            this._data = t4;
            this._dataLength = i4;
        }

        public int copyData(T t4, int i4) {
            System.arraycopy(this._data, 0, t4, i4, this._dataLength);
            return i4 + this._dataLength;
        }

        public T getData() {
            return this._data;
        }

        public void linkNext(Node<T> node) {
            if (this._next == null) {
                this._next = node;
                return;
            }
            throw new IllegalStateException();
        }

        public Node<T> next() {
            return this._next;
        }
    }

    protected abstract T _constructArray(int i4);

    protected void _reset() {
        Node<T> node = this._bufferTail;
        if (node != null) {
            this._freeBuffer = node.getData();
        }
        this._bufferTail = null;
        this._bufferHead = null;
        this._bufferedEntryCount = 0;
    }

    public final T appendCompletedChunk(T t4, int i4) {
        Node<T> node = new Node<>(t4, i4);
        if (this._bufferHead == null) {
            this._bufferTail = node;
            this._bufferHead = node;
        } else {
            this._bufferTail.linkNext(node);
            this._bufferTail = node;
        }
        this._bufferedEntryCount += i4;
        return _constructArray(i4 < 16384 ? i4 + i4 : i4 + (i4 >> 2));
    }

    public int bufferedSize() {
        return this._bufferedEntryCount;
    }

    public T completeAndClearBuffer(T t4, int i4) {
        int i5 = this._bufferedEntryCount + i4;
        T _constructArray = _constructArray(i5);
        int i6 = 0;
        for (Node<T> node = this._bufferHead; node != null; node = node.next()) {
            i6 = node.copyData(_constructArray, i6);
        }
        System.arraycopy(t4, 0, _constructArray, i6, i4);
        int i7 = i6 + i4;
        if (i7 == i5) {
            return _constructArray;
        }
        throw new IllegalStateException("Should have gotten " + i5 + " entries, got " + i7);
    }

    public T resetAndStart() {
        _reset();
        T t4 = this._freeBuffer;
        return t4 == null ? _constructArray(12) : t4;
    }
}
