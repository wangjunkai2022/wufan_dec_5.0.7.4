package com.coremedia.iso.boxes;

import com.swift.sandhook.annotation.MethodReflectParams;
import java.nio.ByteBuffer;
import java.util.Date;
import org.aspectj.lang.c;
/* compiled from: MediaHeaderBox.java */
/* loaded from: classes2.dex */
public class e0 extends com.googlecode.mp4parser.c {
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
    public static final String f9585x = "mdhd";

    /* renamed from: y  reason: collision with root package name */
    private static final /* synthetic */ c.b f9586y = null;

    /* renamed from: z  reason: collision with root package name */
    private static final /* synthetic */ c.b f9587z = null;

    /* renamed from: s  reason: collision with root package name */
    private Date f9588s;

    /* renamed from: t  reason: collision with root package name */
    private Date f9589t;

    /* renamed from: u  reason: collision with root package name */
    private long f9590u;

    /* renamed from: v  reason: collision with root package name */
    private long f9591v;

    /* renamed from: w  reason: collision with root package name */
    private String f9592w;

    static {
        s();
    }

    public e0() {
        super(f9585x);
        this.f9588s = new Date();
        this.f9589t = new Date();
        this.f9592w = "eng";
    }

    private static /* synthetic */ void s() {
        org.aspectj.runtime.reflect.e eVar = new org.aspectj.runtime.reflect.e("MediaHeaderBox.java", e0.class);
        f9586y = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getCreationTime", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "", "java.util.Date"), 46);
        f9587z = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getModificationTime", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "", "java.util.Date"), 50);
        I = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "toString", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "", "java.lang.String"), 118);
        A = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getTimescale", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "", MethodReflectParams.LONG), 54);
        B = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getDuration", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "", MethodReflectParams.LONG), 58);
        C = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getLanguage", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "", "java.lang.String"), 62);
        D = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setCreationTime", "com.coremedia.iso.boxes.MediaHeaderBox", "java.util.Date", "creationTime", "", "void"), 79);
        E = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setModificationTime", "com.coremedia.iso.boxes.MediaHeaderBox", "java.util.Date", "modificationTime", "", "void"), 83);
        F = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setTimescale", "com.coremedia.iso.boxes.MediaHeaderBox", MethodReflectParams.LONG, "timescale", "", "void"), 87);
        G = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setDuration", "com.coremedia.iso.boxes.MediaHeaderBox", MethodReflectParams.LONG, "duration", "", "void"), 91);
        H = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setLanguage", "com.coremedia.iso.boxes.MediaHeaderBox", "java.lang.String", "language", "", "void"), 95);
    }

    public void A(Date date) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(D, this, this, date));
        this.f9588s = date;
    }

    public void B(long j4) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(G, this, this, org.aspectj.runtime.internal.e.m(j4)));
        this.f9591v = j4;
    }

    public void C(String str) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(H, this, this, str));
        this.f9592w = str;
    }

    public void D(Date date) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(E, this, this, date));
        this.f9589t = date;
    }

    public void E(long j4) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(F, this, this, org.aspectj.runtime.internal.e.m(j4)));
        this.f9590u = j4;
    }

    @Override // com.googlecode.mp4parser.a
    public void b(ByteBuffer byteBuffer) {
        t(byteBuffer);
        if (getVersion() == 1) {
            this.f9588s = com.googlecode.mp4parser.util.e.b(com.coremedia.iso.g.o(byteBuffer));
            this.f9589t = com.googlecode.mp4parser.util.e.b(com.coremedia.iso.g.o(byteBuffer));
            this.f9590u = com.coremedia.iso.g.l(byteBuffer);
            this.f9591v = com.coremedia.iso.g.o(byteBuffer);
        } else {
            this.f9588s = com.googlecode.mp4parser.util.e.b(com.coremedia.iso.g.l(byteBuffer));
            this.f9589t = com.googlecode.mp4parser.util.e.b(com.coremedia.iso.g.l(byteBuffer));
            this.f9590u = com.coremedia.iso.g.l(byteBuffer);
            this.f9591v = com.coremedia.iso.g.l(byteBuffer);
        }
        this.f9592w = com.coremedia.iso.g.f(byteBuffer);
        com.coremedia.iso.g.i(byteBuffer);
    }

    @Override // com.googlecode.mp4parser.a
    protected void c(ByteBuffer byteBuffer) {
        u(byteBuffer);
        if (getVersion() == 1) {
            com.coremedia.iso.i.l(byteBuffer, com.googlecode.mp4parser.util.e.a(this.f9588s));
            com.coremedia.iso.i.l(byteBuffer, com.googlecode.mp4parser.util.e.a(this.f9589t));
            com.coremedia.iso.i.i(byteBuffer, this.f9590u);
            com.coremedia.iso.i.l(byteBuffer, this.f9591v);
        } else {
            com.coremedia.iso.i.i(byteBuffer, com.googlecode.mp4parser.util.e.a(this.f9588s));
            com.coremedia.iso.i.i(byteBuffer, com.googlecode.mp4parser.util.e.a(this.f9589t));
            com.coremedia.iso.i.i(byteBuffer, this.f9590u);
            com.coremedia.iso.i.i(byteBuffer, this.f9591v);
        }
        com.coremedia.iso.i.d(byteBuffer, this.f9592w);
        com.coremedia.iso.i.f(byteBuffer, 0);
    }

    @Override // com.googlecode.mp4parser.a
    protected long e() {
        return (getVersion() == 1 ? 32L : 20L) + 2 + 2;
    }

    public String toString() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(I, this, this));
        return "MediaHeaderBox[creationTime=" + v() + ";modificationTime=" + y() + ";timescale=" + z() + ";duration=" + w() + ";language=" + x() + "]";
    }

    public Date v() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(f9586y, this, this));
        return this.f9588s;
    }

    public long w() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(B, this, this));
        return this.f9591v;
    }

    public String x() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(C, this, this));
        return this.f9592w;
    }

    public Date y() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(f9587z, this, this));
        return this.f9589t;
    }

    public long z() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(A, this, this));
        return this.f9590u;
    }
}
