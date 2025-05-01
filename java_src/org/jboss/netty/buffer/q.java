package org.jboss.netty.buffer;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.GatheringByteChannel;
import java.nio.channels.ScatteringByteChannel;
/* compiled from: SlicedChannelBuffer.java */
/* loaded from: classes7.dex */
public class q extends a implements s {

    /* renamed from: f  reason: collision with root package name */
    private final e f72493f;

    /* renamed from: g  reason: collision with root package name */
    private final int f72494g;

    /* renamed from: h  reason: collision with root package name */
    private final int f72495h;

    public q(e eVar, int i4, int i5) {
        if (i4 >= 0 && i4 <= eVar.capacity()) {
            int i6 = i4 + i5;
            if (i6 <= eVar.capacity()) {
                this.f72493f = eVar;
                this.f72494g = i4;
                this.f72495h = i5;
                u0(i5);
                return;
            }
            throw new IndexOutOfBoundsException("Invalid combined index of " + i6 + ", maximum is " + eVar.capacity());
        }
        throw new IndexOutOfBoundsException("Invalid index of " + i4 + ", maximum is " + eVar.capacity());
    }

    private void e(int i4) {
        if (i4 < 0 || i4 >= capacity()) {
            throw new IndexOutOfBoundsException("Invalid index: " + i4 + ", maximum is " + capacity());
        }
    }

    private void f(int i4, int i5) {
        if (i5 < 0) {
            throw new IllegalArgumentException("length is negative: " + i5);
        } else if (i4 >= 0) {
            int i6 = i4 + i5;
            if (i6 <= capacity()) {
                return;
            }
            throw new IndexOutOfBoundsException("Index too big - Bytes needed: " + i6 + ", maximum is " + capacity());
        } else {
            throw new IndexOutOfBoundsException("startIndex cannot be negative");
        }
    }

    @Override // org.jboss.netty.buffer.s
    public e A() {
        return this.f72493f;
    }

    @Override // org.jboss.netty.buffer.e
    public void F(int i4, OutputStream outputStream, int i5) throws IOException {
        f(i4, i5);
        this.f72493f.F(i4 + this.f72494g, outputStream, i5);
    }

    @Override // org.jboss.netty.buffer.e
    public void F0(int i4, ByteBuffer byteBuffer) {
        f(i4, byteBuffer.remaining());
        this.f72493f.F0(i4 + this.f72494g, byteBuffer);
    }

    @Override // org.jboss.netty.buffer.e
    public e N(int i4, int i5) {
        f(i4, i5);
        return this.f72493f.N(i4 + this.f72494g, i5);
    }

    @Override // org.jboss.netty.buffer.e
    public ByteBuffer T(int i4, int i5) {
        f(i4, i5);
        return this.f72493f.T(i4 + this.f72494g, i5);
    }

    @Override // org.jboss.netty.buffer.e
    public void V(int i4, int i5) {
        e(i4);
        this.f72493f.V(i4 + this.f72494g, i5);
    }

    @Override // org.jboss.netty.buffer.e
    public void X(int i4, byte[] bArr, int i5, int i6) {
        f(i4, i6);
        this.f72493f.X(i4 + this.f72494g, bArr, i5, i6);
    }

    @Override // org.jboss.netty.buffer.e
    public void Z(int i4, int i5) {
        f(i4, 3);
        this.f72493f.Z(i4 + this.f72494g, i5);
    }

    @Override // org.jboss.netty.buffer.e
    public e a(int i4, int i5) {
        f(i4, i5);
        if (i5 == 0) {
            return h.f72468c;
        }
        return new q(this.f72493f, i4 + this.f72494g, i5);
    }

    @Override // org.jboss.netty.buffer.e
    public byte[] array() {
        return this.f72493f.array();
    }

    @Override // org.jboss.netty.buffer.e
    public int arrayOffset() {
        return this.f72493f.arrayOffset() + this.f72494g;
    }

    @Override // org.jboss.netty.buffer.e
    public int capacity() {
        return this.f72495h;
    }

    @Override // org.jboss.netty.buffer.e
    public e duplicate() {
        q qVar = new q(this.f72493f, this.f72494g, this.f72495h);
        qVar.r0(readerIndex(), writerIndex());
        return qVar;
    }

    @Override // org.jboss.netty.buffer.e
    public f factory() {
        return this.f72493f.factory();
    }

    @Override // org.jboss.netty.buffer.e
    public byte getByte(int i4) {
        e(i4);
        return this.f72493f.getByte(i4 + this.f72494g);
    }

    @Override // org.jboss.netty.buffer.e
    public int getBytes(int i4, GatheringByteChannel gatheringByteChannel, int i5) throws IOException {
        f(i4, i5);
        return this.f72493f.getBytes(i4 + this.f72494g, gatheringByteChannel, i5);
    }

    @Override // org.jboss.netty.buffer.e
    public int getInt(int i4) {
        f(i4, 4);
        return this.f72493f.getInt(i4 + this.f72494g);
    }

    @Override // org.jboss.netty.buffer.e
    public long getLong(int i4) {
        f(i4, 8);
        return this.f72493f.getLong(i4 + this.f72494g);
    }

    @Override // org.jboss.netty.buffer.e
    public short getShort(int i4) {
        f(i4, 2);
        return this.f72493f.getShort(i4 + this.f72494g);
    }

    @Override // org.jboss.netty.buffer.e
    public int getUnsignedMedium(int i4) {
        f(i4, 3);
        return this.f72493f.getUnsignedMedium(i4 + this.f72494g);
    }

    @Override // org.jboss.netty.buffer.e
    public boolean hasArray() {
        return this.f72493f.hasArray();
    }

    @Override // org.jboss.netty.buffer.e
    public boolean isDirect() {
        return this.f72493f.isDirect();
    }

    @Override // org.jboss.netty.buffer.e
    public void m0(int i4, e eVar, int i5, int i6) {
        f(i4, i6);
        this.f72493f.m0(i4 + this.f72494g, eVar, i5, i6);
    }

    @Override // org.jboss.netty.buffer.e
    public ByteOrder order() {
        return this.f72493f.order();
    }

    @Override // org.jboss.netty.buffer.e
    public void q0(int i4, int i5) {
        f(i4, 2);
        this.f72493f.q0(i4 + this.f72494g, i5);
    }

    @Override // org.jboss.netty.buffer.e
    public void s(int i4, byte[] bArr, int i5, int i6) {
        f(i4, i6);
        this.f72493f.s(i4 + this.f72494g, bArr, i5, i6);
    }

    @Override // org.jboss.netty.buffer.e
    public int setBytes(int i4, InputStream inputStream, int i5) throws IOException {
        f(i4, i5);
        return this.f72493f.setBytes(i4 + this.f72494g, inputStream, i5);
    }

    @Override // org.jboss.netty.buffer.e
    public void setInt(int i4, int i5) {
        f(i4, 4);
        this.f72493f.setInt(i4 + this.f72494g, i5);
    }

    @Override // org.jboss.netty.buffer.e
    public void setLong(int i4, long j4) {
        f(i4, 8);
        this.f72493f.setLong(i4 + this.f72494g, j4);
    }

    @Override // org.jboss.netty.buffer.e
    public void v0(int i4, ByteBuffer byteBuffer) {
        f(i4, byteBuffer.remaining());
        this.f72493f.v0(i4 + this.f72494g, byteBuffer);
    }

    @Override // org.jboss.netty.buffer.e
    public void y(int i4, e eVar, int i5, int i6) {
        f(i4, i6);
        this.f72493f.y(i4 + this.f72494g, eVar, i5, i6);
    }

    @Override // org.jboss.netty.buffer.e
    public int setBytes(int i4, ScatteringByteChannel scatteringByteChannel, int i5) throws IOException {
        f(i4, i5);
        return this.f72493f.setBytes(i4 + this.f72494g, scatteringByteChannel, i5);
    }
}
