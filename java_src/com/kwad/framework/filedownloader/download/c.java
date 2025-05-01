package com.kwad.framework.filedownloader.download;

import android.os.Process;
import com.kwad.framework.filedownloader.download.ConnectTask;
import com.kwad.framework.filedownloader.download.e;
import com.kwad.framework.filedownloader.exception.FileDownloadGiveUpRetryException;
import java.io.IOException;
import java.net.SocketException;
/* loaded from: classes5.dex */
public final class c implements Runnable {
    private final String Wx;
    private final boolean agT;
    private final int agw;
    private final ConnectTask ahs;
    private final f aht;
    private e ahu;
    final int ahv;
    private volatile boolean kH;

    /* loaded from: classes5.dex */
    public static class a {
        private String Wx;
        private Boolean ahq;
        private f aht;
        private final ConnectTask.a ahw = new ConnectTask.a();
        private Integer ahx;

        public final a a(f fVar) {
            this.aht = fVar;
            return this;
        }

        public final a b(com.kwad.framework.filedownloader.download.a aVar) {
            this.ahw.a(aVar);
            return this;
        }

        public final a bd(boolean z4) {
            this.ahq = Boolean.valueOf(z4);
            return this;
        }

        public final a bl(String str) {
            this.ahw.bi(str);
            return this;
        }

        public final a bm(String str) {
            this.ahw.bj(str);
            return this;
        }

        public final a bn(String str) {
            this.Wx = str;
            return this;
        }

        public final a bt(int i4) {
            this.ahw.bs(i4);
            return this;
        }

        public final a c(com.kwad.framework.filedownloader.d.b bVar) {
            this.ahw.a(bVar);
            return this;
        }

        public final a d(Integer num) {
            this.ahx = num;
            return this;
        }

        public final c wj() {
            if (this.aht != null && this.Wx != null && this.ahq != null && this.ahx != null) {
                ConnectTask vR = this.ahw.vR();
                return new c(vR.agw, this.ahx.intValue(), vR, this.aht, this.ahq.booleanValue(), this.Wx, (byte) 0);
            }
            throw new IllegalArgumentException(com.kwad.framework.filedownloader.f.f.b("%s %s %B", this.aht, this.Wx, this.ahq));
        }
    }

    /* synthetic */ c(int i4, int i5, ConnectTask connectTask, f fVar, boolean z4, String str, byte b5) {
        this(i4, i5, connectTask, fVar, z4, str);
    }

    public final void pause() {
        this.kH = true;
        e eVar = this.ahu;
        if (eVar != null) {
            eVar.pause();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z4;
        Exception e5;
        Process.setThreadPriority(10);
        long j4 = this.ahs.vQ().agF;
        com.kwad.framework.filedownloader.a.b bVar = null;
        boolean z5 = false;
        while (!this.kH) {
            try {
                try {
                    bVar = this.ahs.vN();
                    int responseCode = bVar.getResponseCode();
                    if (com.kwad.framework.filedownloader.f.d.ajb) {
                        com.kwad.framework.filedownloader.f.d.c(this, "the connection[%d] for %d, is connected %s with requestHttpCode[%d]", Integer.valueOf(this.ahv), Integer.valueOf(this.agw), this.ahs.vQ(), Integer.valueOf(responseCode));
                    }
                    if (responseCode != 206 && responseCode != 200) {
                        throw new SocketException(com.kwad.framework.filedownloader.f.f.b("Connection failed with request[%s] response[%s] http-state[%d] on task[%d-%d], which is changed after verify connection, so please try again.", this.ahs.getRequestHeader(), bVar.vH(), Integer.valueOf(responseCode), Integer.valueOf(this.agw), Integer.valueOf(this.ahv)));
                        break;
                    }
                } catch (FileDownloadGiveUpRetryException | IOException | ArrayIndexOutOfBoundsException | IllegalAccessException | IllegalArgumentException e6) {
                    e5 = e6;
                    z4 = false;
                }
            } catch (FileDownloadGiveUpRetryException | IOException | ArrayIndexOutOfBoundsException | IllegalAccessException | IllegalArgumentException e7) {
                z4 = z5;
                e5 = e7;
            }
            try {
                e.a aVar = new e.a();
                if (this.kH) {
                    bVar.vI();
                    return;
                }
                e ww = aVar.bw(this.agw).bv(this.ahv).b(this.aht).a(this).bf(this.agT).d(bVar).c(this.ahs.vQ()).bo(this.Wx).ww();
                this.ahu = ww;
                ww.run();
                if (this.kH) {
                    this.ahu.pause();
                }
                bVar.vI();
                return;
            } catch (FileDownloadGiveUpRetryException | IOException | ArrayIndexOutOfBoundsException | IllegalAccessException | IllegalArgumentException e8) {
                e5 = e8;
                z4 = true;
                try {
                    if (!this.aht.a(e5)) {
                        this.aht.b(e5);
                        if (bVar != null) {
                            bVar.vI();
                            return;
                        }
                        return;
                    }
                    if (!z4) {
                        this.aht.a(e5, 0L);
                    } else {
                        e eVar = this.ahu;
                        if (eVar != null) {
                            this.aht.a(e5, eVar.agF - j4);
                        } else {
                            com.kwad.framework.filedownloader.f.d.d(this, "it is valid to retry and connection is valid but create fetch-data-task failed, so give up directly with %s", e5);
                            this.aht.b(e5);
                            if (bVar != null) {
                                return;
                            }
                            return;
                        }
                    }
                    if (bVar != null) {
                        bVar.vI();
                    }
                    z5 = z4;
                } finally {
                    if (bVar != null) {
                        bVar.vI();
                    }
                }
            }
        }
        if (bVar != null) {
            bVar.vI();
        }
    }

    public final void vo() {
        pause();
    }

    private c(int i4, int i5, ConnectTask connectTask, f fVar, boolean z4, String str) {
        this.agw = i4;
        this.ahv = i5;
        this.kH = false;
        this.aht = fVar;
        this.Wx = str;
        this.ahs = connectTask;
        this.agT = z4;
    }
}
