package notchtools.geek.com.notchtools;

import android.app.Activity;
import android.os.Build;
import android.view.Window;
import notchtools.geek.com.notchtools.core.d;
import notchtools.geek.com.notchtools.phone.c;
import notchtools.geek.com.notchtools.phone.e;
import notchtools.geek.com.notchtools.phone.f;
/* compiled from: NotchTools.java */
/* loaded from: classes7.dex */
public class b implements notchtools.geek.com.notchtools.core.b {

    /* renamed from: d  reason: collision with root package name */
    private static b f71929d = null;

    /* renamed from: e  reason: collision with root package name */
    public static final String f71930e = "notch_container";

    /* renamed from: f  reason: collision with root package name */
    private static final int f71931f = Build.VERSION.SDK_INT;

    /* renamed from: g  reason: collision with root package name */
    public static final int f71932g = 28;

    /* renamed from: a  reason: collision with root package name */
    private notchtools.geek.com.notchtools.core.b f71933a = null;

    /* renamed from: b  reason: collision with root package name */
    private boolean f71934b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f71935c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NotchTools.java */
    /* loaded from: classes7.dex */
    public class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f71936b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ d f71937c;

        a(Activity activity, d dVar) {
            this.f71936b = activity;
            this.f71937c = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (b.this.f71933a == null) {
                b.this.j(this.f71936b.getWindow());
            }
            if (b.this.f71933a != null) {
                b.this.f71933a.f(this.f71936b, this.f71937c);
            }
        }
    }

    private b() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j(Window window) {
        if (this.f71933a != null) {
            return;
        }
        int i4 = f71931f;
        if (i4 < 26) {
            this.f71933a = new notchtools.geek.com.notchtools.phone.a();
        } else if (i4 >= 28) {
            if (i4 >= 28) {
                this.f71933a = new e();
            }
        } else {
            notchtools.geek.com.notchtools.helper.a a5 = notchtools.geek.com.notchtools.helper.a.a();
            if (a5.c()) {
                this.f71933a = new notchtools.geek.com.notchtools.phone.b();
            } else if (a5.d()) {
                this.f71933a = new c();
            } else if (a5.f()) {
                this.f71933a = new f();
            } else if (a5.e()) {
                this.f71933a = new notchtools.geek.com.notchtools.phone.d();
            } else {
                this.f71933a = new notchtools.geek.com.notchtools.phone.a();
            }
        }
    }

    public static b o() {
        if (f71929d == null) {
            synchronized (b.class) {
                if (f71929d == null) {
                    f71929d = new b();
                }
            }
        }
        return f71929d;
    }

    @Override // notchtools.geek.com.notchtools.core.b
    public void a(Activity activity, d dVar) {
        if (this.f71933a == null) {
            j(activity.getWindow());
        }
        notchtools.geek.com.notchtools.core.b bVar = this.f71933a;
        if (bVar != null) {
            bVar.a(activity, dVar);
        }
    }

    @Override // notchtools.geek.com.notchtools.core.b
    public void b(Activity activity, d dVar) {
        g(activity, dVar);
    }

    @Override // notchtools.geek.com.notchtools.core.b
    public boolean c(Window window) {
        if (!this.f71934b) {
            if (this.f71933a == null) {
                j(window);
            }
            notchtools.geek.com.notchtools.core.b bVar = this.f71933a;
            if (bVar == null) {
                this.f71934b = true;
                this.f71935c = false;
            } else {
                this.f71935c = bVar.c(window);
            }
        }
        return this.f71935c;
    }

    @Override // notchtools.geek.com.notchtools.core.b
    public int d(Window window) {
        if (this.f71933a == null) {
            j(window);
        }
        notchtools.geek.com.notchtools.core.b bVar = this.f71933a;
        if (bVar == null) {
            return 0;
        }
        return bVar.d(window);
    }

    @Override // notchtools.geek.com.notchtools.core.b
    public int e(Window window) {
        return notchtools.geek.com.notchtools.helper.b.b(window.getContext());
    }

    @Override // notchtools.geek.com.notchtools.core.b
    public void f(Activity activity, d dVar) {
        notchtools.geek.com.notchtools.helper.d.p(new a(activity, dVar));
    }

    @Override // notchtools.geek.com.notchtools.core.b
    public void g(Activity activity, d dVar) {
        if (this.f71933a == null) {
            j(activity.getWindow());
        }
        notchtools.geek.com.notchtools.core.b bVar = this.f71933a;
        if (bVar != null) {
            bVar.g(activity, dVar);
        }
    }

    public void k(Activity activity) {
        g(activity, null);
    }

    public void l(Activity activity) {
        f(activity, null);
    }

    public void m(Activity activity) {
        b(activity, null);
    }

    public void n(Activity activity) {
        a(activity, null);
    }

    public b p(boolean z4) {
        notchtools.geek.com.notchtools.helper.b.f71944b = z4;
        return this;
    }
}
