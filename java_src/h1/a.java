package h1;

import g1.c;
import java.io.IOException;
import java.io.OutputStream;
/* compiled from: BitstreamWriter.java */
/* loaded from: classes3.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private final OutputStream f69131a;

    /* renamed from: b  reason: collision with root package name */
    private int[] f69132b = new int[8];

    /* renamed from: c  reason: collision with root package name */
    private int f69133c;

    public a(OutputStream outputStream) {
        this.f69131a = outputStream;
    }

    private void d() throws IOException {
        int[] iArr = this.f69132b;
        this.f69131a.write(iArr[7] | (iArr[0] << 7) | (iArr[1] << 6) | (iArr[2] << 5) | (iArr[3] << 4) | (iArr[4] << 3) | (iArr[5] << 2) | (iArr[6] << 1));
    }

    public void a() throws IOException {
        for (int i4 = this.f69133c; i4 < 8; i4++) {
            this.f69132b[i4] = 0;
        }
        this.f69133c = 0;
        d();
    }

    public void b(int i4) throws IOException {
        c.a(i4);
        if (this.f69133c == 8) {
            this.f69133c = 0;
            d();
        }
        int[] iArr = this.f69132b;
        int i5 = this.f69133c;
        this.f69133c = i5 + 1;
        iArr[i5] = i4;
    }

    public void c(int i4) throws IOException {
        this.f69131a.write(i4);
    }

    public void e(long j4, int i4) throws IOException {
        for (int i5 = 0; i5 < i4; i5++) {
            b(((int) (j4 >> ((i4 - i5) - 1))) & 1);
        }
    }

    public void f() throws IOException {
        e(0L, 8 - this.f69133c);
    }
}
