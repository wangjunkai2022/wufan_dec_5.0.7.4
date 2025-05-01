package u3;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import net.lingala.zip4j.exception.ZipException;
import net.lingala.zip4j.util.e;
import net.lingala.zip4j.util.f;
import w3.g;
import w3.h;
import w3.i;
import w3.l;
import w3.m;
import w3.n;
import w3.o;
/* compiled from: HeaderReader.java */
/* loaded from: classes7.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private RandomAccessFile f73372a;

    /* renamed from: b  reason: collision with root package name */
    private o f73373b;

    public a(RandomAccessFile randomAccessFile) {
        this.f73372a = null;
        this.f73372a = randomAccessFile;
    }

    private byte[] a(byte[] bArr) throws ZipException {
        if (bArr != null) {
            if (bArr.length == 4) {
                return new byte[]{bArr[0], bArr[1], bArr[2], bArr[3]};
            }
            throw new ZipException("invalid byte length, cannot expand to 8 bytes");
        }
        throw new ZipException("input parameter is null, cannot expand to 8 bytes");
    }

    private w3.a b(ArrayList arrayList) throws ZipException {
        if (arrayList == null) {
            return null;
        }
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            g gVar = (g) arrayList.get(i4);
            if (gVar != null && gVar.b() == 39169) {
                if (gVar.a() != null) {
                    w3.a aVar = new w3.a();
                    aVar.j(39169L);
                    aVar.i(gVar.c());
                    byte[] a5 = gVar.a();
                    aVar.l(f.i(a5, 0));
                    byte[] bArr = new byte[2];
                    System.arraycopy(a5, 2, bArr, 0, 2);
                    aVar.k(new String(bArr));
                    aVar.g(a5[4] & 255);
                    aVar.h(f.i(a5, 5));
                    return aVar;
                }
                throw new ZipException("corrput AES extra data records");
            }
        }
        return null;
    }

    private void e(h hVar) throws ZipException {
        w3.a b5;
        if (hVar != null) {
            if (hVar.l() == null || hVar.l().size() <= 0 || (b5 = b(hVar.l())) == null) {
                return;
            }
            hVar.F(b5);
            hVar.O(99);
            return;
        }
        throw new ZipException("file header is null in reading Zip64 Extended Info");
    }

    private void f(i iVar) throws ZipException {
        w3.a b5;
        if (iVar != null) {
            if (iVar.g() == null || iVar.g().size() <= 0 || (b5 = b(iVar.g())) == null) {
                return;
            }
            iVar.x(b5);
            iVar.E(99);
            return;
        }
        throw new ZipException("file header is null in reading Zip64 Extended Info");
    }

    private void g(h hVar) throws ZipException {
        if (this.f73372a == null) {
            throw new ZipException("invalid file handler when trying to read extra data record");
        }
        if (hVar != null) {
            int m4 = hVar.m();
            if (m4 <= 0) {
                return;
            }
            hVar.Q(m(m4));
            return;
        }
        throw new ZipException("file header is null");
    }

    private void h(i iVar) throws ZipException {
        if (this.f73372a == null) {
            throw new ZipException("invalid file handler when trying to read extra data record");
        }
        if (iVar != null) {
            int i4 = iVar.i();
            if (i4 <= 0) {
                return;
            }
            iVar.F(m(i4));
            return;
        }
        throw new ZipException("file header is null");
    }

    private void i(h hVar) throws ZipException {
        n r4;
        if (hVar != null) {
            if (hVar.l() == null || hVar.l().size() <= 0 || (r4 = r(hVar.l(), hVar.x(), hVar.e(), hVar.u(), hVar.i())) == null) {
                return;
            }
            hVar.g0(r4);
            if (r4.f() != -1) {
                hVar.d0(r4.f());
            }
            if (r4.a() != -1) {
                hVar.G(r4.a());
            }
            if (r4.d() != -1) {
                hVar.a0(r4.d());
            }
            if (r4.b() != -1) {
                hVar.M(r4.b());
                return;
            }
            return;
        }
        throw new ZipException("file header is null in reading Zip64 Extended Info");
    }

    private void j(i iVar) throws ZipException {
        n r4;
        if (iVar != null) {
            if (iVar.g() == null || iVar.g().size() <= 0 || (r4 = r(iVar.g(), iVar.q(), iVar.b(), -1L, -1)) == null) {
                return;
            }
            iVar.T(r4);
            if (r4.f() != -1) {
                iVar.Q(r4.f());
            }
            if (r4.a() != -1) {
                iVar.y(r4.a());
                return;
            }
            return;
        }
        throw new ZipException("file header is null in reading Zip64 Extended Info");
    }

    private w3.c k() throws ZipException {
        String h4;
        if (this.f73372a != null) {
            if (this.f73373b.e() != null) {
                try {
                    w3.c cVar = new w3.c();
                    ArrayList arrayList = new ArrayList();
                    w3.f e5 = this.f73373b.e();
                    long f5 = e5.f();
                    int i4 = e5.i();
                    if (this.f73373b.o()) {
                        f5 = this.f73373b.k().d();
                        i4 = (int) this.f73373b.k().h();
                    }
                    this.f73372a.seek(f5);
                    byte[] bArr = new byte[4];
                    byte[] bArr2 = new byte[2];
                    for (int i5 = 0; i5 < i4; i5++) {
                        h hVar = new h();
                        n(this.f73372a, bArr);
                        int e6 = f.e(bArr, 0);
                        boolean z4 = true;
                        if (e6 == e.f71856c) {
                            hVar.c0(e6);
                            n(this.f73372a, bArr2);
                            hVar.e0(f.i(bArr2, 0));
                            n(this.f73372a, bArr2);
                            hVar.f0(f.i(bArr2, 0));
                            n(this.f73372a, bArr2);
                            hVar.W((f.i(bArr2, 0) & 2048) != 0);
                            byte b5 = bArr2[0];
                            if ((b5 & 1) != 0) {
                                hVar.N(true);
                            }
                            hVar.X((byte[]) bArr2.clone());
                            hVar.K((b5 >> 3) == 1);
                            n(this.f73372a, bArr2);
                            hVar.H(f.i(bArr2, 0));
                            n(this.f73372a, bArr);
                            hVar.Z(f.e(bArr, 0));
                            n(this.f73372a, bArr);
                            hVar.I(f.e(bArr, 0));
                            hVar.J((byte[]) bArr.clone());
                            n(this.f73372a, bArr);
                            hVar.G(f.g(a(bArr), 0));
                            n(this.f73372a, bArr);
                            hVar.d0(f.g(a(bArr), 0));
                            n(this.f73372a, bArr2);
                            int i6 = f.i(bArr2, 0);
                            hVar.V(i6);
                            n(this.f73372a, bArr2);
                            hVar.R(f.i(bArr2, 0));
                            n(this.f73372a, bArr2);
                            int i7 = f.i(bArr2, 0);
                            hVar.S(new String(bArr2));
                            n(this.f73372a, bArr2);
                            hVar.M(f.i(bArr2, 0));
                            n(this.f73372a, bArr2);
                            hVar.Y((byte[]) bArr2.clone());
                            n(this.f73372a, bArr);
                            hVar.P((byte[]) bArr.clone());
                            n(this.f73372a, bArr);
                            hVar.a0(f.g(a(bArr), 0) & 4294967295L);
                            if (i6 > 0) {
                                byte[] bArr3 = new byte[i6];
                                n(this.f73372a, bArr3);
                                if (net.lingala.zip4j.util.h.A(this.f73373b.f())) {
                                    h4 = new String(bArr3, this.f73373b.f());
                                } else {
                                    h4 = net.lingala.zip4j.util.h.h(bArr3, hVar.E());
                                }
                                if (h4 != null) {
                                    StringBuffer stringBuffer = new StringBuffer(":");
                                    stringBuffer.append(System.getProperty("file.separator"));
                                    if (h4.indexOf(stringBuffer.toString()) >= 0) {
                                        StringBuffer stringBuffer2 = new StringBuffer(":");
                                        stringBuffer2.append(System.getProperty("file.separator"));
                                        h4 = h4.substring(h4.indexOf(stringBuffer2.toString()) + 2);
                                    }
                                    hVar.U(h4);
                                    if (!h4.endsWith(e.F0) && !h4.endsWith("\\")) {
                                        z4 = false;
                                    }
                                    hVar.L(z4);
                                } else {
                                    throw new ZipException("fileName is null when reading central directory");
                                }
                            } else {
                                hVar.U(null);
                            }
                            g(hVar);
                            i(hVar);
                            e(hVar);
                            if (i7 > 0) {
                                byte[] bArr4 = new byte[i7];
                                n(this.f73372a, bArr4);
                                hVar.S(new String(bArr4));
                            }
                            arrayList.add(hVar);
                        } else {
                            StringBuffer stringBuffer3 = new StringBuffer("Expected central directory entry not found (#");
                            stringBuffer3.append(i5 + 1);
                            stringBuffer3.append(")");
                            throw new ZipException(stringBuffer3.toString());
                        }
                    }
                    cVar.d(arrayList);
                    w3.e eVar = new w3.e();
                    n(this.f73372a, bArr);
                    int e7 = f.e(bArr, 0);
                    if (e7 != e.f71860e) {
                        return cVar;
                    }
                    eVar.d(e7);
                    n(this.f73372a, bArr2);
                    int i8 = f.i(bArr2, 0);
                    eVar.f(i8);
                    if (i8 > 0) {
                        byte[] bArr5 = new byte[i8];
                        n(this.f73372a, bArr5);
                        eVar.e(new String(bArr5));
                    }
                    return cVar;
                } catch (IOException e8) {
                    throw new ZipException(e8);
                }
            }
            throw new ZipException("EndCentralRecord was null, maybe a corrupt zip file");
        }
        throw new ZipException("random access file was null", 3);
    }

    private w3.f l() throws ZipException {
        RandomAccessFile randomAccessFile = this.f73372a;
        if (randomAccessFile != null) {
            try {
                byte[] bArr = new byte[4];
                long length = randomAccessFile.length() - 22;
                w3.f fVar = new w3.f();
                int i4 = 0;
                while (true) {
                    long j4 = length - 1;
                    this.f73372a.seek(length);
                    i4++;
                    if (f.f(this.f73372a, bArr) == e.f71858d || i4 > 3000) {
                        break;
                    }
                    length = j4;
                }
                if (f.e(bArr, 0) == e.f71858d) {
                    byte[] bArr2 = new byte[4];
                    byte[] bArr3 = new byte[2];
                    fVar.q(e.f71858d);
                    n(this.f73372a, bArr3);
                    fVar.n(f.i(bArr3, 0));
                    n(this.f73372a, bArr3);
                    fVar.o(f.i(bArr3, 0));
                    n(this.f73372a, bArr3);
                    fVar.t(f.i(bArr3, 0));
                    n(this.f73372a, bArr3);
                    fVar.s(f.i(bArr3, 0));
                    n(this.f73372a, bArr2);
                    fVar.r(f.e(bArr2, 0));
                    n(this.f73372a, bArr2);
                    fVar.p(f.g(a(bArr2), 0));
                    n(this.f73372a, bArr3);
                    int i5 = f.i(bArr3, 0);
                    fVar.m(i5);
                    if (i5 > 0) {
                        byte[] bArr4 = new byte[i5];
                        n(this.f73372a, bArr4);
                        fVar.k(new String(bArr4));
                        fVar.l(bArr4);
                    } else {
                        fVar.k(null);
                    }
                    if (fVar.d() > 0) {
                        this.f73373b.x(true);
                    } else {
                        this.f73373b.x(false);
                    }
                    return fVar;
                }
                throw new ZipException("zip headers not found. probably not a zip file");
            } catch (IOException e5) {
                throw new ZipException("Probably not a zip file or a corrupted zip file", e5, 4);
            }
        }
        throw new ZipException("random access file was null", 3);
    }

    private ArrayList m(int i4) throws ZipException {
        if (i4 <= 0) {
            return null;
        }
        try {
            byte[] bArr = new byte[i4];
            this.f73372a.read(bArr);
            ArrayList arrayList = new ArrayList();
            int i5 = 0;
            while (i5 < i4) {
                g gVar = new g();
                gVar.e(f.i(bArr, i5));
                int i6 = i5 + 2;
                int i7 = f.i(bArr, i6);
                if (i7 + 2 > i4) {
                    i7 = f.h(bArr, i6);
                    if (i7 + 2 > i4) {
                        break;
                    }
                }
                gVar.f(i7);
                int i8 = i6 + 2;
                if (i7 > 0) {
                    byte[] bArr2 = new byte[i7];
                    System.arraycopy(bArr, i8, bArr2, 0, i7);
                    gVar.d(bArr2);
                }
                i5 = i8 + i7;
                arrayList.add(gVar);
            }
            if (arrayList.size() > 0) {
                return arrayList;
            }
            return null;
        } catch (IOException e5) {
            throw new ZipException(e5);
        }
    }

    private byte[] n(RandomAccessFile randomAccessFile, byte[] bArr) throws ZipException {
        try {
            if (randomAccessFile.read(bArr, 0, bArr.length) != -1) {
                return bArr;
            }
            throw new ZipException("unexpected end of file when reading short buff");
        } catch (IOException e5) {
            throw new ZipException("IOException when reading short buff", e5);
        }
    }

    private l p() throws ZipException {
        if (this.f73372a != null) {
            try {
                l lVar = new l();
                s();
                byte[] bArr = new byte[4];
                byte[] bArr2 = new byte[8];
                n(this.f73372a, bArr);
                long e5 = f.e(bArr, 0);
                if (e5 == e.f71866h) {
                    this.f73373b.C(true);
                    lVar.g(e5);
                    n(this.f73372a, bArr);
                    lVar.e(f.e(bArr, 0));
                    n(this.f73372a, bArr2);
                    lVar.f(f.g(bArr2, 0));
                    n(this.f73372a, bArr);
                    lVar.h(f.e(bArr, 0));
                    return lVar;
                }
                this.f73373b.C(false);
                return null;
            } catch (Exception e6) {
                throw new ZipException(e6);
            }
        }
        throw new ZipException("invalid file handler when trying to read Zip64EndCentralDirLocator");
    }

    private m q() throws ZipException {
        if (this.f73373b.j() != null) {
            long b5 = this.f73373b.j().b();
            if (b5 >= 0) {
                try {
                    this.f73372a.seek(b5);
                    m mVar = new m();
                    byte[] bArr = new byte[2];
                    byte[] bArr2 = new byte[4];
                    byte[] bArr3 = new byte[8];
                    n(this.f73372a, bArr2);
                    long e5 = f.e(bArr2, 0);
                    if (e5 == e.f71868i) {
                        mVar.p(e5);
                        n(this.f73372a, bArr3);
                        mVar.r(f.g(bArr3, 0));
                        n(this.f73372a, bArr);
                        mVar.u(f.i(bArr, 0));
                        n(this.f73372a, bArr);
                        mVar.v(f.i(bArr, 0));
                        n(this.f73372a, bArr2);
                        mVar.m(f.e(bArr2, 0));
                        n(this.f73372a, bArr2);
                        mVar.n(f.e(bArr2, 0));
                        n(this.f73372a, bArr3);
                        mVar.t(f.g(bArr3, 0));
                        n(this.f73372a, bArr3);
                        mVar.s(f.g(bArr3, 0));
                        n(this.f73372a, bArr3);
                        mVar.q(f.g(bArr3, 0));
                        n(this.f73372a, bArr3);
                        mVar.o(f.g(bArr3, 0));
                        long g4 = mVar.g() - 44;
                        if (g4 > 0) {
                            byte[] bArr4 = new byte[(int) g4];
                            n(this.f73372a, bArr4);
                            mVar.l(bArr4);
                        }
                        return mVar;
                    }
                    throw new ZipException("invalid signature for zip64 end of central directory record");
                } catch (IOException e6) {
                    throw new ZipException(e6);
                }
            }
            throw new ZipException("invalid offset for start of end of central directory record");
        }
        throw new ZipException("invalid zip64 end of central directory locator");
    }

    private n r(ArrayList arrayList, long j4, long j5, long j6, int i4) throws ZipException {
        int i5;
        boolean z4;
        for (int i6 = 0; i6 < arrayList.size(); i6++) {
            g gVar = (g) arrayList.get(i6);
            if (gVar != null && gVar.b() == 1) {
                n nVar = new n();
                byte[] a5 = gVar.a();
                if (gVar.c() <= 0) {
                    return null;
                }
                byte[] bArr = new byte[8];
                byte[] bArr2 = new byte[4];
                boolean z5 = true;
                if ((j4 & 65535) != 65535 || gVar.c() <= 0) {
                    i5 = 0;
                    z4 = false;
                } else {
                    System.arraycopy(a5, 0, bArr, 0, 8);
                    nVar.l(f.g(bArr, 0));
                    i5 = 8;
                    z4 = true;
                }
                if ((j5 & 65535) == 65535 && i5 < gVar.c()) {
                    System.arraycopy(a5, i5, bArr, 0, 8);
                    nVar.g(f.g(bArr, 0));
                    i5 += 8;
                    z4 = true;
                }
                if ((j6 & 65535) == 65535 && i5 < gVar.c()) {
                    System.arraycopy(a5, i5, bArr, 0, 8);
                    nVar.j(f.g(bArr, 0));
                    i5 += 8;
                    z4 = true;
                }
                if ((i4 & 65535) != 65535 || i5 >= gVar.c()) {
                    z5 = z4;
                } else {
                    System.arraycopy(a5, i5, bArr2, 0, 4);
                    nVar.h(f.e(bArr2, 0));
                }
                if (z5) {
                    return nVar;
                }
                return null;
            }
        }
        return null;
    }

    private void s() throws ZipException {
        try {
            byte[] bArr = new byte[4];
            long length = this.f73372a.length() - 22;
            while (true) {
                long j4 = length - 1;
                this.f73372a.seek(length);
                if (f.f(this.f73372a, bArr) == e.f71858d) {
                    RandomAccessFile randomAccessFile = this.f73372a;
                    randomAccessFile.seek(((((randomAccessFile.getFilePointer() - 4) - 4) - 8) - 4) - 4);
                    return;
                }
                length = j4;
            }
        } catch (IOException e5) {
            throw new ZipException(e5);
        }
    }

    public o c() throws ZipException {
        return d(null);
    }

    public o d(String str) throws ZipException {
        o oVar = new o();
        this.f73373b = oVar;
        oVar.u(str);
        this.f73373b.t(l());
        this.f73373b.A(p());
        if (this.f73373b.o()) {
            this.f73373b.B(q());
            if (this.f73373b.k() != null && this.f73373b.k().b() > 0) {
                this.f73373b.x(true);
            } else {
                this.f73373b.x(false);
            }
        }
        this.f73373b.q(k());
        return this.f73373b;
    }

    public i o(h hVar) throws ZipException {
        if (hVar != null && this.f73372a != null) {
            long u4 = hVar.u();
            if (hVar.A() != null && hVar.A().d() > 0) {
                u4 = hVar.u();
            }
            if (u4 >= 0) {
                try {
                    this.f73372a.seek(u4);
                    i iVar = new i();
                    byte[] bArr = new byte[2];
                    byte[] bArr2 = new byte[4];
                    n(this.f73372a, bArr2);
                    int e5 = f.e(bArr2, 0);
                    if (e5 == e.f71852a) {
                        iVar.P(e5);
                        n(this.f73372a, bArr);
                        iVar.R(f.i(bArr, 0));
                        n(this.f73372a, bArr);
                        iVar.K((f.i(bArr, 0) & 2048) != 0);
                        byte b5 = bArr[0];
                        if ((b5 & 1) != 0) {
                            iVar.D(true);
                        }
                        iVar.L(bArr);
                        String binaryString = Integer.toBinaryString(b5);
                        if (binaryString.length() >= 4) {
                            iVar.C(binaryString.charAt(3) == '1');
                        }
                        n(this.f73372a, bArr);
                        iVar.z(f.i(bArr, 0));
                        n(this.f73372a, bArr2);
                        iVar.M(f.e(bArr2, 0));
                        n(this.f73372a, bArr2);
                        iVar.A(f.e(bArr2, 0));
                        iVar.B((byte[]) bArr2.clone());
                        n(this.f73372a, bArr2);
                        iVar.y(f.g(a(bArr2), 0));
                        n(this.f73372a, bArr2);
                        iVar.Q(f.g(a(bArr2), 0));
                        n(this.f73372a, bArr);
                        int i4 = f.i(bArr, 0);
                        iVar.J(i4);
                        n(this.f73372a, bArr);
                        int i5 = f.i(bArr, 0);
                        iVar.H(i5);
                        int i6 = 30;
                        if (i4 > 0) {
                            byte[] bArr3 = new byte[i4];
                            n(this.f73372a, bArr3);
                            String h4 = net.lingala.zip4j.util.h.h(bArr3, iVar.v());
                            if (h4 != null) {
                                StringBuffer stringBuffer = new StringBuffer(":");
                                stringBuffer.append(System.getProperty("file.separator"));
                                if (h4.indexOf(stringBuffer.toString()) >= 0) {
                                    StringBuffer stringBuffer2 = new StringBuffer(":");
                                    stringBuffer2.append(System.getProperty("file.separator"));
                                    h4 = h4.substring(h4.indexOf(stringBuffer2.toString()) + 2);
                                }
                                iVar.I(h4);
                                i6 = 30 + i4;
                            } else {
                                throw new ZipException("file name is null, cannot assign file name to local file header");
                            }
                        } else {
                            iVar.I(null);
                        }
                        h(iVar);
                        iVar.N(u4 + i6 + i5);
                        iVar.O(hVar.v());
                        j(iVar);
                        f(iVar);
                        if (iVar.u() && iVar.f() != 99) {
                            if ((b5 & 64) == 64) {
                                iVar.E(1);
                            } else {
                                iVar.E(0);
                            }
                        }
                        if (iVar.d() <= 0) {
                            iVar.A(hVar.g());
                            iVar.B(hVar.h());
                        }
                        if (iVar.b() <= 0) {
                            iVar.y(hVar.e());
                        }
                        if (iVar.q() <= 0) {
                            iVar.Q(hVar.x());
                        }
                        return iVar;
                    }
                    StringBuffer stringBuffer3 = new StringBuffer("invalid local header signature for file: ");
                    stringBuffer3.append(hVar.p());
                    throw new ZipException(stringBuffer3.toString());
                } catch (IOException e6) {
                    throw new ZipException(e6);
                }
            }
            throw new ZipException("invalid local header offset");
        }
        throw new ZipException("invalid read parameters for local header");
    }
}
