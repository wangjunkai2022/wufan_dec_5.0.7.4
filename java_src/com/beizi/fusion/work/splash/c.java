package com.beizi.fusion.work.splash;

import android.animation.Animator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import com.beizi.fusion.g.av;
import com.bytedance.sdk.openadsdk.CSJSplashAd;
/* compiled from: CsjClickEyeManager.java */
/* loaded from: classes2.dex */
public class c {

    /* renamed from: l  reason: collision with root package name */
    private static volatile c f7988l;

    /* renamed from: a  reason: collision with root package name */
    private int f7989a;

    /* renamed from: b  reason: collision with root package name */
    private int f7990b;

    /* renamed from: c  reason: collision with root package name */
    private int f7991c;

    /* renamed from: d  reason: collision with root package name */
    private int f7992d;

    /* renamed from: e  reason: collision with root package name */
    private int f7993e;

    /* renamed from: f  reason: collision with root package name */
    private int f7994f;

    /* renamed from: g  reason: collision with root package name */
    private CSJSplashAd f7995g;

    /* renamed from: h  reason: collision with root package name */
    private View f7996h;

    /* renamed from: i  reason: collision with root package name */
    private int[] f7997i = new int[2];

    /* renamed from: j  reason: collision with root package name */
    private int f7998j;

    /* renamed from: k  reason: collision with root package name */
    private int f7999k;

    /* compiled from: CsjClickEyeManager.java */
    /* loaded from: classes2.dex */
    public interface a {
        void a();

        void a(int i4);
    }

    private c(Context context) {
        Context applicationContext;
        if (context == null) {
            applicationContext = com.beizi.fusion.g.g.a();
        } else {
            applicationContext = context.getApplicationContext();
        }
        b(applicationContext);
        this.f7991c = av.a(applicationContext, 16.0f);
        this.f7992d = av.a(applicationContext, 100.0f);
        this.f7993e = 1;
        this.f7994f = 300;
    }

    public static c a(Context context) {
        if (f7988l == null) {
            synchronized (c.class) {
                if (f7988l == null) {
                    f7988l = new c(context);
                }
            }
        }
        return f7988l;
    }

    private void b(Context context) {
        int min = Math.min(av.o(context), av.n(context));
        CSJSplashAd cSJSplashAd = this.f7995g;
        if (cSJSplashAd != null && cSJSplashAd.getSplashClickEyeSizeToDp() != null) {
            this.f7989a = av.a(context, this.f7995g.getSplashClickEyeSizeToDp()[0]);
            this.f7990b = av.a(context, this.f7995g.getSplashClickEyeSizeToDp()[1]);
            return;
        }
        int round = Math.round(min * 0.3f);
        this.f7989a = round;
        this.f7990b = Math.round((round * 16) / 9);
    }

    public void a(Context context, CSJSplashAd cSJSplashAd, View view, View view2) {
        Context applicationContext;
        this.f7995g = cSJSplashAd;
        this.f7996h = view;
        view.getLocationOnScreen(this.f7997i);
        this.f7998j = view2.getWidth();
        this.f7999k = view2.getHeight();
        if (context == null) {
            applicationContext = com.beizi.fusion.g.g.a();
        } else {
            applicationContext = context.getApplicationContext();
        }
        b(applicationContext);
    }

    public CSJSplashAd b() {
        return this.f7995g;
    }

    public void a() {
        this.f7995g = null;
        this.f7996h = null;
    }

    public ViewGroup a(ViewGroup viewGroup, ViewGroup viewGroup2, a aVar) {
        View view;
        if (viewGroup == null || viewGroup2 == null || this.f7995g == null || (view = this.f7996h) == null) {
            return null;
        }
        return a(view, viewGroup, viewGroup2, aVar);
    }

    public ViewGroup a(final View view, ViewGroup viewGroup, final ViewGroup viewGroup2, final a aVar) {
        if (view == null || viewGroup2 == null) {
            return null;
        }
        final int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        Context context = viewGroup2.getContext();
        int width = view.getWidth();
        int height = view.getHeight();
        int width2 = viewGroup.getWidth();
        int height2 = viewGroup.getHeight();
        if (width2 == 0) {
            width2 = this.f7998j;
        }
        if (height2 == 0) {
            height2 = this.f7999k;
        }
        int i4 = this.f7989a;
        float f5 = i4 / width;
        int i5 = this.f7990b;
        float f6 = i5 / height;
        final float f7 = this.f7993e == 0 ? this.f7991c : (width2 - this.f7991c) - i4;
        final float f8 = (height2 - this.f7992d) - i5;
        av.a(view);
        viewGroup.addView(view, new FrameLayout.LayoutParams(width, height));
        final FrameLayout frameLayout = new FrameLayout(context);
        view.setPivotX(0.0f);
        view.setPivotY(0.0f);
        view.animate().scaleX(f5).scaleY(f6).x(f7).y(f8).setInterpolator(new OvershootInterpolator(0.0f)).setDuration(this.f7994f).setListener(new Animator.AnimatorListener() { // from class: com.beizi.fusion.work.splash.c.1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                av.a(view);
                view.setScaleX(1.0f);
                view.setScaleY(1.0f);
                view.setX(0.0f);
                view.setY(0.0f);
                int[] iArr2 = new int[2];
                viewGroup2.getLocationOnScreen(iArr2);
                float f9 = f7 - iArr2[0];
                int[] iArr3 = iArr;
                float f10 = f9 + iArr3[0];
                float f11 = (f8 - iArr2[1]) + iArr3[1];
                frameLayout.addView(view, -1, -1);
                viewGroup2.addView(frameLayout, new FrameLayout.LayoutParams(c.this.f7989a, c.this.f7990b));
                frameLayout.setTranslationX(f10);
                frameLayout.setTranslationY(f11);
                a aVar2 = aVar;
                if (aVar2 != null) {
                    aVar2.a();
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                a aVar2 = aVar;
                if (aVar2 != null) {
                    aVar2.a(c.this.f7994f);
                }
            }
        });
        return frameLayout;
    }
}
