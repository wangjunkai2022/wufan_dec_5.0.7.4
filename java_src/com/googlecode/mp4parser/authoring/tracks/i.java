package com.googlecode.mp4parser.authoring.tracks;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;
/* compiled from: CleanInputStream.java */
/* loaded from: classes3.dex */
public class i extends FilterInputStream {

    /* renamed from: b  reason: collision with root package name */
    int f13481b;

    /* renamed from: c  reason: collision with root package name */
    int f13482c;

    public i(InputStream inputStream) {
        super(inputStream);
        this.f13481b = -1;
        this.f13482c = -1;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int read = super.read();
        if (read == 3 && this.f13481b == 0 && this.f13482c == 0) {
            this.f13481b = -1;
            this.f13482c = -1;
            read = super.read();
        }
        this.f13481b = this.f13482c;
        this.f13482c = read;
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i4, int i5) throws IOException {
        Objects.requireNonNull(bArr);
        if (i4 < 0 || i5 < 0 || i5 > bArr.length - i4) {
            throw new IndexOutOfBoundsException();
        }
        if (i5 == 0) {
            return 0;
        }
        int read = read();
        if (read == -1) {
            return -1;
        }
        bArr[i4] = (byte) read;
        int i6 = 1;
        while (true) {
            if (i6 < i5) {
                try {
                    int read2 = read();
                    if (read2 == -1) {
                        break;
                    }
                    bArr[i4 + i6] = (byte) read2;
                    i6++;
                } catch (IOException unused) {
                }
            }
            return i6;
        }
        return i6;
    }
}
