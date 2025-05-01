package com.googlecode.mp4parser.boxes.mp4.objectdescriptors;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;
/* compiled from: DecoderConfigDescriptor.java */
@Descriptor(tags = {4})
/* loaded from: classes3.dex */
public class e extends b {

    /* renamed from: o  reason: collision with root package name */
    private static Logger f13936o = Logger.getLogger(e.class.getName());

    /* renamed from: e  reason: collision with root package name */
    int f13937e;

    /* renamed from: f  reason: collision with root package name */
    int f13938f;

    /* renamed from: g  reason: collision with root package name */
    int f13939g;

    /* renamed from: h  reason: collision with root package name */
    int f13940h;

    /* renamed from: i  reason: collision with root package name */
    long f13941i;

    /* renamed from: j  reason: collision with root package name */
    long f13942j;

    /* renamed from: k  reason: collision with root package name */
    f f13943k;

    /* renamed from: l  reason: collision with root package name */
    a f13944l;

    /* renamed from: m  reason: collision with root package name */
    List<m> f13945m = new ArrayList();

    /* renamed from: n  reason: collision with root package name */
    byte[] f13946n;

    @Override // com.googlecode.mp4parser.boxes.mp4.objectdescriptors.b
    public void f(ByteBuffer byteBuffer) throws IOException {
        int a5;
        this.f13937e = com.coremedia.iso.g.p(byteBuffer);
        int p4 = com.coremedia.iso.g.p(byteBuffer);
        this.f13938f = p4 >>> 2;
        this.f13939g = (p4 >> 1) & 1;
        this.f13940h = com.coremedia.iso.g.k(byteBuffer);
        this.f13941i = com.coremedia.iso.g.l(byteBuffer);
        this.f13942j = com.coremedia.iso.g.l(byteBuffer);
        if (byteBuffer.remaining() > 2) {
            int position = byteBuffer.position();
            b a6 = l.a(this.f13937e, byteBuffer);
            int position2 = byteBuffer.position() - position;
            Logger logger = f13936o;
            StringBuilder sb = new StringBuilder();
            sb.append(a6);
            sb.append(" - DecoderConfigDescr1 read: ");
            sb.append(position2);
            sb.append(", size: ");
            sb.append(a6 != null ? Integer.valueOf(a6.a()) : null);
            logger.finer(sb.toString());
            if (a6 != null && position2 < (a5 = a6.a())) {
                byte[] bArr = new byte[a5 - position2];
                this.f13946n = bArr;
                byteBuffer.get(bArr);
            }
            if (a6 instanceof f) {
                this.f13943k = (f) a6;
            }
            if (a6 instanceof a) {
                this.f13944l = (a) a6;
            }
        }
        while (byteBuffer.remaining() > 2) {
            long position3 = byteBuffer.position();
            b a7 = l.a(this.f13937e, byteBuffer);
            long position4 = byteBuffer.position() - position3;
            Logger logger2 = f13936o;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(a7);
            sb2.append(" - DecoderConfigDescr2 read: ");
            sb2.append(position4);
            sb2.append(", size: ");
            sb2.append(a7 != null ? Integer.valueOf(a7.a()) : null);
            logger2.finer(sb2.toString());
            if (a7 instanceof m) {
                this.f13945m.add((m) a7);
            }
        }
    }

    public a g() {
        return this.f13944l;
    }

    public long h() {
        return this.f13942j;
    }

    public int i() {
        return this.f13940h;
    }

    public f j() {
        return this.f13943k;
    }

    public long k() {
        return this.f13941i;
    }

    public int l() {
        return this.f13937e;
    }

    public List<m> m() {
        return this.f13945m;
    }

    public int n() {
        return this.f13938f;
    }

    public int o() {
        return this.f13939g;
    }

    public ByteBuffer p() {
        ByteBuffer allocate = ByteBuffer.allocate(q());
        com.coremedia.iso.i.m(allocate, 4);
        com.coremedia.iso.i.m(allocate, q() - 2);
        com.coremedia.iso.i.m(allocate, this.f13937e);
        com.coremedia.iso.i.m(allocate, (this.f13938f << 2) | (this.f13939g << 1) | 1);
        com.coremedia.iso.i.h(allocate, this.f13940h);
        com.coremedia.iso.i.i(allocate, this.f13941i);
        com.coremedia.iso.i.i(allocate, this.f13942j);
        a aVar = this.f13944l;
        if (aVar != null) {
            allocate.put(aVar.t().array());
        }
        return allocate;
    }

    public int q() {
        a aVar = this.f13944l;
        return (aVar == null ? 0 : aVar.u()) + 15;
    }

    public void r(a aVar) {
        this.f13944l = aVar;
    }

    public void s(long j4) {
        this.f13942j = j4;
    }

    public void t(int i4) {
        this.f13940h = i4;
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.objectdescriptors.b
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DecoderConfigDescriptor");
        sb.append("{objectTypeIndication=");
        sb.append(this.f13937e);
        sb.append(", streamType=");
        sb.append(this.f13938f);
        sb.append(", upStream=");
        sb.append(this.f13939g);
        sb.append(", bufferSizeDB=");
        sb.append(this.f13940h);
        sb.append(", maxBitRate=");
        sb.append(this.f13941i);
        sb.append(", avgBitRate=");
        sb.append(this.f13942j);
        sb.append(", decoderSpecificInfo=");
        sb.append(this.f13943k);
        sb.append(", audioSpecificInfo=");
        sb.append(this.f13944l);
        sb.append(", configDescriptorDeadBytes=");
        byte[] bArr = this.f13946n;
        if (bArr == null) {
            bArr = new byte[0];
        }
        sb.append(com.coremedia.iso.e.b(bArr));
        sb.append(", profileLevelIndicationDescriptors=");
        List<m> list = this.f13945m;
        sb.append(list == null ? "null" : Arrays.asList(list).toString());
        sb.append('}');
        return sb.toString();
    }

    public void u(long j4) {
        this.f13941i = j4;
    }

    public void v(int i4) {
        this.f13937e = i4;
    }

    public void w(int i4) {
        this.f13938f = i4;
    }

    public void x(int i4) {
        this.f13939g = i4;
    }
}
