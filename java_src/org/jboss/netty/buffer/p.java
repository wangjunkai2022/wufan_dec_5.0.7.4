package org.jboss.netty.buffer;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;
import java.nio.channels.GatheringByteChannel;
import java.nio.channels.ScatteringByteChannel;
import java.util.Objects;
/* compiled from: ReadOnlyChannelBuffer.java */
/* loaded from: classes7.dex */
public class p extends a implements s {

    /* renamed from: f  reason: collision with root package name */
    private final e f72492f;

    public p(e eVar) {
        Objects.requireNonNull(eVar, "buffer");
        this.f72492f = eVar;
        r0(eVar.readerIndex(), eVar.writerIndex());
    }

    @Override // org.jboss.netty.buffer.s
    public e A() {
        return this.f72492f;
    }

    @Override // org.jboss.netty.buffer.e
    public void F(int i4, OutputStream outputStream, int i5) throws IOException {
        this.f72492f.F(i4, outputStream, i5);
    }

    @Override // org.jboss.netty.buffer.e
    public void F0(int i4, ByteBuffer byteBuffer) {
        throw new ReadOnlyBufferException();
    }

    @Override // org.jboss.netty.buffer.e
    public e N(int i4, int i5) {
        return this.f72492f.N(i4, i5);
    }

    @Override // org.jboss.netty.buffer.e
    public ByteBuffer T(int i4, int i5) {
        return this.f72492f.T(i4, i5).asReadOnlyBuffer();
    }

    @Override // org.jboss.netty.buffer.e
    public void V(int i4, int i5) {
        throw new ReadOnlyBufferException();
    }

    @Override // org.jboss.netty.buffer.e
    public void X(int i4, byte[] bArr, int i5, int i6) {
        this.f72492f.X(i4, bArr, i5, i6);
    }

    @Override // org.jboss.netty.buffer.a, org.jboss.netty.buffer.e
    public ByteBuffer[] Y(int i4, int i5) {
        ByteBuffer[] Y = this.f72492f.Y(i4, i5);
        for (int i6 = 0; i6 < Y.length; i6++) {
            Y[i6] = Y[i6].asReadOnlyBuffer();
        }
        return Y;
    }

    @Override // org.jboss.netty.buffer.e
    public void Z(int i4, int i5) {
        throw new ReadOnlyBufferException();
    }

    @Override // org.jboss.netty.buffer.e
    public e a(int i4, int i5) {
        return new p(this.f72492f.a(i4, i5));
    }

    @Override // org.jboss.netty.buffer.e
    public byte[] array() {
        throw new ReadOnlyBufferException();
    }

    @Override // org.jboss.netty.buffer.e
    public int arrayOffset() {
        throw new ReadOnlyBufferException();
    }

    @Override // org.jboss.netty.buffer.e
    public int capacity() {
        return this.f72492f.capacity();
    }

    @Override // org.jboss.netty.buffer.e
    public e duplicate() {
        return new p(this);
    }

    @Override // org.jboss.netty.buffer.e
    public f factory() {
        return this.f72492f.factory();
    }

    @Override // org.jboss.netty.buffer.e
    public byte getByte(int i4) {
        return this.f72492f.getByte(i4);
    }

    @Override // org.jboss.netty.buffer.e
    public int getBytes(int i4, GatheringByteChannel gatheringByteChannel, int i5) throws IOException {
        return this.f72492f.getBytes(i4, gatheringByteChannel, i5);
    }

    @Override // org.jboss.netty.buffer.e
    public int getInt(int i4) {
        return this.f72492f.getInt(i4);
    }

    @Override // org.jboss.netty.buffer.e
    public long getLong(int i4) {
        return this.f72492f.getLong(i4);
    }

    @Override // org.jboss.netty.buffer.e
    public short getShort(int i4) {
        return this.f72492f.getShort(i4);
    }

    @Override // org.jboss.netty.buffer.e
    public int getUnsignedMedium(int i4) {
        return this.f72492f.getUnsignedMedium(i4);
    }

    @Override // org.jboss.netty.buffer.e
    public boolean hasArray() {
        return false;
    }

    @Override // org.jboss.netty.buffer.e
    public boolean isDirect() {
        return this.f72492f.isDirect();
    }

    @Override // org.jboss.netty.buffer.e
    public void m0(int i4, e eVar, int i5, int i6) {
        this.f72492f.m0(i4, eVar, i5, i6);
    }

    @Override // org.jboss.netty.buffer.a, org.jboss.netty.buffer.e
    public void n() {
        throw new ReadOnlyBufferException();
    }

    @Override // org.jboss.netty.buffer.e
    public ByteOrder order() {
        return this.f72492f.order();
    }

    @Override // org.jboss.netty.buffer.e
    public void q0(int i4, int i5) {
        throw new ReadOnlyBufferException();
    }

    @Override // org.jboss.netty.buffer.e
    public void s(int i4, byte[] bArr, int i5, int i6) {
        throw new ReadOnlyBufferException();
    }

    @Override // org.jboss.netty.buffer.e
    public int setBytes(int i4, InputStream inputStream, int i5) throws IOException {
        throw new ReadOnlyBufferException();
    }

    @Override // org.jboss.netty.buffer.e
    public void setInt(int i4, int i5) {
        throw new ReadOnlyBufferException();
    }

    @Override // org.jboss.netty.buffer.e
    public void setLong(int i4, long j4) {
        throw new ReadOnlyBufferException();
    }

    @Override // org.jboss.netty.buffer.e
    public void v0(int i4, ByteBuffer byteBuffer) {
        this.f72492f.v0(i4, byteBuffer);
    }

    @Override // org.jboss.netty.buffer.e
    public void y(int i4, e eVar, int i5, int i6) {
        throw new ReadOnlyBufferException();
    }

    @Override // org.jboss.netty.buffer.e
    public int setBytes(int i4, ScatteringByteChannel scatteringByteChannel, int i5) throws IOException {
        throw new ReadOnlyBufferException();
    }

    private p(p pVar) {
        this.f72492f = pVar.f72492f;
        r0(pVar.readerIndex(), pVar.writerIndex());
    }
}
