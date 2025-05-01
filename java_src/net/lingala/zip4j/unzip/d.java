package net.lingala.zip4j.unzip;

import com.join.mgps.Util.h0;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.zip.CRC32;
import net.lingala.zip4j.exception.ZipException;
import net.lingala.zip4j.util.f;
import w3.h;
import w3.i;
import w3.k;
import w3.o;
/* compiled from: UnzipEngine.java */
/* loaded from: classes7.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private o f71837a;

    /* renamed from: b  reason: collision with root package name */
    private h f71838b;

    /* renamed from: c  reason: collision with root package name */
    private int f71839c = 0;

    /* renamed from: d  reason: collision with root package name */
    private i f71840d;

    /* renamed from: e  reason: collision with root package name */
    private net.lingala.zip4j.crypto.c f71841e;

    /* renamed from: f  reason: collision with root package name */
    private CRC32 f71842f;

    public d(o oVar, h hVar) throws ZipException {
        if (oVar != null && hVar != null) {
            this.f71837a = oVar;
            this.f71838b = hVar;
            this.f71842f = new CRC32();
            return;
        }
        throw new ZipException("Invalid parameters passed to StoreUnzip. One or more of the parameters were null");
    }

    private int a(w3.a aVar) throws ZipException {
        if (aVar != null) {
            int a5 = aVar.a();
            if (a5 != 1) {
                if (a5 != 2) {
                    if (a5 == 3) {
                        return 16;
                    }
                    throw new ZipException("unable to determine salt length: invalid aes key strength");
                }
                return 12;
            }
            return 8;
        }
        throw new ZipException("unable to determine salt length: AESExtraDataRecord is null");
    }

    private boolean c() throws ZipException {
        RandomAccessFile randomAccessFile = null;
        try {
            try {
                RandomAccessFile d5 = d();
                if (d5 == null) {
                    d5 = new RandomAccessFile(new File(this.f71837a.l()), "r");
                }
                i o4 = new u3.a(d5).o(this.f71838b);
                this.f71840d = o4;
                if (o4 != null) {
                    if (o4.c() != this.f71838b.f()) {
                        try {
                            d5.close();
                            return false;
                        } catch (IOException | Exception unused) {
                            return false;
                        }
                    }
                    try {
                        d5.close();
                        return true;
                    } catch (IOException | Exception unused2) {
                        return true;
                    }
                }
                throw new ZipException("error reading local file header. Is this a valid zip file?");
            } catch (FileNotFoundException e5) {
                throw new ZipException(e5);
            }
        } catch (Throwable th) {
            if (0 != 0) {
                try {
                    randomAccessFile.close();
                } catch (IOException | Exception unused3) {
                }
            }
            throw th;
        }
    }

    private RandomAccessFile d() throws ZipException {
        String stringBuffer;
        if (this.f71837a.n()) {
            int i4 = this.f71838b.i();
            int i5 = i4 + 1;
            this.f71839c = i5;
            String l4 = this.f71837a.l();
            if (i4 == this.f71837a.e().d()) {
                stringBuffer = this.f71837a.l();
            } else if (i4 >= 9) {
                StringBuffer stringBuffer2 = new StringBuffer(String.valueOf(l4.substring(0, l4.lastIndexOf(h0.f27805a))));
                stringBuffer2.append(".z");
                stringBuffer2.append(i5);
                stringBuffer = stringBuffer2.toString();
            } else {
                StringBuffer stringBuffer3 = new StringBuffer(String.valueOf(l4.substring(0, l4.lastIndexOf(h0.f27805a))));
                stringBuffer3.append(".z0");
                stringBuffer3.append(i5);
                stringBuffer = stringBuffer3.toString();
            }
            try {
                RandomAccessFile randomAccessFile = new RandomAccessFile(stringBuffer, "r");
                if (this.f71839c == 1) {
                    byte[] bArr = new byte[4];
                    randomAccessFile.read(bArr);
                    if (f.e(bArr, 0) != 134695760) {
                        throw new ZipException("invalid first part split file signature");
                    }
                }
                return randomAccessFile;
            } catch (FileNotFoundException e5) {
                throw new ZipException(e5);
            } catch (IOException e6) {
                throw new ZipException(e6);
            }
        }
        return null;
    }

    private void e(InputStream inputStream, OutputStream outputStream) throws ZipException {
        if (inputStream != null) {
            try {
                try {
                    inputStream.close();
                } catch (IOException e5) {
                    if (net.lingala.zip4j.util.h.A(e5.getMessage()) && e5.getMessage().indexOf(" - Wrong Password?") >= 0) {
                        throw new ZipException(e5.getMessage());
                    }
                    return;
                }
            } catch (Throwable th) {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (IOException unused) {
                    }
                }
                throw th;
            }
        }
        if (outputStream == null) {
            return;
        }
        try {
            outputStream.close();
        } catch (IOException unused2) {
        }
    }

    private RandomAccessFile f(String str) throws ZipException {
        o oVar = this.f71837a;
        if (oVar != null && net.lingala.zip4j.util.h.A(oVar.l())) {
            try {
                if (this.f71837a.n()) {
                    return d();
                }
                return new RandomAccessFile(new File(this.f71837a.l()), str);
            } catch (FileNotFoundException e5) {
                throw new ZipException(e5);
            } catch (Exception e6) {
                throw new ZipException(e6);
            }
        }
        throw new ZipException("input parameter is null in getFilePointer");
    }

    private byte[] g(RandomAccessFile randomAccessFile) throws ZipException {
        try {
            byte[] bArr = new byte[2];
            randomAccessFile.read(bArr);
            return bArr;
        } catch (IOException e5) {
            throw new ZipException(e5);
        }
    }

    private byte[] h(RandomAccessFile randomAccessFile) throws ZipException {
        if (this.f71840d.a() == null) {
            return null;
        }
        try {
            byte[] bArr = new byte[a(this.f71840d.a())];
            randomAccessFile.seek(this.f71840d.n());
            randomAccessFile.read(bArr);
            return bArr;
        } catch (IOException e5) {
            throw new ZipException(e5);
        }
    }

    private String m(String str, String str2) throws ZipException {
        if (!net.lingala.zip4j.util.h.A(str2)) {
            str2 = this.f71838b.p();
        }
        StringBuffer stringBuffer = new StringBuffer(String.valueOf(str));
        stringBuffer.append(System.getProperty("file.separator"));
        stringBuffer.append(str2);
        return stringBuffer.toString();
    }

    private FileOutputStream n(String str, String str2) throws ZipException {
        if (net.lingala.zip4j.util.h.A(str)) {
            try {
                File file = new File(m(str, str2));
                if (!file.getParentFile().exists()) {
                    file.getParentFile().mkdirs();
                }
                if (file.exists()) {
                    file.delete();
                }
                return new FileOutputStream(file);
            } catch (FileNotFoundException e5) {
                throw new ZipException(e5);
            }
        }
        throw new ZipException("invalid output path");
    }

    private byte[] o(RandomAccessFile randomAccessFile) throws ZipException {
        try {
            byte[] bArr = new byte[12];
            randomAccessFile.seek(this.f71840d.n());
            randomAccessFile.read(bArr, 0, 12);
            return bArr;
        } catch (IOException e5) {
            throw new ZipException(e5);
        } catch (Exception e6) {
            throw new ZipException(e6);
        }
    }

    private void q(RandomAccessFile randomAccessFile) throws ZipException {
        if (this.f71840d != null) {
            try {
                r(randomAccessFile);
                return;
            } catch (ZipException e5) {
                throw e5;
            } catch (Exception e6) {
                throw new ZipException(e6);
            }
        }
        throw new ZipException("local file header is null, cannot initialize input stream");
    }

    private void r(RandomAccessFile randomAccessFile) throws ZipException {
        i iVar = this.f71840d;
        if (iVar != null) {
            if (iVar.u()) {
                if (this.f71840d.f() == 0) {
                    this.f71841e = new net.lingala.zip4j.crypto.e(this.f71838b, o(randomAccessFile));
                    return;
                } else if (this.f71840d.f() == 99) {
                    this.f71841e = new net.lingala.zip4j.crypto.a(this.f71840d, h(randomAccessFile), g(randomAccessFile));
                    return;
                } else {
                    throw new ZipException("unsupported encryption method");
                }
            }
            return;
        }
        throw new ZipException("local file header is null, cannot init decrypter");
    }

    public void b() throws ZipException {
        h hVar = this.f71838b;
        if (hVar != null) {
            if (hVar.j() == 99) {
                net.lingala.zip4j.crypto.c cVar = this.f71841e;
                if (cVar == null || !(cVar instanceof net.lingala.zip4j.crypto.a)) {
                    return;
                }
                byte[] d5 = ((net.lingala.zip4j.crypto.a) cVar).d();
                byte[] g4 = ((net.lingala.zip4j.crypto.a) this.f71841e).g();
                byte[] bArr = new byte[10];
                if (g4 != null) {
                    System.arraycopy(d5, 0, bArr, 0, 10);
                    if (Arrays.equals(bArr, g4)) {
                        return;
                    }
                    StringBuffer stringBuffer = new StringBuffer("invalid CRC (MAC) for file: ");
                    stringBuffer.append(this.f71838b.p());
                    throw new ZipException(stringBuffer.toString());
                }
                StringBuffer stringBuffer2 = new StringBuffer("CRC (MAC) check failed for ");
                stringBuffer2.append(this.f71838b.p());
                throw new ZipException(stringBuffer2.toString());
            } else if ((this.f71842f.getValue() & 4294967295L) != this.f71838b.g()) {
                StringBuffer stringBuffer3 = new StringBuffer("invalid CRC for file: ");
                stringBuffer3.append(this.f71838b.p());
                String stringBuffer4 = stringBuffer3.toString();
                if (this.f71840d.u() && this.f71840d.f() == 0) {
                    StringBuffer stringBuffer5 = new StringBuffer(String.valueOf(stringBuffer4));
                    stringBuffer5.append(" - Wrong Password?");
                    stringBuffer4 = stringBuffer5.toString();
                }
                throw new ZipException(stringBuffer4);
            }
        }
    }

    public net.lingala.zip4j.crypto.c i() {
        return this.f71841e;
    }

    public h j() {
        return this.f71838b;
    }

    public net.lingala.zip4j.io.h k() throws ZipException {
        long j4;
        net.lingala.zip4j.crypto.c cVar;
        if (this.f71838b != null) {
            RandomAccessFile randomAccessFile = null;
            try {
                RandomAccessFile f5 = f("r");
                if (c()) {
                    q(f5);
                    long b5 = this.f71840d.b();
                    long n4 = this.f71840d.n();
                    if (this.f71840d.u()) {
                        if (this.f71840d.f() == 99) {
                            if (this.f71841e instanceof net.lingala.zip4j.crypto.a) {
                                b5 -= (((net.lingala.zip4j.crypto.a) cVar).f() + ((net.lingala.zip4j.crypto.a) this.f71841e).e()) + 10;
                                j4 = ((net.lingala.zip4j.crypto.a) this.f71841e).f() + ((net.lingala.zip4j.crypto.a) this.f71841e).e();
                            } else {
                                StringBuffer stringBuffer = new StringBuffer("invalid decryptor when trying to calculate compressed size for AES encrypted file: ");
                                stringBuffer.append(this.f71838b.p());
                                throw new ZipException(stringBuffer.toString());
                            }
                        } else if (this.f71840d.f() == 0) {
                            j4 = 12;
                            b5 -= 12;
                        }
                        n4 += j4;
                    }
                    long j5 = b5;
                    long j6 = n4;
                    int f6 = this.f71838b.f();
                    if (this.f71838b.j() == 99) {
                        if (this.f71838b.d() != null) {
                            f6 = this.f71838b.d().b();
                        } else {
                            StringBuffer stringBuffer2 = new StringBuffer("AESExtraDataRecord does not exist for AES encrypted file: ");
                            stringBuffer2.append(this.f71838b.p());
                            throw new ZipException(stringBuffer2.toString());
                        }
                    }
                    f5.seek(j6);
                    if (f6 != 0) {
                        if (f6 == 8) {
                            return new net.lingala.zip4j.io.h(new net.lingala.zip4j.io.e(f5, j6, j5, this));
                        }
                        throw new ZipException("compression type not supported");
                    }
                    return new net.lingala.zip4j.io.h(new net.lingala.zip4j.io.f(f5, j6, j5, this));
                }
                throw new ZipException("local header and file header do not match");
            } catch (ZipException e5) {
                if (0 != 0) {
                    try {
                        randomAccessFile.close();
                    } catch (IOException unused) {
                    }
                }
                throw e5;
            } catch (Exception e6) {
                if (0 != 0) {
                    try {
                        randomAccessFile.close();
                    } catch (IOException unused2) {
                    }
                }
                throw new ZipException(e6);
            }
        }
        throw new ZipException("file header is null, cannot get inputstream");
    }

    public i l() {
        return this.f71840d;
    }

    public o p() {
        return this.f71837a;
    }

    public RandomAccessFile s() throws IOException, FileNotFoundException {
        String stringBuffer;
        String l4 = this.f71837a.l();
        if (this.f71839c == this.f71837a.e().d()) {
            stringBuffer = this.f71837a.l();
        } else if (this.f71839c >= 9) {
            StringBuffer stringBuffer2 = new StringBuffer(String.valueOf(l4.substring(0, l4.lastIndexOf(h0.f27805a))));
            stringBuffer2.append(".z");
            stringBuffer2.append(this.f71839c + 1);
            stringBuffer = stringBuffer2.toString();
        } else {
            StringBuffer stringBuffer3 = new StringBuffer(String.valueOf(l4.substring(0, l4.lastIndexOf(h0.f27805a))));
            stringBuffer3.append(".z0");
            stringBuffer3.append(this.f71839c + 1);
            stringBuffer = stringBuffer3.toString();
        }
        this.f71839c++;
        try {
            if (net.lingala.zip4j.util.h.c(stringBuffer)) {
                return new RandomAccessFile(stringBuffer, "r");
            }
            StringBuffer stringBuffer4 = new StringBuffer("zip split file does not exist: ");
            stringBuffer4.append(stringBuffer);
            throw new IOException(stringBuffer4.toString());
        } catch (ZipException e5) {
            throw new IOException(e5.getMessage());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [net.lingala.zip4j.unzip.d] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r9v6 */
    public void t(x3.a aVar, String str, String str2, k kVar) throws ZipException {
        byte[] bArr;
        net.lingala.zip4j.io.h k4;
        if (this.f71837a != null && this.f71838b != null && net.lingala.zip4j.util.h.A(str)) {
            net.lingala.zip4j.io.h hVar = null;
            try {
                try {
                    bArr = new byte[4096];
                    k4 = k();
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    FileOutputStream n4 = n(str, str2);
                    do {
                        int read = k4.read(bArr);
                        if (read == -1) {
                            e(k4, n4);
                            e.b(this.f71838b, new File(m(str, str2)), kVar);
                            e(k4, n4);
                            return;
                        }
                        n4.write(bArr, 0, read);
                        aVar.w(read);
                    } while (!aVar.m());
                    aVar.setResult(3);
                    aVar.u(0);
                    e(k4, n4);
                } catch (IOException e5) {
                    e = e5;
                    throw new ZipException(e);
                } catch (Exception e6) {
                    e = e6;
                    throw new ZipException(e);
                } catch (Throwable th2) {
                    th = th2;
                    str = 0;
                    hVar = k4;
                    e(hVar, str);
                    throw th;
                }
            } catch (IOException e7) {
                e = e7;
            } catch (Exception e8) {
                e = e8;
            } catch (Throwable th3) {
                th = th3;
                str = 0;
            }
        } else {
            throw new ZipException("Invalid parameters passed during unzipping file. One or more of the parameters were null");
        }
    }

    public void u(int i4) {
        this.f71842f.update(i4);
    }

    public void v(byte[] bArr, int i4, int i5) {
        if (bArr != null) {
            this.f71842f.update(bArr, i4, i5);
        }
    }
}
