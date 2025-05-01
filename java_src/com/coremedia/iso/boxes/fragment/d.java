package com.coremedia.iso.boxes.fragment;

import com.swift.sandhook.annotation.MethodReflectParams;
import java.nio.ByteBuffer;
import org.aspectj.lang.c;
/* compiled from: MovieFragmentHeaderBox.java */
/* loaded from: classes2.dex */
public class d extends com.googlecode.mp4parser.c {

    /* renamed from: t  reason: collision with root package name */
    public static final String f9611t = "mfhd";

    /* renamed from: u  reason: collision with root package name */
    private static final /* synthetic */ c.b f9612u = null;

    /* renamed from: v  reason: collision with root package name */
    private static final /* synthetic */ c.b f9613v = null;

    /* renamed from: w  reason: collision with root package name */
    private static final /* synthetic */ c.b f9614w = null;

    /* renamed from: s  reason: collision with root package name */
    private long f9615s;

    static {
        s();
    }

    public d() {
        super(f9611t);
    }

    private static /* synthetic */ void s() {
        org.aspectj.runtime.reflect.e eVar = new org.aspectj.runtime.reflect.e("MovieFragmentHeaderBox.java", d.class);
        f9612u = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getSequenceNumber", "com.coremedia.iso.boxes.fragment.MovieFragmentHeaderBox", "", "", "", MethodReflectParams.LONG), 59);
        f9613v = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setSequenceNumber", "com.coremedia.iso.boxes.fragment.MovieFragmentHeaderBox", MethodReflectParams.LONG, "sequenceNumber", "", "void"), 63);
        f9614w = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "toString", "com.coremedia.iso.boxes.fragment.MovieFragmentHeaderBox", "", "", "", "java.lang.String"), 68);
    }

    @Override // com.googlecode.mp4parser.a
    public void b(ByteBuffer byteBuffer) {
        t(byteBuffer);
        this.f9615s = com.coremedia.iso.g.l(byteBuffer);
    }

    @Override // com.googlecode.mp4parser.a
    protected void c(ByteBuffer byteBuffer) {
        u(byteBuffer);
        com.coremedia.iso.i.i(byteBuffer, this.f9615s);
    }

    @Override // com.googlecode.mp4parser.a
    protected long e() {
        return 8L;
    }

    public String toString() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(f9614w, this, this));
        return "MovieFragmentHeaderBox{sequenceNumber=" + this.f9615s + '}';
    }

    public long v() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(f9612u, this, this));
        return this.f9615s;
    }

    public void w(long j4) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(f9613v, this, this, org.aspectj.runtime.internal.e.m(j4)));
        this.f9615s = j4;
    }
}
