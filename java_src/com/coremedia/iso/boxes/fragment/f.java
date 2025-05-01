package com.coremedia.iso.boxes.fragment;

import com.swift.sandhook.annotation.MethodReflectParams;
import java.nio.ByteBuffer;
import org.aspectj.lang.c;
/* compiled from: MovieFragmentRandomAccessOffsetBox.java */
/* loaded from: classes2.dex */
public class f extends com.googlecode.mp4parser.c {

    /* renamed from: t  reason: collision with root package name */
    public static final String f9617t = "mfro";

    /* renamed from: u  reason: collision with root package name */
    private static final /* synthetic */ c.b f9618u = null;

    /* renamed from: v  reason: collision with root package name */
    private static final /* synthetic */ c.b f9619v = null;

    /* renamed from: s  reason: collision with root package name */
    private long f9620s;

    static {
        s();
    }

    public f() {
        super(f9617t);
    }

    private static /* synthetic */ void s() {
        org.aspectj.runtime.reflect.e eVar = new org.aspectj.runtime.reflect.e("MovieFragmentRandomAccessOffsetBox.java", f.class);
        f9618u = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getMfraSize", "com.coremedia.iso.boxes.fragment.MovieFragmentRandomAccessOffsetBox", "", "", "", MethodReflectParams.LONG), 56);
        f9619v = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setMfraSize", "com.coremedia.iso.boxes.fragment.MovieFragmentRandomAccessOffsetBox", MethodReflectParams.LONG, "mfraSize", "", "void"), 60);
    }

    @Override // com.googlecode.mp4parser.a
    public void b(ByteBuffer byteBuffer) {
        t(byteBuffer);
        this.f9620s = com.coremedia.iso.g.l(byteBuffer);
    }

    @Override // com.googlecode.mp4parser.a
    protected void c(ByteBuffer byteBuffer) {
        u(byteBuffer);
        com.coremedia.iso.i.i(byteBuffer, this.f9620s);
    }

    @Override // com.googlecode.mp4parser.a
    protected long e() {
        return 8L;
    }

    public long v() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(f9618u, this, this));
        return this.f9620s;
    }

    public void w(long j4) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(f9619v, this, this, org.aspectj.runtime.internal.e.m(j4)));
        this.f9620s = j4;
    }
}
