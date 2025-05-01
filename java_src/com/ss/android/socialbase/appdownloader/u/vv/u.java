package com.ss.android.socialbase.appdownloader.u.vv;

import java.io.IOException;
/* loaded from: classes5.dex */
public class u {

    /* renamed from: m  reason: collision with root package name */
    private int[] f60900m;
    private int[] vv;

    private u() {
    }

    public static u vv(i iVar) throws IOException {
        m.vv(iVar, 1835009);
        int m4 = iVar.m();
        int m5 = iVar.m();
        int m6 = iVar.m();
        iVar.m();
        int m7 = iVar.m();
        int m8 = iVar.m();
        u uVar = new u();
        uVar.vv = iVar.m(m5);
        if (m6 != 0) {
            iVar.m(m6);
        }
        int i4 = (m8 == 0 ? m4 : m8) - m7;
        if (i4 % 4 == 0) {
            uVar.f60900m = iVar.m(i4 / 4);
            if (m8 != 0) {
                int i5 = m4 - m8;
                if (i5 % 4 == 0) {
                    iVar.m(i5 / 4);
                } else {
                    throw new IOException("Style data size is not multiple of 4 (" + i5 + ").");
                }
            }
            return uVar;
        }
        throw new IOException("String data size is not multiple of 4 (" + i4 + ").");
    }

    public String vv(int i4) {
        int[] iArr;
        if (i4 < 0 || (iArr = this.vv) == null || i4 >= iArr.length) {
            return null;
        }
        int i5 = iArr[i4];
        int vv = vv(this.f60900m, i5);
        StringBuilder sb = new StringBuilder(vv);
        while (vv != 0) {
            i5 += 2;
            sb.append((char) vv(this.f60900m, i5));
            vv--;
        }
        return sb.toString();
    }

    private static final int vv(int[] iArr, int i4) {
        int i5 = iArr[i4 / 4];
        return (i4 % 4) / 2 == 0 ? i5 & 65535 : i5 >>> 16;
    }
}
