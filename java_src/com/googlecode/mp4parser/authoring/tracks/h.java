package com.googlecode.mp4parser.authoring.tracks;

import com.coremedia.iso.boxes.a1;
import com.coremedia.iso.boxes.i;
import com.coremedia.iso.boxes.r0;
import com.coremedia.iso.boxes.s0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;
/* compiled from: ChangeTimeScaleTrack.java */
/* loaded from: classes3.dex */
public class h implements com.googlecode.mp4parser.authoring.h {

    /* renamed from: f  reason: collision with root package name */
    private static final Logger f13439f = Logger.getLogger(h.class.getName());

    /* renamed from: b  reason: collision with root package name */
    com.googlecode.mp4parser.authoring.h f13440b;

    /* renamed from: c  reason: collision with root package name */
    List<i.a> f13441c;

    /* renamed from: d  reason: collision with root package name */
    long[] f13442d;

    /* renamed from: e  reason: collision with root package name */
    long f13443e;

    public h(com.googlecode.mp4parser.authoring.h hVar, long j4, long[] jArr) {
        this.f13440b = hVar;
        this.f13443e = j4;
        double d5 = j4;
        double h4 = hVar.M().h();
        Double.isNaN(d5);
        Double.isNaN(h4);
        double d6 = d5 / h4;
        this.f13441c = a(hVar.n(), d6);
        this.f13442d = b(hVar.O(), d6, jArr, d(hVar, jArr, j4));
    }

    static List<i.a> a(List<i.a> list, double d5) {
        if (list != null) {
            ArrayList arrayList = new ArrayList(list.size());
            for (i.a aVar : list) {
                int a5 = aVar.a();
                double b5 = aVar.b();
                Double.isNaN(b5);
                arrayList.add(new i.a(a5, (int) Math.round(b5 * d5)));
            }
            return arrayList;
        }
        return null;
    }

    static long[] b(long[] jArr, double d5, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[jArr.length];
        long j4 = 0;
        int i4 = 1;
        while (i4 <= jArr.length) {
            int i5 = i4 - 1;
            double d6 = jArr[i5];
            Double.isNaN(d6);
            long round = Math.round(d6 * d5);
            int i6 = i4 + 1;
            int binarySearch = Arrays.binarySearch(jArr2, i6);
            if (binarySearch >= 0 && jArr3[binarySearch] != j4) {
                long j5 = jArr3[binarySearch] - (j4 + round);
                f13439f.finest(String.format("Sample %d %d / %d - correct by %d", Integer.valueOf(i4), Long.valueOf(j4), Long.valueOf(jArr3[binarySearch]), Long.valueOf(j5)));
                round += j5;
            }
            j4 += round;
            jArr4[i5] = round;
            i4 = i6;
        }
        return jArr4;
    }

    private static long[] d(com.googlecode.mp4parser.authoring.h hVar, long[] jArr, long j4) {
        long[] jArr2 = new long[jArr.length];
        long j5 = 0;
        int i4 = 0;
        int i5 = 1;
        while (true) {
            long j6 = i5;
            if (j6 > jArr[jArr.length - 1]) {
                return jArr2;
            }
            if (j6 == jArr[i4]) {
                jArr2[i4] = (j5 * j4) / hVar.M().h();
                i4++;
            }
            j5 += hVar.O()[i5 - 1];
            i5++;
        }
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public List<com.googlecode.mp4parser.authoring.c> H() {
        return this.f13440b.H();
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public Map<com.googlecode.mp4parser.boxes.mp4.samplegrouping.b, long[]> I() {
        return this.f13440b.I();
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public com.googlecode.mp4parser.authoring.i M() {
        com.googlecode.mp4parser.authoring.i iVar = (com.googlecode.mp4parser.authoring.i) this.f13440b.M().clone();
        iVar.s(this.f13443e);
        return iVar;
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public long[] O() {
        return this.f13442d;
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public List<r0.a> U() {
        return this.f13440b.U();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f13440b.close();
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public long getDuration() {
        long j4 = 0;
        for (long j5 : this.f13442d) {
            j4 += j5;
        }
        return j4;
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public String getHandler() {
        return this.f13440b.getHandler();
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public String getName() {
        return "timeScale(" + this.f13440b.getName() + ")";
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public List<i.a> n() {
        return this.f13441c;
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public s0 o() {
        return this.f13440b.o();
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public long[] q() {
        return this.f13440b.q();
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public a1 s() {
        return this.f13440b.s();
    }

    public String toString() {
        return "ChangeTimeScaleTrack{source=" + this.f13440b + '}';
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public List<com.googlecode.mp4parser.authoring.f> x() {
        return this.f13440b.x();
    }
}
