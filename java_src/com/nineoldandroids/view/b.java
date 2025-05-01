package com.nineoldandroids.view;

import android.os.Build;
import android.view.View;
import android.view.animation.Interpolator;
import com.nineoldandroids.animation.a;
import java.util.WeakHashMap;
/* compiled from: ViewPropertyAnimator.java */
/* loaded from: classes5.dex */
public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    private static final WeakHashMap<View, b> f57814a = new WeakHashMap<>(0);

    public static b c(View view) {
        WeakHashMap<View, b> weakHashMap = f57814a;
        b bVar = weakHashMap.get(view);
        if (bVar == null) {
            int intValue = Integer.valueOf(Build.VERSION.SDK).intValue();
            if (intValue >= 14) {
                bVar = new d(view);
            } else if (intValue >= 11) {
                bVar = new c(view);
            } else {
                bVar = new e(view);
            }
            weakHashMap.put(view, bVar);
        }
        return bVar;
    }

    public abstract b A(float f5);

    public abstract b B(float f5);

    public abstract b C(float f5);

    public abstract b a(float f5);

    public abstract b b(float f5);

    public abstract void d();

    public abstract long e();

    public abstract long f();

    public abstract b g(float f5);

    public abstract b h(float f5);

    public abstract b i(float f5);

    public abstract b j(float f5);

    public abstract b k(float f5);

    public abstract b l(float f5);

    public abstract b m(float f5);

    public abstract b n(float f5);

    public abstract b o(float f5);

    public abstract b p(float f5);

    public abstract b q(long j4);

    public abstract b r(Interpolator interpolator);

    public abstract b s(a.InterfaceC0575a interfaceC0575a);

    public abstract b t(long j4);

    public abstract void u();

    public abstract b v(float f5);

    public abstract b w(float f5);

    public abstract b x(float f5);

    public abstract b y(float f5);

    public abstract b z(float f5);
}
