package com.join.android.app.component.optimizetext;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
/* compiled from: DisplayUtils.java */
/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private static DisplayMetrics f15144a = null;

    /* renamed from: b  reason: collision with root package name */
    private static final int f15145b = 320;

    /* renamed from: c  reason: collision with root package name */
    private static final int f15146c = 640;

    /* renamed from: d  reason: collision with root package name */
    private static int f15147d;

    /* renamed from: e  reason: collision with root package name */
    private static int f15148e;

    /* renamed from: f  reason: collision with root package name */
    private static int f15149f;

    /* renamed from: g  reason: collision with root package name */
    private static float f15150g;

    /* renamed from: h  reason: collision with root package name */
    private static int f15151h;

    public static int a(float f5) {
        return (int) ((f15144a.density * f5) + 0.5f);
    }

    public static int b() {
        return f15149f;
    }

    public static float c() {
        return f15150g;
    }

    public static int d() {
        return f15148e;
    }

    public static float e() {
        return f15144a.density;
    }

    public static int f() {
        return f15144a.heightPixels;
    }

    public static int g() {
        return f15144a.widthPixels;
    }

    public static int h() {
        return f15144a.densityDpi;
    }

    public static int i() {
        return f15151h;
    }

    public static int j(View view) {
        return view.getRootView().getHeight();
    }

    public static int k() {
        return f15147d;
    }

    public static int l(View view) {
        Rect rect = new Rect();
        view.getWindowVisibleDisplayFrame(rect);
        return rect.bottom - rect.top;
    }

    public static void m(Context context) {
        f15144a = context.getResources().getDisplayMetrics();
        int a5 = a(320.0f);
        f15147d = a5;
        if (a5 > f15146c) {
            f15147d = f15146c;
        }
    }

    public static int n(int i4) {
        return (int) ((i4 / f15144a.density) + 0.5f);
    }

    public static void o(Activity activity) {
        if (f15151h == 0) {
            View decorView = activity.getWindow().getDecorView();
            f15148e = decorView.getWidth();
            int height = decorView.getHeight();
            f15149f = height;
            f15150g = f15148e / height;
            f15151h = height - l(decorView);
        }
    }

    public static void p(int i4) {
        f15149f = i4;
    }

    public static void q(float f5) {
        f15150g = f5;
    }

    public static void r(int i4) {
        f15148e = i4;
    }

    public static int s(int i4) {
        return (int) TypedValue.applyDimension(2, i4, f15144a);
    }
}
