package com.join.mgps.ptr.util;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
/* compiled from: PtrLocalDisplay.java */
/* loaded from: classes4.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    public static int f53900a;

    /* renamed from: b  reason: collision with root package name */
    public static int f53901b;

    /* renamed from: c  reason: collision with root package name */
    public static float f53902c;

    /* renamed from: d  reason: collision with root package name */
    public static int f53903d;

    /* renamed from: e  reason: collision with root package name */
    public static int f53904e;

    public static int a(float f5) {
        int i4 = f53903d;
        if (i4 != 320) {
            f5 = (f5 * i4) / 320.0f;
        }
        return b(f5);
    }

    public static int b(float f5) {
        return (int) ((f5 * f53902c) + 0.5f);
    }

    public static void c(Context context) {
        if (context == null) {
            return;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        int i4 = displayMetrics.widthPixels;
        f53900a = i4;
        int i5 = displayMetrics.heightPixels;
        f53901b = i5;
        float f5 = displayMetrics.density;
        f53902c = f5;
        f53903d = (int) (i4 / f5);
        f53904e = (int) (i5 / f5);
    }

    public static void d(View view, float f5, float f6, float f7, float f8) {
        view.setPadding(a(f5), b(f6), a(f7), b(f8));
    }
}
