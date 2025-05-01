package u3;

import java.io.File;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import net.lingala.zip4j.exception.ZipException;
import net.lingala.zip4j.util.e;
import net.lingala.zip4j.util.h;
import w3.k;
import w3.o;
import w3.p;
/* compiled from: ZipFile.java */
/* loaded from: classes7.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private String f73375a;

    /* renamed from: b  reason: collision with root package name */
    private int f73376b;

    /* renamed from: c  reason: collision with root package name */
    private o f73377c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f73378d;

    /* renamed from: e  reason: collision with root package name */
    private x3.a f73379e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f73380f;

    /* renamed from: g  reason: collision with root package name */
    private String f73381g;

    public c(String str) throws ZipException {
        this(new File(str));
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0054 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void J() throws net.lingala.zip4j.exception.ZipException {
        /*
            r5 = this;
            java.lang.String r0 = r5.f73375a
            boolean r0 = net.lingala.zip4j.util.h.c(r0)
            if (r0 == 0) goto L68
            java.lang.String r0 = r5.f73375a
            boolean r0 = net.lingala.zip4j.util.h.d(r0)
            if (r0 == 0) goto L60
            int r0 = r5.f73376b
            r1 = 2
            if (r0 != r1) goto L58
            r0 = 0
            java.io.RandomAccessFile r1 = new java.io.RandomAccessFile     // Catch: java.lang.Throwable -> L42 java.io.FileNotFoundException -> L47
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> L42 java.io.FileNotFoundException -> L47
            java.lang.String r3 = r5.f73375a     // Catch: java.lang.Throwable -> L42 java.io.FileNotFoundException -> L47
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L42 java.io.FileNotFoundException -> L47
            java.lang.String r3 = "r"
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L42 java.io.FileNotFoundException -> L47
            w3.o r0 = r5.f73377c     // Catch: java.io.FileNotFoundException -> L40 java.lang.Throwable -> L51
            if (r0 != 0) goto L3c
            u3.a r0 = new u3.a     // Catch: java.io.FileNotFoundException -> L40 java.lang.Throwable -> L51
            r0.<init>(r1)     // Catch: java.io.FileNotFoundException -> L40 java.lang.Throwable -> L51
            java.lang.String r2 = r5.f73381g     // Catch: java.io.FileNotFoundException -> L40 java.lang.Throwable -> L51
            w3.o r0 = r0.d(r2)     // Catch: java.io.FileNotFoundException -> L40 java.lang.Throwable -> L51
            r5.f73377c = r0     // Catch: java.io.FileNotFoundException -> L40 java.lang.Throwable -> L51
            if (r0 == 0) goto L3c
            java.lang.String r2 = r5.f73375a     // Catch: java.io.FileNotFoundException -> L40 java.lang.Throwable -> L51
            r0.D(r2)     // Catch: java.io.FileNotFoundException -> L40 java.lang.Throwable -> L51
        L3c:
            r1.close()     // Catch: java.io.IOException -> L3f
        L3f:
            return
        L40:
            r0 = move-exception
            goto L4b
        L42:
            r1 = move-exception
            r4 = r1
            r1 = r0
            r0 = r4
            goto L52
        L47:
            r1 = move-exception
            r4 = r1
            r1 = r0
            r0 = r4
        L4b:
            net.lingala.zip4j.exception.ZipException r2 = new net.lingala.zip4j.exception.ZipException     // Catch: java.lang.Throwable -> L51
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L51
            throw r2     // Catch: java.lang.Throwable -> L51
        L51:
            r0 = move-exception
        L52:
            if (r1 == 0) goto L57
            r1.close()     // Catch: java.io.IOException -> L57
        L57:
            throw r0
        L58:
            net.lingala.zip4j.exception.ZipException r0 = new net.lingala.zip4j.exception.ZipException
            java.lang.String r1 = "Invalid mode"
            r0.<init>(r1)
            throw r0
        L60:
            net.lingala.zip4j.exception.ZipException r0 = new net.lingala.zip4j.exception.ZipException
            java.lang.String r1 = "no read access for the input zip file"
            r0.<init>(r1)
            throw r0
        L68:
            net.lingala.zip4j.exception.ZipException r0 = new net.lingala.zip4j.exception.ZipException
            java.lang.String r1 = "zip file does not exist"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: u3.c.J():void");
    }

    private void d(File file, p pVar, boolean z4) throws ZipException {
        g();
        o oVar = this.f73377c;
        if (oVar != null) {
            if (z4 && oVar.n()) {
                throw new ZipException("This is a split archive. Zip file format does not allow updating split/spanned files");
            }
            new net.lingala.zip4j.zip.b(this.f73377c).c(file, pVar, this.f73379e, this.f73380f);
            return;
        }
        throw new ZipException("internal error: zip model is null");
    }

    private void g() throws ZipException {
        if (this.f73377c == null) {
            if (h.c(this.f73375a)) {
                J();
            } else {
                h();
            }
        }
    }

    private void h() {
        o oVar = new o();
        this.f73377c = oVar;
        oVar.D(this.f73375a);
        this.f73377c.u(this.f73381g);
    }

    public List A() throws ZipException {
        J();
        o oVar = this.f73377c;
        if (oVar == null || oVar.b() == null) {
            return null;
        }
        return this.f73377c.b().b();
    }

    public net.lingala.zip4j.io.h B(w3.h hVar) throws ZipException {
        if (hVar != null) {
            g();
            o oVar = this.f73377c;
            if (oVar != null) {
                return new net.lingala.zip4j.unzip.c(oVar).g(hVar);
            }
            throw new ZipException("zip model is null, cannot get inputstream");
        }
        throw new ZipException("FileHeader is null, cannot get InputStream");
    }

    public x3.a C() {
        return this.f73379e;
    }

    public ArrayList D() throws ZipException {
        g();
        return h.y(this.f73377c);
    }

    public boolean E() throws ZipException {
        if (this.f73377c == null) {
            J();
            if (this.f73377c == null) {
                throw new ZipException("Zip Model is null");
            }
        }
        if (this.f73377c.b() != null && this.f73377c.b().b() != null) {
            ArrayList b5 = this.f73377c.b().b();
            int i4 = 0;
            while (true) {
                if (i4 >= b5.size()) {
                    break;
                }
                w3.h hVar = (w3.h) b5.get(i4);
                if (hVar != null && hVar.D()) {
                    this.f73378d = true;
                    break;
                }
                i4++;
            }
            return this.f73378d;
        }
        throw new ZipException("invalid zip file");
    }

    public boolean F() {
        return this.f73380f;
    }

    public boolean G() throws ZipException {
        if (this.f73377c == null) {
            J();
            if (this.f73377c == null) {
                throw new ZipException("Zip Model is null");
            }
        }
        return this.f73377c.n();
    }

    public boolean H() {
        try {
            J();
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public void I(File file) throws ZipException {
        if (file != null) {
            if (!file.exists()) {
                g();
                if (this.f73377c != null) {
                    net.lingala.zip4j.util.c cVar = new net.lingala.zip4j.util.c();
                    cVar.h(this.f73377c, this.f73379e);
                    cVar.k(this.f73377c, file, this.f73379e, this.f73380f);
                    return;
                }
                throw new ZipException("zip model is null, corrupt zip file?");
            }
            throw new ZipException("output Zip File already exists");
        }
        throw new ZipException("outputZipFile is null, cannot merge split files");
    }

    public void K(String str) throws ZipException {
        if (h.A(str)) {
            if (this.f73377c == null && h.c(this.f73375a)) {
                J();
            }
            if (!this.f73377c.n()) {
                w3.h p4 = h.p(this.f73377c, str);
                if (p4 != null) {
                    L(p4);
                    return;
                }
                StringBuffer stringBuffer = new StringBuffer("could not find file header for file: ");
                stringBuffer.append(str);
                throw new ZipException(stringBuffer.toString());
            }
            throw new ZipException("Zip file format does not allow updating split/spanned files");
        }
        throw new ZipException("file name is empty or null, cannot remove file");
    }

    public void L(w3.h hVar) throws ZipException {
        if (hVar != null) {
            if (this.f73377c == null && h.c(this.f73375a)) {
                J();
            }
            if (!this.f73377c.n()) {
                net.lingala.zip4j.util.c cVar = new net.lingala.zip4j.util.c();
                cVar.i(this.f73377c, hVar, this.f73379e);
                cVar.m(this.f73377c, hVar, this.f73379e, this.f73380f);
                return;
            }
            throw new ZipException("Zip file format does not allow updating split/spanned files");
        }
        throw new ZipException("file header is null, cannot remove file");
    }

    public void M(String str) throws ZipException {
        if (str != null) {
            if (h.c(this.f73375a)) {
                J();
                o oVar = this.f73377c;
                if (oVar != null) {
                    if (oVar.e() != null) {
                        new net.lingala.zip4j.util.c().o(this.f73377c, str);
                        return;
                    }
                    throw new ZipException("end of central directory is null, cannot set comment");
                }
                throw new ZipException("zipModel is null, cannot update zip file");
            }
            throw new ZipException("zip file does not exist, cannot set comment for zip file");
        }
        throw new ZipException("input comment is null, cannot update zip file");
    }

    public void N(String str) throws ZipException {
        if (h.A(str)) {
            if (h.B(str)) {
                this.f73381g = str;
                return;
            }
            StringBuffer stringBuffer = new StringBuffer("unsupported charset: ");
            stringBuffer.append(str);
            throw new ZipException(stringBuffer.toString());
        }
        throw new ZipException("null or empty charset name");
    }

    public void O(String str) throws ZipException {
        if (h.A(str)) {
            P(str.toCharArray());
            return;
        }
        throw null;
    }

    public void P(char[] cArr) throws ZipException {
        if (this.f73377c == null) {
            J();
            if (this.f73377c == null) {
                throw new ZipException("Zip Model is null");
            }
        }
        if (this.f73377c.b() != null && this.f73377c.b().b() != null) {
            for (int i4 = 0; i4 < this.f73377c.b().b().size(); i4++) {
                if (this.f73377c.b().b().get(i4) != null && ((w3.h) this.f73377c.b().b().get(i4)).D()) {
                    ((w3.h) this.f73377c.b().b().get(i4)).b0(cArr);
                }
            }
            return;
        }
        throw new ZipException("invalid zip file");
    }

    public void Q(boolean z4) {
        this.f73380f = z4;
    }

    public void a(File file, p pVar) throws ZipException {
        ArrayList arrayList = new ArrayList();
        arrayList.add(file);
        b(arrayList, pVar);
    }

    public void b(ArrayList arrayList, p pVar) throws ZipException {
        g();
        if (this.f73377c == null) {
            throw new ZipException("internal error: zip model is null");
        }
        if (arrayList != null) {
            if (!h.a(arrayList, 1)) {
                throw new ZipException("One or more elements in the input ArrayList is not of type File");
            }
            if (pVar != null) {
                if (this.f73379e.j() != 1) {
                    if (h.c(this.f73375a) && this.f73377c.n()) {
                        throw new ZipException("Zip file already exists. Zip file format does not allow updating split/spanned files");
                    }
                    new net.lingala.zip4j.zip.b(this.f73377c).b(arrayList, pVar, this.f73379e, this.f73380f);
                    return;
                }
                throw new ZipException("invalid operation - Zip4j is in busy state");
            }
            throw new ZipException("input parameters are null, cannot add files to zip");
        }
        throw new ZipException("input file ArrayList is null, cannot add files");
    }

    public void c(File file, p pVar) throws ZipException {
        if (file == null) {
            throw new ZipException("input path is null, cannot add folder to zip file");
        }
        if (pVar != null) {
            d(file, pVar, true);
            return;
        }
        throw new ZipException("input parameters are null, cannot add folder to zip file");
    }

    public void e(String str, p pVar) throws ZipException {
        if (h.A(str)) {
            c(new File(str), pVar);
            return;
        }
        throw new ZipException("input path is null or empty, cannot add folder to zip file");
    }

    public void f(InputStream inputStream, p pVar) throws ZipException {
        if (inputStream == null) {
            throw new ZipException("inputstream is null, cannot add file to zip");
        }
        if (pVar != null) {
            Q(false);
            g();
            if (this.f73377c != null) {
                if (h.c(this.f73375a) && this.f73377c.n()) {
                    throw new ZipException("Zip file already exists. Zip file format does not allow updating split/spanned files");
                }
                new net.lingala.zip4j.zip.b(this.f73377c).d(inputStream, pVar);
                return;
            }
            throw new ZipException("internal error: zip model is null");
        }
        throw new ZipException("zip parameters are null");
    }

    public void i(File file, p pVar) throws ZipException {
        ArrayList arrayList = new ArrayList();
        arrayList.add(file);
        l(arrayList, pVar, false, -1L);
    }

    public void j(File file, p pVar, boolean z4, long j4) throws ZipException {
        ArrayList arrayList = new ArrayList();
        arrayList.add(file);
        l(arrayList, pVar, z4, j4);
    }

    public void k(ArrayList arrayList, p pVar) throws ZipException {
        l(arrayList, pVar, false, -1L);
    }

    public void l(ArrayList arrayList, p pVar, boolean z4, long j4) throws ZipException {
        if (h.A(this.f73375a)) {
            if (h.c(this.f73375a)) {
                StringBuffer stringBuffer = new StringBuffer("zip file: ");
                stringBuffer.append(this.f73375a);
                stringBuffer.append(" already exists. To add files to existing zip file use addFile method");
                throw new ZipException(stringBuffer.toString());
            } else if (arrayList != null) {
                if (h.a(arrayList, 1)) {
                    h();
                    this.f73377c.x(z4);
                    this.f73377c.y(j4);
                    b(arrayList, pVar);
                    return;
                }
                throw new ZipException("One or more elements in the input ArrayList is not of type File");
            } else {
                throw new ZipException("input file ArrayList is null, cannot create zip file");
            }
        }
        throw new ZipException("zip file path is empty");
    }

    public void m(File file, p pVar, boolean z4, long j4) throws ZipException {
        if (file == null) {
            throw new ZipException("folderToAdd is null, cannot create zip file from folder");
        }
        if (pVar != null) {
            if (!h.c(this.f73375a)) {
                h();
                this.f73377c.x(z4);
                if (z4) {
                    this.f73377c.y(j4);
                }
                d(file, pVar, false);
                return;
            }
            StringBuffer stringBuffer = new StringBuffer("zip file: ");
            stringBuffer.append(this.f73375a);
            stringBuffer.append(" already exists. To add files to existing zip file use addFolder method");
            throw new ZipException(stringBuffer.toString());
        }
        throw new ZipException("input parameters are null, cannot create zip file from folder");
    }

    public void n(String str, p pVar, boolean z4, long j4) throws ZipException {
        if (h.A(str)) {
            m(new File(str), pVar, z4, j4);
            return;
        }
        throw new ZipException("folderToAdd is empty or null, cannot create Zip File from folder");
    }

    public void o(String str) throws ZipException {
        p(str, null);
    }

    public void p(String str, k kVar) throws ZipException {
        if (h.A(str)) {
            if (h.f(str)) {
                if (this.f73377c == null) {
                    J();
                }
                if (this.f73377c != null) {
                    if (this.f73379e.j() != 1) {
                        new net.lingala.zip4j.unzip.c(this.f73377c).e(kVar, str, this.f73379e, this.f73380f);
                        return;
                    }
                    throw new ZipException("invalid operation - Zip4j is in busy state");
                }
                throw new ZipException("Internal error occurred when extracting zip file");
            }
            throw new ZipException("invalid output path");
        }
        throw new ZipException("output path is null or invalid");
    }

    public void q(String str, String str2) throws ZipException {
        r(str, str2, null);
    }

    public void r(String str, String str2, k kVar) throws ZipException {
        s(str, str2, kVar, null);
    }

    public void s(String str, String str2, k kVar, String str3) throws ZipException {
        if (h.A(str)) {
            if (h.A(str2)) {
                J();
                w3.h p4 = h.p(this.f73377c, str);
                if (p4 != null) {
                    if (this.f73379e.j() != 1) {
                        p4.a(this.f73377c, str2, kVar, str3, this.f73379e, this.f73380f);
                        return;
                    }
                    throw new ZipException("invalid operation - Zip4j is in busy state");
                }
                throw new ZipException("file header not found for given file name, cannot extract file");
            }
            throw new ZipException("destination string path is empty or null, cannot extract file");
        }
        throw new ZipException("file to extract is null or empty, cannot extract file");
    }

    public void t(w3.h hVar, String str) throws ZipException {
        u(hVar, str, null);
    }

    public void u(w3.h hVar, String str, k kVar) throws ZipException {
        v(hVar, str, kVar, null);
    }

    public void v(w3.h hVar, String str, k kVar, String str2) throws ZipException {
        if (hVar != null) {
            if (h.A(str)) {
                J();
                if (this.f73379e.j() != 1) {
                    hVar.a(this.f73377c, str, kVar, str2, this.f73379e, this.f73380f);
                    return;
                }
                throw new ZipException("invalid operation - Zip4j is in busy state");
            }
            throw new ZipException("destination path is empty or null, cannot extract file");
        }
        throw new ZipException("input file header is null, cannot extract file");
    }

    public String w() throws ZipException {
        return x(null);
    }

    public String x(String str) throws ZipException {
        if (str == null) {
            str = h.B(e.C0) ? e.C0 : e.D0;
        }
        if (h.c(this.f73375a)) {
            g();
            o oVar = this.f73377c;
            if (oVar != null) {
                if (oVar.e() != null) {
                    if (this.f73377c.e().b() == null || this.f73377c.e().b().length <= 0) {
                        return null;
                    }
                    try {
                        return new String(this.f73377c.e().b(), str);
                    } catch (UnsupportedEncodingException e5) {
                        throw new ZipException(e5);
                    }
                }
                throw new ZipException("end of central directory record is null, cannot read comment");
            }
            throw new ZipException("zip model is null, cannot read comment");
        }
        throw new ZipException("zip file does not exist, cannot read comment");
    }

    public File y() {
        return new File(this.f73375a);
    }

    public w3.h z(String str) throws ZipException {
        if (h.A(str)) {
            J();
            o oVar = this.f73377c;
            if (oVar == null || oVar.b() == null) {
                return null;
            }
            return h.p(this.f73377c, str);
        }
        throw new ZipException("input file name is emtpy or null, cannot get FileHeader");
    }

    public c(File file) throws ZipException {
        if (file != null) {
            this.f73375a = file.getPath();
            this.f73376b = 2;
            this.f73379e = new x3.a();
            this.f73380f = false;
            return;
        }
        throw new ZipException("Input zip file parameter is not null", 1);
    }
}
