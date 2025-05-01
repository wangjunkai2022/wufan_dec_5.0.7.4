package com.ss.android.socialbase.downloader.vv;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.MainThread;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.ss.android.socialbase.downloader.wv.u;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes5.dex */
public class vv {

    /* renamed from: i  reason: collision with root package name */
    private int f61451i;

    /* renamed from: m  reason: collision with root package name */
    private p f61452m;

    /* renamed from: n  reason: collision with root package name */
    private volatile boolean f61453n;

    /* renamed from: o  reason: collision with root package name */
    private WeakReference<Activity> f61454o;

    /* renamed from: p  reason: collision with root package name */
    private final List<InterfaceC0653vv> f61455p;
    private final Application.ActivityLifecycleCallbacks qv;

    /* renamed from: u  reason: collision with root package name */
    private volatile int f61456u;
    private Application vv;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static class m {
        private static final vv vv = new vv();
    }

    /* loaded from: classes5.dex */
    public interface p {
    }

    /* renamed from: com.ss.android.socialbase.downloader.vv.vv$vv  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public interface InterfaceC0653vv {
        @MainThread
        void m();

        @MainThread
        void p();
    }

    private Object[] i() {
        Object[] array;
        synchronized (this.f61455p) {
            array = this.f61455p.size() > 0 ? this.f61455p.toArray() : null;
        }
        return array;
    }

    private boolean n() {
        try {
            Application application = this.vv;
            if (application == null) {
                return false;
            }
            application.getSystemService(TTDownloadField.TT_ACTIVITY);
            return TextUtils.equals(application.getPackageName(), u.i(application));
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        this.f61456u = 1;
        Object[] i4 = i();
        if (i4 != null) {
            for (Object obj : i4) {
                ((InterfaceC0653vv) obj).m();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u() {
        this.f61456u = 0;
        Object[] i4 = i();
        if (i4 != null) {
            for (Object obj : i4) {
                ((InterfaceC0653vv) obj).p();
            }
        }
    }

    private vv() {
        this.f61455p = new ArrayList();
        this.f61456u = -1;
        this.f61453n = false;
        this.qv = new Application.ActivityLifecycleCallbacks() { // from class: com.ss.android.socialbase.downloader.vv.vv.1
            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityCreated(Activity activity, Bundle bundle) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityDestroyed(Activity activity) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPaused(Activity activity) {
                vv.this.f61453n = true;
                if (vv.this.f61451i != 0 || activity == null) {
                    return;
                }
                vv.this.f61451i = activity.hashCode();
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityResumed(Activity activity) {
                int i4 = vv.this.f61451i;
                vv.this.f61453n = false;
                vv.this.f61451i = activity != null ? activity.hashCode() : i4;
                if (i4 == 0) {
                    vv.this.o();
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStarted(Activity activity) {
                vv.this.f61454o = new WeakReference(activity);
                int i4 = vv.this.f61451i;
                vv.this.f61451i = activity != null ? activity.hashCode() : i4;
                vv.this.f61453n = false;
                if (i4 == 0) {
                    vv.this.o();
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStopped(Activity activity) {
                if (activity != null && activity.hashCode() == vv.this.f61451i) {
                    vv.this.f61451i = 0;
                    vv.this.u();
                }
                vv.this.f61453n = false;
            }
        };
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [boolean, int] */
    public boolean m() {
        int i4 = this.f61456u;
        int i5 = i4;
        if (i4 == -1) {
            ?? n4 = n();
            this.f61456u = n4;
            i5 = n4;
        }
        return i5 == 1;
    }

    public boolean p() {
        return m() && !this.f61453n;
    }

    public static vv vv() {
        return m.vv;
    }

    public void m(InterfaceC0653vv interfaceC0653vv) {
        synchronized (this.f61455p) {
            this.f61455p.remove(interfaceC0653vv);
        }
    }

    public void vv(Context context) {
        if (this.vv == null && (context instanceof Application)) {
            synchronized (this) {
                if (this.vv == null) {
                    Application application = (Application) context;
                    this.vv = application;
                    application.registerActivityLifecycleCallbacks(this.qv);
                }
            }
        }
    }

    public void vv(p pVar) {
        this.f61452m = pVar;
    }

    public void vv(InterfaceC0653vv interfaceC0653vv) {
        if (interfaceC0653vv == null) {
            return;
        }
        synchronized (this.f61455p) {
            if (!this.f61455p.contains(interfaceC0653vv)) {
                this.f61455p.add(interfaceC0653vv);
            }
        }
    }
}
