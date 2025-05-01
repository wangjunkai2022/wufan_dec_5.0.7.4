package org.apache.http.impl.conn;

import java.io.IOException;
import java.io.OutputStream;
import org.apache.http.annotation.NotThreadSafe;
@NotThreadSafe
/* loaded from: classes7.dex */
class LoggingOutputStream extends OutputStream {
    private final OutputStream out;
    private final WireHC4 wire;

    public LoggingOutputStream(OutputStream outputStream, WireHC4 wireHC4) {
        this.out = outputStream;
        this.wire = wireHC4;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            this.out.close();
        } catch (IOException e5) {
            WireHC4 wireHC4 = this.wire;
            wireHC4.output("[close] I/O error: " + e5.getMessage());
            throw e5;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        try {
            this.out.flush();
        } catch (IOException e5) {
            WireHC4 wireHC4 = this.wire;
            wireHC4.output("[flush] I/O error: " + e5.getMessage());
            throw e5;
        }
    }

    @Override // java.io.OutputStream
    public void write(int i4) throws IOException {
        try {
            this.wire.output(i4);
        } catch (IOException e5) {
            WireHC4 wireHC4 = this.wire;
            wireHC4.output("[write] I/O error: " + e5.getMessage());
            throw e5;
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        try {
            this.wire.output(bArr);
            this.out.write(bArr);
        } catch (IOException e5) {
            WireHC4 wireHC4 = this.wire;
            wireHC4.output("[write] I/O error: " + e5.getMessage());
            throw e5;
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i4, int i5) throws IOException {
        try {
            this.wire.output(bArr, i4, i5);
            this.out.write(bArr, i4, i5);
        } catch (IOException e5) {
            WireHC4 wireHC4 = this.wire;
            wireHC4.output("[write] I/O error: " + e5.getMessage());
            throw e5;
        }
    }
}
