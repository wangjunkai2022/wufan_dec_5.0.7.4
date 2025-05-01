package com.googlecode.mp4parser.authoring.tracks;

import com.coremedia.iso.boxes.a1;
import com.coremedia.iso.boxes.i;
import com.coremedia.iso.boxes.r0;
import com.coremedia.iso.boxes.s0;
import io.netty.handler.codec.memcache.binary.BinaryMemcacheOpcodes;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
/* compiled from: SilenceTrackImpl.java */
/* loaded from: classes3.dex */
public class r implements com.googlecode.mp4parser.authoring.h {

    /* renamed from: b  reason: collision with root package name */
    com.googlecode.mp4parser.authoring.h f13593b;

    /* renamed from: c  reason: collision with root package name */
    List<com.googlecode.mp4parser.authoring.f> f13594c = new LinkedList();

    /* renamed from: d  reason: collision with root package name */
    long[] f13595d;

    /* renamed from: e  reason: collision with root package name */
    String f13596e;

    public r(com.googlecode.mp4parser.authoring.h hVar, long j4) {
        this.f13593b = hVar;
        this.f13596e = j4 + "ms silence";
        if (com.coremedia.iso.boxes.sampleentry.c.E.equals(hVar.o().C().getType())) {
            int a5 = com.googlecode.mp4parser.util.c.a(((M().h() * j4) / 1000) / 1024);
            long[] jArr = new long[a5];
            this.f13595d = jArr;
            Arrays.fill(jArr, ((M().h() * j4) / a5) / 1000);
            while (true) {
                int i4 = a5 - 1;
                if (a5 <= 0) {
                    return;
                }
                this.f13594c.add(new com.googlecode.mp4parser.authoring.g((ByteBuffer) ByteBuffer.wrap(new byte[]{BinaryMemcacheOpcodes.SASL_AUTH, 16, 4, 96, -116, BinaryMemcacheOpcodes.TOUCH}).rewind()));
                a5 = i4;
            }
        } else {
            throw new RuntimeException("Tracks of type " + hVar.getClass().getSimpleName() + " are not supported");
        }
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public List<com.googlecode.mp4parser.authoring.c> H() {
        return null;
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public Map<com.googlecode.mp4parser.boxes.mp4.samplegrouping.b, long[]> I() {
        return this.f13593b.I();
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public com.googlecode.mp4parser.authoring.i M() {
        return this.f13593b.M();
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public long[] O() {
        return this.f13595d;
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public List<r0.a> U() {
        return null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public long getDuration() {
        long j4 = 0;
        for (long j5 : this.f13595d) {
            j4 += j5;
        }
        return j4;
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public String getHandler() {
        return this.f13593b.getHandler();
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public String getName() {
        return this.f13596e;
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public List<i.a> n() {
        return null;
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public s0 o() {
        return this.f13593b.o();
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public long[] q() {
        return null;
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public a1 s() {
        return null;
    }

    @Override // com.googlecode.mp4parser.authoring.h
    public List<com.googlecode.mp4parser.authoring.f> x() {
        return this.f13594c;
    }
}
