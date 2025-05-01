package com.googlecode.mp4parser.boxes.mp4.objectdescriptors;

import java.io.IOException;
import java.nio.ByteBuffer;
/* compiled from: SLConfigDescriptor.java */
@Descriptor(tags = {6})
/* loaded from: classes3.dex */
public class n extends b {

    /* renamed from: e  reason: collision with root package name */
    int f13981e;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.f13981e == ((n) obj).f13981e;
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.objectdescriptors.b
    public void f(ByteBuffer byteBuffer) throws IOException {
        this.f13981e = com.coremedia.iso.g.p(byteBuffer);
    }

    public int g() {
        return this.f13981e;
    }

    public ByteBuffer h() {
        ByteBuffer allocate = ByteBuffer.allocate(3);
        com.coremedia.iso.i.m(allocate, 6);
        com.coremedia.iso.i.m(allocate, 1);
        com.coremedia.iso.i.m(allocate, this.f13981e);
        return allocate;
    }

    public int hashCode() {
        return this.f13981e;
    }

    public int i() {
        return 3;
    }

    public void j(int i4) {
        this.f13981e = i4;
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.objectdescriptors.b
    public String toString() {
        return "SLConfigDescriptor{predefined=" + this.f13981e + '}';
    }
}
