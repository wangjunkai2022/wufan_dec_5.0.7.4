package com.join.android.app.common.manager;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import java.lang.reflect.Method;
/* compiled from: SystemBarTintManager.java */
/* loaded from: classes3.dex */
public class b {

    /* renamed from: h  reason: collision with root package name */
    public static final int f14719h = -1728053248;

    /* renamed from: i  reason: collision with root package name */
    public static boolean f14720i;

    /* renamed from: a  reason: collision with root package name */
    private final C0313b f14721a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f14722b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f14723c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f14724d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f14725e;

    /* renamed from: f  reason: collision with root package name */
    private View f14726f;

    /* renamed from: g  reason: collision with root package name */
    private View f14727g;

    /* compiled from: SystemBarTintManager.java */
    /* renamed from: com.join.android.app.common.manager.b$b  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static class C0313b {

        /* renamed from: j  reason: collision with root package name */
        private static final String f14728j = "status_bar_height";

        /* renamed from: k  reason: collision with root package name */
        private static final String f14729k = "navigation_bar_height";

        /* renamed from: l  reason: collision with root package name */
        private static final String f14730l = "navigation_bar_height_landscape";

        /* renamed from: m  reason: collision with root package name */
        private static final String f14731m = "navigation_bar_width";

        /* renamed from: a  reason: collision with root package name */
        private final boolean f14732a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f14733b;

        /* renamed from: c  reason: collision with root package name */
        private final int f14734c;

        /* renamed from: d  reason: collision with root package name */
        private final int f14735d;

        /* renamed from: e  reason: collision with root package name */
        private final boolean f14736e;

        /* renamed from: f  reason: collision with root package name */
        private final int f14737f;

        /* renamed from: g  reason: collision with root package name */
        private final int f14738g;

        /* renamed from: h  reason: collision with root package name */
        private final boolean f14739h;

        /* renamed from: i  reason: collision with root package name */
        private final float f14740i;

        @TargetApi(14)
        private int b(Context context) {
            if (Build.VERSION.SDK_INT >= 14) {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(16843499, typedValue, true);
                return context.getResources().getDimensionPixelSize(typedValue.resourceId);
            }
            return 0;
        }

        private int c(Resources resources, String str) {
            int identifier = resources.getIdentifier(str, "dimen", q.a.f73126a);
            if (identifier > 0) {
                return resources.getDimensionPixelSize(identifier);
            }
            return 0;
        }

        @TargetApi(14)
        private int e(Context context) {
            Resources resources = context.getResources();
            if (Build.VERSION.SDK_INT < 14 || ViewConfiguration.get(context).hasPermanentMenuKey()) {
                return 0;
            }
            return c(resources, this.f14739h ? f14729k : f14730l);
        }

        @TargetApi(14)
        private int g(Context context) {
            Resources resources = context.getResources();
            if (Build.VERSION.SDK_INT < 14 || ViewConfiguration.get(context).hasPermanentMenuKey()) {
                return 0;
            }
            return c(resources, f14731m);
        }

        @SuppressLint({"NewApi"})
        private float k(Activity activity) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            if (Build.VERSION.SDK_INT >= 16) {
                activity.getWindowManager().getDefaultDisplay().getRealMetrics(displayMetrics);
            } else {
                activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            }
            float f5 = displayMetrics.density;
            return Math.min(displayMetrics.widthPixels / f5, displayMetrics.heightPixels / f5);
        }

        public int a() {
            return this.f14735d;
        }

        public int d() {
            return this.f14737f;
        }

        public int f() {
            return this.f14738g;
        }

        public int h() {
            if (this.f14733b && n()) {
                return this.f14737f;
            }
            return 0;
        }

        public int i() {
            if (!this.f14733b || n()) {
                return 0;
            }
            return this.f14738g;
        }

        public int j(boolean z4) {
            return (this.f14732a ? this.f14734c : 0) + (z4 ? this.f14735d : 0);
        }

        public int l() {
            return this.f14734c;
        }

        public boolean m() {
            return this.f14736e;
        }

        public boolean n() {
            return this.f14740i >= 600.0f || this.f14739h;
        }

        private C0313b(Activity activity, boolean z4, boolean z5) {
            Resources resources = activity.getResources();
            this.f14739h = resources.getConfiguration().orientation == 1;
            this.f14740i = k(activity);
            this.f14734c = c(resources, f14728j);
            this.f14735d = b(activity);
            int e5 = e(activity);
            this.f14737f = e5;
            this.f14738g = g(activity);
            this.f14736e = e5 > 0;
            this.f14732a = z4;
            this.f14733b = z5;
        }
    }

    @TargetApi(19)
    public b(Activity activity) {
        Window window = activity.getWindow();
        ViewGroup viewGroup = (ViewGroup) window.getDecorView();
        if (Build.VERSION.SDK_INT >= 19) {
            TypedArray obtainStyledAttributes = activity.obtainStyledAttributes(new int[]{16843759, 16843760});
            try {
                this.f14722b = obtainStyledAttributes.getBoolean(0, false);
                this.f14723c = obtainStyledAttributes.getBoolean(1, false);
                obtainStyledAttributes.recycle();
                int i4 = window.getAttributes().flags;
                if ((67108864 & i4) != 0) {
                    this.f14722b = true;
                }
                if ((i4 & 1024) == 1024) {
                    this.f14722b = false;
                }
                if ((i4 & 134217728) != 0) {
                    this.f14723c = true;
                }
            } catch (Throwable th) {
                obtainStyledAttributes.recycle();
                throw th;
            }
        }
        C0313b c0313b = new C0313b(activity, this.f14722b, this.f14723c);
        this.f14721a = c0313b;
        if (!c0313b.m()) {
            this.f14723c = false;
        }
        if (this.f14722b) {
            t(activity, viewGroup);
        }
        if (this.f14723c) {
            s(activity, viewGroup);
        }
    }

    private void s(Context context, ViewGroup viewGroup) {
        FrameLayout.LayoutParams layoutParams;
        this.f14727g = new View(context);
        if (this.f14721a.n()) {
            layoutParams = new FrameLayout.LayoutParams(-1, this.f14721a.d());
            layoutParams.gravity = 80;
        } else {
            layoutParams = new FrameLayout.LayoutParams(this.f14721a.f(), -1);
            layoutParams.gravity = 5;
        }
        this.f14727g.setLayoutParams(layoutParams);
        this.f14727g.setBackgroundColor(f14719h);
        this.f14727g.setVisibility(8);
        viewGroup.addView(this.f14727g);
    }

    private void t(Context context, ViewGroup viewGroup) {
        this.f14726f = new View(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, this.f14721a.l());
        layoutParams.gravity = 48;
        if (this.f14723c && !this.f14721a.n()) {
            layoutParams.rightMargin = this.f14721a.f();
        }
        this.f14726f.setLayoutParams(layoutParams);
        this.f14726f.setBackgroundColor(f14719h);
        this.f14726f.setVisibility(8);
        viewGroup.addView(this.f14726f);
    }

    public C0313b a() {
        return this.f14721a;
    }

    public boolean b() {
        return this.f14725e;
    }

    public boolean c() {
        return this.f14724d;
    }

    @TargetApi(11)
    public void d(float f5) {
        if (!this.f14723c || Build.VERSION.SDK_INT < 11) {
            return;
        }
        this.f14727g.setAlpha(f5);
    }

    public void e(int i4) {
        if (this.f14723c) {
            this.f14727g.setBackgroundColor(i4);
        }
    }

    public void f(Drawable drawable) {
        if (this.f14723c) {
            this.f14727g.setBackgroundDrawable(drawable);
        }
    }

    public void g(boolean z4) {
        this.f14725e = z4;
        if (this.f14723c) {
            this.f14727g.setVisibility(z4 ? 0 : 8);
        }
    }

    public void h(int i4) {
        if (this.f14723c) {
            this.f14727g.setBackgroundResource(i4);
        }
    }

    @TargetApi(11)
    public void i(float f5) {
        if (!this.f14722b || Build.VERSION.SDK_INT < 11) {
            return;
        }
        this.f14726f.setAlpha(f5);
    }

    public void j(boolean z4, Activity activity) {
        if (f14720i) {
            Class<?> cls = activity.getWindow().getClass();
            try {
                Class<?> cls2 = Class.forName("android.view.MiuiWindowManager$LayoutParams");
                int i4 = cls2.getField("EXTRA_FLAG_STATUS_BAR_DARK_MODE").getInt(cls2);
                Class<?> cls3 = Integer.TYPE;
                Method method = cls.getMethod("setExtraFlags", cls3, cls3);
                Window window = activity.getWindow();
                Object[] objArr = new Object[2];
                objArr[0] = Integer.valueOf(z4 ? i4 : 0);
                objArr[1] = Integer.valueOf(i4);
                method.invoke(window, objArr);
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    public void k(int i4) {
        if (this.f14722b) {
            this.f14726f.setBackgroundColor(i4);
        }
    }

    public void l(Drawable drawable) {
        if (this.f14722b) {
            this.f14726f.setBackgroundDrawable(drawable);
        }
    }

    public void m(boolean z4) {
        this.f14724d = z4;
        if (this.f14722b) {
            this.f14726f.setVisibility(z4 ? 0 : 8);
        }
    }

    public void n(int i4) {
        if (this.f14722b) {
            this.f14726f.setBackgroundResource(i4);
        }
    }

    public void o(float f5) {
        i(f5);
        d(f5);
    }

    public void p(int i4) {
        k(i4);
        e(i4);
    }

    public void q(Drawable drawable) {
        l(drawable);
        f(drawable);
    }

    public void r(int i4) {
        n(i4);
        h(i4);
    }
}
