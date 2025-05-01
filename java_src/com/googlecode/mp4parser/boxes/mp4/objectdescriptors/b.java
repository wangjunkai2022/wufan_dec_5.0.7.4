package com.googlecode.mp4parser.boxes.mp4.objectdescriptors;

import java.io.IOException;
import java.nio.ByteBuffer;
/* compiled from: BaseDescriptor.java */
@Descriptor(tags = {0})
/* loaded from: classes3.dex */
public abstract class b {

    /* renamed from: d  reason: collision with root package name */
    static final /* synthetic */ boolean f13925d = false;

    /* renamed from: a  reason: collision with root package name */
    int f13926a;

    /* renamed from: b  reason: collision with root package name */
    int f13927b;

    /* renamed from: c  reason: collision with root package name */
    int f13928c;

    public int a() {
        return this.f13927b + 1 + this.f13928c;
    }

    public int b() {
        return this.f13928c;
    }

    public int c() {
        return this.f13927b;
    }

    public int d() {
        return this.f13926a;
    }

    public final void e(int i4, ByteBuffer byteBuffer) throws IOException {
        this.f13926a = i4;
        int p4 = com.coremedia.iso.g.p(byteBuffer);
        this.f13927b = p4 & 127;
        int i5 = 1;
        while ((p4 >>> 7) == 1) {
            p4 = com.coremedia.iso.g.p(byteBuffer);
            i5++;
            this.f13927b = (this.f13927b << 7) | (p4 & 127);
        }
        this.f13928c = i5;
        ByteBuffer slice = byteBuffer.slice();
        slice.limit(this.f13927b);
        f(slice);
        byteBuffer.position(byteBuffer.position() + this.f13927b);
    }

    public abstract void f(ByteBuffer byteBuffer) throws IOException;

    public String toString() {
        return "BaseDescriptor{tag=" + this.f13926a + ", sizeOfInstance=" + this.f13927b + '}';
    }
}
