package org.jboss.netty.buffer;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
/* compiled from: ChannelBufferFactory.java */
/* loaded from: classes7.dex */
public interface f {
    e a(int i4);

    e b(ByteOrder byteOrder, byte[] bArr, int i4, int i5);

    e c(ByteBuffer byteBuffer);

    ByteOrder d();

    e e(byte[] bArr, int i4, int i5);

    e f(ByteOrder byteOrder, int i4);
}
