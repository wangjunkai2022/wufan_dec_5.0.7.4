package com.googlecode.mp4parser.boxes.piff;

import com.coremedia.iso.boxes.k1;
import com.coremedia.iso.g;
import com.coremedia.iso.i;
import com.googlecode.mp4parser.j;
import com.swift.sandhook.annotation.MethodReflectParams;
import io.netty.handler.codec.memcache.binary.BinaryMemcacheOpcodes;
import java.nio.ByteBuffer;
import org.aspectj.lang.c;
/* compiled from: TfxdBox.java */
/* loaded from: classes3.dex */
public class e extends com.googlecode.mp4parser.c {

    /* renamed from: u  reason: collision with root package name */
    private static final /* synthetic */ c.b f14033u = null;

    /* renamed from: v  reason: collision with root package name */
    private static final /* synthetic */ c.b f14034v = null;

    /* renamed from: s  reason: collision with root package name */
    public long f14035s;

    /* renamed from: t  reason: collision with root package name */
    public long f14036t;

    static {
        s();
    }

    public e() {
        super(k1.f9761p);
    }

    private static /* synthetic */ void s() {
        org.aspectj.runtime.reflect.e eVar = new org.aspectj.runtime.reflect.e("TfxdBox.java", e.class);
        f14033u = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getFragmentAbsoluteTime", "com.googlecode.mp4parser.boxes.piff.TfxdBox", "", "", "", MethodReflectParams.LONG), 79);
        f14034v = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getFragmentAbsoluteDuration", "com.googlecode.mp4parser.boxes.piff.TfxdBox", "", "", "", MethodReflectParams.LONG), 83);
    }

    @Override // com.googlecode.mp4parser.a
    public void b(ByteBuffer byteBuffer) {
        t(byteBuffer);
        if (getVersion() == 1) {
            this.f14035s = g.o(byteBuffer);
            this.f14036t = g.o(byteBuffer);
            return;
        }
        this.f14035s = g.l(byteBuffer);
        this.f14036t = g.l(byteBuffer);
    }

    @Override // com.googlecode.mp4parser.a
    protected void c(ByteBuffer byteBuffer) {
        u(byteBuffer);
        if (getVersion() == 1) {
            i.l(byteBuffer, this.f14035s);
            i.l(byteBuffer, this.f14036t);
            return;
        }
        i.i(byteBuffer, this.f14035s);
        i.i(byteBuffer, this.f14036t);
    }

    @Override // com.googlecode.mp4parser.a
    protected long e() {
        return getVersion() == 1 ? 20 : 12;
    }

    @Override // com.googlecode.mp4parser.a
    public byte[] i() {
        return new byte[]{109, BinaryMemcacheOpcodes.GAT, -101, 5, 66, -43, 68, -26, Byte.MIN_VALUE, -30, BinaryMemcacheOpcodes.DELETEQ, BinaryMemcacheOpcodes.GAT, -81, -9, 87, -78};
    }

    public long v() {
        j.b().c(org.aspectj.runtime.reflect.e.v(f14034v, this, this));
        return this.f14036t;
    }

    public long w() {
        j.b().c(org.aspectj.runtime.reflect.e.v(f14033u, this, this));
        return this.f14035s;
    }
}
