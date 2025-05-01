package com.googlecode.mp4parser.boxes;

import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.coremedia.iso.boxes.k1;
import com.coremedia.iso.g;
import com.coremedia.iso.i;
import com.googlecode.mp4parser.j;
import com.swift.sandhook.annotation.MethodReflectParams;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.UUID;
import org.aspectj.lang.c;
/* compiled from: AbstractTrackEncryptionBox.java */
/* loaded from: classes3.dex */
public abstract class c extends com.googlecode.mp4parser.c {
    private static final /* synthetic */ c.b A = null;
    private static final /* synthetic */ c.b B = null;
    private static final /* synthetic */ c.b C = null;

    /* renamed from: v  reason: collision with root package name */
    private static final /* synthetic */ c.b f13751v = null;

    /* renamed from: w  reason: collision with root package name */
    private static final /* synthetic */ c.b f13752w = null;

    /* renamed from: x  reason: collision with root package name */
    private static final /* synthetic */ c.b f13753x = null;

    /* renamed from: y  reason: collision with root package name */
    private static final /* synthetic */ c.b f13754y = null;

    /* renamed from: z  reason: collision with root package name */
    private static final /* synthetic */ c.b f13755z = null;

    /* renamed from: s  reason: collision with root package name */
    int f13756s;

    /* renamed from: t  reason: collision with root package name */
    int f13757t;

    /* renamed from: u  reason: collision with root package name */
    byte[] f13758u;

    static {
        s();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public c(String str) {
        super(str);
    }

    private static /* synthetic */ void s() {
        org.aspectj.runtime.reflect.e eVar = new org.aspectj.runtime.reflect.e("AbstractTrackEncryptionBox.java", c.class);
        f13751v = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getDefaultAlgorithmId", "com.googlecode.mp4parser.boxes.AbstractTrackEncryptionBox", "", "", "", MethodReflectParams.INT), 24);
        f13752w = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setDefaultAlgorithmId", "com.googlecode.mp4parser.boxes.AbstractTrackEncryptionBox", MethodReflectParams.INT, "defaultAlgorithmId", "", "void"), 28);
        f13753x = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getDefaultIvSize", "com.googlecode.mp4parser.boxes.AbstractTrackEncryptionBox", "", "", "", MethodReflectParams.INT), 32);
        f13754y = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setDefaultIvSize", "com.googlecode.mp4parser.boxes.AbstractTrackEncryptionBox", MethodReflectParams.INT, "defaultIvSize", "", "void"), 36);
        f13755z = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "getDefault_KID", "com.googlecode.mp4parser.boxes.AbstractTrackEncryptionBox", "", "", "", "java.util.UUID"), 40);
        A = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "setDefault_KID", "com.googlecode.mp4parser.boxes.AbstractTrackEncryptionBox", "java.util.UUID", k1.f9761p, "", "void"), 46);
        B = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", "equals", "com.googlecode.mp4parser.boxes.AbstractTrackEncryptionBox", "java.lang.Object", "o", "", "boolean"), 76);
        C = eVar.H(org.aspectj.lang.c.f72200a, eVar.E("1", TTDownloadField.TT_HASHCODE, "com.googlecode.mp4parser.boxes.AbstractTrackEncryptionBox", "", "", "", MethodReflectParams.INT), 90);
    }

    public void A(UUID uuid) {
        j.b().c(org.aspectj.runtime.reflect.e.w(A, this, this, uuid));
        ByteBuffer wrap = ByteBuffer.wrap(new byte[16]);
        wrap.putLong(uuid.getMostSignificantBits());
        wrap.putLong(uuid.getLeastSignificantBits());
        this.f13758u = wrap.array();
    }

    @Override // com.googlecode.mp4parser.a
    public void b(ByteBuffer byteBuffer) {
        t(byteBuffer);
        this.f13756s = g.k(byteBuffer);
        this.f13757t = g.p(byteBuffer);
        byte[] bArr = new byte[16];
        this.f13758u = bArr;
        byteBuffer.get(bArr);
    }

    @Override // com.googlecode.mp4parser.a
    protected void c(ByteBuffer byteBuffer) {
        u(byteBuffer);
        i.h(byteBuffer, this.f13756s);
        i.m(byteBuffer, this.f13757t);
        byteBuffer.put(this.f13758u);
    }

    @Override // com.googlecode.mp4parser.a
    protected long e() {
        return 24L;
    }

    public boolean equals(Object obj) {
        j.b().c(org.aspectj.runtime.reflect.e.w(B, this, this, obj));
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return this.f13756s == cVar.f13756s && this.f13757t == cVar.f13757t && Arrays.equals(this.f13758u, cVar.f13758u);
    }

    public int hashCode() {
        j.b().c(org.aspectj.runtime.reflect.e.v(C, this, this));
        int i4 = ((this.f13756s * 31) + this.f13757t) * 31;
        byte[] bArr = this.f13758u;
        return i4 + (bArr != null ? Arrays.hashCode(bArr) : 0);
    }

    public int v() {
        j.b().c(org.aspectj.runtime.reflect.e.v(f13751v, this, this));
        return this.f13756s;
    }

    public int w() {
        j.b().c(org.aspectj.runtime.reflect.e.v(f13753x, this, this));
        return this.f13757t;
    }

    public UUID x() {
        j.b().c(org.aspectj.runtime.reflect.e.v(f13755z, this, this));
        ByteBuffer wrap = ByteBuffer.wrap(this.f13758u);
        wrap.order(ByteOrder.BIG_ENDIAN);
        return new UUID(wrap.getLong(), wrap.getLong());
    }

    public void y(int i4) {
        j.b().c(org.aspectj.runtime.reflect.e.w(f13752w, this, this, org.aspectj.runtime.internal.e.k(i4)));
        this.f13756s = i4;
    }

    public void z(int i4) {
        j.b().c(org.aspectj.runtime.reflect.e.w(f13754y, this, this, org.aspectj.runtime.internal.e.k(i4)));
        this.f13757t = i4;
    }
}
