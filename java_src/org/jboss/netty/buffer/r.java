package org.jboss.netty.buffer;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.GatheringByteChannel;
import java.nio.channels.ScatteringByteChannel;
/* compiled from: TruncatedChannelBuffer.java */
/* loaded from: classes7.dex */
public class r extends a implements s {

    /* renamed from: f  reason: collision with root package name */
    private final e f72496f;

    /* renamed from: g  reason: collision with root package name */
    private final int f72497g;

    public r(e eVar, int i4) {
        if (i4 <= eVar.capacity()) {
            this.f72496f = eVar;
            this.f72497g = i4;
            u0(i4);
            return;
        }
        throw new IndexOutOfBoundsException("Length is too large, got " + i4 + " but can't go higher than " + eVar.capacity());
    }

    private void e(int i4) {
        if (i4 < 0 || i4 >= capacity()) {
            throw new IndexOutOfBoundsException("Invalid index of " + i4 + ", maximum is " + capacity());
        }
    }

    private void f(int i4, int i5) {
        if (i5 >= 0) {
            int i6 = i4 + i5;
            if (i6 <= capacity()) {
                return;
            }
            throw new IndexOutOfBoundsException("Invalid index of " + i6 + ", maximum is " + capacity());
        }
        throw new IllegalArgumentException("length is negative: " + i5);
    }

    @Override // org.jboss.netty.buffer.s
    public e A() {
        return this.f72496f;
    }

    @Override // org.jboss.netty.buffer.e
    public void F(int i4, OutputStream outputStream, int i5) throws IOException {
        f(i4, i5);
        this.f72496f.F(i4, outputStream, i5);
    }

    @Override // org.jboss.netty.buffer.e
    public void F0(int i4, ByteBuffer byteBuffer) {
        f(i4, byteBuffer.remaining());
        this.f72496f.F0(i4, byteBuffer);
    }

    @Override // org.jboss.netty.buffer.e
    public e N(int i4, int i5) {
        f(i4, i5);
        return this.f72496f.N(i4, i5);
    }

    @Override // org.jboss.netty.buffer.e
    public ByteBuffer T(int i4, int i5) {
        f(i4, i5);
        return this.f72496f.T(i4, i5);
    }

    @Override // org.jboss.netty.buffer.e
    public void V(int i4, int i5) {
        e(i4);
        this.f72496f.V(i4, i5);
    }

    @Override // org.jboss.netty.buffer.e
    public void X(int i4, byte[] bArr, int i5, int i6) {
        f(i4, i6);
        this.f72496f.X(i4, bArr, i5, i6);
    }

    @Override // org.jboss.netty.buffer.e
    public void Z(int i4, int i5) {
        f(i4, 3);
        this.f72496f.Z(i4, i5);
    }

    @Override // org.jboss.netty.buffer.e
    public e a(int i4, int i5) {
        f(i4, i5);
        if (i5 == 0) {
            return h.f72468c;
        }
        return this.f72496f.a(i4, i5);
    }

    @Override // org.jboss.netty.buffer.e
    public byte[] array() {
        return this.f72496f.array();
    }

    @Override // org.jboss.netty.buffer.e
    public int arrayOffset() {
        return this.f72496f.arrayOffset();
    }

    @Override // org.jboss.netty.buffer.e
    public int capacity() {
        return this.f72497g;
    }

    @Override // org.jboss.netty.buffer.e
    public e duplicate() {
        r rVar = new r(this.f72496f, this.f72497g);
        rVar.r0(readerIndex(), writerIndex());
        return rVar;
    }

    @Override // org.jboss.netty.buffer.e
    public f factory() {
        return this.f72496f.factory();
    }

    @Override // org.jboss.netty.buffer.e
    public byte getByte(int i4) {
        e(i4);
        return this.f72496f.getByte(i4);
    }

    @Override // org.jboss.netty.buffer.e
    public int getBytes(int i4, GatheringByteChannel gatheringByteChannel, int i5) throws IOException {
        f(i4, i5);
        return this.f72496f.getBytes(i4, gatheringByteChannel, i5);
    }

    @Override // org.jboss.netty.buffer.e
    public int getInt(int i4) {
        f(i4, 4);
        return this.f72496f.getInt(i4);
    }

    @Override // org.jboss.netty.buffer.e
    public long getLong(int i4) {
        f(i4, 8);
        return this.f72496f.getLong(i4);
    }

    @Override // org.jboss.netty.buffer.e
    public short getShort(int i4) {
        f(i4, 2);
        return this.f72496f.getShort(i4);
    }

    @Override // org.jboss.netty.buffer.e
    public int getUnsignedMedium(int i4) {
        f(i4, 3);
        return this.f72496f.getUnsignedMedium(i4);
    }

    @Override // org.jboss.netty.buffer.e
    public boolean hasArray() {
        return this.f72496f.hasArray();
    }

    @Override // org.jboss.netty.buffer.e
    public boolean isDirect() {
        return this.f72496f.isDirect();
    }

    @Override // org.jboss.netty.buffer.e
    public void m0(int i4, e eVar, int i5, int i6) {
        f(i4, i6);
        this.f72496f.m0(i4, eVar, i5, i6);
    }

    @Override // org.jboss.netty.buffer.e
    public ByteOrder order() {
        return this.f72496f.order();
    }

    @Override // org.jboss.netty.buffer.e
    public void q0(int i4, int i5) {
        f(i4, 2);
        this.f72496f.q0(i4, i5);
    }

    @Override // org.jboss.netty.buffer.e
    public void s(int i4, byte[] bArr, int i5, int i6) {
        f(i4, i6);
        this.f72496f.s(i4, bArr, i5, i6);
    }

    @Override // org.jboss.netty.buffer.e
    public int setBytes(int i4, InputStream inputStream, int i5) throws IOException {
        f(i4, i5);
        return this.f72496f.setBytes(i4, inputStream, i5);
    }

    @Override // org.jboss.netty.buffer.e
    public void setInt(int i4, int i5) {
        f(i4, 4);
        this.f72496f.setInt(i4, i5);
    }

    @Override // org.jboss.netty.buffer.e
    public void setLong(int i4, long j4) {
        f(i4, 8);
        this.f72496f.setLong(i4, j4);
    }

    @Override // org.jboss.netty.buffer.e
    public void v0(int i4, ByteBuffer byteBuffer) {
        f(i4, byteBuffer.remaining());
        this.f72496f.v0(i4, byteBuffer);
    }

    @Override // org.jboss.netty.buffer.e
    public void y(int i4, e eVar, int i5, int i6) {
        f(i4, i6);
        this.f72496f.y(i4, eVar, i5, i6);
    }

    @Override // org.jboss.netty.buffer.e
    public int setBytes(int i4, ScatteringByteChannel scatteringByteChannel, int i5) throws IOException {
        f(i4, i5);
        return this.f72496f.setBytes(i4, scatteringByteChannel, i5);
    }
}
