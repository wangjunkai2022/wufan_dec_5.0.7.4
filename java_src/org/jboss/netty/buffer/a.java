package org.jboss.netty.buffer;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.GatheringByteChannel;
import java.nio.channels.ScatteringByteChannel;
import java.nio.charset.Charset;
import java.util.NoSuchElementException;
import kotlin.UShort;
/* compiled from: AbstractChannelBuffer.java */
/* loaded from: classes7.dex */
public abstract class a implements e {

    /* renamed from: b  reason: collision with root package name */
    private int f72448b;

    /* renamed from: c  reason: collision with root package name */
    private int f72449c;

    /* renamed from: d  reason: collision with root package name */
    private int f72450d;

    /* renamed from: e  reason: collision with root package name */
    private int f72451e;

    @Override // org.jboss.netty.buffer.e
    public void A0(e eVar, int i4) {
        if (i4 <= eVar.writableBytes()) {
            p0(eVar, eVar.writerIndex(), i4);
            eVar.u0(eVar.writerIndex() + i4);
            return;
        }
        throw new IndexOutOfBoundsException("Too many bytes to be read: Need " + i4 + ", maximum is " + eVar.writableBytes());
    }

    @Override // org.jboss.netty.buffer.e
    public void B(byte[] bArr) {
        b0(bArr, 0, bArr.length);
    }

    @Override // org.jboss.netty.buffer.e
    public void B0(int i4) {
        if (i4 <= writableBytes()) {
            return;
        }
        throw new IndexOutOfBoundsException("Writable bytes exceeded: Got " + i4 + ", maximum is " + writableBytes());
    }

    @Override // org.jboss.netty.buffer.e
    public boolean C() {
        return writableBytes() > 0;
    }

    @Override // org.jboss.netty.buffer.e
    public void C0(int i4, int i5) {
        if (i5 == 0) {
            return;
        }
        if (i5 < 0) {
            throw new IllegalArgumentException("length must be 0 or greater than 0.");
        }
        int i6 = i5 & 7;
        for (int i7 = i5 >>> 3; i7 > 0; i7--) {
            setLong(i4, 0L);
            i4 += 8;
        }
        if (i6 == 4) {
            setInt(i4, 0);
        } else if (i6 < 4) {
            while (i6 > 0) {
                V(i4, 0);
                i4++;
                i6--;
            }
        } else {
            setInt(i4, 0);
            int i8 = i4 + 4;
            for (int i9 = i6 - 4; i9 > 0; i9--) {
                V(i8, 0);
                i8++;
            }
        }
    }

    @Override // org.jboss.netty.buffer.e
    public void D(int i4, e eVar, int i5) {
        if (i5 <= eVar.readableBytes()) {
            y(i4, eVar, eVar.readerIndex(), i5);
            eVar.R(eVar.readerIndex() + i5);
            return;
        }
        throw new IndexOutOfBoundsException("Too many bytes to write: Need " + i5 + ", maximum is " + eVar.readableBytes());
    }

    @Override // org.jboss.netty.buffer.e
    public void D0(OutputStream outputStream, int i4) throws IOException {
        d(i4);
        F(this.f72448b, outputStream, i4);
        this.f72448b += i4;
    }

    @Override // org.jboss.netty.buffer.e
    public ByteBuffer[] E0() {
        return Y(this.f72448b, readableBytes());
    }

    @Override // org.jboss.netty.buffer.e
    public void G(int i4, e eVar, int i5) {
        if (i5 <= eVar.writableBytes()) {
            m0(i4, eVar, eVar.writerIndex(), i5);
            eVar.u0(eVar.writerIndex() + i5);
            return;
        }
        throw new IndexOutOfBoundsException("Too many bytes to be read: Need " + i5 + ", maximum is " + eVar.writableBytes());
    }

    @Override // org.jboss.netty.buffer.e
    public e G0() {
        return a(this.f72448b, readableBytes());
    }

    @Override // org.jboss.netty.buffer.e
    @Deprecated
    public String H(int i4, int i5, String str) {
        return toString(i4, i5, Charset.forName(str));
    }

    @Override // org.jboss.netty.buffer.e
    public boolean H0() {
        return readableBytes() > 0;
    }

    @Override // org.jboss.netty.buffer.e
    public int I(int i4, int i5, g gVar) {
        return h.R(this, i4, i5, gVar);
    }

    @Override // org.jboss.netty.buffer.e
    @Deprecated
    public e I0(g gVar) {
        int I = I(this.f72448b, this.f72449c, gVar);
        if (I >= 0) {
            return Q(I - this.f72448b);
        }
        throw new NoSuchElementException();
    }

    @Override // org.jboss.netty.buffer.e
    public void J(e eVar, int i4) {
        if (i4 <= eVar.readableBytes()) {
            M(eVar, eVar.readerIndex(), i4);
            eVar.R(eVar.readerIndex() + i4);
            return;
        }
        throw new IndexOutOfBoundsException("Too many bytes to write - Need " + i4 + ", maximum is " + eVar.readableBytes());
    }

    @Override // org.jboss.netty.buffer.e
    @Deprecated
    public int J0(g gVar) {
        int i4 = this.f72448b;
        int I = I(i4, this.f72449c, gVar);
        if (I >= 0) {
            R(I);
            return I - i4;
        }
        throw new NoSuchElementException();
    }

    @Override // org.jboss.netty.buffer.e
    public void K() {
        this.f72449c = this.f72451e;
    }

    @Override // org.jboss.netty.buffer.e
    @Deprecated
    public String L(int i4, int i5, String str, g gVar) {
        if (gVar == null) {
            return H(i4, i5, str);
        }
        int I = I(i4, i4 + i5, gVar);
        if (I < 0) {
            return H(i4, i5, str);
        }
        return H(i4, I - i4, str);
    }

    @Override // org.jboss.netty.buffer.e
    public void M(e eVar, int i4, int i5) {
        y(this.f72449c, eVar, i4, i5);
        this.f72449c += i5;
    }

    @Override // org.jboss.netty.buffer.e
    public e Q(int i4) {
        e a5 = a(this.f72448b, i4);
        this.f72448b += i4;
        return a5;
    }

    @Override // org.jboss.netty.buffer.e
    public void R(int i4) {
        if (i4 >= 0 && i4 <= this.f72449c) {
            this.f72448b = i4;
            return;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // org.jboss.netty.buffer.e
    public int S(int i4, int i5, g gVar) {
        int I = I(i4, i5 + i4, gVar);
        if (I < 0) {
            return -1;
        }
        return I - i4;
    }

    @Override // org.jboss.netty.buffer.e
    public void U(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        d(remaining);
        v0(this.f72448b, byteBuffer);
        this.f72448b += remaining;
    }

    @Override // org.jboss.netty.buffer.e
    public ByteBuffer[] Y(int i4, int i5) {
        return new ByteBuffer[]{T(i4, i5)};
    }

    @Override // org.jboss.netty.buffer.e
    public void b0(byte[] bArr, int i4, int i5) {
        s(this.f72449c, bArr, i4, i5);
        this.f72449c += i5;
    }

    @Override // org.jboss.netty.buffer.e
    public int bytesBefore(byte b5) {
        return bytesBefore(readerIndex(), readableBytes(), b5);
    }

    @Override // org.jboss.netty.buffer.e
    public void c(int i4, int i5) {
        q0(i4, i5);
    }

    @Override // org.jboss.netty.buffer.e
    public int c0(g gVar) {
        return S(readerIndex(), readableBytes(), gVar);
    }

    @Override // org.jboss.netty.buffer.e
    public void clear() {
        this.f72449c = 0;
        this.f72448b = 0;
    }

    @Override // org.jboss.netty.buffer.e
    public e copy() {
        return N(this.f72448b, readableBytes());
    }

    protected void d(int i4) {
        if (readableBytes() >= i4) {
            return;
        }
        throw new IndexOutOfBoundsException("Not enough readable bytes - Need " + i4 + ", maximum is " + readableBytes());
    }

    @Override // org.jboss.netty.buffer.e
    public ByteBuffer d0() {
        return T(this.f72448b, readableBytes());
    }

    @Override // org.jboss.netty.buffer.e
    public boolean equals(Object obj) {
        if (obj instanceof e) {
            return h.J(this, (e) obj);
        }
        return false;
    }

    @Override // java.lang.Comparable
    /* renamed from: f0 */
    public int compareTo(e eVar) {
        return h.c(this, eVar);
    }

    @Override // org.jboss.netty.buffer.e
    public char getChar(int i4) {
        return (char) getShort(i4);
    }

    @Override // org.jboss.netty.buffer.e
    public double getDouble(int i4) {
        return Double.longBitsToDouble(getLong(i4));
    }

    @Override // org.jboss.netty.buffer.e
    public float getFloat(int i4) {
        return Float.intBitsToFloat(getInt(i4));
    }

    @Override // org.jboss.netty.buffer.e
    public int getMedium(int i4) {
        int unsignedMedium = getUnsignedMedium(i4);
        return (8388608 & unsignedMedium) != 0 ? unsignedMedium | (-16777216) : unsignedMedium;
    }

    @Override // org.jboss.netty.buffer.e
    public short getUnsignedByte(int i4) {
        return (short) (getByte(i4) & 255);
    }

    @Override // org.jboss.netty.buffer.e
    public long getUnsignedInt(int i4) {
        return getInt(i4) & 4294967295L;
    }

    @Override // org.jboss.netty.buffer.e
    public int getUnsignedShort(int i4) {
        return getShort(i4) & UShort.MAX_VALUE;
    }

    @Override // org.jboss.netty.buffer.e
    public int h0(int i4, g gVar) {
        d(i4);
        return S(readerIndex(), i4, gVar);
    }

    @Override // org.jboss.netty.buffer.e
    public int hashCode() {
        return h.M(this);
    }

    @Override // org.jboss.netty.buffer.e
    public void i0() {
        this.f72450d = this.f72448b;
    }

    @Override // org.jboss.netty.buffer.e
    public int indexOf(int i4, int i5, byte b5) {
        return h.Q(this, i4, i5, b5);
    }

    @Override // org.jboss.netty.buffer.e
    public void j0(int i4) {
        if (i4 == 0) {
            return;
        }
        if (i4 < 0) {
            throw new IllegalArgumentException("length must be 0 or greater than 0.");
        }
        int i5 = i4 & 7;
        for (int i6 = i4 >>> 3; i6 > 0; i6--) {
            writeLong(0L);
        }
        if (i5 == 4) {
            writeInt(0);
        } else if (i5 < 4) {
            while (i5 > 0) {
                writeByte(0);
                i5--;
            }
        } else {
            writeInt(0);
            for (int i7 = i5 - 4; i7 > 0; i7--) {
                writeByte(0);
            }
        }
    }

    @Override // org.jboss.netty.buffer.e
    public void k0(int i4, byte[] bArr) {
        s(i4, bArr, 0, bArr.length);
    }

    @Override // org.jboss.netty.buffer.e
    public void l0(int i4, e eVar) {
        D(i4, eVar, eVar.readableBytes());
    }

    @Override // org.jboss.netty.buffer.e
    public void n() {
        int i4 = this.f72448b;
        if (i4 == 0) {
            return;
        }
        y(0, this, i4, this.f72449c - i4);
        int i5 = this.f72449c;
        int i6 = this.f72448b;
        this.f72449c = i5 - i6;
        this.f72450d = Math.max(this.f72450d - i6, 0);
        this.f72451e = Math.max(this.f72451e - this.f72448b, 0);
        this.f72448b = 0;
    }

    @Override // org.jboss.netty.buffer.e
    public void n0() {
        R(this.f72450d);
    }

    @Override // org.jboss.netty.buffer.e
    @Deprecated
    public String o(String str, g gVar) {
        return L(this.f72448b, readableBytes(), str, gVar);
    }

    @Override // org.jboss.netty.buffer.e
    public void o0(int i4) {
        Z(this.f72449c, i4);
        this.f72449c += 3;
    }

    @Override // org.jboss.netty.buffer.e
    @Deprecated
    public e p(g gVar) {
        int I = I(this.f72448b, this.f72449c, gVar);
        if (I >= 0) {
            return r(I - this.f72448b);
        }
        throw new NoSuchElementException();
    }

    @Override // org.jboss.netty.buffer.e
    public void p0(e eVar, int i4, int i5) {
        d(i5);
        m0(this.f72448b, eVar, i4, i5);
        this.f72448b += i5;
    }

    @Override // org.jboss.netty.buffer.e
    public void q(int i4, byte[] bArr) {
        X(i4, bArr, 0, bArr.length);
    }

    @Override // org.jboss.netty.buffer.e
    public e r(int i4) {
        d(i4);
        if (i4 == 0) {
            return h.f72468c;
        }
        e f5 = factory().f(order(), i4);
        f5.M(this, this.f72448b, i4);
        this.f72448b += i4;
        return f5;
    }

    @Override // org.jboss.netty.buffer.e
    public void r0(int i4, int i5) {
        if (i4 >= 0 && i4 <= i5 && i5 <= capacity()) {
            this.f72448b = i4;
            this.f72449c = i5;
            return;
        }
        throw new IndexOutOfBoundsException("Invalid writerIndex: " + i5 + " - Maximum is " + i4 + " or " + capacity());
    }

    @Override // org.jboss.netty.buffer.e
    public byte readByte() {
        int i4 = this.f72448b;
        if (i4 != this.f72449c) {
            this.f72448b = i4 + 1;
            return getByte(i4);
        }
        throw new IndexOutOfBoundsException("Readable byte limit exceeded: " + this.f72448b);
    }

    @Override // org.jboss.netty.buffer.e
    public int readBytes(GatheringByteChannel gatheringByteChannel, int i4) throws IOException {
        d(i4);
        int bytes = getBytes(this.f72448b, gatheringByteChannel, i4);
        this.f72448b += bytes;
        return bytes;
    }

    @Override // org.jboss.netty.buffer.e
    public char readChar() {
        return (char) readShort();
    }

    @Override // org.jboss.netty.buffer.e
    public double readDouble() {
        return Double.longBitsToDouble(readLong());
    }

    @Override // org.jboss.netty.buffer.e
    public float readFloat() {
        return Float.intBitsToFloat(readInt());
    }

    @Override // org.jboss.netty.buffer.e
    public int readInt() {
        d(4);
        int i4 = getInt(this.f72448b);
        this.f72448b += 4;
        return i4;
    }

    @Override // org.jboss.netty.buffer.e
    public long readLong() {
        d(8);
        long j4 = getLong(this.f72448b);
        this.f72448b += 8;
        return j4;
    }

    @Override // org.jboss.netty.buffer.e
    public int readMedium() {
        int readUnsignedMedium = readUnsignedMedium();
        return (8388608 & readUnsignedMedium) != 0 ? readUnsignedMedium | (-16777216) : readUnsignedMedium;
    }

    @Override // org.jboss.netty.buffer.e
    public short readShort() {
        d(2);
        short s4 = getShort(this.f72448b);
        this.f72448b += 2;
        return s4;
    }

    @Override // org.jboss.netty.buffer.e
    public short readUnsignedByte() {
        return (short) (readByte() & 255);
    }

    @Override // org.jboss.netty.buffer.e
    public long readUnsignedInt() {
        return readInt() & 4294967295L;
    }

    @Override // org.jboss.netty.buffer.e
    public int readUnsignedMedium() {
        d(3);
        int unsignedMedium = getUnsignedMedium(this.f72448b);
        this.f72448b += 3;
        return unsignedMedium;
    }

    @Override // org.jboss.netty.buffer.e
    public int readUnsignedShort() {
        return readShort() & UShort.MAX_VALUE;
    }

    @Override // org.jboss.netty.buffer.e
    public int readableBytes() {
        return this.f72449c - this.f72448b;
    }

    @Override // org.jboss.netty.buffer.e
    public int readerIndex() {
        return this.f72448b;
    }

    @Override // org.jboss.netty.buffer.e
    public void s0(byte[] bArr, int i4, int i5) {
        d(i5);
        X(this.f72448b, bArr, i4, i5);
        this.f72448b += i5;
    }

    @Override // org.jboss.netty.buffer.e
    public void setDouble(int i4, double d5) {
        setLong(i4, Double.doubleToRawLongBits(d5));
    }

    @Override // org.jboss.netty.buffer.e
    public void setFloat(int i4, float f5) {
        setInt(i4, Float.floatToRawIntBits(f5));
    }

    @Override // org.jboss.netty.buffer.e
    public void skipBytes(int i4) {
        int i5 = this.f72448b + i4;
        if (i5 <= this.f72449c) {
            this.f72448b = i5;
            return;
        }
        throw new IndexOutOfBoundsException("Readable bytes exceeded - Need " + i5 + ", maximum is " + this.f72449c);
    }

    @Override // org.jboss.netty.buffer.e
    public void t(e eVar) {
        J(eVar, eVar.readableBytes());
    }

    @Override // org.jboss.netty.buffer.e
    public String toString(Charset charset) {
        return toString(this.f72448b, readableBytes(), charset);
    }

    @Override // org.jboss.netty.buffer.e
    public void u0(int i4) {
        if (i4 >= this.f72448b && i4 <= capacity()) {
            this.f72449c = i4;
            return;
        }
        throw new IndexOutOfBoundsException("Invalid readerIndex: " + this.f72448b + " - Maximum is " + i4);
    }

    @Override // org.jboss.netty.buffer.e
    public void w(byte[] bArr) {
        s0(bArr, 0, bArr.length);
    }

    @Override // org.jboss.netty.buffer.e
    public void w0() {
        this.f72451e = this.f72449c;
    }

    @Override // org.jboss.netty.buffer.e
    public int writableBytes() {
        return capacity() - this.f72449c;
    }

    @Override // org.jboss.netty.buffer.e
    public void writeByte(int i4) {
        int i5 = this.f72449c;
        this.f72449c = i5 + 1;
        V(i5, i4);
    }

    @Override // org.jboss.netty.buffer.e
    public int writeBytes(InputStream inputStream, int i4) throws IOException {
        int bytes = setBytes(this.f72449c, inputStream, i4);
        if (bytes > 0) {
            this.f72449c += bytes;
        }
        return bytes;
    }

    @Override // org.jboss.netty.buffer.e
    public void writeChar(int i4) {
        writeShort(i4);
    }

    @Override // org.jboss.netty.buffer.e
    public void writeDouble(double d5) {
        writeLong(Double.doubleToRawLongBits(d5));
    }

    @Override // org.jboss.netty.buffer.e
    public void writeFloat(float f5) {
        writeInt(Float.floatToRawIntBits(f5));
    }

    @Override // org.jboss.netty.buffer.e
    public void writeInt(int i4) {
        setInt(this.f72449c, i4);
        this.f72449c += 4;
    }

    @Override // org.jboss.netty.buffer.e
    public void writeLong(long j4) {
        setLong(this.f72449c, j4);
        this.f72449c += 8;
    }

    @Override // org.jboss.netty.buffer.e
    public void writeShort(int i4) {
        q0(this.f72449c, i4);
        this.f72449c += 2;
    }

    @Override // org.jboss.netty.buffer.e
    public int writerIndex() {
        return this.f72449c;
    }

    @Override // org.jboss.netty.buffer.e
    public void x(e eVar) {
        A0(eVar, eVar.writableBytes());
    }

    @Override // org.jboss.netty.buffer.e
    @Deprecated
    public String y0(String str) {
        return toString(Charset.forName(str));
    }

    @Override // org.jboss.netty.buffer.e
    public void z(int i4, e eVar) {
        G(i4, eVar, eVar.writableBytes());
    }

    @Override // org.jboss.netty.buffer.e
    public void z0(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        F0(this.f72449c, byteBuffer);
        this.f72449c += remaining;
    }

    @Override // org.jboss.netty.buffer.e
    public int bytesBefore(int i4, byte b5) {
        d(i4);
        return bytesBefore(readerIndex(), i4, b5);
    }

    @Override // org.jboss.netty.buffer.e
    public String toString(int i4, int i5, Charset charset) {
        return i5 == 0 ? "" : h.z(T(i4, i5), charset);
    }

    @Override // org.jboss.netty.buffer.e
    public String toString() {
        return getClass().getSimpleName() + "(ridx=" + this.f72448b + ", widx=" + this.f72449c + ", cap=" + capacity() + ')';
    }

    @Override // org.jboss.netty.buffer.e
    public int writeBytes(ScatteringByteChannel scatteringByteChannel, int i4) throws IOException {
        int bytes = setBytes(this.f72449c, scatteringByteChannel, i4);
        if (bytes > 0) {
            this.f72449c += bytes;
        }
        return bytes;
    }

    @Override // org.jboss.netty.buffer.e
    public int bytesBefore(int i4, int i5, byte b5) {
        int indexOf = indexOf(i4, i5 + i4, b5);
        if (indexOf < 0) {
            return -1;
        }
        return indexOf - i4;
    }
}
