package com.googlecode.mp4parser.authoring.tracks;

import com.coremedia.iso.boxes.a1;
import com.coremedia.iso.boxes.i;
import com.coremedia.iso.boxes.r0;
import com.coremedia.iso.boxes.s0;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.AbstractList;
import java.util.List;
/* compiled from: ReplaceSampleTrack.java */
/* loaded from: classes3.dex */
public class p extends com.googlecode.mp4parser.authoring.a {

    /* renamed from: e  reason: collision with root package name */
    com.googlecode.mp4parser.authoring.h f13575e;

    /* renamed from: f  reason: collision with root package name */
    private long f13576f;

    /* renamed from: g  reason: collision with root package name */
    private com.googlecode.mp4parser.authoring.f f13577g;

    /* renamed from: h  reason: collision with root package name */
    private List<com.googlecode.mp4parser.authoring.f> f13578h;

    /* compiled from: ReplaceSampleTrack.java */
    /* loaded from: classes3.dex */
    private class b extends AbstractList<com.googlecode.mp4parser.authoring.f> {
        private b() {
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: a */
        public com.googlecode.mp4parser.authoring.f get(int i4) {
            if (p.this.f13576f == i4) {
                return p.this.f13577g;
            }
            return p.this.f13575e.x().get(i4);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return p.this.f13575e.x().size();
        }

        /* synthetic */ b(p pVar, b bVar) {
            this();
        }
    }

    public p(com.googlecode.mp4parser.authoring.h hVar, long j4, ByteBuffer byteBuffer) {
        super("replace(" + hVar.getName() + ")");
        this.f13575e = hVar;
        this.f13576f = j4;
        this.f13577g = new com.googlecode.mp4parser.authoring.g(byteBuffer);
        this.f13578h = new b(this, null);
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public com.googlecode.mp4parser.authoring.i M() {
        return this.f13575e.M();
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public synchronized long[] O() {
        return this.f13575e.O();
    }

    @Override // com.googlecode.mp4parser.authoring.a, com.googlecode.mp4parser.authoring.h
    public List<r0.a> U() {
        return this.f13575e.U();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f13575e.close();
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public String getHandler() {
        return this.f13575e.getHandler();
    }

    @Override // com.googlecode.mp4parser.authoring.a, com.googlecode.mp4parser.authoring.h
    public List<i.a> n() {
        return this.f13575e.n();
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public s0 o() {
        return this.f13575e.o();
    }

    @Override // com.googlecode.mp4parser.authoring.a, com.googlecode.mp4parser.authoring.h
    public synchronized long[] q() {
        return this.f13575e.q();
    }

    @Override // com.googlecode.mp4parser.authoring.a, com.googlecode.mp4parser.authoring.h
    public a1 s() {
        return this.f13575e.s();
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public List<com.googlecode.mp4parser.authoring.f> x() {
        return this.f13578h;
    }
}
