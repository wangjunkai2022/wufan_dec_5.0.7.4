package com.mob.tools.network;

import com.mob.tools.proguard.PublicMemberKeeper;
import java.io.IOException;
import java.io.InputStream;
/* loaded from: classes5.dex */
public class ByteCounterInputStream extends InputStream implements PublicMemberKeeper {

    /* renamed from: a  reason: collision with root package name */
    private InputStream f56794a;

    /* renamed from: b  reason: collision with root package name */
    private long f56795b;

    /* renamed from: c  reason: collision with root package name */
    private OnReadListener f56796c;

    public ByteCounterInputStream(InputStream inputStream) {
        this.f56794a = inputStream;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        return this.f56794a.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f56794a.close();
    }

    @Override // java.io.InputStream
    public void mark(int i4) {
        this.f56794a.mark(i4);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f56794a.markSupported();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        int read = this.f56794a.read();
        if (read >= 0) {
            long j4 = this.f56795b + 1;
            this.f56795b = j4;
            OnReadListener onReadListener = this.f56796c;
            if (onReadListener != null) {
                onReadListener.onRead(j4);
            }
        }
        return read;
    }

    @Override // java.io.InputStream
    public synchronized void reset() throws IOException {
        this.f56794a.reset();
        this.f56795b = 0L;
    }

    public void setOnInputStreamReadListener(OnReadListener onReadListener) {
        this.f56796c = onReadListener;
    }

    @Override // java.io.InputStream
    public long skip(long j4) throws IOException {
        return this.f56794a.skip(j4);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i4, int i5) throws IOException {
        int read = this.f56794a.read(bArr, i4, i5);
        if (read > 0) {
            long j4 = this.f56795b + read;
            this.f56795b = j4;
            OnReadListener onReadListener = this.f56796c;
            if (onReadListener != null) {
                onReadListener.onRead(j4);
            }
        }
        return read;
    }
}
