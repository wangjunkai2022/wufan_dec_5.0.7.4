package com.fasterxml.jackson.core.util;

import java.util.concurrent.atomic.AtomicReferenceArray;
/* loaded from: classes3.dex */
public class BufferRecycler {
    public static final int BYTE_BASE64_CODEC_BUFFER = 3;
    public static final int BYTE_READ_IO_BUFFER = 0;
    public static final int BYTE_WRITE_CONCAT_BUFFER = 2;
    public static final int BYTE_WRITE_ENCODING_BUFFER = 1;
    public static final int CHAR_CONCAT_BUFFER = 1;
    public static final int CHAR_NAME_COPY_BUFFER = 3;
    public static final int CHAR_TEXT_BUFFER = 2;
    public static final int CHAR_TOKEN_BUFFER = 0;
    protected final AtomicReferenceArray<byte[]> _byteBuffers;
    protected final AtomicReferenceArray<char[]> _charBuffers;
    private static final int[] BYTE_BUFFER_LENGTHS = {8000, 8000, 2000, 2000};
    private static final int[] CHAR_BUFFER_LENGTHS = {4000, 4000, 200, 200};

    public BufferRecycler() {
        this(4, 4);
    }

    public final byte[] allocByteBuffer(int i4) {
        return allocByteBuffer(i4, 0);
    }

    public final char[] allocCharBuffer(int i4) {
        return allocCharBuffer(i4, 0);
    }

    protected byte[] balloc(int i4) {
        return new byte[i4];
    }

    protected int byteBufferLength(int i4) {
        return BYTE_BUFFER_LENGTHS[i4];
    }

    protected char[] calloc(int i4) {
        return new char[i4];
    }

    protected int charBufferLength(int i4) {
        return CHAR_BUFFER_LENGTHS[i4];
    }

    public void releaseByteBuffer(int i4, byte[] bArr) {
        this._byteBuffers.set(i4, bArr);
    }

    public void releaseCharBuffer(int i4, char[] cArr) {
        this._charBuffers.set(i4, cArr);
    }

    protected BufferRecycler(int i4, int i5) {
        this._byteBuffers = new AtomicReferenceArray<>(i4);
        this._charBuffers = new AtomicReferenceArray<>(i5);
    }

    public byte[] allocByteBuffer(int i4, int i5) {
        int byteBufferLength = byteBufferLength(i4);
        if (i5 < byteBufferLength) {
            i5 = byteBufferLength;
        }
        byte[] andSet = this._byteBuffers.getAndSet(i4, null);
        return (andSet == null || andSet.length < i5) ? balloc(i5) : andSet;
    }

    public char[] allocCharBuffer(int i4, int i5) {
        int charBufferLength = charBufferLength(i4);
        if (i5 < charBufferLength) {
            i5 = charBufferLength;
        }
        char[] andSet = this._charBuffers.getAndSet(i4, null);
        return (andSet == null || andSet.length < i5) ? calloc(i5) : andSet;
    }
}
