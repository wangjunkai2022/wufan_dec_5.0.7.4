package com.facebook.drawee.view;

import android.view.View;
import android.view.ViewGroup;
import javax.annotation.Nullable;
/* compiled from: AspectRatioMeasure.java */
/* loaded from: classes.dex */
public class a {

    /* compiled from: AspectRatioMeasure.java */
    /* renamed from: com.facebook.drawee.view.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0262a {

        /* renamed from: a  reason: collision with root package name */
        public int f11366a;

        /* renamed from: b  reason: collision with root package name */
        public int f11367b;
    }

    private static boolean a(int i4) {
        return i4 == 0 || i4 == -2;
    }

    public static void b(C0262a c0262a, float f5, @Nullable ViewGroup.LayoutParams layoutParams, int i4, int i5) {
        if (f5 <= 0.0f || layoutParams == null) {
            return;
        }
        if (a(layoutParams.height)) {
            c0262a.f11367b = View.MeasureSpec.makeMeasureSpec(View.resolveSize((int) (((View.MeasureSpec.getSize(c0262a.f11366a) - i4) / f5) + i5), c0262a.f11367b), 1073741824);
        } else if (a(layoutParams.width)) {
            c0262a.f11366a = View.MeasureSpec.makeMeasureSpec(View.resolveSize((int) (((View.MeasureSpec.getSize(c0262a.f11367b) - i5) * f5) + i4), c0262a.f11366a), 1073741824);
        }
    }
}
