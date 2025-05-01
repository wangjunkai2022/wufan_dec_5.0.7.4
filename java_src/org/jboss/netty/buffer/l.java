package org.jboss.netty.buffer;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.GatheringByteChannel;
import java.nio.channels.ScatteringByteChannel;
import java.util.Objects;
/* compiled from: DynamicChannelBuffer.java */
/* loaded from: classes7.dex */
public class l extends a {

    /* renamed from: f  reason: collision with root package name */
    private final f f72486f;

    /* renamed from: g  reason: collision with root package name */
    private final ByteOrder f72487g;

    /* renamed from: h  reason: collision with root package name */
    private e f72488h;

    public l(int i4) {
        this(ByteOrder.BIG_ENDIAN, i4);
    }

    @Override // org.jboss.netty.buffer.a, org.jboss.netty.buffer.e
    public void B0(int i4) {
        if (i4 <= writableBytes()) {
            return;
        }
        int capacity = capacity() == 0 ? 1 : capacity();
        int writerIndex = writerIndex() + i4;
        while (capacity < writerIndex) {
            capacity <<= 1;
            if (capacity == 0) {
                throw new IllegalStateException("Maximum size of 2gb exceeded");
            }
        }
        e f5 = factory().f(order(), capacity);
        f5.M(this.f72488h, 0, writerIndex());
        this.f72488h = f5;
    }

    @Override // org.jboss.netty.buffer.e
    public void F(int i4, OutputStream outputStream, int i5) throws IOException {
        this.f72488h.F(i4, outputStream, i5);
    }

    @Override // org.jboss.netty.buffer.e
    public void F0(int i4, ByteBuffer byteBuffer) {
        this.f72488h.F0(i4, byteBuffer);
    }

    @Override // org.jboss.netty.buffer.a, org.jboss.netty.buffer.e
    public void M(e eVar, int i4, int i5) {
        B0(i5);
        super.M(eVar, i4, i5);
    }

    @Override // org.jboss.netty.buffer.e
    public e N(int i4, int i5) {
        l lVar = new l(order(), Math.max(i5, 64), factory());
        lVar.f72488h = this.f72488h.N(i4, i5);
        lVar.r0(0, i5);
        return lVar;
    }

    @Override // org.jboss.netty.buffer.e
    public ByteBuffer T(int i4, int i5) {
        return this.f72488h.T(i4, i5);
    }

    @Override // org.jboss.netty.buffer.e
    public void V(int i4, int i5) {
        this.f72488h.V(i4, i5);
    }

    @Override // org.jboss.netty.buffer.e
    public void X(int i4, byte[] bArr, int i5, int i6) {
        this.f72488h.X(i4, bArr, i5, i6);
    }

    @Override // org.jboss.netty.buffer.e
    public void Z(int i4, int i5) {
        this.f72488h.Z(i4, i5);
    }

    @Override // org.jboss.netty.buffer.e
    public e a(int i4, int i5) {
        if (i4 == 0) {
            if (i5 == 0) {
                return h.f72468c;
            }
            return new r(this, i5);
        } else if (i5 == 0) {
            return h.f72468c;
        } else {
            return new q(this, i4, i5);
        }
    }

    @Override // org.jboss.netty.buffer.e
    public byte[] array() {
        return this.f72488h.array();
    }

    @Override // org.jboss.netty.buffer.e
    public int arrayOffset() {
        return this.f72488h.arrayOffset();
    }

    @Override // org.jboss.netty.buffer.a, org.jboss.netty.buffer.e
    public void b0(byte[] bArr, int i4, int i5) {
        B0(i5);
        super.b0(bArr, i4, i5);
    }

    @Override // org.jboss.netty.buffer.e
    public int capacity() {
        return this.f72488h.capacity();
    }

    @Override // org.jboss.netty.buffer.e
    public e duplicate() {
        return new k(this);
    }

    @Override // org.jboss.netty.buffer.e
    public f factory() {
        return this.f72486f;
    }

    @Override // org.jboss.netty.buffer.e
    public byte getByte(int i4) {
        return this.f72488h.getByte(i4);
    }

    @Override // org.jboss.netty.buffer.e
    public int getBytes(int i4, GatheringByteChannel gatheringByteChannel, int i5) throws IOException {
        return this.f72488h.getBytes(i4, gatheringByteChannel, i5);
    }

    @Override // org.jboss.netty.buffer.e
    public int getInt(int i4) {
        return this.f72488h.getInt(i4);
    }

    @Override // org.jboss.netty.buffer.e
    public long getLong(int i4) {
        return this.f72488h.getLong(i4);
    }

    @Override // org.jboss.netty.buffer.e
    public short getShort(int i4) {
        return this.f72488h.getShort(i4);
    }

    @Override // org.jboss.netty.buffer.e
    public int getUnsignedMedium(int i4) {
        return this.f72488h.getUnsignedMedium(i4);
    }

    @Override // org.jboss.netty.buffer.e
    public boolean hasArray() {
        return this.f72488h.hasArray();
    }

    @Override // org.jboss.netty.buffer.e
    public boolean isDirect() {
        return this.f72488h.isDirect();
    }

    @Override // org.jboss.netty.buffer.a, org.jboss.netty.buffer.e
    public void j0(int i4) {
        B0(i4);
        super.j0(i4);
    }

    @Override // org.jboss.netty.buffer.e
    public void m0(int i4, e eVar, int i5, int i6) {
        this.f72488h.m0(i4, eVar, i5, i6);
    }

    @Override // org.jboss.netty.buffer.a, org.jboss.netty.buffer.e
    public void o0(int i4) {
        B0(3);
        super.o0(i4);
    }

    @Override // org.jboss.netty.buffer.e
    public ByteOrder order() {
        return this.f72487g;
    }

    @Override // org.jboss.netty.buffer.e
    public void q0(int i4, int i5) {
        this.f72488h.q0(i4, i5);
    }

    @Override // org.jboss.netty.buffer.e
    public void s(int i4, byte[] bArr, int i5, int i6) {
        this.f72488h.s(i4, bArr, i5, i6);
    }

    @Override // org.jboss.netty.buffer.e
    public int setBytes(int i4, InputStream inputStream, int i5) throws IOException {
        return this.f72488h.setBytes(i4, inputStream, i5);
    }

    @Override // org.jboss.netty.buffer.e
    public void setInt(int i4, int i5) {
        this.f72488h.setInt(i4, i5);
    }

    @Override // org.jboss.netty.buffer.e
    public void setLong(int i4, long j4) {
        this.f72488h.setLong(i4, j4);
    }

    @Override // org.jboss.netty.buffer.e
    public void v0(int i4, ByteBuffer byteBuffer) {
        this.f72488h.v0(i4, byteBuffer);
    }

    @Override // org.jboss.netty.buffer.a, org.jboss.netty.buffer.e
    public void writeByte(int i4) {
        B0(1);
        super.writeByte(i4);
    }

    @Override // org.jboss.netty.buffer.a, org.jboss.netty.buffer.e
    public int writeBytes(InputStream inputStream, int i4) throws IOException {
        B0(i4);
        return super.writeBytes(inputStream, i4);
    }

    @Override // org.jboss.netty.buffer.a, org.jboss.netty.buffer.e
    public void writeInt(int i4) {
        B0(4);
        super.writeInt(i4);
    }

    @Override // org.jboss.netty.buffer.a, org.jboss.netty.buffer.e
    public void writeLong(long j4) {
        B0(8);
        super.writeLong(j4);
    }

    @Override // org.jboss.netty.buffer.a, org.jboss.netty.buffer.e
    public void writeShort(int i4) {
        B0(2);
        super.writeShort(i4);
    }

    @Override // org.jboss.netty.buffer.e
    public void y(int i4, e eVar, int i5, int i6) {
        this.f72488h.y(i4, eVar, i5, i6);
    }

    @Override // org.jboss.netty.buffer.a, org.jboss.netty.buffer.e
    public void z0(ByteBuffer byteBuffer) {
        B0(byteBuffer.remaining());
        super.z0(byteBuffer);
    }

    public l(ByteOrder byteOrder, int i4) {
        this(byteOrder, i4, n.h(byteOrder));
    }

    @Override // org.jboss.netty.buffer.e
    public int setBytes(int i4, ScatteringByteChannel scatteringByteChannel, int i5) throws IOException {
        return this.f72488h.setBytes(i4, scatteringByteChannel, i5);
    }

    public l(ByteOrder byteOrder, int i4, f fVar) {
        if (i4 >= 0) {
            Objects.requireNonNull(byteOrder, "endianness");
            Objects.requireNonNull(fVar, "factory");
            this.f72486f = fVar;
            this.f72487g = byteOrder;
            this.f72488h = fVar.f(order(), i4);
            return;
        }
        throw new IllegalArgumentException("estimatedLength: " + i4);
    }

    @Override // org.jboss.netty.buffer.a, org.jboss.netty.buffer.e
    public int writeBytes(ScatteringByteChannel scatteringByteChannel, int i4) throws IOException {
        B0(i4);
        return super.writeBytes(scatteringByteChannel, i4);
    }
}
