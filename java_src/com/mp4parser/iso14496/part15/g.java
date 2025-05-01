package com.mp4parser.iso14496.part15;

import java.nio.ByteBuffer;
/* compiled from: SyncSampleEntry.java */
/* loaded from: classes5.dex */
public class g extends com.googlecode.mp4parser.boxes.mp4.samplegrouping.b {

    /* renamed from: c  reason: collision with root package name */
    public static final String f57197c = "sync";

    /* renamed from: a  reason: collision with root package name */
    int f57198a;

    /* renamed from: b  reason: collision with root package name */
    int f57199b;

    @Override // com.googlecode.mp4parser.boxes.mp4.samplegrouping.b
    public ByteBuffer a() {
        ByteBuffer allocate = ByteBuffer.allocate(1);
        com.coremedia.iso.i.m(allocate, this.f57199b + (this.f57198a << 6));
        return (ByteBuffer) allocate.rewind();
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.samplegrouping.b
    public void b(ByteBuffer byteBuffer) {
        int p4 = com.coremedia.iso.g.p(byteBuffer);
        this.f57198a = (p4 & 192) >> 6;
        this.f57199b = p4 & 63;
    }

    public int d() {
        return this.f57199b;
    }

    public int e() {
        return this.f57198a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        g gVar = (g) obj;
        return this.f57199b == gVar.f57199b && this.f57198a == gVar.f57198a;
    }

    public void f(int i4) {
        this.f57199b = i4;
    }

    public void g(int i4) {
        this.f57198a = i4;
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.samplegrouping.b
    public String getType() {
        return f57197c;
    }

    public int hashCode() {
        return (this.f57198a * 31) + this.f57199b;
    }

    public String toString() {
        return "SyncSampleEntry{reserved=" + this.f57198a + ", nalUnitType=" + this.f57199b + '}';
    }
}
