package com.googlecode.mp4parser.boxes.apple;

import com.swift.sandhook.annotation.MethodReflectParams;
import java.nio.ByteBuffer;
import org.aspectj.lang.c;
/* compiled from: TrackLoadSettingsAtom.java */
/* loaded from: classes3.dex */
public class x0 extends com.googlecode.mp4parser.a {
    private static final /* synthetic */ c.b A = null;

    /* renamed from: s  reason: collision with root package name */
    public static final String f13710s = "load";

    /* renamed from: t  reason: collision with root package name */
    private static final /* synthetic */ c.b f13711t = null;

    /* renamed from: u  reason: collision with root package name */
    private static final /* synthetic */ c.b f13712u = null;

    /* renamed from: v  reason: collision with root package name */
    private static final /* synthetic */ c.b f13713v = null;

    /* renamed from: w  reason: collision with root package name */
    private static final /* synthetic */ c.b f13714w = null;

    /* renamed from: x  reason: collision with root package name */
    private static final /* synthetic */ c.b f13715x = null;

    /* renamed from: y  reason: collision with root package name */
    private static final /* synthetic */ c.b f13716y = null;

    /* renamed from: z  reason: collision with root package name */
    private static final /* synthetic */ c.b f13717z = null;

    /* renamed from: o  reason: collision with root package name */
    int f13718o;

    /* renamed from: p  reason: collision with root package name */
    int f13719p;

    /* renamed from: q  reason: collision with root package name */
    int f13720q;

    /* renamed from: r  reason: collision with root package name */
    int f13721r;

    static {
        s();
    }

    public x0() {
        super(f13710s);
    }

    private static /* synthetic */ void s() {
        org.aspectj.runtime.reflect.e eVar = new org.aspectj.runtime.reflect.e("TrackLoadSettingsAtom.java", x0.class);
        f13711t = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getPreloadStartTime", "com.googlecode.mp4parser.boxes.apple.TrackLoadSettingsAtom", "", "", "", MethodReflectParams.INT), 49);
        f13712u = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setPreloadStartTime", "com.googlecode.mp4parser.boxes.apple.TrackLoadSettingsAtom", MethodReflectParams.INT, "preloadStartTime", "", "void"), 53);
        f13713v = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getPreloadDuration", "com.googlecode.mp4parser.boxes.apple.TrackLoadSettingsAtom", "", "", "", MethodReflectParams.INT), 57);
        f13714w = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setPreloadDuration", "com.googlecode.mp4parser.boxes.apple.TrackLoadSettingsAtom", MethodReflectParams.INT, "preloadDuration", "", "void"), 61);
        f13715x = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getPreloadFlags", "com.googlecode.mp4parser.boxes.apple.TrackLoadSettingsAtom", "", "", "", MethodReflectParams.INT), 65);
        f13716y = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setPreloadFlags", "com.googlecode.mp4parser.boxes.apple.TrackLoadSettingsAtom", MethodReflectParams.INT, "preloadFlags", "", "void"), 69);
        f13717z = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getDefaultHints", "com.googlecode.mp4parser.boxes.apple.TrackLoadSettingsAtom", "", "", "", MethodReflectParams.INT), 73);
        A = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setDefaultHints", "com.googlecode.mp4parser.boxes.apple.TrackLoadSettingsAtom", MethodReflectParams.INT, "defaultHints", "", "void"), 77);
    }

    public void A(int i4) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(f13712u, this, this, org.aspectj.runtime.internal.e.k(i4)));
        this.f13718o = i4;
    }

    @Override // com.googlecode.mp4parser.a
    protected void b(ByteBuffer byteBuffer) {
        this.f13718o = byteBuffer.getInt();
        this.f13719p = byteBuffer.getInt();
        this.f13720q = byteBuffer.getInt();
        this.f13721r = byteBuffer.getInt();
    }

    @Override // com.googlecode.mp4parser.a
    protected void c(ByteBuffer byteBuffer) {
        byteBuffer.putInt(this.f13718o);
        byteBuffer.putInt(this.f13719p);
        byteBuffer.putInt(this.f13720q);
        byteBuffer.putInt(this.f13721r);
    }

    @Override // com.googlecode.mp4parser.a
    protected long e() {
        return 16L;
    }

    public int t() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(f13717z, this, this));
        return this.f13721r;
    }

    public int u() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(f13713v, this, this));
        return this.f13719p;
    }

    public int v() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(f13715x, this, this));
        return this.f13720q;
    }

    public int w() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(f13711t, this, this));
        return this.f13718o;
    }

    public void x(int i4) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(A, this, this, org.aspectj.runtime.internal.e.k(i4)));
        this.f13721r = i4;
    }

    public void y(int i4) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(f13714w, this, this, org.aspectj.runtime.internal.e.k(i4)));
        this.f13719p = i4;
    }

    public void z(int i4) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(f13716y, this, this, org.aspectj.runtime.internal.e.k(i4)));
        this.f13720q = i4;
    }
}
