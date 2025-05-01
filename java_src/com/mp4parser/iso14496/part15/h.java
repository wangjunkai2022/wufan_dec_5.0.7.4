package com.mp4parser.iso14496.part15;

import java.nio.ByteBuffer;
/* compiled from: TemporalLayerSampleGroup.java */
/* loaded from: classes5.dex */
public class h extends com.googlecode.mp4parser.boxes.mp4.samplegrouping.b {

    /* renamed from: l  reason: collision with root package name */
    public static final String f57200l = "tscl";

    /* renamed from: a  reason: collision with root package name */
    int f57201a;

    /* renamed from: b  reason: collision with root package name */
    int f57202b;

    /* renamed from: c  reason: collision with root package name */
    boolean f57203c;

    /* renamed from: d  reason: collision with root package name */
    int f57204d;

    /* renamed from: e  reason: collision with root package name */
    long f57205e;

    /* renamed from: f  reason: collision with root package name */
    long f57206f;

    /* renamed from: g  reason: collision with root package name */
    int f57207g;

    /* renamed from: h  reason: collision with root package name */
    int f57208h;

    /* renamed from: i  reason: collision with root package name */
    int f57209i;

    /* renamed from: j  reason: collision with root package name */
    int f57210j;

    /* renamed from: k  reason: collision with root package name */
    int f57211k;

    @Override // com.googlecode.mp4parser.boxes.mp4.samplegrouping.b
    public ByteBuffer a() {
        ByteBuffer allocate = ByteBuffer.allocate(20);
        com.coremedia.iso.i.m(allocate, this.f57201a);
        com.coremedia.iso.i.m(allocate, (this.f57202b << 6) + (this.f57203c ? 32 : 0) + this.f57204d);
        com.coremedia.iso.i.i(allocate, this.f57205e);
        com.coremedia.iso.i.k(allocate, this.f57206f);
        com.coremedia.iso.i.m(allocate, this.f57207g);
        com.coremedia.iso.i.f(allocate, this.f57208h);
        com.coremedia.iso.i.f(allocate, this.f57209i);
        com.coremedia.iso.i.m(allocate, this.f57210j);
        com.coremedia.iso.i.f(allocate, this.f57211k);
        return (ByteBuffer) allocate.rewind();
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.samplegrouping.b
    public void b(ByteBuffer byteBuffer) {
        this.f57201a = com.coremedia.iso.g.p(byteBuffer);
        int p4 = com.coremedia.iso.g.p(byteBuffer);
        this.f57202b = (p4 & 192) >> 6;
        this.f57203c = (p4 & 32) > 0;
        this.f57204d = p4 & 31;
        this.f57205e = com.coremedia.iso.g.l(byteBuffer);
        this.f57206f = com.coremedia.iso.g.n(byteBuffer);
        this.f57207g = com.coremedia.iso.g.p(byteBuffer);
        this.f57208h = com.coremedia.iso.g.i(byteBuffer);
        this.f57209i = com.coremedia.iso.g.i(byteBuffer);
        this.f57210j = com.coremedia.iso.g.p(byteBuffer);
        this.f57211k = com.coremedia.iso.g.i(byteBuffer);
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.samplegrouping.b
    public int c() {
        return 20;
    }

    public int d() {
        return this.f57201a;
    }

    public int e() {
        return this.f57209i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        h hVar = (h) obj;
        return this.f57201a == hVar.f57201a && this.f57209i == hVar.f57209i && this.f57211k == hVar.f57211k && this.f57210j == hVar.f57210j && this.f57208h == hVar.f57208h && this.f57206f == hVar.f57206f && this.f57207g == hVar.f57207g && this.f57205e == hVar.f57205e && this.f57204d == hVar.f57204d && this.f57202b == hVar.f57202b && this.f57203c == hVar.f57203c;
    }

    public int f() {
        return this.f57211k;
    }

    public int g() {
        return this.f57210j;
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.samplegrouping.b
    public String getType() {
        return f57200l;
    }

    public int h() {
        return this.f57208h;
    }

    public int hashCode() {
        long j4 = this.f57205e;
        long j5 = this.f57206f;
        return (((((((((((((((((((this.f57201a * 31) + this.f57202b) * 31) + (this.f57203c ? 1 : 0)) * 31) + this.f57204d) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + ((int) (j5 ^ (j5 >>> 32)))) * 31) + this.f57207g) * 31) + this.f57208h) * 31) + this.f57209i) * 31) + this.f57210j) * 31) + this.f57211k;
    }

    public long i() {
        return this.f57206f;
    }

    public int j() {
        return this.f57207g;
    }

    public long k() {
        return this.f57205e;
    }

    public int l() {
        return this.f57204d;
    }

    public int m() {
        return this.f57202b;
    }

    public boolean n() {
        return this.f57203c;
    }

    public void o(int i4) {
        this.f57201a = i4;
    }

    public void p(int i4) {
        this.f57209i = i4;
    }

    public void q(int i4) {
        this.f57211k = i4;
    }

    public void r(int i4) {
        this.f57210j = i4;
    }

    public void s(int i4) {
        this.f57208h = i4;
    }

    public void t(long j4) {
        this.f57206f = j4;
    }

    public String toString() {
        return "TemporalLayerSampleGroup{temporalLayerId=" + this.f57201a + ", tlprofile_space=" + this.f57202b + ", tltier_flag=" + this.f57203c + ", tlprofile_idc=" + this.f57204d + ", tlprofile_compatibility_flags=" + this.f57205e + ", tlconstraint_indicator_flags=" + this.f57206f + ", tllevel_idc=" + this.f57207g + ", tlMaxBitRate=" + this.f57208h + ", tlAvgBitRate=" + this.f57209i + ", tlConstantFrameRate=" + this.f57210j + ", tlAvgFrameRate=" + this.f57211k + '}';
    }

    public void u(int i4) {
        this.f57207g = i4;
    }

    public void v(long j4) {
        this.f57205e = j4;
    }

    public void w(int i4) {
        this.f57204d = i4;
    }

    public void x(int i4) {
        this.f57202b = i4;
    }

    public void y(boolean z4) {
        this.f57203c = z4;
    }
}
