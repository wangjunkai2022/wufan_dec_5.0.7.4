package net.sf.sevenzipjbinding.impl;

import java.io.IOException;
import java.io.InputStream;
import net.sf.sevenzipjbinding.ISequentialInStream;
import net.sf.sevenzipjbinding.SevenZipException;
@Deprecated
/* loaded from: classes7.dex */
public class SequentialInStreamImpl implements ISequentialInStream {
    private InputStream inputStream;

    public SequentialInStreamImpl(InputStream inputStream) {
        this.inputStream = inputStream;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }

    public InputStream getInputStream() {
        return this.inputStream;
    }

    @Override // net.sf.sevenzipjbinding.ISequentialInStream
    public int read(byte[] bArr) throws SevenZipException {
        if (bArr.length == 0) {
            return 0;
        }
        try {
            int read = this.inputStream.read(bArr);
            if (read < 0) {
                return 0;
            }
            return read;
        } catch (IOException e5) {
            throw new SevenZipException("Error reading input stream", e5);
        }
    }
}
