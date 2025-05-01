package org.jboss.netty.buffer;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.GatheringByteChannel;
import java.nio.channels.ScatteringByteChannel;
import java.util.Objects;
/* compiled from: DuplicatedChannelBuffer.java */
/* loaded from: classes7.dex */
public class k extends a implements s {

    /* renamed from: f  reason: collision with root package name */
    private final e f72485f;

    public k(e eVar) {
        Objects.requireNonNull(eVar, "buffer");
        this.f72485f = eVar;
        r0(eVar.readerIndex(), eVar.writerIndex());
    }

    @Override // org.jboss.netty.buffer.s
    public e A() {
        return this.f72485f;
    }

    @Override // org.jboss.netty.buffer.e
    public void F(int i4, OutputStream outputStream, int i5) throws IOException {
        this.f72485f.F(i4, outputStream, i5);
    }

    @Override // org.jboss.netty.buffer.e
    public void F0(int i4, ByteBuffer byteBuffer) {
        this.f72485f.F0(i4, byteBuffer);
    }

    @Override // org.jboss.netty.buffer.e
    public e N(int i4, int i5) {
        return this.f72485f.N(i4, i5);
    }

    @Override // org.jboss.netty.buffer.e
    public ByteBuffer T(int i4, int i5) {
        return this.f72485f.T(i4, i5);
    }

    @Override // org.jboss.netty.buffer.e
    public void V(int i4, int i5) {
        this.f72485f.V(i4, i5);
    }

    @Override // org.jboss.netty.buffer.e
    public void X(int i4, byte[] bArr, int i5, int i6) {
        this.f72485f.X(i4, bArr, i5, i6);
    }

    @Override // org.jboss.netty.buffer.e
    public void Z(int i4, int i5) {
        this.f72485f.Z(i4, i5);
    }

    @Override // org.jboss.netty.buffer.e
    public e a(int i4, int i5) {
        return this.f72485f.a(i4, i5);
    }

    @Override // org.jboss.netty.buffer.e
    public byte[] array() {
        return this.f72485f.array();
    }

    @Override // org.jboss.netty.buffer.e
    public int arrayOffset() {
        return this.f72485f.arrayOffset();
    }

    @Override // org.jboss.netty.buffer.e
    public int capacity() {
        return this.f72485f.capacity();
    }

    @Override // org.jboss.netty.buffer.e
    public e duplicate() {
        return new k(this);
    }

    @Override // org.jboss.netty.buffer.e
    public f factory() {
        return this.f72485f.factory();
    }

    @Override // org.jboss.netty.buffer.e
    public byte getByte(int i4) {
        return this.f72485f.getByte(i4);
    }

    @Override // org.jboss.netty.buffer.e
    public int getBytes(int i4, GatheringByteChannel gatheringByteChannel, int i5) throws IOException {
        return this.f72485f.getBytes(i4, gatheringByteChannel, i5);
    }

    @Override // org.jboss.netty.buffer.e
    public int getInt(int i4) {
        return this.f72485f.getInt(i4);
    }

    @Override // org.jboss.netty.buffer.e
    public long getLong(int i4) {
        return this.f72485f.getLong(i4);
    }

    @Override // org.jboss.netty.buffer.e
    public short getShort(int i4) {
        return this.f72485f.getShort(i4);
    }

    @Override // org.jboss.netty.buffer.e
    public int getUnsignedMedium(int i4) {
        return this.f72485f.getUnsignedMedium(i4);
    }

    @Override // org.jboss.netty.buffer.e
    public boolean hasArray() {
        return this.f72485f.hasArray();
    }

    @Override // org.jboss.netty.buffer.e
    public boolean isDirect() {
        return this.f72485f.isDirect();
    }

    @Override // org.jboss.netty.buffer.e
    public void m0(int i4, e eVar, int i5, int i6) {
        this.f72485f.m0(i4, eVar, i5, i6);
    }

    @Override // org.jboss.netty.buffer.e
    public ByteOrder order() {
        return this.f72485f.order();
    }

    @Override // org.jboss.netty.buffer.e
    public void q0(int i4, int i5) {
        this.f72485f.q0(i4, i5);
    }

    @Override // org.jboss.netty.buffer.e
    public void s(int i4, byte[] bArr, int i5, int i6) {
        this.f72485f.s(i4, bArr, i5, i6);
    }

    @Override // org.jboss.netty.buffer.e
    public int setBytes(int i4, InputStream inputStream, int i5) throws IOException {
        return this.f72485f.setBytes(i4, inputStream, i5);
    }

    @Override // org.jboss.netty.buffer.e
    public void setInt(int i4, int i5) {
        this.f72485f.setInt(i4, i5);
    }

    @Override // org.jboss.netty.buffer.e
    public void setLong(int i4, long j4) {
        this.f72485f.setLong(i4, j4);
    }

    @Override // org.jboss.netty.buffer.e
    public void v0(int i4, ByteBuffer byteBuffer) {
        this.f72485f.v0(i4, byteBuffer);
    }

    @Override // org.jboss.netty.buffer.e
    public void y(int i4, e eVar, int i5, int i6) {
        this.f72485f.y(i4, eVar, i5, i6);
    }

    @Override // org.jboss.netty.buffer.e
    public int setBytes(int i4, ScatteringByteChannel scatteringByteChannel, int i5) throws IOException {
        return this.f72485f.setBytes(i4, scatteringByteChannel, i5);
    }

    private k(k kVar) {
        this.f72485f = kVar.f72485f;
        r0(kVar.readerIndex(), kVar.writerIndex());
    }
}
