package com.coremedia.iso.boxes.threegpp26244;

import com.coremedia.iso.g;
import com.coremedia.iso.i;
import com.coremedia.iso.l;
import com.googlecode.mp4parser.c;
import com.googlecode.mp4parser.j;
import com.swift.sandhook.annotation.MethodReflectParams;
import java.nio.ByteBuffer;
import org.aspectj.lang.c;
import org.aspectj.runtime.reflect.e;
/* compiled from: LocationInformationBox.java */
/* loaded from: classes2.dex */
public class a extends c {
    public static final String A = "loci";
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
    private static final /* synthetic */ c.b O = null;
    private static final /* synthetic */ c.b P = null;
    private static final /* synthetic */ c.b Q = null;

    /* renamed from: s  reason: collision with root package name */
    private String f9946s;

    /* renamed from: t  reason: collision with root package name */
    private String f9947t;

    /* renamed from: u  reason: collision with root package name */
    private int f9948u;

    /* renamed from: v  reason: collision with root package name */
    private double f9949v;

    /* renamed from: w  reason: collision with root package name */
    private double f9950w;

    /* renamed from: x  reason: collision with root package name */
    private double f9951x;

    /* renamed from: y  reason: collision with root package name */
    private String f9952y;

    /* renamed from: z  reason: collision with root package name */
    private String f9953z;

    static {
        s();
    }

    public a() {
        super(A);
        this.f9947t = "";
        this.f9952y = "";
        this.f9953z = "";
    }

    private static /* synthetic */ void s() {
        e eVar = new e("LocationInformationBox.java", a.class);
        B = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getLanguage", "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox", "", "", "", "java.lang.String"), 30);
        C = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setLanguage", "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox", "java.lang.String", "language", "", "void"), 34);
        L = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getAltitude", "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox", "", "", "", MethodReflectParams.DOUBLE), 70);
        M = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setAltitude", "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox", MethodReflectParams.DOUBLE, "altitude", "", "void"), 74);
        N = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getAstronomicalBody", "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox", "", "", "", "java.lang.String"), 78);
        O = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setAstronomicalBody", "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox", "java.lang.String", "astronomicalBody", "", "void"), 82);
        P = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getAdditionalNotes", "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox", "", "", "", "java.lang.String"), 86);
        Q = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setAdditionalNotes", "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox", "java.lang.String", "additionalNotes", "", "void"), 90);
        D = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getName", "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox", "", "", "", "java.lang.String"), 38);
        E = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setName", "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox", "java.lang.String", "name", "", "void"), 42);
        F = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getRole", "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox", "", "", "", MethodReflectParams.INT), 46);
        G = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setRole", "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox", MethodReflectParams.INT, "role", "", "void"), 50);
        H = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getLongitude", "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox", "", "", "", MethodReflectParams.DOUBLE), 54);
        I = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setLongitude", "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox", MethodReflectParams.DOUBLE, "longitude", "", "void"), 58);
        J = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getLatitude", "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox", "", "", "", MethodReflectParams.DOUBLE), 62);
        K = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setLatitude", "com.coremedia.iso.boxes.threegpp26244.LocationInformationBox", MethodReflectParams.DOUBLE, "latitude", "", "void"), 66);
    }

    public double A() {
        j.b().c(e.v(H, this, this));
        return this.f9949v;
    }

    public String B() {
        j.b().c(e.v(D, this, this));
        return this.f9947t;
    }

    public int C() {
        j.b().c(e.v(F, this, this));
        return this.f9948u;
    }

    public void D(String str) {
        j.b().c(e.w(Q, this, this, str));
        this.f9953z = str;
    }

    public void E(double d5) {
        j.b().c(e.w(M, this, this, org.aspectj.runtime.internal.e.g(d5)));
        this.f9951x = d5;
    }

    public void F(String str) {
        j.b().c(e.w(O, this, this, str));
        this.f9952y = str;
    }

    public void G(String str) {
        j.b().c(e.w(C, this, this, str));
        this.f9946s = str;
    }

    public void H(double d5) {
        j.b().c(e.w(K, this, this, org.aspectj.runtime.internal.e.g(d5)));
        this.f9950w = d5;
    }

    public void I(double d5) {
        j.b().c(e.w(I, this, this, org.aspectj.runtime.internal.e.g(d5)));
        this.f9949v = d5;
    }

    public void J(String str) {
        j.b().c(e.w(E, this, this, str));
        this.f9947t = str;
    }

    public void K(int i4) {
        j.b().c(e.w(G, this, this, org.aspectj.runtime.internal.e.k(i4)));
        this.f9948u = i4;
    }

    @Override // com.googlecode.mp4parser.a
    public void b(ByteBuffer byteBuffer) {
        t(byteBuffer);
        this.f9946s = g.f(byteBuffer);
        this.f9947t = g.g(byteBuffer);
        this.f9948u = g.p(byteBuffer);
        this.f9949v = g.d(byteBuffer);
        this.f9950w = g.d(byteBuffer);
        this.f9951x = g.d(byteBuffer);
        this.f9952y = g.g(byteBuffer);
        this.f9953z = g.g(byteBuffer);
    }

    @Override // com.googlecode.mp4parser.a
    protected void c(ByteBuffer byteBuffer) {
        u(byteBuffer);
        i.d(byteBuffer, this.f9946s);
        byteBuffer.put(l.b(this.f9947t));
        byteBuffer.put((byte) 0);
        i.m(byteBuffer, this.f9948u);
        i.b(byteBuffer, this.f9949v);
        i.b(byteBuffer, this.f9950w);
        i.b(byteBuffer, this.f9951x);
        byteBuffer.put(l.b(this.f9952y));
        byteBuffer.put((byte) 0);
        byteBuffer.put(l.b(this.f9953z));
        byteBuffer.put((byte) 0);
    }

    @Override // com.googlecode.mp4parser.a
    protected long e() {
        return l.b(this.f9947t).length + 22 + l.b(this.f9952y).length + l.b(this.f9953z).length;
    }

    public String v() {
        j.b().c(e.v(P, this, this));
        return this.f9953z;
    }

    public double w() {
        j.b().c(e.v(L, this, this));
        return this.f9951x;
    }

    public String x() {
        j.b().c(e.v(N, this, this));
        return this.f9952y;
    }

    public String y() {
        j.b().c(e.v(B, this, this));
        return this.f9946s;
    }

    public double z() {
        j.b().c(e.v(J, this, this));
        return this.f9950w;
    }
}
