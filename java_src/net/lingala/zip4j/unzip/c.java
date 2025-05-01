package net.lingala.zip4j.unzip;

import java.io.File;
import java.util.ArrayList;
import net.lingala.zip4j.exception.ZipException;
import w3.h;
import w3.k;
import w3.o;
/* compiled from: Unzip.java */
/* loaded from: classes7.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private o f71836a;

    public c(o oVar) throws ZipException {
        if (oVar != null) {
            this.f71836a = oVar;
            return;
        }
        throw new ZipException("ZipModel is null");
    }

    private long c(ArrayList arrayList) throws ZipException {
        long e5;
        if (arrayList != null) {
            long j4 = 0;
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                h hVar = (h) arrayList.get(i4);
                if (hVar.A() != null && hVar.A().f() > 0) {
                    e5 = hVar.A().a();
                } else {
                    e5 = hVar.e();
                }
                j4 += e5;
            }
            return j4;
        }
        throw new ZipException("fileHeaders is null, cannot calculate total work");
    }

    private void d(h hVar, String str, String str2) throws ZipException {
        if (hVar != null && net.lingala.zip4j.util.h.A(str)) {
            String p4 = hVar.p();
            if (!net.lingala.zip4j.util.h.A(str2)) {
                str2 = p4;
            }
            if (net.lingala.zip4j.util.h.A(str2)) {
                StringBuffer stringBuffer = new StringBuffer(String.valueOf(str));
                stringBuffer.append(str2);
                try {
                    File file = new File(new File(stringBuffer.toString()).getParent());
                    if (file.exists()) {
                        return;
                    }
                    file.mkdirs();
                    return;
                } catch (Exception e5) {
                    throw new ZipException(e5);
                }
            }
            return;
        }
        throw new ZipException("Cannot check output directory structure...one of the parameters was null");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(ArrayList arrayList, k kVar, x3.a aVar, String str) throws ZipException {
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            i((h) arrayList.get(i4), str, kVar, null, aVar);
            if (aVar.m()) {
                aVar.setResult(3);
                aVar.u(0);
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(h hVar, String str, k kVar, String str2, x3.a aVar) throws ZipException {
        if (hVar != null) {
            try {
                aVar.r(hVar.p());
                String str3 = net.lingala.zip4j.util.e.E0;
                if (!str.endsWith(str3)) {
                    StringBuffer stringBuffer = new StringBuffer(str);
                    stringBuffer.append(str3);
                    str = stringBuffer.toString();
                }
                if (hVar.C()) {
                    try {
                        String p4 = hVar.p();
                        if (net.lingala.zip4j.util.h.A(p4)) {
                            StringBuffer stringBuffer2 = new StringBuffer(String.valueOf(str));
                            stringBuffer2.append(p4);
                            File file = new File(stringBuffer2.toString());
                            if (file.exists()) {
                                return;
                            }
                            file.mkdirs();
                            return;
                        }
                        return;
                    } catch (Exception e5) {
                        aVar.b(e5);
                        throw new ZipException(e5);
                    }
                }
                d(hVar, str, str2);
                try {
                    new d(this.f71836a, hVar).t(aVar, str, str2, kVar);
                    return;
                } catch (Exception e6) {
                    aVar.b(e6);
                    throw new ZipException(e6);
                }
            } catch (ZipException e7) {
                aVar.b(e7);
                throw e7;
            } catch (Exception e8) {
                aVar.b(e8);
                throw new ZipException(e8);
            }
        }
        throw new ZipException("fileHeader is null");
    }

    public void e(k kVar, String str, x3.a aVar, boolean z4) throws ZipException {
        w3.c b5 = this.f71836a.b();
        if (b5 != null && b5.b() != null) {
            ArrayList b6 = b5.b();
            aVar.p(1);
            aVar.v(c(b6));
            aVar.u(1);
            if (z4) {
                new a(this, net.lingala.zip4j.util.e.G0, b6, kVar, aVar, str).start();
                return;
            } else {
                h(b6, kVar, aVar, str);
                return;
            }
        }
        throw new ZipException("invalid central directory in zipModel");
    }

    public void f(h hVar, String str, k kVar, String str2, x3.a aVar, boolean z4) throws ZipException {
        if (hVar != null) {
            aVar.p(1);
            aVar.v(hVar.e());
            aVar.u(1);
            aVar.t(0);
            aVar.r(hVar.p());
            if (z4) {
                new b(this, net.lingala.zip4j.util.e.G0, hVar, str, kVar, str2, aVar).start();
                return;
            }
            i(hVar, str, kVar, str2, aVar);
            aVar.c();
            return;
        }
        throw new ZipException("fileHeader is null");
    }

    public net.lingala.zip4j.io.h g(h hVar) throws ZipException {
        return new d(this.f71836a, hVar).k();
    }
}
