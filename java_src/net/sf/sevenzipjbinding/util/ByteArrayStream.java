package net.sf.sevenzipjbinding.util;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import net.sf.sevenzipjbinding.IInStream;
import net.sf.sevenzipjbinding.IOutStream;
import net.sf.sevenzipjbinding.SevenZipException;
/* loaded from: classes7.dex */
public class ByteArrayStream implements IInStream, IOutStream {
    private static final int INPUT_STREAM_READ_BUFFER_SIZE = 16384;
    private static final int MAX_CHUNK_SIZE = 1048576;
    private final List<byte[]> chunkList;
    private int currentChunkIndex;
    private int currentPosition;
    private int currentPositionInChunk;
    private final int initialSize;
    private final int maxSize;
    private int seekToPosition;
    private int size;

    public ByteArrayStream(byte[] bArr, boolean z4, int i4) {
        this(1024, i4);
        setBytes(bArr, z4);
    }

    private void allocateNextChunk(int i4) {
        int i5 = this.currentChunkIndex;
        if (i5 == -1 || (i5 == this.chunkList.size() - 1 && this.chunkList.get(this.currentChunkIndex).length == this.currentPositionInChunk)) {
            this.currentPositionInChunk = 0;
            this.currentChunkIndex++;
        }
        if (this.size < this.maxSize) {
            int size = this.chunkList.size() - 1;
            int length = size == -1 ? this.initialSize : this.chunkList.get(size).length << 1;
            length = (length < 0 || length > 1048576) ? 1048576 : 1048576;
            int i6 = this.size;
            int i7 = i6 + length;
            int i8 = this.maxSize;
            if (i7 > i8) {
                length = i8 - i6;
            }
            if (i4 == -1 || length >= i4) {
                i4 = length;
            } else if (i6 + i4 >= i8) {
                throw new RuntimeException("Maximal size of the byte array stream was reached. (Max size = " + this.maxSize + ")");
            }
            this.chunkList.add(new byte[i4]);
            return;
        }
        throw new RuntimeException("Maximal size of the byte array stream was reached. (Max size = " + this.maxSize + ")");
    }

    private void endWriting() {
        if (this.size == this.currentPosition && this.currentPositionInChunk == 0) {
            int i4 = this.currentChunkIndex;
            if (i4 == 0) {
                init();
                return;
            }
            List<byte[]> list = this.chunkList;
            this.currentChunkIndex = i4 - 1;
            list.remove(i4);
            this.currentPositionInChunk = this.chunkList.get(this.currentChunkIndex).length;
        }
    }

    private void init() {
        this.chunkList.clear();
        this.currentPosition = 0;
        this.currentPositionInChunk = 0;
        this.currentChunkIndex = -1;
        this.size = 0;
        this.seekToPosition = -1;
    }

    private void performDelayedSeek() {
        int i4 = this.seekToPosition;
        if (i4 == -1) {
            return;
        }
        if (this.currentPosition == i4) {
            this.seekToPosition = -1;
        } else if (i4 > this.size) {
            setSize(i4, true);
            this.seekToPosition = -1;
        } else {
            int i5 = 0;
            for (int i6 = 0; i6 < this.chunkList.size(); i6++) {
                int length = this.chunkList.get(i6).length;
                i5 += length;
                int i7 = this.seekToPosition;
                if (i5 > i7) {
                    this.currentChunkIndex = i6;
                    this.currentPositionInChunk = length - (i5 - i7);
                    this.currentPosition = i7;
                    this.seekToPosition = -1;
                    return;
                }
            }
            int size = this.chunkList.size() - 1;
            this.currentChunkIndex = size;
            this.currentPositionInChunk = this.chunkList.get(size).length;
            this.currentPosition = this.size;
            this.seekToPosition = -1;
        }
    }

    private void startWriting() {
        int i4 = this.currentChunkIndex;
        if (i4 == -1 || this.currentPositionInChunk >= this.chunkList.get(i4).length) {
            allocateNextChunk(-1);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }

    public synchronized byte[] getBytes() {
        byte[] bArr;
        bArr = new byte[this.size];
        int i4 = 0;
        for (byte[] bArr2 : this.chunkList) {
            int length = bArr2.length + i4;
            int i5 = this.size;
            int length2 = length > i5 ? i5 - i4 : bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i4, length2);
            i4 += length2;
        }
        return bArr;
    }

    public synchronized int getCurrentPosition() {
        int i4 = this.seekToPosition;
        if (i4 != -1) {
            return i4;
        }
        return this.currentPosition;
    }

    public InputStream getDetachedInputStream() {
        throw new IllegalStateException("Not implemented");
    }

    public InputStream getInputStream() {
        throw new IllegalStateException("Not implemented");
    }

    public OutputStream getOutputStream() {
        throw new IllegalStateException("Not implemented");
    }

    public synchronized int getSize() {
        return this.size;
    }

    public synchronized boolean isEOF() {
        return getCurrentPosition() >= this.size;
    }

    @Override // net.sf.sevenzipjbinding.ISequentialInStream
    public int read(byte[] bArr) throws SevenZipException {
        return read(bArr, 0, bArr.length);
    }

    public synchronized void rewind() {
        this.seekToPosition = 0;
    }

    @Override // net.sf.sevenzipjbinding.ISeekableStream
    public synchronized long seek(long j4, int i4) throws SevenZipException {
        int i5;
        try {
            if (i4 != 0) {
                if (i4 == 1) {
                    i5 = this.seekToPosition;
                    if (i5 == -1) {
                        i5 = this.currentPosition;
                    }
                } else if (i4 == 2) {
                    i5 = this.size;
                } else {
                    throw new SevenZipException("Seek: unknown origin: " + i4);
                }
                j4 += i5;
            }
            if (j4 <= this.maxSize) {
                this.seekToPosition = (int) j4;
            } else {
                throw new RuntimeException("Maximal size of the byte array stream was reached by seek to " + j4 + ", maximal size is " + this.maxSize + " bytes");
            }
        } catch (Throwable th) {
            throw th;
        }
        return j4;
    }

    public synchronized void setBytes(byte[] bArr, boolean z4) {
        init();
        int length = bArr.length;
        if (z4) {
            byte[] bArr2 = new byte[length];
            System.arraycopy(bArr, 0, bArr2, 0, length);
            bArr = bArr2;
        }
        this.chunkList.add(bArr);
        this.currentChunkIndex = 0;
        this.currentPosition = 0;
        this.currentPositionInChunk = 0;
        this.size = length;
    }

    @Override // net.sf.sevenzipjbinding.IOutStream
    public synchronized void setSize(long j4) {
        setSize(j4, false);
    }

    public synchronized void truncate() {
        init();
    }

    @Override // net.sf.sevenzipjbinding.ISequentialOutStream
    public int write(byte[] bArr) {
        return write(bArr, 0, bArr.length);
    }

    public synchronized void writeFromInputStream(InputStream inputStream, boolean z4) throws IOException {
        performDelayedSeek();
        if (this.size == 0) {
            init();
            int available = inputStream.available();
            if (available <= this.maxSize) {
                if (available > this.initialSize) {
                    byte[] bArr = new byte[available];
                    int read = inputStream.read(bArr);
                    if (read == -1) {
                        return;
                    }
                    this.size = read;
                    this.currentPosition = read;
                    this.currentPositionInChunk = read;
                    this.currentChunkIndex = 0;
                    this.chunkList.add(bArr);
                }
                startWriting();
                while (true) {
                    byte[] bArr2 = this.chunkList.get(this.currentChunkIndex);
                    int i4 = this.currentPositionInChunk;
                    int read2 = inputStream.read(bArr2, i4, bArr2.length - i4);
                    if (read2 == -1) {
                        break;
                    }
                    this.currentPosition += read2;
                    int i5 = this.currentPositionInChunk + read2;
                    this.currentPositionInChunk = i5;
                    if (bArr2.length - i5 == 0) {
                        allocateNextChunk(-1);
                    }
                }
                this.size = this.currentPosition;
                endWriting();
            } else {
                throw new RuntimeException("Maximal size of the byte array stream was reached. (Max size = " + this.maxSize + ")");
            }
        } else {
            byte[] bArr3 = new byte[16384];
            while (true) {
                int read3 = inputStream.read(bArr3);
                if (read3 == -1) {
                    break;
                }
                write(bArr3, 0, read3);
            }
        }
        if (z4) {
            inputStream.close();
        }
    }

    public synchronized void writeToOutputStream(OutputStream outputStream, boolean z4) throws IOException {
        int i4 = 0;
        for (byte[] bArr : this.chunkList) {
            int length = bArr.length + i4;
            int i5 = this.size;
            int length2 = length > i5 ? i5 - i4 : bArr.length;
            outputStream.write(bArr, 0, length2);
            i4 += length2;
        }
        if (z4) {
            try {
                outputStream.close();
            } catch (Exception unused) {
            }
        }
    }

    public synchronized int read(byte[] bArr, int i4, int i5) {
        if (i4 >= 0 && i5 >= 0) {
            if (bArr.length >= i4 + i5) {
                if (this.seekToPosition > this.size) {
                    return 0;
                }
                performDelayedSeek();
                int i6 = this.currentPosition;
                int i7 = i6 + i5;
                int i8 = this.size;
                if (i7 > i8) {
                    i5 = i8 - i6;
                }
                int i9 = i5;
                while (i9 > 0) {
                    int length = this.chunkList.get(this.currentChunkIndex).length;
                    int i10 = length - this.currentPositionInChunk;
                    if (i9 <= i10) {
                        i10 = i9;
                    }
                    System.arraycopy(this.chunkList.get(this.currentChunkIndex), this.currentPositionInChunk, bArr, i4, i10);
                    i4 += i10;
                    int i11 = this.currentPositionInChunk + i10;
                    this.currentPositionInChunk = i11;
                    i9 -= i10;
                    if (i11 >= length && this.currentChunkIndex < this.chunkList.size() - 1) {
                        int i12 = this.currentChunkIndex + 1;
                        this.currentChunkIndex = i12;
                        this.currentPositionInChunk = 0;
                        int length2 = this.chunkList.get(i12).length;
                    }
                }
                this.currentPosition += i5;
                return i5;
            }
        }
        throw new IllegalStateException("Invalid start position (" + i4 + ") and length (" + i5 + ")");
    }

    public synchronized int write(byte[] bArr, int i4, int i5) {
        if (i4 >= 0 && i5 >= 0) {
            if (bArr.length >= i4 + i5) {
                if (i5 == 0) {
                    return 0;
                }
                performDelayedSeek();
                startWriting();
                do {
                    byte[] bArr2 = this.chunkList.get(this.currentChunkIndex);
                    int length = bArr2.length;
                    int i6 = this.currentPositionInChunk;
                    int i7 = length - i6;
                    if (i7 >= i5) {
                        i7 = i5;
                    }
                    System.arraycopy(bArr, i4, bArr2, i6, i7);
                    int i8 = this.currentPositionInChunk + i7;
                    this.currentPositionInChunk = i8;
                    this.currentPosition += i7;
                    i4 += i7;
                    i5 -= i7;
                    if (i8 >= bArr2.length) {
                        this.currentPositionInChunk = 0;
                        int i9 = this.currentChunkIndex + 1;
                        this.currentChunkIndex = i9;
                        if (i9 >= this.chunkList.size()) {
                            allocateNextChunk(-1);
                            continue;
                        } else {
                            continue;
                        }
                    }
                } while (i5 > 0);
                int i10 = this.currentPosition;
                if (i10 > this.size) {
                    this.size = i10;
                }
                endWriting();
                return bArr.length;
            }
        }
        throw new IllegalStateException("Invalid start position (" + i4 + ") and length (" + i5 + ")");
    }

    public ByteArrayStream(byte[] bArr, boolean z4) {
        this(1024 > bArr.length ? bArr.length : 1024, bArr.length);
        setBytes(bArr, z4);
    }

    private synchronized void setSize(long j4, boolean z4) {
        List<byte[]> list;
        if (j4 == 0) {
            truncate();
        } else if (j4 <= this.maxSize) {
            int i4 = this.size;
            if (j4 > i4) {
                if (i4 == 0) {
                    int i5 = (int) j4;
                    this.chunkList.add(new byte[i5]);
                    this.currentChunkIndex = 0;
                    this.size = i5;
                }
                int i6 = (int) (j4 - this.size);
                int i7 = 0;
                for (int i8 = 0; i8 < this.chunkList.size(); i8++) {
                    i7 += this.chunkList.get(i8).length;
                }
                int i9 = this.size;
                int i10 = i7 - i9;
                if (i10 < i6) {
                    this.size = i9 + i10;
                    int i11 = i6 - i10;
                    allocateNextChunk(i11);
                    if (z4) {
                        this.currentPositionInChunk = i11;
                    }
                } else if (z4) {
                    this.currentPositionInChunk = (this.chunkList.get(list.size() - 1).length - i10) + i6;
                }
                if (z4) {
                    this.currentChunkIndex = this.chunkList.size() - 1;
                    this.currentPosition = (int) j4;
                }
                this.size = (int) j4;
            }
            if (j4 < this.size) {
                int i12 = 0;
                for (int i13 = 0; i13 < this.chunkList.size(); i13++) {
                    i12 += this.chunkList.get(i13).length;
                    if (i12 >= j4) {
                        for (int size = this.chunkList.size() - 1; size > i13; size--) {
                            this.chunkList.remove(size);
                        }
                        int i14 = this.seekToPosition;
                        if (i14 != -1 && i14 > j4) {
                            this.seekToPosition = (int) j4;
                        } else if (this.currentPosition > j4) {
                            int i15 = (int) j4;
                            this.currentPosition = i15;
                            this.currentPositionInChunk = (i15 - i12) + this.chunkList.get(i13).length;
                            this.currentChunkIndex = i13;
                        }
                        this.size = (int) j4;
                    }
                }
            }
        } else {
            throw new RuntimeException("Maximal size of the byte array stream was reached by setSize(" + j4 + "). Maximal size is " + this.maxSize + " bytes");
        }
    }

    public ByteArrayStream(int i4) {
        this(1024, i4);
    }

    public ByteArrayStream(int i4, int i5) {
        this.chunkList = new ArrayList();
        this.initialSize = i4;
        if (i5 < 0) {
            throw new IllegalStateException("Maximal size of the byte array stream should be >0");
        }
        if (i4 >= 0) {
            this.maxSize = i5;
            init();
            return;
        }
        throw new IllegalStateException("Initial size of the byte array stream should be >0");
    }
}
