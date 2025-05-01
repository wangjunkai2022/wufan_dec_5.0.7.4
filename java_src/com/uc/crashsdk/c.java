package com.uc.crashsdk;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.Map;
import java.util.WeakHashMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class c implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a  reason: collision with root package name */
    private boolean f63141a = false;

    /* renamed from: b  reason: collision with root package name */
    private boolean f63142b = false;

    private void a(Activity activity, int i4) {
        WeakHashMap weakHashMap;
        WeakHashMap weakHashMap2;
        if (1 == i4) {
            String unused = b.ad = activity.getComponentName().flattenToShortString();
        } else {
            String unused2 = b.ad = "";
        }
        b.D();
        if (g.L()) {
            b.O();
            weakHashMap = b.ab;
            synchronized (weakHashMap) {
                weakHashMap2 = b.ab;
                weakHashMap2.put(activity, Integer.valueOf(i4));
                a(i4);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        a(activity, 2);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        WeakHashMap weakHashMap;
        WeakHashMap weakHashMap2;
        if (g.L()) {
            b.O();
            weakHashMap = b.ab;
            synchronized (weakHashMap) {
                weakHashMap2 = b.ab;
                weakHashMap2.remove(activity);
                a(2);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        a(activity, 2);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        a(activity, 1);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        a(activity, 1);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        a(activity, 2);
    }

    private void a(int i4) {
        WeakHashMap weakHashMap;
        WeakHashMap weakHashMap2;
        if (e.u()) {
            com.uc.crashsdk.a.a.a("crashsdk", "[LifeCycle] ignore state change while crashing");
            return;
        }
        boolean z4 = true;
        boolean z5 = 1 == i4;
        if (!z5) {
            weakHashMap2 = b.ab;
            for (Map.Entry entry : weakHashMap2.entrySet()) {
                Object value = entry.getValue();
                if (value != null && ((Integer) value).intValue() == 1) {
                    break;
                }
            }
        }
        z4 = z5;
        if (this.f63141a != z4) {
            b.b(z4);
            this.f63141a = z4;
        }
        weakHashMap = b.ab;
        boolean isEmpty = weakHashMap.isEmpty();
        if (this.f63142b != isEmpty) {
            if (isEmpty) {
                b.w();
            }
            this.f63142b = isEmpty;
        }
    }
}
