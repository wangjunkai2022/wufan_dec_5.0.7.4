package com.coremedia.iso.boxes.fragment;

import com.swift.sandhook.annotation.MethodReflectParams;
import java.nio.ByteBuffer;
import org.aspectj.lang.c;
/* compiled from: TrackExtendsBox.java */
/* loaded from: classes2.dex */
public class i extends com.googlecode.mp4parser.c {
    private static final /* synthetic */ c.b A = null;
    private static final /* synthetic */ c.b B = null;
    private static final /* synthetic */ c.b C = null;
    private static final /* synthetic */ c.b D = null;
    private static final /* synthetic */ c.b E = null;
    private static final /* synthetic */ c.b F = null;
    private static final /* synthetic */ c.b G = null;
    private static final /* synthetic */ c.b H = null;
    private static final /* synthetic */ c.b I = null;

    /* renamed from: x  reason: collision with root package name */
    public static final String f9639x = "trex";

    /* renamed from: y  reason: collision with root package name */
    private static final /* synthetic */ c.b f9640y = null;

    /* renamed from: z  reason: collision with root package name */
    private static final /* synthetic */ c.b f9641z = null;

    /* renamed from: s  reason: collision with root package name */
    private long f9642s;

    /* renamed from: t  reason: collision with root package name */
    private long f9643t;

    /* renamed from: u  reason: collision with root package name */
    private long f9644u;

    /* renamed from: v  reason: collision with root package name */
    private long f9645v;

    /* renamed from: w  reason: collision with root package name */
    private g f9646w;

    static {
        s();
    }

    public i() {
        super(f9639x);
    }

    private static /* synthetic */ void s() {
        org.aspectj.runtime.reflect.e eVar = new org.aspectj.runtime.reflect.e("TrackExtendsBox.java", i.class);
        f9640y = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getTrackId", "com.coremedia.iso.boxes.fragment.TrackExtendsBox", "", "", "", MethodReflectParams.LONG), 72);
        f9641z = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getDefaultSampleDescriptionIndex", "com.coremedia.iso.boxes.fragment.TrackExtendsBox", "", "", "", MethodReflectParams.LONG), 76);
        I = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setDefaultSampleFlags", "com.coremedia.iso.boxes.fragment.TrackExtendsBox", "com.coremedia.iso.boxes.fragment.SampleFlags", "defaultSampleFlags", "", "void"), 112);
        A = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getDefaultSampleDuration", "com.coremedia.iso.boxes.fragment.TrackExtendsBox", "", "", "", MethodReflectParams.LONG), 80);
        B = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getDefaultSampleSize", "com.coremedia.iso.boxes.fragment.TrackExtendsBox", "", "", "", MethodReflectParams.LONG), 84);
        C = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getDefaultSampleFlags", "com.coremedia.iso.boxes.fragment.TrackExtendsBox", "", "", "", "com.coremedia.iso.boxes.fragment.SampleFlags"), 88);
        D = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getDefaultSampleFlagsStr", "com.coremedia.iso.boxes.fragment.TrackExtendsBox", "", "", "", "java.lang.String"), 92);
        E = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setTrackId", "com.coremedia.iso.boxes.fragment.TrackExtendsBox", MethodReflectParams.LONG, "trackId", "", "void"), 96);
        F = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setDefaultSampleDescriptionIndex", "com.coremedia.iso.boxes.fragment.TrackExtendsBox", MethodReflectParams.LONG, "defaultSampleDescriptionIndex", "", "void"), 100);
        G = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setDefaultSampleDuration", "com.coremedia.iso.boxes.fragment.TrackExtendsBox", MethodReflectParams.LONG, "defaultSampleDuration", "", "void"), 104);
        H = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setDefaultSampleSize", "com.coremedia.iso.boxes.fragment.TrackExtendsBox", MethodReflectParams.LONG, "defaultSampleSize", "", "void"), 108);
    }

    public long A() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(f9640y, this, this));
        return this.f9642s;
    }

    public void B(long j4) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(F, this, this, org.aspectj.runtime.internal.e.m(j4)));
        this.f9643t = j4;
    }

    public void C(long j4) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(G, this, this, org.aspectj.runtime.internal.e.m(j4)));
        this.f9644u = j4;
    }

    public void D(g gVar) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(I, this, this, gVar));
        this.f9646w = gVar;
    }

    public void E(long j4) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(H, this, this, org.aspectj.runtime.internal.e.m(j4)));
        this.f9645v = j4;
    }

    public void F(long j4) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(E, this, this, org.aspectj.runtime.internal.e.m(j4)));
        this.f9642s = j4;
    }

    @Override // com.googlecode.mp4parser.a
    public void b(ByteBuffer byteBuffer) {
        t(byteBuffer);
        this.f9642s = com.coremedia.iso.g.l(byteBuffer);
        this.f9643t = com.coremedia.iso.g.l(byteBuffer);
        this.f9644u = com.coremedia.iso.g.l(byteBuffer);
        this.f9645v = com.coremedia.iso.g.l(byteBuffer);
        this.f9646w = new g(byteBuffer);
    }

    @Override // com.googlecode.mp4parser.a
    protected void c(ByteBuffer byteBuffer) {
        u(byteBuffer);
        com.coremedia.iso.i.i(byteBuffer, this.f9642s);
        com.coremedia.iso.i.i(byteBuffer, this.f9643t);
        com.coremedia.iso.i.i(byteBuffer, this.f9644u);
        com.coremedia.iso.i.i(byteBuffer, this.f9645v);
        this.f9646w.a(byteBuffer);
    }

    @Override // com.googlecode.mp4parser.a
    protected long e() {
        return 24L;
    }

    public long v() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(f9641z, this, this));
        return this.f9643t;
    }

    public long w() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(A, this, this));
        return this.f9644u;
    }

    public g x() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(C, this, this));
        return this.f9646w;
    }

    public String y() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(D, this, this));
        return this.f9646w.toString();
    }

    public long z() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(B, this, this));
        return this.f9645v;
    }
}
