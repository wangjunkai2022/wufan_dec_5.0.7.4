package com.coremedia.iso.boxes.fragment;

import com.swift.sandhook.annotation.MethodReflectParams;
import java.nio.ByteBuffer;
import org.aspectj.lang.c;
/* compiled from: TrackFragmentBaseMediaDecodeTimeBox.java */
/* loaded from: classes2.dex */
public class j extends com.googlecode.mp4parser.c {

    /* renamed from: t  reason: collision with root package name */
    public static final String f9647t = "tfdt";

    /* renamed from: u  reason: collision with root package name */
    private static final /* synthetic */ c.b f9648u = null;

    /* renamed from: v  reason: collision with root package name */
    private static final /* synthetic */ c.b f9649v = null;

    /* renamed from: w  reason: collision with root package name */
    private static final /* synthetic */ c.b f9650w = null;

    /* renamed from: s  reason: collision with root package name */
    private long f9651s;

    static {
        s();
    }

    public j() {
        super(f9647t);
    }

    private static /* synthetic */ void s() {
        org.aspectj.runtime.reflect.e eVar = new org.aspectj.runtime.reflect.e("TrackFragmentBaseMediaDecodeTimeBox.java", j.class);
        f9648u = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getBaseMediaDecodeTime", "com.coremedia.iso.boxes.fragment.TrackFragmentBaseMediaDecodeTimeBox", "", "", "", MethodReflectParams.LONG), 65);
        f9649v = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setBaseMediaDecodeTime", "com.coremedia.iso.boxes.fragment.TrackFragmentBaseMediaDecodeTimeBox", MethodReflectParams.LONG, "baseMediaDecodeTime", "", "void"), 69);
        f9650w = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "toString", "com.coremedia.iso.boxes.fragment.TrackFragmentBaseMediaDecodeTimeBox", "", "", "", "java.lang.String"), 74);
    }

    @Override // com.googlecode.mp4parser.a
    public void b(ByteBuffer byteBuffer) {
        t(byteBuffer);
        if (getVersion() == 1) {
            this.f9651s = com.coremedia.iso.g.o(byteBuffer);
        } else {
            this.f9651s = com.coremedia.iso.g.l(byteBuffer);
        }
    }

    @Override // com.googlecode.mp4parser.a
    protected void c(ByteBuffer byteBuffer) {
        u(byteBuffer);
        if (getVersion() == 1) {
            com.coremedia.iso.i.l(byteBuffer, this.f9651s);
        } else {
            com.coremedia.iso.i.i(byteBuffer, this.f9651s);
        }
    }

    @Override // com.googlecode.mp4parser.a
    protected long e() {
        return getVersion() == 0 ? 8 : 12;
    }

    public String toString() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(f9650w, this, this));
        return "TrackFragmentBaseMediaDecodeTimeBox{baseMediaDecodeTime=" + this.f9651s + '}';
    }

    public long v() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(f9648u, this, this));
        return this.f9651s;
    }

    public void w(long j4) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(f9649v, this, this, org.aspectj.runtime.internal.e.m(j4)));
        this.f9651s = j4;
    }
}
