package com.ss.android.socialbase.downloader.model;

import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.wv.u;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import net.lingala.zip4j.util.e;
/* loaded from: classes5.dex */
public class o implements Closeable {

    /* renamed from: m  reason: collision with root package name */
    private FileDescriptor f61226m;

    /* renamed from: p  reason: collision with root package name */
    private RandomAccessFile f61227p;
    private BufferedOutputStream vv;

    public o(File file, int i4) throws BaseException {
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, e.f71861e0);
            this.f61227p = randomAccessFile;
            this.f61226m = randomAccessFile.getFD();
            if (i4 > 0) {
                if (i4 < 8192) {
                    i4 = 8192;
                } else if (i4 > 131072) {
                    i4 = 131072;
                }
                this.vv = new BufferedOutputStream(new FileOutputStream(this.f61227p.getFD()), i4);
                return;
            }
            this.vv = new BufferedOutputStream(new FileOutputStream(this.f61227p.getFD()));
        } catch (IOException e5) {
            throw new BaseException(1039, e5);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        u.vv(this.f61227p, this.vv);
    }

    public void m() throws IOException {
        BufferedOutputStream bufferedOutputStream = this.vv;
        if (bufferedOutputStream != null) {
            bufferedOutputStream.flush();
        }
    }

    public void p() throws IOException {
        FileDescriptor fileDescriptor = this.f61226m;
        if (fileDescriptor != null) {
            fileDescriptor.sync();
        }
    }

    public void vv(byte[] bArr, int i4, int i5) throws IOException {
        this.vv.write(bArr, i4, i5);
    }

    public void vv() throws IOException {
        BufferedOutputStream bufferedOutputStream = this.vv;
        if (bufferedOutputStream != null) {
            bufferedOutputStream.flush();
        }
        FileDescriptor fileDescriptor = this.f61226m;
        if (fileDescriptor != null) {
            fileDescriptor.sync();
        }
    }

    public void m(long j4) throws IOException {
        this.f61227p.setLength(j4);
    }

    public void vv(long j4) throws IOException {
        this.f61227p.seek(j4);
    }
}
