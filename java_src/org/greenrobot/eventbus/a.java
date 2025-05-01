package org.greenrobot.eventbus;
/* compiled from: AsyncPoster.java */
/* loaded from: classes7.dex */
class a implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final h f72298b = new h();

    /* renamed from: c  reason: collision with root package name */
    private final c f72299c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(c cVar) {
        this.f72299c = cVar;
    }

    public void a(l lVar, Object obj) {
        this.f72298b.a(g.a(lVar, obj));
        this.f72299c.g().execute(this);
    }

    @Override // java.lang.Runnable
    public void run() {
        g b5 = this.f72298b.b();
        if (b5 != null) {
            this.f72299c.k(b5);
            return;
        }
        throw new IllegalStateException("No pending post available");
    }
}
