package com.join.mgps.control;

import android.content.Context;
import android.view.animation.Interpolator;
import android.widget.Scroller;
/* compiled from: ViewPagerScroller.java */
/* loaded from: classes4.dex */
public class c extends Scroller {

    /* renamed from: a  reason: collision with root package name */
    private int f46321a;

    public c(Context context) {
        super(context);
    }

    public void a(int i4) {
        this.f46321a = i4;
    }

    @Override // android.widget.Scroller
    public void startScroll(int i4, int i5, int i6, int i7) {
        super.startScroll(i4, i5, i6, i7, this.f46321a);
    }

    public c(Context context, Interpolator interpolator) {
        super(context, interpolator);
    }

    @Override // android.widget.Scroller
    public void startScroll(int i4, int i5, int i6, int i7, int i8) {
        super.startScroll(i4, i5, i6, i7, this.f46321a);
    }

    public c(Context context, Interpolator interpolator, boolean z4) {
        super(context, interpolator, z4);
    }
}
