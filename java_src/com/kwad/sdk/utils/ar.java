package com.kwad.sdk.utils;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.vuaukou.vco.hykiiuy.plugin.InstrumentationProxy;
import java.util.List;
/* loaded from: classes5.dex */
public final class ar {
    private static String aQJ = "";
    private static volatile Boolean aQK;

    private static String MN() {
        return Build.VERSION.SDK_INT >= 28 ? Application.getProcessName() : "";
    }

    private static String MO() {
        try {
            Object callStaticMethod = s.callStaticMethod(Class.forName(InstrumentationProxy.f64868d, false, Application.class.getClassLoader()), "currentProcessName", new Object[0]);
            return callStaticMethod instanceof String ? (String) callStaticMethod : "";
        } catch (Throwable th) {
            th.printStackTrace();
            return "";
        }
    }

    private static String cG(@NonNull Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        if (context == null) {
            return "";
        }
        int myPid = Process.myPid();
        ActivityManager activityManager = (ActivityManager) context.getSystemService(TTDownloadField.TT_ACTIVITY);
        if (activityManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null) {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.pid == myPid) {
                    return runningAppProcessInfo.processName;
                }
            }
        }
        return "";
    }

    public static String getProcessName(@NonNull Context context) {
        if (!TextUtils.isEmpty(aQJ)) {
            return aQJ;
        }
        String MN = MN();
        aQJ = MN;
        if (!TextUtils.isEmpty(MN)) {
            return aQJ;
        }
        String MO = MO();
        aQJ = MO;
        if (!TextUtils.isEmpty(MO)) {
            return aQJ;
        }
        String cG = cG(context);
        aQJ = cG;
        return cG;
    }

    public static boolean isInMainProcess(Context context) {
        if (aQK == null) {
            String processName = getProcessName(context);
            aQK = Boolean.valueOf(!TextUtils.isEmpty(processName) && processName.equals(context.getPackageName()));
        }
        return aQK.booleanValue();
    }
}
