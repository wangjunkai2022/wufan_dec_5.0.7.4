package com.join.mgps.Util;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.Window;
import android.view.WindowManager;
/* compiled from: ScreenUtils.java */
/* loaded from: classes3.dex */
public final class u1 {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f28099a;

    /* renamed from: b  reason: collision with root package name */
    private static DisplayMetrics f28100b;

    public static float a(Context context) {
        return c(context).density;
    }

    public static int b(Context context) {
        return c(context).densityDpi;
    }

    public static DisplayMetrics c(Context context) {
        DisplayMetrics displayMetrics = f28100b;
        if (displayMetrics != null) {
            return displayMetrics;
        }
        DisplayMetrics displayMetrics2 = new DisplayMetrics();
        ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics2);
        return displayMetrics2;
    }

    public static int d(Context context) {
        return c(context).heightPixels;
    }

    public static boolean e() {
        return f28099a;
    }

    public static void f(Activity activity) {
        activity.getWindow().setFlags(128, 128);
    }

    public static void g(Activity activity) {
        Window window = activity.getWindow();
        if (f28099a) {
            window.clearFlags(1024);
            f28099a = false;
            return;
        }
        window.setFlags(1024, 1024);
        f28099a = true;
    }

    public static int h(Context context) {
        return c(context).widthPixels;
    }
}
