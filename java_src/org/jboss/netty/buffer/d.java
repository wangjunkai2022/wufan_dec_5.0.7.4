package org.jboss.netty.buffer;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.GatheringByteChannel;
import java.nio.channels.ScatteringByteChannel;
import java.util.Objects;
/* compiled from: ByteBufferBackedChannelBuffer.java */
/* loaded from: classes7.dex */
public class d extends a {

    /* renamed from: f  reason: collision with root package name */
    private final ByteBuffer f72453f;

    /* renamed from: g  reason: collision with root package name */
    private final ByteOrder f72454g;

    /* renamed from: h  reason: collision with root package name */
    private final int f72455h;

    public d(ByteBuffer byteBuffer) {
        Objects.requireNonNull(byteBuffer, "buffer");
        ByteOrder order = byteBuffer.order();
        this.f72454g = order;
        this.f72453f = byteBuffer.slice().order(order);
        int remaining = byteBuffer.remaining();
        this.f72455h = remaining;
        u0(remaining);
    }

    @Override // org.jboss.netty.buffer.e
    public void F(int i4, OutputStream outputStream, int i5) throws IOException {
        if (i5 == 0) {
            return;
        }
        if (this.f72453f.hasArray()) {
            outputStream.write(this.f72453f.array(), i4 + this.f72453f.arrayOffset(), i5);
            return;
        }
        byte[] bArr = new byte[i5];
        ((ByteBuffer) this.f72453f.duplicate().position(i4)).get(bArr);
        outputStream.write(bArr);
    }

    @Override // org.jboss.netty.buffer.e
    public void F0(int i4, ByteBuffer byteBuffer) {
        ByteBuffer duplicate = this.f72453f.duplicate();
        duplicate.limit(byteBuffer.remaining() + i4).position(i4);
        duplicate.put(byteBuffer);
    }

    @Override // org.jboss.netty.buffer.e
    public e N(int i4, int i5) {
        try {
            ByteBuffer byteBuffer = (ByteBuffer) this.f72453f.duplicate().position(i4).limit(i4 + i5);
            ByteBuffer allocateDirect = this.f72453f.isDirect() ? ByteBuffer.allocateDirect(i5) : ByteBuffer.allocate(i5);
            allocateDirect.put(byteBuffer);
            allocateDirect.order(order());
            allocateDirect.clear();
            return new d(allocateDirect);
        } catch (IllegalArgumentException unused) {
            throw new IndexOutOfBoundsException("Too many bytes to read - Need " + (i4 + i5));
        }
    }

    @Override // org.jboss.netty.buffer.e
    public ByteBuffer T(int i4, int i5) {
        if (i4 == 0 && i5 == capacity()) {
            return this.f72453f.duplicate().order(order());
        }
        return ((ByteBuffer) this.f72453f.duplicate().position(i4).limit(i4 + i5)).slice().order(order());
    }

    @Override // org.jboss.netty.buffer.e
    public void V(int i4, int i5) {
        this.f72453f.put(i4, (byte) i5);
    }

    @Override // org.jboss.netty.buffer.e
    public void X(int i4, byte[] bArr, int i5, int i6) {
        ByteBuffer duplicate = this.f72453f.duplicate();
        int i7 = i4 + i6;
        try {
            duplicate.limit(i7).position(i4);
            duplicate.get(bArr, i5, i6);
        } catch (IllegalArgumentException unused) {
            throw new IndexOutOfBoundsException("Too many bytes to read - Need " + i7 + ", maximum is " + duplicate.limit());
        }
    }

    @Override // org.jboss.netty.buffer.e
    public void Z(int i4, int i5) {
        V(i4, (byte) (i5 >>> 16));
        V(i4 + 1, (byte) (i5 >>> 8));
        V(i4 + 2, (byte) i5);
    }

    @Override // org.jboss.netty.buffer.e
    public e a(int i4, int i5) {
        if (i4 == 0 && i5 == capacity()) {
            e duplicate = duplicate();
            duplicate.r0(0, i5);
            return duplicate;
        } else if (i4 >= 0 && i5 == 0) {
            return h.f72468c;
        } else {
            return new d(((ByteBuffer) this.f72453f.duplicate().position(i4).limit(i4 + i5)).order(order()));
        }
    }

    @Override // org.jboss.netty.buffer.e
    public byte[] array() {
        return this.f72453f.array();
    }

    @Override // org.jboss.netty.buffer.e
    public int arrayOffset() {
        return this.f72453f.arrayOffset();
    }

    @Override // org.jboss.netty.buffer.e
    public int capacity() {
        return this.f72455h;
    }

    @Override // org.jboss.netty.buffer.e
    public e duplicate() {
        return new d(this);
    }

    @Override // org.jboss.netty.buffer.e
    public f factory() {
        if (this.f72453f.isDirect()) {
            return j.j(order());
        }
        return n.h(order());
    }

    @Override // org.jboss.netty.buffer.e
    public byte getByte(int i4) {
        return this.f72453f.get(i4);
    }

    @Override // org.jboss.netty.buffer.e
    public int getBytes(int i4, GatheringByteChannel gatheringByteChannel, int i5) throws IOException {
        if (i5 == 0) {
            return 0;
        }
        return gatheringByteChannel.write((ByteBuffer) this.f72453f.duplicate().position(i4).limit(i4 + i5));
    }

    @Override // org.jboss.netty.buffer.e
    public int getInt(int i4) {
        return this.f72453f.getInt(i4);
    }

    @Override // org.jboss.netty.buffer.e
    public long getLong(int i4) {
        return this.f72453f.getLong(i4);
    }

    @Override // org.jboss.netty.buffer.e
    public short getShort(int i4) {
        return this.f72453f.getShort(i4);
    }

    @Override // org.jboss.netty.buffer.e
    public int getUnsignedMedium(int i4) {
        return (getByte(i4 + 2) & 255) | ((getByte(i4) & 255) << 16) | ((getByte(i4 + 1) & 255) << 8);
    }

    @Override // org.jboss.netty.buffer.e
    public boolean hasArray() {
        return this.f72453f.hasArray();
    }

    @Override // org.jboss.netty.buffer.e
    public boolean isDirect() {
        return this.f72453f.isDirect();
    }

    @Override // org.jboss.netty.buffer.e
    public void m0(int i4, e eVar, int i5, int i6) {
        if (eVar instanceof d) {
            ByteBuffer duplicate = ((d) eVar).f72453f.duplicate();
            duplicate.limit(i6 + i5).position(i5);
            v0(i4, duplicate);
        } else if (this.f72453f.hasArray()) {
            eVar.s(i5, this.f72453f.array(), i4 + this.f72453f.arrayOffset(), i6);
        } else {
            eVar.y(i5, this, i4, i6);
        }
    }

    @Override // org.jboss.netty.buffer.e
    public ByteOrder order() {
        return this.f72454g;
    }

    @Override // org.jboss.netty.buffer.e
    public void q0(int i4, int i5) {
        this.f72453f.putShort(i4, (short) i5);
    }

    @Override // org.jboss.netty.buffer.e
    public void s(int i4, byte[] bArr, int i5, int i6) {
        ByteBuffer duplicate = this.f72453f.duplicate();
        duplicate.limit(i4 + i6).position(i4);
        duplicate.put(bArr, i5, i6);
    }

    @Override // org.jboss.netty.buffer.e
    public int setBytes(int i4, InputStream inputStream, int i5) throws IOException {
        int i6 = 0;
        if (this.f72453f.hasArray()) {
            int arrayOffset = i4 + this.f72453f.arrayOffset();
            do {
                int read = inputStream.read(this.f72453f.array(), arrayOffset, i5);
                if (read < 0) {
                    if (i6 == 0) {
                        return -1;
                    }
                    return i6;
                }
                i6 += read;
                arrayOffset += read;
                i5 -= read;
            } while (i5 > 0);
            return i6;
        }
        byte[] bArr = new byte[i5];
        int i7 = 0;
        while (true) {
            int read2 = inputStream.read(bArr, i6, i5 - i6);
            if (read2 >= 0) {
                i7 += read2;
                i6 += i7;
                if (i6 >= i5) {
                    break;
                }
            } else if (i7 == 0) {
                return -1;
            }
        }
        int i8 = i7;
        ((ByteBuffer) this.f72453f.duplicate().position(i4)).put(bArr);
        return i8;
    }

    @Override // org.jboss.netty.buffer.e
    public void setInt(int i4, int i5) {
        this.f72453f.putInt(i4, i5);
    }

    @Override // org.jboss.netty.buffer.e
    public void setLong(int i4, long j4) {
        this.f72453f.putLong(i4, j4);
    }

    @Override // org.jboss.netty.buffer.e
    public void v0(int i4, ByteBuffer byteBuffer) {
        ByteBuffer duplicate = this.f72453f.duplicate();
        int min = Math.min(capacity() - i4, byteBuffer.remaining()) + i4;
        try {
            duplicate.limit(min).position(i4);
            byteBuffer.put(duplicate);
        } catch (IllegalArgumentException unused) {
            throw new IndexOutOfBoundsException("Too many bytes to read - Need " + min + ", maximum is " + duplicate.limit());
        }
    }

    @Override // org.jboss.netty.buffer.e
    public void y(int i4, e eVar, int i5, int i6) {
        if (eVar instanceof d) {
            ByteBuffer duplicate = ((d) eVar).f72453f.duplicate();
            duplicate.limit(i6 + i5).position(i5);
            F0(i4, duplicate);
        } else if (this.f72453f.hasArray()) {
            eVar.X(i5, this.f72453f.array(), i4 + this.f72453f.arrayOffset(), i6);
        } else {
            eVar.m0(i5, this, i4, i6);
        }
    }

    private d(d dVar) {
        this.f72453f = dVar.f72453f;
        this.f72454g = dVar.f72454g;
        this.f72455h = dVar.f72455h;
        r0(dVar.readerIndex(), dVar.writerIndex());
    }

    @Override // org.jboss.netty.buffer.e
    public int setBytes(int i4, ScatteringByteChannel scatteringByteChannel, int i5) throws IOException {
        int i6;
        ByteBuffer byteBuffer = (ByteBuffer) this.f72453f.duplicate().limit(i4 + i5).position(i4);
        int i7 = 0;
        while (i7 < i5) {
            try {
                i6 = scatteringByteChannel.read(byteBuffer);
            } catch (ClosedChannelException unused) {
                i6 = -1;
            }
            if (i6 < 0) {
                if (i7 == 0) {
                    return -1;
                }
                return i7;
            } else if (i6 == 0) {
                break;
            } else {
                i7 += i6;
            }
        }
        return i7;
    }
}
