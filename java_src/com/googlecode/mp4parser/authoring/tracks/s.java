package com.googlecode.mp4parser.authoring.tracks;

import com.coremedia.iso.boxes.a1;
import com.coremedia.iso.boxes.i;
import com.coremedia.iso.boxes.r0;
import com.coremedia.iso.boxes.s0;
import com.coremedia.iso.boxes.sampleentry.g;
import com.googlecode.mp4parser.boxes.threegpp26245.a;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
/* compiled from: TextTrackImpl.java */
/* loaded from: classes3.dex */
public class s extends com.googlecode.mp4parser.authoring.a {

    /* renamed from: e  reason: collision with root package name */
    com.googlecode.mp4parser.authoring.i f13597e;

    /* renamed from: f  reason: collision with root package name */
    s0 f13598f;

    /* renamed from: g  reason: collision with root package name */
    List<a> f13599g;

    /* compiled from: TextTrackImpl.java */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        long f13600a;

        /* renamed from: b  reason: collision with root package name */
        long f13601b;

        /* renamed from: c  reason: collision with root package name */
        String f13602c;

        public a(long j4, long j5, String str) {
            this.f13600a = j4;
            this.f13601b = j5;
            this.f13602c = str;
        }

        public long a() {
            return this.f13600a;
        }

        public String b() {
            return this.f13602c;
        }

        public long c() {
            return this.f13601b;
        }
    }

    public s() {
        super("subtiles");
        this.f13597e = new com.googlecode.mp4parser.authoring.i();
        this.f13599g = new LinkedList();
        this.f13598f = new s0();
        com.coremedia.iso.boxes.sampleentry.g gVar = new com.coremedia.iso.boxes.sampleentry.g(com.coremedia.iso.boxes.sampleentry.g.f9900v);
        gVar.d(1);
        gVar.f0(new g.b());
        gVar.Y(new g.a());
        this.f13598f.v(gVar);
        com.googlecode.mp4parser.boxes.threegpp26245.a aVar = new com.googlecode.mp4parser.boxes.threegpp26245.a();
        aVar.u(Collections.singletonList(new a.C0303a(1, "Serif")));
        gVar.v(aVar);
        this.f13597e.l(new Date());
        this.f13597e.r(new Date());
        this.f13597e.s(1000L);
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public com.googlecode.mp4parser.authoring.i M() {
        return this.f13597e;
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public long[] O() {
        ArrayList<Long> arrayList = new ArrayList();
        long j4 = 0;
        for (a aVar : this.f13599g) {
            long j5 = aVar.f13600a - j4;
            if (j5 > 0) {
                arrayList.add(Long.valueOf(j5));
            } else if (j5 < 0) {
                throw new Error("Subtitle display times may not intersect");
            }
            arrayList.add(Long.valueOf(aVar.f13601b - aVar.f13600a));
            j4 = aVar.f13601b;
        }
        long[] jArr = new long[arrayList.size()];
        int i4 = 0;
        for (Long l4 : arrayList) {
            jArr[i4] = l4.longValue();
            i4++;
        }
        return jArr;
    }

    @Override // com.googlecode.mp4parser.authoring.a, com.googlecode.mp4parser.authoring.h
    public List<r0.a> U() {
        return null;
    }

    public List<a> a() {
        return this.f13599g;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public String getHandler() {
        return "sbtl";
    }

    @Override // com.googlecode.mp4parser.authoring.a, com.googlecode.mp4parser.authoring.h
    public List<i.a> n() {
        return null;
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public s0 o() {
        return this.f13598f;
    }

    @Override // com.googlecode.mp4parser.authoring.a, com.googlecode.mp4parser.authoring.h
    public long[] q() {
        return null;
    }

    @Override // com.googlecode.mp4parser.authoring.a, com.googlecode.mp4parser.authoring.h
    public a1 s() {
        return null;
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public List<com.googlecode.mp4parser.authoring.f> x() {
        LinkedList linkedList = new LinkedList();
        long j4 = 0;
        for (a aVar : this.f13599g) {
            long j5 = aVar.f13600a - j4;
            if (j5 > 0) {
                linkedList.add(new com.googlecode.mp4parser.authoring.g(ByteBuffer.wrap(new byte[2])));
            } else if (j5 < 0) {
                throw new Error("Subtitle display times may not intersect");
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            try {
                dataOutputStream.writeShort(aVar.f13602c.getBytes("UTF-8").length);
                dataOutputStream.write(aVar.f13602c.getBytes("UTF-8"));
                dataOutputStream.close();
                linkedList.add(new com.googlecode.mp4parser.authoring.g(ByteBuffer.wrap(byteArrayOutputStream.toByteArray())));
                j4 = aVar.f13601b;
            } catch (IOException unused) {
                throw new Error("VM is broken. Does not support UTF-8");
            }
        }
        return linkedList;
    }
}
