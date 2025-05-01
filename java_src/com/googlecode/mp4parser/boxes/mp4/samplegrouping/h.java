package com.googlecode.mp4parser.boxes.mp4.samplegrouping;

import java.nio.ByteBuffer;
/* compiled from: UnknownEntry.java */
/* loaded from: classes3.dex */
public class h extends b {

    /* renamed from: a  reason: collision with root package name */
    private ByteBuffer f14020a;

    /* renamed from: b  reason: collision with root package name */
    private String f14021b;

    public h(String str) {
        this.f14021b = str;
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.samplegrouping.b
    public ByteBuffer a() {
        return this.f14020a.duplicate();
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.samplegrouping.b
    public void b(ByteBuffer byteBuffer) {
        this.f14020a = (ByteBuffer) byteBuffer.duplicate().rewind();
    }

    public ByteBuffer d() {
        return this.f14020a;
    }

    public void e(ByteBuffer byteBuffer) {
        this.f14020a = (ByteBuffer) byteBuffer.duplicate().rewind();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ByteBuffer byteBuffer = this.f14020a;
        ByteBuffer byteBuffer2 = ((h) obj).f14020a;
        return byteBuffer == null ? byteBuffer2 == null : byteBuffer.equals(byteBuffer2);
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.samplegrouping.b
    public String getType() {
        return this.f14021b;
    }

    public int hashCode() {
        ByteBuffer byteBuffer = this.f14020a;
        if (byteBuffer != null) {
            return byteBuffer.hashCode();
        }
        return 0;
    }

    public String toString() {
        ByteBuffer duplicate = this.f14020a.duplicate();
        duplicate.rewind();
        byte[] bArr = new byte[duplicate.limit()];
        duplicate.get(bArr);
        return "UnknownEntry{content=" + com.coremedia.iso.e.b(bArr) + '}';
    }
}
