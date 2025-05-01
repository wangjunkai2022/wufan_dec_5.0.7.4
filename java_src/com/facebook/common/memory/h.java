package com.facebook.common.memory;

import com.facebook.common.internal.VisibleForTesting;
import java.io.InputStream;
import javax.annotation.concurrent.NotThreadSafe;
/* compiled from: PooledByteBufferInputStream.java */
@NotThreadSafe
/* loaded from: classes2.dex */
public class h extends InputStream {
    @VisibleForTesting

    /* renamed from: b  reason: collision with root package name */
    final PooledByteBuffer f10882b;
    @VisibleForTesting

    /* renamed from: c  reason: collision with root package name */
    int f10883c;
    @VisibleForTesting

    /* renamed from: d  reason: collision with root package name */
    int f10884d;

    public h(PooledByteBuffer pooledByteBuffer) {
        com.facebook.common.internal.h.d(!pooledByteBuffer.isClosed());
        this.f10882b = (PooledByteBuffer) com.facebook.common.internal.h.i(pooledByteBuffer);
        this.f10883c = 0;
        this.f10884d = 0;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.f10882b.size() - this.f10883c;
    }

    @Override // java.io.InputStream
    public void mark(int i4) {
        this.f10884d = this.f10883c;
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public int read() {
        if (available() <= 0) {
            return -1;
        }
        PooledByteBuffer pooledByteBuffer = this.f10882b;
        int i4 = this.f10883c;
        this.f10883c = i4 + 1;
        return pooledByteBuffer.f(i4) & 255;
    }

    @Override // java.io.InputStream
    public void reset() {
        this.f10883c = this.f10884d;
    }

    @Override // java.io.InputStream
    public long skip(long j4) {
        com.facebook.common.internal.h.d(j4 >= 0);
        int min = Math.min((int) j4, available());
        this.f10883c += min;
        return min;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i4, int i5) {
        if (i4 >= 0 && i5 >= 0 && i4 + i5 <= bArr.length) {
            int available = available();
            if (available <= 0) {
                return -1;
            }
            if (i5 <= 0) {
                return 0;
            }
            int min = Math.min(available, i5);
            this.f10882b.c(this.f10883c, bArr, i4, min);
            this.f10883c += min;
            return min;
        }
        throw new ArrayIndexOutOfBoundsException("length=" + bArr.length + "; regionStart=" + i4 + "; regionLength=" + i5);
    }
}
