package com.beizi.ad.lance;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.beizi.ad.lance.a.l;
import java.util.HashMap;
import java.util.Map;
/* compiled from: OnLineStateClass.java */
/* loaded from: classes2.dex */
public class c {

    /* renamed from: f  reason: collision with root package name */
    private String f6474f;

    /* renamed from: i  reason: collision with root package name */
    private a f6477i;

    /* renamed from: a  reason: collision with root package name */
    private String f6469a = "OnLineStateClass";

    /* renamed from: b  reason: collision with root package name */
    private int f6470b = 0;

    /* renamed from: c  reason: collision with root package name */
    private boolean f6471c = true;

    /* renamed from: d  reason: collision with root package name */
    private boolean f6472d = false;

    /* renamed from: e  reason: collision with root package name */
    private boolean f6473e = false;

    /* renamed from: g  reason: collision with root package name */
    private Map<String, String> f6475g = new HashMap();

    /* renamed from: h  reason: collision with root package name */
    private long f6476h = 0;

    static /* synthetic */ int d(c cVar) {
        int i4 = cVar.f6470b;
        cVar.f6470b = i4 + 1;
        return i4;
    }

    static /* synthetic */ int h(c cVar) {
        int i4 = cVar.f6470b;
        cVar.f6470b = i4 - 1;
        return i4;
    }

    public void a(Context context) {
        this.f6476h = System.currentTimeMillis() / 1000;
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() { // from class: com.beizi.ad.lance.c.1
            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityCreated(Activity activity, Bundle bundle) {
                c.this.f6474f = activity.getClass().getSimpleName();
                c.this.f6475g.put(c.this.f6474f, c.this.f6474f);
                c.this.f6471c = true;
                c.this.f6472d = false;
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityDestroyed(Activity activity) {
                c.this.f6475g.remove(activity.getClass().getSimpleName());
                if (c.this.f6475g.size() == 0 && c.this.f6471c) {
                    long currentTimeMillis = System.currentTimeMillis() / 1000;
                    if (c.this.f6477i != null) {
                        long unused = c.this.f6476h;
                        c.this.f6477i.a(currentTimeMillis, c.this.f6476h);
                        c.this.f6476h = System.currentTimeMillis() / 1000;
                    }
                    c.this.f6471c = false;
                }
                if (c.this.f6475g.size() == 0) {
                    c.this.f6473e = true;
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPaused(Activity activity) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityResumed(Activity activity) {
                c.this.f6472d = !activity.getClass().getSimpleName().equals(c.this.f6474f);
                c.this.f6474f = activity.getClass().getSimpleName();
                if (!c.this.f6471c || c.this.f6473e) {
                    c.this.f6473e = false;
                    if (c.this.f6477i != null) {
                        c.this.f6477i.a();
                    }
                    c.this.f6476h = System.currentTimeMillis() / 1000;
                    c.this.f6471c = true;
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStarted(Activity activity) {
                l.a(c.this.f6469a, "onActivityStarted");
                c.d(c.this);
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStopped(Activity activity) {
                l.a(c.this.f6469a, "onActivityStopped");
                c.h(c.this);
                if (activity.getClass().getSimpleName().equals(c.this.f6474f)) {
                    if (!c.this.f6472d || c.this.f6475g.size() == 1) {
                        long currentTimeMillis = System.currentTimeMillis() / 1000;
                        if (c.this.f6477i != null) {
                            long unused = c.this.f6476h;
                            c.this.f6477i.a(c.this.f6476h, currentTimeMillis);
                            c.this.f6476h = System.currentTimeMillis() / 1000;
                        }
                        c.this.f6471c = false;
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(a aVar) {
        this.f6477i = aVar;
    }
}
