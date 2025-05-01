package org.apache.http.impl.conn;

import java.io.IOException;
import java.io.InputStream;
import org.apache.http.annotation.NotThreadSafe;
@NotThreadSafe
/* loaded from: classes7.dex */
class LoggingInputStream extends InputStream {

    /* renamed from: in  reason: collision with root package name */
    private final InputStream f72103in;
    private final WireHC4 wire;

    public LoggingInputStream(InputStream inputStream, WireHC4 wireHC4) {
        this.f72103in = inputStream;
        this.wire = wireHC4;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        try {
            return this.f72103in.available();
        } catch (IOException e5) {
            WireHC4 wireHC4 = this.wire;
            wireHC4.input("[available] I/O error : " + e5.getMessage());
            throw e5;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            this.f72103in.close();
        } catch (IOException e5) {
            WireHC4 wireHC4 = this.wire;
            wireHC4.input("[close] I/O error: " + e5.getMessage());
            throw e5;
        }
    }

    @Override // java.io.InputStream
    public void mark(int i4) {
        super.mark(i4);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        try {
            int read = this.f72103in.read();
            if (read == -1) {
                this.wire.input("end of stream");
            } else {
                this.wire.input(read);
            }
            return read;
        } catch (IOException e5) {
            WireHC4 wireHC4 = this.wire;
            wireHC4.input("[read] I/O error: " + e5.getMessage());
            throw e5;
        }
    }

    @Override // java.io.InputStream
    public void reset() throws IOException {
        super.reset();
    }

    @Override // java.io.InputStream
    public long skip(long j4) throws IOException {
        try {
            return super.skip(j4);
        } catch (IOException e5) {
            WireHC4 wireHC4 = this.wire;
            wireHC4.input("[skip] I/O error: " + e5.getMessage());
            throw e5;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        try {
            int read = this.f72103in.read(bArr);
            if (read == -1) {
                this.wire.input("end of stream");
            } else if (read > 0) {
                this.wire.input(bArr, 0, read);
            }
            return read;
        } catch (IOException e5) {
            WireHC4 wireHC4 = this.wire;
            wireHC4.input("[read] I/O error: " + e5.getMessage());
            throw e5;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i4, int i5) throws IOException {
        try {
            int read = this.f72103in.read(bArr, i4, i5);
            if (read == -1) {
                this.wire.input("end of stream");
            } else if (read > 0) {
                this.wire.input(bArr, i4, read);
            }
            return read;
        } catch (IOException e5) {
            WireHC4 wireHC4 = this.wire;
            wireHC4.input("[read] I/O error: " + e5.getMessage());
            throw e5;
        }
    }
}
