package com.efs.sdk.memoryinfo;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Debug;
import android.os.Process;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class c {
    final String activity;
    final String bg;

    /* renamed from: n  reason: collision with root package name */
    final long f10515n;

    /* renamed from: o  reason: collision with root package name */
    final long f10516o;

    /* renamed from: p  reason: collision with root package name */
    final long f10517p;

    /* renamed from: q  reason: collision with root package name */
    final long f10518q;

    /* renamed from: r  reason: collision with root package name */
    final float f10519r;

    /* renamed from: s  reason: collision with root package name */
    final long f10520s;

    /* renamed from: t  reason: collision with root package name */
    final long f10521t;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(Context context) {
        Debug.MemoryInfo[] processMemoryInfo;
        Debug.MemoryInfo memoryInfo = null;
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService(TTDownloadField.TT_ACTIVITY);
            if (activityManager != null && (processMemoryInfo = activityManager.getProcessMemoryInfo(new int[]{Process.myPid()})) != null && processMemoryInfo.length > 0) {
                memoryInfo = processMemoryInfo[0];
            }
        } catch (Throwable unused) {
        }
        if (memoryInfo == null) {
            memoryInfo = new Debug.MemoryInfo();
            Debug.getMemoryInfo(memoryInfo);
        }
        this.bg = UMMemoryMonitor.get().isForeground() ? "fg" : "bg";
        this.f10515n = memoryInfo.getTotalPss() * 1024;
        this.f10516o = memoryInfo.dalvikPss * 1024;
        this.f10517p = memoryInfo.nativePss * 1024;
        this.f10520s = f.a(memoryInfo) * 1024;
        long freeMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        this.f10518q = freeMemory;
        long maxMemory = Runtime.getRuntime().maxMemory();
        if (maxMemory != 0) {
            this.f10519r = (((float) freeMemory) * 1.0f) / ((float) maxMemory);
        } else {
            this.f10519r = 1.0f;
        }
        this.f10521t = f.a() * 1024;
        this.activity = UMMemoryMonitor.get().getCurrentActivity();
    }
}
