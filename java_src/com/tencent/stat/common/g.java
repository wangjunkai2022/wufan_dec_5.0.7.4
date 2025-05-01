package com.tencent.stat.common;
/* loaded from: classes6.dex */
public class g {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ boolean f62956a = true;

    private g() {
    }

    public static byte[] a(byte[] bArr, int i4) {
        return a(bArr, 0, bArr.length, i4);
    }

    public static byte[] a(byte[] bArr, int i4, int i5, int i6) {
        i iVar = new i(i6, new byte[(i5 * 3) / 4]);
        if (iVar.a(bArr, i4, i5, true)) {
            int i7 = iVar.f62958b;
            byte[] bArr2 = iVar.f62957a;
            if (i7 == bArr2.length) {
                return bArr2;
            }
            byte[] bArr3 = new byte[i7];
            System.arraycopy(bArr2, 0, bArr3, 0, i7);
            return bArr3;
        }
        throw new IllegalArgumentException("bad base-64");
    }

    public static byte[] b(byte[] bArr, int i4) {
        return b(bArr, 0, bArr.length, i4);
    }

    public static byte[] b(byte[] bArr, int i4, int i5, int i6) {
        j jVar = new j(i6, null);
        int i7 = (i5 / 3) * 4;
        if (!jVar.f62968d) {
            int i8 = i5 % 3;
            if (i8 == 1) {
                i7 += 2;
            } else if (i8 == 2) {
                i7 += 3;
            }
        } else if (i5 % 3 > 0) {
            i7 += 4;
        }
        if (jVar.f62969e && i5 > 0) {
            i7 += (((i5 - 1) / 57) + 1) * (jVar.f62970f ? 2 : 1);
        }
        jVar.f62957a = new byte[i7];
        jVar.a(bArr, i4, i5, true);
        if (f62956a || jVar.f62958b == i7) {
            return jVar.f62957a;
        }
        throw new AssertionError();
    }
}
