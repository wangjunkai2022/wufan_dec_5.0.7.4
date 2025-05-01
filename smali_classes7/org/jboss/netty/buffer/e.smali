.class public interface abstract Lorg/jboss/netty/buffer/e;
.super Ljava/lang/Object;
.source "ChannelBuffer.java"

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Comparable<",
        "Lorg/jboss/netty/buffer/e;",
        ">;"
    }
.end annotation


# virtual methods
.method public abstract A0(Lorg/jboss/netty/buffer/e;I)V
.end method

.method public abstract B([B)V
.end method

.method public abstract B0(I)V
.end method

.method public abstract C()Z
.end method

.method public abstract C0(II)V
.end method

.method public abstract D(ILorg/jboss/netty/buffer/e;I)V
.end method

.method public abstract D0(Ljava/io/OutputStream;I)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public abstract E0()[Ljava/nio/ByteBuffer;
.end method

.method public abstract F(ILjava/io/OutputStream;I)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public abstract F0(ILjava/nio/ByteBuffer;)V
.end method

.method public abstract G(ILorg/jboss/netty/buffer/e;I)V
.end method

.method public abstract G0()Lorg/jboss/netty/buffer/e;
.end method

.method public abstract H(IILjava/lang/String;)Ljava/lang/String;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end method

.method public abstract H0()Z
.end method

.method public abstract I(IILorg/jboss/netty/buffer/g;)I
.end method

.method public abstract I0(Lorg/jboss/netty/buffer/g;)Lorg/jboss/netty/buffer/e;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end method

.method public abstract J(Lorg/jboss/netty/buffer/e;I)V
.end method

.method public abstract J0(Lorg/jboss/netty/buffer/g;)I
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end method

.method public abstract K()V
.end method

.method public abstract L(IILjava/lang/String;Lorg/jboss/netty/buffer/g;)Ljava/lang/String;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end method

.method public abstract M(Lorg/jboss/netty/buffer/e;II)V
.end method

.method public abstract N(II)Lorg/jboss/netty/buffer/e;
.end method

.method public abstract Q(I)Lorg/jboss/netty/buffer/e;
.end method

.method public abstract R(I)V
.end method

.method public abstract S(IILorg/jboss/netty/buffer/g;)I
.end method

.method public abstract T(II)Ljava/nio/ByteBuffer;
.end method

.method public abstract U(Ljava/nio/ByteBuffer;)V
.end method

.method public abstract V(II)V
.end method

.method public abstract X(I[BII)V
.end method

.method public abstract Y(II)[Ljava/nio/ByteBuffer;
.end method

.method public abstract Z(II)V
.end method

.method public abstract a(II)Lorg/jboss/netty/buffer/e;
.end method

.method public abstract array()[B
.end method

.method public abstract arrayOffset()I
.end method

.method public abstract b0([BII)V
.end method

.method public abstract bytesBefore(B)I
.end method

.method public abstract bytesBefore(IB)I
.end method

.method public abstract bytesBefore(IIB)I
.end method

.method public abstract c(II)V
.end method

.method public abstract c0(Lorg/jboss/netty/buffer/g;)I
.end method

.method public abstract capacity()I
.end method

.method public abstract clear()V
.end method

.method public abstract copy()Lorg/jboss/netty/buffer/e;
.end method

.method public abstract d0()Ljava/nio/ByteBuffer;
.end method

.method public abstract duplicate()Lorg/jboss/netty/buffer/e;
.end method

.method public abstract equals(Ljava/lang/Object;)Z
.end method

.method public abstract f0(Lorg/jboss/netty/buffer/e;)I
.end method

.method public abstract factory()Lorg/jboss/netty/buffer/f;
.end method

.method public abstract getByte(I)B
.end method

.method public abstract getBytes(ILjava/nio/channels/GatheringByteChannel;I)I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public abstract getChar(I)C
.end method

.method public abstract getDouble(I)D
.end method

.method public abstract getFloat(I)F
.end method

.method public abstract getInt(I)I
.end method

.method public abstract getLong(I)J
.end method

.method public abstract getMedium(I)I
.end method

.method public abstract getShort(I)S
.end method

.method public abstract getUnsignedByte(I)S
.end method

.method public abstract getUnsignedInt(I)J
.end method

.method public abstract getUnsignedMedium(I)I
.end method

.method public abstract getUnsignedShort(I)I
.end method

.method public abstract h0(ILorg/jboss/netty/buffer/g;)I
.end method

.method public abstract hasArray()Z
.end method

.method public abstract hashCode()I
.end method

.method public abstract i0()V
.end method

.method public abstract indexOf(IIB)I
.end method

.method public abstract isDirect()Z
.end method

.method public abstract j0(I)V
.end method

.method public abstract k0(I[B)V
.end method

.method public abstract l0(ILorg/jboss/netty/buffer/e;)V
.end method

.method public abstract m0(ILorg/jboss/netty/buffer/e;II)V
.end method

.method public abstract n()V
.end method

.method public abstract n0()V
.end method

.method public abstract o(Ljava/lang/String;Lorg/jboss/netty/buffer/g;)Ljava/lang/String;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end method

.method public abstract o0(I)V
.end method

.method public abstract order()Ljava/nio/ByteOrder;
.end method

.method public abstract p(Lorg/jboss/netty/buffer/g;)Lorg/jboss/netty/buffer/e;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end method

.method public abstract p0(Lorg/jboss/netty/buffer/e;II)V
.end method

.method public abstract q(I[B)V
.end method

.method public abstract q0(II)V
.end method

.method public abstract r(I)Lorg/jboss/netty/buffer/e;
.end method

.method public abstract r0(II)V
.end method

.method public abstract readByte()B
.end method

.method public abstract readBytes(Ljava/nio/channels/GatheringByteChannel;I)I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public abstract readChar()C
.end method

.method public abstract readDouble()D
.end method

.method public abstract readFloat()F
.end method

.method public abstract readInt()I
.end method

.method public abstract readLong()J
.end method

.method public abstract readMedium()I
.end method

.method public abstract readShort()S
.end method

.method public abstract readUnsignedByte()S
.end method

.method public abstract readUnsignedInt()J
.end method

.method public abstract readUnsignedMedium()I
.end method

.method public abstract readUnsignedShort()I
.end method

.method public abstract readableBytes()I
.end method

.method public abstract readerIndex()I
.end method

.method public abstract s(I[BII)V
.end method

.method public abstract s0([BII)V
.end method

.method public abstract setBytes(ILjava/io/InputStream;I)I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public abstract setBytes(ILjava/nio/channels/ScatteringByteChannel;I)I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public abstract setDouble(ID)V
.end method

.method public abstract setFloat(IF)V
.end method

.method public abstract setInt(II)V
.end method

.method public abstract setLong(IJ)V
.end method

.method public abstract skipBytes(I)V
.end method

.method public abstract t(Lorg/jboss/netty/buffer/e;)V
.end method

.method public abstract toString()Ljava/lang/String;
.end method

.method public abstract toString(IILjava/nio/charset/Charset;)Ljava/lang/String;
.end method

.method public abstract toString(Ljava/nio/charset/Charset;)Ljava/lang/String;
.end method

.method public abstract u0(I)V
.end method

.method public abstract v0(ILjava/nio/ByteBuffer;)V
.end method

.method public abstract w([B)V
.end method

.method public abstract w0()V
.end method

.method public abstract writableBytes()I
.end method

.method public abstract writeByte(I)V
.end method

.method public abstract writeBytes(Ljava/io/InputStream;I)I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public abstract writeBytes(Ljava/nio/channels/ScatteringByteChannel;I)I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public abstract writeChar(I)V
.end method

.method public abstract writeDouble(D)V
.end method

.method public abstract writeFloat(F)V
.end method

.method public abstract writeInt(I)V
.end method

.method public abstract writeLong(J)V
.end method

.method public abstract writeShort(I)V
.end method

.method public abstract writerIndex()I
.end method

.method public abstract x(Lorg/jboss/netty/buffer/e;)V
.end method

.method public abstract y(ILorg/jboss/netty/buffer/e;II)V
.end method

.method public abstract y0(Ljava/lang/String;)Ljava/lang/String;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end method

.method public abstract z(ILorg/jboss/netty/buffer/e;)V
.end method

.method public abstract z0(Ljava/nio/ByteBuffer;)V
.end method
