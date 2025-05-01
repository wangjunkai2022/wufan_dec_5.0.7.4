package com.kwad.framework.filedownloader.download;

import android.os.SystemClock;
import java.io.IOException;
/* loaded from: classes5.dex */
public final class e {
    private final String Wx;
    private final long agE;
    long agF;
    private final long agG;
    private final com.kwad.framework.filedownloader.b.a agL;
    private final boolean agT;
    private final int agw;
    private final c ahL;
    private final com.kwad.framework.filedownloader.a.b ahM;
    private com.kwad.framework.filedownloader.e.a ahN;
    private volatile long ahO;
    private volatile long ahP;
    private final f aht;
    private final int ahv;
    private final long contentLength;
    private volatile boolean kH;

    /* loaded from: classes5.dex */
    public static class a {
        String Wx;
        Integer agC;
        com.kwad.framework.filedownloader.download.a agD;
        com.kwad.framework.filedownloader.a.b ahM;
        c ahQ;
        Boolean ahq;
        f aht;
        Integer ahx;

        public final a a(c cVar) {
            this.ahQ = cVar;
            return this;
        }

        public final a b(f fVar) {
            this.aht = fVar;
            return this;
        }

        public final a bf(boolean z4) {
            this.ahq = Boolean.valueOf(z4);
            return this;
        }

        public final a bo(String str) {
            this.Wx = str;
            return this;
        }

        public final a bv(int i4) {
            this.ahx = Integer.valueOf(i4);
            return this;
        }

        public final a bw(int i4) {
            this.agC = Integer.valueOf(i4);
            return this;
        }

        public final a c(com.kwad.framework.filedownloader.download.a aVar) {
            this.agD = aVar;
            return this;
        }

        public final a d(com.kwad.framework.filedownloader.a.b bVar) {
            this.ahM = bVar;
            return this;
        }

        public final e ww() {
            com.kwad.framework.filedownloader.a.b bVar;
            com.kwad.framework.filedownloader.download.a aVar;
            Integer num;
            if (this.ahq != null && (bVar = this.ahM) != null && (aVar = this.agD) != null && this.aht != null && this.Wx != null && (num = this.agC) != null && this.ahx != null) {
                return new e(bVar, aVar, this.ahQ, num.intValue(), this.ahx.intValue(), this.ahq.booleanValue(), this.aht, this.Wx, (byte) 0);
            }
            throw new IllegalArgumentException();
        }
    }

    /* synthetic */ e(com.kwad.framework.filedownloader.a.b bVar, com.kwad.framework.filedownloader.download.a aVar, c cVar, int i4, int i5, boolean z4, f fVar, String str, byte b5) {
        this(bVar, aVar, cVar, i4, i5, z4, fVar, str);
    }

    private void sync() {
        boolean z4;
        long uptimeMillis = SystemClock.uptimeMillis();
        try {
            this.ahN.xm();
            z4 = true;
        } catch (IOException e5) {
            if (com.kwad.framework.filedownloader.f.d.ajb) {
                com.kwad.framework.filedownloader.f.d.c(this, "Because of the system cannot guarantee that all the buffers have been synchronized with physical media, or write to filefailed, we just not flushAndSync process to database too %s", e5);
            }
            z4 = false;
        }
        if (z4) {
            if (this.ahL != null) {
                this.agL.a(this.agw, this.ahv, this.agF);
            } else {
                this.aht.we();
            }
            if (com.kwad.framework.filedownloader.f.d.ajb) {
                com.kwad.framework.filedownloader.f.d.c(this, "require flushAndSync id[%d] index[%d] offset[%d], consume[%d]", Integer.valueOf(this.agw), Integer.valueOf(this.ahv), Long.valueOf(this.agF), Long.valueOf(SystemClock.uptimeMillis() - uptimeMillis));
            }
        }
    }

    private void wv() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (com.kwad.framework.filedownloader.f.f.i(this.agF - this.ahO, elapsedRealtime - this.ahP)) {
            sync();
            this.ahO = this.agF;
            this.ahP = elapsedRealtime;
        }
    }

    public final void pause() {
        this.kH = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x011b, code lost:
        if (r13 == null) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x011d, code lost:
        sync();
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0120, code lost:
        com.kwad.sdk.crash.utils.b.closeQuietly(r8);
        com.kwad.sdk.crash.utils.b.closeQuietly(r13);
        r6 = r16.agF - r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x012d, code lost:
        if (r2 == (-1)) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0131, code lost:
        if (r2 != r6) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0170, code lost:
        throw new com.kwad.framework.filedownloader.exception.FileDownloadGiveUpRetryException(com.kwad.framework.filedownloader.f.f.b("fetched length[%d] != content length[%d], range[%d, %d) offset[%d] fetch begin offset", java.lang.Long.valueOf(r6), java.lang.Long.valueOf(r2), java.lang.Long.valueOf(r16.agE), java.lang.Long.valueOf(r16.agG), java.lang.Long.valueOf(r16.agF), java.lang.Long.valueOf(r4)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0171, code lost:
        r16.aht.a(r16.ahL, r16.agE, r16.agG);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x017c, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kwad.framework.filedownloader.download.e.run():void");
    }

    private e(com.kwad.framework.filedownloader.a.b bVar, com.kwad.framework.filedownloader.download.a aVar, c cVar, int i4, int i5, boolean z4, f fVar, String str) {
        this.ahO = 0L;
        this.ahP = 0L;
        this.aht = fVar;
        this.Wx = str;
        this.ahM = bVar;
        this.agT = z4;
        this.ahL = cVar;
        this.ahv = i5;
        this.agw = i4;
        this.agL = b.vS().vU();
        this.agE = aVar.agE;
        this.agG = aVar.agG;
        this.agF = aVar.agF;
        this.contentLength = aVar.contentLength;
    }
}
