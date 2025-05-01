package com.bytedance.pangle.log;

import android.text.TextUtils;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.bytedance.pangle.GlobalParam;
import com.bytedance.pangle.apm.ApmUtils;
import java.util.Arrays;
@Keep
/* loaded from: classes2.dex */
public class ZeusLogger {
    public static final String TAG = "Zeus_pangle";
    public static final String TAG_ACTIVITY = "Zeus/activity_pangle";
    public static final String TAG_DOWNLOAD = "Zeus/download_pangle";
    public static final String TAG_INIT = "Zeus/init_pangle";
    public static final String TAG_INSTALL = "Zeus/install_pangle";
    public static final String TAG_LOAD = "Zeus/load_pangle";
    public static final String TAG_PAM = "Zeus/pam_pangle";
    public static final String TAG_PPM = "Zeus/ppm_pangle";
    public static final String TAG_PROVIDER = "Zeus/provider_pangle";
    public static final String TAG_RECEIVER = "Zeus/receiver_pangle";
    public static final String TAG_REPORTER = "Zeus/reporter_pangle";
    public static final String TAG_RESOURCES = "Zeus/resources_pangle";
    public static final String TAG_SERVER = "Zeus/server_pangle";
    public static final String TAG_SERVICE = "Zeus/service_pangle";
    public static final String TAG_SO = "Zeus/so_pangle";
    private static boolean sDebug = true;
    private static boolean sEnableTrace;

    public static void d(String str) {
        d(null, str);
    }

    public static void errReport(String str, String str2) {
        RuntimeException runtimeException = new RuntimeException();
        StackTraceElement[] stackTrace = runtimeException.getStackTrace();
        runtimeException.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, 1, stackTrace.length - 1));
        errReport(str, str2, runtimeException, false);
    }

    private static String getTraceInfo() {
        try {
            StackTraceElement[] stackTrace = new Throwable().getStackTrace();
            StackTraceElement stackTraceElement = null;
            int i4 = 1;
            while (true) {
                if (i4 >= stackTrace.length) {
                    break;
                } else if (!TextUtils.equals(stackTrace[i4].getClassName(), ZeusLogger.class.getName())) {
                    stackTraceElement = stackTrace[i4];
                    break;
                } else {
                    i4++;
                }
            }
            if (stackTraceElement != null) {
                return "\t\t[" + stackTraceElement.toString() + "]";
            }
            return "\t\t[No Trace Info]";
        } catch (Exception e5) {
            e5.printStackTrace();
            return "\t\t[No Trace Info]";
        }
    }

    public static void i(String str) {
        i(null, str);
    }

    public static boolean isDebug() {
        return sDebug;
    }

    public static boolean isEnableTrace() {
        return sEnableTrace;
    }

    private static String prefixTraceInfo(String str) {
        if (sEnableTrace) {
            return str + getTraceInfo();
        }
        return str;
    }

    public static void setDebug(boolean z4) {
        sDebug = z4;
    }

    public static void setEnableTrace(boolean z4) {
        sEnableTrace = z4;
    }

    public static void v(String str) {
        v(null, str);
    }

    public static void w(String str) {
        w(null, str);
    }

    public static void d(String str, String str2) {
        i(str, str2);
    }

    public static void i(String str, String str2) {
        String prefixTraceInfo = prefixTraceInfo(str2);
        GlobalParam.getInstance().getReporter().saveRecord(str, prefixTraceInfo);
        if (sDebug || GlobalParam.getInstance().getLogger() == null) {
            return;
        }
        GlobalParam.getInstance().getLogger().i(str, prefixTraceInfo);
    }

    public static void v(String str, String str2) {
        String prefixTraceInfo = prefixTraceInfo(str2);
        GlobalParam.getInstance().getReporter().saveRecord(str, prefixTraceInfo);
        if (sDebug || GlobalParam.getInstance().getLogger() == null) {
            return;
        }
        GlobalParam.getInstance().getLogger().v(str, prefixTraceInfo);
    }

    public static void w(String str, String str2) {
        String prefixTraceInfo = prefixTraceInfo(str2);
        GlobalParam.getInstance().getReporter().saveRecord(str, prefixTraceInfo);
        if (sDebug || GlobalParam.getInstance().getLogger() == null) {
            return;
        }
        GlobalParam.getInstance().getLogger().w(str, prefixTraceInfo);
    }

    public static void errReport(String str, String str2, @NonNull Throwable th) {
        errReport(str, str2, th, true);
    }

    private static void errReport(String str, String str2, @NonNull Throwable th, boolean z4) {
        IZeusReporter reporter = GlobalParam.getInstance().getReporter();
        reporter.saveRecord(str, str2 + " ; " + th);
        if (!sDebug && GlobalParam.getInstance().getLogger() != null) {
            GlobalParam.getInstance().getLogger().e(str, str2, z4 ? th : null);
        }
        ApmUtils.getApmInstance().reportError(str2, th);
    }

    public static void w(String str, String str2, Throwable th) {
        String prefixTraceInfo = prefixTraceInfo(str2);
        IZeusReporter reporter = GlobalParam.getInstance().getReporter();
        reporter.saveRecord(str, prefixTraceInfo + " ; " + th);
        if (sDebug || GlobalParam.getInstance().getLogger() == null) {
            return;
        }
        GlobalParam.getInstance().getLogger().w(str, prefixTraceInfo, th);
    }
}
