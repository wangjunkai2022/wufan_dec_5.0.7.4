package com.bytedance.sdk.openadsdk.vv;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
/* loaded from: classes2.dex */
class vv implements Application.ActivityLifecycleCallbacks {
    private static volatile boolean vv;

    /* renamed from: m  reason: collision with root package name */
    private int f8988m = 0;

    /* renamed from: p  reason: collision with root package name */
    private InterfaceC0230vv f8989p;

    /* renamed from: com.bytedance.sdk.openadsdk.vv.vv$vv  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public interface InterfaceC0230vv {
        void m();

        void vv();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        this.f8988m++;
        vv = false;
        InterfaceC0230vv interfaceC0230vv = this.f8989p;
        if (interfaceC0230vv != null) {
            interfaceC0230vv.m();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        int i4 = this.f8988m - 1;
        this.f8988m = i4;
        if (i4 == 0) {
            vv = true;
            InterfaceC0230vv interfaceC0230vv = this.f8989p;
            if (interfaceC0230vv != null) {
                interfaceC0230vv.vv();
            }
        }
    }

    public Boolean vv() {
        return Boolean.valueOf(vv);
    }

    public void vv(InterfaceC0230vv interfaceC0230vv) {
        this.f8989p = interfaceC0230vv;
    }
}
