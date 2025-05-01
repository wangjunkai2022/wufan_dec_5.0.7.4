package com.facebook.imagepipeline.memory;

import java.nio.ByteBuffer;
import javax.annotation.Nullable;
/* compiled from: MemoryChunk.java */
/* loaded from: classes.dex */
public interface t {
    int c(int i4, byte[] bArr, int i5, int i6);

    void close();

    @Nullable
    ByteBuffer e();

    byte f(int i4);

    int getSize();

    long i() throws UnsupportedOperationException;

    boolean isClosed();

    long l();

    int p(int i4, byte[] bArr, int i5, int i6);

    void r(int i4, t tVar, int i5, int i6);
}
