package com.googlecode.mp4parser.authoring.builder;

import com.coremedia.iso.boxes.l0;
import com.googlecode.mp4parser.util.k;
import com.googlecode.mp4parser.util.m;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Logger;
/* compiled from: SyncSampleIntersectFinderImpl.java */
/* loaded from: classes3.dex */
public class g implements c {

    /* renamed from: d  reason: collision with root package name */
    private static Logger f13192d = Logger.getLogger(g.class.getName());

    /* renamed from: a  reason: collision with root package name */
    private final int f13193a;

    /* renamed from: b  reason: collision with root package name */
    private com.googlecode.mp4parser.authoring.d f13194b;

    /* renamed from: c  reason: collision with root package name */
    private com.googlecode.mp4parser.authoring.h f13195c;

    public g(com.googlecode.mp4parser.authoring.d dVar, com.googlecode.mp4parser.authoring.h hVar, int i4) {
        this.f13194b = dVar;
        this.f13195c = hVar;
        this.f13193a = i4;
    }

    private static long b(com.googlecode.mp4parser.authoring.d dVar, com.googlecode.mp4parser.authoring.h hVar) {
        long j4 = 1;
        for (com.googlecode.mp4parser.authoring.h hVar2 : dVar.g()) {
            if (hVar2.getHandler().equals(hVar.getHandler()) && hVar2.M().h() != hVar.M().h()) {
                j4 = k.d(j4, hVar2.M().h());
            }
        }
        return j4;
    }

    static String d(com.googlecode.mp4parser.authoring.h hVar) {
        com.coremedia.iso.boxes.sampleentry.a C = hVar.o().C();
        String type = C.getType();
        return (type.equals(com.coremedia.iso.boxes.sampleentry.h.E) || type.equals(com.coremedia.iso.boxes.sampleentry.c.O) || type.equals(com.coremedia.iso.boxes.sampleentry.h.E)) ? ((l0) m.c(C, "sinf/frma")).t() : type;
    }

    public static List<long[]> e(com.googlecode.mp4parser.authoring.d dVar, com.googlecode.mp4parser.authoring.h hVar) {
        long[] q4;
        LinkedList linkedList = new LinkedList();
        for (com.googlecode.mp4parser.authoring.h hVar2 : dVar.g()) {
            if (hVar2.getHandler().equals(hVar.getHandler()) && (q4 = hVar2.q()) != null && q4.length > 0) {
                linkedList.add(f(hVar2, dVar));
            }
        }
        return linkedList;
    }

    private static long[] f(com.googlecode.mp4parser.authoring.h hVar, com.googlecode.mp4parser.authoring.d dVar) {
        long[] q4 = hVar.q();
        long[] jArr = new long[q4.length];
        long b5 = b(dVar, hVar);
        long j4 = 0;
        int i4 = 0;
        int i5 = 1;
        while (true) {
            long j5 = i5;
            if (j5 > q4[q4.length - 1]) {
                return jArr;
            }
            if (j5 == q4[i4]) {
                jArr[i4] = j4 * b5;
                i4++;
            }
            j4 += hVar.O()[i5 - 1];
            i5++;
        }
    }

    @Override // com.googlecode.mp4parser.authoring.builder.c
    public long[] a(com.googlecode.mp4parser.authoring.h hVar) {
        if ("vide".equals(hVar.getHandler())) {
            if (hVar.q() != null && hVar.q().length > 0) {
                List<long[]> e5 = e(this.f13194b, hVar);
                return c(hVar.q(), f(hVar, this.f13194b), hVar.M().h(), (long[][]) e5.toArray(new long[e5.size()]));
            }
            throw new RuntimeException("Video Tracks need sync samples. Only tracks other than video may have no sync samples.");
        }
        int i4 = 0;
        if ("soun".equals(hVar.getHandler())) {
            if (this.f13195c == null) {
                for (com.googlecode.mp4parser.authoring.h hVar2 : this.f13194b.g()) {
                    if (hVar2.q() != null && "vide".equals(hVar2.getHandler()) && hVar2.q().length > 0) {
                        this.f13195c = hVar2;
                    }
                }
            }
            com.googlecode.mp4parser.authoring.h hVar3 = this.f13195c;
            if (hVar3 != null) {
                long[] a5 = a(hVar3);
                int size = this.f13195c.x().size();
                int length = a5.length;
                long[] jArr = new long[length];
                long j4 = 192000;
                Iterator<com.googlecode.mp4parser.authoring.h> it2 = this.f13194b.g().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    com.googlecode.mp4parser.authoring.h next = it2.next();
                    if (d(hVar).equals(d(next))) {
                        com.coremedia.iso.boxes.sampleentry.c cVar = (com.coremedia.iso.boxes.sampleentry.c) next.o().C();
                        if (cVar.T() < 192000) {
                            long T = cVar.T();
                            double d5 = size;
                            Double.isNaN(r10);
                            Double.isNaN(d5);
                            double d6 = r10 / d5;
                            long j5 = next.O()[0];
                            int i5 = 0;
                            while (i5 < length) {
                                double d7 = a5[i5] - 1;
                                Double.isNaN(d7);
                                double d8 = j5;
                                Double.isNaN(d8);
                                jArr[i5] = (long) Math.ceil(d7 * d6 * d8);
                                i5++;
                                a5 = a5;
                                length = length;
                                i4 = 0;
                            }
                            j4 = T;
                        }
                    }
                }
                long j6 = hVar.O()[i4];
                double T2 = ((com.coremedia.iso.boxes.sampleentry.c) hVar.o().C()).T();
                double d9 = j4;
                Double.isNaN(T2);
                Double.isNaN(d9);
                double d10 = T2 / d9;
                if (d10 == Math.rint(d10)) {
                    while (i4 < length) {
                        double d11 = jArr[i4];
                        Double.isNaN(d11);
                        double d12 = j6;
                        Double.isNaN(d12);
                        jArr[i4] = (long) (((d11 * d10) / d12) + 1.0d);
                        i4++;
                    }
                    return jArr;
                }
                throw new RuntimeException("Sample rates must be a multiple of the lowest sample rate to create a correct file!");
            }
            throw new RuntimeException("There was absolutely no Track with sync samples. I can't work with that!");
        }
        for (com.googlecode.mp4parser.authoring.h hVar4 : this.f13194b.g()) {
            if (hVar4.q() != null && hVar4.q().length > 0) {
                long[] a6 = a(hVar4);
                int size2 = hVar4.x().size();
                int length2 = a6.length;
                long[] jArr2 = new long[length2];
                double d13 = size2;
                Double.isNaN(r7);
                Double.isNaN(d13);
                double d14 = r7 / d13;
                for (int i6 = 0; i6 < length2; i6++) {
                    double d15 = a6[i6] - 1;
                    Double.isNaN(d15);
                    jArr2[i6] = ((long) Math.ceil(d15 * d14)) + 1;
                }
                return jArr2;
            }
        }
        throw new RuntimeException("There was absolutely no Track with sync samples. I can't work with that!");
    }

    public long[] c(long[] jArr, long[] jArr2, long j4, long[]... jArr3) {
        LinkedList linkedList;
        LinkedList<Long> linkedList2 = new LinkedList();
        LinkedList linkedList3 = new LinkedList();
        for (int i4 = 0; i4 < jArr2.length; i4++) {
            boolean z4 = true;
            for (long[] jArr4 : jArr3) {
                z4 &= Arrays.binarySearch(jArr4, jArr2[i4]) >= 0;
            }
            if (z4) {
                linkedList2.add(Long.valueOf(jArr[i4]));
                linkedList3.add(Long.valueOf(jArr2[i4]));
            }
        }
        double length = jArr.length;
        Double.isNaN(length);
        if (linkedList2.size() < length * 0.25d) {
            String str = "" + String.format("%5d - Common:  [", Integer.valueOf(linkedList2.size()));
            for (Long l4 : linkedList2) {
                long longValue = l4.longValue();
                str = String.valueOf(str) + String.format("%10d,", Long.valueOf(longValue));
            }
            f13192d.warning(String.valueOf(str) + "]");
            String str2 = "" + String.format("%5d - In    :  [", Integer.valueOf(jArr.length));
            for (long j5 : jArr) {
                str2 = String.valueOf(str2) + String.format("%10d,", Long.valueOf(j5));
            }
            f13192d.warning(String.valueOf(str2) + "]");
            f13192d.warning("There are less than 25% of common sync samples in the given track.");
            throw new RuntimeException("There are less than 25% of common sync samples in the given track.");
        }
        double length2 = jArr.length;
        Double.isNaN(length2);
        if (linkedList2.size() < length2 * 0.5d) {
            f13192d.fine("There are less than 50% of common sync samples in the given track. This is implausible but I'm ok to continue.");
        } else if (linkedList2.size() < jArr.length) {
            f13192d.finest("Common SyncSample positions vs. this tracks SyncSample positions: " + linkedList2.size() + " vs. " + jArr.length);
        }
        LinkedList linkedList4 = new LinkedList();
        if (this.f13193a > 0) {
            Iterator it2 = linkedList2.iterator();
            Iterator it3 = linkedList3.iterator();
            long j6 = -1;
            long j7 = -1;
            while (it2.hasNext() && it3.hasNext()) {
                long longValue2 = ((Long) it2.next()).longValue();
                long longValue3 = ((Long) it3.next()).longValue();
                if (j7 == j6 || (longValue3 - j7) / j4 >= this.f13193a) {
                    linkedList4.add(Long.valueOf(longValue2));
                    j7 = longValue3;
                }
                j6 = -1;
            }
            linkedList = linkedList4;
        } else {
            linkedList = linkedList2;
        }
        int size = linkedList.size();
        long[] jArr5 = new long[size];
        for (int i5 = 0; i5 < size; i5++) {
            jArr5[i5] = ((Long) linkedList.get(i5)).longValue();
        }
        return jArr5;
    }
}
