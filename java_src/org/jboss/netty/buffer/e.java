package org.jboss.netty.buffer;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.GatheringByteChannel;
import java.nio.channels.ScatteringByteChannel;
import java.nio.charset.Charset;
/* compiled from: ChannelBuffer.java */
/* loaded from: classes7.dex */
public interface e extends Comparable<e> {
    void A0(e eVar, int i4);

    void B(byte[] bArr);

    void B0(int i4);

    boolean C();

    void C0(int i4, int i5);

    void D(int i4, e eVar, int i5);

    void D0(OutputStream outputStream, int i4) throws IOException;

    ByteBuffer[] E0();

    void F(int i4, OutputStream outputStream, int i5) throws IOException;

    void F0(int i4, ByteBuffer byteBuffer);

    void G(int i4, e eVar, int i5);

    e G0();

    @Deprecated
    String H(int i4, int i5, String str);

    boolean H0();

    int I(int i4, int i5, g gVar);

    @Deprecated
    e I0(g gVar);

    void J(e eVar, int i4);

    @Deprecated
    int J0(g gVar);

    void K();

    @Deprecated
    String L(int i4, int i5, String str, g gVar);

    void M(e eVar, int i4, int i5);

    e N(int i4, int i5);

    e Q(int i4);

    void R(int i4);

    int S(int i4, int i5, g gVar);

    ByteBuffer T(int i4, int i5);

    void U(ByteBuffer byteBuffer);

    void V(int i4, int i5);

    void X(int i4, byte[] bArr, int i5, int i6);

    ByteBuffer[] Y(int i4, int i5);

    void Z(int i4, int i5);

    e a(int i4, int i5);

    byte[] array();

    int arrayOffset();

    void b0(byte[] bArr, int i4, int i5);

    int bytesBefore(byte b5);

    int bytesBefore(int i4, byte b5);

    int bytesBefore(int i4, int i5, byte b5);

    void c(int i4, int i5);

    int c0(g gVar);

    int capacity();

    void clear();

    e copy();

    ByteBuffer d0();

    e duplicate();

    boolean equals(Object obj);

    int f0(e eVar);

    f factory();

    byte getByte(int i4);

    int getBytes(int i4, GatheringByteChannel gatheringByteChannel, int i5) throws IOException;

    char getChar(int i4);

    double getDouble(int i4);

    float getFloat(int i4);

    int getInt(int i4);

    long getLong(int i4);

    int getMedium(int i4);

    short getShort(int i4);

    short getUnsignedByte(int i4);

    long getUnsignedInt(int i4);

    int getUnsignedMedium(int i4);

    int getUnsignedShort(int i4);

    int h0(int i4, g gVar);

    boolean hasArray();

    int hashCode();

    void i0();

    int indexOf(int i4, int i5, byte b5);

    boolean isDirect();

    void j0(int i4);

    void k0(int i4, byte[] bArr);

    void l0(int i4, e eVar);

    void m0(int i4, e eVar, int i5, int i6);

    void n();

    void n0();

    @Deprecated
    String o(String str, g gVar);

    void o0(int i4);

    ByteOrder order();

    @Deprecated
    e p(g gVar);

    void p0(e eVar, int i4, int i5);

    void q(int i4, byte[] bArr);

    void q0(int i4, int i5);

    e r(int i4);

    void r0(int i4, int i5);

    byte readByte();

    int readBytes(GatheringByteChannel gatheringByteChannel, int i4) throws IOException;

    char readChar();

    double readDouble();

    float readFloat();

    int readInt();

    long readLong();

    int readMedium();

    short readShort();

    short readUnsignedByte();

    long readUnsignedInt();

    int readUnsignedMedium();

    int readUnsignedShort();

    int readableBytes();

    int readerIndex();

    void s(int i4, byte[] bArr, int i5, int i6);

    void s0(byte[] bArr, int i4, int i5);

    int setBytes(int i4, InputStream inputStream, int i5) throws IOException;

    int setBytes(int i4, ScatteringByteChannel scatteringByteChannel, int i5) throws IOException;

    void setDouble(int i4, double d5);

    void setFloat(int i4, float f5);

    void setInt(int i4, int i5);

    void setLong(int i4, long j4);

    void skipBytes(int i4);

    void t(e eVar);

    String toString();

    String toString(int i4, int i5, Charset charset);

    String toString(Charset charset);

    void u0(int i4);

    void v0(int i4, ByteBuffer byteBuffer);

    void w(byte[] bArr);

    void w0();

    int writableBytes();

    void writeByte(int i4);

    int writeBytes(InputStream inputStream, int i4) throws IOException;

    int writeBytes(ScatteringByteChannel scatteringByteChannel, int i4) throws IOException;

    void writeChar(int i4);

    void writeDouble(double d5);

    void writeFloat(float f5);

    void writeInt(int i4);

    void writeLong(long j4);

    void writeShort(int i4);

    int writerIndex();

    void x(e eVar);

    void y(int i4, e eVar, int i5, int i6);

    @Deprecated
    String y0(String str);

    void z(int i4, e eVar);

    void z0(ByteBuffer byteBuffer);
}
