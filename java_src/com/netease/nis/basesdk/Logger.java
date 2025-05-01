package com.netease.nis.basesdk;

import com.join.mgps.Util.h0;
/* loaded from: classes5.dex */
public class Logger {

    /* renamed from: a  reason: collision with root package name */
    private static String f57354a = "BASE_SDK_LOG";

    /* renamed from: b  reason: collision with root package name */
    private static boolean f57355b;

    private static String a() {
        Thread currentThread;
        StackTraceElement[] stackTrace;
        for (StackTraceElement stackTraceElement : Thread.currentThread().getStackTrace()) {
            if (!stackTraceElement.getClassName().equals(Thread.class.getName()) && !stackTraceElement.getClassName().equals(Logger.class.getName())) {
                return "[Thread:" + currentThread.getName() + ", Class:" + stackTraceElement.getClassName() + ", Function:" + stackTraceElement.getMethodName() + "]";
            }
        }
        return null;
    }

    public static String buildLog(String str) {
        return str + "---->" + a();
    }

    public static void d(String str) {
        d(f57354a, str);
    }

    public static void e(String str) {
        e(f57354a, str);
    }

    public static void enableLog(boolean z4) {
        f57355b = z4;
    }

    public static void i(String str) {
        i(f57354a, str);
    }

    public static void setTag(String str) {
        f57354a = str;
    }

    public static void w(String str) {
        w(f57354a, str);
    }

    public static void d(String str, String str2) {
        if (!f57355b || f57354a.equals(str)) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(f57354a);
        sb.append(h0.f27805a);
        sb.append(str);
    }

    public static void e(String str, String str2) {
        if (!f57355b || f57354a.equals(str)) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(f57354a);
        sb.append(h0.f27805a);
        sb.append(str);
    }

    public static void i(String str, String str2) {
        if (f57355b) {
            if (!f57354a.equals(str)) {
                StringBuilder sb = new StringBuilder();
                sb.append(f57354a);
                sb.append(h0.f27805a);
                sb.append(str);
            }
            buildLog(str2);
        }
    }

    public static void w(String str, String str2) {
        if (!f57355b || f57354a.equals(str)) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(f57354a);
        sb.append(h0.f27805a);
        sb.append(str);
    }
}
