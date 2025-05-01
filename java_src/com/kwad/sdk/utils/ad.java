package com.kwad.sdk.utils;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
/* loaded from: classes5.dex */
public final class ad extends be {
    private int aQs;
    private int aQt;
    private int aQu;
    private int aQv;

    public ad(int i4, int i5) {
        super(i4, i5);
    }

    private int MH() {
        return this.aQs;
    }

    private int MI() {
        return this.aQt;
    }

    private int MJ() {
        return this.aQu;
    }

    private int MK() {
        return this.aQv;
    }

    public static ad a(int i4, int i5, int i6, int i7, int i8, int i9) {
        ad adVar = new ad(i4, i5);
        adVar.ed(0);
        adVar.ee(0);
        adVar.eb(i7);
        adVar.ec(0);
        return adVar;
    }

    private void ec(int i4) {
        this.aQt = i4;
    }

    public final ad c(Context context, float f5) {
        ad adVar = new ad(com.kwad.sdk.c.a.a.a(context, this.mWidth * f5), com.kwad.sdk.c.a.a.a(context, this.mHeight * f5));
        adVar.aQu = com.kwad.sdk.c.a.a.a(context, this.aQu * f5);
        adVar.aQt = com.kwad.sdk.c.a.a.a(context, this.aQt * f5);
        adVar.aQv = com.kwad.sdk.c.a.a.a(context, this.aQv * f5);
        adVar.aQs = com.kwad.sdk.c.a.a.a(context, this.aQs * f5);
        return adVar;
    }

    public final void eb(int i4) {
        this.aQs = i4;
    }

    public final void ed(int i4) {
        this.aQu = i4;
    }

    public final void ee(int i4) {
        this.aQv = i4;
    }

    public static void a(View view, ad adVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (adVar.getHeight() > 0) {
            layoutParams.height = adVar.getHeight();
        }
        if (adVar.getWidth() > 0) {
            layoutParams.width = adVar.getWidth();
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (adVar.MJ() > 0) {
                marginLayoutParams.leftMargin = adVar.MJ();
            }
            if (adVar.MI() > 0) {
                marginLayoutParams.bottomMargin = adVar.MI();
            }
            if (adVar.MK() > 0) {
                marginLayoutParams.rightMargin = adVar.MK();
            }
            if (adVar.MH() > 0) {
                marginLayoutParams.topMargin = adVar.MH();
            }
        }
        view.setLayoutParams(layoutParams);
    }
}
