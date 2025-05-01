package h1;

import g1.c;
import java.io.IOException;
import java.io.OutputStream;
/* compiled from: CAVLCWriter.java */
/* loaded from: classes3.dex */
public class b extends a {
    public b(OutputStream outputStream) {
        super(outputStream);
    }

    public void g(boolean z4, String str) throws IOException {
        c.b(String.valueOf(str) + "\t");
        b(z4 ? 1 : 0);
        c.g("\t" + z4);
    }

    public void h(long j4, int i4, String str) throws IOException {
        c.b(String.valueOf(str) + "\t");
        for (int i5 = 0; i5 < i4; i5++) {
            b(((int) (j4 >> ((i4 - i5) - 1))) & 1);
        }
        c.g("\t" + j4);
    }

    public void i(int i4, String str) throws IOException {
        c.b(String.valueOf(str) + "\t");
        n(((i4 << 1) * (i4 < 0 ? -1 : 1)) + (i4 <= 0 ? 0 : 1));
        c.g("\t" + i4);
    }

    public void j() {
        throw new IllegalStateException("todo");
    }

    public void k() throws IOException {
        b(1);
        f();
        a();
    }

    public void l(int i4, int i5) throws IOException {
        e(i4, i5);
    }

    public void m(int i4, int i5, String str) throws IOException {
        c.b(String.valueOf(str) + "\t");
        e((long) i4, i5);
        c.g("\t" + i4);
    }

    public void n(int i4) throws IOException {
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            if (i6 >= 15) {
                break;
            }
            int i8 = (1 << i6) + i7;
            if (i4 < i8) {
                i5 = i6;
                break;
            } else {
                i6++;
                i7 = i8;
            }
        }
        e(0L, i5);
        b(1);
        e(i4 - i7, i5);
    }

    public void o(int i4, String str) throws IOException {
        c.b(String.valueOf(str) + "\t");
        n(i4);
        c.g("\t" + i4);
    }
}
