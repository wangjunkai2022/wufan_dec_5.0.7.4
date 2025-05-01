package com.facebook.drawee.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.annotation.Nullable;
import com.facebook.common.internal.VisibleForTesting;
import com.facebook.drawee.drawable.r;
/* compiled from: ScaleTypeDrawable.java */
/* loaded from: classes2.dex */
public class q extends h {
    @VisibleForTesting

    /* renamed from: f  reason: collision with root package name */
    r.c f11277f;
    @VisibleForTesting

    /* renamed from: g  reason: collision with root package name */
    Object f11278g;
    @Nullable
    @VisibleForTesting

    /* renamed from: h  reason: collision with root package name */
    PointF f11279h;
    @VisibleForTesting

    /* renamed from: i  reason: collision with root package name */
    int f11280i;
    @VisibleForTesting

    /* renamed from: j  reason: collision with root package name */
    int f11281j;
    @VisibleForTesting

    /* renamed from: k  reason: collision with root package name */
    Matrix f11282k;

    /* renamed from: l  reason: collision with root package name */
    private Matrix f11283l;

    public q(Drawable drawable, r.c cVar) {
        super((Drawable) com.facebook.common.internal.h.i(drawable));
        this.f11279h = null;
        this.f11280i = 0;
        this.f11281j = 0;
        this.f11283l = new Matrix();
        this.f11277f = cVar;
    }

    private void y() {
        boolean z4;
        r.c cVar = this.f11277f;
        boolean z5 = true;
        if (cVar instanceof r.m) {
            Object state = ((r.m) cVar).getState();
            z4 = state == null || !state.equals(this.f11278g);
            this.f11278g = state;
        } else {
            z4 = false;
        }
        if (this.f11280i == getCurrent().getIntrinsicWidth() && this.f11281j == getCurrent().getIntrinsicHeight()) {
            z5 = false;
        }
        if (z5 || z4) {
            x();
        }
    }

    public r.c A() {
        return this.f11277f;
    }

    public void B(PointF pointF) {
        if (com.facebook.common.internal.g.a(this.f11279h, pointF)) {
            return;
        }
        if (this.f11279h == null) {
            this.f11279h = new PointF();
        }
        this.f11279h.set(pointF);
        x();
        invalidateSelf();
    }

    public void C(r.c cVar) {
        if (com.facebook.common.internal.g.a(this.f11277f, cVar)) {
            return;
        }
        this.f11277f = cVar;
        this.f11278g = null;
        x();
        invalidateSelf();
    }

    @Override // com.facebook.drawee.drawable.h, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        y();
        if (this.f11282k != null) {
            int save = canvas.save();
            canvas.clipRect(getBounds());
            canvas.concat(this.f11282k);
            super.draw(canvas);
            canvas.restoreToCount(save);
            return;
        }
        super.draw(canvas);
    }

    @Override // com.facebook.drawee.drawable.h, com.facebook.drawee.drawable.t
    public void e(Matrix matrix) {
        s(matrix);
        y();
        Matrix matrix2 = this.f11282k;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
    }

    @Override // com.facebook.drawee.drawable.h, android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        x();
    }

    @Override // com.facebook.drawee.drawable.h
    public Drawable v(Drawable drawable) {
        Drawable v2 = super.v(drawable);
        x();
        return v2;
    }

    @VisibleForTesting
    void x() {
        Drawable current = getCurrent();
        Rect bounds = getBounds();
        int width = bounds.width();
        int height = bounds.height();
        int intrinsicWidth = current.getIntrinsicWidth();
        this.f11280i = intrinsicWidth;
        int intrinsicHeight = current.getIntrinsicHeight();
        this.f11281j = intrinsicHeight;
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            current.setBounds(bounds);
            this.f11282k = null;
        } else if (intrinsicWidth == width && intrinsicHeight == height) {
            current.setBounds(bounds);
            this.f11282k = null;
        } else if (this.f11277f == r.c.f11294a) {
            current.setBounds(bounds);
            this.f11282k = null;
        } else {
            current.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            r.c cVar = this.f11277f;
            Matrix matrix = this.f11283l;
            PointF pointF = this.f11279h;
            cVar.a(matrix, bounds, intrinsicWidth, intrinsicHeight, pointF != null ? pointF.x : 0.5f, pointF != null ? pointF.y : 0.5f);
            this.f11282k = this.f11283l;
        }
    }

    @Nullable
    public PointF z() {
        return this.f11279h;
    }

    public q(Drawable drawable, r.c cVar, @Nullable PointF pointF) {
        super((Drawable) com.facebook.common.internal.h.i(drawable));
        this.f11279h = null;
        this.f11280i = 0;
        this.f11281j = 0;
        this.f11283l = new Matrix();
        this.f11277f = cVar;
        this.f11279h = pointF;
    }
}
