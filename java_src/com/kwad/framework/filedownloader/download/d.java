package com.kwad.framework.filedownloader.download;

import android.database.sqlite.SQLiteFullException;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.SystemClock;
import com.kwad.framework.filedownloader.exception.FileDownloadGiveUpRetryException;
import com.kwad.framework.filedownloader.exception.FileDownloadOutOfSpaceException;
import com.kwad.sdk.crash.utils.h;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.LockSupport;
/* loaded from: classes5.dex */
public final class d implements Handler.Callback {
    private final com.kwad.framework.filedownloader.d.c agQ;
    private volatile Thread agl;
    private final int ahA;
    private final int ahB;
    private long ahC;
    private HandlerThread ahD;
    private volatile boolean ahG;
    private final a ahy;
    private final int ahz;
    private Handler handler;
    private volatile boolean ahE = false;
    private volatile long ahk = 0;
    private final AtomicLong ahF = new AtomicLong();
    private boolean ahH = true;
    private final com.kwad.framework.filedownloader.b.a agL = b.vS().vU();

    /* loaded from: classes5.dex */
    public static class a {
        private boolean ahI;
        private Exception ahJ;
        private int ahK;

        final void be(boolean z4) {
            this.ahI = z4;
        }

        final void bu(int i4) {
            this.ahK = i4;
        }

        final void f(Exception exc) {
            this.ahJ = exc;
        }

        public final Exception getException() {
            return this.ahJ;
        }

        public final int uD() {
            return this.ahK;
        }

        public final boolean wu() {
            return this.ahI;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(com.kwad.framework.filedownloader.d.c cVar, int i4, int i5, int i6) {
        this.agQ = cVar;
        this.ahA = i5 < 5 ? 5 : i5;
        this.ahB = i6;
        this.ahy = new a();
        this.ahz = i4;
    }

    private boolean P(long j4) {
        if (!this.ahH) {
            return this.ahC != -1 && this.ahF.get() >= this.ahC && j4 - this.ahk >= ((long) this.ahA);
        }
        this.ahH = false;
        return true;
    }

    private synchronized void b(Message message) {
        if (!this.ahD.isAlive()) {
            if (com.kwad.framework.filedownloader.f.d.ajb) {
                com.kwad.framework.filedownloader.f.d.c(this, "require callback %d but the host thread of the flow has already dead, what is occurred because of there are several reason can final this flow on different thread.", Integer.valueOf(message.what));
            }
            return;
        }
        try {
            this.handler.sendMessage(message);
        } catch (IllegalStateException e5) {
            if (!this.ahD.isAlive()) {
                if (com.kwad.framework.filedownloader.f.d.ajb) {
                    com.kwad.framework.filedownloader.f.d.c(this, "require callback %d but the host thread of the flow has already dead, what is occurred because of there are several reason can final this flow on different thread.", Integer.valueOf(message.what));
                    return;
                }
                return;
            }
            throw e5;
        }
    }

    private Exception d(Exception exc) {
        long length;
        String wh = this.agQ.wh();
        if ((this.agQ.isChunked() || com.kwad.framework.filedownloader.f.e.xr().ajh) && (exc instanceof IOException) && new File(wh).exists()) {
            long availableBytes = h.getAvailableBytes(wh);
            if (availableBytes <= 4096) {
                File file = new File(wh);
                if (!file.exists()) {
                    com.kwad.framework.filedownloader.f.d.a(this, exc, "Exception with: free space isn't enough, and the target file not exist.", new Object[0]);
                    length = 0;
                } else {
                    length = file.length();
                }
                if (Build.VERSION.SDK_INT >= 9) {
                    return new FileDownloadOutOfSpaceException(availableBytes, 4096L, length, exc);
                }
                return new FileDownloadOutOfSpaceException(availableBytes, 4096L, length);
            }
            return exc;
        }
        return exc;
    }

    private void e(Exception exc) {
        Exception exc2;
        Exception d5 = d(exc);
        if (d5 instanceof SQLiteFullException) {
            a((SQLiteFullException) d5);
            exc2 = d5;
        } else {
            try {
                this.agQ.d((byte) -1);
                this.agQ.br(exc.toString());
                this.agL.a(this.agQ.getId(), d5, this.agQ.wP());
                exc2 = d5;
            } catch (SQLiteFullException e5) {
                SQLiteFullException sQLiteFullException = e5;
                a(sQLiteFullException);
                exc2 = sQLiteFullException;
            }
        }
        this.ahy.f(exc2);
        c((byte) -1);
    }

    private static long h(long j4, long j5) {
        if (j5 <= 0) {
            return -1L;
        }
        if (j4 == -1) {
            return 1L;
        }
        long j6 = j4 / (j5 + 1);
        if (j6 <= 0) {
            return 1L;
        }
        return j6;
    }

    private void wq() {
        String wh = this.agQ.wh();
        String targetFilePath = this.agQ.getTargetFilePath();
        File file = new File(wh);
        try {
            File file2 = new File(targetFilePath);
            if (file2.exists()) {
                long length = file2.length();
                if (file2.delete()) {
                    com.kwad.framework.filedownloader.f.d.d(this, "The target file([%s], [%d]) will be replaced with the new downloaded file[%d]", targetFilePath, Long.valueOf(length), Long.valueOf(file.length()));
                } else {
                    throw new IOException(com.kwad.framework.filedownloader.f.f.b("Can't delete the old file([%s], [%d]), so can't replace it with the new downloaded one.", targetFilePath, Long.valueOf(length)));
                }
            }
            if (file.renameTo(file2)) {
                if (!file.exists() || file.delete()) {
                    return;
                }
                com.kwad.framework.filedownloader.f.d.d(this, "delete the temp file(%s) failed, on completed downloading.", wh);
                return;
            }
            throw new IOException(com.kwad.framework.filedownloader.f.f.b("Can't rename the  temp downloaded file(%s) to the target file(%s)", wh, targetFilePath));
        } catch (Throwable th) {
            if (file.exists() && !file.delete()) {
                com.kwad.framework.filedownloader.f.d.d(this, "delete the temp file(%s) failed, on completed downloading.", wh);
            }
            throw th;
        }
    }

    private void wr() {
        wq();
        this.agQ.d((byte) -3);
        this.agL.c(this.agQ.getId(), this.agQ.getTotal());
        this.agL.bm(this.agQ.getId());
        c((byte) -3);
        if (com.kwad.framework.filedownloader.f.e.xr().aji) {
            com.kwad.framework.filedownloader.services.f.f(this.agQ);
        }
    }

    private boolean ws() {
        if (this.agQ.isChunked()) {
            com.kwad.framework.filedownloader.d.c cVar = this.agQ;
            cVar.U(cVar.wP());
        } else if (this.agQ.wP() != this.agQ.getTotal()) {
            c(new FileDownloadGiveUpRetryException(com.kwad.framework.filedownloader.f.f.b("sofar[%d] not equal total[%d]", Long.valueOf(this.agQ.wP()), Long.valueOf(this.agQ.getTotal()))));
            return true;
        }
        return false;
    }

    private void wt() {
        this.agQ.d((byte) -2);
        this.agL.d(this.agQ.getId(), this.agQ.wP());
        c((byte) -2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(boolean z4, long j4, String str, String str2) {
        String wQ = this.agQ.wQ();
        if (wQ != null && !wQ.equals(str)) {
            throw new IllegalArgumentException(com.kwad.framework.filedownloader.f.f.b("callback onConnected must with precondition succeed, but the etag is changes(%s != %s)", str, wQ));
        }
        this.ahy.be(z4);
        this.agQ.d((byte) 2);
        this.agQ.U(j4);
        this.agQ.bq(str);
        this.agQ.bs(str2);
        this.agL.a(this.agQ.getId(), j4, str, str2);
        c((byte) 2);
        this.ahC = h(j4, this.ahB);
        this.ahG = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(Exception exc) {
        e(exc);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0024 A[DONT_GENERATE] */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean handleMessage(android.os.Message r5) {
        /*
            r4 = this;
            r0 = 1
            r4.ahE = r0
            int r1 = r5.what
            r2 = 3
            r3 = 0
            if (r1 == r2) goto L17
            r2 = 5
            if (r1 == r2) goto Ld
            goto L1e
        Ld:
            java.lang.Object r1 = r5.obj     // Catch: java.lang.Throwable -> L2a
            java.lang.Exception r1 = (java.lang.Exception) r1     // Catch: java.lang.Throwable -> L2a
            int r5 = r5.arg1     // Catch: java.lang.Throwable -> L2a
            r4.a(r1, r5)     // Catch: java.lang.Throwable -> L2a
            goto L1e
        L17:
            long r1 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L2a
            r4.b(r1, r0)     // Catch: java.lang.Throwable -> L2a
        L1e:
            r4.ahE = r3
            java.lang.Thread r5 = r4.agl
            if (r5 == 0) goto L29
            java.lang.Thread r5 = r4.agl
            java.util.concurrent.locks.LockSupport.unpark(r5)
        L29:
            return r0
        L2a:
            r5 = move-exception
            r4.ahE = r3
            java.lang.Thread r0 = r4.agl
            if (r0 == 0) goto L36
            java.lang.Thread r0 = r4.agl
            java.util.concurrent.locks.LockSupport.unpark(r0)
        L36:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kwad.framework.filedownloader.download.d.handleMessage(android.os.Message):boolean");
    }

    public final boolean isAlive() {
        HandlerThread handlerThread = this.ahD;
        return handlerThread != null && handlerThread.isAlive();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void onProgress(long j4) {
        this.ahF.addAndGet(j4);
        this.agQ.T(j4);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean P = P(elapsedRealtime);
        Handler handler = this.handler;
        if (handler == null) {
            b(elapsedRealtime, P);
        } else if (P) {
            b(handler.obtainMessage(3));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void wk() {
        Handler handler = this.handler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.ahD.quit();
            this.agl = Thread.currentThread();
            while (this.ahE) {
                LockSupport.parkNanos(TimeUnit.MILLISECONDS.toNanos(100L));
            }
            this.agl = null;
        }
    }

    public final void wl() {
        this.agQ.d((byte) 1);
        this.agL.bo(this.agQ.getId());
        c((byte) 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void wm() {
        this.agQ.d((byte) 6);
        c((byte) 6);
        this.agL.bj(this.agQ.getId());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void wn() {
        HandlerThread handlerThread = new HandlerThread("source-status-callback", 10);
        this.ahD = handlerThread;
        handlerThread.start();
        this.handler = new Handler(this.ahD.getLooper(), this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void wo() {
        wt();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void wp() {
        if (ws()) {
            return;
        }
        wr();
    }

    private void c(byte b5) {
        if (b5 == -2) {
            if (com.kwad.framework.filedownloader.f.d.ajb) {
                com.kwad.framework.filedownloader.f.d.c(this, "High concurrent cause, Already paused and we don't need to call-back to Task in here, %d", Integer.valueOf(this.agQ.getId()));
                return;
            }
            return;
        }
        com.kwad.framework.filedownloader.message.e.wJ().s(com.kwad.framework.filedownloader.message.f.a(b5, this.agQ, this.ahy));
    }

    private void b(long j4, boolean z4) {
        if (this.agQ.wP() == this.agQ.getTotal()) {
            this.agL.b(this.agQ.getId(), this.agQ.wP());
            return;
        }
        if (this.ahG) {
            this.ahG = false;
            this.agQ.d((byte) 3);
        }
        if (z4) {
            this.ahk = j4;
            c((byte) 3);
            this.ahF.set(0L);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(Exception exc, int i4, long j4) {
        this.ahF.set(0L);
        this.agQ.T(-j4);
        Handler handler = this.handler;
        if (handler == null) {
            a(exc, i4);
        } else {
            b(handler.obtainMessage(5, i4, 0, exc));
        }
    }

    private void a(SQLiteFullException sQLiteFullException) {
        int id = this.agQ.getId();
        if (com.kwad.framework.filedownloader.f.d.ajb) {
            com.kwad.framework.filedownloader.f.d.c(this, "the data of the task[%d] is dirty, because the SQLite full exception[%s], so remove it from the database directly.", Integer.valueOf(id), sQLiteFullException.toString());
        }
        this.agQ.br(sQLiteFullException.toString());
        this.agQ.d((byte) -1);
        this.agL.bn(id);
        this.agL.bm(id);
    }

    private void a(Exception exc, int i4) {
        Exception d5 = d(exc);
        this.ahy.f(d5);
        this.ahy.bu(this.ahz - i4);
        this.agQ.d((byte) 5);
        this.agQ.br(d5.toString());
        this.agL.a(this.agQ.getId(), d5);
        c((byte) 5);
    }
}
