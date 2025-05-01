package com.beizi.ad.internal;

import android.view.View;
import java.util.ArrayList;
import java.util.concurrent.ScheduledExecutorService;
/* compiled from: VisibilityDetector.java */
/* loaded from: classes2.dex */
public class q {

    /* renamed from: a  reason: collision with root package name */
    private View f6104a;

    /* renamed from: b  reason: collision with root package name */
    private ArrayList<Object> f6105b;

    /* renamed from: c  reason: collision with root package name */
    private Runnable f6106c;

    /* renamed from: d  reason: collision with root package name */
    private ScheduledExecutorService f6107d;

    public void a() {
        ScheduledExecutorService scheduledExecutorService = this.f6107d;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
        }
        View view = this.f6104a;
        if (view != null) {
            view.removeCallbacks(this.f6106c);
            this.f6104a = null;
        }
        this.f6105b = null;
    }
}
