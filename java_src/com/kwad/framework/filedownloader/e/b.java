package com.kwad.framework.filedownloader.e;

import com.kwad.framework.filedownloader.f.c;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.RandomAccessFile;
import net.lingala.zip4j.util.e;
/* loaded from: classes5.dex */
public final class b implements com.kwad.framework.filedownloader.e.a {
    private final BufferedOutputStream aiW;
    private final RandomAccessFile aiX;
    private final FileDescriptor fd;

    /* loaded from: classes5.dex */
    public static class a implements c.e {
        @Override // com.kwad.framework.filedownloader.f.c.e
        public final com.kwad.framework.filedownloader.e.a c(File file) {
            return new b(file);
        }
    }

    b(File file) {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, e.f71861e0);
        this.aiX = randomAccessFile;
        this.fd = randomAccessFile.getFD();
        this.aiW = new BufferedOutputStream(new FileOutputStream(randomAccessFile.getFD()));
    }

    @Override // com.kwad.framework.filedownloader.e.a, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.aiW.close();
        this.aiX.close();
    }

    @Override // com.kwad.framework.filedownloader.e.a
    public final void seek(long j4) {
        this.aiX.seek(j4);
    }

    @Override // com.kwad.framework.filedownloader.e.a
    public final void setLength(long j4) {
        this.aiX.setLength(j4);
    }

    @Override // com.kwad.framework.filedownloader.e.a
    public final void write(byte[] bArr, int i4, int i5) {
        this.aiW.write(bArr, 0, i5);
    }

    @Override // com.kwad.framework.filedownloader.e.a
    public final void xm() {
        this.aiW.flush();
        this.fd.sync();
    }
}
