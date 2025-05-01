package net.sf.sevenzipjbinding.impl;

import java.io.Closeable;
import java.io.IOException;
import java.io.RandomAccessFile;
import net.sf.sevenzipjbinding.IOutStream;
import net.sf.sevenzipjbinding.SevenZipException;
/* loaded from: classes7.dex */
public class RandomAccessFileOutStream implements IOutStream, Closeable {
    private final RandomAccessFile randomAccessFile;

    public RandomAccessFileOutStream(RandomAccessFile randomAccessFile) {
        this.randomAccessFile = randomAccessFile;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.randomAccessFile.close();
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

    @Override // net.sf.sevenzipjbinding.IOutStream
    public synchronized void setSize(long j4) throws SevenZipException {
        try {
            this.randomAccessFile.setLength(j4);
        } catch (IOException e5) {
            throw new SevenZipException("Error setting new length of the file", e5);
        }
    }

    @Override // net.sf.sevenzipjbinding.ISequentialOutStream
    public synchronized int write(byte[] bArr) throws SevenZipException {
        try {
            this.randomAccessFile.write(bArr);
        } catch (IOException e5) {
            throw new SevenZipException("Error reading random access file", e5);
        }
        return bArr.length;
    }
}
