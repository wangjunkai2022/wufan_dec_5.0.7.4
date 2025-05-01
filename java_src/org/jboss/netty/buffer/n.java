package org.jboss.netty.buffer;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Objects;
/* compiled from: HeapChannelBufferFactory.java */
/* loaded from: classes7.dex */
public class n extends b {

    /* renamed from: b  reason: collision with root package name */
    private static final n f72490b = new n(ByteOrder.BIG_ENDIAN);

    /* renamed from: c  reason: collision with root package name */
    private static final n f72491c = new n(ByteOrder.LITTLE_ENDIAN);

    public n() {
    }

    public static f g() {
        return f72490b;
    }

    public static f h(ByteOrder byteOrder) {
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            return f72490b;
        }
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            return f72491c;
        }
        Objects.requireNonNull(byteOrder, "endianness");
        throw new IllegalStateException("Should not reach here");
    }

    @Override // org.jboss.netty.buffer.f
    public e b(ByteOrder byteOrder, byte[] bArr, int i4, int i5) {
        return h.b0(byteOrder, bArr, i4, i5);
    }

    @Override // org.jboss.netty.buffer.f
    public e c(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            return h.Z(byteBuffer);
        }
        e f5 = f(byteBuffer.order(), byteBuffer.remaining());
        int position = byteBuffer.position();
        f5.z0(byteBuffer);
        byteBuffer.position(position);
        return f5;
    }

    @Override // org.jboss.netty.buffer.f
    public e f(ByteOrder byteOrder, int i4) {
        return h.b(byteOrder, i4);
    }

    public n(ByteOrder byteOrder) {
        super(byteOrder);
    }
}
