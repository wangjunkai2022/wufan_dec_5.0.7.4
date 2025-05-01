package com.googlecode.mp4parser.authoring.builder;

import java.util.Arrays;
/* compiled from: TwoSecondIntersectionFinder.java */
/* loaded from: classes3.dex */
public class h implements c {

    /* renamed from: a  reason: collision with root package name */
    private int f13196a;

    /* renamed from: b  reason: collision with root package name */
    private com.googlecode.mp4parser.authoring.d f13197b;

    public h(com.googlecode.mp4parser.authoring.d dVar, int i4) {
        this.f13196a = 2;
        this.f13197b = dVar;
        this.f13196a = i4;
    }

    @Override // com.googlecode.mp4parser.authoring.builder.c
    public long[] a(com.googlecode.mp4parser.authoring.h hVar) {
        double d5 = 0.0d;
        for (com.googlecode.mp4parser.authoring.h hVar2 : this.f13197b.g()) {
            double duration = hVar2.getDuration() / hVar2.M().h();
            if (d5 < duration) {
                d5 = duration;
            }
        }
        double d6 = this.f13196a;
        Double.isNaN(d6);
        int i4 = 1;
        int min = Math.min(((int) Math.ceil(d5 / d6)) - 1, hVar.x().size());
        int i5 = min < 1 ? 1 : min;
        long[] jArr = new long[i5];
        Arrays.fill(jArr, -1L);
        jArr[0] = 1;
        long j4 = 0;
        long[] O = hVar.O();
        int length = O.length;
        int i6 = 0;
        int i7 = 0;
        while (i6 < length) {
            long j5 = O[i6];
            int h4 = ((int) ((j4 / hVar.M().h()) / this.f13196a)) + i4;
            if (h4 >= i5) {
                break;
            }
            i7++;
            jArr[h4] = i7;
            j4 += j5;
            i6++;
            i5 = i5;
            i4 = 1;
        }
        long j6 = i7 + i4;
        for (int i8 = i5 - 1; i8 >= 0; i8--) {
            if (jArr[i8] == -1) {
                jArr[i8] = j6;
            }
            j6 = jArr[i8];
        }
        long[] jArr2 = new long[0];
        for (int i9 = 0; i9 < i5; i9++) {
            long j7 = jArr[i9];
            if (jArr2.length == 0 || jArr2[jArr2.length - i4] != j7) {
                jArr2 = Arrays.copyOf(jArr2, jArr2.length + i4);
                jArr2[jArr2.length - i4] = j7;
            }
        }
        return jArr2;
    }
}
