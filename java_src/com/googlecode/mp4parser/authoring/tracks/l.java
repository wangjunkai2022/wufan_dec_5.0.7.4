package com.googlecode.mp4parser.authoring.tracks;

import com.coremedia.iso.boxes.a1;
import com.coremedia.iso.boxes.i;
import com.coremedia.iso.boxes.r0;
import com.coremedia.iso.boxes.s0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* compiled from: DivideTimeScaleTrack.java */
/* loaded from: classes3.dex */
public class l implements com.googlecode.mp4parser.authoring.h {

    /* renamed from: b  reason: collision with root package name */
    com.googlecode.mp4parser.authoring.h f13519b;

    /* renamed from: c  reason: collision with root package name */
    private int f13520c;

    public l(com.googlecode.mp4parser.authoring.h hVar, int i4) {
        this.f13519b = hVar;
        this.f13520c = i4;
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public List<com.googlecode.mp4parser.authoring.c> H() {
        return this.f13519b.H();
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public Map<com.googlecode.mp4parser.boxes.mp4.samplegrouping.b, long[]> I() {
        return this.f13519b.I();
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public com.googlecode.mp4parser.authoring.i M() {
        com.googlecode.mp4parser.authoring.i iVar = (com.googlecode.mp4parser.authoring.i) this.f13519b.M().clone();
        iVar.s(this.f13519b.M().h() / this.f13520c);
        return iVar;
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public long[] O() {
        long[] jArr = new long[this.f13519b.O().length];
        for (int i4 = 0; i4 < this.f13519b.O().length; i4++) {
            jArr[i4] = this.f13519b.O()[i4] / this.f13520c;
        }
        return jArr;
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public List<r0.a> U() {
        return this.f13519b.U();
    }

    List<i.a> a() {
        List<i.a> n4 = this.f13519b.n();
        if (n4 != null) {
            ArrayList arrayList = new ArrayList(n4.size());
            for (i.a aVar : n4) {
                arrayList.add(new i.a(aVar.a(), aVar.b() / this.f13520c));
            }
            return arrayList;
        }
        return null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f13519b.close();
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public long getDuration() {
        long j4 = 0;
        for (long j5 : O()) {
            j4 += j5;
        }
        return j4;
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public String getHandler() {
        return this.f13519b.getHandler();
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public String getName() {
        return "timscale(" + this.f13519b.getName() + ")";
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public List<i.a> n() {
        return a();
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public s0 o() {
        return this.f13519b.o();
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public long[] q() {
        return this.f13519b.q();
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public a1 s() {
        return this.f13519b.s();
    }

    public String toString() {
        return "MultiplyTimeScaleTrack{source=" + this.f13519b + '}';
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public List<com.googlecode.mp4parser.authoring.f> x() {
        return this.f13519b.x();
    }
}
