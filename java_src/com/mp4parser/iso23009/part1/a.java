package com.mp4parser.iso23009.part1;

import com.coremedia.iso.g;
import com.coremedia.iso.i;
import com.coremedia.iso.l;
import com.googlecode.mp4parser.c;
import com.googlecode.mp4parser.j;
import com.swift.sandhook.annotation.MethodReflectParams;
import java.nio.ByteBuffer;
import org.aspectj.lang.c;
import org.aspectj.runtime.reflect.e;
/* compiled from: EventMessageBox.java */
/* loaded from: classes5.dex */
public class a extends c {
    private static final /* synthetic */ c.b A = null;
    private static final /* synthetic */ c.b B = null;
    private static final /* synthetic */ c.b C = null;
    private static final /* synthetic */ c.b D = null;
    private static final /* synthetic */ c.b E = null;
    private static final /* synthetic */ c.b F = null;
    private static final /* synthetic */ c.b G = null;
    private static final /* synthetic */ c.b H = null;
    private static final /* synthetic */ c.b I = null;
    private static final /* synthetic */ c.b J = null;
    private static final /* synthetic */ c.b K = null;
    private static final /* synthetic */ c.b L = null;
    private static final /* synthetic */ c.b M = null;
    private static final /* synthetic */ c.b N = null;

    /* renamed from: z  reason: collision with root package name */
    public static final String f57301z = "emsg";

    /* renamed from: s  reason: collision with root package name */
    String f57302s;

    /* renamed from: t  reason: collision with root package name */
    String f57303t;

    /* renamed from: u  reason: collision with root package name */
    long f57304u;

    /* renamed from: v  reason: collision with root package name */
    long f57305v;

    /* renamed from: w  reason: collision with root package name */
    long f57306w;

    /* renamed from: x  reason: collision with root package name */
    long f57307x;

    /* renamed from: y  reason: collision with root package name */
    byte[] f57308y;

    static {
        s();
    }

    public a() {
        super(f57301z);
    }

    private static /* synthetic */ void s() {
        e eVar = new e("EventMessageBox.java", a.class);
        A = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getSchemeIdUri", "com.mp4parser.iso23009.part1.EventMessageBox", "", "", "", "java.lang.String"), 59);
        B = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setSchemeIdUri", "com.mp4parser.iso23009.part1.EventMessageBox", "java.lang.String", "schemeIdUri", "", "void"), 63);
        K = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getId", "com.mp4parser.iso23009.part1.EventMessageBox", "", "", "", MethodReflectParams.LONG), 99);
        L = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setId", "com.mp4parser.iso23009.part1.EventMessageBox", MethodReflectParams.LONG, "id", "", "void"), 103);
        M = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getMessageData", "com.mp4parser.iso23009.part1.EventMessageBox", "", "", "", "[B"), 107);
        N = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setMessageData", "com.mp4parser.iso23009.part1.EventMessageBox", "[B", "messageData", "", "void"), 111);
        C = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getValue", "com.mp4parser.iso23009.part1.EventMessageBox", "", "", "", "java.lang.String"), 67);
        D = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setValue", "com.mp4parser.iso23009.part1.EventMessageBox", "java.lang.String", "value", "", "void"), 71);
        E = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getTimescale", "com.mp4parser.iso23009.part1.EventMessageBox", "", "", "", MethodReflectParams.LONG), 75);
        F = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setTimescale", "com.mp4parser.iso23009.part1.EventMessageBox", MethodReflectParams.LONG, "timescale", "", "void"), 79);
        G = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getPresentationTimeDelta", "com.mp4parser.iso23009.part1.EventMessageBox", "", "", "", MethodReflectParams.LONG), 83);
        H = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setPresentationTimeDelta", "com.mp4parser.iso23009.part1.EventMessageBox", MethodReflectParams.LONG, "presentationTimeDelta", "", "void"), 87);
        I = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getEventDuration", "com.mp4parser.iso23009.part1.EventMessageBox", "", "", "", MethodReflectParams.LONG), 91);
        J = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setEventDuration", "com.mp4parser.iso23009.part1.EventMessageBox", MethodReflectParams.LONG, "eventDuration", "", "void"), 95);
    }

    public long A() {
        j.b().c(e.v(E, this, this));
        return this.f57304u;
    }

    public String B() {
        j.b().c(e.v(C, this, this));
        return this.f57303t;
    }

    public void C(long j4) {
        j.b().c(e.w(J, this, this, org.aspectj.runtime.internal.e.m(j4)));
        this.f57306w = j4;
    }

    public void D(long j4) {
        j.b().c(e.w(L, this, this, org.aspectj.runtime.internal.e.m(j4)));
        this.f57307x = j4;
    }

    public void E(byte[] bArr) {
        j.b().c(e.w(N, this, this, bArr));
        this.f57308y = bArr;
    }

    public void F(long j4) {
        j.b().c(e.w(H, this, this, org.aspectj.runtime.internal.e.m(j4)));
        this.f57305v = j4;
    }

    public void G(String str) {
        j.b().c(e.w(B, this, this, str));
        this.f57302s = str;
    }

    public void H(long j4) {
        j.b().c(e.w(F, this, this, org.aspectj.runtime.internal.e.m(j4)));
        this.f57304u = j4;
    }

    public void I(String str) {
        j.b().c(e.w(D, this, this, str));
        this.f57303t = str;
    }

    @Override // com.googlecode.mp4parser.a
    protected void b(ByteBuffer byteBuffer) {
        t(byteBuffer);
        this.f57302s = g.g(byteBuffer);
        this.f57303t = g.g(byteBuffer);
        this.f57304u = g.l(byteBuffer);
        this.f57305v = g.l(byteBuffer);
        this.f57306w = g.l(byteBuffer);
        this.f57307x = g.l(byteBuffer);
        byte[] bArr = new byte[byteBuffer.remaining()];
        this.f57308y = bArr;
        byteBuffer.get(bArr);
    }

    @Override // com.googlecode.mp4parser.a
    protected void c(ByteBuffer byteBuffer) {
        u(byteBuffer);
        i.n(byteBuffer, this.f57302s);
        i.n(byteBuffer, this.f57303t);
        i.i(byteBuffer, this.f57304u);
        i.i(byteBuffer, this.f57305v);
        i.i(byteBuffer, this.f57306w);
        i.i(byteBuffer, this.f57307x);
        byteBuffer.put(this.f57308y);
    }

    @Override // com.googlecode.mp4parser.a
    protected long e() {
        return l.c(this.f57302s) + 22 + l.c(this.f57303t) + this.f57308y.length;
    }

    public long v() {
        j.b().c(e.v(I, this, this));
        return this.f57306w;
    }

    public long w() {
        j.b().c(e.v(K, this, this));
        return this.f57307x;
    }

    public byte[] x() {
        j.b().c(e.v(M, this, this));
        return this.f57308y;
    }

    public long y() {
        j.b().c(e.v(G, this, this));
        return this.f57305v;
    }

    public String z() {
        j.b().c(e.v(A, this, this));
        return this.f57302s;
    }
}
