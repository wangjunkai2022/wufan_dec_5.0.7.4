package h0;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;
/* compiled from: TailAppendingInputStream.java */
/* loaded from: classes2.dex */
public class b extends FilterInputStream {

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f69128b;

    /* renamed from: c  reason: collision with root package name */
    private int f69129c;

    /* renamed from: d  reason: collision with root package name */
    private int f69130d;

    public b(InputStream inputStream, byte[] bArr) {
        super(inputStream);
        Objects.requireNonNull(inputStream);
        Objects.requireNonNull(bArr);
        this.f69128b = bArr;
    }

    private int a() {
        int i4 = this.f69129c;
        byte[] bArr = this.f69128b;
        if (i4 >= bArr.length) {
            return -1;
        }
        this.f69129c = i4 + 1;
        return bArr[i4] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i4) {
        if (((FilterInputStream) this).in.markSupported()) {
            super.mark(i4);
            this.f69130d = this.f69129c;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int read = ((FilterInputStream) this).in.read();
        return read != -1 ? read : a();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() throws IOException {
        if (((FilterInputStream) this).in.markSupported()) {
            ((FilterInputStream) this).in.reset();
            this.f69129c = this.f69130d;
            return;
        }
        throw new IOException("mark is not supported");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i4, int i5) throws IOException {
        int read = ((FilterInputStream) this).in.read(bArr, i4, i5);
        if (read != -1) {
            return read;
        }
        int i6 = 0;
        if (i5 == 0) {
            return 0;
        }
        while (i6 < i5) {
            int a5 = a();
            if (a5 == -1) {
                break;
            }
            bArr[i4 + i6] = (byte) a5;
            i6++;
        }
        if (i6 > 0) {
            return i6;
        }
        return -1;
    }
}
