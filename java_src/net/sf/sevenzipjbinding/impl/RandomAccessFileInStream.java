package net.sf.sevenzipjbinding.impl;

import java.io.IOException;
import java.io.RandomAccessFile;
import net.sf.sevenzipjbinding.IInStream;
import net.sf.sevenzipjbinding.SevenZipException;
/* loaded from: classes7.dex */
public class RandomAccessFileInStream implements IInStream {
    private final RandomAccessFile randomAccessFile;

    public RandomAccessFileInStream(RandomAccessFile randomAccessFile) {
        this.randomAccessFile = randomAccessFile;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        this.randomAccessFile.close();
    }

    @Override // net.sf.sevenzipjbinding.ISequentialInStream
    public synchronized int read(byte[] bArr) throws SevenZipException {
        try {
            int read = this.randomAccessFile.read(bArr);
            if (read == -1) {
                return 0;
            }
            return read;
        } catch (IOException e5) {
            throw new SevenZipException("Error reading random access file", e5);
        }
    }

    @Override // net.sf.sevenzipjbinding.ISeekableStream
    public synchronized long seek(long j4, int i4) throws SevenZipException {
        try {
            if (i4 == 0) {
                this.randomAccessFile.seek(j4);
            } else if (i4 == 1) {
                RandomAccessFile randomAccessFile = this.randomAccessFile;
                randomAccessFile.seek(randomAccessFile.getFilePointer() + j4);
            } else if (i4 == 2) {
                RandomAccessFile randomAccessFile2 = this.randomAccessFile;
                randomAccessFile2.seek(randomAccessFile2.length() + j4);
            } else {
                throw new RuntimeException("Seek: unknown origin: " + i4);
            }
        } catch (IOException e5) {
            throw new SevenZipException("Error while seek operation", e5);
        }
        return this.randomAccessFile.getFilePointer();
    }
}
