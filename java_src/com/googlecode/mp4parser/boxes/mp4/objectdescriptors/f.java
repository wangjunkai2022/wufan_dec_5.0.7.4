package com.googlecode.mp4parser.boxes.mp4.objectdescriptors;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
/* compiled from: DecoderSpecificInfo.java */
@Descriptor(tags = {5})
/* loaded from: classes3.dex */
public class f extends b {

    /* renamed from: e  reason: collision with root package name */
    byte[] f13947e;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && Arrays.equals(this.f13947e, ((f) obj).f13947e);
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.objectdescriptors.b
    public void f(ByteBuffer byteBuffer) throws IOException {
        int i4 = this.f13927b;
        if (i4 > 0) {
            byte[] bArr = new byte[i4];
            this.f13947e = bArr;
            byteBuffer.get(bArr);
        }
    }

    public ByteBuffer g() {
        return ByteBuffer.wrap(this.f13947e);
    }

    public int h() {
        return this.f13947e.length;
    }

    public int hashCode() {
        byte[] bArr = this.f13947e;
        if (bArr != null) {
            return Arrays.hashCode(bArr);
        }
        return 0;
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.objectdescriptors.b
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DecoderSpecificInfo");
        sb.append("{bytes=");
        byte[] bArr = this.f13947e;
        sb.append(bArr == null ? "null" : com.coremedia.iso.e.b(bArr));
        sb.append('}');
        return sb.toString();
    }
}
