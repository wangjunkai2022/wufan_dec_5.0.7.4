package com.kwad.framework.filedownloader.b;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.kwad.framework.filedownloader.b.a;
import com.kwad.framework.filedownloader.f.f;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.LockSupport;
/* loaded from: classes5.dex */
public final class c implements a {
    private volatile Thread agl;
    private Handler handler;
    private volatile List<Integer> agj = new CopyOnWriteArrayList();
    private AtomicInteger agk = new AtomicInteger();
    private final b agg = new b();
    private final d agh = new d();
    private final long agi = com.kwad.framework.filedownloader.f.e.xr().ajd;

    public c() {
        HandlerThread handlerThread = new HandlerThread(f.bA("RemitHandoverToDB"), 10);
        handlerThread.start();
        this.handler = new Handler(handlerThread.getLooper(), new Handler.Callback() { // from class: com.kwad.framework.filedownloader.b.c.1
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                int i4 = message.what;
                if (i4 == 0) {
                    if (c.this.agl != null) {
                        LockSupport.unpark(c.this.agl);
                        c.a(c.this, (Thread) null);
                    }
                    return false;
                }
                try {
                    c.this.agk.set(i4);
                    c.this.bp(i4);
                    c.this.agj.add(Integer.valueOf(i4));
                    return false;
                } finally {
                    c.this.agk.set(0);
                    if (c.this.agl != null) {
                        LockSupport.unpark(c.this.agl);
                        c.a(c.this, (Thread) null);
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bp(int i4) {
        this.agh.b(this.agg.bk(i4));
        List<com.kwad.framework.filedownloader.d.a> bl = this.agg.bl(i4);
        this.agh.bm(i4);
        for (com.kwad.framework.filedownloader.d.a aVar : bl) {
            this.agh.a(aVar);
        }
    }

    private boolean bq(int i4) {
        return !this.agj.contains(Integer.valueOf(i4));
    }

    private void br(int i4) {
        this.handler.removeMessages(i4);
        if (this.agk.get() == i4) {
            this.agl = Thread.currentThread();
            this.handler.sendEmptyMessage(0);
            LockSupport.park();
            return;
        }
        bp(i4);
    }

    @Override // com.kwad.framework.filedownloader.b.a
    public final void bj(int i4) {
        this.handler.sendEmptyMessageDelayed(i4, this.agi);
    }

    @Override // com.kwad.framework.filedownloader.b.a
    public final com.kwad.framework.filedownloader.d.c bk(int i4) {
        return this.agg.bk(i4);
    }

    @Override // com.kwad.framework.filedownloader.b.a
    public final List<com.kwad.framework.filedownloader.d.a> bl(int i4) {
        return this.agg.bl(i4);
    }

    @Override // com.kwad.framework.filedownloader.b.a
    public final void bm(int i4) {
        this.agg.bm(i4);
        if (bq(i4)) {
            return;
        }
        this.agh.bm(i4);
    }

    @Override // com.kwad.framework.filedownloader.b.a
    public final boolean bn(int i4) {
        this.agh.bn(i4);
        return this.agg.bn(i4);
    }

    @Override // com.kwad.framework.filedownloader.b.a
    public final void bo(int i4) {
        this.agg.bo(i4);
        if (bq(i4)) {
            return;
        }
        this.agh.bo(i4);
    }

    @Override // com.kwad.framework.filedownloader.b.a
    public final void clear() {
        this.agg.clear();
        this.agh.clear();
    }

    @Override // com.kwad.framework.filedownloader.b.a
    public final void d(int i4, long j4) {
        this.agg.d(i4, j4);
        if (bq(i4)) {
            br(i4);
        }
        this.agh.d(i4, j4);
        this.agj.remove(Integer.valueOf(i4));
    }

    @Override // com.kwad.framework.filedownloader.b.a
    public final void s(int i4, int i5) {
        this.agg.s(i4, i5);
        if (bq(i4)) {
            return;
        }
        this.agh.s(i4, i5);
    }

    @Override // com.kwad.framework.filedownloader.b.a
    public final a.InterfaceC0493a vJ() {
        d dVar = this.agh;
        b bVar = this.agg;
        return dVar.a(bVar.agd, bVar.age);
    }

    static /* synthetic */ Thread a(c cVar, Thread thread) {
        cVar.agl = null;
        return null;
    }

    @Override // com.kwad.framework.filedownloader.b.a
    public final void b(int i4, long j4) {
        this.agg.b(i4, j4);
        if (bq(i4)) {
            return;
        }
        this.agh.b(i4, j4);
    }

    @Override // com.kwad.framework.filedownloader.b.a
    public final void c(int i4, long j4) {
        this.agg.c(i4, j4);
        if (bq(i4)) {
            this.handler.removeMessages(i4);
            if (this.agk.get() == i4) {
                this.agl = Thread.currentThread();
                this.handler.sendEmptyMessage(0);
                LockSupport.park();
            }
            this.agj.remove(Integer.valueOf(i4));
        }
        this.agh.c(i4, j4);
        this.agj.remove(Integer.valueOf(i4));
    }

    @Override // com.kwad.framework.filedownloader.b.a
    public final void a(com.kwad.framework.filedownloader.d.a aVar) {
        this.agg.a(aVar);
        if (bq(aVar.getId())) {
            return;
        }
        this.agh.a(aVar);
    }

    @Override // com.kwad.framework.filedownloader.b.a
    public final void b(com.kwad.framework.filedownloader.d.c cVar) {
        this.agg.b(cVar);
        if (bq(cVar.getId())) {
            return;
        }
        this.agh.b(cVar);
    }

    @Override // com.kwad.framework.filedownloader.b.a
    public final void a(int i4, int i5, long j4) {
        this.agg.a(i4, i5, j4);
        if (bq(i4)) {
            return;
        }
        this.agh.a(i4, i5, j4);
    }

    @Override // com.kwad.framework.filedownloader.b.a
    public final void a(int i4, String str, long j4, long j5, int i5) {
        this.agg.a(i4, str, j4, j5, i5);
        if (bq(i4)) {
            return;
        }
        this.agh.a(i4, str, j4, j5, i5);
    }

    @Override // com.kwad.framework.filedownloader.b.a
    public final void a(int i4, long j4, String str, String str2) {
        this.agg.a(i4, j4, str, str2);
        if (bq(i4)) {
            return;
        }
        this.agh.a(i4, j4, str, str2);
    }

    @Override // com.kwad.framework.filedownloader.b.a
    public final void a(int i4, Throwable th) {
        this.agg.a(i4, th);
        if (bq(i4)) {
            return;
        }
        this.agh.a(i4, th);
    }

    @Override // com.kwad.framework.filedownloader.b.a
    public final void a(int i4, Throwable th, long j4) {
        this.agg.a(i4, th, j4);
        if (bq(i4)) {
            br(i4);
        }
        this.agh.a(i4, th, j4);
        this.agj.remove(Integer.valueOf(i4));
    }
}
