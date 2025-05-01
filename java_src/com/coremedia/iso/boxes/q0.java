package com.coremedia.iso.boxes;

import com.swift.sandhook.annotation.MethodReflectParams;
import java.nio.ByteBuffer;
import org.aspectj.lang.c;
/* compiled from: RecordingYearBox.java */
/* loaded from: classes2.dex */
public class q0 extends com.googlecode.mp4parser.c {

    /* renamed from: t  reason: collision with root package name */
    public static final String f9839t = "yrrc";

    /* renamed from: u  reason: collision with root package name */
    private static final /* synthetic */ c.b f9840u = null;

    /* renamed from: v  reason: collision with root package name */
    private static final /* synthetic */ c.b f9841v = null;

    /* renamed from: s  reason: collision with root package name */
    int f9842s;

    static {
        s();
    }

    public q0() {
        super(f9839t);
    }

    private static /* synthetic */ void s() {
        org.aspectj.runtime.reflect.e eVar = new org.aspectj.runtime.reflect.e("RecordingYearBox.java", q0.class);
        f9840u = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getRecordingYear", "com.coremedia.iso.boxes.RecordingYearBox", "", "", "", MethodReflectParams.INT), 42);
        f9841v = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setRecordingYear", "com.coremedia.iso.boxes.RecordingYearBox", MethodReflectParams.INT, "recordingYear", "", "void"), 46);
    }

    @Override // com.googlecode.mp4parser.a
    public void b(ByteBuffer byteBuffer) {
        t(byteBuffer);
        this.f9842s = com.coremedia.iso.g.i(byteBuffer);
    }

    @Override // com.googlecode.mp4parser.a
    protected void c(ByteBuffer byteBuffer) {
        u(byteBuffer);
        com.coremedia.iso.i.f(byteBuffer, this.f9842s);
    }

    @Override // com.googlecode.mp4parser.a
    protected long e() {
        return 6L;
    }

    public int v() {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.v(f9840u, this, this));
        return this.f9842s;
    }

    public void w(int i4) {
        com.googlecode.mp4parser.j.b().c(org.aspectj.runtime.reflect.e.w(f9841v, this, this, org.aspectj.runtime.internal.e.k(i4)));
        this.f9842s = i4;
    }
}
