package com.facebook.common.memory;

import java.io.IOException;
import java.io.InputStream;
/* compiled from: PooledByteBufferFactory.java */
/* loaded from: classes2.dex */
public interface g {
    PooledByteBuffer a(InputStream inputStream) throws IOException;

    PooledByteBuffer b(InputStream inputStream, int i4) throws IOException;

    i c();

    PooledByteBuffer d(byte[] bArr);

    PooledByteBuffer e(int i4);

    i f(int i4);
}
