package com.ss.android.socialbase.appdownloader.u.vv;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
/* loaded from: classes5.dex */
public class i {

    /* renamed from: m  reason: collision with root package name */
    private boolean f60896m;

    /* renamed from: p  reason: collision with root package name */
    private int f60897p;
    private InputStream vv;

    public i() {
    }

    public final int m() throws IOException {
        return vv(4);
    }

    public final void p(int i4) throws IOException {
        if (i4 > 0) {
            long j4 = i4;
            long skip = this.vv.skip(j4);
            this.f60897p = (int) (this.f60897p + skip);
            if (skip != j4) {
                throw new EOFException();
            }
        }
    }

    public final void vv(InputStream inputStream, boolean z4) {
        this.vv = inputStream;
        this.f60896m = z4;
        this.f60897p = 0;
    }

    public i(InputStream inputStream, boolean z4) {
        vv(inputStream, z4);
    }

    public final int[] m(int i4) throws IOException {
        int[] iArr = new int[i4];
        vv(iArr, 0, i4);
        return iArr;
    }

    public final void p() throws IOException {
        p(4);
    }

    public final void vv() {
        InputStream inputStream = this.vv;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
            vv(null, false);
        }
    }

    public final int vv(int i4) throws IOException {
        if (i4 >= 0 && i4 <= 4) {
            int i5 = 0;
            if (this.f60896m) {
                for (int i6 = (i4 - 1) * 8; i6 >= 0; i6 -= 8) {
                    int read = this.vv.read();
                    if (read == -1) {
                        throw new EOFException();
                    }
                    this.f60897p++;
                    i5 |= read << i6;
                }
                return i5;
            }
            int i7 = i4 * 8;
            int i8 = 0;
            while (i5 != i7) {
                int read2 = this.vv.read();
                if (read2 == -1) {
                    throw new EOFException();
                }
                this.f60897p++;
                i8 |= read2 << i5;
                i5 += 8;
            }
            return i8;
        }
        throw new IllegalArgumentException();
    }

    public final void vv(int[] iArr, int i4, int i5) throws IOException {
        while (i5 > 0) {
            iArr[i4] = m();
            i5--;
            i4++;
        }
    }
}
