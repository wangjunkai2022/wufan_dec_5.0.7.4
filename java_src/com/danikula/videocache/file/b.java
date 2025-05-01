package com.danikula.videocache.file;

import com.danikula.videocache.ProxyCacheException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
/* compiled from: FileCache.java */
/* loaded from: classes2.dex */
public class b implements com.danikula.videocache.c {

    /* renamed from: d  reason: collision with root package name */
    private static final String f10065d = ".download";

    /* renamed from: a  reason: collision with root package name */
    private final a f10066a;

    /* renamed from: b  reason: collision with root package name */
    public File f10067b;

    /* renamed from: c  reason: collision with root package name */
    private RandomAccessFile f10068c;

    public b(File file) throws ProxyCacheException {
        this(file, new i());
    }

    private boolean d(File file) {
        return file.getName().endsWith(f10065d);
    }

    @Override // com.danikula.videocache.c
    public synchronized void a(byte[] bArr, int i4) throws ProxyCacheException {
        try {
            if (!isCompleted()) {
                this.f10068c.seek(available());
                this.f10068c.write(bArr, 0, i4);
            } else {
                throw new ProxyCacheException("Error append cache: cache file " + this.f10067b + " is completed!");
            }
        } catch (IOException e5) {
            throw new ProxyCacheException(String.format("Error writing %d bytes to %s from buffer with size %d", Integer.valueOf(i4), this.f10068c, Integer.valueOf(bArr.length)), e5);
        }
    }

    @Override // com.danikula.videocache.c
    public synchronized long available() throws ProxyCacheException {
        try {
        } catch (IOException e5) {
            throw new ProxyCacheException("Error reading length of file " + this.f10067b, e5);
        }
        return (int) this.f10068c.length();
    }

    @Override // com.danikula.videocache.c
    public synchronized int b(byte[] bArr, long j4, int i4) throws ProxyCacheException {
        try {
            this.f10068c.seek(j4);
        } catch (IOException e5) {
            throw new ProxyCacheException(String.format("Error reading %d bytes with offset %d from file[%d bytes] to buffer[%d bytes]", Integer.valueOf(i4), Long.valueOf(j4), Long.valueOf(available()), Integer.valueOf(bArr.length)), e5);
        }
        return this.f10068c.read(bArr, 0, i4);
    }

    public File c() {
        return this.f10067b;
    }

    @Override // com.danikula.videocache.c
    public synchronized void close() throws ProxyCacheException {
        try {
            this.f10068c.close();
            this.f10066a.a(this.f10067b);
        } catch (IOException e5) {
            throw new ProxyCacheException("Error closing file " + this.f10067b, e5);
        }
    }

    @Override // com.danikula.videocache.c
    public synchronized void complete() throws ProxyCacheException {
        if (isCompleted()) {
            return;
        }
        close();
        File file = new File(this.f10067b.getParentFile(), this.f10067b.getName().substring(0, this.f10067b.getName().length() - 9));
        if (this.f10067b.renameTo(file)) {
            this.f10067b = file;
            try {
                this.f10068c = new RandomAccessFile(this.f10067b, "r");
                this.f10066a.a(this.f10067b);
                return;
            } catch (IOException e5) {
                throw new ProxyCacheException("Error opening " + this.f10067b + " as disc cache", e5);
            }
        }
        throw new ProxyCacheException("Error renaming file " + this.f10067b + " to " + file + " for completion!");
    }

    @Override // com.danikula.videocache.c
    public synchronized boolean isCompleted() {
        return !d(this.f10067b);
    }

    public b(File file, a aVar) throws ProxyCacheException {
        File file2;
        try {
            if (aVar != null) {
                this.f10066a = aVar;
                d.b(file.getParentFile());
                boolean exists = file.exists();
                if (exists) {
                    file2 = file;
                } else {
                    File parentFile = file.getParentFile();
                    file2 = new File(parentFile, file.getName() + f10065d);
                }
                this.f10067b = file2;
                this.f10068c = new RandomAccessFile(this.f10067b, exists ? "r" : net.lingala.zip4j.util.e.f71861e0);
                return;
            }
            throw new NullPointerException();
        } catch (IOException e5) {
            throw new ProxyCacheException("Error using file " + file + " as disc cache", e5);
        }
    }
}
