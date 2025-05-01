package com.kwad.framework.filedownloader.download;

import com.kwad.framework.filedownloader.a.c;
import com.kwad.framework.filedownloader.f.c;
import com.kwad.framework.filedownloader.services.c;
import java.io.File;
/* loaded from: classes5.dex */
public final class b {
    private com.kwad.framework.filedownloader.services.c agH;
    private c.a agI;
    private c.b agJ;
    private c.e agK;
    private volatile com.kwad.framework.filedownloader.b.a agL;
    private c.d agM;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class a {
        private static final b agN = new b();
    }

    public static b vS() {
        return a.agN;
    }

    private c.a vX() {
        c.a aVar = this.agI;
        if (aVar != null) {
            return aVar;
        }
        synchronized (this) {
            if (this.agI == null) {
                this.agI = wa().wY();
            }
        }
        return this.agI;
    }

    private c.b vY() {
        c.b bVar = this.agJ;
        if (bVar != null) {
            return bVar;
        }
        synchronized (this) {
            if (this.agJ == null) {
                this.agJ = wa().wX();
            }
        }
        return this.agJ;
    }

    private c.e vZ() {
        c.e eVar = this.agK;
        if (eVar != null) {
            return eVar;
        }
        synchronized (this) {
            if (this.agK == null) {
                this.agK = wa().wW();
            }
        }
        return this.agK;
    }

    private com.kwad.framework.filedownloader.services.c wa() {
        com.kwad.framework.filedownloader.services.c cVar = this.agH;
        if (cVar != null) {
            return cVar;
        }
        synchronized (this) {
            if (this.agH == null) {
                this.agH = new com.kwad.framework.filedownloader.services.c();
            }
        }
        return this.agH;
    }

    public final void a(c.b bVar) {
        synchronized (this) {
            this.agH = new com.kwad.framework.filedownloader.services.c(bVar);
            this.agJ = null;
            this.agK = null;
            this.agL = null;
            this.agM = null;
        }
    }

    public final void b(c.b bVar) {
        synchronized (this) {
            this.agH = new com.kwad.framework.filedownloader.services.c(bVar);
        }
    }

    public final com.kwad.framework.filedownloader.a.b bk(String str) {
        try {
            return vY().bh(str);
        } catch (Throwable unused) {
            c.b bVar = new c.b();
            this.agJ = bVar;
            return bVar.bh(str);
        }
    }

    public final c.d vT() {
        c.d dVar = this.agM;
        if (dVar != null) {
            return dVar;
        }
        synchronized (this) {
            if (this.agM == null) {
                this.agM = wa().wZ();
            }
        }
        return this.agM;
    }

    public final synchronized com.kwad.framework.filedownloader.b.a vU() {
        if (this.agL != null) {
            return this.agL;
        }
        this.agL = wa().wV();
        a(this.agL.vJ());
        return this.agL;
    }

    public final int vV() {
        return wa().vV();
    }

    public final boolean vW() {
        vZ();
        return true;
    }

    public final com.kwad.framework.filedownloader.e.a b(File file) {
        return vZ().c(file);
    }

    public final int a(int i4, String str, String str2, long j4) {
        return vX().O(j4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0051, code lost:
        if (r8.wP() <= 0) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00d4, code lost:
        if (r8.wP() > 0) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0065 A[Catch: all -> 0x0143, TryCatch #1 {all -> 0x0143, blocks: (B:9:0x0034, B:11:0x003b, B:13:0x0042, B:15:0x0049, B:18:0x0056, B:21:0x0065, B:23:0x0070, B:17:0x0053), top: B:84:0x0034 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00cc A[Catch: all -> 0x0141, TryCatch #0 {all -> 0x0141, blocks: (B:55:0x00f1, B:56:0x00fd, B:58:0x0113, B:60:0x0117, B:61:0x012f, B:62:0x0136, B:35:0x00a3, B:40:0x00c5, B:42:0x00cc, B:46:0x00da, B:49:0x00e5), top: B:82:0x00f1 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00fd A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(com.kwad.framework.filedownloader.b.a.InterfaceC0493a r26) {
        /*
            Method dump skipped, instructions count: 456
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kwad.framework.filedownloader.download.b.a(com.kwad.framework.filedownloader.b.a$a):void");
    }
}
