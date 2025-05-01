package com.join.mgps.Util;

import java.io.ByteArrayOutputStream;
/* compiled from: Base62.java */
/* loaded from: classes3.dex */
public class j {

    /* renamed from: c  reason: collision with root package name */
    private static final int f27856c = 256;

    /* renamed from: d  reason: collision with root package name */
    private static final int f27857d = 62;

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f27858a;

    /* renamed from: b  reason: collision with root package name */
    private byte[] f27859b;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Base62.java */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private static final byte[] f27860a = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122};

        /* renamed from: b  reason: collision with root package name */
        private static final byte[] f27861b = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90};

        private a() {
        }
    }

    private j(byte[] bArr) {
        this.f27858a = bArr;
        e();
    }

    private byte[] a(byte[] bArr, int i4, int i5) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(h(bArr.length, i4, i5));
        byte[] bArr2 = bArr;
        while (true) {
            if (bArr2.length <= 0) {
                break;
            }
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream(bArr2.length);
            int i6 = 0;
            for (byte b5 : bArr2) {
                int i7 = (b5 & 255) + (i6 * i4);
                i6 = i7 % i5;
                int i8 = (i7 - i6) / i5;
                if (byteArrayOutputStream2.size() > 0 || i8 > 0) {
                    byteArrayOutputStream2.write(i8);
                }
            }
            byteArrayOutputStream.write(i6);
            bArr2 = byteArrayOutputStream2.toByteArray();
        }
        for (int i9 = 0; i9 < bArr.length - 1 && bArr[i9] == 0; i9++) {
            byteArrayOutputStream.write(0);
        }
        return j(byteArrayOutputStream.toByteArray());
    }

    public static j b() {
        return c();
    }

    public static j c() {
        return new j(a.f27860a);
    }

    public static j d() {
        return new j(a.f27861b);
    }

    private void e() {
        this.f27859b = new byte[256];
        int i4 = 0;
        while (true) {
            byte[] bArr = this.f27858a;
            if (i4 >= bArr.length) {
                return;
            }
            this.f27859b[bArr[i4]] = (byte) (i4 & 255);
            i4++;
        }
    }

    private int h(int i4, int i5, int i6) {
        double d5 = i4;
        Double.isNaN(d5);
        return (int) Math.ceil((Math.log(i5) / Math.log(i6)) * d5);
    }

    private byte[] j(byte[] bArr) {
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        for (int i4 = 0; i4 < length; i4++) {
            bArr2[(length - i4) - 1] = bArr[i4];
        }
        return bArr2;
    }

    private byte[] k(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[bArr.length];
        for (int i4 = 0; i4 < bArr.length; i4++) {
            bArr3[i4] = bArr2[bArr[i4]];
        }
        return bArr3;
    }

    public byte[] f(byte[] bArr) {
        if (i(bArr)) {
            return a(k(bArr, this.f27859b), 62, 256);
        }
        throw new IllegalArgumentException("Input is not encoded correctly");
    }

    public byte[] g(byte[] bArr) {
        return k(a(bArr, 256, 62), this.f27858a);
    }

    public boolean i(byte[] bArr) {
        if (bArr == null) {
            return false;
        }
        for (byte b5 : bArr) {
            if ((48 > b5 || 57 < b5) && ((97 > b5 || 122 < b5) && (65 > b5 || 90 < b5))) {
                return false;
            }
        }
        return true;
    }
}
