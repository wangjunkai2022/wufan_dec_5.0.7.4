package com.youth.banner;

import android.content.Context;
import android.view.animation.Interpolator;
import android.widget.Scroller;
/* compiled from: BannerScroller.java */
/* loaded from: classes6.dex */
public class b extends Scroller {

    /* renamed from: a  reason: collision with root package name */
    private int f68531a;

    public b(Context context) {
        super(context);
        this.f68531a = 800;
    }

    public void a(int i4) {
        this.f68531a = i4;
    }

    @Override // android.widget.Scroller
    public void startScroll(int i4, int i5, int i6, int i7, int i8) {
        super.startScroll(i4, i5, i6, i7, this.f68531a);
    }

    @Override // android.widget.Scroller
    public void startScroll(int i4, int i5, int i6, int i7) {
        super.startScroll(i4, i5, i6, i7, this.f68531a);
    }

    public b(Context context, Interpolator interpolator) {
        super(context, interpolator);
        this.f68531a = 800;
    }

    public b(Context context, Interpolator interpolator, boolean z4) {
        super(context, interpolator, z4);
        this.f68531a = 800;
    }
}
