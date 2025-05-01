package com.googlecode.mp4parser.h264.read;

import java.io.IOException;
import java.io.InputStream;
/* compiled from: BitstreamReader.java */
/* loaded from: classes3.dex */
public class a {

    /* renamed from: f  reason: collision with root package name */
    protected static int f14203f;

    /* renamed from: a  reason: collision with root package name */
    private InputStream f14204a;

    /* renamed from: b  reason: collision with root package name */
    private int f14205b;

    /* renamed from: c  reason: collision with root package name */
    private int f14206c;

    /* renamed from: d  reason: collision with root package name */
    int f14207d;

    /* renamed from: e  reason: collision with root package name */
    protected g1.b f14208e = new g1.b(50);

    public a(InputStream inputStream) throws IOException {
        this.f14204a = inputStream;
        this.f14205b = inputStream.read();
        this.f14206c = inputStream.read();
    }

    private void a() throws IOException {
        this.f14205b = this.f14206c;
        this.f14206c = this.f14204a.read();
        this.f14207d = 0;
    }

    public void b() throws IOException {
    }

    public long c() {
        return (f14203f * 8) + (this.f14207d % 8);
    }

    public int d() {
        return this.f14207d;
    }

    public boolean e() {
        return this.f14207d % 8 == 0;
    }

    public boolean f() throws IOException {
        if (this.f14207d == 8) {
            a();
        }
        int i4 = 1 << ((8 - this.f14207d) - 1);
        int i5 = this.f14205b;
        return (i5 == -1 || (this.f14206c == -1 && ((((i4 << 1) - 1) & i5) == i4))) ? false : true;
    }

    public int g(int i4) throws IOException {
        if (i4 <= 8) {
            if (this.f14207d == 8) {
                a();
                if (this.f14205b == -1) {
                    return -1;
                }
            }
            int i5 = this.f14207d;
            int[] iArr = new int[16 - i5];
            int i6 = 0;
            while (i5 < 8) {
                iArr[i6] = (this.f14205b >> (7 - i5)) & 1;
                i5++;
                i6++;
            }
            int i7 = 0;
            while (i7 < 8) {
                iArr[i6] = (this.f14206c >> (7 - i7)) & 1;
                i7++;
                i6++;
            }
            int i8 = 0;
            for (int i9 = 0; i9 < i4; i9++) {
                i8 = (i8 << 1) | iArr[i9];
            }
            return i8;
        }
        throw new IllegalArgumentException("N should be less then 8");
    }

    public int h() throws IOException {
        if (this.f14207d == 8) {
            a();
            if (this.f14205b == -1) {
                return -1;
            }
        }
        int i4 = this.f14205b;
        int i5 = this.f14207d;
        int i6 = (i4 >> (7 - i5)) & 1;
        this.f14207d = i5 + 1;
        this.f14208e.a(i6 == 0 ? '0' : '1');
        f14203f++;
        return i6;
    }

    public boolean i() throws IOException {
        return h() == 1;
    }

    public int j() throws IOException {
        if (this.f14207d > 0) {
            a();
        }
        int i4 = this.f14205b;
        a();
        return i4;
    }

    public long k(int i4) throws IOException {
        if (i4 <= 64) {
            long j4 = 0;
            for (int i5 = 0; i5 < i4; i5++) {
                j4 = (j4 << 1) | h();
            }
            return j4;
        }
        throw new IllegalArgumentException("Can not readByte more then 64 bit");
    }

    public long l() throws IOException {
        return k(8 - this.f14207d);
    }
}
