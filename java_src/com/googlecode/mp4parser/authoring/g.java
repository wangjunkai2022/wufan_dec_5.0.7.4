package com.googlecode.mp4parser.authoring;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
/* compiled from: SampleImpl.java */
/* loaded from: classes3.dex */
public class g implements f {

    /* renamed from: a  reason: collision with root package name */
    private final long f13215a;

    /* renamed from: b  reason: collision with root package name */
    private final long f13216b;

    /* renamed from: c  reason: collision with root package name */
    private ByteBuffer[] f13217c;

    /* renamed from: d  reason: collision with root package name */
    private final com.coremedia.iso.boxes.j f13218d;

    public g(ByteBuffer byteBuffer) {
        this.f13215a = -1L;
        this.f13216b = byteBuffer.limit();
        this.f13217c = new ByteBuffer[]{byteBuffer};
        this.f13218d = null;
    }

    @Override // com.googlecode.mp4parser.authoring.f
    public ByteBuffer a() {
        c();
        ByteBuffer wrap = ByteBuffer.wrap(new byte[com.googlecode.mp4parser.util.c.a(this.f13216b)]);
        for (ByteBuffer byteBuffer : this.f13217c) {
            wrap.put(byteBuffer.duplicate());
        }
        wrap.rewind();
        return wrap;
    }

    @Override // com.googlecode.mp4parser.authoring.f
    public void b(WritableByteChannel writableByteChannel) throws IOException {
        c();
        for (ByteBuffer byteBuffer : this.f13217c) {
            writableByteChannel.write(byteBuffer.duplicate());
        }
    }

    protected void c() {
        if (this.f13217c != null) {
            return;
        }
        com.coremedia.iso.boxes.j jVar = this.f13218d;
        if (jVar != null) {
            try {
                this.f13217c = new ByteBuffer[]{jVar.r(this.f13215a, this.f13216b)};
                return;
            } catch (IOException e5) {
                throw new RuntimeException("couldn't read sample " + this, e5);
            }
        }
        throw new RuntimeException("Missing parent container, can't read sample " + this);
    }

    @Override // com.googlecode.mp4parser.authoring.f
    public long getSize() {
        return this.f13216b;
    }

    public String toString() {
        return "SampleImpl{offset=" + this.f13215a + "{size=" + this.f13216b + '}';
    }

    public g(ByteBuffer[] byteBufferArr) {
        this.f13215a = -1L;
        int i4 = 0;
        for (ByteBuffer byteBuffer : byteBufferArr) {
            i4 += byteBuffer.remaining();
        }
        this.f13216b = i4;
        this.f13217c = byteBufferArr;
        this.f13218d = null;
    }

    public g(long j4, long j5, ByteBuffer byteBuffer) {
        this.f13215a = j4;
        this.f13216b = j5;
        this.f13217c = new ByteBuffer[]{byteBuffer};
        this.f13218d = null;
    }

    public g(long j4, long j5, com.coremedia.iso.boxes.j jVar) {
        this.f13215a = j4;
        this.f13216b = j5;
        this.f13217c = null;
        this.f13218d = jVar;
    }
}
