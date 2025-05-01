package com.kwad.framework.filedownloader;

import com.kwad.framework.filedownloader.x;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
/* loaded from: classes5.dex */
final class q {
    private final b afL = new b();

    /* loaded from: classes5.dex */
    static class a {
        private static final q afM = new q();

        static {
            com.kwad.framework.filedownloader.message.e.wJ().a(new aa());
        }
    }

    /* loaded from: classes5.dex */
    static class b {
        private ThreadPoolExecutor afN;
        private LinkedBlockingQueue<Runnable> afO;

        b() {
            init();
        }

        private void init() {
            LinkedBlockingQueue<Runnable> linkedBlockingQueue = new LinkedBlockingQueue<>();
            this.afO = linkedBlockingQueue;
            this.afN = com.kwad.framework.filedownloader.f.b.a(3, linkedBlockingQueue, "LauncherTask");
        }

        public final void b(x.b bVar) {
            this.afO.remove(bVar);
        }

        public final void c(x.b bVar) {
            this.afN.execute(new c(bVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static class c implements Runnable {
        private final x.b afP;
        private boolean afQ = false;

        c(x.b bVar) {
            this.afP = bVar;
        }

        public final boolean equals(Object obj) {
            return super.equals(obj) || obj == this.afP;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.afQ) {
                return;
            }
            this.afP.start();
        }
    }

    q() {
    }

    public static q vw() {
        return a.afM;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void a(x.b bVar) {
        this.afL.c(bVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void b(x.b bVar) {
        this.afL.b(bVar);
    }
}
