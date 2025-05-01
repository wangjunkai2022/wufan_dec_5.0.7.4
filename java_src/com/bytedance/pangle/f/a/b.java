package com.bytedance.pangle.f.a;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    InputStream f8377a;

    /* renamed from: b  reason: collision with root package name */
    private int f8378b;

    public b(InputStream inputStream) {
        a(inputStream);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(InputStream inputStream) {
        this.f8377a = inputStream;
        this.f8378b = 0;
    }

    public final void b() {
        long skip = this.f8377a.skip(4L);
        this.f8378b = (int) (this.f8378b + skip);
        if (skip != 4) {
            throw new EOFException();
        }
    }

    public final int a() {
        int i4 = 0;
        for (int i5 = 0; i5 != 32; i5 += 8) {
            int read = this.f8377a.read();
            if (read == -1) {
                throw new EOFException();
            }
            this.f8378b++;
            i4 |= read << i5;
        }
        return i4;
    }

    public final void b(int i4) {
        int a5 = a();
        if (a5 != i4) {
            throw new IOException(String.format("Expected: 0x%08x got: 0x%08x", Integer.valueOf(i4), Integer.valueOf(a5)));
        }
    }

    public final int[] a(int i4) {
        int[] iArr = new int[i4];
        int i5 = 0;
        while (i4 > 0) {
            iArr[i5] = a();
            i4--;
            i5++;
        }
        return iArr;
    }
}
