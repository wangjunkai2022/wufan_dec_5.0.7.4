package com.mp4parser.iso14496.part15;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
/* compiled from: AvcDecoderConfigurationRecord.java */
/* loaded from: classes5.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    public int f57125a;

    /* renamed from: b  reason: collision with root package name */
    public int f57126b;

    /* renamed from: c  reason: collision with root package name */
    public int f57127c;

    /* renamed from: d  reason: collision with root package name */
    public int f57128d;

    /* renamed from: e  reason: collision with root package name */
    public int f57129e;

    /* renamed from: f  reason: collision with root package name */
    public List<byte[]> f57130f;

    /* renamed from: g  reason: collision with root package name */
    public List<byte[]> f57131g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f57132h;

    /* renamed from: i  reason: collision with root package name */
    public int f57133i;

    /* renamed from: j  reason: collision with root package name */
    public int f57134j;

    /* renamed from: k  reason: collision with root package name */
    public int f57135k;

    /* renamed from: l  reason: collision with root package name */
    public List<byte[]> f57136l;

    /* renamed from: m  reason: collision with root package name */
    public int f57137m;

    /* renamed from: n  reason: collision with root package name */
    public int f57138n;

    /* renamed from: o  reason: collision with root package name */
    public int f57139o;

    /* renamed from: p  reason: collision with root package name */
    public int f57140p;

    /* renamed from: q  reason: collision with root package name */
    public int f57141q;

    public b() {
        this.f57130f = new ArrayList();
        this.f57131g = new ArrayList();
        this.f57132h = true;
        this.f57133i = 1;
        this.f57134j = 0;
        this.f57135k = 0;
        this.f57136l = new ArrayList();
        this.f57137m = 63;
        this.f57138n = 7;
        this.f57139o = 31;
        this.f57140p = 31;
        this.f57141q = 31;
    }

    public void a(ByteBuffer byteBuffer) {
        com.coremedia.iso.i.m(byteBuffer, this.f57125a);
        com.coremedia.iso.i.m(byteBuffer, this.f57126b);
        com.coremedia.iso.i.m(byteBuffer, this.f57127c);
        com.coremedia.iso.i.m(byteBuffer, this.f57128d);
        com.googlecode.mp4parser.boxes.mp4.objectdescriptors.d dVar = new com.googlecode.mp4parser.boxes.mp4.objectdescriptors.d(byteBuffer);
        dVar.a(this.f57137m, 6);
        dVar.a(this.f57129e, 2);
        dVar.a(this.f57138n, 3);
        dVar.a(this.f57131g.size(), 5);
        for (byte[] bArr : this.f57130f) {
            com.coremedia.iso.i.f(byteBuffer, bArr.length);
            byteBuffer.put(bArr);
        }
        com.coremedia.iso.i.m(byteBuffer, this.f57131g.size());
        for (byte[] bArr2 : this.f57131g) {
            com.coremedia.iso.i.f(byteBuffer, bArr2.length);
            byteBuffer.put(bArr2);
        }
        if (this.f57132h) {
            int i4 = this.f57126b;
            if (i4 == 100 || i4 == 110 || i4 == 122 || i4 == 144) {
                com.googlecode.mp4parser.boxes.mp4.objectdescriptors.d dVar2 = new com.googlecode.mp4parser.boxes.mp4.objectdescriptors.d(byteBuffer);
                dVar2.a(this.f57139o, 6);
                dVar2.a(this.f57133i, 2);
                dVar2.a(this.f57140p, 5);
                dVar2.a(this.f57134j, 3);
                dVar2.a(this.f57141q, 5);
                dVar2.a(this.f57135k, 3);
                for (byte[] bArr3 : this.f57136l) {
                    com.coremedia.iso.i.f(byteBuffer, bArr3.length);
                    byteBuffer.put(bArr3);
                }
            }
        }
    }

    public long b() {
        int i4;
        long j4 = 6;
        for (byte[] bArr : this.f57130f) {
            j4 = j4 + 2 + bArr.length;
        }
        long j5 = j4 + 1;
        for (byte[] bArr2 : this.f57131g) {
            j5 = j5 + 2 + bArr2.length;
        }
        if (this.f57132h && ((i4 = this.f57126b) == 100 || i4 == 110 || i4 == 122 || i4 == 144)) {
            j5 += 4;
            for (byte[] bArr3 : this.f57136l) {
                j5 = j5 + 2 + bArr3.length;
            }
        }
        return j5;
    }

    public String[] c() {
        ArrayList arrayList = new ArrayList();
        for (byte[] bArr : this.f57131g) {
            try {
                arrayList.add(com.googlecode.mp4parser.h264.model.e.b(new ByteArrayInputStream(bArr, 1, bArr.length - 1)).toString());
            } catch (IOException e5) {
                throw new RuntimeException(e5);
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public List<String> d() {
        ArrayList arrayList = new ArrayList(this.f57131g.size());
        for (byte[] bArr : this.f57131g) {
            arrayList.add(com.coremedia.iso.e.b(bArr));
        }
        return arrayList;
    }

    public String[] e() {
        String str;
        ArrayList arrayList = new ArrayList();
        for (byte[] bArr : this.f57130f) {
            try {
                str = com.googlecode.mp4parser.h264.model.h.c(new com.googlecode.mp4parser.authoring.tracks.i(new ByteArrayInputStream(bArr, 1, bArr.length - 1))).toString();
            } catch (IOException unused) {
                str = "not parsable";
            }
            arrayList.add(str);
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public List<String> f() {
        ArrayList arrayList = new ArrayList(this.f57136l.size());
        for (byte[] bArr : this.f57136l) {
            arrayList.add(com.coremedia.iso.e.b(bArr));
        }
        return arrayList;
    }

    public List<String> g() {
        ArrayList arrayList = new ArrayList(this.f57130f.size());
        for (byte[] bArr : this.f57130f) {
            arrayList.add(com.coremedia.iso.e.b(bArr));
        }
        return arrayList;
    }

    public String toString() {
        return "AvcDecoderConfigurationRecord{configurationVersion=" + this.f57125a + ", avcProfileIndication=" + this.f57126b + ", profileCompatibility=" + this.f57127c + ", avcLevelIndication=" + this.f57128d + ", lengthSizeMinusOne=" + this.f57129e + ", hasExts=" + this.f57132h + ", chromaFormat=" + this.f57133i + ", bitDepthLumaMinus8=" + this.f57134j + ", bitDepthChromaMinus8=" + this.f57135k + ", lengthSizeMinusOnePaddingBits=" + this.f57137m + ", numberOfSequenceParameterSetsPaddingBits=" + this.f57138n + ", chromaFormatPaddingBits=" + this.f57139o + ", bitDepthLumaMinus8PaddingBits=" + this.f57140p + ", bitDepthChromaMinus8PaddingBits=" + this.f57141q + '}';
    }

    public b(ByteBuffer byteBuffer) {
        int i4;
        this.f57130f = new ArrayList();
        this.f57131g = new ArrayList();
        this.f57132h = true;
        this.f57133i = 1;
        this.f57134j = 0;
        this.f57135k = 0;
        this.f57136l = new ArrayList();
        this.f57137m = 63;
        this.f57138n = 7;
        this.f57139o = 31;
        this.f57140p = 31;
        this.f57141q = 31;
        this.f57125a = com.coremedia.iso.g.p(byteBuffer);
        this.f57126b = com.coremedia.iso.g.p(byteBuffer);
        this.f57127c = com.coremedia.iso.g.p(byteBuffer);
        this.f57128d = com.coremedia.iso.g.p(byteBuffer);
        com.googlecode.mp4parser.boxes.mp4.objectdescriptors.c cVar = new com.googlecode.mp4parser.boxes.mp4.objectdescriptors.c(byteBuffer);
        this.f57137m = cVar.c(6);
        this.f57129e = cVar.c(2);
        this.f57138n = cVar.c(3);
        int c5 = cVar.c(5);
        for (int i5 = 0; i5 < c5; i5++) {
            byte[] bArr = new byte[com.coremedia.iso.g.i(byteBuffer)];
            byteBuffer.get(bArr);
            this.f57130f.add(bArr);
        }
        long p4 = com.coremedia.iso.g.p(byteBuffer);
        for (int i6 = 0; i6 < p4; i6++) {
            byte[] bArr2 = new byte[com.coremedia.iso.g.i(byteBuffer)];
            byteBuffer.get(bArr2);
            this.f57131g.add(bArr2);
        }
        if (byteBuffer.remaining() < 4) {
            this.f57132h = false;
        }
        if (this.f57132h && ((i4 = this.f57126b) == 100 || i4 == 110 || i4 == 122 || i4 == 144)) {
            com.googlecode.mp4parser.boxes.mp4.objectdescriptors.c cVar2 = new com.googlecode.mp4parser.boxes.mp4.objectdescriptors.c(byteBuffer);
            this.f57139o = cVar2.c(6);
            this.f57133i = cVar2.c(2);
            this.f57140p = cVar2.c(5);
            this.f57134j = cVar2.c(3);
            this.f57141q = cVar2.c(5);
            this.f57135k = cVar2.c(3);
            long p5 = com.coremedia.iso.g.p(byteBuffer);
            for (int i7 = 0; i7 < p5; i7++) {
                byte[] bArr3 = new byte[com.coremedia.iso.g.i(byteBuffer)];
                byteBuffer.get(bArr3);
                this.f57136l.add(bArr3);
            }
            return;
        }
        this.f57133i = -1;
        this.f57134j = -1;
        this.f57135k = -1;
    }
}
