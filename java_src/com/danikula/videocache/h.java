package com.danikula.videocache;

import android.app.Activity;
import android.text.TextUtils;
import android.widget.Toast;
/* compiled from: HttpProxyCacheDebuger.java */
/* loaded from: classes2.dex */
public class h {

    /* renamed from: a  reason: collision with root package name */
    static final String f10079a = "HttpProxyCacheDebuger";

    /* renamed from: b  reason: collision with root package name */
    static boolean f10080b = true;

    public static void a(Activity activity, String str) {
        if (!f10080b || TextUtils.isEmpty(str)) {
            return;
        }
        Toast.makeText(activity, str, 0).show();
    }

    public static void b() {
        f10080b = false;
    }

    public static void c() {
        f10080b = true;
    }

    public static boolean d() {
        return f10080b;
    }

    public static void e(String str) {
        if (f10080b) {
            TextUtils.isEmpty(str);
        }
    }

    public static void f(String str, Exception exc) {
        if (f10080b) {
            TextUtils.isEmpty(str);
            exc.printStackTrace();
        }
    }

    public static void g(String str, String str2) {
        if (f10080b) {
            TextUtils.isEmpty(str2);
        }
    }

    public static void h(String str) {
        i(f10079a, str);
    }

    public static void i(String str, String str2) {
        if (!f10080b || str2 == null) {
            return;
        }
        TextUtils.isEmpty(str2);
    }

    public static void j(String str) {
        k(f10079a, str);
    }

    public static void k(String str, String str2) {
        if (!f10080b || str2 == null) {
            return;
        }
        TextUtils.isEmpty(str2);
    }
}
