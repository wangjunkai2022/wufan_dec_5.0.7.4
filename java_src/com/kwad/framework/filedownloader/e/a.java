package com.kwad.framework.filedownloader.e;

import java.io.Closeable;
/* loaded from: classes5.dex */
public interface a extends Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    void seek(long j4);

    void setLength(long j4);

    void write(byte[] bArr, int i4, int i5);

    void xm();
}
