package com.coremedia.iso.boxes.fragment;

import com.swift.sandhook.annotation.MethodReflectParams;
import java.nio.ByteBuffer;
import org.aspectj.lang.c;
/* compiled from: MovieExtendsHeaderBox.java */
/* loaded from: classes2.dex */
public class b extends com.googlecode.mp4parser.c {

    /* renamed from: t  reason: collision with root package name */
    public static final String f9606t = "mehd";

    /* renamed from: u  reason: collision with root package name */
    private static final /* synthetic */ c.b f9607u = null;

    /* renamed from: v  reason: collision with root package name */
    private static final /* synthetic */ c.b f9608v = null;

    /* renamed from: s  reason: collision with root package name */
    private long f9609s;

    static {
        s();
    }

    public b() {
        super(f9606t);
    }

    private static /* synthetic */ void s() {
        org.aspectj.runtime.reflect.e eVar = new org.aspectj.runtime.reflect.e("MovieExtendsHeaderBox.java", b.class);
        f9607u = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getFragmentDuration", "com.coremedia.iso.boxes.fragment.MovieExtendsHeaderBox", "", "", "", MethodReflectParams.LONG), 65);
        f9608v = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setFragmentDuration", "com.coremedia.iso.boxes.fragment.MovieExtendsHeaderBox", MethodReflectParams.LONG, "fragmentDuration", "", "void"), 69);
    }

    @Override // com.googlecode.mp4parser.a
    public void b(ByteBuffer byteBuffer) {
        t(byteBuffer);
        this.f9609s = getVersion() == 1 ? com.coremedia.iso.g.o(byteBuffer) : com.coremedia.iso.g.l(byteBuffer);
    }

    @Override // com.googlecode.mp4parser.a
    protected void c(ByteBuffer byteBuffer) {
        u(byteBuffer);
        if (getVersion() == 1) {
            com.coremedia.iso.i.l(byteBuffer, this.f9609s);
        } else {
            com.coremedia.iso.i.i(byteBuffer, this.f9609s);
        }
    }

    @Override // com.googlecode.mp4parser.a
    protected long e() {
        return getVersion() == 1 ? 12 : 8;
    }

    public long v() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(f9607u, this, this));
        return this.f9609s;
    }

    public void w(long j4) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(f9608v, this, this, org.aspectj.runtime.internal.e.m(j4)));
        this.f9609s = j4;
    }
}
