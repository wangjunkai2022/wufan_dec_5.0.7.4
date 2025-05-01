package com.googlecode.mp4parser;

import java.io.Closeable;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
/* compiled from: DataSource.java */
/* loaded from: classes3.dex */
public interface e extends Closeable {
    void G(long j4) throws IOException;

    ByteBuffer Q(long j4, long j5) throws IOException;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close() throws IOException;

    long m(long j4, long j5, WritableByteChannel writableByteChannel) throws IOException;

    long position() throws IOException;

    int read(ByteBuffer byteBuffer) throws IOException;

    long size() throws IOException;
}
