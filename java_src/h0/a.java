package h0;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;
/* compiled from: LimitedInputStream.java */
/* loaded from: classes2.dex */
public class a extends FilterInputStream {

    /* renamed from: b  reason: collision with root package name */
    private int f69126b;

    /* renamed from: c  reason: collision with root package name */
    private int f69127c;

    public a(InputStream inputStream, int i4) {
        super(inputStream);
        Objects.requireNonNull(inputStream);
        if (i4 >= 0) {
            this.f69126b = i4;
            this.f69127c = -1;
            return;
        }
        throw new IllegalArgumentException("limit must be >= 0");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() throws IOException {
        return Math.min(((FilterInputStream) this).in.available(), this.f69126b);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i4) {
        if (((FilterInputStream) this).in.markSupported()) {
            ((FilterInputStream) this).in.mark(i4);
            this.f69127c = this.f69126b;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        if (this.f69126b == 0) {
            return -1;
        }
        int read = ((FilterInputStream) this).in.read();
        if (read != -1) {
            this.f69126b--;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() throws IOException {
        if (((FilterInputStream) this).in.markSupported()) {
            if (this.f69127c != -1) {
                ((FilterInputStream) this).in.reset();
                this.f69126b = this.f69127c;
                return;
            }
            throw new IOException("mark not set");
        }
        throw new IOException("mark is not supported");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j4) throws IOException {
        long skip = ((FilterInputStream) this).in.skip(Math.min(j4, this.f69126b));
        this.f69126b = (int) (this.f69126b - skip);
        return skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i4, int i5) throws IOException {
        int i6 = this.f69126b;
        if (i6 == 0) {
            return -1;
        }
        int read = ((FilterInputStream) this).in.read(bArr, i4, Math.min(i5, i6));
        if (read > 0) {
            this.f69126b -= read;
        }
        return read;
    }
}
