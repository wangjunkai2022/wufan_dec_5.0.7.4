package com.coremedia.iso.boxes;

import java.util.List;
/* compiled from: MovieBox.java */
/* loaded from: classes2.dex */
public class h0 extends com.googlecode.mp4parser.b {

    /* renamed from: o  reason: collision with root package name */
    public static final String f9716o = "moov";

    public h0() {
        super(f9716o);
    }

    public i0 C() {
        for (d dVar : t()) {
            if (dVar instanceof i0) {
                return (i0) dVar;
            }
        }
        return null;
    }

    public int D() {
        return g(f1.class).size();
    }

    public long[] E() {
        List g4 = g(f1.class);
        long[] jArr = new long[g4.size()];
        for (int i4 = 0; i4 < g4.size(); i4++) {
            jArr[i4] = ((f1) g4.get(i4)).E().C();
        }
        return jArr;
    }
}
