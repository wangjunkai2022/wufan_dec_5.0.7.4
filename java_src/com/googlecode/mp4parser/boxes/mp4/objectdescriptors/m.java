package com.googlecode.mp4parser.boxes.mp4.objectdescriptors;

import java.io.IOException;
import java.nio.ByteBuffer;
/* compiled from: ProfileLevelIndicationDescriptor.java */
@Descriptor(tags = {20})
/* loaded from: classes3.dex */
public class m extends b {

    /* renamed from: e  reason: collision with root package name */
    int f13980e;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.f13980e == ((m) obj).f13980e;
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.objectdescriptors.b
    public void f(ByteBuffer byteBuffer) throws IOException {
        this.f13980e = com.coremedia.iso.g.p(byteBuffer);
    }

    public int hashCode() {
        return this.f13980e;
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.objectdescriptors.b
    public String toString() {
        return "ProfileLevelIndicationDescriptor{profileLevelIndicationIndex=" + Integer.toHexString(this.f13980e) + '}';
    }
}
