package bolts;

import java.io.Closeable;
/* compiled from: CancellationTokenRegistration.java */
/* loaded from: classes2.dex */
public class d implements Closeable {

    /* renamed from: b  reason: collision with root package name */
    private final Object f264b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private e f265c;

    /* renamed from: d  reason: collision with root package name */
    private Runnable f266d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f267e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(e eVar, Runnable runnable) {
        this.f265c = eVar;
        this.f266d = runnable;
    }

    private void b() {
        if (this.f267e) {
            throw new IllegalStateException("Object already closed");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        synchronized (this.f264b) {
            b();
            this.f266d.run();
            close();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this.f264b) {
            if (this.f267e) {
                return;
            }
            this.f267e = true;
            this.f265c.u(this);
            this.f265c = null;
            this.f266d = null;
        }
    }
}
