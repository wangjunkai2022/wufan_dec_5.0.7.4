package com.googlecode.mp4parser.h264.read;

import g1.c;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: CAVLCReader.java */
/* loaded from: classes3.dex */
public class b extends a {
    public b(InputStream inputStream) throws IOException {
        super(inputStream);
    }

    private void A(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        String valueOf = String.valueOf(a.f14203f - this.f14208e.d());
        int length = 8 - valueOf.length();
        sb.append("@" + valueOf);
        for (int i4 = 0; i4 < length; i4++) {
            sb.append(' ');
        }
        sb.append(str);
        int length2 = (100 - sb.length()) - this.f14208e.d();
        for (int i5 = 0; i5 < length2; i5++) {
            sb.append(' ');
        }
        sb.append(this.f14208e);
        sb.append(" (" + str2 + ")");
        this.f14208e.c();
        c.g(sb.toString());
    }

    private int x() throws IOException {
        int i4 = 0;
        while (h() == 0) {
            i4++;
        }
        if (i4 > 0) {
            return (int) (((1 << i4) - 1) + k(i4));
        }
        return 0;
    }

    public byte[] m(int i4) throws IOException {
        byte[] bArr = new byte[i4];
        for (int i5 = 0; i5 < i4; i5++) {
            bArr[i5] = (byte) j();
        }
        return bArr;
    }

    public boolean n() {
        throw new UnsupportedOperationException("Stan");
    }

    public int o() {
        throw new UnsupportedOperationException("Stan");
    }

    public boolean p(String str) throws IOException {
        boolean z4 = h() != 0;
        A(str, z4 ? "1" : "0");
        return z4;
    }

    public Object q(g1.a aVar, String str) throws IOException {
        Object c5;
        do {
            aVar = aVar.b(h());
            if (aVar != null) {
                c5 = aVar.c();
            } else {
                throw new RuntimeException("Illegal code");
            }
        } while (c5 == null);
        A(str, c5.toString());
        return c5;
    }

    public int r(String str) throws IOException {
        return y(str);
    }

    public long s(int i4, String str) throws IOException {
        long k4 = k(i4);
        A(str, String.valueOf(k4));
        return k4;
    }

    public int t(String str) throws IOException {
        int x4 = x();
        int i4 = x4 & 1;
        int i5 = ((x4 >> 1) + i4) * ((i4 << 1) - 1);
        A(str, String.valueOf(i5));
        return i5;
    }

    public int u(int i4) throws IOException {
        if (i4 > 1) {
            return x();
        }
        return (h() ^ (-1)) & 1;
    }

    public void v() throws IOException {
        h();
        l();
    }

    public int w(int i4, String str) throws IOException {
        return (int) s(i4, str);
    }

    public int y(String str) throws IOException {
        int x4 = x();
        A(str, String.valueOf(x4));
        return x4;
    }

    public int z(String str) throws IOException {
        int i4 = 0;
        while (h() == 0) {
            i4++;
        }
        A(str, String.valueOf(i4));
        return i4;
    }
}
