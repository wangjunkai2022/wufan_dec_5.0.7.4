package com.coremedia.iso.boxes;
/* compiled from: MediaInformationBox.java */
/* loaded from: classes2.dex */
public class f0 extends com.googlecode.mp4parser.b {

    /* renamed from: o  reason: collision with root package name */
    public static final String f9602o = "minf";

    public f0() {
        super(f9602o);
    }

    public a C() {
        for (d dVar : t()) {
            if (dVar instanceof a) {
                return (a) dVar;
            }
        }
        return null;
    }

    public u0 D() {
        for (d dVar : t()) {
            if (dVar instanceof u0) {
                return (u0) dVar;
            }
        }
        return null;
    }
}
