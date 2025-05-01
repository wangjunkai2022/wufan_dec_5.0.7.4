package com.beizi.fusion;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.RequiresPermission;
import com.beizi.fusion.d.g;
import com.beizi.fusion.d.t;
/* loaded from: classes2.dex */
public class SplashAd {

    /* renamed from: a  reason: collision with root package name */
    private t f6497a;

    /* renamed from: b  reason: collision with root package name */
    private ViewGroup f6498b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f6499c = false;

    /* loaded from: classes2.dex */
    public static class SplashClickEye {
        public SplashClickEye(Activity activity, String str) {
            g.a().a(activity, str);
        }
    }

    /* loaded from: classes2.dex */
    public interface SplashClickEyeListener {
        void isSupportSplashClickEye(boolean z4);

        void onSplashClickEyeAnimationFinish();
    }

    @RequiresPermission(com.kuaishou.weapon.p0.g.f55581a)
    public SplashAd(Context context, View view, String str, AdListener adListener, long j4) {
        StringBuilder sb = new StringBuilder();
        sb.append(" request SplashAd adUnitId:");
        sb.append(str);
        this.f6497a = new t(context, str, view, adListener, j4);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f6498b = frameLayout;
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
    }

    public void cancel(Context context) {
        t tVar = this.f6497a;
        if (tVar != null) {
            tVar.m();
        }
    }

    public int getECPM() {
        t tVar = this.f6497a;
        if (tVar != null) {
            return tVar.B();
        }
        return -1;
    }

    public void loadAd(int i4, int i5) {
        t tVar = this.f6497a;
        if (tVar == null || this.f6498b == null) {
            return;
        }
        tVar.b(i4);
        this.f6497a.c(i5);
        this.f6497a.a(this.f6498b);
    }

    public void reportNotShow() {
        t tVar = this.f6497a;
        if (tVar != null) {
            tVar.C();
        }
    }

    public void setSplashClickEyeListener(SplashClickEyeListener splashClickEyeListener) {
        g.a().a(splashClickEyeListener);
    }

    public void setSupportRegionClick(boolean z4) {
        t tVar = this.f6497a;
        if (tVar != null) {
            tVar.a(z4);
        }
    }

    public void show(ViewGroup viewGroup) {
        ViewGroup viewGroup2;
        if (this.f6499c || viewGroup == null || this.f6497a == null || (viewGroup2 = this.f6498b) == null) {
            return;
        }
        viewGroup.addView(viewGroup2);
        this.f6497a.A();
        this.f6499c = true;
    }

    @Deprecated
    public void loadAd() {
        ViewGroup viewGroup;
        t tVar = this.f6497a;
        if (tVar == null || (viewGroup = this.f6498b) == null) {
            return;
        }
        tVar.a(viewGroup);
    }
}
