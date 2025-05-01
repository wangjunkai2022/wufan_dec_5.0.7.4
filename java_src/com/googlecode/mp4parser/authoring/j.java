package com.googlecode.mp4parser.authoring;

import com.coremedia.iso.boxes.a1;
import com.coremedia.iso.boxes.i;
import com.coremedia.iso.boxes.r0;
import com.coremedia.iso.boxes.s0;
import java.io.IOException;
import java.util.List;
import java.util.Map;
/* compiled from: WrappingTrack.java */
/* loaded from: classes3.dex */
public class j implements h {

    /* renamed from: b  reason: collision with root package name */
    h f13230b;

    public j(h hVar) {
        this.f13230b = hVar;
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public List<c> H() {
        return this.f13230b.H();
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public Map<com.googlecode.mp4parser.boxes.mp4.samplegrouping.b, long[]> I() {
        return this.f13230b.I();
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public i M() {
        return this.f13230b.M();
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public long[] O() {
        return this.f13230b.O();
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public List<r0.a> U() {
        return this.f13230b.U();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f13230b.close();
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public long getDuration() {
        return this.f13230b.getDuration();
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public String getHandler() {
        return this.f13230b.getHandler();
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public String getName() {
        return String.valueOf(this.f13230b.getName()) + "'";
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public List<i.a> n() {
        return this.f13230b.n();
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public s0 o() {
        return this.f13230b.o();
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public long[] q() {
        return this.f13230b.q();
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public a1 s() {
        return this.f13230b.s();
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public List<f> x() {
        return this.f13230b.x();
    }
}
