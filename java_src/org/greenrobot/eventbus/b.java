package org.greenrobot.eventbus;
/* compiled from: BackgroundPoster.java */
/* loaded from: classes7.dex */
final class b implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final h f72300b = new h();

    /* renamed from: c  reason: collision with root package name */
    private final c f72301c;

    /* renamed from: d  reason: collision with root package name */
    private volatile boolean f72302d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(c cVar) {
        this.f72301c = cVar;
    }

    public void a(l lVar, Object obj) {
        g a5 = g.a(lVar, obj);
        synchronized (this) {
            this.f72300b.a(a5);
            if (!this.f72302d) {
                this.f72302d = true;
                this.f72301c.g().execute(this);
            }
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        while (true) {
            try {
                g c5 = this.f72300b.c(1000);
                if (c5 == null) {
                    synchronized (this) {
                        c5 = this.f72300b.b();
                        if (c5 == null) {
                            return;
                        }
                    }
                }
                this.f72301c.k(c5);
            } catch (InterruptedException unused) {
                StringBuilder sb = new StringBuilder();
                sb.append(Thread.currentThread().getName());
                sb.append(" was interruppted");
                return;
            } finally {
                this.f72302d = false;
            }
        }
    }
}
