package com.kwad.components.core.p;

import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import java.io.InputStream;
/* loaded from: classes5.dex */
public final class c extends InputStream {
    private InputStream ST;
    private int SU;
    private volatile float SW;
    private volatile long SX;
    private int SQ = -1;
    private int SR = 10000;
    private long SS = -1;
    private long SV = -1;
    private int SY = 20480;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(@NonNull InputStream inputStream, int i4) {
        i4 = i4 < 20480 ? 20480 : i4;
        this.ST = inputStream;
        this.SW = i4 / 1000.0f;
    }

    @WorkerThread
    private static void H(long j4) {
        try {
            Thread.sleep(j4);
        } catch (InterruptedException e5) {
            e5.printStackTrace();
        }
    }

    private static long g(long j4, long j5) {
        if (j4 <= 0) {
            return 0L;
        }
        if (j5 <= 0) {
            return -1L;
        }
        return j4 / j5;
    }

    private void rh() {
        this.SQ = 0;
        this.SS = System.currentTimeMillis();
    }

    private void ri() {
        if (this.SQ < this.SR) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j4 = currentTimeMillis - this.SS;
        float f5 = this.SQ / this.SW;
        this.SX = g(this.SU, currentTimeMillis - this.SV);
        float f6 = (float) j4;
        if (f5 > f6) {
            H(f5 - f6);
        }
        rh();
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.ST.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.ST.close();
        b.a(this);
        this.SV = -1L;
    }

    @Override // java.io.InputStream
    public final synchronized void mark(int i4) {
        this.ST.mark(i4);
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return this.ST.markSupported();
    }

    @Override // java.io.InputStream
    public final int read() {
        if (this.SV <= 0) {
            this.SV = System.currentTimeMillis();
        }
        this.SU++;
        if (!(b.SO && b.SN)) {
            return this.ST.read();
        }
        if (this.SQ < 0) {
            rh();
        }
        int read = this.ST.read();
        this.SQ++;
        ri();
        return read;
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        this.ST.reset();
    }

    public final long rg() {
        return this.SX;
    }

    @Override // java.io.InputStream
    public final long skip(long j4) {
        return this.ST.skip(j4);
    }
}
