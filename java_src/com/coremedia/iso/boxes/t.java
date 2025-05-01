package com.coremedia.iso.boxes;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.LinkedList;
import java.util.List;
/* compiled from: FreeBox.java */
/* loaded from: classes2.dex */
public class t implements d {

    /* renamed from: f  reason: collision with root package name */
    public static final String f9932f = "free";

    /* renamed from: g  reason: collision with root package name */
    static final /* synthetic */ boolean f9933g = false;

    /* renamed from: b  reason: collision with root package name */
    ByteBuffer f9934b;

    /* renamed from: c  reason: collision with root package name */
    List<d> f9935c;

    /* renamed from: d  reason: collision with root package name */
    private j f9936d;

    /* renamed from: e  reason: collision with root package name */
    private long f9937e;

    public t() {
        this.f9935c = new LinkedList();
        this.f9934b = ByteBuffer.wrap(new byte[0]);
    }

    @Override // com.coremedia.iso.boxes.d
    public void a(WritableByteChannel writableByteChannel) throws IOException {
        for (d dVar : this.f9935c) {
            dVar.a(writableByteChannel);
        }
        ByteBuffer allocate = ByteBuffer.allocate(8);
        com.coremedia.iso.i.i(allocate, this.f9934b.limit() + 8);
        allocate.put(f9932f.getBytes());
        allocate.rewind();
        writableByteChannel.write(allocate);
        allocate.rewind();
        this.f9934b.rewind();
        writableByteChannel.write(this.f9934b);
        this.f9934b.rewind();
    }

    public void b(d dVar) {
        this.f9934b.position(com.googlecode.mp4parser.util.c.a(dVar.getSize()));
        this.f9934b = this.f9934b.slice();
        this.f9935c.add(dVar);
    }

    public ByteBuffer c() {
        ByteBuffer byteBuffer = this.f9934b;
        if (byteBuffer != null) {
            return (ByteBuffer) byteBuffer.duplicate().rewind();
        }
        return null;
    }

    public void e(ByteBuffer byteBuffer) {
        this.f9934b = byteBuffer;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        t tVar = (t) obj;
        return c() == null ? tVar.c() == null : c().equals(tVar.c());
    }

    @Override // com.coremedia.iso.boxes.d
    public j getParent() {
        return this.f9936d;
    }

    @Override // com.coremedia.iso.boxes.d
    public long getSize() {
        long j4 = 8;
        for (d dVar : this.f9935c) {
            j4 += dVar.getSize();
        }
        return j4 + this.f9934b.limit();
    }

    @Override // com.coremedia.iso.boxes.d
    public String getType() {
        return f9932f;
    }

    public int hashCode() {
        ByteBuffer byteBuffer = this.f9934b;
        if (byteBuffer != null) {
            return byteBuffer.hashCode();
        }
        return 0;
    }

    @Override // com.coremedia.iso.boxes.d
    public long j() {
        return this.f9937e;
    }

    @Override // com.coremedia.iso.boxes.d
    public void k(com.googlecode.mp4parser.e eVar, ByteBuffer byteBuffer, long j4, com.coremedia.iso.c cVar) throws IOException {
        this.f9937e = eVar.position() - byteBuffer.remaining();
        if (j4 > 1048576) {
            this.f9934b = eVar.Q(eVar.position(), j4);
            eVar.G(eVar.position() + j4);
            return;
        }
        ByteBuffer allocate = ByteBuffer.allocate(com.googlecode.mp4parser.util.c.a(j4));
        this.f9934b = allocate;
        eVar.read(allocate);
    }

    @Override // com.coremedia.iso.boxes.d
    public void p(j jVar) {
        this.f9936d = jVar;
    }

    public t(int i4) {
        this.f9935c = new LinkedList();
        this.f9934b = ByteBuffer.allocate(i4);
    }
}
