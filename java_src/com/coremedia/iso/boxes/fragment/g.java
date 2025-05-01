package com.coremedia.iso.boxes.fragment;

import io.netty.handler.codec.memcache.binary.BinaryMemcacheOpcodes;
import java.nio.ByteBuffer;
/* compiled from: SampleFlags.java */
/* loaded from: classes2.dex */
public class g {

    /* renamed from: a  reason: collision with root package name */
    private byte f9621a;

    /* renamed from: b  reason: collision with root package name */
    private byte f9622b;

    /* renamed from: c  reason: collision with root package name */
    private byte f9623c;

    /* renamed from: d  reason: collision with root package name */
    private byte f9624d;

    /* renamed from: e  reason: collision with root package name */
    private byte f9625e;

    /* renamed from: f  reason: collision with root package name */
    private byte f9626f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f9627g;

    /* renamed from: h  reason: collision with root package name */
    private int f9628h;

    public g() {
    }

    public void a(ByteBuffer byteBuffer) {
        com.coremedia.iso.i.i(byteBuffer, (this.f9621a << BinaryMemcacheOpcodes.TOUCH) | 0 | (this.f9622b << BinaryMemcacheOpcodes.PREPENDQ) | (this.f9623c << BinaryMemcacheOpcodes.FLUSHQ) | (this.f9624d << BinaryMemcacheOpcodes.DECREMENTQ) | (this.f9625e << BinaryMemcacheOpcodes.DELETEQ) | (this.f9626f << BinaryMemcacheOpcodes.SETQ) | ((this.f9627g ? 1 : 0) << 16) | this.f9628h);
    }

    public int b() {
        return this.f9621a;
    }

    public int c() {
        return this.f9628h;
    }

    public int d() {
        return this.f9623c;
    }

    public int e() {
        return this.f9625e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        g gVar = (g) obj;
        return this.f9622b == gVar.f9622b && this.f9621a == gVar.f9621a && this.f9628h == gVar.f9628h && this.f9623c == gVar.f9623c && this.f9625e == gVar.f9625e && this.f9624d == gVar.f9624d && this.f9627g == gVar.f9627g && this.f9626f == gVar.f9626f;
    }

    public int f() {
        return this.f9624d;
    }

    public int g() {
        return this.f9626f;
    }

    public boolean h() {
        return this.f9627g;
    }

    public int hashCode() {
        return (((((((((((((this.f9621a * 31) + this.f9622b) * 31) + this.f9623c) * 31) + this.f9624d) * 31) + this.f9625e) * 31) + this.f9626f) * 31) + (this.f9627g ? 1 : 0)) * 31) + this.f9628h;
    }

    public void i(int i4) {
        this.f9621a = (byte) i4;
    }

    public void j(int i4) {
        this.f9628h = i4;
    }

    public void k(int i4) {
        this.f9623c = (byte) i4;
    }

    public void l(int i4) {
        this.f9625e = (byte) i4;
    }

    public void m(int i4) {
        this.f9624d = (byte) i4;
    }

    public void n(boolean z4) {
        this.f9627g = z4;
    }

    public void o(int i4) {
        this.f9626f = (byte) i4;
    }

    public String toString() {
        return "SampleFlags{reserved=" + ((int) this.f9621a) + ", isLeading=" + ((int) this.f9622b) + ", depOn=" + ((int) this.f9623c) + ", isDepOn=" + ((int) this.f9624d) + ", hasRedundancy=" + ((int) this.f9625e) + ", padValue=" + ((int) this.f9626f) + ", isDiffSample=" + this.f9627g + ", degradPrio=" + this.f9628h + '}';
    }

    public g(ByteBuffer byteBuffer) {
        long l4 = com.coremedia.iso.g.l(byteBuffer);
        this.f9621a = (byte) (((-268435456) & l4) >> 28);
        this.f9622b = (byte) ((201326592 & l4) >> 26);
        this.f9623c = (byte) ((50331648 & l4) >> 24);
        this.f9624d = (byte) ((12582912 & l4) >> 22);
        this.f9625e = (byte) ((3145728 & l4) >> 20);
        this.f9626f = (byte) ((917504 & l4) >> 17);
        this.f9627g = ((65536 & l4) >> 16) > 0;
        this.f9628h = (int) (l4 & 65535);
    }
}
