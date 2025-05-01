package com.kwad.sdk.core.videocache;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.kwad.sdk.utils.aq;
import java.io.File;
import java.net.Socket;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class g {
    private final c aDm;
    private final AtomicInteger aDq = new AtomicInteger(0);
    private volatile e aDr;
    private final List<b> aDs;
    private final b aDt;
    private final String url;

    /* loaded from: classes5.dex */
    static final class a extends Handler implements b {
        private final List<b> aDs;
        private final String url;

        public a(String str, List<b> list) {
            super(Looper.getMainLooper());
            this.url = str;
            this.aDs = list;
        }

        @Override // com.kwad.sdk.core.videocache.b
        public final void a(File file, int i4) {
            Message obtainMessage = obtainMessage();
            obtainMessage.arg1 = i4;
            obtainMessage.obj = file;
            sendMessage(obtainMessage);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            for (b bVar : this.aDs) {
                bVar.a((File) message.obj, message.arg1);
            }
        }
    }

    public g(String str, c cVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.aDs = copyOnWriteArrayList;
        this.url = aq.gR(str);
        this.aDm = (c) aq.checkNotNull(cVar);
        this.aDt = new a(str, copyOnWriteArrayList);
    }

    private synchronized void Hd() {
        if (this.aDm.aCY == 1 && isOkHttpSupported()) {
            this.aDr = this.aDr == null ? Hg() : this.aDr;
        } else {
            this.aDr = this.aDr == null ? Hf() : this.aDr;
        }
    }

    private synchronized void He() {
        if (this.aDq.decrementAndGet() <= 0) {
            this.aDr.shutdown();
            this.aDr = null;
        }
    }

    private e Hf() {
        String str = this.url;
        c cVar = this.aDm;
        e eVar = new e(new h(str, cVar.aCW, cVar.aCX), new com.kwad.sdk.core.videocache.a.b(this.aDm.eH(this.url), this.aDm.aCV));
        eVar.a(this.aDt);
        return eVar;
    }

    private e Hg() {
        String str = this.url;
        c cVar = this.aDm;
        e eVar = new e(new j(str, cVar.aCW, cVar.aCX), new com.kwad.sdk.core.videocache.a.b(this.aDm.eH(this.url), this.aDm.aCV));
        eVar.a(this.aDt);
        return eVar;
    }

    private static boolean isOkHttpSupported() {
        try {
            Class.forName("okhttp3.OkHttpClient");
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public final int Ha() {
        return this.aDq.get();
    }

    public final void a(d dVar, Socket socket) {
        Hd();
        try {
            this.aDq.incrementAndGet();
            this.aDr.a(dVar, socket);
        } finally {
            He();
        }
    }

    public final void shutdown() {
        this.aDs.clear();
        e eVar = this.aDr;
        if (eVar != null) {
            eVar.a((b) null);
            eVar.shutdown();
        }
        this.aDr = null;
        this.aDq.set(0);
    }
}
