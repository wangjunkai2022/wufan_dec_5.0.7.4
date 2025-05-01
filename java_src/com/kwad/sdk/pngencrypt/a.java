package com.kwad.sdk.pngencrypt;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
/* loaded from: classes5.dex */
public class a implements Closeable {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private int aKW;
    private boolean aKX;
    private long aKY;
    private byte[] buf;
    private boolean eof;
    private int offset;
    private InputStream stream;

    public a(InputStream inputStream) {
        this(inputStream, 16384);
    }

    private void Kg() {
        if (this.aKW > 0 || this.eof) {
            return;
        }
        try {
            this.offset = 0;
            int read = this.stream.read(this.buf);
            this.aKW = read;
            if (read == 0) {
                com.kwad.sdk.core.e.c.printStackTrace(new PngjException("This should not happen: stream.read(buf) returned 0"));
            } else if (read < 0) {
                close();
            } else {
                this.aKY += read;
            }
        } catch (IOException e5) {
            com.kwad.sdk.core.e.c.printStackTrace(new PngjException(e5));
        }
    }

    public final int a(f fVar) {
        return a(fVar, Integer.MAX_VALUE);
    }

    public final int b(f fVar, int i4) {
        int i5 = 36;
        while (i5 > 0) {
            int a5 = a(fVar, i5);
            if (a5 <= 0) {
                return a5;
            }
            i5 -= a5;
        }
        return 36;
    }

    public final void bF(boolean z4) {
        this.aKX = z4;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.eof = true;
        this.buf = null;
        this.aKW = 0;
        this.offset = 0;
        InputStream inputStream = this.stream;
        if (inputStream != null && this.aKX) {
            com.kwad.sdk.crash.utils.b.closeQuietly(inputStream);
        }
        this.stream = null;
    }

    private a(InputStream inputStream, int i4) {
        this.eof = false;
        this.aKX = true;
        this.aKY = 0L;
        this.stream = inputStream;
        this.buf = new byte[16384];
    }

    private int a(f fVar, int i4) {
        Kg();
        if (i4 <= 0 || i4 >= this.aKW) {
            i4 = this.aKW;
        }
        if (i4 > 0) {
            int b5 = fVar.b(this.buf, this.offset, i4);
            if (b5 > 0) {
                this.offset += b5;
                this.aKW -= b5;
            }
            if (b5 > 0) {
                return b5;
            }
            if (!fVar.isDone()) {
                com.kwad.sdk.core.e.c.printStackTrace(new PngjException("This should not happen!"));
            }
            return -1;
        }
        if (!this.eof) {
            com.kwad.sdk.core.e.c.printStackTrace(new PngjException("This should not happen"));
        }
        return fVar.isDone() ? -1 : 0;
    }
}
