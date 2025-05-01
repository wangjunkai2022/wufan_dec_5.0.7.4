package com.umeng.analytics.pro;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.umeng.commonsdk.debug.UMRTLog;
import java.util.ArrayList;
/* compiled from: BackgroundMonitor.java */
@TargetApi(14)
/* loaded from: classes6.dex */
public class o implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a  reason: collision with root package name */
    private static o f63854a = new o();

    /* renamed from: b  reason: collision with root package name */
    private final int f63855b = 3000;

    /* renamed from: c  reason: collision with root package name */
    private boolean f63856c = false;

    /* renamed from: d  reason: collision with root package name */
    private boolean f63857d = true;

    /* renamed from: e  reason: collision with root package name */
    private Handler f63858e = new Handler(Looper.getMainLooper());

    /* renamed from: f  reason: collision with root package name */
    private ArrayList<p> f63859f = new ArrayList<>();

    /* renamed from: g  reason: collision with root package name */
    private a f63860g = new a();

    /* compiled from: BackgroundMonitor.java */
    /* loaded from: classes6.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (o.this.f63856c && o.this.f63857d) {
                o.this.f63856c = false;
                UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> went background.");
                for (int i4 = 0; i4 < o.this.f63859f.size(); i4++) {
                    ((p) o.this.f63859f.get(i4)).n();
                }
                return;
            }
            UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> still foreground.");
        }
    }

    private o() {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        this.f63857d = true;
        a aVar = this.f63860g;
        if (aVar != null) {
            this.f63858e.removeCallbacks(aVar);
            this.f63858e.postDelayed(this.f63860g, 3000L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        this.f63857d = false;
        this.f63856c = true;
        a aVar = this.f63860g;
        if (aVar != null) {
            this.f63858e.removeCallbacks(aVar);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }

    public synchronized void b(p pVar) {
        if (pVar != null) {
            for (int i4 = 0; i4 < this.f63859f.size(); i4++) {
                if (this.f63859f.get(i4) == pVar) {
                    this.f63859f.remove(i4);
                }
            }
        }
    }

    public static void a(Context context) {
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(f63854a);
        }
    }

    public static o a() {
        return f63854a;
    }

    public synchronized void a(p pVar) {
        if (pVar != null) {
            this.f63859f.add(pVar);
        }
    }
}
