package com.beizi.fusion.g;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.webkit.WebView;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
/* compiled from: WebViewMultiInitHelper.java */
/* loaded from: classes2.dex */
public class ay {
    public static void a(Context context) {
        if (context != null) {
            String packageName = context.getPackageName();
            if (Build.VERSION.SDK_INT >= 28) {
                try {
                    try {
                        int myPid = Process.myPid();
                        String str = context.getPackageName() + myPid;
                        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) context.getSystemService(TTDownloadField.TT_ACTIVITY)).getRunningAppProcesses()) {
                            if (runningAppProcessInfo.pid == myPid) {
                                str = runningAppProcessInfo.processName;
                            }
                        }
                        WebView.setDataDirectorySuffix(str);
                    } catch (Exception unused) {
                    }
                } catch (Exception unused2) {
                    WebView.setDataDirectorySuffix(packageName);
                }
            }
        }
    }
}
