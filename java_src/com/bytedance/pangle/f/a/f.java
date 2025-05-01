package com.bytedance.pangle.f.a;
/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    int[] f8384a;

    /* renamed from: b  reason: collision with root package name */
    int[] f8385b;

    public final String a(int i4) {
        int[] iArr;
        if (i4 < 0 || (iArr = this.f8384a) == null || i4 >= iArr.length) {
            return null;
        }
        int i5 = iArr[i4];
        int a5 = a(this.f8385b, i5);
        StringBuilder sb = new StringBuilder(a5);
        while (a5 != 0) {
            i5 += 2;
            sb.append((char) a(this.f8385b, i5));
            a5--;
        }
        return sb.toString();
    }

    private static final int a(int[] iArr, int i4) {
        int i5 = iArr[i4 / 4];
        return (i4 % 4) / 2 == 0 ? i5 & 65535 : i5 >>> 16;
    }
}
