package com.coremedia.iso.boxes;

import org.aspectj.lang.c;
/* compiled from: ChunkOffsetBox.java */
/* loaded from: classes2.dex */
public abstract class f extends com.googlecode.mp4parser.c {

    /* renamed from: s  reason: collision with root package name */
    private static final /* synthetic */ c.b f9601s = null;

    static {
        s();
    }

    public f(String str) {
        super(str);
    }

    private static /* synthetic */ void s() {
        org.aspectj.runtime.reflect.e eVar = new org.aspectj.runtime.reflect.e("ChunkOffsetBox.java", f.class);
        f9601s = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "toString", "com.coremedia.iso.boxes.ChunkOffsetBox", "", "", "", "java.lang.String"), 18);
    }

    public String toString() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(f9601s, this, this));
        return getClass().getSimpleName() + "[entryCount=" + v().length + "]";
    }

    public abstract long[] v();

    public abstract void w(long[] jArr);
}
