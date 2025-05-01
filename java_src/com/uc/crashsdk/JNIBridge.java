package com.uc.crashsdk;

import android.os.Looper;
import android.os.Process;
import com.uc.crashsdk.export.LogType;
import java.io.File;
import java.util.Locale;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class JNIBridge {
    private static int addCachedInfo(String str, String str2) {
        return a.b(str, str2);
    }

    private static int addDumpFile(String str, String str2, boolean z4, boolean z5, int i4, boolean z6) {
        return a.a(str, str2, z4, z5, i4, z6);
    }

    private static void addHeaderInfo(String str, String str2) {
        a.a(str, str2);
    }

    public static long cmd(int i4) {
        return nativeCmd(i4, 0L, null, null);
    }

    private static int createCachedInfo(String str, int i4, int i5) {
        return a.a(str, i4, i5);
    }

    private static boolean generateCustomLog(String str, String str2, long j4, String str3, String str4, String str5, String str6) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(str);
        return e.a(stringBuffer, str2, j4, a.c(str3), a.c(str4), a.c(str5), str6);
    }

    protected static String getCallbackInfo(String str, boolean z4) {
        return a.a(str, z4);
    }

    private static String getDatasForClientJavaLog(int i4, String str) {
        boolean equals = "$all$".equals(str);
        if (i4 == 1) {
            if (equals) {
                return a.h();
            }
            return a.a(str);
        } else if (i4 == 2) {
            if (equals) {
                return a.j();
            }
            return a.a(str, true);
        } else if (i4 == 3) {
            if (equals) {
                return a.l();
            }
            return a.b(str);
        } else if (i4 == 4) {
            return e.d(str) ? "1" : "0";
        } else {
            return null;
        }
    }

    private static String getJavaStackTrace(Thread thread, int i4) {
        if (i4 != 0 && i4 == Process.myPid()) {
            thread = Looper.getMainLooper().getThread();
        }
        if (thread != null) {
            return e.a(thread.getStackTrace(), "getJavaStackTrace").toString();
        }
        return null;
    }

    public static native boolean nativeAddCachedInfo(String str, String str2);

    public static native int nativeAddCallbackInfo(String str, int i4, long j4, int i5);

    public static native int nativeAddDumpFile(String str, String str2, boolean z4, boolean z5, int i4, boolean z6);

    public static native void nativeAddHeaderInfo(String str, String str2);

    public static native boolean nativeChangeState(String str, String str2, boolean z4);

    public static native void nativeClientCloseConnection(long j4);

    public static native long nativeClientCreateConnection(String str, String str2, String str3, int i4);

    public static native int nativeClientWriteData(long j4, String str);

    public static native void nativeCloseFile(int i4);

    public static native long nativeCmd(int i4, long j4, String str, Object[] objArr);

    public static native void nativeCrash(int i4, int i5);

    public static native int nativeCreateCachedInfo(String str, int i4, int i5);

    public static native String nativeDumpThreads(String str, long j4);

    public static native int nativeGenerateUnexpLog(long j4, int i4);

    public static native String nativeGet(int i4, long j4, String str);

    public static native String nativeGetCallbackInfo(String str, long j4, int i4, boolean z4);

    public static native boolean nativeIsCrashing();

    public static native boolean nativeLockFile(int i4, boolean z4);

    public static native int nativeLog(int i4, String str, String str2);

    public static native int nativeOpenFile(String str);

    public static native long nativeSet(int i4, long j4, String str, Object[] objArr);

    public static native void nativeSetForeground(boolean z4);

    private static void onCrashLogGenerated(String str, String str2, String str3, boolean z4) {
        boolean equals = e.h().equals(str2);
        boolean equals2 = LogType.NATIVE_TYPE.equals(str3);
        if (!e.F()) {
            if (equals && equals2) {
                try {
                    f.c(true);
                } catch (Throwable th) {
                    com.uc.crashsdk.a.g.a(th);
                }
            }
            str = e.a(str);
        }
        d.a(str, str2, str3);
        if (e.F()) {
            return;
        }
        if (z4 || (!equals && g.s())) {
            e.a(false, false);
        } else if (equals) {
            e.b(equals2);
        }
    }

    private static void onCrashRestarting() {
        d.a(false);
        b.N();
    }

    private static void onKillProcess(String str, int i4, int i5) {
        String str2 = "onKillProcess. SIG: " + i5;
        if (e.a()) {
            com.uc.crashsdk.a.a.b("crashsdk", str2);
        } else {
            com.uc.crashsdk.a.a.a("crashsdk", str2);
        }
        StringBuilder f5 = e.f("onKillProcess");
        Locale locale = Locale.US;
        f5.insert(0, String.format(locale, "State in disk: '%s'\n", b.p()));
        f5.insert(0, String.format(locale, "SIG: %d, fg: %s, exiting: %s, main process: %s, time: %s\n", Integer.valueOf(i5), Boolean.valueOf(b.B()), Boolean.valueOf(b.u()), Boolean.valueOf(b.F()), e.n()));
        f5.insert(0, String.format(locale, "Kill PID: %d (%s) by pid: %d (%s) tid: %d (%s)\n", Integer.valueOf(i4), e.a(i4), Integer.valueOf(Process.myPid()), e.a(Process.myPid()), Integer.valueOf(Process.myTid()), Thread.currentThread().getName()));
        String sb = f5.toString();
        if (e.a()) {
            com.uc.crashsdk.a.a.b("crashsdk", sb);
        } else {
            com.uc.crashsdk.a.a.a("crashsdk", sb);
        }
        if (b.L()) {
            return;
        }
        com.uc.crashsdk.a.g.a(new File(str), sb.getBytes());
    }

    private static String onNativeEvent(int i4, long j4, Object[] objArr) {
        switch (i4) {
            case 1:
                return String.valueOf(Runtime.getRuntime().maxMemory());
            case 2:
                return e.d();
            case 3:
                if (objArr != null && objArr.length == 2 && (objArr[0] instanceof String) && (objArr[1] instanceof String)) {
                    return e.a((String) objArr[0], (String) objArr[1]);
                }
                return null;
            case 4:
                return e.g();
            case 5:
                a.a(true);
                break;
            case 6:
                return com.uc.crashsdk.a.g.d();
            case 7:
                com.uc.crashsdk.a.f.a(2, new com.uc.crashsdk.a.e(102), 8000L);
                e.r();
                break;
        }
        return null;
    }

    private static int onPreClientCustomLog(String str, String str2, boolean z4) {
        g.a();
        e.a(false);
        if (e.a(str, str2, z4)) {
            return 0;
        }
        e.b(str, str2, z4);
        return 1;
    }

    private static int registerCurrentThread(String str, int i4) {
        return a.a(i4, str);
    }

    private static int registerInfoCallback(String str, int i4, long j4, int i5) {
        return a.a(str, i4, null, j4, i5);
    }

    public static long set(int i4, boolean z4) {
        return nativeSet(i4, z4 ? 1L : 0L, null, null);
    }

    public static long cmd(int i4, String str) {
        return nativeCmd(i4, 0L, str, null);
    }

    public static long set(int i4, long j4) {
        return nativeSet(i4, j4, null, null);
    }

    public static long set(int i4, String str) {
        return nativeSet(i4, 0L, str, null);
    }
}
