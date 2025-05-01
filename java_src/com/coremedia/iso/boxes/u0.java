package com.coremedia.iso.boxes;
/* compiled from: SampleTableBox.java */
/* loaded from: classes2.dex */
public class u0 extends com.googlecode.mp4parser.b {

    /* renamed from: p  reason: collision with root package name */
    public static final String f9959p = "stbl";

    /* renamed from: o  reason: collision with root package name */
    private v0 f9960o;

    public u0() {
        super(f9959p);
    }

    public f C() {
        for (d dVar : t()) {
            if (dVar instanceof f) {
                return (f) dVar;
            }
        }
        return null;
    }

    public i D() {
        for (d dVar : t()) {
            if (dVar instanceof i) {
                return (i) dVar;
            }
        }
        return null;
    }

    public r0 E() {
        for (d dVar : t()) {
            if (dVar instanceof r0) {
                return (r0) dVar;
            }
        }
        return null;
    }

    public t0 J() {
        for (d dVar : t()) {
            if (dVar instanceof t0) {
                return (t0) dVar;
            }
        }
        return null;
    }

    public v0 K() {
        v0 v0Var = this.f9960o;
        if (v0Var != null) {
            return v0Var;
        }
        for (d dVar : t()) {
            if (dVar instanceof v0) {
                v0 v0Var2 = (v0) dVar;
                this.f9960o = v0Var2;
                return v0Var2;
            }
        }
        return null;
    }

    public c1 N() {
        for (d dVar : t()) {
            if (dVar instanceof c1) {
                return (c1) dVar;
            }
        }
        return null;
    }

    public d1 P() {
        for (d dVar : t()) {
            if (dVar instanceof d1) {
                return (d1) dVar;
            }
        }
        return null;
    }

    public s0 o() {
        for (d dVar : t()) {
            if (dVar instanceof s0) {
                return (s0) dVar;
            }
        }
        return null;
    }
}
