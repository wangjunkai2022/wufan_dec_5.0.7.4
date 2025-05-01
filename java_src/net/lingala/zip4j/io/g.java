package net.lingala.zip4j.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import net.lingala.zip4j.exception.ZipException;
/* compiled from: SplitOutputStream.java */
/* loaded from: classes7.dex */
public class g extends OutputStream {

    /* renamed from: b  reason: collision with root package name */
    private RandomAccessFile f71818b;

    /* renamed from: c  reason: collision with root package name */
    private long f71819c;

    /* renamed from: d  reason: collision with root package name */
    private File f71820d;

    /* renamed from: e  reason: collision with root package name */
    private File f71821e;

    /* renamed from: f  reason: collision with root package name */
    private int f71822f;

    /* renamed from: g  reason: collision with root package name */
    private long f71823g;

    public g(String str) throws FileNotFoundException, ZipException {
        this(net.lingala.zip4j.util.h.A(str) ? new File(str) : null);
    }

    private boolean j(byte[] bArr) {
        if (bArr != null && bArr.length >= 4) {
            int e5 = net.lingala.zip4j.util.f.e(bArr, 0);
            long[] l4 = net.lingala.zip4j.util.h.l();
            if (l4 != null && l4.length > 0) {
                for (int i4 = 0; i4 < l4.length; i4++) {
                    if (l4[i4] != 134695760 && l4[i4] == e5) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private void l() throws IOException {
        String stringBuffer;
        File file;
        try {
            String z4 = net.lingala.zip4j.util.h.z(this.f71821e.getName());
            String absolutePath = this.f71820d.getAbsolutePath();
            if (this.f71821e.getParent() == null) {
                stringBuffer = "";
            } else {
                StringBuffer stringBuffer2 = new StringBuffer(String.valueOf(this.f71821e.getParent()));
                stringBuffer2.append(System.getProperty("file.separator"));
                stringBuffer = stringBuffer2.toString();
            }
            if (this.f71822f < 9) {
                StringBuffer stringBuffer3 = new StringBuffer(String.valueOf(stringBuffer));
                stringBuffer3.append(z4);
                stringBuffer3.append(".z0");
                stringBuffer3.append(this.f71822f + 1);
                file = new File(stringBuffer3.toString());
            } else {
                StringBuffer stringBuffer4 = new StringBuffer(String.valueOf(stringBuffer));
                stringBuffer4.append(z4);
                stringBuffer4.append(".z");
                stringBuffer4.append(this.f71822f + 1);
                file = new File(stringBuffer4.toString());
            }
            this.f71818b.close();
            if (!file.exists()) {
                if (this.f71820d.renameTo(file)) {
                    this.f71820d = new File(absolutePath);
                    this.f71818b = new RandomAccessFile(this.f71820d, net.lingala.zip4j.util.e.f71861e0);
                    this.f71822f++;
                    return;
                }
                throw new IOException("cannot rename newly created split file");
            }
            StringBuffer stringBuffer5 = new StringBuffer("split file: ");
            stringBuffer5.append(file.getName());
            stringBuffer5.append(" already exists in the current directory, cannot rename this file");
            throw new IOException(stringBuffer5.toString());
        } catch (ZipException e5) {
            throw new IOException(e5.getMessage());
        }
    }

    public boolean a(int i4) throws ZipException {
        if (i4 >= 0) {
            if (h(i4)) {
                return false;
            }
            try {
                l();
                this.f71823g = 0L;
                return true;
            } catch (IOException e5) {
                throw new ZipException(e5);
            }
        }
        throw new ZipException("negative buffersize for checkBuffSizeAndStartNextSplitFile");
    }

    public int b() {
        return this.f71822f;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        RandomAccessFile randomAccessFile = this.f71818b;
        if (randomAccessFile != null) {
            randomAccessFile.close();
        }
    }

    public long d() throws IOException {
        return this.f71818b.getFilePointer();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
    }

    public long g() {
        return this.f71819c;
    }

    public boolean h(int i4) throws ZipException {
        if (i4 >= 0) {
            long j4 = this.f71819c;
            return j4 < 65536 || this.f71823g + ((long) i4) <= j4;
        }
        throw new ZipException("negative buffersize for isBuffSizeFitForCurrSplitFile");
    }

    public boolean k() {
        return this.f71819c != -1;
    }

    public void seek(long j4) throws IOException {
        this.f71818b.seek(j4);
    }

    @Override // java.io.OutputStream
    public void write(int i4) throws IOException {
        write(new byte[]{(byte) i4}, 0, 1);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    public g(File file) throws FileNotFoundException, ZipException {
        this(file, -1L);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i4, int i5) throws IOException {
        if (i5 <= 0) {
            return;
        }
        long j4 = this.f71819c;
        if (j4 == -1) {
            this.f71818b.write(bArr, i4, i5);
            this.f71823g += i5;
        } else if (j4 >= 65536) {
            long j5 = this.f71823g;
            if (j5 >= j4) {
                l();
                this.f71818b.write(bArr, i4, i5);
                this.f71823g = i5;
                return;
            }
            long j6 = i5;
            if (j5 + j6 > j4) {
                if (j(bArr)) {
                    l();
                    this.f71818b.write(bArr, i4, i5);
                    this.f71823g = j6;
                    return;
                }
                this.f71818b.write(bArr, i4, (int) (this.f71819c - this.f71823g));
                l();
                RandomAccessFile randomAccessFile = this.f71818b;
                long j7 = this.f71819c;
                long j8 = this.f71823g;
                randomAccessFile.write(bArr, i4 + ((int) (j7 - j8)), (int) (j6 - (j7 - j8)));
                this.f71823g = j6 - (this.f71819c - this.f71823g);
                return;
            }
            this.f71818b.write(bArr, i4, i5);
            this.f71823g += j6;
        } else {
            throw new IOException("split length less than minimum allowed split length of 65536 Bytes");
        }
    }

    public g(String str, long j4) throws FileNotFoundException, ZipException {
        this(!net.lingala.zip4j.util.h.A(str) ? new File(str) : null, j4);
    }

    public g(File file, long j4) throws FileNotFoundException, ZipException {
        if (j4 >= 0 && j4 < 65536) {
            throw new ZipException("split length less than minimum allowed split length of 65536 Bytes");
        }
        this.f71818b = new RandomAccessFile(file, net.lingala.zip4j.util.e.f71861e0);
        this.f71819c = j4;
        this.f71821e = file;
        this.f71820d = file;
        this.f71822f = 0;
        this.f71823g = 0L;
    }
}
