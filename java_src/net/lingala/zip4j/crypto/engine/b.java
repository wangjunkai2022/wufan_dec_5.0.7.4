package net.lingala.zip4j.crypto.engine;
/* compiled from: ZipCryptoEngine.java */
/* loaded from: classes7.dex */
public class b {

    /* renamed from: b  reason: collision with root package name */
    private static final int[] f71781b = new int[256];

    /* renamed from: a  reason: collision with root package name */
    private final int[] f71782a = new int[3];

    static {
        for (int i4 = 0; i4 < 256; i4++) {
            int i5 = i4;
            for (int i6 = 0; i6 < 8; i6++) {
                i5 = (i5 & 1) == 1 ? (i5 >>> 1) ^ (-306674912) : i5 >>> 1;
            }
            f71781b[i4] = i5;
        }
    }

    private int a(int i4, byte b5) {
        return f71781b[(i4 ^ b5) & 255] ^ (i4 >>> 8);
    }

    public byte b() {
        int i4 = this.f71782a[2] | 2;
        return (byte) ((i4 * (i4 ^ 1)) >>> 8);
    }

    public void c(char[] cArr) {
        int[] iArr = this.f71782a;
        iArr[0] = 305419896;
        iArr[1] = 591751049;
        iArr[2] = 878082192;
        for (char c5 : cArr) {
            d((byte) (c5 & 255));
        }
    }

    public void d(byte b5) {
        int[] iArr = this.f71782a;
        iArr[0] = a(iArr[0], b5);
        int[] iArr2 = this.f71782a;
        iArr2[1] = iArr2[1] + (iArr2[0] & 255);
        iArr2[1] = (iArr2[1] * 134775813) + 1;
        iArr2[2] = a(iArr2[2], (byte) (iArr2[1] >> 24));
    }
}
