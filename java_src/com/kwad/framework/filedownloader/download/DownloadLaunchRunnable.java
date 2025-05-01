package com.kwad.framework.filedownloader.download;

import com.kuaishou.weapon.p0.g;
import com.kwad.framework.filedownloader.download.c;
import com.kwad.framework.filedownloader.download.e;
import com.kwad.framework.filedownloader.exception.FileDownloadGiveUpRetryException;
import com.kwad.framework.filedownloader.exception.FileDownloadHttpException;
import com.kwad.framework.filedownloader.exception.FileDownloadNetworkPolicyException;
import com.kwad.framework.filedownloader.exception.FileDownloadOutOfSpaceException;
import com.kwad.framework.filedownloader.y;
import com.kwad.sdk.crash.utils.h;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes5.dex */
public final class DownloadLaunchRunnable implements f, Runnable {
    private static final ThreadPoolExecutor ahb = com.kwad.framework.filedownloader.f.b.bt("ConnectionBlock");
    private final com.kwad.framework.filedownloader.b.a agL;
    private final d agO;
    private final int agP;
    private final com.kwad.framework.filedownloader.d.c agQ;
    private final com.kwad.framework.filedownloader.d.b agR;
    private final boolean agS;
    private final boolean agT;
    private final y agU;
    private boolean agV;
    int agW;
    private final boolean agX;
    private final ArrayList<c> agY;
    private e agZ;
    private boolean aha;
    private boolean ahc;
    private boolean ahd;
    private boolean ahe;
    private final AtomicBoolean ahf;
    private volatile boolean ahg;
    private volatile Exception ahh;
    private String ahi;
    private long ahj;
    private long ahk;
    private long ahl;
    private long ahm;
    private volatile boolean kH;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public class DiscardSafely extends Throwable {
        private static final long serialVersionUID = 4243896780616180062L;

        DiscardSafely() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public class RetryDirectly extends Throwable {
        private static final long serialVersionUID = -4127585119566978768L;

        RetryDirectly() {
        }
    }

    /* loaded from: classes5.dex */
    public static class a {
        private com.kwad.framework.filedownloader.d.c agQ;
        private y agU;
        private com.kwad.framework.filedownloader.d.b agx;
        private Integer ahn;
        private Integer aho;
        private Boolean ahp;
        private Boolean ahq;
        private Integer ahr;

        public final a a(y yVar) {
            this.agU = yVar;
            return this;
        }

        public final a b(com.kwad.framework.filedownloader.d.b bVar) {
            this.agx = bVar;
            return this;
        }

        public final a c(Integer num) {
            this.ahr = num;
            return this;
        }

        public final a e(com.kwad.framework.filedownloader.d.c cVar) {
            this.agQ = cVar;
            return this;
        }

        public final DownloadLaunchRunnable wi() {
            if (this.agQ != null && this.agU != null && this.ahn != null && this.aho != null && this.ahp != null && this.ahq != null && this.ahr != null) {
                return new DownloadLaunchRunnable(this.agQ, this.agx, this.agU, this.ahn.intValue(), this.aho.intValue(), this.ahp.booleanValue(), this.ahq.booleanValue(), this.ahr.intValue(), (byte) 0);
            }
            throw new IllegalArgumentException();
        }

        public final a a(Integer num) {
            this.ahn = num;
            return this;
        }

        public final a b(Integer num) {
            this.aho = num;
            return this;
        }

        public final a a(Boolean bool) {
            this.ahp = bool;
            return this;
        }

        public final a b(Boolean bool) {
            this.ahq = bool;
            return this;
        }
    }

    /* synthetic */ DownloadLaunchRunnable(com.kwad.framework.filedownloader.d.c cVar, com.kwad.framework.filedownloader.d.b bVar, y yVar, int i4, int i5, boolean z4, boolean z5, int i6, byte b5) {
        this(cVar, bVar, yVar, i4, i5, z4, z5, i6);
    }

    private void a(Map<String, List<String>> map, ConnectTask connectTask, com.kwad.framework.filedownloader.a.b bVar) {
        int id = this.agQ.getId();
        int responseCode = bVar.getResponseCode();
        this.ahd = responseCode == 206 || responseCode == 1;
        boolean z4 = responseCode == 200 || responseCode == 201 || responseCode == 0;
        String wQ = this.agQ.wQ();
        String a5 = com.kwad.framework.filedownloader.f.f.a(id, bVar);
        if (responseCode == 412 || !(wQ == null || wQ.equals(a5) || (!z4 && !this.ahd)) || ((responseCode == 201 && connectTask.vO()) || (responseCode == 416 && this.agQ.wP() > 0))) {
            if (this.ahc) {
                com.kwad.framework.filedownloader.f.d.d(this, "there is precondition failed on this request[%d] with old etag[%s]、new etag[%s]、response requestHttpCode is %d", Integer.valueOf(id), wQ, a5, Integer.valueOf(responseCode));
            }
            this.agL.bm(this.agQ.getId());
            com.kwad.framework.filedownloader.f.f.B(this.agQ.getTargetFilePath(), this.agQ.wh());
            this.ahc = false;
            if (wQ != 0 && wQ.equals(a5)) {
                com.kwad.framework.filedownloader.f.d.d(this, "the old etag[%s] is the same to the new etag[%s], but the response status requestHttpCode is %d not Partial(206), so wo have to start this task from very beginning for task[%d]!", wQ, a5, Integer.valueOf(responseCode), Integer.valueOf(id));
                a5 = null;
            }
            this.agQ.S(0L);
            this.agQ.U(0L);
            this.agQ.bq(a5);
            this.agQ.wT();
            this.agL.a(id, this.agQ.wQ(), this.agQ.wP(), this.agQ.getTotal(), this.agQ.wS());
            throw new RetryDirectly();
        }
        this.ahi = connectTask.vP();
        if (!this.ahd && !z4) {
            throw new FileDownloadHttpException(responseCode, map, bVar.vH());
        }
        long b5 = com.kwad.framework.filedownloader.f.f.b(id, bVar);
        String a6 = this.agQ.uv() ? com.kwad.framework.filedownloader.f.f.a(bVar, this.agQ.getUrl()) : null;
        boolean z5 = b5 == -1;
        this.ahe = z5;
        this.agO.a(this.ahc && this.ahd, !z5 ? this.agQ.wP() + b5 : b5, a5, a6);
    }

    private void b(long j4, int i4) {
        long j5 = j4 / i4;
        int id = this.agQ.getId();
        ArrayList arrayList = new ArrayList();
        int i5 = 0;
        long j6 = 0;
        while (i5 < i4) {
            long j7 = i5 == i4 + (-1) ? 0L : (j6 + j5) - 1;
            com.kwad.framework.filedownloader.d.a aVar = new com.kwad.framework.filedownloader.d.a();
            aVar.setId(id);
            aVar.setIndex(i5);
            aVar.setStartOffset(j6);
            aVar.Q(j6);
            aVar.R(j7);
            arrayList.add(aVar);
            this.agL.a(aVar);
            j6 += j5;
            i5++;
        }
        this.agQ.bD(i4);
        this.agL.s(id, i4);
        b(arrayList, j4);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.kwad.framework.filedownloader.download.a q(java.util.List<com.kwad.framework.filedownloader.d.a> r21) {
        /*
            r20 = this;
            r0 = r20
            com.kwad.framework.filedownloader.d.c r1 = r0.agQ
            int r1 = r1.wS()
            com.kwad.framework.filedownloader.d.c r2 = r0.agQ
            java.lang.String r2 = r2.wh()
            com.kwad.framework.filedownloader.d.c r3 = r0.agQ
            java.lang.String r3 = r3.getTargetFilePath()
            r4 = 0
            r5 = 1
            if (r1 <= r5) goto L1a
            r6 = 1
            goto L1b
        L1a:
            r6 = 0
        L1b:
            r7 = 0
            if (r6 == 0) goto L23
            boolean r9 = r0.agX
            if (r9 == 0) goto L54
        L23:
            com.kwad.framework.filedownloader.d.c r9 = r0.agQ
            int r9 = r9.getId()
            com.kwad.framework.filedownloader.d.c r10 = r0.agQ
            boolean r9 = com.kwad.framework.filedownloader.f.f.b(r9, r10)
            if (r9 == 0) goto L54
            boolean r9 = r0.agX
            if (r9 != 0) goto L40
            java.io.File r1 = new java.io.File
            r1.<init>(r2)
            long r9 = r1.length()
        L3e:
            r14 = r9
            goto L55
        L40:
            if (r6 == 0) goto L4d
            int r6 = r21.size()
            if (r1 != r6) goto L54
            long r9 = com.kwad.framework.filedownloader.d.a.r(r21)
            goto L3e
        L4d:
            com.kwad.framework.filedownloader.d.c r1 = r0.agQ
            long r9 = r1.wP()
            goto L3e
        L54:
            r14 = r7
        L55:
            com.kwad.framework.filedownloader.d.c r1 = r0.agQ
            r1.S(r14)
            int r1 = (r14 > r7 ? 1 : (r14 == r7 ? 0 : -1))
            if (r1 <= 0) goto L5f
            r4 = 1
        L5f:
            r0.ahc = r4
            if (r4 != 0) goto L71
            com.kwad.framework.filedownloader.b.a r1 = r0.agL
            com.kwad.framework.filedownloader.d.c r4 = r0.agQ
            int r4 = r4.getId()
            r1.bm(r4)
            com.kwad.framework.filedownloader.f.f.B(r3, r2)
        L71:
            com.kwad.framework.filedownloader.download.a r1 = new com.kwad.framework.filedownloader.download.a
            r12 = 0
            r16 = 0
            com.kwad.framework.filedownloader.d.c r2 = r0.agQ
            long r2 = r2.getTotal()
            long r18 = r2 - r14
            r11 = r1
            r11.<init>(r12, r14, r16, r18)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kwad.framework.filedownloader.download.DownloadLaunchRunnable.q(java.util.List):com.kwad.framework.filedownloader.download.a");
    }

    private boolean wd() {
        return (!this.ahc || this.agQ.wS() > 1) && this.ahd && this.agX && !this.ahe;
    }

    private void wf() {
        if (this.agT && !com.kwad.framework.filedownloader.f.f.bB(g.f55582b)) {
            throw new FileDownloadGiveUpRetryException(com.kwad.framework.filedownloader.f.f.b("Task[%d] can't start the download runnable, because this task require wifi, but user application nor current process has %s, so we can't check whether the network type connection.", Integer.valueOf(this.agQ.getId()), g.f55582b));
        }
        if (this.agT && com.kwad.framework.filedownloader.f.f.xw()) {
            throw new FileDownloadNetworkPolicyException();
        }
    }

    private void wg() {
        int id = this.agQ.getId();
        if (this.agQ.uv()) {
            String targetFilePath = this.agQ.getTargetFilePath();
            int A = com.kwad.framework.filedownloader.f.f.A(this.agQ.getUrl(), targetFilePath);
            if (!com.kwad.framework.filedownloader.f.c.a(id, targetFilePath, this.agS, false)) {
                com.kwad.framework.filedownloader.d.c bk = this.agL.bk(A);
                if (bk != null) {
                    if (!com.kwad.framework.filedownloader.f.c.a(id, bk, this.agU, false)) {
                        List<com.kwad.framework.filedownloader.d.a> bl = this.agL.bl(A);
                        this.agL.bn(A);
                        this.agL.bm(A);
                        com.kwad.framework.filedownloader.f.f.bF(this.agQ.getTargetFilePath());
                        if (com.kwad.framework.filedownloader.f.f.b(A, bk)) {
                            this.agQ.S(bk.wP());
                            this.agQ.U(bk.getTotal());
                            this.agQ.bq(bk.wQ());
                            this.agQ.bD(bk.wS());
                            this.agL.b(this.agQ);
                            if (bl != null) {
                                for (com.kwad.framework.filedownloader.d.a aVar : bl) {
                                    aVar.setId(id);
                                    this.agL.a(aVar);
                                }
                            }
                            throw new RetryDirectly();
                        }
                    } else {
                        this.agL.bn(id);
                        this.agL.bm(id);
                        throw new DiscardSafely();
                    }
                }
                if (com.kwad.framework.filedownloader.f.c.a(id, this.agQ.wP(), this.agQ.wh(), targetFilePath, this.agU)) {
                    this.agL.bn(id);
                    this.agL.bm(id);
                    throw new DiscardSafely();
                }
                return;
            }
            this.agL.bn(id);
            this.agL.bm(id);
            throw new DiscardSafely();
        }
    }

    public final int getId() {
        return this.agQ.getId();
    }

    public final boolean isAlive() {
        return this.ahf.get() || this.agO.isAlive();
    }

    @Override // com.kwad.framework.filedownloader.download.f
    public final void onProgress(long j4) {
        if (this.kH) {
            return;
        }
        this.agO.onProgress(j4);
    }

    public final void pause() {
        this.kH = true;
        e eVar = this.agZ;
        if (eVar != null) {
            eVar.pause();
        }
        Iterator it2 = ((ArrayList) this.agY.clone()).iterator();
        while (it2.hasNext()) {
            c cVar = (c) it2.next();
            if (cVar != null) {
                cVar.pause();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01e7, code lost:
        if (r9 == null) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01e9, code lost:
        r9.vI();
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01ff, code lost:
        throw new java.lang.IllegalAccessException(com.kwad.framework.filedownloader.f.f.b("invalid connection count %d, the connection count must be larger than 0", r9));
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x009f, code lost:
        if (com.kwad.framework.filedownloader.f.d.ajb == false) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a1, code lost:
        com.kwad.framework.filedownloader.f.d.c(r19, "High concurrent cause, start runnable but already paused %d", java.lang.Integer.valueOf(r19.agQ.getId()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b2, code lost:
        r19.agO.wk();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b9, code lost:
        if (r19.kH == false) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00be, code lost:
        if (r19.ahg == false) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c1, code lost:
        r19.agO.wp();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c7, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c8, code lost:
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0120, code lost:
        if (r19.kH == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0122, code lost:
        r19.agQ.d((byte) -2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0127, code lost:
        if (r9 == null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0129, code lost:
        r9.vI();
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x012c, code lost:
        r19.agO.wk();
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0133, code lost:
        if (r19.kH == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0139, code lost:
        if (r19.ahg == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x013d, code lost:
        r19.agO.wp();
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0144, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0145, code lost:
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0148, code lost:
        wg();
        r14 = r19.agQ.getTotal();
        a(r14, r19.agQ.wh());
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x015e, code lost:
        if (wd() == false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0162, code lost:
        if (r19.ahc == false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0164, code lost:
        r10 = r19.agQ.wS();
        r17 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x016d, code lost:
        r17 = r14;
        r10 = com.kwad.framework.filedownloader.download.b.vS().a(r19.agQ.getId(), r19.agQ.getUrl(), r19.agQ.getPath(), r17);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x018d, code lost:
        r17 = r14;
        r10 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0190, code lost:
        if (r10 <= 0) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0194, code lost:
        if (r19.kH == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0196, code lost:
        r19.agQ.d((byte) -2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x019b, code lost:
        if (r9 == null) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x019d, code lost:
        r9.vI();
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01a0, code lost:
        r19.agO.wk();
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01a7, code lost:
        if (r19.kH == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01ad, code lost:
        if (r19.ahg == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01b1, code lost:
        r19.agO.wp();
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01b8, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01b9, code lost:
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01bc, code lost:
        if (r10 != 1) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01be, code lost:
        r11 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01c0, code lost:
        r11 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01c1, code lost:
        r19.aha = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01c3, code lost:
        if (r11 == false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01c5, code lost:
        a(r8.vQ(), r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01cd, code lost:
        if (r9 == null) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01cf, code lost:
        r9.vI();
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01d3, code lost:
        r2 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01d4, code lost:
        r19.agO.wn();
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01db, code lost:
        if (r19.ahc == false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01dd, code lost:
        a(r10, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01e1, code lost:
        b(r17, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01e6, code lost:
        r9 = r2;
     */
    /* JADX WARN: Removed duplicated region for block: B:157:0x025e A[Catch: all -> 0x0219, TryCatch #27 {all -> 0x0219, blocks: (B:46:0x00cf, B:95:0x01d4, B:97:0x01dd, B:98:0x01e1, B:155:0x0258, B:157:0x025e, B:160:0x0266, B:126:0x021c), top: B:206:0x0258 }] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0271 A[Catch: all -> 0x0291, TryCatch #25 {all -> 0x0291, blocks: (B:3:0x0005, B:6:0x0014, B:8:0x001c, B:10:0x0020, B:11:0x0032, B:25:0x0090, B:27:0x0094, B:28:0x0099, B:30:0x009d, B:32:0x00a1, B:43:0x00ca, B:51:0x0129, B:74:0x019d, B:101:0x01e9, B:164:0x0271, B:165:0x0274, B:130:0x022b, B:128:0x0224, B:162:0x026b), top: B:205:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0266 A[SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 707
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kwad.framework.filedownloader.download.DownloadLaunchRunnable.run():void");
    }

    public final void wc() {
        if (this.agQ.wS() > 1) {
            List<com.kwad.framework.filedownloader.d.a> bl = this.agL.bl(this.agQ.getId());
            if (this.agQ.wS() == bl.size()) {
                this.agQ.S(com.kwad.framework.filedownloader.d.a.r(bl));
            } else {
                this.agQ.S(0L);
                this.agL.bm(this.agQ.getId());
            }
        }
        this.agO.wl();
    }

    @Override // com.kwad.framework.filedownloader.download.f
    public final void we() {
        this.agL.b(this.agQ.getId(), this.agQ.wP());
    }

    public final String wh() {
        return this.agQ.wh();
    }

    private DownloadLaunchRunnable(com.kwad.framework.filedownloader.d.c cVar, com.kwad.framework.filedownloader.d.b bVar, y yVar, int i4, int i5, boolean z4, boolean z5, int i6) {
        this.agP = 5;
        this.agY = new ArrayList<>(5);
        this.ahj = 0L;
        this.ahk = 0L;
        this.ahl = 0L;
        this.ahm = 0L;
        this.ahf = new AtomicBoolean(true);
        this.kH = false;
        this.agV = false;
        this.agQ = cVar;
        this.agR = bVar;
        this.agS = z4;
        this.agT = z5;
        this.agL = b.vS().vU();
        this.agX = b.vS().vW();
        this.agU = yVar;
        this.agW = i6;
        this.agO = new d(cVar, i6, i4, i5);
    }

    private void b(List<com.kwad.framework.filedownloader.d.a> list, long j4) {
        long wM;
        int id = this.agQ.getId();
        String wQ = this.agQ.wQ();
        String str = this.ahi;
        if (str == null) {
            str = this.agQ.getUrl();
        }
        String wh = this.agQ.wh();
        if (com.kwad.framework.filedownloader.f.d.ajb) {
            com.kwad.framework.filedownloader.f.d.c(this, "fetch data with multiple connection(count: [%d]) for task[%d] totalLength[%d]", Integer.valueOf(list.size()), Integer.valueOf(id), Long.valueOf(j4));
        }
        boolean z4 = this.ahc;
        long j5 = 0;
        long j6 = 0;
        for (com.kwad.framework.filedownloader.d.a aVar : list) {
            if (aVar.wM() == j5) {
                wM = j4 - aVar.wL();
            } else {
                wM = (aVar.wM() - aVar.wL()) + 1;
            }
            long j7 = wM;
            j6 += aVar.wL() - aVar.getStartOffset();
            if (j7 == j5) {
                if (com.kwad.framework.filedownloader.f.d.ajb) {
                    com.kwad.framework.filedownloader.f.d.c(this, "pass connection[%d-%d], because it has been completed", Integer.valueOf(aVar.getId()), Integer.valueOf(aVar.getIndex()));
                }
            } else {
                c wj = new c.a().bt(id).d(Integer.valueOf(aVar.getIndex())).a(this).bl(str).bm(z4 ? wQ : null).c(this.agR).bd(this.agT).b(new com.kwad.framework.filedownloader.download.a(aVar.getStartOffset(), aVar.wL(), aVar.wM(), j7)).bn(wh).wj();
                if (com.kwad.framework.filedownloader.f.d.ajb) {
                    com.kwad.framework.filedownloader.f.d.c(this, "enable multiple connection: %s", aVar);
                }
                this.agY.add(wj);
            }
            j5 = 0;
        }
        if (j6 != this.agQ.wP()) {
            com.kwad.framework.filedownloader.f.d.d(this, "correct the sofar[%d] from connection table[%d]", Long.valueOf(this.agQ.wP()), Long.valueOf(j6));
            this.agQ.S(j6);
        }
        ArrayList arrayList = new ArrayList(this.agY.size());
        Iterator<c> it2 = this.agY.iterator();
        while (it2.hasNext()) {
            c next = it2.next();
            if (this.kH) {
                next.pause();
            } else {
                arrayList.add(Executors.callable(next));
            }
        }
        if (this.kH) {
            this.agQ.d((byte) -2);
            return;
        }
        List<Future> invokeAll = ahb.invokeAll(arrayList);
        if (com.kwad.framework.filedownloader.f.d.ajb) {
            for (Future future : invokeAll) {
                com.kwad.framework.filedownloader.f.d.c(this, "finish sub-task for [%d] %B %B", Integer.valueOf(id), Boolean.valueOf(future.isDone()), Boolean.valueOf(future.isCancelled()));
            }
        }
    }

    private void a(com.kwad.framework.filedownloader.download.a aVar, com.kwad.framework.filedownloader.a.b bVar) {
        if (!this.ahd) {
            this.agQ.S(0L);
            aVar = new com.kwad.framework.filedownloader.download.a(0L, 0L, aVar.agG, aVar.contentLength);
        }
        e.a aVar2 = new e.a();
        aVar2.b(this).bw(this.agQ.getId()).bv(-1).bf(this.agT).d(bVar).c(aVar).bo(this.agQ.wh());
        this.agQ.bD(1);
        this.agL.s(this.agQ.getId(), 1);
        this.agZ = aVar2.ww();
        if (this.kH) {
            this.agQ.d((byte) -2);
            this.agZ.pause();
            return;
        }
        this.agZ.run();
    }

    private void a(int i4, List<com.kwad.framework.filedownloader.d.a> list) {
        if (i4 > 1 && list.size() == i4) {
            b(list, this.agQ.getTotal());
            return;
        }
        throw new IllegalArgumentException();
    }

    private void a(long j4, String str) {
        com.kwad.framework.filedownloader.e.a aVar = null;
        if (j4 != -1) {
            try {
                aVar = com.kwad.framework.filedownloader.f.f.bD(this.agQ.wh());
                long length = new File(str).length();
                long j5 = j4 - length;
                long availableBytes = h.getAvailableBytes(str);
                if (availableBytes >= j5) {
                    if (!com.kwad.framework.filedownloader.f.e.xr().ajh) {
                        aVar.setLength(j4);
                    }
                } else {
                    throw new FileDownloadOutOfSpaceException(availableBytes, j5, length);
                }
            } finally {
                if (0 != 0) {
                    aVar.close();
                }
            }
        }
    }

    @Override // com.kwad.framework.filedownloader.download.f
    public final void b(Exception exc) {
        this.ahg = true;
        this.ahh = exc;
        if (this.kH) {
            if (com.kwad.framework.filedownloader.f.d.ajb) {
                com.kwad.framework.filedownloader.f.d.c(this, "the task[%d] has already been paused, so pass the error callback", Integer.valueOf(this.agQ.getId()));
                return;
            }
            return;
        }
        Iterator it2 = ((ArrayList) this.agY.clone()).iterator();
        while (it2.hasNext()) {
            c cVar = (c) it2.next();
            if (cVar != null) {
                cVar.vo();
            }
        }
    }

    @Override // com.kwad.framework.filedownloader.download.f
    public final void a(c cVar, long j4, long j5) {
        if (this.kH) {
            if (com.kwad.framework.filedownloader.f.d.ajb) {
                com.kwad.framework.filedownloader.f.d.c(this, "the task[%d] has already been paused, so pass the completed callback", Integer.valueOf(this.agQ.getId()));
                return;
            }
            return;
        }
        int i4 = cVar == null ? -1 : cVar.ahv;
        if (com.kwad.framework.filedownloader.f.d.ajb) {
            com.kwad.framework.filedownloader.f.d.c(this, "the connection has been completed(%d): [%d, %d)  %d", Integer.valueOf(i4), Long.valueOf(j4), Long.valueOf(j5), Long.valueOf(this.agQ.getTotal()));
        }
        if (this.aha) {
            if (j4 == 0 || j5 == this.agQ.getTotal()) {
                return;
            }
            com.kwad.framework.filedownloader.f.d.a(this, "the single task not completed corrected(%d, %d != %d) for task(%d)", Long.valueOf(j4), Long.valueOf(j5), Long.valueOf(this.agQ.getTotal()), Integer.valueOf(this.agQ.getId()));
            return;
        }
        synchronized (this.agY) {
            this.agY.remove(cVar);
        }
    }

    @Override // com.kwad.framework.filedownloader.download.f
    public final boolean a(Exception exc) {
        if (exc instanceof FileDownloadHttpException) {
            int code = ((FileDownloadHttpException) exc).getCode();
            if (this.aha && code == 416 && !this.agV) {
                com.kwad.framework.filedownloader.f.f.B(this.agQ.getTargetFilePath(), this.agQ.wh());
                this.agV = true;
                return true;
            }
        }
        return this.agW > 0 && !(exc instanceof FileDownloadGiveUpRetryException);
    }

    @Override // com.kwad.framework.filedownloader.download.f
    public final void a(Exception exc, long j4) {
        if (this.kH) {
            if (com.kwad.framework.filedownloader.f.d.ajb) {
                com.kwad.framework.filedownloader.f.d.c(this, "the task[%d] has already been paused, so pass the retry callback", Integer.valueOf(this.agQ.getId()));
                return;
            }
            return;
        }
        int i4 = this.agW;
        int i5 = i4 - 1;
        this.agW = i5;
        if (i4 < 0) {
            com.kwad.framework.filedownloader.f.d.a(this, "valid retry times is less than 0(%d) for download task(%d)", Integer.valueOf(i5), Integer.valueOf(this.agQ.getId()));
        }
        this.agO.a(exc, this.agW, j4);
    }
}
