package d4;

import org.jboss.netty.channel.w;
/* compiled from: ChannelRunnableWrapper.java */
/* loaded from: classes7.dex */
public class a extends w implements Runnable {

    /* renamed from: m  reason: collision with root package name */
    private final Runnable f68819m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f68820n;

    public a(org.jboss.netty.channel.e eVar, Runnable runnable) {
        super(eVar, true);
        this.f68819m = runnable;
    }

    @Override // org.jboss.netty.channel.w, org.jboss.netty.channel.j
    public synchronized boolean cancel() {
        if (this.f68820n) {
            return false;
        }
        return super.cancel();
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this) {
            if (isCancelled()) {
                return;
            }
            this.f68820n = true;
            try {
                this.f68819m.run();
                setSuccess();
            } catch (Throwable th) {
                setFailure(th);
            }
        }
    }
}
