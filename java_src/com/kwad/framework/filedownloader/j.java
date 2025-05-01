package com.kwad.framework.filedownloader;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
/* loaded from: classes5.dex */
public final class j {
    static int afw = 10;
    static int afx = 5;
    private final Executor afs;
    private final LinkedBlockingQueue<t> aft;
    private final Object afu;
    private final ArrayList<t> afv;
    private final Handler handler;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class a {
        private static final j afA = new j((byte) 0);
    }

    /* loaded from: classes5.dex */
    static class b implements Handler.Callback {
        private b() {
        }

        private static void a(ArrayList<t> arrayList) {
            Iterator<t> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                t next = it2.next();
                if (next != null) {
                    next.vl();
                }
            }
            arrayList.clear();
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            int i4 = message.what;
            if (i4 == 1) {
                ((t) message.obj).vl();
            } else if (i4 == 2) {
                a((ArrayList) message.obj);
                j.vh().push();
            }
            return true;
        }

        /* synthetic */ b(byte b5) {
            this();
        }
    }

    /* synthetic */ j(byte b5) {
        this();
    }

    private void b(t tVar) {
        Handler handler = this.handler;
        handler.sendMessage(handler.obtainMessage(1, tVar));
    }

    private void c(t tVar) {
        synchronized (this.afu) {
            this.aft.offer(tVar);
        }
        push();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void push() {
        synchronized (this.afu) {
            if (this.afv.isEmpty()) {
                if (this.aft.isEmpty()) {
                    return;
                }
                int i4 = 0;
                if (!vi()) {
                    this.aft.drainTo(this.afv);
                } else {
                    int i5 = afw;
                    int min = Math.min(this.aft.size(), afx);
                    while (i4 < min) {
                        this.afv.add(this.aft.remove());
                        i4++;
                    }
                    i4 = i5;
                }
                Handler handler = this.handler;
                handler.sendMessageDelayed(handler.obtainMessage(2, this.afv), i4);
            }
        }
    }

    public static j vh() {
        return a.afA;
    }

    private static boolean vi() {
        return afw > 0;
    }

    private j() {
        this.afs = com.kwad.framework.filedownloader.f.b.q(5, "BlockCompleted");
        this.afu = new Object();
        this.afv = new ArrayList<>();
        this.handler = new Handler(Looper.getMainLooper(), new b((byte) 0));
        this.aft = new LinkedBlockingQueue<>();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(t tVar) {
        a(tVar, false);
    }

    private void a(final t tVar, boolean z4) {
        if (tVar.vm()) {
            tVar.vl();
        } else if (tVar.vn()) {
            this.afs.execute(new Runnable() { // from class: com.kwad.framework.filedownloader.j.1
                @Override // java.lang.Runnable
                public final void run() {
                    tVar.vl();
                }
            });
        } else {
            if (!vi() && !this.aft.isEmpty()) {
                synchronized (this.afu) {
                    if (!this.aft.isEmpty()) {
                        Iterator<t> it2 = this.aft.iterator();
                        while (it2.hasNext()) {
                            b(it2.next());
                        }
                    }
                    this.aft.clear();
                }
            }
            if (!vi()) {
                b(tVar);
            } else {
                c(tVar);
            }
        }
    }
}
