package com.googlecode.mp4parser.authoring.tracks;

import com.coremedia.iso.boxes.a1;
import com.coremedia.iso.boxes.i;
import com.coremedia.iso.boxes.r0;
import com.coremedia.iso.boxes.s0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* compiled from: MultiplyTimeScaleTrack.java */
/* loaded from: classes3.dex */
public class o implements com.googlecode.mp4parser.authoring.h {

    /* renamed from: b  reason: collision with root package name */
    com.googlecode.mp4parser.authoring.h f13573b;

    /* renamed from: c  reason: collision with root package name */
    private int f13574c;

    public o(com.googlecode.mp4parser.authoring.h hVar, int i4) {
        this.f13573b = hVar;
        this.f13574c = i4;
    }

    static List<i.a> a(List<i.a> list, int i4) {
        if (list != null) {
            ArrayList arrayList = new ArrayList(list.size());
            for (i.a aVar : list) {
                arrayList.add(new i.a(aVar.a(), aVar.b() * i4));
            }
            return arrayList;
        }
        return null;
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public List<com.googlecode.mp4parser.authoring.c> H() {
        return this.f13573b.H();
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public Map<com.googlecode.mp4parser.boxes.mp4.samplegrouping.b, long[]> I() {
        return this.f13573b.I();
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public com.googlecode.mp4parser.authoring.i M() {
        com.googlecode.mp4parser.authoring.i iVar = (com.googlecode.mp4parser.authoring.i) this.f13573b.M().clone();
        iVar.s(this.f13573b.M().h() * this.f13574c);
        return iVar;
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public long[] O() {
        long[] jArr = new long[this.f13573b.O().length];
        for (int i4 = 0; i4 < this.f13573b.O().length; i4++) {
            jArr[i4] = this.f13573b.O()[i4] * this.f13574c;
        }
        return jArr;
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public List<r0.a> U() {
        return this.f13573b.U();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f13573b.close();
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public long getDuration() {
        return this.f13573b.getDuration() * this.f13574c;
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public String getHandler() {
        return this.f13573b.getHandler();
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public String getName() {
        return "timscale(" + this.f13573b.getName() + ")";
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public List<i.a> n() {
        return a(this.f13573b.n(), this.f13574c);
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public s0 o() {
        return this.f13573b.o();
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public long[] q() {
        return this.f13573b.q();
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public a1 s() {
        return this.f13573b.s();
    }

    public String toString() {
        return "MultiplyTimeScaleTrack{source=" + this.f13573b + '}';
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public List<com.googlecode.mp4parser.authoring.f> x() {
        return this.f13573b.x();
    }
}
