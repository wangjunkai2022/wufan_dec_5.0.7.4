package com.coremedia.iso.boxes.apple;

import com.coremedia.iso.i;
import com.coremedia.iso.l;
import com.googlecode.mp4parser.j;
import com.swift.sandhook.annotation.MethodReflectParams;
import java.nio.ByteBuffer;
import org.aspectj.lang.c;
/* compiled from: AppleDataReferenceBox.java */
/* loaded from: classes2.dex */
public class b extends com.googlecode.mp4parser.c {

    /* renamed from: v  reason: collision with root package name */
    public static final String f9512v = "rdrf";

    /* renamed from: w  reason: collision with root package name */
    private static final /* synthetic */ c.b f9513w = null;

    /* renamed from: x  reason: collision with root package name */
    private static final /* synthetic */ c.b f9514x = null;

    /* renamed from: y  reason: collision with root package name */
    private static final /* synthetic */ c.b f9515y = null;

    /* renamed from: s  reason: collision with root package name */
    private int f9516s;

    /* renamed from: t  reason: collision with root package name */
    private String f9517t;

    /* renamed from: u  reason: collision with root package name */
    private String f9518u;

    static {
        s();
    }

    public b() {
        super(f9512v);
    }

    private static /* synthetic */ void s() {
        org.aspectj.runtime.reflect.e eVar = new org.aspectj.runtime.reflect.e("AppleDataReferenceBox.java", b.class);
        f9513w = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getDataReferenceSize", "com.coremedia.iso.boxes.apple.AppleDataReferenceBox", "", "", "", MethodReflectParams.LONG), 63);
        f9514x = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getDataReferenceType", "com.coremedia.iso.boxes.apple.AppleDataReferenceBox", "", "", "", "java.lang.String"), 67);
        f9515y = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getDataReference", "com.coremedia.iso.boxes.apple.AppleDataReferenceBox", "", "", "", "java.lang.String"), 71);
    }

    @Override // com.googlecode.mp4parser.a
    public void b(ByteBuffer byteBuffer) {
        t(byteBuffer);
        this.f9517t = com.coremedia.iso.g.b(byteBuffer);
        int a5 = com.googlecode.mp4parser.util.c.a(com.coremedia.iso.g.l(byteBuffer));
        this.f9516s = a5;
        this.f9518u = com.coremedia.iso.g.h(byteBuffer, a5);
    }

    @Override // com.googlecode.mp4parser.a
    protected void c(ByteBuffer byteBuffer) {
        u(byteBuffer);
        byteBuffer.put(com.coremedia.iso.f.C(this.f9517t));
        i.i(byteBuffer, this.f9516s);
        byteBuffer.put(l.b(this.f9518u));
    }

    @Override // com.googlecode.mp4parser.a
    protected long e() {
        return this.f9516s + 12;
    }

    public String v() {
        j.b().c(org.aspectj.runtime.reflect.e.v(f9515y, this, this));
        return this.f9518u;
    }

    public long w() {
        j.b().c(org.aspectj.runtime.reflect.e.v(f9513w, this, this));
        return this.f9516s;
    }

    public String x() {
        j.b().c(org.aspectj.runtime.reflect.e.v(f9514x, this, this));
        return this.f9517t;
    }
}
