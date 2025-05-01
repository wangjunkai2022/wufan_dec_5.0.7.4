package org.jboss.netty.buffer;

import java.nio.ByteOrder;
/* compiled from: LittleEndianHeapChannelBuffer.java */
/* loaded from: classes7.dex */
public class o extends m {
    public o(int i4) {
        super(i4);
    }

    @Override // org.jboss.netty.buffer.e
    public e N(int i4, int i5) {
        if (i4 >= 0 && i5 >= 0) {
            int i6 = i4 + i5;
            byte[] bArr = this.f72489f;
            if (i6 <= bArr.length) {
                byte[] bArr2 = new byte[i5];
                System.arraycopy(bArr, i4, bArr2, 0, i5);
                return new o(bArr2);
            }
        }
        throw new IndexOutOfBoundsException("Too many bytes to copy - Need " + (i4 + i5) + ", maximum is " + this.f72489f.length);
    }

    @Override // org.jboss.netty.buffer.e
    public void Z(int i4, int i5) {
        byte[] bArr = this.f72489f;
        bArr[i4] = (byte) i5;
        bArr[i4 + 1] = (byte) (i5 >>> 8);
        bArr[i4 + 2] = (byte) (i5 >>> 16);
    }

    @Override // org.jboss.netty.buffer.e
    public e duplicate() {
        return new o(this.f72489f, readerIndex(), writerIndex());
    }

    @Override // org.jboss.netty.buffer.e
    public f factory() {
        return n.h(ByteOrder.LITTLE_ENDIAN);
    }

    @Override // org.jboss.netty.buffer.e
    public int getInt(int i4) {
        byte[] bArr = this.f72489f;
        return ((bArr[i4 + 3] & 255) << 24) | (bArr[i4] & 255) | ((bArr[i4 + 1] & 255) << 8) | ((bArr[i4 + 2] & 255) << 16);
    }

    @Override // org.jboss.netty.buffer.e
    public long getLong(int i4) {
        byte[] bArr = this.f72489f;
        return (bArr[i4] & 255) | ((bArr[i4 + 1] & 255) << 8) | ((bArr[i4 + 2] & 255) << 16) | ((bArr[i4 + 3] & 255) << 24) | ((bArr[i4 + 4] & 255) << 32) | ((bArr[i4 + 5] & 255) << 40) | ((bArr[i4 + 6] & 255) << 48) | ((255 & bArr[i4 + 7]) << 56);
    }

    @Override // org.jboss.netty.buffer.e
    public short getShort(int i4) {
        byte[] bArr = this.f72489f;
        return (short) ((bArr[i4 + 1] << 8) | (bArr[i4] & 255));
    }

    @Override // org.jboss.netty.buffer.e
    public int getUnsignedMedium(int i4) {
        byte[] bArr = this.f72489f;
        return ((bArr[i4 + 2] & 255) << 16) | (bArr[i4] & 255) | ((bArr[i4 + 1] & 255) << 8);
    }

    @Override // org.jboss.netty.buffer.e
    public ByteOrder order() {
        return ByteOrder.LITTLE_ENDIAN;
    }

    @Override // org.jboss.netty.buffer.e
    public void q0(int i4, int i5) {
        byte[] bArr = this.f72489f;
        bArr[i4] = (byte) i5;
        bArr[i4 + 1] = (byte) (i5 >>> 8);
    }

    @Override // org.jboss.netty.buffer.e
    public void setInt(int i4, int i5) {
        byte[] bArr = this.f72489f;
        bArr[i4] = (byte) i5;
        bArr[i4 + 1] = (byte) (i5 >>> 8);
        bArr[i4 + 2] = (byte) (i5 >>> 16);
        bArr[i4 + 3] = (byte) (i5 >>> 24);
    }

    @Override // org.jboss.netty.buffer.e
    public void setLong(int i4, long j4) {
        byte[] bArr = this.f72489f;
        bArr[i4] = (byte) j4;
        bArr[i4 + 1] = (byte) (j4 >>> 8);
        bArr[i4 + 2] = (byte) (j4 >>> 16);
        bArr[i4 + 3] = (byte) (j4 >>> 24);
        bArr[i4 + 4] = (byte) (j4 >>> 32);
        bArr[i4 + 5] = (byte) (j4 >>> 40);
        bArr[i4 + 6] = (byte) (j4 >>> 48);
        bArr[i4 + 7] = (byte) (j4 >>> 56);
    }

    public o(byte[] bArr) {
        super(bArr);
    }

    private o(byte[] bArr, int i4, int i5) {
        super(bArr, i4, i5);
    }
}
