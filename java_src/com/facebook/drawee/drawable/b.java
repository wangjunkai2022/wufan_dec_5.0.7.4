package com.facebook.drawee.drawable;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import com.facebook.common.internal.VisibleForTesting;
/* compiled from: AutoRotateDrawable.java */
/* loaded from: classes2.dex */
public class b extends h implements Runnable, c {

    /* renamed from: j  reason: collision with root package name */
    private static final int f11188j = 360;

    /* renamed from: k  reason: collision with root package name */
    private static final int f11189k = 20;

    /* renamed from: f  reason: collision with root package name */
    private int f11190f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f11191g;
    @VisibleForTesting

    /* renamed from: h  reason: collision with root package name */
    float f11192h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f11193i;

    public b(Drawable drawable, int i4) {
        this(drawable, i4, true);
    }

    private void A() {
        if (this.f11193i) {
            return;
        }
        this.f11193i = true;
        scheduleSelf(this, SystemClock.uptimeMillis() + 20);
    }

    private int y() {
        return (int) ((20.0f / this.f11190f) * 360.0f);
    }

    public void B(boolean z4) {
        this.f11191g = z4;
    }

    @Override // com.facebook.drawee.drawable.h, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int save = canvas.save();
        Rect bounds = getBounds();
        int i4 = bounds.right;
        int i5 = bounds.left;
        int i6 = i4 - i5;
        int i7 = bounds.bottom;
        int i8 = bounds.top;
        int i9 = i7 - i8;
        float f5 = this.f11192h;
        if (!this.f11191g) {
            f5 = 360.0f - f5;
        }
        canvas.rotate(f5, i5 + (i6 / 2), i8 + (i9 / 2));
        super.draw(canvas);
        canvas.restoreToCount(save);
        A();
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f11193i = false;
        this.f11192h += y();
        invalidateSelf();
    }

    @Override // com.facebook.drawee.drawable.c
    /* renamed from: x */
    public b d() {
        return new b(f.a(p()), this.f11190f, this.f11191g);
    }

    public void z() {
        this.f11192h = 0.0f;
        this.f11193i = false;
        unscheduleSelf(this);
        invalidateSelf();
    }

    public b(Drawable drawable, int i4, boolean z4) {
        super((Drawable) com.facebook.common.internal.h.i(drawable));
        this.f11192h = 0.0f;
        this.f11193i = false;
        this.f11190f = i4;
        this.f11191g = z4;
    }
}
