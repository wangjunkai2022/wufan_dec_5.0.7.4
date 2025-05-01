package com.facebook.drawee.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
/* compiled from: MatrixDrawable.java */
/* loaded from: classes2.dex */
public class i extends h {

    /* renamed from: f  reason: collision with root package name */
    private Matrix f11218f;

    /* renamed from: g  reason: collision with root package name */
    private Matrix f11219g;

    /* renamed from: h  reason: collision with root package name */
    private int f11220h;

    /* renamed from: i  reason: collision with root package name */
    private int f11221i;

    public i(Drawable drawable, Matrix matrix) {
        super((Drawable) com.facebook.common.internal.h.i(drawable));
        this.f11220h = 0;
        this.f11221i = 0;
        this.f11218f = matrix;
    }

    private void x() {
        Drawable current = getCurrent();
        Rect bounds = getBounds();
        int intrinsicWidth = current.getIntrinsicWidth();
        this.f11220h = intrinsicWidth;
        int intrinsicHeight = current.getIntrinsicHeight();
        this.f11221i = intrinsicHeight;
        if (intrinsicWidth > 0 && intrinsicHeight > 0) {
            current.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            this.f11219g = this.f11218f;
            return;
        }
        current.setBounds(bounds);
        this.f11219g = null;
    }

    private void y() {
        if (this.f11220h == getCurrent().getIntrinsicWidth() && this.f11221i == getCurrent().getIntrinsicHeight()) {
            return;
        }
        x();
    }

    public void A(Matrix matrix) {
        this.f11218f = matrix;
        x();
        invalidateSelf();
    }

    @Override // com.facebook.drawee.drawable.h, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        y();
        if (this.f11219g != null) {
            int save = canvas.save();
            canvas.clipRect(getBounds());
            canvas.concat(this.f11219g);
            super.draw(canvas);
            canvas.restoreToCount(save);
            return;
        }
        super.draw(canvas);
    }

    @Override // com.facebook.drawee.drawable.h, com.facebook.drawee.drawable.t
    public void e(Matrix matrix) {
        super.e(matrix);
        Matrix matrix2 = this.f11219g;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.drawee.drawable.h, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        x();
    }

    @Override // com.facebook.drawee.drawable.h
    public Drawable v(Drawable drawable) {
        Drawable v2 = super.v(drawable);
        x();
        return v2;
    }

    public Matrix z() {
        return this.f11218f;
    }
}
