package com.coremedia.iso.boxes.apple;

import com.coremedia.iso.i;
import com.googlecode.mp4parser.j;
import com.swift.sandhook.annotation.MethodReflectParams;
import java.nio.ByteBuffer;
import org.aspectj.lang.c;
/* compiled from: AppleDataRateBox.java */
/* loaded from: classes2.dex */
public class a extends com.googlecode.mp4parser.c {

    /* renamed from: t  reason: collision with root package name */
    public static final String f9509t = "rmdr";

    /* renamed from: u  reason: collision with root package name */
    private static final /* synthetic */ c.b f9510u = null;

    /* renamed from: s  reason: collision with root package name */
    private long f9511s;

    static {
        s();
    }

    public a() {
        super(f9509t);
    }

    private static /* synthetic */ void s() {
        org.aspectj.runtime.reflect.e eVar = new org.aspectj.runtime.reflect.e("AppleDataRateBox.java", a.class);
        f9510u = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getDataRate", "com.coremedia.iso.boxes.apple.AppleDataRateBox", "", "", "", MethodReflectParams.LONG), 53);
    }

    @Override // com.googlecode.mp4parser.a
    public void b(ByteBuffer byteBuffer) {
        t(byteBuffer);
        this.f9511s = com.coremedia.iso.g.l(byteBuffer);
    }

    @Override // com.googlecode.mp4parser.a
    protected void c(ByteBuffer byteBuffer) {
        u(byteBuffer);
        i.i(byteBuffer, this.f9511s);
    }

    @Override // com.googlecode.mp4parser.a
    protected long e() {
        return 8L;
    }

    public long v() {
        j.b().c(org.aspectj.runtime.reflect.e.v(f9510u, this, this));
        return this.f9511s;
    }
}
