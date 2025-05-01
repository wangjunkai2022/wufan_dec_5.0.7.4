package com.ss.android.socialbase.appdownloader.u.vv;

import java.io.IOException;
import java.io.InputStream;
/* loaded from: classes5.dex */
class vv implements wv {

    /* renamed from: b  reason: collision with root package name */
    private int f60901b;

    /* renamed from: i  reason: collision with root package name */
    private u f60902i;
    private int[] jh;

    /* renamed from: k  reason: collision with root package name */
    private int f60903k;

    /* renamed from: m  reason: collision with root package name */
    private i f60904m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f60905n;

    /* renamed from: o  reason: collision with root package name */
    private int[] f60906o;

    /* renamed from: q  reason: collision with root package name */
    private int f60908q;
    private int qv;

    /* renamed from: r  reason: collision with root package name */
    private int f60909r;

    /* renamed from: t  reason: collision with root package name */
    private int f60910t;
    private int wv;

    /* renamed from: p  reason: collision with root package name */
    private boolean f60907p = false;

    /* renamed from: u  reason: collision with root package name */
    private C0625vv f60911u = new C0625vv();

    public vv() {
        n();
    }

    private final void n() {
        this.qv = -1;
        this.wv = -1;
        this.f60903k = -1;
        this.f60901b = -1;
        this.jh = null;
        this.f60909r = -1;
        this.f60910t = -1;
        this.f60908q = -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x0184, code lost:
        throw new java.io.IOException("Invalid chunk type (" + r5 + ").");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void qv() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.appdownloader.u.vv.vv.qv():void");
    }

    @Override // com.ss.android.socialbase.appdownloader.u.vv.n
    public String i() {
        return "XML line #" + p();
    }

    public int m() throws qv, IOException {
        if (this.f60904m != null) {
            try {
                qv();
                return this.qv;
            } catch (IOException e5) {
                vv();
                throw e5;
            }
        }
        throw new qv("Parser is not opened.", this, null);
    }

    public int o() {
        if (this.qv != 2) {
            return -1;
        }
        return this.jh.length / 5;
    }

    @Override // com.ss.android.socialbase.appdownloader.u.vv.n
    public int p() {
        return this.wv;
    }

    @Override // com.ss.android.socialbase.appdownloader.u.vv.n
    public int u() {
        return -1;
    }

    public void vv(InputStream inputStream) {
        vv();
        if (inputStream != null) {
            this.f60904m = new i(inputStream, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.ss.android.socialbase.appdownloader.u.vv.vv$vv  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static final class C0625vv {

        /* renamed from: m  reason: collision with root package name */
        private int f60912m;

        /* renamed from: p  reason: collision with root package name */
        private int f60913p;
        private int[] vv = new int[32];

        public final int i() {
            return this.f60913p;
        }

        public final int m() {
            int i4 = this.f60912m;
            if (i4 == 0) {
                return 0;
            }
            return this.vv[i4 - 1];
        }

        public final void o() {
            vv(2);
            int i4 = this.f60912m;
            int[] iArr = this.vv;
            iArr[i4] = 0;
            iArr[i4 + 1] = 0;
            this.f60912m = i4 + 2;
            this.f60913p++;
        }

        public final boolean p() {
            int i4;
            int[] iArr;
            int i5;
            int i6 = this.f60912m;
            if (i6 == 0 || (i5 = (iArr = this.vv)[i6 - 1]) == 0) {
                return false;
            }
            int i7 = i5 - 1;
            int i8 = i4 - 2;
            iArr[i8] = i7;
            iArr[i8 - ((i7 * 2) + 1)] = i7;
            this.f60912m = i6 - 2;
            return true;
        }

        public final void u() {
            int i4 = this.f60912m;
            if (i4 != 0) {
                int i5 = i4 - 1;
                int i6 = this.vv[i5] * 2;
                if ((i5 - 1) - i6 != 0) {
                    this.f60912m = i4 - (i6 + 2);
                    this.f60913p--;
                }
            }
        }

        public final void vv() {
            this.f60912m = 0;
            this.f60913p = 0;
        }

        public final void vv(int i4, int i5) {
            if (this.f60913p == 0) {
                o();
            }
            vv(2);
            int i6 = this.f60912m;
            int i7 = i6 - 1;
            int[] iArr = this.vv;
            int i8 = iArr[i7];
            int i9 = i8 + 1;
            iArr[(i7 - 1) - (i8 * 2)] = i9;
            iArr[i7] = i4;
            iArr[i7 + 1] = i5;
            iArr[i7 + 2] = i9;
            this.f60912m = i6 + 2;
        }

        private void vv(int i4) {
            int[] iArr = this.vv;
            int length = iArr.length;
            int i5 = this.f60912m;
            int i6 = length - i5;
            if (i6 <= i4) {
                int[] iArr2 = new int[(iArr.length + i6) * 2];
                System.arraycopy(iArr, 0, iArr2, 0, i5);
                this.vv = iArr2;
            }
        }
    }

    private final int o(int i4) {
        if (this.qv == 2) {
            int i5 = i4 * 5;
            if (i5 < this.jh.length) {
                return i5;
            }
            throw new IndexOutOfBoundsException("Invalid attribute index (" + i4 + ").");
        }
        throw new IndexOutOfBoundsException("Current event is not START_TAG.");
    }

    public String i(int i4) {
        int o4 = o(i4);
        int[] iArr = this.jh;
        if (iArr[o4 + 3] == 3) {
            return this.f60902i.vv(iArr[o4 + 2]);
        }
        return "";
    }

    public int p(int i4) {
        return this.jh[o(i4) + 4];
    }

    public void vv() {
        if (this.f60907p) {
            this.f60907p = false;
            this.f60904m.vv();
            this.f60904m = null;
            this.f60902i = null;
            this.f60906o = null;
            this.f60911u.vv();
            n();
        }
    }

    public int m(int i4) {
        return this.jh[o(i4) + 3];
    }

    public String vv(int i4) {
        int i5 = this.jh[o(i4) + 1];
        return i5 == -1 ? "" : this.f60902i.vv(i5);
    }
}
