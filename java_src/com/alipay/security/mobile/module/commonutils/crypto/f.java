package com.alipay.security.mobile.module.commonutils.crypto;

import java.io.OutputStream;
/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    protected final byte[] f5002a = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};

    /* renamed from: b  reason: collision with root package name */
    protected final byte[] f5003b = new byte[128];

    public f() {
        d();
    }

    private void d() {
        int i4 = 0;
        while (true) {
            byte[] bArr = this.f5002a;
            if (i4 >= bArr.length) {
                byte[] bArr2 = this.f5003b;
                bArr2[65] = bArr2[97];
                bArr2[66] = bArr2[98];
                bArr2[67] = bArr2[99];
                bArr2[68] = bArr2[100];
                bArr2[69] = bArr2[101];
                bArr2[70] = bArr2[102];
                return;
            }
            this.f5003b[bArr[i4]] = (byte) i4;
            i4++;
        }
    }

    private static boolean e(char c5) {
        return c5 == '\n' || c5 == '\r' || c5 == '\t' || c5 == ' ';
    }

    public final int a(String str, OutputStream outputStream) {
        int length = str.length();
        while (length > 0 && e(str.charAt(length - 1))) {
            length--;
        }
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            while (i4 < length && e(str.charAt(i4))) {
                i4++;
            }
            int i6 = i4 + 1;
            byte b5 = this.f5003b[str.charAt(i4)];
            while (i6 < length && e(str.charAt(i6))) {
                i6++;
            }
            outputStream.write((b5 << 4) | this.f5003b[str.charAt(i6)]);
            i5++;
            i4 = i6 + 1;
        }
        return i5;
    }

    public final int b(byte[] bArr, int i4, int i5, OutputStream outputStream) {
        for (int i6 = i4; i6 < i4 + i5; i6++) {
            int i7 = bArr[i6] & 255;
            outputStream.write(this.f5002a[i7 >>> 4]);
            outputStream.write(this.f5002a[i7 & 15]);
        }
        return i5 * 2;
    }

    public final int c(byte[] bArr, int i4, OutputStream outputStream) {
        int i5 = 0;
        int i6 = i4 + 0;
        while (i6 > 0 && e((char) bArr[i6 - 1])) {
            i6--;
        }
        int i7 = 0;
        while (i5 < i6) {
            while (i5 < i6 && e((char) bArr[i5])) {
                i5++;
            }
            int i8 = i5 + 1;
            byte b5 = this.f5003b[bArr[i5]];
            while (i8 < i6 && e((char) bArr[i8])) {
                i8++;
            }
            outputStream.write((b5 << 4) | this.f5003b[bArr[i8]]);
            i7++;
            i5 = i8 + 1;
        }
        return i7;
    }
}
