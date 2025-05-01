package org.jboss.netty.buffer;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.GatheringByteChannel;
import java.util.Objects;
/* compiled from: HeapChannelBuffer.java */
/* loaded from: classes7.dex */
public abstract class m extends a {

    /* renamed from: f  reason: collision with root package name */
    protected final byte[] f72489f;

    /* JADX INFO: Access modifiers changed from: protected */
    public m(int i4) {
        this(new byte[i4], 0, 0);
    }

    @Override // org.jboss.netty.buffer.e
    public void F(int i4, OutputStream outputStream, int i5) throws IOException {
        outputStream.write(this.f72489f, i4, i5);
    }

    @Override // org.jboss.netty.buffer.e
    public void F0(int i4, ByteBuffer byteBuffer) {
        byteBuffer.get(this.f72489f, i4, byteBuffer.remaining());
    }

    @Override // org.jboss.netty.buffer.e
    public ByteBuffer T(int i4, int i5) {
        return ByteBuffer.wrap(this.f72489f, i4, i5).order(order());
    }

    @Override // org.jboss.netty.buffer.e
    public void V(int i4, int i5) {
        this.f72489f[i4] = (byte) i5;
    }

    @Override // org.jboss.netty.buffer.e
    public void X(int i4, byte[] bArr, int i5, int i6) {
        System.arraycopy(this.f72489f, i4, bArr, i5, i6);
    }

    @Override // org.jboss.netty.buffer.e
    public e a(int i4, int i5) {
        if (i4 != 0) {
            if (i5 == 0) {
                return h.f72468c;
            }
            return new q(this, i4, i5);
        } else if (i5 == 0) {
            return h.f72468c;
        } else {
            if (i5 == this.f72489f.length) {
                e duplicate = duplicate();
                duplicate.r0(0, i5);
                return duplicate;
            }
            return new r(this, i5);
        }
    }

    @Override // org.jboss.netty.buffer.e
    public byte[] array() {
        return this.f72489f;
    }

    @Override // org.jboss.netty.buffer.e
    public int arrayOffset() {
        return 0;
    }

    @Override // org.jboss.netty.buffer.e
    public int capacity() {
        return this.f72489f.length;
    }

    @Override // org.jboss.netty.buffer.e
    public byte getByte(int i4) {
        return this.f72489f[i4];
    }

    @Override // org.jboss.netty.buffer.e
    public int getBytes(int i4, GatheringByteChannel gatheringByteChannel, int i5) throws IOException {
        return gatheringByteChannel.write(ByteBuffer.wrap(this.f72489f, i4, i5));
    }

    @Override // org.jboss.netty.buffer.e
    public boolean hasArray() {
        return true;
    }

    @Override // org.jboss.netty.buffer.e
    public boolean isDirect() {
        return false;
    }

    @Override // org.jboss.netty.buffer.e
    public void m0(int i4, e eVar, int i5, int i6) {
        if (eVar instanceof m) {
            X(i4, ((m) eVar).f72489f, i5, i6);
        } else {
            eVar.s(i5, this.f72489f, i4, i6);
        }
    }

    @Override // org.jboss.netty.buffer.e
    public void s(int i4, byte[] bArr, int i5, int i6) {
        System.arraycopy(bArr, i5, this.f72489f, i4, i6);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0012, code lost:
        return r0;
     */
    @Override // org.jboss.netty.buffer.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int setBytes(int r3, java.io.InputStream r4, int r5) throws java.io.IOException {
        /*
            r2 = this;
            r0 = 0
        L1:
            byte[] r1 = r2.f72489f
            int r1 = r4.read(r1, r3, r5)
            if (r1 >= 0) goto Ld
            if (r0 != 0) goto L12
            r3 = -1
            return r3
        Ld:
            int r0 = r0 + r1
            int r3 = r3 + r1
            int r5 = r5 - r1
            if (r5 > 0) goto L1
        L12:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jboss.netty.buffer.m.setBytes(int, java.io.InputStream, int):int");
    }

    @Override // org.jboss.netty.buffer.e
    public void v0(int i4, ByteBuffer byteBuffer) {
        byteBuffer.put(this.f72489f, i4, Math.min(capacity() - i4, byteBuffer.remaining()));
    }

    @Override // org.jboss.netty.buffer.e
    public void y(int i4, e eVar, int i5, int i6) {
        if (eVar instanceof m) {
            s(i4, ((m) eVar).f72489f, i5, i6);
        } else {
            eVar.X(i5, this.f72489f, i4, i6);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public m(byte[] bArr) {
        this(bArr, 0, bArr.length);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0019, code lost:
        return r0;
     */
    @Override // org.jboss.netty.buffer.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int setBytes(int r4, java.nio.channels.ScatteringByteChannel r5, int r6) throws java.io.IOException {
        /*
            r3 = this;
            byte[] r0 = r3.f72489f
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.wrap(r0, r4, r6)
            r0 = 0
        L7:
            r1 = -1
            int r2 = r5.read(r4)     // Catch: java.nio.channels.ClosedChannelException -> Ld
            goto Le
        Ld:
            r2 = -1
        Le:
            if (r2 >= 0) goto L13
            if (r0 != 0) goto L19
            return r1
        L13:
            if (r2 != 0) goto L16
            goto L19
        L16:
            int r0 = r0 + r2
            if (r0 < r6) goto L7
        L19:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jboss.netty.buffer.m.setBytes(int, java.nio.channels.ScatteringByteChannel, int):int");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public m(byte[] bArr, int i4, int i5) {
        Objects.requireNonNull(bArr, "array");
        this.f72489f = bArr;
        r0(i4, i5);
    }
}
