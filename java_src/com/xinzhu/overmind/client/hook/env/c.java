package com.xinzhu.overmind.client.hook.env;

import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import com.xinzhu.haunted.android.os.q;
/* compiled from: VirtualRuntime.java */
/* loaded from: classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private static final Handler f67619a = new Handler(Looper.getMainLooper());

    /* renamed from: b  reason: collision with root package name */
    private static String f67620b;

    /* renamed from: c  reason: collision with root package name */
    private static String f67621c;

    public static <T> T a(Throwable th) throws RuntimeException {
        th.printStackTrace();
        throw new RuntimeException("transact remote server failed", th);
    }

    public static void b() {
        Process.killProcess(Process.myPid());
    }

    public static String c() {
        return f67620b;
    }

    public static String d() {
        return f67621c;
    }

    public static Handler e() {
        return f67619a;
    }

    public static boolean f() {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 < 21) {
            return false;
        }
        if (i4 >= 23) {
            return Process.is64Bit();
        }
        return com.xinzhu.haunted.dalvik.system.a.e().f().booleanValue();
    }

    public static boolean g() {
        return System.getProperty("java.vm.version").startsWith("2");
    }

    public static void h(String str, ApplicationInfo applicationInfo) {
        if (f67621c != null) {
            return;
        }
        f67620b = applicationInfo.packageName;
        f67621c = str;
        q.b(str);
        com.xinzhu.haunted.android.ddm.a.b(str, 0);
    }
}
