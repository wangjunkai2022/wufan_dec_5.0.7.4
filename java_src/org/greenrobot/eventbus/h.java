package org.greenrobot.eventbus;
/* compiled from: PendingPostQueue.java */
/* loaded from: classes7.dex */
final class h {

    /* renamed from: a  reason: collision with root package name */
    private g f72353a;

    /* renamed from: b  reason: collision with root package name */
    private g f72354b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void a(g gVar) {
        try {
            if (gVar != null) {
                g gVar2 = this.f72354b;
                if (gVar2 != null) {
                    gVar2.f72352c = gVar;
                    this.f72354b = gVar;
                } else if (this.f72353a == null) {
                    this.f72354b = gVar;
                    this.f72353a = gVar;
                } else {
                    throw new IllegalStateException("Head present, but no tail");
                }
                notifyAll();
            } else {
                throw new NullPointerException("null cannot be enqueued");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized g b() {
        g gVar;
        gVar = this.f72353a;
        if (gVar != null) {
            g gVar2 = gVar.f72352c;
            this.f72353a = gVar2;
            if (gVar2 == null) {
                this.f72354b = null;
            }
        }
        return gVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized g c(int i4) throws InterruptedException {
        if (this.f72353a == null) {
            wait(i4);
        }
        return b();
    }
}
