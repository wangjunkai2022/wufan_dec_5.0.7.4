package com.beizi.ad.internal.b.a;

import com.beizi.ad.internal.b.m;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
/* compiled from: FileCache.java */
/* loaded from: classes2.dex */
public class b implements com.beizi.ad.internal.b.a {

    /* renamed from: a  reason: collision with root package name */
    public File f5769a;

    /* renamed from: b  reason: collision with root package name */
    private final a f5770b;

    /* renamed from: c  reason: collision with root package name */
    private RandomAccessFile f5771c;

    public b(File file, a aVar) throws m {
        File file2;
        try {
            if (aVar != null) {
                this.f5770b = aVar;
                d.a(file.getParentFile());
                boolean exists = file.exists();
                if (exists) {
                    file2 = file;
                } else {
                    File parentFile = file.getParentFile();
                    file2 = new File(parentFile, file.getName() + ".download");
                }
                this.f5769a = file2;
                this.f5771c = new RandomAccessFile(this.f5769a, exists ? "r" : net.lingala.zip4j.util.e.f71861e0);
                return;
            }
            throw new NullPointerException();
        } catch (IOException e5) {
            throw new m("Error using file " + file + " as disc cache", e5);
        }
    }

    @Override // com.beizi.ad.internal.b.a
    public synchronized int a() throws m {
        try {
        } catch (IOException e5) {
            throw new m("Error reading length of file " + this.f5769a, e5);
        }
        return (int) this.f5771c.length();
    }

    @Override // com.beizi.ad.internal.b.a
    public synchronized void b() throws m {
        try {
            this.f5771c.close();
            this.f5770b.a(this.f5769a);
        } catch (IOException e5) {
            throw new m("Error closing file " + this.f5769a, e5);
        }
    }

    @Override // com.beizi.ad.internal.b.a
    public synchronized void c() throws m {
        if (d()) {
            return;
        }
        b();
        File file = new File(this.f5769a.getParentFile(), this.f5769a.getName().substring(0, this.f5769a.getName().length() - 9));
        if (this.f5769a.renameTo(file)) {
            this.f5769a = file;
            try {
                this.f5771c = new RandomAccessFile(this.f5769a, "r");
                return;
            } catch (IOException e5) {
                throw new m("Error opening " + this.f5769a + " as disc cache", e5);
            }
        }
        throw new m("Error renaming file " + this.f5769a + " to " + file + " for completion!");
    }

    @Override // com.beizi.ad.internal.b.a
    public synchronized boolean d() {
        return !a(this.f5769a);
    }

    @Override // com.beizi.ad.internal.b.a
    public synchronized int a(byte[] bArr, long j4, int i4) throws m {
        try {
            this.f5771c.seek(j4);
        } catch (IOException e5) {
            throw new m(String.format("Error reading %d bytes with offset %d failFrom file[%d bytes] to buffer[%d bytes]", Integer.valueOf(i4), Long.valueOf(j4), Integer.valueOf(a()), Integer.valueOf(bArr.length)), e5);
        }
        return this.f5771c.read(bArr, 0, i4);
    }

    @Override // com.beizi.ad.internal.b.a
    public synchronized void a(byte[] bArr, int i4) throws m {
        try {
            if (!d()) {
                this.f5771c.seek(a());
                this.f5771c.write(bArr, 0, i4);
            } else {
                throw new m("Error append cache: cache file " + this.f5769a + " is completed!");
            }
        } catch (IOException e5) {
            throw new m(String.format("Error writing %d bytes to %s failFrom buffer with size %d", Integer.valueOf(i4), this.f5771c, Integer.valueOf(bArr.length)), e5);
        }
    }

    private boolean a(File file) {
        return file.getName().endsWith(".download");
    }
}
