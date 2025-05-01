package com.googlecode.mp4parser.authoring.tracks;

import com.coremedia.iso.boxes.a1;
import com.coremedia.iso.boxes.i;
import com.coremedia.iso.boxes.r0;
import com.coremedia.iso.boxes.s0;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
/* loaded from: classes3.dex */
public class Amf0Track extends com.googlecode.mp4parser.authoring.a {

    /* renamed from: e  reason: collision with root package name */
    SortedMap<Long, byte[]> f13258e;

    /* renamed from: f  reason: collision with root package name */
    private com.googlecode.mp4parser.authoring.i f13259f;

    public Amf0Track(Map<Long, byte[]> map) {
        super(f1.a.f68991p);
        this.f13258e = new TreeMap<Long, byte[]>() { // from class: com.googlecode.mp4parser.authoring.tracks.Amf0Track.1
        };
        this.f13259f = new com.googlecode.mp4parser.authoring.i();
        this.f13258e = new TreeMap(map);
        this.f13259f.l(new Date());
        this.f13259f.r(new Date());
        this.f13259f.s(1000L);
        this.f13259f.o("eng");
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public com.googlecode.mp4parser.authoring.i M() {
        return this.f13259f;
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public long[] O() {
        LinkedList linkedList = new LinkedList(this.f13258e.keySet());
        Collections.sort(linkedList);
        long[] jArr = new long[linkedList.size()];
        for (int i4 = 0; i4 < linkedList.size(); i4++) {
            jArr[i4] = ((Long) linkedList.get(i4)).longValue() - 0;
        }
        return jArr;
    }

    @Override // com.googlecode.mp4parser.authoring.a, com.googlecode.mp4parser.authoring.h
    public List<r0.a> U() {
        return null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public String getHandler() {
        return "data";
    }

    @Override // com.googlecode.mp4parser.authoring.a, com.googlecode.mp4parser.authoring.h
    public List<i.a> n() {
        return null;
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public s0 o() {
        s0 s0Var = new s0();
        f1.a aVar = new f1.a();
        aVar.d(1);
        s0Var.v(aVar);
        return s0Var;
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
        for (byte[] bArr : this.f13258e.values()) {
            linkedList.add(new com.googlecode.mp4parser.authoring.g(ByteBuffer.wrap(bArr)));
        }
        return linkedList;
    }
}
