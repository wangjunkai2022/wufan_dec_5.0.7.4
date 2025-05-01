package com.facebook.drawee.drawable;

import android.annotation.SuppressLint;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
/* compiled from: DrawableProperties.java */
/* loaded from: classes2.dex */
public class e {

    /* renamed from: f  reason: collision with root package name */
    private static final int f11194f = -1;

    /* renamed from: a  reason: collision with root package name */
    private int f11195a = -1;

    /* renamed from: b  reason: collision with root package name */
    private boolean f11196b = false;

    /* renamed from: c  reason: collision with root package name */
    private ColorFilter f11197c = null;

    /* renamed from: d  reason: collision with root package name */
    private int f11198d = -1;

    /* renamed from: e  reason: collision with root package name */
    private int f11199e = -1;

    @SuppressLint({"Range"})
    public void a(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        int i4 = this.f11195a;
        if (i4 != -1) {
            drawable.setAlpha(i4);
        }
        if (this.f11196b) {
            drawable.setColorFilter(this.f11197c);
        }
        int i5 = this.f11198d;
        if (i5 != -1) {
            drawable.setDither(i5 != 0);
        }
        int i6 = this.f11199e;
        if (i6 != -1) {
            drawable.setFilterBitmap(i6 != 0);
        }
    }

    public void b(int i4) {
        this.f11195a = i4;
    }

    public void c(ColorFilter colorFilter) {
        this.f11197c = colorFilter;
        this.f11196b = true;
    }

    public void d(boolean z4) {
        this.f11198d = z4 ? 1 : 0;
    }

    public void e(boolean z4) {
        this.f11199e = z4 ? 1 : 0;
    }
}
