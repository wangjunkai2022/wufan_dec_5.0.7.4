package org.jboss.netty.buffer;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.GatheringByteChannel;
import java.nio.channels.ScatteringByteChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.UShort;
/* compiled from: CompositeChannelBuffer.java */
/* loaded from: classes7.dex */
public class i extends a {

    /* renamed from: k  reason: collision with root package name */
    static final /* synthetic */ boolean f72470k = false;

    /* renamed from: f  reason: collision with root package name */
    private final ByteOrder f72471f;

    /* renamed from: g  reason: collision with root package name */
    private e[] f72472g;

    /* renamed from: h  reason: collision with root package name */
    private int[] f72473h;

    /* renamed from: i  reason: collision with root package name */
    private int f72474i;

    /* renamed from: j  reason: collision with root package name */
    private final boolean f72475j;

    public i(ByteOrder byteOrder, List<e> list, boolean z4) {
        this.f72471f = byteOrder;
        this.f72475j = z4;
        P(list);
    }

    private void P(List<e> list) {
        this.f72474i = 0;
        this.f72472g = new e[list.size()];
        int i4 = 0;
        while (true) {
            e[] eVarArr = this.f72472g;
            if (i4 < eVarArr.length) {
                e eVar = list.get(i4);
                if (eVar.order() == order()) {
                    this.f72472g[i4] = eVar;
                    i4++;
                } else {
                    throw new IllegalArgumentException("All buffers must have the same endianness.");
                }
            } else {
                int i5 = 1;
                int[] iArr = new int[eVarArr.length + 1];
                this.f72473h = iArr;
                iArr[0] = 0;
                while (true) {
                    e[] eVarArr2 = this.f72472g;
                    if (i5 <= eVarArr2.length) {
                        int[] iArr2 = this.f72473h;
                        int i6 = i5 - 1;
                        iArr2[i5] = iArr2[i6] + eVarArr2[i6].capacity();
                        i5++;
                    } else {
                        r0(0, capacity());
                        return;
                    }
                }
            }
        }
    }

    private int e(int i4) {
        int i5 = this.f72474i;
        int[] iArr = this.f72473h;
        if (i4 >= iArr[i5]) {
            int i6 = i5 + 1;
            if (i4 < iArr[i6]) {
                return i5;
            }
            while (i6 < this.f72472g.length) {
                int i7 = i6 + 1;
                if (i4 < this.f72473h[i7]) {
                    this.f72474i = i6;
                    return i6;
                }
                i6 = i7;
            }
        } else {
            for (int i8 = i5 - 1; i8 >= 0; i8--) {
                if (i4 >= this.f72473h[i8]) {
                    this.f72474i = i8;
                    return i8;
                }
            }
        }
        throw new IndexOutOfBoundsException("Invalid index: " + i4 + ", maximum: " + this.f72473h.length);
    }

    private void f(int i4, int i5, int i6, e eVar) {
        int i7 = 0;
        while (i5 > 0) {
            e eVar2 = this.f72472g[i6];
            int i8 = i4 - this.f72473h[i6];
            int min = Math.min(i5, eVar2.capacity() - i8);
            eVar2.m0(i8, eVar, i7, min);
            i4 += min;
            i7 += min;
            i5 -= min;
            i6++;
        }
        eVar.u0(eVar.capacity());
    }

    public int E() {
        return this.f72472g.length;
    }

    @Override // org.jboss.netty.buffer.e
    public void F(int i4, OutputStream outputStream, int i5) throws IOException {
        if (i4 > capacity() - i5) {
            throw new IndexOutOfBoundsException("Too many bytes to be read - needs " + (i4 + i5) + ", maximum of " + capacity());
        } else if (i4 < 0) {
            throw new IndexOutOfBoundsException("Index must be >= 0");
        } else {
            if (i5 == 0) {
                return;
            }
            int e5 = e(i4);
            while (i5 > 0) {
                e eVar = this.f72472g[e5];
                int i6 = i4 - this.f72473h[e5];
                int min = Math.min(i5, eVar.capacity() - i6);
                eVar.F(i6, outputStream, min);
                i4 += min;
                i5 -= min;
                e5++;
            }
        }
    }

    @Override // org.jboss.netty.buffer.e
    public void F0(int i4, ByteBuffer byteBuffer) {
        int e5 = e(i4);
        int limit = byteBuffer.limit();
        int remaining = byteBuffer.remaining();
        if (i4 > capacity() - remaining) {
            throw new IndexOutOfBoundsException("Too many bytes to be written - Needs " + (i4 + remaining) + ", maximum is " + capacity());
        }
        while (remaining > 0) {
            try {
                e eVar = this.f72472g[e5];
                int i5 = i4 - this.f72473h[e5];
                int min = Math.min(remaining, eVar.capacity() - i5);
                byteBuffer.limit(byteBuffer.position() + min);
                eVar.F0(i5, byteBuffer);
                i4 += min;
                remaining -= min;
                e5++;
            } finally {
                byteBuffer.limit(limit);
            }
        }
    }

    @Override // org.jboss.netty.buffer.e
    public e N(int i4, int i5) {
        int e5 = e(i4);
        if (i4 <= capacity() - i5) {
            e f5 = factory().f(order(), i5);
            f(i4, i5, e5, f5);
            return f5;
        }
        throw new IndexOutOfBoundsException("Too many bytes to copy - Needs " + (i4 + i5) + ", maximum is " + capacity());
    }

    @Override // org.jboss.netty.buffer.e
    public ByteBuffer T(int i4, int i5) {
        e[] eVarArr = this.f72472g;
        if (eVarArr.length == 1) {
            return eVarArr[0].T(i4, i5);
        }
        ByteBuffer[] Y = Y(i4, i5);
        ByteBuffer order = ByteBuffer.allocate(i5).order(order());
        for (ByteBuffer byteBuffer : Y) {
            order.put(byteBuffer);
        }
        order.flip();
        return order;
    }

    @Override // org.jboss.netty.buffer.e
    public void V(int i4, int i5) {
        int e5 = e(i4);
        this.f72472g[e5].V(i4 - this.f72473h[e5], i5);
    }

    public boolean W() {
        return this.f72475j && org.jboss.netty.util.internal.d.e() >= 7;
    }

    @Override // org.jboss.netty.buffer.e
    public void X(int i4, byte[] bArr, int i5, int i6) {
        if (i4 > capacity() - i6 || i5 > bArr.length - i6) {
            throw new IndexOutOfBoundsException("Too many bytes to read - Needs " + (i4 + i6) + ", maximum is " + capacity() + " or " + bArr.length);
        } else if (i4 < 0) {
            throw new IndexOutOfBoundsException("Index must be >= 0");
        } else {
            if (i6 == 0) {
                return;
            }
            int e5 = e(i4);
            while (i6 > 0) {
                e eVar = this.f72472g[e5];
                int i7 = i4 - this.f72473h[e5];
                int min = Math.min(i6, eVar.capacity() - i7);
                eVar.X(i7, bArr, i5, min);
                i4 += min;
                i5 += min;
                i6 -= min;
                e5++;
            }
        }
    }

    @Override // org.jboss.netty.buffer.a, org.jboss.netty.buffer.e
    public ByteBuffer[] Y(int i4, int i5) {
        int i6 = i4 + i5;
        if (i6 > capacity()) {
            throw new IndexOutOfBoundsException("Too many bytes to convert - Needs" + i6 + ", maximum is " + capacity());
        } else if (i4 >= 0) {
            if (i5 == 0) {
                return new ByteBuffer[0];
            }
            ArrayList arrayList = new ArrayList(this.f72472g.length);
            int e5 = e(i4);
            while (i5 > 0) {
                e eVar = this.f72472g[e5];
                int i7 = i4 - this.f72473h[e5];
                int min = Math.min(i5, eVar.capacity() - i7);
                arrayList.add(eVar.T(i7, min));
                i4 += min;
                i5 -= min;
                e5++;
            }
            return (ByteBuffer[]) arrayList.toArray(new ByteBuffer[arrayList.size()]);
        } else {
            throw new IndexOutOfBoundsException("Index must be >= 0");
        }
    }

    @Override // org.jboss.netty.buffer.e
    public void Z(int i4, int i5) {
        int e5 = e(i4);
        int i6 = i4 + 3;
        int[] iArr = this.f72473h;
        if (i6 <= iArr[e5 + 1]) {
            this.f72472g[e5].Z(i4 - iArr[e5], i5);
        } else if (order() == ByteOrder.BIG_ENDIAN) {
            q0(i4, (short) (i5 >> 8));
            V(i4 + 2, (byte) i5);
        } else {
            q0(i4, (short) i5);
            V(i4 + 2, (byte) (i5 >>> 16));
        }
    }

    @Override // org.jboss.netty.buffer.e
    public e a(int i4, int i5) {
        if (i4 == 0) {
            if (i5 == 0) {
                return h.f72468c;
            }
        } else if (i4 < 0 || i4 > capacity() - i5) {
            throw new IndexOutOfBoundsException("Invalid index: " + i4 + " - Bytes needed: " + (i4 + i5) + ", maximum is " + capacity());
        } else if (i5 == 0) {
            return h.f72468c;
        }
        List<e> m4 = m(i4, i5);
        int size = m4.size();
        if (size != 0) {
            if (size != 1) {
                return new i(order(), m4, this.f72475j);
            }
            return m4.get(0);
        }
        return h.f72468c;
    }

    @Override // org.jboss.netty.buffer.e
    public byte[] array() {
        throw new UnsupportedOperationException();
    }

    @Override // org.jboss.netty.buffer.e
    public int arrayOffset() {
        throw new UnsupportedOperationException();
    }

    @Override // org.jboss.netty.buffer.e
    public int capacity() {
        return this.f72473h[this.f72472g.length];
    }

    @Override // org.jboss.netty.buffer.e
    public e duplicate() {
        i iVar = new i(this);
        iVar.r0(readerIndex(), writerIndex());
        return iVar;
    }

    @Override // org.jboss.netty.buffer.e
    public f factory() {
        return n.h(order());
    }

    @Override // org.jboss.netty.buffer.e
    public byte getByte(int i4) {
        int e5 = e(i4);
        return this.f72472g[e5].getByte(i4 - this.f72473h[e5]);
    }

    @Override // org.jboss.netty.buffer.e
    public int getBytes(int i4, GatheringByteChannel gatheringByteChannel, int i5) throws IOException {
        if (W()) {
            return (int) gatheringByteChannel.write(Y(i4, i5));
        }
        return gatheringByteChannel.write(T(i4, i5));
    }

    @Override // org.jboss.netty.buffer.e
    public int getInt(int i4) {
        int e5 = e(i4);
        int i5 = i4 + 4;
        int[] iArr = this.f72473h;
        if (i5 <= iArr[e5 + 1]) {
            return this.f72472g[e5].getInt(i4 - iArr[e5]);
        }
        if (order() == ByteOrder.BIG_ENDIAN) {
            return (getShort(i4 + 2) & UShort.MAX_VALUE) | ((getShort(i4) & UShort.MAX_VALUE) << 16);
        }
        return ((getShort(i4 + 2) & UShort.MAX_VALUE) << 16) | (getShort(i4) & UShort.MAX_VALUE);
    }

    @Override // org.jboss.netty.buffer.e
    public long getLong(int i4) {
        int e5 = e(i4);
        int i5 = i4 + 8;
        int[] iArr = this.f72473h;
        if (i5 <= iArr[e5 + 1]) {
            return this.f72472g[e5].getLong(i4 - iArr[e5]);
        }
        if (order() == ByteOrder.BIG_ENDIAN) {
            return ((getInt(i4) & 4294967295L) << 32) | (4294967295L & getInt(i4 + 4));
        }
        return (getInt(i4) & 4294967295L) | ((4294967295L & getInt(i4 + 4)) << 32);
    }

    @Override // org.jboss.netty.buffer.e
    public short getShort(int i4) {
        int e5 = e(i4);
        int i5 = i4 + 2;
        int[] iArr = this.f72473h;
        if (i5 <= iArr[e5 + 1]) {
            return this.f72472g[e5].getShort(i4 - iArr[e5]);
        }
        if (order() == ByteOrder.BIG_ENDIAN) {
            return (short) ((getByte(i4 + 1) & 255) | ((getByte(i4) & 255) << 8));
        }
        return (short) (((getByte(i4 + 1) & 255) << 8) | (getByte(i4) & 255));
    }

    @Override // org.jboss.netty.buffer.e
    public int getUnsignedMedium(int i4) {
        int e5 = e(i4);
        int i5 = i4 + 3;
        int[] iArr = this.f72473h;
        if (i5 <= iArr[e5 + 1]) {
            return this.f72472g[e5].getUnsignedMedium(i4 - iArr[e5]);
        }
        if (order() == ByteOrder.BIG_ENDIAN) {
            return (getByte(i4 + 2) & 255) | ((getShort(i4) & UShort.MAX_VALUE) << 8);
        }
        return ((getByte(i4 + 2) & 255) << 16) | (getShort(i4) & UShort.MAX_VALUE);
    }

    @Override // org.jboss.netty.buffer.e
    public boolean hasArray() {
        return false;
    }

    @Override // org.jboss.netty.buffer.e
    public boolean isDirect() {
        return false;
    }

    public List<e> m(int i4, int i5) {
        if (i5 == 0) {
            return Collections.emptyList();
        }
        int i6 = i4 + i5;
        if (i6 <= capacity()) {
            int e5 = e(i4);
            ArrayList arrayList = new ArrayList(this.f72472g.length);
            e duplicate = this.f72472g[e5].duplicate();
            duplicate.R(i4 - this.f72473h[e5]);
            while (true) {
                int readableBytes = duplicate.readableBytes();
                if (i5 <= readableBytes) {
                    duplicate.u0(duplicate.readerIndex() + i5);
                    arrayList.add(duplicate);
                    break;
                }
                arrayList.add(duplicate);
                i5 -= readableBytes;
                e5++;
                duplicate = this.f72472g[e5].duplicate();
                if (i5 <= 0) {
                    break;
                }
            }
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                arrayList.set(i7, ((e) arrayList.get(i7)).G0());
            }
            return arrayList;
        }
        throw new IndexOutOfBoundsException("Too many bytes to decompose - Need " + i6 + ", capacity is " + capacity());
    }

    @Override // org.jboss.netty.buffer.e
    public void m0(int i4, e eVar, int i5, int i6) {
        if (i4 > capacity() - i6 || i5 > eVar.capacity() - i6) {
            throw new IndexOutOfBoundsException("Too many bytes to be read - Needs " + (i4 + i6) + " or " + (i5 + i6) + ", maximum is " + capacity() + " or " + eVar.capacity());
        } else if (i4 < 0) {
            throw new IndexOutOfBoundsException("Index must be >= 0");
        } else {
            if (i6 == 0) {
                return;
            }
            int e5 = e(i4);
            while (i6 > 0) {
                e eVar2 = this.f72472g[e5];
                int i7 = i4 - this.f72473h[e5];
                int min = Math.min(i6, eVar2.capacity() - i7);
                eVar2.m0(i7, eVar, i5, min);
                i4 += min;
                i5 += min;
                i6 -= min;
                e5++;
            }
        }
    }

    @Override // org.jboss.netty.buffer.a, org.jboss.netty.buffer.e
    public void n() {
        int i4;
        int i5;
        int readerIndex = readerIndex();
        if (readerIndex == 0) {
            return;
        }
        int writerIndex = writerIndex();
        List<e> m4 = m(readerIndex, capacity() - readerIndex);
        if (m4.isEmpty()) {
            m4 = new ArrayList<>(1);
        }
        e b5 = h.b(order(), readerIndex);
        b5.u0(readerIndex);
        m4.add(b5);
        try {
            n0();
            i4 = readerIndex();
        } catch (IndexOutOfBoundsException unused) {
            i4 = readerIndex;
        }
        try {
            K();
            i5 = writerIndex();
        } catch (IndexOutOfBoundsException unused2) {
            i5 = writerIndex;
        }
        P(m4);
        r0(Math.max(i4 - readerIndex, 0), Math.max(i5 - readerIndex, 0));
        i0();
        w0();
        r0(0, Math.max(writerIndex - readerIndex, 0));
    }

    @Override // org.jboss.netty.buffer.e
    public ByteOrder order() {
        return this.f72471f;
    }

    @Override // org.jboss.netty.buffer.e
    public void q0(int i4, int i5) {
        int e5 = e(i4);
        int i6 = i4 + 2;
        int[] iArr = this.f72473h;
        if (i6 <= iArr[e5 + 1]) {
            this.f72472g[e5].q0(i4 - iArr[e5], i5);
        } else if (order() == ByteOrder.BIG_ENDIAN) {
            V(i4, (byte) (i5 >>> 8));
            V(i4 + 1, (byte) i5);
        } else {
            V(i4, (byte) i5);
            V(i4 + 1, (byte) (i5 >>> 8));
        }
    }

    @Override // org.jboss.netty.buffer.e
    public void s(int i4, byte[] bArr, int i5, int i6) {
        int e5 = e(i4);
        if (i4 > capacity() - i6 || i5 > bArr.length - i6) {
            throw new IndexOutOfBoundsException("Too many bytes to read - needs " + (i4 + i6) + " or " + (i5 + i6) + ", maximum is " + capacity() + " or " + bArr.length);
        }
        while (i6 > 0) {
            e eVar = this.f72472g[e5];
            int i7 = i4 - this.f72473h[e5];
            int min = Math.min(i6, eVar.capacity() - i7);
            eVar.s(i7, bArr, i5, min);
            i4 += min;
            i5 += min;
            i6 -= min;
            e5++;
        }
    }

    @Override // org.jboss.netty.buffer.e
    public int setBytes(int i4, InputStream inputStream, int i5) throws IOException {
        int e5 = e(i4);
        if (i4 > capacity() - i5) {
            throw new IndexOutOfBoundsException("Too many bytes to write - Needs " + (i4 + i5) + ", maximum is " + capacity());
        }
        int i6 = 0;
        while (true) {
            e eVar = this.f72472g[e5];
            int i7 = i4 - this.f72473h[e5];
            int min = Math.min(i5, eVar.capacity() - i7);
            int bytes = eVar.setBytes(i7, inputStream, min);
            if (bytes >= 0) {
                if (bytes == min) {
                    i4 += min;
                    i5 -= min;
                    i6 += min;
                    e5++;
                    continue;
                } else {
                    i4 += bytes;
                    i5 -= bytes;
                    i6 += bytes;
                    continue;
                }
                if (i5 <= 0) {
                    break;
                }
            } else if (i6 == 0) {
                return -1;
            }
        }
        return i6;
    }

    @Override // org.jboss.netty.buffer.e
    public void setInt(int i4, int i5) {
        int e5 = e(i4);
        int i6 = i4 + 4;
        int[] iArr = this.f72473h;
        if (i6 <= iArr[e5 + 1]) {
            this.f72472g[e5].setInt(i4 - iArr[e5], i5);
        } else if (order() == ByteOrder.BIG_ENDIAN) {
            q0(i4, (short) (i5 >>> 16));
            q0(i4 + 2, (short) i5);
        } else {
            q0(i4, (short) i5);
            q0(i4 + 2, (short) (i5 >>> 16));
        }
    }

    @Override // org.jboss.netty.buffer.e
    public void setLong(int i4, long j4) {
        int e5 = e(i4);
        int i5 = i4 + 8;
        int[] iArr = this.f72473h;
        if (i5 <= iArr[e5 + 1]) {
            this.f72472g[e5].setLong(i4 - iArr[e5], j4);
        } else if (order() == ByteOrder.BIG_ENDIAN) {
            setInt(i4, (int) (j4 >>> 32));
            setInt(i4 + 4, (int) j4);
        } else {
            setInt(i4, (int) j4);
            setInt(i4 + 4, (int) (j4 >>> 32));
        }
    }

    @Override // org.jboss.netty.buffer.a, org.jboss.netty.buffer.e
    public String toString() {
        String aVar = super.toString();
        String substring = aVar.substring(0, aVar.length() - 1);
        return substring + ", components=" + this.f72472g.length + ')';
    }

    public e u(int i4) {
        if (i4 >= 0 && i4 < capacity()) {
            return this.f72472g[e(i4)];
        }
        throw new IndexOutOfBoundsException("Invalid index: " + i4 + " - Bytes needed: " + i4 + ", maximum is " + capacity());
    }

    @Override // org.jboss.netty.buffer.e
    public void v0(int i4, ByteBuffer byteBuffer) {
        int e5 = e(i4);
        int limit = byteBuffer.limit();
        int remaining = byteBuffer.remaining();
        if (i4 > capacity() - remaining) {
            throw new IndexOutOfBoundsException("Too many bytes to be read - Needs " + (i4 + remaining) + ", maximum is " + capacity());
        } else if (i4 < 0) {
            throw new IndexOutOfBoundsException("Index must be >= 0");
        } else {
            while (remaining > 0) {
                try {
                    e eVar = this.f72472g[e5];
                    int i5 = i4 - this.f72473h[e5];
                    int min = Math.min(remaining, eVar.capacity() - i5);
                    byteBuffer.limit(byteBuffer.position() + min);
                    eVar.v0(i5, byteBuffer);
                    i4 += min;
                    remaining -= min;
                    e5++;
                } finally {
                    byteBuffer.limit(limit);
                }
            }
        }
    }

    @Override // org.jboss.netty.buffer.e
    public void y(int i4, e eVar, int i5, int i6) {
        int e5 = e(i4);
        if (i4 > capacity() - i6 || i5 > eVar.capacity() - i6) {
            throw new IndexOutOfBoundsException("Too many bytes to be written - Needs " + (i4 + i6) + " or " + (i5 + i6) + ", maximum is " + capacity() + " or " + eVar.capacity());
        }
        while (i6 > 0) {
            e eVar2 = this.f72472g[e5];
            int i7 = i4 - this.f72473h[e5];
            int min = Math.min(i6, eVar2.capacity() - i7);
            eVar2.y(i7, eVar, i5, min);
            i4 += min;
            i5 += min;
            i6 -= min;
            e5++;
        }
    }

    private i(i iVar) {
        this.f72471f = iVar.f72471f;
        this.f72475j = iVar.f72475j;
        this.f72472g = (e[]) iVar.f72472g.clone();
        this.f72473h = (int[]) iVar.f72473h.clone();
        r0(iVar.readerIndex(), iVar.writerIndex());
    }

    @Override // org.jboss.netty.buffer.e
    public int setBytes(int i4, ScatteringByteChannel scatteringByteChannel, int i5) throws IOException {
        int e5 = e(i4);
        if (i4 > capacity() - i5) {
            throw new IndexOutOfBoundsException("Too many bytes to write - Needs " + (i4 + i5) + ", maximum is " + capacity());
        }
        int i6 = 0;
        while (true) {
            e eVar = this.f72472g[e5];
            int i7 = i4 - this.f72473h[e5];
            int min = Math.min(i5, eVar.capacity() - i7);
            int bytes = eVar.setBytes(i7, scatteringByteChannel, min);
            if (bytes == 0) {
                break;
            } else if (bytes >= 0) {
                if (bytes == min) {
                    i4 += min;
                    i5 -= min;
                    i6 += min;
                    e5++;
                    continue;
                } else {
                    i4 += bytes;
                    i5 -= bytes;
                    i6 += bytes;
                    continue;
                }
                if (i5 <= 0) {
                    break;
                }
            } else if (i6 == 0) {
                return -1;
            }
        }
        return i6;
    }
}
