package com.coremedia.iso.boxes;
/* compiled from: MediaBox.java */
/* loaded from: classes2.dex */
public class d0 extends com.googlecode.mp4parser.b {

    /* renamed from: o  reason: collision with root package name */
    public static final String f9565o = "mdia";

    public d0() {
        super(f9565o);
    }

    public x C() {
        for (d dVar : t()) {
            if (dVar instanceof x) {
                return (x) dVar;
            }
        }
        return null;
    }

    public e0 D() {
        for (d dVar : t()) {
            if (dVar instanceof e0) {
                return (e0) dVar;
            }
        }
        return null;
    }

    public f0 E() {
        for (d dVar : t()) {
            if (dVar instanceof f0) {
                return (f0) dVar;
            }
        }
        return null;
    }
}
