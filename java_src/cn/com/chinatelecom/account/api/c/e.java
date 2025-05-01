package cn.com.chinatelecom.account.api.c;

import android.os.Handler;
import android.os.Looper;
/* loaded from: classes2.dex */
public abstract class e implements Runnable {

    /* renamed from: c  reason: collision with root package name */
    private static Handler f621c = new Handler(Looper.getMainLooper());

    /* renamed from: a  reason: collision with root package name */
    private boolean f622a = false;

    /* renamed from: b  reason: collision with root package name */
    private long f623b;

    /* renamed from: d  reason: collision with root package name */
    private a f624d;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private e f625a;

        public a(e eVar) {
            this.f625a = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            e eVar = this.f625a;
            if (eVar != null) {
                eVar.b();
            }
        }
    }

    public e() {
    }

    public e(long j4) {
        this.f623b = j4;
    }

    private void e() {
        a aVar = new a(this);
        this.f624d = aVar;
        f621c.postDelayed(aVar, this.f623b);
    }

    public abstract void a();

    public void a(boolean z4) {
        this.f622a = z4;
    }

    public void b() {
    }

    public boolean c() {
        return this.f622a;
    }

    public void d() {
        try {
            a aVar = this.f624d;
            if (aVar != null) {
                f621c.removeCallbacks(aVar);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f623b > 0) {
            e();
        }
        a();
    }
}
