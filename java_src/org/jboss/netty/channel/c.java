package org.jboss.netty.channel;

import java.util.ArrayList;
/* compiled from: AdaptiveReceiveBufferSizePredictor.java */
/* loaded from: classes7.dex */
public class c implements j0 {

    /* renamed from: f  reason: collision with root package name */
    static final int f72518f = 64;

    /* renamed from: g  reason: collision with root package name */
    static final int f72519g = 1024;

    /* renamed from: h  reason: collision with root package name */
    static final int f72520h = 65536;

    /* renamed from: i  reason: collision with root package name */
    private static final int f72521i = 4;

    /* renamed from: j  reason: collision with root package name */
    private static final int f72522j = 1;

    /* renamed from: k  reason: collision with root package name */
    private static final int[] f72523k;

    /* renamed from: a  reason: collision with root package name */
    private final int f72524a;

    /* renamed from: b  reason: collision with root package name */
    private final int f72525b;

    /* renamed from: c  reason: collision with root package name */
    private int f72526c;

    /* renamed from: d  reason: collision with root package name */
    private int f72527d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f72528e;

    static {
        int i4;
        ArrayList arrayList = new ArrayList();
        for (int i5 = 1; i5 <= 8; i5++) {
            arrayList.add(Integer.valueOf(i5));
        }
        int i6 = 4;
        while (true) {
            i4 = 0;
            if (i6 >= 32) {
                break;
            }
            long j4 = 1 << i6;
            long j5 = j4 >>> 4;
            long j6 = j4 - (j5 << 3);
            while (i4 < 8) {
                j6 += j5;
                if (j6 > 2147483647L) {
                    arrayList.add(Integer.MAX_VALUE);
                } else {
                    arrayList.add(Integer.valueOf((int) j6));
                }
                i4++;
            }
            i6++;
        }
        f72523k = new int[arrayList.size()];
        while (true) {
            int[] iArr = f72523k;
            if (i4 >= iArr.length) {
                return;
            }
            iArr[i4] = ((Integer) arrayList.get(i4)).intValue();
            i4++;
        }
    }

    public c() {
        this(64, 1024, 65536);
    }

    private static int c(int i4) {
        if (i4 <= 16) {
            return i4 - 1;
        }
        int i5 = 0;
        int i6 = i4;
        do {
            i6 >>>= 1;
            i5++;
        } while (i6 != 0);
        int i7 = i5 << 3;
        int i8 = i7 - 25;
        for (int i9 = i7 - 18; i9 >= i8; i9--) {
            if (i4 >= f72523k[i9]) {
                return i9;
            }
        }
        throw new Error("shouldn't reach here; please file a bug report.");
    }

    @Override // org.jboss.netty.channel.j0
    public int a() {
        return this.f72527d;
    }

    @Override // org.jboss.netty.channel.j0
    public void b(int i4) {
        int[] iArr = f72523k;
        if (i4 <= iArr[Math.max(0, (this.f72526c - 1) - 1)]) {
            if (this.f72528e) {
                int max = Math.max(this.f72526c - 1, this.f72524a);
                this.f72526c = max;
                this.f72527d = iArr[max];
                this.f72528e = false;
                return;
            }
            this.f72528e = true;
        } else if (i4 >= this.f72527d) {
            int min = Math.min(this.f72526c + 4, this.f72525b);
            this.f72526c = min;
            this.f72527d = iArr[min];
            this.f72528e = false;
        }
    }

    public c(int i4, int i5, int i6) {
        if (i4 <= 0) {
            throw new IllegalArgumentException("minimum: " + i4);
        } else if (i5 < i4) {
            throw new IllegalArgumentException("initial: " + i5);
        } else if (i6 >= i5) {
            int c5 = c(i4);
            int[] iArr = f72523k;
            if (iArr[c5] < i4) {
                this.f72524a = c5 + 1;
            } else {
                this.f72524a = c5;
            }
            int c6 = c(i6);
            if (iArr[c6] > i6) {
                this.f72525b = c6 - 1;
            } else {
                this.f72525b = c6;
            }
            int c7 = c(i5);
            this.f72526c = c7;
            this.f72527d = iArr[c7];
        } else {
            throw new IllegalArgumentException("maximum: " + i6);
        }
    }
}
