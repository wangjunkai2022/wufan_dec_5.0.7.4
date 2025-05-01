package com.alipay.security.mobile.module.commonutils.crypto;

import kotlin.jvm.internal.ByteCompanionObject;
/* loaded from: classes2.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f5004a = e.d("7B726A5DDD72CBF8D1700FB6EB278AFD7559C40A3761E5A71614D0AC9461ED8EE9F6AAEB443CD648");

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f5005b = e.d("C9582A82777392CAA65AD7F5228150E3F966C09D6A00288B5C6E0CFB441E111B713B4E0822A8C830");

    /* renamed from: c  reason: collision with root package name */
    public static final int f5006c = 8;

    /* renamed from: d  reason: collision with root package name */
    public static final int f5007d = 20;

    private g() {
    }

    private static byte[] a(byte[] bArr) {
        byte[] bArr2 = new byte[20];
        if (b.a(bArr2)) {
            byte[] bArr3 = new byte[20];
            if (b.a(bArr3)) {
                byte[] b5 = c.b(bArr, f5004a);
                System.arraycopy(b5, 0, bArr2, 0, b5.length);
                byte[] b6 = c.b(bArr, f5005b);
                System.arraycopy(b6, 0, bArr3, 0, b6.length);
                int i4 = bArr2[19] & 15;
                int i5 = bArr3[19] & 15;
                return new byte[]{(byte) (bArr2[i4 + 3] & 255), (byte) (bArr2[i4 + 2] & 255), (byte) (bArr2[i4 + 1] & 255), (byte) (bArr2[i4] & ByteCompanionObject.MAX_VALUE), (byte) (bArr3[i5] & ByteCompanionObject.MAX_VALUE), (byte) (bArr3[i5 + 1] & 255), (byte) (bArr3[i5 + 2] & 255), (byte) (bArr3[i5 + 3] & 255)};
            }
            throw new IllegalStateException("failed to init hash2.");
        }
        throw new IllegalStateException("failed to init hash1.");
    }

    private static byte[] b(byte[] bArr, int i4) {
        byte[] bArr2 = new byte[20];
        if (b.a(bArr2)) {
            byte[] bArr3 = new byte[20];
            if (b.a(bArr3)) {
                byte[] b5 = c.b(bArr, f5004a);
                System.arraycopy(b5, 0, bArr2, 0, b5.length);
                byte[] b6 = c.b(bArr, f5005b);
                System.arraycopy(b6, 0, bArr3, 0, b6.length);
                int i5 = bArr2[19] & 15;
                int i6 = bArr3[19] & 15;
                byte[] bArr4 = {(byte) (bArr2[i5 + 3] & 255), (byte) (bArr2[i5 + 2] & 255), (byte) (bArr2[i5 + 1] & 255), (byte) (bArr2[i5] & ByteCompanionObject.MAX_VALUE), (byte) (bArr3[i6] & ByteCompanionObject.MAX_VALUE), (byte) (bArr3[i6 + 1] & 255), (byte) (bArr3[i6 + 2] & 255), (byte) (bArr3[i6 + 3] & 255)};
                if (i4 <= 0) {
                    return null;
                }
                if (i4 >= 8) {
                    return bArr4;
                }
                byte[] bArr5 = new byte[i4];
                for (int i7 = 0; i7 < i4; i7++) {
                    bArr5[i7] = bArr4[i7];
                }
                return bArr5;
            }
            throw new IllegalStateException("failed to init hash2.");
        }
        throw new IllegalStateException("failed to init hash1.");
    }
}
