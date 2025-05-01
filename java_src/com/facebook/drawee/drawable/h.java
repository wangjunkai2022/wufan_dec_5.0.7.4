package com.facebook.drawee.drawable;

import android.annotation.TargetApi;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.annotation.Nullable;
/* compiled from: ForwardingDrawable.java */
/* loaded from: classes2.dex */
public class h extends Drawable implements Drawable.Callback, t, s, d {

    /* renamed from: e  reason: collision with root package name */
    private static final Matrix f11214e = new Matrix();
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    private Drawable f11215b;

    /* renamed from: c  reason: collision with root package name */
    private final e f11216c = new e();

    /* renamed from: d  reason: collision with root package name */
    protected t f11217d;

    public h(@Nullable Drawable drawable) {
        this.f11215b = drawable;
        f.e(drawable, this, this);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f11215b;
        if (drawable != null) {
            drawable.draw(canvas);
        }
    }

    @Override // com.facebook.drawee.drawable.t
    public void e(Matrix matrix) {
        s(matrix);
    }

    @Override // com.facebook.drawee.drawable.d
    public Drawable f(@Nullable Drawable drawable) {
        return v(drawable);
    }

    @Override // android.graphics.drawable.Drawable
    @Nullable
    public Drawable.ConstantState getConstantState() {
        Drawable drawable = this.f11215b;
        if (drawable == null) {
            return super.getConstantState();
        }
        return drawable.getConstantState();
    }

    @Override // android.graphics.drawable.Drawable
    @Nullable
    public Drawable getCurrent() {
        return this.f11215b;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f11215b;
        if (drawable == null) {
            return super.getIntrinsicHeight();
        }
        return drawable.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f11215b;
        if (drawable == null) {
            return super.getIntrinsicWidth();
        }
        return drawable.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f11215b;
        if (drawable == null) {
            return 0;
        }
        return drawable.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        Drawable drawable = this.f11215b;
        if (drawable == null) {
            return super.getPadding(rect);
        }
        return drawable.getPadding(rect);
    }

    @Override // com.facebook.drawee.drawable.s
    public void h(t tVar) {
        this.f11217d = tVar;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Drawable drawable = this.f11215b;
        if (drawable == null) {
            return false;
        }
        return drawable.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f11215b;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // com.facebook.drawee.drawable.t
    public void n(RectF rectF) {
        t tVar = this.f11217d;
        if (tVar != null) {
            tVar.n(rectF);
        } else {
            rectF.set(getBounds());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f11215b;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i4) {
        Drawable drawable = this.f11215b;
        if (drawable == null) {
            return super.onLevelChange(i4);
        }
        return drawable.setLevel(i4);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f11215b;
        if (drawable == null) {
            return super.onStateChange(iArr);
        }
        return drawable.setState(iArr);
    }

    @Override // com.facebook.drawee.drawable.d
    @Nullable
    public Drawable p() {
        return getCurrent();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void s(Matrix matrix) {
        t tVar = this.f11217d;
        if (tVar != null) {
            tVar.e(matrix);
        } else {
            matrix.reset();
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j4) {
        scheduleSelf(runnable, j4);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i4) {
        this.f11216c.b(i4);
        Drawable drawable = this.f11215b;
        if (drawable != null) {
            drawable.setAlpha(i4);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f11216c.c(colorFilter);
        Drawable drawable = this.f11215b;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z4) {
        this.f11216c.d(z4);
        Drawable drawable = this.f11215b;
        if (drawable != null) {
            drawable.setDither(z4);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z4) {
        this.f11216c.e(z4);
        Drawable drawable = this.f11215b;
        if (drawable != null) {
            drawable.setFilterBitmap(z4);
        }
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(21)
    public void setHotspot(float f5, float f6) {
        Drawable drawable = this.f11215b;
        if (drawable != null) {
            drawable.setHotspot(f5, f6);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z4, boolean z5) {
        boolean visible = super.setVisible(z4, z5);
        Drawable drawable = this.f11215b;
        return drawable == null ? visible : drawable.setVisible(z4, z5);
    }

    public void t(RectF rectF) {
        Matrix matrix = f11214e;
        s(matrix);
        rectF.set(getBounds());
        matrix.mapRect(rectF);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    @Nullable
    public Drawable v(@Nullable Drawable drawable) {
        Drawable w4 = w(drawable);
        invalidateSelf();
        return w4;
    }

    @Nullable
    protected Drawable w(@Nullable Drawable drawable) {
        Drawable drawable2 = this.f11215b;
        f.e(drawable2, null, null);
        f.e(drawable, null, null);
        f.f(drawable, this.f11216c);
        f.b(drawable, this);
        f.e(drawable, this, this);
        this.f11215b = drawable;
        return drawable2;
    }
}
