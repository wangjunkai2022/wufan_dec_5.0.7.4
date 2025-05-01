package com.coremedia.iso.boxes;

import java.util.List;
/* compiled from: TrackBox.java */
/* loaded from: classes2.dex */
public class f1 extends com.googlecode.mp4parser.b {

    /* renamed from: p  reason: collision with root package name */
    public static final String f9603p = "trak";

    /* renamed from: o  reason: collision with root package name */
    private u0 f9604o;

    public f1() {
        super(f9603p);
    }

    public d0 C() {
        for (d dVar : t()) {
            if (dVar instanceof d0) {
                return (d0) dVar;
            }
        }
        return null;
    }

    public u0 D() {
        f0 E;
        u0 u0Var = this.f9604o;
        if (u0Var != null) {
            return u0Var;
        }
        d0 C = C();
        if (C == null || (E = C.E()) == null) {
            return null;
        }
        u0 D = E.D();
        this.f9604o = D;
        return D;
    }

    public g1 E() {
        for (d dVar : t()) {
            if (dVar instanceof g1) {
                return (g1) dVar;
            }
        }
        return null;
    }

    @Override // com.googlecode.mp4parser.d, com.coremedia.iso.boxes.j
    public void b(List<d> list) {
        super.b(list);
        this.f9604o = null;
    }
}
